package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public final class EditorInfoCompat {
    private static final String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final String[] EMPTY_STRING_ARRAY = null;
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;
    static final String STYLUS_HANDWRITING_ENABLED_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    private static class Api30Impl {
        private Api30Impl() {
        }

        static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence sourceText, int subTextStart) {
            editorInfo.setInitialSurroundingSubText(sourceText, subTextStart);
        }

        static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int length, int flags) {
            return editorInfo.getInitialTextBeforeCursor(length, flags);
        }

        static CharSequence getInitialSelectedText(EditorInfo editorInfo, int flags) {
            return editorInfo.getInitialSelectedText(flags);
        }

        static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int length, int flags) {
            return editorInfo.getInitialTextAfterCursor(length, flags);
        }
    }

    private static class Api35Impl {
        private Api35Impl() {
        }

        static void setStylusHandwritingEnabled(EditorInfo editorInfo, boolean enabled) {
            editorInfo.setStylusHandwritingEnabled(enabled);
        }

        static boolean isStylusHandwritingEnabled(EditorInfo editorInfo) {
            return editorInfo.isStylusHandwritingEnabled();
        }
    }

    static {
        EMPTY_STRING_ARRAY = new String[0];
    }

    public static void setContentMimeTypes(EditorInfo editorInfo, String[] contentMimeTypes) {
        editorInfo.contentMimeTypes = contentMimeTypes;
    }

    public static String[] getContentMimeTypes(EditorInfo editorInfo) {
        String[] result = editorInfo.contentMimeTypes;
        if (result == null) goto L6;
        return result;
    L6:
        return EMPTY_STRING_ARRAY;
    }

    public static void setStylusHandwritingEnabled(EditorInfo editorInfo, boolean enabled) {
        if (Build.VERSION.SDK_INT < 35) goto L6;
        Api35Impl.setStylusHandwritingEnabled(editorInfo, enabled);
    L6:
        if (editorInfo.extras != null) goto L8;
        editorInfo.extras = new Bundle();
    L8:
        editorInfo.extras.putBoolean(STYLUS_HANDWRITING_ENABLED_KEY, enabled);
    }

    public static boolean isStylusHandwritingEnabled(EditorInfo editorInfo) {
        if (editorInfo.extras == null) goto L9;
        if (editorInfo.extras.containsKey(STYLUS_HANDWRITING_ENABLED_KEY) == false) goto L9;
        return editorInfo.extras.getBoolean(STYLUS_HANDWRITING_ENABLED_KEY);
    L9:
        if (Build.VERSION.SDK_INT >= 35) goto L11;
        return false;
    L11:
        return Api35Impl.isStylusHandwritingEnabled(editorInfo);
    }

    public static void setInitialSurroundingText(EditorInfo editorInfo, CharSequence sourceText) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        Api30Impl.setInitialSurroundingSubText(editorInfo, sourceText, 0);
        return;
    L5:
        setInitialSurroundingSubText(editorInfo, sourceText, 0);
    }

    public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence subText, int subTextStart) {
        Preconditions.checkNotNull(subText);
        if (Build.VERSION.SDK_INT < 30) goto L7;
        Api30Impl.setInitialSurroundingSubText(editorInfo, subText, subTextStart);
        return;
    L7:
        if (editorInfo.initialSelStart <= editorInfo.initialSelEnd) goto L9;
        int subTextSelStart = editorInfo.initialSelEnd - subTextStart;
    L11:
        if (editorInfo.initialSelStart <= editorInfo.initialSelEnd) goto L13;
        int subTextSelEnd = editorInfo.initialSelStart - subTextStart;
    L14:
        int subTextLength = subText.length();
        if (subTextStart < 0) goto L29;
        if (subTextSelStart < 0) goto L29;
        if (subTextSelEnd > subTextLength) goto L29;
        if (isPasswordInputType(editorInfo.inputType) == false) goto L24;
        setSurroundingText(editorInfo, null, 0, 0);
        return;
    L24:
        if (subTextLength > 2048) goto L27;
        setSurroundingText(editorInfo, subText, subTextSelStart, subTextSelEnd);
        return;
    L27:
        trimLongSurroundingText(editorInfo, subText, subTextSelStart, subTextSelEnd);
        return;
    L29:
        setSurroundingText(editorInfo, null, 0, 0);
        return;
    L13:
        subTextSelEnd = editorInfo.initialSelEnd - subTextStart;
        goto L14
    L9:
        subTextSelStart = editorInfo.initialSelStart - subTextStart;
        goto L11
    }

    private static void trimLongSurroundingText(EditorInfo editorInfo, CharSequence subText, int selStart, int selEnd) {
        int sourceSelLength = selEnd - selStart;
        if (sourceSelLength <= 1024) goto L5;
        int newSelLength = 0;
    L6:
        int subTextAfterCursorLength = subText.length() - selEnd;
        int maxLengthMinusSelection = 2048 - newSelLength;
        int possibleMaxBeforeCursorLength = Math.min(selStart, (int) (((double) maxLengthMinusSelection) * 0.8d));
        int newAfterCursorLength = Math.min(subTextAfterCursorLength, maxLengthMinusSelection - possibleMaxBeforeCursorLength);
        int newBeforeCursorLength = Math.min(selStart, maxLengthMinusSelection - newAfterCursorLength);
        int newBeforeCursorHead = selStart - newBeforeCursorLength;
        if (isCutOnSurrogate(subText, selStart - newBeforeCursorLength, 0) == false) goto L10;
        newBeforeCursorHead = newBeforeCursorHead + 1;
        newBeforeCursorLength = newBeforeCursorLength - 1;
    L10:
        if (isCutOnSurrogate(subText, (selEnd + newAfterCursorLength) - 1, 1) == false) goto L12;
        newAfterCursorLength = newAfterCursorLength - 1;
    L12:
        int newTextLength = (newBeforeCursorLength + newSelLength) + newAfterCursorLength;
        if (newSelLength == sourceSelLength) goto L15;
        CharSequence beforeCursor = subText.subSequence(newBeforeCursorHead, newBeforeCursorHead + newBeforeCursorLength);
        CharSequence afterCursor = subText.subSequence(selEnd, selEnd + newAfterCursorLength);
        CharSequence newInitialSurroundingText = TextUtils.concat(new CharSequence[]{beforeCursor, afterCursor});
    L16:
        int newSelHead = 0 + newBeforeCursorLength;
        setSurroundingText(editorInfo, newInitialSurroundingText, newSelHead, newSelHead + newSelLength);
        return;
    L15:
        newInitialSurroundingText = subText.subSequence(newBeforeCursorHead, newBeforeCursorHead + newTextLength);
        goto L16
    L5:
        newSelLength = sourceSelLength;
        goto L6
    }

    public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int length, int flags) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return Api30Impl.getInitialTextBeforeCursor(editorInfo, length, flags);
    L7:
        if (editorInfo.extras != null) goto L9;
        return null;
    L9:
        CharSequence surroundingText = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY);
        if (surroundingText != null) goto L12;
        return null;
    L12:
        int selectionHead = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int textLength = Math.min(length, selectionHead);
        if ((flags & 1) == 0) goto L16;
        return surroundingText.subSequence(selectionHead - textLength, selectionHead);
    L16:
        return TextUtils.substring(surroundingText, selectionHead - textLength, selectionHead);
    }

    public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int flags) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return Api30Impl.getInitialSelectedText(editorInfo, flags);
    L7:
        if (editorInfo.extras != null) goto L9;
        return null;
    L9:
        int correctedTextSelStart = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int correctedTextSelEnd = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int selectionHead = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int selectionEnd = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int sourceSelLength = correctedTextSelEnd - correctedTextSelStart;
        if (editorInfo.initialSelStart >= 0) goto L12;
    L24:
        return null;
    L12:
        if (editorInfo.initialSelEnd < 0) goto L24;
        if ((selectionEnd - selectionHead) != sourceSelLength) goto L24;
        CharSequence surroundingText = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY);
        if (surroundingText != null) goto L20;
        return null;
    L20:
        if ((flags & 1) == 0) goto L23;
        return surroundingText.subSequence(selectionHead, selectionEnd);
    L23:
        return TextUtils.substring(surroundingText, selectionHead, selectionEnd);
    }

    public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int length, int flags) {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return Api30Impl.getInitialTextAfterCursor(editorInfo, length, flags);
    L7:
        if (editorInfo.extras != null) goto L9;
        return null;
    L9:
        CharSequence surroundingText = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY);
        if (surroundingText != null) goto L12;
        return null;
    L12:
        int selectionEnd = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int textLength = Math.min(length, surroundingText.length() - selectionEnd);
        if ((flags & 1) == 0) goto L16;
        return surroundingText.subSequence(selectionEnd, selectionEnd + textLength);
    L16:
        return TextUtils.substring(surroundingText, selectionEnd, selectionEnd + textLength);
    }

    private static boolean isCutOnSurrogate(CharSequence sourceText, int cutPosition, int policy) {
        switch(policy) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L3;
        };
    L3:
        return false;
    L6:
        return Character.isHighSurrogate(sourceText.charAt(cutPosition));
    L8:
        return Character.isLowSurrogate(sourceText.charAt(cutPosition));
    }

    private static boolean isPasswordInputType(int inputType) {
        int variation = inputType & 4095;
        if (variation != 129) goto L5;
    L10:
        return true;
    L5:
        if (variation == 225) goto L10;
        if (variation == 18) goto L10;
        return false;
    }

    private static void setSurroundingText(EditorInfo editorInfo, CharSequence surroundingText, int selectionHead, int selectionEnd) {
        if (editorInfo.extras != null) goto L5;
        editorInfo.extras = new Bundle();
    L5:
        if (surroundingText == null) goto L7;
        CharSequence surroundingTextCopy = new SpannableStringBuilder(surroundingText);
    L8:
        editorInfo.extras.putCharSequence(CONTENT_SURROUNDING_TEXT_KEY, surroundingTextCopy);
        editorInfo.extras.putInt(CONTENT_SELECTION_HEAD_KEY, selectionHead);
        editorInfo.extras.putInt(CONTENT_SELECTION_END_KEY, selectionEnd);
        return;
    L7:
        surroundingTextCopy = null;
        goto L8
    }

    static int getProtocol(EditorInfo editorInfo) {
        return 1;
    }

    @Deprecated
    public EditorInfoCompat() {
    }
}
