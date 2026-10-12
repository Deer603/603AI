package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u0007\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"PickVisualMediaRequest", "Landroidx/activity/result/PickVisualMediaRequest;", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "maxItems", "", "isOrderedSelection", "", "defaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "accentColor", "", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PickVisualMediaRequestKt {
    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageAndVideo r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    L6:
        return PickVisualMediaRequest(r0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that takes an optional maxItems")
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageAndVideo r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    L6:
        if ((r2 & 2) == 0) goto L9;
        r1 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
    L9:
        return PickVisualMediaRequest(r0, r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that take optional isOrderedSelection and defaultTab")
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, int maxItems) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(maxItems).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.ImageAndVideo r0, int r1, boolean r2, ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r0 = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r1 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r2 = false;
    L12:
        if ((r4 & 8) == 0) goto L15;
        r3 = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
    L15:
        return PickVisualMediaRequest(r0, r1, r2, r3);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, int maxItems, boolean isOrderedSelection, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(maxItems).setOrderedSelection(isOrderedSelection).setDefaultTab(defaultTab).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(long r6, ActivityResultContracts.PickVisualMedia.VisualMediaType r8, int r9, boolean r10, ActivityResultContracts.PickVisualMedia.DefaultTab r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        ActivityResultContracts.PickVisualMedia.VisualMediaType r2 = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    L7:
        if ((r12 & 4) == 0) goto L9;
        int r3 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
    L11:
        if ((r12 & 8) == 0) goto L13;
        boolean r4 = false;
    L15:
        if ((r12 & 16) == 0) goto L17;
        ActivityResultContracts.PickVisualMedia.DefaultTab r5 = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
    L19:
        return PickVisualMediaRequest(r6, r2, r3, r4, r5);
    L17:
        r5 = r11;
        goto L19
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(long accentColor, ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, int maxItems, boolean isOrderedSelection, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(maxItems).setOrderedSelection(isOrderedSelection).setDefaultTab(defaultTab).setAccentColor(accentColor).build();
    }
}
