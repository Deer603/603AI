package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\u009c\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006+"}, d2 = {"Landroidx/compose/material3/Typography;", "", "displayLarge", "Landroidx/compose/ui/text/TextStyle;", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBodyLarge", "()Landroidx/compose/ui/text/TextStyle;", "getBodyMedium", "getBodySmall", "getDisplayLarge", "getDisplayMedium", "getDisplaySmall", "getHeadlineLarge", "getHeadlineMedium", "getHeadlineSmall", "getLabelLarge", "getLabelMedium", "getLabelSmall", "getTitleLarge", "getTitleMedium", "getTitleSmall", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle bodyLarge;
    private final TextStyle bodyMedium;
    private final TextStyle bodySmall;
    private final TextStyle displayLarge;
    private final TextStyle displayMedium;
    private final TextStyle displaySmall;
    private final TextStyle headlineLarge;
    private final TextStyle headlineMedium;
    private final TextStyle headlineSmall;
    private final TextStyle labelLarge;
    private final TextStyle labelMedium;
    private final TextStyle labelSmall;
    private final TextStyle titleLarge;
    private final TextStyle titleMedium;
    private final TextStyle titleSmall;

    static {
    }

    public Typography() {
        TextStyle r1 = null;
        TextStyle r2 = null;
        TextStyle r3 = null;
        TextStyle r4 = null;
        TextStyle r5 = null;
        TextStyle r6 = null;
        TextStyle r7 = null;
        TextStyle r8 = null;
        TextStyle r9 = null;
        TextStyle r10 = null;
        TextStyle r11 = null;
        TextStyle r12 = null;
        TextStyle r13 = null;
        TextStyle r14 = null;
        TextStyle r15 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, 32767, null);
    }

    public Typography(TextStyle displayLarge, TextStyle displayMedium, TextStyle displaySmall, TextStyle headlineLarge, TextStyle headlineMedium, TextStyle headlineSmall, TextStyle titleLarge, TextStyle titleMedium, TextStyle titleSmall, TextStyle bodyLarge, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLarge, TextStyle labelMedium, TextStyle labelSmall) {
        this.displayLarge = displayLarge;
        this.displayMedium = displayMedium;
        this.displaySmall = displaySmall;
        this.headlineLarge = headlineLarge;
        this.headlineMedium = headlineMedium;
        this.headlineSmall = headlineSmall;
        this.titleLarge = titleLarge;
        this.titleMedium = titleMedium;
        this.titleSmall = titleSmall;
        this.bodyLarge = bodyLarge;
        this.bodyMedium = bodyMedium;
        this.bodySmall = bodySmall;
        this.labelLarge = labelLarge;
        this.labelMedium = labelMedium;
        this.labelSmall = labelSmall;
    }

    public /* synthetic */ Typography(TextStyle r16, TextStyle r17, TextStyle r18, TextStyle r19, TextStyle r20, TextStyle r21, TextStyle r22, TextStyle r23, TextStyle r24, TextStyle r25, TextStyle r26, TextStyle r27, TextStyle r28, TextStyle r29, TextStyle r30, int r31, DefaultConstructorMarker r32) {
        if ((r31 & 1) == 0) goto L5;
        TextStyle r1 = TypographyTokens.INSTANCE.getDisplayLarge();
    L7:
        if ((r31 & 2) == 0) goto L9;
        TextStyle r2 = TypographyTokens.INSTANCE.getDisplayMedium();
    L11:
        if ((r31 & 4) == 0) goto L13;
        TextStyle r3 = TypographyTokens.INSTANCE.getDisplaySmall();
    L15:
        if ((r31 & 8) == 0) goto L17;
        TextStyle r4 = TypographyTokens.INSTANCE.getHeadlineLarge();
    L19:
        if ((r31 & 16) == 0) goto L21;
        TextStyle r5 = TypographyTokens.INSTANCE.getHeadlineMedium();
    L23:
        if ((r31 & 32) == 0) goto L25;
        TextStyle r6 = TypographyTokens.INSTANCE.getHeadlineSmall();
    L27:
        if ((r31 & 64) == 0) goto L29;
        TextStyle r7 = TypographyTokens.INSTANCE.getTitleLarge();
    L31:
        if ((r31 & 128) == 0) goto L33;
        TextStyle r8 = TypographyTokens.INSTANCE.getTitleMedium();
    L35:
        if ((r31 & 256) == 0) goto L37;
        TextStyle r9 = TypographyTokens.INSTANCE.getTitleSmall();
    L39:
        if ((r31 & 512) == 0) goto L41;
        TextStyle r10 = TypographyTokens.INSTANCE.getBodyLarge();
    L43:
        if ((r31 & 1024) == 0) goto L45;
        TextStyle r11 = TypographyTokens.INSTANCE.getBodyMedium();
    L47:
        if ((r31 & 2048) == 0) goto L49;
        TextStyle r12 = TypographyTokens.INSTANCE.getBodySmall();
    L51:
        if ((r31 & 4096) == 0) goto L53;
        TextStyle r13 = TypographyTokens.INSTANCE.getLabelLarge();
    L55:
        if ((r31 & 8192) == 0) goto L57;
        TextStyle r14 = TypographyTokens.INSTANCE.getLabelMedium();
    L59:
        if ((r31 & 16384) == 0) goto L61;
        TextStyle r0 = TypographyTokens.INSTANCE.getLabelSmall();
    L62:
        TextStyle r110 = r1;
        TextStyle r111 = r2;
        TextStyle r112 = r3;
        TextStyle r210 = r4;
        TextStyle r211 = r5;
        TextStyle r212 = r6;
        TextStyle r213 = r7;
        TextStyle r214 = r8;
        TextStyle r215 = r9;
        TextStyle r216 = r10;
        TextStyle r217 = r11;
        TextStyle r218 = r12;
        TextStyle r219 = r13;
        TextStyle r33 = r14;
        this(r110, r111, r112, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r33, r0);
        return;
    L61:
        r0 = r30;
        goto L62
    L57:
        r14 = r29;
        goto L59
    L53:
        r13 = r28;
        goto L55
    L49:
        r12 = r27;
        goto L51
    L45:
        r11 = r26;
        goto L47
    L41:
        r10 = r25;
        goto L43
    L37:
        r9 = r24;
        goto L39
    L33:
        r8 = r23;
        goto L35
    L29:
        r7 = r22;
        goto L31
    L25:
        r6 = r21;
        goto L27
    L21:
        r5 = r20;
        goto L23
    L17:
        r4 = r19;
        goto L19
    L13:
        r3 = r18;
        goto L15
    L9:
        r2 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }

    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    public static /* synthetic */ Typography copy$default(Typography r16, TextStyle r17, TextStyle r18, TextStyle r19, TextStyle r20, TextStyle r21, TextStyle r22, TextStyle r23, TextStyle r24, TextStyle r25, TextStyle r26, TextStyle r27, TextStyle r28, TextStyle r29, TextStyle r30, TextStyle r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        TextStyle r2 = r16.displayLarge;
    L7:
        if ((r32 & 2) == 0) goto L9;
        TextStyle r3 = r16.displayMedium;
    L11:
        if ((r32 & 4) == 0) goto L13;
        TextStyle r4 = r16.displaySmall;
    L15:
        if ((r32 & 8) == 0) goto L17;
        TextStyle r5 = r16.headlineLarge;
    L19:
        if ((r32 & 16) == 0) goto L21;
        TextStyle r6 = r16.headlineMedium;
    L23:
        if ((r32 & 32) == 0) goto L25;
        TextStyle r7 = r16.headlineSmall;
    L27:
        if ((r32 & 64) == 0) goto L29;
        TextStyle r8 = r16.titleLarge;
    L31:
        if ((r32 & 128) == 0) goto L33;
        TextStyle r9 = r16.titleMedium;
    L35:
        if ((r32 & 256) == 0) goto L37;
        TextStyle r10 = r16.titleSmall;
    L39:
        if ((r32 & 512) == 0) goto L41;
        TextStyle r11 = r16.bodyLarge;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        TextStyle r12 = r16.bodyMedium;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        TextStyle r13 = r16.bodySmall;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        TextStyle r14 = r16.labelLarge;
    L55:
        if ((r32 & 8192) == 0) goto L57;
        TextStyle r15 = r16.labelMedium;
    L59:
        if ((r32 & 16384) == 0) goto L61;
        TextStyle r1 = r16.labelSmall;
    L62:
        TextStyle r110 = r2;
        TextStyle r111 = r3;
        TextStyle r210 = r4;
        TextStyle r211 = r5;
        TextStyle r212 = r6;
        TextStyle r213 = r7;
        TextStyle r214 = r8;
        TextStyle r215 = r9;
        TextStyle r216 = r10;
        TextStyle r217 = r11;
        TextStyle r218 = r12;
        TextStyle r219 = r13;
        TextStyle r34 = r14;
        TextStyle r35 = r15;
        return r16.copy(r110, r111, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r34, r35, r1);
    L61:
        r1 = r31;
        goto L62
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final Typography copy(TextStyle displayLarge, TextStyle displayMedium, TextStyle displaySmall, TextStyle headlineLarge, TextStyle headlineMedium, TextStyle headlineSmall, TextStyle titleLarge, TextStyle titleMedium, TextStyle titleSmall, TextStyle bodyLarge, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLarge, TextStyle labelMedium, TextStyle labelSmall) {
        return new Typography(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Typography) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.displayLarge, ((Typography) other).displayLarge) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.displayMedium, ((Typography) other).displayMedium) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.displaySmall, ((Typography) other).displaySmall) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.headlineLarge, ((Typography) other).headlineLarge) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.headlineMedium, ((Typography) other).headlineMedium) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.headlineSmall, ((Typography) other).headlineSmall) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.titleLarge, ((Typography) other).titleLarge) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.titleMedium, ((Typography) other).titleMedium) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.areEqual(this.titleSmall, ((Typography) other).titleSmall) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.areEqual(this.bodyLarge, ((Typography) other).bodyLarge) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.areEqual(this.bodyMedium, ((Typography) other).bodyMedium) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.areEqual(this.bodySmall, ((Typography) other).bodySmall) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.areEqual(this.labelLarge, ((Typography) other).labelLarge) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.areEqual(this.labelMedium, ((Typography) other).labelMedium) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.areEqual(this.labelSmall, ((Typography) other).labelSmall) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public int hashCode() {
        int result = this.displayLarge.hashCode();
        int result2 = (result * 31) + this.displayMedium.hashCode();
        return (((((((((((((((((((((((((result2 * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("Typography(displayLarge=").append(this.displayLarge).append(", displayMedium=").append(this.displayMedium).append(",displaySmall=").append(this.displaySmall).append(", headlineLarge=").append(this.headlineLarge).append(", headlineMedium=").append(this.headlineMedium).append(", headlineSmall=").append(this.headlineSmall).append(", titleLarge=").append(this.titleLarge).append(", titleMedium=").append(this.titleMedium).append(", titleSmall=").append(this.titleSmall).append(", bodyLarge=").append(this.bodyLarge).append(", bodyMedium=").append(this.bodyMedium).append(", bodySmall=");
        r0.append(this.bodySmall).append(", labelLarge=").append(this.labelLarge).append(", labelMedium=").append(this.labelMedium).append(", labelSmall=").append(this.labelSmall).append(')');
        return r0.toString();
    }
}
