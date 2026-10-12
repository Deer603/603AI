package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SecureFlagPolicy.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"shouldApplySecureFlag", "", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SecureFlagPolicy_androidKt {

    /* JADX INFO: compiled from: SecureFlagPolicy.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[SecureFlagPolicy.values().length];
            r0[SecureFlagPolicy.SecureOff.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[SecureFlagPolicy.SecureOn.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[SecureFlagPolicy.Inherit.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final boolean shouldApplySecureFlag(SecureFlagPolicy $this$shouldApplySecureFlag, boolean isSecureFlagSetOnParent) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$shouldApplySecureFlag.ordinal()]) {
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L10;
            default: goto L5;
        };
    L7:
        return true;
    L8:
        return false;
    L5:
        throw new NoWhenBranchMatchedException();
    L10:
        return isSecureFlagSetOnParent;
    }
}
