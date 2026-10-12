package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", "float", "", "int", "", "string", "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EncodeHelper {
    public static final int $stable = 0;
    private Parcel parcel;

    static {
        $stable = 8;
    }

    public EncodeHelper() {
        this.parcel = Parcel.obtain();
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final String encodedString() {
        byte[] bytes = this.parcel.marshall();
        return Base64.encodeToString(bytes, 0);
    }

    public final void encode(SpanStyle spanStyle) {
        if (Color.m4367equalsimpl0(spanStyle.m6358getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == true) goto L6;
        encode((byte) 1);
        m6120encode8_81llA(spanStyle.m6358getColor0d7_KjU());
    L6:
        if (TextUnit.m7164equalsimpl0(spanStyle.m6359getFontSizeXSAIIZE(), TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == true) goto L8;
        encode((byte) 2);
        m6117encodeR2X_6o(spanStyle.m6359getFontSizeXSAIIZE());
    L8:
        FontWeight it = spanStyle.getFontWeight();
        if (it == null) goto L11;
        encode((byte) 3);
        encode(it);
    L11:
        FontStyle r0 = spanStyle.m6360getFontStyle4Lr2A7w();
        if (r0 == null) goto L14;
        int it2 = r0.m6531unboximpl();
        encode((byte) 4);
        m6122encodenzbMABs(it2);
    L14:
        FontSynthesis r1 = spanStyle.m6361getFontSynthesisZQGJjVo();
        if (r1 == null) goto L17;
        int it3 = r1.m6544unboximpl();
        encode((byte) 5);
        m6119encode6p3vJLY(it3);
    L17:
        String it4 = spanStyle.getFontFeatureSettings();
        if (it4 == null) goto L21;
        encode((byte) 6);
        encode(it4);
    L21:
        if (TextUnit.m7164equalsimpl0(spanStyle.m6362getLetterSpacingXSAIIZE(), TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == true) goto L23;
        encode((byte) 7);
        m6117encodeR2X_6o(spanStyle.m6362getLetterSpacingXSAIIZE());
    L23:
        BaselineShift r2 = spanStyle.m6357getBaselineShift5SSeXJ0();
        if (r2 == null) goto L26;
        float it5 = r2.m6713unboximpl();
        encode((byte) 8);
        m6118encode4Dl_Bck(it5);
    L26:
        TextGeometricTransform it6 = spanStyle.getTextGeometricTransform();
        if (it6 == null) goto L30;
        encode((byte) 9);
        encode(it6);
    L30:
        if (Color.m4367equalsimpl0(spanStyle.m6356getBackground0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == true) goto L32;
        encode((byte) 10);
        m6120encode8_81llA(spanStyle.m6356getBackground0d7_KjU());
    L32:
        TextDecoration it7 = spanStyle.getTextDecoration();
        if (it7 == null) goto L35;
        encode((byte) 11);
        encode(it7);
    L35:
        Shadow it8 = spanStyle.getShadow();
        if (it8 == null) goto L39;
        encode((byte) 12);
        encode(it8);
        return;
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m6120encode8_81llA(long color) {
        m6121encodeVKZWuLQ(color);
    }

    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m6117encodeR2X_6o(long textUnit) {
        long r0 = TextUnit.m7166getTypeUIouoOA(textUnit);
        byte typeCode = 0;
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7201getUnspecifiedUIouoOA()) == false) goto L6;
    L12:
        encode(typeCode);
        if (TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(textUnit), TextUnitType.Companion.m7201getUnspecifiedUIouoOA()) == true) goto L16;
        encode(TextUnit.m7167getValueimpl(textUnit));
        return;
    L16:
        return;
    L6:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L9;
        typeCode = 1;
        goto L12
    L9:
        if (TextUnitType.m7195equalsimpl0(r0, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L12;
        typeCode = 2;
        goto L12
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m6122encodenzbMABs(int fontStyle) {
        byte r1 = 0;
        if (FontStyle.m6528equalsimpl0(fontStyle, FontStyle.Companion.m6535getNormal_LCdwA()) == false) goto L6;
    L9:
        encode(r1);
        return;
    L6:
        if (FontStyle.m6528equalsimpl0(fontStyle, FontStyle.Companion.m6534getItalic_LCdwA()) == false) goto L9;
        r1 = 1;
        goto L9
    }

    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m6119encode6p3vJLY(int fontSynthesis) {
        byte value = 0;
        if (FontSynthesis.m6539equalsimpl0(fontSynthesis, FontSynthesis.Companion.m6546getNoneGVVA2EU()) == false) goto L6;
    L15:
        encode(value);
        return;
    L6:
        if (FontSynthesis.m6539equalsimpl0(fontSynthesis, FontSynthesis.Companion.m6545getAllGVVA2EU()) == false) goto L9;
        value = 1;
        goto L15
    L9:
        if (FontSynthesis.m6539equalsimpl0(fontSynthesis, FontSynthesis.Companion.m6548getWeightGVVA2EU()) == false) goto L12;
        value = 2;
        goto L15
    L12:
        if (FontSynthesis.m6539equalsimpl0(fontSynthesis, FontSynthesis.Companion.m6547getStyleGVVA2EU()) == false) goto L15;
        value = 3;
        goto L15
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m6118encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m6120encode8_81llA(shadow.m4691getColor0d7_KjU());
        long arg0$iv = shadow.m4692getOffsetF1C5BW0();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        encode(Float.intBitsToFloat(bits$iv$iv$iv));
        long arg0$iv2 = shadow.m4692getOffsetF1C5BW0();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        encode(Float.intBitsToFloat(bits$iv$iv$iv2));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte r2) {
        this.parcel.writeByte(r2);
    }

    public final void encode(int r2) {
        this.parcel.writeInt(r2);
    }

    public final void encode(float r2) {
        this.parcel.writeFloat(r2);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m6121encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void encode(String string) {
        this.parcel.writeString(string);
    }
}
