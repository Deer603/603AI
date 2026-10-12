package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "value", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "fromToken", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TypographyKt {
    private static final ProvidableCompositionLocal<Typography> LocalTypography = null;

    /* JADX INFO: compiled from: Typography.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[TypographyKeyTokens.values().length];
            r0[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L66:
            r0[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L76:
            r0[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L60:
            r0[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L68:
            r0[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L52:
            r0[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L64:
            r0[TypographyKeyTokens.TitleLarge.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L70:
            r0[TypographyKeyTokens.TitleMedium.ordinal()] = 8;     // Catch: NoSuchFieldError -> L26
        L54:
            r0[TypographyKeyTokens.TitleSmall.ordinal()] = 9;     // Catch: NoSuchFieldError -> L29
        L56:
            r0[TypographyKeyTokens.BodyLarge.ordinal()] = 10;     // Catch: NoSuchFieldError -> L32
        L78:
            r0[TypographyKeyTokens.BodyMedium.ordinal()] = 11;     // Catch: NoSuchFieldError -> L35
        L50:
            r0[TypographyKeyTokens.BodySmall.ordinal()] = 12;     // Catch: NoSuchFieldError -> L38
        L72:
            r0[TypographyKeyTokens.LabelLarge.ordinal()] = 13;     // Catch: NoSuchFieldError -> L41
        L74:
            r0[TypographyKeyTokens.LabelMedium.ordinal()] = 14;     // Catch: NoSuchFieldError -> L44
        L62:
            r0[TypographyKeyTokens.LabelSmall.ordinal()] = 15;     // Catch: NoSuchFieldError -> L47
        L48:
            $EnumSwitchMapping$0 = r0;
        }
    }

    private static final TextStyle fromToken(Typography $this$fromToken, TypographyKeyTokens value) {
        switch(WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1: goto L21;
            case 2: goto L35;
            case 3: goto L34;
            case 4: goto L33;
            case 5: goto L32;
            case 6: goto L31;
            case 7: goto L30;
            case 8: goto L29;
            case 9: goto L28;
            case 10: goto L27;
            case 11: goto L26;
            case 12: goto L25;
            case 13: goto L24;
            case 14: goto L23;
            case 15: goto L22;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L22:
        return $this$fromToken.getLabelSmall();
    L23:
        return $this$fromToken.getLabelMedium();
    L24:
        return $this$fromToken.getLabelLarge();
    L25:
        return $this$fromToken.getBodySmall();
    L26:
        return $this$fromToken.getBodyMedium();
    L27:
        return $this$fromToken.getBodyLarge();
    L28:
        return $this$fromToken.getTitleSmall();
    L29:
        return $this$fromToken.getTitleMedium();
    L30:
        return $this$fromToken.getTitleLarge();
    L31:
        return $this$fromToken.getHeadlineSmall();
    L32:
        return $this$fromToken.getHeadlineMedium();
    L33:
        return $this$fromToken.getHeadlineLarge();
    L34:
        return $this$fromToken.getDisplaySmall();
    L35:
        return $this$fromToken.getDisplayMedium();
    L21:
        return $this$fromToken.getDisplayLarge();
    }

    public static final TextStyle getValue(TypographyKeyTokens $this$value, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1049072145, "C209@10713L10:Typography.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1049072145, $changed, -1, "androidx.compose.material3.<get-value> (Typography.kt:209)");
    L5:
        TextStyle r0 = fromToken(MaterialTheme.INSTANCE.getTypography($composer, 6), $this$value);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    static {
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }
}
