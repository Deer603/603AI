package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.core.content.IntentCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareCompat {
    public static final String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    public static class IntentBuilder {
        private ArrayList<String> mBccAddresses;
        private ArrayList<String> mCcAddresses;
        private CharSequence mChooserTitle;
        private final Context mContext;
        private final Intent mIntent;
        private ArrayList<Uri> mStreams;
        private ArrayList<String> mToAddresses;

        @Deprecated
        public static IntentBuilder from(Activity launchingActivity) {
            return new IntentBuilder(launchingActivity);
        }

        public IntentBuilder(Context launchingContext) {
            this.mContext = (Context) Preconditions.checkNotNull(launchingContext);
            this.mIntent = new Intent().setAction("android.intent.action.SEND");
            this.mIntent.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, launchingContext.getPackageName());
            this.mIntent.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, launchingContext.getPackageName());
            this.mIntent.addFlags(524288);
            Activity activity = null;
            Context context = launchingContext;
        L4:
            if ((context instanceof ContextWrapper) == false) goto L9;
            if ((context instanceof Activity) == true) goto L7;
            context = ((ContextWrapper) context).getBaseContext();
            goto L4
        L7:
            activity = (Activity) context;
        L9:
            if (activity == null) goto L14;
            ComponentName componentName = activity.getComponentName();
            this.mIntent.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
            this.mIntent.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
            return;
        }

        public Intent getIntent() {
            if (this.mToAddresses == null) goto L6;
            combineArrayExtra("android.intent.extra.EMAIL", this.mToAddresses);
            this.mToAddresses = null;
        L6:
            if (this.mCcAddresses == null) goto L9;
            combineArrayExtra("android.intent.extra.CC", this.mCcAddresses);
            this.mCcAddresses = null;
        L9:
            if (this.mBccAddresses == null) goto L12;
            combineArrayExtra("android.intent.extra.BCC", this.mBccAddresses);
            this.mBccAddresses = null;
        L12:
            if (this.mStreams == null) goto L16;
            boolean needsSendMultiple = true;
            if (this.mStreams.size() <= 1) goto L16;
        L17:
            Intent r0 = this.mIntent;
            if (needsSendMultiple == true) goto L25;
            r0.setAction("android.intent.action.SEND");
            if (this.mStreams != null) goto L22;
        L24:
            this.mIntent.removeExtra("android.intent.extra.STREAM");
            this.mIntent.setClipData(null);
            this.mIntent.setFlags(this.mIntent.getFlags() & (-2));
        L27:
            return this.mIntent;
        L22:
            if (this.mStreams.isEmpty() == true) goto L24;
            this.mIntent.putExtra("android.intent.extra.STREAM", this.mStreams.get(0));
            ShareCompat.migrateExtraStreamToClipData(this.mIntent, this.mStreams);
            goto L27
        L25:
            r0.setAction("android.intent.action.SEND_MULTIPLE");
            this.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.mStreams);
            ShareCompat.migrateExtraStreamToClipData(this.mIntent, this.mStreams);
        L16:
            needsSendMultiple = false;
            goto L17
        }

        Context getContext() {
            return this.mContext;
        }

        private void combineArrayExtra(String extra, ArrayList<String> add) {
            String[] currentAddresses = this.mIntent.getStringArrayExtra(extra);
            if (currentAddresses == null) goto L5;
            int currentLength = currentAddresses.length;
        L6:
            String[] finalAddresses = new String[add.size() + currentLength];
            add.toArray(finalAddresses);
            if (currentAddresses == null) goto L9;
            System.arraycopy(currentAddresses, 0, finalAddresses, add.size(), currentLength);
        L9:
            this.mIntent.putExtra(extra, finalAddresses);
            return;
        L5:
            currentLength = 0;
            goto L6
        }

        private void combineArrayExtra(String extra, String[] add) {
            Intent intent = getIntent();
            String[] old = intent.getStringArrayExtra(extra);
            if (old == null) goto L5;
            int oldLength = old.length;
        L6:
            String[] result = new String[add.length + oldLength];
            if (old == null) goto L9;
            System.arraycopy(old, 0, result, 0, oldLength);
        L9:
            System.arraycopy(add, 0, result, oldLength, add.length);
            intent.putExtra(extra, result);
            return;
        L5:
            oldLength = 0;
            goto L6
        }

        public Intent createChooserIntent() {
            return Intent.createChooser(getIntent(), this.mChooserTitle);
        }

        public void startChooser() {
            this.mContext.startActivity(createChooserIntent());
        }

        public IntentBuilder setChooserTitle(CharSequence title) {
            this.mChooserTitle = title;
            return this;
        }

        public IntentBuilder setChooserTitle(int resId) {
            return setChooserTitle(this.mContext.getText(resId));
        }

        public IntentBuilder setType(String mimeType) {
            this.mIntent.setType(mimeType);
            return this;
        }

        public IntentBuilder setText(CharSequence text) {
            this.mIntent.putExtra("android.intent.extra.TEXT", text);
            return this;
        }

        public IntentBuilder setHtmlText(String htmlText) {
            this.mIntent.putExtra(IntentCompat.EXTRA_HTML_TEXT, htmlText);
            if (this.mIntent.hasExtra("android.intent.extra.TEXT") == true) goto L5;
            setText(Html.fromHtml(htmlText));
        L5:
            return this;
        }

        public IntentBuilder setStream(Uri streamUri) {
            this.mStreams = null;
            if (streamUri == null) goto L5;
            addStream(streamUri);
        L5:
            return this;
        }

        public IntentBuilder addStream(Uri streamUri) {
            if (this.mStreams != null) goto L5;
            this.mStreams = new ArrayList();
        L5:
            this.mStreams.add(streamUri);
            return this;
        }

        public IntentBuilder setEmailTo(String[] addresses) {
            if (this.mToAddresses == null) goto L5;
            this.mToAddresses = null;
        L5:
            this.mIntent.putExtra("android.intent.extra.EMAIL", addresses);
            return this;
        }

        public IntentBuilder addEmailTo(String address) {
            if (this.mToAddresses != null) goto L5;
            this.mToAddresses = new ArrayList();
        L5:
            this.mToAddresses.add(address);
            return this;
        }

        public IntentBuilder addEmailTo(String[] addresses) {
            combineArrayExtra("android.intent.extra.EMAIL", addresses);
            return this;
        }

        public IntentBuilder setEmailCc(String[] addresses) {
            this.mIntent.putExtra("android.intent.extra.CC", addresses);
            return this;
        }

        public IntentBuilder addEmailCc(String address) {
            if (this.mCcAddresses != null) goto L5;
            this.mCcAddresses = new ArrayList();
        L5:
            this.mCcAddresses.add(address);
            return this;
        }

        public IntentBuilder addEmailCc(String[] addresses) {
            combineArrayExtra("android.intent.extra.CC", addresses);
            return this;
        }

        public IntentBuilder setEmailBcc(String[] addresses) {
            this.mIntent.putExtra("android.intent.extra.BCC", addresses);
            return this;
        }

        public IntentBuilder addEmailBcc(String address) {
            if (this.mBccAddresses != null) goto L5;
            this.mBccAddresses = new ArrayList();
        L5:
            this.mBccAddresses.add(address);
            return this;
        }

        public IntentBuilder addEmailBcc(String[] addresses) {
            combineArrayExtra("android.intent.extra.BCC", addresses);
            return this;
        }

        public IntentBuilder setSubject(String subject) {
            this.mIntent.putExtra("android.intent.extra.SUBJECT", subject);
            return this;
        }
    }

    public static class IntentReader {
        private static final String TAG = "IntentReader";
        private final ComponentName mCallingActivity;
        private final String mCallingPackage;
        private final Context mContext;
        private final Intent mIntent;
        private ArrayList<Uri> mStreams;

        @Deprecated
        public static IntentReader from(Activity activity) {
            return new IntentReader(activity);
        }

        public IntentReader(Activity activity) {
            this((Context) Preconditions.checkNotNull(activity), activity.getIntent());
        }

        public IntentReader(Context context, Intent intent) {
            this.mContext = (Context) Preconditions.checkNotNull(context);
            this.mIntent = (Intent) Preconditions.checkNotNull(intent);
            this.mCallingPackage = ShareCompat.getCallingPackage(intent);
            this.mCallingActivity = ShareCompat.getCallingActivity(intent);
        }

        public boolean isShareIntent() {
            String action = this.mIntent.getAction();
            if ("android.intent.action.SEND".equals(action) == false) goto L5;
        L8:
            return true;
        L5:
            if ("android.intent.action.SEND_MULTIPLE".equals(action) == true) goto L8;
            return false;
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.mIntent.getAction());
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.mIntent.getAction());
        }

        public String getType() {
            return this.mIntent.getType();
        }

        public CharSequence getText() {
            return this.mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public String getHtmlText() {
            String result = this.mIntent.getStringExtra(IntentCompat.EXTRA_HTML_TEXT);
            if (result != null) goto L10;
            CharSequence text = getText();
            if ((text instanceof Spanned) == true) goto L11;
            if (text != null) goto L9;
            return result;
        L9:
            return Html.escapeHtml(text);
        L11:
            return Html.toHtml((Spanned) text);
        L10:
            return result;
        }

        public Uri getStream() {
            return (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
        }

        public Uri getStream(int index) {
            if (this.mStreams != null) goto L8;
            if (isMultipleShare() == false) goto L8;
            this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        L8:
            if (this.mStreams != null) goto L10;
            if (index != 0) goto L15;
            return (Uri) this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
        L15:
            throw new IndexOutOfBoundsException("Stream items available: " + getStreamCount() + " index requested: " + index);
        L10:
            return this.mStreams.get(index);
        }

        public int getStreamCount() {
            if (this.mStreams != null) goto L8;
            if (isMultipleShare() == false) goto L8;
            this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        L8:
            if (this.mStreams == null) goto L12;
            return this.mStreams.size();
        L12:
            return this.mIntent.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        public String[] getEmailTo() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public String[] getEmailCc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.CC");
        }

        public String[] getEmailBcc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.BCC");
        }

        public String getSubject() {
            return this.mIntent.getStringExtra("android.intent.extra.SUBJECT");
        }

        public String getCallingPackage() {
            return this.mCallingPackage;
        }

        public ComponentName getCallingActivity() {
            return this.mCallingActivity;
        }

        public Drawable getCallingActivityIcon() {
            if (this.mCallingActivity != null) goto L5;
            return null;
        L5:
            PackageManager pm = this.mContext.getPackageManager();
            return pm.getActivityIcon(this.mCallingActivity);
        L8:
            e = move-exception;
            Log.e(TAG, "Could not retrieve icon for calling activity", e);
            return null;
        }

        public Drawable getCallingApplicationIcon() {
            if (this.mCallingPackage != null) goto L5;
            return null;
        L5:
            PackageManager pm = this.mContext.getPackageManager();
            return pm.getApplicationIcon(this.mCallingPackage);
        L8:
            e = move-exception;
            Log.e(TAG, "Could not retrieve icon for calling application", e);
            return null;
        }

        public CharSequence getCallingApplicationLabel() {
            if (this.mCallingPackage != null) goto L5;
            return null;
        L5:
            PackageManager pm = this.mContext.getPackageManager();
            return pm.getApplicationLabel(pm.getApplicationInfo(this.mCallingPackage, 0));
        L8:
            e = move-exception;
            Log.e(TAG, "Could not retrieve label for calling application", e);
            return null;
        }
    }

    private ShareCompat() {
    }

    public static String getCallingPackage(Activity calledActivity) {
        Intent intent = calledActivity.getIntent();
        String result = calledActivity.getCallingPackage();
        if (result != null) goto L7;
        if (intent != null) goto L6;
        return result;
    L6:
        return getCallingPackage(intent);
    L7:
        return result;
    }

    static String getCallingPackage(Intent intent) {
        String result = intent.getStringExtra(EXTRA_CALLING_PACKAGE);
        if (result == null) goto L5;
        return result;
    L5:
        return intent.getStringExtra(EXTRA_CALLING_PACKAGE_INTEROP);
    }

    public static ComponentName getCallingActivity(Activity calledActivity) {
        Intent intent = calledActivity.getIntent();
        ComponentName result = calledActivity.getCallingActivity();
        if (result == null) goto L5;
        return result;
    L5:
        return getCallingActivity(intent);
    }

    static ComponentName getCallingActivity(Intent intent) {
        ComponentName result = (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY);
        if (result == null) goto L5;
        return result;
    L5:
        return (ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY_INTEROP);
    }

    @Deprecated
    public static void configureMenuItem(MenuItem item, IntentBuilder shareIntent) {
        ActionProvider itemProvider = item.getActionProvider();
        if ((itemProvider instanceof ShareActionProvider) == true) goto L5;
        ShareActionProvider provider = new ShareActionProvider(shareIntent.getContext());
    L6:
        provider.setShareHistoryFileName(HISTORY_FILENAME_PREFIX + shareIntent.getContext().getClass().getName());
        provider.setShareIntent(shareIntent.getIntent());
        item.setActionProvider(provider);
        return;
    L5:
        provider = (ShareActionProvider) itemProvider;
        goto L6
    }

    @Deprecated
    public static void configureMenuItem(Menu menu, int menuItemId, IntentBuilder shareIntent) {
        MenuItem item = menu.findItem(menuItemId);
        if (item == null) goto L7;
        configureMenuItem(item, shareIntent);
        return;
    L7:
        throw new IllegalArgumentException("Could not find menu item with id " + menuItemId + " in the supplied menu");
    }

    static void migrateExtraStreamToClipData(Intent intent, ArrayList<Uri> streams) {
        CharSequence text = intent.getCharSequenceExtra("android.intent.extra.TEXT");
        String htmlText = intent.getStringExtra(IntentCompat.EXTRA_HTML_TEXT);
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(text, htmlText, null, streams.get(0)));
        int i = 1;
        int end = streams.size();
    L3:
        if (i >= end) goto L5;
        Uri uri = streams.get(i);
        clipData.addItem(new ClipData.Item(uri));
        i = i + 1;
        goto L3
    L5:
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
