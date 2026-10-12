package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private EmojiCompat.GlyphChecker mGlyphChecker;
    private final MetadataRepo mMetadataRepo;
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        static int findIndexBackward(CharSequence cs, int from, int numCodePoints) {
            int currentIndex = from;
            boolean waitingHighSurrogate = false;
            int length = cs.length();
            if (currentIndex < 0) goto L30;
            if (length < currentIndex) goto L30;
            if (numCodePoints >= 0) goto L8;
            return -1;
        L8:
            int remainingCodePoints = numCodePoints;
        L9:
            if (remainingCodePoints == 0) goto L10;
            currentIndex = currentIndex - 1;
            if (currentIndex < 0) goto L13;
            char c = cs.charAt(currentIndex);
            if (waitingHighSurrogate == true) goto L20;
            if (Character.isSurrogate(c) == false) goto L25;
            if (Character.isHighSurrogate(c) == true) goto L28;
            waitingHighSurrogate = true;
            goto L9
        L28:
            return -1;
        L25:
            remainingCodePoints = remainingCodePoints - 1;
            goto L9
        L20:
            if (Character.isHighSurrogate(c) == false) goto L21;
            waitingHighSurrogate = false;
            remainingCodePoints = remainingCodePoints - 1;
            goto L9
        L21:
            return -1;
        L13:
            if (waitingHighSurrogate == false) goto L15;
            return -1;
        L15:
            return 0;
        L10:
            return currentIndex;
        L30:
            return -1;
        }

        static int findIndexForward(CharSequence cs, int from, int numCodePoints) {
            int currentIndex = from;
            boolean waitingLowSurrogate = false;
            int length = cs.length();
            if (currentIndex < 0) goto L28;
            if (length < currentIndex) goto L28;
            if (numCodePoints >= 0) goto L8;
            return -1;
        L8:
            int remainingCodePoints = numCodePoints;
        L9:
            if (remainingCodePoints == 0) goto L10;
            if (currentIndex >= length) goto L12;
            char c = cs.charAt(currentIndex);
            if (waitingLowSurrogate == true) goto L18;
            if (Character.isSurrogate(c) == false) goto L23;
            if (Character.isLowSurrogate(c) == true) goto L26;
            waitingLowSurrogate = true;
            currentIndex = currentIndex + 1;
            goto L9
        L26:
            return -1;
        L23:
            remainingCodePoints = remainingCodePoints - 1;
            currentIndex = currentIndex + 1;
            goto L9
        L18:
            if (Character.isLowSurrogate(c) == false) goto L19;
            remainingCodePoints = remainingCodePoints - 1;
            waitingLowSurrogate = false;
            currentIndex = currentIndex + 1;
            goto L9
        L19:
            return -1;
        L12:
            if (waitingLowSurrogate == false) goto L14;
            return -1;
        L14:
            return length;
        L10:
            return currentIndex;
        L28:
            return -1;
        }
    }

    private static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;
        public UnprecomputeTextOnModificationSpannable spannable;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public /* bridge */ /* synthetic */ UnprecomputeTextOnModificationSpannable getResult() {
            return getResult();
        }

        EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable spannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = spannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int start, int end, TypefaceEmojiRasterizer metadata) {
            if (metadata.isPreferredSystemRender() == false) goto L6;
            return true;
        L6:
            if (this.spannable == null) goto L8;
        L12:
            EmojiSpan span = this.mSpanFactory.createSpan(metadata);
            this.spannable.setSpan(span, start, end, 33);
            return true;
        L8:
            if ((charSequence instanceof Spannable) == false) goto L10;
            Spannable r2 = (Spannable) charSequence;
        L11:
            this.spannable = new UnprecomputeTextOnModificationSpannable(r2);
            goto L12
        L10:
            r2 = new SpannableString(charSequence);
            goto L11
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    private interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(CharSequence r1, int r2, int r3, TypefaceEmojiRasterizer r4);
    }

    private static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        public int end;
        private final int mOffset;
        public int start;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public /* bridge */ /* synthetic */ EmojiProcessLookupCallback getResult() {
            return getResult();
        }

        EmojiProcessLookupCallback(int offset) {
            this.start = -1;
            this.end = -1;
            this.mOffset = offset;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int start, int end, TypefaceEmojiRasterizer metadata) {
            if (start > this.mOffset) goto L9;
            if (this.mOffset >= end) goto L9;
            this.start = start;
            this.end = end;
            return false;
        L9:
            if (end > this.mOffset) goto L12;
            return true;
        L12:
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }
    }

    private static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public /* bridge */ /* synthetic */ MarkExclusionCallback getResult() {
            return getResult();
        }

        MarkExclusionCallback(String emoji) {
            this.mExclusion = emoji;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(CharSequence charSequence, int start, int end, TypefaceEmojiRasterizer metadata) {
            if (TextUtils.equals(charSequence.subSequence(start, end), this.mExclusion) == false) goto L6;
            metadata.setExclusion(true);
            return false;
        L6:
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }
    }

    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState;
        private final boolean mUseEmojiAsDefaultStyle;

        ProcessorSm(MetadataRepo.Node rootNode, boolean useEmojiAsDefaultStyle, int[] emojiAsDefaultStyleExceptions) {
            this.mState = 1;
            this.mRootNode = rootNode;
            this.mCurrentNode = rootNode;
            this.mUseEmojiAsDefaultStyle = useEmojiAsDefaultStyle;
            this.mEmojiAsDefaultStyleExceptions = emojiAsDefaultStyleExceptions;
        }

        int check(int codePoint) {
            MetadataRepo.Node node = this.mCurrentNode.get(codePoint);
            switch(this.mState) {
                case 2: goto L6;
                default: goto L4;
            };
        L4:
            if (node != null) goto L24;
            int action = reset();
        L25:
            this.mLastCodepoint = codePoint;
            return action;
        L24:
            this.mState = 2;
            this.mCurrentNode = node;
            this.mCurrentDepth = 1;
            action = 2;
            goto L25
        L6:
            if (node == null) goto L9;
            this.mCurrentNode = node;
            this.mCurrentDepth++;
            action = 2;
            goto L25
        L9:
            if (isTextStyle(codePoint) == false) goto L12;
            action = reset();
            goto L25
        L12:
            if (isEmojiStyle(codePoint) == false) goto L15;
            action = 2;
            goto L25
        L15:
            if (this.mCurrentNode.getData() != null) goto L17;
            action = reset();
            goto L25
        L17:
            if (this.mCurrentDepth == 1) goto L19;
            this.mFlushNode = this.mCurrentNode;
            action = 3;
            reset();
            goto L25
        L19:
            if (shouldUseEmojiPresentationStyleForSingleCodepoint() == false) goto L21;
            this.mFlushNode = this.mCurrentNode;
            action = 3;
            reset();
            goto L25
        L21:
            action = reset();
            goto L25
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        boolean isInFlushableState() {
            if (this.mState == 2) goto L5;
        L11:
            return false;
        L5:
            if (this.mCurrentNode.getData() == null) goto L11;
            if (this.mCurrentDepth <= 1) goto L9;
            return true;
        L9:
            if (shouldUseEmojiPresentationStyleForSingleCodepoint() == false) goto L11;
            return true;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() == false) goto L6;
            return true;
        L6:
            if (isEmojiStyle(this.mLastCodepoint) == false) goto L9;
            return true;
        L9:
            if (this.mUseEmojiAsDefaultStyle == true) goto L11;
        L16:
            return false;
        L11:
            if (this.mEmojiAsDefaultStyleExceptions != null) goto L13;
            return true;
        L13:
            int codepoint = this.mCurrentNode.getData().getCodepointAt(0);
            int index = Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, codepoint);
            if (index >= 0) goto L16;
            return true;
        }

        private static boolean isEmojiStyle(int codePoint) {
            if (codePoint != 65039) goto L5;
            return true;
        L5:
            return false;
        }

        private static boolean isTextStyle(int codePoint) {
            if (codePoint != 65038) goto L5;
            return true;
        L5:
            return false;
        }
    }

    EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker, boolean useEmojiAsDefaultStyle, int[] emojiAsDefaultStyleExceptions, Set<int[]> emojiExclusions) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = useEmojiAsDefaultStyle;
        this.mEmojiAsDefaultStyleExceptions = emojiAsDefaultStyleExceptions;
        initExclusions(emojiExclusions);
    }

    private void initExclusions(Set<int[]> emojiExclusions) {
        if (emojiExclusions.isEmpty() == false) goto L5;
        return;
    L5:
        Iterator<int[]> r0 = emojiExclusions.iterator();
    L7:
        if (r0.hasNext() == false) goto L9;
        int[] codepoints = r0.next();
        String emoji = new String(codepoints, 0, codepoints.length);
        MarkExclusionCallback callback = new MarkExclusionCallback(emoji);
        process(emoji, 0, emoji.length(), 1, true, callback);
        goto L7
    }

    int getEmojiMatch(CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    int getEmojiMatch(CharSequence charSequence, int metadataVersion) {
        ProcessorSm sm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int end = charSequence.length();
        int currentOffset = 0;
        int potentialSubsequenceMatch = 0;
        int subsequenceMatch = 0;
    L3:
        if (currentOffset >= end) goto L18;
        int codePoint = Character.codePointAt(charSequence, currentOffset);
        int action = sm.check(codePoint);
        TypefaceEmojiRasterizer currentNode = sm.getCurrentMetadata();
        switch(action) {
            case 1: goto L11;
            case 2: goto L10;
            case 3: goto L7;
            default: goto L12;
        };
    L7:
        currentNode = sm.getFlushMetadata();
        if (currentNode.getCompatAdded() > metadataVersion) goto L12;
        subsequenceMatch = subsequenceMatch + 1;
        goto L12
    L10:
        currentOffset = currentOffset + Character.charCount(codePoint);
        goto L12
    L11:
        currentOffset = currentOffset + Character.charCount(codePoint);
        potentialSubsequenceMatch = 0;
    L12:
        if (currentNode == null) goto L3;
        if (currentNode.getCompatAdded() > metadataVersion) goto L3;
        potentialSubsequenceMatch = potentialSubsequenceMatch + 1;
        goto L3
    L18:
        if (subsequenceMatch == 0) goto L21;
        return 2;
    L21:
        if (sm.isInFlushableState() == false) goto L26;
        TypefaceEmojiRasterizer exactMatch = sm.getCurrentMetadata();
        if (exactMatch.getCompatAdded() > metadataVersion) goto L26;
        return 1;
    L26:
        if (potentialSubsequenceMatch != 0) goto L29;
        return 0;
    L29:
        return 2;
    }

    int getEmojiStart(CharSequence charSequence, int offset) {
        if (offset < 0) goto L15;
        if (offset < charSequence.length()) goto L7;
        return -1;
    L7:
        if ((charSequence instanceof Spanned) == false) goto L12;
        Spanned spanned = (Spanned) charSequence;
        EmojiSpan[] spans = (EmojiSpan[]) spanned.getSpans(offset, offset + 1, EmojiSpan.class);
        if (spans.length <= 0) goto L12;
        return spanned.getSpanStart(spans[0]);
    L12:
        int start = Math.max(0, offset - 16);
        int end = Math.min(charSequence.length(), offset + 16);
        return ((EmojiProcessLookupCallback) process(charSequence, start, end, Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(offset))).start;
    L15:
        return -1;
    }

    int getEmojiEnd(CharSequence charSequence, int offset) {
        if (offset < 0) goto L15;
        if (offset < charSequence.length()) goto L7;
        return -1;
    L7:
        if ((charSequence instanceof Spanned) == false) goto L12;
        Spanned spanned = (Spanned) charSequence;
        EmojiSpan[] spans = (EmojiSpan[]) spanned.getSpans(offset, offset + 1, EmojiSpan.class);
        if (spans.length <= 0) goto L12;
        return spanned.getSpanEnd(spans[0]);
    L12:
        int start = Math.max(0, offset - 16);
        int end = Math.min(charSequence.length(), offset + 16);
        return ((EmojiProcessLookupCallback) process(charSequence, start, end, Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(offset))).end;
    L15:
        return -1;
    }

    CharSequence process(CharSequence charSequence, int start, int end, int maxEmojiCount, boolean replaceAll) {
        boolean isSpannableBuilder = charSequence instanceof SpannableBuilder;
        if (isSpannableBuilder == false) goto L5;
        ((SpannableBuilder) charSequence).beginBatchEdit();
    L5:
        UnprecomputeTextOnModificationSpannable spannable = null;
        if (isSpannableBuilder == false) goto L82;
    L74:
        spannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);     // Catch: Throwable -> L69
    L20:
        if (spannable == null) goto L33;
        EmojiSpan[] spans = (EmojiSpan[]) spannable.getSpans(start, end, EmojiSpan.class);     // Catch: Throwable -> L16
        if (spans == null) goto L33;
        if (spans.length <= 0) goto L33;
        int length = spans.length;     // Catch: Throwable -> L16
        int index = 0;
    L26:
        if (index >= length) goto L32;
        EmojiSpan span = spans[index];     // Catch: Throwable -> L16
        int spanStart = spannable.getSpanStart(span);     // Catch: Throwable -> L16
        int spanEnd = spannable.getSpanEnd(span);     // Catch: Throwable -> L16
        if (spanStart == end) goto L30;
        spannable.removeSpan(span);     // Catch: Throwable -> L16
    L30:
        start = Math.min(spanStart, start);     // Catch: Throwable -> L16
        end = Math.max(spanEnd, end);     // Catch: Throwable -> L16
        index = index + 1;
    L16:
        Throwable th = th;
        CharSequence charSequence2 = charSequence;
    L71:
        if (isSpannableBuilder == false) goto L73;
        ((SpannableBuilder) charSequence2).endBatchEdit();
    L73:
        throw th;
    L32:
        int index2 = start;
        int end2 = end;
    L34:
        if (index2 == end2) goto L66;
        if (index2 >= charSequence.length()) goto L66;
        if (maxEmojiCount == Integer.MAX_VALUE) goto L45;
        if (spannable == null) goto L45;
        int maxEmojiCount2 = maxEmojiCount - ((EmojiSpan[]) spannable.getSpans(0, spannable.length(), EmojiSpan.class)).length;
    L80:
        charSequence2 = charSequence;
        UnprecomputeTextOnModificationSpannable spannable2 = (UnprecomputeTextOnModificationSpannable) process(charSequence2, index2, end2, maxEmojiCount2, replaceAll, new EmojiProcessAddSpanCallback(spannable, this.mSpanFactory));     // Catch: Throwable -> L58
        if (spannable2 == null) goto L55;
        Spannable r11 = spannable2.getUnwrappedSpannable();     // Catch: Throwable -> L58
        if (isSpannableBuilder == false) goto L53;
        ((SpannableBuilder) charSequence2).endBatchEdit();
    L53:
        return r11;
    L55:
        if (isSpannableBuilder == false) goto L57;
        ((SpannableBuilder) charSequence2).endBatchEdit();
    L57:
        return charSequence2;
    L58:
        th = th;
    L60:
        th = th;
        charSequence2 = charSequence;
    L43:
        th = th;
        charSequence2 = charSequence;
    L45:
        maxEmojiCount2 = maxEmojiCount;
    L62:
        th = th;
        charSequence2 = charSequence;
    L66:
        if (isSpannableBuilder == false) goto L68;
        ((SpannableBuilder) charSequence).endBatchEdit();
    L68:
        return charSequence;
    L33:
        index2 = start;
        end2 = end;
    L69:
        th = th;
        charSequence2 = charSequence;
        goto L71
    L82:
        if ((charSequence instanceof Spannable) == true) goto L74;
        if ((charSequence instanceof Spanned) == false) goto L20;
        int nextSpanTransition = ((Spanned) charSequence).nextSpanTransition(start - 1, end + 1, EmojiSpan.class);     // Catch: Throwable -> L16
        if (nextSpanTransition > end) goto L20;
        spannable = new UnprecomputeTextOnModificationSpannable(charSequence);     // Catch: Throwable -> L16
        goto L20
    }

    private <T> T process(CharSequence charSequence, int start, int end, int maxEmojiCount, boolean processAll, EmojiProcessCallback<T> emojiProcessCallback) {
        int addedCount = 0;
        ProcessorSm sm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int currentOffset = start;
        int codePoint = Character.codePointAt(charSequence, currentOffset);
        boolean keepProcessing = true;
    L3:
        if (currentOffset >= end) goto L23;
        if (addedCount >= maxEmojiCount) goto L23;
        if (keepProcessing == false) goto L23;
        int action = sm.check(codePoint);
        switch(action) {
            case 1: goto L18;
            case 2: goto L15;
            case 3: goto L9;
            default: goto L3;
        };
    L9:
        if (processAll == false) goto L11;
    L13:
        keepProcessing = emojiProcessCallback.handleEmoji(charSequence, start, currentOffset, sm.getFlushMetadata());
        addedCount = addedCount + 1;
    L14:
        start = currentOffset;
        goto L3
    L11:
        if (hasGlyph(charSequence, start, currentOffset, sm.getFlushMetadata()) == true) goto L14;
    L15:
        currentOffset = currentOffset + Character.charCount(codePoint);
        if (currentOffset >= end) goto L3;
        codePoint = Character.codePointAt(charSequence, currentOffset);
        goto L3
    L18:
        start = start + Character.charCount(Character.codePointAt(charSequence, start));
        currentOffset = start;
        if (currentOffset >= end) goto L3;
        codePoint = Character.codePointAt(charSequence, currentOffset);
    L23:
        if (sm.isInFlushableState() == false) goto L32;
        if (addedCount >= maxEmojiCount) goto L32;
        if (keepProcessing == false) goto L32;
        if (processAll == false) goto L28;
    L30:
        emojiProcessCallback.handleEmoji(charSequence, start, currentOffset, sm.getCurrentMetadata());
        int r0 = addedCount + 1;
        goto L32
    L28:
        if (hasGlyph(charSequence, start, currentOffset, sm.getCurrentMetadata()) == false) goto L30;
    L32:
        return emojiProcessCallback.getResult();
    }

    static boolean handleOnKeyDown(Editable editable, int keyCode, KeyEvent event) {
        switch(keyCode) {
            case 67: goto L6;
            case 112: goto L5;
            default: goto L4;
        };
    L4:
        boolean handled = false;
    L7:
        if (handled == false) goto L10;
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    L10:
        return false;
    L5:
        handled = delete(editable, event, true);
        goto L7
    L6:
        handled = delete(editable, event, false);
        goto L7
    }

    private static boolean delete(Editable content, KeyEvent event, boolean forwardDelete) {
        if (hasModifiers(event) == false) goto L5;
        return false;
    L5:
        int start = Selection.getSelectionStart(content);
        int end = Selection.getSelectionEnd(content);
        if (hasInvalidSelection(start, end) == false) goto L8;
        return false;
    L8:
        EmojiSpan[] spans = (EmojiSpan[]) content.getSpans(start, end, EmojiSpan.class);
        if (spans != null) goto L11;
    L24:
        return false;
    L11:
        if (spans.length <= 0) goto L24;
        int length = spans.length;
        int index = 0;
    L13:
        if (index >= length) goto L24;
        EmojiSpan span = spans[index];
        int spanStart = content.getSpanStart(span);
        int spanEnd = content.getSpanEnd(span);
        if (forwardDelete == false) goto L17;
        if (spanStart != start) goto L17;
    L21:
        content.delete(spanStart, spanEnd);
        return true;
    L17:
        if (forwardDelete == true) goto L19;
        if (spanEnd == start) goto L21;
    L19:
        if (start <= spanStart) goto L23;
        if (start < spanEnd) goto L21;
    L23:
        index = index + 1;
        goto L13
    }

    static boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int beforeLength, int afterLength, boolean inCodePoints) {
        if (editable == null) goto L29;
        if (inputConnection == null) goto L29;
        if (beforeLength < 0) goto L28;
        if (afterLength < 0) goto L28;
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (hasInvalidSelection(selectionStart, selectionEnd) == false) goto L12;
        return false;
    L12:
        if (inCodePoints == false) goto L17;
        int start = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(beforeLength, 0));
        int end = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(afterLength, 0));
        if (start == (-1)) goto L16;
        if (end == (-1)) goto L16;
    L18:
        EmojiSpan[] spans = (EmojiSpan[]) editable.getSpans(start, end, EmojiSpan.class);
        if (spans != null) goto L21;
    L27:
        return false;
    L21:
        if (spans.length <= 0) goto L27;
        int length = spans.length;
        int index = 0;
    L23:
        if (index >= length) goto L25;
        EmojiSpan span = spans[index];
        int spanStart = editable.getSpanStart(span);
        int spanEnd = editable.getSpanEnd(span);
        start = Math.min(spanStart, start);
        end = Math.max(spanEnd, end);
        index = index + 1;
        goto L23
    L25:
        int start2 = Math.max(start, 0);
        int start3 = editable.length();
        int end2 = Math.min(end, start3);
        inputConnection.beginBatchEdit();
        editable.delete(start2, end2);
        inputConnection.endBatchEdit();
        return true;
    L16:
        return false;
    L17:
        int start4 = selectionStart - beforeLength;
        start = Math.max(start4, 0);
        end = Math.min(selectionEnd + afterLength, editable.length());
    L28:
        return false;
    L29:
        return false;
    }

    private static boolean hasInvalidSelection(int start, int end) {
        if (start == (-1)) goto L8;
        if (end == (-1)) goto L8;
        if (start != end) goto L8;
        return false;
    L8:
        return true;
    }

    private static boolean hasModifiers(KeyEvent event) {
        return !KeyEvent.metaStateHasNoModifiers(event.getMetaState());
    }

    private boolean hasGlyph(CharSequence charSequence, int start, int end, TypefaceEmojiRasterizer rasterizer) {
        if (rasterizer.getHasGlyph() != 0) goto L6;
        boolean hasGlyph = this.mGlyphChecker.hasGlyph(charSequence, start, end, rasterizer.getSdkAdded());
        rasterizer.setHasGlyph(hasGlyph);
    L6:
        if (rasterizer.getHasGlyph() != 2) goto L8;
        return true;
    L8:
        return false;
    }
}
