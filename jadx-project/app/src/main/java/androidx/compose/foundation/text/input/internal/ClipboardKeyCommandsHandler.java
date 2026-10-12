package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextFieldKeyEventHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "", "handler", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyCommand;", "", "constructor-impl", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "equals", "", "other", "equals-impl", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lkotlin/jvm/functions/Function1;)I", "toString", "", "toString-impl", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ClipboardKeyCommandsHandler {
    private final Function1<KeyCommand, Unit> handler;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipboardKeyCommandsHandler m1219boximpl(Function1 r1) {
        return new ClipboardKeyCommandsHandler(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Function1<? super KeyCommand, ? extends Unit> m1220constructorimpl(Function1<? super KeyCommand, Unit> r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1221equalsimpl(Function1<? super KeyCommand, ? extends Unit> r2, Object r3) {
        if ((r3 instanceof ClipboardKeyCommandsHandler) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((ClipboardKeyCommandsHandler) r3).m1225unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1222equalsimpl0(Function1<? super KeyCommand, ? extends Unit> r1, Function1<? super KeyCommand, ? extends Unit> r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1223hashCodeimpl(Function1<? super KeyCommand, ? extends Unit> r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1224toStringimpl(Function1<? super KeyCommand, ? extends Unit> r2) {
        return "ClipboardKeyCommandsHandler(handler=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m1221equalsimpl(this.handler, r2);
    }

    public int hashCode() {
        return m1223hashCodeimpl(this.handler);
    }

    public String toString() {
        return m1224toStringimpl(this.handler);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Function1 m1225unboximpl() {
        return this.handler;
    }

    private /* synthetic */ ClipboardKeyCommandsHandler(Function1 handler) {
        this.handler = handler;
    }

    public final Function1<KeyCommand, Unit> getHandler() {
        return this.handler;
    }
}
