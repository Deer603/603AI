package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableState;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.FavoriteRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$14$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    final /* synthetic */ MutableState<List<FavoriteRecord>> $favorites$delegate;
    final /* synthetic */ AppRepository $repository;

    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$14$1(AppRepository r7, MutableState<List<FavoriteRecord>> r8) {
        this.$repository = r7;
        this.$favorites$delegate = r8;
        super(2, Intrinsics.Kotlin.class, "toggleFavorite", "HuiyuanApp$toggleFavorite(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String r3, String r4) {
        invoke2(r3, r4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        HuiyuanAppKt.access$HuiyuanApp$toggleFavorite(this.$repository, this.$favorites$delegate, p0, p1);
    }
}
