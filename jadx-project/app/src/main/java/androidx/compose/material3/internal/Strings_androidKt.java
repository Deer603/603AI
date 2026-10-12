package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"getString", "", "string", "Landroidx/compose/material3/internal/Strings;", "getString-2EP1pXo", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "getString-qBjtwXw", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Strings_androidKt {
    /* JADX INFO: renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m3101getString2EP1pXo(int string, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -907677715, "C(getString)P(0:c#material3.internal.Strings)31@1161L7,32@1202L7:Strings.android.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-907677715, $changed, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
    L5:
        ProvidableCompositionLocal<Configuration> r0 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        CompositionLocal this_$iv = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(this_$iv);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Resources resources = ((Context) r3).getResources();
        String r1 = resources.getString(string);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    }

    /* JADX INFO: renamed from: getString-qBjtwXw, reason: not valid java name */
    public static final String m3102getStringqBjtwXw(int string, Object[] formatArgs, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1427268608, "C(getString)P(1:c#material3.internal.Strings)39@1395L17,41@1488L7:Strings.android.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1427268608, $changed, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
    L5:
        String raw = m3101getString2EP1pXo(string, $composer, $changed & 14);
        ProvidableCompositionLocal<Configuration> r1 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Locale locale = ConfigurationCompat.getLocales((Configuration) r4).get(0);
        if (locale != null) goto L8;
        locale = Locale.getDefault();
    L8:
        StringCompanionObject r2 = StringCompanionObject.INSTANCE;
        Object[] r3 = Arrays.copyOf(formatArgs, formatArgs.length);
        String r5 = String.format(locale, raw, Arrays.copyOf(r3, r3.length));
        Intrinsics.checkNotNullExpressionValue(r5, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    }
}
