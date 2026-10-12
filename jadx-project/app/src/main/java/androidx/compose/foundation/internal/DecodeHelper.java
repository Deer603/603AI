package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: ClipboardUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0015\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0013\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\"J\n\u0010#\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0013\u0010(\u001a\u00020)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u0012J\u0015\u0010+\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/internal/DecodeHelper;", "", "string", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "dataAvailable", "", "decodeBaselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeByte", "", "decodeColor", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeFloat", "", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "decodeInt", "decodeShadow", "Landroidx/compose/ui/graphics/Shadow;", "decodeSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "decodeString", "decodeTextDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextUnit", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeULong", "Lkotlin/ULong;", "decodeULong-s-VKNKU", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DecodeHelper {
    public static final int $stable = 0;
    private final Parcel parcel;

    static {
        $stable = 8;
    }

    public DecodeHelper(String string) {
        this.parcel = Parcel.obtain();
        byte[] bytes = Base64.decode(string, 0);
        this.parcel.unmarshall(bytes, 0, bytes.length);
        this.parcel.setDataPosition(0);
    }

    public final SpanStyle decodeSpanStyle() {
        long r1 = 0;
        long r3 = 0;
        FontWeight r5 = null;
        FontStyle r6 = null;
        FontSynthesis r7 = null;
        FontFamily r8 = null;
        String r9 = null;
        long r10 = 0;
        BaselineShift r12 = null;
        TextGeometricTransform r13 = null;
        LocaleList r14 = null;
        long r15 = 0;
        TextDecoration r17 = null;
        Shadow r18 = null;
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, 16383, null);
    L4:
        if (this.parcel.dataAvail() <= 1) goto L72;
        byte r2 = decodeByte();
        if (r2 == 1) goto L8;
        if (r2 == 2) goto L14;
        if (r2 == 3) goto L20;
        if (r2 == 4) goto L25;
        if (r2 == 5) goto L30;
        if (r2 == 6) goto L35;
        if (r2 == 7) goto L39;
        if (r2 == 8) goto L44;
        if (r2 == 9) goto L50;
        if (r2 == 10) goto L56;
        if (r2 == 11) goto L62;
        if (r2 != 12) goto L4;
        if (dataAvailable() < 20) goto L72;
        mutableSpanStyle.setShadow(decodeShadow());
        goto L4
    L62:
        if (dataAvailable() < 4) goto L72;
        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
        goto L4
    L56:
        if (dataAvailable() < 8) goto L72;
        mutableSpanStyle.m567setBackground8_81llA(m550decodeColor0d7_KjU());
        goto L4
    L50:
        if (dataAvailable() < 8) goto L72;
        mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
        goto L4
    L44:
        if (dataAvailable() < 4) goto L72;
        mutableSpanStyle.m568setBaselineShift_isdbwI(BaselineShift.m6707boximpl(m548decodeBaselineShifty9eOQZs()));
        goto L4
    L39:
        if (dataAvailable() < 5) goto L72;
        mutableSpanStyle.m573setLetterSpacingR2X_6o(m553decodeTextUnitXSAIIZE());
        goto L4
    L35:
        mutableSpanStyle.setFontFeatureSettings(decodeString());
        goto L4
    L30:
        if (dataAvailable() < 1) goto L72;
        mutableSpanStyle.m572setFontSynthesistDdu0R4(FontSynthesis.m6536boximpl(m552decodeFontSynthesisGVVA2EU()));
        goto L4
    L25:
        if (dataAvailable() < 1) goto L72;
        mutableSpanStyle.m571setFontStylemLjRB2g(FontStyle.m6525boximpl(m551decodeFontStyle_LCdwA()));
        goto L4
    L20:
        if (dataAvailable() < 4) goto L72;
        mutableSpanStyle.setFontWeight(decodeFontWeight());
        goto L4
    L14:
        if (dataAvailable() < 5) goto L72;
        mutableSpanStyle.m570setFontSizeR2X_6o(m553decodeTextUnitXSAIIZE());
        goto L4
    L8:
        if (dataAvailable() < 8) goto L72;
        mutableSpanStyle.m569setColor8_81llA(m550decodeColor0d7_KjU());
    L72:
        return mutableSpanStyle.toSpanStyle();
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m550decodeColor0d7_KjU() {
        return Color.m4362constructorimpl(m549decodeULongsVKNKU());
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m553decodeTextUnitXSAIIZE() {
        byte r0 = decodeByte();
        if (r0 != 1) goto L6;
        long type = TextUnitType.Companion.m7200getSpUIouoOA();
    L10:
        if (TextUnitType.m7195equalsimpl0(type, TextUnitType.Companion.m7201getUnspecifiedUIouoOA()) == true) goto L12;
        float value = decodeFloat();
        return TextUnitKt.m7179TextUnitanM5pPY(value, type);
    L12:
        return TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L6:
        if (r0 != 2) goto L8;
        type = TextUnitType.Companion.m7199getEmUIouoOA();
        goto L10
    L8:
        type = TextUnitType.Companion.m7201getUnspecifiedUIouoOA();
        goto L10
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m551decodeFontStyle_LCdwA() {
        byte r0 = decodeByte();
        if (r0 != 0) goto L6;
        return FontStyle.Companion.m6535getNormal_LCdwA();
    L6:
        if (r0 != 1) goto L9;
        return FontStyle.Companion.m6534getItalic_LCdwA();
    L9:
        return FontStyle.Companion.m6535getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m552decodeFontSynthesisGVVA2EU() {
        byte r0 = decodeByte();
        if (r0 != 0) goto L6;
        return FontSynthesis.Companion.m6546getNoneGVVA2EU();
    L6:
        if (r0 != 1) goto L9;
        return FontSynthesis.Companion.m6545getAllGVVA2EU();
    L9:
        if (r0 != 3) goto L12;
        return FontSynthesis.Companion.m6547getStyleGVVA2EU();
    L12:
        if (r0 != 2) goto L15;
        return FontSynthesis.Companion.m6548getWeightGVVA2EU();
    L15:
        return FontSynthesis.Companion.m6546getNoneGVVA2EU();
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m548decodeBaselineShifty9eOQZs() {
        return BaselineShift.m6708constructorimpl(decodeFloat());
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    private final TextDecoration decodeTextDecoration() {
        int mask = decodeInt();
        if ((TextDecoration.Companion.getLineThrough().getMask() & mask) == 0) goto L5;
        boolean hasLineThrough = true;
    L7:
        if ((TextDecoration.Companion.getUnderline().getMask() & mask) == 0) goto L9;
        boolean hasUnderline = true;
    L10:
        if (hasLineThrough == false) goto L13;
        if (hasUnderline == false) goto L13;
        return TextDecoration.Companion.combine(CollectionsKt.listOf(new TextDecoration[]{TextDecoration.Companion.getLineThrough(), TextDecoration.Companion.getUnderline()}));
    L13:
        if (hasLineThrough == true) goto L20;
        if (hasUnderline == false) goto L18;
        return TextDecoration.Companion.getUnderline();
    L18:
        return TextDecoration.Companion.getNone();
    L20:
        return TextDecoration.Companion.getLineThrough();
    L9:
        hasUnderline = false;
        goto L10
    L5:
        hasLineThrough = false;
        goto L7
    }

    private final Shadow decodeShadow() {
        long r1 = m550decodeColor0d7_KjU();
        float x$iv = decodeFloat();
        float y$iv = decodeFloat();
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return new Shadow(r1, Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)), decodeFloat(), null);
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m549decodeULongsVKNKU() {
        return ULong.m7599constructorimpl(this.parcel.readLong());
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }
}
