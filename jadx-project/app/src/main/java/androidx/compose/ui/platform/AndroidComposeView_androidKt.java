package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u0015H\u0002\u001a\u001e\u0010\u0019\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010\u001d\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"ONE_FRAME_120_HERTZ_IN_MILLISECONDS", "", "platformTextInputServiceInterceptor", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "getPlatformTextInputServiceInterceptor", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "containsDescendant", "", "Landroid/view/View;", "other", "getContentCaptureSessionCompat", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "preTransform", "", "preTransform-JiSxe2E", "([F[F)V", "preTranslate", "x", "y", "tmpMatrix", "preTranslate-cG2Xzmc", "([FFF[F)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor;

    public static final /* synthetic */ boolean access$containsDescendant(View $receiver, View other) {
        return containsDescendant($receiver, other);
    }

    public static final /* synthetic */ ContentCaptureSessionCompat access$getContentCaptureSessionCompat(View $receiver) {
        return getContentCaptureSessionCompat($receiver);
    }

    /* JADX INFO: renamed from: access$preTransform-JiSxe2E, reason: not valid java name */
    public static final /* synthetic */ void m6094access$preTransformJiSxe2E(float[] $receiver, float[] other) {
        m6097preTransformJiSxe2E($receiver, other);
    }

    /* JADX INFO: renamed from: access$preTranslate-cG2Xzmc, reason: not valid java name */
    public static final /* synthetic */ void m6095access$preTranslatecG2Xzmc(float[] $receiver, float x, float y, float[] tmpMatrix) {
        m6098preTranslatecG2Xzmc($receiver, x, y, tmpMatrix);
    }

    public static final Function1<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final void setPlatformTextInputServiceInterceptor(Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> r0) {
        platformTextInputServiceInterceptor = r0;
    }

    static {
        platformTextInputServiceInterceptor = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.INSTANCE;
    }

    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    private static final void m6097preTransformJiSxe2E(float[] $this$preTransform_u2dJiSxe2E, float[] other) {
        float v00 = m6096dotp89u6pk(other, 0, $this$preTransform_u2dJiSxe2E, 0);
        float v01 = m6096dotp89u6pk(other, 0, $this$preTransform_u2dJiSxe2E, 1);
        float v02 = m6096dotp89u6pk(other, 0, $this$preTransform_u2dJiSxe2E, 2);
        float v03 = m6096dotp89u6pk(other, 0, $this$preTransform_u2dJiSxe2E, 3);
        float v10 = m6096dotp89u6pk(other, 1, $this$preTransform_u2dJiSxe2E, 0);
        float v11 = m6096dotp89u6pk(other, 1, $this$preTransform_u2dJiSxe2E, 1);
        float v12 = m6096dotp89u6pk(other, 1, $this$preTransform_u2dJiSxe2E, 2);
        float v13 = m6096dotp89u6pk(other, 1, $this$preTransform_u2dJiSxe2E, 3);
        float v20 = m6096dotp89u6pk(other, 2, $this$preTransform_u2dJiSxe2E, 0);
        float v21 = m6096dotp89u6pk(other, 2, $this$preTransform_u2dJiSxe2E, 1);
        float v22 = m6096dotp89u6pk(other, 2, $this$preTransform_u2dJiSxe2E, 2);
        float v23 = m6096dotp89u6pk(other, 2, $this$preTransform_u2dJiSxe2E, 3);
        float v30 = m6096dotp89u6pk(other, 3, $this$preTransform_u2dJiSxe2E, 0);
        float v31 = m6096dotp89u6pk(other, 3, $this$preTransform_u2dJiSxe2E, 1);
        float v32 = m6096dotp89u6pk(other, 3, $this$preTransform_u2dJiSxe2E, 2);
        float v33 = m6096dotp89u6pk(other, 3, $this$preTransform_u2dJiSxe2E, 3);
        $this$preTransform_u2dJiSxe2E[(0 * 4) + 0] = v00;
        $this$preTransform_u2dJiSxe2E[(0 * 4) + 1] = v01;
        $this$preTransform_u2dJiSxe2E[(0 * 4) + 2] = v02;
        $this$preTransform_u2dJiSxe2E[(0 * 4) + 3] = v03;
        $this$preTransform_u2dJiSxe2E[(1 * 4) + 0] = v10;
        $this$preTransform_u2dJiSxe2E[(1 * 4) + 1] = v11;
        $this$preTransform_u2dJiSxe2E[(1 * 4) + 2] = v12;
        $this$preTransform_u2dJiSxe2E[(1 * 4) + 3] = v13;
        $this$preTransform_u2dJiSxe2E[(2 * 4) + 0] = v20;
        $this$preTransform_u2dJiSxe2E[(2 * 4) + 1] = v21;
        $this$preTransform_u2dJiSxe2E[(2 * 4) + 2] = v22;
        $this$preTransform_u2dJiSxe2E[(2 * 4) + 3] = v23;
        $this$preTransform_u2dJiSxe2E[(3 * 4) + 0] = v30;
        $this$preTransform_u2dJiSxe2E[(3 * 4) + 1] = v31;
        $this$preTransform_u2dJiSxe2E[(3 * 4) + 2] = v32;
        $this$preTransform_u2dJiSxe2E[(3 * 4) + 3] = v33;
    }

    /* JADX INFO: renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    private static final void m6098preTranslatecG2Xzmc(float[] $this$preTranslate_u2dcG2Xzmc, float x, float y, float[] tmpMatrix) {
        Matrix.m4605resetimpl(tmpMatrix);
        Matrix.m4618translateimpl$default(tmpMatrix, x, y, 0.0f, 4, null);
        m6097preTransformJiSxe2E($this$preTranslate_u2dcG2Xzmc, tmpMatrix);
    }

    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m6096dotp89u6pk(float[] m1, int row, float[] m2, int column) {
        return (((m1[(row * 4) + 0] * m2[(0 * 4) + column]) + (m1[(row * 4) + 1] * m2[(1 * 4) + column])) + (m1[(row * 4) + 2] * m2[(2 * 4) + column])) + (m1[(row * 4) + 3] * m2[(3 * 4) + column]);
    }

    private static final boolean containsDescendant(View $this$containsDescendant, View other) {
        if (Intrinsics.areEqual(other, $this$containsDescendant) == false) goto L5;
        return false;
    L5:
        ViewParent viewParent = other.getParent();
    L6:
        if (viewParent == null) goto L11;
        if (viewParent == $this$containsDescendant) goto L8;
        viewParent = viewParent.getParent();
        goto L6
    L8:
        return true;
    L11:
        return false;
    }

    private static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View $this$getContentCaptureSessionCompat) {
        ViewCompatShims.setImportantForContentCapture($this$getContentCaptureSessionCompat, 1);
        return ViewCompatShims.getContentCaptureSession($this$getContentCaptureSessionCompat);
    }
}
