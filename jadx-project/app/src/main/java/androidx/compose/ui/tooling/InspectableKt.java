package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.InspectionModeKt;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Inspectable.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a(\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"InInspectionModeOnly", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Inspectable", "compositionDataRecord", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "(Landroidx/compose/ui/tooling/CompositionDataRecord;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InspectableKt {
    public static final void Inspectable(final CompositionDataRecord compositionDataRecord, final Function2<? super Composer, ? super Integer, Unit> r8, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1669497937);
        ComposerKt.sourceInformation($composer2, "C(Inspectable)57@2040L146:Inspectable.android.kt#hevd2p");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r2 = $composer2.changed(compositionDataRecord);
    L8:
        if (r2 == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L13
    L10:
        r3 = 2;
        goto L11
    L7:
        r2 = $composer2.changedInstance(compositionDataRecord);
    L13:
        if (($changed & 48) != 0) goto L20;
        if ($composer2.changedInstance(r8) == false) goto L17;
        int r4 = 32;
    L18:
        $dirty = $dirty | r4;
        goto L20
    L17:
        r4 = 16;
    L20:
        if (($dirty & 19) == 18) goto L22;
        boolean r5 = true;
    L24:
        if ($composer2.shouldExecute(r5, $dirty & 1) == true) goto L26;
        $composer2.skipToGroupEnd();
    L32:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L36;
        r0.updateScope(new C06661(compositionDataRecord, r8, $changed));
        return;
    L36:
        return;
    L26:
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventStart(-1669497937, $dirty, -1, "androidx.compose.ui.tooling.Inspectable (Inspectable.android.kt:53)");
    L28:
        $composer2.collectParameterInformation();
        Intrinsics.checkNotNull(compositionDataRecord, "null cannot be cast to non-null type androidx.compose.ui.tooling.CompositionDataRecordImpl");
        Set<CompositionData> r1 = ((CompositionDataRecordImpl) compositionDataRecord).getStore();
        r1.add($composer2.getCompositionData());
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{InspectionModeKt.getLocalInspectionMode().provides(true), InspectionTablesKt.getLocalInspectionTables().provides(r1)}, r8, $composer2, ProvidedValue.$stable | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
        goto L32
    L22:
        r5 = false;
        goto L24
    }

    @Deprecated(message = "This method should not be used in application code and will be removed soon.")
    public static final void InInspectionModeOnly(final Function2<? super Composer, ? super Integer, Unit> r6, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(484868210);
        ComposerKt.sourceInformation($composer2, "C(InInspectionModeOnly)72@2603L7:Inspectable.android.kt#hevd2p");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r6) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r3 = true;
    L14:
        if ($composer2.shouldExecute(r3, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L26:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L30;
        r0.updateScope(new AnonymousClass1(r6, $changed));
        return;
    L30:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(484868210, $dirty, -1, "androidx.compose.ui.tooling.InInspectionModeOnly (Inspectable.android.kt:71)");
    L18:
        ProvidableCompositionLocal<Boolean> r1 = InspectionModeKt.getLocalInspectionMode();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (((Boolean) r4).booleanValue() == false) goto L21;
        $composer2.startReplaceGroup(-1889608988);
        ComposerKt.sourceInformation($composer2, "73@2622L9");
        r6.invoke($composer2, Integer.valueOf($dirty & 14));
        $composer2.endReplaceGroup();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventEnd();
        goto L26
    L21:
        $composer2.startReplaceGroup(-1889584963);
        $composer2.endReplaceGroup();
        goto L23
    L12:
        r3 = false;
        goto L14
    }
}
