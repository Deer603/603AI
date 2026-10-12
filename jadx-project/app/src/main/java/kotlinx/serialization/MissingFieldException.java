package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\rB\u0011\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "missingFields", "", "", "message", "cause", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getMissingFields", "()Ljava/util/List;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;

    public MissingFieldException(List<String> r2, String message, Throwable cause) {
        Intrinsics.checkNotNullParameter(r2, "missingFields");
        super(message, cause);
        this.missingFields = r2;
    }

    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    public MissingFieldException(List<String> r3, String serialName) {
        Intrinsics.checkNotNullParameter(r3, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        if (r3.size() != 1) goto L5;
        String r0 = "Field '" + r3.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing";
    L6:
        this(r3, r0, null);
        return;
    L5:
        r0 = "Fields " + r3 + " are required for type with serial name '" + serialName + "', but they were missing";
        goto L6
    }

    public MissingFieldException(String missingField, String serialName) {
        Intrinsics.checkNotNullParameter(missingField, "missingField");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", null);
    }

    public MissingFieldException(String missingField) {
        Intrinsics.checkNotNullParameter(missingField, "missingField");
        this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required, but it was missing", null);
    }
}
