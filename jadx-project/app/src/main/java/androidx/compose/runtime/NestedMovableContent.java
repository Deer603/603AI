package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/NestedMovableContent;", "", "content", "Landroidx/compose/runtime/MovableContentStateReference;", "container", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "getContainer", "()Landroidx/compose/runtime/MovableContentStateReference;", "getContent", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class NestedMovableContent {
    private final MovableContentStateReference container;
    private final MovableContentStateReference content;

    public NestedMovableContent(MovableContentStateReference content, MovableContentStateReference container) {
        this.content = content;
        this.container = container;
    }

    public final MovableContentStateReference getContent() {
        return this.content;
    }

    public final MovableContentStateReference getContainer() {
        return this.container;
    }
}
