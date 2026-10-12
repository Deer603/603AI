package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 ^2\u00020\u0001:\u0002^_J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H&J$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000fH'J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H'J\u001a\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H&J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0004J(\u0010%\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\tH&J(\u0010'\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\rH&J8\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011H&J\b\u00100\u001a\u00020\u000fH&J\t\u00101\u001a\u000202H\u0096\u0002J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\u0011H\u0016J\u0018\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H&J\u0011\u00109\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0018\u0010:\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H&J*\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?H&ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0004J\u0011\u0010C\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J(\u0010D\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H'J(\u0010E\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011H\u0016J8\u0010F\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u0011H&J\u0018\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0011H&J\u0018\u0010P\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0011H&J(\u0010Q\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0011H'J(\u0010R\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0011H\u0016J\b\u0010S\u001a\u00020\rH&J\b\u0010T\u001a\u00020\rH\u0016J\u001a\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020WH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u001a\u0010Z\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\u0011\u0010]\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0004R\u001e\u0010\u0002\u001a\u00020\u0003X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006`À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "fillType", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "isConvex", "", "()Z", "isEmpty", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "direction", "Landroidx/compose/ui/graphics/Path$Direction;", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "and", "arcTo", "forceMoveTo", "arcToRad", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "iterator", "Landroidx/compose/ui/graphics/PathIterator;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "tolerance", "lineTo", "x", "y", "minus", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "or", "plus", "quadraticBezierTo", "quadraticTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "relativeQuadraticTo", "reset", "rewind", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "translate-k-4lQ0M", "(J)V", "xor", "Companion", "Direction", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Path {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        static {
            $$INSTANCE = new Companion();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m4637combinexh6zSI8(int operation, Path path1, Path path2) {
            Path path = AndroidPath_androidKt.Path();
            if (path.mo4258opN5in7k0(path1, path2, operation) == false) goto L6;
            return path;
        L6:
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void quadraticTo(Path $this, float x1, float y1, float x2, float y2) {
            Path.access$quadraticTo$jd($this, x1, y1, x2, y2);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path $this, float dx1, float dy1, float dx2, float dy2) {
            Path.access$relativeQuadraticTo$jd($this, dx1, dy1, dx2, dy2);
        }

        @Deprecated
        public static void arcToRad(Path $this, Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
            Path.access$arcToRad$jd($this, rect, startAngleRadians, sweepAngleRadians, forceMoveTo);
        }

        public static /* synthetic */ void addRect$default(Path r0, Rect r1, Direction r2, int r3, Object r4) {
            Path.addRect$default(r0, r1, r2, r3, r4);
        }

        public static /* synthetic */ void addOval$default(Path r0, Rect r1, Direction r2, int r3, Object r4) {
            Path.addOval$default(r0, r1, r2, r3, r4);
        }

        public static /* synthetic */ void addRoundRect$default(Path r0, RoundRect r1, Direction r2, int r3, Object r4) {
            Path.addRoundRect$default(r0, r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ void m4638addPathUv8p0NA$default(Path r0, Path r1, long r2, int r4, Object r5) {
            Path.m4636addPathUv8p0NA$default(r0, r1, r2, r4, r5);
        }

        @Deprecated
        public static void rewind(Path $this) {
            Path.access$rewind$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m4639transform58bKbWc(Path $this, float[] matrix) {
            Path.m4635access$transform58bKbWc$jd($this, matrix);
        }

        @Deprecated
        public static PathIterator iterator(Path $this) {
            return Path.access$iterator$jd($this);
        }

        @Deprecated
        public static PathIterator iterator(Path $this, PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
            return Path.access$iterator$jd($this, conicEvaluation, tolerance);
        }

        public static /* synthetic */ PathIterator iterator$default(Path r0, PathIterator.ConicEvaluation r1, float r2, int r3, Object r4) {
            return Path.iterator$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        public static Path plus(Path $this, Path path) {
            return Path.access$plus$jd($this, path);
        }

        @Deprecated
        public static Path minus(Path $this, Path path) {
            return Path.access$minus$jd($this, path);
        }

        @Deprecated
        public static Path or(Path $this, Path path) {
            return Path.access$or$jd($this, path);
        }

        @Deprecated
        public static Path and(Path $this, Path path) {
            return Path.access$and$jd($this, path);
        }

        @Deprecated
        public static Path xor(Path $this, Path path) {
            return Path.access$xor$jd($this, path);
        }
    }

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "(Ljava/lang/String;I)V", "CounterClockwise", "Clockwise", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum Direction extends Enum<Direction> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ Direction[] $VALUES = null;
        public static final Direction Clockwise = null;
        public static final Direction CounterClockwise = null;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CounterClockwise, Clockwise};
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String r1) {
            return (Direction) Enum.valueOf(Direction.class, r1);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }

        private Direction(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            CounterClockwise = new Direction("CounterClockwise", 0);
            Clockwise = new Direction("Clockwise", 1);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    void addArc(Rect r1, float r2, float r3);

    void addArcRad(Rect r1, float r2, float r3);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @ReplaceWith(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void addOval(Rect r1);

    void addOval(Rect r1, Direction r2);

    /* JADX INFO: renamed from: addPath-Uv8p0NA */
    void mo4256addPathUv8p0NA(Path r1, long r2);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void addRect(Rect r1);

    void addRect(Rect r1, Direction r2);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void addRoundRect(RoundRect r1);

    void addRoundRect(RoundRect r1, Direction r2);

    void arcTo(Rect r1, float r2, float r3, boolean r4);

    void close();

    void cubicTo(float r1, float r2, float r3, float r4, float r5, float r6);

    Rect getBounds();

    /* JADX INFO: renamed from: getFillType-Rg-k1Os */
    int mo4257getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float r1, float r2);

    void moveTo(float r1, float r2);

    /* JADX INFO: renamed from: op-N5in7k0 */
    boolean mo4258opN5in7k0(Path r1, Path r2, int r3);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @ReplaceWith(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void quadraticBezierTo(float r1, float r2, float r3, float r4);

    void relativeCubicTo(float r1, float r2, float r3, float r4, float r5, float r6);

    void relativeLineTo(float r1, float r2);

    void relativeMoveTo(float r1, float r2);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @ReplaceWith(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void relativeQuadraticBezierTo(float r1, float r2, float r3, float r4);

    void reset();

    /* JADX INFO: renamed from: setFillType-oQ8Xj4U */
    void mo4259setFillTypeoQ8Xj4U(int r1);

    /* JADX INFO: renamed from: translate-k-4lQ0M */
    void mo4261translatek4lQ0M(long r1);

    static /* synthetic */ Path access$and$jd(Path $this, Path path) {
        return super.and(path);
    }

    static /* synthetic */ void access$arcToRad$jd(Path $this, Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
        super.arcToRad(rect, startAngleRadians, sweepAngleRadians, forceMoveTo);
    }

    static /* synthetic */ PathIterator access$iterator$jd(Path $this) {
        return super.iterator();
    }

    static /* synthetic */ PathIterator access$iterator$jd(Path $this, PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        return super.iterator(conicEvaluation, tolerance);
    }

    static /* synthetic */ Path access$minus$jd(Path $this, Path path) {
        return super.minus(path);
    }

    static /* synthetic */ Path access$or$jd(Path $this, Path path) {
        return super.or(path);
    }

    static /* synthetic */ Path access$plus$jd(Path $this, Path path) {
        return super.plus(path);
    }

    static /* synthetic */ void access$quadraticTo$jd(Path $this, float x1, float y1, float x2, float y2) {
        super.quadraticTo(x1, y1, x2, y2);
    }

    static /* synthetic */ void access$relativeQuadraticTo$jd(Path $this, float dx1, float dy1, float dx2, float dy2) {
        super.relativeQuadraticTo(dx1, dy1, dx2, dy2);
    }

    static /* synthetic */ void access$rewind$jd(Path $this) {
        super.rewind();
    }

    /* JADX INFO: renamed from: access$transform-58bKbWc$jd, reason: not valid java name */
    static /* synthetic */ void m4635access$transform58bKbWc$jd(Path $this, float[] matrix) {
        super.mo4260transform58bKbWc(matrix);
    }

    static /* synthetic */ Path access$xor$jd(Path $this, Path path) {
        return super.xor(path);
    }

    default void quadraticTo(float x1, float y1, float x2, float y2) {
        quadraticBezierTo(x1, y1, x2, y2);
    }

    default void relativeQuadraticTo(float dx1, float dy1, float dx2, float dy2) {
        relativeQuadraticBezierTo(dx1, dy1, dx2, dy2);
    }

    default void arcToRad(Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
        arcTo(rect, DegreesKt.degrees(startAngleRadians), DegreesKt.degrees(sweepAngleRadians), forceMoveTo);
    }

    static /* synthetic */ void addRect$default(Path r0, Rect r1, Direction r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = Direction.CounterClockwise;
    L6:
        r0.addRect(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
    }

    static /* synthetic */ void addOval$default(Path r0, Rect r1, Direction r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = Direction.CounterClockwise;
    L6:
        r0.addOval(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
    }

    static /* synthetic */ void addRoundRect$default(Path r0, RoundRect r1, Direction r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = Direction.CounterClockwise;
    L6:
        r0.addRoundRect(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
    }

    /* JADX INFO: renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m4636addPathUv8p0NA$default(Path r0, Path r1, long r2, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r2 = Offset.Companion.m4141getZeroF1C5BW0();
    L6:
        r0.mo4256addPathUv8p0NA(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    default void rewind() {
        reset();
    }

    /* JADX INFO: renamed from: transform-58bKbWc */
    default void mo4260transform58bKbWc(float[] matrix) {
    }

    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    static /* synthetic */ PathIterator iterator$default(Path r0, PathIterator.ConicEvaluation r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = 0.25f;
    L7:
        return r0.iterator(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
    }

    default PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, tolerance);
    }

    default Path plus(Path path) {
        Path $this$plus_u24lambda_u240 = AndroidPath_androidKt.Path();
        $this$plus_u24lambda_u240.mo4258opN5in7k0(this, path, PathOperation.Companion.m4661getUnionb3I0S0c());
        return $this$plus_u24lambda_u240;
    }

    default Path minus(Path path) {
        Path $this$minus_u24lambda_u241 = AndroidPath_androidKt.Path();
        $this$minus_u24lambda_u241.mo4258opN5in7k0(this, path, PathOperation.Companion.m4658getDifferenceb3I0S0c());
        return $this$minus_u24lambda_u241;
    }

    default Path or(Path path) {
        return plus(path);
    }

    default Path and(Path path) {
        Path $this$and_u24lambda_u242 = AndroidPath_androidKt.Path();
        $this$and_u24lambda_u242.mo4258opN5in7k0(this, path, PathOperation.Companion.m4659getIntersectb3I0S0c());
        return $this$and_u24lambda_u242;
    }

    default Path xor(Path path) {
        Path $this$xor_u24lambda_u243 = AndroidPath_androidKt.Path();
        $this$xor_u24lambda_u243.mo4258opN5in7k0(this, path, PathOperation.Companion.m4662getXorb3I0S0c());
        return $this$xor_u24lambda_u243;
    }
}
