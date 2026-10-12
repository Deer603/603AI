package kotlin.jvm.internal;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.internal.CollectionDescriptorsKt;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001PB\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010I\u001a\u00020JH\u0002J\u0013\u0010K\u001a\u00020#2\b\u0010L\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020\u000bH\u0016R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001eR \u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010(\u001a\u0004\b-\u0010\u001eR(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u001b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b/\u0010(\u001a\u0004\b0\u0010\u001eR\u001c\u00101\u001a\u0004\u0018\u0001028VX\u0097\u0004¢\u0006\f\u0012\u0004\b3\u0010(\u001a\u0004\b4\u00105R\u001a\u00106\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\b7\u0010(\u001a\u0004\b6\u00108R\u001a\u00109\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\b:\u0010(\u001a\u0004\b9\u00108R\u001a\u0010;\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\b<\u0010(\u001a\u0004\b;\u00108R\u001a\u0010=\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\b>\u0010(\u001a\u0004\b=\u00108R\u001a\u0010?\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\b@\u0010(\u001a\u0004\b?\u00108R\u001a\u0010A\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\bB\u0010(\u001a\u0004\bA\u00108R\u001a\u0010C\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\bD\u0010(\u001a\u0004\bC\u00108R\u001a\u0010E\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\bF\u0010(\u001a\u0004\bE\u00108R\u001a\u0010G\u001a\u00020#8VX\u0097\u0004¢\u0006\f\u0012\u0004\bH\u0010(\u001a\u0004\bG\u00108¨\u0006Q"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "simpleName", "", "getSimpleName", "()Ljava/lang/String;", "qualifiedName", "getQualifiedName", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "nestedClasses", "getNestedClasses", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "isInstance", "", "value", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters$annotations", "()V", "getTypeParameters", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes$annotations", "getSupertypes", "sealedSubclasses", "getSealedSubclasses$annotations", "getSealedSubclasses", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "isFinal", "isFinal$annotations", "()Z", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isData", "isData$annotations", "isInner", "isInner$annotations", "isCompanion", "isCompanion$annotations", "isFun", "isFun$annotations", "isValue", "isValue$annotations", "error", "", "equals", "other", "hashCode", "", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {
    public static final Companion Companion = null;
    private static final Map<Class<? extends Function<?>>, Integer> FUNCTION_CLASSES = null;
    private final Class<?> jClass;

    /* JADX INFO: compiled from: ClassReference.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006R&\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "<init>", "()V", "FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "classFqNameOf", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "simpleNameOf", "getClassSimpleName", "jClass", "getClassQualifiedName", "isInstance", "", "value", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        private final String classFqNameOf(String type) {
            switch(type.hashCode()) {
                case -2061550653: goto L266;
                case -2056817302: goto L262;
                case -2034166429: goto L258;
                case -1979556166: goto L254;
                case -1811142716: goto L250;
                case -1811142715: goto L246;
                case -1811142714: goto L242;
                case -1811142713: goto L238;
                case -1811142712: goto L234;
                case -1811142711: goto L230;
                case -1811142710: goto L226;
                case -1811142709: goto L222;
                case -1811142708: goto L218;
                case -1811142707: goto L214;
                case -1811142685: goto L210;
                case -1811142684: goto L206;
                case -1811142683: goto L202;
                case -1571515090: goto L198;
                case -1383349348: goto L194;
                case -1383343454: goto L190;
                case -1325958191: goto L186;
                case -1182275604: goto L182;
                case -1062240117: goto L178;
                case -688322466: goto L174;
                case -527879800: goto L170;
                case -515992664: goto L166;
                case -246476834: goto L162;
                case -207262728: goto L158;
                case -165139126: goto L154;
                case 104431: goto L150;
                case 3039496: goto L146;
                case 3052374: goto L142;
                case 3327612: goto L138;
                case 64711720: goto L134;
                case 65821278: goto L130;
                case 77230534: goto L126;
                case 80123371: goto L122;
                case 80123372: goto L118;
                case 80123373: goto L114;
                case 80123374: goto L110;
                case 80123375: goto L106;
                case 80123376: goto L102;
                case 80123377: goto L98;
                case 80123378: goto L94;
                case 80123379: goto L90;
                case 80123380: goto L86;
                case 97526364: goto L82;
                case 109413500: goto L78;
                case 155276373: goto L74;
                case 226173651: goto L70;
                case 344809556: goto L66;
                case 398507100: goto L62;
                case 398585941: goto L58;
                case 398795216: goto L54;
                case 482629606: goto L50;
                case 499831342: goto L46;
                case 577341676: goto L42;
                case 599019395: goto L38;
                case 761287205: goto L34;
                case 1052881309: goto L30;
                case 1063877011: goto L26;
                case 1195259493: goto L22;
                case 1275614662: goto L18;
                case 1383693018: goto L14;
                case 1630335596: goto L10;
                case 1877171123: goto L6;
                default: goto L269;
            };
        L269:
            return null;
        L6:
            if (type.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L269;
            return "kotlin.Int.Companion";
        L10:
            if (type.equals("java.lang.Throwable") == false) goto L269;
            return "kotlin.Throwable";
        L14:
            if (type.equals("kotlin.jvm.internal.BooleanCompanionObject") == false) goto L269;
            return "kotlin.Boolean.Companion";
        L18:
            if (type.equals("java.lang.Iterable") == false) goto L269;
            return "kotlin.collections.Iterable";
        L22:
            if (type.equals("java.lang.String") == false) goto L269;
            return "kotlin.String";
        L26:
            if (type.equals("java.lang.Object") == false) goto L269;
            return "kotlin.Any";
        L30:
            if (type.equals("java.lang.Number") == false) goto L269;
            return "kotlin.Number";
        L34:
            if (type.equals("java.lang.Double") == false) goto L269;
            return "kotlin.Double";
        L38:
            if (type.equals("kotlin.jvm.internal.StringCompanionObject") == false) goto L269;
            return "kotlin.String.Companion";
        L42:
            if (type.equals("java.util.ListIterator") == false) goto L269;
            return "kotlin.collections.ListIterator";
        L46:
            if (type.equals("java.util.Iterator") == false) goto L269;
            return "kotlin.collections.Iterator";
        L50:
            if (type.equals("kotlin.jvm.internal.FloatCompanionObject") == false) goto L269;
            return "kotlin.Float.Companion";
        L54:
            if (type.equals("java.lang.Long") == false) goto L269;
            return "kotlin.Long";
        L58:
            if (type.equals("java.lang.Enum") == false) goto L269;
            return "kotlin.Enum";
        L62:
            if (type.equals("java.lang.Byte") == false) goto L269;
            return "kotlin.Byte";
        L66:
            if (type.equals("java.lang.Boolean") == false) goto L269;
            return "kotlin.Boolean";
        L70:
            if (type.equals("kotlin.jvm.internal.EnumCompanionObject") == false) goto L269;
            return "kotlin.Enum.Companion";
        L74:
            if (type.equals("java.lang.Character") == false) goto L269;
            return "kotlin.Char";
        L78:
            if (type.equals("short") == false) goto L269;
            return "kotlin.Short";
        L82:
            if (type.equals("float") == false) goto L269;
            return "kotlin.Float";
        L86:
            if (type.equals("kotlin.jvm.functions.Function9") == false) goto L269;
            return "kotlin.Function9";
        L90:
            if (type.equals("kotlin.jvm.functions.Function8") == false) goto L269;
            return "kotlin.Function8";
        L94:
            if (type.equals("kotlin.jvm.functions.Function7") == false) goto L269;
            return "kotlin.Function7";
        L98:
            if (type.equals("kotlin.jvm.functions.Function6") == false) goto L269;
            return "kotlin.Function6";
        L102:
            if (type.equals("kotlin.jvm.functions.Function5") == false) goto L269;
            return "kotlin.Function5";
        L106:
            if (type.equals("kotlin.jvm.functions.Function4") == false) goto L269;
            return "kotlin.Function4";
        L110:
            if (type.equals("kotlin.jvm.functions.Function3") == false) goto L269;
            return "kotlin.Function3";
        L114:
            if (type.equals("kotlin.jvm.functions.Function2") == false) goto L269;
            return "kotlin.Function2";
        L118:
            if (type.equals("kotlin.jvm.functions.Function1") == false) goto L269;
            return "kotlin.Function1";
        L122:
            if (type.equals("kotlin.jvm.functions.Function0") == false) goto L269;
            return "kotlin.Function0";
        L126:
            if (type.equals("kotlin.jvm.internal.ShortCompanionObject") == false) goto L269;
            return "kotlin.Short.Companion";
        L130:
            if (type.equals("java.util.List") == false) goto L269;
            return "kotlin.collections.List";
        L134:
            if (type.equals("boolean") == false) goto L269;
            return "kotlin.Boolean";
        L138:
            if (type.equals("long") == false) goto L269;
            return "kotlin.Long";
        L142:
            if (type.equals("char") == false) goto L269;
            return "kotlin.Char";
        L146:
            if (type.equals("byte") == false) goto L269;
            return "kotlin.Byte";
        L150:
            if (type.equals("int") == false) goto L269;
            return "kotlin.Int";
        L154:
            if (type.equals("java.util.Map$Entry") == false) goto L269;
            return "kotlin.collections.Map.Entry";
        L158:
            if (type.equals("kotlin.jvm.internal.LongCompanionObject") == false) goto L269;
            return "kotlin.Long.Companion";
        L162:
            if (type.equals("kotlin.jvm.internal.CharCompanionObject") == false) goto L269;
            return "kotlin.Char.Companion";
        L166:
            if (type.equals("java.lang.Short") == false) goto L269;
            return "kotlin.Short";
        L170:
            if (type.equals("java.lang.Float") == false) goto L269;
            return "kotlin.Float";
        L174:
            if (type.equals("java.util.Collection") == false) goto L269;
            return "kotlin.collections.Collection";
        L178:
            if (type.equals("java.lang.CharSequence") == false) goto L269;
            return "kotlin.CharSequence";
        L182:
            if (type.equals("kotlin.jvm.internal.ByteCompanionObject") == false) goto L269;
            return "kotlin.Byte.Companion";
        L186:
            if (type.equals("double") == false) goto L269;
            return "kotlin.Double";
        L190:
            if (type.equals("java.util.Set") == false) goto L269;
            return "kotlin.collections.Set";
        L194:
            if (type.equals("java.util.Map") == false) goto L269;
            return "kotlin.collections.Map";
        L198:
            if (type.equals("java.lang.Comparable") == false) goto L269;
            return "kotlin.Comparable";
        L202:
            if (type.equals("kotlin.jvm.functions.Function22") == false) goto L269;
            return "kotlin.Function22";
        L206:
            if (type.equals("kotlin.jvm.functions.Function21") == false) goto L269;
            return "kotlin.Function21";
        L210:
            if (type.equals("kotlin.jvm.functions.Function20") == false) goto L269;
            return "kotlin.Function20";
        L214:
            if (type.equals("kotlin.jvm.functions.Function19") == false) goto L269;
            return "kotlin.Function19";
        L218:
            if (type.equals("kotlin.jvm.functions.Function18") == false) goto L269;
            return "kotlin.Function18";
        L222:
            if (type.equals("kotlin.jvm.functions.Function17") == false) goto L269;
            return "kotlin.Function17";
        L226:
            if (type.equals("kotlin.jvm.functions.Function16") == false) goto L269;
            return "kotlin.Function16";
        L230:
            if (type.equals("kotlin.jvm.functions.Function15") == false) goto L269;
            return "kotlin.Function15";
        L234:
            if (type.equals("kotlin.jvm.functions.Function14") == false) goto L269;
            return "kotlin.Function14";
        L238:
            if (type.equals("kotlin.jvm.functions.Function13") == false) goto L269;
            return "kotlin.Function13";
        L242:
            if (type.equals("kotlin.jvm.functions.Function12") == false) goto L269;
            return "kotlin.Function12";
        L246:
            if (type.equals("kotlin.jvm.functions.Function11") == false) goto L269;
            return "kotlin.Function11";
        L250:
            if (type.equals("kotlin.jvm.functions.Function10") == false) goto L269;
            return "kotlin.Function10";
        L254:
            if (type.equals("java.lang.annotation.Annotation") == false) goto L269;
            return "kotlin.Annotation";
        L258:
            if (type.equals("java.lang.Cloneable") == false) goto L269;
            return "kotlin.Cloneable";
        L262:
            if (type.equals("java.lang.Integer") == false) goto L269;
            return "kotlin.Int";
        L266:
            if (type.equals("kotlin.jvm.internal.DoubleCompanionObject") == false) goto L269;
            return "kotlin.Double.Companion";
        }

        private final String simpleNameOf(String type) {
            switch(type.hashCode()) {
                case -2061550653: goto L266;
                case -2056817302: goto L262;
                case -2034166429: goto L258;
                case -1979556166: goto L254;
                case -1811142716: goto L250;
                case -1811142715: goto L246;
                case -1811142714: goto L242;
                case -1811142713: goto L238;
                case -1811142712: goto L234;
                case -1811142711: goto L230;
                case -1811142710: goto L226;
                case -1811142709: goto L222;
                case -1811142708: goto L218;
                case -1811142707: goto L214;
                case -1811142685: goto L210;
                case -1811142684: goto L206;
                case -1811142683: goto L202;
                case -1571515090: goto L198;
                case -1383349348: goto L194;
                case -1383343454: goto L190;
                case -1325958191: goto L186;
                case -1182275604: goto L182;
                case -1062240117: goto L178;
                case -688322466: goto L174;
                case -527879800: goto L170;
                case -515992664: goto L166;
                case -246476834: goto L162;
                case -207262728: goto L158;
                case -165139126: goto L154;
                case 104431: goto L150;
                case 3039496: goto L146;
                case 3052374: goto L142;
                case 3327612: goto L138;
                case 64711720: goto L134;
                case 65821278: goto L130;
                case 77230534: goto L126;
                case 80123371: goto L122;
                case 80123372: goto L118;
                case 80123373: goto L114;
                case 80123374: goto L110;
                case 80123375: goto L106;
                case 80123376: goto L102;
                case 80123377: goto L98;
                case 80123378: goto L94;
                case 80123379: goto L90;
                case 80123380: goto L86;
                case 97526364: goto L82;
                case 109413500: goto L78;
                case 155276373: goto L74;
                case 226173651: goto L70;
                case 344809556: goto L66;
                case 398507100: goto L62;
                case 398585941: goto L58;
                case 398795216: goto L54;
                case 482629606: goto L50;
                case 499831342: goto L46;
                case 577341676: goto L42;
                case 599019395: goto L38;
                case 761287205: goto L34;
                case 1052881309: goto L30;
                case 1063877011: goto L26;
                case 1195259493: goto L22;
                case 1275614662: goto L18;
                case 1383693018: goto L14;
                case 1630335596: goto L10;
                case 1877171123: goto L6;
                default: goto L269;
            };
        L269:
            return null;
        L6:
            if (type.equals("kotlin.jvm.internal.IntCompanionObject") == false) goto L269;
            return "Companion";
        L10:
            if (type.equals("java.lang.Throwable") == false) goto L269;
            return "Throwable";
        L14:
            if (type.equals("kotlin.jvm.internal.BooleanCompanionObject") == false) goto L269;
            return "Companion";
        L18:
            if (type.equals("java.lang.Iterable") == false) goto L269;
            return "Iterable";
        L22:
            if (type.equals("java.lang.String") == false) goto L269;
            return "String";
        L26:
            if (type.equals("java.lang.Object") == false) goto L269;
            return "Any";
        L30:
            if (type.equals("java.lang.Number") == false) goto L269;
            return "Number";
        L34:
            if (type.equals("java.lang.Double") == false) goto L269;
            return "Double";
        L38:
            if (type.equals("kotlin.jvm.internal.StringCompanionObject") == false) goto L269;
            return "Companion";
        L42:
            if (type.equals("java.util.ListIterator") == false) goto L269;
            return "ListIterator";
        L46:
            if (type.equals("java.util.Iterator") == false) goto L269;
            return "Iterator";
        L50:
            if (type.equals("kotlin.jvm.internal.FloatCompanionObject") == false) goto L269;
            return "Companion";
        L54:
            if (type.equals("java.lang.Long") == false) goto L269;
            return "Long";
        L58:
            if (type.equals("java.lang.Enum") == false) goto L269;
            return "Enum";
        L62:
            if (type.equals("java.lang.Byte") == false) goto L269;
            return "Byte";
        L66:
            if (type.equals("java.lang.Boolean") == false) goto L269;
            return "Boolean";
        L70:
            if (type.equals("kotlin.jvm.internal.EnumCompanionObject") == false) goto L269;
            return "Companion";
        L74:
            if (type.equals("java.lang.Character") == false) goto L269;
            return "Char";
        L78:
            if (type.equals("short") == false) goto L269;
            return "Short";
        L82:
            if (type.equals("float") == false) goto L269;
            return "Float";
        L86:
            if (type.equals("kotlin.jvm.functions.Function9") == false) goto L269;
            return "Function9";
        L90:
            if (type.equals("kotlin.jvm.functions.Function8") == false) goto L269;
            return "Function8";
        L94:
            if (type.equals("kotlin.jvm.functions.Function7") == false) goto L269;
            return "Function7";
        L98:
            if (type.equals("kotlin.jvm.functions.Function6") == false) goto L269;
            return "Function6";
        L102:
            if (type.equals("kotlin.jvm.functions.Function5") == false) goto L269;
            return "Function5";
        L106:
            if (type.equals("kotlin.jvm.functions.Function4") == false) goto L269;
            return "Function4";
        L110:
            if (type.equals("kotlin.jvm.functions.Function3") == false) goto L269;
            return "Function3";
        L114:
            if (type.equals("kotlin.jvm.functions.Function2") == false) goto L269;
            return "Function2";
        L118:
            if (type.equals("kotlin.jvm.functions.Function1") == false) goto L269;
            return "Function1";
        L122:
            if (type.equals("kotlin.jvm.functions.Function0") == false) goto L269;
            return "Function0";
        L126:
            if (type.equals("kotlin.jvm.internal.ShortCompanionObject") == false) goto L269;
            return "Companion";
        L130:
            if (type.equals("java.util.List") == false) goto L269;
            return "List";
        L134:
            if (type.equals("boolean") == false) goto L269;
            return "Boolean";
        L138:
            if (type.equals("long") == false) goto L269;
            return "Long";
        L142:
            if (type.equals("char") == false) goto L269;
            return "Char";
        L146:
            if (type.equals("byte") == false) goto L269;
            return "Byte";
        L150:
            if (type.equals("int") == false) goto L269;
            return "Int";
        L154:
            if (type.equals("java.util.Map$Entry") == false) goto L269;
            return "Entry";
        L158:
            if (type.equals("kotlin.jvm.internal.LongCompanionObject") == false) goto L269;
            return "Companion";
        L162:
            if (type.equals("kotlin.jvm.internal.CharCompanionObject") == false) goto L269;
            return "Companion";
        L166:
            if (type.equals("java.lang.Short") == false) goto L269;
            return "Short";
        L170:
            if (type.equals("java.lang.Float") == false) goto L269;
            return "Float";
        L174:
            if (type.equals("java.util.Collection") == false) goto L269;
            return "Collection";
        L178:
            if (type.equals("java.lang.CharSequence") == false) goto L269;
            return "CharSequence";
        L182:
            if (type.equals("kotlin.jvm.internal.ByteCompanionObject") == false) goto L269;
            return "Companion";
        L186:
            if (type.equals("double") == false) goto L269;
            return "Double";
        L190:
            if (type.equals("java.util.Set") == false) goto L269;
            return "Set";
        L194:
            if (type.equals("java.util.Map") == false) goto L269;
            return "Map";
        L198:
            if (type.equals("java.lang.Comparable") == false) goto L269;
            return "Comparable";
        L202:
            if (type.equals("kotlin.jvm.functions.Function22") == false) goto L269;
            return "Function22";
        L206:
            if (type.equals("kotlin.jvm.functions.Function21") == false) goto L269;
            return "Function21";
        L210:
            if (type.equals("kotlin.jvm.functions.Function20") == false) goto L269;
            return "Function20";
        L214:
            if (type.equals("kotlin.jvm.functions.Function19") == false) goto L269;
            return "Function19";
        L218:
            if (type.equals("kotlin.jvm.functions.Function18") == false) goto L269;
            return "Function18";
        L222:
            if (type.equals("kotlin.jvm.functions.Function17") == false) goto L269;
            return "Function17";
        L226:
            if (type.equals("kotlin.jvm.functions.Function16") == false) goto L269;
            return "Function16";
        L230:
            if (type.equals("kotlin.jvm.functions.Function15") == false) goto L269;
            return "Function15";
        L234:
            if (type.equals("kotlin.jvm.functions.Function14") == false) goto L269;
            return "Function14";
        L238:
            if (type.equals("kotlin.jvm.functions.Function13") == false) goto L269;
            return "Function13";
        L242:
            if (type.equals("kotlin.jvm.functions.Function12") == false) goto L269;
            return "Function12";
        L246:
            if (type.equals("kotlin.jvm.functions.Function11") == false) goto L269;
            return "Function11";
        L250:
            if (type.equals("kotlin.jvm.functions.Function10") == false) goto L269;
            return "Function10";
        L254:
            if (type.equals("java.lang.annotation.Annotation") == false) goto L269;
            return "Annotation";
        L258:
            if (type.equals("java.lang.Cloneable") == false) goto L269;
            return "Cloneable";
        L262:
            if (type.equals("java.lang.Integer") == false) goto L269;
            return "Int";
        L266:
            if (type.equals("kotlin.jvm.internal.DoubleCompanionObject") == false) goto L269;
            return "Companion";
        }

        public final String getClassSimpleName(Class<?> r9) {
            Intrinsics.checkNotNullParameter(r9, "jClass");
            String r1 = null;
            if (r9.isAnonymousClass() == false) goto L6;
            return null;
        L6:
            if (r9.isLocalClass() == false) goto L18;
            String name = r9.getSimpleName();
            Method method = r9.getEnclosingMethod();
            if (method == null) goto L13;
            Intrinsics.checkNotNull(name);
            String r2 = StringsKt.substringAfter$default(name, method.getName() + Typography.dollar, null, 2, null);
            if (r2 == null) goto L13;
            return r2;
        L13:
            Constructor<?> r3 = r9.getEnclosingConstructor();
            if (r3 == null) goto L16;
            Intrinsics.checkNotNull(name);
            return StringsKt.substringAfter$default(name, r3.getName() + Typography.dollar, null, 2, null);
        L16:
            Intrinsics.checkNotNull(name);
            return StringsKt.substringAfter$default(name, Typography.dollar, null, 2, null);
        L18:
            if (r9.isArray() == false) goto L27;
            Class<?> r0 = r9.getComponentType();
            if (r0.isPrimitive() == false) goto L25;
            String r4 = r0.getName();
            Intrinsics.checkNotNullExpressionValue(r4, "getName(...)");
            String r5 = simpleNameOf(r4);
            if (r5 == null) goto L25;
            r1 = r5 + "Array";
        L25:
            if (r1 == null) goto L35;
            return r1;
        L35:
            return "Array";
        L27:
            String r6 = r9.getName();
            Intrinsics.checkNotNullExpressionValue(r6, "getName(...)");
            String r7 = simpleNameOf(r6);
            if (r7 == null) goto L30;
            return r7;
        L30:
            return r9.getSimpleName();
        }

        public final String getClassQualifiedName(Class<?> r5) {
            Intrinsics.checkNotNullParameter(r5, "jClass");
            String r1 = null;
            if (r5.isAnonymousClass() == false) goto L6;
            return null;
        L6:
            if (r5.isLocalClass() == false) goto L9;
            return null;
        L9:
            if (r5.isArray() == false) goto L18;
            Class<?> r0 = r5.getComponentType();
            if (r0.isPrimitive() == false) goto L16;
            String r3 = r0.getName();
            Intrinsics.checkNotNullExpressionValue(r3, "getName(...)");
            String r2 = classFqNameOf(r3);
            if (r2 == null) goto L16;
            r1 = r2 + "Array";
        L16:
            if (r1 != null) goto L22;
            return CollectionDescriptorsKt.ARRAY_NAME;
        L22:
            return r1;
        L18:
            String r4 = r5.getName();
            Intrinsics.checkNotNullExpressionValue(r4, "getName(...)");
            String r6 = classFqNameOf(r4);
            if (r6 == null) goto L21;
            return r6;
        L21:
            return r5.getCanonicalName();
        }

        public final boolean isInstance(Object value, Class<?> r5) {
            Intrinsics.checkNotNullParameter(r5, "jClass");
            Map r0 = ClassReference.access$getFUNCTION_CLASSES$cp();
            Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer r1 = (Integer) r0.get(r5);
            if (r1 == null) goto L7;
            int arity = r1.intValue();
            return TypeIntrinsics.isFunctionOfArity(value, arity);
        L7:
            if (r5.isPrimitive() == false) goto L9;
            Class<?> r2 = JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(r5));
        L11:
            return r2.isInstance(value);
        L9:
            r2 = r5;
            goto L11
        }
    }

    public static /* synthetic */ void getSealedSubclasses$annotations() {
    }

    public static /* synthetic */ void getSupertypes$annotations() {
    }

    public static /* synthetic */ void getTypeParameters$annotations() {
    }

    public static /* synthetic */ void getVisibility$annotations() {
    }

    public static /* synthetic */ void isAbstract$annotations() {
    }

    public static /* synthetic */ void isCompanion$annotations() {
    }

    public static /* synthetic */ void isData$annotations() {
    }

    public static /* synthetic */ void isFinal$annotations() {
    }

    public static /* synthetic */ void isFun$annotations() {
    }

    public static /* synthetic */ void isInner$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isSealed$annotations() {
    }

    public static /* synthetic */ void isValue$annotations() {
    }

    public ClassReference(Class<?> r2) {
        Intrinsics.checkNotNullParameter(r2, "jClass");
        this.jClass = r2;
    }

    public static final /* synthetic */ Map access$getFUNCTION_CLASSES$cp() {
        return FUNCTION_CLASSES;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KClass
    public String getSimpleName() {
        return Companion.getClassSimpleName(getJClass());
    }

    @Override // kotlin.reflect.KClass
    public String getQualifiedName() {
        return Companion.getClassQualifiedName(getJClass());
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public Collection<KCallable<?>> getMembers() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public Collection<KFunction<Object>> getConstructors() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public Collection<KClass<?>> getNestedClasses() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public Object getObjectInstance() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(Object value) {
        return Companion.isInstance(value, getJClass());
    }

    @Override // kotlin.reflect.KClass
    public List<KTypeParameter> getTypeParameters() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public List<KType> getSupertypes() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public List<KClass<? extends Object>> getSealedSubclasses() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public KVisibility getVisibility() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
        error();
        throw new KotlinNothingValueException();
    }

    private final Void error() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(Object other) {
        if ((other instanceof ClassReference) == true) goto L5;
    L7:
        return false;
    L5:
        if (Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass) other)) == false) goto L7;
        return true;
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    public String toString() {
        return getJClass() + " (Kotlin reflection is not available)";
    }

    static {
        Companion = new Companion(null);
        Iterable $this$mapIndexed$iv = CollectionsKt.listOf(new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
        int index$iv$iv = 0;
        Iterator r6 = $this$mapIndexed$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L9;
        Object item$iv$iv = r6.next();
        int index$iv$iv2 = index$iv$iv + 1;
        if (index$iv$iv >= 0) goto L8;
        CollectionsKt.throwIndexOverflow();
    L8:
        Class clazz = (Class) item$iv$iv;
        destination$iv$iv.add(TuplesKt.to(clazz, Integer.valueOf(index$iv$iv)));
        index$iv$iv = index$iv$iv2;
        goto L4
    L9:
        FUNCTION_CLASSES = MapsKt.toMap((List) destination$iv$iv);
    }
}
