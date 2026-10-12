package androidx.compose.ui.text.font;

import androidx.collection.MutableScatterSet;
import androidx.compose.ui.text.platform.DispatcherKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJB\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "injectedContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "asyncLoadScope", "Lkotlinx/coroutines/CoroutineScope;", "preload", "", "family", "Landroidx/compose/ui/text/font/FontFamily;", "resourceLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "createDefaultTypeface", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final CoroutineExceptionHandler DropExceptionHandler = null;
    private static final FontMatcher fontMatcher = null;
    private CoroutineScope asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "()V", "DropExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getDropExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.access$getFontMatcher$cp();
        }

        public final CoroutineExceptionHandler getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.access$getDropExceptionHandler$cp();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3, reason: invalid class name */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Font> $asyncLoads;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

        AnonymousClass3(List<Font> r2, FontListFontFamilyTypefaceAdapter r3, PlatformFontLoader r4, Continuation<? super AnonymousClass3> r5) {
            this.$asyncLoads = r2;
            this.this$0 = r3;
            this.$resourceLoader = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass3 r0 = new AnonymousClass3(this.$asyncLoads, this.this$0, this.$resourceLoader, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L21:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            Object $result2 = $result;
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            List<Font> r3 = this.$asyncLoads;
            MutableScatterSet set$iv = new MutableScatterSet(r3.size());
            List target$iv = new ArrayList(r3.size());
            int index$iv$iv = 0;
            int r10 = r3.size();
        L8:
            if (index$iv$iv >= r10) goto L13;
            Font r11 = r3.get(index$iv$iv);
            if (set$iv.add(r11) == false) goto L12;
            target$iv.add(r11);
        L12:
            index$iv$iv = index$iv$iv + 1;
            goto L8
        L13:
            List $this$fastMap$iv = target$iv;
            FontListFontFamilyTypefaceAdapter r12 = this.this$0;
            PlatformFontLoader r13 = this.$resourceLoader;
            ArrayList target$iv2 = new ArrayList($this$fastMap$iv.size());
            int index$iv$iv2 = 0;
            int r15 = $this$fastMap$iv.size();
        L14:
            if (index$iv$iv2 >= r15) goto L16;
            Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv2);
            Font font = (Font) item$iv$iv;
            int index$iv$iv3 = index$iv$iv2;
            target$iv2.add(BuildersKt.async$default($this$coroutineScope, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(r12, font, r13, null), 3, null));
            index$iv$iv2 = index$iv$iv3 + 1;
            $result2 = $result2;
            goto L14
        L16:
            this.label = 1;
            if (AwaitKt.joinAll(target$iv2, this) != r1) goto L21;
            return r1;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1, reason: invalid class name */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AsyncFontListLoader $asyncLoader;
        int label;

        AnonymousClass1(AsyncFontListLoader r2, Continuation<? super AnonymousClass1> r3) {
            this.$asyncLoader = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.$asyncLoader, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (this.$asyncLoader.load(this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext injectedContext) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = CoroutineScopeKt.CoroutineScope(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(injectedContext).plus(SupervisorKt.SupervisorJob((Job) injectedContext.get(Job.Key))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache r1, EmptyCoroutineContext r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = new AsyncTypefaceCache();
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = EmptyCoroutineContext.INSTANCE;
    L8:
        this(r1, r2);
    }

    public static final /* synthetic */ AsyncTypefaceCache access$getAsyncTypefaceCache$p(FontListFontFamilyTypefaceAdapter $this) {
        return $this.asyncTypefaceCache;
    }

    public static final /* synthetic */ CoroutineExceptionHandler access$getDropExceptionHandler$cp() {
        return DropExceptionHandler;
    }

    public static final /* synthetic */ FontMatcher access$getFontMatcher$cp() {
        return fontMatcher;
    }

    public final Object preload(FontFamily family, PlatformFontLoader resourceLoader, Continuation<? super Unit> r22) {
        if ((family instanceof FontListFontFamily) == false) goto L5;
        List<Font> r9 = ((FontListFontFamily) family).getFonts();
        List<Font> r1 = ((FontListFontFamily) family).getFonts();
        List target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r10 = r1.size();
    L7:
        if (index$iv$iv >= r10) goto L12;
        Object item$iv$iv = r1.get(index$iv$iv);
        List<Font> r16 = r1;
        if (FontLoadingStrategy.m6515equalsimpl0(((Font) item$iv$iv).mo6473getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m6519getAsyncPKNRLFQ()) == false) goto L11;
        Font it = (Font) item$iv$iv;
        target$iv.add(TuplesKt.to(it.getWeight(), FontStyle.m6525boximpl(it.mo6481getStyle_LCdwA())));
    L11:
        index$iv$iv = index$iv$iv + 1;
        r1 = r16;
        goto L7
    L12:
        List $this$fastDistinctBy$iv = target$iv;
        MutableScatterSet set$iv = new MutableScatterSet($this$fastDistinctBy$iv.size());
        List target$iv2 = new ArrayList($this$fastDistinctBy$iv.size());
        int index$iv$iv2 = 0;
        int r11 = $this$fastDistinctBy$iv.size();
    L13:
        if (index$iv$iv2 >= r11) goto L18;
        Object item$iv$iv2 = $this$fastDistinctBy$iv.get(index$iv$iv2);
        if (set$iv.add((Pair) item$iv$iv2) == false) goto L17;
        target$iv2.add(item$iv$iv2);
    L17:
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L13
    L18:
        List asyncStyles = target$iv2;
        List asyncLoads = new ArrayList();
        int r14 = asyncStyles.size();
        int index$iv = 0;
    L19:
        if (index$iv >= r14) goto L24;
        Object item$iv = asyncStyles.get(index$iv);
        Pair r2 = (Pair) item$iv;
        FontWeight fontWeight = (FontWeight) r2.component1();
        int fontStyle = ((FontStyle) r2.component2()).m6531unboximpl();
        List<Font> r3 = fontMatcher.m6524matchFontRetOiIg(r9, fontWeight, fontStyle);
        List<Font> r18 = r9;
        TypefaceRequest typeRequest = new TypefaceRequest(family, fontWeight, fontStyle, FontSynthesis.Companion.m6545getAllGVVA2EU(), resourceLoader.getCacheKey(), null);
        List asyncFontsToLoad = (List) FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(r3, typeRequest, this.asyncTypefaceCache, resourceLoader, FontListFontFamilyTypefaceAdapter$preload$2$1.INSTANCE).component1();
        if (asyncFontsToLoad == null) goto L23;
        asyncLoads.add(CollectionsKt.first(asyncFontsToLoad));
    L23:
        index$iv = index$iv + 1;
        r9 = r18;
        goto L19
    L24:
        Object r4 = CoroutineScopeKt.coroutineScope(new AnonymousClass3(asyncLoads, this, resourceLoader, null), r22);
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L28;
        return r4;
    L28:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1<? super TypefaceResult.Immutable, Unit> r21, Function1<? super TypefaceRequest, ? extends Object> r22) {
        if ((typefaceRequest.getFontFamily() instanceof FontListFontFamily) == true) goto L5;
        return null;
    L5:
        Pair r3 = FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(fontMatcher.m6524matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m6573getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, r22);
        List asyncFontsToLoad = (List) r3.component1();
        Object synthesizedTypeface = r3.component2();
        if (asyncFontsToLoad == null) goto L8;
        AsyncFontListLoader asyncLoader = new AsyncFontListLoader(asyncFontsToLoad, synthesizedTypeface, typefaceRequest, this.asyncTypefaceCache, r21, platformFontLoader);
        BuildersKt.launch$default(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(asyncLoader, null), 1, null);
        return new TypefaceResult.Async(asyncLoader);
    L8:
        return new TypefaceResult.Immutable(synthesizedTypeface, false, 2, null);
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        fontMatcher = new FontMatcher();
        DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
    }
}
