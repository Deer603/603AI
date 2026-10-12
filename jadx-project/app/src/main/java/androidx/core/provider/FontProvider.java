package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class FontProvider {
    private static final Comparator<byte[]> sByteArrayComparator = null;
    private static final LruCache<ProviderCacheKey, ProviderInfo> sProviderCache = null;

    private interface ContentQueryWrapper {
        void close();

        Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5, CancellationSignal r6);

        static ContentQueryWrapper make(Context context, Uri uri) {
            return new ContentQueryWrapperApi24Impl(context, uri);
        }
    }

    private static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        ContentQueryWrapperApi16Impl(Context context, Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) {
            if (this.mClient != null) goto L17;
            return null;
        L17:
            return this.mClient.query(uri, projection, selection, selectionArgs, sortOrder, cancellationSignal);
        L9:
            e = move-exception;
            RemoteException e = e;
        L13:
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        L11:
            e = move-exception;
            e = e;
            goto L13
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            if (this.mClient == null) goto L6;
            this.mClient.release();
            return;
        }
    }

    private static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) {
            if (this.mClient != null) goto L17;
            return null;
        L17:
            return this.mClient.query(uri, projection, selection, selectionArgs, sortOrder, cancellationSignal);
        L9:
            e = move-exception;
            RemoteException e = e;
        L13:
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        L11:
            e = move-exception;
            e = e;
            goto L13
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            if (this.mClient == null) goto L6;
            this.mClient.close();
            return;
        }
    }

    private static class ProviderCacheKey {
        String mAuthority;
        List<List<byte[]>> mCertificates;
        String mPackageName;

        ProviderCacheKey(String authority, String packageName, List<List<byte[]>> certificates) {
            this.mAuthority = authority;
            this.mPackageName = packageName;
            this.mCertificates = certificates;
        }

        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if ((o instanceof ProviderCacheKey) == true) goto L8;
            return false;
        L8:
            ProviderCacheKey that = (ProviderCacheKey) o;
            if (Objects.equals(this.mAuthority, that.mAuthority) == false) goto L16;
            if (Objects.equals(this.mPackageName, that.mPackageName) == false) goto L16;
            if (Objects.equals(this.mCertificates, that.mCertificates) == false) goto L16;
            return true;
        L16:
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.mAuthority, this.mPackageName, this.mCertificates});
        }
    }

    private FontProvider() {
    }

    static FontsContractCompat.FontFamilyResult getFontFamilyResult(Context context, List<FontRequest> requests, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        Trace.beginSection("FontProvider.getFontFamilyResult");
        ArrayList<FontsContractCompat.FontInfo[]> queryResults = new ArrayList();     // Catch: Throwable -> L15
        int i = 0;
    L5:
        if (i >= requests.size()) goto L12;
        FontRequest request = requests.get(i);     // Catch: Throwable -> L15
        ProviderInfo providerInfo = getProvider(context.getPackageManager(), request, context.getResources());     // Catch: Throwable -> L15
        if (providerInfo == null) goto L8;
        FontsContractCompat.FontInfo[] fonts = query(context, request, providerInfo.authority, cancellationSignal);     // Catch: Throwable -> L15
        queryResults.add(fonts);     // Catch: Throwable -> L15
        i = i + 1;     // Catch: Throwable -> L15
        goto L5
    L8:
        FontsContractCompat.FontInfo[] r5 = (FontsContractCompat.FontInfo[]) null;     // Catch: Throwable -> L15
        FontsContractCompat.FontFamilyResult r4 = FontsContractCompat.FontFamilyResult.create(1, null);     // Catch: Throwable -> L15
        Trace.endSection();
        return r4;
    L12:
        FontsContractCompat.FontFamilyResult r1 = FontsContractCompat.FontFamilyResult.create(0, queryResults);     // Catch: Throwable -> L15
        Trace.endSection();
        return r1;
    L15:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    static {
        sProviderCache = new LruCache(2);
        sByteArrayComparator = new FontProvider$$ExternalSyntheticLambda0();
    }

    static void clearProviderCache() {
        sProviderCache.evictAll();
    }

    static ProviderInfo getProvider(PackageManager packageManager, FontRequest request, Resources resources) throws PackageManager.NameNotFoundException {
        Trace.beginSection("FontProvider.getProvider");
        List<List<byte[]>> requestCertificatesList = getCertificates(request, resources);     // Catch: Throwable -> L26
        ProviderCacheKey cacheKey = new ProviderCacheKey(request.getProviderAuthority(), request.getProviderPackage(), requestCertificatesList);     // Catch: Throwable -> L26
        ProviderInfo cachedPackageInfo = sProviderCache.get(cacheKey);     // Catch: Throwable -> L26
        if (cachedPackageInfo == null) goto L7;
        Trace.endSection();
        return cachedPackageInfo;
    L7:
        String providerAuthority = request.getProviderAuthority();     // Catch: Throwable -> L26
        ProviderInfo info = packageManager.resolveContentProvider(providerAuthority, 0);     // Catch: Throwable -> L26
        if (info == null) goto L25;
        if (info.packageName.equals(request.getProviderPackage()) == false) goto L23;
        PackageInfo packageInfo = packageManager.getPackageInfo(info.packageName, 64);     // Catch: Throwable -> L26
        List<byte[]> signatures = convertToByteArrayList(packageInfo.signatures);     // Catch: Throwable -> L26
        Collections.sort(signatures, sByteArrayComparator);     // Catch: Throwable -> L26
        int i = 0;
    L13:
        if (i >= requestCertificatesList.size()) goto L20;
        List<byte[]> requestSignatures = new ArrayList(requestCertificatesList.get(i));     // Catch: Throwable -> L26
        Collections.sort(requestSignatures, sByteArrayComparator);     // Catch: Throwable -> L26
        if (equalsByteArrayList(signatures, requestSignatures) == true) goto L16;
        i = i + 1;
        goto L13
    L16:
        sProviderCache.put(cacheKey, info);     // Catch: Throwable -> L26
        Trace.endSection();
        return info;
    L20:
        Trace.endSection();
        return null;
    L23:
        throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.getProviderPackage());     // Catch: Throwable -> L26
    L25:
        throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    static FontsContractCompat.FontInfo[] query(Context context, FontRequest request, String authority, CancellationSignal cancellationSignal) {
        Trace.beginSection("FontProvider.query");
        ArrayList<FontsContractCompat.FontInfo> result = new ArrayList();     // Catch: Throwable -> L56
        Uri uri = new Uri.Builder().scheme("content").authority(authority).build();     // Catch: Throwable -> L56
        Uri fileBaseUri = new Uri.Builder().scheme("content").authority(authority).appendPath("file").build();     // Catch: Throwable -> L56
        Cursor cursor = null;
        ContentQueryWrapper queryWrapper = ContentQueryWrapper.make(context, uri);     // Catch: Throwable -> L56
        String[] projection = {"_id", FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE};     // Catch: Throwable -> L50
        Trace.beginSection("ContentQueryWrapper.query");     // Catch: Throwable -> L50
        ContentQueryWrapper queryWrapper2 = queryWrapper;
        Cursor cursor2 = queryWrapper2.query(uri, projection, "query = ?", new String[]{request.getQuery()}, null, cancellationSignal);     // Catch: Throwable -> L45
    L9:
        Trace.endSection();     // Catch: Throwable -> L48
        if (cursor2 != null) goto L12;
    L40:
        if (cursor2 == null) goto L42;
        cursor2.close();     // Catch: Throwable -> L56
    L42:
        queryWrapper2.close();     // Catch: Throwable -> L56
        FontsContractCompat.FontInfo[] r0 = (FontsContractCompat.FontInfo[]) result.toArray(new FontsContractCompat.FontInfo[0]);     // Catch: Throwable -> L56
        Trace.endSection();
        return r0;
    L12:
        if (cursor2.getCount() <= 0) goto L40;
        int resultCodeColumnIndex = cursor2.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);     // Catch: Throwable -> L48
        result = new ArrayList();     // Catch: Throwable -> L48
        int idColumnIndex = cursor2.getColumnIndex("_id");     // Catch: Throwable -> L48
        int fileIdColumnIndex = cursor2.getColumnIndex(FontsContractCompat.Columns.FILE_ID);     // Catch: Throwable -> L48
        int ttcIndexColumnIndex = cursor2.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);     // Catch: Throwable -> L48
        int weightColumnIndex = cursor2.getColumnIndex(FontsContractCompat.Columns.WEIGHT);     // Catch: Throwable -> L48
        int weight = cursor2.getColumnIndex(FontsContractCompat.Columns.ITALIC);     // Catch: Throwable -> L48
    L15:
        if (cursor2.moveToNext() == false) goto L40;
        if (resultCodeColumnIndex == (-1)) goto L19;
        int resultCode = cursor2.getInt(resultCodeColumnIndex);     // Catch: Throwable -> L48
    L21:
        if (ttcIndexColumnIndex == (-1)) goto L23;
        int ttcIndex = cursor2.getInt(ttcIndexColumnIndex);     // Catch: Throwable -> L48
    L24:
        if (fileIdColumnIndex != (-1)) goto L26;
        long id = cursor2.getLong(idColumnIndex);     // Catch: Throwable -> L48
        Uri fileUri = ContentUris.withAppendedId(uri, id);     // Catch: Throwable -> L48
        Uri fileUri2 = fileUri;
    L27:
        if (weightColumnIndex == (-1)) goto L29;
        int weight2 = cursor2.getInt(weightColumnIndex);     // Catch: Throwable -> L48
    L30:
        int resultCodeColumnIndex2 = resultCodeColumnIndex;
        int resultCodeColumnIndex3 = weight;
        if (resultCodeColumnIndex3 == (-1)) goto L35;
        int italicColumnIndex = resultCodeColumnIndex3;
        if (cursor2.getInt(resultCodeColumnIndex3) != 1) goto L36;
        boolean italic = true;
    L37:
        result.add(FontsContractCompat.FontInfo.create(fileUri2, ttcIndex, weight2, italic, resultCode));     // Catch: Throwable -> L48
        weight = italicColumnIndex;
        resultCodeColumnIndex = resultCodeColumnIndex2;
    L36:
        italic = false;
        goto L37
    L35:
        italicColumnIndex = resultCodeColumnIndex3;
        goto L36
    L29:
        weight2 = 400;
        goto L30
    L26:
        long id2 = cursor2.getLong(fileIdColumnIndex);     // Catch: Throwable -> L48
        fileUri2 = ContentUris.withAppendedId(fileBaseUri, id2);     // Catch: Throwable -> L48
        goto L27
    L23:
        ttcIndex = 0;
        goto L24
    L19:
        resultCode = 0;
    L48:
        th = th;
    L52:
        if (0 == 0) goto L54;
        cursor.close();     // Catch: Throwable -> L56
    L54:
        queryWrapper2.close();     // Catch: Throwable -> L56
        throw th;     // Catch: Throwable -> L56
    L45:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L48
        throw th;     // Catch: Throwable -> L48
    L50:
        th = th;
        queryWrapper2 = queryWrapper;
    L56:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    private static List<List<byte[]>> getCertificates(FontRequest request, Resources resources) {
        if (request.getCertificates() != null) goto L5;
        int resourceId = request.getCertificatesArrayResId();
        return FontResourcesParserCompat.readCerts(resources, resourceId);
    L5:
        return request.getCertificates();
    }

    static /* synthetic */ int lambda$static$0(byte[] l, byte[] r) {
        if (l.length != r.length) goto L5;
        int i = 0;
    L8:
        if (i >= l.length) goto L14;
        if (l[i] != r[i]) goto L12;
        i = i + 1;
        goto L8
    L12:
        return l[i] - r[i];
    L14:
        return 0;
    L5:
        return l.length - r.length;
    }

    private static boolean equalsByteArrayList(List<byte[]> signatures, List<byte[]> requestSignatures) {
        if (signatures.size() == requestSignatures.size()) goto L5;
        return false;
    L5:
        int i = 0;
    L7:
        if (i >= signatures.size()) goto L12;
        if (Arrays.equals(signatures.get(i), requestSignatures.get(i)) == false) goto L10;
        i = i + 1;
        goto L7
    L10:
        return false;
    L12:
        return true;
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatures) {
        List<byte[]> shaList = new ArrayList();
        int r1 = signatures.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Signature signature = signatures[r2];
        shaList.add(signature.toByteArray());
        r2 = r2 + 1;
        goto L3
    L5:
        return shaList;
    }
}
