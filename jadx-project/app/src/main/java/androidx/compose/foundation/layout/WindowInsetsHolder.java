package androidx.compose.foundation.layout;

import android.view.View;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010=\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\bJ\u000e\u0010C\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0003J\u000e\u0010D\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010-\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\fR\u0011\u0010/\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0010R\u0011\u00101\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR\u0011\u00103\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0010R\u0011\u00105\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\fR\u0011\u00107\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\fR\u0011\u00109\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0010R\u0011\u0010;\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0010¨\u0006F"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "view", "Landroid/view/View;", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "accessCount", "", "captionBar", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBarIgnoringVisibility", "Landroidx/compose/foundation/layout/ValueInsets;", "getCaptionBarIgnoringVisibility", "()Landroidx/compose/foundation/layout/ValueInsets;", "consumes", "", "getConsumes", "()Z", "displayCutout", "getDisplayCutout", "ime", "getIme", "imeAnimationSource", "getImeAnimationSource", "imeAnimationTarget", "getImeAnimationTarget", "insetsListener", "Landroidx/compose/foundation/layout/InsetsListener;", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "safeContent", "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeContent", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "getSafeDrawing", "safeGestures", "getSafeGestures", "statusBars", "getStatusBars", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "systemBars", "getSystemBars", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility", "waterfall", "getWaterfall", "decrementAccessors", "", "incrementAccessors", "update", "windowInsets", "types", "updateImeAnimationSource", "updateImeAnimationTarget", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WindowInsetsHolder {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static boolean testInsets;
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = null;
    private int accessCount;
    private final AndroidWindowInsets captionBar;
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final AndroidWindowInsets displayCutout;
    private final AndroidWindowInsets ime;
    private final ValueInsets imeAnimationSource;
    private final ValueInsets imeAnimationTarget;
    private final InsetsListener insetsListener;
    private final AndroidWindowInsets mandatorySystemGestures;
    private final AndroidWindowInsets navigationBars;
    private final ValueInsets navigationBarsIgnoringVisibility;
    private final WindowInsets safeContent;
    private final WindowInsets safeDrawing;
    private final WindowInsets safeGestures;
    private final AndroidWindowInsets statusBars;
    private final ValueInsets statusBarsIgnoringVisibility;
    private final AndroidWindowInsets systemBars;
    private final ValueInsets systemBarsIgnoringVisibility;
    private final AndroidWindowInsets systemGestures;
    private final AndroidWindowInsets tappableElement;
    private final ValueInsets tappableElementIgnoringVisibility;
    private final ValueInsets waterfall;

    /* JADX INFO: compiled from: WindowInsets.android.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "()V", "testInsets", "", "viewMap", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getOrCreateFor", "view", "setUseTestInsets", "", "systemInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", HintConstants.AUTOFILL_HINT_NAME, "", "valueInsetsIgnoringVisibility", "Landroidx/compose/foundation/layout/ValueInsets;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ AndroidWindowInsets access$systemInsets(Companion $this, WindowInsetsCompat windowInsets, int type, String name) {
            return $this.systemInsets(windowInsets, type, name);
        }

        public static final /* synthetic */ ValueInsets access$valueInsetsIgnoringVisibility(Companion $this, WindowInsetsCompat windowInsets, int type, String name) {
            return $this.valueInsetsIgnoringVisibility(windowInsets, type, name);
        }

        public final void setUseTestInsets(boolean testInsets) {
            WindowInsetsHolder.access$setTestInsets$cp(testInsets);
        }

        public final WindowInsetsHolder current(Composer $composer, int $changed) {
            ComposerKt.sourceInformationMarkerStart($composer, -1366542614, "C(current)579@22913L7,582@23005L125,582@22980L150:WindowInsets.android.kt#2w3rfo");
            if (ComposerKt.isTraceInProgress() == false) goto L5;
            ComposerKt.traceEventStart(-1366542614, $changed, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:578)");
        L5:
            ProvidableCompositionLocal<View> r0 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object r3 = $composer.consume(r0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            final View view = (View) r3;
            final WindowInsetsHolder insets = getOrCreateFor(view);
            ComposerKt.sourceInformationMarkerStart($composer, 334589666, "CC(remember):WindowInsets.android.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance(insets) | $composer.changedInstance(view);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv == false) goto L8;
        L11:
            Object value$iv = (Function1) new WindowInsetsHolder$Companion$current$1$1(insets, view);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        L12:
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.DisposableEffect(insets, (Function1) it$iv, $composer, 0);
            if (ComposerKt.isTraceInProgress() == false) goto L15;
            ComposerKt.traceEventEnd();
        L15:
            ComposerKt.sourceInformationMarkerEnd($composer);
            return insets;
        L8:
            if (it$iv != Composer.Companion.getEmpty()) goto L12;
            goto L11
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WeakHashMap r0 = WindowInsetsHolder.access$getViewMap$cp();
            monitor-enter(r0);
            Map $this$getOrPut$iv = WindowInsetsHolder.access$getViewMap$cp();     // Catch: Throwable -> L12
            Object value$iv = $this$getOrPut$iv.get(view);     // Catch: Throwable -> L12
            if (value$iv != null) goto L8;
            Object answer$iv = new WindowInsetsHolder(null, view, null);     // Catch: Throwable -> L12
            $this$getOrPut$iv.put(view, answer$iv);     // Catch: Throwable -> L12
        L9:
            WindowInsetsHolder r7 = (WindowInsetsHolder) answer$iv;     // Catch: Throwable -> L12
            monitor-exit(r0);
            return r7;
        L8:
            answer$iv = value$iv;
        L12:
            th = move-exception;
            throw th;
        }

        private final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsets, int type, String name) {
            AndroidWindowInsets $this$systemInsets_u24lambda_u244 = new AndroidWindowInsets(type, name);
            if (windowInsets == null) goto L5;
            $this$systemInsets_u24lambda_u244.update$foundation_layout_release(windowInsets, type);
        L5:
            return $this$systemInsets_u24lambda_u244;
        }

        private final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsets, int type, String name) {
            if (windowInsets == null) goto L5;
            Insets initial = windowInsets.getInsetsIgnoringVisibility(type);
            if (initial == null) goto L5;
        L7:
            return WindowInsets_androidKt.ValueInsets(initial, name);
        L5:
            initial = Insets.NONE;
            goto L7
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat r1, View r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private WindowInsetsHolder(WindowInsetsCompat insets, View view) {
        this.captionBar = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.captionBar(), "captionBar");
        this.displayCutout = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.ime = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.ime(), "ime");
        this.mandatorySystemGestures = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.navigationBars = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.statusBars(), "statusBars");
        this.systemBars = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemGestures = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.tappableElement = Companion.access$systemInsets(Companion, insets, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        if (insets == null) goto L8;
        DisplayCutoutCompat r0 = insets.getDisplayCutout();
        if (r0 == null) goto L8;
        Insets r1 = r0.getWaterfallInsets();
        if (r1 == null) goto L8;
    L9:
        this.waterfall = WindowInsets_androidKt.ValueInsets(r1, "waterfall");
        this.safeDrawing = WindowInsetsKt.union(WindowInsetsKt.union(this.systemBars, this.ime), this.displayCutout);
        this.safeGestures = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(this.tappableElement, this.mandatorySystemGestures), this.systemGestures), this.waterfall);
        this.safeContent = WindowInsetsKt.union(this.safeDrawing, this.safeGestures);
        this.captionBarIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(Companion, insets, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(Companion, insets, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(Companion, insets, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(Companion, insets, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(Companion, insets, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = Companion.access$valueInsetsIgnoringVisibility(Companion, insets, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = Companion.access$valueInsetsIgnoringVisibility(Companion, insets, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        Object r2 = view.getParent();
        Boolean r3 = null;
        if ((r2 instanceof View) == false) goto L12;
        View r4 = (View) r2;
    L13:
        if (r4 == null) goto L15;
        Object r5 = r4.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
    L17:
        if ((r5 instanceof Boolean) == false) goto L19;
        r3 = (Boolean) r5;
    L19:
        if (r3 == null) goto L21;
        boolean r6 = r3.booleanValue();
    L22:
        this.consumes = r6;
        this.insetsListener = new InsetsListener(this);
        return;
    L21:
        r6 = true;
        goto L22
    L15:
        r5 = null;
        goto L17
    L12:
        r4 = null;
    L8:
        r1 = Insets.NONE;
        goto L9
    }

    public static final /* synthetic */ WeakHashMap access$getViewMap$cp() {
        return viewMap;
    }

    public static final /* synthetic */ void access$setTestInsets$cp(boolean r0) {
        testInsets = r0;
    }

    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final void incrementAccessors(View view) {
        if (this.accessCount != 0) goto L8;
        ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
        if (view.isAttachedToWindow() == false) goto L7;
        view.requestApplyInsets();
    L7:
        view.addOnAttachStateChangeListener(this.insetsListener);
        ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
    L8:
        this.accessCount++;
    }

    public final void decrementAccessors(View view) {
        this.accessCount--;
        if (this.accessCount != 0) goto L6;
        ViewCompat.setOnApplyWindowInsetsListener(view, null);
        ViewCompat.setWindowInsetsAnimationCallback(view, null);
        view.removeOnAttachStateChangeListener(this.insetsListener);
        return;
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder r0, WindowInsetsCompat r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        r0.update(r1, r2);
    }

    public final void update(WindowInsetsCompat windowInsets, int types) {
        if (testInsets == false) goto L5;
        android.view.WindowInsets r0 = windowInsets.toWindowInsets();
        Intrinsics.checkNotNull(r0);
        WindowInsetsCompat insets = WindowInsetsCompat.toWindowInsetsCompat(r0);
    L6:
        this.captionBar.update$foundation_layout_release(insets, types);
        this.ime.update$foundation_layout_release(insets, types);
        this.displayCutout.update$foundation_layout_release(insets, types);
        this.navigationBars.update$foundation_layout_release(insets, types);
        this.statusBars.update$foundation_layout_release(insets, types);
        this.systemBars.update$foundation_layout_release(insets, types);
        this.systemGestures.update$foundation_layout_release(insets, types);
        this.tappableElement.update$foundation_layout_release(insets, types);
        this.mandatorySystemGestures.update$foundation_layout_release(insets, types);
        if (types != 0) goto L11;
        this.captionBarIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar())));
        this.navigationBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars())));
        this.statusBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars())));
        this.systemBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars())));
        this.tappableElementIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement())));
        DisplayCutoutCompat cutout = insets.getDisplayCutout();
        if (cutout == null) goto L11;
        Insets waterfallInsets = cutout.getWaterfallInsets();
        this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(waterfallInsets));
    L11:
        Snapshot.Companion.sendApplyNotifications();
        return;
    L5:
        insets = windowInsets;
        goto L6
    }

    public final void updateImeAnimationSource(WindowInsetsCompat windowInsets) {
        this.imeAnimationSource.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsets.getInsets(WindowInsetsCompat.Type.ime())));
    }

    public final void updateImeAnimationTarget(WindowInsetsCompat windowInsets) {
        this.imeAnimationTarget.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsets.getInsets(WindowInsetsCompat.Type.ime())));
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        viewMap = new WeakHashMap();
    }
}
