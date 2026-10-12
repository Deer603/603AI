package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: LayerSnapshot.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV22;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "()V", "toBitmap", "Landroid/graphics/Bitmap;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayerSnapshotV22 implements LayerSnapshotImpl {
    public static final LayerSnapshotV22 INSTANCE = null;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1, reason: invalid class name */
    /* JADX INFO: compiled from: LayerSnapshot.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {225}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ LayerSnapshotV22 this$0;

        AnonymousClass1(LayerSnapshotV22 r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.toBitmap(null, this);
        }
    }

    static {
        INSTANCE = new LayerSnapshotV22();
    }

    private LayerSnapshotV22() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, Continuation<? super Bitmap> r20) {
        if ((r20 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r20;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r3 = r0;
        Object $result = r3.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r3.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        AnonymousClass1 r7 = (AnonymousClass1) r3.L$4;
        ImageReader r8 = (ImageReader) r3.L$3;
        ImageReader r9 = (AutoCloseable) r3.L$2;
        Looper r10 = (Looper) r3.L$1;
        GraphicsLayer r11 = (GraphicsLayer) r3.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r2 = $result;
    L29:
        Image image = (Image) r2;     // Catch: Throwable -> L15
        Bitmap r5 = LayerSnapshot_androidKt.access$toBitmap(image);     // Catch: Throwable -> L15
        AutoCloseableKt.closeFinally(r9, null);
        return r5;
    L17:
        ResultKt.throwOnFailure($result);
        long value$iv$iv = graphicsLayer.m5008getSizeYbymL2g();
        Looper looper = Looper.myLooper();
        if (looper != null) goto L20;
        looper = Looper.getMainLooper();
    L20:
        r9 = ImageReader.newInstance((int) (value$iv$iv >> 32), (int) (4294967295L & value$iv$iv), 1, 1);
        ImageReader reader = r9;     // Catch: Throwable -> L15
        r3.L$0 = graphicsLayer;     // Catch: Throwable -> L15
        r3.L$1 = looper;     // Catch: Throwable -> L15
        r3.L$2 = r9;     // Catch: Throwable -> L15
        r3.L$3 = reader;     // Catch: Throwable -> L15
        r3.L$4 = r3;     // Catch: Throwable -> L15
        r3.label = 1;     // Catch: Throwable -> L15
        AnonymousClass1 uCont$iv = r3;     // Catch: Throwable -> L15
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);     // Catch: Throwable -> L15
        cancellable$iv.initCancellability();     // Catch: Throwable -> L15
        final CancellableContinuationImpl continuation = cancellable$iv;     // Catch: Throwable -> L15
        reader.setOnImageAvailableListener(new LayerSnapshotV22$toBitmap$2$image$1$1(continuation), HandlerCompat.createAsync(looper));     // Catch: Throwable -> L15
        Surface surface = reader.getSurface();     // Catch: Throwable -> L15
        Canvas canvas = SurfaceUtils.INSTANCE.lockCanvas(surface);     // Catch: Throwable -> L15
        canvas.drawColor(ColorKt.m4420toArgb8_81llA(Color.Companion.m4392getBlack0d7_KjU()), PorterDuff.Mode.CLEAR);     // Catch: Throwable -> L32
        graphicsLayer.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(canvas), null);     // Catch: Throwable -> L32
        surface.unlockCanvasAndPost(canvas);     // Catch: Throwable -> L15
        r2 = cancellable$iv.getResult();     // Catch: Throwable -> L15
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L26;
        DebugProbesKt.probeCoroutineSuspended(r3);     // Catch: Throwable -> L15
    L26:
        if (r2 != r1) goto L29;
        return r1;
    L32:
        th = move-exception;
        surface.unlockCanvasAndPost(canvas);     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        AutoCloseableKt.closeFinally(r9, th);
        throw th;
    L7:
        r0 = new AnonymousClass1(this, r20);
        goto L8
    }
}
