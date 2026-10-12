package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;

/* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JØ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0003\u0010\u0016\u001a\u00020\f2\b\b\u0003\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "()V", "delegate", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "create", "Landroid/text/StaticLayout;", "text", "", "paint", "Landroid/text/TextPaint;", "width", "", "start", "end", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "leftIndents", "", "rightIndents", "isFallbackLineSpacingEnabled", "layout", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StaticLayoutFactory {
    public static final int $stable = 0;
    public static final StaticLayoutFactory INSTANCE = null;
    private static final StaticLayoutFactoryImpl delegate = null;

    private StaticLayoutFactory() {
    }

    static {
        INSTANCE = new StaticLayoutFactory();
        delegate = new StaticLayoutFactory23();
        $stable = 8;
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory r25, CharSequence r26, TextPaint r27, int r28, int r29, int r30, TextDirectionHeuristic r31, Layout.Alignment r32, int r33, TextUtils.TruncateAt r34, int r35, float r36, float r37, int r38, boolean r39, boolean r40, int r41, int r42, int r43, int r44, int[] r45, int[] r46, int r47, Object r48) {
        if ((r47 & 8) == 0) goto L5;
        int r7 = 0;
    L7:
        if ((r47 & 16) == 0) goto L9;
        int r8 = r26.length();
    L11:
        if ((r47 & 32) == 0) goto L13;
        TextDirectionHeuristic r9 = LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release();
    L15:
        if ((r47 & 64) == 0) goto L17;
        Layout.Alignment r10 = LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release();
    L19:
        if ((r47 & 128) == 0) goto L21;
        int r11 = Integer.MAX_VALUE;
    L23:
        if ((r47 & 256) == 0) goto L25;
        TextUtils.TruncateAt r12 = null;
    L27:
        if ((r47 & 512) == 0) goto L29;
        int r13 = r28;
    L31:
        if ((r47 & 1024) == 0) goto L33;
        float r14 = 1.0f;
    L35:
        if ((r47 & 2048) == 0) goto L37;
        float r15 = 0.0f;
    L39:
        if ((r47 & 4096) == 0) goto L41;
        int r16 = 0;
    L43:
        if ((r47 & 8192) == 0) goto L45;
        boolean r17 = false;
    L47:
        if ((r47 & 16384) == 0) goto L49;
        boolean r18 = true;
    L51:
        if ((32768 & r47) == 0) goto L53;
        int r19 = 0;
    L55:
        if ((65536 & r47) == 0) goto L57;
        int r20 = 0;
    L59:
        if ((131072 & r47) == 0) goto L61;
        int r21 = 0;
    L63:
        if ((262144 & r47) == 0) goto L65;
        int r22 = 0;
    L67:
        if ((524288 & r47) == 0) goto L69;
        int[] r23 = null;
    L71:
        if ((r47 & 1048576) == 0) goto L73;
        int[] r24 = null;
    L75:
        return r25.create(r26, r27, r28, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    L73:
        r24 = r46;
        goto L75
    L69:
        r23 = r45;
        goto L71
    L65:
        r22 = r44;
        goto L67
    L61:
        r21 = r43;
        goto L63
    L57:
        r20 = r42;
        goto L59
    L53:
        r19 = r41;
        goto L55
    L49:
        r18 = r40;
        goto L51
    L45:
        r17 = r39;
        goto L47
    L41:
        r16 = r38;
        goto L43
    L37:
        r15 = r37;
        goto L39
    L33:
        r14 = r36;
        goto L35
    L29:
        r13 = r35;
        goto L31
    L25:
        r12 = r34;
        goto L27
    L21:
        r11 = r33;
        goto L23
    L17:
        r10 = r32;
        goto L19
    L13:
        r9 = r31;
        goto L15
    L9:
        r8 = r30;
        goto L11
    L5:
        r7 = r29;
        goto L7
    }

    public final StaticLayout create(CharSequence text, TextPaint paint, int width, int start, int end, TextDirectionHeuristic textDir, Layout.Alignment alignment, int maxLines, TextUtils.TruncateAt ellipsize, int ellipsizedWidth, float lineSpacingMultiplier, float lineSpacingExtra, int justificationMode, boolean includePadding, boolean useFallbackLineSpacing, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, int hyphenationFrequency, int[] leftIndents, int[] rightIndents) {
        return delegate.create(new StaticLayoutParams(text, start, end, paint, width, textDir, alignment, maxLines, ellipsize, ellipsizedWidth, lineSpacingMultiplier, lineSpacingExtra, justificationMode, includePadding, useFallbackLineSpacing, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphenationFrequency, leftIndents, rightIndents));
    }

    public final boolean isFallbackLineSpacingEnabled(StaticLayout layout, boolean useFallbackLineSpacing) {
        return delegate.isFallbackLineSpacingEnabled(layout, useFallbackLineSpacing);
    }
}
