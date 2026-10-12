package com.luchime.huiyuan;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CorpusExpander.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003JS\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/luchime/huiyuan/CorpusBlueprint;", "", "category", "", "keys", "", "perspectives", "actions", "checks", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getKeys", "()Ljava/util/List;", "getPerspectives", "getActions", "getChecks", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CorpusBlueprint {
    public static final int $stable = 8;
    private final List<String> actions;
    private final String category;
    private final List<String> checks;
    private final List<String> keys;
    private final List<String> perspectives;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CorpusBlueprint copy$default(CorpusBlueprint corpusBlueprint, String str, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = corpusBlueprint.category;
        }
        if ((i & 2) != 0) {
            list = corpusBlueprint.keys;
        }
        if ((i & 4) != 0) {
            list2 = corpusBlueprint.perspectives;
        }
        if ((i & 8) != 0) {
            list3 = corpusBlueprint.actions;
        }
        if ((i & 16) != 0) {
            list4 = corpusBlueprint.checks;
        }
        List list5 = list4;
        List list6 = list2;
        return corpusBlueprint.copy(str, list, list6, list3, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
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

    public final CorpusBlueprint copy(String category, List<String> keys, List<String> perspectives, List<String> actions, List<String> checks) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(perspectives, "perspectives");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(checks, "checks");
        return new CorpusBlueprint(category, keys, perspectives, actions, checks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CorpusBlueprint)) {
            return false;
        }
        CorpusBlueprint corpusBlueprint = (CorpusBlueprint) other;
        return Intrinsics.areEqual(this.category, corpusBlueprint.category) && Intrinsics.areEqual(this.keys, corpusBlueprint.keys) && Intrinsics.areEqual(this.perspectives, corpusBlueprint.perspectives) && Intrinsics.areEqual(this.actions, corpusBlueprint.actions) && Intrinsics.areEqual(this.checks, corpusBlueprint.checks);
    }

    public int hashCode() {
        return (((((((this.category.hashCode() * 31) + this.keys.hashCode()) * 31) + this.perspectives.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.checks.hashCode();
    }

    public String toString() {
        return "CorpusBlueprint(category=" + this.category + ", keys=" + this.keys + ", perspectives=" + this.perspectives + ", actions=" + this.actions + ", checks=" + this.checks + ")";
    }

    public CorpusBlueprint(String category, List<String> keys, List<String> perspectives, List<String> actions, List<String> checks) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(perspectives, "perspectives");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(checks, "checks");
        this.category = category;
        this.keys = keys;
        this.perspectives = perspectives;
        this.actions = actions;
        this.checks = checks;
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
