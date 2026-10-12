package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.ReplaceWith;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import androidx.webkit.internal.AssetHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;

    static class Api23Impl {
        private Api23Impl() {
        }

        static int getBreakStrategy(TextView textView) {
            return textView.getBreakStrategy();
        }

        static void setBreakStrategy(TextView textView, int breakStrategy) {
            textView.setBreakStrategy(breakStrategy);
        }

        static int getHyphenationFrequency(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void setHyphenationFrequency(TextView textView, int hyphenationFrequency) {
            textView.setHyphenationFrequency(hyphenationFrequency);
        }

        static PorterDuff.Mode getCompoundDrawableTintMode(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static ColorStateList getCompoundDrawableTintList(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static void setCompoundDrawableTintList(TextView textView, ColorStateList tint) {
            textView.setCompoundDrawableTintList(tint);
        }

        static void setCompoundDrawableTintMode(TextView textView, PorterDuff.Mode tintMode) {
            textView.setCompoundDrawableTintMode(tintMode);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static DecimalFormatSymbols getInstance(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void setAutoSizeTextTypeWithDefaults(TextView textView, int autoSizeTextType) {
            textView.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] presetSizes, int unit) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        }

        static int getAutoSizeTextType(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int getAutoSizeMinTextSize(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int getAutoSizeMaxTextSize(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        static int[] getAutoSizeTextAvailableSizes(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void setFirstBaselineToTopHeight(TextView textView, int firstBaselineToTopHeight) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        }

        static PrecomputedText.Params getTextMetricsParams(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static String[] getDigitStrings(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static CharSequence castToCharSequence(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        public static void setLineHeight(TextView textView, int unit, float lineHeight) {
            textView.setLineHeight(unit, lineHeight);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    private static class OreoCallback implements ActionMode.Callback {
        private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
        private final ActionMode.Callback mCallback;
        private boolean mCanUseMenuBuilderReferences;
        private boolean mInitializedMenuBuilderReferences;
        private Class<?> mMenuBuilderClass;
        private Method mMenuBuilderRemoveItemAtMethod;
        private final TextView mTextView;

        OreoCallback(ActionMode.Callback callback, TextView textView) {
            this.mCallback = callback;
            this.mTextView = textView;
            this.mInitializedMenuBuilderReferences = false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.mCallback.onCreateActionMode(mode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            recomputeProcessTextMenuItems(menu);
            return this.mCallback.onPrepareActionMode(mode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.mCallback.onActionItemClicked(mode, item);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            this.mCallback.onDestroyActionMode(mode);
        }

        ActionMode.Callback getWrappedCallback() {
            return this.mCallback;
        }

        private void recomputeProcessTextMenuItems(Menu menu) {
            Context context = this.mTextView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (this.mInitializedMenuBuilderReferences == true) goto L38;
            this.mInitializedMenuBuilderReferences = true;
            this.mMenuBuilderClass = Class.forName("com.android.internal.view.menu.MenuBuilder");     // Catch: Throwable -> L7 ClassNotFoundException -> L9
            this.mMenuBuilderRemoveItemAtMethod = this.mMenuBuilderClass.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});     // Catch: Throwable -> L7 ClassNotFoundException -> L9
            this.mCanUseMenuBuilderReferences = true;     // Catch: Throwable -> L7 ClassNotFoundException -> L9
        L10:
            this.mMenuBuilderClass = null;
            this.mMenuBuilderRemoveItemAtMethod = null;
            this.mCanUseMenuBuilderReferences = false;
        L38:
            if (this.mCanUseMenuBuilderReferences == true) goto L14;
        L16:
            Method removeItemAtMethod = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});     // Catch: InvocationTargetException -> L30 IllegalAccessException -> L32 Throwable -> L34
        L17:
            int i = menu.size() - 1;     // Catch: InvocationTargetException -> L30 IllegalAccessException -> L32 Throwable -> L34
        L18:
            if (i < 0) goto L25;
            MenuItem item = menu.getItem(i);     // Catch: InvocationTargetException -> L30 IllegalAccessException -> L32 Throwable -> L34
            if (item.getIntent() == null) goto L24;
            if ("android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction()) == false) goto L24;
            removeItemAtMethod.invoke(menu, new Object[]{Integer.valueOf(i)});     // Catch: InvocationTargetException -> L30 IllegalAccessException -> L32 Throwable -> L34
        L24:
            i = i - 1;
            goto L18
        L25:
            List<ResolveInfo> supportedActivities = getSupportedActivities(context, packageManager);
            int i2 = 0;
        L27:
            if (i2 >= supportedActivities.size()) goto L29;
            ResolveInfo info = supportedActivities.get(i2);
            menu.add(0, 0, i2 + 100, info.loadLabel(packageManager)).setIntent(createProcessTextIntentForResolveInfo(info, this.mTextView)).setShowAsAction(1);
            i2 = i2 + 1;
            goto L27
        L29:
            return;
        L14:
            if (this.mMenuBuilderClass.isInstance(menu) == false) goto L16;
            removeItemAtMethod = this.mMenuBuilderRemoveItemAtMethod;     // Catch: InvocationTargetException -> L30 IllegalAccessException -> L32 Throwable -> L34
        }

        private List<ResolveInfo> getSupportedActivities(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList();
            boolean canStartActivityForResult = context instanceof Activity;
            if (canStartActivityForResult == true) goto L5;
            return supportedActivities;
        L5:
            List<ResolveInfo> unfiltered = packageManager.queryIntentActivities(createProcessTextIntent(), 0);
            Iterator<ResolveInfo> r3 = unfiltered.iterator();
        L7:
            if (r3.hasNext() == false) goto L12;
            ResolveInfo info = r3.next();
            if (isSupportedActivity(info, context) == false) goto L7;
            supportedActivities.add(info);
            goto L7
        L12:
            return supportedActivities;
        }

        private boolean isSupportedActivity(ResolveInfo info, Context context) {
            if (context.getPackageName().equals(info.activityInfo.packageName) == false) goto L6;
            return true;
        L6:
            if (info.activityInfo.exported == true) goto L9;
            return false;
        L9:
            if (info.activityInfo.permission != null) goto L11;
            return true;
        L11:
            if (context.checkSelfPermission(info.activityInfo.permission) != 0) goto L15;
            return true;
        L15:
            return false;
        }

        private Intent createProcessTextIntentForResolveInfo(ResolveInfo info, TextView textView11) {
            return createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !isEditable(textView11)).setClassName(info.activityInfo.packageName, info.activityInfo.name);
        }

        private boolean isEditable(TextView textView11) {
            if ((textView11 instanceof Editable) == true) goto L5;
        L9:
            return false;
        L5:
            if (textView11.onCheckIsTextEditor() == false) goto L9;
            if (textView11.isEnabled() == false) goto L9;
            return true;
        }

        private Intent createProcessTextIntent() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(AssetHelper.DEFAULT_MIME_TYPE);
        }
    }

    private TextViewCompat() {
    }

    @ReplaceWith(expression = "textView.setCompoundDrawablesRelative(start, top, end, bottom)")
    @Deprecated
    public static void setCompoundDrawablesRelative(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        textView.setCompoundDrawablesRelative(start, top, end, bottom);
    }

    @ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
    }

    @ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int start, int top, int end, int bottom) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
    }

    @ReplaceWith(expression = "textView.getMaxLines()")
    @Deprecated
    public static int getMaxLines(TextView textView) {
        return textView.getMaxLines();
    }

    @ReplaceWith(expression = "textView.getMinLines()")
    @Deprecated
    public static int getMinLines(TextView textView) {
        return textView.getMinLines();
    }

    public static void setTextAppearance(TextView textView, int resId) {
        textView.setTextAppearance(resId);
    }

    @ReplaceWith(expression = "textView.getCompoundDrawablesRelative()")
    @Deprecated
    public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeWithDefaults(TextView r2, int autoSizeTextType) {
        if (Build.VERSION.SDK_INT < 27) goto L6;
        Api26Impl.setAutoSizeTextTypeWithDefaults(r2, autoSizeTextType);
        return;
    L6:
        if ((r2 instanceof AutoSizeableTextView) == false) goto L10;
        ((AutoSizeableTextView) r2).setAutoSizeTextTypeWithDefaults(autoSizeTextType);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView r2, int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 27) goto L6;
        Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r2, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        return;
    L6:
        if ((r2 instanceof AutoSizeableTextView) == false) goto L10;
        ((AutoSizeableTextView) r2).setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView r2, int[] presetSizes, int unit) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 27) goto L6;
        Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r2, presetSizes, unit);
        return;
    L6:
        if ((r2 instanceof AutoSizeableTextView) == false) goto L10;
        ((AutoSizeableTextView) r2).setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeTextType(TextView r2) {
        if (Build.VERSION.SDK_INT < 27) goto L7;
        return Api26Impl.getAutoSizeTextType(r2);
    L7:
        if ((r2 instanceof AutoSizeableTextView) == true) goto L9;
        return 0;
    L9:
        return ((AutoSizeableTextView) r2).getAutoSizeTextType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeStepGranularity(TextView r2) {
        if (Build.VERSION.SDK_INT < 27) goto L7;
        return Api26Impl.getAutoSizeStepGranularity(r2);
    L7:
        if ((r2 instanceof AutoSizeableTextView) == true) goto L9;
        return -1;
    L9:
        return ((AutoSizeableTextView) r2).getAutoSizeStepGranularity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMinTextSize(TextView r2) {
        if (Build.VERSION.SDK_INT < 27) goto L7;
        return Api26Impl.getAutoSizeMinTextSize(r2);
    L7:
        if ((r2 instanceof AutoSizeableTextView) == true) goto L9;
        return -1;
    L9:
        return ((AutoSizeableTextView) r2).getAutoSizeMinTextSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMaxTextSize(TextView r2) {
        if (Build.VERSION.SDK_INT < 27) goto L7;
        return Api26Impl.getAutoSizeMaxTextSize(r2);
    L7:
        if ((r2 instanceof AutoSizeableTextView) == true) goto L9;
        return -1;
    L9:
        return ((AutoSizeableTextView) r2).getAutoSizeMaxTextSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int[] getAutoSizeTextAvailableSizes(TextView r2) {
        if (Build.VERSION.SDK_INT < 27) goto L7;
        return Api26Impl.getAutoSizeTextAvailableSizes(r2);
    L7:
        if ((r2 instanceof AutoSizeableTextView) == false) goto L11;
        return ((AutoSizeableTextView) r2).getAutoSizeTextAvailableSizes();
    L11:
        return new int[0];
    }

    @ReplaceWith(expression = "textView.setCustomSelectionActionModeCallback(callback)")
    @Deprecated
    public static void setCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT <= 27) goto L5;
    L10:
        return callback;
    L5:
        if ((callback instanceof OreoCallback) == true) goto L10;
        if (callback == null) goto L10;
        return new OreoCallback(callback, textView);
    }

    public static ActionMode.Callback unwrapCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        if ((callback instanceof OreoCallback) == true) goto L5;
        return callback;
    L5:
        return ((OreoCallback) callback).getWrappedCallback();
    }

    public static void setFirstBaselineToTopHeight(TextView textView, int firstBaselineToTopHeight) {
        Preconditions.checkArgumentNonnegative(firstBaselineToTopHeight);
        if (Build.VERSION.SDK_INT < 28) goto L6;
        Api28Impl.setFirstBaselineToTopHeight(textView, firstBaselineToTopHeight);
        return;
    L6:
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding() == false) goto L9;
        int fontMetricsTop = fontMetrics.top;
    L11:
        if (firstBaselineToTopHeight <= Math.abs(fontMetricsTop)) goto L14;
        int paddingTop = firstBaselineToTopHeight + fontMetricsTop;
        textView.setPadding(textView.getPaddingLeft(), paddingTop, textView.getPaddingRight(), textView.getPaddingBottom());
        return;
    L14:
        return;
    L9:
        fontMetricsTop = fontMetrics.ascent;
        goto L11
    }

    public static void setLastBaselineToBottomHeight(TextView textView, int lastBaselineToBottomHeight) {
        Preconditions.checkArgumentNonnegative(lastBaselineToBottomHeight);
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding() == false) goto L5;
        int fontMetricsBottom = fontMetrics.bottom;
    L7:
        if (lastBaselineToBottomHeight <= Math.abs(fontMetricsBottom)) goto L10;
        int paddingBottom = lastBaselineToBottomHeight - fontMetricsBottom;
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), paddingBottom);
        return;
    L10:
        return;
    L5:
        fontMetricsBottom = fontMetrics.descent;
        goto L7
    }

    public static int getFirstBaselineToTopHeight(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void setLineHeight(TextView textView, int lineHeight) {
        Preconditions.checkArgumentNonnegative(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        if (lineHeight == fontHeight) goto L6;
        textView.setLineSpacing(lineHeight - fontHeight, 1.0f);
        return;
    }

    public static void setLineHeight(TextView textView, int unit, float lineHeight) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Api34Impl.setLineHeight(textView, unit, lineHeight);
        return;
    L5:
        float lineHeightPx = TypedValue.applyDimension(unit, lineHeight, textView.getResources().getDisplayMetrics());
        setLineHeight(textView, Math.round(lineHeightPx));
    }

    public static PrecomputedTextCompat.Params getTextMetricsParams(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        PrecomputedTextCompat.Params.Builder builder = new PrecomputedTextCompat.Params.Builder(new TextPaint(textView.getPaint()));
        builder.setBreakStrategy(Api23Impl.getBreakStrategy(textView));
        builder.setHyphenationFrequency(Api23Impl.getHyphenationFrequency(textView));
        builder.setTextDirection(getTextDirectionHeuristic(textView));
        return builder.build();
    L5:
        return new PrecomputedTextCompat.Params(Api28Impl.getTextMetricsParams(textView));
    }

    public static void setTextMetricsParams(TextView textView, PrecomputedTextCompat.Params params) {
        textView.setTextDirection(getTextDirection(params.getTextDirection()));
        textView.getPaint().set(params.getTextPaint());
        Api23Impl.setBreakStrategy(textView, params.getBreakStrategy());
        Api23Impl.setHyphenationFrequency(textView, params.getHyphenationFrequency());
    }

    public static void setPrecomputedText(TextView textView, PrecomputedTextCompat precomputed) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        textView.setText(Api28Impl.castToCharSequence(precomputed.getPrecomputedText()));
        return;
    L5:
        PrecomputedTextCompat.Params param = getTextMetricsParams(textView);
        if (param.equalsWithoutTextDirection(precomputed.getParams()) == false) goto L10;
        textView.setText(precomputed);
        return;
    L10:
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    private static TextDirectionHeuristic getTextDirectionHeuristic(TextView textView) {
        if ((textView.getTransformationMethod() instanceof PasswordTransformationMethod) == true) goto L5;
        boolean defaultIsRtl = false;
        if (Build.VERSION.SDK_INT < 28) goto L20;
        if ((textView.getInputType() & 15) != 3) goto L20;
        DecimalFormatSymbols symbols = Api24Impl.getInstance(textView.getTextLocale());
        String zero = Api28Impl.getDigitStrings(symbols)[0];
        int firstCodepoint = zero.codePointAt(0);
        byte digitDirection = Character.getDirectionality(firstCodepoint);
        if (digitDirection == 1) goto L18;
        if (digitDirection == 2) goto L18;
        return TextDirectionHeuristics.LTR;
    L18:
        return TextDirectionHeuristics.RTL;
    L20:
        if (textView.getLayoutDirection() != 1) goto L23;
        defaultIsRtl = true;
    L23:
        switch(textView.getTextDirection()) {
            case 2: goto L37;
            case 3: goto L35;
            case 4: goto L33;
            case 5: goto L31;
            case 6: goto L29;
            case 7: goto L27;
            default: goto L24;
        };
    L24:
        if (defaultIsRtl == false) goto L39;
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    L39:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L27:
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    L29:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L31:
        return TextDirectionHeuristics.LOCALE;
    L33:
        return TextDirectionHeuristics.RTL;
    L35:
        return TextDirectionHeuristics.LTR;
    L37:
        return TextDirectionHeuristics.ANYRTL_LTR;
    L5:
        return TextDirectionHeuristics.LTR;
    }

    private static int getTextDirection(TextDirectionHeuristic heuristic) {
        if (heuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL) goto L6;
        return 1;
    L6:
        if (heuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) goto L9;
        return 1;
    L9:
        if (heuristic != TextDirectionHeuristics.ANYRTL_LTR) goto L13;
        return 2;
    L13:
        if (heuristic != TextDirectionHeuristics.LTR) goto L17;
        return 3;
    L17:
        if (heuristic != TextDirectionHeuristics.RTL) goto L21;
        return 4;
    L21:
        if (heuristic != TextDirectionHeuristics.LOCALE) goto L25;
        return 5;
    L25:
        if (heuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) goto L29;
        return 6;
    L29:
        if (heuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL) goto L32;
        return 7;
    L32:
        return 1;
    }

    public static void setCompoundDrawableTintList(TextView textView, ColorStateList tint) {
        Preconditions.checkNotNull(textView);
        Api23Impl.setCompoundDrawableTintList(textView, tint);
    }

    public static ColorStateList getCompoundDrawableTintList(TextView textView) {
        Preconditions.checkNotNull(textView);
        return Api23Impl.getCompoundDrawableTintList(textView);
    }

    public static void setCompoundDrawableTintMode(TextView textView, PorterDuff.Mode tintMode) {
        Preconditions.checkNotNull(textView);
        Api23Impl.setCompoundDrawableTintMode(textView, tintMode);
    }

    public static PorterDuff.Mode getCompoundDrawableTintMode(TextView textView) {
        Preconditions.checkNotNull(textView);
        return Api23Impl.getCompoundDrawableTintMode(textView);
    }
}
