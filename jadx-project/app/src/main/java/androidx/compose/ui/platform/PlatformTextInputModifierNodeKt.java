package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a;\u0010\u000b\u001a\u00020\f*\u00020\r2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¢\u0006\u0002\b\u0013H\u0086@¢\u0006\u0002\u0010\u0014\u001aE\u0010\u0015\u001a\u00020\f*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¢\u0006\u0002\b\u0013H\u0082@¢\u0006\u0002\u0010\u0019\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"LocalChainedPlatformTextInputInterceptor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "InterceptPlatformTextInput", "", "interceptor", "Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/PlatformTextInputInterceptor;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "establishTextInputSession", "", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interceptedTextInputSession", "Landroidx/compose/ui/node/Owner;", "chainedInterceptor", "session", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlatformTextInputModifierNodeKt {
    private static final ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> LocalChainedPlatformTextInputInterceptor = null;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {136}, m = "establishTextInputSession", n = {}, s = {})
    static final class C06531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C06531(Continuation<? super C06531> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {184, 186}, m = "interceptedTextInputSession", n = {}, s = {})
    static final class C06541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C06541(Continuation<? super C06541> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return PlatformTextInputModifierNodeKt.access$interceptedTextInputSession(null, null, null, this);
        }
    }

    public static final /* synthetic */ Object access$interceptedTextInputSession(Owner $receiver, ChainedPlatformTextInputInterceptor chainedInterceptor, Function2 session, Continuation $completion) {
        return interceptedTextInputSession($receiver, chainedInterceptor, session, $completion);
    }

    public static final Object establishTextInputSession(PlatformTextInputModifierNode $this$establishTextInputSession, Function2<? super PlatformTextInputSessionScope, ? super Continuation<?>, ? extends Object> r7, Continuation<?> r8) {
        if ((r8 instanceof C06531) == false) goto L7;
        C06531 r0 = (C06531) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L19:
        throw new KotlinNothingValueException();
    L13:
        ResultKt.throwOnFailure($result);
        if ($this$establishTextInputSession.getNode().isAttached() == false) goto L21;
        Owner owner = DelegatableNodeKt.requireOwner($this$establishTextInputSession);
        ChainedPlatformTextInputInterceptor handler = (ChainedPlatformTextInputInterceptor) DelegatableNodeKt.requireLayoutNode($this$establishTextInputSession).getCompositionLocalMap().get(LocalChainedPlatformTextInputInterceptor);
        r0.label = 1;
        if (interceptedTextInputSession(owner, handler, r7, r0) != r2) goto L19;
        return r2;
    L21:
        throw new IllegalArgumentException("establishTextInputSession called from an unattached node".toString());
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C06531(r8);
        goto L8
    }

    public static final void InterceptPlatformTextInput(final PlatformTextInputInterceptor interceptor, final Function2<? super Composer, ? super Integer, Unit> r10, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1315007550);
        ComposerKt.sourceInformation($composer2, "C(InterceptPlatformTextInput)P(1)156@7637L7,162@8032L77,168@8330L135:PlatformTextInputModifierNode.kt#itgzvw");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r2 = $composer2.changed(interceptor);
    L8:
        if (r2 == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L13
    L10:
        r3 = 2;
        goto L11
    L7:
        r2 = $composer2.changedInstance(interceptor);
    L13:
        if (($changed & 48) != 0) goto L20;
        if ($composer2.changedInstance(r10) == false) goto L17;
        int r4 = 32;
    L18:
        $dirty = $dirty | r4;
        goto L20
    L17:
        r4 = 16;
    L20:
        if (($dirty & 19) == 18) goto L22;
        boolean r5 = true;
    L24:
        if ($composer2.shouldExecute(r5, $dirty & 1) == true) goto L26;
        $composer2.skipToGroupEnd();
    L39:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L43;
        r0.updateScope(new AnonymousClass1(interceptor, r10, $changed));
        return;
    L43:
        return;
    L26:
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventStart(1315007550, $dirty, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:155)");
    L28:
        ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> r1 = LocalChainedPlatformTextInputInterceptor;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ChainedPlatformTextInputInterceptor parent = (ChainedPlatformTextInputInterceptor) r6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1708127945, "CC(remember):PlatformTextInputModifierNode.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(parent);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L31;
    L34:
        Object value$iv = new ChainedPlatformTextInputInterceptor(interceptor, parent);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L35:
        ChainedPlatformTextInputInterceptor chainedInterceptor = (ChainedPlatformTextInputInterceptor) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        chainedInterceptor.updateInterceptor(interceptor);
        CompositionLocalKt.CompositionLocalProvider(LocalChainedPlatformTextInputInterceptor.provides(chainedInterceptor), r10, $composer2, ProvidedValue.$stable | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
        goto L39
    L31:
        if (it$iv != Composer.Companion.getEmpty()) goto L35;
    L22:
        r5 = false;
        goto L24
    }

    static {
        LocalChainedPlatformTextInputInterceptor = CompositionLocalKt.staticCompositionLocalOf(PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1.INSTANCE);
    }

    private static final Object interceptedTextInputSession(Owner $this$interceptedTextInputSession, ChainedPlatformTextInputInterceptor chainedInterceptor, Function2<? super PlatformTextInputSessionScope, ? super Continuation<?>, ? extends Object> r6, Continuation<?> r7) {
        if ((r7 instanceof C06541) == false) goto L7;
        C06541 r0 = (C06541) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L25:
        throw new KotlinNothingValueException();
    L13:
        ResultKt.throwOnFailure($result);
    L20:
        throw new KotlinNothingValueException();
    L14:
        ResultKt.throwOnFailure($result);
        if (chainedInterceptor != null) goto L21;
        r0.label = 1;
        if ($this$interceptedTextInputSession.textInputSession(r6, r0) != r2) goto L20;
        return r2;
    L21:
        r0.label = 2;
        if (chainedInterceptor.textInputSession($this$interceptedTextInputSession, r6, r0) != r2) goto L25;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C06541(r7);
        goto L8
    }
}
