package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    private final Compat mCompat;

    private static final class Api31Impl {
        private Api31Impl() {
        }

        public static Pair<ContentInfo, ContentInfo> partition(ContentInfo payload, final Predicate<ClipData.Item> itemPredicate) {
            ClipData clip = payload.getClip();
            ContentInfo r3 = null;
            if (clip.getItemCount() != 1) goto L13;
            boolean matched = itemPredicate.test(clip.getItemAt(0));
            if (matched == false) goto L7;
            ContentInfo r2 = payload;
        L8:
            if (matched == true) goto L12;
            r3 = payload;
        L12:
            return Pair.create(r2, r3);
        L7:
            r2 = null;
            goto L8
        L13:
            Objects.requireNonNull(itemPredicate);
            Pair<ClipData, ClipData> split = ContentInfoCompat.partition(clip, new ContentInfoCompat$Api31Impl$$ExternalSyntheticLambda0(itemPredicate));
            if (split.first != null) goto L18;
            return Pair.create(null, payload);
        L18:
            if (split.second != null) goto L22;
            return Pair.create(payload, null);
        L22:
            return Pair.create(new ContentInfo.Builder(payload).setClip((ClipData) split.first).build(), new ContentInfo.Builder(payload).setClip((ClipData) split.second).build());
        }
    }

    public static final class Builder {
        private final BuilderCompat mBuilderCompat;

        public Builder(ContentInfoCompat other) {
            if (Build.VERSION.SDK_INT < 31) goto L5;
            this.mBuilderCompat = new BuilderCompat31Impl(other);
            return;
        L5:
            this.mBuilderCompat = new BuilderCompatImpl(other);
        }

        public Builder(ClipData clip, int source) {
            if (Build.VERSION.SDK_INT < 31) goto L5;
            this.mBuilderCompat = new BuilderCompat31Impl(clip, source);
            return;
        L5:
            this.mBuilderCompat = new BuilderCompatImpl(clip, source);
        }

        public Builder setClip(ClipData clip) {
            this.mBuilderCompat.setClip(clip);
            return this;
        }

        public Builder setSource(int source) {
            this.mBuilderCompat.setSource(source);
            return this;
        }

        public Builder setFlags(int flags) {
            this.mBuilderCompat.setFlags(flags);
            return this;
        }

        public Builder setLinkUri(Uri linkUri) {
            this.mBuilderCompat.setLinkUri(linkUri);
            return this;
        }

        public Builder setExtras(Bundle extras) {
            this.mBuilderCompat.setExtras(extras);
            return this;
        }

        public ContentInfoCompat build() {
            return this.mBuilderCompat.build();
        }
    }

    private interface BuilderCompat {
        ContentInfoCompat build();

        void setClip(ClipData r1);

        void setExtras(Bundle r1);

        void setFlags(int r1);

        void setLinkUri(Uri r1);

        void setSource(int r1);
    }

    private static final class BuilderCompat31Impl implements BuilderCompat {
        private final ContentInfo.Builder mPlatformBuilder;

        BuilderCompat31Impl(ClipData clip, int source) {
            this.mPlatformBuilder = new ContentInfo.Builder(clip, source);
        }

        BuilderCompat31Impl(ContentInfoCompat other) {
            this.mPlatformBuilder = new ContentInfo.Builder(other.toContentInfo());
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(ClipData clip) {
            this.mPlatformBuilder.setClip(clip);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int source) {
            this.mPlatformBuilder.setSource(source);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int flags) {
            this.mPlatformBuilder.setFlags(flags);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri linkUri) {
            this.mPlatformBuilder.setLinkUri(linkUri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle extras) {
            this.mPlatformBuilder.setExtras(extras);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.mPlatformBuilder.build()));
        }
    }

    private static final class BuilderCompatImpl implements BuilderCompat {
        ClipData mClip;
        Bundle mExtras;
        int mFlags;
        Uri mLinkUri;
        int mSource;

        BuilderCompatImpl(ClipData clip, int source) {
            this.mClip = clip;
            this.mSource = source;
        }

        BuilderCompatImpl(ContentInfoCompat other) {
            this.mClip = other.getClip();
            this.mSource = other.getSource();
            this.mFlags = other.getFlags();
            this.mLinkUri = other.getLinkUri();
            this.mExtras = other.getExtras();
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(ClipData clip) {
            this.mClip = clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int source) {
            this.mSource = source;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int flags) {
            this.mFlags = flags;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(Uri linkUri) {
            this.mLinkUri = linkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle extras) {
            this.mExtras = extras;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }
    }

    private interface Compat {
        ClipData getClip();

        Bundle getExtras();

        int getFlags();

        Uri getLinkUri();

        int getSource();

        ContentInfo getWrapped();
    }

    private static final class Compat31Impl implements Compat {
        private final ContentInfo mWrapped;

        Compat31Impl(ContentInfo wrapped) {
            this.mWrapped = (ContentInfo) Preconditions.checkNotNull(wrapped);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            return this.mWrapped;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            return this.mWrapped.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mWrapped.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mWrapped.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Uri getLinkUri() {
            return this.mWrapped.getLinkUri();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Bundle getExtras() {
            return this.mWrapped.getExtras();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.mWrapped + "}";
        }
    }

    private static final class CompatImpl implements Compat {
        private final ClipData mClip;
        private final Bundle mExtras;
        private final int mFlags;
        private final Uri mLinkUri;
        private final int mSource;

        CompatImpl(BuilderCompatImpl b) {
            this.mClip = (ClipData) Preconditions.checkNotNull(b.mClip);
            this.mSource = Preconditions.checkArgumentInRange(b.mSource, 0, 5, "source");
            this.mFlags = Preconditions.checkFlagsArgument(b.mFlags, 1);
            this.mLinkUri = b.mLinkUri;
            this.mExtras = b.mExtras;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo getWrapped() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData getClip() {
            return this.mClip;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.mSource;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
            return this.mFlags;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Uri getLinkUri() {
            return this.mLinkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public Bundle getExtras() {
            return this.mExtras;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder().append("ContentInfoCompat{clip=").append(this.mClip.getDescription()).append(", source=").append(ContentInfoCompat.sourceToString(this.mSource)).append(", flags=").append(ContentInfoCompat.flagsToString(this.mFlags));
            String r2 = "";
            if (this.mLinkUri != null) goto L5;
            String r1 = "";
        L6:
            StringBuilder r3 = r0.append(r1);
            if (this.mExtras == null) goto L11;
            r2 = ", hasExtras";
        L11:
            return r3.append(r2).append("}").toString();
        L5:
            r1 = ", hasLinkUri(" + this.mLinkUri.toString().length() + ")";
            goto L6
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    static String sourceToString(int source) {
        switch(source) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L5;
            default: goto L4;
        };
    L5:
        return "SOURCE_PROCESS_TEXT";
    L7:
        return "SOURCE_AUTOFILL";
    L9:
        return "SOURCE_DRAG_AND_DROP";
    L11:
        return "SOURCE_INPUT_METHOD";
    L13:
        return "SOURCE_CLIPBOARD";
    L15:
        return "SOURCE_APP";
    L4:
        return String.valueOf(source);
    }

    static String flagsToString(int flags) {
        if ((flags & 1) == 0) goto L7;
        return "FLAG_CONVERT_TO_PLAIN_TEXT";
    L7:
        return String.valueOf(flags);
    }

    ContentInfoCompat(Compat compat) {
        this.mCompat = compat;
    }

    public static ContentInfoCompat toContentInfoCompat(ContentInfo platContentInfo) {
        return new ContentInfoCompat(new Compat31Impl(platContentInfo));
    }

    public ContentInfo toContentInfo() {
        return (ContentInfo) Objects.requireNonNull(this.mCompat.getWrapped());
    }

    public String toString() {
        return this.mCompat.toString();
    }

    public ClipData getClip() {
        return this.mCompat.getClip();
    }

    public int getSource() {
        return this.mCompat.getSource();
    }

    public int getFlags() {
        return this.mCompat.getFlags();
    }

    public Uri getLinkUri() {
        return this.mCompat.getLinkUri();
    }

    public Bundle getExtras() {
        return this.mCompat.getExtras();
    }

    public Pair<ContentInfoCompat, ContentInfoCompat> partition(androidx.core.util.Predicate<ClipData.Item> itemPredicate) {
        ClipData clip = this.mCompat.getClip();
        ContentInfoCompat r3 = null;
        if (clip.getItemCount() != 1) goto L13;
        boolean matched = itemPredicate.test(clip.getItemAt(0));
        if (matched == false) goto L7;
        ContentInfoCompat r2 = this;
    L8:
        if (matched == true) goto L12;
        r3 = this;
    L12:
        return Pair.create(r2, r3);
    L7:
        r2 = null;
        goto L8
    L13:
        Pair<ClipData, ClipData> split = partition(clip, itemPredicate);
        if (split.first != null) goto L18;
        return Pair.create(null, this);
    L18:
        if (split.second != null) goto L22;
        return Pair.create(this, null);
    L22:
        return Pair.create(new Builder(this).setClip((ClipData) split.first).build(), new Builder(this).setClip((ClipData) split.second).build());
    }

    static Pair<ClipData, ClipData> partition(ClipData clip, androidx.core.util.Predicate<ClipData.Item> itemPredicate) {
        ArrayList<ClipData.Item> acceptedItems = null;
        ArrayList<ClipData.Item> remainingItems = null;
        int i = 0;
    L4:
        if (i >= clip.getItemCount()) goto L17;
        ClipData.Item item = clip.getItemAt(i);
        if (itemPredicate.test(item) == false) goto L11;
        if (acceptedItems != null) goto L9;
        ArrayList<ClipData.Item> acceptedItems2 = new ArrayList();
    L10:
        acceptedItems2.add(item);
        acceptedItems = acceptedItems2;
    L15:
        i = i + 1;
        goto L4
    L9:
        acceptedItems2 = acceptedItems;
        goto L10
    L11:
        if (remainingItems != null) goto L13;
        ArrayList<ClipData.Item> remainingItems2 = new ArrayList();
    L14:
        remainingItems2.add(item);
        remainingItems = remainingItems2;
        goto L15
    L13:
        remainingItems2 = remainingItems;
        goto L14
    L17:
        if (acceptedItems == null) goto L19;
        if (remainingItems != null) goto L24;
        return Pair.create(clip, null);
    L24:
        return Pair.create(buildClipData(clip.getDescription(), acceptedItems), buildClipData(clip.getDescription(), remainingItems));
    L19:
        return Pair.create(null, clip);
    }

    static ClipData buildClipData(ClipDescription description, List<ClipData.Item> items) {
        ClipData clip = new ClipData(new ClipDescription(description), items.get(0));
        int i = 1;
    L4:
        if (i >= items.size()) goto L6;
        clip.addItem(items.get(i));
        i = i + 1;
        goto L4
    L6:
        return clip;
    }

    public static Pair<ContentInfo, ContentInfo> partition(ContentInfo payload, Predicate<ClipData.Item> itemPredicate) {
        return Api31Impl.partition(payload, itemPredicate);
    }
}
