package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.unit.IntRect;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ComposeViewAdapter.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0004\u000b\u000e\u0011\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010Q\u001a\u00020(2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)H\u0003¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020(2\u0006\u0010T\u001a\u00020UH\u0014J\r\u0010V\u001a\u00020(H\u0000¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020(H\u0002J\b\u0010Y\u001a\u00020(H\u0002J\u0006\u0010:\u001a\u00020.J\u0010\u0010Z\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u009d\u0001\u0010Z\u001a\u00020(2\u0006\u0010[\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u00172\u0016\b\u0002\u0010]\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030_\u0018\u00010^2\b\b\u0002\u0010`\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010a\u001a\u00020b2\b\b\u0002\u00109\u001a\u00020.2\b\b\u0002\u0010;\u001a\u00020.2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u00020(0'2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020(0'H\u0001¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020(H\u0002J\b\u0010f\u001a\u00020(H\u0014J0\u0010g\u001a\u00020(2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020\b2\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020\b2\u0006\u0010l\u001a\u00020\bH\u0014J\b\u0010m\u001a\u00020(H\u0002J\u000e\u0010n\u001a\u0004\u0018\u00010o*\u00020pH\u0002J\u0016\u0010q\u001a\u0004\u0018\u00010\u0017*\u00020K2\u0006\u0010r\u001a\u00020sH\u0002J\f\u0010t\u001a\u00020.*\u00020KH\u0002J\f\u0010u\u001a\u00020.*\u00020KH\u0002J\u001e\u0010v\u001a\u0004\u0018\u00010\u0017*\u00020p2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bH\u0002J\f\u0010y\u001a\u00020.*\u00020KH\u0002J\f\u0010z\u001a\u00020G*\u00020KH\u0002R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00198\u0000@\u0000X\u0081.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010%\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)0&X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u001bR\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R \u00102\u001a\b\u0012\u0004\u0012\u00020\u001703X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010=\u001a\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010>R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u00020.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010F\u001a\b\u0012\u0004\u0012\u00020G03X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00105\"\u0004\bI\u00107R\u0018\u0010J\u001a\u00020\u0017*\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u00020\b*\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006{"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "FakeActivityResultRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1;", "FakeOnBackPressedDispatcherOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1;", "FakeSavedStateRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1;", "FakeViewModelStoreOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1;", "TAG", "", "clock", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling_release$annotations", "()V", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "composableName", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "composition", "Landroidx/compose/runtime/Composition;", "content", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent$annotations", "debugBoundsPaint", "Landroid/graphics/Paint;", "debugPaintBounds", "", "debugViewInfos", "delayedException", "Landroidx/compose/ui/tooling/ThreadSafeException;", "designInfoList", "", "getDesignInfoList$ui_tooling_release", "()Ljava/util/List;", "setDesignInfoList$ui_tooling_release", "(Ljava/util/List;)V", "designInfoProvidersArgument", "forceCompositionInvalidation", "hasAnimations", "lookForDesignInfoProviders", "onDraw", "previewComposition", "Lkotlin/jvm/functions/Function2;", "slotTableRecord", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "stitchTrees", "getStitchTrees$ui_tooling_release", "()Z", "setStitchTrees$ui_tooling_release", "(Z)V", "viewInfos", "Landroidx/compose/ui/tooling/ViewInfo;", "getViewInfos$ui_tooling_release", "setViewInfos$ui_tooling_release", "fileName", "Landroidx/compose/ui/tooling/data/Group;", "getFileName", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "lineNumber", "getLineNumber", "(Landroidx/compose/ui/tooling/data/Group;)I", "WrapPreview", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispose", "dispose$ui_tooling_release", "findAndTrackAnimations", "findDesignInfoProviders", "init", "className", "methodName", "parameterProvider", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProviderIndex", "animationClockStartTime", "", "onCommit", "init$ui_tooling_release", "invalidateComposition", "onAttachedToWindow", "onLayout", "changed", "left", "top", "right", "bottom", "processViewInfos", "getDesignInfoMethodOrNull", "Ljava/lang/reflect/Method;", "", "getDesignInfoOrNull", "box", "Landroidx/compose/ui/unit/IntRect;", "hasDesignInfo", "hasNullSourcePosition", "invokeGetDesignInfo", "x", "y", "isNullGroup", "toViewInfo", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 0;
    private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;
    private final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;
    private final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;
    private final ComposeViewAdapter$FakeViewModelStoreOwner$1 FakeViewModelStoreOwner;
    private final String TAG;
    public PreviewAnimationClock clock;
    private String composableName;
    private final ComposeView composeView;
    private Composition composition;
    private final MutableState<Function2<Composer, Integer, Unit>> content;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    private final ThreadSafeException delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean forceCompositionInvalidation;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private Function0<Unit> onDraw;
    private Function2<? super Composer, ? super Integer, Unit> previewComposition;
    private final CompositionDataRecord slotTableRecord;
    private boolean stitchTrees;
    private List<ViewInfo> viewInfos;

    /* JADX INFO: renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ComposeViewAdapter.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C06632 extends FunctionReferenceImpl implements Function0<Unit> {
        C06632(Object r8) {
            super(0, r8, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ComposeViewAdapter) this.receiver).requestLayout();
        }
    }

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    public static final /* synthetic */ void access$WrapPreview(ComposeViewAdapter $this, Function2 content, Composer $composer, int $changed) {
        $this.WrapPreview(content, $composer, $changed);
    }

    public static final /* synthetic */ ThreadSafeException access$getDelayedException$p(ComposeViewAdapter $this) {
        return $this.delayedException;
    }

    public static final /* synthetic */ ComposeViewAdapter$FakeSavedStateRegistryOwner$1 access$getFakeSavedStateRegistryOwner$p(ComposeViewAdapter $this) {
        return $this.FakeSavedStateRegistryOwner;
    }

    public static final /* synthetic */ CompositionDataRecord access$getSlotTableRecord$p(ComposeViewAdapter $this) {
        return $this.slotTableRecord;
    }

    public static final /* synthetic */ boolean access$hasDesignInfo(ComposeViewAdapter $this, Group $receiver) {
        return $this.hasDesignInfo($receiver);
    }

    public final List<ViewInfo> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    public final void setViewInfos$ui_tooling_release(List<ViewInfo> r1) {
        this.viewInfos = r1;
    }

    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    public final void setDesignInfoList$ui_tooling_release(List<String> r1) {
        this.designInfoList = r1;
    }

    public final boolean getStitchTrees$ui_tooling_release() {
        return this.stitchTrees;
    }

    public final void setStitchTrees$ui_tooling_release(boolean r1) {
        this.stitchTrees = r1;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m6892getLambda2$ui_tooling_release();
        this.content = SnapshotStateKt.mutableStateOf$default(ComposeViewAdapter_androidKt.access$getEmptyContent$p(), null, 2, null);
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint $this$debugBoundsPaint_u24lambda_u240 = new Paint();
        $this$debugBoundsPaint_u24lambda_u240.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        $this$debugBoundsPaint_u24lambda_u240.setStyle(Paint.Style.STROKE);
        $this$debugBoundsPaint_u24lambda_u240.setColor(ColorKt.m4420toArgb8_81llA(Color.Companion.m4400getRed0d7_KjU()));
        this.debugBoundsPaint = $this$debugBoundsPaint_u24lambda_u240;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1(this);
        this.FakeActivityResultRegistryOwner = new ComposeViewAdapter$FakeActivityResultRegistryOwner$1();
        init(attrs);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m6892getLambda2$ui_tooling_release();
        this.content = SnapshotStateKt.mutableStateOf$default(ComposeViewAdapter_androidKt.access$getEmptyContent$p(), null, 2, null);
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint $this$debugBoundsPaint_u24lambda_u240 = new Paint();
        $this$debugBoundsPaint_u24lambda_u240.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        $this$debugBoundsPaint_u24lambda_u240.setStyle(Paint.Style.STROKE);
        $this$debugBoundsPaint_u24lambda_u240.setColor(ColorKt.m4420toArgb8_81llA(Color.Companion.m4400getRed0d7_KjU()));
        this.debugBoundsPaint = $this$debugBoundsPaint_u24lambda_u240;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1(this);
        this.FakeActivityResultRegistryOwner = new ComposeViewAdapter$FakeActivityResultRegistryOwner$1();
        init(attrs);
    }

    private final String getFileName(Group $this$fileName) {
        SourceLocation r0 = $this$fileName.getLocation();
        if (r0 == null) goto L6;
        String r1 = r0.getSourceFile();
        if (r1 == null) goto L6;
        return r1;
    L6:
        return "";
    }

    private final int getLineNumber(Group $this$lineNumber) {
        SourceLocation r0 = $this$lineNumber.getLocation();
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getLineNumber();
    }

    private final boolean hasNullSourcePosition(Group $this$hasNullSourcePosition) {
        if (getFileName($this$hasNullSourcePosition).length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        if (getLineNumber($this$hasNullSourcePosition) != (-1)) goto L11;
        return true;
    L11:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    private final boolean isNullGroup(Group $this$isNullGroup) {
        if (hasNullSourcePosition($this$isNullGroup) == true) goto L5;
    L18:
        return false;
    L5:
        if ($this$isNullGroup.getChildren().isEmpty() == false) goto L18;
        LayoutInfo r1 = null;
        if (($this$isNullGroup instanceof NodeGroup) == false) goto L9;
        NodeGroup r0 = (NodeGroup) $this$isNullGroup;
    L10:
        if (r0 == null) goto L12;
        Object r2 = r0.getNode();
    L14:
        if ((r2 instanceof LayoutInfo) == false) goto L16;
        r1 = (LayoutInfo) r2;
    L16:
        if (r1 != null) goto L18;
        return true;
    L12:
        r2 = null;
        goto L14
    L9:
        r0 = null;
        goto L10
    }

    private final ViewInfo toViewInfo(Group $this$toViewInfo) {
        LayoutInfo r1 = null;
        if (($this$toViewInfo instanceof NodeGroup) == false) goto L5;
        NodeGroup r0 = (NodeGroup) $this$toViewInfo;
    L6:
        if (r0 == null) goto L8;
        Object r2 = r0.getNode();
    L10:
        if ((r2 instanceof LayoutInfo) == false) goto L12;
        r1 = (LayoutInfo) r2;
    L12:
        LayoutInfo layoutInfo = r1;
        if ($this$toViewInfo.getChildren().size() == 1) goto L15;
    L19:
        Iterable $this$filter$iv = $this$toViewInfo.getChildren();
        Collection destination$iv$iv = new ArrayList();
        Iterator r5 = $this$filter$iv.iterator();
    L21:
        if (r5.hasNext() == false) goto L25;
        Object element$iv$iv = r5.next();
        Group it = (Group) element$iv$iv;
        if (isNullGroup(it) == true) goto L21;
        destination$iv$iv.add(element$iv$iv);
        goto L21
    L25:
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r6 = $this$map$iv.iterator();
    L27:
        if (r6.hasNext() == false) goto L29;
        Object item$iv$iv = r6.next();
        Group it2 = (Group) item$iv$iv;
        destination$iv$iv2.add(toViewInfo(it2));
        goto L27
    L29:
        List childrenViewInfo = (List) destination$iv$iv2;
        SourceLocation r3 = $this$toViewInfo.getLocation();
        if (r3 == null) goto L33;
        String r4 = r3.getSourceFile();
        if (r4 == null) goto L33;
    L34:
        String r7 = r4;
        SourceLocation r8 = $this$toViewInfo.getLocation();
        if (r8 == null) goto L37;
        int r9 = r8.getLineNumber();
    L39:
        return new ViewInfo(r7, r9, $this$toViewInfo.getBox(), $this$toViewInfo.getLocation(), childrenViewInfo, layoutInfo);
    L37:
        r9 = -1;
    L33:
        r4 = "";
        goto L34
    L15:
        if (hasNullSourcePosition($this$toViewInfo) == false) goto L19;
        if (layoutInfo != null) goto L19;
        return toViewInfo((Group) CollectionsKt.single($this$toViewInfo.getChildren()));
    L8:
        r2 = null;
        goto L10
    L5:
        r0 = null;
        goto L6
    }

    private final void processViewInfos() {
        Iterable $this$map$iv = this.slotTableRecord.getStore();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r5 = $this$map$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        Object item$iv$iv = r5.next();
        CompositionData it = (CompositionData) item$iv$iv;
        destination$iv$iv.add(toViewInfo(SlotTreeKt.asTree(it)));
        goto L4
    L6:
        List<ViewInfo> r0 = CollectionsKt.toList((List) destination$iv$iv);
        if (this.stitchTrees == false) goto L9;
        List<ViewInfo> r1 = ShadowViewInfo_androidKt.stitchTrees(r0);
    L10:
        this.viewInfos = r1;
        if (this.debugViewInfos == false) goto L15;
        String debugString = ViewInfoUtil_androidKt.toDebugString$default(this.viewInfos, 0, null, 3, null);
        Log.d(this.TAG, debugString);
        return;
    L15:
        return;
    L9:
        r1 = r0;
        goto L10
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.delayedException.throwIfPresent();
        processViewInfos();
        if (this.composableName.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        findAndTrackAnimations();
        if (this.lookForDesignInfoProviders == false) goto L12;
        findDesignInfoProviders();
        return;
    L12:
        return;
    L11:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeLifecycleOwner.set(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    private final void findAndTrackAnimations() {
        Iterable $this$map$iv = this.slotTableRecord.getStore();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r5 = $this$map$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        Object item$iv$iv = r5.next();
        destination$iv$iv.add(SlotTreeKt.asTree((CompositionData) item$iv$iv));
        goto L4
    L6:
        List slotTrees = (List) destination$iv$iv;
        if (this.clock == null) goto L9;
        boolean isAnimationPreview = true;
    L10:
        AnimationSearch it = new AnimationSearch(new C06621(this), new C06632(this));
        this.hasAnimations = it.searchAny(slotTrees);
        if (isAnimationPreview == true) goto L13;
        return;
    L13:
        if (this.hasAnimations == false) goto L19;
        it.attachAllAnimations(slotTrees);
        return;
    L19:
        return;
    L9:
        isAnimationPreview = false;
        goto L10
    }

    private final void findDesignInfoProviders() {
        Iterable $this$map$iv = this.slotTableRecord.getStore();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r6 = $this$map$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        Object item$iv$iv = r6.next();
        CompositionData it = (CompositionData) item$iv$iv;
        destination$iv$iv.add(SlotTreeKt.asTree(it));
        goto L4
    L6:
        Iterable slotTrees = (List) destination$iv$iv;
        Iterable $this$flatMap$iv = slotTrees;
        int $i$f$flatMap = 0;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r7 = $this$flatMap$iv.iterator();
    L8:
        if (r7.hasNext() == false) goto L28;
        Object element$iv$iv = r7.next();
        Group rootGroup = (Group) element$iv$iv;
        Iterable $this$mapNotNull$iv = PreviewUtils_androidKt.findAll(rootGroup, new ComposeViewAdapter$findDesignInfoProviders$1$1(this));
        Collection destination$iv$iv3 = new ArrayList();
        Iterator r18 = $this$mapNotNull$iv.iterator();
    L11:
        if (r18.hasNext() == false) goto L27;
        Object element$iv$iv$iv = r18.next();
        Iterable $this$flatMap$iv2 = $this$flatMap$iv;
        Group group = (Group) element$iv$iv$iv;
        int $i$f$flatMap2 = $i$f$flatMap;
        String r2 = getDesignInfoOrNull(group, group.getBox());
        if (r2 != null) goto L24;
        Iterator r3 = group.getChildren().iterator();
    L16:
        if (r3.hasNext() == false) goto L21;
        Group group2 = group;
        Group it2 = (Group) r3.next();
        Iterator r27 = r3;
        r2 = getDesignInfoOrNull(it2, group2.getBox());
        if (r2 != null) goto L24;
        group = group2;
        r3 = r27;
        goto L16
    L21:
        r2 = null;
    L24:
        if (r2 == null) goto L26;
        destination$iv$iv3.add(r2);
    L26:
        $this$flatMap$iv = $this$flatMap$iv2;
        $i$f$flatMap = $i$f$flatMap2;
        goto L11
    L27:
        Iterable $this$flatMap$iv3 = $this$flatMap$iv;
        Iterable list$iv$iv = (List) destination$iv$iv3;
        CollectionsKt.addAll(destination$iv$iv2, list$iv$iv);
        $this$flatMap$iv = $this$flatMap$iv3;
        goto L8
    L28:
        this.designInfoList = (List) destination$iv$iv2;
    }

    private final boolean hasDesignInfo(Group $this$hasDesignInfo) {
        Iterable $this$any$iv = $this$hasDesignInfo.getData();
        if (($this$any$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator r2 = $this$any$iv.iterator();
    L9:
        if (r2.hasNext() == false) goto L28;
        Object element$iv = r2.next();
        if (element$iv == null) goto L13;
        Method r7 = getDesignInfoMethodOrNull(element$iv);
    L15:
        if (r7 == null) goto L17;
        boolean r5 = true;
    L18:
        if (r5 == false) goto L9;
        return true;
    L17:
        r5 = false;
        goto L18
    L13:
        r7 = null;
        goto L15
    L28:
        return false;
    L5:
        if (((Collection) $this$any$iv).isEmpty() == false) goto L7;
        return false;
    }

    private final String getDesignInfoOrNull(Group $this$getDesignInfoOrNull, IntRect box) {
        Iterator<T> r0 = $this$getDesignInfoOrNull.getData().iterator();
    L3:
        String r2 = null;
        if (r0.hasNext() == false) goto L9;
        Object it = r0.next();
        if (it == null) goto L8;
        r2 = invokeGetDesignInfo(it, box.getLeft(), box.getRight());
    L8:
        if (r2 == null) goto L3;
    L9:
        return r2;
    }

    private final Method getDesignInfoMethodOrNull(Object $this$getDesignInfoMethodOrNull) {
        return $this$getDesignInfoMethodOrNull.getClass().getDeclaredMethod("getDesignInfo", new Class[]{Integer.TYPE, Integer.TYPE, String.class});
    L6:
        return null;
    }

    private final String invokeGetDesignInfo(Object $this$invokeGetDesignInfo, int x, int y) {
        Method designInfoMethod = getDesignInfoMethodOrNull($this$invokeGetDesignInfo);
        if (designInfoMethod != null) goto L16;
        return null;
    L16:
        Object result = designInfoMethod.invoke($this$invokeGetDesignInfo, new Object[]{Integer.valueOf(x), Integer.valueOf(y), this.designInfoProvidersArgument});     // Catch: Exception -> L13
        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type kotlin.String");     // Catch: Exception -> L13
        String r4 = (String) result;     // Catch: Exception -> L13
        if (r4.length() != 0) goto L8;
        boolean r5 = true;
    L9:
        if (r5 == false) goto L11;
        r4 = null;
    L11:
        return r4;
    L8:
        r5 = false;
    L18:
        return null;
    }

    private final void invalidateComposition() {
        this.content.setValue(ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m6893getLambda3$ui_tooling_release());
        this.content.setValue((Function2<Composer, Integer, Unit>) this.previewComposition);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.forceCompositionInvalidation == false) goto L5;
        invalidateComposition();
    L5:
        this.onDraw.invoke();
        if (this.debugPaintBounds == true) goto L8;
        return;
    L8:
        Iterable $this$flatMap$iv = this.viewInfos;
        Collection destination$iv$iv = new ArrayList();
        Iterator r5 = $this$flatMap$iv.iterator();
    L10:
        if (r5.hasNext() == false) goto L12;
        Object element$iv$iv = r5.next();
        ViewInfo it = (ViewInfo) element$iv$iv;
        Iterable list$iv$iv = CollectionsKt.plus(CollectionsKt.listOf(it), it.allChildren());
        CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        goto L10
    L12:
        Iterable $this$forEach$iv = (List) destination$iv$iv;
        Iterator r1 = $this$forEach$iv.iterator();
    L14:
        if (r1.hasNext() == false) goto L20;
        Object element$iv = r1.next();
        ViewInfo it2 = (ViewInfo) element$iv;
        if (it2.hasBounds() == false) goto L14;
        Rect pxBounds = new Rect(it2.getBounds().getLeft(), it2.getBounds().getTop(), it2.getBounds().getRight(), it2.getBounds().getBottom());
        canvas.drawRect(pxBounds, this.debugBoundsPaint);
        goto L14
    }

    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock r0 = this.clock;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("clock");
        return null;
    }

    public final void setClock$ui_tooling_release(PreviewAnimationClock r1) {
        this.clock = r1;
    }

    private final void WrapPreview(final Function2<? super Composer, ? super Integer, Unit> r9, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(522143116);
        ComposerKt.sourceInformation($composer2, "C(WrapPreview)412@16400L61,407@16033L428:ComposeViewAdapter.android.kt#hevd2p");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r9) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(this) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r4 = true;
    L21:
        if ($composer2.shouldExecute(r4, $dirty & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L29:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L33;
        r0.updateScope(new AnonymousClass2(this, r9, $changed));
        return;
    L33:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(522143116, $dirty, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:402)");
    L25:
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{CompositionLocalsKt.getLocalFontLoader().provides(new LayoutlibFontResourceLoader(getContext())), CompositionLocalsKt.getLocalFontFamilyResolver().provides(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext())), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(this.FakeOnBackPressedDispatcherOwner), LocalActivityResultRegistryOwner.INSTANCE.provides(this.FakeActivityResultRegistryOwner)}, ComposableLambdaKt.rememberComposableLambda(-1475548980, true, new AnonymousClass1(this, r9), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L19:
        r4 = false;
        goto L21
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$ui_tooling_release$default(ComposeViewAdapter r17, String r18, String r19, Class r20, int r21, boolean r22, boolean r23, long r24, boolean r26, boolean r27, String r28, Function0 r29, Function0 r30, int r31, Object r32) {
        if ((r31 & 4) == 0) goto L5;
        Class r6 = null;
    L7:
        if ((r31 & 8) == 0) goto L9;
        int r7 = 0;
    L11:
        if ((r31 & 16) == 0) goto L13;
        boolean r8 = false;
    L15:
        if ((r31 & 32) == 0) goto L17;
        boolean r9 = false;
    L19:
        if ((r31 & 64) == 0) goto L21;
        long r10 = -1;
    L23:
        if ((r31 & 128) == 0) goto L25;
        boolean r12 = false;
    L27:
        if ((r31 & 256) == 0) goto L29;
        boolean r13 = false;
    L31:
        if ((r31 & 512) == 0) goto L33;
        String r14 = null;
    L35:
        if ((r31 & 1024) == 0) goto L37;
        Function0 r15 = C06641.INSTANCE;
    L39:
        if ((r31 & 2048) == 0) goto L41;
        Function0 r16 = C06652.INSTANCE;
    L42:
        r17.init$ui_tooling_release(r18, r19, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16);
        return;
    L41:
        r16 = r30;
        goto L42
    L37:
        r15 = r29;
        goto L39
    L33:
        r14 = r28;
        goto L35
    L29:
        r13 = r27;
        goto L31
    L25:
        r12 = r26;
        goto L27
    L21:
        r10 = r24;
        goto L23
    L17:
        r9 = r23;
        goto L19
    L13:
        r8 = r22;
        goto L15
    L9:
        r7 = r21;
        goto L11
    L5:
        r6 = r20;
        goto L7
    }

    public final void init$ui_tooling_release(final String className, final String methodName, final Class<? extends PreviewParameterProvider<?>> r17, final int parameterProviderIndex, boolean debugPaintBounds, boolean debugViewInfos, final long animationClockStartTime, boolean forceCompositionInvalidation, boolean lookForDesignInfoProviders, String designInfoProvidersArgument, final Function0<Unit> r26, Function0<Unit> r27) {
        this.debugPaintBounds = debugPaintBounds;
        this.debugViewInfos = debugViewInfos;
        this.composableName = methodName;
        this.forceCompositionInvalidation = forceCompositionInvalidation;
        this.lookForDesignInfoProviders = lookForDesignInfoProviders;
        if (designInfoProvidersArgument != null) goto L5;
        String r2 = "";
    L6:
        this.designInfoProvidersArgument = r2;
        this.onDraw = r27;
        this.previewComposition = ComposableLambdaKt.composableLambdaInstance(-2046245106, true, new AnonymousClass3(r26, this, className, methodName, r17, parameterProviderIndex, animationClockStartTime));
        this.composeView.setContent(this.previewComposition);
        invalidate();
        return;
    L5:
        r2 = designInfoProvidersArgument;
        goto L6
    }

    public final void dispose$ui_tooling_release() {
        this.composeView.disposeComposition();
        if (this.clock == null) goto L5;
        getClock$ui_tooling_release().dispose();
    L5:
        this.FakeSavedStateRegistryOwner.getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        this.FakeViewModelStoreOwner.getViewModelStore().clear();
    }

    public final boolean hasAnimations() {
        return this.hasAnimations;
    }

    private final void init(AttributeSet attrs) {
        ViewTreeLifecycleOwner.set(this, this.FakeSavedStateRegistryOwner);
        ViewTreeSavedStateRegistryOwner.set(this, this.FakeSavedStateRegistryOwner);
        ViewTreeViewModelStoreOwner.set(this, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String composableName = attrs.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (composableName != null) goto L5;
        return;
    L5:
        Class<? extends PreviewParameterProvider<?>> r5 = null;
        String className = StringsKt.substringBeforeLast$default(composableName, '.', null, 2, null);
        String methodName = StringsKt.substringAfterLast$default(composableName, '.', null, 2, null);
        int parameterProviderIndex = attrs.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String r0 = attrs.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        if (r0 == null) goto L15;
        r5 = PreviewUtils_androidKt.asPreviewProviderClass(r0);
    L15:
        long animationClockStartTime = Long.parseLong(attrs.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));     // Catch: Exception -> L11
    L13:
        boolean forceCompositionInvalidation = attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false);
        boolean r8 = attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds);
        boolean r12 = attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos);
        boolean r13 = attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders);
        String methodName2 = attrs.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument");
        Class<? extends PreviewParameterProvider<?>> r4 = r5;
        init$ui_tooling_release$default(this, className, methodName, r4, parameterProviderIndex, r8, r12, animationClockStartTime, forceCompositionInvalidation, r13, methodName2, null, null, 3072, null);
        return;
    L12:
        animationClockStartTime = -1;
        goto L13
    }
}
