package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "load", "", "font", "Landroidx/compose/ui/text/font/Font;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    public static final Companion Companion = null;
    private static Map<FontFamily.Resolver, Font.ResourceLoader> cache;
    private static final SynchronizedObject lock = null;
    private final FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: compiled from: TextLayoutResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0005R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion;", "", "()V", "cache", "", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getCache", "()Ljava/util/Map;", "setCache", "(Ljava/util/Map;)V", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", "from", "fontFamilyResolver", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Map<FontFamily.Resolver, Font.ResourceLoader> getCache() {
            return DeprecatedBridgeFontResourceLoader.access$getCache$cp();
        }

        public final void setCache(Map<FontFamily.Resolver, Font.ResourceLoader> r1) {
            DeprecatedBridgeFontResourceLoader.access$setCache$cp(r1);
        }

        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.access$getLock$cp();
        }

        public final Font.ResourceLoader from(FontFamily.Resolver fontFamilyResolver) {
            SynchronizedObject lock$iv = getLock();
            monitor-enter(lock$iv);
            Font.ResourceLoader r3 = DeprecatedBridgeFontResourceLoader.Companion.getCache().get(fontFamilyResolver);     // Catch: Throwable -> L13
            if (r3 != null) goto L8;
            DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(fontFamilyResolver, null);     // Catch: Throwable -> L13
            DeprecatedBridgeFontResourceLoader.Companion.getCache().put(fontFamilyResolver, deprecatedBridgeFontResourceLoader);     // Catch: Throwable -> L13
            DeprecatedBridgeFontResourceLoader r4 = deprecatedBridgeFontResourceLoader;     // Catch: Throwable -> L13
            monitor-exit(lock$iv);
            return r4;
        L8:
            monitor-exit(lock$iv);
            return r3;
        L13:
            th = move-exception;
            throw th;
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver fontFamilyResolver) {
        this.fontFamilyResolver = fontFamilyResolver;
    }

    public static final /* synthetic */ Map access$getCache$cp() {
        return cache;
    }

    public static final /* synthetic */ SynchronizedObject access$getLock$cp() {
        return lock;
    }

    public static final /* synthetic */ void access$setCache$cp(Map r0) {
        cache = r0;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public Object load(Font font) {
        return FontFamily.Resolver.m6500resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo6481getStyle_LCdwA(), 0, 8, null).getValue();
    }

    static {
        Companion = new Companion(null);
        cache = new LinkedHashMap();
        lock = new SynchronizedObject();
    }
}
