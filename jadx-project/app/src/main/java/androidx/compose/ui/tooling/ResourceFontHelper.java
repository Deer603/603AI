package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutlibFontResourceLoader.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/tooling/ResourceFontHelper;", "", "()V", "load", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "font", "Landroidx/compose/ui/text/font/ResourceFont;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ResourceFontHelper {
    public static final ResourceFontHelper INSTANCE = null;

    static {
        INSTANCE = new ResourceFontHelper();
    }

    private ResourceFontHelper() {
    }

    public final Typeface load(Context context, ResourceFont font) {
        return context.getResources().getFont(font.getResId());
    }
}
