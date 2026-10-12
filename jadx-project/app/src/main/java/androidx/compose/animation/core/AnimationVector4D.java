package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\tH\u0090\u0002¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\tH\u0016J\r\u0010\u001f\u001a\u00020\u0000H\u0010¢\u0006\u0002\b J\r\u0010!\u001a\u00020\"H\u0010¢\u0006\u0002\b#J\u001e\u0010$\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0003H\u0090\u0002¢\u0006\u0002\b&J\b\u0010'\u001a\u00020(H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006)"}, d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "v1", "", "v2", "v3", "v4", "(FFFF)V", "size", "", "getSize$animation_core_release", "()I", "<set-?>", "getV1", "()F", "setV1$animation_core_release", "(F)V", "getV2", "setV2$animation_core_release", "getV3", "setV3$animation_core_release", "getV4", "setV4$animation_core_release", "equals", "", "other", "", "get", "index", "get$animation_core_release", "hashCode", "newVector", "newVector$animation_core_release", "reset", "", "reset$animation_core_release", "set", "value", "set$animation_core_release", "toString", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 0;
    private final int size;
    private float v1;
    private float v2;
    private float v3;
    private float v4;

    static {
        $stable = 8;
    }

    public AnimationVector4D(float v1, float v2, float v3, float v4) {
        super(null);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.size = 4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public /* bridge */ /* synthetic */ AnimationVector newVector$animation_core_release() {
        return newVector$animation_core_release();
    }

    public final float getV1() {
        return this.v1;
    }

    public final void setV1$animation_core_release(float r1) {
        this.v1 = r1;
    }

    public final float getV2() {
        return this.v2;
    }

    public final void setV2$animation_core_release(float r1) {
        this.v2 = r1;
    }

    public final float getV3() {
        return this.v3;
    }

    public final void setV3$animation_core_release(float r1) {
        this.v3 = r1;
    }

    public final float getV4() {
        return this.v4;
    }

    public final void setV4$animation_core_release(float r1) {
        this.v4 = r1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int index) {
        switch(index) {
            case 0: goto L8;
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            default: goto L3;
        };
    L3:
        return 0.0f;
    L10:
        return this.v4;
    L11:
        return this.v3;
    L12:
        return this.v2;
    L8:
        return this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int index, float value) {
        switch(index) {
            case 0: goto L7;
            case 1: goto L6;
            case 2: goto L5;
            case 3: goto L4;
            default: goto L12;
        };
    L4:
        this.v4 = value;
        return;
    L5:
        this.v3 = value;
        return;
    L6:
        this.v2 = value;
        return;
    L7:
        this.v1 = value;
        return;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }

    public boolean equals(Object other) {
        if ((other instanceof AnimationVector4D) == true) goto L5;
        return false;
    L5:
        if (((AnimationVector4D) other).v1 != this.v1) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        if (((AnimationVector4D) other).v2 != this.v2) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (((AnimationVector4D) other).v3 != this.v3) goto L17;
        boolean r2 = true;
    L18:
        if (r2 == true) goto L20;
        return false;
    L20:
        if (((AnimationVector4D) other).v4 != this.v4) goto L22;
        boolean r3 = true;
    L23:
        if (r3 == true) goto L26;
        return false;
    L26:
        return true;
    L22:
        r3 = false;
        goto L23
    L17:
        r2 = false;
        goto L18
    L12:
        r1 = false;
        goto L13
    L7:
        r0 = false;
        goto L8
    }

    public int hashCode() {
        return (((((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3)) * 31) + Float.hashCode(this.v4);
    }
}
