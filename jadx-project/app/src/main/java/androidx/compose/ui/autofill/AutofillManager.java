package androidx.compose.ui.autofill;

import kotlin.Metadata;

/* JADX INFO: compiled from: AutofillManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/autofill/AutofillManager;", "", "()V", "cancel", "", "commit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AutofillManager {
    public static final int $stable = 0;

    static {
    }

    public abstract void cancel();

    public abstract void commit();

    public AutofillManager() {
    }
}
