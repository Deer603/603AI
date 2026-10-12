package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/ui/Modifier$Node;", "requester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "shouldAutoInvalidate", "", "getShouldAutoInvalidate", "()Z", "disposeRequester", "", "onAttach", "onDetach", "updateRequester", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BringIntoViewRequesterNode extends Modifier.Node {
    public static final int $stable = 0;
    private BringIntoViewRequester requester;
    private final boolean shouldAutoInvalidate;

    static {
        $stable = 8;
    }

    public BringIntoViewRequesterNode(BringIntoViewRequester requester) {
        this.requester = requester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    public final void updateRequester(BringIntoViewRequester requester) {
        disposeRequester();
        if ((requester instanceof BringIntoViewRequesterImpl) == false) goto L5;
        ((BringIntoViewRequesterImpl) requester).getNodes().add(this);
    L5:
        this.requester = requester;
    }

    private final void disposeRequester() {
        if ((this.requester instanceof BringIntoViewRequesterImpl) == false) goto L6;
        BringIntoViewRequester r0 = this.requester;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
        ((BringIntoViewRequesterImpl) r0).getNodes().remove(this);
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }
}
