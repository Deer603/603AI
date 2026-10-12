package androidx.compose.ui.platform;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/ValueElement;", "", HintConstants.AUTOFILL_HINT_NAME, "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ValueElement {
    public static final int $stable = 0;
    private final String name;
    private final Object value;

    static {
        $stable = 8;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement r0, String r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.value;
    L9:
        return r0.copy(r1, r2);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final ValueElement copy(String r2, Object r3) {
        return new ValueElement(r2, r3);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof ValueElement) == true) goto L8;
        return false;
    L8:
        ValueElement r1 = (ValueElement) r6;
        if (Intrinsics.areEqual(this.name, r1.name) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.value, r1.value) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r1 = this.name.hashCode() * 31;
        if (this.value != null) goto L5;
        int r2 = 0;
    L7:
        return r1 + r2;
    L5:
        r2 = this.value.hashCode();
        goto L7
    }

    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }

    public ValueElement(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }
}
