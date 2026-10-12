package androidx.compose.ui.tooling.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTree.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Landroidx/compose/ui/tooling/data/ParameterInformation;", "", HintConstants.AUTOFILL_HINT_NAME, "", "value", "fromDefault", "", "static", "compared", "inlineClass", "stable", "(Ljava/lang/String;Ljava/lang/Object;ZZZLjava/lang/String;Z)V", "getCompared", "()Z", "getFromDefault", "getInlineClass", "()Ljava/lang/String;", "getName", "getStable", "getStatic", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ParameterInformation {
    public static final int $stable = 0;
    private final boolean compared;
    private final boolean fromDefault;
    private final String inlineClass;
    private final String name;
    private final boolean stable;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    private final boolean f84static;
    private final Object value;

    static {
        $stable = 8;
    }

    public static /* synthetic */ ParameterInformation copy$default(ParameterInformation r0, String r1, Object r2, boolean r3, boolean r4, boolean r5, String r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.value;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.fromDefault;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.f84static;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.compared;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.inlineClass;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.stable;
    L23:
        String r10 = r6;
        boolean r11 = r7;
        boolean r12 = r4;
        boolean r13 = r5;
        boolean r14 = r3;
        String r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.fromDefault;
    }

    public final boolean component4() {
        return this.f84static;
    }

    public final boolean component5() {
        return this.compared;
    }

    public final String component6() {
        return this.inlineClass;
    }

    public final boolean component7() {
        return this.stable;
    }

    public final ParameterInformation copy(String r9, Object r10, boolean r11, boolean r12, boolean r13, String r14, boolean r15) {
        return new ParameterInformation(r9, r10, r11, r12, r13, r14, r15);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof ParameterInformation) == true) goto L8;
        return false;
    L8:
        ParameterInformation r1 = (ParameterInformation) r6;
        if (Intrinsics.areEqual(this.name, r1.name) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.value, r1.value) == true) goto L15;
        return false;
    L15:
        if (this.fromDefault == r1.fromDefault) goto L18;
        return false;
    L18:
        if (this.f84static == r1.f84static) goto L21;
        return false;
    L21:
        if (this.compared == r1.compared) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.inlineClass, r1.inlineClass) == true) goto L27;
        return false;
    L27:
        if (this.stable == r1.stable) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int r1 = this.name.hashCode() * 31;
        int r3 = 0;
        if (this.value != null) goto L5;
        int r2 = 0;
    L6:
        int r4 = (((((((r1 + r2) * 31) + Boolean.hashCode(this.fromDefault)) * 31) + Boolean.hashCode(this.f84static)) * 31) + Boolean.hashCode(this.compared)) * 31;
        if (this.inlineClass == null) goto L11;
        r3 = this.inlineClass.hashCode();
    L11:
        return ((r4 + r3) * 31) + Boolean.hashCode(this.stable);
    L5:
        r2 = this.value.hashCode();
        goto L6
    }

    public String toString() {
        return "ParameterInformation(name=" + this.name + ", value=" + this.value + ", fromDefault=" + this.fromDefault + ", static=" + this.f84static + ", compared=" + this.compared + ", inlineClass=" + this.inlineClass + ", stable=" + this.stable + ')';
    }

    public ParameterInformation(String name, Object value, boolean fromDefault, boolean r4, boolean compared, String inlineClass, boolean stable) {
        this.name = name;
        this.value = value;
        this.fromDefault = fromDefault;
        this.f84static = r4;
        this.compared = compared;
        this.inlineClass = inlineClass;
        this.stable = stable;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    public final boolean getFromDefault() {
        return this.fromDefault;
    }

    public final boolean getStatic() {
        return this.f84static;
    }

    public final boolean getCompared() {
        return this.compared;
    }

    public final String getInlineClass() {
        return this.inlineClass;
    }

    public final boolean getStable() {
        return this.stable;
    }
}
