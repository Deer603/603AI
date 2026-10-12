package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public static final String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";
    private static final String EXTRA_BENCHMARK_OPERATION = "EXTRA_BENCHMARK_OPERATION";
    private static final String EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE = "DROP_SHADER_CACHE";
    private static final String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";
    private static final String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";
    private static final String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        final /* synthetic */ ProfileInstallReceiver this$0;

        ResultDiagnostics(ProfileInstallReceiver this$0) {
            this.this$0 = this$0;
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int code, Object data) {
            ProfileInstaller.LOG_DIAGNOSTICS.onDiagnosticReceived(code, data);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int code, Object data) {
            ProfileInstaller.LOG_DIAGNOSTICS.onResultReceived(code, data);
            this.this$0.setResultCode(code);
        }
    }

    public ProfileInstallReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) goto L4;
        return;
    L4:
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action) == false) goto L8;
        ProfileInstaller.writeProfile(context, new ProfileInstallReceiver$$ExternalSyntheticLambda0(), new ResultDiagnostics(this), true);
        return;
    L8:
        if (ACTION_SKIP_FILE.equals(action) == false) goto L19;
        Bundle extras = intent.getExtras();
        if (extras == null) goto L36;
        String operation = extras.getString(EXTRA_SKIP_FILE_OPERATION);
        if (EXTRA_SKIP_FILE_OPERATION_WRITE.equals(operation) == false) goto L15;
        ProfileInstaller.writeSkipFile(context, new ProfileInstallReceiver$$ExternalSyntheticLambda0(), new ResultDiagnostics(this));
        return;
    L15:
        if (EXTRA_SKIP_FILE_OPERATION_DELETE.equals(operation) == false) goto L38;
        ProfileInstaller.deleteSkipFile(context, new ProfileInstallReceiver$$ExternalSyntheticLambda0(), new ResultDiagnostics(this));
        return;
    L38:
        return;
    L36:
        return;
    L19:
        if (ACTION_SAVE_PROFILE.equals(action) == false) goto L22;
        saveProfile(new ResultDiagnostics(this));
        return;
    L22:
        if (ACTION_BENCHMARK_OPERATION.equals(action) == false) goto L32;
        Bundle extras2 = intent.getExtras();
        if (extras2 == null) goto L33;
        String operation2 = extras2.getString(EXTRA_BENCHMARK_OPERATION);
        ResultDiagnostics diagnostics = new ResultDiagnostics(this);
        if (EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE.equals(operation2) == false) goto L28;
        BenchmarkOperation.dropShaderCache(context, diagnostics);
        return;
    L28:
        diagnostics.onResultReceived(16, null);
        return;
    L33:
        return;
    }

    static void saveProfile(ProfileInstaller.DiagnosticsCallback callback) {
        Process.sendSignal(Process.myPid(), 10);
        callback.onResultReceived(12, null);
    }
}
