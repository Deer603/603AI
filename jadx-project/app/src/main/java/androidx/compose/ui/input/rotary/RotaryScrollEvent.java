package androidx.compose.ui.input.rotary;

import kotlin.Metadata;

/* JADX INFO: compiled from: RotaryScrollEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "verticalScrollPixels", "", "horizontalScrollPixels", "uptimeMillis", "", "inputDeviceId", "", "(FFJI)V", "getHorizontalScrollPixels", "()F", "getInputDeviceId", "()I", "getUptimeMillis", "()J", "getVerticalScrollPixels", "equals", "", "other", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RotaryScrollEvent {
    public static final int $stable = 0;
    private final float horizontalScrollPixels;
    private final int inputDeviceId;
    private final long uptimeMillis;
    private final float verticalScrollPixels;

    static {
    }

    public RotaryScrollEvent(float verticalScrollPixels, float horizontalScrollPixels, long uptimeMillis, int inputDeviceId) {
        this.verticalScrollPixels = verticalScrollPixels;
        this.horizontalScrollPixels = horizontalScrollPixels;
        this.uptimeMillis = uptimeMillis;
        this.inputDeviceId = inputDeviceId;
    }

    public final float getVerticalScrollPixels() {
        return this.verticalScrollPixels;
    }

    public final float getHorizontalScrollPixels() {
        return this.horizontalScrollPixels;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final int getInputDeviceId() {
        return this.inputDeviceId;
    }

    public boolean equals(Object other) {
        if ((other instanceof RotaryScrollEvent) == true) goto L5;
        return false;
    L5:
        if (((RotaryScrollEvent) other).verticalScrollPixels != this.verticalScrollPixels) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        if (((RotaryScrollEvent) other).horizontalScrollPixels != this.horizontalScrollPixels) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (((RotaryScrollEvent) other).uptimeMillis == this.uptimeMillis) goto L17;
        return false;
    L17:
        if (((RotaryScrollEvent) other).inputDeviceId == this.inputDeviceId) goto L20;
        return false;
    L20:
        return true;
    L12:
        r1 = false;
        goto L13
    L7:
        r0 = false;
        goto L8
    }

    public int hashCode() {
        int it = Float.hashCode(this.verticalScrollPixels);
        int it2 = (it * 31) + Float.hashCode(this.horizontalScrollPixels);
        int it3 = (it2 * 31) + Long.hashCode(this.uptimeMillis);
        return (it3 * 31) + Integer.hashCode(this.inputDeviceId);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.verticalScrollPixels + ",horizontalScrollPixels=" + this.horizontalScrollPixels + ",uptimeMillis=" + this.uptimeMillis + ",deviceId=" + this.inputDeviceId + ')';
    }
}
