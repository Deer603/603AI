package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¢\u0006\u0002\b\u0003\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002\u001a\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\u0002H\u0001¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getStackTraceElement", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "getLabel", "", "checkDebugMetadataVersion", "", "expected", "actual", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "COROUTINES_DEBUG_METADATA_VERSION", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DebugMetadataKt {
    private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;

    public static final StackTraceElement getStackTraceElement(BaseContinuationImpl $this$getStackTraceElementImpl) {
        Intrinsics.checkNotNullParameter($this$getStackTraceElementImpl, "<this>");
        DebugMetadata debugMetadata = getDebugMetadataAnnotation($this$getStackTraceElementImpl);
        if (debugMetadata != null) goto L6;
        return null;
    L6:
        checkDebugMetadataVersion(1, debugMetadata.v());
        int label = getLabel($this$getStackTraceElementImpl);
        if (label >= 0) goto L9;
        int lineNumber = -1;
    L10:
        String moduleName = ModuleNameRetriever.INSTANCE.getModuleName($this$getStackTraceElementImpl);
        if (moduleName != null) goto L13;
        String moduleAndClass = debugMetadata.c();
    L15:
        return new StackTraceElement(moduleAndClass, debugMetadata.m(), debugMetadata.f(), lineNumber);
    L13:
        moduleAndClass = moduleName + '/' + debugMetadata.c();
        goto L15
    L9:
        lineNumber = debugMetadata.l()[label];
        goto L10
    }

    private static final DebugMetadata getDebugMetadataAnnotation(BaseContinuationImpl $this$getDebugMetadataAnnotation) {
        return (DebugMetadata) $this$getDebugMetadataAnnotation.getClass().getAnnotation(DebugMetadata.class);
    }

    private static final int getLabel(BaseContinuationImpl $this$getLabel) {
        Field field = $this$getLabel.getClass().getDeclaredField("label");     // Catch: Exception -> L11
        field.setAccessible(true);     // Catch: Exception -> L11
        Object r2 = field.get($this$getLabel);     // Catch: Exception -> L11
        if ((r2 instanceof Integer) == false) goto L5;
        Integer r3 = (Integer) r2;     // Catch: Exception -> L11
    L6:
        if (r3 == null) goto L9;
        int r4 = r3.intValue();     // Catch: Exception -> L11
    L16:
        return r4 - 1;
    L9:
        r4 = 0;
        goto L16
    L5:
        r3 = null;
    L12:
        return -1;
    }

    private static final void checkDebugMetadataVersion(int expected, int actual) {
        if (actual > expected) goto L5;
        return;
    L5:
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + expected + ", got " + actual + ". Please update the Kotlin standard library.").toString());
    }

    public static final String[] getSpilledVariableFieldMapping(BaseContinuationImpl $this$getSpilledVariableFieldMapping) {
        Intrinsics.checkNotNullParameter($this$getSpilledVariableFieldMapping, "<this>");
        DebugMetadata debugMetadata = getDebugMetadataAnnotation($this$getSpilledVariableFieldMapping);
        if (debugMetadata != null) goto L6;
        return null;
    L6:
        checkDebugMetadataVersion(1, debugMetadata.v());
        ArrayList res = new ArrayList();
        int label = getLabel($this$getSpilledVariableFieldMapping);
        int[] r3 = debugMetadata.i();
        int r4 = r3.length;
        int r6 = 0;
    L7:
        if (r6 >= r4) goto L12;
        int i = r6;
        int labelOfIndex = r3[r6];
        if (labelOfIndex != label) goto L11;
        res.add(debugMetadata.s()[i]);
        res.add(debugMetadata.n()[i]);
    L11:
        r6 = r6 + 1;
        goto L7
    L12:
        ArrayList $this$toTypedArray$iv = res;
        return (String[]) $this$toTypedArray$iv.toArray(new String[0]);
    }
}
