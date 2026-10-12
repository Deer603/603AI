package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* JADX INFO: compiled from: AnimationSearch.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\f\u001e\u001f !\"#$%&'()B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0014\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\rH\u0002J\u0014\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014J\u0016\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rH\u0002J\u0016\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch;", "", "clock", "Lkotlin/Function0;", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "onSeek", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "animatedContentSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "animatedVisibilitySearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "setToSearch", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "setToTrack", "supportedSearch", "transitionSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "animateXAsStateSearch", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "attachAllAnimations", "slotTrees", "Landroidx/compose/ui/tooling/data/Group;", "infiniteTransitionSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "searchAny", "", "unsupportedSearch", "AnimateContentSizeSearch", "AnimateXAsStateSearch", "AnimateXAsStateSearchInfo", "AnimatedContentSearch", "AnimatedVisibilitySearch", "DecaySearch", "InfiniteTransitionSearch", "InfiniteTransitionSearchInfo", "RememberSearch", "Search", "TargetBasedSearch", "TransitionSearch", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimationSearch {
    public static final int $stable = 0;
    private final AnimatedContentSearch animatedContentSearch;
    private final AnimatedVisibilitySearch animatedVisibilitySearch;
    private final Function0<PreviewAnimationClock> clock;
    private final Function0<Unit> onSeek;
    private final Set<Search<? extends Object>> setToSearch;
    private final Set<Search<? extends Object>> setToTrack;
    private final Set<Search<? extends Object>> supportedSearch;
    private final TransitionSearch transitionSearch;

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimateContentSizeSearch extends Search<Object> {
        public static final int $stable = 0;

        static {
        }

        public AnimateContentSizeSearch(Function1<Object, Unit> r1) {
            super(r1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (group.getModifierInfo().isEmpty() == true) goto L23;
            Iterable $this$any$iv = group.getModifierInfo();
            if (($this$any$iv instanceof Collection) == true) goto L7;
        L9:
            Iterator r3 = $this$any$iv.iterator();
        L11:
            if (r3.hasNext() == false) goto L15;
            Object element$iv = r3.next();
            ModifierInfo it = (ModifierInfo) element$iv;
            if (it.getModifier().any(AnimationSearch$AnimateContentSizeSearch$hasAnimation$1$1.INSTANCE) == false) goto L11;
            boolean r0 = true;
        L16:
            if (r0 == true) goto L19;
            return false;
        L19:
            return true;
        L15:
            r0 = false;
            goto L16
        L7:
            if (((Collection) $this$any$iv).isEmpty() == false) goto L9;
            r0 = false;
            goto L16
        L23:
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> r15) {
            Collection<? extends Group> $this$filter$iv = r15;
            Collection destination$iv$iv = new ArrayList();
            Iterator r5 = $this$filter$iv.iterator();
        L4:
            if (r5.hasNext() == false) goto L8;
            Object element$iv$iv = r5.next();
            Group it = (Group) element$iv$iv;
            if (it.getModifierInfo().isEmpty() == true) goto L4;
            destination$iv$iv.add(element$iv$iv);
            goto L4
        L8:
            Iterable $this$forEach$iv = (List) destination$iv$iv;
            Iterator r1 = $this$forEach$iv.iterator();
        L10:
            if (r1.hasNext() == false) goto L17;
            Object element$iv = r1.next();
            Group group = (Group) element$iv;
            Iterable $this$forEach$iv2 = group.getModifierInfo();
            Iterator r8 = $this$forEach$iv2.iterator();
        L13:
            if (r8.hasNext() == false) goto L10;
            Object element$iv2 = r8.next();
            ModifierInfo it2 = (ModifierInfo) element$iv2;
            it2.getModifier().any(new AnimationSearch$AnimateContentSizeSearch$addAnimations$2$1$1(this));
            goto L13
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u0002H\r\u0018\u00010\u0012\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J.\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u000e0\u00020\u0014\"\u0004\b\u0000\u0010\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J&\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\r\u0018\u00010\u0017\u0018\u00010\u0016\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "findAnimatable", "Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", "group", "Landroidx/compose/ui/tooling/data/CallGroup;", "findAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "findAnimations", "", "findToolingOverride", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "hasAnimation", "", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        public static final int $stable = 0;

        static {
        }

        public AnimateXAsStateSearch(Function1<? super AnimateXAsStateSearchInfo<?, ?>, Unit> r1) {
            super(r1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            CallGroup it = toAnimationGroup(group);
            if (it != null) goto L5;
            return false;
        L5:
            if (findAnimatable(it) != null) goto L7;
            return false;
        L7:
            if (findAnimationSpec(it) != null) goto L9;
            return false;
        L9:
            if (findToolingOverride(it) == null) goto L17;
            return true;
        L17:
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> r3) {
            getAnimations().addAll(findAnimations(r3));
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() != null) goto L5;
        L7:
            boolean r2 = false;
        L9:
            if (r2 == false) goto L11;
            Group it = group;
        L12:
            if (it != null) goto L14;
            return null;
        L14:
            if ((it instanceof CallGroup) == true) goto L16;
            return null;
        L16:
            return (CallGroup) it;
        L11:
            it = null;
            goto L12
        L5:
            if (Intrinsics.areEqual(group.getName(), "animateValueAsState") == false) goto L7;
            r2 = true;
            goto L9
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final <T> List<AnimateXAsStateSearchInfo<T, AnimationVector>> findAnimations(Collection<? extends Group> r21) {
            AnimateXAsStateSearch r0 = this;
            ArrayList r3 = new ArrayList();
            Iterator<T> r8 = r21.iterator();
        L4:
            if (r8.hasNext() == false) goto L9;
            CallGroup r12 = r0.toAnimationGroup((Group) r8.next());
            if (r12 == null) goto L4;
            r3.add(r12);
            goto L4
        L9:
            ArrayList r4 = r3;
            int r1 = 0;
            ArrayList r2 = new ArrayList();
            Iterator<T> r9 = r4.iterator();
        L11:
            if (r9.hasNext() == false) goto L32;
            CallGroup r13 = (CallGroup) r9.next();
            Animatable<T, AnimationVector> r14 = r0.findAnimatable(r13);
            AnimationSpec<T> r15 = r0.findAnimationSpec(r13);
            int r16 = r1;
            MutableState<State<T>> r5 = r0.findToolingOverride(r13);
            Object r17 = null;
            if (r14 == null) goto L27;
            if (r15 == null) goto L27;
            if (r5 == null) goto L27;
            if (r5.getValue() != null) goto L20;
            r5.setValue(new ToolingState(r14.getValue()));
        L20:
            Object r6 = r5.getValue();
            if ((r6 instanceof ToolingState) == false) goto L23;
            r17 = (ToolingState) r6;
        L23:
            if (r17 != null) goto L25;
            ToolingState r7 = new ToolingState(r14.getValue());
        L26:
            r17 = new AnimateXAsStateSearchInfo(r14, r15, r7);
        L28:
            if (r17 == null) goto L30;
            r2.add(r17);
        L30:
            r0 = this;
            r1 = r16;
            r4 = r4;
            goto L11
        L25:
            r7 = r17;
        L27:
            r4 = r4;
            goto L28
        L32:
            return r2;
        }

        private final <T> MutableState<State<T>> findToolingOverride(Group group) {
            Group $this$findRememberedData$iv = group;
            int $i$f$findRememberedData = 0;
            Iterable $this$firstOrNull$iv$iv = $this$findRememberedData$iv.getData();
            Iterator<T> r4 = $this$firstOrNull$iv$iv.iterator();
        L4:
            if (r4.hasNext() == false) goto L8;
            Object element$iv$iv = r4.next();
            if ((element$iv$iv instanceof MutableState) == false) goto L4;
        L10:
            if ((element$iv$iv instanceof MutableState) == true) goto L12;
            element$iv$iv = null;
        L12:
            Object thisData$iv = (MutableState) element$iv$iv;
            if (thisData$iv == null) goto L16;
            Object it$iv = CollectionsKt.listOf(thisData$iv);
            if (it$iv == null) goto L16;
        L17:
            List r2 = (Collection) it$iv;
            Collection $this$findRememberedData$iv$iv = $this$findRememberedData$iv.getChildren();
            Collection $this$mapNotNull$iv$iv$iv = $this$findRememberedData$iv$iv;
            Collection destination$iv$iv$iv$iv = new ArrayList();
            Iterator<T> r14 = $this$mapNotNull$iv$iv$iv.iterator();
        L19:
            if (r14.hasNext() == false) goto L34;
            Object element$iv$iv$iv$iv$iv = r14.next();
            Group it$iv$iv = (Group) element$iv$iv$iv$iv$iv;
            Iterable $this$firstOrNull$iv$iv$iv = it$iv$iv.getData();
            Iterator<T> r22 = $this$firstOrNull$iv$iv$iv.iterator();
        L22:
            if (r22.hasNext() == false) goto L26;
            Object element$iv$iv$iv = r22.next();
            if ((element$iv$iv$iv instanceof MutableState) == false) goto L22;
            Object r6 = element$iv$iv$iv;
        L27:
            Group $this$findRememberedData$iv2 = $this$findRememberedData$iv;
            if ((r6 instanceof MutableState) == true) goto L30;
            r6 = null;
        L30:
            MutableState r7 = (MutableState) r6;
            if (r7 == null) goto L33;
            destination$iv$iv$iv$iv.add(r7);
        L33:
            $this$findRememberedData$iv = $this$findRememberedData$iv2;
            goto L19
        L26:
            r6 = null;
            goto L27
        L34:
            Object it$iv$iv$iv$iv = (List) destination$iv$iv$iv$iv;
            Collection $this$mapNotNull$iv$iv$iv2 = $this$findRememberedData$iv$iv;
            Collection destination$iv$iv$iv$iv2 = new ArrayList();
            Iterator<T> r13 = $this$mapNotNull$iv$iv$iv2.iterator();
        L36:
            if (r13.hasNext() == false) goto L41;
            Object element$iv$iv$iv$iv$iv2 = r13.next();
            Object selfData$iv$iv = it$iv$iv$iv$iv;
            Group it$iv$iv2 = (Group) element$iv$iv$iv$iv$iv2;
            int $i$f$findRememberedData2 = $i$f$findRememberedData;
            Group it$iv$iv3 = PreviewUtils_androidKt.firstOrNull(it$iv$iv2, AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (it$iv$iv3 == null) goto L40;
            destination$iv$iv$iv$iv2.add(it$iv$iv3);
        L40:
            it$iv$iv$iv$iv = selfData$iv$iv;
            $i$f$findRememberedData = $i$f$findRememberedData2;
            goto L36
        L41:
            Object selfData$iv$iv2 = it$iv$iv$iv$iv;
            List rememberCalls$iv$iv = (List) destination$iv$iv$iv$iv2;
            ArrayList r1 = (Collection) selfData$iv$iv2;
            List $this$mapNotNull$iv$iv$iv3 = rememberCalls$iv$iv;
            Collection destination$iv$iv$iv$iv3 = new ArrayList();
            Iterator<T> r15 = $this$mapNotNull$iv$iv$iv3.iterator();
        L43:
            if (r15.hasNext() == false) goto L60;
            Object element$iv$iv$iv$iv$iv3 = r15.next();
            Group it$iv$iv4 = (Group) element$iv$iv$iv$iv$iv3;
            Iterable $this$firstOrNull$iv$iv$iv2 = it$iv$iv4.getData();
            Iterator<T> r24 = $this$firstOrNull$iv$iv$iv2.iterator();
        L46:
            if (r24.hasNext() == false) goto L51;
            Object element$iv$iv$iv2 = r24.next();
            List rememberCalls$iv$iv2 = rememberCalls$iv$iv;
            if ((element$iv$iv$iv2 instanceof MutableState) == true) goto L49;
            rememberCalls$iv$iv = rememberCalls$iv$iv2;
            goto L46
        L49:
            Object r0 = element$iv$iv$iv2;
        L52:
            Collection $this$firstOrNull$iv$iv$iv3 = $this$findRememberedData$iv$iv;
            if ((r0 instanceof MutableState) == true) goto L55;
            r0 = null;
        L55:
            MutableState r3 = (MutableState) r0;
            if (r3 == null) goto L58;
            destination$iv$iv$iv$iv3.add(r3);
        L58:
            $this$findRememberedData$iv$iv = $this$firstOrNull$iv$iv$iv3;
            rememberCalls$iv$iv = rememberCalls$iv$iv2;
            goto L43
        L51:
            rememberCalls$iv$iv2 = rememberCalls$iv$iv;
            r0 = null;
            goto L52
        L60:
            return (MutableState) CollectionsKt.firstOrNull(CollectionsKt.plus(r2, CollectionsKt.plus(r1, (List) destination$iv$iv$iv$iv3)));
        L16:
            it$iv = CollectionsKt.emptyList();
            goto L17
        L8:
            element$iv$iv = null;
            goto L10
        }

        private final <T> AnimationSpec<T> findAnimationSpec(CallGroup group) {
            Iterable $this$filter$iv = group.getChildren();
            Collection destination$iv$iv = new ArrayList();
            Iterator<T> r5 = $this$filter$iv.iterator();
        L4:
            if (r5.hasNext() == false) goto L8;
            Object element$iv$iv = r5.next();
            Group it = (Group) element$iv$iv;
            if (Intrinsics.areEqual(it.getName(), "rememberUpdatedState") == false) goto L4;
            destination$iv$iv.add(element$iv$iv);
            goto L4
        L8:
            Iterable rememberStates = (List) destination$iv$iv;
            ArrayList r0 = (Collection) rememberStates;
            Iterable $this$flatMap$iv = rememberStates;
            Collection destination$iv$iv2 = new ArrayList();
            Iterator<T> r7 = $this$flatMap$iv.iterator();
        L10:
            if (r7.hasNext() == false) goto L12;
            Object element$iv$iv2 = r7.next();
            Group it2 = (Group) element$iv$iv2;
            Iterable list$iv$iv = it2.getChildren();
            CollectionsKt.addAll(destination$iv$iv2, list$iv$iv);
            goto L10
        L12:
            Iterable $this$flatMap$iv2 = CollectionsKt.plus(r0, (List) destination$iv$iv2);
            Collection destination$iv$iv3 = new ArrayList();
            Iterator<T> r6 = $this$flatMap$iv2.iterator();
        L14:
            if (r6.hasNext() == false) goto L16;
            Object element$iv$iv3 = r6.next();
            Group it3 = (Group) element$iv$iv3;
            Iterable list$iv$iv2 = it3.getData();
            CollectionsKt.addAll(destination$iv$iv3, list$iv$iv2);
            goto L14
        L16:
            Iterable $this$filterIsInstance$iv = (List) destination$iv$iv3;
            Collection destination$iv$iv4 = new ArrayList();
            Iterator<T> r8 = $this$filterIsInstance$iv.iterator();
        L18:
            if (r8.hasNext() == false) goto L22;
            T r9 = r8.next();
            if ((r9 instanceof State) == false) goto L18;
            destination$iv$iv4.add(r9);
            goto L18
        L22:
            Iterable $this$map$iv = (List) destination$iv$iv4;
            Collection destination$iv$iv5 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            Iterator<T> r10 = $this$map$iv.iterator();
        L24:
            if (r10.hasNext() == false) goto L26;
            Object item$iv$iv = r10.next();
            State it4 = (State) item$iv$iv;
            destination$iv$iv5.add(it4.getValue());
            goto L24
        L26:
            Iterable $this$filterIsInstance$iv2 = (List) destination$iv$iv5;
            Collection destination$iv$iv6 = new ArrayList();
            Iterator<T> r11 = $this$filterIsInstance$iv2.iterator();
        L28:
            if (r11.hasNext() == false) goto L33;
            T r12 = r11.next();
            if ((r12 instanceof AnimationSpec) == false) goto L28;
            destination$iv$iv6.add(r12);
            goto L28
        L33:
            return (AnimationSpec) CollectionsKt.firstOrNull((List) destination$iv$iv6);
        }

        private final <T> Animatable<T, AnimationVector> findAnimatable(CallGroup group) {
            CallGroup $this$findRememberedData$iv = group;
            int $i$f$findRememberedData = 0;
            Iterable $this$firstOrNull$iv$iv = $this$findRememberedData$iv.getData();
            Iterator<T> r4 = $this$firstOrNull$iv$iv.iterator();
        L4:
            if (r4.hasNext() == false) goto L8;
            Object element$iv$iv = r4.next();
            if ((element$iv$iv instanceof Animatable) == false) goto L4;
        L10:
            if ((element$iv$iv instanceof Animatable) == true) goto L12;
            element$iv$iv = null;
        L12:
            Object thisData$iv = (Animatable) element$iv$iv;
            if (thisData$iv == null) goto L16;
            Object it$iv = CollectionsKt.listOf(thisData$iv);
            if (it$iv == null) goto L16;
        L17:
            List r2 = (Collection) it$iv;
            Collection $this$findRememberedData$iv$iv = $this$findRememberedData$iv.getChildren();
            Collection $this$mapNotNull$iv$iv$iv = $this$findRememberedData$iv$iv;
            Collection destination$iv$iv$iv$iv = new ArrayList();
            Iterator<T> r14 = $this$mapNotNull$iv$iv$iv.iterator();
        L19:
            if (r14.hasNext() == false) goto L34;
            Object element$iv$iv$iv$iv$iv = r14.next();
            Group it$iv$iv = (Group) element$iv$iv$iv$iv$iv;
            Iterable $this$firstOrNull$iv$iv$iv = it$iv$iv.getData();
            Iterator<T> r22 = $this$firstOrNull$iv$iv$iv.iterator();
        L22:
            if (r22.hasNext() == false) goto L26;
            Object element$iv$iv$iv = r22.next();
            if ((element$iv$iv$iv instanceof Animatable) == false) goto L22;
            Object r6 = element$iv$iv$iv;
        L27:
            Group $this$findRememberedData$iv2 = $this$findRememberedData$iv;
            if ((r6 instanceof Animatable) == true) goto L30;
            r6 = null;
        L30:
            Animatable r7 = (Animatable) r6;
            if (r7 == null) goto L33;
            destination$iv$iv$iv$iv.add(r7);
        L33:
            $this$findRememberedData$iv = $this$findRememberedData$iv2;
            goto L19
        L26:
            r6 = null;
            goto L27
        L34:
            Object it$iv$iv$iv$iv = (List) destination$iv$iv$iv$iv;
            Collection $this$mapNotNull$iv$iv$iv2 = $this$findRememberedData$iv$iv;
            Collection destination$iv$iv$iv$iv2 = new ArrayList();
            Iterator<T> r13 = $this$mapNotNull$iv$iv$iv2.iterator();
        L36:
            if (r13.hasNext() == false) goto L41;
            Object element$iv$iv$iv$iv$iv2 = r13.next();
            Object selfData$iv$iv = it$iv$iv$iv$iv;
            Group it$iv$iv2 = (Group) element$iv$iv$iv$iv$iv2;
            int $i$f$findRememberedData2 = $i$f$findRememberedData;
            Group it$iv$iv3 = PreviewUtils_androidKt.firstOrNull(it$iv$iv2, AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (it$iv$iv3 == null) goto L40;
            destination$iv$iv$iv$iv2.add(it$iv$iv3);
        L40:
            it$iv$iv$iv$iv = selfData$iv$iv;
            $i$f$findRememberedData = $i$f$findRememberedData2;
            goto L36
        L41:
            Object selfData$iv$iv2 = it$iv$iv$iv$iv;
            List rememberCalls$iv$iv = (List) destination$iv$iv$iv$iv2;
            ArrayList r1 = (Collection) selfData$iv$iv2;
            List $this$mapNotNull$iv$iv$iv3 = rememberCalls$iv$iv;
            Collection destination$iv$iv$iv$iv3 = new ArrayList();
            Iterator<T> r15 = $this$mapNotNull$iv$iv$iv3.iterator();
        L43:
            if (r15.hasNext() == false) goto L60;
            Object element$iv$iv$iv$iv$iv3 = r15.next();
            Group it$iv$iv4 = (Group) element$iv$iv$iv$iv$iv3;
            Iterable $this$firstOrNull$iv$iv$iv2 = it$iv$iv4.getData();
            Iterator<T> r24 = $this$firstOrNull$iv$iv$iv2.iterator();
        L46:
            if (r24.hasNext() == false) goto L51;
            Object element$iv$iv$iv2 = r24.next();
            List rememberCalls$iv$iv2 = rememberCalls$iv$iv;
            if ((element$iv$iv$iv2 instanceof Animatable) == true) goto L49;
            rememberCalls$iv$iv = rememberCalls$iv$iv2;
            goto L46
        L49:
            Object r0 = element$iv$iv$iv2;
        L52:
            Collection $this$firstOrNull$iv$iv$iv3 = $this$findRememberedData$iv$iv;
            if ((r0 instanceof Animatable) == true) goto L55;
            r0 = null;
        L55:
            Animatable r3 = (Animatable) r0;
            if (r3 == null) goto L58;
            destination$iv$iv$iv$iv3.add(r3);
        L58:
            $this$findRememberedData$iv$iv = $this$firstOrNull$iv$iv$iv3;
            rememberCalls$iv$iv = rememberCalls$iv$iv2;
            goto L43
        L51:
            rememberCalls$iv$iv2 = rememberCalls$iv$iv;
            r0 = null;
            goto L52
        L60:
            return (Animatable) CollectionsKt.firstOrNull(CollectionsKt.plus(r2, CollectionsKt.plus(r1, (List) destination$iv$iv$iv$iv3)));
        L16:
            it$iv = CollectionsKt.emptyList();
            goto L17
        L8:
            element$iv$iv = null;
            goto L10
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\nHÆ\u0003JK\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "animatable", "Landroidx/compose/animation/core/Animatable;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimateXAsStateSearchInfo<T, V extends AnimationVector> {
        public static final int $stable = 0;
        private final Animatable<T, V> animatable;
        private final AnimationSpec<T> animationSpec;
        private final ToolingState<T> toolingState;

        static {
            $stable = 8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnimateXAsStateSearchInfo copy$default(AnimateXAsStateSearchInfo r0, Animatable r1, AnimationSpec r2, ToolingState r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.animatable;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.animationSpec;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.toolingState;
        L12:
            return r0.copy(r1, r2, r3);
        }

        public final Animatable<T, V> component1() {
            return this.animatable;
        }

        public final AnimationSpec<T> component2() {
            return this.animationSpec;
        }

        public final ToolingState<T> component3() {
            return this.toolingState;
        }

        public final AnimateXAsStateSearchInfo<T, V> copy(Animatable<T, V> r2, AnimationSpec<T> r3, ToolingState<T> r4) {
            return new AnimateXAsStateSearchInfo(r2, r3, r4);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof AnimateXAsStateSearchInfo) == true) goto L8;
            return false;
        L8:
            AnimateXAsStateSearchInfo r1 = (AnimateXAsStateSearchInfo) r6;
            if (Intrinsics.areEqual(this.animatable, r1.animatable) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(this.animationSpec, r1.animationSpec) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.areEqual(this.toolingState, r1.toolingState) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.animatable.hashCode() * 31) + this.animationSpec.hashCode()) * 31) + this.toolingState.hashCode();
        }

        public String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.animatable + ", animationSpec=" + this.animationSpec + ", toolingState=" + this.toolingState + ')';
        }

        public AnimateXAsStateSearchInfo(Animatable<T, V> r1, AnimationSpec<T> r2, ToolingState<T> r3) {
            this.animatable = r1;
            this.animationSpec = r2;
            this.toolingState = r3;
        }

        public final Animatable<T, V> getAnimatable() {
            return this.animatable;
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final ToolingState<T> getToolingState() {
            return this.toolingState;
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimatedContentSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        static {
        }

        public AnimatedContentSearch(Function1<? super Transition<?>, Unit> r1) {
            super(r1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (toAnimationGroup(group) == null) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> r28) {
            Set<Transition<?>> r0 = getAnimations();
            Collection<? extends Group> $this$mapNotNull$iv = r28;
            Collection destination$iv$iv = new ArrayList();
            Iterator r8 = $this$mapNotNull$iv.iterator();
        L4:
            if (r8.hasNext() == false) goto L9;
            Object element$iv$iv$iv = r8.next();
            Group it = toAnimationGroup((Group) element$iv$iv$iv);
            if (it == null) goto L4;
            destination$iv$iv.add(it);
            goto L4
        L9:
            Collection $this$findRememberedData$iv = (List) destination$iv$iv;
            int $i$f$findRememberedData = 0;
            Collection $this$mapNotNull$iv$iv = $this$findRememberedData$iv;
            Collection destination$iv$iv$iv = new ArrayList();
            Iterator r10 = $this$mapNotNull$iv$iv.iterator();
        L11:
            if (r10.hasNext() == false) goto L26;
            Object element$iv$iv$iv$iv = r10.next();
            Group it$iv = (Group) element$iv$iv$iv$iv;
            Iterable $this$firstOrNull$iv$iv = it$iv.getData();
            Iterator r20 = $this$firstOrNull$iv$iv.iterator();
        L14:
            if (r20.hasNext() == false) goto L18;
            Object element$iv$iv = r20.next();
            if ((element$iv$iv instanceof Transition) == false) goto L14;
            Object r12 = element$iv$iv;
        L19:
            int $i$f$findRememberedData2 = $i$f$findRememberedData;
            if ((r12 instanceof Transition) == true) goto L22;
            r12 = null;
        L22:
            Transition r13 = (Transition) r12;
            if (r13 == null) goto L25;
            destination$iv$iv$iv.add(r13);
        L25:
            $i$f$findRememberedData = $i$f$findRememberedData2;
            goto L11
        L18:
            r12 = null;
            goto L19
        L26:
            Object it$iv$iv$iv = (List) destination$iv$iv$iv;
            Collection $this$mapNotNull$iv$iv2 = $this$findRememberedData$iv;
            Collection destination$iv$iv$iv2 = new ArrayList();
            Iterator r11 = $this$mapNotNull$iv$iv2.iterator();
        L28:
            if (r11.hasNext() == false) goto L33;
            Object element$iv$iv$iv$iv2 = r11.next();
            Group it$iv2 = (Group) element$iv$iv$iv$iv2;
            Object selfData$iv = it$iv$iv$iv;
            Group r1 = PreviewUtils_androidKt.firstOrNull(it$iv2, AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (r1 == null) goto L32;
            destination$iv$iv$iv2.add(r1);
        L32:
            it$iv$iv$iv = selfData$iv;
            goto L28
        L33:
            Object selfData$iv2 = it$iv$iv$iv;
            List rememberCalls$iv = (List) destination$iv$iv$iv2;
            ArrayList r2 = (Collection) selfData$iv2;
            List $this$mapNotNull$iv$iv3 = rememberCalls$iv;
            Collection destination$iv$iv$iv3 = new ArrayList();
            Iterator r14 = $this$mapNotNull$iv$iv3.iterator();
        L35:
            if (r14.hasNext() == false) goto L51;
            Object element$iv$iv$iv$iv3 = r14.next();
            Group it$iv3 = (Group) element$iv$iv$iv$iv3;
            Iterable $this$firstOrNull$iv$iv2 = it$iv3.getData();
            Iterator r22 = $this$firstOrNull$iv$iv2.iterator();
        L38:
            if (r22.hasNext() == false) goto L43;
            Object element$iv$iv2 = r22.next();
            List rememberCalls$iv2 = rememberCalls$iv;
            if ((element$iv$iv2 instanceof Transition) == true) goto L41;
            rememberCalls$iv = rememberCalls$iv2;
            goto L38
        L41:
            Object r3 = element$iv$iv2;
        L44:
            Collection $this$firstOrNull$iv$iv3 = $this$findRememberedData$iv;
            if ((r3 instanceof Transition) == true) goto L47;
            r3 = null;
        L47:
            Transition r4 = (Transition) r3;
            if (r4 == null) goto L50;
            destination$iv$iv$iv3.add(r4);
        L50:
            $this$findRememberedData$iv = $this$firstOrNull$iv$iv3;
            rememberCalls$iv = rememberCalls$iv2;
            goto L35
        L43:
            rememberCalls$iv2 = rememberCalls$iv;
            r3 = null;
            goto L44
        L51:
            r0.addAll(CollectionsKt.plus(r2, (List) destination$iv$iv$iv3));
        }

        private final Group toAnimationGroup(Group group) {
            if (group.getLocation() != null) goto L5;
        L7:
            boolean r2 = false;
        L8:
            Object r0 = null;
            if (r2 == false) goto L11;
            Group it = group;
        L12:
            if (it == null) goto L26;
            Iterable $this$firstOrNull$iv = it.getChildren();
            Iterator r5 = $this$firstOrNull$iv.iterator();
        L15:
            if (r5.hasNext() == false) goto L22;
            Object element$iv = r5.next();
            Group updateTransitionCall = (Group) element$iv;
            if (Intrinsics.areEqual(updateTransitionCall.getName(), "updateTransition") == false) goto L15;
            r0 = element$iv;
        L22:
            return (Group) r0;
        L26:
            return null;
        L11:
            it = null;
            goto L12
        L5:
            if (Intrinsics.areEqual(group.getName(), "AnimatedContent") == false) goto L7;
            r2 = true;
            goto L8
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimatedVisibilitySearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        static {
        }

        public AnimatedVisibilitySearch(Function1<? super Transition<?>, Unit> r1) {
            super(r1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (toAnimationGroup(group) == null) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> r28) {
            Set<Transition<?>> r0 = getAnimations();
            Collection<? extends Group> $this$mapNotNull$iv = r28;
            Collection destination$iv$iv = new ArrayList();
            Iterator r8 = $this$mapNotNull$iv.iterator();
        L4:
            if (r8.hasNext() == false) goto L9;
            Object element$iv$iv$iv = r8.next();
            Group it = toAnimationGroup((Group) element$iv$iv$iv);
            if (it == null) goto L4;
            destination$iv$iv.add(it);
            goto L4
        L9:
            Collection $this$findRememberedData$iv = (List) destination$iv$iv;
            int $i$f$findRememberedData = 0;
            Collection $this$mapNotNull$iv$iv = $this$findRememberedData$iv;
            Collection destination$iv$iv$iv = new ArrayList();
            Iterator r10 = $this$mapNotNull$iv$iv.iterator();
        L11:
            if (r10.hasNext() == false) goto L26;
            Object element$iv$iv$iv$iv = r10.next();
            Group it$iv = (Group) element$iv$iv$iv$iv;
            Iterable $this$firstOrNull$iv$iv = it$iv.getData();
            Iterator r20 = $this$firstOrNull$iv$iv.iterator();
        L14:
            if (r20.hasNext() == false) goto L18;
            Object element$iv$iv = r20.next();
            if ((element$iv$iv instanceof Transition) == false) goto L14;
            Object r12 = element$iv$iv;
        L19:
            int $i$f$findRememberedData2 = $i$f$findRememberedData;
            if ((r12 instanceof Transition) == true) goto L22;
            r12 = null;
        L22:
            Transition r13 = (Transition) r12;
            if (r13 == null) goto L25;
            destination$iv$iv$iv.add(r13);
        L25:
            $i$f$findRememberedData = $i$f$findRememberedData2;
            goto L11
        L18:
            r12 = null;
            goto L19
        L26:
            Object it$iv$iv$iv = (List) destination$iv$iv$iv;
            Collection $this$mapNotNull$iv$iv2 = $this$findRememberedData$iv;
            Collection destination$iv$iv$iv2 = new ArrayList();
            Iterator r11 = $this$mapNotNull$iv$iv2.iterator();
        L28:
            if (r11.hasNext() == false) goto L33;
            Object element$iv$iv$iv$iv2 = r11.next();
            Group it$iv2 = (Group) element$iv$iv$iv$iv2;
            Object selfData$iv = it$iv$iv$iv;
            Group r1 = PreviewUtils_androidKt.firstOrNull(it$iv2, AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (r1 == null) goto L32;
            destination$iv$iv$iv2.add(r1);
        L32:
            it$iv$iv$iv = selfData$iv;
            goto L28
        L33:
            Object selfData$iv2 = it$iv$iv$iv;
            List rememberCalls$iv = (List) destination$iv$iv$iv2;
            ArrayList r2 = (Collection) selfData$iv2;
            List $this$mapNotNull$iv$iv3 = rememberCalls$iv;
            Collection destination$iv$iv$iv3 = new ArrayList();
            Iterator r14 = $this$mapNotNull$iv$iv3.iterator();
        L35:
            if (r14.hasNext() == false) goto L51;
            Object element$iv$iv$iv$iv3 = r14.next();
            Group it$iv3 = (Group) element$iv$iv$iv$iv3;
            Iterable $this$firstOrNull$iv$iv2 = it$iv3.getData();
            Iterator r22 = $this$firstOrNull$iv$iv2.iterator();
        L38:
            if (r22.hasNext() == false) goto L43;
            Object element$iv$iv2 = r22.next();
            List rememberCalls$iv2 = rememberCalls$iv;
            if ((element$iv$iv2 instanceof Transition) == true) goto L41;
            rememberCalls$iv = rememberCalls$iv2;
            goto L38
        L41:
            Object r3 = element$iv$iv2;
        L44:
            Collection $this$firstOrNull$iv$iv3 = $this$findRememberedData$iv;
            if ((r3 instanceof Transition) == true) goto L47;
            r3 = null;
        L47:
            Transition r4 = (Transition) r3;
            if (r4 == null) goto L50;
            destination$iv$iv$iv3.add(r4);
        L50:
            $this$findRememberedData$iv = $this$firstOrNull$iv$iv3;
            rememberCalls$iv = rememberCalls$iv2;
            goto L35
        L43:
            rememberCalls$iv2 = rememberCalls$iv;
            r3 = null;
            goto L44
        L51:
            r0.addAll(CollectionsKt.plus(r2, (List) destination$iv$iv$iv3));
        }

        private final Group toAnimationGroup(Group group) {
            if (group.getLocation() != null) goto L5;
        L7:
            boolean r2 = false;
        L8:
            Object r0 = null;
            if (r2 == false) goto L11;
            Group it = group;
        L12:
            if (it == null) goto L26;
            Iterable $this$firstOrNull$iv = it.getChildren();
            Iterator r5 = $this$firstOrNull$iv.iterator();
        L15:
            if (r5.hasNext() == false) goto L22;
            Object element$iv = r5.next();
            Group updateTransitionCall = (Group) element$iv;
            if (Intrinsics.areEqual(updateTransitionCall.getName(), "updateTransition") == false) goto L15;
            r0 = element$iv;
        L22:
            return (Group) r0;
        L26:
            return null;
        L11:
            it = null;
            goto L12
        L5:
            if (Intrinsics.areEqual(group.getName(), "AnimatedVisibility") == false) goto L7;
            r2 = true;
            goto L8
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$DecaySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/DecayAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DecaySearch extends RememberSearch<DecayAnimation<?, ?>> {
        public static final int $stable = 0;

        static {
        }

        public DecaySearch(Function1<? super DecayAnimation<?, ?>, Unit> r2) {
            super(Reflection.getOrCreateKotlinClass(DecayAnimation.class), r2);
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J \u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\nH\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "findAnimations", "", "findToolingOverride", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "", "group", "hasAnimation", "", "toAnimationGroup", "Landroidx/compose/ui/tooling/data/CallGroup;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        public static final int $stable = 0;

        static {
        }

        public InfiniteTransitionSearch(Function1<? super InfiniteTransitionSearchInfo, Unit> r1) {
            super(r1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (toAnimationGroup(group) == null) goto L33;
            Collection<Object> r6 = group.getData();
            Iterable $this$flatMap$iv$iv = group.getChildren();
            Collection destination$iv$iv$iv = new ArrayList();
            Iterator r12 = $this$flatMap$iv$iv.iterator();
        L6:
            if (r12.hasNext() == false) goto L8;
            Object element$iv$iv$iv = r12.next();
            Group it$iv = (Group) element$iv$iv$iv;
            Iterable list$iv$iv$iv = it$iv.getData();
            CollectionsKt.addAll(destination$iv$iv$iv, list$iv$iv$iv);
            goto L6
        L8:
            Iterable dataToSearch$iv = CollectionsKt.plus(r6, (List) destination$iv$iv$iv);
            Iterable $this$firstOrNull$iv$iv = dataToSearch$iv;
            Iterator r9 = $this$firstOrNull$iv$iv.iterator();
        L9:
            Object r11 = null;
            if (r9.hasNext() == false) goto L14;
            Object element$iv$iv = r9.next();
            if ((element$iv$iv instanceof InfiniteTransition) == false) goto L9;
        L16:
            if ((element$iv$iv instanceof InfiniteTransition) == false) goto L20;
            r11 = element$iv$iv;
        L20:
            if (((InfiniteTransition) r11) != null) goto L22;
            return false;
        L22:
            if (findToolingOverride(group) == null) goto L32;
            return true;
        L32:
            return false;
        L14:
            element$iv$iv = null;
            goto L16
        L33:
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> r3) {
            getAnimations().addAll(findAnimations(r3));
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() != null) goto L5;
        L7:
            boolean r2 = false;
        L9:
            if (r2 == false) goto L11;
            Group it = group;
        L12:
            if (it != null) goto L14;
            return null;
        L14:
            if ((it instanceof CallGroup) == true) goto L16;
            return null;
        L16:
            return (CallGroup) it;
        L11:
            it = null;
            goto L12
        L5:
            if (Intrinsics.areEqual(group.getName(), "rememberInfiniteTransition") == false) goto L7;
            r2 = true;
            goto L9
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final List<InfiniteTransitionSearchInfo> findAnimations(Collection<? extends Group> r28) {
            ArrayList r3 = new ArrayList();
            Iterator<T> r8 = r28.iterator();
        L4:
            if (r8.hasNext() == false) goto L9;
            CallGroup r12 = toAnimationGroup((Group) r8.next());
            if (r12 == null) goto L4;
            r3.add(r12);
            goto L4
        L9:
            ArrayList r4 = r3;
            int r1 = 0;
            ArrayList r2 = new ArrayList();
            ArrayList r5 = r4;
            Iterator r9 = r5.iterator();
        L11:
            if (r9.hasNext() == false) goto L46;
            CallGroup r13 = (CallGroup) r9.next();
            CallGroup r14 = r13;
            int r17 = r1;
            Collection<Object> r6 = r14.getData();
            Collection<Group> r18 = r14.getChildren();
            ArrayList r21 = r4;
            ArrayList r7 = new ArrayList();
            Iterator<T> r23 = r18.iterator();
        L14:
            if (r23.hasNext() == false) goto L16;
            CollectionsKt.addAll(r7, ((Group) r23.next()).getData());
            r5 = r5;
            goto L14
        L16:
            ArrayList r26 = r5;
            List r10 = CollectionsKt.plus(r6, r7);
            Iterator r19 = r10.iterator();
        L17:
            Object r20 = null;
            if (r19.hasNext() == false) goto L23;
            Object r110 = r19.next();
            List r24 = r10;
            if ((r110 instanceof InfiniteTransition) == true) goto L21;
            r10 = r24;
            goto L17
        L21:
            Object r11 = r110;
        L25:
            if ((r11 instanceof InfiniteTransition) == true) goto L27;
            r11 = null;
        L27:
            InfiniteTransition r15 = (InfiniteTransition) r11;
            MutableState<State<Long>> r16 = findToolingOverride(r13);
            if (r15 == null) goto L42;
            if (r16 == null) goto L42;
            if (r16.getValue() != null) goto L33;
            long r111 = 0;
            r16.setValue(new ToolingState(0L));
        L34:
            Object r112 = r16.getValue();
            if ((r112 instanceof ToolingState) == false) goto L37;
            r20 = (ToolingState) r112;
        L37:
            if (r20 != null) goto L39;
            ToolingState r113 = new ToolingState(Long.valueOf(r111));
        L40:
            r20 = new InfiniteTransitionSearchInfo(r15, r113);
            goto L42
        L39:
            r113 = r20;
            goto L40
        L33:
            r111 = 0;
        L42:
            if (r20 == null) goto L44;
            r2.add(r20);
        L44:
            r1 = r17;
            r4 = r21;
            r5 = r26;
            goto L11
        L23:
            r11 = null;
            goto L25
        L46:
            return r2;
        }

        private final MutableState<State<Long>> findToolingOverride(Group group) {
            Collection<Object> r3 = group.getData();
            Collection<Group> r4 = group.getChildren();
            Collection<Group> $this$flatMap$iv$iv = r4;
            Collection destination$iv$iv$iv = new ArrayList();
            Iterator r11 = $this$flatMap$iv$iv.iterator();
        L4:
            if (r11.hasNext() == false) goto L6;
            Object element$iv$iv$iv = r11.next();
            Group child$iv = (Group) element$iv$iv$iv;
            Iterable list$iv$iv$iv = child$iv.getChildren();
            CollectionsKt.addAll(destination$iv$iv$iv, list$iv$iv$iv);
            goto L4
        L6:
            Iterable $this$flatMap$iv$iv2 = CollectionsKt.plus(r4, (List) destination$iv$iv$iv);
            Collection destination$iv$iv$iv2 = new ArrayList();
            Iterator r9 = $this$flatMap$iv$iv2.iterator();
        L8:
            if (r9.hasNext() == false) goto L10;
            Object element$iv$iv$iv2 = r9.next();
            Group it$iv = (Group) element$iv$iv$iv2;
            Iterable list$iv$iv$iv2 = it$iv.getData();
            CollectionsKt.addAll(destination$iv$iv$iv2, list$iv$iv$iv2);
            goto L8
        L10:
            Iterable dataToSearch$iv = CollectionsKt.plus(r3, (List) destination$iv$iv$iv2);
            Iterable $this$firstOrNull$iv$iv = dataToSearch$iv;
            Iterator r6 = $this$firstOrNull$iv$iv.iterator();
        L11:
            Object r8 = null;
            if (r6.hasNext() == false) goto L16;
            Object element$iv$iv = r6.next();
            if ((element$iv$iv instanceof MutableState) == false) goto L11;
        L18:
            if ((element$iv$iv instanceof MutableState) == false) goto L22;
            r8 = element$iv$iv;
        L22:
            return (MutableState) r8;
        L16:
            element$iv$iv = null;
            goto L18
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "infiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "getInfiniteTransition", "()Landroidx/compose/animation/core/InfiniteTransition;", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfiniteTransitionSearchInfo {
        public static final int $stable = 0;
        private final InfiniteTransition infiniteTransition;
        private final ToolingState<Long> toolingState;

        static {
            $stable = InfiniteTransition.$stable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfiniteTransitionSearchInfo copy$default(InfiniteTransitionSearchInfo r0, InfiniteTransition r1, ToolingState r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.infiniteTransition;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.toolingState;
        L9:
            return r0.copy(r1, r2);
        }

        public final InfiniteTransition component1() {
            return this.infiniteTransition;
        }

        public final ToolingState<Long> component2() {
            return this.toolingState;
        }

        public final InfiniteTransitionSearchInfo copy(InfiniteTransition r2, ToolingState<Long> r3) {
            return new InfiniteTransitionSearchInfo(r2, r3);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof InfiniteTransitionSearchInfo) == true) goto L8;
            return false;
        L8:
            InfiniteTransitionSearchInfo r1 = (InfiniteTransitionSearchInfo) r6;
            if (Intrinsics.areEqual(this.infiniteTransition, r1.infiniteTransition) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(this.toolingState, r1.toolingState) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.infiniteTransition.hashCode() * 31) + this.toolingState.hashCode();
        }

        public String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.infiniteTransition + ", toolingState=" + this.toolingState + ')';
        }

        public InfiniteTransitionSearchInfo(InfiniteTransition infiniteTransition, ToolingState<Long> r2) {
            this.infiniteTransition = infiniteTransition;
            this.toolingState = r2;
        }

        public final InfiniteTransition getInfiniteTransition() {
            return this.infiniteTransition;
        }

        public final ToolingState<Long> getToolingState() {
            return this.toolingState;
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J+\u0010\u0011\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u0002*\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0002¢\u0006\u0002\u0010\u0012J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0013\"\b\b\u0001\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "T", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "clazz", "Lkotlin/reflect/KClass;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "findRememberCallWithType", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class RememberSearch<T> extends Search<T> {
        public static final int $stable = 0;
        private final KClass<T> clazz;

        static {
            $stable = 8;
        }

        public RememberSearch(KClass<T> r1, Function1<? super T, Unit> r2) {
            super(r2);
            this.clazz = r1;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> r11) {
            Collection<? extends Group> $this$filter$iv = r11;
            Collection destination$iv$iv = new ArrayList();
            Iterator<T> r5 = $this$filter$iv.iterator();
        L4:
            if (r5.hasNext() == false) goto L11;
            Object element$iv$iv = r5.next();
            Group it = (Group) element$iv$iv;
            if (it.getLocation() == null) goto L8;
            boolean r9 = true;
        L9:
            if (r9 == false) goto L4;
            destination$iv$iv.add(element$iv$iv);
            goto L4
        L8:
            r9 = false;
            goto L9
        L11:
            List groupsWithLocation = (List) destination$iv$iv;
            getAnimations().addAll(CollectionsKt.toSet(findRememberCallWithType(groupsWithLocation, this.clazz)));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (group.getLocation() != null) goto L5;
        L7:
            return false;
        L5:
            if (findRememberCallWithType(group, this.clazz) == null) goto L7;
            return true;
        }

        private final <T> List<T> findRememberCallWithType(Collection<? extends Group> r14, KClass<T> r15) {
            Collection<? extends Group> $this$mapNotNull$iv = r14;
            Collection destination$iv$iv = new ArrayList();
            Iterator<T> r7 = $this$mapNotNull$iv.iterator();
        L4:
            if (r7.hasNext() == false) goto L10;
            Object element$iv$iv$iv = r7.next();
            Group it = (Group) element$iv$iv$iv;
            T r11 = findRememberCallWithType(it, r15);
            if (r11 == null) goto L4;
            destination$iv$iv.add(r11);
            goto L4
        L10:
            return (List) destination$iv$iv;
        }

        private final <T> T findRememberCallWithType(Group r9, KClass<T> r10) {
            Iterator<T> r2 = r9.getData().iterator();
        L3:
            Object r4 = null;
            if (r2.hasNext() == false) goto L15;
            T r3 = r2.next();
            if (r3 == null) goto L11;
            Class<?> r7 = r3.getClass();
            if (r7 == null) goto L11;
            r4 = JvmClassMappingKt.getKotlinClass(r7);
        L11:
            if (Intrinsics.areEqual(r4, r10) == false) goto L3;
            r4 = r3;
        L15:
            return (T) KClasses.safeCast(r10, r4);
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH&J\u0014\u0010\u0012\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0013\u001a\u00020\u0005R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "T", "", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "animations", "", "getAnimations", "()Ljava/util/Set;", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "hasAnimations", "track", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Search<T> {
        public static final int $stable = 0;
        private final Set<T> animations;
        private final Function1<T, Unit> trackAnimation;

        static {
            $stable = 8;
        }

        public abstract boolean hasAnimation(Group r1);

        /* JADX WARN: Multi-variable type inference failed */
        public Search(Function1<? super T, Unit> r2) {
            this.trackAnimation = r2;
            this.animations = new LinkedHashSet();
        }

        public final boolean hasAnimations(Collection<? extends Group> r8) {
            Collection<? extends Group> $this$any$iv = r8;
            if (($this$any$iv instanceof Collection) == true) goto L5;
        L7:
            Iterator<T> r2 = $this$any$iv.iterator();
        L9:
            if (r2.hasNext() == false) goto L19;
            Object element$iv = r2.next();
            Group it = (Group) element$iv;
            if (hasAnimation(it) == false) goto L9;
            return true;
        L19:
            return false;
        L5:
            if ($this$any$iv.isEmpty() == false) goto L7;
            return false;
        }

        public final Set<T> getAnimations() {
            return this.animations;
        }

        public void addAnimations(Collection<? extends Group> r1) {
        }

        public final void track() {
            Iterable $this$forEach$iv = CollectionsKt.reversed(this.animations);
            Function1<T, Unit> r1 = this.trackAnimation;
            Iterator<T> r3 = $this$forEach$iv.iterator();
        L4:
            if (r3.hasNext() == false) goto L7;
            r1.invoke(r3.next());
            goto L4
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TargetBasedSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TargetBasedSearch extends RememberSearch<TargetBasedAnimation<?, ?>> {
        public static final int $stable = 0;

        static {
        }

        public TargetBasedSearch(Function1<? super TargetBasedAnimation<?, ?>, Unit> r2) {
            super(Reflection.getOrCreateKotlinClass(TargetBasedAnimation.class), r2);
        }
    }

    /* JADX INFO: compiled from: AnimationSearch.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "toAnimationGroup", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TransitionSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        static {
        }

        public TransitionSearch(Function1<? super Transition<?>, Unit> r1) {
            super(r1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(Group group) {
            if (toAnimationGroup(group) == null) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(Collection<? extends Group> r28) {
            Set<Transition<?>> r0 = getAnimations();
            Collection<? extends Group> $this$mapNotNull$iv = r28;
            Collection destination$iv$iv = new ArrayList();
            Iterator r8 = $this$mapNotNull$iv.iterator();
        L4:
            if (r8.hasNext() == false) goto L9;
            Object element$iv$iv$iv = r8.next();
            Group it = toAnimationGroup((Group) element$iv$iv$iv);
            if (it == null) goto L4;
            destination$iv$iv.add(it);
            goto L4
        L9:
            Collection $this$findRememberedData$iv = (List) destination$iv$iv;
            int $i$f$findRememberedData = 0;
            Collection $this$mapNotNull$iv$iv = $this$findRememberedData$iv;
            Collection destination$iv$iv$iv = new ArrayList();
            Iterator r10 = $this$mapNotNull$iv$iv.iterator();
        L11:
            if (r10.hasNext() == false) goto L26;
            Object element$iv$iv$iv$iv = r10.next();
            Group it$iv = (Group) element$iv$iv$iv$iv;
            Iterable $this$firstOrNull$iv$iv = it$iv.getData();
            Iterator r20 = $this$firstOrNull$iv$iv.iterator();
        L14:
            if (r20.hasNext() == false) goto L18;
            Object element$iv$iv = r20.next();
            if ((element$iv$iv instanceof Transition) == false) goto L14;
            Object r12 = element$iv$iv;
        L19:
            int $i$f$findRememberedData2 = $i$f$findRememberedData;
            if ((r12 instanceof Transition) == true) goto L22;
            r12 = null;
        L22:
            Transition r13 = (Transition) r12;
            if (r13 == null) goto L25;
            destination$iv$iv$iv.add(r13);
        L25:
            $i$f$findRememberedData = $i$f$findRememberedData2;
            goto L11
        L18:
            r12 = null;
            goto L19
        L26:
            Object it$iv$iv$iv = (List) destination$iv$iv$iv;
            Collection $this$mapNotNull$iv$iv2 = $this$findRememberedData$iv;
            Collection destination$iv$iv$iv2 = new ArrayList();
            Iterator r11 = $this$mapNotNull$iv$iv2.iterator();
        L28:
            if (r11.hasNext() == false) goto L33;
            Object element$iv$iv$iv$iv2 = r11.next();
            Group it$iv2 = (Group) element$iv$iv$iv$iv2;
            Object selfData$iv = it$iv$iv$iv;
            Group r1 = PreviewUtils_androidKt.firstOrNull(it$iv2, AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
            if (r1 == null) goto L32;
            destination$iv$iv$iv2.add(r1);
        L32:
            it$iv$iv$iv = selfData$iv;
            goto L28
        L33:
            Object selfData$iv2 = it$iv$iv$iv;
            List rememberCalls$iv = (List) destination$iv$iv$iv2;
            ArrayList r2 = (Collection) selfData$iv2;
            List $this$mapNotNull$iv$iv3 = rememberCalls$iv;
            Collection destination$iv$iv$iv3 = new ArrayList();
            Iterator r14 = $this$mapNotNull$iv$iv3.iterator();
        L35:
            if (r14.hasNext() == false) goto L51;
            Object element$iv$iv$iv$iv3 = r14.next();
            Group it$iv3 = (Group) element$iv$iv$iv$iv3;
            Iterable $this$firstOrNull$iv$iv2 = it$iv3.getData();
            Iterator r22 = $this$firstOrNull$iv$iv2.iterator();
        L38:
            if (r22.hasNext() == false) goto L43;
            Object element$iv$iv2 = r22.next();
            List rememberCalls$iv2 = rememberCalls$iv;
            if ((element$iv$iv2 instanceof Transition) == true) goto L41;
            rememberCalls$iv = rememberCalls$iv2;
            goto L38
        L41:
            Object r3 = element$iv$iv2;
        L44:
            Collection $this$firstOrNull$iv$iv3 = $this$findRememberedData$iv;
            if ((r3 instanceof Transition) == true) goto L47;
            r3 = null;
        L47:
            Transition r4 = (Transition) r3;
            if (r4 == null) goto L50;
            destination$iv$iv$iv3.add(r4);
        L50:
            $this$findRememberedData$iv = $this$firstOrNull$iv$iv3;
            rememberCalls$iv = rememberCalls$iv2;
            goto L35
        L43:
            rememberCalls$iv2 = rememberCalls$iv;
            r3 = null;
            goto L44
        L51:
            r0.addAll(CollectionsKt.plus(r2, (List) destination$iv$iv$iv3));
        }

        private final Group toAnimationGroup(Group group) {
            if (group.getLocation() != null) goto L5;
        L7:
            boolean r2 = false;
        L8:
            if (r2 == true) goto L12;
            return null;
        L12:
            return group;
        L5:
            if (Intrinsics.areEqual(group.getName(), "updateTransition") == false) goto L7;
            r2 = true;
            goto L8
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationSearch(Function0<? extends PreviewAnimationClock> r3, Function0<Unit> r4) {
        this.clock = r3;
        this.onSeek = r4;
        this.transitionSearch = new TransitionSearch(new AnimationSearch$transitionSearch$1(this));
        this.animatedContentSearch = new AnimatedContentSearch(new AnimationSearch$animatedContentSearch$1(this));
        this.animatedVisibilitySearch = new AnimatedVisibilitySearch(new AnimationSearch$animatedVisibilitySearch$1(this));
        this.supportedSearch = supportedSearch();
        this.setToTrack = SetsKt.plus(this.supportedSearch, unsupportedSearch());
        this.setToSearch = SetsKt.plus(this.setToTrack, SetsKt.setOf(this.animatedContentSearch));
    }

    public static final /* synthetic */ Function0 access$getClock$p(AnimationSearch $this) {
        return $this.clock;
    }

    public static final /* synthetic */ Function0 access$getOnSeek$p(AnimationSearch $this) {
        return $this.onSeek;
    }

    private final Collection<AnimateXAsStateSearch> animateXAsStateSearch() {
        if (AnimateXAsStateComposeAnimation.Companion.getApiAvailable() == false) goto L6;
        return SetsKt.setOf(new AnimateXAsStateSearch(new AnonymousClass1(this)));
    L6:
        return CollectionsKt.emptyList();
    }

    private final Set<InfiniteTransitionSearch> infiniteTransitionSearch() {
        if (InfiniteTransitionComposeAnimation.Companion.getApiAvailable() == false) goto L6;
        return SetsKt.setOf(new InfiniteTransitionSearch(new C06691(this)));
    L6:
        return SetsKt.emptySet();
    }

    private final Set<Search<? extends Object>> supportedSearch() {
        Set r0 = SetsKt.plus(SetsKt.plus(SetsKt.setOf(new Search[]{this.transitionSearch, this.animatedVisibilitySearch}), animateXAsStateSearch()), infiniteTransitionSearch());
        if (AnimatedContentComposeAnimation.Companion.getApiAvailable() == false) goto L5;
        Set r1 = SetsKt.setOf(this.animatedContentSearch);
    L7:
        return SetsKt.plus(r0, r1);
    L5:
        r1 = SetsKt.emptySet();
        goto L7
    }

    private final Collection<Search<? extends Object>> unsupportedSearch() {
        if (UnsupportedComposeAnimation.Companion.getApiAvailable() == false) goto L6;
        return SetsKt.setOf(new Search[]{new AnimateContentSizeSearch(new C06701(this)), new TargetBasedSearch(new AnonymousClass2(this)), new DecaySearch(new AnonymousClass3(this))});
    L6:
        return CollectionsKt.emptyList();
    }

    public final boolean searchAny(Collection<? extends Group> r17) {
        Collection<? extends Group> $this$any$iv = r17;
        if (($this$any$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator r2 = $this$any$iv.iterator();
    L9:
        if (r2.hasNext() == false) goto L26;
        Object element$iv = r2.next();
        Group tree = (Group) element$iv;
        List<Group> r7 = PreviewUtils_androidKt.findAll(tree, AnimationSearch$searchAny$1$groups$1.INSTANCE);
        Iterable $this$any$iv2 = this.supportedSearch;
        if (($this$any$iv2 instanceof Collection) == true) goto L13;
    L15:
        Iterator r11 = $this$any$iv2.iterator();
    L17:
        if (r11.hasNext() == false) goto L21;
        Object element$iv2 = r11.next();
        Search search = (Search) element$iv2;
        if (search.hasAnimations(r7) == false) goto L17;
        boolean r3 = true;
    L23:
        if (r3 == false) goto L9;
        return true;
    L21:
        r3 = false;
        goto L23
    L13:
        if (((Collection) $this$any$iv2).isEmpty() == false) goto L15;
        r3 = false;
        goto L23
    L26:
        return false;
    L5:
        if ($this$any$iv.isEmpty() == false) goto L7;
        return false;
    }

    public final void attachAllAnimations(Collection<? extends Group> r15) {
        Collection<? extends Group> $this$forEach$iv = r15;
        Iterator r2 = $this$forEach$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        Object element$iv = r2.next();
        Group tree = (Group) element$iv;
        List<Group> r6 = PreviewUtils_androidKt.findAll(tree, AnimationSearch$attachAllAnimations$1$groups$1.INSTANCE);
        Iterable $this$forEach$iv2 = this.setToSearch;
        Iterator r9 = $this$forEach$iv2.iterator();
    L7:
        if (r9.hasNext() == false) goto L9;
        Object element$iv2 = r9.next();
        Search it = (Search) element$iv2;
        it.addAnimations(r6);
        goto L7
    L9:
        this.transitionSearch.getAnimations().removeAll(this.animatedVisibilitySearch.getAnimations());
        this.transitionSearch.getAnimations().removeAll(this.animatedContentSearch.getAnimations());
        goto L4
    L10:
        Iterable $this$forEach$iv3 = this.setToTrack;
        Iterator r3 = $this$forEach$iv3.iterator();
    L12:
        if (r3.hasNext() == false) goto L15;
        Object element$iv3 = r3.next();
        Search it2 = (Search) element$iv3;
        it2.track();
        goto L12
    }
}
