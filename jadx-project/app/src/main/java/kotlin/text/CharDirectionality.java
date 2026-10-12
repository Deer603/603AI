package kotlin.text;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: CharDirectionality.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum CharDirectionality extends Enum<CharDirectionality> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ CharDirectionality[] $VALUES = null;
    public static final CharDirectionality ARABIC_NUMBER = null;
    public static final CharDirectionality BOUNDARY_NEUTRAL = null;
    public static final CharDirectionality COMMON_NUMBER_SEPARATOR = null;
    public static final Companion Companion = null;
    public static final CharDirectionality EUROPEAN_NUMBER = null;
    public static final CharDirectionality EUROPEAN_NUMBER_SEPARATOR = null;
    public static final CharDirectionality EUROPEAN_NUMBER_TERMINATOR = null;
    public static final CharDirectionality LEFT_TO_RIGHT = null;
    public static final CharDirectionality LEFT_TO_RIGHT_EMBEDDING = null;
    public static final CharDirectionality LEFT_TO_RIGHT_OVERRIDE = null;
    public static final CharDirectionality NONSPACING_MARK = null;
    public static final CharDirectionality OTHER_NEUTRALS = null;
    public static final CharDirectionality PARAGRAPH_SEPARATOR = null;
    public static final CharDirectionality POP_DIRECTIONAL_FORMAT = null;
    public static final CharDirectionality RIGHT_TO_LEFT = null;
    public static final CharDirectionality RIGHT_TO_LEFT_ARABIC = null;
    public static final CharDirectionality RIGHT_TO_LEFT_EMBEDDING = null;
    public static final CharDirectionality RIGHT_TO_LEFT_OVERRIDE = null;
    public static final CharDirectionality SEGMENT_SEPARATOR = null;
    public static final CharDirectionality UNDEFINED = null;
    public static final CharDirectionality WHITESPACE = null;
    private static final Lazy<Map<Integer, CharDirectionality>> directionalityMap$delegate = null;
    private final int value;

    /* JADX INFO: compiled from: CharDirectionality.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", "", "<init>", "()V", "directionalityMap", "", "", "Lkotlin/text/CharDirectionality;", "getDirectionalityMap", "()Ljava/util/Map;", "directionalityMap$delegate", "Lkotlin/Lazy;", "valueOf", "directionality", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        private final Map<Integer, CharDirectionality> getDirectionalityMap() {
            return (Map) CharDirectionality.access$getDirectionalityMap$delegate$cp().getValue();
        }

        public final CharDirectionality valueOf(int directionality) {
            CharDirectionality r0 = getDirectionalityMap().get(Integer.valueOf(directionality));
            if (r0 == null) goto L6;
            return r0;
        L6:
            throw new IllegalArgumentException("Directionality #" + directionality + " is not defined.");
        }
    }

    private static final /* synthetic */ CharDirectionality[] $values() {
        return new CharDirectionality[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    public static EnumEntries<CharDirectionality> getEntries() {
        return $ENTRIES;
    }

    public static CharDirectionality valueOf(String r1) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, r1);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) $VALUES.clone();
    }

    private CharDirectionality(String $enum$name, int $enum$ordinal, int value) {
        super($enum$name, $enum$ordinal);
        this.value = value;
    }

    public static final /* synthetic */ Lazy access$getDirectionalityMap$delegate$cp() {
        return directionalityMap$delegate;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        UNDEFINED = new CharDirectionality("UNDEFINED", 0, -1);
        LEFT_TO_RIGHT = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);
        RIGHT_TO_LEFT = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);
        RIGHT_TO_LEFT_ARABIC = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
        EUROPEAN_NUMBER = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);
        EUROPEAN_NUMBER_SEPARATOR = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
        EUROPEAN_NUMBER_TERMINATOR = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
        ARABIC_NUMBER = new CharDirectionality("ARABIC_NUMBER", 7, 6);
        COMMON_NUMBER_SEPARATOR = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
        NONSPACING_MARK = new CharDirectionality("NONSPACING_MARK", 9, 8);
        BOUNDARY_NEUTRAL = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
        PARAGRAPH_SEPARATOR = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
        SEGMENT_SEPARATOR = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
        WHITESPACE = new CharDirectionality("WHITESPACE", 13, 12);
        OTHER_NEUTRALS = new CharDirectionality("OTHER_NEUTRALS", 14, 13);
        LEFT_TO_RIGHT_EMBEDDING = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
        LEFT_TO_RIGHT_OVERRIDE = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
        RIGHT_TO_LEFT_EMBEDDING = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
        RIGHT_TO_LEFT_OVERRIDE = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
        POP_DIRECTIONAL_FORMAT = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        Companion = new Companion(null);
        directionalityMap$delegate = LazyKt.lazy(new CharDirectionality$$ExternalSyntheticLambda0());
    }

    static final Map directionalityMap_delegate$lambda$1() {
        Iterable $this$associateBy$iv = getEntries();
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        Iterator<CharDirectionality> r6 = $this$associateBy$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L7;
        CharDirectionality r7 = r6.next();
        CharDirectionality it = r7;
        destination$iv$iv.put(Integer.valueOf(it.value), r7);
        goto L4
    L7:
        return destination$iv$iv;
    }
}
