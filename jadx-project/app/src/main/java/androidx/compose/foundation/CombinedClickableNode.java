package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/Bu\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\b\u0010\u001e\u001a\u00020\u0005H\u0014J\u001a\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0014ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0014ø\u0001\u0000¢\u0006\u0004\b%\u0010#J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0002Jv\u0010(\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\b)J\f\u0010*\u001a\u00020\u0005*\u00020+H\u0016J\u0012\u0010,\u001a\u00020\u0005*\u00020-H\u0096@¢\u0006\u0002\u0010.R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "onClick", "Lkotlin/Function0;", "", "onLongClickLabel", "", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "onClickLabel", "role", "Landroidx/compose/ui/semantics/Role;", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "doubleKeyClickStates", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "getHapticFeedbackEnabled", "()Z", "setHapticFeedbackEnabled", "(Z)V", "longKeyPressJobs", "Lkotlinx/coroutines/Job;", "onCancelKeyInput", "onClickKeyDownEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyUpEvent", "onClickKeyUpEvent-ZmokQxo", "onReset", "resetKeyPressState", "update", "update-nSzSaCc", "applyAdditionalSemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "clickPointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DoubleKeyClickState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    private final MutableLongObjectMap<DoubleKeyClickState> doubleKeyClickStates;
    private boolean hapticFeedbackEnabled;
    private final MutableLongObjectMap<Job> longKeyPressJobs;
    private Function0<Unit> onDoubleClick;
    private Function0<Unit> onLongClick;
    private String onLongClickLabel;

    /* JADX INFO: compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode$DoubleKeyClickState;", "", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "doubleTapMinTimeMillisElapsed", "", "getDoubleTapMinTimeMillisElapsed", "()Z", "setDoubleTapMinTimeMillisElapsed", "(Z)V", "getJob", "()Lkotlinx/coroutines/Job;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoubleKeyClickState {
        public static final int $stable = 0;
        private boolean doubleTapMinTimeMillisElapsed;
        private final Job job;

        static {
            $stable = 8;
        }

        public DoubleKeyClickState(Job job) {
            this.job = job;
        }

        public final Job getJob() {
            return this.job;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean r1) {
            this.doubleTapMinTimeMillisElapsed = r1;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4, reason: invalid class name */
    /* JADX INFO: compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", i = {}, l = {770}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CombinedClickableNode this$0;

        AnonymousClass4(CombinedClickableNode r2, Continuation<? super AnonymousClass4> r3) {
            this.this$0 = r2;
            super(3, r3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope r5, Offset r6, Continuation<? super Unit> r7) {
            return m286invoked4ec7I(r5, r6.m4135unboximpl(), r7);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m286invoked4ec7I(PressGestureScope r3, long r4, Continuation<? super Unit> r6) {
            AnonymousClass4 r0 = new AnonymousClass4(this.this$0, r6);
            r0.L$0 = r3;
            r0.J$0 = r4;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L14:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            PressGestureScope $this$detectTapGestures = (PressGestureScope) this.L$0;
            long offset = this.J$0;
            if (this.this$0.getEnabled() == false) goto L14;
            this.label = 1;
            if (this.this$0.m200handlePressInteractiond4ec7I($this$detectTapGestures, offset, this) != r0) goto L14;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ CombinedClickableNode(Function0 r1, String r2, Function0 r3, Function0 r4, boolean r5, MutableInteractionSource r6, IndicationNodeFactory r7, boolean r8, String r9, Role r10, DefaultConstructorMarker r11) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    }

    public static final /* synthetic */ MutableLongObjectMap access$getDoubleKeyClickStates$p(CombinedClickableNode $this) {
        return $this.doubleKeyClickStates;
    }

    public static final /* synthetic */ Function0 access$getOnDoubleClick$p(CombinedClickableNode $this) {
        return $this.onDoubleClick;
    }

    public static final /* synthetic */ Function0 access$getOnLongClick$p(CombinedClickableNode $this) {
        return $this.onLongClick;
    }

    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    public final void setHapticFeedbackEnabled(boolean r1) {
        this.hapticFeedbackEnabled = r1;
    }

    private CombinedClickableNode(Function0<Unit> r9, String onLongClickLabel, Function0<Unit> r11, Function0<Unit> r12, boolean hapticFeedbackEnabled, MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role) {
        super(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, r9, null);
        this.onLongClickLabel = onLongClickLabel;
        this.onLongClick = r11;
        this.onDoubleClick = r12;
        this.hapticFeedbackEnabled = hapticFeedbackEnabled;
        this.longKeyPressJobs = LongObjectMapKt.mutableLongObjectMapOf();
        this.doubleKeyClickStates = LongObjectMapKt.mutableLongObjectMapOf();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public Object clickPointerInput(PointerInputScope $this$clickPointerInput, Continuation<? super Unit> r10) {
        if (getEnabled() == true) goto L5;
    L7:
        Function1<Offset, Unit> r3 = null;
    L9:
        if (getEnabled() == true) goto L11;
    L13:
        Function1<Offset, Unit> r4 = null;
    L14:
        Object r9 = TapGestureDetectorKt.detectTapGestures($this$clickPointerInput, r3, r4, new AnonymousClass4(this, null), new AnonymousClass5(this), r10);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L18;
        return r9;
    L18:
        return Unit.INSTANCE;
    L11:
        if (this.onLongClick == null) goto L13;
        r4 = new AnonymousClass3(this);
        goto L14
    L5:
        if (this.onDoubleClick == null) goto L7;
        r3 = new AnonymousClass2(this);
        goto L9
    }

    /* JADX INFO: renamed from: update-nSzSaCc, reason: not valid java name */
    public final void m283updatenSzSaCc(Function0<Unit> r9, String onLongClickLabel, Function0<Unit> r11, Function0<Unit> r12, MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean enabled, String onClickLabel, Role role) {
        boolean resetPointerInputHandling = false;
        if (Intrinsics.areEqual(this.onLongClickLabel, onLongClickLabel) == true) goto L5;
        this.onLongClickLabel = onLongClickLabel;
        SemanticsModifierNodeKt.invalidateSemantics(this);
    L5:
        boolean r2 = true;
        if (this.onLongClick != null) goto L8;
        boolean r1 = true;
    L9:
        if (r11 != null) goto L11;
        boolean r4 = true;
    L12:
        if (r1 == r4) goto L14;
        disposeInteractions();
        SemanticsModifierNodeKt.invalidateSemantics(this);
        resetPointerInputHandling = true;
    L14:
        this.onLongClick = r11;
        if (this.onDoubleClick != null) goto L17;
        boolean r3 = true;
    L18:
        if (r12 == null) goto L21;
        r2 = false;
    L21:
        if (r3 == r2) goto L23;
        resetPointerInputHandling = true;
    L23:
        this.onDoubleClick = r12;
        if (getEnabled() == enabled) goto L26;
        resetPointerInputHandling = true;
    L26:
        m206updateCommonQzZPfjk(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, r9);
        if (resetPointerInputHandling == false) goto L30;
        resetPointerInputHandler();
        return;
    L30:
        return;
    L17:
        r3 = false;
        goto L18
    L11:
        r4 = false;
        goto L12
    L8:
        r1 = false;
        goto L9
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver $this$applyAdditionalSemantics) {
        if (this.onLongClick == null) goto L6;
        SemanticsPropertiesKt.onLongClick($this$applyAdditionalSemantics, this.onLongClickLabel, new AnonymousClass1(this));
        return;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: onClickKeyDownEvent-ZmokQxo */
    protected boolean mo201onClickKeyDownEventZmokQxo(KeyEvent event) {
        long keyCode = KeyEvent_androidKt.m5445getKeyZmokQxo(event);
        boolean handledByLongClick = false;
        if (this.onLongClick != null) goto L5;
    L7:
        DoubleKeyClickState doubleClickState = this.doubleKeyClickStates.get(keyCode);
        if (doubleClickState != null) goto L10;
    L15:
        return handledByLongClick;
    L10:
        if (doubleClickState.getJob().isActive() == false) goto L14;
        Job.DefaultImpls.cancel$default(doubleClickState.getJob(), null, 1, null);
        if (doubleClickState.getDoubleTapMinTimeMillisElapsed() == true) goto L15;
        getOnClick().invoke();
        this.doubleKeyClickStates.remove(keyCode);
        goto L15
    L14:
        this.doubleKeyClickStates.remove(keyCode);
        goto L15
    L5:
        if (this.longKeyPressJobs.get(keyCode) != null) goto L7;
        this.longKeyPressJobs.set(keyCode, BuildersKt.launch$default(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, null));
        handledByLongClick = true;
        goto L7
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: onClickKeyUpEvent-ZmokQxo */
    protected boolean mo202onClickKeyUpEventZmokQxo(KeyEvent event) {
        long keyCode = KeyEvent_androidKt.m5445getKeyZmokQxo(event);
        boolean longClickInvoked = false;
        if (this.longKeyPressJobs.get(keyCode) == null) goto L13;
        Job it = this.longKeyPressJobs.get(keyCode);
        if (it != null) goto L7;
    L11:
        this.longKeyPressJobs.remove(keyCode);
        goto L13
    L7:
        if (it.isActive() == false) goto L9;
        Job.DefaultImpls.cancel$default(it, null, 1, null);
        goto L11
    L9:
        longClickInvoked = true;
    L13:
        if (this.onDoubleClick != null) goto L15;
        if (longClickInvoked == true) goto L25;
        getOnClick().invoke();
    L25:
        return true;
    L15:
        if (this.doubleKeyClickStates.get(keyCode) != null) goto L18;
        if (longClickInvoked == true) goto L25;
        this.doubleKeyClickStates.set(keyCode, new DoubleKeyClickState(BuildersKt.launch$default(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, keyCode, null), 3, null)));
        goto L25
    L18:
        if (longClickInvoked == true) goto L22;
        Function0<Unit> r3 = this.onDoubleClick;
        if (r3 == null) goto L22;
        r3.invoke();
    L22:
        this.doubleKeyClickStates.remove(keyCode);
        goto L25
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    protected void onCancelKeyInput() {
        resetKeyPressState();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        resetKeyPressState();
    }

    private final void resetKeyPressState() {
        MutableLongObjectMap<Job> r1 = this.longKeyPressJobs;
        int r2 = 0;
        MutableLongObjectMap<Job> this_$iv = r1;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L22;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long r26 = 255;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Job it = (Job) v$iv[index$iv$iv];
        Job.DefaultImpls.cancel$default(it, null, 1, null);
    L15:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        r2 = r2;
        goto L7
    L11:
        r14 = false;
        goto L12
    L16:
        MutableLongObjectMap<Job> r29 = r1;
        int r30 = r2;
        if (bitCount$iv$iv != 8) goto L24;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L24;
        i$iv$iv = i$iv$iv + 1;
        r1 = r29;
        r2 = r30;
    L24:
        r29.clear();
        MutableLongObjectMap<DoubleKeyClickState> r3 = this.doubleKeyClickStates;
        int r4 = 0;
        MutableLongObjectMap<DoubleKeyClickState> this_$iv2 = r3;
        Object[] v$iv2 = this_$iv2.values;
        long[] m$iv$iv2 = this_$iv2.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L44;
    L26:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        MutableLongObjectMap<DoubleKeyClickState> r21 = r3;
        if (((((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L41;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L29:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L38;
        long value$iv$iv$iv2 = slot$iv$iv2 & r26;
        if (value$iv$iv$iv2 >= 128) goto L33;
        boolean r13 = true;
    L34:
        if (r13 == false) goto L37;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        DoubleKeyClickState it2 = (DoubleKeyClickState) v$iv2[index$iv$iv2];
        Job.DefaultImpls.cancel$default(it2.getJob(), null, 1, null);
    L37:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv2 = j$iv$iv2 + 1;
        this_$iv2 = this_$iv2;
        r4 = r4;
        goto L29
    L33:
        r13 = false;
        goto L34
    L38:
        int r210 = r4;
        LongObjectMap this_$iv3 = this_$iv2;
        if (bitCount$iv$iv2 != 8) goto L46;
    L42:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L46;
        i$iv$iv2 = i$iv$iv2 + 1;
        r3 = r21;
        this_$iv2 = this_$iv3;
        r4 = r210;
    L46:
        r21.clear();
        return;
    L41:
        r210 = r4;
        this_$iv3 = this_$iv2;
        goto L42
    L44:
        r21 = r3;
        goto L46
    L19:
        r29 = r1;
        r30 = r2;
        goto L20
    L22:
        r29 = r1;
        r26 = 255;
        goto L24
    }
}
