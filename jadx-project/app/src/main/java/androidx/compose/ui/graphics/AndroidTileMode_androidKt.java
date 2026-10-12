package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTileMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidTileMode_androidKt {

    /* JADX INFO: compiled from: AndroidTileMode.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Shader.TileMode.values().length];
            r0[Shader.TileMode.CLAMP.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[Shader.TileMode.MIRROR.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[Shader.TileMode.REPEAT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m4270isSupported0vamqd0(int $this$isSupported_u2d0vamqd0) {
        if (Build.VERSION.SDK_INT < 31) goto L5;
    L8:
        return true;
    L5:
        if (TileMode.m4735equalsimpl0($this$isSupported_u2d0vamqd0, TileMode.Companion.m4740getDecal3opZhB0()) == false) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m4271toAndroidTileMode0vamqd0(int $this$toAndroidTileMode_u2d0vamqd0) {
        if (TileMode.m4735equalsimpl0($this$toAndroidTileMode_u2d0vamqd0, TileMode.Companion.m4739getClamp3opZhB0()) == false) goto L6;
        return Shader.TileMode.CLAMP;
    L6:
        if (TileMode.m4735equalsimpl0($this$toAndroidTileMode_u2d0vamqd0, TileMode.Companion.m4742getRepeated3opZhB0()) == false) goto L9;
        return Shader.TileMode.REPEAT;
    L9:
        if (TileMode.m4735equalsimpl0($this$toAndroidTileMode_u2d0vamqd0, TileMode.Companion.m4741getMirror3opZhB0()) == false) goto L12;
        return Shader.TileMode.MIRROR;
    L12:
        if (TileMode.m4735equalsimpl0($this$toAndroidTileMode_u2d0vamqd0, TileMode.Companion.m4740getDecal3opZhB0()) == false) goto L18;
        if (Build.VERSION.SDK_INT < 31) goto L23;
        return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
    L23:
        return Shader.TileMode.CLAMP;
    L18:
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode $this$toComposeTileMode) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$toComposeTileMode.ordinal()]) {
            case 1: goto L17;
            case 2: goto L16;
            case 3: goto L15;
            default: goto L5;
        };
    L5:
        if (Build.VERSION.SDK_INT < 31) goto L13;
        if ($this$toComposeTileMode != Shader.TileMode.DECAL) goto L13;
        return TileModeVerificationHelper.INSTANCE.m4743getComposeTileModeDecal3opZhB0();
    L13:
        return TileMode.Companion.m4739getClamp3opZhB0();
    L15:
        return TileMode.Companion.m4742getRepeated3opZhB0();
    L16:
        return TileMode.Companion.m4741getMirror3opZhB0();
    L17:
        return TileMode.Companion.m4739getClamp3opZhB0();
    }
}
