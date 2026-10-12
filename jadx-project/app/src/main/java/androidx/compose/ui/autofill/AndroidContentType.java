package androidx.compose.ui.autofill;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/autofill/AndroidContentType;", "Landroidx/compose/ui/autofill/ContentType;", "androidAutofillHints", "", "", "(Ljava/util/Set;)V", "getAndroidAutofillHints", "()Ljava/util/Set;", "plus", "other", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidContentType implements ContentType {
    private final Set<String> androidAutofillHints;

    public AndroidContentType(Set<String> r1) {
        this.androidAutofillHints = r1;
    }

    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    @Override // androidx.compose.ui.autofill.ContentType
    public ContentType plus(ContentType other) {
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        AndroidContentType r0 = (AndroidContentType) other;
        Set combinedValues = SetsKt.plus(this.androidAutofillHints, ((AndroidContentType) other).androidAutofillHints);
        return new AndroidContentType(combinedValues);
    }
}
