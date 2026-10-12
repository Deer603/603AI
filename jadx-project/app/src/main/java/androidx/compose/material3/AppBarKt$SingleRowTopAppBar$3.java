package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class AppBarKt$SingleRowTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    AppBarKt$SingleRowTopAppBar$3(WindowInsets r2, float r3, TopAppBarScrollBehavior r4, TopAppBarColors r5, Function2<? super Composer, ? super Integer, Unit> r6, TextStyle r7, boolean r8, Function2<? super Composer, ? super Integer, Unit> r9, Function2<? super Composer, ? super Integer, Unit> r10) {
        this.$windowInsets = r2;
        this.$expandedHeight = r3;
        this.$scrollBehavior = r4;
        this.$colors = r5;
        this.$title = r6;
        this.$titleTextStyle = r7;
        this.$centeredTitle = r8;
        this.$navigationIcon = r9;
        this.$actionsRow = r10;
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer r3, Integer r4) {
        invoke(r3, r4.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1933@88685L45,1927@88379L998:AppBar.kt#uh7d8r");
        if (($changed & 3) != 2) goto L9;
        if ($composer.getSkipping() == false) goto L9;
        $composer.skipToGroupEnd();
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1943739546, $changed, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
    L11:
        Modifier r3 = SizeKt.m760heightInVpY3zN4$default(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, this.$windowInsets)), 0.0f, this.$expandedHeight, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, 660708484, "CC(remember):AppBar.kt#9igjgp");
        boolean invalid$iv = $composer.changed(this.$scrollBehavior);
        final TopAppBarScrollBehavior r5 = this.$scrollBehavior;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L14;
    L17:
        Object value$iv = new AppBarKt$SingleRowTopAppBar$3$$ExternalSyntheticLambda0(r5);
        $composer.updateRememberedValue(value$iv);
    L18:
        ScrolledOffset r11 = (ScrolledOffset) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        long r4 = this.$colors.m2980getNavigationIconContentColor0d7_KjU();
        long r6 = this.$colors.m2982getTitleContentColor0d7_KjU();
        long r8 = this.$colors.m2978getActionIconContentColor0d7_KjU();
        Function2<Composer, Integer, Unit> r9 = this.$title;
        TextStyle r10 = this.$titleTextStyle;
        Arrangement.HorizontalOrVertical r12 = Arrangement.INSTANCE.getCenter();
        if (this.$centeredTitle == false) goto L21;
        Arrangement.HorizontalOrVertical r13 = Arrangement.INSTANCE.getCenter();
    L22:
        AppBarKt.m1905access$TopAppBarLayoutkXwM9vE(r3, r11, r4, r6, r8, r9, r10, 1.0f, r12, r13, 0, false, this.$navigationIcon, this.$actionsRow, $composer, 113246208, 3126);
        if (ComposerKt.isTraceInProgress() == false) goto L27;
        ComposerKt.traceEventEnd();
        return;
    L27:
        return;
    L21:
        r13 = Arrangement.INSTANCE.getStart();
        goto L22
    L14:
        if (it$iv == Composer.Companion.getEmpty()) goto L17;
        value$iv = it$iv;
        goto L18
    }

    static final float invoke$lambda$1$lambda$0(TopAppBarScrollBehavior $scrollBehavior) {
        if ($scrollBehavior == null) goto L6;
        TopAppBarState r0 = $scrollBehavior.getState();
        if (r0 == null) goto L6;
        return r0.getHeightOffset();
    L6:
        return 0.0f;
    }
}
