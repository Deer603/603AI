package androidx.compose.ui.text.input;

import androidx.compose.ui.text.intl.LocaleList;
import androidx.webkit.Profile;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: ImeOptions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+BE\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB9\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eBM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JP\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JX\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "singleLine", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "platformImeOptions", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "hintLocales", "Landroidx/compose/ui/text/intl/LocaleList;", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect", "()Z", "getCapitalization-IUNYP9k", "()I", "I", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "getImeAction-eUduSuo", "getKeyboardType-PjHm6EE", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "getSingleLine", "copy", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "copy-YTHSh70", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/ui/text/input/ImeOptions;", "copy-wBHncE4", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/input/ImeOptions;", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final ImeOptions Default = null;
    private final boolean autoCorrect;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    /* JADX INFO: compiled from: ImeOptions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final ImeOptions getDefault() {
            return ImeOptions.access$getDefault$cp();
        }
    }

    public /* synthetic */ ImeOptions(boolean r1, int r2, boolean r3, int r4, int r5, PlatformImeOptions r6, LocaleList r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public /* synthetic */ ImeOptions(boolean r1, int r2, boolean r3, int r4, int r5, PlatformImeOptions r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ ImeOptions(boolean r1, int r2, boolean r3, int r4, int r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    private ImeOptions(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, LocaleList hintLocales) {
        this.singleLine = singleLine;
        this.capitalization = capitalization;
        this.autoCorrect = autoCorrect;
        this.keyboardType = keyboardType;
        this.imeAction = imeAction;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = hintLocales;
    }

    public static final /* synthetic */ ImeOptions access$getDefault$cp() {
        return Default;
    }

    public /* synthetic */ ImeOptions(boolean r9, int r10, boolean r11, int r12, int r13, PlatformImeOptions r14, LocaleList r15, int r16, DefaultConstructorMarker r17) {
        if ((r16 & 1) == 0) goto L5;
        boolean r0 = false;
    L7:
        if ((r16 & 2) == 0) goto L9;
        int r1 = KeyboardCapitalization.Companion.m6629getNoneIUNYP9k();
    L11:
        if ((r16 & 4) == 0) goto L13;
        boolean r2 = true;
    L15:
        if ((r16 & 8) == 0) goto L17;
        int r3 = KeyboardType.Companion.m6657getTextPjHm6EE();
    L19:
        if ((r16 & 16) == 0) goto L21;
        int r4 = ImeAction.Companion.m6596getDefaulteUduSuo();
    L23:
        if ((r16 & 32) == 0) goto L25;
        PlatformImeOptions r5 = null;
    L27:
        if ((r16 & 64) == 0) goto L29;
        LocaleList r6 = LocaleList.Companion.getEmpty();
    L30:
        boolean r18 = r0;
        int r19 = r1;
        boolean r110 = r2;
        int r111 = r3;
        int r112 = r4;
        PlatformImeOptions r113 = r5;
        LocaleList r114 = r6;
        this(r18, r19, r110, r111, r112, r113, r114, null);
        return;
    L29:
        r6 = r15;
        goto L30
    L25:
        r5 = r14;
        goto L27
    L21:
        r4 = r13;
        goto L23
    L17:
        r3 = r12;
        goto L19
    L13:
        r2 = r11;
        goto L15
    L9:
        r1 = r10;
        goto L11
    L5:
        r0 = r9;
        goto L7
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m6611getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m6613getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m6612getImeActioneUduSuo() {
        return this.imeAction;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    static {
        Companion = new Companion(null);
        boolean r3 = false;
        int r4 = 0;
        boolean r5 = false;
        int r6 = 0;
        int r7 = 0;
        PlatformImeOptions r8 = null;
        LocaleList r9 = null;
        Default = new ImeOptions(r3, r4, r5, r6, r7, r8, r9, WorkQueueKt.MASK, null);
    }

    public /* synthetic */ ImeOptions(boolean r8, int r9, boolean r10, int r11, int r12, PlatformImeOptions r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L5;
        boolean r0 = false;
    L7:
        if ((r14 & 2) == 0) goto L9;
        int r1 = KeyboardCapitalization.Companion.m6629getNoneIUNYP9k();
    L11:
        if ((r14 & 4) == 0) goto L13;
        boolean r2 = true;
    L15:
        if ((r14 & 8) == 0) goto L17;
        int r3 = KeyboardType.Companion.m6657getTextPjHm6EE();
    L19:
        if ((r14 & 16) == 0) goto L21;
        int r4 = ImeAction.Companion.m6596getDefaulteUduSuo();
    L23:
        if ((r14 & 32) == 0) goto L25;
        PlatformImeOptions r5 = null;
    L26:
        boolean r16 = r0;
        int r17 = r1;
        boolean r18 = r2;
        int r19 = r3;
        int r110 = r4;
        PlatformImeOptions r111 = r5;
        this(r16, r17, r18, r19, r110, r111, null);
        return;
    L25:
        r5 = r13;
        goto L26
    L21:
        r4 = r12;
        goto L23
    L17:
        r3 = r11;
        goto L19
    L13:
        r2 = r10;
        goto L15
    L9:
        r1 = r9;
        goto L11
    L5:
        r0 = r8;
        goto L7
    }

    private ImeOptions(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        this(singleLine, capitalization, autoCorrect, keyboardType, imeAction, platformImeOptions, LocaleList.Companion.getEmpty(), null);
    }

    public /* synthetic */ ImeOptions(boolean r8, int r9, boolean r10, int r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L5;
        boolean r1 = false;
    L7:
        if ((r13 & 2) == 0) goto L9;
        int r2 = KeyboardCapitalization.Companion.m6629getNoneIUNYP9k();
    L11:
        if ((r13 & 4) == 0) goto L13;
        boolean r3 = true;
    L15:
        if ((r13 & 8) == 0) goto L17;
        int r4 = KeyboardType.Companion.m6657getTextPjHm6EE();
    L19:
        if ((r13 & 16) == 0) goto L21;
        int r5 = ImeAction.Companion.m6596getDefaulteUduSuo();
    L22:
        this(r1, r2, r3, r4, r5, null);
        return;
    L21:
        r5 = r12;
        goto L22
    L17:
        r4 = r11;
        goto L19
    L13:
        r3 = r10;
        goto L15
    L9:
        r2 = r9;
        goto L11
    L5:
        r1 = r8;
        goto L7
    }

    private ImeOptions(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        PlatformImeOptions r6 = null;
        LocaleList r7 = null;
        this(singleLine, capitalization, autoCorrect, keyboardType, imeAction, r6, r7, 64, null);
    }

    /* JADX INFO: renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m6607copywBHncE4$default(ImeOptions r0, boolean r1, int r2, boolean r3, int r4, int r5, PlatformImeOptions r6, LocaleList r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.singleLine;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.capitalization;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.autoCorrect;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.keyboardType;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.imeAction;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.platformImeOptions;
    L21:
        if ((r8 & 64) == 0) goto L23;
        LocaleList r10 = r0.hintLocales;
    L24:
        int r11 = r5;
        PlatformImeOptions r12 = r6;
        boolean r13 = r3;
        int r14 = r4;
        return r0.m6610copywBHncE4(r1, r2, r13, r14, r11, r12, r10);
    L23:
        r10 = r7;
        goto L24
    }

    /* JADX INFO: renamed from: copy-wBHncE4, reason: not valid java name */
    public final ImeOptions m6610copywBHncE4(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, LocaleList hintLocales) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, platformImeOptions, hintLocales, null);
    }

    /* JADX INFO: renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m6605copyYTHSh70$default(ImeOptions r0, boolean r1, int r2, boolean r3, int r4, int r5, PlatformImeOptions r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.singleLine;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.capitalization;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.autoCorrect;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.keyboardType;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.imeAction;
    L18:
        if ((r7 & 32) == 0) goto L20;
        PlatformImeOptions r9 = r0.platformImeOptions;
    L21:
        int r10 = r4;
        int r11 = r5;
        boolean r12 = r3;
        boolean r13 = r1;
        return r0.m6608copyYTHSh70(r13, r2, r12, r10, r11, r9);
    L20:
        r9 = r6;
        goto L21
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional hintLocales parameter.")
    /* JADX INFO: renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ ImeOptions m6608copyYTHSh70(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, platformImeOptions, this.hintLocales, null);
    }

    /* JADX INFO: renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m6606copyuxg59PA$default(ImeOptions r0, boolean r1, int r2, boolean r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.singleLine;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.capitalization;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.autoCorrect;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.keyboardType;
    L15:
        if ((r6 & 16) == 0) goto L17;
        int r8 = r0.imeAction;
    L18:
        boolean r9 = r3;
        int r10 = r4;
        return r0.m6609copyuxg59PA(r1, r2, r9, r10, r8);
    L17:
        r8 = r5;
        goto L18
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* JADX INFO: renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m6609copyuxg59PA(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, this.platformImeOptions, this.hintLocales, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ImeOptions) == true) goto L9;
        return false;
    L9:
        if (this.singleLine == ((ImeOptions) other).singleLine) goto L12;
        return false;
    L12:
        if (KeyboardCapitalization.m6619equalsimpl0(this.capitalization, ((ImeOptions) other).capitalization) == true) goto L15;
        return false;
    L15:
        if (this.autoCorrect == ((ImeOptions) other).autoCorrect) goto L18;
        return false;
    L18:
        if (KeyboardType.m6636equalsimpl0(this.keyboardType, ((ImeOptions) other).keyboardType) == true) goto L21;
        return false;
    L21:
        if (ImeAction.m6583equalsimpl0(this.imeAction, ((ImeOptions) other).imeAction) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.platformImeOptions, ((ImeOptions) other).platformImeOptions) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.hintLocales, ((ImeOptions) other).hintLocales) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.singleLine);
        int result2 = (result * 31) + KeyboardCapitalization.m6620hashCodeimpl(this.capitalization);
        int result3 = ((((((result2 * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m6637hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m6584hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions r2 = this.platformImeOptions;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return ((result3 + r3) * 31) + this.hintLocales.hashCode();
    L5:
        r3 = 0;
        goto L7
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + KeyboardCapitalization.m6621toStringimpl(this.capitalization) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + KeyboardType.m6638toStringimpl(this.keyboardType) + ", imeAction=" + ImeAction.m6585toStringimpl(this.imeAction) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }
}
