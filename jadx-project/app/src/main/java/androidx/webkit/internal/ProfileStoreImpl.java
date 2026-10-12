package androidx.webkit.internal;

import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileStoreImpl implements ProfileStore {
    private static ProfileStore sInstance;
    private final ProfileStoreBoundaryInterface mProfileStoreImpl;

    private ProfileStoreImpl(ProfileStoreBoundaryInterface profileStoreImpl) {
        this.mProfileStoreImpl = profileStoreImpl;
    }

    private ProfileStoreImpl() {
        this.mProfileStoreImpl = null;
    }

    public static ProfileStore getInstance() {
        if (sInstance != null) goto L6;
        sInstance = new ProfileStoreImpl(WebViewGlueCommunicator.getFactory().getProfileStore());
    L6:
        return sInstance;
    }

    @Override // androidx.webkit.ProfileStore
    public Profile getOrCreateProfile(String name) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROFILE;
        if (feature.isSupportedByWebView() == false) goto L7;
        return new ProfileImpl((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, this.mProfileStoreImpl.getOrCreateProfile(name)));
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public Profile getProfile(String name) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROFILE;
        if (feature.isSupportedByWebView() == false) goto L11;
        InvocationHandler profileBoundaryInterface = this.mProfileStoreImpl.getProfile(name);
        if (profileBoundaryInterface != null) goto L7;
        return null;
    L7:
        return new ProfileImpl((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, profileBoundaryInterface));
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public List<String> getAllProfileNames() {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROFILE;
        if (feature.isSupportedByWebView() == false) goto L7;
        return this.mProfileStoreImpl.getAllProfileNames();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String name) throws IllegalStateException {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROFILE;
        if (feature.isSupportedByWebView() == false) goto L7;
        return this.mProfileStoreImpl.deleteProfile(name);
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
