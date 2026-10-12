package androidx.compose.foundation.content;

import androidx.webkit.internal.AssetHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MediaType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/content/MediaType;", "", "representation", "", "(Ljava/lang/String;)V", "getRepresentation", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaType {
    public static final int $stable = 0;
    private static final MediaType All = null;
    public static final Companion Companion = null;
    private static final MediaType HtmlText = null;
    private static final MediaType Image = null;
    private static final MediaType PlainText = null;
    private static final MediaType Text = null;
    private final String representation;

    /* JADX INFO: compiled from: MediaType.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/content/MediaType$Companion;", "", "()V", "All", "Landroidx/compose/foundation/content/MediaType;", "getAll", "()Landroidx/compose/foundation/content/MediaType;", "HtmlText", "getHtmlText", "Image", "getImage", "PlainText", "getPlainText", "Text", "getText", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final MediaType getText() {
            return MediaType.access$getText$cp();
        }

        public final MediaType getPlainText() {
            return MediaType.access$getPlainText$cp();
        }

        public final MediaType getHtmlText() {
            return MediaType.access$getHtmlText$cp();
        }

        public final MediaType getImage() {
            return MediaType.access$getImage$cp();
        }

        public final MediaType getAll() {
            return MediaType.access$getAll$cp();
        }
    }

    public MediaType(String representation) {
        this.representation = representation;
    }

    public static final /* synthetic */ MediaType access$getAll$cp() {
        return All;
    }

    public static final /* synthetic */ MediaType access$getHtmlText$cp() {
        return HtmlText;
    }

    public static final /* synthetic */ MediaType access$getImage$cp() {
        return Image;
    }

    public static final /* synthetic */ MediaType access$getPlainText$cp() {
        return PlainText;
    }

    public static final /* synthetic */ MediaType access$getText$cp() {
        return Text;
    }

    public final String getRepresentation() {
        return this.representation;
    }

    static {
        Companion = new Companion(null);
        Text = new MediaType("text/*");
        PlainText = new MediaType(AssetHelper.DEFAULT_MIME_TYPE);
        HtmlText = new MediaType("text/html");
        Image = new MediaType("image/*");
        All = new MediaType("*/*");
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof MediaType) == true) goto L10;
        return false;
    L10:
        return Intrinsics.areEqual(this.representation, ((MediaType) other).representation);
    }

    public int hashCode() {
        return this.representation.hashCode();
    }

    public String toString() {
        return "MediaType(representation='" + this.representation + "')";
    }
}
