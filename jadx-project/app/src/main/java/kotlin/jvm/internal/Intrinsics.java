package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes4.dex */
public class Intrinsics {

    public static class Kotlin {
        private Kotlin() {
        }
    }

    private Intrinsics() {
    }

    public static String stringPlus(String self, Object other) {
        return self + other;
    }

    public static void checkNotNull(Object object) {
        if (object != null) goto L5;
        throwJavaNpe();
        return;
    }

    public static void checkNotNull(Object object, String message) {
        if (object != null) goto L5;
        throwJavaNpe(message);
        return;
    }

    public static void throwNpe() {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException()));
    }

    public static void throwNpe(String message) {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException(message)));
    }

    public static void throwJavaNpe() {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException()));
    }

    public static void throwJavaNpe(String message) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(message)));
    }

    public static void throwUninitializedProperty(String message) {
        throw ((UninitializedPropertyAccessException) sanitizeStackTrace(new UninitializedPropertyAccessException(message)));
    }

    public static void throwUninitializedPropertyAccessException(String propertyName) {
        throwUninitializedProperty("lateinit property " + propertyName + " has not been initialized");
    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwAssert(String message) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(message)));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalArgument(String message) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(message)));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    public static void throwIllegalState(String message) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(message)));
    }

    public static void checkExpressionValueIsNotNull(Object value, String expression) {
        if (value == null) goto L5;
        return;
    L5:
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(expression + " must not be null")));
    }

    public static void checkNotNullExpressionValue(Object value, String expression) {
        if (value == null) goto L5;
        return;
    L5:
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(expression + " must not be null")));
    }

    public static void checkReturnedValueIsNotNull(Object value, String className, String methodName) {
        if (value == null) goto L5;
        return;
    L5:
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Method specified as non-null returned null: " + className + "." + methodName)));
    }

    public static void checkReturnedValueIsNotNull(Object value, String message) {
        if (value == null) goto L5;
        return;
    L5:
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(message)));
    }

    public static void checkFieldIsNotNull(Object value, String className, String fieldName) {
        if (value == null) goto L5;
        return;
    L5:
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + className + "." + fieldName)));
    }

    public static void checkFieldIsNotNull(Object value, String message) {
        if (value == null) goto L5;
        return;
    L5:
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(message)));
    }

    public static void checkParameterIsNotNull(Object value, String paramName) {
        if (value != null) goto L5;
        throwParameterIsNullIAE(paramName);
        return;
    }

    public static void checkNotNullParameter(Object value, String paramName) {
        if (value != null) goto L5;
        throwParameterIsNullNPE(paramName);
        return;
    }

    private static void throwParameterIsNullIAE(String paramName) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(createParameterIsNullExceptionMessage(paramName))));
    }

    private static void throwParameterIsNullNPE(String paramName) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(createParameterIsNullExceptionMessage(paramName))));
    }

    private static String createParameterIsNullExceptionMessage(String paramName) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String thisClassName = Intrinsics.class.getName();
        int i = 0;
    L4:
        if (stackTraceElements[i].getClassName().equals(thisClassName) == true) goto L7;
        i = i + 1;
    L7:
        if (stackTraceElements[i].getClassName().equals(thisClassName) == false) goto L9;
        i = i + 1;
        goto L7
    L9:
        StackTraceElement caller = stackTraceElements[i];
        String className = caller.getClassName();
        String methodName = caller.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + paramName;
    }

    public static int compare(long thisVal, long anotherVal) {
        if (thisVal >= anotherVal) goto L6;
        return -1;
    L6:
        if (thisVal != anotherVal) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static int compare(int thisVal, int anotherVal) {
        if (thisVal >= anotherVal) goto L4;
        return -1;
    L4:
        if (thisVal != anotherVal) goto L6;
        return 0;
    L6:
        return 1;
    }

    public static boolean areEqual(Object first, Object second) {
        if (first != null) goto L7;
        if (second != null) goto L5;
        return true;
    L5:
        return false;
    L7:
        return first.equals(second);
    }

    public static boolean areEqual(Double first, Double second) {
        if (first != null) goto L6;
        if (second != null) goto L11;
        return true;
    L11:
        return false;
    L6:
        if (second == null) goto L11;
        if (first.doubleValue() != second.doubleValue()) goto L11;
        return true;
    }

    public static boolean areEqual(Double first, double second) {
        if (first != null) goto L4;
    L6:
        return false;
    L4:
        if (first.doubleValue() != second) goto L6;
        return true;
    }

    public static boolean areEqual(double first, Double second) {
        if (second != null) goto L4;
    L6:
        return false;
    L4:
        if (first != second.doubleValue()) goto L6;
        return true;
    }

    public static boolean areEqual(Float first, Float second) {
        if (first != null) goto L6;
        if (second != null) goto L11;
        return true;
    L11:
        return false;
    L6:
        if (second == null) goto L11;
        if (first.floatValue() != second.floatValue()) goto L11;
        return true;
    }

    public static boolean areEqual(Float first, float second) {
        if (first != null) goto L4;
    L6:
        return false;
    L4:
        if (first.floatValue() != second) goto L6;
        return true;
    }

    public static boolean areEqual(float first, Float second) {
        if (second != null) goto L4;
    L6:
        return false;
    L4:
        if (first != second.floatValue()) goto L6;
        return true;
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(String message) {
        throw new UnsupportedOperationException(message);
    }

    public static void reifiedOperationMarker(int id, String typeParameterIdentifier) {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int id, String typeParameterIdentifier, String message) {
        throwUndefinedForReified(message);
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void needClassReification(String message) {
        throwUndefinedForReified(message);
    }

    public static void checkHasClass(String internalName) throws ClassNotFoundException {
        String fqName = internalName.replace('/', '.');
        Class.forName(fqName);     // Catch: ClassNotFoundException -> L5
        return;
    L5:
        e = move-exception;
        throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + fqName + " is not found. Please update the Kotlin runtime to the latest version", e)));
    }

    public static void checkHasClass(String internalName, String requiredVersion) throws ClassNotFoundException {
        String fqName = internalName.replace('/', '.');
        Class.forName(fqName);     // Catch: ClassNotFoundException -> L5
        return;
    L5:
        e = move-exception;
        throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException("Class " + fqName + " is not found: this code requires the Kotlin runtime of version at least " + requiredVersion, e)));
    }

    private static <T extends Throwable> T sanitizeStackTrace(T r1) {
        return (T) sanitizeStackTrace(r1, Intrinsics.class.getName());
    }

    static <T extends Throwable> T sanitizeStackTrace(T throwable, String classNameToDrop) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int size = stackTrace.length;
        int lastIntrinsic = -1;
        int i = 0;
    L3:
        if (i >= size) goto L8;
        if (classNameToDrop.equals(stackTrace[i].getClassName()) == false) goto L7;
        lastIntrinsic = i;
    L7:
        i = i + 1;
        goto L3
    L8:
        int i2 = lastIntrinsic + 1;
        StackTraceElement[] newStackTrace = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2, size);
        throwable.setStackTrace(newStackTrace);
        return throwable;
    }
}
