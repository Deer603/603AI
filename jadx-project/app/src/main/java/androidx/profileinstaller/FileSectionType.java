package androidx.profileinstaller;

/* JADX INFO: loaded from: classes4.dex */
final enum FileSectionType extends Enum<FileSectionType> {
    private static final /* synthetic */ FileSectionType[] $VALUES = null;
    public static final FileSectionType AGGREGATION_COUNT = null;
    public static final FileSectionType CLASSES = null;
    public static final FileSectionType DEX_FILES = null;
    public static final FileSectionType EXTRA_DESCRIPTORS = null;
    public static final FileSectionType METHODS = null;
    private final long mValue;

    private static /* synthetic */ FileSectionType[] $values() {
        return new FileSectionType[]{DEX_FILES, EXTRA_DESCRIPTORS, CLASSES, METHODS, AGGREGATION_COUNT};
    }

    public static FileSectionType valueOf(String name) {
        return (FileSectionType) Enum.valueOf(FileSectionType.class, name);
    }

    public static FileSectionType[] values() {
        return (FileSectionType[]) $VALUES.clone();
    }

    static {
        DEX_FILES = new FileSectionType("DEX_FILES", 0, 0);
        EXTRA_DESCRIPTORS = new FileSectionType("EXTRA_DESCRIPTORS", 1, 1);
        CLASSES = new FileSectionType("CLASSES", 2, 2);
        METHODS = new FileSectionType("METHODS", 3, 3);
        AGGREGATION_COUNT = new FileSectionType("AGGREGATION_COUNT", 4, 4);
        $VALUES = $values();
    }

    private FileSectionType(String r1, int r2, long value) {
        super(r1, r2);
        this.mValue = value;
    }

    public long getValue() {
        return this.mValue;
    }

    static FileSectionType fromValue(long value) {
        FileSectionType[] values = values();
        int i = 0;
    L4:
        if (i >= values.length) goto L11;
        if (values[i].getValue() == value) goto L8;
        i = i + 1;
        goto L4
    L8:
        return values[i];
    L11:
        throw new IllegalArgumentException("Unsupported FileSection Type " + value);
    }
}
