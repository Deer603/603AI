package com.luchime.huiyuan.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/luchime/huiyuan/ui/AppTab;", "", "label", "", "icon", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "CHAT", "ROOM", "LIBRARY", "FAVORITES", "PROFILE", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum AppTab extends Enum<AppTab> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ AppTab[] $VALUES = null;
    public static final AppTab CHAT = null;
    public static final AppTab FAVORITES = null;
    public static final AppTab LIBRARY = null;
    public static final AppTab PROFILE = null;
    public static final AppTab ROOM = null;
    private final String icon;
    private final String label;

    private static final /* synthetic */ AppTab[] $values() {
        return new AppTab[]{CHAT, ROOM, LIBRARY, FAVORITES, PROFILE};
    }

    public static EnumEntries<AppTab> getEntries() {
        return $ENTRIES;
    }

    public static AppTab valueOf(String r1) {
        return (AppTab) Enum.valueOf(AppTab.class, r1);
    }

    public static AppTab[] values() {
        return (AppTab[]) $VALUES.clone();
    }

    private AppTab(String $enum$name, int $enum$ordinal, String label, String icon) {
        super($enum$name, $enum$ordinal);
        this.label = label;
        this.icon = icon;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    static {
        CHAT = new AppTab("CHAT", 0, "对话", "◉");
        ROOM = new AppTab("ROOM", 1, "寝室", "603");
        LIBRARY = new AppTab("LIBRARY", 2, "语录", "▤");
        FAVORITES = new AppTab("FAVORITES", 3, "收藏", "★");
        PROFILE = new AppTab("PROFILE", 4, "我的", "困");
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
