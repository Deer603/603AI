package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJî\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$Jî\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = null;

    static {
        INSTANCE = new ExposedDropdownMenuDefaults();
    }

    private ExposedDropdownMenuDefaults() {
    }

    public final void TrailingIcon(final boolean expanded, Function0<Unit> r14, Composer $composer, final int $changed, final int r17) {
        Composer $composer2 = $composer.startRestartGroup(876077373);
        ComposerKt.sourceInformation($composer2, "C(TrailingIcon)240@10228L208,240@10149L287:ExposedDropdownMenu.kt#jmzs0o");
        int $dirty = $changed;
        if ((r17 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r17 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18) goto L25;
        boolean r1 = true;
    L27:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L37;
        if (r3 == 0) goto L30;
        final Function0<Unit> r4 = AnonymousClass1.INSTANCE;
    L32:
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventStart(876077373, $dirty2, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:235)");
    L34:
        IconButtonKt.IconButton(r4, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, AnonymousClass2.INSTANCE), false, null, ComposableLambdaKt.rememberComposableLambda(726122713, true, new AnonymousClass3(expanded), $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 24576, 12);
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventEnd();
    L38:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L42;
        r6.updateScope(new AnonymousClass4(this, expanded, r4, $changed, r17));
        return;
    L42:
        return;
    L30:
        r4 = r14;
        goto L32
    L37:
        $composer2.skipToGroupEnd();
        r4 = r14;
        goto L38
    L25:
        r1 = false;
        goto L27
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r14) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L22
    L20:
        r5 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(expanded) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L12
    L10:
        r7 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1668textFieldColorsDlUQjxs(long textColor, long disabledTextColor, long backgroundColor, long cursorColor, long errorCursorColor, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long focusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int r103) {
        ComposerKt.sourceInformationMarkerStart($composer, 1208167904, "C(textFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)292@13129L7,292@13160L7,293@13233L8,295@13303L6,296@13414L6,297@13478L6,298@13545L6,298@13586L4,300@13660L6,303@13860L8,304@13922L6,306@13996L6,307@14143L8,310@14272L6,312@14402L6,312@14443L4,313@14537L8,314@14602L6,315@14665L6,315@14706L4,316@14764L6,316@14799L6,317@14882L8,318@14940L6,319@15002L6,319@15037L6,320@15123L8:ExposedDropdownMenu.kt#jmzs0o");
        if ((r103 & 1) == 0) goto L5;
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long r9 = ((Color) r8).m4376unboximpl();
        ProvidableCompositionLocal<Float> r4 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long textColor2 = Color.m4365copywmQWz5c$default(r9, ((Number) r6).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
    L7:
        if ((r103 & 2) == 0) goto L9;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(textColor2, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r103 & 4) == 0) goto L13;
        long backgroundColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r103 & 8) == 0) goto L17;
        long cursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L19:
        if ((r103 & 16) == 0) goto L21;
        long errorCursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L23:
        if ((r103 & 32) == 0) goto L25;
        long focusedIndicatorColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r103 & 64) == 0) goto L29;
        long unfocusedIndicatorColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null);
    L31:
        if ((r103 & 128) == 0) goto L33;
        long unfocusedIndicatorColor3 = unfocusedIndicatorColor2;
        long unfocusedIndicatorColor4 = unfocusedIndicatorColor3;
        long disabledIndicatorColor2 = Color.m4365copywmQWz5c$default(unfocusedIndicatorColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L35:
        if ((r103 & 256) == 0) goto L37;
        long errorIndicatorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L39:
        if ((r103 & 512) == 0) goto L41;
        long leadingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L43:
        if ((r103 & 1024) == 0) goto L45;
        long leadingIconColor3 = leadingIconColor2;
        long leadingIconColor4 = Color.m4365copywmQWz5c$default(leadingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long leadingIconColor5 = leadingIconColor3;
    L47:
        if ((r103 & 2048) == 0) goto L49;
        long errorLeadingIconColor2 = leadingIconColor5;
    L51:
        if ((r103 & 4096) == 0) goto L53;
        long trailingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L55:
        if ((r103 & 8192) == 0) goto L57;
        long focusedTrailingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L59:
        if ((r103 & 16384) == 0) goto L61;
        long trailingIconColor3 = trailingIconColor2;
        long trailingIconColor4 = Color.m4365copywmQWz5c$default(trailingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long trailingIconColor5 = trailingIconColor3;
    L63:
        if ((32768 & r103) == 0) goto L65;
        long errorTrailingIconColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L67:
        if ((65536 & r103) == 0) goto L69;
        long focusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L71:
        if ((131072 & r103) == 0) goto L73;
        long unfocusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L75:
        if ((262144 & r103) == 0) goto L77;
        long unfocusedLabelColor3 = unfocusedLabelColor2;
        long unfocusedLabelColor4 = Color.m4365copywmQWz5c$default(unfocusedLabelColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long unfocusedLabelColor5 = unfocusedLabelColor3;
    L79:
        if ((524288 & r103) == 0) goto L81;
        long errorLabelColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L83:
        if ((1048576 & r103) == 0) goto L85;
        long placeholderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L87:
        if ((r103 & 2097152) == 0) goto L89;
        long placeholderColor3 = placeholderColor2;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(placeholderColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L91:
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventStart(1208167904, $changed, $changed1, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:322)");
    L94:
        long unfocusedIndicatorColor5 = unfocusedIndicatorColor4;
        long unfocusedIndicatorColor6 = errorIndicatorColor2;
        DefaultTextFieldForExposedDropdownMenusColors r5 = new DefaultTextFieldForExposedDropdownMenusColors(textColor2, disabledTextColor2, cursorColor2, errorCursorColor2, focusedIndicatorColor2, unfocusedIndicatorColor5, unfocusedIndicatorColor6, disabledIndicatorColor2, leadingIconColor5, leadingIconColor4, errorLeadingIconColor2, trailingIconColor5, focusedTrailingIconColor2, trailingIconColor4, errorTrailingIconColor2, backgroundColor2, focusedLabelColor2, unfocusedLabelColor5, unfocusedLabelColor4, errorLabelColor2, placeholderColor2, disabledPlaceholderColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventEnd();
    L97:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L89:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L91
    L85:
        placeholderColor2 = placeholderColor;
        goto L87
    L81:
        errorLabelColor2 = errorLabelColor;
        goto L83
    L77:
        unfocusedLabelColor5 = unfocusedLabelColor2;
        unfocusedLabelColor4 = disabledLabelColor;
        goto L79
    L73:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L75
    L69:
        focusedLabelColor2 = focusedLabelColor;
        goto L71
    L65:
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L67
    L61:
        trailingIconColor5 = trailingIconColor2;
        trailingIconColor4 = disabledTrailingIconColor;
        goto L63
    L57:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L59
    L53:
        trailingIconColor2 = trailingIconColor;
        goto L55
    L49:
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L51
    L45:
        leadingIconColor5 = leadingIconColor2;
        leadingIconColor4 = disabledLeadingIconColor;
        goto L47
    L41:
        leadingIconColor2 = leadingIconColor;
        goto L43
    L37:
        errorIndicatorColor2 = errorIndicatorColor;
        goto L39
    L33:
        unfocusedIndicatorColor4 = unfocusedIndicatorColor2;
        disabledIndicatorColor2 = disabledIndicatorColor;
        goto L35
    L29:
        unfocusedIndicatorColor2 = unfocusedIndicatorColor;
        goto L31
    L25:
        focusedIndicatorColor2 = focusedIndicatorColor;
        goto L27
    L21:
        errorCursorColor2 = errorCursorColor;
        goto L23
    L17:
        cursorColor2 = cursorColor;
        goto L19
    L13:
        backgroundColor2 = backgroundColor;
        goto L15
    L9:
        disabledTextColor2 = disabledTextColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }

    /* JADX INFO: renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1667outlinedTextFieldColorsDlUQjxs(long textColor, long disabledTextColor, long backgroundColor, long cursorColor, long errorCursorColor, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long focusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int r103) {
        ComposerKt.sourceInformationMarkerStart($composer, 1162641182, "C(outlinedTextFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)390@19095L7,390@19126L7,391@19199L8,393@19305L6,394@19369L6,395@19433L6,395@19474L4,397@19545L6,397@19588L8,398@19683L8,399@19742L6,401@19816L6,402@19963L8,405@20092L6,407@20222L6,407@20263L4,408@20357L8,409@20422L6,410@20485L6,410@20526L4,411@20584L6,411@20619L6,412@20702L8,413@20760L6,414@20822L6,414@20857L6,415@20943L8:ExposedDropdownMenu.kt#jmzs0o");
        if ((r103 & 1) == 0) goto L5;
        ProvidableCompositionLocal<Color> r3 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long r9 = ((Color) r8).m4376unboximpl();
        ProvidableCompositionLocal<Float> r4 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        long textColor2 = Color.m4365copywmQWz5c$default(r9, ((Number) r6).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
    L7:
        if ((r103 & 2) == 0) goto L9;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(textColor2, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r103 & 4) == 0) goto L13;
        long backgroundColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L15:
        if ((r103 & 8) == 0) goto L17;
        long cursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L19:
        if ((r103 & 16) == 0) goto L21;
        long errorCursorColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L23:
        if ((r103 & 32) == 0) goto L25;
        long focusedBorderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r103 & 64) == 0) goto L29;
        long unfocusedBorderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L31:
        if ((r103 & 128) == 0) goto L33;
        long unfocusedBorderColor3 = unfocusedBorderColor2;
        long unfocusedBorderColor4 = unfocusedBorderColor3;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(unfocusedBorderColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L35:
        if ((r103 & 256) == 0) goto L37;
        long errorBorderColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L39:
        if ((r103 & 512) == 0) goto L41;
        long leadingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L43:
        if ((r103 & 1024) == 0) goto L45;
        long leadingIconColor3 = leadingIconColor2;
        long leadingIconColor4 = Color.m4365copywmQWz5c$default(leadingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long leadingIconColor5 = leadingIconColor3;
    L47:
        if ((r103 & 2048) == 0) goto L49;
        long errorLeadingIconColor2 = leadingIconColor5;
    L51:
        if ((r103 & 4096) == 0) goto L53;
        long trailingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L55:
        if ((r103 & 8192) == 0) goto L57;
        long focusedTrailingIconColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L59:
        if ((r103 & 16384) == 0) goto L61;
        long trailingIconColor3 = trailingIconColor2;
        long trailingIconColor4 = Color.m4365copywmQWz5c$default(trailingIconColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long trailingIconColor5 = trailingIconColor3;
    L63:
        if ((32768 & r103) == 0) goto L65;
        long errorTrailingIconColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L67:
        if ((65536 & r103) == 0) goto L69;
        long focusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L71:
        if ((131072 & r103) == 0) goto L73;
        long unfocusedLabelColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L75:
        if ((262144 & r103) == 0) goto L77;
        long unfocusedLabelColor3 = unfocusedLabelColor2;
        long unfocusedLabelColor4 = Color.m4365copywmQWz5c$default(unfocusedLabelColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long unfocusedLabelColor5 = unfocusedLabelColor3;
    L79:
        if ((524288 & r103) == 0) goto L81;
        long errorLabelColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1592getError0d7_KjU();
    L83:
        if ((1048576 & r103) == 0) goto L85;
        long placeholderColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L87:
        if ((r103 & 2097152) == 0) goto L89;
        long placeholderColor3 = placeholderColor2;
        long disabledPlaceholderColor2 = Color.m4365copywmQWz5c$default(placeholderColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L91:
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventStart(1162641182, $changed, $changed1, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:417)");
    L94:
        long unfocusedBorderColor5 = unfocusedBorderColor4;
        long unfocusedBorderColor6 = errorBorderColor2;
        DefaultTextFieldForExposedDropdownMenusColors r5 = new DefaultTextFieldForExposedDropdownMenusColors(textColor2, disabledTextColor2, cursorColor2, errorCursorColor2, focusedBorderColor2, unfocusedBorderColor5, unfocusedBorderColor6, disabledBorderColor2, leadingIconColor5, leadingIconColor4, errorLeadingIconColor2, trailingIconColor5, focusedTrailingIconColor2, trailingIconColor4, errorTrailingIconColor2, backgroundColor2, focusedLabelColor2, unfocusedLabelColor5, unfocusedLabelColor4, errorLabelColor2, placeholderColor2, disabledPlaceholderColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventEnd();
    L97:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L89:
        disabledPlaceholderColor2 = disabledPlaceholderColor;
        goto L91
    L85:
        placeholderColor2 = placeholderColor;
        goto L87
    L81:
        errorLabelColor2 = errorLabelColor;
        goto L83
    L77:
        unfocusedLabelColor5 = unfocusedLabelColor2;
        unfocusedLabelColor4 = disabledLabelColor;
        goto L79
    L73:
        unfocusedLabelColor2 = unfocusedLabelColor;
        goto L75
    L69:
        focusedLabelColor2 = focusedLabelColor;
        goto L71
    L65:
        errorTrailingIconColor2 = errorTrailingIconColor;
        goto L67
    L61:
        trailingIconColor5 = trailingIconColor2;
        trailingIconColor4 = disabledTrailingIconColor;
        goto L63
    L57:
        focusedTrailingIconColor2 = focusedTrailingIconColor;
        goto L59
    L53:
        trailingIconColor2 = trailingIconColor;
        goto L55
    L49:
        errorLeadingIconColor2 = errorLeadingIconColor;
        goto L51
    L45:
        leadingIconColor5 = leadingIconColor2;
        leadingIconColor4 = disabledLeadingIconColor;
        goto L47
    L41:
        leadingIconColor2 = leadingIconColor;
        goto L43
    L37:
        errorBorderColor2 = errorBorderColor;
        goto L39
    L33:
        unfocusedBorderColor4 = unfocusedBorderColor2;
        disabledBorderColor2 = disabledBorderColor;
        goto L35
    L29:
        unfocusedBorderColor2 = unfocusedBorderColor;
        goto L31
    L25:
        focusedBorderColor2 = focusedBorderColor;
        goto L27
    L21:
        errorCursorColor2 = errorCursorColor;
        goto L23
    L17:
        cursorColor2 = cursorColor;
        goto L19
    L13:
        backgroundColor2 = backgroundColor;
        goto L15
    L9:
        disabledTextColor2 = disabledTextColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }
}
