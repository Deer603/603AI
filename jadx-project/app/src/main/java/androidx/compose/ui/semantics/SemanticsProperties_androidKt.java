package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: SemanticsProperties.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\"5\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b*\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"<set-?>", "", "testTagsAsResourceId", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getTestTagsAsResourceId$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getTestTagsAsResourceId$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setTestTagsAsResourceId", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = null;

    public static /* synthetic */ void getTestTagsAsResourceId$annotations(SemanticsPropertyReceiver r0) {
    }

    static {
        $$delegatedProperties = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver $this$testTagsAsResourceId) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue($this$testTagsAsResourceId, $$delegatedProperties[0]).booleanValue();
    }

    private static Object getTestTagsAsResourceId$delegate(SemanticsPropertyReceiver r1) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver $this$testTagsAsResourceId, boolean r4) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue($this$testTagsAsResourceId, $$delegatedProperties[0], Boolean.valueOf(r4));
    }
}
