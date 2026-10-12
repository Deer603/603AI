package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "isFallbackLineSpacingEnabled", "", "layout", "useFallbackLineSpacing", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {
    public static final Companion Companion = null;
    private static boolean isInitialized;
    private static Constructor<StaticLayout> staticLayoutConstructor;

    /* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;", "", "()V", "isInitialized", "", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "getStaticLayoutConstructor", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ Constructor access$getStaticLayoutConstructor(Companion $this) {
            return $this.getStaticLayoutConstructor();
        }

        private final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (StaticLayoutFactoryDefault.access$isInitialized$cp() == true) goto L5;
            StaticLayoutFactoryDefault.access$setInitialized$cp(true);
            StaticLayoutFactoryDefault.access$setStaticLayoutConstructor$cp(StaticLayout.class.getConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE}));     // Catch: NoSuchMethodException -> L9
        L12:
            return StaticLayoutFactoryDefault.access$getStaticLayoutConstructor$cp();
        L10:
            StaticLayoutFactoryDefault.access$setStaticLayoutConstructor$cp(null);
            Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            goto L12
        L5:
            return StaticLayoutFactoryDefault.access$getStaticLayoutConstructor$cp();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public StaticLayoutFactoryDefault() {
    }

    public static final /* synthetic */ Constructor access$getStaticLayoutConstructor$cp() {
        return staticLayoutConstructor;
    }

    public static final /* synthetic */ boolean access$isInitialized$cp() {
        return isInitialized;
    }

    public static final /* synthetic */ void access$setInitialized$cp(boolean r0) {
        isInitialized = r0;
    }

    public static final /* synthetic */ void access$setStaticLayoutConstructor$cp(Constructor r0) {
        staticLayoutConstructor = r0;
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public StaticLayout create(StaticLayoutParams params) {
        Constructor it = Companion.access$getStaticLayoutConstructor(Companion);
        StaticLayout result = null;
        if (it != null) goto L19;
    L15:
        if (result == null) goto L18;
        return result;
    L18:
        return new StaticLayout(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth(), params.getAlignment(), params.getLineSpacingMultiplier(), params.getLineSpacingExtra(), params.getIncludePadding(), params.getEllipsize(), params.getEllipsizedWidth());
    L19:
        result = (StaticLayout) it.newInstance(new Object[]{params.getText(), Integer.valueOf(params.getStart()), Integer.valueOf(params.getEnd()), params.getPaint(), Integer.valueOf(params.getWidth()), params.getAlignment(), params.getTextDir(), Float.valueOf(params.getLineSpacingMultiplier()), Float.valueOf(params.getLineSpacingExtra()), Boolean.valueOf(params.getIncludePadding()), params.getEllipsize(), Integer.valueOf(params.getEllipsizedWidth()), Integer.valueOf(params.getMaxLines())});     // Catch: InvocationTargetException -> L7 InstantiationException -> L9 IllegalAccessException -> L11
        goto L15
    L12:
        staticLayoutConstructor = null;
        Log.e("StaticLayoutFactory", "unable to call constructor");
    L10:
        staticLayoutConstructor = null;
        Log.e("StaticLayoutFactory", "unable to call constructor");
    L8:
        staticLayoutConstructor = null;
        Log.e("StaticLayoutFactory", "unable to call constructor");
        goto L15
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(StaticLayout layout, boolean useFallbackLineSpacing) {
        return false;
    }
}
