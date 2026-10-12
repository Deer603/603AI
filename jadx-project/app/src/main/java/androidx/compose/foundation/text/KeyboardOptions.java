package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.webkit.Profile;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: KeyboardOptions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JBQ\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB/\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0010B;\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0013J:\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107JF\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109J^\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;J^\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0004\b:\u0010<J\u0013\u0010=\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u0010?\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0002\b@J\b\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0000J\u0017\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020\u0005H\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020IH\u0016R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00038BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001eR\u001a\u0010'\u001a\u00020\t8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0014\u0010)\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\u00020\u00078BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "platformImeOptions", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "showKeyboardOnFocus", "hintLocales", "Landroidx/compose/ui/text/intl/LocaleList;", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoCorrectEnabled", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect$annotations", "()V", "getAutoCorrect", "()Z", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "autoCorrectOrDefault", "getAutoCorrectOrDefault", "getCapitalization-IUNYP9k", "()I", "I", "capitalizationOrDefault", "getCapitalizationOrDefault-IUNYP9k", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "hintLocalesOrDefault", "getHintLocalesOrDefault", "getImeAction-eUduSuo", "imeActionOrDefault", "getImeActionOrDefault-eUduSuo$foundation_release", "isCompletelyUnspecified", "getKeyboardType-PjHm6EE", "keyboardTypeOrDefault", "getKeyboardTypeOrDefault-PjHm6EE", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "shouldShowKeyboardOnFocus", "getShouldShowKeyboardOnFocus$annotations", "getShouldShowKeyboardOnFocus", "getShowKeyboardOnFocus", "showKeyboardOnFocusOrDefault", "getShowKeyboardOnFocusOrDefault$foundation_release", "copy", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-ij11fho", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-INvB4aQ", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "equals", "other", "fillUnspecifiedValuesWith", "fillUnspecifiedValuesWith$foundation_release", "hashCode", "", "merge", "toImeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "singleLine", "toImeOptions$foundation_release", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final KeyboardOptions Default = null;
    private static final KeyboardOptions SecureTextField = null;
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    /* JADX INFO: compiled from: KeyboardOptions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "SecureTextField", "getSecureTextField$foundation_release$annotations", "getSecureTextField$foundation_release", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }

        private Companion() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.access$getDefault$cp();
        }

        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.access$getSecureTextField$cp();
        }
    }

    public /* synthetic */ KeyboardOptions(int r1, Boolean r2, int r3, int r4, PlatformImeOptions r5, Boolean r6, LocaleList r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ KeyboardOptions(int r1, boolean r2, int r3, int r4, PlatformImeOptions r5, Boolean r6, LocaleList r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ KeyboardOptions(int r1, boolean r2, int r3, int r4, PlatformImeOptions r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ KeyboardOptions(int r1, boolean r2, int r3, int r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the autoCorrectEnabled property.")
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private KeyboardOptions(int capitalization, Boolean autoCorrectEnabled, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        this.capitalization = capitalization;
        this.autoCorrectEnabled = autoCorrectEnabled;
        this.keyboardType = keyboardType;
        this.imeAction = imeAction;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = showKeyboardOnFocus;
        this.hintLocales = hintLocales;
    }

    public static final /* synthetic */ KeyboardOptions access$getDefault$cp() {
        return Default;
    }

    public static final /* synthetic */ KeyboardOptions access$getSecureTextField$cp() {
        return SecureTextField;
    }

    public /* synthetic */ KeyboardOptions(int r9, Boolean r10, int r11, int r12, PlatformImeOptions r13, Boolean r14, LocaleList r15, int r16, DefaultConstructorMarker r17) {
        if ((r16 & 1) == 0) goto L5;
        int r0 = KeyboardCapitalization.Companion.m6631getUnspecifiedIUNYP9k();
    L6:
        LocaleList r2 = null;
        if ((r16 & 2) == 0) goto L9;
        Boolean r1 = null;
    L11:
        if ((r16 & 4) == 0) goto L13;
        int r3 = KeyboardType.Companion.m6658getUnspecifiedPjHm6EE();
    L15:
        if ((r16 & 8) == 0) goto L17;
        int r4 = ImeAction.Companion.m6604getUnspecifiedeUduSuo();
    L19:
        if ((r16 & 16) == 0) goto L21;
        PlatformImeOptions r5 = null;
    L23:
        if ((r16 & 32) == 0) goto L25;
        Boolean r6 = null;
    L27:
        if ((r16 & 64) != 0) goto L30;
        r2 = r15;
    L30:
        int r18 = r3;
        int r19 = r4;
        PlatformImeOptions r110 = r5;
        Boolean r111 = r6;
        this(r0, r1, r18, r19, r110, r111, r2, null);
        return;
    L25:
        r6 = r14;
        goto L27
    L21:
        r5 = r13;
        goto L23
    L17:
        r4 = r12;
        goto L19
    L13:
        r3 = r11;
        goto L15
    L9:
        r1 = r10;
        goto L11
    L5:
        r0 = r9;
        goto L6
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m1064getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m1067getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m1065getImeActioneUduSuo() {
        return this.imeAction;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion = new Companion(null);
        int r3 = 0;
        Boolean r4 = null;
        int r5 = 0;
        int r6 = 0;
        PlatformImeOptions r7 = null;
        Boolean r8 = null;
        LocaleList r9 = null;
        Default = new KeyboardOptions(r3, r4, r5, r6, r7, r8, r9, WorkQueueKt.MASK, null);
        int r10 = 0;
        int r11 = 0;
        LocaleList r12 = null;
        Object[] r13 = null == true ? 1 : 0;
        Object[] r14 = null == true ? 1 : 0;
        SecureTextField = new KeyboardOptions(r10, false, KeyboardType.Companion.m6655getPasswordPjHm6EE(), r11, r13, r14, r12, 121, null);
    }

    public /* synthetic */ KeyboardOptions(int r10, boolean r11, int r12, int r13, PlatformImeOptions r14, Boolean r15, LocaleList r16, int r17, DefaultConstructorMarker r18) {
        if ((r17 & 1) == 0) goto L5;
        int r1 = KeyboardCapitalization.Companion.m6631getUnspecifiedIUNYP9k();
    L7:
        if ((r17 & 4) == 0) goto L9;
        int r3 = KeyboardType.Companion.m6658getUnspecifiedPjHm6EE();
    L11:
        if ((r17 & 8) == 0) goto L13;
        int r4 = ImeAction.Companion.m6604getUnspecifiedeUduSuo();
    L15:
        if ((r17 & 16) == 0) goto L17;
        PlatformImeOptions r5 = null;
    L19:
        if ((r17 & 32) == 0) goto L21;
        Boolean r6 = null;
    L23:
        if ((r17 & 64) == 0) goto L25;
        LocaleList r7 = null;
    L26:
        this(r1, r11, r3, r4, r5, r6, r7, null);
        return;
    L25:
        r7 = r16;
        goto L26
    L21:
        r6 = r15;
        goto L23
    L17:
        r5 = r14;
        goto L19
    L13:
        r4 = r13;
        goto L15
    L9:
        r3 = r12;
        goto L11
    L5:
        r1 = r10;
        goto L7
    }

    private KeyboardOptions(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        this(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, null);
    }

    public /* synthetic */ KeyboardOptions(int r7, boolean r8, int r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L5;
        int r1 = KeyboardCapitalization.Companion.m6631getUnspecifiedIUNYP9k();
    L7:
        if ((r11 & 2) == 0) goto L9;
        boolean r2 = Default.getAutoCorrectOrDefault();
    L11:
        if ((r11 & 4) == 0) goto L13;
        int r3 = KeyboardType.Companion.m6658getUnspecifiedPjHm6EE();
    L15:
        if ((r11 & 8) == 0) goto L17;
        int r4 = ImeAction.Companion.m6596getDefaulteUduSuo();
    L18:
        this(r1, r2, r3, r4, null);
        return;
    L17:
        r4 = r10;
        goto L18
    L13:
        r3 = r9;
        goto L15
    L9:
        r2 = r8;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    private KeyboardOptions(int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        PlatformImeOptions r5 = null;
        Boolean r6 = null;
        LocaleList r7 = null;
        this(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, r5, r6, r7, 96, null);
    }

    public /* synthetic */ KeyboardOptions(int r8, boolean r9, int r10, int r11, PlatformImeOptions r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L5;
        int r1 = KeyboardCapitalization.Companion.m6629getNoneIUNYP9k();
    L7:
        if ((r13 & 2) == 0) goto L9;
        boolean r2 = Default.getAutoCorrectOrDefault();
    L11:
        if ((r13 & 4) == 0) goto L13;
        int r3 = KeyboardType.Companion.m6657getTextPjHm6EE();
    L15:
        if ((r13 & 8) == 0) goto L17;
        int r4 = ImeAction.Companion.m6596getDefaulteUduSuo();
    L19:
        if ((r13 & 16) == 0) goto L21;
        PlatformImeOptions r5 = null;
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

    private KeyboardOptions(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        LocaleList r7 = null;
        this(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), r7, 64, null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean r0 = this.showKeyboardOnFocus;
        if (r0 != null) goto L7;
        return true;
    L7:
        return r0.booleanValue();
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean r0 = this.autoCorrectEnabled;
        if (r0 != null) goto L7;
        return true;
    L7:
        return r0.booleanValue();
    }

    /* JADX INFO: renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m1058getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization r0 = KeyboardCapitalization.m6616boximpl(this.capitalization);
        int it = r0.m6622unboximpl();
        if (KeyboardCapitalization.m6619equalsimpl0(it, KeyboardCapitalization.Companion.m6631getUnspecifiedIUNYP9k()) == false) goto L6;
        r0 = null;
    L6:
        if (r0 == null) goto L9;
        return r0.m6622unboximpl();
    L9:
        return KeyboardCapitalization.Companion.m6629getNoneIUNYP9k();
    }

    /* JADX INFO: renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m1059getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType r0 = KeyboardType.m6633boximpl(this.keyboardType);
        int it = r0.m6639unboximpl();
        if (KeyboardType.m6636equalsimpl0(it, KeyboardType.Companion.m6658getUnspecifiedPjHm6EE()) == false) goto L6;
        r0 = null;
    L6:
        if (r0 == null) goto L9;
        return r0.m6639unboximpl();
    L9:
        return KeyboardType.Companion.m6657getTextPjHm6EE();
    }

    /* JADX INFO: renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m1066getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction r0 = ImeAction.m6580boximpl(this.imeAction);
        int it = r0.m6586unboximpl();
        if (ImeAction.m6583equalsimpl0(it, ImeAction.Companion.m6604getUnspecifiedeUduSuo()) == false) goto L6;
        r0 = null;
    L6:
        if (r0 == null) goto L9;
        return r0.m6586unboximpl();
    L9:
        return ImeAction.Companion.m6596getDefaulteUduSuo();
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        Boolean r0 = this.showKeyboardOnFocus;
        if (r0 != null) goto L7;
        return true;
    L7:
        return r0.booleanValue();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList r0 = this.hintLocales;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return LocaleList.Companion.getEmpty();
    }

    private final boolean isCompletelyUnspecified() {
        if (KeyboardCapitalization.m6619equalsimpl0(this.capitalization, KeyboardCapitalization.Companion.m6631getUnspecifiedIUNYP9k()) == true) goto L5;
    L17:
        return false;
    L5:
        if (this.autoCorrectEnabled != null) goto L17;
        if (KeyboardType.m6636equalsimpl0(this.keyboardType, KeyboardType.Companion.m6658getUnspecifiedPjHm6EE()) == false) goto L17;
        if (ImeAction.m6583equalsimpl0(this.imeAction, ImeAction.Companion.m6604getUnspecifiedeUduSuo()) == false) goto L17;
        if (this.platformImeOptions != null) goto L17;
        if (this.showKeyboardOnFocus != null) goto L17;
        if (this.hintLocales != null) goto L17;
        return true;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = ImeOptions.Companion.getDefault().getSingleLine();
    L6:
        return r0.toImeOptions$foundation_release(r1);
    }

    public final ImeOptions toImeOptions$foundation_release(boolean singleLine) {
        return new ImeOptions(singleLine, m1058getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m1059getKeyboardTypeOrDefaultPjHm6EE(), m1066getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), null);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1055copyINvB4aQ$default(KeyboardOptions r1, int r2, Boolean r3, int r4, int r5, PlatformImeOptions r6, Boolean r7, LocaleList r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = r1.capitalization;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = r1.autoCorrectEnabled;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = r1.keyboardType;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = r1.imeAction;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = r1.platformImeOptions;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L23;
        LocaleList r11 = null;
    L24:
        PlatformImeOptions r12 = r6;
        Boolean r13 = r7;
        return r1.m1061copyINvB4aQ(r2, r3, r4, r5, r12, r13, r11);
    L23:
        r11 = r8;
        goto L24
    }

    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m1061copyINvB4aQ(int capitalization, Boolean autoCorrectEnabled, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, autoCorrectEnabled, keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, null);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1056copyINvB4aQ$default(KeyboardOptions r0, int r1, boolean r2, int r3, int r4, PlatformImeOptions r5, Boolean r6, LocaleList r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.capitalization;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.getAutoCorrectOrDefault();
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.keyboardType;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.imeAction;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.platformImeOptions;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = Boolean.valueOf(r0.getShowKeyboardOnFocusOrDefault$foundation_release());
    L21:
        if ((r8 & 64) == 0) goto L23;
        LocaleList r10 = r0.hintLocales;
    L24:
        PlatformImeOptions r11 = r5;
        Boolean r12 = r6;
        int r13 = r3;
        int r14 = r4;
        return r0.m1062copyINvB4aQ(r1, r2, r13, r14, r11, r12, r10);
    L23:
        r10 = r7;
        goto L24
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1062copyINvB4aQ(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, null);
    }

    /* JADX INFO: renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1057copyij11fho$default(KeyboardOptions r0, int r1, boolean r2, int r3, int r4, PlatformImeOptions r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.capitalization;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.getAutoCorrectOrDefault();
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.keyboardType;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.imeAction;
    L15:
        if ((r6 & 16) == 0) goto L17;
        PlatformImeOptions r8 = r0.platformImeOptions;
    L18:
        int r9 = r3;
        int r10 = r4;
        return r0.m1063copyij11fho(r1, r2, r9, r10, r8);
    L17:
        r8 = r5;
        goto L18
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1063copyij11fho(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, null);
    }

    /* JADX INFO: renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1054copy3m2b7yw$default(KeyboardOptions r0, int r1, boolean r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.capitalization;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.getAutoCorrectOrDefault();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.keyboardType;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.imeAction;
    L15:
        return r0.m1060copy3m2b7yw(r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* JADX INFO: renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1060copy3m2b7yw(int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof KeyboardOptions) == true) goto L9;
        return false;
    L9:
        if (KeyboardCapitalization.m6619equalsimpl0(this.capitalization, ((KeyboardOptions) other).capitalization) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.autoCorrectEnabled, ((KeyboardOptions) other).autoCorrectEnabled) == true) goto L15;
        return false;
    L15:
        if (KeyboardType.m6636equalsimpl0(this.keyboardType, ((KeyboardOptions) other).keyboardType) == true) goto L18;
        return false;
    L18:
        if (ImeAction.m6583equalsimpl0(this.imeAction, ((KeyboardOptions) other).imeAction) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.platformImeOptions, ((KeyboardOptions) other).platformImeOptions) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.showKeyboardOnFocus, ((KeyboardOptions) other).showKeyboardOnFocus) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.hintLocales, ((KeyboardOptions) other).hintLocales) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int result = KeyboardCapitalization.m6620hashCodeimpl(this.capitalization);
        int r1 = result * 31;
        Boolean r2 = this.autoCorrectEnabled;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result2 = r1 + r4;
        int result3 = ((((result2 * 31) + KeyboardType.m6637hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m6584hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions r5 = this.platformImeOptions;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int result4 = (result3 + r6) * 31;
        Boolean r7 = this.showKeyboardOnFocus;
        if (r7 == null) goto L13;
        int r8 = r7.hashCode();
    L14:
        int result5 = (result4 + r8) * 31;
        LocaleList r9 = this.hintLocales;
        if (r9 == null) goto L18;
        r3 = r9.hashCode();
    L18:
        return result5 + r3;
    L13:
        r8 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + KeyboardCapitalization.m6621toStringimpl(this.capitalization) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + KeyboardType.m6638toStringimpl(this.keyboardType) + ", imeAction=" + ImeAction.m6585toStringimpl(this.imeAction) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    public final KeyboardOptions merge(KeyboardOptions other) {
        if (other == null) goto L6;
        KeyboardOptions r0 = other.fillUnspecifiedValuesWith$foundation_release(this);
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this;
    }

    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(KeyboardOptions other) {
        if (other != null) goto L4;
    L45:
        return this;
    L4:
        if (other.isCompletelyUnspecified() == true) goto L45;
        if (Intrinsics.areEqual(other, this) == true) goto L45;
        if (isCompletelyUnspecified() == false) goto L11;
        return other;
    L11:
        KeyboardCapitalization r0 = KeyboardCapitalization.m6616boximpl(this.capitalization);
        int it = r0.m6622unboximpl();
        ImeAction r2 = null;
        if (KeyboardCapitalization.m6619equalsimpl0(it, KeyboardCapitalization.Companion.m6631getUnspecifiedIUNYP9k()) == false) goto L15;
        r0 = null;
    L15:
        if (r0 == null) goto L17;
        int r4 = r0.m6622unboximpl();
    L18:
        Boolean r1 = this.autoCorrectEnabled;
        if (r1 != null) goto L21;
        r1 = other.autoCorrectEnabled;
    L21:
        Boolean r5 = r1;
        KeyboardType r3 = KeyboardType.m6633boximpl(this.keyboardType);
        int it2 = r3.m6639unboximpl();
        if (KeyboardType.m6636equalsimpl0(it2, KeyboardType.Companion.m6658getUnspecifiedPjHm6EE()) == false) goto L25;
        r3 = null;
    L25:
        if (r3 == null) goto L27;
        int r6 = r3.m6639unboximpl();
    L28:
        ImeAction r7 = ImeAction.m6580boximpl(this.imeAction);
        int it3 = r7.m6586unboximpl();
        if (ImeAction.m6583equalsimpl0(it3, ImeAction.Companion.m6604getUnspecifiedeUduSuo()) == true) goto L31;
        r2 = r7;
    L31:
        if (r2 == null) goto L33;
        int r8 = r2.m6586unboximpl();
    L34:
        int r9 = r8;
        PlatformImeOptions r10 = this.platformImeOptions;
        if (r10 != null) goto L37;
        r10 = other.platformImeOptions;
    L37:
        PlatformImeOptions r11 = r10;
        Boolean r12 = this.showKeyboardOnFocus;
        if (r12 != null) goto L40;
        r12 = other.showKeyboardOnFocus;
    L40:
        Boolean r13 = r12;
        LocaleList r14 = this.hintLocales;
        if (r14 != null) goto L44;
        r14 = other.hintLocales;
    L44:
        return new KeyboardOptions(r4, r5, r6, r9, r11, r13, r14, null);
    L33:
        r8 = other.imeAction;
        goto L34
    L27:
        r6 = other.keyboardType;
        goto L28
    L17:
        r4 = other.capitalization;
        goto L18
    }
}
