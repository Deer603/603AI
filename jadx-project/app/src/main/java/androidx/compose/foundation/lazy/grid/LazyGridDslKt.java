package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001a\u001a\u008a\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001d\u001a~\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001e\u001a&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0002\u001a\u001d\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010'\u001a\u001d\u0010(\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010)\u001aÛ\u0001\u0010*\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0,2%\b\n\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u00010\u001620\b\n\u00102\u001a*\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000205\u0018\u000103¢\u0006\u0002\b\u00182%\b\n\u00106\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u0001010\u001623\b\u0004\u00107\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010:\u001aÛ\u0001\u0010*\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0 2%\b\n\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u00010\u001620\b\n\u00102\u001a*\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000205\u0018\u000103¢\u0006\u0002\b\u00182%\b\n\u00106\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u0001010\u001623\b\u0004\u00107\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010;\u001a¯\u0002\u0010<\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0,2:\b\n\u0010-\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u0001032E\b\n\u00102\u001a?\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000205\u0018\u00010>¢\u0006\u0002\b\u00182:\b\u0006\u00106\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u000101032H\b\u0004\u00107\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010?\u001a¯\u0002\u0010<\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0 2:\b\n\u0010-\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000201\u0018\u0001032E\b\n\u00102\u001a?\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u000205\u0018\u00010>¢\u0006\u0002\b\u00182:\b\u0006\u00106\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0006\u0012\u0004\u0018\u000101032H\b\u0004\u00107\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110!¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H+¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010@¨\u0006A"}, d2 = {"LazyHorizontalGrid", "", "rows", "Landroidx/compose/foundation/lazy/grid/GridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalGrid", "columns", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "rememberColumnWidthSums", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "items", "T", "", "key", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "contentType", "itemContent", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r2, T[] r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C616@27742L22:LazyGridDsl.kt#7791vq");
            int $dirty = $changed;
            if (($changed & 6) != 0) goto L10;
            if ($composer.changed($this$items) == false) goto L7;
            int r1 = 4;
        L8:
            $dirty = $dirty | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if (($changed & 48) != 0) goto L17;
            if ($composer.changed(it) == false) goto L14;
            int r2 = 32;
        L15:
            $dirty = $dirty | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if (($dirty & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if ($composer.shouldExecute(r3, $dirty & 1) == true) goto L23;
            $composer.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(407562193, $dirty, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:616)");
        L25:
            this.$itemContent.invoke($this$items, this.$items[it], $composer, Integer.valueOf($dirty & 14));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03162 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public C03162(Function1<? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r3) {
            return this.$key.invoke((T) this.$items.get(r3));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> r2, List<? extends T> r3) {
            this.$span = r2;
            this.$items = r3;
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope r3, Integer r4) {
            return GridItemSpan.m846boximpl(m855invoke_orMbw(r3, r4.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m855invoke_orMbw(LazyGridItemSpanScope r3, int r4) {
            return this.$span.invoke(r3, (T) this.$items.get(r4)).m853unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function1<? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r3) {
            return this.$contentType.invoke((T) this.$items.get(r3));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r2, List<? extends T> r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyGridItemScope r5, int r6, Composer r7, int r8) {
            ComposerKt.sourceInformation(r7, "C542@23993L22:LazyGridDsl.kt#7791vq");
            int r0 = r8;
            if ((r8 & 6) != 0) goto L10;
            if (r7.changed(r5) == false) goto L7;
            int r1 = 4;
        L8:
            r0 = r0 | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if ((r8 & 48) != 0) goto L17;
            if (r7.changed(r6) == false) goto L14;
            int r2 = 32;
        L15:
            r0 = r0 | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if ((r0 & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if (r7.shouldExecute(r3, r0 & 1) == true) goto L23;
            r7.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(699646206, r0, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
        L25:
            Function4<LazyGridItemScope, T, Composer, Integer, Unit> r4 = this.$itemContent;
            Object r9 = this.$items.get(r6);
            T r10 = (T) r9;
            r4.invoke(r5, r10, r7, Integer.valueOf(r0 & 14));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> r2, T[] r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$key.invoke(this.$items[index]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> r2, T[] r3) {
            this.$span = r2;
            this.$items = r3;
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope r3, Integer r4) {
            return GridItemSpan.m846boximpl(m856invoke_orMbw(r3, r4.intValue()));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m856invoke_orMbw(LazyGridItemSpanScope $this$null, int it) {
            return this.$span.invoke($this$null, this.$items[it]).m853unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass9 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function1<? super T, ? extends Object> r2, T[] r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$contentType.invoke(this.$items[index]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C031810 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C031810(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r2, T[] r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C653@29682L26:LazyGridDsl.kt#7791vq");
            int $dirty = $changed;
            if (($changed & 6) != 0) goto L10;
            if ($composer.changed($this$items) == false) goto L7;
            int r1 = 4;
        L8:
            $dirty = $dirty | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if (($changed & 48) != 0) goto L17;
            if ($composer.changed(it) == false) goto L14;
            int r2 = 32;
        L15:
            $dirty = $dirty | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if (($dirty & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if ($composer.shouldExecute(r3, $dirty & 1) == true) goto L23;
            $composer.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(-911455938, $dirty, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:653)");
        L25:
            this.$itemContent.invoke($this$items, Integer.valueOf(it), this.$items[it], $composer, Integer.valueOf(($dirty & 14) | ($dirty & 112)));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03192 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public C03192(Function2<? super Integer, ? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r4) {
            return this.$key.invoke(Integer.valueOf(r4), (T) this.$items.get(r4));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03203 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: Multi-variable type inference failed */
        public C03203(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> r2, List<? extends T> r3) {
            this.$span = r2;
            this.$items = r3;
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope r3, Integer r4) {
            return GridItemSpan.m846boximpl(m857invoke_orMbw(r3, r4.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m857invoke_orMbw(LazyGridItemSpanScope r4, int r5) {
            return this.$span.invoke(r4, Integer.valueOf(r5), (T) this.$items.get(r5)).m853unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03214 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03214(Function2<? super Integer, ? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r4) {
            return this.$contentType.invoke(Integer.valueOf(r4), (T) this.$items.get(r4));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03225 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03225(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r2, List<? extends T> r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyGridItemScope r11, int r12, Composer r13, int r14) {
            ComposerKt.sourceInformation(r13, "C579@25929L26:LazyGridDsl.kt#7791vq");
            int r0 = r14;
            if ((r14 & 6) != 0) goto L10;
            if (r13.changed(r11) == false) goto L7;
            int r1 = 4;
        L8:
            r0 = r0 | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if ((r14 & 48) != 0) goto L17;
            if (r13.changed(r12) == false) goto L14;
            int r2 = 32;
        L15:
            r0 = r0 | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if ((r0 & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if (r13.shouldExecute(r3, r0 & 1) == true) goto L23;
            r13.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(1229287273, r0, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:579)");
        L25:
            Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> r4 = this.$itemContent;
            Integer r6 = Integer.valueOf(r12);
            Object r7 = this.$items.get(r12);
            T r8 = (T) r7;
            r4.invoke(r11, r6, r8, r13, Integer.valueOf((r0 & 14) | (r0 & 112)));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03247 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public C03247(Function2<? super Integer, ? super T, ? extends Object> r2, T[] r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$key.invoke(Integer.valueOf(index), this.$items[index]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03258 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: Multi-variable type inference failed */
        public C03258(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> r2, T[] r3) {
            this.$span = r2;
            this.$items = r3;
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope r3, Integer r4) {
            return GridItemSpan.m846boximpl(m858invoke_orMbw(r3, r4.intValue()));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m858invoke_orMbw(LazyGridItemSpanScope $this$null, int it) {
            return this.$span.invoke($this$null, Integer.valueOf(it), this.$items[it]).m853unboximpl();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03269 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03269(Function2<? super Integer, ? super T, ? extends Object> r2, T[] r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$contentType.invoke(Integer.valueOf(index), this.$items[index]);
        }
    }

    public static final /* synthetic */ List access$calculateCellsCrossAxisSizeImpl(int gridSize, int slotCount, int spacing) {
        return calculateCellsCrossAxisSizeImpl(gridSize, slotCount, spacing);
    }

    public static final void LazyVerticalGrid(final GridCells columns, Modifier modifier, LazyGridState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, FlingBehavior flingBehavior, boolean userScrollEnabled, OverscrollEffect overscrollEffect, final Function1<? super LazyGridScope, Unit> r41, Composer $composer, final int $changed, final int $changed1, final int r45) {
        Composer $composer2 = $composer.startRestartGroup(-2072102870);
        ComposerKt.sourceInformation($composer2, "C(LazyVerticalGrid)P(!1,5,8,2,7,10,4,3,9,6)81@3848L55,80@3822L510:LazyGridDsl.kt#7791vq");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r45 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r45 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        LazyGridState state2 = state;
    L34:
        int r10 = r45 & 8;
        if (r10 == 0) goto L38;
        $dirty = $dirty | 3072;
        PaddingValues contentPadding2 = contentPadding;
    L45:
        int r13 = r45 & 16;
        if (r13 == 0) goto L49;
        $dirty = $dirty | 24576;
        boolean reverseLayout2 = reverseLayout;
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L59;
        Arrangement.Vertical verticalArrangement2 = verticalArrangement;
    L67:
        int r17 = r45 & 64;
        if (r17 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if (($changed & 12582912) != 0) goto L89;
        if ((r45 & 128) != 0) goto L86;
        if ($composer2.changed(flingBehavior) == false) goto L86;
        int r20 = 8388608;
    L87:
        $dirty = $dirty | r20;
    L86:
        r20 = 4194304;
    L89:
        int r0 = r45 & 256;
        if (r0 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if (($changed & 805306368) != 0) goto L112;
        if ((r45 & 512) != 0) goto L108;
        if ($composer2.changed(overscrollEffect) == false) goto L108;
        int r21 = 536870912;
    L109:
        $dirty = $dirty | r21;
    L108:
        r21 = 268435456;
    L112:
        if ((r45 & 1024) == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        if (($dirty & 306783379) == 306783378) goto L125;
    L128:
        boolean r1 = true;
    L130:
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L186;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "69@3290L23,75@3650L15,77@3748L26");
        if (($changed & 1) != 0) goto L134;
    L149:
        if (r5 == 0) goto L152;
        modifier2 = Modifier.Companion;
    L152:
        if ((r45 & 4) == 0) goto L154;
        $dirty = $dirty & (-897);
        state2 = LazyGridStateKt.rememberLazyGridState(0, 0, $composer2, 0, 3);
    L154:
        if (r10 == 0) goto L156;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L156:
        if (r13 == 0) goto L159;
        reverseLayout2 = false;
    L159:
        if ((r45 & 32) == 0) goto L165;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L163;
        Arrangement.Vertical verticalArrangement3 = r2.getTop();
    L164:
        $dirty = $dirty & (-458753);
        verticalArrangement2 = verticalArrangement3;
        goto L165
    L163:
        verticalArrangement3 = r2.getBottom();
    L165:
        if (r17 == 0) goto L167;
        Arrangement.Horizontal horizontalArrangement2 = Arrangement.INSTANCE.getStart();
    L169:
        if ((r45 & 128) == 0) goto L171;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L172:
        if (r0 == 0) goto L174;
        boolean userScrollEnabled2 = true;
    L176:
        if ((r45 & 512) == 0) goto L178;
        $dirty = $dirty & (-1879048193);
        FlingBehavior flingBehavior3 = flingBehavior2;
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        Arrangement.Vertical verticalArrangement4 = verticalArrangement2;
        boolean userScrollEnabled3 = userScrollEnabled2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        int r6 = -2072102870;
        Modifier modifier3 = modifier2;
        LazyGridState state3 = state2;
    L179:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L182;
        ComposerKt.traceEventStart(r6, $dirty, $dirty1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
    L182:
        Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        Composer $composer3 = $composer2;
        LazyGridKt.LazyGrid(modifier3, state3, rememberColumnWidthSums(columns, horizontalArrangement2, $composer2, ($dirty & 14) | (($dirty >> 15) & 112)), contentPadding3, reverseLayout3, true, flingBehavior3, userScrollEnabled3, overscrollEffect2, verticalArrangement4, horizontalArrangement3, r41, $composer3, (((((((196608 | (($dirty >> 3) & 14)) | (($dirty >> 3) & 112)) | ($dirty & 7168)) | (57344 & $dirty)) | (($dirty >> 3) & 3670016)) | (($dirty >> 3) & 29360128)) | (($dirty >> 3) & 234881024)) | (($dirty << 12) & 1879048192), (($dirty >> 18) & 14) | (($dirty1 << 3) & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L185;
        ComposerKt.traceEventEnd();
    L185:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final Arrangement.Vertical verticalArrangement5 = verticalArrangement4;
        final Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement3;
        int $dirty2 = $dirty;
        final LazyGridState state4 = state3;
    L187:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L191;
        r11.updateScope(new C03131(columns, modifier4, state4, contentPadding4, reverseLayout4, verticalArrangement5, horizontalArrangement4, flingBehavior4, userScrollEnabled4, overscrollEffect3, r41, $changed, $changed1, r45));
        return;
    L191:
        return;
    L178:
        overscrollEffect2 = overscrollEffect;
        flingBehavior3 = flingBehavior2;
        verticalArrangement4 = verticalArrangement2;
        userScrollEnabled3 = userScrollEnabled2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        r6 = -2072102870;
        modifier3 = modifier2;
        state3 = state2;
        goto L179
    L174:
        userScrollEnabled2 = userScrollEnabled;
        goto L176
    L171:
        flingBehavior2 = flingBehavior;
        goto L172
    L167:
        horizontalArrangement2 = horizontalArrangement;
        goto L169
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L149;
        $composer2.skipToGroupEnd();
        if ((r45 & 4) == 0) goto L140;
        $dirty = $dirty & (-897);
    L140:
        if ((r45 & 32) == 0) goto L143;
        $dirty = $dirty & (-458753);
    L143:
        if ((r45 & 128) == 0) goto L146;
        $dirty = $dirty & (-29360129);
    L146:
        if ((r45 & 512) == 0) goto L148;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        $dirty = (-1879048193) & $dirty;
        verticalArrangement4 = verticalArrangement2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        r6 = -2072102870;
        horizontalArrangement2 = horizontalArrangement;
        modifier3 = modifier2;
        state3 = state2;
        goto L179
    L148:
        horizontalArrangement2 = horizontalArrangement;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        verticalArrangement4 = verticalArrangement2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        r6 = -2072102870;
        modifier3 = modifier2;
        state3 = state2;
        goto L179
    L186:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overscrollEffect3 = overscrollEffect;
        verticalArrangement5 = verticalArrangement2;
        modifier4 = modifier2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        horizontalArrangement4 = horizontalArrangement;
        flingBehavior4 = flingBehavior;
        $dirty2 = $dirty;
        state4 = state2;
        userScrollEnabled4 = userScrollEnabled;
        goto L187
    L125:
        if (($dirty1 & 3) != 2) goto L128;
        r1 = false;
        goto L130
    L115:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r41) == false) goto L119;
        int r22 = 4;
    L120:
        $dirty1 = $dirty1 | r22;
        goto L123
    L119:
        r22 = 2;
        goto L120
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(userScrollEnabled) == false) goto L97;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r23;
        goto L101
    L97:
        r23 = 33554432;
        goto L98
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(horizontalArrangement) == false) goto L75;
        int r19 = 1048576;
    L76:
        $dirty = $dirty | r19;
        goto L79
    L75:
        r19 = 524288;
        goto L76
    L59:
        if ((r45 & 32) != 0) goto L63;
        verticalArrangement2 = verticalArrangement;
        if ($composer2.changed(verticalArrangement2) == false) goto L64;
        int r18 = 131072;
    L65:
        $dirty = $dirty | r18;
    L64:
        r18 = 65536;
        goto L65
    L63:
        verticalArrangement2 = verticalArrangement;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L53;
        int r16 = 16384;
    L54:
        $dirty = $dirty | r16;
        goto L57
    L53:
        r16 = 8192;
        goto L54
    L55:
        reverseLayout2 = reverseLayout;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L42;
        int r14 = 2048;
    L43:
        $dirty = $dirty | r14;
        goto L45
    L42:
        r14 = 1024;
        goto L43
    L44:
        contentPadding2 = contentPadding;
        goto L45
    L26:
        if ((r45 & 4) != 0) goto L30;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L31;
        int r12 = 256;
    L32:
        $dirty = $dirty | r12;
    L31:
        r12 = 128;
        goto L32
    L30:
        state2 = state;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r9 = 32;
    L21:
        $dirty = $dirty | r9;
        goto L24
    L20:
        r9 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(columns) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L12
    L10:
        r7 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyVerticalGrid(final GridCells columns, Modifier modifier, LazyGridState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, FlingBehavior flingBehavior, boolean userScrollEnabled, final Function1 content, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(1485410512);
        ComposerKt.sourceInformation($composer2, "C(LazyVerticalGrid)P(!1,5,7,2,6,9,4,3,8)121@5394L26,111@4998L455:LazyGridDsl.kt#7791vq");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        GridCells r13 = columns;
    L13:
        int r3 = r40 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if (($changed & 384) == 0) goto L27;
        LazyGridState r5 = state;
    L35:
        int r6 = r40 & 8;
        if (r6 == 0) goto L39;
        $dirty = $dirty | 3072;
        PaddingValues r7 = contentPadding;
    L46:
        int r8 = r40 & 16;
        if (r8 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r9 = reverseLayout;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Arrangement.Vertical r10 = verticalArrangement;
    L68:
        int r14 = r40 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Arrangement.Horizontal r15 = horizontalArrangement;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r40 & 128) != 0) goto L87;
        if ($composer2.changed(flingBehavior) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
    L87:
        r17 = 4194304;
    L90:
        int r0 = r40 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r40 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
        boolean r1 = true;
    L117:
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L171;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "101@4536L23,107@4896L15");
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r3 == 0) goto L135;
        Modifier.Companion modifier2 = Modifier.Companion;
    L137:
        if ((r40 & 4) == 0) goto L139;
        LazyGridState state2 = LazyGridStateKt.rememberLazyGridState(0, 0, $composer2, 0, 3);
        $dirty = $dirty & (-897);
    L140:
        if (r6 == 0) goto L142;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L143:
        if (r8 == 0) goto L145;
        boolean reverseLayout2 = false;
    L147:
        if ((r40 & 32) == 0) goto L153;
        Arrangement r11 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L151;
        Arrangement.Vertical verticalArrangement2 = r11.getTop();
    L152:
        $dirty = $dirty & (-458753);
    L154:
        if (r14 == 0) goto L156;
        Arrangement.Horizontal horizontalArrangement2 = Arrangement.INSTANCE.getStart();
    L158:
        if ((r40 & 128) == 0) goto L160;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L161:
        if (r0 == 0) goto L163;
        Modifier modifier3 = modifier2;
        LazyGridState state3 = state2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        boolean userScrollEnabled2 = true;
        int r2 = 0;
        int r4 = 1485410512;
    L164:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L167;
        ComposerKt.traceEventStart(r4, $dirty, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:110)");
    L167:
        Composer $composer3 = $composer2;
        LazyVerticalGrid(r13, modifier3, state3, contentPadding3, reverseLayout3, verticalArrangement3, horizontalArrangement3, flingBehavior3, userScrollEnabled2, OverscrollKt.rememberOverscrollEffect($composer2, r2), content, $composer3, (((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty), ($dirty >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L170;
        ComposerKt.traceEventEnd();
    L170:
        final Modifier modifier4 = modifier3;
        final LazyGridState state4 = state3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final Arrangement.Vertical verticalArrangement4 = verticalArrangement3;
        final Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled3 = userScrollEnabled2;
    L172:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L176;
        r16.updateScope(new C03142(columns, modifier4, state4, contentPadding4, reverseLayout4, verticalArrangement4, horizontalArrangement4, flingBehavior4, userScrollEnabled3, content, $changed, r40));
        return;
    L176:
        return;
    L163:
        userScrollEnabled2 = userScrollEnabled;
        modifier3 = modifier2;
        state3 = state2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        verticalArrangement3 = verticalArrangement2;
        horizontalArrangement3 = horizontalArrangement2;
        flingBehavior3 = flingBehavior2;
        r2 = 0;
        r4 = 1485410512;
        goto L164
    L160:
        flingBehavior2 = flingBehavior;
        goto L161
    L156:
        horizontalArrangement2 = r15;
        goto L158
    L151:
        verticalArrangement2 = r11.getBottom();
        goto L152
    L153:
        verticalArrangement2 = r10;
        goto L154
    L145:
        reverseLayout2 = r9;
        goto L147
    L142:
        contentPadding2 = r7;
        goto L143
    L139:
        state2 = r5;
        goto L140
    L135:
        modifier2 = modifier;
        goto L137
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L127;
        $dirty = $dirty & (-897);
    L127:
        if ((r40 & 32) == 0) goto L130;
        $dirty = $dirty & (-458753);
    L130:
        if ((r40 & 128) == 0) goto L132;
        modifier3 = modifier;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        $dirty = $dirty & (-29360129);
        r2 = 0;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        verticalArrangement3 = r10;
        horizontalArrangement3 = r15;
        r4 = 1485410512;
        state3 = r5;
        goto L164
    L132:
        modifier3 = modifier;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        r2 = 0;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        verticalArrangement3 = r10;
        horizontalArrangement3 = r15;
        r4 = 1485410512;
        state3 = r5;
        goto L164
    L171:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        flingBehavior4 = flingBehavior;
        state4 = r5;
        contentPadding4 = r7;
        reverseLayout4 = r9;
        verticalArrangement4 = r10;
        horizontalArrangement4 = r15;
        modifier4 = modifier;
        userScrollEnabled3 = userScrollEnabled;
        goto L172
    L115:
        r1 = false;
        goto L117
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(content) == false) goto L109;
        int r18 = 536870912;
    L110:
        $dirty = $dirty | r18;
        goto L113
    L109:
        r18 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(userScrollEnabled) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
        goto L102
    L98:
        r19 = 33554432;
        goto L99
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r15 = horizontalArrangement;
        if ($composer2.changed(r15) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L78:
        r15 = horizontalArrangement;
        goto L80
    L60:
        if ((r40 & 32) != 0) goto L64;
        r10 = verticalArrangement;
        if ($composer2.changed(r10) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
    L65:
        r111 = 65536;
        goto L66
    L64:
        r10 = verticalArrangement;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        r9 = reverseLayout;
        if ($composer2.changed(r9) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
        goto L58
    L54:
        r12 = 8192;
        goto L55
    L56:
        r9 = reverseLayout;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r7 = contentPadding;
        if ($composer2.changed(r7) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
        goto L46
    L43:
        r20 = 1024;
        goto L44
    L45:
        r7 = contentPadding;
        goto L46
    L27:
        if ((r40 & 4) != 0) goto L31;
        r5 = state;
        if ($composer2.changed(r5) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
    L32:
        r21 = 128;
        goto L33
    L31:
        r5 = state;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changed(modifier) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L25
    L21:
        r22 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = columns;
        if ($composer2.changed(r13) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L13
    L10:
        r23 = 2;
        goto L11
    L12:
        r13 = columns;
        goto L13
    }

    public static final void LazyHorizontalGrid(final GridCells rows, Modifier modifier, LazyGridState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, FlingBehavior flingBehavior, boolean userScrollEnabled, OverscrollEffect overscrollEffect, final Function1<? super LazyGridScope, Unit> r41, Composer $composer, final int $changed, final int $changed1, final int r45) {
        Composer $composer2 = $composer.startRestartGroup(635941664);
        ComposerKt.sourceInformation($composer2, "C(LazyHorizontalGrid)P(7,4,8,1,6,3,10,2,9,5)170@7819L48,169@7793L504:LazyGridDsl.kt#7791vq");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r45 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r45 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        LazyGridState state2 = state;
    L34:
        int r10 = r45 & 8;
        if (r10 == 0) goto L38;
        $dirty = $dirty | 3072;
        PaddingValues contentPadding2 = contentPadding;
    L45:
        int r13 = r45 & 16;
        if (r13 == 0) goto L49;
        $dirty = $dirty | 24576;
        boolean reverseLayout2 = reverseLayout;
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L59;
        Arrangement.Horizontal horizontalArrangement2 = horizontalArrangement;
    L67:
        int r17 = r45 & 64;
        if (r17 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if (($changed & 12582912) != 0) goto L89;
        if ((r45 & 128) != 0) goto L86;
        if ($composer2.changed(flingBehavior) == false) goto L86;
        int r20 = 8388608;
    L87:
        $dirty = $dirty | r20;
    L86:
        r20 = 4194304;
    L89:
        int r0 = r45 & 256;
        if (r0 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if (($changed & 805306368) != 0) goto L112;
        if ((r45 & 512) != 0) goto L108;
        if ($composer2.changed(overscrollEffect) == false) goto L108;
        int r21 = 536870912;
    L109:
        $dirty = $dirty | r21;
    L108:
        r21 = 268435456;
    L112:
        if ((r45 & 1024) == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        if (($dirty & 306783379) == 306783378) goto L125;
    L128:
        boolean r1 = true;
    L130:
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L186;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "158@7264L23,164@7621L15,166@7719L26");
        if (($changed & 1) != 0) goto L134;
    L149:
        if (r5 == 0) goto L152;
        modifier2 = Modifier.Companion;
    L152:
        if ((r45 & 4) == 0) goto L154;
        $dirty = $dirty & (-897);
        state2 = LazyGridStateKt.rememberLazyGridState(0, 0, $composer2, 0, 3);
    L154:
        if (r10 == 0) goto L156;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L156:
        if (r13 == 0) goto L159;
        reverseLayout2 = false;
    L159:
        if ((r45 & 32) == 0) goto L165;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L163;
        Arrangement.Horizontal horizontalArrangement3 = r2.getStart();
    L164:
        $dirty = $dirty & (-458753);
        horizontalArrangement2 = horizontalArrangement3;
        goto L165
    L163:
        horizontalArrangement3 = r2.getEnd();
    L165:
        if (r17 == 0) goto L167;
        Arrangement.Vertical verticalArrangement2 = Arrangement.INSTANCE.getTop();
    L169:
        if ((r45 & 128) == 0) goto L171;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L172:
        if (r0 == 0) goto L174;
        boolean userScrollEnabled2 = true;
    L176:
        if ((r45 & 512) == 0) goto L178;
        $dirty = $dirty & (-1879048193);
        FlingBehavior flingBehavior3 = flingBehavior2;
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement2;
        boolean userScrollEnabled3 = userScrollEnabled2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        int r6 = 635941664;
        Modifier modifier3 = modifier2;
        LazyGridState state3 = state2;
    L179:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L182;
        ComposerKt.traceEventStart(r6, $dirty, $dirty1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:168)");
    L182:
        Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        Composer $composer3 = $composer2;
        LazyGridKt.LazyGrid(modifier3, state3, rememberRowHeightSums(rows, verticalArrangement2, $composer2, ($dirty & 14) | (($dirty >> 15) & 112)), contentPadding3, reverseLayout3, false, flingBehavior3, userScrollEnabled3, overscrollEffect2, verticalArrangement3, horizontalArrangement4, r41, $composer3, (((((((196608 | (($dirty >> 3) & 14)) | (($dirty >> 3) & 112)) | ($dirty & 7168)) | (57344 & $dirty)) | (($dirty >> 3) & 3670016)) | (($dirty >> 3) & 29360128)) | (($dirty >> 3) & 234881024)) | (($dirty << 9) & 1879048192), (($dirty >> 15) & 14) | (($dirty1 << 3) & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L185;
        ComposerKt.traceEventEnd();
    L185:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final Arrangement.Vertical verticalArrangement4 = verticalArrangement3;
        final Arrangement.Horizontal horizontalArrangement5 = horizontalArrangement4;
        int $dirty2 = $dirty;
        final LazyGridState state4 = state3;
    L187:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L191;
        r11.updateScope(new AnonymousClass1(rows, modifier4, state4, contentPadding4, reverseLayout4, horizontalArrangement5, verticalArrangement4, flingBehavior4, userScrollEnabled4, overscrollEffect3, r41, $changed, $changed1, r45));
        return;
    L191:
        return;
    L178:
        overscrollEffect2 = overscrollEffect;
        flingBehavior3 = flingBehavior2;
        horizontalArrangement4 = horizontalArrangement2;
        userScrollEnabled3 = userScrollEnabled2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        r6 = 635941664;
        modifier3 = modifier2;
        state3 = state2;
        goto L179
    L174:
        userScrollEnabled2 = userScrollEnabled;
        goto L176
    L171:
        flingBehavior2 = flingBehavior;
        goto L172
    L167:
        verticalArrangement2 = verticalArrangement;
        goto L169
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L149;
        $composer2.skipToGroupEnd();
        if ((r45 & 4) == 0) goto L140;
        $dirty = $dirty & (-897);
    L140:
        if ((r45 & 32) == 0) goto L143;
        $dirty = $dirty & (-458753);
    L143:
        if ((r45 & 128) == 0) goto L146;
        $dirty = $dirty & (-29360129);
    L146:
        if ((r45 & 512) == 0) goto L148;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        $dirty = (-1879048193) & $dirty;
        horizontalArrangement4 = horizontalArrangement2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        r6 = 635941664;
        verticalArrangement2 = verticalArrangement;
        modifier3 = modifier2;
        state3 = state2;
        goto L179
    L148:
        verticalArrangement2 = verticalArrangement;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        horizontalArrangement4 = horizontalArrangement2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        r6 = 635941664;
        modifier3 = modifier2;
        state3 = state2;
        goto L179
    L186:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overscrollEffect3 = overscrollEffect;
        horizontalArrangement5 = horizontalArrangement2;
        modifier4 = modifier2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        verticalArrangement4 = verticalArrangement;
        flingBehavior4 = flingBehavior;
        $dirty2 = $dirty;
        state4 = state2;
        userScrollEnabled4 = userScrollEnabled;
        goto L187
    L125:
        if (($dirty1 & 3) != 2) goto L128;
        r1 = false;
        goto L130
    L115:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changedInstance(r41) == false) goto L119;
        int r22 = 4;
    L120:
        $dirty1 = $dirty1 | r22;
        goto L123
    L119:
        r22 = 2;
        goto L120
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(userScrollEnabled) == false) goto L97;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r23;
        goto L101
    L97:
        r23 = 33554432;
        goto L98
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(verticalArrangement) == false) goto L75;
        int r19 = 1048576;
    L76:
        $dirty = $dirty | r19;
        goto L79
    L75:
        r19 = 524288;
        goto L76
    L59:
        if ((r45 & 32) != 0) goto L63;
        horizontalArrangement2 = horizontalArrangement;
        if ($composer2.changed(horizontalArrangement2) == false) goto L64;
        int r18 = 131072;
    L65:
        $dirty = $dirty | r18;
    L64:
        r18 = 65536;
        goto L65
    L63:
        horizontalArrangement2 = horizontalArrangement;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L53;
        int r16 = 16384;
    L54:
        $dirty = $dirty | r16;
        goto L57
    L53:
        r16 = 8192;
        goto L54
    L55:
        reverseLayout2 = reverseLayout;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L42;
        int r14 = 2048;
    L43:
        $dirty = $dirty | r14;
        goto L45
    L42:
        r14 = 1024;
        goto L43
    L44:
        contentPadding2 = contentPadding;
        goto L45
    L26:
        if ((r45 & 4) != 0) goto L30;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L31;
        int r12 = 256;
    L32:
        $dirty = $dirty | r12;
    L31:
        r12 = 128;
        goto L32
    L30:
        state2 = state;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r9 = 32;
    L21:
        $dirty = $dirty | r9;
        goto L24
    L20:
        r9 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(rows) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L12
    L10:
        r7 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyHorizontalGrid(final GridCells rows, Modifier modifier, LazyGridState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, FlingBehavior flingBehavior, boolean userScrollEnabled, final Function1 content, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(2123608858);
        ComposerKt.sourceInformation($composer2, "C(LazyHorizontalGrid)P(6,4,7,1,5,3,9,2,8)210@9351L26,200@8959L451:LazyGridDsl.kt#7791vq");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        GridCells r13 = rows;
    L13:
        int r3 = r40 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if (($changed & 384) == 0) goto L27;
        LazyGridState r5 = state;
    L35:
        int r6 = r40 & 8;
        if (r6 == 0) goto L39;
        $dirty = $dirty | 3072;
        PaddingValues r7 = contentPadding;
    L46:
        int r8 = r40 & 16;
        if (r8 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r9 = reverseLayout;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Arrangement.Horizontal r10 = horizontalArrangement;
    L68:
        int r14 = r40 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Arrangement.Vertical r15 = verticalArrangement;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r40 & 128) != 0) goto L87;
        if ($composer2.changed(flingBehavior) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
    L87:
        r17 = 4194304;
    L90:
        int r0 = r40 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r40 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
        boolean r1 = true;
    L117:
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L171;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "190@8500L23,196@8857L15");
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r3 == 0) goto L135;
        Modifier.Companion modifier2 = Modifier.Companion;
    L137:
        if ((r40 & 4) == 0) goto L139;
        LazyGridState state2 = LazyGridStateKt.rememberLazyGridState(0, 0, $composer2, 0, 3);
        $dirty = $dirty & (-897);
    L140:
        if (r6 == 0) goto L142;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L143:
        if (r8 == 0) goto L145;
        boolean reverseLayout2 = false;
    L147:
        if ((r40 & 32) == 0) goto L153;
        Arrangement r11 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L151;
        Arrangement.Horizontal horizontalArrangement2 = r11.getStart();
    L152:
        $dirty = $dirty & (-458753);
    L154:
        if (r14 == 0) goto L156;
        Arrangement.Vertical verticalArrangement2 = Arrangement.INSTANCE.getTop();
    L158:
        if ((r40 & 128) == 0) goto L160;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L161:
        if (r0 == 0) goto L163;
        Modifier modifier3 = modifier2;
        LazyGridState state3 = state2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        boolean userScrollEnabled2 = true;
        int r2 = 0;
        int r4 = 2123608858;
    L164:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L167;
        ComposerKt.traceEventStart(r4, $dirty, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:199)");
    L167:
        Composer $composer3 = $composer2;
        LazyHorizontalGrid(r13, modifier3, state3, contentPadding3, reverseLayout3, horizontalArrangement3, verticalArrangement3, flingBehavior3, userScrollEnabled2, OverscrollKt.rememberOverscrollEffect($composer2, r2), content, $composer3, (((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty), ($dirty >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L170;
        ComposerKt.traceEventEnd();
    L170:
        final Modifier modifier4 = modifier3;
        final LazyGridState state4 = state3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement3;
        final Arrangement.Vertical verticalArrangement4 = verticalArrangement3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled3 = userScrollEnabled2;
    L172:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L176;
        r16.updateScope(new AnonymousClass2(rows, modifier4, state4, contentPadding4, reverseLayout4, horizontalArrangement4, verticalArrangement4, flingBehavior4, userScrollEnabled3, content, $changed, r40));
        return;
    L176:
        return;
    L163:
        userScrollEnabled2 = userScrollEnabled;
        modifier3 = modifier2;
        state3 = state2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        horizontalArrangement3 = horizontalArrangement2;
        verticalArrangement3 = verticalArrangement2;
        flingBehavior3 = flingBehavior2;
        r2 = 0;
        r4 = 2123608858;
        goto L164
    L160:
        flingBehavior2 = flingBehavior;
        goto L161
    L156:
        verticalArrangement2 = r15;
        goto L158
    L151:
        horizontalArrangement2 = r11.getEnd();
        goto L152
    L153:
        horizontalArrangement2 = r10;
        goto L154
    L145:
        reverseLayout2 = r9;
        goto L147
    L142:
        contentPadding2 = r7;
        goto L143
    L139:
        state2 = r5;
        goto L140
    L135:
        modifier2 = modifier;
        goto L137
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L127;
        $dirty = $dirty & (-897);
    L127:
        if ((r40 & 32) == 0) goto L130;
        $dirty = $dirty & (-458753);
    L130:
        if ((r40 & 128) == 0) goto L132;
        modifier3 = modifier;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        $dirty = $dirty & (-29360129);
        r2 = 0;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        horizontalArrangement3 = r10;
        verticalArrangement3 = r15;
        r4 = 2123608858;
        state3 = r5;
        goto L164
    L132:
        modifier3 = modifier;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        r2 = 0;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        horizontalArrangement3 = r10;
        verticalArrangement3 = r15;
        r4 = 2123608858;
        state3 = r5;
        goto L164
    L171:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        flingBehavior4 = flingBehavior;
        state4 = r5;
        contentPadding4 = r7;
        reverseLayout4 = r9;
        horizontalArrangement4 = r10;
        verticalArrangement4 = r15;
        modifier4 = modifier;
        userScrollEnabled3 = userScrollEnabled;
        goto L172
    L115:
        r1 = false;
        goto L117
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(content) == false) goto L109;
        int r18 = 536870912;
    L110:
        $dirty = $dirty | r18;
        goto L113
    L109:
        r18 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(userScrollEnabled) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
        goto L102
    L98:
        r19 = 33554432;
        goto L99
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r15 = verticalArrangement;
        if ($composer2.changed(r15) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L78:
        r15 = verticalArrangement;
        goto L80
    L60:
        if ((r40 & 32) != 0) goto L64;
        r10 = horizontalArrangement;
        if ($composer2.changed(r10) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
    L65:
        r111 = 65536;
        goto L66
    L64:
        r10 = horizontalArrangement;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        r9 = reverseLayout;
        if ($composer2.changed(r9) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
        goto L58
    L54:
        r12 = 8192;
        goto L55
    L56:
        r9 = reverseLayout;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r7 = contentPadding;
        if ($composer2.changed(r7) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
        goto L46
    L43:
        r20 = 1024;
        goto L44
    L45:
        r7 = contentPadding;
        goto L46
    L27:
        if ((r40 & 4) != 0) goto L31;
        r5 = state;
        if ($composer2.changed(r5) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
    L32:
        r21 = 128;
        goto L33
    L31:
        r5 = state;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changed(modifier) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L25
    L21:
        r22 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = rows;
        if ($composer2.changed(r13) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L13
    L10:
        r23 = 2;
        goto L11
    L12:
        r13 = rows;
        goto L13
    }

    private static final LazyGridSlotsProvider rememberColumnWidthSums(final GridCells columns, final Arrangement.Horizontal horizontalArrangement, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -76500289, "C(rememberColumnWidthSums)221@9590L872:LazyGridDsl.kt#7791vq");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-76500289, $changed, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -2102949461, "CC(remember):LazyGridDsl.kt#9igjgp");
        boolean r1 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(columns) == false) goto L10;
    L11:
        boolean r0 = true;
    L14:
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(horizontalArrangement) == false) goto L18;
    L19:
        r1 = true;
    L20:
        boolean invalid$iv = r0 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        Object value$iv = (LazyGridSlotsProvider) new GridSlotCache(new LazyGridDslKt$rememberColumnWidthSums$1$1(columns, horizontalArrangement));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        LazyGridSlotsProvider r3 = (LazyGridSlotsProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L23:
        if (it$iv != Composer.Companion.getEmpty()) goto L27;
    L18:
        if (($changed & 48) != 32) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        r0 = false;
        goto L14
    }

    private static final LazyGridSlotsProvider rememberRowHeightSums(final GridCells rows, final Arrangement.Vertical verticalArrangement, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -150818144, "C(rememberRowHeightSums)248@10619L772:LazyGridDsl.kt#7791vq");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-150818144, $changed, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:248)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -380097672, "CC(remember):LazyGridDsl.kt#9igjgp");
        boolean r1 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(rows) == false) goto L10;
    L11:
        boolean r0 = true;
    L14:
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(verticalArrangement) == false) goto L18;
    L19:
        r1 = true;
    L20:
        boolean invalid$iv = r0 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        Object value$iv = (LazyGridSlotsProvider) new GridSlotCache(new LazyGridDslKt$rememberRowHeightSums$1$1(rows, verticalArrangement));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        LazyGridSlotsProvider r3 = (LazyGridSlotsProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L23:
        if (it$iv != Composer.Companion.getEmpty()) goto L27;
    L18:
        if (($changed & 48) != 32) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        r0 = false;
        goto L14
    }

    private static final List<Integer> calculateCellsCrossAxisSizeImpl(int gridSize, int slotCount, int spacing) {
        int gridSizeWithoutSpacing = gridSize - ((slotCount - 1) * spacing);
        int slotSize = gridSizeWithoutSpacing / slotCount;
        int remainingPixels = gridSizeWithoutSpacing % slotCount;
        ArrayList r3 = new ArrayList(slotCount);
        int r5 = 0;
    L3:
        if (r5 >= slotCount) goto L10;
        int it = r5;
        if (it >= remainingPixels) goto L7;
        int r8 = 1;
    L8:
        r3.add(Integer.valueOf(r8 + slotSize));
        r5 = r5 + 1;
        goto L3
    L7:
        r8 = 0;
        goto L8
    L10:
        return r3;
    }

    public static /* synthetic */ void items$default(LazyGridScope $this$items_u24default, List items, Function1 key, Function2 span, Function1 contentType, Function4 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        span = null;
    L9:
        if ((r12 & 8) == 0) goto L11;
        Function1 contentType2 = C03151.INSTANCE;
        contentType = contentType2;
    L11:
        int r1 = items.size();
        if (key == null) goto L14;
        C03162 r2 = new C03162(key, items);
    L15:
        if (span == null) goto L17;
        AnonymousClass3 r3 = new AnonymousClass3(span, items);
    L18:
        $this$items_u24default.items(r1, r2, r3, new AnonymousClass4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(itemContent, items)));
        return;
    L17:
        r3 = null;
        goto L18
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void items(LazyGridScope $this$items, List<? extends T> r9, Function1<? super T, ? extends Object> r10, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> r11, Function1<? super T, ? extends Object> r12, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.size();
        if (r10 == null) goto L5;
        C03162 r3 = new C03162(r10, r9);
    L6:
        if (r11 == null) goto L8;
        AnonymousClass3 r4 = new AnonymousClass3(r11, r9);
    L9:
        $this$items.items(r2, r3, r4, new AnonymousClass4(r12, r9), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(r13, r9)));
        return;
    L8:
        r4 = null;
        goto L9
    L5:
        r3 = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope $this$itemsIndexed_u24default, List items, Function2 key, Function3 span, Function2 contentType, Function5 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        span = null;
    L9:
        if ((r12 & 8) == 0) goto L11;
        Function2 contentType2 = C03171.INSTANCE;
        contentType = contentType2;
    L11:
        int r1 = items.size();
        if (key == null) goto L14;
        C03192 r2 = new C03192(key, items);
    L15:
        if (span == null) goto L17;
        C03203 r3 = new C03203(span, items);
    L18:
        $this$itemsIndexed_u24default.items(r1, r2, r3, new C03214(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C03225(itemContent, items)));
        return;
    L17:
        r3 = null;
        goto L18
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void itemsIndexed(LazyGridScope $this$itemsIndexed, List<? extends T> r9, Function2<? super Integer, ? super T, ? extends Object> r10, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> r11, Function2<? super Integer, ? super T, ? extends Object> r12, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.size();
        if (r10 == null) goto L5;
        C03192 r3 = new C03192(r10, r9);
    L6:
        if (r11 == null) goto L8;
        C03203 r4 = new C03203(r11, r9);
    L9:
        $this$itemsIndexed.items(r2, r3, r4, new C03214(r12, r9), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C03225(r13, r9)));
        return;
    L8:
        r4 = null;
        goto L9
    L5:
        r3 = null;
        goto L6
    }

    public static /* synthetic */ void items$default(LazyGridScope $this$items_u24default, Object[] items, Function1 key, Function2 span, Function1 contentType, Function4 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        span = null;
    L9:
        if ((r12 & 8) == 0) goto L11;
        Function1 contentType2 = AnonymousClass6.INSTANCE;
        contentType = contentType2;
    L11:
        int r1 = items.length;
        if (key == null) goto L14;
        AnonymousClass7 r2 = new AnonymousClass7(key, items);
    L15:
        if (span == null) goto L17;
        AnonymousClass8 r3 = new AnonymousClass8(span, items);
    L18:
        $this$items_u24default.items(r1, r2, r3, new AnonymousClass9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(itemContent, items)));
        return;
    L17:
        r3 = null;
        goto L18
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void items(LazyGridScope $this$items, T[] r9, Function1<? super T, ? extends Object> r10, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> r11, Function1<? super T, ? extends Object> r12, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.length;
        if (r10 == null) goto L5;
        AnonymousClass7 r3 = new AnonymousClass7(r10, r9);
    L6:
        if (r11 == null) goto L8;
        AnonymousClass8 r4 = new AnonymousClass8(r11, r9);
    L9:
        $this$items.items(r2, r3, r4, new AnonymousClass9(r12, r9), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(r13, r9)));
        return;
    L8:
        r4 = null;
        goto L9
    L5:
        r3 = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope $this$itemsIndexed_u24default, Object[] items, Function2 key, Function3 span, Function2 contentType, Function5 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        span = null;
    L9:
        if ((r12 & 8) == 0) goto L11;
        Function2 contentType2 = C03236.INSTANCE;
        contentType = contentType2;
    L11:
        int r1 = items.length;
        if (key == null) goto L14;
        C03247 r2 = new C03247(key, items);
    L15:
        if (span == null) goto L17;
        C03258 r3 = new C03258(span, items);
    L18:
        $this$itemsIndexed_u24default.items(r1, r2, r3, new C03269(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C031810(itemContent, items)));
        return;
    L17:
        r3 = null;
        goto L18
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void itemsIndexed(LazyGridScope $this$itemsIndexed, T[] r9, Function2<? super Integer, ? super T, ? extends Object> r10, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> r11, Function2<? super Integer, ? super T, ? extends Object> r12, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.length;
        if (r10 == null) goto L5;
        C03247 r3 = new C03247(r10, r9);
    L6:
        if (r11 == null) goto L8;
        C03258 r4 = new C03258(r11, r9);
    L9:
        $this$itemsIndexed.items(r2, r3, r4, new C03269(r12, r9), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C031810(r13, r9)));
        return;
    L8:
        r4 = null;
        goto L9
    L5:
        r3 = null;
        goto L6
    }
}
