package com.luchime.huiyuan.ui;

import com.luchime.huiyuan.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: RoomScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/luchime/huiyuan/ui/AIModel;", "", "displayName", "", "shortName", "askName", "chipLabel", "avatarRes", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDisplayName", "()Ljava/lang/String;", "getShortName", "getAskName", "getChipLabel", "getAvatarRes", "()I", "HUIYUAN", "PIAO", "GUIGUI", "TANGO", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum AIModel {
    HUIYUAN("汇元AI（困困）", "困困", "困困", "🟡 困困", R.drawable.capybara),
    PIAO("朴AI", "朴AI", "朴朴", "🐧 朴AI", R.drawable.piaoai),
    GUIGUI("龟龟AI", "龟龟", "龟龟", "🐢 龟龟", R.drawable.guigui),
    TANGO("Tango AI", "探戈", "探戈", "🐻 探戈", R.drawable.tango);

    private final String askName;
    private final int avatarRes;
    private final String chipLabel;
    private final String displayName;
    private final String shortName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<AIModel> getEntries() {
        return $ENTRIES;
    }

    AIModel(String displayName, String shortName, String askName, String chipLabel, int avatarRes) {
        this.displayName = displayName;
        this.shortName = shortName;
        this.askName = askName;
        this.chipLabel = chipLabel;
        this.avatarRes = avatarRes;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getAskName() {
        return this.askName;
    }

    public final String getChipLabel() {
        return this.chipLabel;
    }

    public final int getAvatarRes() {
        return this.avatarRes;
    }
}
