package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "()V", "createdSize", "Landroidx/compose/ui/geometry/Size;", "J", "internalShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "applyTo", "", "size", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "createShader", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo4335createShaderuvyYCjk(long r1);

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m4202getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public final void mo4313applyToPq9zytI(long size, Paint p, float alpha) {
        Shader shader = this.internalShader;
        if (shader == null) goto L7;
        if (Size.m4190equalsimpl0(this.createdSize, size) == false) goto L7;
    L11:
        if (Color.m4367equalsimpl0(p.mo4239getColor0d7_KjU(), Color.Companion.m4392getBlack0d7_KjU()) == true) goto L14;
        p.mo4245setColor8_81llA(Color.Companion.m4392getBlack0d7_KjU());
    L14:
        if (Intrinsics.areEqual(p.getShader(), shader) == true) goto L17;
        p.setShader(shader);
    L17:
        if (p.getAlpha() != alpha) goto L19;
        boolean r1 = true;
    L20:
        if (r1 == true) goto L23;
        p.setAlpha(alpha);
        return;
    L23:
        return;
    L19:
        r1 = false;
    L7:
        if (Size.m4196isEmptyimpl(size) == false) goto L9;
        shader = null;
        this.internalShader = null;
        this.createdSize = Size.Companion.m4202getUnspecifiedNHjbRc();
        goto L11
    L9:
        Shader it = mo4335createShaderuvyYCjk(size);
        this.internalShader = it;
        shader = it;
        this.createdSize = size;
        goto L11
    }
}
