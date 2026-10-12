package kotlin.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"HexFormat", "Lkotlin/text/HexFormat;", "builderAction", "Lkotlin/Function1;", "Lkotlin/text/HexFormat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "isCaseSensitive", "", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HexFormatKt {
    public static final /* synthetic */ boolean access$isCaseSensitive(String $receiver) {
        return isCaseSensitive($receiver);
    }

    private static final HexFormat HexFormat(Function1<? super HexFormat.Builder, Unit> r1) {
        Intrinsics.checkNotNullParameter(r1, "builderAction");
        HexFormat.Builder r0 = new HexFormat.Builder();
        r1.invoke(r0);
        return r0.build();
    }

    private static final boolean isCaseSensitive(String $this$isCaseSensitive) {
        String $this$any$iv = $this$isCaseSensitive;
        int r3 = 0;
    L4:
        if (r3 >= $this$any$iv.length()) goto L19;
        char element$iv = $this$any$iv.charAt(r3);
        if (Intrinsics.compare(element$iv, 128) < 0) goto L8;
    L11:
        char it = 1;
    L12:
        if (it != 0) goto L16;
        r3 = r3 + 1;
        goto L4
    L16:
        return true;
    L8:
        if (Character.isLetter(element$iv) == true) goto L11;
        it = 0;
        goto L12
    L19:
        return false;
    }
}
