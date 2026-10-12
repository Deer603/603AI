package androidx.compose.ui.autofill;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Autofill.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "autofillTypes", "", "Landroidx/compose/ui/autofill/AutofillType;", "boundingBox", "Landroidx/compose/ui/geometry/Rect;", "onFill", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)V", "getAutofillTypes", "()Ljava/util/List;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "id", "", "getId", "()I", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "equals", "", "other", "hashCode", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AutofillNode {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Object lock = null;
    private static int previousId;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final Function1<String, Unit> onFill;

    /* JADX INFO: compiled from: Autofill.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "()V", "lock", "previousId", "", "generateId", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ int access$generateId(Companion $this) {
            return $this.generateId();
        }

        private final int generateId() {
            Object lock$iv = AutofillNode.access$getLock$cp();
            monitor-enter(lock$iv);
            Companion r3 = AutofillNode.Companion;     // Catch: Throwable -> L8
            AutofillNode.access$setPreviousId$cp(AutofillNode.access$getPreviousId$cp() + 1);     // Catch: Throwable -> L8
            int r4 = AutofillNode.access$getPreviousId$cp();     // Catch: Throwable -> L8
            monitor-exit(lock$iv);
            return r4;
        L8:
            th = move-exception;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> r2, Rect boundingBox, Function1<? super String, Unit> r4) {
        this.autofillTypes = r2;
        this.boundingBox = boundingBox;
        this.onFill = r4;
        if (ComposeUiFlags.isSemanticAutofillEnabled == false) goto L5;
        int r0 = SemanticsModifierKt.generateSemanticsId();
    L6:
        this.id = r0;
        return;
    L5:
        r0 = Companion.access$generateId(Companion);
        goto L6
    }

    public static final /* synthetic */ Object access$getLock$cp() {
        return lock;
    }

    public static final /* synthetic */ int access$getPreviousId$cp() {
        return previousId;
    }

    public static final /* synthetic */ void access$setPreviousId$cp(int r0) {
        previousId = r0;
    }

    public /* synthetic */ AutofillNode(List r1, Rect r2, Function1 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = CollectionsKt.emptyList();
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2, r3);
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final void setBoundingBox(Rect r1) {
        this.boundingBox = r1;
    }

    public final Function1<String, Unit> getOnFill() {
        return this.onFill;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        Object ref$iv = Companion;
        if (ref$iv != null) goto L5;
        ref$iv = new Object();
    L5:
        lock = ref$iv;
    }

    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof AutofillNode) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.autofillTypes, ((AutofillNode) other).autofillTypes) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.boundingBox, ((AutofillNode) other).boundingBox) == true) goto L15;
        return false;
    L15:
        if (this.onFill == ((AutofillNode) other).onFill) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = this.autofillTypes.hashCode();
        int r1 = result * 31;
        Rect r2 = this.boundingBox;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result2 = r1 + r4;
        int result3 = result2 * 31;
        Function1<String, Unit> r5 = this.onFill;
        if (r5 == null) goto L10;
        r3 = r5.hashCode();
    L10:
        return result3 + r3;
    L5:
        r4 = 0;
        goto L6
    }
}
