package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ContextMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "stringId", "", "(Ljava/lang/String;II)V", "resolvedString", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Cut", "Copy", "Paste", "SelectAll", "Autofill", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TextContextMenuItems extends Enum<TextContextMenuItems> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES = null;
    public static final TextContextMenuItems Autofill = null;
    public static final TextContextMenuItems Copy = null;
    public static final TextContextMenuItems Cut = null;
    public static final TextContextMenuItems Paste = null;
    public static final TextContextMenuItems SelectAll = null;
    private final int stringId;

    private static final /* synthetic */ TextContextMenuItems[] $values() {
        return new TextContextMenuItems[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    public static EnumEntries<TextContextMenuItems> getEntries() {
        return $ENTRIES;
    }

    public static TextContextMenuItems valueOf(String r1) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, r1);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    private TextContextMenuItems(String $enum$name, int $enum$ordinal, int stringId) {
        super($enum$name, $enum$ordinal);
        this.stringId = stringId;
    }

    static {
        Cut = new TextContextMenuItems("Cut", 0, R.string.cut);
        Copy = new TextContextMenuItems("Copy", 1, R.string.copy);
        Paste = new TextContextMenuItems("Paste", 2, R.string.paste);
        SelectAll = new TextContextMenuItems("SelectAll", 3, R.string.selectAll);
        if (Build.VERSION.SDK_INT > 26) goto L5;
        int r1 = androidx.compose.foundation.R.string.autofill;
    L6:
        Autofill = new TextContextMenuItems("Autofill", 4, r1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        return;
    L5:
        r1 = R.string.autofill;
        goto L6
    }

    public final String resolvedString(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -309609081, "C(resolvedString)131@5015L24:ContextMenu.android.kt#423gt5");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-309609081, $changed, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:131)");
    L5:
        String r0 = StringResources_androidKt.stringResource(this.stringId, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
