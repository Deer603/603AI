package com.android.tools.r8.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
@SynthesizedClassV2(apiLevel = 26, kind = 5, versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public /* synthetic */ @interface LambdaMethod {
    String holder();

    String method();

    String proto();
}
