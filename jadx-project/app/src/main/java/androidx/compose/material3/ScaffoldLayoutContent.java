package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/ScaffoldLayoutContent;", "", "(Ljava/lang/String;I)V", "TopBar", "MainContent", "Snackbar", "Fab", "BottomBar", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final enum ScaffoldLayoutContent extends Enum<ScaffoldLayoutContent> {
    private static final /* synthetic */ ScaffoldLayoutContent[] $VALUES = null;
    public static final ScaffoldLayoutContent BottomBar = null;
    public static final ScaffoldLayoutContent Fab = null;
    public static final ScaffoldLayoutContent MainContent = null;
    public static final ScaffoldLayoutContent Snackbar = null;
    public static final ScaffoldLayoutContent TopBar = null;

    private static final /* synthetic */ ScaffoldLayoutContent[] $values() {
        return new ScaffoldLayoutContent[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    public static ScaffoldLayoutContent valueOf(String r1) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, r1);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) $VALUES.clone();
    }

    private ScaffoldLayoutContent(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        TopBar = new ScaffoldLayoutContent("TopBar", 0);
        MainContent = new ScaffoldLayoutContent("MainContent", 1);
        Snackbar = new ScaffoldLayoutContent("Snackbar", 2);
        Fab = new ScaffoldLayoutContent("Fab", 3);
        BottomBar = new ScaffoldLayoutContent("BottomBar", 4);
        $VALUES = $values();
    }
}
