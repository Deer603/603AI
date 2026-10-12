package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0000\n\u0002\u0010*\n\u0000\n\u0002\u0010+\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u001d\u0010\u001c\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u001d\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J=\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010+\u001a\u00020\u000b2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0-H\u0002¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u00100J\r\u00101\u001a\u00020\u000bH\u0000¢\u0006\u0002\b2JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u000206H\u0002¢\u0006\u0002\u00107J[\u00103\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0016\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001a\u00020\u000b2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010<J/\u0010=\u001a\u00020 2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010>J\u001d\u0010?\u001a\u00020\u001d2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010@J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000BH\u0096\u0002J\u001e\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070D2\u0006\u0010!\u001a\u00020\u000bH\u0002J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0016J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000F2\u0006\u0010!\u001a\u00020\u000bH\u0016J'\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010HJ-\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010J\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010KJ\u0015\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010\u0012J\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010NJ5\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010!\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010PJ?\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u000206H\u0002¢\u0006\u0002\u0010TJ/\u0010U\u001a\u00020 2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010VJM\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0014\u0010X\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070-H\u0002¢\u0006\u0002\u0010YJE\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0007H\u0002¢\u0006\u0002\u0010[J?\u0010\\\u001a\u00020 2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010_J?\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010aJu\u0010b\u001a\u00020\u000b2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0d2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u0002062\u0014\u0010h\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070i2\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070iH\u0002¢\u0006\u0002\u0010jJ\u001c\u0010k\u001a\u00020\u001d2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0dH\u0002JA\u0010k\u001a\u00020\u000b2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0d2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010g\u001a\u000206H\u0002¢\u0006\u0002\u0010lJ\u0016\u0010k\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J,\u0010m\u001a\u00020\u000b2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0d2\u0006\u0010n\u001a\u00020\u000b2\u0006\u0010g\u001a\u000206H\u0002J\u001a\u0010o\u001a\u00020\u001d2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0dJ\u0015\u0010p\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0002\u00100J=\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010S\u001a\u000206H\u0002¢\u0006\u0002\u0010TJ9\u0010r\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010sJ/\u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010KJ\b\u0010R\u001a\u00020\u000bH\u0002J\u001e\u0010u\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010vJE\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010x\u001a\u00028\u00002\u0006\u0010y\u001a\u000206H\u0002¢\u0006\u0002\u00107JU\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010{\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0016\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001a\u00020\u000b2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010|Jl\u0010}\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001a\u00020\u000b2\u000e\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u007f\u001a\u00020\u000b2\u0016\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001a\u00020\u000b2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0003\u0010\u0080\u0001J\b\u0010n\u001a\u00020\u000bH\u0002J\u0010\u0010n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R0\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "", "", "vectorTail", "rootShift", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "root", "getRoot$runtime_release", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getRootShift$runtime_release", "()I", "setRootShift$runtime_release", "(I)V", "size", "getSize", "tail", "getTail$runtime_release", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "bufferFor", "(I)[Ljava/lang/Object;", "build", "copyToBuffer", "buffer", "bufferIndex", "sourceIterator", "", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "get", "(I)Ljava/lang/Object;", "getModCount", "getModCount$runtime_release", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "rightShift", "buffers", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "isMutable", "([Ljava/lang/Object;)Z", "iterator", "", "leafBufferIterator", "", "listIterator", "", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "makeMutableShiftingRight", "distance", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "mutableBuffer", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "pullLastBuffer", "rootSize", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pushBuffers", "buffersIterator", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "recyclableRemoveAll", "predicate", "Lkotlin/Function1;", "bufferSize", "toBufferSize", "bufferRef", "recyclableBuffers", "", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "removeAll", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "removeAllFromTail", "tailSize", "removeAllWithPredicate", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "retainFirst", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setInRoot", "e", "oldElementCarry", "shiftLeafBuffers", "startLeafIndex", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "splitToBuffers", "startBuffer", "startBufferSize", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
    public static final int $stable = 0;
    private MutabilityOwnership ownership;
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    static {
        $stable = 8;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public /* bridge */ /* synthetic */ PersistentCollection build() {
        return build();
    }

    public PersistentVectorBuilder(PersistentList<? extends E> r2, Object[] vectorRoot, Object[] vectorTail, int rootShift) {
        this.vector = r2;
        this.vectorRoot = vectorRoot;
        this.vectorTail = vectorTail;
        this.rootShift = rootShift;
        this.ownership = new MutabilityOwnership();
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    public final void setRootShift$runtime_release(int r1) {
        this.rootShift = r1;
    }

    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentList<E> build() {
        if (this.root == this.vectorRoot) goto L5;
    L7:
        this.ownership = new MutabilityOwnership();
        this.vectorRoot = this.root;
        this.vectorTail = this.tail;
        if (this.root == null) goto L10;
        Object[] r1 = this.root;
        Intrinsics.checkNotNull(r1);
        PersistentVector r0 = new PersistentVector(r1, this.tail, size(), this.rootShift);
    L17:
        this.vector = r0;
        return this.vector;
    L10:
        if (this.tail.length != 0) goto L12;
        boolean r2 = true;
    L13:
        if (r2 == false) goto L15;
        r0 = UtilsKt.persistentVectorOf();
        goto L17
    L15:
        Object[] r3 = Arrays.copyOf(this.tail, size());
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        r0 = new SmallPersistentVector(r3);
        goto L17
    L12:
        r2 = false;
        goto L13
    L5:
        if (this.tail != this.vectorTail) goto L7;
        r0 = this.vector;
        goto L17
    }

    private final int rootSize() {
        if (size() > 32) goto L7;
        return 0;
    L7:
        return UtilsKt.rootSize(size());
    }

    private final int tailSize(int size) {
        if (size > 32) goto L6;
        return size;
    L6:
        return size - UtilsKt.rootSize(size);
    }

    private final int tailSize() {
        return tailSize(size());
    }

    private final boolean isMutable(Object[] buffer) {
        if (buffer.length == 33) goto L5;
    L7:
        return false;
    L5:
        if (buffer[32] != this.ownership) goto L7;
        return true;
    }

    private final Object[] makeMutable(Object[] buffer) {
        if (buffer != null) goto L6;
        return mutableBuffer();
    L6:
        if (isMutable(buffer) == false) goto L9;
        return buffer;
    L9:
        return ArraysKt.copyInto$default(buffer, mutableBuffer(), 0, 0, RangesKt.coerceAtMost(buffer.length, 32), 6, null);
    }

    private final Object[] makeMutableShiftingRight(Object[] buffer, int distance) {
        if (isMutable(buffer) == false) goto L7;
        return ArraysKt.copyInto(buffer, buffer, distance, 0, 32 - distance);
    L7:
        return ArraysKt.copyInto(buffer, mutableBuffer(), distance, 0, 32 - distance);
    }

    private final Object[] mutableBufferWith(Object element) {
        Object[] buffer = new Object[33];
        buffer[0] = element;
        buffer[32] = this.ownership;
        return buffer;
    }

    private final Object[] mutableBuffer() {
        Object[] buffer = new Object[33];
        buffer[32] = this.ownership;
        return buffer;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r6) {
        this.modCount++;
        int tailSize = tailSize();
        if (tailSize >= 32) goto L5;
        Object[] mutableTail = makeMutable(this.tail);
        mutableTail[tailSize] = r6;
        this.tail = mutableTail;
        this.size = size() + 1;
    L6:
        return true;
    L5:
        Object[] newTail = mutableBufferWith(r6);
        pushFilledTail(this.root, this.tail, newTail);
        goto L6
    }

    private final void pushFilledTail(Object[] root, Object[] filledTail, Object[] newTail) {
        if ((size() >> 5) <= (1 << this.rootShift)) goto L5;
        this.root = pushTail(mutableBufferWith(root), filledTail, this.rootShift + 5);
        this.tail = newTail;
        this.rootShift += 5;
        this.size = size() + 1;
        return;
    L5:
        if (root != null) goto L7;
        this.root = filledTail;
        this.tail = newTail;
        this.size = size() + 1;
        return;
    L7:
        this.root = pushTail(root, filledTail, this.rootShift);
        this.tail = newTail;
        this.size = size() + 1;
    }

    private final Object[] pushTail(Object[] root, Object[] tail, int shift) {
        int index = UtilsKt.indexSegment(size() - 1, shift);
        Object[] mutableRoot = makeMutable(root);
        if (shift != 5) goto L5;
        mutableRoot[index] = tail;
    L6:
        return mutableRoot;
    L5:
        mutableRoot[index] = pushTail((Object[]) mutableRoot[index], tail, shift - 5);
        goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> r9) {
        if (r9.isEmpty() == false) goto L5;
        return false;
    L5:
        this.modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> r3 = r9.iterator();
        if ((32 - tailSize) < r9.size()) goto L8;
        this.tail = copyToBuffer(makeMutable(this.tail), tailSize, r3);
        this.size = size() + r9.size();
    L12:
        return true;
    L8:
        int buffersSize = ((r9.size() + tailSize) - 1) / 32;
        Object[][] buffers = new Object[buffersSize][];
        buffers[0] = copyToBuffer(makeMutable(this.tail), tailSize, r3);
        int index = 1;
    L9:
        if (index >= buffersSize) goto L11;
        buffers[index] = copyToBuffer(mutableBuffer(), 0, r3);
        index = index + 1;
        goto L9
    L11:
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), buffers);
        this.tail = copyToBuffer(mutableBuffer(), 0, r3);
        this.size = size() + r9.size();
        goto L12
    }

    private final Object[] copyToBuffer(Object[] buffer, int bufferIndex, Iterator<? extends Object> r6) {
        int index = bufferIndex;
    L4:
        if (index >= 32) goto L8;
        if (r6.hasNext() == false) goto L8;
        buffer[index] = r6.next();
        index = index + 1;
    L8:
        return buffer;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> r0 = ArrayIteratorKt.iterator(buffers);
        if ((rootSize >> 5) >= (1 << this.rootShift)) goto L5;
        Object[] mutableRoot = pushBuffers(root, rootSize, this.rootShift, r0);
    L8:
        if (r0.hasNext() == false) goto L10;
        this.rootShift += 5;
        mutableRoot = mutableBufferWith(mutableRoot);
        pushBuffers(mutableRoot, 1 << this.rootShift, this.rootShift, r0);
        goto L8
    L10:
        return mutableRoot;
    L5:
        mutableRoot = makeMutable(root);
        goto L8
    }

    private final Object[] pushBuffers(Object[] root, int rootSize, int shift, Iterator<Object[]> r10) {
        boolean value$iv = r10.hasNext();
        if (value$iv == true) goto L6;
        PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
    L6:
        if (shift < 0) goto L8;
        boolean value$iv2 = true;
    L10:
        if (value$iv2 == true) goto L13;
        PreconditionsKt.throwIllegalArgumentException("negative shift");
    L13:
        if (shift == 0) goto L15;
        Object[] mutableRoot = makeMutable(root);
        int index = UtilsKt.indexSegment(rootSize, shift);
        mutableRoot[index] = pushBuffers((Object[]) mutableRoot[index], rootSize, shift - 5, r10);
    L17:
        index = index + 1;
        if (index >= 32) goto L22;
        if (r10.hasNext() == false) goto L22;
        mutableRoot[index] = pushBuffers((Object[]) mutableRoot[index], 0, shift - 5, r10);
    L22:
        return mutableRoot;
    L15:
        return r10.next();
    L8:
        value$iv2 = false;
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E r11) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index != size()) goto L6;
        add(r11);
        return;
    L6:
        this.modCount++;
        int rootSize = rootSize();
        if (index < rootSize) goto L10;
        insertIntoTail(this.root, index - rootSize, r11);
        return;
    L10:
        ObjectRef elementCarry = new ObjectRef(null);
        Object[] r4 = this.root;
        Intrinsics.checkNotNull(r4);
        Object[] newRest = insertIntoRoot(r4, this.rootShift, index, r11, elementCarry);
        insertIntoTail(newRest, 0, elementCarry.getValue());
    }

    private final void insertIntoTail(Object[] root, int index, E r9) {
        int tailSize = tailSize();
        Object[] mutableTail = makeMutable(this.tail);
        Object[] r2 = this.tail;
        if (tailSize >= 32) goto L5;
        ArraysKt.copyInto(r2, mutableTail, index + 1, index, tailSize);
        mutableTail[index] = r9;
        this.root = root;
        this.tail = mutableTail;
        this.size = size() + 1;
        return;
    L5:
        Object lastElement = r2[31];
        ArraysKt.copyInto(this.tail, mutableTail, index + 1, index, 31);
        mutableTail[index] = r9;
        pushFilledTail(root, mutableTail, mutableBufferWith(lastElement));
    }

    private final Object[] insertIntoRoot(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
        int bufferIndex = UtilsKt.indexSegment(index, shift);
        if (shift != 0) goto L6;
        elementCarry.setValue(root[31]);
        Object[] mutableRoot = ArraysKt.copyInto(root, makeMutable(root), bufferIndex + 1, bufferIndex, 31);
        mutableRoot[bufferIndex] = element;
        return mutableRoot;
    L6:
        Object[] mutableRoot2 = makeMutable(root);
        int lowerLevelShift = shift - 5;
        Object r2 = mutableRoot2[bufferIndex];
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        mutableRoot2[bufferIndex] = insertIntoRoot((Object[]) r2, lowerLevelShift, index, element, elementCarry);
        int i = bufferIndex + 1;
    L8:
        if (i >= 32) goto L12;
        if (mutableRoot2[i] == null) goto L12;
        Object r3 = mutableRoot2[i];
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        mutableRoot2[i] = insertIntoRoot((Object[]) r3, lowerLevelShift, 0, elementCarry.getValue(), elementCarry);
        i = i + 1;
    L12:
        return mutableRoot2;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> r15) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) goto L5;
        boolean r4 = false;
        if (r15.isEmpty() == false) goto L9;
        return false;
    L9:
        this.modCount++;
        int unaffectedElementsCount = (index >> 5) << 5;
        int buffersSize = (((size() - unaffectedElementsCount) + r15.size()) - 1) / 32;
        if (buffersSize == 0) goto L12;
        Object[][] buffers = new Object[buffersSize][];
        int tailSize = tailSize();
        int newTailSize = tailSize(size() + r15.size());
        if (index < rootSize()) goto L19;
        Object[] newTail = mutableBuffer();
        splitToBuffers(r15, index, this.tail, tailSize, buffers, buffersSize, newTail);
        Object[][] buffers2 = buffers;
    L23:
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, unaffectedElementsCount, buffers2);
        this.tail = newTail;
        this.size = size() + r15.size();
        return true;
    L19:
        buffers2 = buffers;
        Object[] r1 = this.tail;
        if (newTailSize <= tailSize) goto L22;
        int rightShift = newTailSize - tailSize;
        Object[] newTail2 = makeMutableShiftingRight(r1, rightShift);
        insertIntoRoot(r15, index, rightShift, buffers2, buffersSize, newTail2);
        newTail = newTail2;
        goto L23
    L22:
        newTail = ArraysKt.copyInto(r1, mutableBuffer(), 0, tailSize - newTailSize, tailSize);
        int rightShift2 = 32 - (tailSize - newTailSize);
        Object[] lastBuffer = makeMutableShiftingRight(this.tail, rightShift2);
        buffers2[buffersSize - 1] = lastBuffer;
        insertIntoRoot(r15, index, rightShift2, buffers2, buffersSize - 1, lastBuffer);
        goto L23
    L12:
        if (index < rootSize()) goto L14;
        r4 = true;
    L14:
        CommonFunctionsKt.m3921assert(r4);
        int startIndex = index & 31;
        int endIndex = ((r15.size() + index) - 1) & 31;
        Object[] newTail3 = ArraysKt.copyInto(this.tail, makeMutable(this.tail), endIndex + 1, startIndex, tailSize());
        copyToBuffer(newTail3, startIndex, r15.iterator());
        this.tail = newTail3;
        this.size = size() + r15.size();
        return true;
    L5:
        return addAll(r15);
    }

    private final void insertIntoRoot(Collection<? extends E> r12, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) goto L11;
        int startLeafIndex = index >> 5;
        Object[] startLeaf = shiftLeafBuffers(startLeafIndex, rightShift, buffers, nullBuffers, nextBuffer);
        int lastLeafIndex = (rootSize() >> 5) - 1;
        int newNullBuffers = nullBuffers - (lastLeafIndex - startLeafIndex);
        if (newNullBuffers >= nullBuffers) goto L7;
        Object[] r2 = buffers[newNullBuffers];
        Intrinsics.checkNotNull(r2);
        Object[] newNextBuffer = r2;
    L8:
        splitToBuffers(r12, index, startLeaf, 32, buffers, newNullBuffers, newNextBuffer);
        return;
    L7:
        newNextBuffer = nextBuffer;
        goto L8
    L11:
        throw new IllegalStateException("root is null".toString());
    }

    private final Object[] shiftLeafBuffers(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) goto L11;
        int leafCount = rootSize() >> 5;
        ListIterator<Object[]> r1 = leafBufferIterator(leafCount);
        int bufferIndex = nullBuffers;
        Object[] buffer = nextBuffer;
    L6:
        if (r1.previousIndex() == startLeafIndex) goto L9;
        Object[] currentBuffer = r1.previous();
        ArraysKt.copyInto(currentBuffer, buffer, 0, 32 - rightShift, 32);
        buffer = makeMutableShiftingRight(currentBuffer, rightShift);
        bufferIndex = bufferIndex - 1;
        buffers[bufferIndex] = buffer;
        goto L6
    L9:
        return r1.previous();
    L11:
        throw new IllegalStateException("root is null".toString());
    }

    private final void splitToBuffers(Collection<? extends E> r15, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (nullBuffers < 1) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
    L9:
        Object[] firstBuffer = makeMutable(startBuffer);
        buffers[0] = firstBuffer;
        Object[] newNextBuffer = nextBuffer;
        int newNullBuffers = nullBuffers;
        int startBufferStartIndex = index & 31;
        int endBufferEndIndex = ((index + r15.size()) - 1) & 31;
        int elementsToShift = startBufferSize - startBufferStartIndex;
        if ((endBufferEndIndex + elementsToShift) >= 32) goto L12;
        ArraysKt.copyInto(firstBuffer, newNextBuffer, endBufferEndIndex + 1, startBufferStartIndex, startBufferSize);
    L17:
        Iterator<? extends E> r3 = r15.iterator();
        copyToBuffer(firstBuffer, startBufferStartIndex, r3);
        int i = 1;
    L18:
        if (i >= newNullBuffers) goto L20;
        buffers[i] = copyToBuffer(mutableBuffer(), 0, r3);
        i = i + 1;
        goto L18
    L20:
        copyToBuffer(newNextBuffer, 0, r3);
        return;
    L12:
        int toCopyToLast = ((endBufferEndIndex + elementsToShift) - 32) + 1;
        if (nullBuffers != 1) goto L15;
        newNextBuffer = firstBuffer;
    L16:
        ArraysKt.copyInto(firstBuffer, nextBuffer, 0, startBufferSize - toCopyToLast, startBufferSize);
        ArraysKt.copyInto(firstBuffer, newNextBuffer, endBufferEndIndex + 1, startBufferStartIndex, startBufferSize - toCopyToLast);
        goto L17
    L15:
        Object[] newNextBuffer2 = mutableBuffer();
        newNullBuffers = newNullBuffers - 1;
        buffers[newNullBuffers] = newNextBuffer2;
        newNextBuffer = newNextBuffer2;
        goto L16
    L5:
        value$iv = false;
        goto L7
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
        ListImplementation.checkElementIndex$runtime_release(r3, size());
        return (E) bufferFor(r3)[r3 & 31];
    }

    private final Object[] bufferFor(int index) {
        if (rootSize() <= index) goto L5;
        Object[] buffer = this.root;
        Intrinsics.checkNotNull(buffer);
        int shift = this.rootShift;
    L7:
        if (shift <= 0) goto L9;
        Object r2 = buffer[UtilsKt.indexSegment(index, shift)];
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        buffer = (Object[]) r2;
        shift = shift - 5;
        goto L7
    L9:
        return buffer;
    L5:
        return this.tail;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int r6) {
        ListImplementation.checkElementIndex$runtime_release(r6, size());
        this.modCount++;
        int r0 = rootSize();
        if (r6 >= r0) goto L5;
        ObjectRef r1 = new ObjectRef(this.tail[0]);
        Object[] r2 = this.root;
        Intrinsics.checkNotNull(r2);
        removeFromTailAt(removeFromRootAt(r2, this.rootShift, r6, r1), r0, this.rootShift, 0);
        return (E) r1.getValue();
    L5:
        return (E) removeFromTailAt(this.root, r0, this.rootShift, r6 - r0);
    }

    private final Object removeFromTailAt(Object[] root, int rootSize, int shift, int index) {
        int tailSize = size() - rootSize;
        if (index >= tailSize) goto L5;
        boolean r3 = true;
    L6:
        CommonFunctionsKt.m3921assert(r3);
        Object[] r4 = this.tail;
        if (tailSize != 1) goto L9;
        Object removedElement = r4[0];
        pullLastBufferFromRoot(root, rootSize, shift);
        return removedElement;
    L9:
        Object removedElement2 = r4[index];
        Object[] mutableTail = ArraysKt.copyInto(this.tail, makeMutable(this.tail), index, index + 1, tailSize);
        mutableTail[tailSize - 1] = null;
        this.root = root;
        this.tail = mutableTail;
        this.size = (rootSize + tailSize) - 1;
        this.rootShift = shift;
        return removedElement2;
    L5:
        r3 = false;
        goto L6
    }

    private final Object[] removeFromRootAt(Object[] root, int shift, int index, ObjectRef tailCarry) {
        int bufferIndex = UtilsKt.indexSegment(index, shift);
        if (shift != 0) goto L6;
        Object removedElement = root[bufferIndex];
        Object[] mutableRoot = ArraysKt.copyInto(root, makeMutable(root), bufferIndex, bufferIndex + 1, 32);
        mutableRoot[31] = tailCarry.getValue();
        tailCarry.setValue(removedElement);
        return mutableRoot;
    L6:
        int bufferLastIndex = 31;
        if (root[31] != null) goto L9;
        bufferLastIndex = UtilsKt.indexSegment(rootSize() - 1, shift);
    L9:
        Object[] mutableRoot2 = makeMutable(root);
        int lowerLevelShift = shift - 5;
        int i = bufferLastIndex;
        int r5 = bufferIndex + 1;
        if (r5 > i) goto L14;
    L11:
        Object r7 = mutableRoot2[i];
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        mutableRoot2[i] = removeFromRootAt((Object[]) r7, lowerLevelShift, 0, tailCarry);
        if (i == r5) goto L14;
        i = i - 1;
    L14:
        Object r4 = mutableRoot2[bufferIndex];
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        mutableRoot2[bufferIndex] = removeFromRootAt((Object[]) r4, lowerLevelShift, index, tailCarry);
        return mutableRoot2;
    }

    private final void pullLastBufferFromRoot(Object[] root, int rootSize, int shift) {
        if (shift != 0) goto L10;
        this.root = null;
        if (root != null) goto L7;
        Object[] r0 = new Object[0];
    L8:
        this.tail = r0;
        this.size = rootSize;
        this.rootShift = shift;
        return;
    L7:
        r0 = root;
        goto L8
    L10:
        ObjectRef tailCarry = new ObjectRef(null);
        Intrinsics.checkNotNull(root);
        Object[] newRoot = pullLastBuffer(root, shift, rootSize, tailCarry);
        Intrinsics.checkNotNull(newRoot);
        Object r3 = tailCarry.getValue();
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) r3;
        this.size = rootSize;
        if (newRoot[1] != null) goto L13;
        this.root = (Object[]) newRoot[0];
        this.rootShift = shift - 5;
        return;
    L13:
        this.root = newRoot;
        this.rootShift = shift;
    }

    private final Object[] pullLastBuffer(Object[] root, int shift, int rootSize, ObjectRef tailCarry) {
        int bufferIndex = UtilsKt.indexSegment(rootSize - 1, shift);
        if (shift != 5) goto L5;
        tailCarry.setValue(root[bufferIndex]);
        Object[] newBufferAtIndex = null;
    L7:
        if (newBufferAtIndex != null) goto L10;
        if (bufferIndex != 0) goto L10;
        return null;
    L10:
        Object[] mutableRoot = makeMutable(root);
        mutableRoot[bufferIndex] = newBufferAtIndex;
        return mutableRoot;
    L5:
        Object r1 = root[bufferIndex];
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        newBufferAtIndex = pullLastBuffer((Object[]) r1, shift - 5, rootSize, tailCarry);
        goto L7
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection<? extends Object> r2) {
        return removeAllWithPredicate(new AnonymousClass1(r2));
    }

    public final boolean removeAllWithPredicate(Function1<? super E, Boolean> r3) {
        boolean anyRemoved = removeAll(r3);
        if (anyRemoved == false) goto L5;
        this.modCount++;
    L5:
        return anyRemoved;
    }

    private final boolean removeAll(Function1<? super E, Boolean> r15) {
        int tailSize = tailSize();
        ObjectRef bufferRef = new ObjectRef(null);
        if (this.root == null) goto L5;
        ListIterator<Object[]> r11 = leafBufferIterator(0);
        int bufferSize = 32;
    L10:
        if (bufferSize != 32) goto L14;
        if (r11.hasNext() == false) goto L14;
        bufferSize = removeAll(r15, r11.next(), 32, bufferRef);
    L14:
        if (bufferSize != 32) goto L21;
        CommonFunctionsKt.m3921assert(!r11.hasNext());
        int newTailSize = removeAllFromTail(r15, tailSize, bufferRef);
        if (newTailSize != 0) goto L18;
        pullLastBufferFromRoot(this.root, size(), this.rootShift);
    L18:
        if (newTailSize != tailSize) goto L20;
        return false;
    L20:
        return true;
    L21:
        int unaffectedElementsCount = r11.previousIndex() << 5;
        List buffers = new ArrayList();
        List recyclableBuffers = new ArrayList();
        int bufferSize2 = bufferSize;
    L23:
        if (r11.hasNext() == false) goto L25;
        Object[] leaf = r11.next();
        bufferSize2 = recyclableRemoveAll(r15, leaf, 32, bufferSize2, bufferRef, recyclableBuffers, buffers);
        goto L23
    L25:
        int newTailSize2 = recyclableRemoveAll(r15, this.tail, tailSize, bufferSize2, bufferRef, recyclableBuffers, buffers);
        Object r1 = bufferRef.getValue();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] newTail = (Object[]) r1;
        ArraysKt.fill(newTail, null, newTailSize2, 32);
        boolean r8 = buffers.isEmpty();
        Object[] newRoot = this.root;
        if (r8 == false) goto L28;
        Intrinsics.checkNotNull(newRoot);
    L29:
        int newRootSize = (buffers.size() << 5) + unaffectedElementsCount;
        this.root = retainFirst(newRoot, newRootSize);
        this.tail = newTail;
        this.size = newRootSize + newTailSize2;
        return true;
    L28:
        newRoot = pushBuffers(newRoot, unaffectedElementsCount, this.rootShift, buffers.iterator());
        goto L29
    L5:
        if (removeAllFromTail(r15, tailSize, bufferRef) != tailSize) goto L7;
        return false;
    L7:
        return true;
    }

    private final Object[] retainFirst(Object[] root, int size) {
        if ((size & 31) != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        PreconditionsKt.throwIllegalArgumentException("invalid size");
    L10:
        if (size != 0) goto L13;
        this.rootShift = 0;
        return null;
    L13:
        int lastIndex = size - 1;
        Object[] newRoot = root;
    L14:
        int r3 = lastIndex >> this.rootShift;
        int r4 = this.rootShift;
        if (r3 != 0) goto L18;
        this.rootShift = r4 - 5;
        Object r5 = newRoot[0];
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        newRoot = (Object[]) r5;
        goto L14
    L18:
        return nullifyAfter(newRoot, lastIndex, r4);
    L5:
        value$iv = false;
        goto L7
    }

    private final Object[] nullifyAfter(Object[] root, int index, int shift) {
        if (shift < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        PreconditionsKt.throwIllegalArgumentException("shift should be positive");
    L10:
        if (shift != 0) goto L12;
        return root;
    L12:
        int lastIndex = UtilsKt.indexSegment(index, shift);
        Object r2 = root[lastIndex];
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object r3 = nullifyAfter((Object[]) r2, index, shift - 5);
        Object[] newRoot = root;
        if (lastIndex >= 31) goto L21;
        if (newRoot[lastIndex + 1] == null) goto L21;
        if (isMutable(newRoot) == false) goto L19;
        ArraysKt.fill(newRoot, null, lastIndex + 1, 32);
    L19:
        newRoot = ArraysKt.copyInto(newRoot, mutableBuffer(), 0, 0, lastIndex + 1);
    L21:
        if (r3 == newRoot[lastIndex]) goto L24;
        Object[] newRoot2 = makeMutable(newRoot);
        newRoot2[lastIndex] = r3;
        return newRoot2;
    L24:
        return newRoot;
    L5:
        value$iv = false;
        goto L7
    }

    private final int removeAllFromTail(Function1<? super E, Boolean> r5, int tailSize, ObjectRef bufferRef) {
        int newTailSize = removeAll(r5, this.tail, tailSize, bufferRef);
        if (newTailSize == tailSize) goto L5;
        Object r1 = bufferRef.getValue();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] newTail = (Object[]) r1;
        ArraysKt.fill(newTail, null, newTailSize, tailSize);
        this.tail = newTail;
        this.size = size() - (tailSize - newTailSize);
        return newTailSize;
    L5:
        if (bufferRef.getValue() != this.tail) goto L7;
        boolean r2 = true;
    L8:
        CommonFunctionsKt.m3921assert(r2);
        return tailSize;
    L7:
        r2 = false;
        goto L8
    }

    private final int removeAll(Function1<? super E, Boolean> r7, Object[] buffer, int bufferSize, ObjectRef bufferRef) {
        Object[] newBuffer = buffer;
        int newBufferSize = bufferSize;
        boolean anyRemoved = false;
        int index = 0;
    L3:
        if (index >= bufferSize) goto L11;
        Object element = buffer[index];
        if (r7.invoke(element).booleanValue() == false) goto L8;
        if (anyRemoved == true) goto L10;
        newBuffer = makeMutable(buffer);
        newBufferSize = index;
        anyRemoved = true;
    L10:
        index = index + 1;
        goto L3
    L8:
        if (anyRemoved == false) goto L10;
        newBuffer[newBufferSize] = element;
        newBufferSize = newBufferSize + 1;
        goto L10
    L11:
        bufferRef.setValue(newBuffer);
        return newBufferSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(Function1<? super E, Boolean> r7, Object[] buffer, int bufferSize, int toBufferSize, ObjectRef bufferRef, List<Object[]> r12, List<Object[]> r13) {
        if (isMutable(buffer) == false) goto L5;
        r12.add(buffer);
    L5:
        Object r0 = bufferRef.getValue();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] toBuffer = (Object[]) r0;
        Object[] newToBuffer = toBuffer;
        int newToBufferSize = toBufferSize;
        int index = 0;
    L6:
        if (index >= bufferSize) goto L18;
        Object element = buffer[index];
        if (r7.invoke(element).booleanValue() == true) goto L17;
        if (newToBufferSize == 32) goto L12;
    L16:
        newToBuffer[newToBufferSize] = element;
        newToBufferSize = newToBufferSize + 1;
        goto L17
    L12:
        if (r12.isEmpty() == true) goto L14;
        Object[] r5 = r12.remove(r12.size() - 1);
    L15:
        newToBuffer = r5;
        newToBufferSize = 0;
        goto L16
    L14:
        r5 = mutableBuffer();
    L17:
        index = index + 1;
        goto L6
    L18:
        bufferRef.setValue(newToBuffer);
        if (toBuffer == bufferRef.getValue()) goto L21;
        r13.add(toBuffer);
    L21:
        return newToBufferSize;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int r9, E r10) {
        ListImplementation.checkElementIndex$runtime_release(r9, size());
        if (rootSize() > r9) goto L9;
        Object[] r0 = makeMutable(this.tail);
        if (r0 == this.tail) goto L7;
        this.modCount++;
    L7:
        int r1 = r9 & 31;
        E r2 = (E) r0[r1];
        r0[r1] = r10;
        this.tail = r0;
        return r2;
    L9:
        ObjectRef r3 = new ObjectRef(null);
        Object[] r4 = this.root;
        Intrinsics.checkNotNull(r4);
        this.root = setInRoot(r4, this.rootShift, r9, r10, r3);
        return (E) r3.getValue();
    }

    private final Object[] setInRoot(Object[] root, int shift, int index, E r14, ObjectRef oldElementCarry) {
        int bufferIndex = UtilsKt.indexSegment(index, shift);
        Object[] mutableRoot = makeMutable(root);
        if (shift != 0) goto L8;
        if (mutableRoot == root) goto L6;
        this.modCount++;
    L6:
        oldElementCarry.setValue(mutableRoot[bufferIndex]);
        mutableRoot[bufferIndex] = r14;
        return mutableRoot;
    L8:
        Object r2 = mutableRoot[bufferIndex];
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        mutableRoot[bufferIndex] = setInRoot((Object[]) r2, shift - 5, index, r14, oldElementCarry);
        return mutableRoot;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new PersistentVectorMutableIterator(this, index);
    }

    private final ListIterator<Object[]> leafBufferIterator(int index) {
        Object[] root = this.root;
        if (root == null) goto L11;
        int leafCount = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(index, leafCount);
        if (this.rootShift == 0) goto L7;
        int trieHeight = this.rootShift / 5;
        return new TrieIterator(root, index, leafCount, trieHeight);
    L7:
        return new SingleElementListIterator(root, index);
    L11:
        throw new IllegalStateException("Invalid root".toString());
    }
}
