package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: Resources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/res/ResourceIdCache;", "", "()V", "resIdPathMap", "Landroidx/collection/MutableIntObjectMap;", "Landroid/util/TypedValue;", "clear", "", "resolveResourcePath", "res", "Landroid/content/res/Resources;", "id", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceIdCache {
    public static final int $stable = 0;
    private final MutableIntObjectMap<TypedValue> resIdPathMap;

    static {
        $stable = 8;
    }

    public ResourceIdCache() {
        this.resIdPathMap = new MutableIntObjectMap(0, 1, null);
    }

    public final TypedValue resolveResourcePath(Resources res, int id) {
        monitor-enter(this);
        TypedValue value = this.resIdPathMap.get(id);     // Catch: Throwable -> L10
        if (value != null) goto L8;
        value = new TypedValue();     // Catch: Throwable -> L10
        res.getValue(id, value, true);     // Catch: Throwable -> L10
        this.resIdPathMap.put(id, value);     // Catch: Throwable -> L10
    L8:
        monitor-exit(this);
        return value;
    L10:
        th = move-exception;
        throw th;
    }

    public final void clear() {
        monitor-enter(this);
        this.resIdPathMap.clear();     // Catch: Throwable -> L7
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
