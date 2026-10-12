package com.luchime.huiyuan;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CorpusExpander.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003JS\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/luchime/huiyuan/CorpusBlueprint;", "", "category", "", "keys", "", "perspectives", "actions", "checks", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getKeys", "()Ljava/util/List;", "getPerspectives", "getActions", "getChecks", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CorpusBlueprint {
    public static final int $stable = 0;
    private final List<String> actions;
    private final String category;
    private final List<String> checks;
    private final List<String> keys;
    private final List<String> perspectives;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CorpusBlueprint copy$default(CorpusBlueprint r0, String r1, List r2, List r3, List r4, List r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.category;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.keys;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.perspectives;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.actions;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.checks;
    L17:
        List r8 = r4;
        List r9 = r5;
        List r10 = r3;
        String r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final String component1() {
        return this.category;
    }

    public final List<String> component2() {
        return this.keys;
    }

    public final List<String> component3() {
        return this.perspectives;
    }

    public final List<String> component4() {
        return this.actions;
    }

    public final List<String> component5() {
        return this.checks;
    }

    public final CorpusBlueprint copy(String r8, List<String> r9, List<String> r10, List<String> r11, List<String> r12) {
        Intrinsics.checkNotNullParameter(r8, "category");
        Intrinsics.checkNotNullParameter(r9, "keys");
        Intrinsics.checkNotNullParameter(r10, "perspectives");
        Intrinsics.checkNotNullParameter(r11, "actions");
        Intrinsics.checkNotNullParameter(r12, "checks");
        return new CorpusBlueprint(r8, r9, r10, r11, r12);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof CorpusBlueprint) == true) goto L8;
        return false;
    L8:
        CorpusBlueprint r1 = (CorpusBlueprint) r6;
        if (Intrinsics.areEqual(this.category, r1.category) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.keys, r1.keys) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.perspectives, r1.perspectives) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.actions, r1.actions) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.checks, r1.checks) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.category.hashCode() * 31) + this.keys.hashCode()) * 31) + this.perspectives.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.checks.hashCode();
    }

    public String toString() {
        return "CorpusBlueprint(category=" + this.category + ", keys=" + this.keys + ", perspectives=" + this.perspectives + ", actions=" + this.actions + ", checks=" + this.checks + ")";
    }

    public CorpusBlueprint(String category, List<String> r3, List<String> r4, List<String> r5, List<String> r6) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(r3, "keys");
        Intrinsics.checkNotNullParameter(r4, "perspectives");
        Intrinsics.checkNotNullParameter(r5, "actions");
        Intrinsics.checkNotNullParameter(r6, "checks");
        this.category = category;
        this.keys = r3;
        this.perspectives = r4;
        this.actions = r5;
        this.checks = r6;
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<String> getKeys() {
        return this.keys;
    }

    public final List<String> getPerspectives() {
        return this.perspectives;
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final List<String> getChecks() {
        return this.checks;
    }
}
