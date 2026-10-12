package androidx.compose.ui.text.font;

import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontWeight.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "weight", "", "(I)V", "getWeight", "()I", "compareTo", "other", "equals", "", "", "hashCode", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;
    private static final FontWeight Black = null;
    private static final FontWeight Bold = null;
    public static final Companion Companion = null;
    private static final FontWeight ExtraBold = null;
    private static final FontWeight ExtraLight = null;
    private static final FontWeight Light = null;
    private static final FontWeight Medium = null;
    private static final FontWeight Normal = null;
    private static final FontWeight SemiBold = null;
    private static final FontWeight Thin = null;
    private static final FontWeight W100 = null;
    private static final FontWeight W200 = null;
    private static final FontWeight W300 = null;
    private static final FontWeight W400 = null;
    private static final FontWeight W500 = null;
    private static final FontWeight W600 = null;
    private static final FontWeight W700 = null;
    private static final FontWeight W800 = null;
    private static final FontWeight W900 = null;
    private static final List<FontWeight> values = null;
    private final int weight;

    /* JADX INFO: compiled from: FontWeight.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007R\u001c\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0007R\u001c\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R\u001c\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0007R\u001c\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0007R\u001c\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0007R\u001c\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0007R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "()V", "Black", "Landroidx/compose/ui/text/font/FontWeight;", "getBlack$annotations", "getBlack", "()Landroidx/compose/ui/text/font/FontWeight;", "Bold", "getBold$annotations", "getBold", "ExtraBold", "getExtraBold$annotations", "getExtraBold", "ExtraLight", "getExtraLight$annotations", "getExtraLight", "Light", "getLight$annotations", "getLight", "Medium", "getMedium$annotations", "getMedium", "Normal", "getNormal$annotations", "getNormal", "SemiBold", "getSemiBold$annotations", "getSemiBold", "Thin", "getThin$annotations", "getThin", "W100", "getW100$annotations", "getW100", "W200", "getW200$annotations", "getW200", "W300", "getW300$annotations", "getW300", "W400", "getW400$annotations", "getW400", "W500", "getW500$annotations", "getW500", "W600", "getW600$annotations", "getW600", "W700", "getW700$annotations", "getW700", "W800", "getW800$annotations", "getW800", "W900", "getW900$annotations", "getW900", "values", "", "getValues$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getBlack$annotations() {
        }

        public static /* synthetic */ void getBold$annotations() {
        }

        public static /* synthetic */ void getExtraBold$annotations() {
        }

        public static /* synthetic */ void getExtraLight$annotations() {
        }

        public static /* synthetic */ void getLight$annotations() {
        }

        public static /* synthetic */ void getMedium$annotations() {
        }

        public static /* synthetic */ void getNormal$annotations() {
        }

        public static /* synthetic */ void getSemiBold$annotations() {
        }

        public static /* synthetic */ void getThin$annotations() {
        }

        public static /* synthetic */ void getW100$annotations() {
        }

        public static /* synthetic */ void getW200$annotations() {
        }

        public static /* synthetic */ void getW300$annotations() {
        }

        public static /* synthetic */ void getW400$annotations() {
        }

        public static /* synthetic */ void getW500$annotations() {
        }

        public static /* synthetic */ void getW600$annotations() {
        }

        public static /* synthetic */ void getW700$annotations() {
        }

        public static /* synthetic */ void getW800$annotations() {
        }

        public static /* synthetic */ void getW900$annotations() {
        }

        private Companion() {
        }

        public final FontWeight getW100() {
            return FontWeight.access$getW100$cp();
        }

        public final FontWeight getW200() {
            return FontWeight.access$getW200$cp();
        }

        public final FontWeight getW300() {
            return FontWeight.access$getW300$cp();
        }

        public final FontWeight getW400() {
            return FontWeight.access$getW400$cp();
        }

        public final FontWeight getW500() {
            return FontWeight.access$getW500$cp();
        }

        public final FontWeight getW600() {
            return FontWeight.access$getW600$cp();
        }

        public final FontWeight getW700() {
            return FontWeight.access$getW700$cp();
        }

        public final FontWeight getW800() {
            return FontWeight.access$getW800$cp();
        }

        public final FontWeight getW900() {
            return FontWeight.access$getW900$cp();
        }

        public final FontWeight getThin() {
            return FontWeight.access$getThin$cp();
        }

        public final FontWeight getExtraLight() {
            return FontWeight.access$getExtraLight$cp();
        }

        public final FontWeight getLight() {
            return FontWeight.access$getLight$cp();
        }

        public final FontWeight getNormal() {
            return FontWeight.access$getNormal$cp();
        }

        public final FontWeight getMedium() {
            return FontWeight.access$getMedium$cp();
        }

        public final FontWeight getSemiBold() {
            return FontWeight.access$getSemiBold$cp();
        }

        public final FontWeight getBold() {
            return FontWeight.access$getBold$cp();
        }

        public final FontWeight getExtraBold() {
            return FontWeight.access$getExtraBold$cp();
        }

        public final FontWeight getBlack() {
            return FontWeight.access$getBlack$cp();
        }

        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.access$getValues$cp();
        }
    }

    public FontWeight(int weight) {
        this.weight = weight;
        int r0 = this.weight;
        boolean value$iv = false;
        if (1 > r0) goto L8;
        if (r0 >= 1001) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("Font weight can be in range [1, 1000]. Current value: " + this.weight);
        return;
    }

    public static final /* synthetic */ FontWeight access$getBlack$cp() {
        return Black;
    }

    public static final /* synthetic */ FontWeight access$getBold$cp() {
        return Bold;
    }

    public static final /* synthetic */ FontWeight access$getExtraBold$cp() {
        return ExtraBold;
    }

    public static final /* synthetic */ FontWeight access$getExtraLight$cp() {
        return ExtraLight;
    }

    public static final /* synthetic */ FontWeight access$getLight$cp() {
        return Light;
    }

    public static final /* synthetic */ FontWeight access$getMedium$cp() {
        return Medium;
    }

    public static final /* synthetic */ FontWeight access$getNormal$cp() {
        return Normal;
    }

    public static final /* synthetic */ FontWeight access$getSemiBold$cp() {
        return SemiBold;
    }

    public static final /* synthetic */ FontWeight access$getThin$cp() {
        return Thin;
    }

    public static final /* synthetic */ List access$getValues$cp() {
        return values;
    }

    public static final /* synthetic */ FontWeight access$getW100$cp() {
        return W100;
    }

    public static final /* synthetic */ FontWeight access$getW200$cp() {
        return W200;
    }

    public static final /* synthetic */ FontWeight access$getW300$cp() {
        return W300;
    }

    public static final /* synthetic */ FontWeight access$getW400$cp() {
        return W400;
    }

    public static final /* synthetic */ FontWeight access$getW500$cp() {
        return W500;
    }

    public static final /* synthetic */ FontWeight access$getW600$cp() {
        return W600;
    }

    public static final /* synthetic */ FontWeight access$getW700$cp() {
        return W700;
    }

    public static final /* synthetic */ FontWeight access$getW800$cp() {
        return W800;
    }

    public static final /* synthetic */ FontWeight access$getW900$cp() {
        return W900;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(FontWeight r2) {
        return compareTo2(r2);
    }

    public final int getWeight() {
        return this.weight;
    }

    static {
        Companion = new Companion(null);
        W100 = new FontWeight(100);
        W200 = new FontWeight(ComposerKt.invocationKey);
        W300 = new FontWeight(AnimationConstants.DefaultDurationMillis);
        W400 = new FontWeight(400);
        W500 = new FontWeight(500);
        W600 = new FontWeight(600);
        W700 = new FontWeight(700);
        W800 = new FontWeight(800);
        W900 = new FontWeight(900);
        Thin = W100;
        ExtraLight = W200;
        Light = W300;
        Normal = W400;
        Medium = W500;
        SemiBold = W600;
        Bold = W700;
        ExtraBold = W800;
        Black = W900;
        values = CollectionsKt.listOf(new FontWeight[]{W100, W200, W300, W400, W500, W600, W700, W800, W900});
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(FontWeight other) {
        return Intrinsics.compare(this.weight, other.weight);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof FontWeight) == true) goto L9;
        return false;
    L9:
        if (this.weight == ((FontWeight) other).weight) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }
}
