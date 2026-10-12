package androidx.core.app;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private final boolean mAllowFreeFormTextInput;
    private final Set<String> mAllowedDataTypes;
    private final CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    static class Api20Impl {
        private Api20Impl() {
        }

        static Bundle getResultsFromIntent(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }

        static void addResultsToIntent(Object remoteInputs, Intent intent, Bundle results) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) remoteInputs, intent, results);
        }

        static RemoteInput fromPlatform(Object srcObj) {
            android.app.RemoteInput src = (android.app.RemoteInput) srcObj;
            Builder builder = new Builder(src.getResultKey()).setLabel(src.getLabel()).setChoices(src.getChoices()).setAllowFreeFormInput(src.getAllowFreeFormInput()).addExtras(src.getExtras());
            Set<String> allowedDataTypes = Api26Impl.getAllowedDataTypes(src);
            if (allowedDataTypes == null) goto L9;
            Iterator<String> r3 = allowedDataTypes.iterator();
        L6:
            if (r3.hasNext() == false) goto L9;
            String allowedDataType = r3.next();
            builder.setAllowDataType(allowedDataType, true);
        L9:
            if (Build.VERSION.SDK_INT < 29) goto L12;
            builder.setEditChoicesBeforeSending(Api29Impl.getEditChoicesBeforeSending(src));
        L12:
            return builder.build();
        }

        public static android.app.RemoteInput fromCompat(RemoteInput src) {
            android.app.RemoteInput.Builder builder = new android.app.RemoteInput.Builder(src.getResultKey()).setLabel(src.getLabel()).setChoices(src.getChoices()).setAllowFreeFormInput(src.getAllowFreeFormInput()).addExtras(src.getExtras());
            Set<String> allowedDataTypes = src.getAllowedDataTypes();
            if (allowedDataTypes == null) goto L9;
            Iterator<String> r2 = allowedDataTypes.iterator();
        L6:
            if (r2.hasNext() == false) goto L9;
            String allowedDataType = r2.next();
            Api26Impl.setAllowDataType(builder, allowedDataType, true);
        L9:
            if (Build.VERSION.SDK_INT < 29) goto L12;
            Api29Impl.setEditChoicesBeforeSending(builder, src.getEditChoicesBeforeSending());
        L12:
            return builder.build();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Map<String, Uri> getDataResultsFromIntent(Intent intent, String remoteInputResultKey) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, remoteInputResultKey);
        }

        static Set<String> getAllowedDataTypes(Object remoteInput) {
            return ((android.app.RemoteInput) remoteInput).getAllowedDataTypes();
        }

        static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> results) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.fromCompat(remoteInput), intent, results);
        }

        static android.app.RemoteInput.Builder setAllowDataType(android.app.RemoteInput.Builder builder, String mimeType, boolean doAllow) {
            return builder.setAllowDataType(mimeType, doAllow);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void setResultsSource(Intent intent, int source) {
            android.app.RemoteInput.setResultsSource(intent, source);
        }

        static int getResultsSource(Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static int getEditChoicesBeforeSending(Object remoteInput) {
            return ((android.app.RemoteInput) remoteInput).getEditChoicesBeforeSending();
        }

        static android.app.RemoteInput.Builder setEditChoicesBeforeSending(android.app.RemoteInput.Builder builder, int editChoicesBeforeSending) {
            return builder.setEditChoicesBeforeSending(editChoicesBeforeSending);
        }
    }

    public static final class Builder {
        private boolean mAllowFreeFormTextInput;
        private final Set<String> mAllowedDataTypes;
        private CharSequence[] mChoices;
        private int mEditChoicesBeforeSending;
        private final Bundle mExtras;
        private CharSequence mLabel;
        private final String mResultKey;

        public Builder(String resultKey) {
            this.mAllowedDataTypes = new HashSet();
            this.mExtras = new Bundle();
            this.mAllowFreeFormTextInput = true;
            this.mEditChoicesBeforeSending = 0;
            if (resultKey == null) goto L7;
            this.mResultKey = resultKey;
            return;
        L7:
            throw new IllegalArgumentException("Result key can't be null");
        }

        public Builder setLabel(CharSequence label) {
            this.mLabel = label;
            return this;
        }

        public Builder setChoices(CharSequence[] choices) {
            this.mChoices = choices;
            return this;
        }

        public Builder setAllowDataType(String mimeType, boolean doAllow) {
            Set<String> r0 = this.mAllowedDataTypes;
            if (doAllow == false) goto L5;
            r0.add(mimeType);
        L6:
            return this;
        L5:
            r0.remove(mimeType);
            goto L6
        }

        public Builder setAllowFreeFormInput(boolean allowFreeFormTextInput) {
            this.mAllowFreeFormTextInput = allowFreeFormTextInput;
            return this;
        }

        public Builder setEditChoicesBeforeSending(int editChoicesBeforeSending) {
            this.mEditChoicesBeforeSending = editChoicesBeforeSending;
            return this;
        }

        public Builder addExtras(Bundle extras) {
            if (extras == null) goto L4;
            this.mExtras.putAll(extras);
        L4:
            return this;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mEditChoicesBeforeSending, this.mExtras, this.mAllowedDataTypes);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    RemoteInput(String resultKey, CharSequence label, CharSequence[] choices, boolean allowFreeFormTextInput, int editChoicesBeforeSending, Bundle extras, Set<String> allowedDataTypes) {
        this.mResultKey = resultKey;
        this.mLabel = label;
        this.mChoices = choices;
        this.mAllowFreeFormTextInput = allowFreeFormTextInput;
        this.mEditChoicesBeforeSending = editChoicesBeforeSending;
        this.mExtras = extras;
        this.mAllowedDataTypes = allowedDataTypes;
        if (getEditChoicesBeforeSending() == 2) goto L5;
        return;
    L5:
        if (getAllowFreeFormInput() == false) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
    }

    public String getResultKey() {
        return this.mResultKey;
    }

    public CharSequence getLabel() {
        return this.mLabel;
    }

    public CharSequence[] getChoices() {
        return this.mChoices;
    }

    public Set<String> getAllowedDataTypes() {
        return this.mAllowedDataTypes;
    }

    public boolean isDataOnly() {
        if (getAllowFreeFormInput() == false) goto L5;
    L13:
        return false;
    L5:
        if (getChoices() == null) goto L9;
        if (getChoices().length != 0) goto L13;
    L9:
        if (getAllowedDataTypes() == null) goto L13;
        if (getAllowedDataTypes().isEmpty() == true) goto L13;
        return true;
    }

    public boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormTextInput;
    }

    public int getEditChoicesBeforeSending() {
        return this.mEditChoicesBeforeSending;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String remoteInputResultKey) {
        return Api26Impl.getDataResultsFromIntent(intent, remoteInputResultKey);
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return Api20Impl.getResultsFromIntent(intent);
    }

    public static void addResultsToIntent(RemoteInput[] remoteInputs, Intent intent, Bundle results) {
        Api20Impl.addResultsToIntent(fromCompat(remoteInputs), intent, results);
    }

    public static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> results) {
        Api26Impl.addDataResultToIntent(remoteInput, intent, results);
    }

    public static void setResultsSource(Intent intent, int source) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Api28Impl.setResultsSource(intent, source);
        return;
    L5:
        Intent clipDataIntent = getClipDataIntentFromIntent(intent);
        if (clipDataIntent != null) goto L8;
        clipDataIntent = new Intent();
    L8:
        clipDataIntent.putExtra(EXTRA_RESULTS_SOURCE, source);
        intent.setClipData(ClipData.newIntent(RESULTS_CLIP_LABEL, clipDataIntent));
    }

    public static int getResultsSource(Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        Intent clipDataIntent = getClipDataIntentFromIntent(intent);
        if (clipDataIntent != null) goto L10;
        return 0;
    L10:
        return clipDataIntent.getExtras().getInt(EXTRA_RESULTS_SOURCE, 0);
    L5:
        return Api28Impl.getResultsSource(intent);
    }

    private static String getExtraResultsKeyForData(String mimeType) {
        return EXTRA_DATA_TYPE_RESULTS_DATA + mimeType;
    }

    static android.app.RemoteInput[] fromCompat(RemoteInput[] srcArray) {
        if (srcArray != null) goto L5;
        return null;
    L5:
        android.app.RemoteInput[] result = new android.app.RemoteInput[srcArray.length];
        int i = 0;
    L7:
        if (i >= srcArray.length) goto L9;
        result[i] = fromCompat(srcArray[i]);
        i = i + 1;
        goto L7
    L9:
        return result;
    }

    static android.app.RemoteInput fromCompat(RemoteInput src) {
        return Api20Impl.fromCompat(src);
    }

    static RemoteInput fromPlatform(android.app.RemoteInput src) {
        return Api20Impl.fromPlatform(src);
    }

    private static Intent getClipDataIntentFromIntent(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData != null) goto L5;
        return null;
    L5:
        ClipDescription clipDescription = clipData.getDescription();
        if (clipDescription.hasMimeType("text/vnd.android.intent") == true) goto L9;
        return null;
    L9:
        if (clipDescription.getLabel().toString().contentEquals(RESULTS_CLIP_LABEL) == true) goto L12;
        return null;
    L12:
        return clipData.getItemAt(0).getIntent();
    }
}
