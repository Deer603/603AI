package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u000b\u001a\r\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0002\u0010%\u001a\u0014\u0010&\u001a\u00020'*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0014\u0010*\u001a\u00020'*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)\u001a\u001c\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010-\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004\"\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\"\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0004\"\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004\"\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0004\"\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0004\"\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0004\"\u0015\u0010\u001a\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0004\"\u0015\u0010\u001c\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0004\"\u0015\u0010\u001e\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0004\"\u0015\u0010 \u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u0004\"\u0015\u0010\"\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u0004*\f\b\u0000\u00100\"\u00020'2\u00020'*\f\b\u0000\u00101\"\u00020'2\u00020'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"areAnyPressed", "", "Landroidx/compose/ui/input/pointer/PointerButtons;", "getAreAnyPressed-aHzCx-E", "(I)Z", "isAltGraphPressed", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "isAltGraphPressed-5xRPYO0", "isAltPressed", "isAltPressed-5xRPYO0", "isBackPressed", "isBackPressed-aHzCx-E", "isCapsLockOn", "isCapsLockOn-5xRPYO0", "isCtrlPressed", "isCtrlPressed-5xRPYO0", "isForwardPressed", "isForwardPressed-aHzCx-E", "isFunctionPressed", "isFunctionPressed-5xRPYO0", "isMetaPressed", "isMetaPressed-5xRPYO0", "isNumLockOn", "isNumLockOn-5xRPYO0", "isPrimaryPressed", "isPrimaryPressed-aHzCx-E", "isScrollLockOn", "isScrollLockOn-5xRPYO0", "isSecondaryPressed", "isSecondaryPressed-aHzCx-E", "isShiftPressed", "isShiftPressed-5xRPYO0", "isSymPressed", "isSymPressed-5xRPYO0", "isTertiaryPressed", "isTertiaryPressed-aHzCx-E", "EmptyPointerKeyboardModifiers", "()I", "indexOfFirstPressed", "", "indexOfFirstPressed-aHzCx-E", "(I)I", "indexOfLastPressed", "indexOfLastPressed-aHzCx-E", "isPressed", "buttonIndex", "isPressed-bNIWhpI", "(II)Z", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m5651constructorimpl(0);
    }

    /* JADX INFO: renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5562isPrimaryPressedaHzCxE(int $this$isPrimaryPressed) {
        if (($this$isPrimaryPressed & 33) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5564isSecondaryPressedaHzCxE(int $this$isSecondaryPressed) {
        if (($this$isSecondaryPressed & 66) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5567isTertiaryPressedaHzCxE(int $this$isTertiaryPressed) {
        if (($this$isTertiaryPressed & 4) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5554isBackPressedaHzCxE(int $this$isBackPressed) {
        if (($this$isBackPressed & 8) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5557isForwardPressedaHzCxE(int $this$isForwardPressed) {
        if (($this$isForwardPressed & 16) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m5561isPressedbNIWhpI(int $this$isPressed_u2dbNIWhpI, int buttonIndex) {
        switch(buttonIndex) {
            case 0: goto L12;
            case 1: goto L17;
            case 2: goto L8;
            case 3: goto L8;
            case 4: goto L8;
            default: goto L5;
        };
    L5:
        if (((1 << (buttonIndex + 2)) & $this$isPressed_u2dbNIWhpI) != 0) goto L14;
        return false;
    L14:
        return true;
    L8:
        if (((1 << buttonIndex) & $this$isPressed_u2dbNIWhpI) != 0) goto L16;
        return false;
    L16:
        return true;
    L17:
        return m5564isSecondaryPressedaHzCxE($this$isPressed_u2dbNIWhpI);
    L12:
        return m5562isPrimaryPressedaHzCxE($this$isPressed_u2dbNIWhpI);
    }

    /* JADX INFO: renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5549getAreAnyPressedaHzCxE(int $this$areAnyPressed) {
        if ($this$areAnyPressed == 0) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m5550indexOfFirstPressedaHzCxE(int $this$indexOfFirstPressed_u2daHzCx_u2dE) {
        if ($this$indexOfFirstPressed_u2daHzCx_u2dE != 0) goto L5;
        return -1;
    L5:
        int index = 0;
        int shifted = (($this$indexOfFirstPressed_u2daHzCx_u2dE & 96) >>> 5) | ($this$indexOfFirstPressed_u2daHzCx_u2dE & (-97));
    L7:
        if ((shifted & 1) != 0) goto L9;
        index = index + 1;
        shifted = shifted >>> 1;
        goto L7
    L9:
        return index;
    }

    /* JADX INFO: renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m5551indexOfLastPressedaHzCxE(int $this$indexOfLastPressed_u2daHzCx_u2dE) {
        int shifted = (($this$indexOfLastPressed_u2daHzCx_u2dE & 96) >>> 5) | ($this$indexOfLastPressed_u2daHzCx_u2dE & (-97));
        int index = -1;
    L3:
        if (shifted == 0) goto L5;
        index = index + 1;
        shifted = shifted >>> 1;
        goto L3
    L5:
        return index;
    }

    /* JADX INFO: renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5556isCtrlPressed5xRPYO0(int $this$isCtrlPressed) {
        if (($this$isCtrlPressed & 4096) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5559isMetaPressed5xRPYO0(int $this$isMetaPressed) {
        if ((65536 & $this$isMetaPressed) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5553isAltPressed5xRPYO0(int $this$isAltPressed) {
        if (($this$isAltPressed & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5552isAltGraphPressed5xRPYO0(int $this$isAltGraphPressed) {
        return false;
    }

    /* JADX INFO: renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5566isSymPressed5xRPYO0(int $this$isSymPressed) {
        if (($this$isSymPressed & 4) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5565isShiftPressed5xRPYO0(int $this$isShiftPressed) {
        if (($this$isShiftPressed & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5558isFunctionPressed5xRPYO0(int $this$isFunctionPressed) {
        if (($this$isFunctionPressed & 8) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5555isCapsLockOn5xRPYO0(int $this$isCapsLockOn) {
        if ((1048576 & $this$isCapsLockOn) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5563isScrollLockOn5xRPYO0(int $this$isScrollLockOn) {
        if ((4194304 & $this$isScrollLockOn) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5560isNumLockOn5xRPYO0(int $this$isNumLockOn) {
        if ((2097152 & $this$isNumLockOn) == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
