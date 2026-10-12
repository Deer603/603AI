package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LinkAnnotation.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "()V", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "Clickable", "Url", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LinkAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: LinkAnnotation.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Landroidx/compose/ui/text/LinkAnnotation;", "tag", "", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "getTag", "()Ljava/lang/String;", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Clickable extends LinkAnnotation {
        public static final int $stable = 0;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String tag;

        static {
            $stable = 8;
        }

        public /* synthetic */ Clickable(String r1, TextLinkStyles r2, LinkInteractionListener r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 2) == 0) goto L5;
            r2 = null;
        L5:
            this(r1, r2, r3);
        }

        public final String getTag() {
            return this.tag;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        public Clickable(String tag, TextLinkStyles styles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.tag = tag;
            this.styles = styles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public static /* synthetic */ Clickable copy$default(Clickable r0, String r1, TextLinkStyles r2, LinkInteractionListener r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.tag;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.getStyles();
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.getLinkInteractionListener();
        L12:
            return r0.copy(r1, r2, r3);
        }

        public final Clickable copy(String tag, TextLinkStyles styles, LinkInteractionListener linkInteractionListener) {
            return new Clickable(tag, styles, linkInteractionListener);
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if ((other instanceof Clickable) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(this.tag, ((Clickable) other).tag) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(getStyles(), ((Clickable) other).getStyles()) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.areEqual(getLinkInteractionListener(), ((Clickable) other).getLinkInteractionListener()) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int result = this.tag.hashCode();
            int r1 = result * 31;
            TextLinkStyles r2 = getStyles();
            int r3 = 0;
            if (r2 == null) goto L5;
            int r4 = r2.hashCode();
        L6:
            int result2 = r1 + r4;
            int result3 = result2 * 31;
            LinkInteractionListener r5 = getLinkInteractionListener();
            if (r5 == null) goto L10;
            r3 = r5.hashCode();
        L10:
            return result3 + r3;
        L5:
            r4 = 0;
            goto L6
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }
    }

    /* JADX INFO: compiled from: LinkAnnotation.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "url", "", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "getUrl", "()Ljava/lang/String;", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Url extends LinkAnnotation {
        public static final int $stable = 0;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String url;

        static {
            $stable = 8;
        }

        public /* synthetic */ Url(String r2, TextLinkStyles r3, LinkInteractionListener r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 2) == 0) goto L6;
            r3 = null;
        L6:
            if ((r5 & 4) == 0) goto L8;
            r4 = null;
        L8:
            this(r2, r3, r4);
        }

        public final String getUrl() {
            return this.url;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        public Url(String url, TextLinkStyles styles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.url = url;
            this.styles = styles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public static /* synthetic */ Url copy$default(Url r0, String r1, TextLinkStyles r2, LinkInteractionListener r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.url;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.getStyles();
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.getLinkInteractionListener();
        L12:
            return r0.copy(r1, r2, r3);
        }

        public final Url copy(String url, TextLinkStyles styles, LinkInteractionListener linkInteractionListener) {
            return new Url(url, styles, linkInteractionListener);
        }

        public boolean equals(Object other) {
            if (this != other) goto L6;
            return true;
        L6:
            if ((other instanceof Url) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(this.url, ((Url) other).url) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(getStyles(), ((Url) other).getStyles()) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.areEqual(getLinkInteractionListener(), ((Url) other).getLinkInteractionListener()) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int result = this.url.hashCode();
            int r1 = result * 31;
            TextLinkStyles r2 = getStyles();
            int r3 = 0;
            if (r2 == null) goto L5;
            int r4 = r2.hashCode();
        L6:
            int result2 = r1 + r4;
            int result3 = result2 * 31;
            LinkInteractionListener r5 = getLinkInteractionListener();
            if (r5 == null) goto L10;
            r3 = r5.hashCode();
        L10:
            return result3 + r3;
        L5:
            r4 = 0;
            goto L6
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }
    }

    static {
    }

    public /* synthetic */ LinkAnnotation(DefaultConstructorMarker r1) {
        this();
    }

    public abstract LinkInteractionListener getLinkInteractionListener();

    public abstract TextLinkStyles getStyles();

    private LinkAnnotation() {
    }
}
