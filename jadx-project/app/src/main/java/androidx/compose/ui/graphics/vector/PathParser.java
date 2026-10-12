package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ8\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0011\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082\bJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "()V", "nodeData", "", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "addPathNodes", "", "clear", "", "parsePathString", "pathData", "", "pathStringToNodes", "resizeNodeData", "dataCount", "", "toNodes", "toPath", "Landroidx/compose/ui/graphics/Path;", "target", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathParser {
    private float[] nodeData;
    private ArrayList<PathNode> nodes;

    public PathParser() {
        this.nodeData = new float[64];
    }

    public final void clear() {
        ArrayList<PathNode> r0 = this.nodes;
        if (r0 == null) goto L6;
        r0.clear();
        return;
    }

    public final PathParser parsePathString(String pathData) {
        ArrayList<PathNode> r0 = this.nodes;
        if (r0 != null) goto L5;
        r0 = new ArrayList();
        this.nodes = r0;
    L6:
        pathStringToNodes(pathData, r0);
        return this;
    L5:
        r0.clear();
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser r0, String r1, ArrayList r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = new ArrayList();
    L6:
        return r0.pathStringToNodes(r1, r2);
    }

    public final ArrayList<PathNode> pathStringToNodes(String pathData, ArrayList<PathNode> r21) {
        int start = 0;
        int end = pathData.length();
        int dataCount = 0;
    L3:
        int r6 = 32;
        if (start >= end) goto L8;
        if (Intrinsics.compare(pathData.charAt(start), 32) > 0) goto L8;
        start = start + 1;
    L8:
        if (end <= start) goto L12;
        if (Intrinsics.compare(pathData.charAt(end - 1), 32) > 0) goto L12;
        end = end - 1;
    L12:
        int index = start;
    L13:
        if (index >= end) goto L51;
        char command = 0;
    L15:
        int index2 = index + 1;
        char c = pathData.charAt(index);
        int lowerChar = c | ' ';
        if (((lowerChar - 97) * (lowerChar - 122)) <= 0) goto L18;
    L20:
        if (index2 >= end) goto L21;
        index = index2;
        r6 = 32;
    L21:
        if (command != 0) goto L23;
        index = index2;
        r6 = 32;
        goto L13
    L23:
        if ((command | ' ') == 122) goto L47;
        int dataCount2 = 0;
    L25:
        if (index2 >= end) goto L29;
        if (Intrinsics.compare(pathData.charAt(index2), r6) > 0) goto L29;
        index2 = index2 + 1;
    L29:
        long result = FastFloatParserKt.nextFloat(pathData, index2, end);
        int index3 = (int) (result >>> r6);
        int dataCount3 = dataCount2;
        index2 = index3;
        int bits$iv$iv = (int) (result & 4294967295L);
        float value = Float.intBitsToFloat(bits$iv$iv);
        if (Float.isNaN(value) == true) goto L36;
        int dataCount4 = dataCount3 + 1;
        this.nodeData[dataCount3] = value;
        if (dataCount4 < this.nodeData.length) goto L37;
        float[] src$iv = this.nodeData;
        this.nodeData = new float[dataCount4 * 2];
        ArraysKt.copyInto(src$iv, this.nodeData, 0, 0, src$iv.length);
    L37:
        if (index2 >= end) goto L41;
        if (pathData.charAt(index2) != ',') goto L41;
        index2 = index2 + 1;
    L41:
        if (index2 >= end) goto L46;
        if (Float.isNaN(value) == true) goto L46;
        dataCount2 = dataCount4;
        start = start;
        r6 = 32;
    L46:
        dataCount = dataCount4;
    L48:
        index = index2;
        PathNodeKt.addPathNodes(command, r21, this.nodeData, dataCount);
        start = start;
        r6 = 32;
        goto L13
    L36:
        start = start;
        dataCount4 = dataCount3;
        goto L37
    L47:
        start = start;
        goto L48
    L18:
        if (lowerChar == 101) goto L20;
        command = c;
        goto L21
    L51:
        return r21;
    }

    private final void resizeNodeData(int dataCount) {
        if (dataCount < this.nodeData.length) goto L6;
        float[] src = this.nodeData;
        this.nodeData = new float[dataCount * 2];
        ArraysKt.copyInto(src, this.nodeData, 0, 0, src.length);
        return;
    }

    public final PathParser addPathNodes(List<? extends PathNode> r3) {
        ArrayList<PathNode> r0 = this.nodes;
        if (r0 != null) goto L5;
        r0 = new ArrayList();
        this.nodes = r0;
    L5:
        r0.addAll(r3);
        return this;
    }

    public final List<PathNode> toNodes() {
        ArrayList<PathNode> r0 = this.nodes;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return CollectionsKt.emptyList();
    }

    public static /* synthetic */ Path toPath$default(PathParser r0, Path r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = AndroidPath_androidKt.Path();
    L6:
        return r0.toPath(r1);
    }

    public final Path toPath(Path target) {
        ArrayList<PathNode> r0 = this.nodes;
        if (r0 == null) goto L7;
        Path r1 = PathParserKt.toPath(r0, target);
        if (r1 == null) goto L7;
        return r1;
    L7:
        return AndroidPath_androidKt.Path();
    }
}
