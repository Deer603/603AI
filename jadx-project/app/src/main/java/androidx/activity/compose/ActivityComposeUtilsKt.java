package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityComposeUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"findOwner", "T", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(Context r4) {
        T r1 = (T) r4;
    L4:
        if ((r1 instanceof ContextWrapper) == false) goto L9;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r1 instanceof Object) == true) goto L7;
        r1 = (T) r1.getBaseContext();
        goto L4
    L7:
        return r1;
    L9:
        return null;
    }
}
