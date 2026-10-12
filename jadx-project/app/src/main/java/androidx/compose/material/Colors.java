package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0092\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020BH\u0016R1\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R1\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u000f\u0010\u001c\"\u0004\b\u001d\u0010\u001eR1\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R1\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R1\u0010\n\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R1\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u0010\u0018\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R1\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R1\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R1\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b7\u0010\u0018\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R1\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010\u0018\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R1\u0010\b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/material/Colors;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "isLight", "", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA$material_release", "(J)V", "background$delegate", "Landroidx/compose/runtime/MutableState;", "getError-0d7_KjU", "setError-8_81llA$material_release", "error$delegate", "()Z", "setLight$material_release", "(Z)V", "isLight$delegate", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", "onBackground$delegate", "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", "onError$delegate", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "onPrimary$delegate", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", "onSecondary$delegate", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", "onSurface$delegate", "getPrimary-0d7_KjU", "setPrimary-8_81llA$material_release", "primary$delegate", "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", "primaryVariant$delegate", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "secondary$delegate", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "secondaryVariant$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", "surface$delegate", "copy", "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "toString", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Colors {
    public static final int $stable = 0;
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState isLight$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryVariant$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryVariant$delegate;
    private final MutableState surface$delegate;

    static {
    }

    public /* synthetic */ Colors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, boolean r25, DefaultConstructorMarker r26) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25);
    }

    private Colors(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError, boolean isLight) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(primary), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(primaryVariant), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(secondary), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(secondaryVariant), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(background), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(surface), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(error), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(onPrimary), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(onSecondary), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(onBackground), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(onSurface), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m4356boximpl(onError), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(isLight), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1598getPrimary0d7_KjU() {
        State $this$getValue$iv = this.primary$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1610setPrimary8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.primary$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1599getPrimaryVariant0d7_KjU() {
        State $this$getValue$iv = this.primaryVariant$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setPrimaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1611setPrimaryVariant8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.primaryVariant$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1600getSecondary0d7_KjU() {
        State $this$getValue$iv = this.secondary$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1612setSecondary8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.secondary$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1601getSecondaryVariant0d7_KjU() {
        State $this$getValue$iv = this.secondaryVariant$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setSecondaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1613setSecondaryVariant8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.secondaryVariant$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1591getBackground0d7_KjU() {
        State $this$getValue$iv = this.background$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1603setBackground8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.background$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1602getSurface0d7_KjU() {
        State $this$getValue$iv = this.surface$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1614setSurface8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.surface$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1592getError0d7_KjU() {
        State $this$getValue$iv = this.error$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setError-8_81llA$material_release, reason: not valid java name */
    public final void m1604setError8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.error$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1595getOnPrimary0d7_KjU() {
        State $this$getValue$iv = this.onPrimary$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setOnPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1607setOnPrimary8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.onPrimary$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1596getOnSecondary0d7_KjU() {
        State $this$getValue$iv = this.onSecondary$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setOnSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1608setOnSecondary8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.onSecondary$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1593getOnBackground0d7_KjU() {
        State $this$getValue$iv = this.onBackground$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setOnBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1605setOnBackground8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.onBackground$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1597getOnSurface0d7_KjU() {
        State $this$getValue$iv = this.onSurface$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setOnSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1609setOnSurface8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.onSurface$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1594getOnError0d7_KjU() {
        State $this$getValue$iv = this.onError$delegate;
        return ((Color) $this$getValue$iv.getValue()).m4376unboximpl();
    }

    /* JADX INFO: renamed from: setOnError-8_81llA$material_release, reason: not valid java name */
    public final void m1606setOnError8_81llA$material_release(long r5) {
        MutableState $this$setValue$iv = this.onError$delegate;
        $this$setValue$iv.setValue(Color.m4356boximpl(r5));
    }

    public final boolean isLight() {
        State $this$getValue$iv = this.isLight$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setLight$material_release(boolean r5) {
        MutableState $this$setValue$iv = this.isLight$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    /* JADX INFO: renamed from: copy-pvPzIIM$default, reason: not valid java name */
    public static /* synthetic */ Colors m1589copypvPzIIM$default(Colors r19, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, boolean r44, int r45, Object r46) {
        if ((r45 & 1) == 0) goto L5;
        long r1 = r19.m1598getPrimary0d7_KjU();
    L7:
        if ((r45 & 2) == 0) goto L9;
        long r3 = r19.m1599getPrimaryVariant0d7_KjU();
    L11:
        if ((r45 & 4) == 0) goto L13;
        long r5 = r19.m1600getSecondary0d7_KjU();
    L15:
        if ((r45 & 8) == 0) goto L17;
        long r7 = r19.m1601getSecondaryVariant0d7_KjU();
    L19:
        if ((r45 & 16) == 0) goto L21;
        long r9 = r19.m1591getBackground0d7_KjU();
    L23:
        if ((r45 & 32) == 0) goto L25;
        long r11 = r19.m1602getSurface0d7_KjU();
    L27:
        if ((r45 & 64) == 0) goto L29;
        long r13 = r19.m1592getError0d7_KjU();
    L31:
        if ((r45 & 128) == 0) goto L33;
        long r15 = r19.m1595getOnPrimary0d7_KjU();
    L34:
        long r17 = r1;
        if ((r45 & 256) == 0) goto L37;
        long r2 = r19.m1596getOnSecondary0d7_KjU();
    L38:
        long r21 = r2;
        if ((r45 & 512) == 0) goto L41;
        long r4 = r19.m1593getOnBackground0d7_KjU();
    L42:
        long r23 = r4;
        if ((r45 & 1024) == 0) goto L45;
        long r6 = r19.m1597getOnSurface0d7_KjU();
    L46:
        long r25 = r6;
        if ((r45 & 2048) == 0) goto L49;
        long r8 = r19.m1594getOnError0d7_KjU();
    L51:
        if ((r45 & 4096) == 0) goto L53;
        boolean r0 = r19.isLight();
    L54:
        long r43 = r8;
        long r27 = r3;
        long r29 = r5;
        long r210 = r7;
        long r211 = r9;
        long r31 = r11;
        long r33 = r13;
        long r35 = r15;
        return r19.m1590copypvPzIIM(r17, r27, r29, r210, r211, r31, r33, r35, r21, r23, r25, r43, r0);
    L53:
        r0 = r44;
        goto L54
    L49:
        r8 = r42;
        goto L51
    L45:
        r6 = r40;
        goto L46
    L41:
        r4 = r38;
        goto L42
    L37:
        r2 = r36;
        goto L38
    L33:
        r15 = r34;
        goto L34
    L29:
        r13 = r32;
        goto L31
    L25:
        r11 = r30;
        goto L27
    L21:
        r9 = r28;
        goto L23
    L17:
        r7 = r26;
        goto L19
    L13:
        r5 = r24;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }

    /* JADX INFO: renamed from: copy-pvPzIIM, reason: not valid java name */
    public final Colors m1590copypvPzIIM(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError, boolean isLight) {
        return new Colors(primary, primaryVariant, secondary, secondaryVariant, background, surface, error, onPrimary, onSecondary, onBackground, onSurface, onError, isLight, null);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("Colors(primary=").append(Color.m4374toStringimpl(m1598getPrimary0d7_KjU())).append(", primaryVariant=").append(Color.m4374toStringimpl(m1599getPrimaryVariant0d7_KjU())).append(", secondary=").append(Color.m4374toStringimpl(m1600getSecondary0d7_KjU())).append(", secondaryVariant=").append(Color.m4374toStringimpl(m1601getSecondaryVariant0d7_KjU())).append(", background=").append(Color.m4374toStringimpl(m1591getBackground0d7_KjU())).append(", surface=").append(Color.m4374toStringimpl(m1602getSurface0d7_KjU())).append(", error=").append(Color.m4374toStringimpl(m1592getError0d7_KjU())).append(", onPrimary=").append(Color.m4374toStringimpl(m1595getOnPrimary0d7_KjU())).append(", onSecondary=").append(Color.m4374toStringimpl(m1596getOnSecondary0d7_KjU())).append(", onBackground=").append(Color.m4374toStringimpl(m1593getOnBackground0d7_KjU())).append(", onSurface=").append(Color.m4374toStringimpl(m1597getOnSurface0d7_KjU())).append(", onError=");
        r0.append(Color.m4374toStringimpl(m1594getOnError0d7_KjU())).append(", isLight=").append(isLight()).append(')');
        return r0.toString();
    }
}
