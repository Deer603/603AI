package androidx.compose.ui.node;

import android.view.KeyEvent;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.collection.IntObjectMap;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 Ö\u00012\u00020\u0001:\u0004Ö\u0001×\u0001J \u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H&ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J \u0010\u0090\u0001\u001a\u00030\u008c\u00012\b\u0010\u0091\u0001\u001a\u00030\u008c\u0001H&ø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u008f\u0001Jy\u0010\u0093\u0001\u001a\u00030\u0094\u00012C\u0010\u0095\u0001\u001a>\u0012\u0017\u0012\u00150\u0097\u0001¢\u0006\u000f\b\u0098\u0001\u0012\n\b\u0099\u0001\u0012\u0005\b\b(\u009a\u0001\u0012\u0019\u0012\u0017\u0018\u00010\u009b\u0001¢\u0006\u000f\b\u0098\u0001\u0012\n\b\u0099\u0001\u0012\u0005\b\b(\u009c\u0001\u0012\u0005\u0012\u00030\u009d\u00010\u0096\u00012\u000f\u0010\u009e\u0001\u001a\n\u0012\u0005\u0012\u00030\u009d\u00010\u009f\u00012\f\b\u0002\u0010 \u0001\u001a\u0005\u0018\u00010\u009b\u00012\t\b\u0002\u0010¡\u0001\u001a\u00020mH&J\n\u0010¢\u0001\u001a\u00030\u009d\u0001H\u0016J\u001e\u0010£\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020F2\t\b\u0002\u0010¥\u0001\u001a\u00020mH&J\"\u0010¦\u0001\u001a\u0005\u0018\u00010§\u00012\b\u0010¨\u0001\u001a\u00030©\u0001H&ø\u0001\u0000¢\u0006\u0006\bª\u0001\u0010«\u0001J\n\u0010¬\u0001\u001a\u00030\u009d\u0001H\u0016J)\u0010\u00ad\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020F2\b\u0010®\u0001\u001a\u00030¯\u0001H&ø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0015\u0010\u00ad\u0001\u001a\u00030\u009d\u00012\t\b\u0002\u0010²\u0001\u001a\u00020mH&J\u0013\u0010³\u0001\u001a\u00030\u009d\u00012\u0007\u0010´\u0001\u001a\u00020FH&J\n\u0010µ\u0001\u001a\u00030\u009d\u0001H&J\u0019\u0010¶\u0001\u001a\u00030\u009d\u00012\r\u0010·\u0001\u001a\b0¸\u0001j\u0003`¹\u0001H'J\u0013\u0010º\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020FH&J\u0013\u0010»\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020FH&J\u0013\u0010¼\u0001\u001a\u00030\u009d\u00012\u0007\u0010´\u0001\u001a\u00020FH&J\u001d\u0010½\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020F2\b\u0010¾\u0001\u001a\u00030¿\u0001H\u0016J\u0013\u0010À\u0001\u001a\u00030\u009d\u00012\u0007\u0010´\u0001\u001a\u00020FH&J\u001d\u0010Á\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020F2\b\u0010¾\u0001\u001a\u00030¿\u0001H\u0016J4\u0010Â\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020F2\t\b\u0002\u0010¥\u0001\u001a\u00020m2\t\b\u0002\u0010Ã\u0001\u001a\u00020m2\t\b\u0002\u0010Ä\u0001\u001a\u00020mH&J)\u0010Å\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020F2\t\b\u0002\u0010¥\u0001\u001a\u00020m2\t\b\u0002\u0010Ã\u0001\u001a\u00020mH&J\n\u0010Æ\u0001\u001a\u00030\u009d\u0001H&J\u001b\u0010Ç\u0001\u001a\u00030\u009d\u00012\u000f\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030\u009d\u00010\u009f\u0001H&J\u0014\u0010É\u0001\u001a\u00030\u009d\u00012\b\u0010È\u0001\u001a\u00030Ê\u0001H&J\u0013\u0010Ë\u0001\u001a\u00030\u009d\u00012\u0007\u0010´\u0001\u001a\u00020FH&J\t\u0010Ì\u0001\u001a\u00020mH&J\u0013\u0010Í\u0001\u001a\u00030\u009d\u00012\u0007\u0010¤\u0001\u001a\u00020FH&JA\u0010Î\u0001\u001a\u00030Ï\u00012.\u0010Ð\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030Ñ\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ï\u00010Ò\u0001\u0012\u0007\u0012\u0005\u0018\u00010Ó\u00010\u0096\u0001¢\u0006\u0003\bÔ\u0001H¦@¢\u0006\u0003\u0010Õ\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/8&X§\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u000205X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0012\u00108\u001a\u000209X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0012\u0010<\u001a\u00020=X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0012\u0010@\u001a\u00020AX¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0012\u0010I\u001a\u00020JX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0012\u0010M\u001a\u00020NX¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0012\u0010U\u001a\u00020VX¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0012\u0010Y\u001a\u00020ZX¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0012\u0010]\u001a\u00020FX¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0012\u0010`\u001a\u00020aX¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0012\u0010d\u001a\u00020eX¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0012\u0010h\u001a\u00020iX¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\"\u0010n\u001a\u00020m2\u0006\u0010l\u001a\u00020m@gX¦\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0012\u0010s\u001a\u00020tX¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0012\u0010w\u001a\u00020xX¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0012\u0010{\u001a\u00020|X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0015\u0010\u007f\u001a\u00030\u0080\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0083\u0001\u001a\u00030\u0084\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0087\u0001\u001a\u00030\u0088\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006Ø\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillManager", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "getClipboard", "()Landroidx/compose/ui/platform/Clipboard;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "()V", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNodes", "()Landroidx/collection/IntObjectMap;", "measureIteration", "", "getMeasureIteration", "()J", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "root", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "<set-?>", "", "showLayoutBounds", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "calculateLocalPosition", "Landroidx/compose/ui/geometry/Offset;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "createLayer", "Landroidx/compose/ui/node/OwnedLayer;", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "invalidateParentLayer", "Lkotlin/Function0;", "explicitLayer", "forceUseOldLayers", "decrementSensitiveComponentCount", "forceMeasureTheSubtree", "layoutNode", "affectsLookahead", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "incrementSensitiveComponentCount", "measureAndLayout", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "onDetach", "node", "onEndApplyChanges", "onInteropViewLayoutChange", "view", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "onLayoutChange", "onLayoutNodeDeactivated", "onPostAttach", "onPostLayoutNodeReused", "oldSemanticsId", "", "onPreAttach", "onPreLayoutNodeReused", "onRequestMeasure", "forceRequest", "scheduleMeasureAndLayout", "onRequestRelayout", "onSemanticsChange", "registerOnEndApplyChangesListener", "listener", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "requestAutofill", "requestFocus", "requestOnPositionedCallback", "textInputSession", "", "session", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "OnLayoutCompletedListener", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Owner extends PositionCalculator {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "()V", "enableExtraAssertions", "", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static boolean enableExtraAssertions;

        static {
            $$INSTANCE = new Companion();
        }

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean r1) {
            enableExtraAssertions = r1;
        }
    }

    /* JADX INFO: compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "onLayoutComplete", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo6034calculateLocalPositionMKHz9U(long r1);

    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo6035calculatePositionInWindowMKHz9U(long r1);

    OwnedLayer createLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> r1, Function0<Unit> r2, GraphicsLayer r3, boolean r4);

    void forceMeasureTheSubtree(LayoutNode r1, boolean r2);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillManager getAutofillManager();

    AutofillTree getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    CoroutineContext getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    FocusDirection mo6036getFocusDirectionP8AzH3I(KeyEvent r1);

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    IntObjectMap<LayoutNode> getLayoutNodes();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    PointerIconService getPointerIconService();

    RectManager getRectManager();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    SemanticsOwner getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean r1);

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo6037measureAndLayout0kLqBqw(LayoutNode r1, long r2);

    void onDetach(LayoutNode r1);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(View r1);

    void onLayoutChange(LayoutNode r1);

    void onLayoutNodeDeactivated(LayoutNode r1);

    void onPostAttach(LayoutNode r1);

    void onPreAttach(LayoutNode r1);

    void onRequestMeasure(LayoutNode r1, boolean r2, boolean r3, boolean r4);

    void onRequestRelayout(LayoutNode r1, boolean r2, boolean r3);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(Function0<Unit> r1);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener r1);

    void requestAutofill(LayoutNode r1);

    boolean requestFocus();

    void requestOnPositionedCallback(LayoutNode r1);

    void setShowLayoutBounds(boolean r1);

    Object textInputSession(Function2<? super PlatformTextInputSessionScope, ? super Continuation<?>, ? extends Object> r1, Continuation<?> r2);

    static /* synthetic */ void onRequestMeasure$default(Owner r1, LayoutNode r2, boolean r3, boolean r4, boolean r5, int r6, Object r7) {
        if (r7 != null) goto L15;
        if ((r6 & 2) == 0) goto L7;
        r3 = false;
    L7:
        if ((r6 & 4) == 0) goto L10;
        r4 = false;
    L10:
        if ((r6 & 8) == 0) goto L12;
        r5 = true;
    L12:
        r1.onRequestMeasure(r2, r3, r4, r5);
        return;
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    static /* synthetic */ void onRequestRelayout$default(Owner r1, LayoutNode r2, boolean r3, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 2) == 0) goto L7;
        r3 = false;
    L7:
        if ((r5 & 4) == 0) goto L9;
        r4 = false;
    L9:
        r1.onRequestRelayout(r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    static /* synthetic */ void measureAndLayout$default(Owner r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        r0.measureAndLayout(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner r0, LayoutNode r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        r0.forceMeasureTheSubtree(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    static /* synthetic */ OwnedLayer createLayer$default(Owner r0, Function2 r1, Function0 r2, GraphicsLayer r3, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 4) == 0) goto L7;
        r3 = null;
    L7:
        if ((r5 & 8) == 0) goto L10;
        r4 = false;
    L10:
        return r0.createLayer(r1, r2, r3, r4);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
    }

    default void onPreLayoutNodeReused(LayoutNode layoutNode, int oldSemanticsId) {
    }

    default void onPostLayoutNodeReused(LayoutNode layoutNode, int oldSemanticsId) {
    }

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    default void incrementSensitiveComponentCount() {
    }

    default void decrementSensitiveComponentCount() {
    }
}
