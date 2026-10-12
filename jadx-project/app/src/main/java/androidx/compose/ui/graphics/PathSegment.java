package androidx.compose.ui.graphics;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathSegment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/graphics/PathSegment$Type;", "points", "", "weight", "", "(Landroidx/compose/ui/graphics/PathSegment$Type;[FF)V", "getPoints", "()[F", "getType", "()Landroidx/compose/ui/graphics/PathSegment$Type;", "getWeight", "()F", "equals", "", "other", "hashCode", "", "toString", "", "Type", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathSegment {
    private final float[] points;
    private final Type type;
    private final float weight;

    /* JADX INFO: compiled from: PathSegment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "(Ljava/lang/String;I)V", "Move", "Line", "Quadratic", "Conic", "Cubic", "Close", "Done", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum Type extends Enum<Type> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type Close = null;
        public static final Type Conic = null;
        public static final Type Cubic = null;
        public static final Type Done = null;
        public static final Type Line = null;
        public static final Type Move = null;
        public static final Type Quadratic = null;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Move, Line, Quadratic, Conic, Cubic, Close, Done};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String r1) {
            return (Type) Enum.valueOf(Type.class, r1);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        private Type(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            Move = new Type("Move", 0);
            Line = new Type("Line", 1);
            Quadratic = new Type("Quadratic", 2);
            Conic = new Type("Conic", 3);
            Cubic = new Type("Cubic", 4);
            Close = new Type("Close", 5);
            Done = new Type("Done", 6);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    public PathSegment(Type type, float[] points, float weight) {
        this.type = type;
        this.points = points;
        this.weight = weight;
    }

    public final Type getType() {
        return this.type;
    }

    public final float[] getPoints() {
        return this.points;
    }

    public final float getWeight() {
        return this.weight;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L23:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L23;
        PathSegment r2 = (PathSegment) other;
        if (this.type == ((PathSegment) other).type) goto L14;
        return false;
    L14:
        if (Arrays.equals(this.points, ((PathSegment) other).points) == true) goto L17;
        return false;
    L17:
        if (this.weight != ((PathSegment) other).weight) goto L19;
        boolean r3 = true;
    L20:
        if (r3 == true) goto L22;
        return false;
    L22:
        return true;
    L19:
        r3 = false;
        goto L20
    }

    public int hashCode() {
        int result = this.type.hashCode();
        int result2 = (result * 31) + Arrays.hashCode(this.points);
        return (result2 * 31) + Float.hashCode(this.weight);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder().append("PathSegment(type=").append(this.type).append(", points=");
        String r1 = Arrays.toString(this.points);
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r0.append(r1).append(", weight=").append(this.weight).append(')').toString();
    }
}
