package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a3\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"isShiftPressed", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "contextMenuBuilder", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "contextMenuState", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "itemsAvailability", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "textFieldMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "foundation_release", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldSelectionManager_androidKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C04121 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        C04121(TextFieldSelectionManager r2) {
            this.$manager = r2;
            super(3);
        }

        public static final /* synthetic */ long access$invoke$lambda$1(MutableState $magnifierSize$delegate) {
            return invoke$lambda$1($magnifierSize$delegate);
        }

        public static final /* synthetic */ void access$invoke$lambda$2(MutableState $magnifierSize$delegate, long value) {
            invoke$lambda$2($magnifierSize$delegate, value);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier r4, Composer r5, Integer r6) {
            return invoke(r4, r5, r6.intValue());
        }

        public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
            $composer.startReplaceGroup(1980580247);
            ComposerKt.sourceInformation($composer, "C50@2137L7,51@2174L41,53@2282L68,54@2384L539:TextFieldSelectionManager.android.kt#eksfi3");
            if (ComposerKt.isTraceInProgress() == false) goto L5;
            ComposerKt.traceEventStart(1980580247, $changed, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:50)");
        L5:
            ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object r3 = $composer.consume(r0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            final Density density = (Density) r3;
            ComposerKt.sourceInformationMarkerStart($composer, 1684880674, "CC(remember):TextFieldSelectionManager.android.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv != Composer.Companion.getEmpty()) goto L9;
            Object value$iv = SnapshotStateKt.mutableStateOf$default(IntSize.m7136boximpl(IntSize.Companion.m7149getZeroYbymL2g()), null, 2, null);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        L9:
            final MutableState magnifierSize$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1684884157, "CC(remember):TextFieldSelectionManager.android.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance(this.$manager);
            final TextFieldSelectionManager r4 = this.$manager;
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv == false) goto L12;
        L15:
            Object value$iv2 = (Function0) new TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1(r4, magnifierSize$delegate);
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        L16:
            Function0 r7 = (Function0) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1684887892, "CC(remember):TextFieldSelectionManager.android.kt#9igjgp");
            boolean invalid$iv2 = $composer.changed(density);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv2 == false) goto L19;
        L22:
            Object value$iv3 = (Function1) new TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(density, magnifierSize$delegate);
            $composer.updateRememberedValue(value$iv3);
            it$iv3 = value$iv3;
        L23:
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier r2 = SelectionMagnifierKt.animatedSelectionMagnifier($this$composed, r7, (Function1) it$iv3);
            if (ComposerKt.isTraceInProgress() == false) goto L26;
            ComposerKt.traceEventEnd();
        L26:
            $composer.endReplaceGroup();
            return r2;
        L19:
            if (it$iv3 != Composer.Companion.getEmpty()) goto L23;
        L12:
            if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
            goto L15
        }

        private static final long invoke$lambda$1(MutableState<IntSize> r4) {
            MutableState<IntSize> $this$getValue$iv = r4;
            return $this$getValue$iv.getValue().m7148unboximpl();
        }

        private static final void invoke$lambda$2(MutableState<IntSize> r5, long value) {
            r5.setValue(IntSize.m7136boximpl(value));
        }
    }

    public static final boolean isShiftPressed(PointerEvent $this$isShiftPressed) {
        return false;
    }

    public static final Modifier textFieldMagnifier(Modifier $this$textFieldMagnifier, TextFieldSelectionManager manager) {
        if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) == true) goto L6;
        return $this$textFieldMagnifier;
    L6:
        return ComposedModifierKt.composed$default($this$textFieldMagnifier, null, new C04121(manager), 1, null);
    }

    public static final Function1<ContextMenuScope, Unit> contextMenuBuilder(final TextFieldSelectionManager $this$contextMenuBuilder, final ContextMenuState contextMenuState, final State<MenuItemsAvailability> r3) {
        return new AnonymousClass1(r3, contextMenuState, $this$contextMenuBuilder);
    }
}
