package com.luchime.huiyuan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: StreamingTextPolicy.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/luchime/huiyuan/StreamingTextPolicy;", "", "<init>", "()V", "punctuation", "", "", "CHARACTER_DELAY_MS", "", "PUNCTUATION_DELAY_MS", "TICK_EVERY_UNITS", "", "units", "", "", "text", "shouldTick", "", "unitIndex", "unit", "delayAfter", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreamingTextPolicy {
    public static final int $stable = 0;
    public static final long CHARACTER_DELAY_MS = 16;
    public static final StreamingTextPolicy INSTANCE = null;
    public static final long PUNCTUATION_DELAY_MS = 34;
    public static final int TICK_EVERY_UNITS = 4;
    private static final Set<Character> punctuation = null;

    private StreamingTextPolicy() {
    }

    static {
        INSTANCE = new StreamingTextPolicy();
        punctuation = SetsKt.setOf(new Character[]{(char) 65292, (char) 12290, (char) 65281, (char) 65311, (char) 65307, (char) 65306, ',', '.', '!', '?', ';', ':', '\n'});
        $stable = 8;
    }

    public final List<String> units(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        ArrayList result = new ArrayList(text.length());
        int index = 0;
    L11:
        if (index >= text.length()) goto L14;
        int codePoint = text.codePointAt(index);
        char[] r4 = Character.toChars(codePoint);
        Intrinsics.checkNotNullExpressionValue(r4, "toChars(...)");
        result.add(new String(r4));
        index = index + Character.charCount(codePoint);
        goto L11
    L14:
        return result;
    L8:
        return CollectionsKt.emptyList();
    L5:
        r0 = false;
        goto L6
    }

    public final boolean shouldTick(int unitIndex, String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (StringsKt.isBlank(unit) == false) goto L5;
        return false;
    L5:
        if (unitIndex != 0) goto L7;
    L10:
        return true;
    L7:
        if (((unitIndex + 1) % 4) == 0) goto L10;
        if (punctuation.contains(Character.valueOf(StringsKt.first(unit))) == true) goto L10;
        return false;
    }

    public final long delayAfter(String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (CollectionsKt.contains(punctuation, StringsKt.firstOrNull(unit)) == false) goto L5;
        return 34;
    L5:
        return 16;
    }
}
