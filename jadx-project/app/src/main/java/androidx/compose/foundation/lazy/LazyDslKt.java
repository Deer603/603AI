package androidx.compose.foundation.lazy;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0082\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0018\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0019\u001al\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001f\u001a\u0082\u0001\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010 \u001av\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010!\u001a©\u0001\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#0$2%\b\n\u0010%\u001a\u001f\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010\u00112%\b\n\u0010*\u001a\u001f\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0\u001123\b\u0004\u0010+\u001a-\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010,¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010/\u001a\u0082\u0001\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#0$2%\b\n\u0010%\u001a\u001f\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010\u001123\b\u0004\u0010+\u001a-\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010,¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00100\u001a©\u0001\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#012%\b\n\u0010%\u001a\u001f\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010\u00112%\b\n\u0010*\u001a\u001f\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0\u001123\b\u0004\u0010+\u001a-\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010,¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00102\u001a\u0082\u0001\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#012%\b\n\u0010%\u001a\u001f\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010\u001123\b\u0004\u0010+\u001a-\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010,¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00103\u001aè\u0001\u00104\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#0$2:\b\n\u0010%\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010,2:\b\u0006\u0010*\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0,2H\b\u0004\u0010+\u001aB\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00108\u001a¬\u0001\u00104\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#0$2:\b\n\u0010%\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010,2H\b\u0004\u0010+\u001aB\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00109\u001aè\u0001\u00104\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#012:\b\n\u0010%\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010,2:\b\u0006\u0010*\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010)0,2H\b\u0004\u0010+\u001aB\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010:\u001a¬\u0001\u00104\u001a\u00020\u0001\"\u0004\b\u0000\u0010#*\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#012:\b\n\u0010%\u001a4\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)\u0018\u00010,2H\b\u0004\u0010+\u001aB\u0012\u0004\u0012\u00020-\u0012\u0013\u0012\u001105¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(6\u0012\u0013\u0012\u0011H#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b.¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010;¨\u0006<"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "items", "T", "", "key", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C02971 extends Lambda implements Function1 {
        public static final C02971 INSTANCE = null;

        static {
            INSTANCE = new C02971();
        }

        public C02971() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object p1) {
            return invoke(p1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(T r2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C02982 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public C02982(Function1<? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r3) {
            return this.$key.invoke((T) this.$items.get(r3));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C02993 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C02993(Function1<? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r3) {
            return this.$contentType.invoke((T) this.$items.get(r3));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> r2, List<? extends T> r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyItemScope r5, int r6, Composer r7, int r8) {
            ComposerKt.sourceInformation(r7, "C178@8826L22:LazyDsl.kt#428nma");
            int r0 = r8;
            if ((r8 & 6) != 0) goto L10;
            if (r7.changed(r5) == false) goto L7;
            int r1 = 4;
        L8:
            r0 = r0 | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if ((r8 & 48) != 0) goto L17;
            if (r7.changed(r6) == false) goto L14;
            int r2 = 32;
        L15:
            r0 = r0 | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if ((r0 & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if (r7.shouldExecute(r3, r0 & 1) == true) goto L23;
            r7.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(-632812321, r0, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
        L25:
            Function4<LazyItemScope, T, Composer, Integer, Unit> r4 = this.$itemContent;
            Object r9 = this.$items.get(r6);
            T r10 = (T) r9;
            r4.invoke(r5, r10, r7, Integer.valueOf(r0 & 14));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements Function1 {
        public static final AnonymousClass5 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass5();
        }

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object p1) {
            return invoke(p1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(T r2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass6 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function1<? super T, ? extends Object> r2, T[] r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$key.invoke(this.$items[index]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> r2, T[] r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$contentType.invoke(this.$items[index]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8, reason: invalid class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> r2, T[] r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C250@12420L22:LazyDsl.kt#428nma");
            int $dirty = $changed;
            if (($changed & 6) != 0) goto L10;
            if ($composer.changed($this$items) == false) goto L7;
            int r1 = 4;
        L8:
            $dirty = $dirty | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if (($changed & 48) != 0) goto L17;
            if ($composer.changed(it) == false) goto L14;
            int r2 = 32;
        L15:
            $dirty = $dirty | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if (($dirty & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if ($composer.shouldExecute(r3, $dirty & 1) == true) goto L23;
            $composer.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(-1043393750, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:250)");
        L25:
            this.$itemContent.invoke($this$items, this.$items[it], $composer, Integer.valueOf($dirty & 14));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03012 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public C03012(Function2<? super Integer, ? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r4) {
            return this.$key.invoke(Integer.valueOf(r4), (T) this.$items.get(r4));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03023 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03023(Function2<? super Integer, ? super T, ? extends Object> r2, List<? extends T> r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int r4) {
            return this.$contentType.invoke(Integer.valueOf(r4), (T) this.$items.get(r4));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03034 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03034(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r2, List<? extends T> r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyItemScope r11, int r12, Composer r13, int r14) {
            ComposerKt.sourceInformation(r13, "C214@10657L26:LazyDsl.kt#428nma");
            int r0 = r14;
            if ((r14 & 6) != 0) goto L10;
            if (r13.changed(r11) == false) goto L7;
            int r1 = 4;
        L8:
            r0 = r0 | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if ((r14 & 48) != 0) goto L17;
            if (r13.changed(r12) == false) goto L14;
            int r2 = 32;
        L15:
            r0 = r0 | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if ((r0 & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if (r13.shouldExecute(r3, r0 & 1) == true) goto L23;
            r13.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(-1091073711, r0, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
        L25:
            Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> r4 = this.$itemContent;
            Integer r6 = Integer.valueOf(r12);
            Object r7 = this.$items.get(r12);
            T r8 = (T) r7;
            r4.invoke(r11, r6, r8, r13, Integer.valueOf((r0 & 14) | (r0 & 112)));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03056 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: Multi-variable type inference failed */
        public C03056(Function2<? super Integer, ? super T, ? extends Object> r2, T[] r3) {
            this.$key = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$key.invoke(Integer.valueOf(index), this.$items[index]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03067 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03067(Function2<? super Integer, ? super T, ? extends Object> r2, T[] r3) {
            this.$contentType = r2;
            this.$items = r3;
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer r2) {
            return invoke(r2.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int index) {
            return this.$contentType.invoke(Integer.valueOf(index), this.$items[index]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class C03078 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: Multi-variable type inference failed */
        public C03078(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r2, T[] r3) {
            this.$itemContent = r2;
            this.$items = r3;
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope r5, Integer r6, Composer r7, Integer r8) {
            invoke(r5, r6.intValue(), r7, r8.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C286@14256L26:LazyDsl.kt#428nma");
            int $dirty = $changed;
            if (($changed & 6) != 0) goto L10;
            if ($composer.changed($this$items) == false) goto L7;
            int r1 = 4;
        L8:
            $dirty = $dirty | r1;
            goto L10
        L7:
            r1 = 2;
        L10:
            if (($changed & 48) != 0) goto L17;
            if ($composer.changed(it) == false) goto L14;
            int r2 = 32;
        L15:
            $dirty = $dirty | r2;
            goto L17
        L14:
            r2 = 16;
        L17:
            if (($dirty & 147) == 146) goto L19;
            boolean r3 = true;
        L21:
            if ($composer.shouldExecute(r3, $dirty & 1) == true) goto L23;
            $composer.skipToGroupEnd();
            return;
        L23:
            if (ComposerKt.isTraceInProgress() == false) goto L25;
            ComposerKt.traceEventStart(1600639390, $dirty, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:286)");
        L25:
            this.$itemContent.invoke($this$items, Integer.valueOf(it), this.$items[it], $composer, Integer.valueOf(($dirty & 14) | ($dirty & 112)));
            if (ComposerKt.isTraceInProgress() == false) goto L30;
            ComposerKt.traceEventEnd();
            return;
        L30:
            return;
        L19:
            r3 = false;
            goto L21
        }
    }

    public static /* synthetic */ void items$default(LazyListScope $this$items_u24default, List items, Function1 key, Function1 contentType, Function4 itemContent, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r10 & 4) == 0) goto L8;
        Function1 contentType2 = C02971.INSTANCE;
        contentType = contentType2;
    L8:
        int r12 = items.size();
        if (key == null) goto L11;
        C02982 r0 = new C02982(key, items);
    L12:
        $this$items_u24default.items(r12, r0, new C02993(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
        return;
    L11:
        r0 = null;
        goto L12
    }

    public static final <T> void items(LazyListScope $this$items, List<? extends T> r8, Function1<? super T, ? extends Object> r9, Function1<? super T, ? extends Object> r10, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> r11) {
        int r1 = r8.size();
        if (r9 == null) goto L5;
        C02982 r2 = new C02982(r9, r8);
    L6:
        $this$items.items(r1, r2, new C02993(r10, r8), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(r11, r8)));
        return;
    L5:
        r2 = null;
        goto L6
    }

    public static /* synthetic */ void items$default(LazyListScope $this$items_u24default, List items, Function1 key, Function4 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        key = null;
    L5:
        Function1 contentType$iv = C02971.INSTANCE;
        int r2 = items.size();
        if (key == null) goto L8;
        C02982 r3 = new C02982(key, items);
    L9:
        $this$items_u24default.items(r2, r3, new C02993(contentType$iv, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
        return;
    L8:
        r3 = null;
        goto L9
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope $this$items, List<? extends T> r11, Function1<? super T, ? extends Object> r12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        Function1 contentType$iv = C02971.INSTANCE;
        int r4 = r11.size();
        if (r12 == null) goto L5;
        C02982 r5 = new C02982(r12, r11);
    L6:
        $this$items.items(r4, r5, new C02993(contentType$iv, r11), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(r13, r11)));
        return;
    L5:
        r5 = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope $this$itemsIndexed_u24default, List items, Function2 key, Function2 contentType, Function5 itemContent, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r10 & 4) == 0) goto L8;
        Function2 contentType2 = C03001.INSTANCE;
        contentType = contentType2;
    L8:
        int r12 = items.size();
        if (key == null) goto L11;
        C03012 r0 = new C03012(key, items);
    L12:
        $this$itemsIndexed_u24default.items(r12, r0, new C03023(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C03034(itemContent, items)));
        return;
    L11:
        r0 = null;
        goto L12
    }

    public static final <T> void itemsIndexed(LazyListScope $this$itemsIndexed, List<? extends T> r8, Function2<? super Integer, ? super T, ? extends Object> r9, Function2<? super Integer, ? super T, ? extends Object> r10, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r11) {
        int r1 = r8.size();
        if (r9 == null) goto L5;
        C03012 r2 = new C03012(r9, r8);
    L6:
        $this$itemsIndexed.items(r1, r2, new C03023(r10, r8), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C03034(r11, r8)));
        return;
    L5:
        r2 = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope $this$itemsIndexed_u24default, List items, Function2 key, Function5 itemContent, int r11, Object r12) {
        if ((r11 & 2) == 0) goto L5;
        key = null;
    L5:
        int r1 = items.size();
        if (key == null) goto L8;
        C03012 r2 = new C03012(key, items);
    L9:
        $this$itemsIndexed_u24default.items(r1, r2, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C03034(itemContent, items)));
        return;
    L8:
        r2 = null;
        goto L9
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope $this$itemsIndexed, List<? extends T> r10, Function2<? super Integer, ? super T, ? extends Object> r11, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r12) {
        int r3 = r10.size();
        if (r11 == null) goto L5;
        C03012 r4 = new C03012(r11, r10);
    L6:
        $this$itemsIndexed.items(r3, r4, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(r10), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C03034(r12, r10)));
        return;
    L5:
        r4 = null;
        goto L6
    }

    public static /* synthetic */ void items$default(LazyListScope $this$items_u24default, Object[] items, Function1 key, Function1 contentType, Function4 itemContent, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r10 & 4) == 0) goto L8;
        Function1 contentType2 = AnonymousClass5.INSTANCE;
        contentType = contentType2;
    L8:
        int r12 = items.length;
        if (key == null) goto L11;
        AnonymousClass6 r0 = new AnonymousClass6(key, items);
    L12:
        $this$items_u24default.items(r12, r0, new AnonymousClass7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
        return;
    L11:
        r0 = null;
        goto L12
    }

    public static final <T> void items(LazyListScope $this$items, T[] r8, Function1<? super T, ? extends Object> r9, Function1<? super T, ? extends Object> r10, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> r11) {
        int r1 = r8.length;
        if (r9 == null) goto L5;
        AnonymousClass6 r2 = new AnonymousClass6(r9, r8);
    L6:
        $this$items.items(r1, r2, new AnonymousClass7(r10, r8), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(r11, r8)));
        return;
    L5:
        r2 = null;
        goto L6
    }

    public static /* synthetic */ void items$default(LazyListScope $this$items_u24default, Object[] items, Function1 key, Function4 itemContent, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        key = null;
    L5:
        Function1 contentType$iv = AnonymousClass5.INSTANCE;
        int r2 = items.length;
        if (key == null) goto L8;
        AnonymousClass6 r3 = new AnonymousClass6(key, items);
    L9:
        $this$items_u24default.items(r2, r3, new AnonymousClass7(contentType$iv, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
        return;
    L8:
        r3 = null;
        goto L9
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope $this$items, T[] r11, Function1<? super T, ? extends Object> r12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> r13) {
        Function1 contentType$iv = AnonymousClass5.INSTANCE;
        int r4 = r11.length;
        if (r12 == null) goto L5;
        AnonymousClass6 r5 = new AnonymousClass6(r12, r11);
    L6:
        $this$items.items(r4, r5, new AnonymousClass7(contentType$iv, r11), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(r13, r11)));
        return;
    L5:
        r5 = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope $this$itemsIndexed_u24default, Object[] items, Function2 key, Function2 contentType, Function5 itemContent, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        key = null;
    L6:
        if ((r10 & 4) == 0) goto L8;
        Function2 contentType2 = C03045.INSTANCE;
        contentType = contentType2;
    L8:
        int r12 = items.length;
        if (key == null) goto L11;
        C03056 r0 = new C03056(key, items);
    L12:
        $this$itemsIndexed_u24default.items(r12, r0, new C03067(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C03078(itemContent, items)));
        return;
    L11:
        r0 = null;
        goto L12
    }

    public static final <T> void itemsIndexed(LazyListScope $this$itemsIndexed, T[] r8, Function2<? super Integer, ? super T, ? extends Object> r9, Function2<? super Integer, ? super T, ? extends Object> r10, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r11) {
        int r1 = r8.length;
        if (r9 == null) goto L5;
        C03056 r2 = new C03056(r9, r8);
    L6:
        $this$itemsIndexed.items(r1, r2, new C03067(r10, r8), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C03078(r11, r8)));
        return;
    L5:
        r2 = null;
        goto L6
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope $this$itemsIndexed_u24default, Object[] items, Function2 key, Function5 itemContent, int r11, Object r12) {
        if ((r11 & 2) == 0) goto L5;
        key = null;
    L5:
        int r1 = items.length;
        if (key == null) goto L8;
        C03056 r2 = new C03056(key, items);
    L9:
        $this$itemsIndexed_u24default.items(r1, r2, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C03078(itemContent, items)));
        return;
    L8:
        r2 = null;
        goto L9
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope $this$itemsIndexed, T[] r10, Function2<? super Integer, ? super T, ? extends Object> r11, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> r12) {
        int r3 = r10.length;
        if (r11 == null) goto L5;
        C03056 r4 = new C03056(r11, r10);
    L6:
        $this$itemsIndexed.items(r3, r4, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(r10), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C03078(r12, r10)));
        return;
    L5:
        r4 = null;
        goto L6
    }

    public static final void LazyRow(Modifier modifier, LazyListState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Horizontal horizontalArrangement, Alignment.Vertical verticalAlignment, FlingBehavior flingBehavior, boolean userScrollEnabled, OverscrollEffect overscrollEffect, final Function1<? super LazyListScope, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(-1884325601);
        ComposerKt.sourceInformation($composer2, "C(LazyRow)P(4,7,1,6,3,9,2,8,5)340@17470L434:LazyDsl.kt#428nma");
        int $dirty = $changed;
        int r3 = r44 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        LazyListState state2 = state;
    L24:
        int r6 = r44 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        PaddingValues contentPadding2 = contentPadding;
    L35:
        int r8 = r44 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean reverseLayout2 = reverseLayout;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Arrangement.Horizontal horizontalArrangement2 = horizontalArrangement;
    L57:
        int r13 = r44 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Alignment.Vertical verticalAlignment2 = verticalAlignment;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        FlingBehavior flingBehavior2 = flingBehavior;
    L79:
        int $dirty2 = r44 & 128;
        if ($dirty2 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r44 & 256) != 0) goto L98;
        if ($composer2.changed(overscrollEffect) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
    L98:
        r18 = 33554432;
    L102:
        if ((r44 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int $dirty3 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
        boolean r0 = true;
    L117:
        if ($composer2.shouldExecute(r0, $dirty3 & 1) == false) goto L174;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "329@16947L23,335@17298L15,337@17396L26");
        if (($changed & 1) != 0) goto L121;
    L137:
        if (r3 == 0) goto L140;
        modifier2 = Modifier.Companion;
    L140:
        if ((r44 & 2) == 0) goto L142;
        state2 = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
        int $dirty4 = $dirty3 & (-113);
    L143:
        if (r6 == 0) goto L146;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L146:
        if (r8 == 0) goto L149;
        reverseLayout2 = false;
    L149:
        if ((r44 & 16) == 0) goto L155;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L153;
        Arrangement.Horizontal horizontalArrangement3 = r2.getStart();
    L154:
        $dirty4 = $dirty4 & (-57345);
        horizontalArrangement2 = horizontalArrangement3;
        goto L155
    L153:
        horizontalArrangement3 = r2.getEnd();
    L155:
        if (r13 == 0) goto L158;
        verticalAlignment2 = Alignment.Companion.getTop();
    L158:
        if ((r44 & 64) == 0) goto L160;
        $dirty4 = $dirty4 & (-3670017);
        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
    L160:
        if ($dirty2 == 0) goto L162;
        boolean userScrollEnabled2 = true;
    L164:
        if ((r44 & 256) == 0) goto L166;
        boolean userScrollEnabled3 = userScrollEnabled2;
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        Modifier modifier3 = modifier2;
        boolean reverseLayout3 = reverseLayout2;
        Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement2;
        Alignment.Vertical verticalAlignment3 = verticalAlignment2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        int $dirty5 = $dirty4 & (-234881025);
        LazyListState state3 = state2;
        PaddingValues contentPadding3 = contentPadding2;
        int $dirty6 = -1884325601;
    L167:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L170;
        ComposerKt.traceEventStart($dirty6, $dirty5, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
    L170:
        Composer $composer3 = $composer2;
        LazyListKt.LazyList(modifier3, state3, contentPadding3, reverseLayout3, false, flingBehavior3, userScrollEnabled3, overscrollEffect2, 0, null, null, verticalAlignment3, horizontalArrangement4, r41, $composer3, ((((((($dirty5 & 14) | 24576) | ($dirty5 & 112)) | ($dirty5 & 896)) | ($dirty5 & 7168)) | (($dirty5 >> 3) & 458752)) | (($dirty5 >> 3) & 3670016)) | (($dirty5 >> 3) & 29360128), ((($dirty5 >> 12) & 112) | (($dirty5 >> 6) & 896)) | (($dirty5 >> 18) & 7168), 1792);
        if (ComposerKt.isTraceInProgress() == false) goto L173;
        ComposerKt.traceEventEnd();
    L173:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final Alignment.Vertical verticalAlignment4 = verticalAlignment3;
        final Arrangement.Horizontal horizontalArrangement5 = horizontalArrangement4;
        final LazyListState state4 = state3;
    L175:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L179;
        r14.updateScope(new C02941(modifier4, state4, contentPadding4, reverseLayout4, horizontalArrangement5, verticalAlignment4, flingBehavior4, userScrollEnabled4, overscrollEffect3, r41, $changed, r44));
        return;
    L179:
        return;
    L166:
        overscrollEffect2 = overscrollEffect;
        userScrollEnabled3 = userScrollEnabled2;
        modifier3 = modifier2;
        reverseLayout3 = reverseLayout2;
        horizontalArrangement4 = horizontalArrangement2;
        verticalAlignment3 = verticalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty5 = $dirty4;
        state3 = state2;
        contentPadding3 = contentPadding2;
        $dirty6 = -1884325601;
        goto L167
    L162:
        userScrollEnabled2 = userScrollEnabled;
        goto L164
    L142:
        $dirty4 = $dirty3;
        goto L143
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L137;
        $composer2.skipToGroupEnd();
        if ((r44 & 2) == 0) goto L126;
        int $dirty7 = $dirty3 & (-113);
    L128:
        if ((r44 & 16) == 0) goto L131;
        $dirty7 = $dirty7 & (-57345);
    L131:
        if ((r44 & 64) == 0) goto L134;
        $dirty7 = $dirty7 & (-3670017);
    L134:
        if ((r44 & 256) == 0) goto L136;
        $dirty7 = $dirty7 & (-234881025);
    L136:
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        $dirty5 = $dirty7;
        modifier3 = modifier2;
        reverseLayout3 = reverseLayout2;
        horizontalArrangement4 = horizontalArrangement2;
        verticalAlignment3 = verticalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty6 = -1884325601;
        state3 = state2;
        contentPadding3 = contentPadding2;
        goto L167
    L126:
        $dirty7 = $dirty3;
        goto L128
    L174:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        userScrollEnabled4 = userScrollEnabled;
        modifier4 = modifier2;
        state4 = state2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        horizontalArrangement5 = horizontalArrangement2;
        verticalAlignment4 = verticalAlignment2;
        flingBehavior4 = flingBehavior2;
        overscrollEffect3 = overscrollEffect;
        goto L175
    L115:
        r0 = false;
        goto L117
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r41) == false) goto L109;
        int r19 = 536870912;
    L110:
        $dirty = $dirty | r19;
        goto L112
    L109:
        r19 = 268435456;
        goto L110
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(userScrollEnabled) == false) goto L87;
        int r110 = 8388608;
    L88:
        $dirty = $dirty | r110;
        goto L91
    L87:
        r110 = 4194304;
        goto L88
    L71:
        if ((r44 & 64) != 0) goto L75;
        flingBehavior2 = flingBehavior;
        if ($composer2.changed(flingBehavior2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        flingBehavior2 = flingBehavior;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        verticalAlignment2 = verticalAlignment;
        if ($composer2.changed(verticalAlignment2) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        verticalAlignment2 = verticalAlignment;
        goto L69
    L49:
        if ((r44 & 16) != 0) goto L53;
        horizontalArrangement2 = horizontalArrangement;
        if ($composer2.changed(horizontalArrangement2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
    L54:
        r17 = 8192;
        goto L55
    L53:
        horizontalArrangement2 = horizontalArrangement;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L47
    L43:
        r10 = 1024;
        goto L44
    L45:
        reverseLayout2 = reverseLayout;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        contentPadding2 = contentPadding;
        goto L35
    L16:
        if ((r44 & 2) != 0) goto L20;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        state2 = state;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    public static final void LazyColumn(Modifier modifier, LazyListState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Vertical verticalArrangement, Alignment.Horizontal horizontalAlignment, FlingBehavior flingBehavior, boolean userScrollEnabled, OverscrollEffect overscrollEffect, final Function1<? super LazyListScope, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(53695811);
        ComposerKt.sourceInformation($composer2, "C(LazyColumn)P(4,7,1,6,9,3,2,8,5)400@20785L433:LazyDsl.kt#428nma");
        int $dirty = $changed;
        int r3 = r44 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        LazyListState state2 = state;
    L24:
        int r6 = r44 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        PaddingValues contentPadding2 = contentPadding;
    L35:
        int r8 = r44 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean reverseLayout2 = reverseLayout;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Arrangement.Vertical verticalArrangement2 = verticalArrangement;
    L57:
        int r13 = r44 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Alignment.Horizontal horizontalAlignment2 = horizontalAlignment;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        FlingBehavior flingBehavior2 = flingBehavior;
    L79:
        int $dirty2 = r44 & 128;
        if ($dirty2 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r44 & 256) != 0) goto L98;
        if ($composer2.changed(overscrollEffect) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
    L98:
        r18 = 33554432;
    L102:
        if ((r44 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int $dirty3 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
        boolean r0 = true;
    L117:
        if ($composer2.shouldExecute(r0, $dirty3 & 1) == false) goto L174;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "389@20259L23,395@20613L15,397@20711L26");
        if (($changed & 1) != 0) goto L121;
    L137:
        if (r3 == 0) goto L140;
        modifier2 = Modifier.Companion;
    L140:
        if ((r44 & 2) == 0) goto L142;
        state2 = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
        int $dirty4 = $dirty3 & (-113);
    L143:
        if (r6 == 0) goto L146;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L146:
        if (r8 == 0) goto L149;
        reverseLayout2 = false;
    L149:
        if ((r44 & 16) == 0) goto L155;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L153;
        Arrangement.Vertical verticalArrangement3 = r2.getTop();
    L154:
        $dirty4 = $dirty4 & (-57345);
        verticalArrangement2 = verticalArrangement3;
        goto L155
    L153:
        verticalArrangement3 = r2.getBottom();
    L155:
        if (r13 == 0) goto L158;
        horizontalAlignment2 = Alignment.Companion.getStart();
    L158:
        if ((r44 & 64) == 0) goto L160;
        $dirty4 = $dirty4 & (-3670017);
        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
    L160:
        if ($dirty2 == 0) goto L162;
        boolean userScrollEnabled2 = true;
    L164:
        if ((r44 & 256) == 0) goto L166;
        boolean userScrollEnabled3 = userScrollEnabled2;
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        Modifier modifier3 = modifier2;
        boolean reverseLayout3 = reverseLayout2;
        Arrangement.Vertical verticalArrangement4 = verticalArrangement2;
        Alignment.Horizontal horizontalAlignment3 = horizontalAlignment2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        int $dirty5 = $dirty4 & (-234881025);
        LazyListState state3 = state2;
        PaddingValues contentPadding3 = contentPadding2;
        int $dirty6 = 53695811;
    L167:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L170;
        ComposerKt.traceEventStart($dirty6, $dirty5, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
    L170:
        Composer $composer3 = $composer2;
        LazyListKt.LazyList(modifier3, state3, contentPadding3, reverseLayout3, true, flingBehavior3, userScrollEnabled3, overscrollEffect2, 0, horizontalAlignment3, verticalArrangement4, null, null, r41, $composer3, (((((((($dirty5 & 14) | 24576) | ($dirty5 & 112)) | ($dirty5 & 896)) | ($dirty5 & 7168)) | (($dirty5 >> 3) & 458752)) | (($dirty5 >> 3) & 3670016)) | (($dirty5 >> 3) & 29360128)) | (($dirty5 << 12) & 1879048192), (($dirty5 >> 12) & 14) | (($dirty5 >> 18) & 7168), 6400);
        if (ComposerKt.isTraceInProgress() == false) goto L173;
        ComposerKt.traceEventEnd();
    L173:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final Alignment.Horizontal horizontalAlignment4 = horizontalAlignment3;
        final Arrangement.Vertical verticalArrangement5 = verticalArrangement4;
        final LazyListState state4 = state3;
    L175:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L179;
        r14.updateScope(new AnonymousClass1(modifier4, state4, contentPadding4, reverseLayout4, verticalArrangement5, horizontalAlignment4, flingBehavior4, userScrollEnabled4, overscrollEffect3, r41, $changed, r44));
        return;
    L179:
        return;
    L166:
        overscrollEffect2 = overscrollEffect;
        userScrollEnabled3 = userScrollEnabled2;
        modifier3 = modifier2;
        reverseLayout3 = reverseLayout2;
        verticalArrangement4 = verticalArrangement2;
        horizontalAlignment3 = horizontalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty5 = $dirty4;
        state3 = state2;
        contentPadding3 = contentPadding2;
        $dirty6 = 53695811;
        goto L167
    L162:
        userScrollEnabled2 = userScrollEnabled;
        goto L164
    L142:
        $dirty4 = $dirty3;
        goto L143
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L137;
        $composer2.skipToGroupEnd();
        if ((r44 & 2) == 0) goto L126;
        int $dirty7 = $dirty3 & (-113);
    L128:
        if ((r44 & 16) == 0) goto L131;
        $dirty7 = $dirty7 & (-57345);
    L131:
        if ((r44 & 64) == 0) goto L134;
        $dirty7 = $dirty7 & (-3670017);
    L134:
        if ((r44 & 256) == 0) goto L136;
        $dirty7 = $dirty7 & (-234881025);
    L136:
        userScrollEnabled3 = userScrollEnabled;
        overscrollEffect2 = overscrollEffect;
        $dirty5 = $dirty7;
        modifier3 = modifier2;
        reverseLayout3 = reverseLayout2;
        verticalArrangement4 = verticalArrangement2;
        horizontalAlignment3 = horizontalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty6 = 53695811;
        state3 = state2;
        contentPadding3 = contentPadding2;
        goto L167
    L126:
        $dirty7 = $dirty3;
        goto L128
    L174:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        userScrollEnabled4 = userScrollEnabled;
        modifier4 = modifier2;
        state4 = state2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        verticalArrangement5 = verticalArrangement2;
        horizontalAlignment4 = horizontalAlignment2;
        flingBehavior4 = flingBehavior2;
        overscrollEffect3 = overscrollEffect;
        goto L175
    L115:
        r0 = false;
        goto L117
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r41) == false) goto L109;
        int r19 = 536870912;
    L110:
        $dirty = $dirty | r19;
        goto L112
    L109:
        r19 = 268435456;
        goto L110
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(userScrollEnabled) == false) goto L87;
        int r110 = 8388608;
    L88:
        $dirty = $dirty | r110;
        goto L91
    L87:
        r110 = 4194304;
        goto L88
    L71:
        if ((r44 & 64) != 0) goto L75;
        flingBehavior2 = flingBehavior;
        if ($composer2.changed(flingBehavior2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        flingBehavior2 = flingBehavior;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        horizontalAlignment2 = horizontalAlignment;
        if ($composer2.changed(horizontalAlignment2) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        horizontalAlignment2 = horizontalAlignment;
        goto L69
    L49:
        if ((r44 & 16) != 0) goto L53;
        verticalArrangement2 = verticalArrangement;
        if ($composer2.changed(verticalArrangement2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
    L54:
        r17 = 8192;
        goto L55
    L53:
        verticalArrangement2 = verticalArrangement;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L47
    L43:
        r10 = 1024;
        goto L44
    L45:
        reverseLayout2 = reverseLayout;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        contentPadding2 = contentPadding;
        goto L35
    L16:
        if ((r44 & 2) != 0) goto L20;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        state2 = state;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Vertical verticalArrangement, Alignment.Horizontal horizontalAlignment, FlingBehavior flingBehavior, boolean userScrollEnabled, final Function1 content, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-740714857);
        ComposerKt.sourceInformation($composer2, "C(LazyColumn)P(4,6,1,5,8,3,2,7)438@22207L26,429@21848L418:LazyDsl.kt#428nma");
        int $dirty = $changed;
        int r3 = r37 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        LazyListState state2 = state;
    L24:
        int r6 = r37 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        PaddingValues contentPadding2 = contentPadding;
    L35:
        int r8 = r37 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean reverseLayout2 = reverseLayout;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Arrangement.Vertical verticalArrangement2 = verticalArrangement;
    L57:
        int r13 = r37 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Alignment.Horizontal horizontalAlignment2 = horizontalAlignment;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        FlingBehavior flingBehavior2 = flingBehavior;
    L79:
        int $dirty2 = r37 & 128;
        if ($dirty2 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r37 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty3 = $dirty;
        if (($dirty & 38347923) == 38347922) goto L104;
        boolean r0 = true;
    L106:
        if ($composer2.shouldExecute(r0, $dirty3 & 1) == false) goto L156;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "419@21392L23,425@21746L15");
        if (($changed & 1) != 0) goto L110;
    L123:
        if (r3 == 0) goto L126;
        modifier2 = Modifier.Companion;
    L126:
        if ((r37 & 2) == 0) goto L128;
        state2 = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
        int $dirty4 = $dirty3 & (-113);
    L129:
        if (r6 == 0) goto L132;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L132:
        if (r8 == 0) goto L135;
        reverseLayout2 = false;
    L135:
        if ((r37 & 16) == 0) goto L141;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L139;
        Arrangement.Vertical verticalArrangement3 = r2.getTop();
    L140:
        $dirty4 = $dirty4 & (-57345);
        verticalArrangement2 = verticalArrangement3;
        goto L141
    L139:
        verticalArrangement3 = r2.getBottom();
    L141:
        if (r13 == 0) goto L144;
        horizontalAlignment2 = Alignment.Companion.getStart();
    L144:
        if ((r37 & 64) == 0) goto L146;
        $dirty4 = $dirty4 & (-3670017);
        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
    L146:
        if ($dirty2 == 0) goto L148;
        boolean userScrollEnabled2 = true;
        LazyListState state3 = state2;
        Arrangement.Vertical verticalArrangement4 = verticalArrangement2;
        Alignment.Horizontal horizontalAlignment3 = horizontalAlignment2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        int $dirty5 = $dirty4;
        Modifier modifier3 = modifier2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        int $dirty6 = -740714857;
    L149:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L152;
        ComposerKt.traceEventStart($dirty6, $dirty5, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:428)");
    L152:
        Composer $composer3 = $composer2;
        LazyColumn(modifier3, state3, contentPadding3, reverseLayout3, verticalArrangement4, horizontalAlignment3, flingBehavior3, userScrollEnabled2, OverscrollKt.rememberOverscrollEffect($composer2, 0), content, $composer3, (((((((($dirty5 & 14) | ($dirty5 & 112)) | ($dirty5 & 896)) | ($dirty5 & 7168)) | (57344 & $dirty5)) | (458752 & $dirty5)) | (3670016 & $dirty5)) | (29360128 & $dirty5)) | (($dirty5 << 3) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L155;
        ComposerKt.traceEventEnd();
    L155:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final Arrangement.Vertical verticalArrangement5 = verticalArrangement4;
        final Alignment.Horizontal horizontalAlignment4 = horizontalAlignment3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled3 = userScrollEnabled2;
        final LazyListState state4 = state3;
    L157:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L161;
        r14.updateScope(new AnonymousClass2(modifier4, state4, contentPadding4, reverseLayout4, verticalArrangement5, horizontalAlignment4, flingBehavior4, userScrollEnabled3, content, $changed, r37));
        return;
    L161:
        return;
    L148:
        userScrollEnabled2 = userScrollEnabled;
        $dirty5 = $dirty4;
        state3 = state2;
        verticalArrangement4 = verticalArrangement2;
        horizontalAlignment3 = horizontalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty6 = -740714857;
        modifier3 = modifier2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        goto L149
    L128:
        $dirty4 = $dirty3;
        goto L129
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L123;
        $composer2.skipToGroupEnd();
        if ((r37 & 2) == 0) goto L115;
        int $dirty7 = $dirty3 & (-113);
    L117:
        if ((r37 & 16) == 0) goto L120;
        $dirty7 = $dirty7 & (-57345);
    L120:
        if ((r37 & 64) == 0) goto L122;
        $dirty7 = $dirty7 & (-3670017);
    L122:
        userScrollEnabled2 = userScrollEnabled;
        $dirty5 = $dirty7;
        state3 = state2;
        verticalArrangement4 = verticalArrangement2;
        horizontalAlignment3 = horizontalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty6 = -740714857;
        modifier3 = modifier2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        goto L149
    L115:
        $dirty7 = $dirty3;
        goto L117
    L156:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        userScrollEnabled3 = userScrollEnabled;
        modifier4 = modifier2;
        state4 = state2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        verticalArrangement5 = verticalArrangement2;
        horizontalAlignment4 = horizontalAlignment2;
        flingBehavior4 = flingBehavior2;
        goto L157
    L104:
        r0 = false;
        goto L106
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(content) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
        goto L101
    L98:
        r18 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(userScrollEnabled) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L91
    L87:
        r19 = 4194304;
        goto L88
    L71:
        if ((r37 & 64) != 0) goto L75;
        flingBehavior2 = flingBehavior;
        if ($composer2.changed(flingBehavior2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        flingBehavior2 = flingBehavior;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        horizontalAlignment2 = horizontalAlignment;
        if ($composer2.changed(horizontalAlignment2) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        horizontalAlignment2 = horizontalAlignment;
        goto L69
    L49:
        if ((r37 & 16) != 0) goto L53;
        verticalArrangement2 = verticalArrangement;
        if ($composer2.changed(verticalArrangement2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
    L54:
        r17 = 8192;
        goto L55
    L53:
        verticalArrangement2 = verticalArrangement;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L47
    L43:
        r12 = 1024;
        goto L44
    L45:
        reverseLayout2 = reverseLayout;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        contentPadding2 = contentPadding;
        goto L35
    L16:
        if ((r37 & 2) != 0) goto L20;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        state2 = state;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Vertical verticalArrangement, Alignment.Horizontal horizontalAlignment, FlingBehavior flingBehavior, final Function1 content, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-563353797);
        ComposerKt.sourceInformation($composer2, "C(LazyColumn)P(4,6,1,5,7,3,2)456@22857L350:LazyDsl.kt#428nma");
        int $dirty = $changed;
        int r3 = r34 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        LazyListState state2 = state;
    L24:
        int r6 = r34 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        PaddingValues contentPadding2 = contentPadding;
    L35:
        int r8 = r34 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean reverseLayout2 = reverseLayout;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Arrangement.Vertical verticalArrangement2 = verticalArrangement;
    L57:
        int r13 = r34 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Alignment.Horizontal horizontalAlignment2 = horizontalAlignment;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        FlingBehavior r15 = flingBehavior;
    L80:
        if ((r34 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int $dirty2 = $dirty;
        if (($dirty & 4793491) == 4793490) goto L93;
        boolean r0 = true;
    L95:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L144;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "447@22440L23,453@22794L15");
        if (($changed & 1) != 0) goto L99;
    L112:
        if (r3 == 0) goto L114;
        Modifier.Companion modifier2 = Modifier.Companion;
    L116:
        if ((r34 & 2) == 0) goto L118;
        int $dirty3 = $dirty2 & (-113);
        state2 = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
    L119:
        if (r6 == 0) goto L122;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L122:
        if (r8 == 0) goto L125;
        reverseLayout2 = false;
    L125:
        if ((r34 & 16) == 0) goto L131;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L129;
        Arrangement.Vertical verticalArrangement3 = r2.getTop();
    L130:
        $dirty3 = $dirty3 & (-57345);
        verticalArrangement2 = verticalArrangement3;
        goto L131
    L129:
        verticalArrangement3 = r2.getBottom();
    L131:
        if (r13 == 0) goto L134;
        horizontalAlignment2 = Alignment.Companion.getStart();
    L134:
        if ((r34 & 64) == 0) goto L136;
        PaddingValues contentPadding3 = contentPadding2;
        Arrangement.Vertical verticalArrangement4 = verticalArrangement2;
        Alignment.Horizontal horizontalAlignment3 = horizontalAlignment2;
        LazyListState state3 = state2;
        boolean reverseLayout3 = reverseLayout2;
        Modifier modifier3 = modifier2;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        int $dirty4 = $dirty3 & (-3670017);
        int r5 = -563353797;
    L137:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventStart(r5, $dirty4, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:455)");
    L140:
        Composer $composer3 = $composer2;
        LazyColumn(modifier3, state3, contentPadding3, reverseLayout3, verticalArrangement4, horizontalAlignment3, flingBehavior2, true, null, content, $composer3, (((((((12582912 | ($dirty4 & 14)) | ($dirty4 & 112)) | ($dirty4 & 896)) | ($dirty4 & 7168)) | (57344 & $dirty4)) | (458752 & $dirty4)) | (3670016 & $dirty4)) | (($dirty4 << 6) & 1879048192), 256);
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventEnd();
    L143:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final Arrangement.Vertical verticalArrangement5 = verticalArrangement4;
        final Alignment.Horizontal horizontalAlignment4 = horizontalAlignment3;
        final FlingBehavior flingBehavior3 = flingBehavior2;
        final LazyListState state4 = state3;
    L145:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L149;
        r12.updateScope(new AnonymousClass3(modifier4, state4, contentPadding4, reverseLayout4, verticalArrangement5, horizontalAlignment4, flingBehavior3, content, $changed, r34));
        return;
    L149:
        return;
    L136:
        $dirty4 = $dirty3;
        contentPadding3 = contentPadding2;
        horizontalAlignment3 = horizontalAlignment2;
        r5 = -563353797;
        reverseLayout3 = reverseLayout2;
        modifier3 = modifier2;
        flingBehavior2 = r15;
        verticalArrangement4 = verticalArrangement2;
        state3 = state2;
        goto L137
    L118:
        $dirty3 = $dirty2;
        goto L119
    L114:
        modifier2 = r4;
        goto L116
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L112;
        $composer2.skipToGroupEnd();
        if ((r34 & 2) == 0) goto L104;
        int $dirty5 = $dirty2 & (-113);
    L106:
        if ((r34 & 16) == 0) goto L109;
        $dirty5 = $dirty5 & (-57345);
    L109:
        if ((r34 & 64) == 0) goto L111;
        $dirty5 = $dirty5 & (-3670017);
    L111:
        $dirty4 = $dirty5;
        contentPadding3 = contentPadding2;
        horizontalAlignment3 = horizontalAlignment2;
        r5 = -563353797;
        reverseLayout3 = reverseLayout2;
        flingBehavior2 = r15;
        modifier3 = r4;
        verticalArrangement4 = verticalArrangement2;
        state3 = state2;
        goto L137
    L104:
        $dirty5 = $dirty2;
        goto L106
    L144:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r4;
        state4 = state2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        verticalArrangement5 = verticalArrangement2;
        horizontalAlignment4 = horizontalAlignment2;
        flingBehavior3 = r15;
        goto L145
    L93:
        r0 = false;
        goto L95
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(content) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L90
    L87:
        r18 = 4194304;
        goto L88
    L71:
        if ((r34 & 64) != 0) goto L75;
        r15 = flingBehavior;
        if ($composer2.changed(r15) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        r15 = flingBehavior;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        horizontalAlignment2 = horizontalAlignment;
        if ($composer2.changed(horizontalAlignment2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L69
    L65:
        r17 = 65536;
        goto L66
    L67:
        horizontalAlignment2 = horizontalAlignment;
        goto L69
    L49:
        if ((r34 & 16) != 0) goto L53;
        verticalArrangement2 = verticalArrangement;
        if ($composer2.changed(verticalArrangement2) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
    L54:
        r14 = 8192;
        goto L55
    L53:
        verticalArrangement2 = verticalArrangement;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L43;
        int r19 = 2048;
    L44:
        $dirty = $dirty | r19;
        goto L47
    L43:
        r19 = 1024;
        goto L44
    L45:
        reverseLayout2 = reverseLayout;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        contentPadding2 = contentPadding;
        goto L35
    L16:
        if ((r34 & 2) != 0) goto L20;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        state2 = state;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L14
    L10:
        r10 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Horizontal horizontalArrangement, Alignment.Vertical verticalAlignment, FlingBehavior flingBehavior, boolean userScrollEnabled, final Function1 content, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-1724297413);
        ComposerKt.sourceInformation($composer2, "C(LazyRow)P(4,6,1,5,3,8,2,7)492@24187L26,483@23831L415:LazyDsl.kt#428nma");
        int $dirty = $changed;
        int r3 = r37 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        LazyListState state2 = state;
    L24:
        int r6 = r37 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        PaddingValues contentPadding2 = contentPadding;
    L35:
        int r8 = r37 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean reverseLayout2 = reverseLayout;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Arrangement.Horizontal horizontalArrangement2 = horizontalArrangement;
    L57:
        int r13 = r37 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Alignment.Vertical verticalAlignment2 = verticalAlignment;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        FlingBehavior flingBehavior2 = flingBehavior;
    L79:
        int $dirty2 = r37 & 128;
        if ($dirty2 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r37 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty3 = $dirty;
        if (($dirty & 38347923) == 38347922) goto L104;
        boolean r0 = true;
    L106:
        if ($composer2.shouldExecute(r0, $dirty3 & 1) == false) goto L156;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "473@23378L23,479@23729L15");
        if (($changed & 1) != 0) goto L110;
    L123:
        if (r3 == 0) goto L126;
        modifier2 = Modifier.Companion;
    L126:
        if ((r37 & 2) == 0) goto L128;
        state2 = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
        int $dirty4 = $dirty3 & (-113);
    L129:
        if (r6 == 0) goto L132;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L132:
        if (r8 == 0) goto L135;
        reverseLayout2 = false;
    L135:
        if ((r37 & 16) == 0) goto L141;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L139;
        Arrangement.Horizontal horizontalArrangement3 = r2.getStart();
    L140:
        $dirty4 = $dirty4 & (-57345);
        horizontalArrangement2 = horizontalArrangement3;
        goto L141
    L139:
        horizontalArrangement3 = r2.getEnd();
    L141:
        if (r13 == 0) goto L144;
        verticalAlignment2 = Alignment.Companion.getTop();
    L144:
        if ((r37 & 64) == 0) goto L146;
        $dirty4 = $dirty4 & (-3670017);
        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
    L146:
        if ($dirty2 == 0) goto L148;
        boolean userScrollEnabled2 = true;
        LazyListState state3 = state2;
        Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement2;
        Alignment.Vertical verticalAlignment3 = verticalAlignment2;
        FlingBehavior flingBehavior3 = flingBehavior2;
        int $dirty5 = $dirty4;
        Modifier modifier3 = modifier2;
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
        int $dirty6 = -1724297413;
    L149:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L152;
        ComposerKt.traceEventStart($dirty6, $dirty5, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:482)");
    L152:
        Composer $composer3 = $composer2;
        LazyRow(modifier3, state3, contentPadding3, reverseLayout3, horizontalArrangement4, verticalAlignment3, flingBehavior3, userScrollEnabled2, OverscrollKt.rememberOverscrollEffect($composer2, 0), content, $composer3, (((((((($dirty5 & 14) | ($dirty5 & 112)) | ($dirty5 & 896)) | ($dirty5 & 7168)) | (57344 & $dirty5)) | (458752 & $dirty5)) | (3670016 & $dirty5)) | (29360128 & $dirty5)) | (($dirty5 << 3) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L155;
        ComposerKt.traceEventEnd();
    L155:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final Arrangement.Horizontal horizontalArrangement5 = horizontalArrangement4;
        final Alignment.Vertical verticalAlignment4 = verticalAlignment3;
        final FlingBehavior flingBehavior4 = flingBehavior3;
        final boolean userScrollEnabled3 = userScrollEnabled2;
        final LazyListState state4 = state3;
    L157:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L161;
        r14.updateScope(new C02952(modifier4, state4, contentPadding4, reverseLayout4, horizontalArrangement5, verticalAlignment4, flingBehavior4, userScrollEnabled3, content, $changed, r37));
        return;
    L161:
        return;
    L148:
        userScrollEnabled2 = userScrollEnabled;
        $dirty5 = $dirty4;
        state3 = state2;
        horizontalArrangement4 = horizontalArrangement2;
        verticalAlignment3 = verticalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty6 = -1724297413;
        modifier3 = modifier2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        goto L149
    L128:
        $dirty4 = $dirty3;
        goto L129
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L123;
        $composer2.skipToGroupEnd();
        if ((r37 & 2) == 0) goto L115;
        int $dirty7 = $dirty3 & (-113);
    L117:
        if ((r37 & 16) == 0) goto L120;
        $dirty7 = $dirty7 & (-57345);
    L120:
        if ((r37 & 64) == 0) goto L122;
        $dirty7 = $dirty7 & (-3670017);
    L122:
        userScrollEnabled2 = userScrollEnabled;
        $dirty5 = $dirty7;
        state3 = state2;
        horizontalArrangement4 = horizontalArrangement2;
        verticalAlignment3 = verticalAlignment2;
        flingBehavior3 = flingBehavior2;
        $dirty6 = -1724297413;
        modifier3 = modifier2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        goto L149
    L115:
        $dirty7 = $dirty3;
        goto L117
    L156:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        userScrollEnabled3 = userScrollEnabled;
        modifier4 = modifier2;
        state4 = state2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        horizontalArrangement5 = horizontalArrangement2;
        verticalAlignment4 = verticalAlignment2;
        flingBehavior4 = flingBehavior2;
        goto L157
    L104:
        r0 = false;
        goto L106
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(content) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
        goto L101
    L98:
        r18 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(userScrollEnabled) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L91
    L87:
        r19 = 4194304;
        goto L88
    L71:
        if ((r37 & 64) != 0) goto L75;
        flingBehavior2 = flingBehavior;
        if ($composer2.changed(flingBehavior2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        flingBehavior2 = flingBehavior;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        verticalAlignment2 = verticalAlignment;
        if ($composer2.changed(verticalAlignment2) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        verticalAlignment2 = verticalAlignment;
        goto L69
    L49:
        if ((r37 & 16) != 0) goto L53;
        horizontalArrangement2 = horizontalArrangement;
        if ($composer2.changed(horizontalArrangement2) == false) goto L54;
        int r17 = 16384;
    L55:
        $dirty = $dirty | r17;
    L54:
        r17 = 8192;
        goto L55
    L53:
        horizontalArrangement2 = horizontalArrangement;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L47
    L43:
        r12 = 1024;
        goto L44
    L45:
        reverseLayout2 = reverseLayout;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        contentPadding2 = contentPadding;
        goto L35
    L16:
        if ((r37 & 2) != 0) goto L20;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        state2 = state;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState state, PaddingValues contentPadding, boolean reverseLayout, Arrangement.Horizontal horizontalArrangement, Alignment.Vertical verticalAlignment, FlingBehavior flingBehavior, final Function1 content, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(407929823);
        ComposerKt.sourceInformation($composer2, "C(LazyRow)P(4,6,1,5,3,7,2)510@24831L347:LazyDsl.kt#428nma");
        int $dirty = $changed;
        int r3 = r34 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        LazyListState state2 = state;
    L24:
        int r6 = r34 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        PaddingValues contentPadding2 = contentPadding;
    L35:
        int r8 = r34 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean reverseLayout2 = reverseLayout;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Arrangement.Horizontal horizontalArrangement2 = horizontalArrangement;
    L57:
        int r13 = r34 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Alignment.Vertical verticalAlignment2 = verticalAlignment;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        FlingBehavior r15 = flingBehavior;
    L80:
        if ((r34 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int $dirty2 = $dirty;
        if (($dirty & 4793491) == 4793490) goto L93;
        boolean r0 = true;
    L95:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L144;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "501@24417L23,507@24768L15");
        if (($changed & 1) != 0) goto L99;
    L112:
        if (r3 == 0) goto L114;
        Modifier.Companion modifier2 = Modifier.Companion;
    L116:
        if ((r34 & 2) == 0) goto L118;
        int $dirty3 = $dirty2 & (-113);
        state2 = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
    L119:
        if (r6 == 0) goto L122;
        contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L122:
        if (r8 == 0) goto L125;
        reverseLayout2 = false;
    L125:
        if ((r34 & 16) == 0) goto L131;
        Arrangement r2 = Arrangement.INSTANCE;
        if (reverseLayout2 == true) goto L129;
        Arrangement.Horizontal horizontalArrangement3 = r2.getStart();
    L130:
        $dirty3 = $dirty3 & (-57345);
        horizontalArrangement2 = horizontalArrangement3;
        goto L131
    L129:
        horizontalArrangement3 = r2.getEnd();
    L131:
        if (r13 == 0) goto L134;
        verticalAlignment2 = Alignment.Companion.getTop();
    L134:
        if ((r34 & 64) == 0) goto L136;
        PaddingValues contentPadding3 = contentPadding2;
        Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement2;
        Alignment.Vertical verticalAlignment3 = verticalAlignment2;
        LazyListState state3 = state2;
        boolean reverseLayout3 = reverseLayout2;
        Modifier modifier3 = modifier2;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        int $dirty4 = $dirty3 & (-3670017);
        int r5 = 407929823;
    L137:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventStart(r5, $dirty4, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:509)");
    L140:
        Composer $composer3 = $composer2;
        LazyRow(modifier3, state3, contentPadding3, reverseLayout3, horizontalArrangement4, verticalAlignment3, flingBehavior2, true, null, content, $composer3, (((((((12582912 | ($dirty4 & 14)) | ($dirty4 & 112)) | ($dirty4 & 896)) | ($dirty4 & 7168)) | (57344 & $dirty4)) | (458752 & $dirty4)) | (3670016 & $dirty4)) | (($dirty4 << 6) & 1879048192), 256);
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventEnd();
    L143:
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding4 = contentPadding3;
        final boolean reverseLayout4 = reverseLayout3;
        final Arrangement.Horizontal horizontalArrangement5 = horizontalArrangement4;
        final Alignment.Vertical verticalAlignment4 = verticalAlignment3;
        final FlingBehavior flingBehavior3 = flingBehavior2;
        final LazyListState state4 = state3;
    L145:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L149;
        r12.updateScope(new C02963(modifier4, state4, contentPadding4, reverseLayout4, horizontalArrangement5, verticalAlignment4, flingBehavior3, content, $changed, r34));
        return;
    L149:
        return;
    L136:
        $dirty4 = $dirty3;
        contentPadding3 = contentPadding2;
        verticalAlignment3 = verticalAlignment2;
        r5 = 407929823;
        reverseLayout3 = reverseLayout2;
        modifier3 = modifier2;
        flingBehavior2 = r15;
        horizontalArrangement4 = horizontalArrangement2;
        state3 = state2;
        goto L137
    L118:
        $dirty3 = $dirty2;
        goto L119
    L114:
        modifier2 = r4;
        goto L116
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L112;
        $composer2.skipToGroupEnd();
        if ((r34 & 2) == 0) goto L104;
        int $dirty5 = $dirty2 & (-113);
    L106:
        if ((r34 & 16) == 0) goto L109;
        $dirty5 = $dirty5 & (-57345);
    L109:
        if ((r34 & 64) == 0) goto L111;
        $dirty5 = $dirty5 & (-3670017);
    L111:
        $dirty4 = $dirty5;
        contentPadding3 = contentPadding2;
        verticalAlignment3 = verticalAlignment2;
        r5 = 407929823;
        reverseLayout3 = reverseLayout2;
        flingBehavior2 = r15;
        modifier3 = r4;
        horizontalArrangement4 = horizontalArrangement2;
        state3 = state2;
        goto L137
    L104:
        $dirty5 = $dirty2;
        goto L106
    L144:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r4;
        state4 = state2;
        contentPadding4 = contentPadding2;
        reverseLayout4 = reverseLayout2;
        horizontalArrangement5 = horizontalArrangement2;
        verticalAlignment4 = verticalAlignment2;
        flingBehavior3 = r15;
        goto L145
    L93:
        r0 = false;
        goto L95
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(content) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L90
    L87:
        r18 = 4194304;
        goto L88
    L71:
        if ((r34 & 64) != 0) goto L75;
        r15 = flingBehavior;
        if ($composer2.changed(r15) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        r15 = flingBehavior;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        verticalAlignment2 = verticalAlignment;
        if ($composer2.changed(verticalAlignment2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L69
    L65:
        r17 = 65536;
        goto L66
    L67:
        verticalAlignment2 = verticalAlignment;
        goto L69
    L49:
        if ((r34 & 16) != 0) goto L53;
        horizontalArrangement2 = horizontalArrangement;
        if ($composer2.changed(horizontalArrangement2) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
    L54:
        r14 = 8192;
        goto L55
    L53:
        horizontalArrangement2 = horizontalArrangement;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        reverseLayout2 = reverseLayout;
        if ($composer2.changed(reverseLayout2) == false) goto L43;
        int r19 = 2048;
    L44:
        $dirty = $dirty | r19;
        goto L47
    L43:
        r19 = 1024;
        goto L44
    L45:
        reverseLayout2 = reverseLayout;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        contentPadding2 = contentPadding;
        if ($composer2.changed(contentPadding2) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        contentPadding2 = contentPadding;
        goto L35
    L16:
        if ((r34 & 2) != 0) goto L20;
        state2 = state;
        if ($composer2.changed(state2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
    L21:
        r7 = 16;
        goto L22
    L20:
        state2 = state;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r10 = 4;
    L11:
        $dirty = $dirty | r10;
        goto L14
    L10:
        r10 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }
}
