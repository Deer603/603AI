package androidx.compose.material3.tokens;

import kotlin.Metadata;

/* JADX INFO: compiled from: MenuTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/tokens/MenuTokens;", "", "()V", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerElevation", "Landroidx/compose/ui/unit/Dp;", "getContainerElevation-D9Ej5fM", "()F", "F", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "FocusIndicatorColor", "getFocusIndicatorColor", "ListItemSelectedContainerColor", "getListItemSelectedContainerColor", "ListItemSelectedLabelTextColor", "getListItemSelectedLabelTextColor", "ListItemSelectedLeadingTrailingIconColor", "getListItemSelectedLeadingTrailingIconColor", "MenuListItemLeadingIconColor", "getMenuListItemLeadingIconColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenuTokens {
    public static final int $stable = 0;
    private static final ColorSchemeKeyTokens ContainerColor = null;
    private static final float ContainerElevation = 0.0f;
    private static final ShapeKeyTokens ContainerShape = null;
    private static final ColorSchemeKeyTokens FocusIndicatorColor = null;
    public static final MenuTokens INSTANCE = null;
    private static final ColorSchemeKeyTokens ListItemSelectedContainerColor = null;
    private static final ColorSchemeKeyTokens ListItemSelectedLabelTextColor = null;
    private static final ColorSchemeKeyTokens ListItemSelectedLeadingTrailingIconColor = null;
    private static final ColorSchemeKeyTokens MenuListItemLeadingIconColor = null;

    private MenuTokens() {
    }

    static {
        INSTANCE = new MenuTokens();
        ContainerColor = ColorSchemeKeyTokens.SurfaceContainer;
        ContainerElevation = ElevationTokens.INSTANCE.m3301getLevel2D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerExtraSmall;
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
        ListItemSelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
        ListItemSelectedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
        ListItemSelectedLeadingTrailingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
        MenuListItemLeadingIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3443getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedContainerColor() {
        return ListItemSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedLabelTextColor() {
        return ListItemSelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getListItemSelectedLeadingTrailingIconColor() {
        return ListItemSelectedLeadingTrailingIconColor;
    }

    public final ColorSchemeKeyTokens getMenuListItemLeadingIconColor() {
        return MenuListItemLeadingIconColor;
    }
}
