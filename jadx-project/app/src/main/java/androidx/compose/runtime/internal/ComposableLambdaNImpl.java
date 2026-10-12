package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0013\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "key", "", "tracked", "", "arity", "(IZI)V", "_block", "", "getArity", "()I", "getKey", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "realParamCount", "params", "trackRead", "", "composer", "Landroidx/compose/runtime/Composer;", "trackWrite", "update", "block", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    static {
    }

    public ComposableLambdaNImpl(int key, boolean tracked, int arity) {
        this.key = key;
        this.tracked = tracked;
        this.arity = arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    private final void trackWrite() {
        if (this.tracked == false) goto L15;
        RecomposeScope scope = this.scope;
        if (scope == null) goto L7;
        scope.invalidate();
        this.scope = null;
    L7:
        List<RecomposeScope> r1 = this.scopes;
        if (r1 == null) goto L16;
        int index = 0;
        int r3 = r1.size();
    L10:
        if (index >= r3) goto L12;
        RecomposeScope item = r1.get(index);
        item.invalidate();
        index = index + 1;
        goto L10
    L12:
        r1.clear();
        return;
    L16:
        return;
    }

    private final void trackRead(Composer composer) {
        if (this.tracked == false) goto L23;
        RecomposeScope scope = composer.getRecomposeScope();
        if (scope == null) goto L24;
        composer.recordUsed(scope);
        RecomposeScope lastScope = this.scope;
        if (ComposableLambdaKt.replacableWith(lastScope, scope) == false) goto L9;
        this.scope = scope;
        return;
    L9:
        List<RecomposeScope> r2 = this.scopes;
        if (r2 != null) goto L12;
        List newScopes = new ArrayList();
        this.scopes = newScopes;
        newScopes.add(scope);
        return;
    L12:
        int index = 0;
        int r4 = r2.size();
    L13:
        if (index >= r4) goto L19;
        RecomposeScope scopeAtIndex = r2.get(index);
        if (ComposableLambdaKt.replacableWith(scopeAtIndex, scope) == true) goto L16;
        index = index + 1;
        goto L13
    L16:
        r2.set(index, scope);
        return;
    L19:
        r2.add(scope);
        return;
    L24:
        return;
    }

    public final void update(Object block) {
        if (Intrinsics.areEqual(block, this._block) == false) goto L5;
        return;
    L5:
        if (this._block != null) goto L7;
        boolean oldBlockNull = true;
    L8:
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (FunctionN) block;
        if (oldBlockNull == true) goto L13;
        trackWrite();
        return;
    L13:
        return;
    L7:
        oldBlockNull = false;
        goto L8
    }

    private final int realParamCount(int params) {
        int realParams = params - 1;
        int realParams2 = realParams - 1;
        int changedParams = 1;
    L4:
        if ((changedParams * 10) >= realParams2) goto L6;
        realParams2 = realParams2 - 1;
        changedParams = changedParams + 1;
        goto L4
    L6:
        return realParams2;
    }

    @Override // kotlin.jvm.functions.FunctionN
    public Object invoke(final Object... args) {
        final int realParams = realParamCount(args.length);
        Object r1 = args[realParams];
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Collection $this$toTypedArray$iv = ArraysKt.slice(args, RangesKt.until(0, args.length - 1));
        Object[] allArgsButLast = $this$toTypedArray$iv.toArray(new Object[0]);
        Object r3 = args[args.length - 1];
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Int");
        int lastChanged = ((Integer) r3).intValue();
        Composer c = ((Composer) r1).startRestartGroup(this.key);
        trackRead(c);
        if (c.changed(this) == false) goto L5;
        int r4 = ComposableLambdaKt.differentBits(realParams);
    L6:
        int dirty = r4 | lastChanged;
        Object r5 = this._block;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        SpreadBuilder r6 = new SpreadBuilder(2);
        r6.addSpread(allArgsButLast);
        r6.add(Integer.valueOf(dirty));
        Object result = ((FunctionN) r5).invoke(r6.toArray(new Object[r6.size()]));
        ScopeUpdateScope r7 = c.endRestartGroup();
        if (r7 == null) goto L9;
        r7.updateScope(new AnonymousClass1(args, realParams, this));
    L9:
        return result;
    L5:
        r4 = ComposableLambdaKt.sameBits(realParams);
        goto L6
    }
}
