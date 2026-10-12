package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "order", "getOrder", "titleResource", "getTitleResource", "Copy", "Paste", "Cut", "SelectAll", "Autofill", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum MenuItemOption extends Enum<MenuItemOption> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ MenuItemOption[] $VALUES = null;
    public static final MenuItemOption Autofill = null;
    public static final MenuItemOption Copy = null;
    public static final MenuItemOption Cut = null;
    public static final MenuItemOption Paste = null;
    public static final MenuItemOption SelectAll = null;
    private final int id;
    private final int order;

    /* JADX INFO: compiled from: TextActionModeCallback.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[MenuItemOption.values().length];
            r0[MenuItemOption.Copy.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L20:
            r0[MenuItemOption.Paste.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L24:
            r0[MenuItemOption.Cut.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L28:
            r0[MenuItemOption.SelectAll.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L22:
            r0[MenuItemOption.Autofill.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$0 = r0;
        }
    }

    private static final /* synthetic */ MenuItemOption[] $values() {
        return new MenuItemOption[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    public static EnumEntries<MenuItemOption> getEntries() {
        return $ENTRIES;
    }

    public static MenuItemOption valueOf(String r1) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, r1);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) $VALUES.clone();
    }

    private MenuItemOption(String $enum$name, int $enum$ordinal, int id) {
        super($enum$name, $enum$ordinal);
        this.id = id;
        this.order = this.id;
    }

    public final int getId() {
        return this.id;
    }

    static {
        Copy = new MenuItemOption("Copy", 0, 0);
        Paste = new MenuItemOption("Paste", 1, 1);
        Cut = new MenuItemOption("Cut", 2, 2);
        SelectAll = new MenuItemOption("SelectAll", 3, 3);
        Autofill = new MenuItemOption("Autofill", 4, 4);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }

    public final int getTitleResource() {
        switch(WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L7;
            default: goto L5;
        };
    L10:
        return R.string.selectAll;
    L11:
        return R.string.cut;
    L12:
        return R.string.paste;
    L13:
        return R.string.copy;
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        if (Build.VERSION.SDK_INT <= 26) goto L15;
        return R.string.autofill;
    L15:
        return androidx.compose.ui.R.string.autofill;
    }

    public final int getOrder() {
        return this.order;
    }
}
