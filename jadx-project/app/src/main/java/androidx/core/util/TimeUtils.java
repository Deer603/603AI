package androidx.core.util;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr;
    private static final Object sFormatSync = null;

    static {
        sFormatSync = new Object();
        sFormatStr = new char[24];
    }

    private static int accumField(int amt, int suffix, boolean always, int zeropad) {
        if (amt > 99) goto L24;
        if (always == false) goto L9;
        if (zeropad >= 3) goto L24;
    L9:
        if (amt > 9) goto L22;
        if (always == true) goto L12;
    L14:
        if (always == true) goto L20;
        if (amt > 0) goto L20;
        return 0;
    L20:
        return suffix + 1;
    L12:
        if (zeropad < 2) goto L14;
    L22:
        return suffix + 2;
    L24:
        return suffix + 3;
    }

    private static int printField(char[] formatStr, int amt, char suffix, int pos, boolean always, int zeropad) {
        if (always == true) goto L5;
        if (amt > 0) goto L5;
        return pos;
    L5:
        if (always == false) goto L9;
        if (zeropad < 3) goto L9;
    L10:
        int dig = amt / 100;
        formatStr[pos] = (char) (dig + 48);
        pos = pos + 1;
        amt = amt - (dig * 100);
    L11:
        if (always == false) goto L15;
        if (zeropad < 2) goto L15;
    L17:
        int dig2 = amt / 10;
        formatStr[pos] = (char) (dig2 + 48);
        pos = pos + 1;
        amt = amt - (dig2 * 10);
    L18:
        formatStr[pos] = (char) (amt + 48);
        int pos2 = pos + 1;
        formatStr[pos2] = suffix;
        return pos2 + 1;
    L15:
        if (amt > 9) goto L17;
        if (pos == pos) goto L18;
    L9:
        if (amt <= 99) goto L11;
        goto L10
    }

    private static int formatDurationLocked(long duration, int fieldLen) {
        long duration2 = duration;
        if (sFormatStr.length >= fieldLen) goto L5;
        sFormatStr = new char[fieldLen];
    L5:
        char[] formatStr = sFormatStr;
        if (duration2 != 0) goto L13;
        int fieldLen2 = fieldLen - 1;
    L8:
        if (0 >= fieldLen2) goto L10;
        formatStr[0] = ' ';
        goto L8
    L10:
        formatStr[0] = '0';
        return 0 + 1;
    L13:
        if (duration2 <= 0) goto L15;
        char prefix = '+';
    L16:
        int millis = (int) (duration2 % 1000);
        int seconds = (int) Math.floor(duration2 / 1000);
        int days = 0;
        if (seconds <= SECONDS_PER_DAY) goto L20;
        days = seconds / SECONDS_PER_DAY;
        seconds = seconds - (SECONDS_PER_DAY * days);
    L20:
        if (seconds <= SECONDS_PER_HOUR) goto L22;
        int hours = seconds / SECONDS_PER_HOUR;
        seconds = seconds - (hours * SECONDS_PER_HOUR);
        int hours2 = hours;
    L24:
        if (seconds <= 60) goto L26;
        int minutes = seconds / 60;
        int seconds2 = seconds - (minutes * 60);
        int minutes2 = minutes;
    L27:
        int pos = 0;
        if (fieldLen == 0) goto L48;
        int myLen = accumField(days, 1, false, 0);
        if (myLen <= 0) goto L32;
        boolean r7 = true;
    L33:
        int myLen2 = myLen + accumField(hours2, 1, r7, 2);
        if (myLen2 <= 0) goto L36;
        boolean r8 = true;
    L37:
        int myLen3 = myLen2 + accumField(minutes2, 1, r8, 2);
        if (myLen3 <= 0) goto L40;
        boolean r9 = true;
    L41:
        int myLen4 = myLen3 + accumField(seconds2, 1, r9, 2);
        if (myLen4 <= 0) goto L44;
        int r10 = 3;
    L45:
        int myLen5 = myLen4 + (accumField(millis, 2, true, r10) + 1);
    L46:
        if (myLen5 >= fieldLen) goto L48;
        formatStr[pos] = ' ';
        pos = pos + 1;
        myLen5 = myLen5 + 1;
        goto L46
    L44:
        r10 = 0;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r8 = false;
        goto L37
    L32:
        r7 = false;
    L48:
        formatStr[pos] = prefix;
        int pos2 = pos + 1;
        if (fieldLen == 0) goto L51;
        boolean zeropad = true;
    L52:
        int start = days;
        int pos3 = printField(formatStr, start, 'd', pos2, false, 0);
        if (pos3 == pos2) goto L55;
        boolean r11 = true;
    L56:
        if (zeropad == false) goto L58;
        int r12 = 2;
    L59:
        int pos4 = printField(formatStr, hours2, 'h', pos3, r11, r12);
        if (pos4 == pos2) goto L62;
        boolean r13 = true;
    L63:
        if (zeropad == false) goto L65;
        int r14 = 2;
    L66:
        int pos5 = printField(formatStr, minutes2, 'm', pos4, r13, r14);
        if (pos5 == pos2) goto L69;
        boolean r15 = true;
    L70:
        if (zeropad == false) goto L72;
        int r16 = 2;
    L73:
        int pos6 = printField(formatStr, seconds2, 's', pos5, r15, r16);
        if (zeropad == false) goto L77;
        if (pos6 == pos2) goto L77;
        int r17 = 3;
    L78:
        int pos7 = printField(formatStr, millis, 'm', pos6, true, r17);
        formatStr[pos7] = 's';
        return pos7 + 1;
    L77:
        r17 = 0;
        goto L78
    L72:
        r16 = 0;
        goto L73
    L69:
        r15 = false;
        goto L70
    L65:
        r14 = 0;
        goto L66
    L62:
        r13 = false;
        goto L63
    L58:
        r12 = 0;
        goto L59
    L55:
        r11 = false;
        goto L56
    L51:
        zeropad = false;
        goto L52
    L26:
        seconds2 = seconds;
        minutes2 = 0;
        goto L27
    L22:
        hours2 = 0;
        goto L24
    L15:
        prefix = '-';
        duration2 = -duration2;
        goto L16
    }

    public static void formatDuration(long duration, StringBuilder builder) {
        Object r0 = sFormatSync;
        monitor-enter(r0);
        int len = formatDurationLocked(duration, 0);     // Catch: Throwable -> L8
        builder.append(sFormatStr, 0, len);     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public static void formatDuration(long duration, PrintWriter pw, int fieldLen) {
        Object r0 = sFormatSync;
        monitor-enter(r0);
        int len = formatDurationLocked(duration, fieldLen);     // Catch: Throwable -> L7
        pw.print(new String(sFormatStr, 0, len));     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static void formatDuration(long duration, PrintWriter pw) {
        formatDuration(duration, pw, 0);
    }

    public static void formatDuration(long time, long now, PrintWriter pw) {
        if (time != 0) goto L6;
        pw.print("--");
        return;
    L6:
        formatDuration(time - now, pw, 0);
    }

    private TimeUtils() {
    }
}
