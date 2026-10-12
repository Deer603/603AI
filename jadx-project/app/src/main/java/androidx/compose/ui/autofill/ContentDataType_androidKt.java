package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentDataType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"dataType", "", "Landroidx/compose/ui/autofill/ContentDataType;", "getDataType", "(Landroidx/compose/ui/autofill/ContentDataType;)I", "ContentDataType", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContentDataType_androidKt {
    public static final ContentDataType ContentDataType(int dataType) {
        return AndroidContentDataType.m3954boximpl(AndroidContentDataType.m3955constructorimpl(dataType));
    }

    public static final int getDataType(ContentDataType $this$dataType) {
        Intrinsics.checkNotNull($this$dataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) $this$dataType).m3960unboximpl();
    }
}
