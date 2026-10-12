package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontMatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000fJ4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011JF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0080\b¢\u0006\u0002\b\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "fontList", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "filterByClosestWeight", "preferBelow", "", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontMatcher {
    public static final int $stable = 0;

    static {
    }

    public FontMatcher() {
    }

    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m6524matchFontRetOiIg(List<? extends Font> r27, FontWeight fontWeight, int fontStyle) {
        List target$iv = new ArrayList(r27.size());
        int index$iv$iv = 0;
        int r8 = r27.size();
    L3:
        boolean r9 = false;
        if (index$iv$iv >= r8) goto L13;
        Font r10 = r27.get(index$iv$iv);
        Font it = r10;
        if (Intrinsics.areEqual(it.getWeight(), fontWeight) == true) goto L8;
    L10:
        if (r9 == false) goto L12;
        target$iv.add(r10);
    L12:
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L8:
        if (FontStyle.m6528equalsimpl0(it.mo6481getStyle_LCdwA(), fontStyle) == false) goto L10;
        r9 = true;
        goto L10
    L13:
        List it2 = target$iv;
        if (it2.isEmpty() == true) goto L16;
        return it2;
    L16:
        List target$iv2 = new ArrayList(r27.size());
        int index$iv$iv2 = 0;
        int r11 = r27.size();
    L17:
        if (index$iv$iv2 >= r11) goto L22;
        Font it3 = r27.get(index$iv$iv2);
        if (FontStyle.m6528equalsimpl0(it3.mo6481getStyle_LCdwA(), fontStyle) == false) goto L21;
        target$iv2.add(it3);
    L21:
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L17
    L22:
        List $this$fastFilter$iv = target$iv2;
        if ($this$fastFilter$iv.isEmpty() == false) goto L25;
        $this$fastFilter$iv = r27;
    L25:
        List fontsToSearch = $this$fastFilter$iv;
        if (fontWeight.compareTo2(FontWeight.Companion.getW400()) >= 0) goto L65;
        boolean preferBelow$iv = true;
        FontWeight bestWeightAbove$iv = null;
        FontWeight bestWeightBelow$iv = null;
        int index$iv = 0;
        int r12 = fontsToSearch.size();
    L28:
        if (index$iv >= r12) goto L53;
        Font font$iv = (Font) fontsToSearch.get(index$iv);
        FontWeight possibleWeight$iv = font$iv.getWeight();
        if (0 != 0) goto L32;
    L34:
        if (0 == 0) goto L39;
        if (possibleWeight$iv.compareTo2(null) <= 0) goto L39;
    L50:
        index$iv = index$iv + 1;
    L39:
        if (possibleWeight$iv.compareTo2(fontWeight) >= 0) goto L45;
        if (bestWeightBelow$iv != null) goto L42;
    L43:
        bestWeightBelow$iv = possibleWeight$iv;
        goto L50
    L42:
        if (possibleWeight$iv.compareTo2(bestWeightBelow$iv) <= 0) goto L50;
    L45:
        if (possibleWeight$iv.compareTo2(fontWeight) <= 0) goto L51;
        if (bestWeightAbove$iv != null) goto L48;
    L49:
        bestWeightAbove$iv = possibleWeight$iv;
        goto L50
    L48:
        if (possibleWeight$iv.compareTo2(bestWeightAbove$iv) >= 0) goto L50;
    L51:
        bestWeightAbove$iv = possibleWeight$iv;
        bestWeightBelow$iv = possibleWeight$iv;
        goto L53
    L32:
        if (possibleWeight$iv.compareTo2(null) >= 0) goto L34;
    L53:
        if (bestWeightBelow$iv != null) goto L55;
        FontWeight bestWeight$iv = bestWeightAbove$iv;
    L56:
        List target$iv$iv = new ArrayList(fontsToSearch.size());
        int index$iv$iv$iv = 0;
        int r1 = fontsToSearch.size();
    L57:
        if (index$iv$iv$iv >= r1) goto L63;
        Object item$iv$iv$iv = fontsToSearch.get(index$iv$iv$iv);
        Font it$iv = (Font) item$iv$iv$iv;
        int r21 = r1;
        if (Intrinsics.areEqual(it$iv.getWeight(), bestWeight$iv) == false) goto L62;
        target$iv$iv.add(item$iv$iv$iv);
    L62:
        index$iv$iv$iv = index$iv$iv$iv + 1;
        preferBelow$iv = preferBelow$iv;
        r1 = r21;
        goto L57
    L63:
        List result = target$iv$iv;
        return result;
    L55:
        bestWeight$iv = bestWeightBelow$iv;
        goto L56
    L65:
        if (fontWeight.compareTo2(FontWeight.Companion.getW500()) <= 0) goto L103;
        boolean preferBelow$iv2 = false;
        FontWeight bestWeightAbove$iv2 = null;
        FontWeight bestWeightBelow$iv2 = null;
        int index$iv2 = 0;
        int r13 = fontsToSearch.size();
    L67:
        if (index$iv2 >= r13) goto L92;
        Font font$iv2 = (Font) fontsToSearch.get(index$iv2);
        FontWeight possibleWeight$iv2 = font$iv2.getWeight();
        if (0 != 0) goto L71;
    L73:
        if (0 == 0) goto L78;
        if (possibleWeight$iv2.compareTo2(null) <= 0) goto L78;
    L89:
        index$iv2 = index$iv2 + 1;
    L78:
        if (possibleWeight$iv2.compareTo2(fontWeight) >= 0) goto L84;
        if (bestWeightBelow$iv2 != null) goto L81;
    L82:
        bestWeightBelow$iv2 = possibleWeight$iv2;
        goto L89
    L81:
        if (possibleWeight$iv2.compareTo2(bestWeightBelow$iv2) <= 0) goto L89;
    L84:
        if (possibleWeight$iv2.compareTo2(fontWeight) <= 0) goto L90;
        if (bestWeightAbove$iv2 != null) goto L87;
    L88:
        bestWeightAbove$iv2 = possibleWeight$iv2;
        goto L89
    L87:
        if (possibleWeight$iv2.compareTo2(bestWeightAbove$iv2) >= 0) goto L89;
    L90:
        bestWeightAbove$iv2 = possibleWeight$iv2;
        bestWeightBelow$iv2 = possibleWeight$iv2;
        goto L92
    L71:
        if (possibleWeight$iv2.compareTo2(null) >= 0) goto L73;
    L92:
        if (bestWeightAbove$iv2 != null) goto L94;
        FontWeight bestWeight$iv2 = bestWeightBelow$iv2;
    L95:
        List target$iv$iv2 = new ArrayList(fontsToSearch.size());
        int index$iv$iv$iv2 = 0;
        int r15 = fontsToSearch.size();
    L96:
        if (index$iv$iv$iv2 >= r15) goto L102;
        Object item$iv$iv$iv2 = fontsToSearch.get(index$iv$iv$iv2);
        Font it$iv2 = (Font) item$iv$iv$iv2;
        boolean preferBelow$iv3 = preferBelow$iv2;
        if (Intrinsics.areEqual(it$iv2.getWeight(), bestWeight$iv2) == false) goto L101;
        target$iv$iv2.add(item$iv$iv$iv2);
    L101:
        index$iv$iv$iv2 = index$iv$iv$iv2 + 1;
        fontsToSearch = fontsToSearch;
        preferBelow$iv2 = preferBelow$iv3;
        goto L96
    L102:
        List result2 = target$iv$iv2;
        return result2;
    L94:
        bestWeight$iv2 = bestWeightAbove$iv2;
        goto L95
    L103:
        FontWeight maxSearchRange$iv = FontWeight.Companion.getW500();
        FontMatcher this_$iv = this;
        FontWeight bestWeightAbove$iv3 = null;
        FontWeight bestWeightBelow$iv3 = null;
        int index$iv3 = 0;
        int r14 = fontsToSearch.size();
    L104:
        if (index$iv3 >= r14) goto L129;
        Font font$iv3 = (Font) fontsToSearch.get(index$iv3);
        FontWeight possibleWeight$iv3 = font$iv3.getWeight();
        if (0 != 0) goto L108;
    L110:
        if (maxSearchRange$iv == null) goto L115;
        if (possibleWeight$iv3.compareTo2(maxSearchRange$iv) <= 0) goto L115;
    L126:
        index$iv3 = index$iv3 + 1;
    L115:
        if (possibleWeight$iv3.compareTo2(fontWeight) >= 0) goto L121;
        if (bestWeightBelow$iv3 != null) goto L118;
    L119:
        bestWeightBelow$iv3 = possibleWeight$iv3;
        goto L126
    L118:
        if (possibleWeight$iv3.compareTo2(bestWeightBelow$iv3) <= 0) goto L126;
    L121:
        if (possibleWeight$iv3.compareTo2(fontWeight) <= 0) goto L127;
        if (bestWeightAbove$iv3 != null) goto L124;
    L125:
        bestWeightAbove$iv3 = possibleWeight$iv3;
        goto L126
    L124:
        if (possibleWeight$iv3.compareTo2(bestWeightAbove$iv3) >= 0) goto L126;
    L127:
        bestWeightAbove$iv3 = possibleWeight$iv3;
        bestWeightBelow$iv3 = possibleWeight$iv3;
        goto L129
    L108:
        if (possibleWeight$iv3.compareTo2(null) >= 0) goto L110;
    L129:
        if (bestWeightAbove$iv3 != null) goto L131;
        FontWeight bestWeight$iv3 = bestWeightBelow$iv3;
    L132:
        ArrayList target$iv$iv3 = new ArrayList(fontsToSearch.size());
        int r4 = fontsToSearch.size();
        int index$iv$iv$iv3 = 0;
    L133:
        if (index$iv$iv$iv3 >= r4) goto L139;
        Object item$iv$iv$iv3 = fontsToSearch.get(index$iv$iv$iv3);
        Font it$iv3 = (Font) item$iv$iv$iv3;
        FontWeight maxSearchRange$iv2 = maxSearchRange$iv;
        if (Intrinsics.areEqual(it$iv3.getWeight(), bestWeight$iv3) == false) goto L138;
        target$iv$iv3.add(item$iv$iv$iv3);
    L138:
        index$iv$iv$iv3 = index$iv$iv$iv3 + 1;
        this_$iv = this_$iv;
        maxSearchRange$iv = maxSearchRange$iv2;
        goto L133
    L139:
        ArrayList r2 = target$iv$iv3;
        if (r2.isEmpty() == false) goto L180;
        int r3 = 0;
        FontWeight minSearchRange$iv = FontWeight.Companion.getW500();
        FontWeight bestWeightAbove$iv4 = null;
        FontWeight bestWeightBelow$iv4 = null;
        int index$iv4 = 0;
        int r16 = fontsToSearch.size();
    L142:
        if (index$iv4 >= r16) goto L167;
        Font font$iv4 = (Font) fontsToSearch.get(index$iv4);
        FontWeight possibleWeight$iv4 = font$iv4.getWeight();
        if (minSearchRange$iv != null) goto L146;
    L148:
        if (0 == 0) goto L153;
        if (possibleWeight$iv4.compareTo2(null) <= 0) goto L153;
    L164:
        index$iv4 = index$iv4 + 1;
    L153:
        if (possibleWeight$iv4.compareTo2(fontWeight) >= 0) goto L159;
        if (bestWeightBelow$iv4 != null) goto L156;
    L157:
        bestWeightBelow$iv4 = possibleWeight$iv4;
        goto L164
    L156:
        if (possibleWeight$iv4.compareTo2(bestWeightBelow$iv4) <= 0) goto L164;
    L159:
        if (possibleWeight$iv4.compareTo2(fontWeight) <= 0) goto L165;
        if (bestWeightAbove$iv4 != null) goto L162;
    L163:
        bestWeightAbove$iv4 = possibleWeight$iv4;
        goto L164
    L162:
        if (possibleWeight$iv4.compareTo2(bestWeightAbove$iv4) >= 0) goto L164;
    L165:
        bestWeightAbove$iv4 = possibleWeight$iv4;
        bestWeightBelow$iv4 = possibleWeight$iv4;
        goto L167
    L146:
        if (possibleWeight$iv4.compareTo2(minSearchRange$iv) >= 0) goto L148;
    L167:
        if (bestWeightAbove$iv4 != null) goto L169;
        FontWeight bestWeight$iv4 = bestWeightBelow$iv4;
    L170:
        ArrayList target$iv$iv4 = new ArrayList(fontsToSearch.size());
        int index$iv$iv$iv4 = 0;
        int r0 = fontsToSearch.size();
    L171:
        if (index$iv$iv$iv4 >= r0) goto L177;
        Object item$iv$iv$iv4 = fontsToSearch.get(index$iv$iv$iv4);
        Font it$iv4 = (Font) item$iv$iv$iv4;
        int r23 = r0;
        if (Intrinsics.areEqual(it$iv4.getWeight(), bestWeight$iv4) == false) goto L176;
        target$iv$iv4.add(item$iv$iv$iv4);
    L176:
        index$iv$iv$iv4 = index$iv$iv$iv4 + 1;
        r3 = r3;
        r0 = r23;
        goto L171
    L177:
        r2 = target$iv$iv4;
        goto L180
    L169:
        bestWeight$iv4 = bestWeightAbove$iv4;
    L180:
        return r2;
    L131:
        bestWeight$iv3 = bestWeightAbove$iv3;
        goto L132
    }

    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher $this, List $receiver, FontWeight fontWeight, boolean preferBelow, FontWeight minSearchRange, FontWeight maxSearchRange, int r25, Object r26) {
        if ((r25 & 4) == 0) goto L5;
        FontWeight minSearchRange2 = null;
    L7:
        if ((r25 & 8) == 0) goto L9;
        FontWeight maxSearchRange2 = null;
    L10:
        FontWeight bestWeightAbove = null;
        FontWeight bestWeightBelow = null;
        int index = 0;
        int r8 = $receiver.size();
    L11:
        if (index >= r8) goto L35;
        Font font = (Font) $receiver.get(index);
        FontWeight possibleWeight = font.getWeight();
        if (minSearchRange2 != null) goto L15;
    L17:
        if (maxSearchRange2 == null) goto L22;
        if (possibleWeight.compareTo2(maxSearchRange2) <= 0) goto L22;
    L33:
        index = index + 1;
    L22:
        if (possibleWeight.compareTo2(fontWeight) >= 0) goto L28;
        if (bestWeightBelow != null) goto L25;
    L26:
        bestWeightBelow = possibleWeight;
        goto L33
    L25:
        if (possibleWeight.compareTo2(bestWeightBelow) <= 0) goto L33;
    L28:
        if (possibleWeight.compareTo2(fontWeight) <= 0) goto L34;
        if (bestWeightAbove != null) goto L31;
    L32:
        bestWeightAbove = possibleWeight;
        goto L33
    L31:
        if (possibleWeight.compareTo2(bestWeightAbove) >= 0) goto L33;
    L34:
        bestWeightAbove = possibleWeight;
        bestWeightBelow = possibleWeight;
        goto L35
    L15:
        if (possibleWeight.compareTo2(minSearchRange2) >= 0) goto L17;
    L35:
        if (preferBelow == false) goto L38;
        if (bestWeightBelow == null) goto L40;
    L39:
        FontWeight bestWeight = bestWeightBelow;
    L41:
        ArrayList target$iv = new ArrayList($receiver.size());
        int index$iv$iv = 0;
        int r14 = $receiver.size();
    L42:
        if (index$iv$iv >= r14) goto L49;
        Object item$iv$iv = $receiver.get(index$iv$iv);
        Font it = (Font) item$iv$iv;
        if (Intrinsics.areEqual(it.getWeight(), bestWeight) == false) goto L47;
        target$iv.add(item$iv$iv);
    L47:
        index$iv$iv = index$iv$iv + 1;
        goto L42
    L49:
        return target$iv;
    L40:
        bestWeight = bestWeightAbove;
        goto L41
    L38:
        if (bestWeightAbove != null) goto L40;
    L9:
        maxSearchRange2 = maxSearchRange;
        goto L10
    L5:
        minSearchRange2 = minSearchRange;
        goto L7
    }

    public final List<Font> filterByClosestWeight$ui_text_release(List<? extends Font> r21, FontWeight fontWeight, boolean preferBelow, FontWeight minSearchRange, FontWeight maxSearchRange) {
        FontWeight bestWeightAbove = null;
        FontWeight bestWeightBelow = null;
        int index = 0;
        int r8 = r21.size();
    L3:
        if (index >= r8) goto L27;
        Font font = r21.get(index);
        FontWeight possibleWeight = font.getWeight();
        if (minSearchRange != null) goto L7;
    L9:
        if (maxSearchRange == null) goto L14;
        if (possibleWeight.compareTo2(maxSearchRange) <= 0) goto L14;
    L25:
        index = index + 1;
    L14:
        if (possibleWeight.compareTo2(fontWeight) >= 0) goto L20;
        if (bestWeightBelow != null) goto L17;
    L18:
        bestWeightBelow = possibleWeight;
        goto L25
    L17:
        if (possibleWeight.compareTo2(bestWeightBelow) <= 0) goto L25;
    L20:
        if (possibleWeight.compareTo2(fontWeight) <= 0) goto L26;
        if (bestWeightAbove != null) goto L23;
    L24:
        bestWeightAbove = possibleWeight;
        goto L25
    L23:
        if (possibleWeight.compareTo2(bestWeightAbove) >= 0) goto L25;
    L26:
        bestWeightAbove = possibleWeight;
        bestWeightBelow = possibleWeight;
        goto L27
    L7:
        if (possibleWeight.compareTo2(minSearchRange) >= 0) goto L9;
    L27:
        if (preferBelow == false) goto L30;
        if (bestWeightBelow == null) goto L32;
    L31:
        FontWeight bestWeight = bestWeightBelow;
    L33:
        ArrayList target$iv = new ArrayList(r21.size());
        int index$iv$iv = 0;
        int r14 = r21.size();
    L34:
        if (index$iv$iv >= r14) goto L41;
        Font r15 = r21.get(index$iv$iv);
        Font it = r15;
        if (Intrinsics.areEqual(it.getWeight(), bestWeight) == false) goto L39;
        target$iv.add(r15);
    L39:
        index$iv$iv = index$iv$iv + 1;
        goto L34
    L41:
        return target$iv;
    L32:
        bestWeight = bestWeightAbove;
        goto L33
    L30:
        if (bestWeightAbove != null) goto L32;
        goto L31
    }

    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m6522matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int fontStyle) {
        if ((fontFamily instanceof FontListFontFamily) == false) goto L7;
        return m6523matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, fontStyle);
    L7:
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m6523matchFontRetOiIg(FontListFontFamily fontFamily, FontWeight fontWeight, int fontStyle) {
        return m6524matchFontRetOiIg(fontFamily.getFonts(), fontWeight, fontStyle);
    }
}
