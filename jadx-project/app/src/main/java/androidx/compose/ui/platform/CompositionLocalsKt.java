package androidx.compose.ui.platform;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CompositionLocals.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a0\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020H2\u0011\u0010U\u001a\r\u0012\u0004\u0012\u00020Q0V¢\u0006\u0002\bWH\u0001¢\u0006\u0002\u0010X\u001a\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\H\u0002\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0004\"\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0004\"\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0004\"\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0004\"\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0004\"\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0004\"\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0004\"\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0004\"\"\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\b\u001a\u0004\b'\u0010\u0004\"\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0001¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0004\"\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0001¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0004\"\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0004\"\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0001¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0004\"\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0004\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0004\"\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190:8F¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u0001¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0004\"$\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\b\u001a\u0004\bC\u0010\u0004\"\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0001¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0004\"\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0004\"\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0001¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0004\"\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u0001¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0004¨\u0006]"}, d2 = {"LocalAccessibilityManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofill", "Landroidx/compose/ui/autofill/Autofill;", "getLocalAutofill$annotations", "()V", "getLocalAutofill", "LocalAutofillManager", "Landroidx/compose/ui/autofill/AutofillManager;", "getLocalAutofillManager", "LocalAutofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getLocalAutofillTree$annotations", "getLocalAutofillTree", "LocalClipboard", "Landroidx/compose/ui/platform/Clipboard;", "getLocalClipboard", "LocalClipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getLocalClipboardManager$annotations", "getLocalClipboardManager", "LocalCursorBlinkEnabled", "", "getLocalCursorBlinkEnabled", "LocalDensity", "Landroidx/compose/ui/unit/Density;", "getLocalDensity", "LocalFocusManager", "Landroidx/compose/ui/focus/FocusManager;", "getLocalFocusManager", "LocalFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getLocalFontFamilyResolver", "LocalFontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLocalFontLoader$annotations", "getLocalFontLoader", "LocalGraphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "getLocalGraphicsContext", "LocalHapticFeedback", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getLocalHapticFeedback", "LocalInputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getLocalInputModeManager", "LocalLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLocalLayoutDirection", "LocalPointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getLocalPointerIconService", "LocalProvidableScrollCaptureInProgress", "getLocalProvidableScrollCaptureInProgress", "LocalScrollCaptureInProgress", "Landroidx/compose/runtime/CompositionLocal;", "getLocalScrollCaptureInProgress", "()Landroidx/compose/runtime/CompositionLocal;", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getLocalSoftwareKeyboardController", "LocalTextInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getLocalTextInputService$annotations", "getLocalTextInputService", "LocalTextToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getLocalTextToolbar", "LocalUriHandler", "Landroidx/compose/ui/platform/UriHandler;", "getLocalUriHandler", "LocalViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getLocalViewConfiguration", "LocalWindowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getLocalWindowInfo", "ProvideCommonCompositionLocals", "", "owner", "Landroidx/compose/ui/node/Owner;", "uriHandler", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", HintConstants.AUTOFILL_HINT_NAME, "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompositionLocalsKt {
    private static final ProvidableCompositionLocal<AccessibilityManager> LocalAccessibilityManager = null;
    private static final ProvidableCompositionLocal<Autofill> LocalAutofill = null;
    private static final ProvidableCompositionLocal<AutofillManager> LocalAutofillManager = null;
    private static final ProvidableCompositionLocal<AutofillTree> LocalAutofillTree = null;
    private static final ProvidableCompositionLocal<Clipboard> LocalClipboard = null;
    private static final ProvidableCompositionLocal<ClipboardManager> LocalClipboardManager = null;
    private static final ProvidableCompositionLocal<Boolean> LocalCursorBlinkEnabled = null;
    private static final ProvidableCompositionLocal<Density> LocalDensity = null;
    private static final ProvidableCompositionLocal<FocusManager> LocalFocusManager = null;
    private static final ProvidableCompositionLocal<FontFamily.Resolver> LocalFontFamilyResolver = null;
    private static final ProvidableCompositionLocal<Font.ResourceLoader> LocalFontLoader = null;
    private static final ProvidableCompositionLocal<GraphicsContext> LocalGraphicsContext = null;
    private static final ProvidableCompositionLocal<HapticFeedback> LocalHapticFeedback = null;
    private static final ProvidableCompositionLocal<InputModeManager> LocalInputModeManager = null;
    private static final ProvidableCompositionLocal<LayoutDirection> LocalLayoutDirection = null;
    private static final ProvidableCompositionLocal<PointerIconService> LocalPointerIconService = null;
    private static final ProvidableCompositionLocal<Boolean> LocalProvidableScrollCaptureInProgress = null;
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = null;
    private static final ProvidableCompositionLocal<TextInputService> LocalTextInputService = null;
    private static final ProvidableCompositionLocal<TextToolbar> LocalTextToolbar = null;
    private static final ProvidableCompositionLocal<UriHandler> LocalUriHandler = null;
    private static final ProvidableCompositionLocal<ViewConfiguration> LocalViewConfiguration = null;
    private static final ProvidableCompositionLocal<WindowInfo> LocalWindowInfo = null;

    public static final /* synthetic */ Void access$noLocalProvidedFor(String name) {
        return noLocalProvidedFor(name);
    }

    @Deprecated(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @Deprecated(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @Deprecated(message = "Use LocalClipboard instead which supports suspend functions", replaceWith = @ReplaceWith(expression = "LocalClipboard", imports = {"androidx.compose.ui.platform.LocalClipboard"}))
    public static /* synthetic */ void getLocalClipboardManager$annotations() {
    }

    @Deprecated(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @ReplaceWith(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @Deprecated(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getLocalTextInputService$annotations() {
    }

    static {
        LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);
        LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofill$1.INSTANCE);
        LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);
        LocalAutofillManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillManager$1.INSTANCE);
        LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);
        LocalClipboard = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboard$1.INSTANCE);
        LocalGraphicsContext = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalGraphicsContext$1.INSTANCE);
        LocalDensity = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalDensity$1.INSTANCE);
        LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);
        LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);
        LocalFontFamilyResolver = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);
        LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);
        LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);
        LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);
        LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);
        LocalSoftwareKeyboardController = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalSoftwareKeyboardController$1.INSTANCE);
        LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);
        LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);
        LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);
        LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);
        LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);
        LocalProvidableScrollCaptureInProgress = CompositionLocalKt.compositionLocalOf$default(null, CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.INSTANCE, 1, null);
        LocalCursorBlinkEnabled = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalCursorBlinkEnabled$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    public static final ProvidableCompositionLocal<AutofillManager> getLocalAutofillManager() {
        return LocalAutofillManager;
    }

    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    public static final ProvidableCompositionLocal<Clipboard> getLocalClipboard() {
        return LocalClipboard;
    }

    public static final ProvidableCompositionLocal<GraphicsContext> getLocalGraphicsContext() {
        return LocalGraphicsContext;
    }

    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return LocalDensity;
    }

    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    public static final ProvidableCompositionLocal<SoftwareKeyboardController> getLocalSoftwareKeyboardController() {
        return LocalSoftwareKeyboardController;
    }

    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalProvidableScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final CompositionLocal<Boolean> getLocalScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalCursorBlinkEnabled() {
        return LocalCursorBlinkEnabled;
    }

    public static final void ProvideCommonCompositionLocals(final Owner owner, final UriHandler uriHandler, final Function2<? super Composer, ? super Integer, Unit> r11, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(874662829);
        ComposerKt.sourceInformation($composer2, "C(ProvideCommonCompositionLocals)P(1,2)215@9098L1366:CompositionLocals.kt#itgzvw");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r2 = $composer2.changed(owner);
    L8:
        if (r2 == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L13
    L10:
        r3 = 2;
        goto L11
    L7:
        r2 = $composer2.changedInstance(owner);
    L13:
        if (($changed & 48) != 0) goto L23;
        if (($changed & 64) != 0) goto L17;
        boolean r4 = $composer2.changed(uriHandler);
    L18:
        if (r4 == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L23
    L20:
        r5 = 16;
        goto L21
    L17:
        r4 = $composer2.changedInstance(uriHandler);
    L23:
        if (($changed & 384) != 0) goto L30;
        if ($composer2.changedInstance(r11) == false) goto L27;
        int r6 = 256;
    L28:
        $dirty = $dirty | r6;
        goto L30
    L27:
        r6 = 128;
    L30:
        if (($dirty & 147) == 146) goto L32;
        boolean r7 = true;
    L34:
        if ($composer2.shouldExecute(r7, $dirty & 1) == true) goto L36;
        $composer2.skipToGroupEnd();
    L42:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L46;
        r0.updateScope(new AnonymousClass1(owner, uriHandler, r11, $changed));
        return;
    L46:
        return;
    L36:
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventStart(874662829, $dirty, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
    L38:
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillManager.provides(owner.getAutofillManager()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalClipboard.provides(owner.getClipboard()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusOwner()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalSoftwareKeyboardController.provides(owner.getSoftwareKeyboardController()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService()), LocalGraphicsContext.provides(owner.getGraphicsContext())}, r11, $composer2, ProvidedValue.$stable | (($dirty >> 3) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventEnd();
        goto L42
    L32:
        r7 = false;
        goto L34
    }

    private static final Void noLocalProvidedFor(String name) {
        throw new IllegalStateException(("CompositionLocal " + name + " not present").toString());
    }
}
