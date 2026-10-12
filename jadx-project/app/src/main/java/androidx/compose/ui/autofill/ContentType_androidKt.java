package androidx.compose.ui.autofill;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"contentHints", "", "", "Landroidx/compose/ui/autofill/ContentType;", "getContentHints", "(Landroidx/compose/ui/autofill/ContentType;)[Ljava/lang/String;", "ContentType", "contentHint", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContentType_androidKt {
    public static final ContentType ContentType(String contentHint) {
        return new AndroidContentType(SetsKt.setOf(contentHint));
    }

    public static final String[] getContentHints(ContentType $this$contentHints) {
        Intrinsics.checkNotNull($this$contentHints, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        Collection $this$toTypedArray$iv = ((AndroidContentType) $this$contentHints).getAndroidAutofillHints();
        return (String[]) $this$toTypedArray$iv.toArray(new String[0]);
    }
}
