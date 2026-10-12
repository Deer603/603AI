package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: FocusState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "(Ljava/lang/String;I)V", "hasFocus", "", "getHasFocus", "()Z", "isCaptured", "isFocused", "Active", "ActiveParent", "Captured", "Inactive", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum FocusStateImpl extends Enum<FocusStateImpl> implements FocusState {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ FocusStateImpl[] $VALUES = null;
    public static final FocusStateImpl Active = null;
    public static final FocusStateImpl ActiveParent = null;
    public static final FocusStateImpl Captured = null;
    public static final FocusStateImpl Inactive = null;

    /* JADX INFO: compiled from: FocusState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[FocusStateImpl.values().length];
            r0[FocusStateImpl.Captured.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[FocusStateImpl.Active.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[FocusStateImpl.ActiveParent.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[FocusStateImpl.Inactive.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    private static final /* synthetic */ FocusStateImpl[] $values() {
        return new FocusStateImpl[]{Active, ActiveParent, Captured, Inactive};
    }

    public static EnumEntries<FocusStateImpl> getEntries() {
        return $ENTRIES;
    }

    public static FocusStateImpl valueOf(String r1) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, r1);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    private FocusStateImpl(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Active = new FocusStateImpl("Active", 0);
        ActiveParent = new FocusStateImpl("ActiveParent", 1);
        Captured = new FocusStateImpl("Captured", 2);
        Inactive = new FocusStateImpl("Inactive", 3);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        switch(WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1: goto L7;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return false;
    L7:
        return true;
    L5:
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        switch(WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1: goto L7;
            case 2: goto L7;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return false;
    L7:
        return true;
    L5:
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        switch(WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            case 3: goto L6;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return false;
    L7:
        return true;
    L5:
        throw new NoWhenBranchMatchedException();
    }
}
