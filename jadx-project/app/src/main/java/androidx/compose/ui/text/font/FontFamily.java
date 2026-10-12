package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.webkit.Profile;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0002\u001a\u00020\u00038G¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "canLoadSynchronously", "", "(Z)V", "getCanLoadSynchronously$annotations", "()V", "getCanLoadSynchronously", "()Z", "Companion", "Resolver", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FontFamily {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final GenericFontFamily Cursive = null;
    private static final SystemFontFamily Default = null;
    private static final GenericFontFamily Monospace = null;
    private static final GenericFontFamily SansSerif = null;
    private static final GenericFontFamily Serif = null;
    private final boolean canLoadSynchronously;

    /* JADX INFO: compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "()V", "Cursive", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getCursive", "()Landroidx/compose/ui/text/font/GenericFontFamily;", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/font/SystemFontFamily;", "getDefault", "()Landroidx/compose/ui/text/font/SystemFontFamily;", "Monospace", "getMonospace", "SansSerif", "getSansSerif", "Serif", "getSerif", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.access$getDefault$cp();
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.access$getSansSerif$cp();
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.access$getSerif$cp();
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.access$getMonospace$cp();
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.access$getCursive$cp();
        }
    }

    /* JADX INFO: compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006JB\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0011ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Resolver {
        Object preload(FontFamily r1, Continuation<? super Unit> r2);

        /* JADX INFO: renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo6501resolveDPcqOEQ(FontFamily r1, FontWeight r2, int r3, int r4);

        /* JADX INFO: renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ State m6500resolveDPcqOEQ$default(Resolver r0, FontFamily r1, FontWeight r2, int r3, int r4, int r5, Object r6) {
            if (r6 != null) goto L18;
            if ((r5 & 1) == 0) goto L7;
            r1 = null;
        L7:
            if ((r5 & 2) == 0) goto L10;
            r2 = FontWeight.Companion.getNormal();
        L10:
            if ((r5 & 4) == 0) goto L13;
            r3 = FontStyle.Companion.m6535getNormal_LCdwA();
        L13:
            if ((r5 & 8) == 0) goto L16;
            r4 = FontSynthesis.Companion.m6545getAllGVVA2EU();
        L16:
            return r0.mo6501resolveDPcqOEQ(r1, r2, r3, r4);
        L18:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
    }

    public /* synthetic */ FontFamily(boolean r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    private FontFamily(boolean canLoadSynchronously) {
        this.canLoadSynchronously = canLoadSynchronously;
    }

    public static final /* synthetic */ GenericFontFamily access$getCursive$cp() {
        return Cursive;
    }

    public static final /* synthetic */ SystemFontFamily access$getDefault$cp() {
        return Default;
    }

    public static final /* synthetic */ GenericFontFamily access$getMonospace$cp() {
        return Monospace;
    }

    public static final /* synthetic */ GenericFontFamily access$getSansSerif$cp() {
        return SansSerif;
    }

    public static final /* synthetic */ GenericFontFamily access$getSerif$cp() {
        return Serif;
    }

    static {
        Companion = new Companion(null);
        Default = new DefaultFontFamily();
        SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
        Serif = new GenericFontFamily("serif", "FontFamily.Serif");
        Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
        Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }
}
