package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "()V", "platformTypefaceResolver", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "createDefaultTypeface", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 0;
    private final PlatformTypefaces platformTypefaceResolver;

    static {
        $stable = 8;
    }

    public PlatformFontFamilyTypefaceAdapter() {
        this.platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1<? super TypefaceResult.Immutable, Unit> r8, Function1<? super TypefaceRequest, ? extends Object> r9) {
        FontFamily r0 = typefaceRequest.getFontFamily();
        if (r0 != null) goto L5;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L10;
        android.graphics.Typeface result = this.platformTypefaceResolver.mo6555createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m6573getFontStyle_LCdwA());
    L16:
        return new TypefaceResult.Immutable(result, false, 2, null);
    L10:
        if ((r0 instanceof GenericFontFamily) == false) goto L13;
        result = this.platformTypefaceResolver.mo6556createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m6573getFontStyle_LCdwA());
        goto L16
    L13:
        if ((r0 instanceof LoadedFontFamily) == false) goto L17;
        Typeface r2 = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
        result = ((AndroidTypeface) r2).mo6668getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m6573getFontStyle_LCdwA(), typefaceRequest.m6574getFontSynthesisGVVA2EU());
        goto L16
    L17:
        return null;
    L5:
        r1 = r0 instanceof DefaultFontFamily;
        goto L7
    }
}
