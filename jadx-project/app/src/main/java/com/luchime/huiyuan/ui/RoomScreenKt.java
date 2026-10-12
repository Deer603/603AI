package com.luchime.huiyuan.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoomScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\u0016\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u008a\u0084\u0002²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u008a\u0084\u0002"}, d2 = {"RoomScreen", "", "onModelSelected", "Lkotlin/Function1;", "Lcom/luchime/huiyuan/ui/AIModel;", "onOpenChat", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "latestModelCallback", "latestOpenChat"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RoomScreenKt {
    static final Unit RoomScreen$lambda$13(Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        RoomScreen(function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RoomScreen(final Function1<? super AIModel, Unit> onModelSelected, final Function0<Unit> onOpenChat, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(onModelSelected, "onModelSelected");
        Intrinsics.checkNotNullParameter(onOpenChat, "onOpenChat");
        Composer $composer2 = $composer.startRestartGroup(-550145580);
        ComposerKt.sourceInformation($composer2, "C(RoomScreen)44@1485L37,45@1549L32,46@1606L37,50@1723L4727,48@1649L4807,142@6485L181,142@6462L204:RoomScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onModelSelected) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onOpenChat) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-550145580, $dirty2, -1, "com.luchime.huiyuan.ui.RoomScreen (RoomScreen.kt:43)");
            }
            final State latestModelCallback$delegate = SnapshotStateKt.rememberUpdatedState(onModelSelected, $composer2, $dirty2 & 14);
            final State latestOpenChat$delegate = SnapshotStateKt.rememberUpdatedState(onOpenChat, $composer2, ($dirty2 >> 3) & 14);
            ComposerKt.sourceInformationMarkerStart($composer2, -408915399, "CC(remember):RoomScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new WebView[1];
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            final WebView[] webViewHolder = (WebView[]) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -408906965, "CC(remember):RoomScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(webViewHolder) | $composer2.changed(latestModelCallback$delegate) | $composer2.changed(latestOpenChat$delegate);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return RoomScreenKt.RoomScreen$lambda$8$lambda$7(webViewHolder, latestModelCallback$delegate, latestOpenChat$delegate, (Context) obj3);
                    }
                };
                $composer2.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifierFillMaxSize$default, null, $composer2, 48, 4);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -408759127, "CC(remember):RoomScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer2.changedInstance(webViewHolder);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return RoomScreenKt.RoomScreen$lambda$12$lambda$11(webViewHolder, (DisposableEffectScope) obj4);
                    }
                };
                $composer2.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, $composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return RoomScreenKt.RoomScreen$lambda$13(onModelSelected, onOpenChat, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<AIModel, Unit> RoomScreen$lambda$0(State<? extends Function1<? super AIModel, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> RoomScreen$lambda$1(State<? extends Function0<Unit>> state) {
        return (Function0) state.getValue();
    }

    static final WebView RoomScreen$lambda$8$lambda$7(WebView[] $webViewHolder, final State $latestModelCallback$delegate, final State $latestOpenChat$delegate, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final WebViewAssetLoader assetLoader = new WebViewAssetLoader.Builder().addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context)).build();
        Intrinsics.checkNotNullExpressionValue(assetLoader, "build(...)");
        final WebView webView = new WebView(context);
        $webViewHolder[0] = webView;
        webView.setBackgroundColor(Color.rgb(20, 24, 31));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setOverScrollMode(2);
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return RoomScreenKt.RoomScreen$lambda$8$lambda$7$lambda$6$lambda$3(view, motionEvent);
            }
        });
        webView.setWebChromeClient(new WebChromeClient());
        webView.addJavascriptInterface(new RoomBridge(new Function1() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomScreenKt.RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5(webView, $latestModelCallback$delegate, $latestOpenChat$delegate, (String) obj);
            }
        }), "RoomBridge");
        webView.setWebViewClient(new WebViewClient() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$RoomScreen$1$1$1$3
            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                return shouldInterceptRequest(request.getUrl());
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                String lastPathSegment = request.getUrl().getLastPathSegment();
                if (lastPathSegment != null) {
                    switch (lastPathSegment.hashCode()) {
                        case -1130087625:
                            if (lastPathSegment.equals("piaoai_index.html")) {
                                RoomScreenKt.RoomScreen$lambda$0($latestModelCallback$delegate).invoke(AIModel.PIAO);
                                RoomScreenKt.RoomScreen$lambda$1($latestOpenChat$delegate).invoke();
                                return true;
                            }
                            break;
                        case -609527098:
                            if (lastPathSegment.equals("guigui_index.html")) {
                                RoomScreenKt.RoomScreen$lambda$0($latestModelCallback$delegate).invoke(AIModel.GUIGUI);
                                RoomScreenKt.RoomScreen$lambda$1($latestOpenChat$delegate).invoke();
                                return true;
                            }
                            break;
                        case 116777213:
                            if (lastPathSegment.equals("tango_index.html")) {
                                RoomScreenKt.RoomScreen$lambda$0($latestModelCallback$delegate).invoke(AIModel.TANGO);
                                RoomScreenKt.RoomScreen$lambda$1($latestOpenChat$delegate).invoke();
                                return true;
                            }
                            break;
                        case 701549383:
                            if (lastPathSegment.equals("index.html")) {
                                RoomScreenKt.RoomScreen$lambda$0($latestModelCallback$delegate).invoke(AIModel.HUIYUAN);
                                RoomScreenKt.RoomScreen$lambda$1($latestOpenChat$delegate).invoke();
                                return true;
                            }
                            break;
                    }
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                view.evaluateJavascript("var touchStyle = document.createElement('style');\ntouchStyle.textContent =\n  'html,body,#canvas-container,canvas{touch-action:none!important;overscroll-behavior:none!important;user-select:none!important;}';\ndocument.head.appendChild(touchStyle);", null);
            }
        });
        webView.loadUrl("https://appassets.androidplatform.net/assets/room603/index.html");
        return webView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static final boolean RoomScreen$lambda$8$lambda$7$lambda$6$lambda$3(View view, MotionEvent event) {
        switch (event.getActionMasked()) {
            case 0:
            case 2:
            case 5:
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            case 1:
            case 3:
                ViewParent parent2 = view.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                return false;
            case 4:
            default:
                return false;
        }
    }

    static final Unit RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5(WebView $this_apply, final State $latestModelCallback$delegate, final State $latestOpenChat$delegate, final String characterId) {
        Intrinsics.checkNotNullParameter(characterId, "characterId");
        $this_apply.post(new Runnable() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RoomScreenKt.RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(characterId, $latestModelCallback$delegate, $latestOpenChat$delegate);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    static final void RoomScreen$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4(String $characterId, State $latestModelCallback$delegate, State $latestOpenChat$delegate) {
        AIModel model;
        String lowerCase = $characterId.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase) {
            case "guigui":
                model = AIModel.GUIGUI;
                break;
            case "kunkun":
                model = AIModel.HUIYUAN;
                break;
            case "piaoai":
                model = AIModel.PIAO;
                break;
            case "tango":
                model = AIModel.TANGO;
                break;
            default:
                model = null;
                break;
        }
        if (model != null) {
            RoomScreen$lambda$0($latestModelCallback$delegate).invoke(model);
            RoomScreen$lambda$1($latestOpenChat$delegate).invoke();
        }
    }

    static final DisposableEffectResult RoomScreen$lambda$12$lambda$11(final WebView[] $webViewHolder, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.luchime.huiyuan.ui.RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                WebView webView = $webViewHolder[0];
                if (webView != null) {
                    webView.stopLoading();
                    webView.destroy();
                }
                $webViewHolder[0] = null;
            }
        };
    }
}
