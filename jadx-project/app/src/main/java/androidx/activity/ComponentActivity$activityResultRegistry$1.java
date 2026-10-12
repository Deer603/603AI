package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\t2\u0006\u0010\n\u001a\u0002H\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$activityResultRegistry$1", "Landroidx/activity/result/ActivityResultRegistry;", "onLaunch", "", "I", "O", "requestCode", "", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComponentActivity$activityResultRegistry$1 extends ActivityResultRegistry {
    final /* synthetic */ ComponentActivity this$0;

    ComponentActivity$activityResultRegistry$1(ComponentActivity $receiver) {
        this.this$0 = $receiver;
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public <I, O> void onLaunch(final int requestCode, ActivityResultContract<I, O> r18, I r19, ActivityOptionsCompat options) {
        Intrinsics.checkNotNullParameter(r18, "contract");
        ComponentActivity activity = this.this$0;
        final ActivityResultContract.SynchronousResult<O> r13 = r18.getSynchronousResult(activity, r19);
        if (r13 == null) goto L6;
        new Handler(Looper.getMainLooper()).post(new ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda0(this, requestCode, r13));
        return;
    L6:
        Intent intent = r18.createIntent(activity, r19);
        if (intent.getExtras() == null) goto L12;
        Bundle r2 = intent.getExtras();
        Intrinsics.checkNotNull(r2);
        if (r2.getClassLoader() != null) goto L12;
        intent.setExtrasClassLoader(activity.getClassLoader());
    L12:
        if (intent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE) == false) goto L14;
        Bundle optionsBundle = intent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
        intent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
        Bundle optionsBundle2 = optionsBundle;
    L18:
        if (Intrinsics.areEqual(ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS, intent.getAction()) == false) goto L24;
        String[] permissions = intent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
        if (permissions != null) goto L22;
        permissions = new String[0];
    L22:
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
        return;
    L24:
        if (Intrinsics.areEqual(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST, intent.getAction()) == false) goto L30;
        IntentSenderRequest request = (IntentSenderRequest) intent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
        Intrinsics.checkNotNull(request);     // Catch: IntentSender.SendIntentException -> L28
        ActivityCompat.startIntentSenderForResult(activity, request.getIntentSender(), requestCode, request.getFillInIntent(), request.getFlagsMask(), request.getFlagsValues(), 0, optionsBundle2);     // Catch: IntentSender.SendIntentException -> L28
        return;
    L28:
        e = move-exception;
        new Handler(Looper.getMainLooper()).post(new ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda1(this, requestCode, e));
        return;
    L30:
        ActivityCompat.startActivityForResult(activity, intent, requestCode, optionsBundle2);
        return;
    L14:
        if (options == null) goto L16;
        Bundle optionsBundle3 = options.toBundle();
        optionsBundle2 = optionsBundle3;
        goto L18
    L16:
        optionsBundle2 = null;
        goto L18
    }

    static final void onLaunch$lambda$0(ComponentActivity$activityResultRegistry$1 this$0, int $requestCode, ActivityResultContract.SynchronousResult $synchronousResult) {
        this$0.dispatchResult($requestCode, $synchronousResult.getValue());
    }

    static final void onLaunch$lambda$1(ComponentActivity$activityResultRegistry$1 this$0, int $requestCode, IntentSender.SendIntentException $e) {
        this$0.dispatchResult($requestCode, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, $e));
    }
}
