package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002J%\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002J/\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002J9\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002JC\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002JM\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002JW\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002Ja\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002Jk\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002Ju\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002J\u0087\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002J\u0091\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002J\u009b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002J¥\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002J¯\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002J¹\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002JÃ\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002JÍ\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002J×\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0012H\u0002J\b\u0010*\u001a\u00020(H\u0002J\u000e\u0010+\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "key", "", "tracked", "", "block", "", "(IZLjava/lang/Object;)V", "_block", "getKey", "()I", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "c", "Landroidx/compose/runtime/Composer;", "changed", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "changed1", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "trackRead", "", "composer", "trackWrite", "update", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposableLambdaImpl implements ComposableLambda {
    public static final int $stable = 0;
    private Object _block;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposableLambda.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<Composer, Integer, Unit> {
        AnonymousClass1(Object r8) {
            super(2, r8, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer r3, Integer r4) {
            invoke(r3, r4.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer p0, int p1) {
            ((ComposableLambdaImpl) this.receiver).invoke(p0, p1);
        }
    }

    static {
    }

    public ComposableLambdaImpl(int key, boolean tracked, Object block) {
        this.key = key;
        this.tracked = tracked;
        this._block = block;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Composer r3, Integer r4) {
        return invoke(r3, r4.intValue());
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Composer r4, Integer r5) {
        return invoke(p1, r4, r5.intValue());
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Composer r5, Integer r6) {
        return invoke(p1, p2, r5, r6.intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Composer r10, Integer r11) {
        return invoke(p1, p2, p3, r10, r11.intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Composer r12, Integer r13) {
        return invoke(p1, p2, p3, p4, r12, r13.intValue());
    }

    @Override // kotlin.jvm.functions.Function7
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Composer r14, Integer r15) {
        return invoke(p1, p2, p3, p4, p5, r14, r15.intValue());
    }

    @Override // kotlin.jvm.functions.Function8
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Composer r16, Integer r17) {
        return invoke(p1, p2, p3, p4, p5, p6, r16, r17.intValue());
    }

    @Override // kotlin.jvm.functions.Function9
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Composer r18, Integer r19) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, r18, r19.intValue());
    }

    @Override // kotlin.jvm.functions.Function10
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Composer r20, Integer r21) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, r20, r21.intValue());
    }

    @Override // kotlin.jvm.functions.Function11
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Composer r22, Integer r23) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, r22, r23.intValue());
    }

    @Override // kotlin.jvm.functions.Function13
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Composer r25, Integer r26, Integer r27) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, r25, r26.intValue(), r27.intValue());
    }

    @Override // kotlin.jvm.functions.Function14
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Composer r27, Integer r28, Integer r29) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, r27, r28.intValue(), r29.intValue());
    }

    @Override // kotlin.jvm.functions.Function15
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Composer r30, Integer r31, Integer r32) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, r30, r31.intValue(), r32.intValue());
    }

    @Override // kotlin.jvm.functions.Function16
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Composer r32, Integer r33, Integer r34) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, r32, r33.intValue(), r34.intValue());
    }

    @Override // kotlin.jvm.functions.Function17
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Composer r34, Integer r35, Integer r36) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, r34, r35.intValue(), r36.intValue());
    }

    @Override // kotlin.jvm.functions.Function18
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Composer r36, Integer r37, Integer r38) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, r36, r37.intValue(), r38.intValue());
    }

    @Override // kotlin.jvm.functions.Function19
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Composer r38, Integer r39, Integer r40) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, r38, r39.intValue(), r40.intValue());
    }

    @Override // kotlin.jvm.functions.Function20
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Composer r40, Integer r41, Integer r42) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, r40, r41.intValue(), r42.intValue());
    }

    @Override // kotlin.jvm.functions.Function21
    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Composer r42, Integer r43, Integer r44) {
        return invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, r42, r43.intValue(), r44.intValue());
    }

    public final int getKey() {
        return this.key;
    }

    private final void trackWrite() {
        if (this.tracked == false) goto L15;
        RecomposeScope scope = this.scope;
        if (scope == null) goto L7;
        scope.invalidate();
        this.scope = null;
    L7:
        List<RecomposeScope> r1 = this.scopes;
        if (r1 == null) goto L16;
        int index = 0;
        int r3 = r1.size();
    L10:
        if (index >= r3) goto L12;
        RecomposeScope item = r1.get(index);
        item.invalidate();
        index = index + 1;
        goto L10
    L12:
        r1.clear();
        return;
    L16:
        return;
    }

    private final void trackRead(Composer composer) {
        if (this.tracked == false) goto L23;
        RecomposeScope scope = composer.getRecomposeScope();
        if (scope == null) goto L24;
        composer.recordUsed(scope);
        RecomposeScope lastScope = this.scope;
        if (ComposableLambdaKt.replacableWith(lastScope, scope) == false) goto L9;
        this.scope = scope;
        return;
    L9:
        List<RecomposeScope> r2 = this.scopes;
        if (r2 != null) goto L12;
        List newScopes = new ArrayList();
        this.scopes = newScopes;
        newScopes.add(scope);
        return;
    L12:
        int index = 0;
        int r4 = r2.size();
    L13:
        if (index >= r4) goto L19;
        RecomposeScope scopeAtIndex = r2.get(index);
        if (ComposableLambdaKt.replacableWith(scopeAtIndex, scope) == true) goto L16;
        index = index + 1;
        goto L13
    L16:
        r2.set(index, scope);
        return;
    L19:
        r2.add(scope);
        return;
    L24:
        return;
    }

    public final void update(Object block) {
        if (Intrinsics.areEqual(this._block, block) == false) goto L5;
        return;
    L5:
        if (this._block != null) goto L7;
        boolean oldBlockNull = true;
    L8:
        this._block = block;
        if (oldBlockNull == true) goto L13;
        trackWrite();
        return;
    L13:
        return;
    L7:
        oldBlockNull = false;
        goto L8
    }

    public Object invoke(Composer c, int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r1 = ComposableLambdaKt.differentBits(0);
    L6:
        int dirty = r1 | changed;
        Object r2 = this._block;
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, 2)).invoke(c2, Integer.valueOf(dirty));
        ScopeUpdateScope r3 = c2.endRestartGroup();
        if (r3 == null) goto L9;
        r3.updateScope(new AnonymousClass1(this));
    L9:
        return result;
    L5:
        r1 = ComposableLambdaKt.sameBits(0);
        goto L6
    }

    public Object invoke(final Object p1, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r1 = ComposableLambdaKt.differentBits(1);
    L6:
        int dirty = r1 | changed;
        Object r2 = this._block;
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, 3)).invoke(p1, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r3 = c2.endRestartGroup();
        if (r3 == null) goto L9;
        r3.updateScope(new AnonymousClass2(this, p1, changed));
    L9:
        return result;
    L5:
        r1 = ComposableLambdaKt.sameBits(1);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r1 = ComposableLambdaKt.differentBits(2);
    L6:
        int dirty = r1 | changed;
        Object r2 = this._block;
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function4) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, 4)).invoke(p1, p2, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r3 = c2.endRestartGroup();
        if (r3 == null) goto L9;
        r3.updateScope(new AnonymousClass3(this, p1, p2, changed));
    L9:
        return result;
    L5:
        r1 = ComposableLambdaKt.sameBits(2);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r0 = ComposableLambdaKt.differentBits(3);
    L6:
        int dirty = changed | r0;
        Object r2 = this._block;
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function5) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r2, 5)).invoke(p1, p2, p3, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r3 = c2.endRestartGroup();
        if (r3 == null) goto L9;
        r3.updateScope(new AnonymousClass4(this, p1, p2, p3, changed));
    L9:
        return result;
    L5:
        r0 = ComposableLambdaKt.sameBits(3);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r0 = ComposableLambdaKt.differentBits(4);
    L6:
        int dirty = changed | r0;
        Object r1 = this._block;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function6) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 6)).invoke(p1, p2, p3, p4, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r9 = c2.endRestartGroup();
        if (r9 == null) goto L9;
        r9.updateScope(new AnonymousClass5(this, p1, p2, p3, p4, changed));
    L9:
        return result;
    L5:
        r0 = ComposableLambdaKt.sameBits(4);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r0 = ComposableLambdaKt.differentBits(5);
    L6:
        int dirty = changed | r0;
        Object r1 = this._block;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function7) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 7)).invoke(p1, p2, p3, p4, p5, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r10 = c2.endRestartGroup();
        if (r10 == null) goto L9;
        r10.updateScope(new AnonymousClass6(this, p1, p2, p3, p4, p5, changed));
    L9:
        return result;
    L5:
        r0 = ComposableLambdaKt.sameBits(5);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r2 = ComposableLambdaKt.differentBits(6);
    L6:
        int dirty = changed | r2;
        Object r3 = this._block;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function8) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 8)).invoke(p1, p2, p3, p4, p5, p6, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r11 = c2.endRestartGroup();
        if (r11 == null) goto L9;
        r11.updateScope(new AnonymousClass7(this, p1, p2, p3, p4, p5, p6, changed));
    L9:
        return result;
    L5:
        r2 = ComposableLambdaKt.sameBits(6);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r2 = ComposableLambdaKt.differentBits(7);
    L6:
        int dirty = changed | r2;
        Object r3 = this._block;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function9) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 9)).invoke(p1, p2, p3, p4, p5, p6, p7, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r12 = c2.endRestartGroup();
        if (r12 == null) goto L9;
        r12.updateScope(new AnonymousClass8(this, p1, p2, p3, p4, p5, p6, p7, changed));
    L9:
        return result;
    L5:
        r2 = ComposableLambdaKt.sameBits(7);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r2 = ComposableLambdaKt.differentBits(8);
    L6:
        int dirty = changed | r2;
        Object r3 = this._block;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function10) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 10)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r13 = c2.endRestartGroup();
        if (r13 == null) goto L9;
        r13.updateScope(new AnonymousClass9(this, p1, p2, p3, p4, p5, p6, p7, p8, changed));
    L9:
        return result;
    L5:
        r2 = ComposableLambdaKt.sameBits(8);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, Composer c, final int changed) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r2 = ComposableLambdaKt.differentBits(9);
    L6:
        int dirty = changed | r2;
        Object r3 = this._block;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function11) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 11)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, c2, Integer.valueOf(dirty));
        ScopeUpdateScope r14 = c2.endRestartGroup();
        if (r14 == null) goto L9;
        r14.updateScope(new AnonymousClass10(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, changed));
    L9:
        return result;
    L5:
        r2 = ComposableLambdaKt.sameBits(9);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, Composer c, final int changed, int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r2 = ComposableLambdaKt.differentBits(10);
    L6:
        int dirty = changed1 | r2;
        Object r3 = this._block;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function13) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 13)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r15 = c2.endRestartGroup();
        if (r15 == null) goto L9;
        r15.updateScope(new AnonymousClass11(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, changed));
    L9:
        return result;
    L5:
        r2 = ComposableLambdaKt.sameBits(10);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r2 = ComposableLambdaKt.differentBits(11);
    L6:
        int dirty = changed1 | r2;
        Object r3 = this._block;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function14) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 14)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass12(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, changed, changed1));
    L9:
        return result;
    L5:
        r2 = ComposableLambdaKt.sameBits(11);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r3 = ComposableLambdaKt.differentBits(12);
    L6:
        int dirty = changed1 | r3;
        Object r4 = this._block;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function15) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 15)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass13(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, changed, changed1));
    L9:
        return result;
    L5:
        r3 = ComposableLambdaKt.sameBits(12);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, final Object p13, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r3 = ComposableLambdaKt.differentBits(13);
    L6:
        int dirty = changed1 | r3;
        Object r4 = this._block;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function16) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 16)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass14(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, changed, changed1));
    L9:
        return result;
    L5:
        r3 = ComposableLambdaKt.sameBits(13);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, final Object p13, final Object p14, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r3 = ComposableLambdaKt.differentBits(14);
    L6:
        int dirty = changed1 | r3;
        Object r4 = this._block;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function17) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 17)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass15(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, changed, changed1));
    L9:
        return result;
    L5:
        r3 = ComposableLambdaKt.sameBits(14);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, final Object p13, final Object p14, final Object p15, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r3 = ComposableLambdaKt.differentBits(15);
    L6:
        int dirty = changed1 | r3;
        Object r4 = this._block;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function18) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 18)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass16(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, changed, changed1));
    L9:
        return result;
    L5:
        r3 = ComposableLambdaKt.sameBits(15);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, final Object p13, final Object p14, final Object p15, final Object p16, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r3 = ComposableLambdaKt.differentBits(16);
    L6:
        int dirty = changed1 | r3;
        Object r4 = this._block;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function19) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 19)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass17(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, changed, changed1));
    L9:
        return result;
    L5:
        r3 = ComposableLambdaKt.sameBits(16);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, final Object p13, final Object p14, final Object p15, final Object p16, final Object p17, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r3 = ComposableLambdaKt.differentBits(17);
    L6:
        int dirty = changed1 | r3;
        Object r4 = this._block;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function20) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 20)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass18(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, changed, changed1));
    L9:
        return result;
    L5:
        r3 = ComposableLambdaKt.sameBits(17);
        goto L6
    }

    public Object invoke(final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9, final Object p10, final Object p11, final Object p12, final Object p13, final Object p14, final Object p15, final Object p16, final Object p17, final Object p18, Composer c, final int changed, final int changed1) {
        Composer c2 = c.startRestartGroup(this.key);
        trackRead(c2);
        if (c2.changed(this) == false) goto L5;
        int r3 = ComposableLambdaKt.differentBits(18);
    L6:
        int dirty = changed1 | r3;
        Object r4 = this._block;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"p18\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object result = ((Function21) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 21)).invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, c2, Integer.valueOf(changed), Integer.valueOf(dirty));
        ScopeUpdateScope r0 = c2.endRestartGroup();
        if (r0 == null) goto L9;
        r0.updateScope(new AnonymousClass19(this, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, changed, changed1));
    L9:
        return result;
    L5:
        r3 = ComposableLambdaKt.sameBits(18);
        goto L6
    }
}
