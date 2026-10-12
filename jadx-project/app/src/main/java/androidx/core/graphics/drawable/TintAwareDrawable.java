package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes4.dex */
public interface TintAwareDrawable {
    void setTint(int r1);

    void setTintList(ColorStateList r1);

    void setTintMode(PorterDuff.Mode r1);
}
