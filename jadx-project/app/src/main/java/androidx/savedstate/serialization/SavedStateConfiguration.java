package androidx.savedstate.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

/* JADX INFO: compiled from: SavedStateConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B'\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "classDiscriminatorMode", "", "encodeDefaults", "", "<init>", "(Lkotlinx/serialization/modules/SerializersModule;IZ)V", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getClassDiscriminatorMode", "()I", "getEncodeDefaults", "()Z", "Builder", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateConfiguration {
    public static final Companion Companion = null;
    public static final SavedStateConfiguration DEFAULT = null;
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;
    private final SerializersModule serializersModule;

    /* JADX INFO: compiled from: SavedStateConfiguration.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "<init>", "(Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", "encodeDefaults", "", "getEncodeDefaults$annotations", "()V", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "classDiscriminatorMode", "", "getClassDiscriminatorMode$annotations", "getClassDiscriminatorMode", "()I", "setClassDiscriminatorMode", "(I)V", "build", "build$savedstate_release", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;
        private SerializersModule serializersModule;

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }

        public Builder(SavedStateConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.serializersModule = configuration.getSerializersModule();
            this.encodeDefaults = configuration.getEncodeDefaults();
            this.classDiscriminatorMode = configuration.getClassDiscriminatorMode();
        }

        public final SerializersModule getSerializersModule() {
            return this.serializersModule;
        }

        public final void setSerializersModule(SerializersModule r2) {
            Intrinsics.checkNotNullParameter(r2, "<set-?>");
            this.serializersModule = r2;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        public final void setEncodeDefaults(boolean r1) {
            this.encodeDefaults = r1;
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final void setClassDiscriminatorMode(int r1) {
            this.classDiscriminatorMode = r1;
        }

        public final SavedStateConfiguration build$savedstate_release() {
            return new SavedStateConfiguration(SerializersModuleKt.overwriteWith(SavedStateConfigurationKt.access$getDEFAULT_SERIALIZERS_MODULE$p(), this.serializersModule), this.classDiscriminatorMode, this.encodeDefaults, null);
        }
    }

    /* JADX INFO: compiled from: SavedStateConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration$Companion;", "", "<init>", "()V", "DEFAULT", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SavedStateConfiguration(SerializersModule r1, int r2, boolean r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    private SavedStateConfiguration(SerializersModule serializersModule, int classDiscriminatorMode, boolean encodeDefaults) {
        this.serializersModule = serializersModule;
        this.classDiscriminatorMode = classDiscriminatorMode;
        this.encodeDefaults = encodeDefaults;
    }

    /* synthetic */ SavedStateConfiguration(SerializersModule r1, int r2, boolean r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = SavedStateConfigurationKt.access$getDEFAULT_SERIALIZERS_MODULE$p();
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 2;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = false;
    L11:
        this(r1, r2, r3);
    }

    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    static {
        Companion = new Companion(null);
        SerializersModule r3 = null;
        int r4 = 0;
        boolean r5 = false;
        DEFAULT = new SavedStateConfiguration(r3, r4, r5, 7, null);
    }
}
