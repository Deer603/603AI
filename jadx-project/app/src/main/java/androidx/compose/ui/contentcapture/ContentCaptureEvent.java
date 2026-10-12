package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "", "id", "", "timestamp", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "structureCompat", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "(IJLandroidx/compose/ui/contentcapture/ContentCaptureEventType;Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "getId", "()I", "getStructureCompat", "()Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "getTimestamp", "()J", "getType", "()Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ContentCaptureEvent {
    private final int id;
    private final ViewStructureCompat structureCompat;
    private final long timestamp;
    private final ContentCaptureEventType type;

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent r0, int r1, long r2, ContentCaptureEventType r4, ViewStructureCompat r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.timestamp;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = r0.type;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = r0.structureCompat;
    L14:
        long r8 = r2;
        int r3 = r1;
        return r0.copy(r3, r8, r4, r5);
    }

    public final int component1() {
        return this.id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final ContentCaptureEventType component3() {
        return this.type;
    }

    public final ViewStructureCompat component4() {
        return this.structureCompat;
    }

    public final ContentCaptureEvent copy(int r7, long r8, ContentCaptureEventType r10, ViewStructureCompat r11) {
        return new ContentCaptureEvent(r7, r8, r10, r11);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ContentCaptureEvent) == true) goto L8;
        return false;
    L8:
        ContentCaptureEvent r1 = (ContentCaptureEvent) r8;
        if (this.id == r1.id) goto L12;
        return false;
    L12:
        if (this.timestamp == r1.timestamp) goto L15;
        return false;
    L15:
        if (this.type == r1.type) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.structureCompat, r1.structureCompat) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r1 = ((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.timestamp)) * 31) + this.type.hashCode()) * 31;
        if (this.structureCompat != null) goto L5;
        int r2 = 0;
    L7:
        return r1 + r2;
    L5:
        r2 = this.structureCompat.hashCode();
        goto L7
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }

    public ContentCaptureEvent(int id, long timestamp, ContentCaptureEventType type, ViewStructureCompat structureCompat) {
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
        this.structureCompat = structureCompat;
    }

    public final int getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }
}
