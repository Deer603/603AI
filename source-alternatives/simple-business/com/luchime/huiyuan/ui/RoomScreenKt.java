package com.luchime.huiyuan.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.webkit.WebViewAssetLoader;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoomScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\u0016\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u008a\u0084\u0002²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u008a\u0084\u0002"}, d2 = {"RoomScreen", "", "onModelSelected", "Lkotlin/Function1;", "Lcom/luchime/huiyuan/ui/AIModel;", "onOpenChat", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "latestModelCallback", "latestOpenChat"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RoomScreenKt {
    static final Unit RoomScreen$lambda$13(Function1 r1, Function0 r2, int r3, Composer r4, int r5) {
        RoomScreen(r1, r2, r4, RecomposeScopeImplKt.updateChangedFlags(r3 | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ Function1 access$RoomScreen$lambda$0(State $latestModelCallback$delegate) {
        return RoomScreen$lambda$0($latestModelCallback$delegate);
    }

    public static final /* synthetic */ Function0 access$RoomScreen$lambda$1(State $latestOpenChat$delegate) {
        return RoomScreen$lambda$1($latestOpenChat$delegate);
    }

    public static final void RoomScreen(final Function1<? super AIModel, Unit> r16, final Function0<Unit> r17, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(r16, "onModelSelected");
        Intrinsics.checkNotNullParameter(r17, "onOpenChat");
        Composer $composer2 = $composer.startRestartGroup(-550145580);
        ComposerKt.sourceInformation($composer2, "C(RoomScreen)44@1485L37,45@1549L32,46@1606L37,50@1723L4727,48@1649L4807,142@6485L181,142@6462L204:RoomScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r16) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18) goto L19;
        boolean r4 = true;
    L21:
        if ($composer2.shouldExecute(r4, $dirty2 & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L47:
        ScopeUpdateScope r3 = $composer2.endRestartGroup();
        if (r3 == null) goto L51;
        r3.updateScope(new RoomScreenKt$$ExternalSyntheticLambda2(r16, r17, $changed));
        return;
    L51:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-550145580, $dirty2, -1, "com.luchime.huiyuan.ui.RoomScreen (RoomScreen.kt:43)");
    L25:
        final State latestModelCallback$delegate = SnapshotStateKt.rememberUpdatedState(r16, $composer2, $dirty2 & 14);
        final State latestOpenChat$delegate = SnapshotStateKt.rememberUpdatedState(r17, $composer2, ($dirty2 >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, -408915399, "CC(remember):RoomScreen.kt#9igjgp");
        Object r9 = $composer2.rememberedValue();
        if (r9 != Composer.Companion.getEmpty()) goto L29;
        Object r14 = new WebView[1];
        $composer2.updateRememberedValue(r14);
        r9 = r14;
    L29:
        final WebView[] webViewHolder = (WebView[]) r9;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r6 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -408906965, "CC(remember):RoomScreen.kt#9igjgp");
        boolean r7 = ($composer2.changedInstance(webViewHolder) | $composer2.changed(latestModelCallback$delegate)) | $composer2.changed(latestOpenChat$delegate);
        Object r10 = $composer2.rememberedValue();
        if (r7 == false) goto L32;
    L35:
        Object r8 = new RoomScreenKt$$ExternalSyntheticLambda0(webViewHolder, latestModelCallback$delegate, latestOpenChat$delegate);
        $composer2.updateRememberedValue(r8);
        r10 = r8;
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidView_androidKt.AndroidView((Function1) r10, r6, null, $composer2, 48, 4);
        Unit r11 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -408759127, "CC(remember):RoomScreen.kt#9igjgp");
        boolean r12 = $composer2.changedInstance(webViewHolder);
        Object r13 = $composer2.rememberedValue();
        if (r12 == false) goto L39;
    L42:
        Object r15 = new RoomScreenKt$$ExternalSyntheticLambda1(webViewHolder);
        $composer2.updateRememberedValue(r15);
        r13 = r15;
    L43:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(r11, (Function1) r13, $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L47;
        ComposerKt.traceEventEnd();
        goto L47
    L39:
        if (r13 != Composer.Companion.getEmpty()) goto L43;
    L32:
        if (r10 != Composer.Companion.getEmpty()) goto L36;
    L19:
        r4 = false;
        goto L21
    L12:
        if ($composer2.changedInstance(r17) == false) goto L14;
        int r18 = 32;
    L15:
        $dirty = $dirty | r18;
        goto L16
    L14:
        r18 = 16;
        goto L15
    }

    private static final Function1<AIModel, Unit> RoomScreen$lambda$0(State<? extends Function1<? super AIModel, Unit>> r4) {
        return (Function1) r4.getValue();
    }

    private static final Function0<Unit> RoomScreen$lambda$1(State<? extends Function0<Unit>> r4) {
        return (Function0) r4.getValue();
    }

    static final WebView RoomScreen$lambda$8$lambda$7(WebView[] $webViewHolder, final State $latestModelCallback$delegate, final State $latestOpenChat$delegate, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final WebViewAssetLoader assetLoader = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context)).build();
        Intrinsics.checkNotNullExpressionValue(assetLoader, "build(...)");
        final WebView r1 = new WebView(context);
        $webViewHolder[0] = r1;
        r1.setBackgroundColor(Color.rgb(20, 24, 31));
        r1.getSettings().setJavaScriptEnabled(true);
        r1.getSettings().setDomStorageEnabled(true);
        r1.getSettings().setAllowFileAccess(false);
        r1.getSettings().setAllowContentAccess(false);
        r1.getSettings().setBuiltInZoomControls(false);
        r1.getSettings().setDisplayZoomControls(false);
        r1.setVerticalScrollBarEnabled(false);
        r1.setHorizontalScrollBarEnabled(false);
        r1.setOverScrollMode(2);
        r1.setOnTouchListener(new RoomScreenKt$$ExternalSyntheticLambda4());
        r1.setWebChromeClient(new WebChromeClient());
        r1.addJavascriptInterface(new RoomBridge(new RoomScreenKt$$ExternalSyntheticLambda5(r1, $latestModelCallback$delegate, $latestOpenChat$delegate)), "RoomBridge");
        r1.setWebViewClient(new RoomScreenKt$RoomScreen$1$1$1$3(assetLoader, $latestModelCallback$delegate, $latestOpenChat$delegate));
        r1.loadUrl("https://appassets.androidplatform.net/assets/room603/index.html");
        return r1;
    }

    static final boolean RoomScreen$lambda$8$lambda$7$lambda$6$lambda$3(View view, MotionEvent event) {
        switch(event.getActionMasked()) {
            case 0: goto L8;
            case 1: goto L5;
            case 2: goto L8;
            case 3: goto L5;
            case 4: goto L11;
            case 5: goto L8;
            default: goto L11;
        };
    L5:
        ViewParent r0 = view.getParent();
        if (r0 == null) goto L11;
        r0.requestDisallowInterceptTouchEvent(false);
        goto L11
    L8:
        ViewParent r1 = view.getParent();
        if (r1 == null) goto L11;
        r1.requestDisallowInterceptTouchEvent(true);
    L11:
        return false;
    }

    static final Unit RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5(WebView $this_apply, final State $latestModelCallback$delegate, final State $latestOpenChat$delegate, final String characterId) {
        Intrinsics.checkNotNullParameter(characterId, "characterId");
        $this_apply.post(new RoomScreenKt$$ExternalSyntheticLambda3(characterId, $latestModelCallback$delegate, $latestOpenChat$delegate));
        return Unit.INSTANCE;
    }

    static final void RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(String $characterId, State $latestModelCallback$delegate, State $latestOpenChat$delegate) {
        String r0 = $characterId.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        switch(r0.hashCode()) {
            case -1234882016: goto L18;
            case -1120212608: goto L14;
            case -988533169: goto L10;
            case 110127177: goto L6;
            default: goto L21;
        };
    L21:
        AIModel model = null;
    L23:
        if (model == null) goto L26;
        RoomScreen$lambda$0($latestModelCallback$delegate).invoke(model);
        RoomScreen$lambda$1($latestOpenChat$delegate).invoke();
        return;
    L26:
        return;
    L6:
        if (r0.equals("tango") == false) goto L21;
        model = AIModel.TANGO;
        goto L23
    L10:
        if (r0.equals("piaoai") == false) goto L21;
        model = AIModel.PIAO;
        goto L23
    L14:
        if (r0.equals("kunkun") == false) goto L21;
        model = AIModel.HUIYUAN;
        goto L23
    L18:
        if (r0.equals("guigui") == false) goto L21;
        model = AIModel.GUIGUI;
        goto L23
    }

    static final DisposableEffectResult RoomScreen$lambda$12$lambda$11(final WebView[] $webViewHolder, DisposableEffectScope $this$DisposableEffect) {
        Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect");
        return new RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1($webViewHolder);
    }
}
