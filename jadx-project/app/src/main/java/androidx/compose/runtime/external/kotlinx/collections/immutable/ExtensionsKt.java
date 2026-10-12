package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: extensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aQ\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001¢\u0006\u0002\u0010\f\u001a\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\nH\u0001\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001¢\u0006\u0002\u0010\u000f\u001aQ\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0001\u001a-\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001¢\u0006\u0002\u0010\f\u001a \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001aQ\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000¢\u0006\u0002\u0010\f\u001a\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\nH\u0000\u001a-\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000¢\u0006\u0002\u0010\u000f\u001a \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001aQ\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000¢\u0006\u0002\u0010\f\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001a,\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001c\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010\u001d\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a,\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001f\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010 \u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a@\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001a\u0002H\u0002H\u0080\u0002¢\u0006\u0002\u0010\"\u001aH\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005H\u0080\u0002¢\u0006\u0002\u0010$\u001aA\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0019H\u0080\u0002\u001aA\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0080\u0002\u001a,\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010%\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010&\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a9\u0010'\u001a\b\u0012\u0004\u0012\u0002H(0\u000e\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u000e2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0+\u0012\u0004\u0012\u00020,0*H\u0080\b\u001aS\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030-\u0012\u0004\u0012\u00020,0*H\u0080\b\u001a9\u0010'\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0.\u0012\u0004\u0012\u00020,0*H\u0080\b\u001a,\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001c\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010\u001d\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001a,\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010\u001f\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010 \u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001aT\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0080\n¢\u0006\u0002\u00100\u001aG\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0080\n\u001aM\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0080\n\u001aI\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0080\n\u001aM\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001eH\u0080\n\u001a,\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001b\u001a\u0002H\nH\u0080\n¢\u0006\u0002\u0010%\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002¢\u0006\u0002\u0010&\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u001eH\u0080\u0002\u001aS\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0000¢\u0006\u0002\u00100\u001aL\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0000\u001aH\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001aL\u00104\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001eH\u0000\u001a\u0012\u00105\u001a\b\u0012\u0004\u0012\u00020706*\u000208H\u0000\u001a\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a0\u00109\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030:\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001a\u0012\u0010;\u001a\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001a\u001e\u0010;\u001a\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010;\u001a\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a0\u0010=\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001a\u0012\u0010>\u001a\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001a\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a\u0012\u0010?\u001a\b\u0012\u0004\u0012\u0002070\u000e*\u000208H\u0000\u001a\u001e\u0010?\u001a\b\u0012\u0004\u0012\u0002H(0\u000e\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010?\u001a\b\u0012\u0004\u0012\u0002H(0\u000e\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000\u001a0\u0010@\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001a\u0012\u0010A\u001a\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001a\u001e\u0010A\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001a\u001e\u0010A\u001a\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001eH\u0000¨\u0006B"}, d2 = {"immutableHashMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "K", "V", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "immutableHashSetOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "immutableListOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "immutableMapOf", "immutableSetOf", "persistentHashMapOf", "persistentHashSetOf", "persistentListOf", "persistentMapOf", "persistentSetOf", "intersect", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "minus", "element", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Lkotlin/sequences/Sequence;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "key", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "keys", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "mutate", "T", "mutator", "Lkotlin/Function1;", "", "", "", "", "plus", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "pair", "map", "", "putAll", "toImmutableList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "", "toImmutableMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toImmutableSet", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "toPersistentHashMap", "toPersistentHashSet", "toPersistentList", "toPersistentMap", "toPersistentSet", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExtensionsKt {
    public static final <T> PersistentSet<T> mutate(PersistentSet<? extends T> r2, Function1<? super Set<T>, Unit> r3) {
        PersistentSet.Builder<? extends T> r1 = r2.builder();
        r3.invoke(r1);
        return r1.build();
    }

    public static final <T> PersistentList<T> mutate(PersistentList<? extends T> r2, Function1<? super List<T>, Unit> r3) {
        PersistentList.Builder<? extends T> r1 = r2.builder();
        r3.invoke(r1);
        return r1.build();
    }

    public static final <K, V> PersistentMap<K, V> mutate(PersistentMap<? extends K, ? extends V> r2, Function1<? super Map<K, V>, Unit> r3) {
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> r1 = r2.builder();
        r3.invoke(r1);
        return r1.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> r2, E r3) {
        return r2.add(r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> r2, E r3) {
        return r2.remove(r3);
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> r4, Iterable<? extends E> r5) {
        if ((r5 instanceof Collection) == true) goto L7;
        PersistentCollection.Builder<? extends E> r0 = r4.builder();
        CollectionsKt.addAll(r0, r5);
        return r0.build();
    L7:
        return r4.addAll((Collection) r5);
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> r4, E[] r5) {
        PersistentCollection.Builder<? extends E> r0 = r4.builder();
        CollectionsKt.addAll(r0, r5);
        return r0.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> r4, Sequence<? extends E> r5) {
        PersistentCollection.Builder<? extends E> r0 = r4.builder();
        CollectionsKt.addAll(r0, r5);
        return r0.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> r4, Iterable<? extends E> r5) {
        if ((r5 instanceof Collection) == true) goto L7;
        PersistentCollection.Builder<? extends E> r0 = r4.builder();
        CollectionsKt.removeAll(r0, r5);
        return r0.build();
    L7:
        return r4.removeAll((Collection) r5);
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> r4, E[] r5) {
        PersistentCollection.Builder<? extends E> r0 = r4.builder();
        CollectionsKt.removeAll(r0, r5);
        return r0.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> r4, Sequence<? extends E> r5) {
        PersistentCollection.Builder<? extends E> r0 = r4.builder();
        CollectionsKt.removeAll(r0, r5);
        return r0.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> plus(PersistentList<? extends E> r2, E r3) {
        return r2.add(r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentList<E> minus(PersistentList<? extends E> r2, E r3) {
        return r2.remove(r3);
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> r6, Iterable<? extends E> r7) {
        if ((r7 instanceof Collection) == false) goto L5;
        PersistentList $this$mutate$iv = r6.addAll((Collection) r7);
        return $this$mutate$iv;
    L5:
        PersistentList.Builder<? extends E> r2 = r6.builder();
        PersistentList.Builder<? extends E> it = r2;
        CollectionsKt.addAll(it, r7);
        PersistentList $this$mutate$iv2 = r2.build();
        return $this$mutate$iv2;
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> r6, E[] r7) {
        PersistentList.Builder<? extends E> r2 = r6.builder();
        PersistentList.Builder<? extends E> it = r2;
        CollectionsKt.addAll(it, r7);
        PersistentList $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> r6, Sequence<? extends E> r7) {
        PersistentList.Builder<? extends E> r2 = r6.builder();
        PersistentList.Builder<? extends E> it = r2;
        CollectionsKt.addAll(it, r7);
        PersistentList $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> r6, Iterable<? extends E> r7) {
        if ((r7 instanceof Collection) == false) goto L5;
        PersistentList $this$mutate$iv = r6.removeAll((Collection) r7);
        return $this$mutate$iv;
    L5:
        PersistentList.Builder<? extends E> r2 = r6.builder();
        PersistentList.Builder<? extends E> it = r2;
        CollectionsKt.removeAll(it, r7);
        PersistentList $this$mutate$iv2 = r2.build();
        return $this$mutate$iv2;
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> r6, E[] r7) {
        PersistentList.Builder<? extends E> r2 = r6.builder();
        PersistentList.Builder<? extends E> it = r2;
        CollectionsKt.removeAll(it, r7);
        PersistentList $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> r6, Sequence<? extends E> r7) {
        PersistentList.Builder<? extends E> r2 = r6.builder();
        PersistentList.Builder<? extends E> it = r2;
        CollectionsKt.removeAll(it, r7);
        PersistentList $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> r2, E r3) {
        return r2.add(r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> r2, E r3) {
        return r2.remove(r3);
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> r6, Iterable<? extends E> r7) {
        if ((r7 instanceof Collection) == false) goto L5;
        PersistentSet $this$mutate$iv = r6.addAll((Collection) r7);
        return $this$mutate$iv;
    L5:
        PersistentSet.Builder<? extends E> r2 = r6.builder();
        PersistentSet.Builder<? extends E> it = r2;
        CollectionsKt.addAll(it, r7);
        PersistentSet $this$mutate$iv2 = r2.build();
        return $this$mutate$iv2;
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> r6, E[] r7) {
        PersistentSet.Builder<? extends E> r2 = r6.builder();
        PersistentSet.Builder<? extends E> it = r2;
        CollectionsKt.addAll(it, r7);
        PersistentSet $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> r6, Sequence<? extends E> r7) {
        PersistentSet.Builder<? extends E> r2 = r6.builder();
        PersistentSet.Builder<? extends E> it = r2;
        CollectionsKt.addAll(it, r7);
        PersistentSet $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> r6, Iterable<? extends E> r7) {
        if ((r7 instanceof Collection) == false) goto L5;
        PersistentSet $this$mutate$iv = r6.removeAll((Collection) r7);
        return $this$mutate$iv;
    L5:
        PersistentSet.Builder<? extends E> r2 = r6.builder();
        PersistentSet.Builder<? extends E> it = r2;
        CollectionsKt.removeAll(it, r7);
        PersistentSet $this$mutate$iv2 = r2.build();
        return $this$mutate$iv2;
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> r6, E[] r7) {
        PersistentSet.Builder<? extends E> r2 = r6.builder();
        PersistentSet.Builder<? extends E> it = r2;
        CollectionsKt.removeAll(it, r7);
        PersistentSet $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> r6, Sequence<? extends E> r7) {
        PersistentSet.Builder<? extends E> r2 = r6.builder();
        PersistentSet.Builder<? extends E> it = r2;
        CollectionsKt.removeAll(it, r7);
        PersistentSet $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentSet<E> intersect(PersistentSet<? extends E> r6, Iterable<? extends E> r7) {
        if ((r7 instanceof Collection) == false) goto L5;
        PersistentSet $this$mutate$iv = r6.retainAll((Collection) r7);
        return $this$mutate$iv;
    L5:
        PersistentSet.Builder<? extends E> r2 = r6.builder();
        PersistentSet.Builder<? extends E> it = r2;
        CollectionsKt.retainAll(it, r7);
        PersistentSet $this$mutate$iv2 = r2.build();
        return $this$mutate$iv2;
    }

    public static final <E> PersistentSet<E> intersect(PersistentCollection<? extends E> r1, Iterable<? extends E> r2) {
        return intersect(toPersistentSet(r1), r2);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> r3, Pair<? extends K, ? extends V> r4) {
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return r3.put(r4.getFirst(), r4.getSecond());
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> r2, Iterable<? extends Pair<? extends K, ? extends V>> r3) {
        return putAll(r2, r3);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> r2, Pair<? extends K, ? extends V>[] r3) {
        return putAll(r2, r3);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> r2, Sequence<? extends Pair<? extends K, ? extends V>> r3) {
        return putAll(r2, r3);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> r2, Map<? extends K, ? extends V> r3) {
        return putAll(r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> r1, Map<? extends K, ? extends V> r2) {
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return r1.putAll(r2);
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> r5, Iterable<? extends Pair<? extends K, ? extends V>> r6) {
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> r2 = r5.builder();
        PersistentMap.Builder<? extends K, ? extends V> it = r2;
        MapsKt.putAll(it, r6);
        PersistentMap $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> r5, Pair<? extends K, ? extends V>[] r6) {
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> r2 = r5.builder();
        PersistentMap.Builder<? extends K, ? extends V> it = r2;
        MapsKt.putAll(it, r6);
        PersistentMap $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> r5, Sequence<? extends Pair<? extends K, ? extends V>> r6) {
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> r2 = r5.builder();
        PersistentMap.Builder<? extends K, ? extends V> it = r2;
        MapsKt.putAll(it, r6);
        PersistentMap $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> r1, K r2) {
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return r1.remove(r2);
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> r6, Iterable<? extends K> r7) {
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> r2 = r6.builder();
        PersistentMap.Builder<? extends K, ? extends V> it = r2;
        CollectionsKt.removeAll(it.keySet(), r7);
        PersistentMap $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> r6, K[] r7) {
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> r2 = r6.builder();
        PersistentMap.Builder<? extends K, ? extends V> it = r2;
        CollectionsKt.removeAll(it.keySet(), r7);
        PersistentMap $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> r6, Sequence<? extends K> r7) {
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> r2 = r6.builder();
        PersistentMap.Builder<? extends K, ? extends V> it = r2;
        CollectionsKt.removeAll(it.keySet(), r7);
        PersistentMap $this$mutate$iv = r2.build();
        return $this$mutate$iv;
    }

    public static final <E> PersistentList<E> persistentListOf(E... r2) {
        return UtilsKt.persistentVectorOf().addAll(ArraysKt.asList(r2));
    }

    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final <E> PersistentSet<E> persistentSetOf(E... r2) {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release().addAll(ArraysKt.asList(r2));
    }

    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf(E... r2) {
        return PersistentHashSet.Companion.emptyOf$runtime_release().addAll(ArraysKt.asList(r2));
    }

    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf(Pair<? extends K, ? extends V>... r5) {
        PersistentMap $this$mutate$iv = PersistentOrderedMap.Companion.emptyOf$runtime_release();
        Intrinsics.checkNotNull($this$mutate$iv, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> r2 = $this$mutate$iv.builder();
        PersistentMap.Builder<K, V> it = r2;
        MapsKt.putAll(it, r5);
        return r2.build();
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(Pair<? extends K, ? extends V>... r5) {
        PersistentMap $this$mutate$iv = PersistentHashMap.Companion.emptyOf$runtime_release();
        Intrinsics.checkNotNull($this$mutate$iv, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> r2 = $this$mutate$iv.builder();
        PersistentMap.Builder<K, V> it = r2;
        MapsKt.putAll(it, r5);
        return r2.build();
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf(*elements)", imports = {}))
    public static final <E> PersistentList<E> immutableListOf(E... r1) {
        return persistentListOf(Arrays.copyOf(r1, r1.length));
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf()", imports = {}))
    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf(*elements)", imports = {}))
    public static final <E> PersistentSet<E> immutableSetOf(E... r1) {
        return persistentSetOf(Arrays.copyOf(r1, r1.length));
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf()", imports = {}))
    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    @Deprecated(message = "Use persistentHashSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashSetOf(*elements)", imports = {}))
    public static final <E> PersistentSet<E> immutableHashSetOf(E... r1) {
        return persistentHashSetOf(Arrays.copyOf(r1, r1.length));
    }

    @Deprecated(message = "Use persistentMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentMapOf(*pairs)", imports = {}))
    public static final <K, V> PersistentMap<K, V> immutableMapOf(Pair<? extends K, ? extends V>... r1) {
        return persistentMapOf((Pair[]) Arrays.copyOf(r1, r1.length));
    }

    @Deprecated(message = "Use persistentHashMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashMapOf(*pairs)", imports = {}))
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(Pair<? extends K, ? extends V>... r1) {
        return persistentHashMapOf((Pair[]) Arrays.copyOf(r1, r1.length));
    }

    public static final <T> ImmutableList<T> toImmutableList(Iterable<? extends T> r1) {
        if ((r1 instanceof ImmutableList) == false) goto L5;
        ImmutableList<T> r0 = (ImmutableList) r1;
    L6:
        if (r0 == null) goto L8;
        return r0;
    L8:
        return toPersistentList(r1);
    L5:
        r0 = null;
        goto L6
    }

    public static final <T> ImmutableList<T> toImmutableList(Sequence<? extends T> r1) {
        return toPersistentList(r1);
    }

    public static final ImmutableList<Character> toImmutableList(CharSequence $this$toImmutableList) {
        return toPersistentList($this$toImmutableList);
    }

    public static final <T> PersistentList<T> toPersistentList(Iterable<? extends T> r2) {
        PersistentList<T> r1 = null;
        if ((r2 instanceof PersistentList) == false) goto L5;
        PersistentList<T> r0 = (PersistentList) r2;
    L6:
        if (r0 == null) goto L8;
        return r0;
    L8:
        if ((r2 instanceof PersistentList.Builder) == false) goto L10;
        PersistentList.Builder r3 = (PersistentList.Builder) r2;
    L11:
        if (r3 == null) goto L13;
        r1 = r3.build();
    L13:
        if (r1 != null) goto L16;
        return plus(persistentListOf(), r2);
    L16:
        return r1;
    L10:
        r3 = null;
        goto L11
    L5:
        r0 = null;
        goto L6
    }

    public static final <T> PersistentList<T> toPersistentList(Sequence<? extends T> r1) {
        return plus(persistentListOf(), r1);
    }

    public static final PersistentList<Character> toPersistentList(CharSequence $this$toPersistentList) {
        PersistentList $this$mutate$iv = persistentListOf();
        PersistentList.Builder r2 = $this$mutate$iv.builder();
        PersistentList.Builder it = r2;
        StringsKt.toCollection($this$toPersistentList, it);
        return r2.build();
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Iterable<? extends T> r2) {
        PersistentSet r1 = null;
        if ((r2 instanceof ImmutableSet) == false) goto L5;
        ImmutableSet<T> r0 = (ImmutableSet) r2;
    L6:
        if (r0 == null) goto L8;
        return r0;
    L8:
        if ((r2 instanceof PersistentSet.Builder) == false) goto L10;
        PersistentSet.Builder r3 = (PersistentSet.Builder) r2;
    L11:
        if (r3 == null) goto L13;
        r1 = r3.build();
    L13:
        if (r1 == null) goto L16;
        return r1;
    L16:
        return plus(persistentSetOf(), r2);
    L10:
        r3 = null;
        goto L11
    L5:
        r0 = null;
        goto L6
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Sequence<? extends T> r1) {
        return toPersistentSet(r1);
    }

    public static final PersistentSet<Character> toImmutableSet(CharSequence $this$toImmutableSet) {
        return toPersistentSet($this$toImmutableSet);
    }

    public static final <T> PersistentSet<T> toPersistentSet(Iterable<? extends T> r2) {
        PersistentSet<T> r1 = null;
        if ((r2 instanceof PersistentOrderedSet) == false) goto L5;
        PersistentOrderedSet r0 = (PersistentOrderedSet) r2;
    L6:
        if (r0 == null) goto L9;
        return r0;
    L9:
        if ((r2 instanceof PersistentOrderedSetBuilder) == false) goto L11;
        PersistentOrderedSetBuilder r3 = (PersistentOrderedSetBuilder) r2;
    L12:
        if (r3 == null) goto L14;
        r1 = r3.build();
    L14:
        if (r1 != null) goto L17;
        return plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), r2);
    L17:
        return r1;
    L11:
        r3 = null;
        goto L12
    L5:
        r0 = null;
        goto L6
    }

    public static final <T> PersistentSet<T> toPersistentSet(Sequence<? extends T> r1) {
        return plus(persistentSetOf(), r1);
    }

    public static final PersistentSet<Character> toPersistentSet(CharSequence $this$toPersistentSet) {
        PersistentSet $this$mutate$iv = persistentSetOf();
        PersistentSet.Builder r2 = $this$mutate$iv.builder();
        PersistentSet.Builder it = r2;
        StringsKt.toCollection($this$toPersistentSet, it);
        return r2.build();
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(Iterable<? extends T> r2) {
        PersistentHashSet r1 = null;
        if ((r2 instanceof PersistentHashSet) == false) goto L5;
        PersistentHashSet r0 = (PersistentHashSet) r2;
    L6:
        if (r0 == null) goto L9;
        return r0;
    L9:
        if ((r2 instanceof PersistentHashSetBuilder) == false) goto L11;
        PersistentHashSetBuilder r3 = (PersistentHashSetBuilder) r2;
    L12:
        if (r3 == null) goto L14;
        r1 = r3.build();
    L14:
        if (r1 == null) goto L17;
        return r1;
    L17:
        return plus(PersistentHashSet.Companion.emptyOf$runtime_release(), r2);
    L11:
        r3 = null;
        goto L12
    L5:
        r0 = null;
        goto L6
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(Sequence<? extends T> r1) {
        return plus(persistentHashSetOf(), r1);
    }

    public static final PersistentSet<Character> toPersistentHashSet(CharSequence $this$toPersistentHashSet) {
        PersistentSet $this$mutate$iv = persistentHashSetOf();
        PersistentSet.Builder r2 = $this$mutate$iv.builder();
        PersistentSet.Builder it = r2;
        StringsKt.toCollection($this$toPersistentHashSet, it);
        return r2.build();
    }

    public static final <K, V> ImmutableMap<K, V> toImmutableMap(Map<K, ? extends V> r2) {
        PersistentMap<K, V> r1 = null;
        if ((r2 instanceof ImmutableMap) == false) goto L5;
        ImmutableMap<K, V> r0 = (ImmutableMap) r2;
    L6:
        if (r0 == null) goto L8;
        return r0;
    L8:
        if ((r2 instanceof PersistentMap.Builder) == false) goto L10;
        PersistentMap.Builder r3 = (PersistentMap.Builder) r2;
    L11:
        if (r3 == null) goto L13;
        r1 = r3.build();
    L13:
        if (r1 == null) goto L16;
        return r1;
    L16:
        return persistentMapOf().putAll(r2);
    L10:
        r3 = null;
        goto L11
    L5:
        r0 = null;
        goto L6
    }

    public static final <K, V> PersistentMap<K, V> toPersistentMap(Map<K, ? extends V> r2) {
        PersistentMap<K, V> r1 = null;
        if ((r2 instanceof PersistentOrderedMap) == false) goto L5;
        PersistentOrderedMap r0 = (PersistentOrderedMap) r2;
    L6:
        if (r0 == null) goto L9;
        return r0;
    L9:
        if ((r2 instanceof PersistentOrderedMapBuilder) == false) goto L11;
        PersistentOrderedMapBuilder r3 = (PersistentOrderedMapBuilder) r2;
    L12:
        if (r3 == null) goto L14;
        r1 = r3.build();
    L14:
        if (r1 != null) goto L17;
        return PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll(r2);
    L17:
        return r1;
    L11:
        r3 = null;
        goto L12
    L5:
        r0 = null;
        goto L6
    }

    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(Map<K, ? extends V> r2) {
        PersistentHashMap<K, V> r1 = null;
        if ((r2 instanceof PersistentHashMap) == false) goto L5;
        PersistentHashMap r0 = (PersistentHashMap) r2;
    L6:
        if (r0 == null) goto L9;
        return r0;
    L9:
        if ((r2 instanceof PersistentHashMapBuilder) == false) goto L11;
        PersistentHashMapBuilder r3 = (PersistentHashMapBuilder) r2;
    L12:
        if (r3 == null) goto L14;
        r1 = r3.build();
    L14:
        if (r1 == null) goto L17;
        return r1;
    L17:
        return PersistentHashMap.Companion.emptyOf$runtime_release().putAll(r2);
    L11:
        r3 = null;
        goto L12
    L5:
        r0 = null;
        goto L6
    }
}
