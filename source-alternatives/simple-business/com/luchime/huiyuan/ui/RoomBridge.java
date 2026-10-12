package com.luchime.huiyuan.ui;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoomScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/luchime/huiyuan/ui/RoomBridge;", "", "onOpenModel", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "openModel", "characterId", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class RoomBridge {
    private final Function1<String, Unit> onOpenModel;

    /* JADX WARN: Multi-variable type inference failed */
    public RoomBridge(Function1<? super String, Unit> r2) {
        Intrinsics.checkNotNullParameter(r2, "onOpenModel");
        this.onOpenModel = r2;
    }

    @JavascriptInterface
    public final void openModel(String characterId) {
        Intrinsics.checkNotNullParameter(characterId, "characterId");
        this.onOpenModel.invoke(characterId);
    }
}
