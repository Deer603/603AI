package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: PointerInputTestUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\n\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0000\u001aD\u0010\u000b\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0016\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aX\u0010\u001a\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u001c\"\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aR\u0010\u001a\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\rj\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001f\u001a(\u0010 \u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u0006H\u0000\u001a(\u0010#\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0014\u0010$\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000*<\b\u0000\u0010%\"\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\r2\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"down", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "id", "", "durationMillis", "x", "", "y", "historicalData", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "invokeOverAllPasses", "", "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverPass", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "pointerEventPasses", "", "invokeOverPasses-hUlJWOE", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "moveBy", "dx", "dy", "moveTo", "up", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerInputTestUtilKt {
    public static /* synthetic */ PointerInputChange down$default(long r7, long r9, float r11, float r12, List r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
        long r2 = 0;
    L7:
        if ((r14 & 4) == 0) goto L9;
        float r4 = 0.0f;
    L11:
        if ((r14 & 8) == 0) goto L13;
        float r5 = 0.0f;
    L15:
        if ((r14 & 16) == 0) goto L17;
        List r6 = null;
    L19:
        return down(r7, r2, r4, r5, r6);
    L17:
        r6 = r13;
        goto L19
    L13:
        r5 = r12;
        goto L15
    L9:
        r4 = r11;
        goto L11
    L5:
        r2 = r9;
        goto L7
    }

    public static final PointerInputChange down(long id, long durationMillis, float x, float y, List<HistoricalChange> r26) {
        long r1 = PointerId.m5569constructorimpl(id);
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        long v1$iv$iv2 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        long v1$iv$iv3 = Float.floatToRawIntBits(x);
        long v2$iv$iv2 = Float.floatToRawIntBits(y);
        PointerInputChange pointerInputChange = new PointerInputChange(r1, durationMillis, v1$iv$iv2, true, 1.0f, durationMillis, Offset.m4117constructorimpl((v1$iv$iv3 << 32) | (4294967295L & v2$iv$iv2)), false, false, 0, 0, 1536, null);
        List<HistoricalChange> r0 = r26;
        if (r0 != null) goto L5;
    L8:
        boolean r2 = true;
    L9:
        if (r2 == false) goto L11;
        return pointerInputChange;
    L11:
        return PointerInputChange.m5578copyOHpmEuE$default(pointerInputChange, 0, 0, 0, false, 0, 0, false, 0, r26, 0, 767, null);
    L5:
        if (r0.isEmpty() == true) goto L8;
        r2 = false;
        goto L9
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange r1, long r2, float r4, float r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r4 = 0.0f;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r5 = 0.0f;
    L9:
        return moveTo(r1, r2, r4, r5);
    }

    public static final PointerInputChange moveTo(PointerInputChange $this$moveTo, long durationMillis, float x, float y) {
        long r1 = $this$moveTo.m5587getIdJ3iCeTQ();
        long r9 = $this$moveTo.getUptimeMillis();
        boolean r13 = $this$moveTo.getPressed();
        long r11 = $this$moveTo.m5589getPositionF1C5BW0();
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        return new PointerInputChange(r1, durationMillis, Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)), true, 1.0f, r9, r11, r13, false, 0, 0, 1536, null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange r1, long r2, float r4, float r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r4 = 0.0f;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r5 = 0.0f;
    L9:
        return moveBy(r1, r2, r4, r5);
    }

    public static final PointerInputChange moveBy(PointerInputChange $this$moveBy, long durationMillis, float dx, float dy) {
        long r1 = $this$moveBy.m5587getIdJ3iCeTQ();
        long r9 = $this$moveBy.getUptimeMillis();
        boolean r13 = $this$moveBy.getPressed();
        long r11 = $this$moveBy.m5589getPositionF1C5BW0();
        long r3 = $this$moveBy.getUptimeMillis() + durationMillis;
        long arg0$iv = $this$moveBy.m5589getPositionF1C5BW0();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv) + dx;
        long arg0$iv2 = $this$moveBy.m5589getPositionF1C5BW0();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        float y$iv = Float.intBitsToFloat(bits$iv$iv$iv2) + dy;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return new PointerInputChange(r1, r3, Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)), true, 1.0f, r9, r11, r13, false, 0, 0, 1536, null);
    }

    public static final PointerInputChange up(PointerInputChange $this$up, long durationMillis) {
        long r1 = $this$up.m5587getIdJ3iCeTQ();
        long r9 = $this$up.getUptimeMillis();
        boolean r13 = $this$up.getPressed();
        long r11 = $this$up.m5589getPositionF1C5BW0();
        return new PointerInputChange(r1, durationMillis, $this$up.m5589getPositionF1C5BW0(), false, 1.0f, r9, r11, r13, false, 0, 0, 1536, null);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m5640invokeOverAllPassesH0pRuoY$default(Function3 r6, PointerEvent r7, long r8, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L5;
        r8 = IntSize.m7139constructorimpl((((long) Integer.MAX_VALUE) << 32) | (((long) Integer.MAX_VALUE) & 4294967295L));
    L5:
        m5639invokeOverAllPassesH0pRuoY(r6, r7, r8);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m5639invokeOverAllPassesH0pRuoY(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> r3, PointerEvent pointerEvent, long size) {
        m5643invokeOverPasseshUlJWOE(r3, pointerEvent, CollectionsKt.listOf(new PointerEventPass[]{PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final}), size);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m5642invokeOverPasshUlJWOE$default(Function3 r6, PointerEvent r7, PointerEventPass r8, long r9, int r11, Object r12) {
        if ((r11 & 4) == 0) goto L5;
        r9 = IntSize.m7139constructorimpl((((long) Integer.MAX_VALUE) << 32) | (((long) Integer.MAX_VALUE) & 4294967295L));
    L5:
        m5641invokeOverPasshUlJWOE(r6, r7, r8, r9);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m5641invokeOverPasshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> r1, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long size) {
        m5643invokeOverPasseshUlJWOE(r1, pointerEvent, CollectionsKt.listOf(pointerEventPass), size);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m5646invokeOverPasseshUlJWOE$default(Function3 r6, PointerEvent r7, PointerEventPass[] r8, long r9, int r11, Object r12) {
        if ((r11 & 4) == 0) goto L5;
        r9 = IntSize.m7139constructorimpl((((long) Integer.MAX_VALUE) << 32) | (((long) Integer.MAX_VALUE) & 4294967295L));
    L5:
        m5644invokeOverPasseshUlJWOE(r6, r7, r8, r9);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m5644invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> r1, PointerEvent pointerEvent, PointerEventPass[] pointerEventPasses, long size) {
        m5643invokeOverPasseshUlJWOE(r1, pointerEvent, ArraysKt.toList(pointerEventPasses), size);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m5645invokeOverPasseshUlJWOE$default(Function3 r6, PointerEvent r7, List r8, long r9, int r11, Object r12) {
        if ((r11 & 4) == 0) goto L5;
        r9 = IntSize.m7139constructorimpl((((long) Integer.MAX_VALUE) << 32) | (((long) Integer.MAX_VALUE) & 4294967295L));
    L5:
        m5643invokeOverPasseshUlJWOE(r6, r7, r8, r9);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m5643invokeOverPasseshUlJWOE(Function3<? super PointerEvent, ? super PointerEventPass, ? super IntSize, Unit> r8, PointerEvent pointerEvent, List<? extends PointerEventPass> r10, long size) {
        if (pointerEvent.getChanges().isEmpty() == true) goto L14;
        if (r10.isEmpty() == true) goto L12;
        int index$iv = 0;
        int r3 = r10.size();
    L7:
        if (index$iv >= r3) goto L10;
        Object item$iv = r10.get(index$iv);
        PointerEventPass it = (PointerEventPass) item$iv;
        r8.invoke(pointerEvent, it, IntSize.m7136boximpl(size));
        index$iv = index$iv + 1;
        goto L7
    L10:
        return;
    L12:
        throw new IllegalArgumentException("invokeOverPasses called with no passes".toString());
    L14:
        throw new IllegalArgumentException("invokeOverPasses called with no changes".toString());
    }
}
