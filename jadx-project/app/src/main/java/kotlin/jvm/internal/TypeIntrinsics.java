package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
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
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: classes4.dex */
public class TypeIntrinsics {
    public TypeIntrinsics() {
    }

    private static <T extends Throwable> T sanitizeStackTrace(T r1) {
        return (T) Intrinsics.sanitizeStackTrace(r1, TypeIntrinsics.class.getName());
    }

    public static void throwCce(Object argument, String requestedClassName) {
        if (argument != null) goto L4;
        String argumentClassName = "null";
    L5:
        throwCce(argumentClassName + " cannot be cast to " + requestedClassName);
        return;
    L4:
        argumentClassName = argument.getClass().getName();
        goto L5
    }

    public static void throwCce(String message) {
        throw throwCce(new ClassCastException(message));
    }

    public static ClassCastException throwCce(ClassCastException e) {
        throw ((ClassCastException) sanitizeStackTrace(e));
    }

    public static boolean isMutableIterator(Object obj) {
        if ((obj instanceof Iterator) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableIterator) == false) goto L9;
        goto L8
    }

    public static Iterator asMutableIterator(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableIterator) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableIterator");
    L8:
        return castToIterator(obj);
    }

    public static Iterator asMutableIterator(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableIterator) == true) goto L8;
        throwCce(message);
    L8:
        return castToIterator(obj);
    }

    public static Iterator castToIterator(Object obj) {
        return (Iterator) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static boolean isMutableListIterator(Object obj) {
        if ((obj instanceof ListIterator) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableListIterator) == false) goto L9;
        goto L8
    }

    public static ListIterator asMutableListIterator(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableListIterator) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableListIterator");
    L8:
        return castToListIterator(obj);
    }

    public static ListIterator asMutableListIterator(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableListIterator) == true) goto L8;
        throwCce(message);
    L8:
        return castToListIterator(obj);
    }

    public static ListIterator castToListIterator(Object obj) {
        return (ListIterator) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static boolean isMutableIterable(Object obj) {
        if ((obj instanceof Iterable) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableIterable) == false) goto L9;
        goto L8
    }

    public static Iterable asMutableIterable(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableIterable) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableIterable");
    L8:
        return castToIterable(obj);
    }

    public static Iterable asMutableIterable(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableIterable) == true) goto L8;
        throwCce(message);
    L8:
        return castToIterable(obj);
    }

    public static Iterable castToIterable(Object obj) {
        return (Iterable) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static boolean isMutableCollection(Object obj) {
        if ((obj instanceof Collection) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableCollection) == false) goto L9;
        goto L8
    }

    public static Collection asMutableCollection(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableCollection) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableCollection");
    L8:
        return castToCollection(obj);
    }

    public static Collection asMutableCollection(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableCollection) == true) goto L8;
        throwCce(message);
    L8:
        return castToCollection(obj);
    }

    public static Collection castToCollection(Object obj) {
        return (Collection) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static boolean isMutableList(Object obj) {
        if ((obj instanceof List) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableList) == false) goto L9;
        goto L8
    }

    public static List asMutableList(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableList) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableList");
    L8:
        return castToList(obj);
    }

    public static List asMutableList(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableList) == true) goto L8;
        throwCce(message);
    L8:
        return castToList(obj);
    }

    public static List castToList(Object obj) {
        return (List) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static boolean isMutableSet(Object obj) {
        if ((obj instanceof Set) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableSet) == false) goto L9;
        goto L8
    }

    public static Set asMutableSet(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableSet) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableSet");
    L8:
        return castToSet(obj);
    }

    public static Set asMutableSet(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableSet) == true) goto L8;
        throwCce(message);
    L8:
        return castToSet(obj);
    }

    public static Set castToSet(Object obj) {
        return (Set) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static boolean isMutableMap(Object obj) {
        if ((obj instanceof Map) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableMap) == false) goto L9;
        goto L8
    }

    public static Map asMutableMap(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableMap) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableMap");
    L8:
        return castToMap(obj);
    }

    public static Map asMutableMap(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableMap) == true) goto L8;
        throwCce(message);
    L8:
        return castToMap(obj);
    }

    public static Map castToMap(Object obj) {
        return (Map) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static boolean isMutableMapEntry(Object obj) {
        if ((obj instanceof Map.Entry) == true) goto L5;
    L9:
        return false;
    L5:
        if ((obj instanceof KMappedMarker) == true) goto L7;
    L8:
        return true;
    L7:
        if ((obj instanceof KMutableMap.Entry) == false) goto L9;
        goto L8
    }

    public static Map.Entry asMutableMapEntry(Object obj) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableMap.Entry) == true) goto L8;
        throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
    L8:
        return castToMapEntry(obj);
    }

    public static Map.Entry asMutableMapEntry(Object obj, String message) {
        if ((obj instanceof KMappedMarker) == false) goto L8;
        if ((obj instanceof KMutableMap.Entry) == true) goto L8;
        throwCce(message);
    L8:
        return castToMapEntry(obj);
    }

    public static Map.Entry castToMapEntry(Object obj) {
        return (Map.Entry) obj;
    L4:
        e = move-exception;
        throw throwCce(e);
    }

    public static int getFunctionArity(Object obj) {
        if ((obj instanceof FunctionBase) == false) goto L7;
        return ((FunctionBase) obj).getArity();
    L7:
        if ((obj instanceof Function0) == false) goto L11;
        return 0;
    L11:
        if ((obj instanceof Function1) == false) goto L15;
        return 1;
    L15:
        if ((obj instanceof Function2) == false) goto L19;
        return 2;
    L19:
        if ((obj instanceof Function3) == false) goto L23;
        return 3;
    L23:
        if ((obj instanceof Function4) == false) goto L27;
        return 4;
    L27:
        if ((obj instanceof Function5) == false) goto L31;
        return 5;
    L31:
        if ((obj instanceof Function6) == false) goto L35;
        return 6;
    L35:
        if ((obj instanceof Function7) == false) goto L39;
        return 7;
    L39:
        if ((obj instanceof Function8) == false) goto L43;
        return 8;
    L43:
        if ((obj instanceof Function9) == false) goto L47;
        return 9;
    L47:
        if ((obj instanceof Function10) == false) goto L51;
        return 10;
    L51:
        if ((obj instanceof Function11) == false) goto L55;
        return 11;
    L55:
        if ((obj instanceof Function12) == false) goto L59;
        return 12;
    L59:
        if ((obj instanceof Function13) == false) goto L63;
        return 13;
    L63:
        if ((obj instanceof Function14) == false) goto L67;
        return 14;
    L67:
        if ((obj instanceof Function15) == false) goto L71;
        return 15;
    L71:
        if ((obj instanceof Function16) == false) goto L75;
        return 16;
    L75:
        if ((obj instanceof Function17) == false) goto L79;
        return 17;
    L79:
        if ((obj instanceof Function18) == false) goto L83;
        return 18;
    L83:
        if ((obj instanceof Function19) == false) goto L87;
        return 19;
    L87:
        if ((obj instanceof Function20) == false) goto L91;
        return 20;
    L91:
        if ((obj instanceof Function21) == false) goto L95;
        return 21;
    L95:
        if ((obj instanceof Function22) == false) goto L98;
        return 22;
    L98:
        return -1;
    }

    public static boolean isFunctionOfArity(Object obj, int arity) {
        if ((obj instanceof Function) == true) goto L5;
    L7:
        return false;
    L5:
        if (getFunctionArity(obj) != arity) goto L7;
        return true;
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int arity) {
        if (obj != null) goto L4;
    L6:
        return obj;
    L4:
        if (isFunctionOfArity(obj, arity) == true) goto L6;
        throwCce(obj, "kotlin.jvm.functions.Function" + arity);
        goto L6
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int arity, String message) {
        if (obj != null) goto L4;
    L6:
        return obj;
    L4:
        if (isFunctionOfArity(obj, arity) == true) goto L6;
        throwCce(message);
        goto L6
    }
}
