package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.MutableScatterSet;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "This is not supported after downloadable fonts.")
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\b\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontListFontFamily;", "context", "Landroid/content/Context;", "necessaryStyles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "loadedTypefaces", "", "Landroidx/compose/ui/text/font/Font;", "Landroid/graphics/Typeface;", "getNativeTypeface", "fontWeight", "fontStyle", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidFontListTypeface implements AndroidTypeface {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private static final FontMatcher fontMatcher = null;
    private final FontFamily fontFamily;
    private final FontMatcher fontMatcher$1;
    private final Map<Font, Typeface> loadedTypefaces;

    /* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "()V", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.access$getFontMatcher$cp();
        }
    }

    public AndroidFontListTypeface(FontListFontFamily fontFamily, Context context, List<Pair<FontWeight, FontStyle>> r21, FontMatcher fontMatcher2) {
        this.fontMatcher$1 = fontMatcher2;
        List<Font> r0 = fontFamily.getFonts();
        List target$iv = new ArrayList(r0.size());
        int index$iv$iv = 0;
        int r8 = r0.size();
    L3:
        if (index$iv$iv >= r8) goto L8;
        Font it = r0.get(index$iv$iv);
        if (FontLoadingStrategy.m6515equalsimpl0(it.mo6473getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m6520getBlockingPKNRLFQ()) == false) goto L7;
        target$iv.add(it);
    L7:
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L8:
        List blockingFonts = target$iv;
        if (r21 == null) goto L22;
        List<Pair<FontWeight, FontStyle>> r1 = r21;
        ArrayList target$iv2 = new ArrayList(r1.size());
        int index$iv$iv2 = 0;
        int r9 = r1.size();
    L11:
        if (index$iv$iv2 >= r9) goto L13;
        Pair<FontWeight, FontStyle> r14 = (Pair) r1.get(index$iv$iv2);
        List<Pair<FontWeight, FontStyle>> r17 = r1;
        FontWeight weight = r14.component1();
        int style = r14.component2().m6531unboximpl();
        target$iv2.add((Font) CollectionsKt.firstOrNull(this.fontMatcher$1.m6524matchFontRetOiIg(blockingFonts, weight, style)));
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = r17;
        goto L11
    L13:
        List $this$fastDistinctBy$iv = ListUtilsKt.fastFilterNotNull(target$iv2);
        if ($this$fastDistinctBy$iv == null) goto L22;
        MutableScatterSet set$iv = new MutableScatterSet($this$fastDistinctBy$iv.size());
        ArrayList target$iv3 = new ArrayList($this$fastDistinctBy$iv.size());
        int index$iv$iv3 = 0;
        int r10 = $this$fastDistinctBy$iv.size();
    L16:
        if (index$iv$iv3 >= r10) goto L21;
        Object item$iv$iv = $this$fastDistinctBy$iv.get(index$iv$iv3);
        if (set$iv.add((Font) item$iv$iv) == false) goto L20;
        target$iv3.add(item$iv$iv);
    L20:
        index$iv$iv3 = index$iv$iv3 + 1;
        goto L16
    L21:
        ArrayList $this$fastDistinctBy$iv2 = target$iv3;
    L23:
        List matchedFonts = $this$fastDistinctBy$iv2;
        if (matchedFonts != null) goto L26;
        List r2 = blockingFonts;
    L27:
        List targetFonts = r2;
        boolean value$iv = !targetFonts.isEmpty();
        if (value$iv == true) goto L30;
        InlineClassHelperKt.throwIllegalStateException("Could not match font");
    L30:
        Map typefaces = new LinkedHashMap();
        int r11 = targetFonts.size();
        int index$iv = 0;
    L31:
        if (index$iv >= r11) goto L43;
        Object item$iv = targetFonts.get(index$iv);
        Font it2 = (Font) item$iv;
        typefaces.put(it2, AndroidTypefaceCache.INSTANCE.getOrCreate(context, it2));     // Catch: Exception -> L37
    L42:
        index$iv = index$iv + 1;
    L41:
        InlineClassHelperKt.throwIllegalStateException("Cannot create Typeface from " + it2);
        goto L42
    L43:
        this.loadedTypefaces = typefaces;
        this.fontFamily = fontFamily;
        return;
    L26:
        r2 = matchedFonts;
    L22:
        $this$fastDistinctBy$iv2 = null;
        goto L23
    }

    public static final /* synthetic */ FontMatcher access$getFontMatcher$cp() {
        return fontMatcher;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily r1, Context r2, List r3, FontMatcher r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = fontMatcher;
    L8:
        this(r1, r2, r3, r4);
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        fontMatcher = new FontMatcher();
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo6668getNativeTypefacePYhJU0U(FontWeight fontWeight, int fontStyle, int synthesis) {
        Font font = (Font) CollectionsKt.firstOrNull(this.fontMatcher$1.m6524matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, fontStyle));
        if (font == null) goto L10;
        Typeface typeface = this.loadedTypefaces.get(font);
        if (typeface == null) goto L8;
        Object r2 = FontSynthesis_androidKt.m6549synthesizeTypefaceFxwP2eA(synthesis, typeface, font, fontWeight, fontStyle);
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) r2;
    L8:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load typeface");
        throw new KotlinNothingValueException();
    L10:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load font");
        throw new KotlinNothingValueException();
    }
}
