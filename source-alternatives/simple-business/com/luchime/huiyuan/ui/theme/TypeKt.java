package com.luchime.huiyuan.ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Type.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Typography", "Landroidx/compose/material3/Typography;", "getTypography", "()Landroidx/compose/material3/Typography;", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TypeKt {
    private static final Typography Typography = null;

    static {
        SystemFontFamily r1 = FontFamily.Companion.getDefault();
        FontWeight r8 = FontWeight.Companion.getMedium();
        long r6 = TextUnitKt.getSp(16);
        long r25 = TextUnitKt.getSp(23);
        SystemFontFamily r11 = r1;
        Typography = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(0, r6, r8, null, null, r11, null, TextUnitKt.getSp(0), null, null, null, 0, null, null, null, 0, 0, r25, null, null, null, 0, 0, null, 16645977, null), null, null, null, null, null, 32255, null);
    }

    public static final Typography getTypography() {
        return Typography;
    }
}
