package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ShortcutInfoCompat {
    private static final String EXTRA_LOCUS_ID = "extraLocusId";
    private static final String EXTRA_LONG_LIVED = "extraLongLived";
    private static final String EXTRA_PERSON_ = "extraPerson_";
    private static final String EXTRA_PERSON_COUNT = "extraPersonCount";
    private static final String EXTRA_SLICE_URI = "extraSliceUri";
    public static final int SURFACE_LAUNCHER = 1;
    ComponentName mActivity;
    Set<String> mCategories;
    Context mContext;
    CharSequence mDisabledMessage;
    int mDisabledReason;
    int mExcludedSurfaces;
    PersistableBundle mExtras;
    boolean mHasKeyFieldsOnly;
    IconCompat mIcon;
    String mId;
    Intent[] mIntents;
    boolean mIsAlwaysBadged;
    boolean mIsCached;
    boolean mIsDeclaredInManifest;
    boolean mIsDynamic;
    boolean mIsEnabled;
    boolean mIsImmutable;
    boolean mIsLongLived;
    boolean mIsPinned;
    CharSequence mLabel;
    long mLastChangedTimestamp;
    LocusIdCompat mLocusId;
    CharSequence mLongLabel;
    String mPackageName;
    Person[] mPersons;
    int mRank;
    Bundle mTransientExtras;
    UserHandle mUser;

    private static class Api33Impl {
        private Api33Impl() {
        }

        static void setExcludedFromSurfaces(ShortcutInfo.Builder builder, int surfaces) {
            builder.setExcludedFromSurfaces(surfaces);
        }
    }

    public static class Builder {
        private Map<String, Map<String, List<String>>> mCapabilityBindingParams;
        private Set<String> mCapabilityBindings;
        private final ShortcutInfoCompat mInfo;
        private boolean mIsConversation;
        private Uri mSliceUri;

        public Builder(Context context, String id) {
            this.mInfo = new ShortcutInfoCompat();
            this.mInfo.mContext = context;
            this.mInfo.mId = id;
        }

        public Builder(ShortcutInfoCompat shortcutInfo) {
            this.mInfo = new ShortcutInfoCompat();
            ShortcutInfoCompat r0 = this.mInfo;
            r0.mContext = shortcutInfo.mContext;
            ShortcutInfoCompat r1 = this.mInfo;
            r1.mId = shortcutInfo.mId;
            ShortcutInfoCompat r2 = this.mInfo;
            r2.mPackageName = shortcutInfo.mPackageName;
            ShortcutInfoCompat r3 = this.mInfo;
            r3.mIntents = (Intent[]) Arrays.copyOf(shortcutInfo.mIntents, shortcutInfo.mIntents.length);
            ShortcutInfoCompat r4 = this.mInfo;
            r4.mActivity = shortcutInfo.mActivity;
            ShortcutInfoCompat r5 = this.mInfo;
            r5.mLabel = shortcutInfo.mLabel;
            ShortcutInfoCompat r6 = this.mInfo;
            r6.mLongLabel = shortcutInfo.mLongLabel;
            ShortcutInfoCompat r7 = this.mInfo;
            r7.mDisabledMessage = shortcutInfo.mDisabledMessage;
            ShortcutInfoCompat r8 = this.mInfo;
            r8.mDisabledReason = shortcutInfo.mDisabledReason;
            ShortcutInfoCompat r9 = this.mInfo;
            r9.mIcon = shortcutInfo.mIcon;
            ShortcutInfoCompat r10 = this.mInfo;
            r10.mIsAlwaysBadged = shortcutInfo.mIsAlwaysBadged;
            ShortcutInfoCompat r11 = this.mInfo;
            r11.mUser = shortcutInfo.mUser;
            ShortcutInfoCompat r12 = this.mInfo;
            r12.mLastChangedTimestamp = shortcutInfo.mLastChangedTimestamp;
            ShortcutInfoCompat r13 = this.mInfo;
            r13.mIsCached = shortcutInfo.mIsCached;
            ShortcutInfoCompat r14 = this.mInfo;
            r14.mIsDynamic = shortcutInfo.mIsDynamic;
            ShortcutInfoCompat r15 = this.mInfo;
            r15.mIsPinned = shortcutInfo.mIsPinned;
            ShortcutInfoCompat r16 = this.mInfo;
            r16.mIsDeclaredInManifest = shortcutInfo.mIsDeclaredInManifest;
            ShortcutInfoCompat r17 = this.mInfo;
            r17.mIsImmutable = shortcutInfo.mIsImmutable;
            ShortcutInfoCompat r18 = this.mInfo;
            r18.mIsEnabled = shortcutInfo.mIsEnabled;
            ShortcutInfoCompat r19 = this.mInfo;
            r19.mLocusId = shortcutInfo.mLocusId;
            ShortcutInfoCompat r20 = this.mInfo;
            r20.mIsLongLived = shortcutInfo.mIsLongLived;
            ShortcutInfoCompat r21 = this.mInfo;
            r21.mHasKeyFieldsOnly = shortcutInfo.mHasKeyFieldsOnly;
            ShortcutInfoCompat r22 = this.mInfo;
            r22.mRank = shortcutInfo.mRank;
            if (shortcutInfo.mPersons == null) goto L6;
            ShortcutInfoCompat r23 = this.mInfo;
            r23.mPersons = (Person[]) Arrays.copyOf(shortcutInfo.mPersons, shortcutInfo.mPersons.length);
        L6:
            if (shortcutInfo.mCategories == null) goto L9;
            ShortcutInfoCompat r24 = this.mInfo;
            r24.mCategories = new HashSet(shortcutInfo.mCategories);
        L9:
            if (shortcutInfo.mExtras == null) goto L11;
            ShortcutInfoCompat r25 = this.mInfo;
            r25.mExtras = shortcutInfo.mExtras;
        L11:
            ShortcutInfoCompat r26 = this.mInfo;
            r26.mExcludedSurfaces = shortcutInfo.mExcludedSurfaces;
        }

        public Builder(Context context, ShortcutInfo shortcutInfo) {
            this.mInfo = new ShortcutInfoCompat();
            this.mInfo.mContext = context;
            ShortcutInfoCompat r0 = this.mInfo;
            r0.mId = shortcutInfo.getId();
            ShortcutInfoCompat r1 = this.mInfo;
            r1.mPackageName = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            ShortcutInfoCompat r2 = this.mInfo;
            r2.mIntents = (Intent[]) Arrays.copyOf(intents, intents.length);
            ShortcutInfoCompat r3 = this.mInfo;
            r3.mActivity = shortcutInfo.getActivity();
            ShortcutInfoCompat r4 = this.mInfo;
            r4.mLabel = shortcutInfo.getShortLabel();
            ShortcutInfoCompat r5 = this.mInfo;
            r5.mLongLabel = shortcutInfo.getLongLabel();
            ShortcutInfoCompat r6 = this.mInfo;
            r6.mDisabledMessage = shortcutInfo.getDisabledMessage();
            int r7 = Build.VERSION.SDK_INT;
            ShortcutInfoCompat r8 = this.mInfo;
            if (r7 < 28) goto L6;
            r8.mDisabledReason = shortcutInfo.getDisabledReason();
        L10:
            ShortcutInfoCompat r9 = this.mInfo;
            r9.mCategories = shortcutInfo.getCategories();
            ShortcutInfoCompat r10 = this.mInfo;
            r10.mPersons = ShortcutInfoCompat.getPersonsFromExtra(shortcutInfo.getExtras());
            ShortcutInfoCompat r11 = this.mInfo;
            r11.mUser = shortcutInfo.getUserHandle();
            ShortcutInfoCompat r12 = this.mInfo;
            r12.mLastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            if (Build.VERSION.SDK_INT < 30) goto L13;
            ShortcutInfoCompat r13 = this.mInfo;
            r13.mIsCached = shortcutInfo.isCached();
        L13:
            ShortcutInfoCompat r14 = this.mInfo;
            r14.mIsDynamic = shortcutInfo.isDynamic();
            ShortcutInfoCompat r15 = this.mInfo;
            r15.mIsPinned = shortcutInfo.isPinned();
            ShortcutInfoCompat r16 = this.mInfo;
            r16.mIsDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            ShortcutInfoCompat r17 = this.mInfo;
            r17.mIsImmutable = shortcutInfo.isImmutable();
            ShortcutInfoCompat r18 = this.mInfo;
            r18.mIsEnabled = shortcutInfo.isEnabled();
            ShortcutInfoCompat r19 = this.mInfo;
            r19.mHasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            ShortcutInfoCompat r20 = this.mInfo;
            r20.mLocusId = ShortcutInfoCompat.getLocusId(shortcutInfo);
            ShortcutInfoCompat r21 = this.mInfo;
            r21.mRank = shortcutInfo.getRank();
            ShortcutInfoCompat r22 = this.mInfo;
            r22.mExtras = shortcutInfo.getExtras();
            return;
        L6:
            if (shortcutInfo.isEnabled() == false) goto L8;
            int r23 = 0;
        L9:
            r8.mDisabledReason = r23;
            goto L10
        L8:
            r23 = 3;
            goto L9
        }

        public Builder setShortLabel(CharSequence shortLabel) {
            this.mInfo.mLabel = shortLabel;
            return this;
        }

        public Builder setLongLabel(CharSequence longLabel) {
            this.mInfo.mLongLabel = longLabel;
            return this;
        }

        public Builder setDisabledMessage(CharSequence disabledMessage) {
            this.mInfo.mDisabledMessage = disabledMessage;
            return this;
        }

        public Builder setIntent(Intent intent) {
            return setIntents(new Intent[]{intent});
        }

        public Builder setIntents(Intent[] intents) {
            this.mInfo.mIntents = intents;
            return this;
        }

        public Builder setIcon(IconCompat icon) {
            this.mInfo.mIcon = icon;
            return this;
        }

        public Builder setLocusId(LocusIdCompat locusId) {
            this.mInfo.mLocusId = locusId;
            return this;
        }

        public Builder setIsConversation() {
            this.mIsConversation = true;
            return this;
        }

        public Builder setActivity(ComponentName activity) {
            this.mInfo.mActivity = activity;
            return this;
        }

        public Builder setAlwaysBadged() {
            this.mInfo.mIsAlwaysBadged = true;
            return this;
        }

        public Builder setPerson(Person person) {
            return setPersons(new Person[]{person});
        }

        public Builder setPersons(Person[] persons) {
            this.mInfo.mPersons = persons;
            return this;
        }

        public Builder setCategories(Set<String> categories) {
            ArraySet<String> set = new ArraySet();
            set.addAll(categories);
            this.mInfo.mCategories = set;
            return this;
        }

        @Deprecated
        public Builder setLongLived() {
            this.mInfo.mIsLongLived = true;
            return this;
        }

        public Builder setLongLived(boolean longLived) {
            this.mInfo.mIsLongLived = longLived;
            return this;
        }

        public Builder setExcludedFromSurfaces(int surfaces) {
            this.mInfo.mExcludedSurfaces = surfaces;
            return this;
        }

        public Builder setRank(int rank) {
            this.mInfo.mRank = rank;
            return this;
        }

        public Builder setExtras(PersistableBundle extras) {
            this.mInfo.mExtras = extras;
            return this;
        }

        public Builder setTransientExtras(Bundle transientExtras) {
            ShortcutInfoCompat r0 = this.mInfo;
            r0.mTransientExtras = (Bundle) Preconditions.checkNotNull(transientExtras);
            return this;
        }

        public Builder addCapabilityBinding(String capability) {
            if (this.mCapabilityBindings != null) goto L5;
            this.mCapabilityBindings = new HashSet();
        L5:
            this.mCapabilityBindings.add(capability);
            return this;
        }

        public Builder addCapabilityBinding(String capability, String parameter, List<String> parameterValues) {
            addCapabilityBinding(capability);
            if (parameterValues.isEmpty() == false) goto L5;
        L11:
            return this;
        L5:
            if (this.mCapabilityBindingParams != null) goto L8;
            this.mCapabilityBindingParams = new HashMap();
        L8:
            if (this.mCapabilityBindingParams.get(capability) != null) goto L10;
            this.mCapabilityBindingParams.put(capability, new HashMap());
        L10:
            this.mCapabilityBindingParams.get(capability).put(parameter, parameterValues);
            goto L11
        }

        public Builder setSliceUri(Uri sliceUri) {
            this.mSliceUri = sliceUri;
            return this;
        }

        public ShortcutInfoCompat build() {
            if (TextUtils.isEmpty(this.mInfo.mLabel) == true) goto L48;
            if (this.mInfo.mIntents == null) goto L46;
            if (this.mInfo.mIntents.length == 0) goto L46;
            if (this.mIsConversation == false) goto L15;
            if (this.mInfo.mLocusId != null) goto L13;
            this.mInfo.mLocusId = new LocusIdCompat(this.mInfo.mId);
        L13:
            this.mInfo.mIsLongLived = true;
        L15:
            if (this.mCapabilityBindings == null) goto L21;
            if (this.mInfo.mCategories != null) goto L19;
            this.mInfo.mCategories = new HashSet();
        L19:
            this.mInfo.mCategories.addAll(this.mCapabilityBindings);
        L21:
            if (this.mCapabilityBindingParams == null) goto L38;
            if (this.mInfo.mExtras != null) goto L25;
            this.mInfo.mExtras = new PersistableBundle();
        L25:
            Iterator<String> r0 = this.mCapabilityBindingParams.keySet().iterator();
        L27:
            if (r0.hasNext() == false) goto L38;
            String capability = r0.next();
            Map<String, List<String>> params = this.mCapabilityBindingParams.get(capability);
            Set<String> paramNames = params.keySet();
            this.mInfo.mExtras.putStringArray(capability, (String[]) paramNames.toArray(new String[0]));
            Iterator<String> r4 = params.keySet().iterator();
        L30:
            if (r4.hasNext() == false) goto L27;
            String paramName = r4.next();
            List<String> value = params.get(paramName);
            PersistableBundle r8 = this.mInfo.mExtras;
            String r9 = capability + "/" + paramName;
            String[] r10 = new String[0];
            if (value == null) goto L35;
            r10 = (String[]) value.toArray(r10);
        L35:
            r8.putStringArray(r9, r10);
        L38:
            if (this.mSliceUri == null) goto L44;
            if (this.mInfo.mExtras != null) goto L42;
            this.mInfo.mExtras = new PersistableBundle();
        L42:
            this.mInfo.mExtras.putString(ShortcutInfoCompat.EXTRA_SLICE_URI, UriCompat.toSafeString(this.mSliceUri));
        L44:
            return this.mInfo;
        L46:
            throw new IllegalArgumentException("Shortcut must have an intent");
        L48:
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Surface {
    }

    ShortcutInfoCompat() {
        this.mIsEnabled = true;
    }

    public ShortcutInfo toShortcutInfo() {
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
        if (this.mIcon == null) goto L6;
        builder.setIcon(this.mIcon.toIcon(this.mContext));
    L6:
        if (TextUtils.isEmpty(this.mLongLabel) == true) goto L9;
        builder.setLongLabel(this.mLongLabel);
    L9:
        if (TextUtils.isEmpty(this.mDisabledMessage) == true) goto L12;
        builder.setDisabledMessage(this.mDisabledMessage);
    L12:
        if (this.mActivity == null) goto L15;
        builder.setActivity(this.mActivity);
    L15:
        if (this.mCategories == null) goto L17;
        builder.setCategories(this.mCategories);
    L17:
        builder.setRank(this.mRank);
        if (this.mExtras == null) goto L21;
        builder.setExtras(this.mExtras);
    L21:
        if (Build.VERSION.SDK_INT >= 29) goto L23;
        builder.setExtras(buildLegacyExtrasBundle());
    L37:
        if (Build.VERSION.SDK_INT < 33) goto L40;
        Api33Impl.setExcludedFromSurfaces(builder, this.mExcludedSurfaces);
    L40:
        return builder.build();
    L23:
        if (this.mPersons == null) goto L32;
        if (this.mPersons.length <= 0) goto L32;
        android.app.Person[] persons = new android.app.Person[this.mPersons.length];
        int i = 0;
    L28:
        if (i >= persons.length) goto L30;
        persons[i] = this.mPersons[i].toAndroidPerson();
        i = i + 1;
        goto L28
    L30:
        builder.setPersons(persons);
    L32:
        if (this.mLocusId == null) goto L34;
        builder.setLocusId(this.mLocusId.toLocusId());
    L34:
        builder.setLongLived(this.mIsLongLived);
        goto L37
    }

    private PersistableBundle buildLegacyExtrasBundle() {
        if (this.mExtras != null) goto L6;
        this.mExtras = new PersistableBundle();
    L6:
        if (this.mPersons == null) goto L14;
        if (this.mPersons.length <= 0) goto L14;
        this.mExtras.putInt(EXTRA_PERSON_COUNT, this.mPersons.length);
        int i = 0;
    L11:
        if (i >= this.mPersons.length) goto L14;
        this.mExtras.putPersistableBundle(EXTRA_PERSON_ + (i + 1), this.mPersons[i].toPersistableBundle());
        i = i + 1;
    L14:
        if (this.mLocusId == null) goto L16;
        this.mExtras.putString(EXTRA_LOCUS_ID, this.mLocusId.getId());
    L16:
        this.mExtras.putBoolean(EXTRA_LONG_LIVED, this.mIsLongLived);
        return this.mExtras;
    }

    Intent addToIntent(Intent outIntent) {
        outIntent.putExtra("android.intent.extra.shortcut.INTENT", this.mIntents[this.mIntents.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
        if (this.mIcon == null) goto L14;
        Drawable badge = null;
        if (this.mIsAlwaysBadged == false) goto L13;
        PackageManager pm = this.mContext.getPackageManager();
        if (this.mActivity != null) goto L15;
    L11:
        if (badge != null) goto L13;
        badge = this.mContext.getApplicationInfo().loadIcon(pm);
        goto L13
    L15:
        badge = pm.getActivityIcon(this.mActivity);     // Catch: PackageManager.NameNotFoundException -> L10
    L13:
        this.mIcon.addToShortcutIntent(outIntent, badge, this.mContext);
    L14:
        return outIntent;
    }

    public String getId() {
        return this.mId;
    }

    public String getPackage() {
        return this.mPackageName;
    }

    public ComponentName getActivity() {
        return this.mActivity;
    }

    public CharSequence getShortLabel() {
        return this.mLabel;
    }

    public CharSequence getLongLabel() {
        return this.mLongLabel;
    }

    public CharSequence getDisabledMessage() {
        return this.mDisabledMessage;
    }

    public int getDisabledReason() {
        return this.mDisabledReason;
    }

    public Intent getIntent() {
        return this.mIntents[this.mIntents.length - 1];
    }

    public Intent[] getIntents() {
        return (Intent[]) Arrays.copyOf(this.mIntents, this.mIntents.length);
    }

    public Set<String> getCategories() {
        return this.mCategories;
    }

    public LocusIdCompat getLocusId() {
        return this.mLocusId;
    }

    public int getRank() {
        return this.mRank;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    static Person[] getPersonsFromExtra(PersistableBundle bundle) {
        if (bundle != null) goto L4;
        return null;
    L4:
        if (bundle.containsKey(EXTRA_PERSON_COUNT) == false) goto L13;
        int personsLength = bundle.getInt(EXTRA_PERSON_COUNT);
        Person[] persons = new Person[personsLength];
        int i = 0;
    L7:
        if (i >= personsLength) goto L9;
        persons[i] = Person.fromPersistableBundle(bundle.getPersistableBundle(EXTRA_PERSON_ + (i + 1)));
        i = i + 1;
        goto L7
    L9:
        return persons;
    L13:
        return null;
    }

    static boolean getLongLivedFromExtra(PersistableBundle bundle) {
        if (bundle != null) goto L4;
        return false;
    L4:
        if (bundle.containsKey(EXTRA_LONG_LIVED) == true) goto L7;
        return false;
    L7:
        return bundle.getBoolean(EXTRA_LONG_LIVED);
    }

    static List<ShortcutInfoCompat> fromShortcuts(Context context, List<ShortcutInfo> shortcuts) {
        List<ShortcutInfoCompat> results = new ArrayList(shortcuts.size());
        Iterator<ShortcutInfo> r1 = shortcuts.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ShortcutInfo s = r1.next();
        results.add(new Builder(context, s).build());
        goto L4
    L6:
        return results;
    }

    public PersistableBundle getExtras() {
        return this.mExtras;
    }

    public Bundle getTransientExtras() {
        return this.mTransientExtras;
    }

    public UserHandle getUserHandle() {
        return this.mUser;
    }

    public long getLastChangedTimestamp() {
        return this.mLastChangedTimestamp;
    }

    public boolean isCached() {
        return this.mIsCached;
    }

    public boolean isDynamic() {
        return this.mIsDynamic;
    }

    public boolean isPinned() {
        return this.mIsPinned;
    }

    public boolean isDeclaredInManifest() {
        return this.mIsDeclaredInManifest;
    }

    public boolean isImmutable() {
        return this.mIsImmutable;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean hasKeyFieldsOnly() {
        return this.mHasKeyFieldsOnly;
    }

    static LocusIdCompat getLocusId(ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) goto L11;
        if (shortcutInfo.getLocusId() != null) goto L9;
        return null;
    L9:
        return LocusIdCompat.toLocusIdCompat(shortcutInfo.getLocusId());
    L11:
        return getLocusIdFromExtra(shortcutInfo.getExtras());
    }

    public boolean isExcludedFromSurfaces(int surface) {
        if ((this.mExcludedSurfaces & surface) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public int getExcludedFromSurfaces() {
        return this.mExcludedSurfaces;
    }

    private static LocusIdCompat getLocusIdFromExtra(PersistableBundle bundle) {
        if (bundle != null) goto L5;
        return null;
    L5:
        String locusId = bundle.getString(EXTRA_LOCUS_ID);
        if (locusId != null) goto L9;
        return null;
    L9:
        return new LocusIdCompat(locusId);
    }
}
