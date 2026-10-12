package androidx.compose.foundation.text;

import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: KeyboardActions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B³\u0001\u0012\u001b\b\u0002\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R$\u0010\u0002\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR$\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR$\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR$\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR$\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "onDone", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "", "Lkotlin/ExtensionFunctionType;", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnDone", "()Lkotlin/jvm/functions/Function1;", "getOnGo", "getOnNext", "getOnPrevious", "getOnSearch", "getOnSend", "equals", "", "other", "hashCode", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final KeyboardActions Default = null;
    private final Function1<KeyboardActionScope, Unit> onDone;
    private final Function1<KeyboardActionScope, Unit> onGo;
    private final Function1<KeyboardActionScope, Unit> onNext;
    private final Function1<KeyboardActionScope, Unit> onPrevious;
    private final Function1<KeyboardActionScope, Unit> onSearch;
    private final Function1<KeyboardActionScope, Unit> onSend;

    /* JADX INFO: compiled from: KeyboardActions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/text/KeyboardActions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardActions;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        private Companion() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.access$getDefault$cp();
        }
    }

    public KeyboardActions() {
        Function1 r1 = null;
        Function1 r2 = null;
        Function1 r3 = null;
        Function1 r4 = null;
        Function1 r5 = null;
        Function1 r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(Function1<? super KeyboardActionScope, Unit> r1, Function1<? super KeyboardActionScope, Unit> r2, Function1<? super KeyboardActionScope, Unit> r3, Function1<? super KeyboardActionScope, Unit> r4, Function1<? super KeyboardActionScope, Unit> r5, Function1<? super KeyboardActionScope, Unit> r6) {
        this.onDone = r1;
        this.onGo = r2;
        this.onNext = r3;
        this.onPrevious = r4;
        this.onSearch = r5;
        this.onSend = r6;
    }

    public static final /* synthetic */ KeyboardActions access$getDefault$cp() {
        return Default;
    }

    public /* synthetic */ KeyboardActions(Function1 r2, Function1 r3, Function1 r4, Function1 r5, Function1 r6, Function1 r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L20;
        Function1 r10 = null;
    L21:
        Function1 r11 = r6;
        Function1 r12 = r5;
        Function1 r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L20:
        r10 = r7;
        goto L21
    }

    public final Function1<KeyboardActionScope, Unit> getOnDone() {
        return this.onDone;
    }

    public final Function1<KeyboardActionScope, Unit> getOnGo() {
        return this.onGo;
    }

    public final Function1<KeyboardActionScope, Unit> getOnNext() {
        return this.onNext;
    }

    public final Function1<KeyboardActionScope, Unit> getOnPrevious() {
        return this.onPrevious;
    }

    public final Function1<KeyboardActionScope, Unit> getOnSearch() {
        return this.onSearch;
    }

    public final Function1<KeyboardActionScope, Unit> getOnSend() {
        return this.onSend;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof KeyboardActions) == true) goto L9;
        return false;
    L9:
        if (this.onDone != ((KeyboardActions) other).onDone) goto L22;
        if (this.onGo != ((KeyboardActions) other).onGo) goto L22;
        if (this.onNext != ((KeyboardActions) other).onNext) goto L22;
        if (this.onPrevious != ((KeyboardActions) other).onPrevious) goto L22;
        if (this.onSearch != ((KeyboardActions) other).onSearch) goto L22;
        if (this.onSend != ((KeyboardActions) other).onSend) goto L22;
        return true;
    L22:
        return false;
    }

    public int hashCode() {
        Function1<KeyboardActionScope, Unit> r0 = this.onDone;
        int r1 = 0;
        if (r0 == null) goto L5;
        int result = r0.hashCode();
    L6:
        int r2 = result * 31;
        Function1<KeyboardActionScope, Unit> r3 = this.onGo;
        if (r3 == null) goto L9;
        int r4 = r3.hashCode();
    L10:
        int result2 = r2 + r4;
        int result3 = result2 * 31;
        Function1<KeyboardActionScope, Unit> r5 = this.onNext;
        if (r5 == null) goto L13;
        int r6 = r5.hashCode();
    L14:
        int result4 = (result3 + r6) * 31;
        Function1<KeyboardActionScope, Unit> r7 = this.onPrevious;
        if (r7 == null) goto L17;
        int r8 = r7.hashCode();
    L18:
        int result5 = (result4 + r8) * 31;
        Function1<KeyboardActionScope, Unit> r9 = this.onSearch;
        if (r9 == null) goto L21;
        int r10 = r9.hashCode();
    L22:
        int result6 = (result5 + r10) * 31;
        Function1<KeyboardActionScope, Unit> r11 = this.onSend;
        if (r11 == null) goto L26;
        r1 = r11.hashCode();
    L26:
        return result6 + r1;
    L21:
        r10 = 0;
        goto L22
    L17:
        r8 = 0;
        goto L18
    L13:
        r6 = 0;
        goto L14
    L9:
        r4 = 0;
        goto L10
    L5:
        result = 0;
        goto L6
    }

    static {
        Companion = new Companion(null);
        Function1 r3 = null;
        Function1 r4 = null;
        Function1 r5 = null;
        Function1 r6 = null;
        Function1 r7 = null;
        Function1 r8 = null;
        Default = new KeyboardActions(r3, r4, r5, r6, r7, r8, 63, null);
    }
}
