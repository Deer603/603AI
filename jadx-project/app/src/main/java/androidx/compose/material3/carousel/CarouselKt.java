package androidx.compose.material3.carousel;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Carousel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a»\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000526\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001621\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0091\u0001\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u000f21\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a}\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00142\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000e\u001a\u00020\u000f21\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0018\u0010(\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H\u0000\u001a\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H\u0001\u001a \u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\bH\u0002\u001a\u0019\u00101\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u00102\u001a\u0019\u00103\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u00102\u001a:\u00104\u001a\u00020\u0013*\u00020\u00132\u0006\u00105\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Carousel", "", "state", "Landroidx/compose/material3/carousel/CarouselState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "keylineList", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "availableSpace", "itemSpacing", "Landroidx/compose/material3/carousel/KeylineList;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "maxNonFocalVisibleItemCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "content", "Landroidx/compose/material3/carousel/CarouselItemScope;", "itemIndex", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Carousel-V-95POc", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalMultiBrowseCarousel", "preferredItemWidth", "minSmallItemWidth", "maxSmallItemWidth", "HorizontalMultiBrowseCarousel-zCIJ0Nk", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;FFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel", "itemWidth", "HorizontalUncontainedCarousel-9QcgTRs", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "calculateCurrentScrollOffset", "strategy", "Landroidx/compose/material3/carousel/Strategy;", "calculateMaxScrollOffset", "getProgress", "before", "Landroidx/compose/material3/carousel/Keyline;", "after", "unadjustedOffset", "calculateAfterContentPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)F", "calculateBeforeContentPadding", "carouselItem", "index", "Lkotlin/Function0;", "carouselItemInfo", "Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CarouselKt {
    public static final /* synthetic */ float access$getProgress(Keyline before, Keyline after, float unadjustedOffset) {
        return getProgress(before, after, unadjustedOffset);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: HorizontalMultiBrowseCarousel-zCIJ0Nk, reason: not valid java name */
    public static final void m3011HorizontalMultiBrowseCarouselzCIJ0Nk(final CarouselState state, final float preferredItemWidth, Modifier modifier, float itemSpacing, TargetedFlingBehavior flingBehavior, float minSmallItemWidth, float maxSmallItemWidth, PaddingValues contentPadding, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-1825706865);
        ComposerKt.sourceInformation($composer2, "C(HorizontalMultiBrowseCarousel)P(8,7:c#ui.unit.Dp,6,3:c#ui.unit.Dp,2,5:c#ui.unit.Dp,4:c#ui.unit.Dp,1)106@5374L41,112@5703L7,116@5816L554,113@5715L1048:Carousel.kt#dcf9yb");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r35 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        float r8 = preferredItemWidth;
    L23:
        int r2 = r35 & 4;
        if (r2 == 0) goto L27;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L34:
        int r4 = r35 & 8;
        if (r4 == 0) goto L38;
        $dirty = $dirty | 3072;
        float r5 = itemSpacing;
    L46:
        if (($changed & 24576) == 0) goto L48;
        TargetedFlingBehavior flingBehavior2 = flingBehavior;
    L56:
        int r11 = r35 & 32;
        if (r11 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float minSmallItemWidth2 = minSmallItemWidth;
    L67:
        int r16 = r35 & 64;
        if (r16 == 0) goto L71;
        $dirty = $dirty | 1572864;
        float maxSmallItemWidth2 = maxSmallItemWidth;
    L78:
        int r7 = r35 & 128;
        if (r7 == 0) goto L82;
        $dirty = $dirty | 12582912;
        PaddingValues r6 = contentPadding;
    L89:
        int $dirty2 = $dirty;
        if ((r35 & 256) == 0) goto L93;
        $dirty2 = $dirty2 | 100663296;
    L101:
        if (($dirty2 & 38347923) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L115:
        if (r2 == 0) goto L117;
        Modifier modifier3 = Modifier.Companion;
    L118:
        if (r4 == 0) goto L120;
        float itemSpacing2 = Dp.m6973constructorimpl(0);
    L122:
        if ((r35 & 16) == 0) goto L124;
        int r9 = ($dirty2 & 14) | 384;
        CarouselState r1 = state;
        $dirty2 = $dirty2 & (-57345);
        flingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(r1, null, $composer2, r9, 2);
    L125:
        if (r11 == 0) goto L127;
        minSmallItemWidth2 = CarouselDefaults.INSTANCE.m3008getMinSmallItemSizeD9Ej5fM$material3_release();
    L127:
        if (r16 == 0) goto L129;
        maxSmallItemWidth2 = CarouselDefaults.INSTANCE.m3007getMaxSmallItemSizeD9Ej5fM$material3_release();
    L129:
        if (r7 == 0) goto L131;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
        TargetedFlingBehavior flingBehavior3 = flingBehavior2;
        int $dirty3 = $dirty2;
        Modifier modifier4 = modifier3;
        float itemSpacing3 = itemSpacing2;
    L132:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L135;
        ComposerKt.traceEventStart(-1825706865, $dirty3, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:111)");
    L135:
        ProvidableCompositionLocal<Density> r3 = CompositionLocalsKt.getLocalDensity();
        int $dirty4 = $dirty3;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r0 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r0;
        Orientation r10 = Orientation.Horizontal;
        ComposerKt.sourceInformationMarkerStart($composer2, 1995157598, "CC(remember):Carousel.kt#9igjgp");
        boolean r12 = $composer2.changed(density);
        if (($dirty4 & 112) != 32) goto L138;
        boolean r13 = true;
    L139:
        boolean r14 = (r12 | r13) | $composer2.changedInstance(r1);
        if (($dirty4 & 458752) != 131072) goto L142;
        boolean r15 = true;
    L143:
        boolean r17 = r14 | r15;
        if (($dirty4 & 3670016) != 1048576) goto L146;
        boolean r18 = true;
    L147:
        boolean invalid$iv = r17 | r18;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L150;
    L153:
        final float r28 = r8;
        final float maxSmallItemWidth3 = maxSmallItemWidth2;
        final float minSmallItemWidth3 = minSmallItemWidth2;
        float maxSmallItemWidth4 = maxSmallItemWidth3;
        Object value$iv = (Function2) new CarouselKt$HorizontalMultiBrowseCarousel$1$1(density, r28, state, minSmallItemWidth3, maxSmallItemWidth3);
        $composer2.updateRememberedValue(value$iv);
    L154:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        m3010CarouselV95POc(state, r10, (Function2) value$iv, contentPadding2, 2, modifier4, itemSpacing3, flingBehavior3, r32, $composer2, (((((($dirty4 & 14) | 24624) | (($dirty4 >> 12) & 7168)) | (($dirty4 << 9) & 458752)) | (($dirty4 << 9) & 3670016)) | (29360128 & ($dirty4 << 9))) | ($dirty4 & 234881024), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L157;
        ComposerKt.traceEventEnd();
    L157:
        final PaddingValues contentPadding3 = contentPadding2;
        modifier2 = modifier4;
        final float itemSpacing4 = itemSpacing3;
        final TargetedFlingBehavior flingBehavior4 = flingBehavior3;
        final float maxSmallItemWidth5 = maxSmallItemWidth4;
        final float itemSpacing5 = minSmallItemWidth2;
    L158:
        ScopeUpdateScope r19 = $composer2.endRestartGroup();
        if (r19 == null) goto L162;
        r19.updateScope(new CarouselKt$HorizontalMultiBrowseCarousel$2(state, preferredItemWidth, modifier2, itemSpacing4, flingBehavior4, itemSpacing5, maxSmallItemWidth5, contentPadding3, r32, $changed, r35));
        return;
    L162:
        return;
    L150:
        if (it$iv == Composer.Companion.getEmpty()) goto L153;
        value$iv = it$iv;
        maxSmallItemWidth4 = maxSmallItemWidth2;
        goto L154
    L146:
        r18 = false;
        goto L147
    L142:
        r15 = false;
        goto L143
    L138:
        r13 = false;
        goto L139
    L131:
        contentPadding2 = r6;
        flingBehavior3 = flingBehavior2;
        $dirty3 = $dirty2;
        modifier4 = modifier3;
        itemSpacing3 = itemSpacing2;
        goto L132
    L124:
        r1 = state;
        goto L125
    L120:
        itemSpacing2 = r5;
        goto L122
    L117:
        modifier3 = modifier2;
        goto L118
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L115;
        $composer2.skipToGroupEnd();
        if ((r35 & 16) == 0) goto L114;
        $dirty2 = $dirty2 & (-57345);
    L114:
        float r20 = r5;
        modifier4 = modifier2;
        contentPadding2 = r6;
        itemSpacing3 = r20;
        r1 = state;
        flingBehavior3 = flingBehavior2;
        $dirty3 = $dirty2;
        goto L132
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        itemSpacing4 = r5;
        contentPadding3 = r6;
        flingBehavior4 = flingBehavior2;
        maxSmallItemWidth5 = maxSmallItemWidth2;
        itemSpacing5 = minSmallItemWidth2;
        goto L158
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r32) == false) goto L97;
        int r21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty2 = $dirty2 | r21;
        goto L101
    L97:
        r21 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L88;
        r6 = contentPadding;
        if ($composer2.changed(r6) == false) goto L86;
        int r22 = 8388608;
    L87:
        $dirty = $dirty | r22;
        goto L89
    L86:
        r22 = 4194304;
        goto L87
    L88:
        r6 = contentPadding;
        goto L89
    L71:
        if (($changed & 1572864) != 0) goto L77;
        maxSmallItemWidth2 = maxSmallItemWidth;
        if ($composer2.changed(maxSmallItemWidth2) == false) goto L75;
        int r110 = 1048576;
    L76:
        $dirty = $dirty | r110;
        goto L78
    L75:
        r110 = 524288;
        goto L76
    L77:
        maxSmallItemWidth2 = maxSmallItemWidth;
        goto L78
    L60:
        if ((196608 & $changed) != 0) goto L66;
        minSmallItemWidth2 = minSmallItemWidth;
        if ($composer2.changed(minSmallItemWidth2) == false) goto L64;
        int r111 = 131072;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 65536;
        goto L65
    L66:
        minSmallItemWidth2 = minSmallItemWidth;
        goto L67
    L48:
        if ((r35 & 16) != 0) goto L52;
        flingBehavior2 = flingBehavior;
        if ($composer2.changed(flingBehavior2) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
    L53:
        r112 = 8192;
        goto L54
    L52:
        flingBehavior2 = flingBehavior;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = itemSpacing;
        if ($composer2.changed(r5) == false) goto L42;
        int r113 = 2048;
    L43:
        $dirty = $dirty | r113;
        goto L46
    L42:
        r113 = 1024;
        goto L43
    L44:
        r5 = itemSpacing;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r23 = 256;
    L32:
        $dirty = $dirty | r23;
        goto L34
    L31:
        r23 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r8 = preferredItemWidth;
        if ($composer2.changed(r8) == false) goto L20;
        int r24 = 32;
    L21:
        $dirty = $dirty | r24;
        goto L23
    L20:
        r24 = 16;
        goto L21
    L22:
        r8 = preferredItemWidth;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(state) == false) goto L10;
        int r25 = 4;
    L11:
        $dirty = $dirty | r25;
        goto L13
    L10:
        r25 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: HorizontalUncontainedCarousel-9QcgTRs, reason: not valid java name */
    public static final void m3012HorizontalUncontainedCarousel9QcgTRs(final CarouselState state, final float itemWidth, Modifier modifier, float itemSpacing, TargetedFlingBehavior flingBehavior, PaddingValues contentPadding, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r27, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(529322840);
        ComposerKt.sourceInformation($composer2, "C(HorizontalUncontainedCarousel)P(6,4:c#ui.unit.Dp,5,3:c#ui.unit.Dp,2,1)175@8483L21,179@8666L7,183@8779L337,180@8678L818:Carousel.kt#dcf9yb");
        int $dirty = $changed;
        if ((r30 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        CarouselState r9 = state;
    L14:
        if ((r30 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r4 = r30 & 4;
        if (r4 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r7 = r30 & 8;
        if (r7 == 0) goto L38;
        $dirty = $dirty | 3072;
        float itemSpacing2 = itemSpacing;
    L46:
        if (($changed & 24576) == 0) goto L48;
        TargetedFlingBehavior flingBehavior2 = flingBehavior;
    L56:
        int r12 = r30 & 32;
        if (r12 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        PaddingValues r13 = contentPadding;
    L68:
        if ((r30 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
        Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r14 = r27;
    L79:
        if ((599187 & $dirty) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L93:
        if (r4 == 0) goto L95;
        modifier2 = Modifier.Companion;
    L95:
        if (r7 == 0) goto L97;
        itemSpacing2 = Dp.m6973constructorimpl(0);
    L97:
        int $this$dp$iv = r30 & 16;
        if ($this$dp$iv == 0) goto L100;
        $dirty = $dirty & (-57345);
        flingBehavior2 = CarouselDefaults.INSTANCE.noSnapFlingBehavior($composer2, 6);
    L100:
        if (r12 == 0) goto L102;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
        float itemSpacing3 = itemSpacing2;
        TargetedFlingBehavior flingBehavior3 = flingBehavior2;
    L103:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventStart(529322840, $dirty, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:178)");
    L106:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r8;
        Orientation r10 = Orientation.Horizontal;
        ComposerKt.sourceInformationMarkerStart($composer2, 1883505148, "CC(remember):Carousel.kt#9igjgp");
        boolean r5 = $composer2.changed(density);
        if (($dirty & 112) != 32) goto L109;
        boolean r6 = true;
    L110:
        boolean invalid$iv = r5 | r6;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L116;
        Composer $composer3 = $composer2;
        if (it$iv == Composer.Companion.getEmpty()) goto L117;
        Object value$iv = it$iv;
    L118:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r17 = r14;
        Modifier modifier3 = modifier2;
        m3010CarouselV95POc(r9, r10, (Function2) value$iv, contentPadding2, 0, modifier3, itemSpacing3, flingBehavior3, r17, $composer3, (((((($dirty & 14) | 24624) | (($dirty >> 6) & 7168)) | (($dirty << 9) & 458752)) | (($dirty << 9) & 3670016)) | (29360128 & ($dirty << 9))) | (($dirty << 6) & 234881024), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L121;
        ComposerKt.traceEventEnd();
    L121:
        final PaddingValues contentPadding3 = contentPadding2;
        final Modifier modifier4 = modifier3;
        final float itemSpacing4 = itemSpacing3;
        final TargetedFlingBehavior flingBehavior4 = flingBehavior3;
    L122:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L126;
        r11.updateScope(new CarouselKt$HorizontalUncontainedCarousel$2(state, itemWidth, modifier4, itemSpacing4, flingBehavior4, contentPadding3, r27, $changed, r30));
        return;
    L126:
        return;
    L117:
        value$iv = (Function2) new CarouselKt$HorizontalUncontainedCarousel$1$1(density, itemWidth);
        $composer2.updateRememberedValue(value$iv);
        goto L118
    L116:
        $composer3 = $composer2;
        goto L117
    L109:
        r6 = false;
        goto L110
    L102:
        itemSpacing3 = itemSpacing2;
        flingBehavior3 = flingBehavior2;
        contentPadding2 = r13;
        goto L103
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L93;
        $composer2.skipToGroupEnd();
        if ((r30 & 16) == 0) goto L92;
        $dirty = $dirty & (-57345);
    L92:
        itemSpacing3 = itemSpacing2;
        flingBehavior3 = flingBehavior2;
        contentPadding2 = r13;
        goto L103
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        itemSpacing4 = itemSpacing2;
        flingBehavior4 = flingBehavior2;
        modifier4 = modifier2;
        contentPadding3 = r13;
        goto L122
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r14 = r27;
        if ($composer2.changedInstance(r14) == false) goto L75;
        int r15 = 1048576;
    L76:
        $dirty = $dirty | r15;
        goto L79
    L75:
        r15 = 524288;
        goto L76
    L77:
        r14 = r27;
        goto L79
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r13 = contentPadding;
        if ($composer2.changed(r13) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L68
    L64:
        r16 = 65536;
        goto L65
    L66:
        r13 = contentPadding;
        goto L68
    L48:
        if ((r30 & 16) != 0) goto L52;
        flingBehavior2 = flingBehavior;
        if ($composer2.changed(flingBehavior2) == false) goto L53;
        int r18 = 16384;
    L54:
        $dirty = $dirty | r18;
    L53:
        r18 = 8192;
        goto L54
    L52:
        flingBehavior2 = flingBehavior;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        itemSpacing2 = itemSpacing;
        if ($composer2.changed(itemSpacing2) == false) goto L42;
        int r19 = 2048;
    L43:
        $dirty = $dirty | r19;
        goto L46
    L42:
        r19 = 1024;
        goto L43
    L44:
        itemSpacing2 = itemSpacing;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r20 = 256;
    L32:
        $dirty = $dirty | r20;
        goto L34
    L31:
        r20 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(itemWidth) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L23
    L21:
        r21 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = state;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L14
    L10:
        r22 = 2;
        goto L11
    L12:
        r9 = state;
        goto L14
    }

    /* JADX INFO: renamed from: Carousel-V-95POc, reason: not valid java name */
    public static final void m3010CarouselV95POc(final CarouselState state, final Orientation orientation, final Function2<? super Float, ? super Float, KeylineList> r40, final PaddingValues contentPadding, final int maxNonFocalVisibleItemCount, Modifier modifier, float itemSpacing, TargetedFlingBehavior flingBehavior, final Function4<? super CarouselItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r46, Composer $composer, final int $changed, final int r49) {
        Composer $composer2 = $composer.startRestartGroup(-2035733443);
        ComposerKt.sourceInformation($composer2, "C(Carousel)P(8,7,4,1,5,6,3:c#ui.unit.Dp,2)239@11411L41,242@11572L42,243@11660L41,245@11729L118:Carousel.kt#dcf9yb");
        int $dirty = $changed;
        if ((r49 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r49 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r49 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if ((r49 & 8) == 0) goto L36;
        $dirty = $dirty | 3072;
    L43:
        if ((r49 & 16) == 0) goto L46;
        $dirty = $dirty | 24576;
        int r14 = maxNonFocalVisibleItemCount;
    L53:
        int r2 = r49 & 32;
        if (r2 == 0) goto L57;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Modifier modifier2 = modifier;
    L64:
        int r5 = r49 & 64;
        if (r5 == 0) goto L68;
        $dirty = $dirty | 1572864;
        float itemSpacing2 = itemSpacing;
    L76:
        if (($changed & 12582912) == 0) goto L78;
        TargetedFlingBehavior r13 = flingBehavior;
    L87:
        if ((r49 & 256) == 0) goto L90;
        $dirty = $dirty | 100663296;
    L96:
        int $dirty2 = $dirty;
        if ((38347923 & $dirty2) == 38347922) goto L99;
    L102:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L105;
    L111:
        if (r2 == 0) goto L113;
        Modifier modifier3 = Modifier.Companion;
    L114:
        if (r5 == 0) goto L116;
        itemSpacing2 = Dp.m6973constructorimpl(0);
    L116:
        int $this$dp$iv = r49 & 128;
        if ($this$dp$iv == 0) goto L119;
        int r4 = ($dirty2 & 14) | 384;
        final CarouselState r1 = state;
        $dirty2 = $dirty2 & (-29360129);
        TargetedFlingBehavior flingBehavior2 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(r1, null, $composer2, r4, 2);
        modifier2 = modifier3;
        float itemSpacing3 = itemSpacing2;
    L120:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L123;
        ComposerKt.traceEventStart(-2035733443, $dirty2, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:241)");
    L123:
        float beforeContentPadding = calculateBeforeContentPadding(contentPadding, orientation, $composer2, (($dirty2 >> 9) & 14) | ($dirty2 & 112));
        float afterContentPadding = calculateAfterContentPadding(contentPadding, orientation, $composer2, (($dirty2 >> 9) & 14) | ($dirty2 & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, 2025986753, "CC(remember):Carousel.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L126;
        boolean invalid$iv = true;
    L127:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L133;
        Modifier modifier4 = modifier2;
        if (it$iv == Composer.Companion.getEmpty()) goto L134;
        Object value$iv = it$iv;
    L135:
        final CarouselPageSize pageSize = (CarouselPageSize) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SnapPosition snapPosition = KeylineSnapPositionKt.KeylineSnapPosition(pageSize);
        if (orientation != Orientation.Horizontal) goto L138;
        $composer2.startReplaceGroup(-1618653092);
        ComposerKt.sourceInformation($composer2, "266@12589L1014,252@11960L1643");
        int r17 = r14;
        Modifier modifier5 = modifier4;
        PagerKt.m970HorizontalPageroI3XNZo(r1.getPagerState$material3_release(), modifier5, PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, contentPadding.mo677calculateTopPaddingD9Ej5fM(), 0.0f, contentPadding.mo674calculateBottomPaddingD9Ej5fM(), 5, null), pageSize, r17, itemSpacing3, null, flingBehavior2, false, false, null, null, snapPosition, ComposableLambdaKt.rememberComposableLambda(687111200, true, new CarouselKt$Carousel$1(r1, pageSize, r46), $composer2, 54), $composer2, (((($dirty2 >> 12) & 112) | (57344 & $dirty2)) | (($dirty2 >> 3) & 458752)) | (29360128 & $dirty2), 3072, 3904);
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
    L143:
        if (ComposerKt.isTraceInProgress() == false) goto L145;
        ComposerKt.traceEventEnd();
    L145:
        modifier2 = modifier5;
        final float itemSpacing4 = itemSpacing3;
        final TargetedFlingBehavior flingBehavior3 = flingBehavior2;
    L146:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L150;
        final Modifier modifier6 = modifier2;
        r15.updateScope(new CarouselKt$Carousel$3(state, orientation, r40, contentPadding, maxNonFocalVisibleItemCount, modifier6, itemSpacing4, flingBehavior3, r46, $changed, r49));
        return;
    L150:
        return;
    L138:
        modifier5 = modifier4;
        if (orientation != Orientation.Vertical) goto L141;
        $composer2.startReplaceGroup(-1616959128);
        ComposerKt.sourceInformation($composer2, "300@13962L7,301@14054L7,309@14347L1014,295@13666L1695");
        PagerState r16 = r1.getPagerState$material3_release();
        ProvidableCompositionLocal<LayoutDirection> r0 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float r32 = PaddingKt.calculateStartPadding(contentPadding, (LayoutDirection) r3);
        ProvidableCompositionLocal<LayoutDirection> r6 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        PagerKt.m972VerticalPageroI3XNZo(r16, modifier5, PaddingKt.m722PaddingValuesa9UjIt4$default(r32, 0.0f, PaddingKt.calculateEndPadding(contentPadding, (LayoutDirection) r7), 0.0f, 10, null), pageSize, maxNonFocalVisibleItemCount, itemSpacing3, null, flingBehavior2, false, false, null, null, snapPosition, ComposableLambdaKt.rememberComposableLambda(-817308503, true, new CarouselKt$Carousel$2(r1, pageSize, r46), $composer2, 54), $composer2, (((($dirty2 >> 12) & 112) | (57344 & $dirty2)) | (($dirty2 >> 3) & 458752)) | (29360128 & $dirty2), 3072, 3904);
        $composer3 = $composer2;
        $composer3.endReplaceGroup();
        goto L143
    L141:
        $composer3 = $composer2;
        $composer3.startReplaceGroup(-1615314857);
        $composer3.endReplaceGroup();
    L134:
        value$iv = new CarouselPageSize(r40, beforeContentPadding, afterContentPadding);
        $composer2.updateRememberedValue(value$iv);
        goto L135
    L133:
        modifier4 = modifier2;
        goto L134
    L126:
        invalid$iv = false;
        goto L127
    L119:
        r1 = state;
        flingBehavior2 = r13;
        modifier2 = modifier3;
        itemSpacing3 = itemSpacing2;
        goto L120
    L113:
        modifier3 = modifier2;
        goto L114
    L105:
        if ($composer2.getDefaultsInvalid() == true) goto L111;
        $composer2.skipToGroupEnd();
        if ((r49 & 128) == 0) goto L110;
        $dirty2 = $dirty2 & (-29360129);
        r1 = state;
        flingBehavior2 = r13;
        itemSpacing3 = itemSpacing2;
        goto L120
    L110:
        r1 = state;
        flingBehavior2 = r13;
        itemSpacing3 = itemSpacing2;
        goto L120
    L99:
        if ($composer2.getSkipping() == false) goto L102;
        $composer2.skipToGroupEnd();
        flingBehavior3 = r13;
        itemSpacing4 = itemSpacing2;
        $composer3 = $composer2;
        goto L146
    L90:
        if (($changed & 100663296) != 0) goto L96;
        if ($composer2.changedInstance(r46) == false) goto L94;
        int r12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L95:
        $dirty = $dirty | r12;
        goto L96
    L94:
        r12 = 33554432;
        goto L95
    L78:
        if ((r49 & 128) != 0) goto L82;
        r13 = flingBehavior;
        if ($composer2.changed(r13) == false) goto L83;
        int r18 = 8388608;
    L84:
        $dirty = $dirty | r18;
    L83:
        r18 = 4194304;
        goto L84
    L82:
        r13 = flingBehavior;
        goto L83
    L68:
        if ((1572864 & $changed) != 0) goto L74;
        itemSpacing2 = itemSpacing;
        if ($composer2.changed(itemSpacing2) == false) goto L72;
        int r19 = 1048576;
    L73:
        $dirty = $dirty | r19;
        goto L76
    L72:
        r19 = 524288;
        goto L73
    L74:
        itemSpacing2 = itemSpacing;
        goto L76
    L57:
        if ((196608 & $changed) != 0) goto L63;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L61;
        int r8 = 131072;
    L62:
        $dirty = $dirty | r8;
        goto L64
    L61:
        r8 = 65536;
        goto L62
    L63:
        modifier2 = modifier;
        goto L64
    L46:
        if (($changed & 24576) != 0) goto L52;
        r14 = maxNonFocalVisibleItemCount;
        if ($composer2.changed(r14) == false) goto L50;
        int r9 = 16384;
    L51:
        $dirty = $dirty | r9;
        goto L53
    L50:
        r9 = 8192;
        goto L51
    L52:
        r14 = maxNonFocalVisibleItemCount;
        goto L53
    L36:
        if (($changed & 3072) != 0) goto L43;
        if ($composer2.changed(contentPadding) == false) goto L40;
        int r10 = 2048;
    L41:
        $dirty = $dirty | r10;
        goto L43
    L40:
        r10 = 1024;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r40) == false) goto L30;
        int r11 = 256;
    L31:
        $dirty = $dirty | r11;
        goto L33
    L30:
        r11 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(orientation) == false) goto L20;
        int r20 = 32;
    L21:
        $dirty = $dirty | r20;
        goto L23
    L20:
        r20 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(state) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    }

    private static final float calculateBeforeContentPadding(PaddingValues $this$calculateBeforeContentPadding, Orientation orientation, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1896839347, "C(calculateBeforeContentPadding)*349@15698L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1896839347, $changed, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:341)");
    L5:
        $composer.startReplaceGroup(295830617);
        ComposerKt.sourceInformation($composer, "346@15649L7");
        if (orientation != Orientation.Vertical) goto L8;
        float dpValue = $this$calculateBeforeContentPadding.mo677calculateTopPaddingD9Ej5fM();
    L9:
        $composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> r3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density $this$calculateBeforeContentPadding_u24lambda_u243 = (Density) r1;
        float r2 = $this$calculateBeforeContentPadding_u24lambda_u243.mo376toPx0680j_4(dpValue);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L8:
        ProvidableCompositionLocal<LayoutDirection> r0 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        dpValue = PaddingKt.calculateStartPadding($this$calculateBeforeContentPadding, (LayoutDirection) r5);
        goto L9
    }

    private static final float calculateAfterContentPadding(PaddingValues $this$calculateAfterContentPadding, Orientation orientation, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1018496720, "C(calculateAfterContentPadding)*361@16056L7:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1018496720, $changed, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:353)");
    L5:
        $composer.startReplaceGroup(-587616383);
        ComposerKt.sourceInformation($composer, "358@16007L7");
        if (orientation != Orientation.Vertical) goto L8;
        float dpValue = $this$calculateAfterContentPadding.mo674calculateBottomPaddingD9Ej5fM();
    L9:
        $composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> r3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density $this$calculateAfterContentPadding_u24lambda_u244 = (Density) r1;
        float r2 = $this$calculateAfterContentPadding_u24lambda_u244.mo376toPx0680j_4(dpValue);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L8:
        ProvidableCompositionLocal<LayoutDirection> r0 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        dpValue = PaddingKt.calculateEndPadding($this$calculateAfterContentPadding, (LayoutDirection) r5);
        goto L9
    }

    public static final Modifier carouselItem(Modifier $this$carouselItem, final int index, final CarouselState state, final Function0<Strategy> r9, final CarouselItemInfoImpl carouselItemInfo, final Shape clipShape) {
        return LayoutModifierKt.layout($this$carouselItem, new AnonymousClass1(r9, state, index, carouselItemInfo, clipShape));
    }

    public static final float calculateCurrentScrollOffset(CarouselState state, Strategy strategy) {
        float itemSizeWithSpacing = strategy.getItemMainAxisSize() + strategy.getItemSpacing();
        float currentItemScrollOffset = (state.getPagerState$material3_release().getCurrentPage() * itemSizeWithSpacing) + (state.getPagerState$material3_release().getCurrentPageOffsetFraction() * itemSizeWithSpacing);
        return currentItemScrollOffset - KeylineSnapPositionKt.getSnapPositionOffset(strategy, state.getPagerState$material3_release().getCurrentPage(), state.getPagerState$material3_release().getPageCount());
    }

    public static final float calculateMaxScrollOffset(CarouselState state, Strategy strategy) {
        float itemCount = state.getPagerState$material3_release().getPageCount();
        float maxScrollPossible = (strategy.getItemMainAxisSize() * itemCount) + (strategy.getItemSpacing() * (itemCount - 1.0f));
        return RangesKt.coerceAtLeast(maxScrollPossible - strategy.getAvailableSpace(), 0.0f);
    }

    private static final float getProgress(Keyline before, Keyline after, float unadjustedOffset) {
        if (Intrinsics.areEqual(before, after) == false) goto L6;
        return 1.0f;
    L6:
        float total = after.getUnadjustedOffset() - before.getUnadjustedOffset();
        return (unadjustedOffset - before.getUnadjustedOffset()) / total;
    }
}
