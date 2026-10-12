package androidx.compose.foundation.layout;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/LazyImpl;", "Lkotlin/Lazy;", "", "initializer", "Lkotlin/Function0;", "errorMessage", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "_value", "getErrorMessage", "()Ljava/lang/String;", "getInitializer", "()Lkotlin/jvm/functions/Function0;", "value", "getValue", "()Ljava/lang/Integer;", "isInitialized", "", "toString", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazyImpl implements Lazy<Integer> {
    public static final Companion Companion = null;
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value;
    private final String errorMessage;
    private final Function0<Integer> initializer;

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/LazyImpl$Companion;", "", "()V", "UNINITIALIZED_VALUE", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public LazyImpl(Function0<Integer> r2, String errorMessage) {
        this.initializer = r2;
        this.errorMessage = errorMessage;
        this._value = -1;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Function0<Integer> getInitializer() {
        return this.initializer;
    }

    @Override // kotlin.Lazy
    public /* bridge */ /* synthetic */ Integer getValue() {
        return getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.Lazy
    public Integer getValue() {
        if (this._value != (-1)) goto L6;
        this._value = this.initializer.invoke().intValue();
    L6:
        if (this._value == (-1)) goto L10;
        return Integer.valueOf(this._value);
    L10:
        throw new IllegalStateException(this.errorMessage);
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        if (this._value == (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    public String toString() {
        if (isInitialized() == false) goto L6;
        return String.valueOf(getValue().intValue());
    L6:
        return this.errorMessage;
    }
}
