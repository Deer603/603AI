package androidx.compose.ui.semantics;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0017J\u001d\u0010\u0018\u001a\u00020\b\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0004H\u0086\u0002J\r\u0010\u001b\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001cJ\u0006\u0010\u001d\u001a\u00020\u0000J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\"\u0010 \u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0004H\u0086\u0002¢\u0006\u0002\u0010!J-\u0010\"\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00190$¢\u0006\u0002\u0010%J1\u0010&\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00042\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00190$¢\u0006\u0002\u0010%J\b\u0010'\u001a\u00020(H\u0016J!\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030*H\u0096\u0002J\u0015\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0002\b-J*\u0010.\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00042\u0006\u0010/\u001a\u0002H\u0019H\u0096\u0002¢\u0006\u0002\u00100J\b\u00101\u001a\u000202H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\"\u0010\u000e\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00063"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "()V", "isClearingSemantics", "", "()Z", "setClearingSemantics", "(Z)V", "isMergingSemanticsOfDescendants", "setMergingSemanticsOfDescendants", "mapWrapper", "", "props", "Landroidx/collection/MutableScatterMap;", "getProps$ui_release", "()Landroidx/collection/MutableScatterMap;", "collapsePeer", "", "peer", "collapsePeer$ui_release", "contains", "T", "key", "containsImportantForAccessibility", "containsImportantForAccessibility$ui_release", "copy", "equals", "other", "get", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "getOrElse", "defaultValue", "Lkotlin/Function0;", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "hashCode", "", "iterator", "", "mergeChild", "child", "mergeChild$ui_release", "set", "value", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMappedMarker {
    public static final int $stable = 0;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private Map<SemanticsPropertyKey<?>, ? extends Object> mapWrapper;
    private final MutableScatterMap<SemanticsPropertyKey<?>, Object> props;

    static {
        $stable = 8;
    }

    public SemanticsConfiguration() {
        this.props = ScatterMapKt.mutableScatterMapOf();
    }

    public final MutableScatterMap<SemanticsPropertyKey<?>, Object> getProps$ui_release() {
        return this.props;
    }

    public final <T> T get(SemanticsPropertyKey<T> r7) {
        T r2 = (T) this.props.get(r7);
        if (r2 == null) goto L6;
        return r2;
    L6:
        throw new IllegalStateException("Key not present: " + r7 + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(SemanticsPropertyKey<T> r4, Function0<? extends T> r5) {
        T r2 = (T) this.props.get(r4);
        if (r2 == null) goto L5;
        return r2;
    L5:
        return r5.invoke();
    }

    public final <T> T getOrElseNullable(SemanticsPropertyKey<T> r4, Function0<? extends T> r5) {
        T r2 = (T) this.props.get(r4);
        if (r2 == null) goto L5;
        return r2;
    L5:
        return r5.invoke();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map<SemanticsPropertyKey<?>, ? extends Object> r0 = this.mapWrapper;
        if (r0 != null) goto L6;
        r0 = this.props.asMap();
        this.mapWrapper = r0;
    L6:
        return r0.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(SemanticsPropertyKey<T> r6, T r7) {
        if ((r7 instanceof AccessibilityAction) == true) goto L5;
    L13:
        this.props.set(r6, r7);
        return;
    L5:
        if (contains(r6) == false) goto L13;
        Object r0 = this.props.get(r6);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction prev = (AccessibilityAction) r0;
        MutableScatterMap<SemanticsPropertyKey<?>, Object> r1 = this.props;
        String r3 = ((AccessibilityAction) r7).getLabel();
        if (r3 != null) goto L9;
        r3 = prev.getLabel();
    L9:
        Function r4 = ((AccessibilityAction) r7).getAction();
        if (r4 != null) goto L12;
        r4 = prev.getAction();
    L12:
        r1.set(r6, new AccessibilityAction(r3, r4));
    }

    public final <T> boolean contains(SemanticsPropertyKey<T> r2) {
        return this.props.containsKey(r2);
    }

    public final boolean containsImportantForAccessibility$ui_release() {
        ScatterMap this_$iv = this.props;
        Object[] k$iv$iv = this_$iv.keys;
        Object[] v$iv$iv = this_$iv.values;
        long[] m$iv$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L22;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        long slot$iv$iv$iv2 = slot$iv$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L19;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L18;
        long value$iv$iv$iv$iv = slot$iv$iv$iv2 & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r15 = true;
    L12:
        if (r15 == false) goto L17;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object key$iv = k$iv$iv[index$iv$iv$iv];
        Object r22 = v$iv$iv[index$iv$iv$iv];
        SemanticsPropertyKey key = (SemanticsPropertyKey) key$iv;
        if (key.isImportantForAccessibility$ui_release() == false) goto L17;
        return true;
    L17:
        slot$iv$iv$iv2 = slot$iv$iv$iv2 >> 8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        goto L7
    L11:
        r15 = false;
        goto L12
    L18:
        if (bitCount$iv$iv$iv != 8) goto L22;
    L19:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L22;
        i$iv$iv$iv = i$iv$iv$iv + 1;
    L22:
        return false;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void setMergingSemanticsOfDescendants(boolean r1) {
        this.isMergingSemanticsOfDescendants = r1;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean r1) {
        this.isClearingSemantics = r1;
    }

    public final void mergeChild$ui_release(SemanticsConfiguration child) {
        ScatterMap this_$iv = child.props;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L29;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r19 = k$iv[index$iv$iv];
        int r110 = r2;
        Object nextValue = v$iv[index$iv$iv];
        int $i$f$forEach2 = $i$f$forEach;
        SemanticsPropertyKey<?> r3 = (SemanticsPropertyKey) r19;
        Object[] k$iv2 = k$iv;
        Object existingValue = this.props.get(r3);
        Object[] v$iv2 = v$iv;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
        Object mergeResult = r3.merge(existingValue, nextValue);
        if (mergeResult == null) goto L19;
        this.props.set(r3, mergeResult);
    L19:
        slot$iv$iv = slot$iv$iv >> r110;
        j$iv$iv = j$iv$iv + 1;
        r2 = r110;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        v$iv = v$iv2;
        goto L7
    L18:
        r110 = r2;
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        v$iv2 = v$iv;
        goto L19
    L11:
        r18 = false;
        goto L12
    L20:
        int $i$f$forEach3 = $i$f$forEach;
        Object[] k$iv3 = k$iv;
        Object[] v$iv3 = v$iv;
        if (bitCount$iv$iv != r2) goto L36;
    L24:
        if (i$iv$iv == lastIndex$iv$iv) goto L37;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach3;
        k$iv = k$iv3;
        v$iv = v$iv3;
        goto L4
    L37:
        return;
    L36:
        return;
    L23:
        $i$f$forEach3 = $i$f$forEach;
        k$iv3 = k$iv;
        v$iv3 = v$iv;
        goto L24
    }

    public final void collapsePeer$ui_release(SemanticsConfiguration peer) {
        SemanticsConfiguration r0 = this;
        if (peer.isMergingSemanticsOfDescendants == false) goto L6;
        r0.isMergingSemanticsOfDescendants = true;
    L6:
        if (peer.isClearingSemantics == false) goto L8;
        r0.isClearingSemantics = true;
    L8:
        ScatterMap this_$iv = peer.props;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L44;
    L10:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L38;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L13:
        if (j$iv$iv >= bitCount$iv$iv) goto L35;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L17;
        boolean r19 = true;
    L18:
        if (r19 == false) goto L33;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r110 = k$iv[index$iv$iv];
        int r20 = r4;
        Object nextValue = v$iv[index$iv$iv];
        SemanticsPropertyKey<?> r1 = (SemanticsPropertyKey) r110;
        ScatterMap this_$iv2 = this_$iv;
        if (r0.props.contains(r1) == true) goto L23;
        r0.props.set(r1, nextValue);
    L34:
        slot$iv$iv = slot$iv$iv >> r20;
        j$iv$iv = j$iv$iv + 1;
        r0 = this;
        r4 = r20;
        this_$iv = this_$iv2;
        k$iv = k$iv;
        goto L13
    L23:
        if ((nextValue instanceof AccessibilityAction) == false) goto L34;
        Object r2 = r0.props.get(r1);
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction value = (AccessibilityAction) r2;
        MutableScatterMap<SemanticsPropertyKey<?>, Object> r5 = r0.props;
        String r23 = value.getLabel();
        if (r23 != null) goto L27;
        r23 = ((AccessibilityAction) nextValue).getLabel();
    L27:
        String r3 = r23;
        Function r24 = value.getAction();
        if (r24 != null) goto L30;
        r24 = ((AccessibilityAction) nextValue).getAction();
    L30:
        r5.set(r1, new AccessibilityAction(r3, r24));
        goto L34
    L33:
        this_$iv2 = this_$iv;
        r20 = r4;
        goto L34
    L17:
        r19 = false;
        goto L18
    L35:
        ScatterMap this_$iv3 = this_$iv;
        Object[] k$iv2 = k$iv;
        if (bitCount$iv$iv != r4) goto L52;
    L39:
        if (i$iv$iv == lastIndex$iv$iv) goto L53;
        i$iv$iv = i$iv$iv + 1;
        r0 = this;
        $i$f$forEach = $i$f$forEach2;
        this_$iv = this_$iv3;
        k$iv = k$iv2;
        goto L10
    L53:
        return;
    L52:
        return;
    L38:
        this_$iv3 = this_$iv;
        k$iv2 = k$iv;
        goto L39
    }

    public final SemanticsConfiguration copy() {
        SemanticsConfiguration copy = new SemanticsConfiguration();
        copy.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        copy.isClearingSemantics = this.isClearingSemantics;
        copy.props.putAll(this.props);
        return copy;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof SemanticsConfiguration) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.props, ((SemanticsConfiguration) other).props) == true) goto L12;
        return false;
    L12:
        if (this.isMergingSemanticsOfDescendants == ((SemanticsConfiguration) other).isMergingSemanticsOfDescendants) goto L15;
        return false;
    L15:
        if (this.isClearingSemantics == ((SemanticsConfiguration) other).isClearingSemantics) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = this.props.hashCode();
        int result2 = (result * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants);
        return (result2 * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public String toString() {
        StringBuilder propsString = new StringBuilder();
        String r2 = "";
        if (this.isMergingSemanticsOfDescendants == false) goto L6;
        propsString.append("");
        propsString.append("mergeDescendants=true");
        r2 = ", ";
    L6:
        if (this.isClearingSemantics == false) goto L8;
        propsString.append(r2);
        propsString.append("isClearingSemantics=true");
        r2 = ", ";
    L8:
        ScatterMap this_$iv = this.props;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L31;
    L10:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        String r18 = r2;
        ScatterMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L25;
        int r3 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        long slot$iv$iv2 = slot$iv$iv;
        String r12 = r18;
    L13:
        if (j$iv$iv >= bitCount$iv$iv) goto L22;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L17;
        boolean r20 = true;
    L18:
        if (r20 == false) goto L21;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r21 = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        SemanticsPropertyKey key = (SemanticsPropertyKey) r21;
        propsString.append(r12);
        propsString.append(key.getName());
        propsString.append(" : ");
        propsString.append(value);
        r12 = ", ";
    L21:
        slot$iv$iv2 = slot$iv$iv2 >> r3;
        j$iv$iv = j$iv$iv + 1;
        r3 = r3;
        $i$f$forEach = $i$f$forEach;
        goto L13
    L17:
        r20 = false;
        goto L18
    L22:
        int $i$f$forEach2 = $i$f$forEach;
        if (bitCount$iv$iv != r3) goto L31;
        r2 = r12;
    L26:
        if (i$iv$iv == lastIndex$iv$iv) goto L31;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        goto L10
    L25:
        $i$f$forEach2 = $i$f$forEach;
        r2 = r18;
    L31:
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + propsString + " }";
    }
}
