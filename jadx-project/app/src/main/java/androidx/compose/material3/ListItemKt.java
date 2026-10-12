package androidx.compose.material3;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a©\u0001\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001at\u0010'\u001a\u00020\u00172\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001aH\u0003¢\u0006\u0002\u0010-\u001a5\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001a\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aV\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020<2\u0006\u00107\u001a\u0002082\u0006\u00106\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aN\u0010G\u001a\u00020<*\u00020=2\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020<2\u0006\u0010M\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020Q*\u00020R2\u0006\u0010S\u001a\u00020<H\u0002\u001an\u0010T\u001a\u00020U*\u00020V2\u0006\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020<2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010\\\u001a\u0004\u0018\u00010Z2\b\u0010]\u001a\u0004\u0018\u00010Z2\b\u0010^\u001a\u0004\u0018\u00010Z2\u0006\u0010_\u001a\u00020Q2\u0006\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020<H\u0002\u001a\u0014\u0010c\u001a\u00020<*\u00020<2\u0006\u0010d\u001a\u00020<H\u0002\"\u001e\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0007\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\u001e\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\u0005\"\u001e\u0010\r\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u001e\u0010\u0010\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0005\"\u001e\u0010\u0013\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"LeadingContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "getLeadingContentEndPadding$annotations", "()V", "getLeadingContentEndPadding", "()F", "F", "ListItemEndPadding", "getListItemEndPadding$annotations", "getListItemEndPadding", "ListItemStartPadding", "getListItemStartPadding$annotations", "getListItemStartPadding", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "getListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "getListItemVerticalPadding$annotations", "getListItemVerticalPadding", "TrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "getTrailingContentStartPadding", "ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItemLayout", "leading", "trailing", "headline", "overline", "supporting", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ProvideTextStyleFromToken", "color", "Landroidx/compose/ui/graphics/Color;", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "content", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "verticalPadding", "listItemType", "Landroidx/compose/material3/ListItemType;", "verticalPadding-yh95HIg", "(I)F", "calculateHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "leadingHeight", "trailingHeight", "headlineHeight", "overlineHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I", "calculateWidth", "leadingWidth", "trailingWidth", "headlineWidth", "overlineWidth", "supportingWidth", "horizontalPadding", "calculateWidth-yeHjK3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I", "isSupportingMultilineHeuristic", "", "Landroidx/compose/ui/unit/Density;", "estimatedSupportingHeight", "place", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "width", "height", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "isThreeLine", "startPadding", "endPadding", "topPadding", "subtractConstraintSafely", "n", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListItemKt {
    private static final float LeadingContentEndPadding = 0.0f;
    private static final float ListItemEndPadding = 0.0f;
    private static final float ListItemStartPadding = 0.0f;
    private static final float ListItemThreeLineVerticalPadding = 0.0f;
    private static final float ListItemVerticalPadding = 0.0f;
    private static final float TrailingContentStartPadding = 0.0f;

    public static final /* synthetic */ void access$ListItemLayout(Function2 leading, Function2 trailing, Function2 headline, Function2 overline, Function2 supporting, Composer $composer, int $changed) {
        ListItemLayout(leading, trailing, headline, overline, supporting, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final /* synthetic */ void m2324access$ProvideTextStyleFromToken3JVO9M(long color, TypographyKeyTokens textToken, Function2 content, Composer $composer, int $changed) {
        m2323ProvideTextStyleFromToken3JVO9M(color, textToken, content, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final /* synthetic */ int m2325access$calculateHeightN4Jib3Y(IntrinsicMeasureScope $receiver, int leadingHeight, int trailingHeight, int headlineHeight, int overlineHeight, int supportingHeight, int listItemType, int verticalPadding, long constraints) {
        return m2328calculateHeightN4Jib3Y($receiver, leadingHeight, trailingHeight, headlineHeight, overlineHeight, supportingHeight, listItemType, verticalPadding, constraints);
    }

    /* JADX INFO: renamed from: access$calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final /* synthetic */ int m2326access$calculateWidthyeHjK3Y(IntrinsicMeasureScope $receiver, int leadingWidth, int trailingWidth, int headlineWidth, int overlineWidth, int supportingWidth, int horizontalPadding, long constraints) {
        return m2329calculateWidthyeHjK3Y($receiver, leadingWidth, trailingWidth, headlineWidth, overlineWidth, supportingWidth, horizontalPadding, constraints);
    }

    public static final /* synthetic */ boolean access$isSupportingMultilineHeuristic(Density $receiver, int estimatedSupportingHeight) {
        return isSupportingMultilineHeuristic($receiver, estimatedSupportingHeight);
    }

    public static final /* synthetic */ MeasureResult access$place(MeasureScope $receiver, int width, int height, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable headlinePlaceable, Placeable overlinePlaceable, Placeable supportingPlaceable, boolean isThreeLine, int startPadding, int endPadding, int topPadding) {
        return place($receiver, width, height, leadingPlaceable, trailingPlaceable, headlinePlaceable, overlinePlaceable, supportingPlaceable, isThreeLine, startPadding, endPadding, topPadding);
    }

    public static final /* synthetic */ int access$subtractConstraintSafely(int $receiver, int n) {
        return subtractConstraintSafely($receiver, n);
    }

    /* JADX INFO: renamed from: access$verticalPadding-yh95HIg, reason: not valid java name */
    public static final /* synthetic */ float m2327access$verticalPaddingyh95HIg(int listItemType) {
        return m2330verticalPaddingyh95HIg(listItemType);
    }

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX INFO: renamed from: ListItem-HXNGIdc, reason: not valid java name */
    public static final void m2322ListItemHXNGIdc(final Function2<? super Composer, ? super Integer, Unit> r35, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r37, Function2<? super Composer, ? super Integer, Unit> r38, Function2<? super Composer, ? super Integer, Unit> r39, Function2<? super Composer, ? super Integer, Unit> r40, ListItemColors colors, float tonalElevation, float shadowElevation, Composer $composer, final int $changed, final int r46) {
        Composer $composer2 = $composer.startRestartGroup(-1647707763);
        ComposerKt.sourceInformation($composer2, "C(ListItem)P(1,3,4,6,2,8!1,7:c#ui.unit.Dp,5:c#ui.unit.Dp)100@4555L8,104@4735L176,157@6562L5,162@6761L288,155@6438L611:ListItem.kt#uh7d8r");
        int $dirty = $changed;
        if ((r46 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r46 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r6 = r46 & 4;
        if (r6 == 0) goto L27;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r7 = r37;
    L34:
        int r8 = r46 & 8;
        if (r8 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r9 = r38;
    L45:
        int r12 = r46 & 16;
        if (r12 == 0) goto L49;
        $dirty = $dirty | 24576;
    L56:
        int r14 = r46 & 32;
        if (r14 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r15 = r40;
    L68:
        if (($changed & 1572864) != 0) goto L78;
        if ((r46 & 64) != 0) goto L75;
        if ($composer2.changed(colors) == false) goto L75;
        int r16 = 1048576;
    L76:
        $dirty = $dirty | r16;
    L75:
        r16 = 524288;
    L78:
        int r13 = r46 & 128;
        if (r13 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int r17 = r46 & 256;
        if (r17 == 0) goto L93;
        $dirty = $dirty | 100663296;
        float r18 = shadowElevation;
    L100:
        Composer $composer3 = $composer2;
        if (($dirty & 38347923) == 38347922) goto L103;
    L106:
        $composer3.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L115:
        if (r4 == 0) goto L117;
        modifier2 = Modifier.Companion;
    L117:
        if (r6 == 0) goto L119;
        r7 = null;
    L119:
        if (r8 == 0) goto L121;
        r9 = null;
    L121:
        if (r12 == 0) goto L123;
        Function2<? super Composer, ? super Integer, Unit> r0 = null;
    L124:
        if (r14 == 0) goto L126;
        Function2<? super Composer, ? super Integer, Unit> r5 = null;
    L128:
        if ((r46 & 64) == 0) goto L130;
        ListItemColors colors2 = ListItemDefaults.INSTANCE.m2320colorsJ08w3E(0, 0, 0, 0, 0, 0, 0, 0, 0, $composer3, 805306368, 511);
        $dirty = $dirty & (-3670017);
    L131:
        if (r13 == 0) goto L133;
        float tonalElevation2 = ListItemDefaults.INSTANCE.m2321getElevationD9Ej5fM();
    L134:
        if (r17 == 0) goto L136;
        float tonalElevation3 = tonalElevation2;
        float shadowElevation2 = ListItemDefaults.INSTANCE.m2321getElevationD9Ej5fM();
        final ListItemColors colors3 = colors2;
    L137:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventStart(-1647707763, $dirty, -1, "androidx.compose.material3.ListItem (ListItem.kt:103)");
    L140:
        final Function2 decoratedHeadlineContent = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new ListItemKt$ListItem$decoratedHeadlineContent$1(colors3, r35), $composer3, 54);
        $composer3.startReplaceGroup(1640970492);
        ComposerKt.sourceInformation($composer3, "*113@5021L204");
        if (r9 != null) goto L143;
        final Function2 leadingContent = null;
    L144:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(1640980724);
        ComposerKt.sourceInformation($composer3, "*123@5341L196");
        if (r7 != null) goto L147;
        final Function2 decoratedSupportingContent = null;
    L148:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(1640990750);
        ComposerKt.sourceInformation($composer3, "*133@5651L302");
        if (r0 != 0) goto L151;
        Function2 decoratedLeadingContent = null;
    L152:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(1641004177);
        ComposerKt.sourceInformation($composer3, "*144@6069L353");
        if (r5 != null) goto L155;
        Function2 decoratedTrailingContent = null;
    L156:
        $composer3.endReplaceGroup();
        final Function2 decoratedTrailingContent2 = decoratedTrailingContent;
        final Function2 decoratedLeadingContent2 = decoratedLeadingContent;
        Composer $composer4 = $composer3;
        SurfaceKt.m2670SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.Companion, true, ListItemKt$ListItem$1.INSTANCE).then(modifier2), ListItemDefaults.INSTANCE.getShape($composer3, 6), colors3.m2305containerColor0d7_KjU$material3_release(), colors3.m2315headlineColorvNxB06k$material3_release(true), tonalElevation3, shadowElevation2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new ListItemKt$ListItem$2(decoratedLeadingContent2, decoratedTrailingContent2, decoratedHeadlineContent, decoratedSupportingContent, leadingContent), $composer3, 54), $composer4, ((($dirty >> 9) & 57344) | 12582912) | (458752 & ($dirty >> 9)), 64);
        $composer3 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L159;
        ComposerKt.traceEventEnd();
    L159:
        final Function2<? super Composer, ? super Integer, Unit> r10 = r5;
        final Function2<? super Composer, ? super Integer, Unit> r3 = r7;
        final Function2<? super Composer, ? super Integer, Unit> r11 = r9;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation3 = shadowElevation2;
        final ListItemColors colors4 = colors3;
        final Modifier modifier3 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r19 = r0;
    L160:
        ScopeUpdateScope r110 = $composer3.endRestartGroup();
        if (r110 == null) goto L164;
        r110.updateScope(new ListItemKt$ListItem$3(r35, modifier3, r3, r11, r19, r10, colors4, tonalElevation4, shadowElevation3, $changed, r46));
        return;
    L164:
        return;
    L155:
        final Function2<? super Composer, ? super Integer, Unit> r1 = r5;
        decoratedTrailingContent = ComposableLambdaKt.rememberComposableLambda(1512306332, true, new ListItemKt$ListItem$decoratedTrailingContent$1$1(colors3, r1), $composer3, 54);
        goto L156
    L151:
        final Function2 it = r0;
        decoratedLeadingContent = ComposableLambdaKt.rememberComposableLambda(1400509200, true, new ListItemKt$ListItem$decoratedLeadingContent$1$1(colors3, it), $composer3, 54);
        goto L152
    L147:
        final Function2<? super Composer, ? super Integer, Unit> r20 = r7;
        decoratedSupportingContent = ComposableLambdaKt.rememberComposableLambda(-764441232, true, new ListItemKt$ListItem$decoratedOverlineContent$1$1(colors3, r20), $composer3, 54);
        goto L148
    L143:
        final Function2<? super Composer, ? super Integer, Unit> r111 = r9;
        leadingContent = ComposableLambdaKt.rememberComposableLambda(-1020860251, true, new ListItemKt$ListItem$decoratedSupportingContent$1$1(colors3, r111), $composer3, 54);
        goto L144
    L136:
        shadowElevation2 = shadowElevation;
        tonalElevation3 = tonalElevation2;
        colors3 = colors2;
        goto L137
    L133:
        tonalElevation2 = tonalElevation;
        goto L134
    L130:
        colors2 = colors;
        goto L131
    L126:
        r5 = r15;
        goto L128
    L123:
        r0 = r39;
        goto L124
    L109:
        if ($composer3.getDefaultsInvalid() == true) goto L115;
        $composer3.skipToGroupEnd();
        if ((r46 & 64) == 0) goto L114;
        $dirty = $dirty & (-3670017);
    L114:
        r0 = r39;
        colors3 = colors;
        tonalElevation3 = tonalElevation;
        shadowElevation2 = r18;
        r5 = r15;
        $composer3 = $composer3;
        goto L137
    L103:
        if ($composer3.getSkipping() == false) goto L106;
        $composer3.skipToGroupEnd();
        tonalElevation4 = tonalElevation;
        modifier3 = modifier2;
        r3 = r7;
        r11 = r9;
        shadowElevation3 = r18;
        r10 = r15;
        r19 = r39;
        colors4 = colors;
        goto L160
    L93:
        if (($changed & 100663296) != 0) goto L99;
        r18 = shadowElevation;
        if ($composer2.changed(r18) == false) goto L97;
        int r112 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r112;
        goto L100
    L97:
        r112 = 33554432;
        goto L98
    L99:
        r18 = shadowElevation;
        goto L100
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(tonalElevation) == false) goto L86;
        int r113 = 8388608;
    L87:
        $dirty = $dirty | r113;
        goto L89
    L86:
        r113 = 4194304;
        goto L87
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r15 = r40;
        if ($composer2.changedInstance(r15) == false) goto L64;
        int r114 = 131072;
    L65:
        $dirty = $dirty | r114;
        goto L68
    L64:
        r114 = 65536;
        goto L65
    L66:
        r15 = r40;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L56;
        if ($composer2.changedInstance(r39) == false) goto L53;
        int r115 = 16384;
    L54:
        $dirty = $dirty | r115;
        goto L56
    L53:
        r115 = 8192;
        goto L54
    L38:
        if (($changed & 3072) != 0) goto L44;
        r9 = r38;
        if ($composer2.changedInstance(r9) == false) goto L42;
        int r116 = 2048;
    L43:
        $dirty = $dirty | r116;
        goto L45
    L42:
        r116 = 1024;
        goto L43
    L44:
        r9 = r38;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r7 = r37;
        if ($composer2.changedInstance(r7) == false) goto L31;
        int r21 = 256;
    L32:
        $dirty = $dirty | r21;
        goto L34
    L31:
        r21 = 128;
        goto L32
    L33:
        r7 = r37;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r22 = 32;
    L21:
        $dirty = $dirty | r22;
        goto L23
    L20:
        r22 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r35) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L12
    L10:
        r23 = 2;
        goto L11
    }

    private static final void ListItemLayout(final Function2<? super Composer, ? super Integer, Unit> r26, final Function2<? super Composer, ? super Integer, Unit> r27, final Function2<? super Composer, ? super Integer, Unit> r28, final Function2<? super Composer, ? super Integer, Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2052297037);
        ComposerKt.sourceInformation($composer2, "C(ListItemLayout)P(1,4)181@7324L36,182@7365L261:ListItem.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r26) == false) goto L7;
        int r9 = 4;
    L8:
        $dirty = $dirty | r9;
        goto L10
    L7:
        r9 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r27) == false) goto L14;
        int r10 = 32;
    L15:
        $dirty = $dirty | r10;
        goto L17
    L14:
        r10 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r28) == false) goto L21;
        int r11 = 256;
    L22:
        $dirty = $dirty | r11;
        goto L24
    L21:
        r11 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r29) == false) goto L28;
        int r12 = 2048;
    L29:
        $dirty = $dirty | r12;
        goto L31
    L28:
        r12 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changedInstance(r30) == false) goto L35;
        int r13 = 16384;
    L36:
        $dirty = $dirty | r13;
        goto L38
    L35:
        r13 = 8192;
    L38:
        if (($dirty & 9363) != 9362) goto L44;
        if ($composer2.getSkipping() == false) goto L44;
        $composer2.skipToGroupEnd();
    L99:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L103;
        r14.updateScope(new AnonymousClass1(r26, r27, r28, r29, r30, $changed));
        return;
    L103:
        return;
    L44:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(2052297037, $dirty, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
    L46:
        ComposerKt.sourceInformationMarkerStart($composer2, -748109790, "CC(remember):ListItem.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L49;
        Object value$iv = new ListItemMeasurePolicy();
        $composer2.updateRememberedValue(value$iv);
    L50:
        ListItemMeasurePolicy measurePolicy = (ListItemMeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function2[] r15 = new Function2[5];
        r15[0] = r28;
        if (r29 != null) goto L53;
        Function2<? super Composer, ? super Integer, Unit> r16 = ComposableSingletons$ListItemKt.INSTANCE.m2093getLambda1$material3_release();
    L54:
        r15[1] = r16;
        if (r30 != null) goto L57;
        Function2<? super Composer, ? super Integer, Unit> r17 = ComposableSingletons$ListItemKt.INSTANCE.m2094getLambda2$material3_release();
    L58:
        r15[2] = r17;
        if (r26 != null) goto L61;
        Function2<? super Composer, ? super Integer, Unit> r18 = ComposableSingletons$ListItemKt.INSTANCE.m2095getLambda3$material3_release();
    L62:
        r15[3] = r18;
        if (r27 != null) goto L65;
        Function2<? super Composer, ? super Integer, Unit> r19 = ComposableSingletons$ListItemKt.INSTANCE.m2096getLambda4$material3_release();
    L66:
        r15[4] = r19;
        List contents$iv = CollectionsKt.listOf(r15);
        ComposerKt.sourceInformationMarkerStart($composer2, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
        Modifier modifier$iv = Modifier.Companion;
        Function2<Composer, Integer, Unit> r110 = LayoutKt.combineAsVirtualLayouts(contents$iv);
        ComposerKt.sourceInformationMarkerStart($composer2, -290761997, "CC(remember):Layout.kt#9igjgp");
        if (((384 & 896) ^ 384) <= 256) goto L71;
        if ($composer2.changed(measurePolicy) == false) goto L71;
    L72:
        boolean invalid$iv$iv = true;
    L74:
        Object it$iv$iv = $composer2.rememberedValue();
        if (invalid$iv$iv == false) goto L77;
    L80:
        Object value$iv$iv = MultiContentMeasurePolicyKt.createMeasurePolicy(measurePolicy);
        $composer2.updateRememberedValue(value$iv$iv);
    L81:
        MeasurePolicy measurePolicy$iv$iv = (MeasurePolicy) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv$iv = 384 & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L84;
        ComposablesKt.invalidApplier();
    L84:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L87;
        Function0<ComposeUiNode> r2 = r111;
        $composer2.createNode(r2);
    L88:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L95;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L95;
    L96:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        r110.invoke($composer2, Integer.valueOf(($changed$iv$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L99;
        ComposerKt.traceEventEnd();
    L95:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r3);
        goto L96
    L87:
        r2 = r111;
        $composer2.useNode();
        goto L88
    L77:
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L80;
        value$iv$iv = it$iv$iv;
    L71:
        if ((384 & 384) == 256) goto L72;
        invalid$iv$iv = false;
        goto L74
    L65:
        r19 = r27;
        goto L66
    L61:
        r18 = r26;
        goto L62
    L57:
        r17 = r30;
        goto L58
    L53:
        r16 = r29;
        goto L54
    L49:
        value$iv = it$iv;
        goto L50
    }

    /* JADX INFO: renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    private static final int m2329calculateWidthyeHjK3Y(IntrinsicMeasureScope $this$calculateWidth_u2dyeHjK3Y, int leadingWidth, int trailingWidth, int headlineWidth, int overlineWidth, int supportingWidth, int horizontalPadding, long constraints) {
        if (Constraints.m6922getHasBoundedWidthimpl(constraints) == true) goto L5;
        int mainContentWidth = Math.max(headlineWidth, Math.max(overlineWidth, supportingWidth));
        return ((horizontalPadding + leadingWidth) + mainContentWidth) + trailingWidth;
    L5:
        return Constraints.m6926getMaxWidthimpl(constraints);
    }

    /* JADX INFO: renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    private static final int m2328calculateHeightN4Jib3Y(IntrinsicMeasureScope $this$calculateHeight_u2dN4Jib3Y, int leadingHeight, int trailingHeight, int headlineHeight, int overlineHeight, int supportingHeight, int listItemType, int verticalPadding, long constraints) {
        if (ListItemType.m2335equalsimpl0(listItemType, ListItemType.Companion.m2340getOneLineAlXitO8()) == false) goto L6;
        float defaultMinHeight = ListTokens.INSTANCE.m3437getListItemOneLineContainerHeightD9Ej5fM();
    L9:
        int minHeight = Math.max(Constraints.m6927getMinHeightimpl(constraints), $this$calculateHeight_u2dN4Jib3Y.mo370roundToPx0680j_4(defaultMinHeight));
        int mainContentHeight = (headlineHeight + overlineHeight) + supportingHeight;
        return RangesKt.coerceAtMost(Math.max(minHeight, Math.max(leadingHeight, Math.max(mainContentHeight, trailingHeight)) + verticalPadding), Constraints.m6925getMaxHeightimpl(constraints));
    L6:
        if (ListItemType.m2335equalsimpl0(listItemType, ListItemType.Companion.m2342getTwoLineAlXitO8()) == false) goto L8;
        defaultMinHeight = ListTokens.INSTANCE.m3442getListItemTwoLineContainerHeightD9Ej5fM();
        goto L9
    L8:
        defaultMinHeight = ListTokens.INSTANCE.m3439getListItemThreeLineContainerHeightD9Ej5fM();
        goto L9
    }

    private static final MeasureResult place(MeasureScope $this$place, final int width, final int height, final Placeable leadingPlaceable, final Placeable trailingPlaceable, final Placeable headlinePlaceable, final Placeable overlinePlaceable, final Placeable supportingPlaceable, final boolean isThreeLine, final int startPadding, final int endPadding, final int topPadding) {
        return MeasureScope.layout$default($this$place, width, height, null, new C05341(leadingPlaceable, trailingPlaceable, startPadding, isThreeLine, topPadding, headlinePlaceable, overlinePlaceable, supportingPlaceable, height, width, endPadding), 4, null);
    }

    /* JADX INFO: renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    private static final void m2323ProvideTextStyleFromToken3JVO9M(final long color, final TypographyKeyTokens textToken, final Function2<? super Composer, ? super Integer, Unit> r16, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1133967795);
        ComposerKt.sourceInformation($composer2, "C(ProvideTextStyleFromToken)P(0:c#ui.graphics.Color,2)660@26959L5,658@26869L128:ListItem.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(color) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(textToken) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L23;
        Function2<? super Composer, ? super Integer, Unit> r4 = r16;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r5 = 256;
    L22:
        $dirty = $dirty | r5;
    L24:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) != 146) goto L31;
        if ($composer2.getSkipping() == false) goto L31;
        $composer2.skipToGroupEnd();
    L36:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L40;
        r6.updateScope(new ListItemKt$ProvideTextStyleFromToken$1(color, textToken, r16, $changed));
        return;
    L40:
        return;
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(1133967795, $dirty2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:658)");
    L33:
        Function2<? super Composer, ? super Integer, Unit> r9 = r4;
        ProvideContentColorTextStyleKt.m3029ProvideContentColorTextStyle3JVO9M(color, TypographyKt.getValue(textToken, $composer2, ($dirty2 >> 3) & 14), r9, $composer2, ($dirty2 & 14) | ($dirty2 & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
        goto L36
    L21:
        r5 = 128;
        goto L22
    L23:
        r4 = r16;
        goto L24
    }

    static {
        ListItemVerticalPadding = Dp.m6973constructorimpl(8);
        ListItemThreeLineVerticalPadding = Dp.m6973constructorimpl(12);
        ListItemStartPadding = Dp.m6973constructorimpl(16);
        ListItemEndPadding = Dp.m6973constructorimpl(16);
        LeadingContentEndPadding = Dp.m6973constructorimpl(16);
        TrailingContentStartPadding = Dp.m6973constructorimpl(16);
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    private static final boolean isSupportingMultilineHeuristic(Density $this$isSupportingMultilineHeuristic, int estimatedSupportingHeight) {
        if (estimatedSupportingHeight <= $this$isSupportingMultilineHeuristic.mo369roundToPxR2X_6o(TextUnitKt.getSp(30))) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    private static final float m2330verticalPaddingyh95HIg(int listItemType) {
        if (ListItemType.m2335equalsimpl0(listItemType, ListItemType.Companion.m2341getThreeLineAlXitO8()) == false) goto L6;
        return ListItemThreeLineVerticalPadding;
    L6:
        return ListItemVerticalPadding;
    }

    private static final int subtractConstraintSafely(int $this$subtractConstraintSafely, int n) {
        if ($this$subtractConstraintSafely != Integer.MAX_VALUE) goto L6;
        return $this$subtractConstraintSafely;
    L6:
        return $this$subtractConstraintSafely - n;
    }
}
