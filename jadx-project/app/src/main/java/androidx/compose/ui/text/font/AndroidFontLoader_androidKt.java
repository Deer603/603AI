package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"load", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/ResourceFont;", "context", "Landroid/content/Context;", "loadAsync", "(Landroidx/compose/ui/text/font/ResourceFont;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidFontLoader_androidKt {
    public static final /* synthetic */ android.graphics.Typeface access$load(ResourceFont $receiver, Context context) {
        return load($receiver, context);
    }

    public static final /* synthetic */ Object access$loadAsync(ResourceFont $receiver, Context context, Continuation $completion) {
        return loadAsync($receiver, context, $completion);
    }

    private static final android.graphics.Typeface load(ResourceFont $this$load, Context context) {
        android.graphics.Typeface r0 = ResourcesCompat.getFont(context, $this$load.getResId());
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    private static final Object loadAsync(final ResourceFont $this$loadAsync, Context context, Continuation<? super android.graphics.Typeface> r11) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r11), 1);
        cancellable$iv.initCancellability();
        final CancellableContinuationImpl continuation = cancellable$iv;
        ResourcesCompat.getFont(context, $this$loadAsync.getResId(), new AndroidFontLoader_androidKt$loadAsync$2$1(continuation, $this$loadAsync), null);
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        DebugProbesKt.probeCoroutineSuspended(r11);
    L6:
        return r1;
    }
}
