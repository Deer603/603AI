package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.webkit.Profile;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FocusRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u001d\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0082\bJ!\u0010\u000e\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0000¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\tR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "()V", "focusRequesterNodes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "captureFocus", "", "findFocusTarget", "onFound", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "findFocusTargetNode", "findFocusTargetNode$ui_release", "freeFocus", "requestFocus", "", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "requestFocus-3ESFkO8", "(I)Z", "restoreFocusedChild", "saveFocusedChild", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusRequester {
    public static final int $stable = 0;
    private static final FocusRequester Cancel = null;
    public static final Companion Companion = null;
    private static final FocusRequester Default = null;
    private static final FocusRequester Redirect = null;
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes;

    /* JADX INFO: compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "()V", "Cancel", "Landroidx/compose/ui/focus/FocusRequester;", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", Profile.DEFAULT_PROFILE_NAME, "getDefault", "Redirect", "getRedirect$ui_release", "createRefs", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: FocusRequester.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "()V", "component1", "Landroidx/compose/ui/focus/FocusRequester;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            public static final FocusRequesterFactory INSTANCE = null;

            static {
                INSTANCE = new FocusRequesterFactory();
            }

            private FocusRequesterFactory() {
            }

            public final FocusRequester component1() {
                return new FocusRequester();
            }

            public final FocusRequester component2() {
                return new FocusRequester();
            }

            public final FocusRequester component3() {
                return new FocusRequester();
            }

            public final FocusRequester component4() {
                return new FocusRequester();
            }

            public final FocusRequester component5() {
                return new FocusRequester();
            }

            public final FocusRequester component6() {
                return new FocusRequester();
            }

            public final FocusRequester component7() {
                return new FocusRequester();
            }

            public final FocusRequester component8() {
                return new FocusRequester();
            }

            public final FocusRequester component9() {
                return new FocusRequester();
            }

            public final FocusRequester component10() {
                return new FocusRequester();
            }

            public final FocusRequester component11() {
                return new FocusRequester();
            }

            public final FocusRequester component12() {
                return new FocusRequester();
            }

            public final FocusRequester component13() {
                return new FocusRequester();
            }

            public final FocusRequester component14() {
                return new FocusRequester();
            }

            public final FocusRequester component15() {
                return new FocusRequester();
            }

            public final FocusRequester component16() {
                return new FocusRequester();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final FocusRequester getDefault() {
            return FocusRequester.access$getDefault$cp();
        }

        public final FocusRequester getCancel() {
            return FocusRequester.access$getCancel$cp();
        }

        public final FocusRequester getRedirect$ui_release() {
            return FocusRequester.access$getRedirect$cp();
        }

        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }
    }

    public FocusRequester() {
        this.focusRequesterNodes = new MutableVector(new FocusRequesterModifierNode[16], 0);
    }

    public static final /* synthetic */ FocusRequester access$getCancel$cp() {
        return Cancel;
    }

    public static final /* synthetic */ FocusRequester access$getDefault$cp() {
        return Default;
    }

    public static final /* synthetic */ FocusRequester access$getRedirect$cp() {
        return Redirect;
    }

    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "use the version the has a FocusDirection", replaceWith = @ReplaceWith(expression = "this.requestFocus()", imports = {}))
    public final /* synthetic */ void requestFocus() {
        m4037requestFocus3ESFkO8(FocusDirection.Companion.m4014getEnterdhqQ8s());
    }

    /* JADX INFO: renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    public static /* synthetic */ boolean m4036requestFocus3ESFkO8$default(FocusRequester r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = FocusDirection.Companion.m4014getEnterdhqQ8s();
    L6:
        return r0.m4037requestFocus3ESFkO8(r1);
    }

    /* JADX INFO: renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    public final boolean m4037requestFocus3ESFkO8(final int focusDirection) {
        return findFocusTargetNode$ui_release(new AnonymousClass1(focusDirection));
    }

    public final boolean findFocusTargetNode$ui_release(Function1<? super FocusTargetNode, Boolean> r42) {
        FocusRequester this_$iv = this;
        int $i$f$findFocusTarget = 0;
        int r4 = 0;
        if (this_$iv == Companion.getDefault()) goto L5;
        boolean r3 = true;
    L7:
        if (r3 == false) goto L99;
        if (this_$iv == Companion.getCancel()) goto L11;
        boolean r5 = true;
    L12:
        if (r5 == false) goto L97;
        if (this_$iv.focusRequesterNodes.getSize() == 0) goto L16;
        boolean r6 = true;
    L17:
        if (r6 == false) goto L95;
        boolean success$iv = false;
        MutableVector<FocusRequesterModifierNode> r7 = this_$iv.focusRequesterNodes;
        int i$iv$iv = 0;
        DelegatableNode[] content$iv$iv = r7.content;
        int size$iv$iv = r7.getSize();
    L19:
        if (i$iv$iv >= size$iv$iv) goto L93;
        DelegatableNode node$iv = (FocusRequesterModifierNode) content$iv$iv[i$iv$iv];
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv$iv = node$iv;
        int r14 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L23;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L23:
        int r21 = 1;
        FocusRequester this_$iv2 = this_$iv;
        int $i$f$findFocusTarget2 = $i$f$findFocusTarget;
        MutableVector branches$iv$iv$iv = new MutableVector(new Modifier.Node[16], r4);
        Modifier.Node child$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv$iv != null) goto L26;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv$iv.getNode(), false);
    L27:
        MutableVector this_$iv$iv$iv$iv = branches$iv$iv$iv;
        if (this_$iv$iv$iv$iv.getSize() == 0) goto L30;
        int r8 = r21;
    L31:
        if (r8 == 0) goto L91;
        MutableVector this_$iv$iv$iv$iv2 = branches$iv$iv$iv;
        Modifier.Node branch$iv$iv$iv = (Modifier.Node) branches$iv$iv$iv.removeAt(this_$iv$iv$iv$iv2.getSize() - 1);
        if ((branch$iv$iv$iv.getAggregateChildKindSet$ui_release() & r14) == 0) goto L34;
        Modifier.Node node$iv$iv$iv = branch$iv$iv$iv;
    L36:
        if (node$iv$iv$iv == null) goto L89;
        if ((node$iv$iv$iv.getKindSet$ui_release() & r14) != 0) goto L39;
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        r42 = r42;
        goto L36
    L39:
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        MutableVector r28 = null;
        Modifier.Node r9 = it$iv$iv;
    L40:
        if (r9 == null) goto L87;
        branches$iv$iv$iv = branches$iv$iv$iv;
        if ((r9 instanceof FocusTargetNode) == true) goto L43;
        child$iv$iv$iv = child$iv$iv$iv;
        Modifier.Node this_$iv$iv$iv$iv3 = r9;
        if ((this_$iv$iv$iv$iv3.getKindSet$ui_release() & r14) == 0) goto L54;
        int r1 = r21;
    L55:
        if (r1 == 0) goto L85;
        if ((r9 instanceof DelegatingNode) == false) goto L85;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv4 = (DelegatingNode) r9;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv4.getDelegate$ui_release();
    L59:
        if (node$iv$iv$iv$iv == null) goto L82;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & r14) == 0) goto L63;
        int r36 = r21;
    L64:
        if (r36 == 0) goto L80;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        if (count$iv$iv$iv != r21) goto L68;
        r9 = next$iv$iv$iv;
        this_$iv$iv$iv$iv4 = this_$iv$iv$iv$iv4;
    L81:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv$iv4 = this_$iv$iv$iv$iv4;
        r21 = 1;
        goto L59
    L68:
        if (r28 != null) goto L70;
        MutableVector r2 = new MutableVector(new Modifier.Node[16], 0);
    L71:
        Modifier.Node theNode$iv$iv$iv = r9;
        if (theNode$iv$iv$iv == null) goto L76;
        if (r2 == null) goto L75;
        r2.add(theNode$iv$iv$iv);
    L75:
        r9 = null;
    L76:
        if (r2 == null) goto L79;
        r2.add(next$iv$iv$iv);
    L79:
        r28 = r2;
        count$iv$iv$iv = count$iv$iv$iv;
        goto L81
    L70:
        r2 = r28;
        goto L71
    L80:
        this_$iv$iv$iv$iv4 = this_$iv$iv$iv$iv4;
        goto L81
    L63:
        r36 = 0;
        goto L64
    L82:
        int r0 = 1;
        if (count$iv$iv$iv != 1) goto L86;
        r21 = 1;
        child$iv$iv$iv = child$iv$iv$iv;
    L86:
        r9 = DelegatableNodeKt.access$pop(r28);
        r21 = r0;
        child$iv$iv$iv = child$iv$iv$iv;
    L85:
        r0 = r21;
        goto L86
    L54:
        r1 = 0;
        goto L55
    L43:
        FocusTargetNode it$iv = (FocusTargetNode) r9;
        if (it$iv.fetchFocusProperties$ui_release().getCanFocus() == false) goto L46;
        boolean r32 = r42.invoke(it$iv).booleanValue();
    L48:
        if (r32 == true) goto L49;
        r0 = r21;
        goto L86
    L49:
        success$iv = true;
        goto L91
    L46:
        r32 = TwoDimensionalFocusSearchKt.m4071findChildCorrespondingToFocusEnterOMvw8(it$iv, FocusDirection.Companion.m4014getEnterdhqQ8s(), r42);
        goto L48
    L87:
        r4 = 0;
        r42 = r42;
        goto L27
    L89:
        r4 = 0;
        r42 = r42;
        goto L27
    L34:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv$iv, branch$iv$iv$iv, false);
    L91:
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$findFocusTarget = $i$f$findFocusTarget2;
        r4 = 0;
        goto L19
    L30:
        r8 = r4;
        goto L31
    L26:
        branches$iv$iv$iv.add(child$iv$iv$iv);
        goto L27
    L93:
        return success$iv;
    L95:
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    L16:
        r6 = false;
        goto L17
    L97:
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    L11:
        r5 = false;
        goto L12
    L99:
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    L5:
        r3 = false;
        goto L7
    }

    public final boolean captureFocus() {
        if (this.focusRequesterNodes.getSize() == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L16;
        MutableVector<FocusRequesterModifierNode> r1 = this.focusRequesterNodes;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L8:
        if (i$iv >= size$iv) goto L14;
        FocusRequesterModifierNode it = (FocusRequesterModifierNode) content$iv[i$iv];
        if (FocusRequesterModifierNodeKt.captureFocus(it) == true) goto L11;
        i$iv = i$iv + 1;
        goto L8
    L11:
        return true;
    L14:
        return false;
    L16:
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    L5:
        r0 = false;
        goto L6
    }

    public final boolean freeFocus() {
        if (this.focusRequesterNodes.getSize() == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L16;
        MutableVector<FocusRequesterModifierNode> r1 = this.focusRequesterNodes;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L8:
        if (i$iv >= size$iv) goto L14;
        FocusRequesterModifierNode it = (FocusRequesterModifierNode) content$iv[i$iv];
        if (FocusRequesterModifierNodeKt.freeFocus(it) == true) goto L11;
        i$iv = i$iv + 1;
        goto L8
    L11:
        return true;
    L14:
        return false;
    L16:
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    L5:
        r0 = false;
        goto L6
    }

    public final boolean saveFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L16;
        MutableVector<FocusRequesterModifierNode> r1 = this.focusRequesterNodes;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L8:
        if (i$iv >= size$iv) goto L14;
        FocusRequesterModifierNode it = (FocusRequesterModifierNode) content$iv[i$iv];
        if (FocusRequesterModifierNodeKt.saveFocusedChild(it) == true) goto L11;
        i$iv = i$iv + 1;
        goto L8
    L11:
        return true;
    L14:
        return false;
    L16:
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    L5:
        r0 = false;
        goto L6
    }

    public final boolean restoreFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L19;
        boolean success = false;
        MutableVector<FocusRequesterModifierNode> r1 = this.focusRequesterNodes;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L8:
        if (i$iv >= size$iv) goto L17;
        FocusRequesterModifierNode it = (FocusRequesterModifierNode) content$iv[i$iv];
        if (FocusRequesterModifierNodeKt.restoreFocusedChild(it) == true) goto L14;
        if (success == true) goto L14;
        boolean r10 = false;
    L15:
        success = r10;
        i$iv = i$iv + 1;
    L14:
        r10 = true;
        goto L15
    L17:
        return success;
    L19:
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    L5:
        r0 = false;
        goto L6
    }

    static {
        Companion = new Companion(null);
        Default = new FocusRequester();
        Cancel = new FocusRequester();
        Redirect = new FocusRequester();
    }

    private final boolean findFocusTarget(Function1<? super FocusTargetNode, Boolean> r41) {
        int $i$f$findFocusTarget = 0;
        int r3 = 0;
        if (this == Companion.getDefault()) goto L5;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L98;
        if (this == Companion.getCancel()) goto L11;
        boolean r4 = true;
    L12:
        if (r4 == false) goto L96;
        if (this.focusRequesterNodes.getSize() == 0) goto L16;
        boolean r5 = true;
    L17:
        if (r5 == false) goto L94;
        boolean success = false;
        MutableVector<FocusRequesterModifierNode> r6 = this.focusRequesterNodes;
        int i$iv = 0;
        DelegatableNode[] content$iv = r6.content;
        int size$iv = r6.getSize();
    L19:
        if (i$iv >= size$iv) goto L92;
        DelegatableNode node = (FocusRequesterModifierNode) content$iv[i$iv];
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = node;
        int r13 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L23;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L23:
        int r20 = 1;
        int $i$f$findFocusTarget2 = $i$f$findFocusTarget;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], r3);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L26;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L27:
        MutableVector this_$iv$iv$iv = branches$iv$iv;
        if (this_$iv$iv$iv.getSize() == 0) goto L30;
        int r7 = r20;
    L31:
        if (r7 == 0) goto L90;
        MutableVector this_$iv$iv$iv2 = branches$iv$iv;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(this_$iv$iv$iv2.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & r13) == 0) goto L34;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L36:
        if (node$iv$iv == null) goto L88;
        if ((node$iv$iv.getKindSet$ui_release() & r13) != 0) goto L39;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        child$iv$iv = child$iv$iv;
        goto L36
    L39:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r26 = null;
        Modifier.Node r8 = it$iv;
    L40:
        if (r8 == null) goto L86;
        branches$iv$iv = branches$iv$iv;
        if ((r8 instanceof FocusTargetNode) == true) goto L43;
        Modifier.Node child$iv$iv2 = child$iv$iv;
        Modifier.Node this_$iv$iv$iv3 = r8;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & r13) == 0) goto L50;
        int r0 = r20;
    L51:
        if (r0 == 0) goto L83;
        if ((r8 instanceof DelegatingNode) == false) goto L83;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r8;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv4.getDelegate$ui_release();
    L55:
        if (node$iv$iv$iv == null) goto L79;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r13) == 0) goto L59;
        int r35 = r20;
    L60:
        if (r35 == 0) goto L77;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r20) goto L64;
        success = success;
        Modifier.Node r9 = next$iv$iv;
    L78:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        r8 = r9;
        success = success;
        r20 = 1;
        goto L55
    L64:
        if (r26 != null) goto L66;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L67:
        Modifier.Node theNode$iv$iv = r8;
        if (theNode$iv$iv == null) goto L72;
        if (r1 == null) goto L71;
        r1.add(theNode$iv$iv);
    L71:
        r9 = null;
    L73:
        if (r1 == null) goto L76;
        r1.add(next$iv$iv);
    L76:
        r26 = r1;
        count$iv$iv = count$iv$iv;
        goto L78
    L72:
        r9 = r8;
        goto L73
    L66:
        r1 = r26;
        goto L67
    L77:
        success = success;
        r9 = r8;
        goto L78
    L59:
        r35 = 0;
        goto L60
    L79:
        boolean success2 = success;
        Modifier.Node r39 = r8;
        int r10 = 1;
        if (count$iv$iv != 1) goto L85;
        r20 = 1;
        child$iv$iv = child$iv$iv2;
        success = success2;
        r8 = r39;
    L85:
        r8 = DelegatableNodeKt.access$pop(r26);
        r20 = r10;
        child$iv$iv = child$iv$iv2;
        success = success2;
    L83:
        success2 = success;
        r39 = r8;
        r10 = r20;
        goto L85
    L50:
        r0 = 0;
        goto L51
    L43:
        FocusTargetNode it = (FocusTargetNode) r8;
        child$iv$iv2 = child$iv$iv;
        if (r41.invoke(it).booleanValue() == true) goto L45;
        success2 = success;
        r39 = r8;
        r10 = r20;
        goto L85
    L45:
        success = true;
        goto L90
    L86:
        child$iv$iv = child$iv$iv;
        r3 = 0;
        goto L27
    L88:
        child$iv$iv = child$iv$iv;
        r3 = 0;
        goto L27
    L34:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
    L90:
        i$iv = i$iv + 1;
        r3 = 0;
        $i$f$findFocusTarget = $i$f$findFocusTarget2;
        goto L19
    L30:
        r7 = r3;
        goto L31
    L26:
        branches$iv$iv.add(child$iv$iv);
        goto L27
    L92:
        return success;
    L94:
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    L16:
        r5 = false;
        goto L17
    L96:
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    L11:
        r4 = false;
        goto L12
    L98:
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    L5:
        r2 = false;
        goto L7
    }
}
