package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002Bw\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\u0010\u0011J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0011\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001dH\u0086\u0002J\b\u0010(\u001a\u00020\u001dH\u0016J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010*H\u0096\u0002R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", HintConstants.AUTOFILL_HINT_NAME, "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "children", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "getClipPathData", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPivotX", "()F", "getPivotY", "getRotation", "getScaleX", "getScaleY", "size", "", "getSize", "()I", "getTranslationX", "getTranslationY", "equals", "", "other", "", "get", "index", "hashCode", "iterator", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {
    public static final int $stable = 0;
    private final List<VectorNode> children;
    private final List<PathNode> clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ImageVector.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\t\u0010\b\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"androidx/compose/ui/graphics/vector/VectorGroup$iterator$1", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "it", "getIt", "()Ljava/util/Iterator;", "hasNext", "", "next", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<VectorNode>, KMappedMarker {
        private final Iterator<VectorNode> it;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(VectorGroup $receiver) {
            this.it = VectorGroup.access$getChildren$p($receiver).iterator();
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ VectorNode next() {
            return next();
        }

        public final Iterator<VectorNode> getIt() {
            return this.it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public VectorNode next() {
            return this.it.next();
        }
    }

    static {
    }

    public VectorGroup() {
        String r1 = null;
        float r2 = 0.0f;
        float r3 = 0.0f;
        float r4 = 0.0f;
        float r5 = 0.0f;
        float r6 = 0.0f;
        float r7 = 0.0f;
        float r8 = 0.0f;
        List r9 = null;
        List r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static final /* synthetic */ List access$getChildren$p(VectorGroup $this) {
        return $this.children;
    }

    public /* synthetic */ VectorGroup(String r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, List r11, List r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = 0.0f;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = 0.0f;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = 0.0f;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = 1.0f;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = 1.0f;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = 0.0f;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = 0.0f;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = VectorKt.getEmptyPath();
    L30:
        if ((r13 & 512) == 0) goto L32;
        List r15 = CollectionsKt.emptyList();
    L33:
        float r16 = r10;
        List r17 = r11;
        float r18 = r8;
        float r19 = r9;
        float r20 = r7;
        float r21 = r5;
        String r22 = r3;
        this(r22, r4, r21, r6, r20, r18, r19, r16, r17, r15);
        return;
    L32:
        r15 = r12;
        goto L33
    }

    public final String getName() {
        return this.name;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(String name, float rotation, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends PathNode> r10, List<? extends VectorNode> r11) {
        super(null);
        this.name = name;
        this.rotation = rotation;
        this.pivotX = pivotX;
        this.pivotY = pivotY;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.translationX = translationX;
        this.translationY = translationY;
        this.clipPathData = r10;
        this.children = r11;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final VectorNode get(int index) {
        return this.children.get(index);
    }

    @Override // java.lang.Iterable
    public Iterator<VectorNode> iterator() {
        return new AnonymousClass1(this);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L62:
        return false;
    L8:
        if ((other instanceof VectorGroup) == false) goto L62;
        if (Intrinsics.areEqual(this.name, ((VectorGroup) other).name) == true) goto L14;
        return false;
    L14:
        if (this.rotation != ((VectorGroup) other).rotation) goto L16;
        boolean r2 = true;
    L17:
        if (r2 == true) goto L20;
        return false;
    L20:
        if (this.pivotX != ((VectorGroup) other).pivotX) goto L22;
        boolean r3 = true;
    L23:
        if (r3 == true) goto L26;
        return false;
    L26:
        if (this.pivotY != ((VectorGroup) other).pivotY) goto L28;
        boolean r4 = true;
    L29:
        if (r4 == true) goto L32;
        return false;
    L32:
        if (this.scaleX != ((VectorGroup) other).scaleX) goto L34;
        boolean r5 = true;
    L35:
        if (r5 == true) goto L38;
        return false;
    L38:
        if (this.scaleY != ((VectorGroup) other).scaleY) goto L40;
        boolean r6 = true;
    L41:
        if (r6 == true) goto L44;
        return false;
    L44:
        if (this.translationX != ((VectorGroup) other).translationX) goto L46;
        boolean r7 = true;
    L47:
        if (r7 == true) goto L50;
        return false;
    L50:
        if (this.translationY != ((VectorGroup) other).translationY) goto L52;
        boolean r8 = true;
    L53:
        if (r8 == true) goto L56;
        return false;
    L56:
        if (Intrinsics.areEqual(this.clipPathData, ((VectorGroup) other).clipPathData) == true) goto L59;
        return false;
    L59:
        if (Intrinsics.areEqual(this.children, ((VectorGroup) other).children) == true) goto L61;
        return false;
    L61:
        return true;
    L52:
        r8 = false;
        goto L53
    L46:
        r7 = false;
        goto L47
    L40:
        r6 = false;
        goto L41
    L34:
        r5 = false;
        goto L35
    L28:
        r4 = false;
        goto L29
    L22:
        r3 = false;
        goto L23
    L16:
        r2 = false;
        goto L17
    }

    public int hashCode() {
        int result = this.name.hashCode();
        int result2 = (result * 31) + Float.hashCode(this.rotation);
        return (((((((((((((((result2 * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }
}
