package androidx.core.content;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class IntentSanitizer {
    private static final String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private Predicate<String> mAllowedActions;
    private Predicate<String> mAllowedCategories;
    private Predicate<ClipData> mAllowedClipData;
    private Predicate<Uri> mAllowedClipDataUri;
    private Predicate<ComponentName> mAllowedComponents;
    private Predicate<Uri> mAllowedData;
    private Map<String, Predicate<Object>> mAllowedExtras;
    private int mAllowedFlags;
    private Predicate<String> mAllowedPackages;
    private Predicate<String> mAllowedTypes;

    /* JADX INFO: renamed from: androidx.core.content.IntentSanitizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static Intent setIdentifier(Intent intent, String identifier) {
            return intent.setIdentifier(identifier);
        }

        static String getIdentifier(Intent intent) {
            return intent.getIdentifier();
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> penalty) {
            if (item.getHtmlText() == null) goto L5;
        L8:
            penalty.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            return;
        L5:
            if (item.getIntent() != null) goto L8;
            if (item.getTextLinks() != null) goto L8;
        }
    }

    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowClipDataText;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private Predicate<String> mAllowedActions;
        private Predicate<String> mAllowedCategories;
        private Predicate<ClipData> mAllowedClipData;
        private Predicate<Uri> mAllowedClipDataUri;
        private Predicate<ComponentName> mAllowedComponents;
        private Predicate<Uri> mAllowedData;
        private Map<String, Predicate<Object>> mAllowedExtras;
        private int mAllowedFlags;
        private Predicate<String> mAllowedPackages;
        private Predicate<String> mAllowedTypes;

        public static /* synthetic */ boolean $r8$lambda$DvjTS4tHjUqRA2QfyccBu7fhDzE(String r0, Object r1) {
            return r0.equals(r1);
        }

        public static /* synthetic */ boolean $r8$lambda$HF7enmHP1Z3cPiyI1KCE8M8gPts(ComponentName r0, Object r1) {
            return r0.equals(r1);
        }

        public Builder() {
            this.mAllowedActions = new IntentSanitizer$Builder$$ExternalSyntheticLambda1();
            this.mAllowedData = new IntentSanitizer$Builder$$ExternalSyntheticLambda2();
            this.mAllowedTypes = new IntentSanitizer$Builder$$ExternalSyntheticLambda3();
            this.mAllowedCategories = new IntentSanitizer$Builder$$ExternalSyntheticLambda4();
            this.mAllowedPackages = new IntentSanitizer$Builder$$ExternalSyntheticLambda5();
            this.mAllowedComponents = new IntentSanitizer$Builder$$ExternalSyntheticLambda6();
            this.mAllowedExtras = new HashMap();
            this.mAllowClipDataText = false;
            this.mAllowedClipDataUri = new IntentSanitizer$Builder$$ExternalSyntheticLambda7();
            this.mAllowedClipData = new IntentSanitizer$Builder$$ExternalSyntheticLambda8();
        }

        static /* synthetic */ boolean lambda$new$0(String v) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$1(Uri v) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$2(String v) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$3(String v) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$4(String v) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$5(ComponentName v) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$6(Uri v) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$7(ClipData v) {
            return false;
        }

        public Builder allowFlags(int flags) {
            this.mAllowedFlags |= flags;
            return this;
        }

        public Builder allowHistoryStackFlags() {
            this.mAllowedFlags |= HISTORY_STACK_FLAGS;
            return this;
        }

        public Builder allowReceiverFlags() {
            this.mAllowedFlags |= RECEIVER_FLAGS;
            return this;
        }

        public Builder allowAction(String action) {
            Preconditions.checkNotNull(action);
            Objects.requireNonNull(action);
            allowAction(new IntentSanitizer$Builder$$ExternalSyntheticLambda10(action));
            return this;
        }

        public Builder allowAction(Predicate<String> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowedActions = this.mAllowedActions.or(filter);
            return this;
        }

        public Builder allowDataWithAuthority(final String authority) {
            Preconditions.checkNotNull(authority);
            allowData(new IntentSanitizer$Builder$$ExternalSyntheticLambda12(authority));
            return this;
        }

        static /* synthetic */ boolean lambda$allowDataWithAuthority$8(String authority, Uri v) {
            return authority.equals(v.getAuthority());
        }

        public Builder allowData(Predicate<Uri> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowedData = this.mAllowedData.or(filter);
            return this;
        }

        public Builder allowType(String type) {
            Preconditions.checkNotNull(type);
            Objects.requireNonNull(type);
            return allowType(new IntentSanitizer$Builder$$ExternalSyntheticLambda10(type));
        }

        public Builder allowType(Predicate<String> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowedTypes = this.mAllowedTypes.or(filter);
            return this;
        }

        public Builder allowCategory(String category) {
            Preconditions.checkNotNull(category);
            Objects.requireNonNull(category);
            return allowCategory(new IntentSanitizer$Builder$$ExternalSyntheticLambda10(category));
        }

        public Builder allowCategory(Predicate<String> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowedCategories = this.mAllowedCategories.or(filter);
            return this;
        }

        public Builder allowPackage(String packageName) {
            Preconditions.checkNotNull(packageName);
            Objects.requireNonNull(packageName);
            return allowPackage(new IntentSanitizer$Builder$$ExternalSyntheticLambda10(packageName));
        }

        public Builder allowPackage(Predicate<String> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowedPackages = this.mAllowedPackages.or(filter);
            return this;
        }

        public Builder allowComponent(final ComponentName component) {
            Preconditions.checkNotNull(component);
            Objects.requireNonNull(component);
            return allowComponent(new IntentSanitizer$Builder$$ExternalSyntheticLambda14(component));
        }

        public Builder allowComponent(Predicate<ComponentName> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowSomeComponents = true;
            this.mAllowedComponents = this.mAllowedComponents.or(filter);
            return this;
        }

        public Builder allowComponentWithPackage(final String packageName) {
            Preconditions.checkNotNull(packageName);
            return allowComponent(new IntentSanitizer$Builder$$ExternalSyntheticLambda11(packageName));
        }

        static /* synthetic */ boolean lambda$allowComponentWithPackage$9(String packageName, ComponentName v) {
            return packageName.equals(v.getPackageName());
        }

        public Builder allowAnyComponent() {
            this.mAllowAnyComponent = true;
            this.mAllowedComponents = new IntentSanitizer$Builder$$ExternalSyntheticLambda15();
            return this;
        }

        static /* synthetic */ boolean lambda$allowAnyComponent$10(ComponentName v) {
            return true;
        }

        public Builder allowClipDataText() {
            this.mAllowClipDataText = true;
            return this;
        }

        public Builder allowClipDataUriWithAuthority(final String authority) {
            Preconditions.checkNotNull(authority);
            return allowClipDataUri(new IntentSanitizer$Builder$$ExternalSyntheticLambda16(authority));
        }

        static /* synthetic */ boolean lambda$allowClipDataUriWithAuthority$11(String authority, Uri v) {
            return authority.equals(v.getAuthority());
        }

        public Builder allowClipDataUri(Predicate<Uri> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowedClipDataUri = this.mAllowedClipDataUri.or(filter);
            return this;
        }

        public Builder allowClipData(Predicate<ClipData> filter) {
            Preconditions.checkNotNull(filter);
            this.mAllowedClipData = this.mAllowedClipData.or(filter);
            return this;
        }

        static /* synthetic */ boolean lambda$allowExtra$12(Object v) {
            return true;
        }

        public Builder allowExtra(String key, Class<?> clazz) {
            return allowExtra(key, clazz, new IntentSanitizer$Builder$$ExternalSyntheticLambda9());
        }

        public <T> Builder allowExtra(String key, final Class<T> clazz, final Predicate<T> valueFilter) {
            Preconditions.checkNotNull(key);
            Preconditions.checkNotNull(clazz);
            Preconditions.checkNotNull(valueFilter);
            return allowExtra(key, new IntentSanitizer$Builder$$ExternalSyntheticLambda13(clazz, valueFilter));
        }

        static /* synthetic */ boolean lambda$allowExtra$13(Class clazz, Predicate valueFilter, Object v) {
            if (clazz.isInstance(v) == true) goto L5;
        L7:
            return false;
        L5:
            if (valueFilter.test(clazz.cast(v)) == false) goto L7;
            return true;
        }

        public Builder allowExtra(String key, Predicate<Object> filter) {
            Preconditions.checkNotNull(key);
            Preconditions.checkNotNull(filter);
            Predicate<Object> allowedExtra = this.mAllowedExtras.get(key);
            if (allowedExtra != null) goto L5;
            allowedExtra = new IntentSanitizer$Builder$$ExternalSyntheticLambda17();
        L5:
            Predicate<Object> allowedExtra2 = allowedExtra.or(filter);
            this.mAllowedExtras.put(key, allowedExtra2);
            return this;
        }

        static /* synthetic */ boolean lambda$allowExtra$14(Object v) {
            return false;
        }

        public Builder allowExtraStreamUriWithAuthority(final String uriAuthority) {
            Preconditions.checkNotNull(uriAuthority);
            allowExtra("android.intent.extra.STREAM", Uri.class, new IntentSanitizer$Builder$$ExternalSyntheticLambda18(uriAuthority));
            return this;
        }

        static /* synthetic */ boolean lambda$allowExtraStreamUriWithAuthority$15(String uriAuthority, Uri v) {
            return uriAuthority.equals(v.getAuthority());
        }

        public Builder allowExtraStream(Predicate<Uri> filter) {
            allowExtra("android.intent.extra.STREAM", Uri.class, filter);
            return this;
        }

        public Builder allowExtraOutput(final String uriAuthority) {
            allowExtra("output", Uri.class, new IntentSanitizer$Builder$$ExternalSyntheticLambda0(uriAuthority));
            return this;
        }

        static /* synthetic */ boolean lambda$allowExtraOutput$16(String uriAuthority, Uri v) {
            return uriAuthority.equals(v.getAuthority());
        }

        public Builder allowExtraOutput(Predicate<Uri> filter) {
            allowExtra("output", Uri.class, filter);
            return this;
        }

        public Builder allowIdentifier() {
            this.mAllowIdentifier = true;
            return this;
        }

        public Builder allowSelector() {
            this.mAllowSelector = true;
            return this;
        }

        public Builder allowSourceBounds() {
            this.mAllowSourceBounds = true;
            return this;
        }

        public IntentSanitizer build() {
            if (this.mAllowAnyComponent == false) goto L7;
            if (this.mAllowSomeComponents == false) goto L7;
        L12:
            throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
        L7:
            if (this.mAllowAnyComponent == false) goto L9;
        L13:
            IntentSanitizer sanitizer = new IntentSanitizer(null);
            IntentSanitizer.access$102(sanitizer, this.mAllowedFlags);
            IntentSanitizer.access$202(sanitizer, this.mAllowedActions);
            IntentSanitizer.access$302(sanitizer, this.mAllowedData);
            IntentSanitizer.access$402(sanitizer, this.mAllowedTypes);
            IntentSanitizer.access$502(sanitizer, this.mAllowedCategories);
            IntentSanitizer.access$602(sanitizer, this.mAllowedPackages);
            IntentSanitizer.access$702(sanitizer, this.mAllowAnyComponent);
            IntentSanitizer.access$802(sanitizer, this.mAllowedComponents);
            IntentSanitizer.access$902(sanitizer, this.mAllowedExtras);
            IntentSanitizer.access$1002(sanitizer, this.mAllowClipDataText);
            IntentSanitizer.access$1102(sanitizer, this.mAllowedClipDataUri);
            IntentSanitizer.access$1202(sanitizer, this.mAllowedClipData);
            IntentSanitizer.access$1302(sanitizer, this.mAllowIdentifier);
            IntentSanitizer.access$1402(sanitizer, this.mAllowSelector);
            IntentSanitizer.access$1502(sanitizer, this.mAllowSourceBounds);
            return sanitizer;
        L9:
            if (this.mAllowSomeComponents == false) goto L12;
            goto L13
        }
    }

    /* synthetic */ IntentSanitizer(AnonymousClass1 x0) {
        this();
    }

    static /* synthetic */ boolean access$1002(IntentSanitizer x0, boolean x1) {
        x0.mAllowClipDataText = x1;
        return x1;
    }

    static /* synthetic */ int access$102(IntentSanitizer x0, int x1) {
        x0.mAllowedFlags = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$1102(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedClipDataUri = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$1202(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedClipData = x1;
        return x1;
    }

    static /* synthetic */ boolean access$1302(IntentSanitizer x0, boolean x1) {
        x0.mAllowIdentifier = x1;
        return x1;
    }

    static /* synthetic */ boolean access$1402(IntentSanitizer x0, boolean x1) {
        x0.mAllowSelector = x1;
        return x1;
    }

    static /* synthetic */ boolean access$1502(IntentSanitizer x0, boolean x1) {
        x0.mAllowSourceBounds = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$202(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedActions = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$302(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedData = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$402(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedTypes = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$502(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedCategories = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$602(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedPackages = x1;
        return x1;
    }

    static /* synthetic */ boolean access$702(IntentSanitizer x0, boolean x1) {
        x0.mAllowAnyComponent = x1;
        return x1;
    }

    static /* synthetic */ Predicate access$802(IntentSanitizer x0, Predicate x1) {
        x0.mAllowedComponents = x1;
        return x1;
    }

    static /* synthetic */ Map access$902(IntentSanitizer x0, Map x1) {
        x0.mAllowedExtras = x1;
        return x1;
    }

    private IntentSanitizer() {
    }

    static /* synthetic */ void lambda$sanitizeByFiltering$0(String msg) {
    }

    public Intent sanitizeByFiltering(Intent in) {
        return sanitize(in, new IntentSanitizer$$ExternalSyntheticLambda1());
    }

    public Intent sanitizeByThrowing(Intent in) {
        return sanitize(in, new IntentSanitizer$$ExternalSyntheticLambda0());
    }

    static /* synthetic */ void lambda$sanitizeByThrowing$1(String msg) {
        throw new SecurityException(msg);
    }

    public Intent sanitize(Intent in, Consumer<String> penalty) {
        Intent intent = new Intent();
        ComponentName componentName = in.getComponent();
        if (this.mAllowAnyComponent == false) goto L6;
        if (componentName != null) goto L6;
    L7:
        intent.setComponent(componentName);
    L9:
        String packageName = in.getPackage();
        if (packageName != null) goto L12;
    L15:
        intent.setPackage(packageName);
    L17:
        if ((this.mAllowedFlags | in.getFlags()) != this.mAllowedFlags) goto L19;
        intent.setFlags(in.getFlags());
    L20:
        String action = in.getAction();
        if (action != null) goto L23;
    L26:
        intent.setAction(action);
    L27:
        Uri data = in.getData();
        if (data != null) goto L30;
    L33:
        intent.setData(data);
    L34:
        String type = in.getType();
        if (type != null) goto L37;
    L40:
        intent.setDataAndType(intent.getData(), type);
    L41:
        Set<String> categories = in.getCategories();
        if (categories == null) goto L51;
        Iterator<String> r1 = categories.iterator();
    L45:
        if (r1.hasNext() == false) goto L51;
        String category = r1.next();
        if (this.mAllowedCategories.test(category) == true) goto L48;
        penalty.accept("Category is not allowed: " + category);
        goto L45
    L48:
        intent.addCategory(category);
    L51:
        Bundle extras = in.getExtras();
        if (extras == null) goto L73;
        Iterator<String> r2 = extras.keySet().iterator();
    L55:
        if (r2.hasNext() == false) goto L73;
        String key = r2.next();
        if (key.equals("android.intent.extra.STREAM") == false) goto L62;
        if ((this.mAllowedFlags & 1) != 0) goto L62;
        penalty.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
    L62:
        if (key.equals("output") == false) goto L66;
        if (((~this.mAllowedFlags) & 3) == 0) goto L66;
        penalty.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
    L66:
        Object value = extras.get(key);
        Predicate<Object> test = this.mAllowedExtras.get(key);
        if (test == null) goto L71;
        if (test.test(value) == false) goto L71;
        putExtra(intent, key, value);
    L71:
        penalty.accept("Extra is not allowed. Key: " + key + ". Value: " + value);
    L73:
        sanitizeClipData(in, intent, this.mAllowedClipData, this.mAllowClipDataText, this.mAllowedClipDataUri, penalty);
        if (Build.VERSION.SDK_INT < 29) goto L82;
        if (this.mAllowIdentifier == false) goto L79;
        Api29Impl.setIdentifier(intent, Api29Impl.getIdentifier(in));
        goto L82
    L79:
        if (Api29Impl.getIdentifier(in) == null) goto L82;
        penalty.accept("Identifier is not allowed: " + Api29Impl.getIdentifier(in));
    L82:
        if (this.mAllowSelector == false) goto L85;
        intent.setSelector(in.getSelector());
    L88:
        if (this.mAllowSourceBounds == false) goto L91;
        intent.setSourceBounds(in.getSourceBounds());
    L93:
        return intent;
    L91:
        if (in.getSourceBounds() == null) goto L93;
        penalty.accept("SourceBounds is not allowed: " + in.getSourceBounds());
        goto L93
    L85:
        if (in.getSelector() == null) goto L88;
        penalty.accept("Selector is not allowed: " + in.getSelector());
        goto L88
    L37:
        if (this.mAllowedTypes.test(type) == true) goto L40;
        penalty.accept("Type is not allowed: " + type);
        goto L41
    L30:
        if (this.mAllowedData.test(data) == true) goto L33;
        penalty.accept("Data is not allowed: " + data);
        goto L34
    L23:
        if (this.mAllowedActions.test(action) == true) goto L26;
        penalty.accept("Action is not allowed: " + action);
        goto L27
    L19:
        intent.setFlags(this.mAllowedFlags & in.getFlags());
        penalty.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(in.getFlags() & (~this.mAllowedFlags)));
        goto L20
    L12:
        if (this.mAllowedPackages.test(packageName) == true) goto L15;
        penalty.accept("Package is not allowed: " + packageName);
    L6:
        if (this.mAllowedComponents.test(componentName) == true) goto L7;
        penalty.accept("Component is not allowed: " + componentName);
        intent.setComponent(new ComponentName("android", "java.lang.Void"));
        goto L9
    }

    private void putExtra(Intent intent, String key, Object value) {
        if (value != null) goto L5;
        intent.getExtras().putString(key, null);
        return;
    L5:
        if ((value instanceof Parcelable) == false) goto L8;
        intent.putExtra(key, (Parcelable) value);
        return;
    L8:
        if ((value instanceof Parcelable[]) == false) goto L11;
        intent.putExtra(key, (Parcelable[]) value);
        return;
    L11:
        if ((value instanceof Serializable) == false) goto L15;
        intent.putExtra(key, (Serializable) value);
        return;
    L15:
        throw new IllegalArgumentException("Unsupported type " + value.getClass());
    }

    static void sanitizeClipData(Intent in, Intent out, Predicate<ClipData> mAllowedClipData, boolean mAllowClipDataText, Predicate<Uri> mAllowedClipDataUri, Consumer<String> penalty) {
        ClipData clipData = in.getClipData();
        if (clipData != null) goto L5;
        return;
    L5:
        ClipData newClipData = null;
        if (mAllowedClipData != null) goto L8;
    L10:
        int i = 0;
    L12:
        if (i >= clipData.getItemCount()) goto L42;
        ClipData.Item item = clipData.getItemAt(i);
        if (Build.VERSION.SDK_INT < 31) goto L16;
        Api31Impl.checkOtherMembers(i, item, penalty);
    L17:
        CharSequence itemText = null;
        if (mAllowClipDataText == false) goto L21;
        itemText = item.getText();
    L23:
        Uri itemUri = null;
        if (mAllowedClipDataUri != null) goto L29;
        if (item.getUri() == null) goto L35;
        penalty.accept("Item URI is not allowed. Item position: " + i + ". URI: " + item.getUri());
    L35:
        if (itemText != null) goto L38;
        if (itemUri != null) goto L38;
    L41:
        i = i + 1;
    L38:
        if (newClipData != null) goto L40;
        newClipData = new ClipData(clipData.getDescription(), new ClipData.Item(itemText, null, itemUri));
        goto L41
    L40:
        newClipData.addItem(new ClipData.Item(itemText, null, itemUri));
        goto L41
    L29:
        if (item.getUri() != null) goto L31;
    L34:
        itemUri = item.getUri();
        goto L35
    L31:
        if (mAllowedClipDataUri.test(item.getUri()) == true) goto L34;
        penalty.accept("Item URI is not allowed. Item position: " + i + ". URI: " + item.getUri());
        goto L35
    L21:
        if (item.getText() == null) goto L23;
        penalty.accept("Item text cannot contain value. Item position: " + i + ". Text: " + item.getText());
        goto L23
    L16:
        checkOtherMembers(i, item, penalty);
        goto L17
    L42:
        if (newClipData == null) goto L50;
        out.setClipData(newClipData);
        return;
    L50:
        return;
    L8:
        if (mAllowedClipData.test(clipData) == false) goto L10;
        out.setClipData(clipData);
    }

    private static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> penalty) {
        if (item.getHtmlText() == null) goto L5;
    L6:
        penalty.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        return;
    L5:
        if (item.getIntent() != null) goto L6;
    }
}
