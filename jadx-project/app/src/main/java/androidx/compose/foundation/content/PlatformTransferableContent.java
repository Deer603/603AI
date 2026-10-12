package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferableContent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/content/PlatformTransferableContent;", "", "linkUri", "Landroid/net/Uri;", "extras", "Landroid/os/Bundle;", "(Landroid/net/Uri;Landroid/os/Bundle;)V", "getExtras", "()Landroid/os/Bundle;", "getLinkUri", "()Landroid/net/Uri;", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlatformTransferableContent {
    public static final int $stable = 0;
    private final Bundle extras;
    private final Uri linkUri;

    static {
        $stable = 8;
    }

    public PlatformTransferableContent(Uri linkUri, Bundle extras) {
        this.linkUri = linkUri;
        this.extras = extras;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof PlatformTransferableContent) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.linkUri, ((PlatformTransferableContent) other).linkUri) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.extras, ((PlatformTransferableContent) other).extras) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Uri r0 = this.linkUri;
        if (r0 == null) goto L5;
        int result = r0.hashCode();
    L7:
        return (result * 31) + this.extras.hashCode();
    L5:
        result = 0;
        goto L7
    }

    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.linkUri + ", extras=" + this.extras + ')';
    }
}
