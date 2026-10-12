package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultEmojiCompatConfig {

    public static class DefaultEmojiCompatConfigFactory {
        private static final String DEFAULT_EMOJI_QUERY = "emojicompat-emoji-font";
        private static final String INTENT_LOAD_EMOJI_FONT = "androidx.content.action.LOAD_EMOJI_FONT";
        private static final String TAG = "emoji2.text.DefaultEmojiConfig";
        private final DefaultEmojiCompatConfigHelper mHelper;

        public DefaultEmojiCompatConfigFactory(DefaultEmojiCompatConfigHelper helper) {
            if (helper == null) goto L5;
            DefaultEmojiCompatConfigHelper r0 = helper;
        L6:
            this.mHelper = r0;
            return;
        L5:
            r0 = getHelperForApi();
            goto L6
        }

        public EmojiCompat.Config create(Context context) {
            return configOrNull(context, queryForDefaultFontRequest(context));
        }

        private EmojiCompat.Config configOrNull(Context context, FontRequest fontRequest) {
            if (fontRequest != null) goto L6;
            return null;
        L6:
            return new FontRequestEmojiCompatConfig(context, fontRequest);
        }

        FontRequest queryForDefaultFontRequest(Context context) {
            PackageManager packageManager = context.getPackageManager();
            Preconditions.checkNotNull(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfo = queryDefaultInstalledContentProvider(packageManager);
            if (providerInfo != null) goto L10;
            return null;
        L10:
            return generateFontRequestFrom(providerInfo, packageManager);
        L7:
            e = move-exception;
            Log.wtf(TAG, e);
            return null;
        }

        private ProviderInfo queryDefaultInstalledContentProvider(PackageManager packageManager) {
            List<ResolveInfo> providers = this.mHelper.queryIntentContentProviders(packageManager, new Intent(INTENT_LOAD_EMOJI_FONT), 0);
            Iterator<ResolveInfo> r1 = providers.iterator();
        L4:
            if (r1.hasNext() == false) goto L9;
            ResolveInfo resolveInfo = r1.next();
            ProviderInfo providerInfo = this.mHelper.getProviderInfo(resolveInfo);
            if (hasFlagSystem(providerInfo) == false) goto L4;
            return providerInfo;
        L9:
            return null;
        }

        private boolean hasFlagSystem(ProviderInfo providerInfo) {
            if (providerInfo != null) goto L4;
        L8:
            return false;
        L4:
            if (providerInfo.applicationInfo == null) goto L8;
            if ((providerInfo.applicationInfo.flags & 1) != 1) goto L8;
            return true;
        }

        private FontRequest generateFontRequestFrom(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String providerAuthority = providerInfo.authority;
            String providerPackage = providerInfo.packageName;
            Signature[] signingSignatures = this.mHelper.getSigningSignatures(packageManager, providerPackage);
            List<List<byte[]>> signatures = convertToByteArray(signingSignatures);
            return new FontRequest(providerAuthority, providerPackage, DEFAULT_EMOJI_QUERY, signatures);
        }

        private List<List<byte[]>> convertToByteArray(Signature[] signatures) {
            List<byte[]> shaList = new ArrayList();
            int r1 = signatures.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L6;
            Signature signature = signatures[r2];
            shaList.add(signature.toByteArray());
            r2 = r2 + 1;
            goto L3
        L6:
            return Collections.singletonList(shaList);
        }

        private static DefaultEmojiCompatConfigHelper getHelperForApi() {
            if (Build.VERSION.SDK_INT < 28) goto L7;
            return new DefaultEmojiCompatConfigHelper_API28();
        L7:
            return new DefaultEmojiCompatConfigHelper_API19();
        }
    }

    public static class DefaultEmojiCompatConfigHelper {
        public DefaultEmojiCompatConfigHelper() {
        }

        public Signature[] getSigningSignatures(PackageManager packageManager, String providerPackage) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfoForSignatures = packageManager.getPackageInfo(providerPackage, 64);
            return packageInfoForSignatures.signatures;
        }

        public List<ResolveInfo> queryIntentContentProviders(PackageManager packageManager, Intent intent, int flags) {
            return Collections.emptyList();
        }

        public ProviderInfo getProviderInfo(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        public DefaultEmojiCompatConfigHelper_API19() {
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public List<ResolveInfo> queryIntentContentProviders(PackageManager packageManager, Intent intent, int flags) {
            return packageManager.queryIntentContentProviders(intent, flags);
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public ProviderInfo getProviderInfo(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        public DefaultEmojiCompatConfigHelper_API28() {
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public Signature[] getSigningSignatures(PackageManager packageManager, String providerPackage) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfoForSignatures = packageManager.getPackageInfo(providerPackage, 64);
            return packageInfoForSignatures.signatures;
        }
    }

    private DefaultEmojiCompatConfig() {
    }

    public static FontRequestEmojiCompatConfig create(Context context) {
        return (FontRequestEmojiCompatConfig) new DefaultEmojiCompatConfigFactory(null).create(context);
    }
}
