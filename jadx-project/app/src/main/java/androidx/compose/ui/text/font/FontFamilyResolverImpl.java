package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.core.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J:\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\"\u001a\u00020\u000fH\u0002R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "createDefaultTypeface", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "typefaceRequest", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public static final int $stable = 0;
    private final Function1<TypefaceRequest, Object> createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1, reason: invalid class name */
    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {MotionEventCompat.AXIS_GENERIC_12}, m = "preload", n = {"this", "fontFamily"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FontFamilyResolverImpl this$0;

        AnonymousClass1(FontFamilyResolverImpl r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.preload(null, this);
        }
    }

    static {
        $stable = 8;
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFamilyTypefaceAdapter;
        this.createDefaultTypeface = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader r7, PlatformResolveInterceptor r8, TypefaceRequestCache r9, FontListFontFamilyTypefaceAdapter r10, PlatformFontFamilyTypefaceAdapter r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 2) == 0) goto L5;
        PlatformResolveInterceptor r2 = PlatformResolveInterceptor.Companion.getDefault$ui_text_release();
    L7:
        if ((r12 & 4) == 0) goto L9;
        TypefaceRequestCache r3 = FontFamilyResolverKt.getGlobalTypefaceRequestCache();
    L11:
        if ((r12 & 8) == 0) goto L13;
        FontListFontFamilyTypefaceAdapter r4 = new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, null);
    L15:
        if ((r12 & 16) == 0) goto L17;
        PlatformFontFamilyTypefaceAdapter r5 = new PlatformFontFamilyTypefaceAdapter();
    L18:
        this(r7, r2, r3, r4, r5);
        return;
    L17:
        r5 = r11;
        goto L18
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    public static final /* synthetic */ Function1 access$getCreateDefaultTypeface$p(FontFamilyResolverImpl $this) {
        return $this.createDefaultTypeface;
    }

    public static final /* synthetic */ FontListFontFamilyTypefaceAdapter access$getFontListFontFamilyTypefaceAdapter$p(FontFamilyResolverImpl $this) {
        return $this.fontListFontFamilyTypefaceAdapter;
    }

    public static final /* synthetic */ PlatformFontFamilyTypefaceAdapter access$getPlatformFamilyTypefaceAdapter$p(FontFamilyResolverImpl $this) {
        return $this.platformFamilyTypefaceAdapter;
    }

    public static final /* synthetic */ State access$resolve(FontFamilyResolverImpl $this, TypefaceRequest typefaceRequest) {
        return $this.resolve(typefaceRequest);
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    public Object preload(FontFamily fontFamily, Continuation<? super Unit> r28) {
        if ((r28 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r1 = (AnonymousClass1) r28;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FontFamily fontFamily2 = (FontFamily) r1.L$1;
        final FontFamilyResolverImpl r5 = (FontFamilyResolverImpl) r1.L$0;
        ResultKt.throwOnFailure($result);
    L21:
        List<Font> r6 = ((FontListFontFamily) fontFamily2).getFonts();
        List target$iv = new ArrayList(r6.size());
        int index$iv$iv = 0;
        int r11 = r6.size();
    L22:
        if (index$iv$iv >= r11) goto L24;
        Object item$iv$iv = r6.get(index$iv$iv);
        Font it = (Font) item$iv$iv;
        target$iv.add(new TypefaceRequest(r5.platformResolveInterceptor.interceptFontFamily(fontFamily2), r5.platformResolveInterceptor.interceptFontWeight(it.getWeight()), r5.platformResolveInterceptor.m6553interceptFontStyleT2F_aPo(it.mo6481getStyle_LCdwA()), FontSynthesis.Companion.m6545getAllGVVA2EU(), r5.platformFontLoader.getCacheKey(), null));
        index$iv$iv = index$iv$iv + 1;
        r1 = r1;
        goto L22
    L24:
        List typeRequests = target$iv;
        r5.typefaceRequestCache.preWarmCache(typeRequests, new AnonymousClass2(r5));
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        r5 = this;
        if ((fontFamily instanceof FontListFontFamily) == false) goto L16;
        FontListFontFamilyTypefaceAdapter r7 = r5.fontListFontFamilyTypefaceAdapter;
        PlatformFontLoader r8 = r5.platformFontLoader;
        r1.L$0 = r5;
        r1.L$1 = fontFamily;
        r1.label = 1;
        if (r7.preload(fontFamily, r8, r1) != r4) goto L20;
        return r4;
    L20:
        fontFamily2 = fontFamily;
        goto L21
    L16:
        return Unit.INSTANCE;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass1(this, r28);
        goto L8
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* JADX INFO: renamed from: resolve-DPcqOEQ */
    public State<Object> mo6501resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m6553interceptFontStyleT2F_aPo(fontStyle), this.platformResolveInterceptor.m6554interceptFontSynthesisMscr08Y(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    private final State<Object> resolve(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest));
    }
}
