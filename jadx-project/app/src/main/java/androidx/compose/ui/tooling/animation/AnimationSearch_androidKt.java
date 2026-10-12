package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.data.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationSearch.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001e\n\u0000\u001a&\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0082\b¢\u0006\u0002\u0010\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\u0010\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000bH\u0082\b\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\u0010\"\u0006\b\u0000\u0010\n\u0018\u0001*\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"ANIMATED_CONTENT", "", "ANIMATED_VISIBILITY", "ANIMATE_VALUE_AS_STATE", "REMEMBER", "REMEMBER_INFINITE_TRANSITION", "REMEMBER_UPDATED_STATE", "SIZE_ANIMATION_MODIFIER", "UPDATE_TRANSITION", "findData", "T", "Landroidx/compose/ui/tooling/data/Group;", "includeGrandchildren", "", "(Landroidx/compose/ui/tooling/data/Group;Z)Ljava/lang/Object;", "findRememberedData", "", "", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimationSearch_androidKt {
    private static final String ANIMATED_CONTENT = "AnimatedContent";
    private static final String ANIMATED_VISIBILITY = "AnimatedVisibility";
    private static final String ANIMATE_VALUE_AS_STATE = "animateValueAsState";
    private static final String REMEMBER = "remember";
    private static final String REMEMBER_INFINITE_TRANSITION = "rememberInfiniteTransition";
    private static final String REMEMBER_UPDATED_STATE = "rememberUpdatedState";
    private static final String SIZE_ANIMATION_MODIFIER = "androidx.compose.animation.SizeAnimationModifierElement";
    private static final String UPDATE_TRANSITION = "updateTransition";

    private static final /* synthetic */ <T> List<T> findRememberedData(Collection<? extends Group> r27) {
        int $i$f$findRememberedData = 0;
        Collection<? extends Group> $this$mapNotNull$iv = r27;
        Collection destination$iv$iv = new ArrayList();
        Iterator<T> r8 = $this$mapNotNull$iv.iterator();
    L4:
        if (r8.hasNext() == false) goto L16;
        Object element$iv$iv$iv = r8.next();
        Group it = (Group) element$iv$iv$iv;
        Iterable $this$firstOrNull$iv = it.getData();
        Iterator<T> r20 = $this$firstOrNull$iv.iterator();
    L7:
        if (r20.hasNext() == false) goto L11;
        T r21 = r20.next();
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r21 instanceof Object) == false) goto L7;
        T r12 = r21;
    L12:
        Intrinsics.reifiedOperationMarker(2, "T");
        if (r12 == null) goto L4;
        destination$iv$iv.add(r12);
        goto L4
    L11:
        r12 = null;
        goto L12
    L16:
        List selfData = (List) destination$iv$iv;
        Collection<? extends Group> $this$mapNotNull$iv2 = r27;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator<T> r9 = $this$mapNotNull$iv2.iterator();
    L18:
        if (r9.hasNext() == false) goto L23;
        Object element$iv$iv$iv2 = r9.next();
        Group it2 = (Group) element$iv$iv$iv2;
        Group it3 = PreviewUtils_androidKt.firstOrNull(it2, AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
        if (it3 == null) goto L18;
        destination$iv$iv2.add(it3);
        goto L18
    L23:
        Iterable rememberCalls = (List) destination$iv$iv2;
        List r1 = selfData;
        Iterable $this$mapNotNull$iv3 = rememberCalls;
        Collection destination$iv$iv3 = new ArrayList();
        Iterator<T> r11 = $this$mapNotNull$iv3.iterator();
    L25:
        if (r11.hasNext() == false) goto L39;
        Object element$iv$iv$iv3 = r11.next();
        Group it4 = (Group) element$iv$iv$iv3;
        Iterable $this$firstOrNull$iv2 = it4.getData();
        Iterator<T> r22 = $this$firstOrNull$iv2.iterator();
    L28:
        if (r22.hasNext() == false) goto L33;
        T r23 = r22.next();
        int $i$f$findRememberedData2 = $i$f$findRememberedData;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r23 instanceof Object) == true) goto L34;
        $i$f$findRememberedData = $i$f$findRememberedData2;
    L34:
        Intrinsics.reifiedOperationMarker(2, "T");
        if (r23 == null) goto L37;
        destination$iv$iv3.add(r23);
    L37:
        $i$f$findRememberedData = $i$f$findRememberedData2;
        goto L25
    L33:
        $i$f$findRememberedData2 = $i$f$findRememberedData;
        r23 = null;
        goto L34
    L39:
        return CollectionsKt.plus(r1, (List) destination$iv$iv3);
    }

    private static final /* synthetic */ <T> List<T> findRememberedData(Group $this$findRememberedData) {
        int $i$f$findRememberedData = 0;
        Iterable $this$firstOrNull$iv = $this$findRememberedData.getData();
        Iterator<T> r3 = $this$firstOrNull$iv.iterator();
    L4:
        if (r3.hasNext() == false) goto L8;
        Object element$iv = r3.next();
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((element$iv instanceof Object) == false) goto L4;
    L9:
        Intrinsics.reifiedOperationMarker(2, "T");
        if (element$iv == null) goto L14;
        Object it = element$iv;
        Object it2 = CollectionsKt.listOf(it);
        List r4 = (List) it2;
        if (it2 == null) goto L14;
        List r5 = (List) it2;
    L15:
        List r2 = (Collection) it2;
        Iterable r6 = $this$findRememberedData.getChildren();
        Iterable $this$mapNotNull$iv$iv = r6;
        Collection destination$iv$iv$iv = new ArrayList();
        Iterator<T> r16 = $this$mapNotNull$iv$iv.iterator();
    L17:
        if (r16.hasNext() == false) goto L29;
        Object element$iv$iv$iv$iv = r16.next();
        Group it$iv = (Group) element$iv$iv$iv$iv;
        Iterable $this$firstOrNull$iv$iv = it$iv.getData();
        Iterator<T> r24 = $this$firstOrNull$iv$iv.iterator();
    L20:
        if (r24.hasNext() == false) goto L24;
        T r25 = r24.next();
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r25 instanceof Object) == false) goto L20;
    L25:
        Intrinsics.reifiedOperationMarker(2, "T");
        if (r25 == null) goto L17;
        destination$iv$iv$iv.add(r25);
        goto L17
    L24:
        r25 = null;
        goto L25
    L29:
        List selfData$iv = (List) destination$iv$iv$iv;
        Iterable $this$mapNotNull$iv$iv2 = r6;
        Collection destination$iv$iv$iv2 = new ArrayList();
        Iterator<T> r17 = $this$mapNotNull$iv$iv2.iterator();
    L31:
        if (r17.hasNext() == false) goto L36;
        Object element$iv$iv$iv$iv2 = r17.next();
        Group it$iv2 = (Group) element$iv$iv$iv$iv2;
        Group it$iv3 = PreviewUtils_androidKt.firstOrNull(it$iv2, AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
        if (it$iv3 == null) goto L31;
        destination$iv$iv$iv2.add(it$iv3);
        goto L31
    L36:
        Iterable rememberCalls$iv = (List) destination$iv$iv$iv2;
        List r7 = selfData$iv;
        Iterable $this$mapNotNull$iv$iv3 = rememberCalls$iv;
        Collection destination$iv$iv$iv3 = new ArrayList();
        Iterator<T> r18 = $this$mapNotNull$iv$iv3.iterator();
    L38:
        if (r18.hasNext() == false) goto L52;
        Object element$iv$iv$iv$iv3 = r18.next();
        Group it$iv4 = (Group) element$iv$iv$iv$iv3;
        Iterable $this$firstOrNull$iv$iv2 = it$iv4.getData();
        Iterator<T> r26 = $this$firstOrNull$iv$iv2.iterator();
    L41:
        if (r26.hasNext() == false) goto L46;
        T r27 = r26.next();
        int $i$f$findRememberedData2 = $i$f$findRememberedData;
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r27 instanceof Object) == true) goto L47;
        $i$f$findRememberedData = $i$f$findRememberedData2;
    L47:
        Intrinsics.reifiedOperationMarker(2, "T");
        if (r27 == null) goto L50;
        destination$iv$iv$iv3.add(r27);
    L50:
        $i$f$findRememberedData = $i$f$findRememberedData2;
        goto L38
    L46:
        $i$f$findRememberedData2 = $i$f$findRememberedData;
        r27 = null;
        goto L47
    L52:
        return CollectionsKt.plus(r2, CollectionsKt.plus(r7, (List) destination$iv$iv$iv3));
    L14:
        it2 = CollectionsKt.emptyList();
        goto L15
    L8:
        element$iv = null;
        goto L9
    }

    static /* synthetic */ Object findData$default(Group $this$findData_u24default, boolean includeGrandchildren, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L5;
        includeGrandchildren = false;
    L5:
        Collection<Object> r15 = $this$findData_u24default.getData();
        Collection<Group> r0 = $this$findData_u24default.getChildren();
        if (includeGrandchildren == false) goto L12;
        Collection<Group> $this$flatMap$iv = r0;
        Collection destination$iv$iv = new ArrayList();
        Iterator r7 = $this$flatMap$iv.iterator();
    L9:
        if (r7.hasNext() == false) goto L11;
        Object element$iv$iv = r7.next();
        Group child = (Group) element$iv$iv;
        Iterable list$iv$iv = child.getChildren();
        CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        goto L9
    L11:
        r0 = CollectionsKt.plus(r0, (List) destination$iv$iv);
    L12:
        Collection<Group> $this$flatMap$iv2 = r0;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r5 = $this$flatMap$iv2.iterator();
    L14:
        if (r5.hasNext() == false) goto L16;
        Object element$iv$iv2 = r5.next();
        Group it = (Group) element$iv$iv2;
        Iterable list$iv$iv2 = it.getData();
        CollectionsKt.addAll(destination$iv$iv2, list$iv$iv2);
        goto L14
    L16:
        Iterable dataToSearch = CollectionsKt.plus(r15, (List) destination$iv$iv2);
        Iterable $this$firstOrNull$iv = dataToSearch;
        Iterator r2 = $this$firstOrNull$iv.iterator();
    L18:
        if (r2.hasNext() == false) goto L22;
        Object element$iv = r2.next();
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((element$iv instanceof Object) == false) goto L18;
    L23:
        Intrinsics.reifiedOperationMarker(2, "T");
        return element$iv;
    L22:
        element$iv = null;
        goto L23
    }

    private static final /* synthetic */ <T> T findData(Group $this$findData, boolean includeGrandchildren) {
        Collection<Object> r1 = $this$findData.getData();
        Collection<Group> r2 = $this$findData.getChildren();
        if (includeGrandchildren == false) goto L9;
        Collection<Group> $this$flatMap$iv = r2;
        Collection destination$iv$iv = new ArrayList();
        Iterator<T> r9 = $this$flatMap$iv.iterator();
    L6:
        if (r9.hasNext() == false) goto L8;
        Object element$iv$iv = r9.next();
        Group child = (Group) element$iv$iv;
        Iterable list$iv$iv = child.getChildren();
        CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        goto L6
    L8:
        r2 = CollectionsKt.plus(r2, (List) destination$iv$iv);
    L9:
        Collection<Group> $this$flatMap$iv2 = r2;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator<T> r7 = $this$flatMap$iv2.iterator();
    L11:
        if (r7.hasNext() == false) goto L13;
        Object element$iv$iv2 = r7.next();
        Group it = (Group) element$iv$iv2;
        Iterable list$iv$iv2 = it.getData();
        CollectionsKt.addAll(destination$iv$iv2, list$iv$iv2);
        goto L11
    L13:
        Iterable dataToSearch = CollectionsKt.plus(r1, (List) destination$iv$iv2);
        Iterable $this$firstOrNull$iv = dataToSearch;
        Iterator<T> r4 = $this$firstOrNull$iv.iterator();
    L15:
        if (r4.hasNext() == false) goto L19;
        T r5 = r4.next();
        Intrinsics.reifiedOperationMarker(3, "T");
        if ((r5 instanceof Object) == false) goto L15;
    L20:
        Intrinsics.reifiedOperationMarker(2, "T");
        return r5;
    L19:
        r5 = null;
        goto L20
    }
}
