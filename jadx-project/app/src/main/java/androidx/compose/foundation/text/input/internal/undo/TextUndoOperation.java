package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextUndoOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "index", "", "preText", "", "postText", "preSelection", "Landroidx/compose/ui/text/TextRange;", "postSelection", "timeInMillis", "", "canMerge", "", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanMerge", "()Z", "deletionType", "Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "getDeletionType", "()Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "getIndex", "()I", "getPostSelection-d9O1mEE", "()J", "J", "getPostText", "()Ljava/lang/String;", "getPreSelection-d9O1mEE", "getPreText", "textEditType", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "getTextEditType", "()Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "getTimeInMillis", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextUndoOperation {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Saver<TextUndoOperation, Object> Saver = null;
    private final boolean canMerge;
    private final int index;
    private final long postSelection;
    private final String postText;
    private final long preSelection;
    private final String preText;
    private final TextEditType textEditType;
    private final long timeInMillis;

    /* JADX INFO: compiled from: TextUndoOperation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.access$getSaver$cp();
        }
    }

    public /* synthetic */ TextUndoOperation(int r1, String r2, String r3, long r4, long r6, long r8, boolean r10, DefaultConstructorMarker r11) {
        this(r1, r2, r3, r4, r6, r8, r10);
    }

    private TextUndoOperation(int index, String preText, String postText, long preSelection, long postSelection, long timeInMillis, boolean canMerge) {
        this.index = index;
        this.preText = preText;
        this.postText = postText;
        this.preSelection = preSelection;
        this.postSelection = postSelection;
        this.timeInMillis = timeInMillis;
        this.canMerge = canMerge;
        boolean r1 = true;
        if (this.preText.length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L16;
        if (this.postText.length() != 0) goto L10;
        boolean r2 = true;
    L11:
        if (r2 == false) goto L16;
        throw new IllegalArgumentException("Either pre or post text must not be empty");
    L10:
        r2 = false;
    L16:
        if (this.preText.length() != 0) goto L18;
        boolean r3 = true;
    L19:
        if (r3 == false) goto L27;
        if (this.postText.length() <= 0) goto L23;
        boolean r4 = true;
    L24:
        if (r4 == false) goto L27;
        TextEditType r5 = TextEditType.Insert;
    L38:
        this.textEditType = r5;
        return;
    L23:
        r4 = false;
    L27:
        if (this.preText.length() <= 0) goto L29;
        boolean r6 = true;
    L30:
        if (r6 == true) goto L32;
    L37:
        r5 = TextEditType.Replace;
        goto L38
    L32:
        if (this.postText.length() == 0) goto L35;
        r1 = false;
    L35:
        if (r1 == false) goto L37;
        r5 = TextEditType.Delete;
        goto L38
    L29:
        r6 = false;
        goto L30
    L18:
        r3 = false;
        goto L19
    L5:
        r0 = false;
        goto L6
    }

    public /* synthetic */ TextUndoOperation(int r15, String r16, String r17, long r18, long r20, long r22, boolean r24, int r25, DefaultConstructorMarker r26) {
        if ((r25 & 32) == 0) goto L5;
        long r10 = UndoManager_jvmKt.timeNowMillis();
    L7:
        if ((r25 & 64) == 0) goto L9;
        boolean r12 = true;
    L10:
        this(r15, r16, r17, r18, r20, r10, r12, null);
        return;
    L9:
        r12 = r24;
        goto L10
    L5:
        r10 = r22;
        goto L7
    }

    public static final /* synthetic */ Saver access$getSaver$cp() {
        return Saver;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPreText() {
        return this.preText;
    }

    public final String getPostText() {
        return this.postText;
    }

    /* JADX INFO: renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m1382getPreSelectiond9O1mEE() {
        return this.preSelection;
    }

    /* JADX INFO: renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m1381getPostSelectiond9O1mEE() {
        return this.postSelection;
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final TextDeleteType getDeletionType() {
        if (this.textEditType == TextEditType.Delete) goto L7;
        return TextDeleteType.NotByUser;
    L7:
        if (TextRange.m6411getCollapsedimpl(this.postSelection) == false) goto L9;
        boolean r0 = TextRange.m6411getCollapsedimpl(this.preSelection);
        long r1 = this.preSelection;
        if (r0 == false) goto L18;
        if (TextRange.m6417getStartimpl(r1) <= TextRange.m6417getStartimpl(this.postSelection)) goto L16;
        return TextDeleteType.Start;
    L16:
        return TextDeleteType.End;
    L18:
        if (TextRange.m6417getStartimpl(r1) != TextRange.m6417getStartimpl(this.postSelection)) goto L24;
        if (TextRange.m6417getStartimpl(this.preSelection) != this.index) goto L24;
        return TextDeleteType.Inner;
    L24:
        return TextDeleteType.NotByUser;
    L9:
        return TextDeleteType.NotByUser;
    }

    static {
        Companion = new Companion(null);
        Saver = new TextUndoOperation$Companion$Saver$1();
    }
}
