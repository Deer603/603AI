package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: PreviewActivity.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "()V", "TAG", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setComposableContent", "composableFqn", "setParameterizedContent", "className", "methodName", "parameterProvider", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 0;
    private final String TAG;

    static {
    }

    public PreviewActivity() {
        this.TAG = "PreviewActivity";
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) != 0) goto L6;
        Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
        finish();
        return;
    L6:
        Intent r0 = getIntent();
        if (r0 == null) goto L12;
        String it = r0.getStringExtra("composable");
        if (it == null) goto L13;
        setComposableContent(it);
        return;
    L13:
        return;
    }

    private final void setComposableContent(String composableFqn) {
        Log.d(this.TAG, "PreviewActivity has composable " + composableFqn);
        final String className = StringsKt.substringBeforeLast$default(composableFqn, '.', null, 2, null);
        final String methodName = StringsKt.substringAfterLast$default(composableFqn, '.', null, 2, null);
        String parameterProvider = getIntent().getStringExtra("parameterProviderClassName");
        if (parameterProvider == null) goto L6;
        setParameterizedContent(className, methodName, parameterProvider);
        return;
    L6:
        Log.d(this.TAG, "Previewing '" + methodName + "' without a parameter provider.");
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-840626948, true, new AnonymousClass2(className, methodName)), 1, null);
    }

    private final void setParameterizedContent(final String className, final String methodName, String parameterProvider) {
        Log.d(this.TAG, "Previewing '" + methodName + "' with parameter provider: '" + parameterProvider + '\'');
        final Object[] previewParameters = PreviewUtils_androidKt.getPreviewProviderParameters(PreviewUtils_androidKt.asPreviewProviderClass(parameterProvider), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewParameters.length <= 1) goto L5;
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-861939235, true, new AnonymousClass1(previewParameters, className, methodName)), 1, null);
        return;
    L5:
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1901447514, true, new C06672(className, methodName, previewParameters)), 1, null);
    }
}
