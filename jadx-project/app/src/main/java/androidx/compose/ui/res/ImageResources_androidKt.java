package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"imageResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "res", "Landroid/content/res/Resources;", "id", "", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion $this$imageResource, Resources res, int id) {
        Drawable r0 = res.getDrawable(id, null);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) r0).getBitmap());
    }

    public static final ImageBitmap imageResource(ImageBitmap.Companion $this$imageResource, int id, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -304919470, "C(imageResource)52@1984L11,53@2012L25,56@2172L46:ImageResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-304919470, $changed, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:51)");
    L5:
        Resources resources = Resources_androidKt.resources($composer, 0);
        ComposerKt.sourceInformationMarkerStart($composer, 552187579, "CC(remember):ImageResources.android.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = new TypedValue();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        TypedValue value = (TypedValue) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        resources.getValue(id, value, true);
        CharSequence r3 = value.string;
        Intrinsics.checkNotNull(r3);
        String key = r3.toString();
        ComposerKt.sourceInformationMarkerStart($composer, 552192720, "CC(remember):ImageResources.android.kt#9igjgp");
        boolean invalid$iv = $composer.changed(key);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L12;
    L15:
        Object value$iv2 = imageResource($this$imageResource, resources, id);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L16:
        ImageBitmap r6 = (ImageBitmap) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L12:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        goto L15
    }
}
