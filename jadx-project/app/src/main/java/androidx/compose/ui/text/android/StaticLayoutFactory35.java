package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory35;", "", "()V", "disableUseBoundsForWidth", "", "builder", "Landroid/text/StaticLayout$Builder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StaticLayoutFactory35 {
    public static final StaticLayoutFactory35 INSTANCE = null;

    static {
        INSTANCE = new StaticLayoutFactory35();
    }

    private StaticLayoutFactory35() {
    }

    @JvmStatic
    public static final void disableUseBoundsForWidth(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }
}
