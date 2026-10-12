package androidx.compose.ui.tooling.data;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTree.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006!"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceInformationContext;", "", HintConstants.AUTOFILL_HINT_NAME, "", "sourceFile", "packageHash", "", "locations", "", "Landroidx/compose/ui/tooling/data/SourceLocationInfo;", "repeatOffset", "parameters", "Landroidx/compose/ui/tooling/data/Parameter;", "isCall", "", "isInline", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/util/List;ZZ)V", "()Z", "getLocations", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "nextLocation", "getPackageHash", "()I", "getParameters", "getRepeatOffset", "getSourceFile", "nextSourceLocation", "Landroidx/compose/ui/tooling/data/SourceLocation;", "sourceLocation", "callIndex", "parentContext", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SourceInformationContext {
    private final boolean isCall;
    private final boolean isInline;
    private final List<SourceLocationInfo> locations;
    private final String name;
    private int nextLocation;
    private final int packageHash;
    private final List<Parameter> parameters;
    private final int repeatOffset;
    private final String sourceFile;

    public SourceInformationContext(String name, String sourceFile, int packageHash, List<SourceLocationInfo> r4, int repeatOffset, List<Parameter> r6, boolean isCall, boolean isInline) {
        this.name = name;
        this.sourceFile = sourceFile;
        this.packageHash = packageHash;
        this.locations = r4;
        this.repeatOffset = repeatOffset;
        this.parameters = r6;
        this.isCall = isCall;
        this.isInline = isInline;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    public final List<SourceLocationInfo> getLocations() {
        return this.locations;
    }

    public final int getRepeatOffset() {
        return this.repeatOffset;
    }

    public final List<Parameter> getParameters() {
        return this.parameters;
    }

    public final boolean isCall() {
        return this.isCall;
    }

    public final boolean isInline() {
        return this.isInline;
    }

    public final SourceLocation nextSourceLocation() {
        if (this.nextLocation < this.locations.size()) goto L8;
        if (this.repeatOffset < 0) goto L8;
        this.nextLocation = this.repeatOffset;
    L8:
        if (this.nextLocation >= this.locations.size()) goto L22;
        List<SourceLocationInfo> r0 = this.locations;
        int r1 = this.nextLocation;
        this.nextLocation = r1 + 1;
        SourceLocationInfo location = r0.get(r1);
        Integer r2 = location.getLineNumber();
        int r3 = -1;
        if (r2 == null) goto L12;
        int r4 = r2.intValue();
    L13:
        Integer r5 = location.getOffset();
        if (r5 == null) goto L16;
        int r6 = r5.intValue();
    L17:
        Integer r7 = location.getLength();
        if (r7 == null) goto L21;
        r3 = r7.intValue();
    L21:
        return new SourceLocation(r4, r6, r3, this.sourceFile, this.packageHash);
    L16:
        r6 = -1;
        goto L17
    L12:
        r4 = -1;
        goto L13
    L22:
        return null;
    }

    public final SourceLocation sourceLocation(int callIndex, SourceInformationContext parentContext) {
        int locationIndex = callIndex;
        if (locationIndex >= this.locations.size()) goto L5;
    L9:
        Integer r2 = null;
        if (locationIndex >= this.locations.size()) goto L38;
        SourceLocationInfo location = this.locations.get(locationIndex);
        Integer r4 = location.getLineNumber();
        int r5 = -1;
        if (r4 == null) goto L14;
        int r6 = r4.intValue();
    L15:
        Integer r7 = location.getOffset();
        if (r7 == null) goto L18;
        int r8 = r7.intValue();
    L19:
        Integer r9 = location.getLength();
        if (r9 == null) goto L22;
        int r10 = r9.intValue();
    L23:
        String r11 = this.sourceFile;
        if (r11 != null) goto L29;
        if (parentContext == null) goto L27;
        r11 = parentContext.sourceFile;
        goto L29
    L27:
        r11 = null;
    L29:
        if (this.sourceFile != null) goto L32;
        if (parentContext == null) goto L34;
        int r3 = parentContext.packageHash;
    L33:
        r2 = Integer.valueOf(r3);
    L34:
        if (r2 == null) goto L37;
        r5 = r2.intValue();
    L37:
        return new SourceLocation(r6, r8, r10, r11, r5);
    L32:
        r3 = this.packageHash;
        goto L33
    L22:
        r10 = -1;
        goto L23
    L18:
        r8 = -1;
        goto L19
    L14:
        r6 = -1;
        goto L15
    L38:
        return null;
    L5:
        if (this.repeatOffset < 0) goto L9;
        if (this.repeatOffset >= this.locations.size()) goto L9;
        locationIndex = ((callIndex - this.repeatOffset) % (this.locations.size() - this.repeatOffset)) + this.repeatOffset;
        goto L9
    }
}
