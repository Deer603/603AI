package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedState.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000\u001a7\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u00032\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"SavedState", "Landroid/os/Bundle;", "savedState", "Landroidx/savedstate/SavedState;", "initialState", "", "", "", "builderAction", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateWriter;", "", "Lkotlin/ExtensionFunctionType;", "savedstate_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateKt")
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    public static /* synthetic */ Bundle savedState$default(Map initialState, Function1 builderAction, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        initialState = MapsKt.emptyMap();
    L6:
        if ((r12 & 2) == 0) goto L8;
        Function1 builderAction2 = AnonymousClass1.INSTANCE;
        builderAction = builderAction2;
    L8:
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (initialState.isEmpty() == false) goto L11;
        Pair[] pairs = new Pair[0];
    L16:
        Bundle $this$savedState_u24lambda_u241 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs, pairs.length));
        builderAction.invoke(SavedStateWriter.m7355boximpl(SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241)));
        return $this$savedState_u24lambda_u241;
    L11:
        Map $this$map$iv = initialState;
        Collection destination$iv$iv = new ArrayList($this$map$iv.size());
        Iterator r5 = $this$map$iv.entrySet().iterator();
    L13:
        if (r5.hasNext() == false) goto L15;
        Map.Entry item$iv$iv = (Map.Entry) r5.next();
        String key = (String) item$iv$iv.getKey();
        Object value = item$iv$iv.getValue();
        destination$iv$iv.add(TuplesKt.to(key, value));
        goto L13
    L15:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        pairs = (Pair[]) $this$toTypedArray$iv.toArray(new Pair[0]);
        goto L16
    }

    public static final Bundle savedState(Map<String, ? extends Object> r12, Function1<? super SavedStateWriter, Unit> r13) {
        Intrinsics.checkNotNullParameter(r12, "initialState");
        Intrinsics.checkNotNullParameter(r13, "builderAction");
        if (r12.isEmpty() == false) goto L5;
        Pair[] pairs = new Pair[0];
    L10:
        Bundle $this$savedState_u24lambda_u241 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs, pairs.length));
        r13.invoke(SavedStateWriter.m7355boximpl(SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241)));
        return $this$savedState_u24lambda_u241;
    L5:
        Collection destination$iv$iv = new ArrayList(r12.size());
        Iterator<Map.Entry<String, ? extends Object>> r7 = r12.entrySet().iterator();
    L7:
        if (r7.hasNext() == false) goto L9;
        Map.Entry<String, ? extends Object> r8 = r7.next();
        String key = r8.getKey();
        Object value = r8.getValue();
        destination$iv$iv.add(TuplesKt.to(key, value));
        goto L7
    L9:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        pairs = (Pair[]) $this$toTypedArray$iv.toArray(new Pair[0]);
        goto L10
    }

    public static /* synthetic */ Bundle savedState$default(Bundle initialState, Function1 builderAction, int r7, Object r8) {
        if ((r7 & 2) == 0) goto L5;
        Function1 builderAction2 = AnonymousClass3.INSTANCE;
        builderAction = builderAction2;
    L5:
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Bundle $this$savedState_u24lambda_u242 = new Bundle(initialState);
        builderAction.invoke(SavedStateWriter.m7355boximpl(SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u242)));
        return $this$savedState_u24lambda_u242;
    }

    public static final Bundle savedState(Bundle initialState, Function1<? super SavedStateWriter, Unit> r8) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(r8, "builderAction");
        Bundle $this$savedState_u24lambda_u242 = new Bundle(initialState);
        r8.invoke(SavedStateWriter.m7355boximpl(SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u242)));
        return $this$savedState_u24lambda_u242;
    }
}
