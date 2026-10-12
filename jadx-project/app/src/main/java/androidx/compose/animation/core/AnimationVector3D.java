package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\bH\u0090\u0002¢\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\bH\u0016J\r\u0010\u001c\u001a\u00020\u0000H\u0010¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u001fH\u0010¢\u0006\u0002\b J\u001e\u0010!\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0003H\u0090\u0002¢\u0006\u0002\b#J\b\u0010$\u001a\u00020%H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector;", "v1", "", "v2", "v3", "(FFF)V", "size", "", "getSize$animation_core_release", "()I", "<set-?>", "getV1", "()F", "setV1$animation_core_release", "(F)V", "getV2", "setV2$animation_core_release", "getV3", "setV3$animation_core_release", "equals", "", "other", "", "get", "index", "get$animation_core_release", "hashCode", "newVector", "newVector$animation_core_release", "reset", "", "reset$animation_core_release", "set", "value", "set$animation_core_release", "toString", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimationVector3D extends AnimationVector {
    public static final int $stable = 0;
    private final int size;
    private float v1;
    private float v2;
    private float v3;

    static {
        $stable = 8;
    }

    public AnimationVector3D(float v1, float v2, float v3) {
        super(null);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.size = 3;
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

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector3D newVector$animation_core_release() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int index) {
        switch(index) {
            case 0: goto L7;
            case 1: goto L10;
            case 2: goto L9;
            default: goto L3;
        };
    L3:
        return 0.0f;
    L9:
        return this.v3;
    L10:
        return this.v2;
    L7:
        return this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int index, float value) {
        switch(index) {
            case 0: goto L6;
            case 1: goto L5;
            case 2: goto L4;
            default: goto L10;
        };
    L4:
        this.v3 = value;
        return;
    L5:
        this.v2 = value;
        return;
    L6:
        this.v1 = value;
        return;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3;
    }

    public boolean equals(Object other) {
        if ((other instanceof AnimationVector3D) == true) goto L5;
        return false;
    L5:
        if (((AnimationVector3D) other).v1 != this.v1) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        if (((AnimationVector3D) other).v2 != this.v2) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (((AnimationVector3D) other).v3 != this.v3) goto L17;
        boolean r2 = true;
    L18:
        if (r2 == true) goto L20;
        return false;
    L20:
        return true;
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
        return (((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3);
    }
}
