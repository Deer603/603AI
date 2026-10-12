package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u0005H\u0080@¢\u0006\u0004\b#\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "fontList", "", "Landroidx/compose/ui/text/font/Font;", "initialType", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "onCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "cacheable", "", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;
    private final List<Font> fontList;
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {281, 295}, m = "load", n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AsyncFontListLoader this$0;

        AnonymousClass1(AsyncFontListLoader r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.load(this);
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> r3, Object initialType, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1<? super TypefaceResult.Immutable, Unit> r7, PlatformFontLoader platformFontLoader) {
        this.fontList = r3;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = r7;
        this.platformFontLoader = platformFontLoader;
        this.value$delegate = SnapshotStateKt.mutableStateOf$default(initialType, null, 2, null);
        this.cacheable = true;
    }

    public static final /* synthetic */ PlatformFontLoader access$getPlatformFontLoader$p(AsyncFontListLoader $this) {
        return $this.platformFontLoader;
    }

    private void setValue(Object r4) {
        MutableState $this$setValue$iv = this.value$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        State $this$getValue$iv = this.value$delegate;
        return $this$getValue$iv.getValue();
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text_release(boolean r1) {
        this.cacheable = r1;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0122 -> B:45:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0136 -> B:51:0x013b). Please report as a decompilation issue!!! */
    public final Object load(Continuation<? super Unit> r20) {
        if ((r20 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r20;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r3 = r0;
        Object $result = r3.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r7 = true;
        switch(r3.label) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Continuation r9 = null;
        int r10 = r3.I$1;
        int index$iv = r3.I$0;
        List<Font> r12 = (List) r3.L$1;
        AsyncFontListLoader r13 = (AsyncFontListLoader) r3.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L60
    L45:
        AnonymousClass1 r14 = r3;
        Continuation $continuation = r9;
        int $i$f$fastForEach = r10;
        int index$iv2 = index$iv;
        List<Font> r5 = r12;
        AsyncFontListLoader r11 = r13;
    L51:
        index$iv2 = index$iv2 + 1;
    L23:
        if (index$iv2 < $i$f$fastForEach) goto L74;
        AsyncFontListLoader r8 = r11;
        boolean shouldCache = JobKt.isActive(r14.getContext());
        r8.cacheable = false;
        Function1<TypefaceResult.Immutable, Unit> r4 = r8.onCompletion;
        Object r6 = r8.getValue();
        if (shouldCache == true) goto L58;
        r7 = false;
    L58:
        r4.invoke(new TypefaceResult.Immutable(r6, r7));
        return Unit.INSTANCE;
    L74:
        Object item$iv = r5.get(index$iv2);     // Catch: Throwable -> L52
        Font font = (Font) item$iv;     // Catch: Throwable -> L52
        int r16 = 0;
        if (FontLoadingStrategy.m6515equalsimpl0(font.mo6473getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m6519getAsyncPKNRLFQ()) == false) goto L50;
        AsyncTypefaceCache r15 = r11.asyncTypefaceCache;     // Catch: Throwable -> L52
        PlatformFontLoader r17 = r11.platformFontLoader;     // Catch: Throwable -> L52
        AsyncFontListLoader$load$2$typeface$1 r18 = new AsyncFontListLoader$load$2$typeface$1(r11, font, null);     // Catch: Throwable -> L52
        r14.L$0 = r11;     // Catch: Throwable -> L52
        r14.L$1 = r5;     // Catch: Throwable -> L52
        r14.L$2 = font;     // Catch: Throwable -> L52
        r14.I$0 = index$iv2;     // Catch: Throwable -> L52
        r14.I$1 = $i$f$fastForEach;     // Catch: Throwable -> L52
        r14.label = 1;     // Catch: Throwable -> L52
        AsyncFontListLoader r19 = r11;
        int r110 = $i$f$fastForEach;
        Object r21 = r15.runCached(font, r17, false, r18, r14);     // Catch: Throwable -> L48
        if (r21 != r1) goto L31;
        return r1;
    L31:
        List<Font> r111 = r5;
        Font font2 = font;
        index$iv = index$iv2;
        r10 = r110;
        Object $result2 = $result;
        $result = r21;
        r9 = $continuation;
        r3 = r14;
        AsyncFontListLoader r112 = r19;
    L33:
        if ($result == null) goto L72;
        r112.setValue(FontSynthesis_androidKt.m6549synthesizeTypefaceFxwP2eA(r112.typefaceRequest.m6574getFontSynthesisGVVA2EU(), $result, font2, r112.typefaceRequest.getFontWeight(), r112.typefaceRequest.m6573getFontStyle_LCdwA()));     // Catch: Throwable -> L46
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L46
        boolean shouldCache2 = JobKt.isActive(r3.getContext());
        r112.cacheable = false;
        Function1<TypefaceResult.Immutable, Unit> r22 = r112.onCompletion;
        Object r23 = r112.getValue();
        if (shouldCache2 == true) goto L39;
        r7 = false;
    L39:
        r22.invoke(new TypefaceResult.Immutable(r23, r7));
        return r2;
    L46:
        th = th;
        AsyncFontListLoader r113 = r112;
    L61:
        boolean shouldCache3 = JobKt.isActive(r3.getContext());
        r113.cacheable = false;
        Function1<TypefaceResult.Immutable, Unit> r24 = r113.onCompletion;
        Object r114 = r113.getValue();
        if (shouldCache3 == true) goto L65;
        r7 = false;
    L65:
        r24.invoke(new TypefaceResult.Immutable(r114, r7));
        throw th;
    L72:
        r3.L$0 = r112;     // Catch: Throwable -> L46
        r3.L$1 = r111;     // Catch: Throwable -> L46
        r3.L$2 = null;     // Catch: Throwable -> L46
        r3.I$0 = index$iv;     // Catch: Throwable -> L46
        r3.I$1 = r10;     // Catch: Throwable -> L46
        r3.label = 2;     // Catch: Throwable -> L46
        if (YieldKt.yield(r3) != r1) goto L44;
        return r1;
    L44:
        $result = $result2;
        r12 = r111;
        r13 = r112;
    L48:
        th = th;
        r113 = r19;
        r3 = r14;
        goto L61
    L50:
        r11 = r11;
    L52:
        th = th;
        r113 = r11;
        r3 = r14;
        goto L61
    L15:
        r10 = r3.I$1;
        index$iv = r3.I$0;
        font2 = (Font) r3.L$2;
        r111 = (List) r3.L$1;
        r112 = (AsyncFontListLoader) r3.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L18
        r16 = 0;
        r9 = null;
        $result2 = $result;
    L18:
        th = th;
        r113 = r112;
        goto L61
    L20:
        ResultKt.throwOnFailure($result);
        r5 = this.fontList;     // Catch: Throwable -> L60
        r14 = r3;
        $continuation = null;
        index$iv2 = 0;
        $i$f$fastForEach = r5.size();     // Catch: Throwable -> L60
        r11 = this;
        goto L23
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L60:
        th = th;
    L7:
        r0 = new AnonymousClass1(this, r20);
        goto L8
    }

    public final Object loadWithTimeoutOrNull$ui_text_release(Font $this$loadWithTimeoutOrNull, Continuation<Object> r11) {
        if ((r11 instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) == false) goto L7;
        AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object r4 = null;
        switch(r0.label) {
            case 0: goto L15;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        $this$loadWithTimeoutOrNull = (Font) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Exception -> L20 CancellationException -> L25
        r4 = $result;
    L30:
    L28:
        return r4;
    L15:
        ResultKt.throwOnFailure($result);
        AsyncFontListLoader$loadWithTimeoutOrNull$2 r5 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, $this$loadWithTimeoutOrNull, null);     // Catch: Exception -> L20 CancellationException -> L25
        r0.L$0 = $this$loadWithTimeoutOrNull;     // Catch: Exception -> L20 CancellationException -> L25
        r0.label = 1;     // Catch: Exception -> L20 CancellationException -> L25
        r4 = TimeoutKt.withTimeoutOrNull(15000, r5, r0);     // Catch: Exception -> L20 CancellationException -> L25
        if (r4 != r2) goto L30;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L25:
        cancel = move-exception;
        if (JobKt.isActive(r0.getContext()) == true) goto L28;
        throw cancel;
    L20:
        uncaughtFontLoadException = move-exception;
        CoroutineExceptionHandler r3 = (CoroutineExceptionHandler) r0.getContext().get(CoroutineExceptionHandler.Key);
        if (r3 == null) goto L28;
        r3.handleException(r0.getContext(), new IllegalStateException("Unable to load font " + $this$loadWithTimeoutOrNull, uncaughtFontLoadException));
    L7:
        r0 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, r11);
        goto L8
    }
}
