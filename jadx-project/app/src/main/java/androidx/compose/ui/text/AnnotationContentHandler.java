package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

/* JADX INFO: compiled from: Html.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J)\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096\u0001J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\t\u0010\u0012\u001a\u00020\u000bH\u0096\u0001J&\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016J\u0019\u0010\u0018\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0002J\b\u0010 \u001a\u00020\u000bH\u0002J)\u0010!\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096\u0001J)\u0010\"\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0019\u0010#\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010$0$H\u0096\u0001J\u0019\u0010%\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\t\u0010&\u001a\u00020\u000bH\u0096\u0001J0\u0010'\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u001cH\u0016J)\u0010)\u001a\u00020\u000b2\u000e\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/AnnotationContentHandler;", "Lorg/xml/sax/ContentHandler;", "contentHandler", "output", "Landroid/text/Editable;", "(Lorg/xml/sax/ContentHandler;Landroid/text/Editable;)V", "bulletIndentation", "", "currentBulletSpan", "Landroidx/compose/ui/text/BulletSpanWithLevel;", "characters", "", "p0", "", "kotlin.jvm.PlatformType", "p1", "p2", "commitCurrentBulletSpan", "endDocument", "endElement", "uri", "", "localName", "qName", "endPrefixMapping", "handleAnnotationEnd", "handleAnnotationStart", "attributes", "Lorg/xml/sax/Attributes;", "handleLiEnd", "handleLiStart", "handleUlEnd", "handleUlStart", "ignorableWhitespace", "processingInstruction", "setDocumentLocator", "Lorg/xml/sax/Locator;", "skippedEntity", "startDocument", "startElement", "atts", "startPrefixMapping", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnnotationContentHandler implements ContentHandler {
    private int bulletIndentation;
    private final ContentHandler contentHandler;
    private BulletSpanWithLevel currentBulletSpan;
    private final Editable output;

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] r2, int r3, int r4) {
        this.contentHandler.characters(r2, r3, r4);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() {
        this.contentHandler.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String r2) {
        this.contentHandler.endPrefixMapping(r2);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] r2, int r3, int r4) {
        this.contentHandler.ignorableWhitespace(r2, r3, r4);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String r2, String r3) {
        this.contentHandler.processingInstruction(r2, r3);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator r2) {
        this.contentHandler.setDocumentLocator(r2);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String r2) {
        this.contentHandler.skippedEntity(r2);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() {
        this.contentHandler.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String r2, String r3) {
        this.contentHandler.startPrefixMapping(r2, r3);
    }

    public AnnotationContentHandler(ContentHandler contentHandler, Editable output) {
        this.contentHandler = contentHandler;
        this.output = output;
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String uri, String localName, String qName, Attributes atts) {
        if (localName != null) goto L4;
    L19:
        this.contentHandler.startElement(uri, localName, qName, atts);
        return;
    L4:
        switch(localName.hashCode()) {
            case -1555043537: goto L15;
            case 3453: goto L11;
            case 3735: goto L7;
            default: goto L19;
        };
    L7:
        if (localName.equals("ul") == false) goto L19;
        handleUlStart();
        return;
    L11:
        if (localName.equals("li") == false) goto L19;
        handleLiStart();
        return;
    L15:
        if (localName.equals("annotation") == false) goto L19;
        if (atts == null) goto L23;
        handleAnnotationStart(atts);
        return;
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String uri, String localName, String qName) {
        if (localName != null) goto L4;
    L18:
        this.contentHandler.endElement(uri, localName, qName);
        return;
    L4:
        switch(localName.hashCode()) {
            case -1555043537: goto L15;
            case 3453: goto L11;
            case 3735: goto L7;
            default: goto L18;
        };
    L7:
        if (localName.equals("ul") == false) goto L18;
        handleUlEnd();
        return;
    L11:
        if (localName.equals("li") == false) goto L18;
        handleLiEnd();
        return;
    L15:
        if (localName.equals("annotation") == false) goto L18;
        handleAnnotationEnd();
    }

    private final void handleAnnotationStart(Attributes attributes) {
        int i = 0;
        int r1 = attributes.getLength();
    L3:
        if (i >= r1) goto L22;
        String key = attributes.getLocalName(i);
        String value = "";
        if (key != null) goto L7;
        key = "";
    L7:
        String r4 = attributes.getValue(i);
        if (r4 == null) goto L11;
        value = r4;
    L11:
        boolean r5 = false;
        if (key.length() <= 0) goto L14;
        boolean r6 = true;
    L15:
        if (r6 == false) goto L21;
        if (value.length() <= 0) goto L19;
        r5 = true;
    L19:
        if (r5 == false) goto L21;
        int start = this.output.length();
        this.output.setSpan(new AnnotationSpan(key, value), start, start, 17);
    L21:
        i = i + 1;
        goto L3
    L14:
        r6 = false;
        goto L15
    }

    private final void handleAnnotationEnd() {
        Object[] $this$filter$iv = this.output.getSpans(0, this.output.length(), AnnotationSpan.class);
        Collection destination$iv$iv = new ArrayList();
        int r6 = $this$filter$iv.length;
        int r7 = 0;
    L3:
        if (r7 >= r6) goto L11;
        Object element$iv$iv = $this$filter$iv[r7];
        AnnotationSpan it = (AnnotationSpan) element$iv$iv;
        if (this.output.getSpanFlags(it) != 17) goto L7;
        boolean r11 = true;
    L8:
        if (r11 == false) goto L10;
        destination$iv$iv.add(element$iv$iv);
    L10:
        r7 = r7 + 1;
        goto L3
    L7:
        r11 = false;
        goto L8
    L11:
        List $this$fastForEach$iv = (List) destination$iv$iv;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L12:
        if (index$iv >= r3) goto L18;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        AnnotationSpan annotation = (AnnotationSpan) item$iv;
        int start = this.output.getSpanStart(annotation);
        int end = this.output.length();
        this.output.removeSpan(annotation);
        if (start == end) goto L16;
        this.output.setSpan(annotation, start, end, 33);
    L16:
        index$iv = index$iv + 1;
        goto L12
    }

    private final void handleUlStart() {
        commitCurrentBulletSpan();
        this.bulletIndentation++;
    }

    private final void handleUlEnd() {
        commitCurrentBulletSpan();
        this.bulletIndentation--;
    }

    private final void handleLiStart() {
        commitCurrentBulletSpan();
        this.currentBulletSpan = new BulletSpanWithLevel(BulletKt.getDefaultBullet(), this.bulletIndentation, this.output.length());
    }

    private final void handleLiEnd() {
        commitCurrentBulletSpan();
    }

    private final void commitCurrentBulletSpan() {
        BulletSpanWithLevel it = this.currentBulletSpan;
        if (it == null) goto L5;
        int start = it.getStart();
        int end = this.output.length();
        this.output.setSpan(it, start, end, 33);
    L5:
        this.currentBulletSpan = null;
    }
}
