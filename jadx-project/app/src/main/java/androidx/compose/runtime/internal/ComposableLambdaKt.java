package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u001a \u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a%\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u0015\u001a\u00020\u000e*\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"BITS_PER_SLOT", "", "SLOTS_PER_INT", "lambdaKey", "", "bitsForSlot", "bits", "slot", "composableLambda", "Landroidx/compose/runtime/internal/ComposableLambda;", "composer", "Landroidx/compose/runtime/Composer;", "key", "tracked", "", "block", "composableLambdaInstance", "differentBits", "rememberComposableLambda", "(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;", "sameBits", "replacableWith", "Landroidx/compose/runtime/RecomposeScope;", "other", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    public static final int SLOTS_PER_INT = 10;
    private static final Object lambdaKey = null;

    public static final int bitsForSlot(int bits, int slot) {
        int realSlot = slot % 10;
        return bits << ((realSlot * 3) + 1);
    }

    public static final int sameBits(int slot) {
        return bitsForSlot(1, slot);
    }

    public static final int differentBits(int slot) {
        return bitsForSlot(2, slot);
    }

    public static final boolean replacableWith(RecomposeScope $this$replacableWith, RecomposeScope other) {
        if ($this$replacableWith != null) goto L4;
    L15:
        return true;
    L4:
        if (($this$replacableWith instanceof RecomposeScopeImpl) == true) goto L6;
    L14:
        return false;
    L6:
        if ((other instanceof RecomposeScopeImpl) == false) goto L14;
        if (((RecomposeScopeImpl) $this$replacableWith).getValid() == false) goto L15;
        if (Intrinsics.areEqual($this$replacableWith, other) == true) goto L15;
        if (Intrinsics.areEqual(((RecomposeScopeImpl) $this$replacableWith).getAnchor(), ((RecomposeScopeImpl) other).getAnchor()) == false) goto L14;
        goto L14
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambda(Composer composer, int key, boolean tracked, Object block) {
        composer.startMovableGroup(Integer.rotateLeft(key, 1), lambdaKey);
        Object slot = composer.rememberedValue();
        if (slot != Composer.Companion.getEmpty()) goto L5;
        ComposableLambdaImpl value = new ComposableLambdaImpl(key, tracked, block);
        composer.updateRememberedValue(value);
    L6:
        composer.endMovableGroup();
        return value;
    L5:
        Intrinsics.checkNotNull(slot, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
        ComposableLambdaImpl r1 = (ComposableLambdaImpl) slot;
        ((ComposableLambdaImpl) slot).update(block);
        value = (ComposableLambdaImpl) slot;
        goto L6
    }

    static {
        lambdaKey = new Object();
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambdaInstance(int key, boolean tracked, Object block) {
        return new ComposableLambdaImpl(key, tracked, block);
    }

    @ComposeCompilerApi
    public static final ComposableLambda rememberComposableLambda(int key, boolean tracked, Object block, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1573003438, "C(rememberComposableLambda)P(1,2)*1366@35136L54:ComposableLambda.kt#9drcc");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1573003438, $changed, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1366)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1921622705, "CC(remember):ComposableLambda.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = new ComposableLambdaImpl(key, tracked, block);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        ComposableLambdaImpl it = (ComposableLambdaImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        it.update(block);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return it;
    }
}
