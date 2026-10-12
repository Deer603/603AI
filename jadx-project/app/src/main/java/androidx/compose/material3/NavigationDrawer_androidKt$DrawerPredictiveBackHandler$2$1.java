package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: NavigationDrawer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u008a@"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_PROGRESS, "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.android.kt", i = {}, l = {LockFreeTaskQueueCore.FROZEN_SHIFT, 86, 86, 86}, m = "invokeSuspend", n = {}, s = {})
final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements Function2<Flow<BackEventCompat>, Continuation<? super Unit>, Object> {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref.FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref.FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref.FloatRef $maxScaleYDistance;
    final /* synthetic */ CoroutineScope $scope;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: NavigationDrawer.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.android.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
        int label;

        AnonymousClass2(DrawerPredictiveBackState r2, Continuation<? super AnonymousClass2> r3) {
            this.$drawerPredictiveBackState = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass2(this.$drawerPredictiveBackState, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            AnonymousClass2 r1 = this;
            ResultKt.throwOnFailure($result);
        L11:
            r1.$drawerPredictiveBackState.clear();
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            float r3 = this.$drawerPredictiveBackState.getScaleXDistance();
            final DrawerPredictiveBackState r4 = this.$drawerPredictiveBackState;
            this.label = 1;
            if (SuspendAnimationKt.animate$default(r3, 0.0f, 0.0f, null, new AnonymousClass1(r4), this, 12, null) != r0) goto L10;
            return r0;
        L10:
            r1 = this;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState r2, CoroutineScope r3, DrawerState r4, boolean r5, Ref.FloatRef r6, Ref.FloatRef r7, Ref.FloatRef r8, Continuation<? super NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1> r9) {
        this.$drawerPredictiveBackState = r2;
        this.$scope = r3;
        this.$drawerState = r4;
        this.$isRtl = r5;
        this.$maxScaleXDistanceGrow = r6;
        this.$maxScaleXDistanceShrink = r7;
        this.$maxScaleYDistance = r8;
        super(2, r9);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r10, Continuation<?> r11) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 r0 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(this.$drawerPredictiveBackState, this.$scope, this.$drawerState, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, r11);
        r0.L$0 = r10;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Flow<BackEventCompat> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Flow<BackEventCompat> r3, Continuation<? super Unit> r4) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1, boolean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L15;
            case 1: goto L9;
            case 2: goto L7;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        Throwable r2 = (Throwable) this.L$0;
        ResultKt.throwOnFailure($result);
        throw r2;
    L7:
        ResultKt.throwOnFailure($result);
    L36:
        return Unit.INSTANCE;
    L15:
        ResultKt.throwOnFailure($result);
        Flow progress = (Flow) this.L$0;
        final DrawerPredictiveBackState r5 = this.$drawerPredictiveBackState;     // Catch: Throwable -> L11 CancellationException -> L13
        final boolean r6 = this.$isRtl;     // Catch: Throwable -> L11 CancellationException -> L13
        final Ref.FloatRef r7 = this.$maxScaleXDistanceGrow;     // Catch: Throwable -> L11 CancellationException -> L13
        final Ref.FloatRef r8 = this.$maxScaleXDistanceShrink;     // Catch: Throwable -> L11 CancellationException -> L13
        final Ref.FloatRef r9 = this.$maxScaleYDistance;     // Catch: Throwable -> L11 CancellationException -> L13
        this.label = 1;     // Catch: Throwable -> L11 CancellationException -> L13
        if (progress.collect(new AnonymousClass1(r5, r6, r7, r8, r9), this) != r1) goto L19;
        return r1;
    L19:
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 r0 = this;
    L20:
        ?? r3 = r0.$drawerPredictiveBackState.getSwipeEdgeMatchesDrawer();
        if (r3 == 0) goto L23;
        BuildersKt.launch$default(r0.$scope, null, null, new AnonymousClass2(r0.$drawerPredictiveBackState, null), 3, null);
    L23:
        r0.label = 2;
        if (r0.$drawerState.close(r0) != r1) goto L36;
        return r1;
        goto L27
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L11 CancellationException -> L13
        r0 = this;
    L11:
        th = move-exception;
        if (r3.$drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() == false) goto L40;
        BuildersKt.launch$default(r3.$scope, null, null, new AnonymousClass2(r3.$drawerPredictiveBackState, null), 3, null);
    L40:
        r3.L$0 = th;
        r3.label = 4;
        if (r3.$drawerState.close((Continuation) r3) != r1) goto L44;
        return r1;
    L44:
        throw th;
    L27:
        r3.$drawerPredictiveBackState.clear();     // Catch: Throwable -> L11
        if (r3.$drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() == false) goto L31;
        BuildersKt.launch$default(r3.$scope, null, null, new AnonymousClass2(r3.$drawerPredictiveBackState, null), 3, null);
    L31:
        r3.label = 3;
        if (r3.$drawerState.close((Continuation) r3) != r1) goto L36;
        return r1;
    }
}
