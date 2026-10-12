package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Role {
    private static final int Button = 0;
    private static final int Carousel = 0;
    private static final int Checkbox = 0;
    public static final Companion Companion = null;
    private static final int DropdownList = 0;
    private static final int Image = 0;
    private static final int RadioButton = 0;
    private static final int Switch = 0;
    private static final int Tab = 0;
    private static final int ValuePicker = 0;
    private final int value;

    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "()V", "Button", "Landroidx/compose/ui/semantics/Role;", "getButton-o7Vup1c", "()I", "I", "Carousel", "getCarousel-o7Vup1c", "Checkbox", "getCheckbox-o7Vup1c", "DropdownList", "getDropdownList-o7Vup1c", "Image", "getImage-o7Vup1c", "RadioButton", "getRadioButton-o7Vup1c", "Switch", "getSwitch-o7Vup1c", "Tab", "getTab-o7Vup1c", "ValuePicker", "getValuePicker-o7Vup1c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m6181getButtono7Vup1c() {
            return Role.access$getButton$cp();
        }

        /* JADX INFO: renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m6183getCheckboxo7Vup1c() {
            return Role.access$getCheckbox$cp();
        }

        /* JADX INFO: renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m6187getSwitcho7Vup1c() {
            return Role.access$getSwitch$cp();
        }

        /* JADX INFO: renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m6186getRadioButtono7Vup1c() {
            return Role.access$getRadioButton$cp();
        }

        /* JADX INFO: renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m6188getTabo7Vup1c() {
            return Role.access$getTab$cp();
        }

        /* JADX INFO: renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m6185getImageo7Vup1c() {
            return Role.access$getImage$cp();
        }

        /* JADX INFO: renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m6184getDropdownListo7Vup1c() {
            return Role.access$getDropdownList$cp();
        }

        /* JADX INFO: renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m6189getValuePickero7Vup1c() {
            return Role.access$getValuePicker$cp();
        }

        /* JADX INFO: renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m6182getCarouselo7Vup1c() {
            return Role.access$getCarousel$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m6174boximpl(int r1) {
        return new Role(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m6175constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6176equalsimpl(int r2, Object r3) {
        if ((r3 instanceof Role) == true) goto L6;
        return false;
    L6:
        if (r2 == ((Role) r3).m6180unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6177equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6178hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m6176equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m6178hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6180unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getButton$cp() {
        return Button;
    }

    public static final /* synthetic */ int access$getCarousel$cp() {
        return Carousel;
    }

    public static final /* synthetic */ int access$getCheckbox$cp() {
        return Checkbox;
    }

    public static final /* synthetic */ int access$getDropdownList$cp() {
        return DropdownList;
    }

    public static final /* synthetic */ int access$getImage$cp() {
        return Image;
    }

    public static final /* synthetic */ int access$getRadioButton$cp() {
        return RadioButton;
    }

    public static final /* synthetic */ int access$getSwitch$cp() {
        return Switch;
    }

    public static final /* synthetic */ int access$getTab$cp() {
        return Tab;
    }

    public static final /* synthetic */ int access$getValuePicker$cp() {
        return ValuePicker;
    }

    private /* synthetic */ Role(int value) {
        this.value = value;
    }

    static {
        Companion = new Companion(null);
        Button = m6175constructorimpl(0);
        Checkbox = m6175constructorimpl(1);
        Switch = m6175constructorimpl(2);
        RadioButton = m6175constructorimpl(3);
        Tab = m6175constructorimpl(4);
        Image = m6175constructorimpl(5);
        DropdownList = m6175constructorimpl(6);
        ValuePicker = m6175constructorimpl(7);
        Carousel = m6175constructorimpl(8);
    }

    public String toString() {
        return m6179toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6179toStringimpl(int arg0) {
        if (m6177equalsimpl0(arg0, Button) == false) goto L6;
        return "Button";
    L6:
        if (m6177equalsimpl0(arg0, Checkbox) == false) goto L9;
        return "Checkbox";
    L9:
        if (m6177equalsimpl0(arg0, Switch) == false) goto L12;
        return "Switch";
    L12:
        if (m6177equalsimpl0(arg0, RadioButton) == false) goto L15;
        return "RadioButton";
    L15:
        if (m6177equalsimpl0(arg0, Tab) == false) goto L18;
        return "Tab";
    L18:
        if (m6177equalsimpl0(arg0, Image) == false) goto L21;
        return "Image";
    L21:
        if (m6177equalsimpl0(arg0, DropdownList) == false) goto L24;
        return "DropdownList";
    L24:
        if (m6177equalsimpl0(arg0, ValuePicker) == false) goto L27;
        return "Picker";
    L27:
        if (m6177equalsimpl0(arg0, Carousel) == false) goto L29;
        return "Carousel";
    L29:
        return "Unknown";
    }
}
