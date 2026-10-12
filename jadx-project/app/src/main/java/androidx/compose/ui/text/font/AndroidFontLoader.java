package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 0;
    private final Object cacheKey;
    private final Context context;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFontLoader.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {55, 57}, m = "awaitLoad", n = {"this", "font"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AndroidFontLoader this$0;

        AnonymousClass1(AndroidFontLoader r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.awaitLoad(null, this);
        }
    }

    static {
        $stable = 8;
    }

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public /* bridge */ /* synthetic */ Object loadBlocking(Font font) {
        return loadBlocking(font);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) {
        if ((font instanceof AndroidFont) == true) goto L32;
        Object r1 = null;
        if ((font instanceof ResourceFont) == false) goto L29;
        int r0 = font.mo6473getLoadingStrategyPKNRLFQ();
        if (FontLoadingStrategy.m6515equalsimpl0(r0, FontLoadingStrategy.Companion.m6520getBlockingPKNRLFQ()) == false) goto L11;
        android.graphics.Typeface r2 = AndroidFontLoader_androidKt.access$load((ResourceFont) font, this.context);
    L33:
        return PlatformTypefaces_androidKt.setFontVariationSettings(r2, ((ResourceFont) font).getVariationSettings(), this.context);
    L11:
        if (FontLoadingStrategy.m6515equalsimpl0(r0, FontLoadingStrategy.Companion.m6521getOptionalLocalPKNRLFQ()) == false) goto L23;
        Result.Companion r3 = Result.Companion;     // Catch: Throwable -> L14
        AndroidFontLoader $this$loadBlocking_u24lambda_u240 = this;     // Catch: Throwable -> L14
        Object r4 = Result.m7425constructorimpl(AndroidFontLoader_androidKt.access$load((ResourceFont) font, $this$loadBlocking_u24lambda_u240.context));     // Catch: Throwable -> L14
    L17:
        if (Result.m7431isFailureimpl(r4) == true) goto L20;
        r1 = r4;
    L20:
        r2 = (android.graphics.Typeface) r1;
    L14:
        th = move-exception;
        Result.Companion r5 = Result.Companion;
        r4 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L17
    L23:
        if (FontLoadingStrategy.m6515equalsimpl0(r0, FontLoadingStrategy.Companion.m6519getAsyncPKNRLFQ()) == false) goto L27;
        throw new UnsupportedOperationException("Unsupported Async font load path");
    L27:
        throw new IllegalArgumentException("Unknown loading type " + FontLoadingStrategy.m6517toStringimpl(font.mo6473getLoadingStrategyPKNRLFQ()));
    L29:
        return null;
    L32:
        return ((AndroidFont) font).getTypefaceLoader().loadBlocking(this.context, (AndroidFont) font);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, Continuation<? super android.graphics.Typeface> r10) {
        if ((r10 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r10;
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
        font = (Font) r0.L$1;
        AndroidFontLoader r3 = (AndroidFontLoader) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r4 = $result;
    L27:
        return PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) r4, ((ResourceFont) font).getVariationSettings(), r3.context);
    L13:
        ResultKt.throwOnFailure($result);
        return $result;
    L14:
        ResultKt.throwOnFailure($result);
        if ((font instanceof AndroidFont) == false) goto L21;
        r0.label = 1;
        Object r9 = ((AndroidFont) font).getTypefaceLoader().awaitLoad(this.context, (AndroidFont) font, r0);
        if (r9 != r2) goto L30;
        return r2;
    L30:
        return r9;
    L21:
        if ((font instanceof ResourceFont) == false) goto L29;
        Context r5 = this.context;
        r0.L$0 = this;
        r0.L$1 = font;
        r0.label = 2;
        r4 = AndroidFontLoader_androidKt.access$loadAsync((ResourceFont) font, r5, r0);
        if (r4 != r2) goto L25;
        return r2;
    L25:
        r3 = this;
        goto L27
    L29:
        throw new IllegalArgumentException("Unknown font type: " + font);
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r10);
        goto L8
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
