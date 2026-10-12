package androidx.compose.ui.text.font;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: compiled from: FontVariation.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u001d\u001e\u001f\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ4\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "()V", "Setting", "Landroidx/compose/ui/text/font/FontVariation$Setting;", HintConstants.AUTOFILL_HINT_NAME, "", "value", "", "Settings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "settings", "", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", "grade", "", "italic", "opticalSizing", "textSize", "Landroidx/compose/ui/unit/TextUnit;", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "slant", "width", "SettingFloat", "SettingInt", "SettingTextUnit", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = null;

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "axisName", "", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density r1);
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "", "(Ljava/lang/String;F)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue", "()F", "equals", "other", "", "hashCode", "", "toString", "toVariationValue", "density", "Landroidx/compose/ui/unit/Density;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String axisName, float value) {
            this.axisName = axisName;
            this.value = value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        public final float getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if ((other instanceof SettingFloat) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(getAxisName(), ((SettingFloat) other).getAxisName()) == true) goto L12;
            return false;
        L12:
            if (this.value != ((SettingFloat) other).value) goto L14;
            boolean r1 = true;
        L15:
            if (r1 == true) goto L17;
            return false;
        L17:
            return true;
        L14:
            r1 = false;
            goto L15
        }

        public int hashCode() {
            int result = getAxisName().hashCode();
            return (result * 31) + Float.hashCode(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "", "(Ljava/lang/String;I)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue", "()I", "equals", "other", "", "hashCode", "toString", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String axisName, int value) {
            this.axisName = axisName;
            this.value = value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if ((other instanceof SettingInt) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(getAxisName(), ((SettingInt) other).getAxisName()) == true) goto L12;
            return false;
        L12:
            if (this.value == ((SettingInt) other).value) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int result = getAxisName().hashCode();
            return (result * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "Landroidx/compose/ui/unit/TextUnit;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue-XSAIIZE", "()J", "J", "equals", "other", "", "hashCode", "", "toString", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        public /* synthetic */ SettingTextUnit(String r1, long r2, DefaultConstructorMarker r4) {
            this(r1, r2);
        }

        private SettingTextUnit(String axisName, long value) {
            this.axisName = axisName;
            this.value = value;
            this.needsDensity = true;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        /* JADX INFO: renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m6552getValueXSAIIZE() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) goto L5;
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            throw new KotlinNothingValueException();
        L5:
            return TextUnit.m7167getValueimpl(this.value) * density.getFontScale();
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if ((other instanceof SettingTextUnit) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(getAxisName(), ((SettingTextUnit) other).getAxisName()) == true) goto L12;
            return false;
        L12:
            if (TextUnit.m7164equalsimpl0(this.value, ((SettingTextUnit) other).value) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int result = getAxisName().hashCode();
            return (result * 31) + TextUnit.m7168hashCodeimpl(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + TextUnit.m7174toStringimpl(this.value) + ')';
        }
    }

    /* JADX INFO: compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "settings", "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "needsDensity", "", "getNeedsDensity$ui_text_release", "()Z", "", "getSettings", "()Ljava/util/List;", "equals", "other", "hashCode", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        static {
        }

        public Settings(Setting... settings) {
            Map destination$iv$iv = new LinkedHashMap();
            int r6 = settings.length;
            boolean r7 = false;
            int r8 = 0;
        L3:
            if (r8 >= r6) goto L9;
            Setting r9 = settings[r8];
            String r10 = r9.getAxisName();
            Object value$iv$iv$iv = destination$iv$iv.get(r10);
            if (value$iv$iv$iv != null) goto L7;
            ArrayList answer$iv$iv$iv = new ArrayList();
            destination$iv$iv.put(r10, answer$iv$iv$iv);
        L8:
            List list$iv$iv = (List) answer$iv$iv$iv;
            list$iv$iv.add(r9);
            r8 = r8 + 1;
            goto L3
        L7:
            answer$iv$iv$iv = value$iv$iv$iv;
            goto L8
        L9:
            Collection destination$iv$iv2 = new ArrayList();
            Iterator r11 = destination$iv$iv.entrySet().iterator();
        L10:
            boolean r12 = true;
            if (r11.hasNext() == false) goto L20;
            Map.Entry element$iv$iv = (Map.Entry) r11.next();
            String key = (String) element$iv$iv.getKey();
            List value = (List) element$iv$iv.getValue();
            if (value.size() == 1) goto L16;
            r12 = false;
        L16:
            if (r12 == false) goto L19;
            List list$iv$iv2 = value;
            CollectionsKt.addAll(destination$iv$iv2, list$iv$iv2);
            goto L10
        L19:
            throw new IllegalArgumentException(('\'' + key + "' must be unique. Actual [ [" + CollectionsKt.joinToString$default(value, null, null, null, 0, null, null, 63, null) + ']').toString());
        L20:
            this.settings = new ArrayList((List) destination$iv$iv2);
            List<Setting> r1 = this.settings;
            int index$iv$iv = 0;
            int r13 = r1.size();
        L21:
            if (index$iv$iv >= r13) goto L27;
            Object item$iv$iv = r1.get(index$iv$iv);
            Setting it = (Setting) item$iv$iv;
            if (it.getNeedsDensity() == true) goto L24;
            index$iv$iv = index$iv$iv + 1;
            goto L21
        L24:
            r7 = true;
        L27:
            this.needsDensity = r7;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.needsDensity;
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if ((other instanceof Settings) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(this.settings, ((Settings) other).settings) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    static {
        INSTANCE = new FontVariation();
    }

    private FontVariation() {
    }

    public final Setting Setting(String name, float value) {
        if (name.length() != 4) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + name + '\'');
    L10:
        return new SettingFloat(name, value);
    L5:
        value$iv = false;
        goto L7
    }

    public final Setting italic(float value) {
        boolean value$iv = false;
        if (0.0f > value) goto L8;
        if (value > 1.0f) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + value);
    L11:
        return new SettingFloat("ital", value);
    }

    /* JADX INFO: renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m6551opticalSizingR2X_6o(long textSize) {
        boolean value$iv = TextUnit.m7170isSpimpl(textSize);
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
    L6:
        return new SettingTextUnit("opsz", textSize, null);
    }

    public final Setting slant(float value) {
        boolean value$iv = false;
        if ((-90.0f) > value) goto L8;
        if (value > 90.0f) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + value);
    L11:
        return new SettingFloat("slnt", value);
    }

    public final Setting width(float value) {
        if (value <= 0.0f) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + value);
    L10:
        return new SettingFloat("wdth", value);
    L5:
        value$iv = false;
        goto L7
    }

    public final Setting weight(int value) {
        boolean value$iv = false;
        if (1 > value) goto L8;
        if (value >= 1001) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + value);
    L11:
        return new SettingInt("wght", value);
    }

    public final Setting grade(int value) {
        boolean value$iv = false;
        if ((-1000) > value) goto L8;
        if (value >= 1001) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
    L11:
        return new SettingInt("GRAD", value);
    }

    /* JADX INFO: renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m6550Settings6EWAqTQ(FontWeight weight, int style, Setting... settings) {
        SpreadBuilder r1 = new SpreadBuilder(3);
        r1.add(weight(weight.getWeight()));
        r1.add(italic(style));
        r1.addSpread(settings);
        return new Settings((Setting[]) r1.toArray(new Setting[r1.size()]));
    }
}
