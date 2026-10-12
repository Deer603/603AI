package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThrottledCallbacks.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001:\u0001RB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u0000H\u0002JH\u0010%\u001a\u00020\n2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J@\u0010*\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010.\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ&\u0010/\u001a\u00020#2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nJ,\u00104\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J:\u00105\u001a\u0002062\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020#0<J:\u0010>\u001a\u0002062\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020#0<J\u0014\u0010?\u001a\u00020@2\n\u0010$\u001a\u00060\u0004R\u00020\u0000H\u0002J\u0010\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\nH\u0002J\u000e\u0010C\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ*\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010\u0019ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ)\u0010J\u001a\u00020#*\u00060\u0004R\u00020\u00002\u0016\u0010K\u001a\u0012\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\bJ/\u0010L\u001a\u00020#*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0016\u0010K\u001a\u0012\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\bJ.\u0010M\u001a\u00060\u0004R\u00020\u0000*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u0010N\u001a\u0002012\n\u0010O\u001a\u00060\u0004R\u00020\u0000H\u0002J*\u0010P\u001a\u00020@*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u0010N\u001a\u0002012\n\u0010O\u001a\u00060\u0004R\u00020\u0000H\u0002J7\u0010Q\u001a\u00020#*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u00100\u001a\u0002012\u0016\u0010K\u001a\u0012\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\bR \u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u0014X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u0014X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "()V", "globalChangeEntries", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "minDebounceDeadline", "", "getMinDebounceDeadline", "()J", "setMinDebounceDeadline", "(J)V", "rectChangedMap", "Landroidx/collection/MutableIntObjectMap;", "getRectChangedMap", "()Landroidx/collection/MutableIntObjectMap;", "screenOffset", "Landroidx/compose/ui/unit/IntOffset;", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "J", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "[F", "windowOffset", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "addToGlobalEntries", "", "entry", "debounceEntry", "currentMillis", "minDeadline", "debounceEntry-b8qMvQI", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "fire", "fire-WY9HvpM", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "fireGlobalChangeEntries", "fireOnRectChangedEntries", "fireOnUpdatedRect", "id", "", "topLeft", "bottomRight", "fireWithUpdatedRect", "registerOnGlobalChange", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "throttleMillis", "debounceMillis", "node", "Landroidx/compose/ui/node/DelegatableNode;", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "registerOnRectChanged", "removeFromGlobalEntries", "", "roundDownToMultipleOf8", "x", "triggerDebounced", "updateOffsets", "screen", "window", "matrix", "updateOffsets-bT0EZQs", "(JJ[F)Z", "linkedForEach", "block", "multiForEach", "multiPut", "key", "value", "multiRemove", "runFor", "Entry", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThrottledCallbacks {
    public static final int $stable = 0;
    private Entry globalChangeEntries;
    private long minDebounceDeadline;
    private final MutableIntObjectMap<Entry> rectChangedMap;
    private long screenOffset;
    private float[] viewToWindowMatrix;
    private long windowOffset;

    /* JADX INFO: compiled from: ThrottledCallbacks.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ:\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/ø\u0001\u0000¢\u0006\u0004\b0\u00101J\b\u00102\u001a\u00020\fH\u0016R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R \u0010\u001e\u001a\b\u0018\u00010\u0000R\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0010R\u001a\u0010'\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "id", "", "throttleMillis", "", "debounceMillis", "node", "Landroidx/compose/ui/node/DelegatableNode;", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V", "bottomRight", "getBottomRight", "()J", "setBottomRight", "(J)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getDebounceMillis", "getId", "()I", "lastInvokeMillis", "getLastInvokeMillis", "setLastInvokeMillis", "lastUninvokedFireMillis", "getLastUninvokedFireMillis", "setLastUninvokedFireMillis", "next", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "getNext", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setNext", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "getThrottleMillis", "topLeft", "getTopLeft", "setTopLeft", "fire", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "fire-9b-9wPM", "(JJJJ[F)V", "unregister", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final Function1<RelativeLayoutBounds, Unit> callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis;
        private long lastUninvokedFireMillis;
        private Entry next;
        private final DelegatableNode node;
        final /* synthetic */ ThrottledCallbacks this$0;
        private final long throttleMillis;
        private long topLeft;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(ThrottledCallbacks this$0, int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> r10) {
            this.this$0 = this$0;
            this.id = id;
            this.throttleMillis = throttleMillis;
            this.debounceMillis = debounceMillis;
            this.node = node;
            this.callback = r10;
            this.lastInvokeMillis = -this.throttleMillis;
            this.lastUninvokedFireMillis = -1;
        }

        public final int getId() {
            return this.id;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final Function1<RelativeLayoutBounds, Unit> getCallback() {
            return this.callback;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final void setNext(Entry r1) {
            this.next = r1;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setTopLeft(long r1) {
            this.topLeft = r1;
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final void setBottomRight(long r1) {
            this.bottomRight = r1;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final void setLastInvokeMillis(long r1) {
            this.lastInvokeMillis = r1;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final void setLastUninvokedFireMillis(long r1) {
            this.lastUninvokedFireMillis = r1;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            boolean result = ThrottledCallbacks.access$multiRemove(this.this$0, this.this$0.getRectChangedMap(), this.id, this);
            if (result == true) goto L6;
            ThrottledCallbacks.access$removeFromGlobalEntries(this.this$0, this);
            return;
        }

        /* JADX INFO: renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m6223fire9b9wPM(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            RelativeLayoutBounds rect = ThrottledCallbacksKt.m6224rectInfoForQMZNJw(this.node, topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix);
            if (rect != null) goto L5;
            return;
        L5:
            this.callback.invoke(rect);
        }
    }

    static {
        $stable = 8;
    }

    public ThrottledCallbacks() {
        this.rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
        this.minDebounceDeadline = -1;
        this.windowOffset = IntOffset.Companion.m7112getZeronOccac();
        this.screenOffset = IntOffset.Companion.m7112getZeronOccac();
    }

    public static final /* synthetic */ boolean access$multiRemove(ThrottledCallbacks $this, MutableIntObjectMap $receiver, int key, Entry value) {
        return $this.multiRemove($receiver, key, value);
    }

    public static final /* synthetic */ boolean access$removeFromGlobalEntries(ThrottledCallbacks $this, Entry entry) {
        return $this.removeFromGlobalEntries(entry);
    }

    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final void setGlobalChangeEntries(Entry r1) {
        this.globalChangeEntries = r1;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final void setMinDebounceDeadline(long r1) {
        this.minDebounceDeadline = r1;
    }

    /* JADX INFO: renamed from: getWindowOffset-nOcc-ac, reason: not valid java name */
    public final long m6218getWindowOffsetnOccac() {
        return this.windowOffset;
    }

    /* JADX INFO: renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m6221setWindowOffsetgyyYBs(long r1) {
        this.windowOffset = r1;
    }

    /* JADX INFO: renamed from: getScreenOffset-nOcc-ac, reason: not valid java name */
    public final long m6216getScreenOffsetnOccac() {
        return this.screenOffset;
    }

    /* JADX INFO: renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m6219setScreenOffsetgyyYBs(long r1) {
        this.screenOffset = r1;
    }

    /* JADX INFO: renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name */
    public final float[] m6217getViewToWindowMatrix3i98HWw() {
        return this.viewToWindowMatrix;
    }

    /* JADX INFO: renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m6220setViewToWindowMatrixQ8lPUPs(float[] r1) {
        this.viewToWindowMatrix = r1;
    }

    /* JADX INFO: renamed from: updateOffsets-bT0EZQs, reason: not valid java name */
    public final boolean m6222updateOffsetsbT0EZQs(long screen, long window, float[] matrix) {
        boolean updated = false;
        if (IntOffset.m7100equalsimpl0(window, this.windowOffset) == true) goto L6;
        this.windowOffset = window;
        updated = true;
    L6:
        if (IntOffset.m7100equalsimpl0(screen, this.screenOffset) == true) goto L8;
        this.screenOffset = screen;
        updated = true;
    L8:
        if (matrix == null) goto L11;
        this.viewToWindowMatrix = matrix;
        return true;
    L11:
        return updated;
    }

    private final long roundDownToMultipleOf8(long x) {
        return (x >> 3) << 3;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> r17) {
        if (debounceMillis != 0) goto L5;
        long debounceToUse = throttleMillis;
    L7:
        return multiPut(this.rectChangedMap, id, new Entry(this, id, throttleMillis, debounceToUse, node, r17));
    L5:
        debounceToUse = debounceMillis;
        goto L7
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> r18) {
        if (debounceMillis != 0) goto L5;
        long r0 = throttleMillis;
    L6:
        long debounceToUse = r0;
        Entry entry = new Entry(this, id, throttleMillis, debounceToUse, node, r18);
        addToGlobalEntries(entry);
        return entry;
    L5:
        r0 = debounceMillis;
        goto L6
    }

    public final void fireOnUpdatedRect(int id, long topLeft, long bottomRight, long currentMillis) {
        Entry entry$iv = this.rectChangedMap.get(id);
    L3:
        if (entry$iv == null) goto L6;
        Entry entry = entry$iv;
        fireWithUpdatedRect(entry, topLeft, bottomRight, currentMillis);
        entry$iv = entry$iv.getNext();
        goto L3
    }

    public final void fireOnRectChangedEntries(long currentMillis) {
        long windowOffset = this.windowOffset;
        long screenOffset = this.screenOffset;
        float[] viewToWindowMatrix = this.viewToWindowMatrix;
        ThrottledCallbacks this_$iv = this;
        MutableIntObjectMap $this$multiForEach$iv = this.rectChangedMap;
        int bitCount$iv$iv$iv = 0;
        MutableIntObjectMap this_$iv$iv = $this$multiForEach$iv;
        Object[] v$iv$iv = this_$iv$iv.values;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L28;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        long[] m$iv$iv$iv2 = m$iv$iv$iv;
        long windowOffset2 = windowOffset;
        long windowOffset3 = ~slot$iv$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = ((windowOffset3 << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L22;
        int r1 = 8;
        int bitCount$iv$iv$iv2 = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv2) goto L19;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r21 = true;
    L12:
        if (r21 == false) goto L18;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Entry it$iv = (Entry) v$iv$iv[index$iv$iv$iv];
        Entry entry$iv = it$iv;
    L14:
        if (entry$iv == null) goto L18;
        int r3 = r1;
        Entry entry = entry$iv;
        int j$iv$iv$iv2 = j$iv$iv$iv;
        int $i$f$multiForEach = bitCount$iv$iv$iv;
        int $i$f$multiForEach2 = bitCount$iv$iv$iv2;
        long windowOffset4 = windowOffset2;
        m6215fireWY9HvpM(entry, windowOffset4, screenOffset, viewToWindowMatrix, currentMillis);
        entry$iv = entry$iv.getNext();
        lastIndex$iv$iv$iv = lastIndex$iv$iv$iv;
        i$iv$iv$iv = i$iv$iv$iv;
        bitCount$iv$iv$iv2 = $i$f$multiForEach2;
        r1 = r3;
        this_$iv = this_$iv;
        $this$multiForEach$iv = $this$multiForEach$iv;
        bitCount$iv$iv$iv = $i$f$multiForEach;
        this_$iv$iv = this_$iv$iv;
        windowOffset2 = windowOffset4;
        j$iv$iv$iv = j$iv$iv$iv2;
    L18:
        int j$iv$iv$iv3 = j$iv$iv$iv;
        int $i$f$multiForEach3 = bitCount$iv$iv$iv;
        IntObjectMap this_$iv$iv2 = this_$iv$iv;
        long windowOffset5 = windowOffset2;
        int $i$f$multiForEach4 = bitCount$iv$iv$iv2;
        int r12 = r1;
        slot$iv$iv$iv = slot$iv$iv$iv >> r12;
        lastIndex$iv$iv$iv = lastIndex$iv$iv$iv;
        i$iv$iv$iv = i$iv$iv$iv;
        r1 = r12;
        this_$iv = this_$iv;
        $this$multiForEach$iv = $this$multiForEach$iv;
        this_$iv$iv = this_$iv$iv2;
        windowOffset2 = windowOffset5;
        j$iv$iv$iv = j$iv$iv$iv3 + 1;
        bitCount$iv$iv$iv2 = $i$f$multiForEach4;
        bitCount$iv$iv$iv = $i$f$multiForEach3;
        goto L7
    L11:
        r21 = false;
        goto L12
    L19:
        int $i$f$multiForEach5 = bitCount$iv$iv$iv;
        IntObjectMap this_$iv$iv3 = this_$iv$iv;
        windowOffset = windowOffset2;
        int $i$f$multiForEach6 = bitCount$iv$iv$iv2;
        ThrottledCallbacks this_$iv2 = this_$iv;
        MutableIntObjectMap $this$multiForEach$iv2 = $this$multiForEach$iv;
        int lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
        int i$iv$iv$iv2 = i$iv$iv$iv;
        if ($i$f$multiForEach6 != r1) goto L34;
    L23:
        if (i$iv$iv$iv2 == lastIndex$iv$iv$iv2) goto L35;
        i$iv$iv$iv = i$iv$iv$iv2 + 1;
        lastIndex$iv$iv$iv = lastIndex$iv$iv$iv2;
        this_$iv = this_$iv2;
        $this$multiForEach$iv = $this$multiForEach$iv2;
        m$iv$iv$iv = m$iv$iv$iv2;
        bitCount$iv$iv$iv = $i$f$multiForEach5;
        this_$iv$iv = this_$iv$iv3;
        goto L4
    L35:
        return;
    L34:
        return;
    L22:
        $i$f$multiForEach5 = bitCount$iv$iv$iv;
        this_$iv$iv3 = this_$iv$iv;
        windowOffset = windowOffset2;
        this_$iv2 = this_$iv;
        $this$multiForEach$iv2 = $this$multiForEach$iv;
        lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
        i$iv$iv$iv2 = i$iv$iv$iv;
        goto L23
    }

    public final void fireGlobalChangeEntries(long currentMillis) {
        ThrottledCallbacks r0 = this;
        long windowOffset = r0.windowOffset;
        long screenOffset = r0.screenOffset;
        float[] viewToWindowMatrix = r0.viewToWindowMatrix;
        Entry r1 = r0.globalChangeEntries;
        if (r1 == null) goto L8;
        Entry node$iv = r1;
    L5:
        if (node$iv == null) goto L10;
        Entry entry = node$iv;
        LayoutNode node = DelegatableNodeKt.requireLayoutNode(entry.getNode());
        long offsetFromRoot = node.m5889getOffsetFromRootnOccac$ui_release();
        long lastSize = node.m5888getLastSizeYbymL2g$ui_release();
        entry.setTopLeft(offsetFromRoot);
        long windowOffset2 = windowOffset;
        long windowOffset3 = lastSize >> 32;
        int x$iv = IntOffset.m7101getXimpl(offsetFromRoot) + ((int) windowOffset3);
        int y$iv = IntOffset.m7102getYimpl(offsetFromRoot) + ((int) (lastSize & 4294967295L));
        long screenOffset2 = screenOffset;
        long screenOffset3 = x$iv;
        entry.setBottomRight((screenOffset3 << 32) | (((long) y$iv) & 4294967295L));
        screenOffset = screenOffset2;
        windowOffset = windowOffset2;
        r0.m6215fireWY9HvpM(entry, windowOffset, screenOffset, viewToWindowMatrix, currentMillis);
        node$iv = node$iv.getNext();
        r0 = this;
        goto L5
    L10:
        return;
    }

    public final void triggerDebounced(long currentMillis) {
        if (this.minDebounceDeadline <= currentMillis) goto L5;
        return;
    L5:
        long windowOffset = this.windowOffset;
        long screenOffset = this.screenOffset;
        float[] viewToWindowMatrix = this.viewToWindowMatrix;
        long minDeadline = Long.MAX_VALUE;
        ThrottledCallbacks this_$iv = this;
        MutableIntObjectMap $this$multiForEach$iv = this.rectChangedMap;
        int bitCount$iv$iv$iv = 0;
        MutableIntObjectMap this_$iv$iv = $this$multiForEach$iv;
        Object[] v$iv$iv = this_$iv$iv.values;
        IntObjectMap this_$iv$iv$iv = this_$iv$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L28;
    L7:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
        int i$iv$iv$iv2 = i$iv$iv$iv;
        long windowOffset2 = windowOffset;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L25;
        int r1 = 8;
        int bitCount$iv$iv$iv2 = 8 - ((~(i$iv$iv$iv2 - lastIndex$iv$iv$iv2)) >>> 31);
        int j$iv$iv$iv = 0;
    L10:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv2) goto L22;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L14;
        boolean r22 = true;
    L15:
        if (r22 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv2 << 3) + j$iv$iv$iv;
        Entry it$iv = (Entry) v$iv$iv[index$iv$iv$iv];
        Entry entry$iv = it$iv;
    L17:
        if (entry$iv == null) goto L19;
        int r3 = r1;
        Entry entry = entry$iv;
        int j$iv$iv$iv2 = j$iv$iv$iv;
        int $i$f$multiForEach = bitCount$iv$iv$iv;
        int $i$f$multiForEach2 = bitCount$iv$iv$iv2;
        long windowOffset3 = windowOffset2;
        minDeadline = m6214debounceEntryb8qMvQI(entry, windowOffset3, screenOffset, viewToWindowMatrix, currentMillis, minDeadline);
        entry$iv = entry$iv.getNext();
        lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv2;
        this_$iv = this_$iv;
        i$iv$iv$iv2 = i$iv$iv$iv2;
        $this$multiForEach$iv = $this$multiForEach$iv;
        bitCount$iv$iv$iv2 = $i$f$multiForEach2;
        r1 = r3;
        this_$iv$iv$iv = this_$iv$iv$iv;
        m$iv$iv$iv = m$iv$iv$iv;
        bitCount$iv$iv$iv = $i$f$multiForEach;
        this_$iv$iv = this_$iv$iv;
        windowOffset2 = windowOffset3;
        j$iv$iv$iv = j$iv$iv$iv2;
        goto L17
    L19:
        int r4 = lastIndex$iv$iv$iv2;
        ThrottledCallbacks this_$iv2 = this_$iv;
        int lastIndex$iv$iv$iv3 = r4;
        int r5 = i$iv$iv$iv2;
        MutableIntObjectMap $this$multiForEach$iv2 = $this$multiForEach$iv;
        int i$iv$iv$iv3 = r5;
        int j$iv$iv$iv3 = j$iv$iv$iv;
        int $i$f$multiForEach3 = bitCount$iv$iv$iv;
        IntObjectMap this_$iv$iv2 = this_$iv$iv;
        long windowOffset4 = windowOffset2;
        int $i$f$multiForEach4 = bitCount$iv$iv$iv2;
        int r14 = r1;
        IntObjectMap this_$iv$iv$iv2 = this_$iv$iv$iv;
        long[] m$iv$iv$iv2 = m$iv$iv$iv;
    L21:
        slot$iv$iv$iv = slot$iv$iv$iv >> r14;
        ThrottledCallbacks r0 = this_$iv2;
        lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv3;
        this_$iv = r0;
        MutableIntObjectMap r2 = $this$multiForEach$iv2;
        i$iv$iv$iv2 = i$iv$iv$iv3;
        $this$multiForEach$iv = r2;
        bitCount$iv$iv$iv2 = $i$f$multiForEach4;
        this_$iv$iv$iv = this_$iv$iv$iv2;
        m$iv$iv$iv = m$iv$iv$iv2;
        bitCount$iv$iv$iv = $i$f$multiForEach3;
        windowOffset2 = windowOffset4;
        j$iv$iv$iv = j$iv$iv$iv3 + 1;
        r1 = r14;
        this_$iv$iv = this_$iv$iv2;
        goto L10
    L20:
        int r6 = lastIndex$iv$iv$iv2;
        this_$iv2 = this_$iv;
        lastIndex$iv$iv$iv3 = r6;
        int r7 = i$iv$iv$iv2;
        $this$multiForEach$iv2 = $this$multiForEach$iv;
        i$iv$iv$iv3 = r7;
        j$iv$iv$iv3 = j$iv$iv$iv;
        $i$f$multiForEach3 = bitCount$iv$iv$iv;
        this_$iv$iv2 = this_$iv$iv;
        windowOffset4 = windowOffset2;
        $i$f$multiForEach4 = bitCount$iv$iv$iv2;
        r14 = r1;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        m$iv$iv$iv2 = m$iv$iv$iv;
        goto L21
    L14:
        r22 = false;
        goto L15
    L22:
        int r8 = lastIndex$iv$iv$iv2;
        ThrottledCallbacks this_$iv3 = this_$iv;
        int lastIndex$iv$iv$iv4 = r8;
        int r9 = i$iv$iv$iv2;
        MutableIntObjectMap $this$multiForEach$iv3 = $this$multiForEach$iv;
        int i$iv$iv$iv4 = r9;
        int $i$f$multiForEach5 = bitCount$iv$iv$iv;
        IntObjectMap this_$iv$iv3 = this_$iv$iv;
        windowOffset = windowOffset2;
        int $i$f$multiForEach6 = bitCount$iv$iv$iv2;
        IntObjectMap this_$iv$iv$iv3 = this_$iv$iv$iv;
        long[] m$iv$iv$iv3 = m$iv$iv$iv;
        ThrottledCallbacks r10 = this;
        if ($i$f$multiForEach6 != r1) goto L30;
    L26:
        if (i$iv$iv$iv4 == lastIndex$iv$iv$iv4) goto L30;
        i$iv$iv$iv = i$iv$iv$iv4 + 1;
        lastIndex$iv$iv$iv = lastIndex$iv$iv$iv4;
        this_$iv$iv$iv = this_$iv$iv$iv3;
        m$iv$iv$iv = m$iv$iv$iv3;
        this_$iv = this_$iv3;
        $this$multiForEach$iv = $this$multiForEach$iv3;
        bitCount$iv$iv$iv = $i$f$multiForEach5;
        this_$iv$iv = this_$iv$iv3;
    L30:
        Entry r11 = r10.globalChangeEntries;
        if (r11 == null) goto L37;
        Entry node$iv = r11;
        long minDeadline2 = minDeadline;
    L33:
        if (node$iv == null) goto L35;
        Entry entry2 = node$iv;
        minDeadline2 = r10.m6214debounceEntryb8qMvQI(entry2, windowOffset, screenOffset, viewToWindowMatrix, currentMillis, minDeadline2);
        node$iv = node$iv.getNext();
        goto L33
    L35:
        minDeadline = minDeadline2;
    L37:
        if (minDeadline != Long.MAX_VALUE) goto L39;
        long r12 = -1;
    L40:
        r10.minDebounceDeadline = r12;
        return;
    L39:
        r12 = minDeadline;
        goto L40
    L25:
        this_$iv3 = this_$iv;
        lastIndex$iv$iv$iv4 = lastIndex$iv$iv$iv2;
        $this$multiForEach$iv3 = $this$multiForEach$iv;
        i$iv$iv$iv4 = i$iv$iv$iv2;
        r10 = this;
        $i$f$multiForEach5 = bitCount$iv$iv$iv;
        this_$iv$iv3 = this_$iv$iv;
        windowOffset = windowOffset2;
        this_$iv$iv$iv3 = this_$iv$iv$iv;
        m$iv$iv$iv3 = m$iv$iv$iv;
        goto L26
    L28:
        r10 = this;
        goto L30
    }

    private final void fireWithUpdatedRect(Entry entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean r3 = true;
        if ((currentMillis - lastInvokeMillis) < throttleMillis) goto L5;
        boolean r2 = true;
    L6:
        boolean pastThrottleDeadline = r2;
        if (debounceMillis != 0) goto L9;
        boolean r4 = true;
    L10:
        boolean zeroDebounce = r4;
        if (throttleMillis != 0) goto L13;
        boolean r5 = true;
    L14:
        boolean zeroThrottle = r5;
        entry.setTopLeft(topLeft);
        entry.setBottomRight(bottomRight);
        if (zeroDebounce == true) goto L17;
        if (zeroThrottle == true) goto L17;
    L20:
        boolean canInvoke = r3;
        if (pastThrottleDeadline == false) goto L24;
        if (canInvoke == false) goto L24;
        entry.setLastUninvokedFireMillis(-1);
        entry.setLastInvokeMillis(currentMillis);
        entry.m6223fire9b9wPM(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        return;
    L24:
        if (zeroDebounce == true) goto L32;
        entry.setLastUninvokedFireMillis(currentMillis);
        long currentMinDeadline = this.minDebounceDeadline;
        long thisDeadline = currentMillis + debounceMillis;
        if (currentMinDeadline > 0) goto L28;
        return;
    L28:
        if (thisDeadline >= currentMinDeadline) goto L34;
        this.minDebounceDeadline = currentMinDeadline;
        return;
    L34:
        return;
    L32:
        return;
    L17:
        if (zeroDebounce == true) goto L20;
        r3 = false;
        goto L20
    L13:
        r5 = false;
        goto L14
    L9:
        r4 = false;
        goto L10
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m6215fireWY9HvpM(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        boolean r3 = true;
        if ((currentMillis - lastInvokeMillis) <= entry.getThrottleMillis()) goto L5;
        boolean r2 = true;
    L6:
        boolean throttleOkay = r2;
        if (entry.getDebounceMillis() == 0) goto L10;
        r3 = false;
    L10:
        boolean debounceOkay = r3;
        entry.setLastUninvokedFireMillis(currentMillis);
        if (throttleOkay == false) goto L14;
        if (debounceOkay == false) goto L14;
        entry.setLastInvokeMillis(currentMillis);
        entry.m6223fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
    L14:
        if (debounceOkay == true) goto L21;
        long currentMinDeadline = this.minDebounceDeadline;
        long thisDeadline = entry.getDebounceMillis() + currentMillis;
        if (currentMinDeadline > 0) goto L18;
        return;
    L18:
        if (thisDeadline >= currentMinDeadline) goto L23;
        this.minDebounceDeadline = currentMinDeadline;
        return;
    L23:
        return;
    L21:
        return;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m6214debounceEntryb8qMvQI(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() > 0) goto L5;
        return minDeadline;
    L5:
        if (entry.getLastUninvokedFireMillis() > 0) goto L7;
        return minDeadline;
    L7:
        if ((currentMillis - entry.getLastUninvokedFireMillis()) <= entry.getDebounceMillis()) goto L9;
        entry.setLastInvokeMillis(currentMillis);
        entry.setLastUninvokedFireMillis(-1);
        long topLeft = entry.getTopLeft();
        long bottomRight = entry.getBottomRight();
        entry.m6223fire9b9wPM(topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    L9:
        long newMinDeadline = Math.min(minDeadline, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        return newMinDeadline;
    }

    private final void addToGlobalEntries(Entry entry) {
        Entry oldInitialEntry = this.globalChangeEntries;
        entry.setNext(oldInitialEntry);
        this.globalChangeEntries = entry;
    }

    private final boolean removeFromGlobalEntries(Entry entry) {
        Entry initialGlobalEntry = this.globalChangeEntries;
        if (initialGlobalEntry != entry) goto L6;
        this.globalChangeEntries = initialGlobalEntry.getNext();
        entry.setNext(null);
        return true;
    L6:
        Entry last = initialGlobalEntry;
        if (last == null) goto L9;
        Entry node = last.getNext();
    L10:
        if (node == null) goto L18;
        if (node == entry) goto L12;
        last = node;
        node = node.getNext();
        goto L10
    L12:
        if (last == null) goto L15;
        last.setNext(node.getNext());
    L15:
        entry.setNext(null);
        return true;
    L18:
        return false;
    L9:
        node = null;
        goto L10
    }

    private final void linkedForEach(Entry $this$linkedForEach, Function1<? super Entry, Unit> r4) {
        Entry node = $this$linkedForEach;
    L3:
        if (node == null) goto L5;
        r4.invoke(node);
        node = node.getNext();
        goto L3
    }

    private final void multiForEach(MutableIntObjectMap<Entry> r22, Function1<? super Entry, Unit> r23) {
        int $i$f$multiForEach = 0;
        MutableIntObjectMap<Entry> this_$iv = r22;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Entry it = (Entry) v$iv[index$iv$iv];
        Entry entry = it;
    L14:
        if (entry == null) goto L16;
        r23.invoke(entry);
        entry = entry.getNext();
        $i$f$multiForEach = $i$f$multiForEach;
        goto L14
    L16:
        int $i$f$multiForEach2 = $i$f$multiForEach;
    L18:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        $i$f$multiForEach = $i$f$multiForEach2;
        r12 = r12;
        goto L7
    L17:
        $i$f$multiForEach2 = $i$f$multiForEach;
        goto L18
    L11:
        r17 = false;
        goto L12
    L19:
        int $i$f$multiForEach3 = $i$f$multiForEach;
        if (bitCount$iv$iv != r12) goto L35;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L36;
        i$iv$iv = i$iv$iv + 1;
        $i$f$multiForEach = $i$f$multiForEach3;
        goto L4
    L36:
        return;
    L35:
        return;
    L22:
        $i$f$multiForEach3 = $i$f$multiForEach;
        goto L23
    }

    private final void runFor(MutableIntObjectMap<Entry> r3, int id, Function1<? super Entry, Unit> r5) {
        Entry entry = r3.get(id);
    L3:
        if (entry == null) goto L5;
        r5.invoke(entry);
        entry = entry.getNext();
        goto L3
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> r5, int key, Entry value) {
        Entry r2 = r5.get(key);
        if (r2 != null) goto L5;
        r2 = value;
        r5.set(key, r2);
    L5:
        Entry entry = r2;
        if (entry != value) goto L8;
    L11:
        return value;
    L8:
        if (entry.getNext() == null) goto L10;
        Entry r1 = entry.getNext();
        Intrinsics.checkNotNull(r1);
        entry = r1;
        goto L8
    L10:
        entry.setNext(value);
        goto L11
    }

    private final boolean multiRemove(MutableIntObjectMap<Entry> r7, int key, Entry value) {
        Entry result = r7.remove(key);
        if (result != null) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(result, value) == false) goto L11;
        Entry next = value.getNext();
        value.setNext(null);
        if (next == null) goto L24;
        r7.put(key, next);
    L24:
        return true;
    L11:
        r7.put(key, result);
        Entry entry = result;
    L12:
        if (entry == null) goto L20;
        Entry next2 = entry.getNext();
        if (next2 == null) goto L15;
        if (next2 == value) goto L17;
        entry = entry.getNext();
        goto L12
    L17:
        entry.setNext(value.getNext());
        value.setNext(null);
        goto L20
    L15:
        return false;
    L20:
        return true;
    }
}
