package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "()V", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AccessibilityIterators {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "()V", "segment", "", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getRange", "start", "", "end", "initialize", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 0;
        private final int[] segment;
        protected String text;

        static {
            $stable = 8;
        }

        public AbstractTextSegmentIterator() {
            this.segment = new int[2];
        }

        protected final String getText() {
            String r0 = this.text;
            if (r0 == null) goto L5;
            return r0;
        L5:
            Intrinsics.throwUninitializedPropertyAccessException("text");
            return null;
        }

        protected final void setText(String r1) {
            this.text = r1;
        }

        public void initialize(String text) {
            setText(text);
        }

        protected final int[] getRange(int start, int end) {
            if (start < 0) goto L8;
            if (end < 0) goto L10;
            if (start == end) goto L11;
            this.segment[0] = start;
            this.segment[1] = end;
            return this.segment;
        L11:
            return null;
        L10:
            return null;
        L8:
            return null;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", "initialize", "", "text", "", "onLocaleChanged", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = null;
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.access$getInstance$cp() != null) goto L5;
                CharacterTextSegmentIterator.access$setInstance$cp(new CharacterTextSegmentIterator(locale, null));
            L5:
                CharacterTextSegmentIterator r0 = CharacterTextSegmentIterator.access$getInstance$cp();
                Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return r0;
            }
        }

        static {
            Companion = new Companion(null);
            $stable = 8;
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale r1, DefaultConstructorMarker r2) {
            this(r1);
        }

        public static final /* synthetic */ CharacterTextSegmentIterator access$getInstance$cp() {
            return instance;
        }

        public static final /* synthetic */ void access$setInstance$cp(CharacterTextSegmentIterator r0) {
            instance = r0;
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String text) {
            super.initialize(text);
            BreakIterator r0 = this.impl;
            if (r0 != null) goto L5;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r0 = null;
        L5:
            r0.setText(text);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L5;
            return null;
        L5:
            if (current < textLength) goto L7;
            return null;
        L7:
            int start = current;
            if (start >= 0) goto L10;
            start = 0;
        L10:
            BreakIterator r3 = this.impl;
            if (r3 != null) goto L13;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r3 = null;
        L13:
            boolean r4 = r3.isBoundary(start);
            BreakIterator r5 = this.impl;
            if (r4 == true) goto L20;
            if (r5 != null) goto L17;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r5 = null;
        L17:
            start = r5.following(start);
            if (start != (-1)) goto L10;
            return null;
        L20:
            if (r5 != null) goto L22;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r5 = null;
        L22:
            int end = r5.following(start);
            if (end != (-1)) goto L26;
            return null;
        L26:
            return getRange(start, end);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L5;
            return null;
        L5:
            if (current > 0) goto L7;
            return null;
        L7:
            int end = current;
            if (end <= textLength) goto L10;
            end = textLength;
        L10:
            BreakIterator r3 = this.impl;
            if (r3 != null) goto L13;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r3 = null;
        L13:
            boolean r4 = r3.isBoundary(end);
            BreakIterator r5 = this.impl;
            if (r4 == true) goto L20;
            if (r5 != null) goto L17;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r5 = null;
        L17:
            end = r5.preceding(end);
            if (end != (-1)) goto L10;
            return null;
        L20:
            if (r5 != null) goto L22;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r5 = null;
        L22:
            int start = r5.preceding(end);
            if (start != (-1)) goto L26;
            return null;
        L26:
            return getRange(start, end);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "initialize", "", "text", "", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = null;
        private static final ResolvedTextDirection DirectionEnd = null;
        private static final ResolvedTextDirection DirectionStart = null;
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.access$getLineInstance$cp() != null) goto L5;
                LineTextSegmentIterator.access$setLineInstance$cp(new LineTextSegmentIterator(null));
            L5:
                LineTextSegmentIterator r0 = LineTextSegmentIterator.access$getLineInstance$cp();
                Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return r0;
            }
        }

        public /* synthetic */ LineTextSegmentIterator(DefaultConstructorMarker r1) {
            this();
        }

        private LineTextSegmentIterator() {
        }

        public static final /* synthetic */ LineTextSegmentIterator access$getLineInstance$cp() {
            return lineInstance;
        }

        public static final /* synthetic */ void access$setLineInstance$cp(LineTextSegmentIterator r0) {
            lineInstance = r0;
        }

        static {
            Companion = new Companion(null);
            $stable = 8;
            DirectionStart = ResolvedTextDirection.Rtl;
            DirectionEnd = ResolvedTextDirection.Ltr;
        }

        public final void initialize(String text, TextLayoutResult layoutResult) {
            setText(text);
            this.layoutResult = layoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L6;
            return null;
        L6:
            if (current < getText().length()) goto L8;
            return null;
        L8:
            TextLayoutResult r2 = this.layoutResult;
            if (current >= 0) goto L13;
            if (r2 != null) goto L12;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r2 = null;
        L12:
            int currentLine = r2.getLineForOffset(0);
        L19:
            TextLayoutResult r4 = this.layoutResult;
            if (r4 != null) goto L23;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r4 = null;
        L23:
            if (currentLine < r4.getLineCount()) goto L25;
            return null;
        L25:
            int start = getLineEdgeIndex(currentLine, DirectionStart);
            int end = getLineEdgeIndex(currentLine, DirectionEnd) + 1;
            return getRange(start, end);
        L13:
            if (r2 != null) goto L15;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r2 = null;
        L15:
            currentLine = r2.getLineForOffset(current);
            if (getLineEdgeIndex(currentLine, DirectionStart) == current) goto L19;
            currentLine = currentLine + 1;
            goto L19
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L5;
            return null;
        L5:
            if (current > 0) goto L7;
            return null;
        L7:
            int r2 = getText().length();
            TextLayoutResult r3 = this.layoutResult;
            if (current <= r2) goto L12;
            if (r3 != null) goto L11;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r3 = null;
        L11:
            int previousLine = r3.getLineForOffset(getText().length());
        L19:
            if (previousLine >= 0) goto L21;
            return null;
        L21:
            int start = getLineEdgeIndex(previousLine, DirectionStart);
            int end = getLineEdgeIndex(previousLine, DirectionEnd) + 1;
            return getRange(start, end);
        L12:
            if (r3 != null) goto L14;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r3 = null;
        L14:
            previousLine = r3.getLineForOffset(current);
            if ((getLineEdgeIndex(previousLine, DirectionEnd) + 1) == current) goto L19;
            previousLine = previousLine - 1;
            goto L19
        }

        private final int getLineEdgeIndex(int lineNumber, ResolvedTextDirection direction) {
            TextLayoutResult r0 = this.layoutResult;
            TextLayoutResult r2 = null;
            if (r0 != null) goto L5;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r0 = null;
        L5:
            int lineStart = r0.getLineStart(lineNumber);
            TextLayoutResult r3 = this.layoutResult;
            if (r3 != null) goto L8;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r3 = null;
        L8:
            ResolvedTextDirection paragraphDirection = r3.getParagraphDirection(lineStart);
            TextLayoutResult r4 = this.layoutResult;
            if (direction == paragraphDirection) goto L14;
            if (r4 != null) goto L12;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        L18:
            return r2.getLineStart(lineNumber);
        L12:
            r2 = r4;
            goto L18
        L14:
            if (r4 != null) goto L17;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r4 = null;
        L17:
            return TextLayoutResult.getLineEnd$default(r4, lineNumber, false, 2, null) - 1;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "tempRect", "Landroid/graphics/Rect;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "initialize", "", "text", "", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = null;
        private static final ResolvedTextDirection DirectionEnd = null;
        private static final ResolvedTextDirection DirectionStart = null;
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.access$getPageInstance$cp() != null) goto L5;
                PageTextSegmentIterator.access$setPageInstance$cp(new PageTextSegmentIterator(null));
            L5:
                PageTextSegmentIterator r0 = PageTextSegmentIterator.access$getPageInstance$cp();
                Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return r0;
            }
        }

        public /* synthetic */ PageTextSegmentIterator(DefaultConstructorMarker r1) {
            this();
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        public static final /* synthetic */ PageTextSegmentIterator access$getPageInstance$cp() {
            return pageInstance;
        }

        public static final /* synthetic */ void access$setPageInstance$cp(PageTextSegmentIterator r0) {
            pageInstance = r0;
        }

        static {
            Companion = new Companion(null);
            $stable = 8;
            DirectionStart = ResolvedTextDirection.Rtl;
            DirectionEnd = ResolvedTextDirection.Ltr;
        }

        public final void initialize(String text, TextLayoutResult layoutResult, SemanticsNode node) {
            setText(text);
            this.layoutResult = layoutResult;
            this.node = node;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int textLength = getText().length();
            TextLayoutResult r1 = null;
            if (textLength > 0) goto L6;
            return null;
        L6:
            if (current < getText().length()) goto L39;
            return null;
        L39:
            SemanticsNode r3 = this.node;     // Catch: IllegalStateException -> L37
            if (r3 != null) goto L12;
            Intrinsics.throwUninitializedPropertyAccessException("node");     // Catch: IllegalStateException -> L37
            r3 = null;
        L12:
            androidx.compose.ui.geometry.Rect this_$iv = r3.getBoundsInRoot();     // Catch: IllegalStateException -> L37
            float $this$fastRoundToInt$iv = this_$iv.getBottom() - this_$iv.getTop();     // Catch: IllegalStateException -> L37
            int pageHeight = Math.round($this$fastRoundToInt$iv);     // Catch: IllegalStateException -> L37
            int start = RangesKt.coerceAtLeast(0, current);
            TextLayoutResult r4 = this.layoutResult;
            if (r4 != null) goto L16;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r4 = null;
        L16:
            int currentLine = r4.getLineForOffset(start);
            TextLayoutResult r6 = this.layoutResult;
            if (r6 != null) goto L19;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r6 = null;
        L19:
            float currentLineTop = r6.getLineTop(currentLine);
            float nextPageStartY = pageHeight + currentLineTop;
            TextLayoutResult r8 = this.layoutResult;
            if (r8 != null) goto L22;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r8 = null;
        L22:
            TextLayoutResult r9 = this.layoutResult;
            if (r9 != null) goto L25;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r9 = null;
        L25:
            float lastLineTop = r8.getLineTop(r9.getLineCount() - 1);
            TextLayoutResult r10 = this.layoutResult;
            if (nextPageStartY >= lastLineTop) goto L31;
            if (r10 != null) goto L29;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        L30:
            int currentPageEndLine = r1.getLineForVerticalPosition(nextPageStartY) - 1;
        L35:
            int end = getLineEdgeIndex(currentPageEndLine, DirectionEnd) + 1;
            return getRange(start, end);
        L29:
            r1 = r10;
            goto L30
        L31:
            if (r10 != null) goto L33;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        L34:
            currentPageEndLine = r1.getLineCount() - 1;
            goto L35
        L33:
            r1 = r10;
        L38:
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int textLength = getText().length();
            TextLayoutResult r1 = null;
            if (textLength > 0) goto L5;
            return null;
        L5:
            if (current > 0) goto L34;
            return null;
        L34:
            SemanticsNode r3 = this.node;     // Catch: IllegalStateException -> L32
            if (r3 != null) goto L11;
            Intrinsics.throwUninitializedPropertyAccessException("node");     // Catch: IllegalStateException -> L32
            r3 = null;
        L11:
            androidx.compose.ui.geometry.Rect this_$iv = r3.getBoundsInRoot();     // Catch: IllegalStateException -> L32
            float $this$fastRoundToInt$iv = this_$iv.getBottom() - this_$iv.getTop();     // Catch: IllegalStateException -> L32
            int pageHeight = Math.round($this$fastRoundToInt$iv);     // Catch: IllegalStateException -> L32
            int end = RangesKt.coerceAtMost(getText().length(), current);
            TextLayoutResult r4 = this.layoutResult;
            if (r4 != null) goto L15;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r4 = null;
        L15:
            int currentLine = r4.getLineForOffset(end);
            TextLayoutResult r6 = this.layoutResult;
            if (r6 != null) goto L18;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r6 = null;
        L18:
            float currentLineTop = r6.getLineTop(currentLine);
            float previousPageEndY = currentLineTop - pageHeight;
            if (previousPageEndY <= 0.0f) goto L25;
            TextLayoutResult r8 = this.layoutResult;
            if (r8 != null) goto L23;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        L24:
            int currentPageStartLine = r1.getLineForVerticalPosition(previousPageEndY);
        L27:
            if (end != getText().length()) goto L30;
            if (currentPageStartLine >= currentLine) goto L30;
            currentPageStartLine = currentPageStartLine + 1;
        L30:
            int start = getLineEdgeIndex(currentPageStartLine, DirectionStart);
            return getRange(start, end);
        L23:
            r1 = r8;
            goto L24
        L25:
            currentPageStartLine = 0;
        L33:
            return null;
        }

        private final int getLineEdgeIndex(int lineNumber, ResolvedTextDirection direction) {
            TextLayoutResult r0 = this.layoutResult;
            TextLayoutResult r2 = null;
            if (r0 != null) goto L5;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r0 = null;
        L5:
            int lineStart = r0.getLineStart(lineNumber);
            TextLayoutResult r3 = this.layoutResult;
            if (r3 != null) goto L8;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r3 = null;
        L8:
            ResolvedTextDirection paragraphDirection = r3.getParagraphDirection(lineStart);
            TextLayoutResult r4 = this.layoutResult;
            if (direction == paragraphDirection) goto L14;
            if (r4 != null) goto L12;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        L18:
            return r2.getLineStart(lineNumber);
        L12:
            r2 = r4;
            goto L18
        L14:
            if (r4 != null) goto L17;
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            r4 = null;
        L17:
            return TextLayoutResult.getLineEnd$default(r4, lineNumber, false, 2, null) - 1;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "following", "", "current", "", "isEndBoundary", "", "index", "isStartBoundary", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = null;
        private static ParagraphTextSegmentIterator instance;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getInstance", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.access$getInstance$cp() != null) goto L5;
                ParagraphTextSegmentIterator.access$setInstance$cp(new ParagraphTextSegmentIterator(null));
            L5:
                ParagraphTextSegmentIterator r0 = ParagraphTextSegmentIterator.access$getInstance$cp();
                Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return r0;
            }
        }

        static {
            Companion = new Companion(null);
        }

        public /* synthetic */ ParagraphTextSegmentIterator(DefaultConstructorMarker r1) {
            this();
        }

        private ParagraphTextSegmentIterator() {
        }

        public static final /* synthetic */ ParagraphTextSegmentIterator access$getInstance$cp() {
            return instance;
        }

        public static final /* synthetic */ void access$setInstance$cp(ParagraphTextSegmentIterator r0) {
            instance = r0;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L5;
            return null;
        L5:
            if (current < textLength) goto L7;
            return null;
        L7:
            int start = current;
            if (start >= 0) goto L10;
            start = 0;
        L10:
            if (start >= textLength) goto L16;
            if (getText().charAt(start) != '\n') goto L16;
            if (isStartBoundary(start) == true) goto L16;
            start = start + 1;
        L16:
            if (start < textLength) goto L18;
            return null;
        L18:
            int end = start + 1;
        L19:
            if (end >= textLength) goto L24;
            if (isEndBoundary(end) == true) goto L24;
            end = end + 1;
        L24:
            return getRange(start, end);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L5;
            return null;
        L5:
            if (current > 0) goto L7;
            return null;
        L7:
            int end = current;
            if (end <= textLength) goto L10;
            end = textLength;
        L10:
            if (end <= 0) goto L16;
            if (getText().charAt(end - 1) != '\n') goto L16;
            if (isEndBoundary(end) == true) goto L16;
            end = end - 1;
        L16:
            if (end > 0) goto L18;
            return null;
        L18:
            int start = end - 1;
        L19:
            if (start <= 0) goto L24;
            if (isStartBoundary(start) == true) goto L24;
            start = start - 1;
        L24:
            return getRange(start, end);
        }

        private final boolean isStartBoundary(int index) {
            if (getText().charAt(index) == '\n') goto L8;
            if (index != 0) goto L6;
        L7:
            return true;
        L6:
            if (getText().charAt(index - 1) == '\n') goto L7;
        L8:
            return false;
        }

        private final boolean isEndBoundary(int index) {
            if (index > 0) goto L4;
        L10:
            return false;
        L4:
            if (getText().charAt(index - 1) == '\n') goto L10;
            if (index != getText().length()) goto L8;
        L9:
            return true;
        L8:
            if (getText().charAt(index) != '\n') goto L10;
            goto L9
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "following", "", "current", "", "preceding", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TextSegmentIterator {
        int[] following(int r1);

        int[] preceding(int r1);
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", "initialize", "", "text", "", "isEndBoundary", "", "index", "isLetterOrDigit", "isStartBoundary", "onLocaleChanged", "preceding", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = null;
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "()V", "instance", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getInstance", "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.access$getInstance$cp() != null) goto L5;
                WordTextSegmentIterator.access$setInstance$cp(new WordTextSegmentIterator(locale, null));
            L5:
                WordTextSegmentIterator r0 = WordTextSegmentIterator.access$getInstance$cp();
                Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return r0;
            }
        }

        static {
            Companion = new Companion(null);
            $stable = 8;
        }

        public /* synthetic */ WordTextSegmentIterator(Locale r1, DefaultConstructorMarker r2) {
            this(r1);
        }

        public static final /* synthetic */ WordTextSegmentIterator access$getInstance$cp() {
            return instance;
        }

        public static final /* synthetic */ void access$setInstance$cp(WordTextSegmentIterator r0) {
            instance = r0;
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String text) {
            super.initialize(text);
            BreakIterator r0 = this.impl;
            if (r0 != null) goto L5;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r0 = null;
        L5:
            r0.setText(text);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L6;
            return null;
        L6:
            if (current < getText().length()) goto L8;
            return null;
        L8:
            int start = current;
            if (start >= 0) goto L12;
            start = 0;
        L12:
            if (isLetterOrDigit(start) == true) goto L21;
            if (isStartBoundary(start) == true) goto L21;
            BreakIterator r3 = this.impl;
            if (r3 != null) goto L18;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r3 = null;
        L18:
            start = r3.following(start);
            if (start != (-1)) goto L12;
            return null;
        L21:
            BreakIterator r4 = this.impl;
            if (r4 != null) goto L24;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r4 = null;
        L24:
            int end = r4.following(start);
            if (end != (-1)) goto L27;
        L31:
            return null;
        L27:
            if (isEndBoundary(end) == false) goto L31;
            return getRange(start, end);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int textLength = getText().length();
            if (textLength > 0) goto L5;
            return null;
        L5:
            if (current > 0) goto L7;
            return null;
        L7:
            int end = current;
            if (end <= textLength) goto L11;
            end = textLength;
        L11:
            if (end <= 0) goto L22;
            if (isLetterOrDigit(end - 1) == true) goto L22;
            if (isEndBoundary(end) == true) goto L22;
            BreakIterator r5 = this.impl;
            if (r5 != null) goto L19;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r5 = null;
        L19:
            end = r5.preceding(end);
            if (end != (-1)) goto L11;
            return null;
        L22:
            BreakIterator r6 = this.impl;
            if (r6 != null) goto L25;
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            r6 = null;
        L25:
            int start = r6.preceding(end);
            if (start != (-1)) goto L28;
        L32:
            return null;
        L28:
            if (isStartBoundary(start) == false) goto L32;
            return getRange(start, end);
        }

        private final boolean isStartBoundary(int index) {
            if (isLetterOrDigit(index) == false) goto L8;
            if (index != 0) goto L6;
        L7:
            return true;
        L6:
            if (isLetterOrDigit(index - 1) == false) goto L7;
        L8:
            return false;
        }

        private final boolean isEndBoundary(int index) {
            if (index > 0) goto L4;
        L10:
            return false;
        L4:
            if (isLetterOrDigit(index - 1) == false) goto L10;
            if (index != getText().length()) goto L8;
        L9:
            return true;
        L8:
            if (isLetterOrDigit(index) == true) goto L10;
            goto L9
        }

        private final boolean isLetterOrDigit(int index) {
            if (index >= 0) goto L4;
            return false;
        L4:
            if (index >= getText().length()) goto L9;
            int codePoint = getText().codePointAt(index);
            return Character.isLetterOrDigit(codePoint);
        L9:
            return false;
        }
    }

    static {
    }

    public AccessibilityIterators() {
    }
}
