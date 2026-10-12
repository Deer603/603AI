package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0083\u0001\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a%\u0010&\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010(\u001a%\u0010)\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010*\u001aÐ\u0001\u0010+\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0-2%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u00010\u00162%\b\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u0001020\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u00010\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010:\u001aÐ\u0001\u0010+\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0;2%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u00010\u00162%\b\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u0001020\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u00010\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010<\u001a¤\u0002\u0010=\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0-2:\b\n\u0010.\u001a4\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u0001072:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u000102072:\b\n\u00104\u001a4\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u0001072H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00010@¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010A\u001a¤\u0002\u0010=\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0;2:\b\n\u0010.\u001a4\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u0001072:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u000102072:\b\n\u00104\u001a4\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u0001072H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110>¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(?\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00010@¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010B\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-121YqSk", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-6qCrX9Q", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "items", "T", "", "key", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "contentType", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r2, T[] r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope r5, Integer r6, Composer r7, Integer r8) {
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
        public final void invoke(LazyStaggeredGridItemScope $this$items, int index, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C480@22351L25:LazyStaggeredGridDsl.kt#fzvcnm");
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
            if ($composer.changed(index) == false) goto L14;
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
            ComposerKt.traceEventStart(2101296000, $dirty, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:480)");
        L25:
            this.$itemContent.invoke($this$items, this.$items[index], $composer, Integer.valueOf($dirty & 14));
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> r2, List<? extends T> r3) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r2, List<? extends T> r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyStaggeredGridItemScope r5, int r6, Composer r7, int r8) {
            ComposerKt.sourceInformation(r7, "C408@18607L25:LazyStaggeredGridDsl.kt#fzvcnm");
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
            ComposerKt.traceEventStart(-886456479, r0, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:408)");
        L25:
            Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> r4 = this.$itemContent;
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function1<? super T, ? extends Object> r2, T[] r3) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C033610 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C033610(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r2, T[] r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope r5, Integer r6, Composer r7, Integer r8) {
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
        public final void invoke(LazyStaggeredGridItemScope $this$items, int index, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C516@24276L32:LazyStaggeredGridDsl.kt#fzvcnm");
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
            if ($composer.changed(index) == false) goto L14;
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
            ComposerKt.traceEventStart(-804487775, $dirty, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:516)");
        L25:
            this.$itemContent.invoke($this$items, Integer.valueOf(index), this.$items[index], $composer, Integer.valueOf(($dirty & 14) | ($dirty & 112)));
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03373 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03373(Function2<? super Integer, ? super T, ? extends Object> r2, List<? extends T> r3) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03385 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03385(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r2, List<? extends T> r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyStaggeredGridItemScope r11, int r12, Composer r13, int r14) {
            ComposerKt.sourceInformation(r13, "C444@20528L32:LazyStaggeredGridDsl.kt#fzvcnm");
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
            ComposerKt.traceEventStart(284833944, r0, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:444)");
        L25:
            Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> r4 = this.$itemContent;
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03408 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03408(Function2<? super Integer, ? super T, ? extends Object> r2, T[] r3) {
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

    /* JADX INFO: renamed from: LazyVerticalStaggeredGrid-6qCrX9Q, reason: not valid java name */
    public static final void m927LazyVerticalStaggeredGrid6qCrX9Q(final StaggeredGridCells columns, Modifier modifier, LazyStaggeredGridState state, PaddingValues contentPadding, boolean reverseLayout, float verticalItemSpacing, Arrangement.Horizontal horizontalArrangement, FlingBehavior flingBehavior, boolean userScrollEnabled, OverscrollEffect overscrollEffect, final Function1<? super LazyStaggeredGridScope, Unit> r41, Composer $composer, final int $changed, final int $changed1, final int r45) {
        Composer $composer2 = $composer.startRestartGroup(-578931208);
        ComposerKt.sourceInformation($composer2, "C(LazyVerticalStaggeredGrid)P(!1,5,8,2,7,10:c#ui.unit.Dp,4,3,9,6)93@4431L67,82@3984L547:LazyStaggeredGridDsl.kt#fzvcnm");
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
        LazyStaggeredGridState state2 = state;
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
    L56:
        int r16 = r45 & 32;
        if (r16 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float verticalItemSpacing2 = verticalItemSpacing;
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
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L179;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "72@3506L32,77@3803L15,79@3901L26");
        if (($changed & 1) != 0) goto L134;
    L146:
        if (r5 == 0) goto L149;
        modifier2 = Modifier.Companion;
    L149:
        if ((r45 & 4) == 0) goto L151;
        $dirty = $dirty & (-897);
        state2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, $composer2, 0, 3);
    L151:
        if (r10 == 0) goto L154;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L154:
        if (r13 == 0) goto L156;
        reverseLayout2 = false;
    L156:
        if (r16 == 0) goto L158;
        verticalItemSpacing2 = Dp.m6973constructorimpl(0);
    L158:
        if (r17 == 0) goto L160;
        Arrangement.HorizontalOrVertical horizontalArrangement2 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(0));
    L162:
        if ((r45 & 128) == 0) goto L164;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L165:
        if (r0 == 0) goto L167;
        boolean userScrollEnabled2 = true;
    L169:
        if ((r45 & 512) == 0) goto L171;
        $dirty = $dirty & (-1879048193);
        FlingBehavior flingBehavior3 = flingBehavior2;
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        float verticalItemSpacing3 = verticalItemSpacing2;
        boolean userScrollEnabled3 = userScrollEnabled2;
        boolean reverseLayout3 = reverseLayout2;
        LazyStaggeredGridState state3 = state2;
    L172:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L175;
        ComposerKt.traceEventStart(-578931208, $dirty, $dirty1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
    L175:
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        PaddingValues contentPadding3 = contentPadding2;
        LazyStaggeredGridKt.m933LazyStaggeredGridw41Enmo(state3, Orientation.Vertical, rememberColumnSlots(columns, horizontalArrangement2, contentPadding2, $composer2, (($dirty & 14) | (($dirty >> 15) & 112)) | (($dirty >> 3) & 896)), modifier3, contentPadding3, reverseLayout3, flingBehavior3, userScrollEnabled3, overscrollEffect2, verticalItemSpacing3, horizontalArrangement2.mo612getSpacingD9Ej5fM(), r41, $composer3, ((((((((($dirty >> 6) & 14) | 48) | (($dirty << 6) & 7168)) | (($dirty << 3) & 57344)) | (($dirty << 3) & 458752)) | (($dirty >> 3) & 3670016)) | (($dirty >> 3) & 29360128)) | (($dirty >> 3) & 234881024)) | (($dirty << 12) & 1879048192), ($dirty1 << 3) & 112, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L178;
        ComposerKt.traceEventEnd();
    L178:
        LazyStaggeredGridState r2 = state3;
        int $dirty2 = $dirty;
        final LazyStaggeredGridState state4 = r2;
        final Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final float verticalItemSpacing4 = verticalItemSpacing3;
    L180:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L184;
        r11.updateScope(new LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1(columns, modifier4, state4, contentPadding4, reverseLayout4, verticalItemSpacing4, horizontalArrangement3, flingBehavior4, userScrollEnabled4, overscrollEffect3, r41, $changed, $changed1, r45));
        return;
    L184:
        return;
    L171:
        overscrollEffect2 = overscrollEffect;
        flingBehavior3 = flingBehavior2;
        verticalItemSpacing3 = verticalItemSpacing2;
        userScrollEnabled3 = userScrollEnabled2;
        reverseLayout3 = reverseLayout2;
        state3 = state2;
        goto L172
    L167:
        userScrollEnabled2 = userScrollEnabled;
        goto L169
    L164:
        flingBehavior2 = flingBehavior;
        goto L165
    L160:
        horizontalArrangement2 = horizontalArrangement;
        goto L162
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L146;
        $composer2.skipToGroupEnd();
        if ((r45 & 4) == 0) goto L140;
        $dirty = $dirty & (-897);
    L140:
        if ((r45 & 128) == 0) goto L143;
        $dirty = $dirty & (-29360129);
    L143:
        if ((r45 & 512) == 0) goto L145;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        $dirty = $dirty & (-1879048193);
        verticalItemSpacing3 = verticalItemSpacing2;
        reverseLayout3 = reverseLayout2;
        horizontalArrangement2 = horizontalArrangement;
        state3 = state2;
        goto L172
    L145:
        horizontalArrangement2 = horizontalArrangement;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        verticalItemSpacing3 = verticalItemSpacing2;
        reverseLayout3 = reverseLayout2;
        state3 = state2;
        goto L172
    L179:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overscrollEffect3 = overscrollEffect;
        verticalItemSpacing4 = verticalItemSpacing2;
        modifier4 = modifier2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        horizontalArrangement3 = horizontalArrangement;
        flingBehavior4 = flingBehavior;
        $dirty2 = $dirty;
        state4 = state2;
        userScrollEnabled4 = userScrollEnabled;
        goto L180
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
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        verticalItemSpacing2 = verticalItemSpacing;
        if ($composer2.changed(verticalItemSpacing2) == false) goto L64;
        int r18 = 131072;
    L65:
        $dirty = $dirty | r18;
        goto L67
    L64:
        r18 = 65536;
        goto L65
    L66:
        verticalItemSpacing2 = verticalItemSpacing;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L56
    L53:
        r110 = 8192;
        goto L54
    L55:
        reverseLayout2 = reverseLayout;
        goto L56
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
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L12
    L10:
        r6 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* JADX INFO: renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    public static final /* synthetic */ void m928LazyVerticalStaggeredGridzadm560(final StaggeredGridCells columns, Modifier modifier, LazyStaggeredGridState state, PaddingValues contentPadding, boolean reverseLayout, float verticalItemSpacing, Arrangement.Horizontal horizontalArrangement, FlingBehavior flingBehavior, boolean userScrollEnabled, final Function1 content, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(1695323794);
        ComposerKt.sourceInformation($composer2, "C(LazyVerticalStaggeredGrid)P(!1,5,7,2,6,9:c#ui.unit.Dp,4,3,8)122@5575L26,112@5170L464:LazyStaggeredGridDsl.kt#fzvcnm");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        StaggeredGridCells r13 = columns;
    L13:
        int r3 = r40 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if (($changed & 384) == 0) goto L27;
        LazyStaggeredGridState r5 = state;
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
    L57:
        int r10 = r40 & 32;
        if (r10 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float r14 = verticalItemSpacing;
    L68:
        int r15 = r40 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
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
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L163;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "103@4762L32,108@5059L15");
        if (($changed & 1) != 0) goto L121;
    L130:
        if (r3 == 0) goto L132;
        Modifier.Companion modifier2 = Modifier.Companion;
    L134:
        if ((r40 & 4) == 0) goto L136;
        LazyStaggeredGridState state2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, $composer2, 0, 3);
        $dirty = $dirty & (-897);
    L137:
        if (r6 == 0) goto L139;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L140:
        if (r8 == 0) goto L142;
        boolean reverseLayout2 = false;
    L143:
        if (r10 == 0) goto L145;
        float verticalItemSpacing2 = Dp.m6973constructorimpl(0);
    L146:
        if (r15 == 0) goto L148;
        Arrangement.HorizontalOrVertical horizontalArrangement2 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(0));
    L150:
        if ((r40 & 128) == 0) goto L152;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L153:
        if (r0 == 0) goto L155;
        Modifier modifier3 = modifier2;
        LazyStaggeredGridState state3 = state2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        float verticalItemSpacing3 = verticalItemSpacing2;
        Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        boolean userScrollEnabled2 = true;
        int r2 = 0;
        int r4 = 1695323794;
    L156:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L159;
        ComposerKt.traceEventStart(r4, $dirty, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:111)");
    L159:
        Composer $composer3 = $composer2;
        m927LazyVerticalStaggeredGrid6qCrX9Q(r13, modifier3, state3, contentPadding3, reverseLayout3, verticalItemSpacing3, horizontalArrangement3, flingBehavior3, userScrollEnabled2, OverscrollKt.rememberOverscrollEffect($composer2, r2), content, $composer3, (((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty), ($dirty >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L162;
        ComposerKt.traceEventEnd();
    L162:
        final Modifier modifier4 = modifier3;
        final LazyStaggeredGridState state4 = state3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final float verticalItemSpacing4 = verticalItemSpacing3;
        final Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled3 = userScrollEnabled2;
    L164:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L168;
        r16.updateScope(new LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$2(columns, modifier4, state4, contentPadding4, reverseLayout4, verticalItemSpacing4, horizontalArrangement4, flingBehavior4, userScrollEnabled3, content, $changed, r40));
        return;
    L168:
        return;
    L155:
        userScrollEnabled2 = userScrollEnabled;
        modifier3 = modifier2;
        state3 = state2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        verticalItemSpacing3 = verticalItemSpacing2;
        horizontalArrangement3 = horizontalArrangement2;
        flingBehavior3 = flingBehavior2;
        r2 = 0;
        r4 = 1695323794;
        goto L156
    L152:
        flingBehavior2 = flingBehavior;
        goto L153
    L148:
        horizontalArrangement2 = horizontalArrangement;
        goto L150
    L145:
        verticalItemSpacing2 = r14;
        goto L146
    L142:
        reverseLayout2 = r9;
        goto L143
    L139:
        contentPadding2 = r7;
        goto L140
    L136:
        state2 = r5;
        goto L137
    L132:
        modifier2 = modifier;
        goto L134
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L130;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L127;
        $dirty = $dirty & (-897);
    L127:
        if ((r40 & 128) == 0) goto L129;
        horizontalArrangement3 = horizontalArrangement;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        $dirty = $dirty & (-29360129);
        r2 = 0;
        state3 = r5;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        verticalItemSpacing3 = r14;
        r4 = 1695323794;
        modifier3 = modifier;
        goto L156
    L129:
        horizontalArrangement3 = horizontalArrangement;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        r2 = 0;
        state3 = r5;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        verticalItemSpacing3 = r14;
        r4 = 1695323794;
        modifier3 = modifier;
        goto L156
    L163:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        flingBehavior4 = flingBehavior;
        state4 = r5;
        contentPadding4 = r7;
        reverseLayout4 = r9;
        verticalItemSpacing4 = r14;
        modifier4 = modifier;
        horizontalArrangement4 = horizontalArrangement;
        userScrollEnabled3 = userScrollEnabled;
        goto L164
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
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(horizontalArrangement) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r14 = verticalItemSpacing;
        if ($composer2.changed(r14) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
        goto L68
    L65:
        r111 = 65536;
        goto L66
    L67:
        r14 = verticalItemSpacing;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r9 = reverseLayout;
        if ($composer2.changed(r9) == false) goto L54;
        int r11 = 16384;
    L55:
        $dirty = $dirty | r11;
        goto L57
    L54:
        r11 = 8192;
        goto L55
    L56:
        r9 = reverseLayout;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r7 = contentPadding;
        if ($composer2.changed(r7) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        r7 = contentPadding;
        goto L46
    L27:
        if ((r40 & 4) != 0) goto L31;
        r5 = state;
        if ($composer2.changed(r5) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
    L32:
        r20 = 128;
        goto L33
    L31:
        r5 = state;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changed(modifier) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L25
    L21:
        r21 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = columns;
        if ($composer2.changed(r13) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r13 = columns;
        goto L13
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells columns, final Arrangement.Horizontal horizontalArrangement, final PaddingValues contentPadding, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1267076841, "C(rememberColumnSlots)P(!1,2)134@5876L1225:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1267076841, $changed, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 463617631, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        boolean r2 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(columns) == false) goto L10;
    L11:
        boolean r0 = true;
    L14:
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(horizontalArrangement) == false) goto L18;
    L19:
        boolean r1 = true;
    L21:
        boolean r3 = r0 | r1;
        if ((($changed & 896) ^ 384) <= 256) goto L26;
        if ($composer.changed(contentPadding) == false) goto L26;
    L27:
        r2 = true;
    L28:
        boolean invalid$iv = r3 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L31;
    L34:
        Object value$iv = (LazyGridStaggeredGridSlotsProvider) new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(contentPadding, columns, horizontalArrangement));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L35:
        LazyGridStaggeredGridSlotsProvider r4 = (LazyGridStaggeredGridSlotsProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventEnd();
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L31:
        if (it$iv != Composer.Companion.getEmpty()) goto L35;
    L26:
        if (($changed & 384) != 256) goto L28;
    L18:
        if (($changed & 48) == 32) goto L19;
        r1 = false;
    L10:
        if (($changed & 6) == 4) goto L11;
        r0 = false;
        goto L14
    }

    /* JADX INFO: renamed from: LazyHorizontalStaggeredGrid-121YqSk, reason: not valid java name */
    public static final void m925LazyHorizontalStaggeredGrid121YqSk(final StaggeredGridCells rows, Modifier modifier, LazyStaggeredGridState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Vertical verticalArrangement, float horizontalItemSpacing, FlingBehavior flingBehavior, boolean userScrollEnabled, OverscrollEffect overscrollEffect, final Function1<? super LazyStaggeredGridScope, Unit> r41, Composer $composer, final int $changed, final int $changed1, final int r45) {
        Composer $composer2 = $composer.startRestartGroup(-670735644);
        ComposerKt.sourceInformation($composer2, "C(LazyHorizontalStaggeredGrid)P(7,4,8,1,6,10,3:c#ui.unit.Dp,2,9,5)218@9951L59,207@9502L541:LazyStaggeredGridDsl.kt#fzvcnm");
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
        LazyStaggeredGridState state2 = state;
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
    L56:
        int r16 = r45 & 32;
        if (r16 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L179;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "197@9026L32,202@9321L15,204@9419L26");
        if (($changed & 1) != 0) goto L134;
    L146:
        if (r5 == 0) goto L149;
        modifier2 = Modifier.Companion;
    L149:
        if ((r45 & 4) == 0) goto L151;
        $dirty = $dirty & (-897);
        state2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, $composer2, 0, 3);
    L151:
        if (r10 == 0) goto L154;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L154:
        if (r13 == 0) goto L156;
        reverseLayout2 = false;
    L156:
        if (r16 == 0) goto L158;
        verticalArrangement2 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(0));
    L158:
        if (r17 == 0) goto L160;
        float horizontalItemSpacing2 = Dp.m6973constructorimpl(0);
    L162:
        if ((r45 & 128) == 0) goto L164;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L165:
        if (r0 == 0) goto L167;
        boolean userScrollEnabled2 = true;
    L169:
        if ((r45 & 512) == 0) goto L171;
        $dirty = $dirty & (-1879048193);
        float horizontalItemSpacing3 = horizontalItemSpacing2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        boolean userScrollEnabled3 = userScrollEnabled2;
        boolean reverseLayout3 = reverseLayout2;
        LazyStaggeredGridState state3 = state2;
    L172:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L175;
        ComposerKt.traceEventStart(-670735644, $dirty, $dirty1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:206)");
    L175:
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        PaddingValues contentPadding3 = contentPadding2;
        LazyStaggeredGridKt.m933LazyStaggeredGridw41Enmo(state3, Orientation.Horizontal, rememberRowSlots(rows, verticalArrangement2, contentPadding2, $composer2, (($dirty & 14) | (($dirty >> 12) & 112)) | (($dirty >> 3) & 896)), modifier3, contentPadding3, reverseLayout3, flingBehavior3, userScrollEnabled3, overscrollEffect2, horizontalItemSpacing3, verticalArrangement2.mo612getSpacingD9Ej5fM(), r41, $composer3, ((((((((($dirty >> 6) & 14) | 48) | (($dirty << 6) & 7168)) | (($dirty << 3) & 57344)) | (($dirty << 3) & 458752)) | (($dirty >> 3) & 3670016)) | (($dirty >> 3) & 29360128)) | (($dirty >> 3) & 234881024)) | (($dirty << 9) & 1879048192), ($dirty1 << 3) & 112, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L178;
        ComposerKt.traceEventEnd();
    L178:
        LazyStaggeredGridState r2 = state3;
        int $dirty2 = $dirty;
        final LazyStaggeredGridState state4 = r2;
        final Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final float horizontalItemSpacing4 = horizontalItemSpacing3;
    L180:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L184;
        r11.updateScope(new LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1(rows, modifier4, state4, contentPadding4, reverseLayout4, verticalArrangement3, horizontalItemSpacing4, flingBehavior4, userScrollEnabled4, overscrollEffect3, r41, $changed, $changed1, r45));
        return;
    L184:
        return;
    L171:
        overscrollEffect2 = overscrollEffect;
        horizontalItemSpacing3 = horizontalItemSpacing2;
        flingBehavior3 = flingBehavior2;
        userScrollEnabled3 = userScrollEnabled2;
        reverseLayout3 = reverseLayout2;
        state3 = state2;
        goto L172
    L167:
        userScrollEnabled2 = userScrollEnabled;
        goto L169
    L164:
        flingBehavior2 = flingBehavior;
        goto L165
    L160:
        horizontalItemSpacing2 = horizontalItemSpacing;
        goto L162
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L146;
        $composer2.skipToGroupEnd();
        if ((r45 & 4) == 0) goto L140;
        $dirty = $dirty & (-897);
    L140:
        if ((r45 & 128) == 0) goto L143;
        $dirty = $dirty & (-29360129);
    L143:
        if ((r45 & 512) == 0) goto L145;
        horizontalItemSpacing3 = horizontalItemSpacing;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        $dirty = $dirty & (-1879048193);
        reverseLayout3 = reverseLayout2;
        state3 = state2;
        goto L172
    L145:
        horizontalItemSpacing3 = horizontalItemSpacing;
        flingBehavior3 = flingBehavior;
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        reverseLayout3 = reverseLayout2;
        state3 = state2;
        goto L172
    L179:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overscrollEffect3 = overscrollEffect;
        verticalArrangement3 = verticalArrangement2;
        modifier4 = modifier2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        horizontalItemSpacing4 = horizontalItemSpacing;
        flingBehavior4 = flingBehavior;
        $dirty2 = $dirty;
        state4 = state2;
        userScrollEnabled4 = userScrollEnabled;
        goto L180
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
        if ($composer2.changed(horizontalItemSpacing) == false) goto L75;
        int r19 = 1048576;
    L76:
        $dirty = $dirty | r19;
        goto L79
    L75:
        r19 = 524288;
        goto L76
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        verticalArrangement2 = verticalArrangement;
        if ($composer2.changed(verticalArrangement2) == false) goto L64;
        int r18 = 131072;
    L65:
        $dirty = $dirty | r18;
        goto L67
    L64:
        r18 = 65536;
        goto L65
    L66:
        verticalArrangement2 = verticalArrangement;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L56
    L53:
        r110 = 8192;
        goto L54
    L55:
        reverseLayout2 = reverseLayout;
        goto L56
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
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L12
    L10:
        r6 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* JADX INFO: renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    public static final /* synthetic */ void m926LazyHorizontalStaggeredGridcJHQLPU(final StaggeredGridCells rows, Modifier modifier, LazyStaggeredGridState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Vertical verticalArrangement, float horizontalItemSpacing, FlingBehavior flingBehavior, boolean userScrollEnabled, final Function1 content, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-8666074);
        ComposerKt.sourceInformation($composer2, "C(LazyHorizontalStaggeredGrid)P(6,4,7,1,5,9,3:c#ui.unit.Dp,2,8)247@11080L26,237@10679L460:LazyStaggeredGridDsl.kt#fzvcnm");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        StaggeredGridCells r13 = rows;
    L13:
        int r3 = r40 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
    L25:
        if (($changed & 384) == 0) goto L27;
        LazyStaggeredGridState r5 = state;
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
    L57:
        int r10 = r40 & 32;
        if (r10 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Arrangement.Vertical r14 = verticalArrangement;
    L68:
        int r15 = r40 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
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
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L163;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "228@10273L32,233@10568L15");
        if (($changed & 1) != 0) goto L121;
    L130:
        if (r3 == 0) goto L132;
        Modifier.Companion modifier2 = Modifier.Companion;
    L134:
        if ((r40 & 4) == 0) goto L136;
        LazyStaggeredGridState state2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, $composer2, 0, 3);
        $dirty = $dirty & (-897);
    L137:
        if (r6 == 0) goto L139;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L140:
        if (r8 == 0) goto L142;
        boolean reverseLayout2 = false;
    L143:
        if (r10 == 0) goto L145;
        Arrangement.HorizontalOrVertical verticalArrangement2 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(0));
    L146:
        if (r15 == 0) goto L148;
        float horizontalItemSpacing2 = Dp.m6973constructorimpl(0);
    L150:
        if ((r40 & 128) == 0) goto L152;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-29360129);
    L153:
        if (r0 == 0) goto L155;
        Modifier modifier3 = modifier2;
        LazyStaggeredGridState state3 = state2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        float horizontalItemSpacing3 = horizontalItemSpacing2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        boolean userScrollEnabled2 = true;
        int r2 = 0;
        int r4 = -8666074;
    L156:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L159;
        ComposerKt.traceEventStart(r4, $dirty, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:236)");
    L159:
        Composer $composer3 = $composer2;
        m925LazyHorizontalStaggeredGrid121YqSk(r13, modifier3, state3, contentPadding3, reverseLayout3, verticalArrangement3, horizontalItemSpacing3, flingBehavior3, userScrollEnabled2, OverscrollKt.rememberOverscrollEffect($composer2, r2), content, $composer3, (((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty), ($dirty >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L162;
        ComposerKt.traceEventEnd();
    L162:
        final Modifier modifier4 = modifier3;
        final LazyStaggeredGridState state4 = state3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final Arrangement.Vertical verticalArrangement4 = verticalArrangement3;
        final float horizontalItemSpacing4 = horizontalItemSpacing3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled3 = userScrollEnabled2;
    L164:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L168;
        r16.updateScope(new LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2(rows, modifier4, state4, contentPadding4, reverseLayout4, verticalArrangement4, horizontalItemSpacing4, flingBehavior4, userScrollEnabled3, content, $changed, r40));
        return;
    L168:
        return;
    L155:
        userScrollEnabled2 = userScrollEnabled;
        modifier3 = modifier2;
        state3 = state2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        verticalArrangement3 = verticalArrangement2;
        horizontalItemSpacing3 = horizontalItemSpacing2;
        flingBehavior3 = flingBehavior2;
        r2 = 0;
        r4 = -8666074;
        goto L156
    L152:
        flingBehavior2 = flingBehavior;
        goto L153
    L148:
        horizontalItemSpacing2 = horizontalItemSpacing;
        goto L150
    L145:
        verticalArrangement2 = r14;
        goto L146
    L142:
        reverseLayout2 = r9;
        goto L143
    L139:
        contentPadding2 = r7;
        goto L140
    L136:
        state2 = r5;
        goto L137
    L132:
        modifier2 = modifier;
        goto L134
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L130;
        $composer2.skipToGroupEnd();
        if ((r40 & 4) == 0) goto L127;
        $dirty = $dirty & (-897);
    L127:
        if ((r40 & 128) == 0) goto L129;
        horizontalItemSpacing3 = horizontalItemSpacing;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        $dirty = $dirty & (-29360129);
        r2 = 0;
        state3 = r5;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        verticalArrangement3 = r14;
        r4 = -8666074;
        modifier3 = modifier;
        goto L156
    L129:
        horizontalItemSpacing3 = horizontalItemSpacing;
        flingBehavior3 = flingBehavior;
        userScrollEnabled2 = userScrollEnabled;
        r2 = 0;
        state3 = r5;
        contentPadding3 = r7;
        reverseLayout3 = r9;
        verticalArrangement3 = r14;
        r4 = -8666074;
        modifier3 = modifier;
        goto L156
    L163:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        flingBehavior4 = flingBehavior;
        state4 = r5;
        contentPadding4 = r7;
        reverseLayout4 = r9;
        verticalArrangement4 = r14;
        modifier4 = modifier;
        horizontalItemSpacing4 = horizontalItemSpacing;
        userScrollEnabled3 = userScrollEnabled;
        goto L164
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
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(horizontalItemSpacing) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
        goto L80
    L76:
        r110 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r14 = verticalArrangement;
        if ($composer2.changed(r14) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
        goto L68
    L65:
        r111 = 65536;
        goto L66
    L67:
        r14 = verticalArrangement;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r9 = reverseLayout;
        if ($composer2.changed(r9) == false) goto L54;
        int r11 = 16384;
    L55:
        $dirty = $dirty | r11;
        goto L57
    L54:
        r11 = 8192;
        goto L55
    L56:
        r9 = reverseLayout;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r7 = contentPadding;
        if ($composer2.changed(r7) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        r7 = contentPadding;
        goto L46
    L27:
        if ((r40 & 4) != 0) goto L31;
        r5 = state;
        if ($composer2.changed(r5) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
    L32:
        r20 = 128;
        goto L33
    L31:
        r5 = state;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L25;
        if ($composer2.changed(modifier) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L25
    L21:
        r21 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = rows;
        if ($composer2.changed(r13) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r13 = rows;
        goto L13
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells rows, final Arrangement.Vertical verticalArrangement, final PaddingValues contentPadding, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1532383053, "C(rememberRowSlots)P(1,2)259@11368L987:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1532383053, $changed, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:259)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1011241887, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        boolean r2 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(rows) == false) goto L10;
    L11:
        boolean r0 = true;
    L14:
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(verticalArrangement) == false) goto L18;
    L19:
        boolean r1 = true;
    L21:
        boolean r3 = r0 | r1;
        if ((($changed & 896) ^ 384) <= 256) goto L26;
        if ($composer.changed(contentPadding) == false) goto L26;
    L27:
        r2 = true;
    L28:
        boolean invalid$iv = r3 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L31;
    L34:
        Object value$iv = (LazyGridStaggeredGridSlotsProvider) new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberRowSlots$1$1(contentPadding, rows, verticalArrangement));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L35:
        LazyGridStaggeredGridSlotsProvider r4 = (LazyGridStaggeredGridSlotsProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventEnd();
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L31:
        if (it$iv != Composer.Companion.getEmpty()) goto L35;
    L26:
        if (($changed & 384) != 256) goto L28;
    L18:
        if (($changed & 48) == 32) goto L19;
        r1 = false;
    L10:
        if (($changed & 6) == 4) goto L11;
        r0 = false;
        goto L14
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope $this$items_u24default, List items, Function1 key, Function1 contentType, Function1 span, Function4 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        Function1 contentType2 = AnonymousClass1.INSTANCE;
        contentType = contentType2;
    L9:
        if ((r12 & 8) == 0) goto L11;
        span = null;
    L11:
        int r1 = items.size();
        if (key == null) goto L14;
        LazyStaggeredGridDslKt$items$2$1 r2 = new LazyStaggeredGridDslKt$items$2$1(key, items);
    L15:
        AnonymousClass3 r3 = new AnonymousClass3(contentType, items);
        if (span == null) goto L18;
        Function1 it = new LazyStaggeredGridDslKt$items$4$1(span, items);
        Function1 r4 = it;
    L19:
        $this$items_u24default.items(r1, r2, r3, r4, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(itemContent, items)));
        return;
    L18:
        r4 = null;
        goto L19
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void items(LazyStaggeredGridScope $this$items, List<? extends T> r9, Function1<? super T, ? extends Object> r10, Function1<? super T, ? extends Object> r11, Function1<? super T, StaggeredGridItemSpan> r12, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.size();
        if (r10 == null) goto L5;
        Function1 it = new LazyStaggeredGridDslKt$items$2$1(r10, r9);
    L6:
        AnonymousClass3 r4 = new AnonymousClass3(r11, r9);
        if (r12 == null) goto L9;
        Function1 it2 = new LazyStaggeredGridDslKt$items$4$1(r12, r9);
        Function1 r5 = it2;
    L10:
        $this$items.items(r2, it, r4, r5, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(r13, r9)));
        return;
    L9:
        r5 = null;
        goto L10
    L5:
        it = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope $this$itemsIndexed_u24default, List items, Function2 key, Function2 contentType, Function2 span, Function5 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        Function2 contentType2 = C03351.INSTANCE;
        contentType = contentType2;
    L9:
        if ((r12 & 8) == 0) goto L11;
        span = null;
    L11:
        int r1 = items.size();
        if (key == null) goto L14;
        LazyStaggeredGridDslKt$itemsIndexed$2$1 r2 = new LazyStaggeredGridDslKt$itemsIndexed$2$1(key, items);
    L15:
        C03373 r3 = new C03373(contentType, items);
        if (span == null) goto L18;
        LazyStaggeredGridDslKt$itemsIndexed$4$1 r4 = new LazyStaggeredGridDslKt$itemsIndexed$4$1(span, items);
    L19:
        $this$itemsIndexed_u24default.items(r1, r2, r3, r4, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C03385(itemContent, items)));
        return;
    L18:
        r4 = null;
        goto L19
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope $this$itemsIndexed, List<? extends T> r9, Function2<? super Integer, ? super T, ? extends Object> r10, Function2<? super Integer, ? super T, ? extends Object> r11, Function2<? super Integer, ? super T, StaggeredGridItemSpan> r12, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.size();
        if (r10 == null) goto L5;
        LazyStaggeredGridDslKt$itemsIndexed$2$1 r3 = new LazyStaggeredGridDslKt$itemsIndexed$2$1(r10, r9);
    L6:
        C03373 r4 = new C03373(r11, r9);
        if (r12 == null) goto L9;
        LazyStaggeredGridDslKt$itemsIndexed$4$1 r5 = new LazyStaggeredGridDslKt$itemsIndexed$4$1(r12, r9);
    L10:
        $this$itemsIndexed.items(r2, r3, r4, r5, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C03385(r13, r9)));
        return;
    L9:
        r5 = null;
        goto L10
    L5:
        r3 = null;
        goto L6
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope $this$items_u24default, Object[] items, Function1 key, Function1 contentType, Function1 span, Function4 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        Function1 contentType2 = AnonymousClass6.INSTANCE;
        contentType = contentType2;
    L9:
        if ((r12 & 8) == 0) goto L11;
        span = null;
    L11:
        int r1 = items.length;
        if (key == null) goto L14;
        LazyStaggeredGridDslKt$items$7$1 r2 = new LazyStaggeredGridDslKt$items$7$1(key, items);
    L15:
        AnonymousClass8 r3 = new AnonymousClass8(contentType, items);
        if (span == null) goto L18;
        Function1 it = new LazyStaggeredGridDslKt$items$9$1(span, items);
        Function1 r4 = it;
    L19:
        $this$items_u24default.items(r1, r2, r3, r4, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(itemContent, items)));
        return;
    L18:
        r4 = null;
        goto L19
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void items(LazyStaggeredGridScope $this$items, T[] r9, Function1<? super T, ? extends Object> r10, Function1<? super T, ? extends Object> r11, Function1<? super T, StaggeredGridItemSpan> r12, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.length;
        if (r10 == null) goto L5;
        Function1 it = new LazyStaggeredGridDslKt$items$7$1(r10, r9);
    L6:
        AnonymousClass8 r4 = new AnonymousClass8(r11, r9);
        if (r12 == null) goto L9;
        Function1 it2 = new LazyStaggeredGridDslKt$items$9$1(r12, r9);
        Function1 r5 = it2;
    L10:
        $this$items.items(r2, it, r4, r5, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(r13, r9)));
        return;
    L9:
        r5 = null;
        goto L10
    L5:
        it = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope $this$itemsIndexed_u24default, Object[] items, Function2 key, Function2 contentType, Function2 span, Function5 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r12 & 4) == 0) goto L9;
        Function2 contentType2 = C03396.INSTANCE;
        contentType = contentType2;
    L9:
        if ((r12 & 8) == 0) goto L11;
        span = null;
    L11:
        int r1 = items.length;
        if (key == null) goto L14;
        LazyStaggeredGridDslKt$itemsIndexed$7$1 r2 = new LazyStaggeredGridDslKt$itemsIndexed$7$1(key, items);
    L15:
        C03408 r3 = new C03408(contentType, items);
        if (span == null) goto L18;
        LazyStaggeredGridDslKt$itemsIndexed$9$1 r4 = new LazyStaggeredGridDslKt$itemsIndexed$9$1(span, items);
    L19:
        $this$itemsIndexed_u24default.items(r1, r2, r3, r4, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C033610(itemContent, items)));
        return;
    L18:
        r4 = null;
        goto L19
    L14:
        r2 = null;
        goto L15
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope $this$itemsIndexed, T[] r9, Function2<? super Integer, ? super T, ? extends Object> r10, Function2<? super Integer, ? super T, ? extends Object> r11, Function2<? super Integer, ? super T, StaggeredGridItemSpan> r12, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        int r2 = r9.length;
        if (r10 == null) goto L5;
        LazyStaggeredGridDslKt$itemsIndexed$7$1 r3 = new LazyStaggeredGridDslKt$itemsIndexed$7$1(r10, r9);
    L6:
        C03408 r4 = new C03408(r11, r9);
        if (r12 == null) goto L9;
        LazyStaggeredGridDslKt$itemsIndexed$9$1 r5 = new LazyStaggeredGridDslKt$itemsIndexed$9$1(r12, r9);
    L10:
        $this$itemsIndexed.items(r2, r3, r4, r5, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C033610(r13, r9)));
        return;
    L9:
        r5 = null;
        goto L10
    L5:
        r3 = null;
        goto L6
    }
}
