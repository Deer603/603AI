package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a¨\u0001\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%\u001a¦\u0001\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010'\u001a»\u0001\u0010(\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010$H\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u0094\u0001\u00101\u001a\u00020\u00112\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a¨\u0001\u00107\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%\u001a¦\u0001\u00107\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010'\u001a°\u0001\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010<\u001a\u0091\u0001\u0010=\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010?\u001a\u008f\u0001\u0010=\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010@\u001a°\u0001\u0010A\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010<\u001aÇ\u0001\u0010B\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010C\u001aÐ\u0001\u0010D\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020:2\b\u0010\u001f\u001a\u0004\u0018\u00010;2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010$H\u0003ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0091\u0001\u0010G\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010?\u001a\u008f\u0001\u0010G\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010@\u001a&\u0010H\u001a\u00020\u00012\b\b\u0002\u0010I\u001a\u00020\u00192\b\b\u0002\u0010J\u001a\u00020\u00192\b\b\u0002\u0010K\u001a\u00020\u0019H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "HorizontalElementsPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LabelLayoutId", "", "LeadingIconLayoutId", "SuggestionChipPadding", "TrailingIconLayoutId", "defaultSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSuggestionChipColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "AssistChip", "", "onClick", "Lkotlin/Function0;", ChipKt.LabelLayoutId, "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", ChipKt.LeadingIconLayoutId, ChipKt.TrailingIconLayoutId, "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "elevation", "Landroidx/compose/material3/ChipElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Chip", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "minHeight", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ChipContent", "avatar", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ElevatedAssistChip", "ElevatedFilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedSuggestionChip", "icon", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SuggestionChip", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ChipKt {
    private static final PaddingValues AssistChipPadding = null;
    private static final PaddingValues FilterChipPadding = null;
    private static final float HorizontalElementsPadding = 0.0f;
    private static final String LabelLayoutId = "label";
    private static final String LeadingIconLayoutId = "leadingIcon";
    private static final PaddingValues SuggestionChipPadding = null;
    private static final String TrailingIconLayoutId = "trailingIcon";

    /* JADX INFO: renamed from: access$Chip-nkUnTEs, reason: not valid java name */
    public static final /* synthetic */ void m2004access$ChipnkUnTEs(Modifier modifier, Function0 onClick, boolean enabled, Function2 label, TextStyle labelTextStyle, long labelColor, Function2 leadingIcon, Function2 trailingIcon, Shape shape, ChipColors colors, ChipElevation elevation, BorderStroke border, float minHeight, PaddingValues paddingValues, MutableInteractionSource interactionSource, Composer $composer, int $changed, int $changed1) {
        m2001ChipnkUnTEs(modifier, onClick, enabled, label, labelTextStyle, labelColor, leadingIcon, trailingIcon, shape, colors, elevation, border, minHeight, paddingValues, interactionSource, $composer, $changed, $changed1);
    }

    /* JADX INFO: renamed from: access$ChipContent-fe0OD_I, reason: not valid java name */
    public static final /* synthetic */ void m2005access$ChipContentfe0OD_I(Function2 label, TextStyle labelTextStyle, long labelColor, Function2 leadingIcon, Function2 avatar, Function2 trailingIcon, long leadingIconColor, long trailingIconColor, float minHeight, PaddingValues paddingValues, Composer $composer, int $changed) {
        m2002ChipContentfe0OD_I(label, labelTextStyle, labelColor, leadingIcon, avatar, trailingIcon, leadingIconColor, trailingIconColor, minHeight, paddingValues, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$SelectableChip-u0RnIRE, reason: not valid java name */
    public static final /* synthetic */ void m2006access$SelectableChipu0RnIRE(boolean selected, Modifier modifier, Function0 onClick, boolean enabled, Function2 label, TextStyle labelTextStyle, Function2 leadingIcon, Function2 avatar, Function2 trailingIcon, Shape shape, SelectableChipColors colors, SelectableChipElevation elevation, BorderStroke border, float minHeight, PaddingValues paddingValues, MutableInteractionSource interactionSource, Composer $composer, int $changed, int $changed1) {
        m2003SelectableChipu0RnIRE(selected, modifier, onClick, enabled, label, labelTextStyle, leadingIcon, avatar, trailingIcon, shape, colors, elevation, border, minHeight, paddingValues, interactionSource, $composer, $changed, $changed1);
    }

    public static final /* synthetic */ float access$getHorizontalElementsPadding$p() {
        return HorizontalElementsPadding;
    }

    public static final void AssistChip(final Function0<Unit> r34, final Function2<? super Composer, ? super Integer, Unit> r35, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r38, Function2<? super Composer, ? super Integer, Unit> r39, Shape shape, ChipColors colors, ChipElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r48) {
        Composer $composer2 = $composer.startRestartGroup(313450168);
        ComposerKt.sourceInformation($composer2, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)126@6277L5,127@6328L18,128@6399L21,129@6469L25,137@6729L5,132@6561L541:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r48 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r48 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r13 = r35;
    L24:
        int r3 = r48 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L35:
        int r7 = r48 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r9 = enabled;
    L46:
        int r10 = r48 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r15 = r38;
    L57:
        int r16 = r48 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r4 = r39;
    L69:
        if (($changed & 1572864) != 0) goto L80;
        if ((r48 & 64) != 0) goto L76;
        if ($composer2.changed(shape) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
    L76:
        r18 = 524288;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipColors colors2 = colors;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r48 & 256) != 0) goto L98;
        if ($composer2.changed(elevation) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
    L98:
        r19 = 33554432;
    L102:
        if (($changed & 805306368) != 0) goto L112;
        if ((r48 & 512) != 0) goto L109;
        if ($composer2.changed(border) == false) goto L109;
        int r110 = 536870912;
    L110:
        $dirty = $dirty | r110;
    L109:
        r110 = 268435456;
    L112:
        int $dirty1 = $changed1;
        int $dirty2 = r48 & 1024;
        if ($dirty2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty3 = $dirty1;
        int $dirty4 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L126;
    L131:
        $composer2.startDefaults();
        int $dirty5 = $dirty3;
        if (($changed & 1) != 0) goto L134;
    L150:
        if (r3 == 0) goto L152;
        Modifier.Companion modifier2 = Modifier.Companion;
    L153:
        if (r7 == 0) goto L155;
        boolean enabled2 = true;
    L156:
        if (r10 == 0) goto L158;
        r15 = null;
    L158:
        if (r16 == 0) goto L160;
        Function2<? super Composer, ? super Integer, Unit> r17 = null;
    L162:
        if ((r48 & 64) == 0) goto L164;
        int $dirty6 = $dirty4 & (-3670017);
        Shape shape2 = AssistChipDefaults.INSTANCE.getShape($composer2, 6);
    L166:
        if ((r48 & 128) == 0) goto L168;
        ChipColors colors3 = AssistChipDefaults.INSTANCE.assistChipColors($composer2, 6);
        int $dirty7 = $dirty6 & (-29360129);
    L170:
        if ((r48 & 256) == 0) goto L172;
        int r11 = 6;
        $dirty7 = $dirty7 & (-234881025);
        ChipElevation elevation2 = AssistChipDefaults.INSTANCE.m1911assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
    L174:
        if ((r48 & 512) == 0) goto L176;
        boolean enabled3 = enabled2;
        BorderStroke border2 = AssistChipDefaults.INSTANCE.m1909assistChipBorderh1eTWw(enabled3, 0, 0, 0.0f, $composer2, (($dirty7 >> 9) & 14) | 24576, 14);
        $dirty7 = $dirty7 & (-1879048193);
    L177:
        if ($dirty2 == 0) goto L179;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        Function2<? super Composer, ? super Integer, Unit> r22 = r15;
        ChipElevation elevation3 = elevation2;
        colors2 = colors3;
        int $dirty8 = $dirty7;
        Modifier modifier3 = modifier2;
        Function2<? super Composer, ? super Integer, Unit> r23 = r17;
        Shape shape3 = shape2;
    L180:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L183;
        ComposerKt.traceEventStart(313450168, $dirty8, $dirty5, "androidx.compose.material3.AssistChip (Chip.kt:132)");
    L183:
        boolean enabled4 = enabled3;
        ChipColors colors4 = colors2;
        Composer $composer3 = $composer2;
        m2001ChipnkUnTEs(modifier3, r34, enabled4, r13, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), $composer2, r11), colors2.m1992labelColorvNxB06k$material3_release(enabled3), r22, r23, shape3, colors4, elevation3, border3, AssistChipDefaults.INSTANCE.m1914getHeightD9Ej5fM(), AssistChipPadding, interactionSource2, $composer3, (((((((($dirty8 >> 6) & 14) | (($dirty8 << 3) & 112)) | (($dirty8 >> 3) & 896)) | (($dirty8 << 6) & 7168)) | (($dirty8 << 6) & 3670016)) | (($dirty8 << 6) & 29360128)) | (($dirty8 << 6) & 234881024)) | (($dirty8 << 6) & 1879048192), (((($dirty8 >> 24) & 14) | 3456) | (($dirty8 >> 24) & 112)) | (($dirty5 << 12) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L186;
        ComposerKt.traceEventEnd();
    L186:
        final Modifier modifier4 = modifier3;
        final boolean enabled5 = enabled4;
        final Function2<? super Composer, ? super Integer, Unit> r5 = r22;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r23;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty9 = $dirty8;
    L187:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L191;
        r1.updateScope(new AnonymousClass1(r34, r35, modifier4, enabled5, r5, r8, shape4, colors5, elevation4, border4, interactionSource3, $changed, $changed1, r48));
        return;
    L191:
        return;
    L179:
        interactionSource2 = interactionSource;
        border3 = border2;
        r22 = r15;
        elevation3 = elevation2;
        colors2 = colors3;
        $dirty8 = $dirty7;
        modifier3 = modifier2;
        r23 = r17;
        shape3 = shape2;
        goto L180
    L176:
        enabled3 = enabled2;
        border2 = border;
        goto L177
    L172:
        r11 = 6;
        elevation2 = elevation;
        goto L174
    L168:
        colors3 = colors2;
        $dirty7 = $dirty6;
        goto L170
    L164:
        shape2 = shape;
        $dirty6 = $dirty4;
        goto L166
    L160:
        r17 = r4;
        goto L162
    L155:
        enabled2 = r9;
        goto L156
    L152:
        modifier2 = r6;
        goto L153
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L150;
        $composer2.skipToGroupEnd();
        if ((r48 & 64) == 0) goto L139;
        int $dirty10 = $dirty4 & (-3670017);
    L141:
        if ((r48 & 128) == 0) goto L144;
        $dirty10 = $dirty10 & (-29360129);
    L144:
        if ((r48 & 256) == 0) goto L147;
        $dirty10 = $dirty10 & (-234881025);
    L147:
        if ((r48 & 512) == 0) goto L149;
        $dirty10 = $dirty10 & (-1879048193);
    L149:
        shape3 = shape;
        elevation3 = elevation;
        border3 = border;
        interactionSource2 = interactionSource;
        $dirty8 = $dirty10;
        r11 = 6;
        r23 = r4;
        enabled3 = r9;
        r22 = r15;
        $dirty5 = $dirty5;
        modifier3 = r6;
        goto L180
    L139:
        $dirty10 = $dirty4;
        goto L141
    L126:
        if (($dirty3 & 3) != 2) goto L131;
        if ($composer2.getSkipping() == false) goto L131;
        $composer2.skipToGroupEnd();
        shape4 = shape;
        border4 = border;
        interactionSource3 = interactionSource;
        $dirty5 = $dirty3;
        modifier4 = r6;
        $composer3 = $composer2;
        r8 = r4;
        colors5 = colors2;
        enabled5 = r9;
        r5 = r15;
        elevation4 = elevation;
        $dirty9 = $dirty4;
        goto L187
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(interactionSource) == false) goto L120;
        int r21 = 4;
    L121:
        $dirty1 = $dirty1 | r21;
        goto L123
    L120:
        r21 = 2;
        goto L121
    L82:
        if ((r48 & 128) != 0) goto L86;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L87;
        int r111 = 8388608;
    L88:
        $dirty = $dirty | r111;
    L87:
        r111 = 4194304;
        goto L88
    L86:
        colors2 = colors;
        goto L87
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r4 = r39;
        if ($composer2.changedInstance(r4) == false) goto L65;
        int r112 = 131072;
    L66:
        $dirty = $dirty | r112;
        goto L69
    L65:
        r112 = 65536;
        goto L66
    L67:
        r4 = r39;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r15 = r38;
        if ($composer2.changedInstance(r15) == false) goto L54;
        int r113 = 16384;
    L55:
        $dirty = $dirty | r113;
        goto L57
    L54:
        r113 = 8192;
        goto L55
    L56:
        r15 = r38;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        r9 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L32;
        int r14 = 256;
    L33:
        $dirty = $dirty | r14;
        goto L35
    L32:
        r14 = 128;
        goto L33
    L34:
        r6 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r35;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L24
    L21:
        r20 = 16;
        goto L22
    L23:
        r13 = r35;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changedInstance(r34) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L14
    L10:
        r24 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final /* synthetic */ void AssistChip(final Function0 onClick, final Function2 label, Modifier modifier, boolean enabled, Function2 leadingIcon, Function2 trailingIcon, Shape shape, ChipColors colors, ChipElevation elevation, ChipBorder border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r48) {
        Composer $composer2 = $composer.startRestartGroup(-1932300596);
        ComposerKt.sourceInformation($composer2, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)213@10395L5,214@10446L18,215@10517L21,216@10585L18,217@10655L39,224@10872L5,219@10704L571:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r48 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r48 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2 r13 = label;
    L24:
        int r3 = r48 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L35:
        int r8 = r48 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r10 = r48 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2 leadingIcon2 = leadingIcon;
    L57:
        int r16 = r48 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2 r4 = trailingIcon;
    L69:
        if (($changed & 1572864) != 0) goto L80;
        if ((r48 & 64) != 0) goto L76;
        if ($composer2.changed(shape) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
    L76:
        r18 = 524288;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipColors colors2 = colors;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r48 & 256) != 0) goto L98;
        if ($composer2.changed(elevation) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
    L98:
        r19 = 33554432;
    L102:
        if (($changed & 805306368) != 0) goto L112;
        if ((r48 & 512) != 0) goto L109;
        if ($composer2.changed(border) == false) goto L109;
        int r110 = 536870912;
    L110:
        $dirty = $dirty | r110;
    L109:
        r110 = 268435456;
    L112:
        int $dirty1 = $changed1;
        int $dirty2 = r48 & 1024;
        if ($dirty2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty3 = $dirty1;
        int $dirty4 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L126;
    L131:
        $composer2.startDefaults();
        int $dirty5 = $dirty3;
        if (($changed & 1) != 0) goto L134;
    L150:
        if (r3 == 0) goto L152;
        Modifier.Companion modifier2 = Modifier.Companion;
    L153:
        if (r8 == 0) goto L155;
        boolean enabled3 = true;
    L156:
        if (r10 == 0) goto L158;
        leadingIcon2 = null;
    L158:
        if (r16 == 0) goto L160;
        Function2 trailingIcon2 = null;
    L162:
        if ((r48 & 64) == 0) goto L164;
        int $dirty6 = $dirty4 & (-3670017);
        Shape shape2 = AssistChipDefaults.INSTANCE.getShape($composer2, 6);
    L166:
        if ((r48 & 128) == 0) goto L168;
        ChipColors colors3 = AssistChipDefaults.INSTANCE.assistChipColors($composer2, 6);
        int $dirty7 = $dirty6 & (-29360129);
    L170:
        if ((r48 & 256) == 0) goto L172;
        Composer $composer3 = $composer2;
        int r11 = 6;
        $dirty7 = $dirty7 & (-234881025);
        ChipElevation elevation2 = AssistChipDefaults.INSTANCE.m1911assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
    L174:
        if ((r48 & 512) == 0) goto L176;
        $composer2 = $composer3;
        ChipBorder border2 = AssistChipDefaults.INSTANCE.m1908assistChipBorderd_3_b6Q(0, 0, 0.0f, $composer2, 3072, 7);
        $dirty7 = $dirty7 & (-1879048193);
    L177:
        if ($dirty2 == 0) goto L183;
        ComposerKt.sourceInformationMarkerStart($composer2, 267303551, "CC(remember):Chip.kt#9igjgp");
        Composer $this$cache$iv = $composer2;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L181;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
    L182:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) value$iv;
        ChipElevation elevation3 = elevation2;
        enabled2 = enabled3;
        colors2 = colors3;
        int $dirty8 = $dirty7;
        Function2 leadingIcon3 = leadingIcon2;
        Function2 trailingIcon3 = trailingIcon2;
        Shape shape3 = shape2;
        Modifier modifier3 = modifier2;
    L184:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L187;
        ComposerKt.traceEventStart(-1932300596, $dirty8, $dirty5, "androidx.compose.material3.AssistChip (Chip.kt:219)");
    L187:
        TextStyle r111 = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), $composer2, r11);
        long r20 = colors2.m1992labelColorvNxB06k$material3_release(enabled2);
        $composer2.startReplaceGroup(267317901);
        ComposerKt.sourceInformation($composer2, "231@11104L21");
        if (border2 != null) goto L190;
        State<BorderStroke> r5 = null;
    L191:
        $composer2.endReplaceGroup();
        if (r5 == null) goto L194;
        BorderStroke r7 = r5.getValue();
    L195:
        ChipColors colors4 = colors2;
        Composer $composer4 = $composer2;
        boolean enabled4 = enabled2;
        m2001ChipnkUnTEs(modifier3, onClick, enabled4, r13, r111, r20, leadingIcon3, trailingIcon3, shape3, colors4, elevation3, r7, AssistChipDefaults.INSTANCE.m1914getHeightD9Ej5fM(), AssistChipPadding, interactionSource2, $composer4, (((((((($dirty8 >> 6) & 14) | (($dirty8 << 3) & 112)) | (($dirty8 >> 3) & 896)) | (($dirty8 << 6) & 7168)) | (($dirty8 << 6) & 3670016)) | (($dirty8 << 6) & 29360128)) | (($dirty8 << 6) & 234881024)) | (($dirty8 << 6) & 1879048192), ((($dirty8 >> 24) & 14) | 3456) | (($dirty5 << 12) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L198;
        ComposerKt.traceEventEnd();
    L198:
        final ChipBorder border3 = border2;
        final Modifier modifier4 = modifier3;
        final boolean enabled5 = enabled4;
        final Function2 leadingIcon4 = leadingIcon3;
        final Function2 trailingIcon4 = trailingIcon3;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty9 = $dirty8;
    L199:
        ScopeUpdateScope r1 = $composer4.endRestartGroup();
        if (r1 == null) goto L203;
        r1.updateScope(new AnonymousClass3(onClick, label, modifier4, enabled5, leadingIcon4, trailingIcon4, shape4, colors5, elevation4, border3, interactionSource3, $changed, $changed1, r48));
        return;
    L203:
        return;
    L194:
        r7 = null;
        goto L195
    L190:
        r5 = border2.borderStroke$material3_release(enabled2, $composer2, (($dirty8 >> 9) & 14) | (($dirty8 >> 24) & 112));
        goto L191
    L181:
        value$iv = it$iv;
        goto L182
    L183:
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        enabled2 = enabled3;
        colors2 = colors3;
        $dirty8 = $dirty7;
        leadingIcon3 = leadingIcon2;
        trailingIcon3 = trailingIcon2;
        shape3 = shape2;
        modifier3 = modifier2;
        goto L184
    L176:
        $composer2 = $composer3;
        border2 = border;
        goto L177
    L172:
        r11 = 6;
        $composer3 = $composer2;
        elevation2 = elevation;
        goto L174
    L168:
        colors3 = colors2;
        $dirty7 = $dirty6;
        goto L170
    L164:
        shape2 = shape;
        $dirty6 = $dirty4;
        goto L166
    L160:
        trailingIcon2 = r4;
        goto L162
    L155:
        enabled3 = enabled2;
        goto L156
    L152:
        modifier2 = r6;
        goto L153
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L150;
        $composer2.skipToGroupEnd();
        if ((r48 & 64) == 0) goto L139;
        int $dirty10 = $dirty4 & (-3670017);
    L141:
        if ((r48 & 128) == 0) goto L144;
        $dirty10 = $dirty10 & (-29360129);
    L144:
        if ((r48 & 256) == 0) goto L147;
        $dirty10 = $dirty10 & (-234881025);
    L147:
        if ((r48 & 512) == 0) goto L149;
        $dirty10 = $dirty10 & (-1879048193);
    L149:
        shape3 = shape;
        elevation3 = elevation;
        border2 = border;
        interactionSource2 = interactionSource;
        r11 = 6;
        trailingIcon3 = r4;
        leadingIcon3 = leadingIcon2;
        $dirty8 = $dirty10;
        modifier3 = r6;
        $dirty5 = $dirty5;
        goto L184
    L139:
        $dirty10 = $dirty4;
        goto L141
    L126:
        if (($dirty3 & 3) != 2) goto L131;
        if ($composer2.getSkipping() == false) goto L131;
        $composer2.skipToGroupEnd();
        border3 = border;
        interactionSource3 = interactionSource;
        $dirty5 = $dirty3;
        colors5 = colors2;
        modifier4 = r6;
        $composer4 = $composer2;
        leadingIcon4 = leadingIcon2;
        shape4 = shape;
        $dirty9 = $dirty4;
        trailingIcon4 = r4;
        enabled5 = enabled2;
        elevation4 = elevation;
        goto L199
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(interactionSource) == false) goto L120;
        int r21 = 4;
    L121:
        $dirty1 = $dirty1 | r21;
        goto L123
    L120:
        r21 = 2;
        goto L121
    L82:
        if ((r48 & 128) != 0) goto L86;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L87;
        int r112 = 8388608;
    L88:
        $dirty = $dirty | r112;
    L87:
        r112 = 4194304;
        goto L88
    L86:
        colors2 = colors;
        goto L87
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r4 = trailingIcon;
        if ($composer2.changedInstance(r4) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L69
    L65:
        r17 = 65536;
        goto L66
    L67:
        r4 = trailingIcon;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        leadingIcon2 = leadingIcon;
        if ($composer2.changedInstance(leadingIcon2) == false) goto L54;
        int r113 = 16384;
    L55:
        $dirty = $dirty | r113;
        goto L57
    L54:
        r113 = 8192;
        goto L55
    L56:
        leadingIcon2 = leadingIcon;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        r6 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = label;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r14 = 32;
    L22:
        $dirty = $dirty | r14;
        goto L24
    L21:
        r14 = 16;
        goto L22
    L23:
        r13 = label;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changedInstance(onClick) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L14
    L10:
        r15 = 2;
        goto L11
    }

    public static final void ElevatedAssistChip(final Function0<Unit> r34, final Function2<? super Composer, ? super Integer, Unit> r35, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r38, Function2<? super Composer, ? super Integer, Unit> r39, Shape shape, ChipColors colors, ChipElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r48) {
        Composer $composer2 = $composer.startRestartGroup(1594789934);
        ComposerKt.sourceInformation($composer2, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)289@14186L5,290@14237L26,291@14316L29,300@14613L5,295@14445L541:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r48 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r48 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r13 = r35;
    L24:
        int r3 = r48 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L35:
        int r7 = r48 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r10 = r48 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r15 = r38;
    L57:
        int r16 = r48 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r4 = r39;
    L69:
        if (($changed & 1572864) != 0) goto L80;
        if ((r48 & 64) != 0) goto L76;
        if ($composer2.changed(shape) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
    L76:
        r18 = 524288;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipColors colors2 = colors;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        if ((r48 & 256) != 0) goto L98;
        if ($composer2.changed(elevation) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
    L98:
        r19 = 33554432;
    L101:
        int $dirty1 = $changed1;
        int $dirty2 = r48 & 512;
        if ($dirty2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r48 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty3 = $dirty1;
        int $dirty4 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L126;
    L131:
        $composer2.startDefaults();
        int $dirty5 = $dirty3;
        if (($changed & 1) != 0) goto L134;
    L147:
        if (r3 == 0) goto L149;
        Modifier.Companion modifier2 = Modifier.Companion;
    L150:
        if (r7 == 0) goto L152;
        boolean enabled3 = true;
    L153:
        if (r10 == 0) goto L155;
        r15 = null;
    L155:
        if (r16 == 0) goto L157;
        Function2<? super Composer, ? super Integer, Unit> r17 = null;
    L159:
        if ((r48 & 64) == 0) goto L161;
        int $dirty6 = $dirty4 & (-3670017);
        Shape shape2 = AssistChipDefaults.INSTANCE.getShape($composer2, 6);
    L163:
        if ((r48 & 128) == 0) goto L165;
        ChipColors colors3 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors($composer2, 6);
        int $dirty7 = $dirty6 & (-29360129);
    L167:
        if ((r48 & 256) == 0) goto L169;
        int r11 = 6;
        ChipElevation elevation2 = AssistChipDefaults.INSTANCE.m1913elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        $dirty7 = $dirty7 & (-234881025);
    L170:
        if ($dirty2 == 0) goto L172;
        BorderStroke border2 = null;
    L173:
        if (r2 == 0) goto L175;
        ChipElevation elevation3 = elevation2;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        Function2<? super Composer, ? super Integer, Unit> r22 = r15;
        enabled2 = enabled3;
        colors2 = colors3;
        int $dirty8 = $dirty7;
        Modifier modifier3 = modifier2;
        Function2<? super Composer, ? super Integer, Unit> r23 = r17;
        Shape shape3 = shape2;
    L176:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L179;
        ComposerKt.traceEventStart(1594789934, $dirty8, $dirty5, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:295)");
    L179:
        ChipColors colors4 = colors2;
        Composer $composer3 = $composer2;
        boolean enabled4 = enabled2;
        m2001ChipnkUnTEs(modifier3, r34, enabled4, r13, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), $composer2, r11), colors2.m1992labelColorvNxB06k$material3_release(enabled2), r22, r23, shape3, colors4, elevation3, border3, AssistChipDefaults.INSTANCE.m1914getHeightD9Ej5fM(), AssistChipPadding, interactionSource2, $composer3, (((((((($dirty8 >> 6) & 14) | (($dirty8 << 3) & 112)) | (($dirty8 >> 3) & 896)) | (($dirty8 << 6) & 7168)) | (($dirty8 << 6) & 3670016)) | (($dirty8 << 6) & 29360128)) | (($dirty8 << 6) & 234881024)) | (($dirty8 << 6) & 1879048192), (((($dirty8 >> 24) & 14) | 3456) | (($dirty8 >> 24) & 112)) | (($dirty5 << 12) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L182;
        ComposerKt.traceEventEnd();
    L182:
        final Modifier modifier4 = modifier3;
        final boolean enabled5 = enabled4;
        final Function2<? super Composer, ? super Integer, Unit> r5 = r22;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r23;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty9 = $dirty8;
    L183:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L187;
        r1.updateScope(new C04881(r34, r35, modifier4, enabled5, r5, r8, shape4, colors5, elevation4, border4, interactionSource3, $changed, $changed1, r48));
        return;
    L187:
        return;
    L175:
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        border3 = border2;
        r22 = r15;
        enabled2 = enabled3;
        colors2 = colors3;
        $dirty8 = $dirty7;
        modifier3 = modifier2;
        r23 = r17;
        shape3 = shape2;
        goto L176
    L172:
        border2 = border;
        goto L173
    L169:
        r11 = 6;
        elevation2 = elevation;
        goto L170
    L165:
        colors3 = colors2;
        $dirty7 = $dirty6;
        goto L167
    L161:
        shape2 = shape;
        $dirty6 = $dirty4;
        goto L163
    L157:
        r17 = r4;
        goto L159
    L152:
        enabled3 = enabled2;
        goto L153
    L149:
        modifier2 = r6;
        goto L150
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L147;
        $composer2.skipToGroupEnd();
        if ((r48 & 64) == 0) goto L139;
        int $dirty10 = $dirty4 & (-3670017);
    L141:
        if ((r48 & 128) == 0) goto L144;
        $dirty10 = $dirty10 & (-29360129);
    L144:
        if ((r48 & 256) == 0) goto L146;
        $dirty10 = $dirty10 & (-234881025);
    L146:
        shape3 = shape;
        elevation3 = elevation;
        border3 = border;
        interactionSource2 = interactionSource;
        $dirty8 = $dirty10;
        r11 = 6;
        r23 = r4;
        $dirty5 = $dirty5;
        r22 = r15;
        modifier3 = r6;
        goto L176
    L139:
        $dirty10 = $dirty4;
        goto L141
    L126:
        if (($dirty3 & 3) != 2) goto L131;
        if ($composer2.getSkipping() == false) goto L131;
        $composer2.skipToGroupEnd();
        shape4 = shape;
        border4 = border;
        interactionSource3 = interactionSource;
        $dirty5 = $dirty3;
        modifier4 = r6;
        $composer3 = $composer2;
        r8 = r4;
        colors5 = colors2;
        enabled5 = enabled2;
        r5 = r15;
        elevation4 = elevation;
        $dirty9 = $dirty4;
        goto L183
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(interactionSource) == false) goto L120;
        int r24 = 4;
    L121:
        $dirty1 = $dirty1 | r24;
        goto L123
    L120:
        r24 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(border) == false) goto L109;
        int r21 = 536870912;
    L110:
        $dirty = $dirty | r21;
        goto L112
    L109:
        r21 = 268435456;
        goto L110
    L82:
        if ((r48 & 128) != 0) goto L86;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L87;
        int r110 = 8388608;
    L88:
        $dirty = $dirty | r110;
    L87:
        r110 = 4194304;
        goto L88
    L86:
        colors2 = colors;
        goto L87
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r4 = r39;
        if ($composer2.changedInstance(r4) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
        goto L69
    L65:
        r111 = 65536;
        goto L66
    L67:
        r4 = r39;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r15 = r38;
        if ($composer2.changedInstance(r15) == false) goto L54;
        int r112 = 16384;
    L55:
        $dirty = $dirty | r112;
        goto L57
    L54:
        r112 = 8192;
        goto L55
    L56:
        r15 = r38;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        r6 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r35;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r14 = 32;
    L22:
        $dirty = $dirty | r14;
        goto L24
    L21:
        r14 = 16;
        goto L22
    L23:
        r13 = r35;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changedInstance(r34) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L14
    L10:
        r20 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final /* synthetic */ void ElevatedAssistChip(final Function0 onClick, final Function2 label, Modifier modifier, boolean enabled, Function2 leadingIcon, Function2 trailingIcon, Shape shape, ChipColors colors, ChipElevation elevation, ChipBorder border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r48) {
        Composer $composer2 = $composer.startRestartGroup(1295844802);
        ComposerKt.sourceInformation($composer2, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)375@18287L5,376@18338L26,377@18417L29,379@18530L39,386@18746L5,381@18578L571:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r48 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r48 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2 r13 = label;
    L24:
        int r3 = r48 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L35:
        int r7 = r48 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r10 = r48 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2 leadingIcon2 = leadingIcon;
    L57:
        int r16 = r48 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2 r4 = trailingIcon;
    L69:
        if (($changed & 1572864) != 0) goto L80;
        if ((r48 & 64) != 0) goto L76;
        if ($composer2.changed(shape) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
    L76:
        r18 = 524288;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipColors colors2 = colors;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        if ((r48 & 256) != 0) goto L98;
        if ($composer2.changed(elevation) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r19;
    L98:
        r19 = 33554432;
    L101:
        int $dirty1 = $changed1;
        int $dirty2 = r48 & 512;
        if ($dirty2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int r2 = r48 & 1024;
        if (r2 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty3 = $dirty1;
        int $dirty4 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L126;
    L131:
        $composer2.startDefaults();
        int $dirty5 = $dirty3;
        if (($changed & 1) != 0) goto L134;
    L147:
        if (r3 == 0) goto L149;
        Modifier.Companion modifier2 = Modifier.Companion;
    L150:
        if (r7 == 0) goto L152;
        boolean enabled3 = true;
    L153:
        if (r10 == 0) goto L155;
        leadingIcon2 = null;
    L155:
        if (r16 == 0) goto L157;
        Function2 trailingIcon2 = null;
    L159:
        if ((r48 & 64) == 0) goto L161;
        int $dirty6 = $dirty4 & (-3670017);
        Shape shape2 = AssistChipDefaults.INSTANCE.getShape($composer2, 6);
    L163:
        if ((r48 & 128) == 0) goto L165;
        ChipColors colors3 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors($composer2, 6);
        int $dirty7 = $dirty6 & (-29360129);
    L167:
        if ((r48 & 256) == 0) goto L169;
        int r11 = 6;
        ChipElevation elevation2 = AssistChipDefaults.INSTANCE.m1913elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        $dirty7 = $dirty7 & (-234881025);
    L170:
        if ($dirty2 == 0) goto L172;
        ChipBorder border2 = null;
    L173:
        if (r2 == 0) goto L179;
        ComposerKt.sourceInformationMarkerStart($composer2, 1551989929, "CC(remember):Chip.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L177;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L178:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ChipElevation elevation3 = elevation2;
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) value$iv;
        Function2 leadingIcon3 = leadingIcon2;
        enabled2 = enabled3;
        colors2 = colors3;
        int $dirty8 = $dirty7;
        Modifier modifier3 = modifier2;
        Function2 trailingIcon3 = trailingIcon2;
        Shape shape3 = shape2;
    L180:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L183;
        ComposerKt.traceEventStart(1295844802, $dirty8, $dirty5, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:381)");
    L183:
        TextStyle r110 = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), $composer2, r11);
        long r20 = colors2.m1992labelColorvNxB06k$material3_release(enabled2);
        float r28 = AssistChipDefaults.INSTANCE.m1914getHeightD9Ej5fM();
        PaddingValues r29 = AssistChipPadding;
        $composer2.startReplaceGroup(1552007127);
        ComposerKt.sourceInformation($composer2, "395@19068L21");
        if (border2 != null) goto L186;
        State<BorderStroke> r5 = null;
    L187:
        $composer2.endReplaceGroup();
        if (r5 == null) goto L190;
        BorderStroke r8 = r5.getValue();
    L191:
        ChipColors colors4 = colors2;
        Composer $composer3 = $composer2;
        boolean enabled4 = enabled2;
        m2001ChipnkUnTEs(modifier3, onClick, enabled4, r13, r110, r20, leadingIcon3, trailingIcon3, shape3, colors4, elevation3, r8, r28, r29, interactionSource2, $composer3, (((((((($dirty8 >> 6) & 14) | (($dirty8 << 3) & 112)) | (($dirty8 >> 3) & 896)) | (($dirty8 << 6) & 7168)) | (($dirty8 << 6) & 3670016)) | (($dirty8 << 6) & 29360128)) | (($dirty8 << 6) & 234881024)) | (($dirty8 << 6) & 1879048192), ((($dirty8 >> 24) & 14) | 3456) | (($dirty5 << 12) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L194;
        ComposerKt.traceEventEnd();
    L194:
        final ChipBorder border3 = border2;
        final Modifier modifier4 = modifier3;
        final boolean enabled5 = enabled4;
        final Function2 leadingIcon4 = leadingIcon3;
        final Function2 trailingIcon4 = trailingIcon3;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty9 = $dirty8;
    L195:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L199;
        r1.updateScope(new C04893(onClick, label, modifier4, enabled5, leadingIcon4, trailingIcon4, shape4, colors5, elevation4, border3, interactionSource3, $changed, $changed1, r48));
        return;
    L199:
        return;
    L190:
        r8 = null;
        goto L191
    L186:
        r5 = border2.borderStroke$material3_release(enabled2, $composer2, (($dirty8 >> 9) & 14) | (($dirty8 >> 24) & 112));
        goto L187
    L177:
        value$iv = it$iv;
        goto L178
    L179:
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        leadingIcon3 = leadingIcon2;
        enabled2 = enabled3;
        colors2 = colors3;
        $dirty8 = $dirty7;
        modifier3 = modifier2;
        trailingIcon3 = trailingIcon2;
        shape3 = shape2;
        goto L180
    L172:
        border2 = border;
        goto L173
    L169:
        r11 = 6;
        elevation2 = elevation;
        goto L170
    L165:
        colors3 = colors2;
        $dirty7 = $dirty6;
        goto L167
    L161:
        shape2 = shape;
        $dirty6 = $dirty4;
        goto L163
    L157:
        trailingIcon2 = r4;
        goto L159
    L152:
        enabled3 = enabled2;
        goto L153
    L149:
        modifier2 = r6;
        goto L150
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L147;
        $composer2.skipToGroupEnd();
        if ((r48 & 64) == 0) goto L139;
        int $dirty10 = $dirty4 & (-3670017);
    L141:
        if ((r48 & 128) == 0) goto L144;
        $dirty10 = $dirty10 & (-29360129);
    L144:
        if ((r48 & 256) == 0) goto L146;
        $dirty10 = $dirty10 & (-234881025);
    L146:
        shape3 = shape;
        elevation3 = elevation;
        interactionSource2 = interactionSource;
        $dirty8 = $dirty10;
        r11 = 6;
        trailingIcon3 = r4;
        $dirty5 = $dirty5;
        border2 = border;
        leadingIcon3 = leadingIcon2;
        modifier3 = r6;
        goto L180
    L139:
        $dirty10 = $dirty4;
        goto L141
    L126:
        if (($dirty3 & 3) != 2) goto L131;
        if ($composer2.getSkipping() == false) goto L131;
        $composer2.skipToGroupEnd();
        shape4 = shape;
        border3 = border;
        interactionSource3 = interactionSource;
        $dirty5 = $dirty3;
        modifier4 = r6;
        $composer3 = $composer2;
        trailingIcon4 = r4;
        colors5 = colors2;
        enabled5 = enabled2;
        leadingIcon4 = leadingIcon2;
        elevation4 = elevation;
        $dirty9 = $dirty4;
        goto L195
    L116:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(interactionSource) == false) goto L120;
        int r22 = 4;
    L121:
        $dirty1 = $dirty1 | r22;
        goto L123
    L120:
        r22 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(border) == false) goto L109;
        int r21 = 536870912;
    L110:
        $dirty = $dirty | r21;
        goto L112
    L109:
        r21 = 268435456;
        goto L110
    L82:
        if ((r48 & 128) != 0) goto L86;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L87;
        int r111 = 8388608;
    L88:
        $dirty = $dirty | r111;
    L87:
        r111 = 4194304;
        goto L88
    L86:
        colors2 = colors;
        goto L87
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r4 = trailingIcon;
        if ($composer2.changedInstance(r4) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L69
    L65:
        r17 = 65536;
        goto L66
    L67:
        r4 = trailingIcon;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        leadingIcon2 = leadingIcon;
        if ($composer2.changedInstance(leadingIcon2) == false) goto L54;
        int r112 = 16384;
    L55:
        $dirty = $dirty | r112;
        goto L57
    L54:
        r112 = 8192;
        goto L55
    L56:
        leadingIcon2 = leadingIcon;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L46
    L43:
        r12 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        r6 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = label;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r14 = 32;
    L22:
        $dirty = $dirty | r14;
        goto L24
    L21:
        r14 = 16;
        goto L22
    L23:
        r13 = label;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changedInstance(onClick) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L14
    L10:
        r15 = 2;
        goto L11
    }

    public static final void FilterChip(final boolean selected, final Function0<Unit> r42, final Function2<? super Composer, ? super Integer, Unit> r43, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r46, Function2<? super Composer, ? super Integer, Unit> r47, Shape shape, SelectableChipColors colors, SelectableChipElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r56) {
        Composer $composer2 = $composer.startRestartGroup(-1711985619);
        ComposerKt.sourceInformation($composer2, "C(FilterChip)P(9,8,5,7,3,6,11,10,1,2)462@22511L5,463@22572L18,464@22653L21,465@22723L35,474@23031L5,468@22824L554:Chip.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r56 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r11 = selected;
    L14:
        if ((r56 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r12 = r42;
    L25:
        if ((r56 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r14 = r43;
    L35:
        int r3 = r56 & 8;
        if (r3 == 0) goto L39;
        $dirty = $dirty | 3072;
        Modifier r9 = modifier;
    L46:
        int r10 = r56 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r4 = enabled;
    L57:
        int r16 = r56 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r5 = r46;
    L68:
        int r18 = r56 & 64;
        if (r18 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r6 = r47;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        Shape r7 = shape;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r56 & 256) != 0) goto L98;
        if ($composer2.changed(colors) == false) goto L98;
        int r21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r21;
    L98:
        r21 = 33554432;
    L102:
        if (($changed & 805306368) != 0) goto L113;
        if ((r56 & 512) != 0) goto L109;
        if ($composer2.changed(elevation) == false) goto L109;
        int r22 = 536870912;
    L110:
        $dirty = $dirty | r22;
    L109:
        r22 = 268435456;
    L113:
        if (($changed1 & 6) != 0) goto L123;
        if ((r56 & 1024) != 0) goto L120;
        if ($composer2.changed(border) == false) goto L120;
        int r17 = 4;
    L121:
        $dirty1 = $dirty1 | r17;
    L120:
        r17 = 2;
    L123:
        int $dirty2 = $dirty1;
        int $dirty3 = r56 & 2048;
        if ($dirty3 == 0) goto L127;
        int $dirty4 = $dirty2 | 48;
        MutableInteractionSource r2 = interactionSource;
    L134:
        int $dirty5 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L137;
    L142:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L145;
    L161:
        if (r3 == 0) goto L163;
        Modifier.Companion modifier2 = Modifier.Companion;
    L164:
        if (r10 == 0) goto L166;
        boolean enabled2 = true;
    L167:
        if (r16 == 0) goto L169;
        Function2<? super Composer, ? super Integer, Unit> r35 = null;
    L170:
        if (r18 == 0) goto L172;
        Function2<? super Composer, ? super Integer, Unit> r36 = null;
    L174:
        if ((r56 & 128) == 0) goto L176;
        int $dirty6 = $dirty5 & (-29360129);
        Shape shape2 = FilterChipDefaults.INSTANCE.getShape($composer2, 6);
    L178:
        if ((r56 & 256) == 0) goto L180;
        SelectableChipColors colors2 = FilterChipDefaults.INSTANCE.filterChipColors($composer2, 6);
        int $dirty7 = $dirty6 & (-234881025);
    L182:
        if ((r56 & 512) == 0) goto L184;
        int $dirty8 = 6;
        SelectableChipElevation elevation2 = FilterChipDefaults.INSTANCE.m2239filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        int $dirty9 = $dirty7 & (-1879048193);
    L186:
        if ((r56 & 1024) == 0) goto L188;
        boolean enabled3 = enabled2;
        BorderStroke border2 = FilterChipDefaults.INSTANCE.m2237filterChipBorder_7El2pE(enabled3, r11, 0, 0, 0, 0, 0.0f, 0.0f, $composer2, ((($dirty9 >> 12) & 14) | 100663296) | (($dirty9 << 3) & 112), 252);
        $dirty4 = $dirty4 & (-15);
    L189:
        if ($dirty3 == 0) goto L191;
        SelectableChipElevation elevation3 = elevation2;
        int $dirty10 = $dirty9;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        boolean enabled4 = enabled3;
        int $dirty11 = $dirty4;
        Function2<? super Composer, ? super Integer, Unit> r23 = r35;
        Function2<? super Composer, ? super Integer, Unit> r24 = r36;
        Shape shape3 = shape2;
        SelectableChipColors colors3 = colors2;
        Modifier modifier3 = modifier2;
    L192:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L195;
        ComposerKt.traceEventStart(-1711985619, $dirty10, $dirty11, "androidx.compose.material3.FilterChip (Chip.kt:468)");
    L195:
        Composer $composer3 = $composer2;
        m2003SelectableChipu0RnIRE(selected, modifier3, r12, enabled4, r14, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), $composer2, $dirty8), r23, null, r24, shape3, colors3, elevation3, border3, FilterChipDefaults.INSTANCE.m2240getHeightD9Ej5fM(), FilterChipPadding, interactionSource2, $composer3, (((((((($dirty10 & 14) | 12582912) | (($dirty10 >> 6) & 112)) | (($dirty10 << 3) & 896)) | (($dirty10 >> 3) & 7168)) | (($dirty10 << 6) & 57344)) | (($dirty10 << 3) & 3670016)) | (($dirty10 << 6) & 234881024)) | (($dirty10 << 6) & 1879048192), ((((($dirty10 >> 24) & 14) | 27648) | (($dirty10 >> 24) & 112)) | (($dirty11 << 6) & 896)) | (($dirty11 << 12) & 458752));
        if (ComposerKt.isTraceInProgress() == false) goto L198;
        ComposerKt.traceEventEnd();
    L198:
        final Modifier modifier4 = modifier3;
        final boolean enabled5 = enabled4;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r23;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r24;
        final Shape shape4 = shape3;
        final SelectableChipColors colors4 = colors3;
        final SelectableChipElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L199:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L203;
        r0.updateScope(new C04931(selected, r42, r43, modifier4, enabled5, r8, r13, shape4, colors4, elevation4, border4, interactionSource3, $changed, $changed1, r56));
        return;
    L203:
        return;
    L191:
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        $dirty10 = $dirty9;
        border3 = border2;
        enabled4 = enabled3;
        $dirty11 = $dirty4;
        r23 = r35;
        r24 = r36;
        shape3 = shape2;
        colors3 = colors2;
        modifier3 = modifier2;
        goto L192
    L188:
        enabled3 = enabled2;
        border2 = border;
        goto L189
    L184:
        $dirty8 = 6;
        elevation2 = elevation;
        $dirty9 = $dirty7;
        goto L186
    L180:
        colors2 = colors;
        $dirty7 = $dirty6;
        goto L182
    L176:
        $dirty6 = $dirty5;
        shape2 = r7;
        goto L178
    L172:
        r36 = r6;
        goto L174
    L169:
        r35 = r5;
        goto L170
    L166:
        enabled2 = r4;
        goto L167
    L163:
        modifier2 = r9;
        goto L164
    L145:
        if ($composer2.getDefaultsInvalid() == true) goto L161;
        $composer2.skipToGroupEnd();
        if ((r56 & 128) == 0) goto L150;
        int $dirty12 = $dirty5 & (-29360129);
    L152:
        if ((r56 & 256) == 0) goto L155;
        $dirty12 = $dirty12 & (-234881025);
    L155:
        if ((r56 & 512) == 0) goto L158;
        $dirty12 = $dirty12 & (-1879048193);
    L158:
        if ((r56 & 1024) == 0) goto L160;
        $dirty11 = $dirty4 & (-15);
        $dirty10 = $dirty12;
        $dirty8 = 6;
        colors3 = colors;
        elevation3 = elevation;
        border3 = border;
        interactionSource2 = r2;
        enabled4 = r4;
        r23 = r5;
        r24 = r6;
        shape3 = r7;
        modifier3 = r9;
        goto L192
    L160:
        $dirty10 = $dirty12;
        $dirty8 = 6;
        colors3 = colors;
        elevation3 = elevation;
        border3 = border;
        interactionSource2 = r2;
        enabled4 = r4;
        r23 = r5;
        r24 = r6;
        shape3 = r7;
        modifier3 = r9;
        $dirty11 = $dirty4;
        goto L192
    L150:
        $dirty12 = $dirty5;
        goto L152
    L137:
        if (($dirty4 & 19) != 18) goto L142;
        if ($composer2.getSkipping() == false) goto L142;
        $composer2.skipToGroupEnd();
        elevation4 = elevation;
        border4 = border;
        interactionSource3 = r2;
        $composer3 = $composer2;
        shape4 = r7;
        r13 = r6;
        r8 = r5;
        enabled5 = r4;
        modifier4 = r9;
        colors4 = colors;
        goto L199
    L127:
        if (($changed1 & 48) != 0) goto L133;
        r2 = interactionSource;
        if ($composer2.changed(r2) == false) goto L131;
        int r19 = 32;
    L132:
        $dirty4 = $dirty2 | r19;
        goto L134
    L131:
        r19 = 16;
        goto L132
    L133:
        r2 = interactionSource;
        $dirty4 = $dirty2;
        goto L134
    L82:
        if ((r56 & 128) != 0) goto L86;
        r7 = shape;
        if ($composer2.changed(r7) == false) goto L87;
        int r25 = 8388608;
    L88:
        $dirty = $dirty | r25;
    L87:
        r25 = 4194304;
        goto L88
    L86:
        r7 = shape;
        goto L87
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r6 = r47;
        if ($composer2.changedInstance(r6) == false) goto L76;
        int r20 = 1048576;
    L77:
        $dirty = $dirty | r20;
        goto L80
    L76:
        r20 = 524288;
        goto L77
    L78:
        r6 = r47;
        goto L80
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r5 = r46;
        if ($composer2.changedInstance(r5) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L67:
        r5 = r46;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r4 = enabled;
        if ($composer2.changed(r4) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L57
    L54:
        r111 = 8192;
        goto L55
    L56:
        r4 = enabled;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = modifier;
        if ($composer2.changed(r9) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
        goto L46
    L43:
        r15 = 1024;
        goto L44
    L45:
        r9 = modifier;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r14 = r43;
        if ($composer2.changedInstance(r14) == false) goto L32;
        int r26 = 256;
    L33:
        $dirty = $dirty | r26;
        goto L35
    L32:
        r26 = 128;
        goto L33
    L34:
        r14 = r43;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r12 = r42;
        if ($composer2.changedInstance(r12) == false) goto L21;
        int r27 = 32;
    L22:
        $dirty = $dirty | r27;
        goto L25
    L21:
        r27 = 16;
        goto L22
    L23:
        r12 = r42;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = selected;
        if ($composer2.changed(r11) == false) goto L10;
        int r28 = 4;
    L11:
        $dirty = $dirty | r28;
        goto L14
    L10:
        r28 = 2;
        goto L11
    L12:
        r11 = selected;
        goto L14
    }

    public static final void ElevatedFilterChip(final boolean selected, final Function0<Unit> r37, final Function2<? super Composer, ? super Integer, Unit> r38, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r41, Function2<? super Composer, ? super Integer, Unit> r42, Shape shape, SelectableChipColors colors, SelectableChipElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r51) {
        Composer $composer2 = $composer.startRestartGroup(-106647389);
        ComposerKt.sourceInformation($composer2, "C(ElevatedFilterChip)P(9,8,5,7,3,6,11,10,1,2)546@26622L5,547@26683L26,548@26772L29,558@27108L5,552@26901L554:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r51 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r51 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r12 = r37;
    L25:
        if ((r51 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r14 = r38;
    L35:
        int r3 = r51 & 8;
        if (r3 == 0) goto L39;
        $dirty = $dirty | 3072;
        Modifier r9 = modifier;
    L46:
        int r10 = r51 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r4 = enabled;
    L57:
        int r16 = r51 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r5 = r41;
    L68:
        int r18 = r51 & 64;
        if (r18 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r6 = r42;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        Shape r7 = shape;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r51 & 256) != 0) goto L98;
        if ($composer2.changed(colors) == false) goto L98;
        int r23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r23;
    L98:
        r23 = 33554432;
    L102:
        if (($changed & 805306368) != 0) goto L112;
        if ((r51 & 512) != 0) goto L109;
        if ($composer2.changed(elevation) == false) goto L109;
        int r24 = 536870912;
    L110:
        $dirty = $dirty | r24;
    L109:
        r24 = 268435456;
    L112:
        int $dirty1 = r51 & 1024;
        if ($dirty1 == 0) goto L117;
        int $dirty2 = $changed1 | 6;
    L124:
        int r2 = r51 & 2048;
        if (r2 == 0) goto L128;
        $dirty2 = $dirty2 | 48;
    L135:
        int $dirty3 = $dirty2;
        int $dirty4 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L138;
    L143:
        $composer2.startDefaults();
        int $dirty5 = $dirty3;
        if (($changed & 1) != 0) goto L146;
    L159:
        if (r3 == 0) goto L161;
        Modifier.Companion modifier2 = Modifier.Companion;
    L162:
        if (r10 == 0) goto L164;
        boolean enabled2 = true;
    L165:
        if (r16 == 0) goto L167;
        Function2<? super Composer, ? super Integer, Unit> r17 = null;
    L168:
        if (r18 == 0) goto L170;
        Function2<? super Composer, ? super Integer, Unit> r19 = null;
    L172:
        if ((r51 & 128) == 0) goto L174;
        int $dirty6 = $dirty4 & (-29360129);
        Shape shape2 = FilterChipDefaults.INSTANCE.getShape($composer2, 6);
    L176:
        if ((r51 & 256) == 0) goto L178;
        SelectableChipColors colors2 = FilterChipDefaults.INSTANCE.elevatedFilterChipColors($composer2, 6);
        int $dirty7 = $dirty6 & (-234881025);
    L180:
        if ((r51 & 512) == 0) goto L182;
        int r11 = 6;
        SelectableChipElevation elevation2 = FilterChipDefaults.INSTANCE.m2236elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        $dirty7 = $dirty7 & (-1879048193);
    L183:
        if ($dirty1 == 0) goto L185;
        BorderStroke border2 = null;
    L186:
        if (r2 == 0) goto L188;
        SelectableChipElevation elevation3 = elevation2;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        Function2<? super Composer, ? super Integer, Unit> r22 = r17;
        Function2<? super Composer, ? super Integer, Unit> r25 = r19;
        boolean enabled3 = enabled2;
        int $dirty8 = $dirty7;
        int r8 = -106647389;
        SelectableChipColors colors3 = colors2;
        Shape shape3 = shape2;
        Modifier modifier3 = modifier2;
    L189:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L192;
        ComposerKt.traceEventStart(r8, $dirty8, $dirty5, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:552)");
    L192:
        Composer $composer3 = $composer2;
        m2003SelectableChipu0RnIRE(selected, modifier3, r12, enabled3, r14, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), $composer2, r11), r22, null, r25, shape3, colors3, elevation3, border3, FilterChipDefaults.INSTANCE.m2240getHeightD9Ej5fM(), FilterChipPadding, interactionSource2, $composer3, (((((((($dirty8 & 14) | 12582912) | (($dirty8 >> 6) & 112)) | (($dirty8 << 3) & 896)) | (($dirty8 >> 3) & 7168)) | (($dirty8 << 6) & 57344)) | (3670016 & ($dirty8 << 3))) | (($dirty8 << 6) & 234881024)) | (($dirty8 << 6) & 1879048192), ((((($dirty8 >> 24) & 14) | 27648) | (($dirty8 >> 24) & 112)) | (($dirty5 << 6) & 896)) | (($dirty5 << 12) & 458752));
        if (ComposerKt.isTraceInProgress() == false) goto L195;
        ComposerKt.traceEventEnd();
    L195:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r22;
        final Function2<? super Composer, ? super Integer, Unit> r15 = r25;
        final Shape shape4 = shape3;
        final SelectableChipColors colors4 = colors3;
        final SelectableChipElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L196:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L200;
        r1.updateScope(new C04901(selected, r37, r38, modifier4, enabled4, r13, r15, shape4, colors4, elevation4, border4, interactionSource3, $changed, $changed1, r51));
        return;
    L200:
        return;
    L188:
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        border3 = border2;
        r22 = r17;
        r25 = r19;
        enabled3 = enabled2;
        $dirty8 = $dirty7;
        r8 = -106647389;
        colors3 = colors2;
        shape3 = shape2;
        modifier3 = modifier2;
        goto L189
    L185:
        border2 = border;
        goto L186
    L182:
        r11 = 6;
        elevation2 = elevation;
        goto L183
    L178:
        colors2 = colors;
        $dirty7 = $dirty6;
        goto L180
    L174:
        $dirty6 = $dirty4;
        shape2 = r7;
        goto L176
    L170:
        r19 = r6;
        goto L172
    L167:
        r17 = r5;
        goto L168
    L164:
        enabled2 = r4;
        goto L165
    L161:
        modifier2 = r9;
        goto L162
    L146:
        if ($composer2.getDefaultsInvalid() == true) goto L159;
        $composer2.skipToGroupEnd();
        if ((r51 & 128) == 0) goto L151;
        int $dirty9 = $dirty4 & (-29360129);
    L153:
        if ((r51 & 256) == 0) goto L156;
        $dirty9 = $dirty9 & (-234881025);
    L156:
        if ((r51 & 512) == 0) goto L158;
        $dirty9 = $dirty9 & (-1879048193);
    L158:
        colors3 = colors;
        elevation3 = elevation;
        border3 = border;
        interactionSource2 = interactionSource;
        $dirty8 = $dirty9;
        r11 = 6;
        r22 = r5;
        r25 = r6;
        shape3 = r7;
        modifier3 = r9;
        $dirty5 = $dirty5;
        r8 = -106647389;
        enabled3 = r4;
        goto L189
    L151:
        $dirty9 = $dirty4;
        goto L153
    L138:
        if (($dirty3 & 19) != 18) goto L143;
        if ($composer2.getSkipping() == false) goto L143;
        $composer2.skipToGroupEnd();
        elevation4 = elevation;
        border4 = border;
        interactionSource3 = interactionSource;
        $dirty5 = $dirty3;
        $composer3 = $composer2;
        shape4 = r7;
        r15 = r6;
        r13 = r5;
        enabled4 = r4;
        modifier4 = r9;
        colors4 = colors;
        goto L196
    L128:
        if (($changed1 & 48) != 0) goto L135;
        if ($composer2.changed(interactionSource) == false) goto L132;
        int r110 = 32;
    L133:
        $dirty2 = $dirty2 | r110;
        goto L135
    L132:
        r110 = 16;
        goto L133
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty2 = $changed1;
        goto L124
    L119:
        if ($composer2.changed(border) == false) goto L121;
        int r111 = 4;
    L122:
        $dirty2 = $changed1 | r111;
        goto L124
    L121:
        r111 = 2;
        goto L122
    L82:
        if ((r51 & 128) != 0) goto L86;
        r7 = shape;
        if ($composer2.changed(r7) == false) goto L87;
        int r26 = 8388608;
    L88:
        $dirty = $dirty | r26;
    L87:
        r26 = 4194304;
        goto L88
    L86:
        r7 = shape;
        goto L87
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r6 = r42;
        if ($composer2.changedInstance(r6) == false) goto L76;
        int r20 = 1048576;
    L77:
        $dirty = $dirty | r20;
        goto L80
    L76:
        r20 = 524288;
        goto L77
    L78:
        r6 = r42;
        goto L80
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r5 = r41;
        if ($composer2.changedInstance(r5) == false) goto L65;
        int r112 = 131072;
    L66:
        $dirty = $dirty | r112;
        goto L68
    L65:
        r112 = 65536;
        goto L66
    L67:
        r5 = r41;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r4 = enabled;
        if ($composer2.changed(r4) == false) goto L54;
        int r113 = 16384;
    L55:
        $dirty = $dirty | r113;
        goto L57
    L54:
        r113 = 8192;
        goto L55
    L56:
        r4 = enabled;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = modifier;
        if ($composer2.changed(r9) == false) goto L43;
        int r114 = 2048;
    L44:
        $dirty = $dirty | r114;
        goto L46
    L43:
        r114 = 1024;
        goto L44
    L45:
        r9 = modifier;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r14 = r38;
        if ($composer2.changedInstance(r14) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L35
    L32:
        r21 = 128;
        goto L33
    L34:
        r14 = r38;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r12 = r37;
        if ($composer2.changedInstance(r12) == false) goto L21;
        int r27 = 32;
    L22:
        $dirty = $dirty | r27;
        goto L25
    L21:
        r27 = 16;
        goto L22
    L23:
        r12 = r37;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(selected) == false) goto L10;
        int r28 = 4;
    L11:
        $dirty = $dirty | r28;
        goto L14
    L10:
        r28 = 2;
        goto L11
    }

    public static final void InputChip(final boolean selected, final Function0<Unit> r42, final Function2<? super Composer, ? super Integer, Unit> r43, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r46, Function2<? super Composer, ? super Integer, Unit> r47, Function2<? super Composer, ? super Integer, Unit> r48, Shape shape, SelectableChipColors colors, SelectableChipElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int r57) {
        Composer $composer2 = $composer.startRestartGroup(1658928131);
        ComposerKt.sourceInformation($composer2, "C(InputChip)P(10,9,6,8,4,7!1,12,11,2,3)638@30882L5,639@30942L17,640@31021L20,641@31089L34,671@32220L5,665@32014L745:Chip.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r57 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r12 = selected;
    L14:
        if ((r57 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r13 = r42;
    L25:
        if ((r57 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L35:
        int r16 = r57 & 8;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        Modifier r5 = modifier;
    L46:
        int r17 = r57 & 16;
        if (r17 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean r6 = enabled;
    L57:
        int r19 = r57 & 32;
        if (r19 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r7 = r46;
    L68:
        int r21 = r57 & 64;
        if (r21 == 0) goto L72;
        $dirty = $dirty | 1572864;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r47;
    L79:
        int r10 = r57 & 128;
        if (r10 == 0) goto L83;
        $dirty = $dirty | 12582912;
        Function2<? super Composer, ? super Integer, Unit> r11 = r48;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r57 & 256) != 0) goto L98;
        if ($composer2.changed(shape) == false) goto L98;
        int r25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r25;
    L98:
        r25 = 33554432;
    L102:
        if (($changed & 805306368) != 0) goto L113;
        if ((r57 & 512) != 0) goto L109;
        if ($composer2.changed(colors) == false) goto L109;
        int r26 = 536870912;
    L110:
        $dirty = $dirty | r26;
    L109:
        r26 = 268435456;
    L113:
        if (($changed1 & 6) != 0) goto L124;
        if ((r57 & 1024) != 0) goto L120;
        if ($composer2.changed(elevation) == false) goto L120;
        int r18 = 4;
    L121:
        $dirty1 = $dirty1 | r18;
    L120:
        r18 = 2;
    L124:
        if (($changed1 & 48) != 0) goto L134;
        if ((r57 & 2048) != 0) goto L131;
        if ($composer2.changed(border) == false) goto L131;
        int r20 = 32;
    L132:
        $dirty1 = $dirty1 | r20;
    L131:
        r20 = 16;
    L134:
        int r4 = r57 & 4096;
        if (r4 == 0) goto L138;
        $dirty1 = $dirty1 | 384;
    L145:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L148;
    L153:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L156;
    L172:
        if (r16 == 0) goto L174;
        Modifier.Companion modifier2 = Modifier.Companion;
    L175:
        if (r17 == 0) goto L177;
        boolean enabled2 = true;
    L178:
        if (r19 == 0) goto L180;
        Function2<? super Composer, ? super Integer, Unit> r33 = null;
    L181:
        if (r21 == 0) goto L183;
        Function2<? super Composer, ? super Integer, Unit> r34 = null;
    L184:
        if (r10 == 0) goto L186;
        Function2<? super Composer, ? super Integer, Unit> r35 = null;
    L188:
        if ((r57 & 256) == 0) goto L190;
        int $dirty3 = $dirty2 & (-234881025);
        Shape shape2 = InputChipDefaults.INSTANCE.getShape($composer2, 6);
    L192:
        if ((r57 & 512) == 0) goto L194;
        SelectableChipColors colors2 = InputChipDefaults.INSTANCE.inputChipColors($composer2, 6);
        int $dirty4 = $dirty3 & (-1879048193);
    L196:
        if ((r57 & 1024) == 0) goto L198;
        int r39 = r4;
        int $dirty5 = 6;
        SelectableChipElevation elevation2 = InputChipDefaults.INSTANCE.m2293inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
        $dirty1 = $dirty1 & (-15);
    L200:
        if ((r57 & 2048) == 0) goto L202;
        BorderStroke border2 = InputChipDefaults.INSTANCE.m2291inputChipBorder_7El2pE(enabled2, r12, 0, 0, 0, 0, 0.0f, 0.0f, $composer2, ((($dirty4 >> 12) & 14) | 100663296) | (($dirty4 << 3) & 112), 252);
        $dirty1 = $dirty1 & (-113);
    L203:
        if (r39 == 0) goto L205;
        SelectableChipElevation elevation3 = elevation2;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        boolean enabled3 = enabled2;
        Function2<? super Composer, ? super Integer, Unit> r22 = r33;
        r8 = r34;
        Function2<? super Composer, ? super Integer, Unit> r24 = r35;
        Shape shape3 = shape2;
        SelectableChipColors colors3 = colors2;
        int $dirty6 = $dirty4;
        Modifier modifier3 = modifier2;
    L206:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L209;
        ComposerKt.traceEventStart(1658928131, $dirty6, $dirty1, "androidx.compose.material3.InputChip (Chip.kt:643)");
    L209:
        $composer2.startReplaceGroup(417920884);
        ComposerKt.sourceInformation($composer2, "649@31531L5,651@31584L419");
        boolean r9 = true;
        if (r8 == null) goto L215;
        if (enabled3 == false) goto L213;
        final float avatarOpacity = 1.0f;
    L214:
        final Shape avatarShape = ShapesKt.getValue(InputChipTokens.INSTANCE.getAvatarShape(), $composer2, $dirty5);
        Function2 shapedAvatar = ComposableLambdaKt.rememberComposableLambda(1154227507, true, new C04941(avatarOpacity, avatarShape, r8), $composer2, 54);
        Function2 shapedAvatar2 = shapedAvatar;
    L216:
        $composer2.endReplaceGroup();
        TextStyle r23 = TypographyKt.getValue(InputChipTokens.INSTANCE.getLabelTextFont(), $composer2, $dirty5);
        float r29 = InputChipDefaults.INSTANCE.m2289getHeightD9Ej5fM();
        if (shapedAvatar2 == null) goto L219;
        boolean r14 = true;
    L220:
        if (r22 == null) goto L222;
        boolean r15 = true;
    L223:
        if (r24 != null) goto L226;
        r9 = false;
    L226:
        Composer $composer3 = $composer2;
        m2003SelectableChipu0RnIRE(selected, modifier3, r13, enabled3, r43, r23, r22, shapedAvatar2, r24, shape3, colors3, elevation3, border3, r29, inputChipPadding(r14, r15, r9), interactionSource2, $composer3, ((((((($dirty6 & 14) | (($dirty6 >> 6) & 112)) | (($dirty6 << 3) & 896)) | (($dirty6 >> 3) & 7168)) | (($dirty6 << 6) & 57344)) | (($dirty6 << 3) & 3670016)) | (($dirty6 << 3) & 234881024)) | (($dirty6 << 3) & 1879048192), ((((($dirty6 >> 27) & 14) | 3072) | (($dirty1 << 3) & 112)) | (($dirty1 << 3) & 896)) | (($dirty1 << 9) & 458752));
        if (ComposerKt.isTraceInProgress() == false) goto L229;
        ComposerKt.traceEventEnd();
    L229:
        final Function2<? super Composer, ? super Integer, Unit> r27 = r8;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Function2<? super Composer, ? super Integer, Unit> r28 = r22;
        final Function2<? super Composer, ? super Integer, Unit> r30 = r24;
        final Shape shape4 = shape3;
        final SelectableChipColors colors4 = colors3;
        final SelectableChipElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L230:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L234;
        r1.updateScope(new AnonymousClass2(selected, r42, r43, modifier4, enabled4, r28, r27, r30, shape4, colors4, elevation4, border4, interactionSource3, $changed, $changed1, r57));
        return;
    L234:
        return;
    L222:
        r15 = false;
        goto L223
    L219:
        r14 = false;
        goto L220
    L213:
        avatarOpacity = 0.38f;
        goto L214
    L215:
        shapedAvatar2 = null;
        goto L216
    L205:
        interactionSource2 = interactionSource;
        elevation3 = elevation2;
        border3 = border2;
        enabled3 = enabled2;
        r22 = r33;
        r8 = r34;
        r24 = r35;
        shape3 = shape2;
        colors3 = colors2;
        $dirty6 = $dirty4;
        modifier3 = modifier2;
        goto L206
    L202:
        border2 = border;
        goto L203
    L198:
        $dirty5 = 6;
        r39 = r4;
        elevation2 = elevation;
        goto L200
    L194:
        colors2 = colors;
        $dirty4 = $dirty3;
        goto L196
    L190:
        shape2 = shape;
        $dirty3 = $dirty2;
        goto L192
    L186:
        r35 = r11;
        goto L188
    L183:
        r34 = r8;
        goto L184
    L180:
        r33 = r7;
        goto L181
    L177:
        enabled2 = r6;
        goto L178
    L174:
        modifier2 = r5;
        goto L175
    L156:
        if ($composer2.getDefaultsInvalid() == true) goto L172;
        $composer2.skipToGroupEnd();
        if ((r57 & 256) == 0) goto L161;
        int $dirty7 = $dirty2 & (-234881025);
    L163:
        if ((r57 & 512) == 0) goto L166;
        $dirty7 = $dirty7 & (-1879048193);
    L166:
        if ((r57 & 1024) == 0) goto L169;
        $dirty1 = $dirty1 & (-15);
    L169:
        if ((r57 & 2048) == 0) goto L171;
        $dirty1 = $dirty1 & (-113);
    L171:
        $dirty6 = $dirty7;
        $dirty5 = 6;
        shape3 = shape;
        colors3 = colors;
        elevation3 = elevation;
        border3 = border;
        interactionSource2 = interactionSource;
        modifier3 = r5;
        enabled3 = r6;
        r22 = r7;
        r24 = r11;
        goto L206
    L161:
        $dirty7 = $dirty2;
        goto L163
    L148:
        if (($dirty1 & 147) != 146) goto L153;
        if ($composer2.getSkipping() == false) goto L153;
        $composer2.skipToGroupEnd();
        colors4 = colors;
        border4 = border;
        interactionSource3 = interactionSource;
        modifier4 = r5;
        enabled4 = r6;
        r28 = r7;
        r27 = r8;
        $composer3 = $composer2;
        r30 = r11;
        shape4 = shape;
        elevation4 = elevation;
        goto L230
    L138:
        if (($changed1 & 384) != 0) goto L145;
        if ($composer2.changed(interactionSource) == false) goto L142;
        int r210 = 256;
    L143:
        $dirty1 = $dirty1 | r210;
        goto L145
    L142:
        r210 = 128;
        goto L143
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r11 = r48;
        if ($composer2.changedInstance(r11) == false) goto L87;
        int r211 = 8388608;
    L88:
        $dirty = $dirty | r211;
        goto L91
    L87:
        r211 = 4194304;
        goto L88
    L89:
        r11 = r48;
        goto L91
    L72:
        if (($changed & 1572864) != 0) goto L78;
        r8 = r47;
        if ($composer2.changedInstance(r8) == false) goto L76;
        int r212 = 1048576;
    L77:
        $dirty = $dirty | r212;
        goto L79
    L76:
        r212 = 524288;
        goto L77
    L78:
        r8 = r47;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r7 = r46;
        if ($composer2.changedInstance(r7) == false) goto L65;
        int r213 = 131072;
    L66:
        $dirty = $dirty | r213;
        goto L68
    L65:
        r213 = 65536;
        goto L66
    L67:
        r7 = r46;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r6 = enabled;
        if ($composer2.changed(r6) == false) goto L54;
        int r110 = 16384;
    L55:
        $dirty = $dirty | r110;
        goto L57
    L54:
        r110 = 8192;
        goto L55
    L56:
        r6 = enabled;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L46
    L43:
        r111 = 1024;
        goto L44
    L45:
        r5 = modifier;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changedInstance(r43) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r42;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r31 = 32;
    L22:
        $dirty = $dirty | r31;
        goto L25
    L21:
        r31 = 16;
        goto L22
    L23:
        r13 = r42;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = selected;
        if ($composer2.changed(r12) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L14
    L10:
        r32 = 2;
        goto L11
    L12:
        r12 = selected;
        goto L14
    }

    public static final void SuggestionChip(final Function0<Unit> r32, final Function2<? super Composer, ? super Integer, Unit> r33, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r36, Shape shape, ChipColors colors, ChipElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(-1700130831);
        ComposerKt.sourceInformation($composer2, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)740@35497L5,741@35552L22,742@35631L25,743@35709L29,751@35977L5,746@35805L538:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r14 = r32;
    L14:
        if ((r44 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r13 = r33;
    L24:
        int r2 = r44 & 4;
        if (r2 == 0) goto L28;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L35:
        int r4 = r44 & 8;
        if (r4 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r5 = enabled;
    L46:
        int r6 = r44 & 16;
        if (r6 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r7 = r36;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Shape r9 = shape;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        ChipColors colors2 = colors;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipElevation elevation2 = elevation;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        if ((r44 & 256) != 0) goto L98;
        if ($composer2.changed(border) == false) goto L98;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r17;
    L98:
        r17 = 33554432;
    L101:
        int r3 = r44 & 512;
        if (r3 == 0) goto L105;
        $dirty = $dirty | 805306368;
        MutableInteractionSource r8 = interactionSource;
    L112:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L136:
        if (r2 == 0) goto L138;
        Modifier.Companion modifier3 = Modifier.Companion;
    L139:
        if (r4 == 0) goto L141;
        boolean enabled2 = true;
    L142:
        if (r6 == 0) goto L144;
        Function2<? super Composer, ? super Integer, Unit> r23 = null;
    L146:
        if ((r44 & 32) == 0) goto L148;
        int $dirty3 = $dirty2 & (-458753);
        Shape shape2 = SuggestionChipDefaults.INSTANCE.getShape($composer2, 6);
    L150:
        if ((r44 & 64) == 0) goto L152;
        ChipColors colors3 = SuggestionChipDefaults.INSTANCE.suggestionChipColors($composer2, 6);
        int $dirty4 = $dirty3 & (-3670017);
    L154:
        if ((r44 & 128) == 0) goto L156;
        int r0 = 6;
        $dirty4 = $dirty4 & (-29360129);
        elevation2 = SuggestionChipDefaults.INSTANCE.m2669suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
    L158:
        if ((r44 & 256) == 0) goto L160;
        boolean enabled3 = enabled2;
        BorderStroke border2 = SuggestionChipDefaults.INSTANCE.m2667suggestionChipBorderh1eTWw(enabled3, 0, 0, 0.0f, $composer2, (($dirty4 >> 9) & 14) | 24576, 14);
        $dirty4 = $dirty4 & (-234881025);
    L161:
        if (r3 == 0) goto L163;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        colors2 = colors3;
        Function2<? super Composer, ? super Integer, Unit> r20 = r23;
        int $dirty5 = $dirty4;
        modifier2 = modifier3;
        ChipElevation elevation3 = elevation2;
        Shape shape3 = shape2;
        boolean enabled4 = enabled3;
    L164:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L167;
        ComposerKt.traceEventStart(-1700130831, $dirty5, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:746)");
    L167:
        Composer $composer3 = $composer2;
        ChipColors colors4 = colors2;
        Function2<? super Composer, ? super Integer, Unit> r16 = r13;
        Modifier modifier4 = modifier2;
        m2001ChipnkUnTEs(modifier4, r14, enabled4, r16, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), $composer2, r0), colors2.m1992labelColorvNxB06k$material3_release(enabled4), r20, null, shape3, colors4, elevation3, border3, SuggestionChipDefaults.INSTANCE.m2664getHeightD9Ej5fM(), SuggestionChipPadding, interactionSource2, $composer3, (((((((($dirty5 >> 6) & 14) | 12582912) | (($dirty5 << 3) & 112)) | (($dirty5 >> 3) & 896)) | (($dirty5 << 6) & 7168)) | (($dirty5 << 6) & 3670016)) | (($dirty5 << 9) & 234881024)) | (($dirty5 << 9) & 1879048192), (((($dirty5 >> 21) & 14) | 3456) | (($dirty5 >> 21) & 112)) | (($dirty5 >> 15) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L170;
        ComposerKt.traceEventEnd();
    L170:
        modifier2 = modifier4;
        final boolean enabled5 = enabled4;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r20;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L171:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L175;
        r15.updateScope(new C04951(r32, r33, modifier2, enabled5, r10, shape4, colors5, elevation4, border4, interactionSource3, $changed, r44));
        return;
    L175:
        return;
    L163:
        modifier2 = modifier3;
        interactionSource2 = interactionSource;
        border3 = border2;
        colors2 = colors3;
        r20 = r23;
        $dirty5 = $dirty4;
        elevation3 = elevation2;
        shape3 = shape2;
        enabled4 = enabled3;
        goto L164
    L160:
        enabled3 = enabled2;
        border2 = border;
        goto L161
    L156:
        r0 = 6;
        goto L158
    L152:
        colors3 = colors2;
        $dirty4 = $dirty3;
        goto L154
    L148:
        $dirty3 = $dirty2;
        shape2 = r9;
        goto L150
    L144:
        r23 = r7;
        goto L146
    L141:
        enabled2 = r5;
        goto L142
    L138:
        modifier3 = modifier2;
        goto L139
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L136;
        $composer2.skipToGroupEnd();
        if ((r44 & 32) == 0) goto L127;
        $dirty2 = $dirty2 & (-458753);
    L127:
        if ((r44 & 64) == 0) goto L130;
        $dirty2 = $dirty2 & (-3670017);
    L130:
        if ((r44 & 128) == 0) goto L133;
        $dirty2 = $dirty2 & (-29360129);
    L133:
        if ((r44 & 256) == 0) goto L135;
        border3 = border;
        interactionSource2 = interactionSource;
        $dirty5 = $dirty2 & (-234881025);
        r0 = 6;
        r20 = r7;
        shape3 = r9;
        elevation3 = elevation2;
        enabled4 = r5;
        goto L164
    L135:
        border3 = border;
        interactionSource2 = interactionSource;
        r0 = 6;
        r20 = r7;
        shape3 = r9;
        elevation3 = elevation2;
        $dirty5 = $dirty2;
        enabled4 = r5;
        goto L164
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        enabled5 = r5;
        r10 = r7;
        $composer3 = $composer2;
        shape4 = r9;
        colors5 = colors2;
        elevation4 = elevation2;
        border4 = border;
        interactionSource3 = r8;
        goto L171
    L105:
        if (($changed & 805306368) != 0) goto L111;
        r8 = interactionSource;
        if ($composer2.changed(r8) == false) goto L109;
        int r19 = 536870912;
    L110:
        $dirty = $dirty | r19;
        goto L112
    L109:
        r19 = 268435456;
        goto L110
    L111:
        r8 = interactionSource;
        goto L112
    L82:
        if ((r44 & 128) != 0) goto L86;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
    L87:
        r18 = 4194304;
        goto L88
    L86:
        elevation2 = elevation;
        goto L87
    L71:
        if ((r44 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
    L76:
        r110 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L60:
        if ((r44 & 32) != 0) goto L64;
        r9 = shape;
        if ($composer2.changed(r9) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
    L65:
        r11 = 65536;
        goto L66
    L64:
        r9 = shape;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        r7 = r36;
        if ($composer2.changedInstance(r7) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
        goto L58
    L54:
        r12 = 8192;
        goto L55
    L56:
        r7 = r36;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L43;
        int r21 = 2048;
    L44:
        $dirty = $dirty | r21;
        goto L46
    L43:
        r21 = 1024;
        goto L44
    L45:
        r5 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r22 = 256;
    L33:
        $dirty = $dirty | r22;
        goto L35
    L32:
        r22 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r33;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r24 = 32;
    L22:
        $dirty = $dirty | r24;
        goto L24
    L21:
        r24 = 16;
        goto L22
    L23:
        r13 = r33;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r14 = r32;
        if ($composer2.changedInstance(r14) == false) goto L10;
        int r25 = 4;
    L11:
        $dirty = $dirty | r25;
        goto L14
    L10:
        r25 = 2;
        goto L11
    L12:
        r14 = r32;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final /* synthetic */ void SuggestionChip(final Function0 onClick, final Function2 label, Modifier modifier, boolean enabled, Function2 icon, Shape shape, ChipColors colors, ChipElevation elevation, ChipBorder border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(170629701);
        ComposerKt.sourceInformation($composer2, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)824@39441L5,825@39496L22,826@39575L25,827@39651L22,828@39725L39,835@39946L5,830@39774L568:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0 r14 = onClick;
    L14:
        if ((r44 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2 r13 = label;
    L24:
        int r2 = r44 & 4;
        if (r2 == 0) goto L28;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L35:
        int r4 = r44 & 8;
        if (r4 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r5 = enabled;
    L46:
        int r6 = r44 & 16;
        if (r6 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2 r8 = icon;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Shape r9 = shape;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        ChipColors colors2 = colors;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipElevation elevation2 = elevation;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        if ((r44 & 256) != 0) goto L98;
        if ($composer2.changed(border) == false) goto L98;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r17;
    L98:
        r17 = 33554432;
    L101:
        int r3 = r44 & 512;
        if (r3 == 0) goto L105;
        $dirty = $dirty | 805306368;
        MutableInteractionSource r7 = interactionSource;
    L112:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L136:
        if (r2 == 0) goto L138;
        Modifier.Companion modifier3 = Modifier.Companion;
    L139:
        if (r4 == 0) goto L141;
        boolean enabled2 = true;
    L142:
        if (r6 == 0) goto L144;
        Function2 icon2 = null;
    L146:
        if ((r44 & 32) == 0) goto L148;
        int $dirty3 = $dirty2 & (-458753);
        Shape shape2 = SuggestionChipDefaults.INSTANCE.getShape($composer2, 6);
    L150:
        if ((r44 & 64) == 0) goto L152;
        ChipColors colors3 = SuggestionChipDefaults.INSTANCE.suggestionChipColors($composer2, 6);
        int $dirty4 = $dirty3 & (-3670017);
    L154:
        if ((r44 & 128) == 0) goto L156;
        Composer $composer3 = $composer2;
        int r0 = 6;
        $dirty4 = $dirty4 & (-29360129);
        elevation2 = SuggestionChipDefaults.INSTANCE.m2669suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, 1572864, 63);
    L158:
        if ((r44 & 256) == 0) goto L160;
        $composer2 = $composer3;
        ChipBorder border2 = SuggestionChipDefaults.INSTANCE.m2666suggestionChipBorderd_3_b6Q(0, 0, 0.0f, $composer2, 3072, 7);
        $dirty4 = $dirty4 & (-234881025);
    L161:
        if (r3 == 0) goto L167;
        ComposerKt.sourceInformationMarkerStart($composer2, 1248029210, "CC(remember):Chip.kt#9igjgp");
        Composer $this$cache$iv = $composer2;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L165;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
    L166:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        modifier2 = modifier3;
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) value$iv;
        colors2 = colors3;
        Function2 icon3 = icon2;
        int $dirty5 = $dirty4;
        ChipElevation elevation3 = elevation2;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
    L168:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L171;
        ComposerKt.traceEventStart(170629701, $dirty5, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:830)");
    L171:
        TextStyle r18 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), $composer2, r0);
        long r19 = colors2.m1992labelColorvNxB06k$material3_release(enabled3);
        $composer2.startReplaceGroup(1248043208);
        ComposerKt.sourceInformation($composer2, "842@40163L21");
        if (border2 != null) goto L174;
        State<BorderStroke> r1 = null;
    L175:
        $composer2.endReplaceGroup();
        if (r1 == null) goto L178;
        BorderStroke r10 = r1.getValue();
    L179:
        Composer $composer4 = $composer2;
        ChipColors colors4 = colors2;
        Function2 r16 = r13;
        Modifier modifier4 = modifier2;
        m2001ChipnkUnTEs(modifier4, r14, enabled3, r16, r18, r19, icon3, null, shape3, colors4, elevation3, r10, SuggestionChipDefaults.INSTANCE.m2664getHeightD9Ej5fM(), SuggestionChipPadding, interactionSource2, $composer4, (((((((($dirty5 >> 6) & 14) | 12582912) | (($dirty5 << 3) & 112)) | (($dirty5 >> 3) & 896)) | (($dirty5 << 6) & 7168)) | (($dirty5 << 6) & 3670016)) | (($dirty5 << 9) & 234881024)) | (1879048192 & ($dirty5 << 9)), ((($dirty5 >> 21) & 14) | 3456) | (($dirty5 >> 15) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L182;
        ComposerKt.traceEventEnd();
    L182:
        final ChipBorder border3 = border2;
        modifier2 = modifier4;
        final boolean enabled4 = enabled3;
        final Function2 icon4 = icon3;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L183:
        ScopeUpdateScope r15 = $composer4.endRestartGroup();
        if (r15 == null) goto L187;
        r15.updateScope(new C04963(onClick, label, modifier2, enabled4, icon4, shape4, colors5, elevation4, border3, interactionSource3, $changed, r44));
        return;
    L187:
        return;
    L178:
        r10 = null;
        goto L179
    L174:
        r1 = border2.borderStroke$material3_release(enabled3, $composer2, (($dirty5 >> 9) & 14) | (($dirty5 >> 21) & 112));
        goto L175
    L165:
        value$iv = it$iv;
        goto L166
    L167:
        modifier2 = modifier3;
        interactionSource2 = interactionSource;
        colors2 = colors3;
        icon3 = icon2;
        $dirty5 = $dirty4;
        elevation3 = elevation2;
        enabled3 = enabled2;
        shape3 = shape2;
        goto L168
    L160:
        $composer2 = $composer3;
        border2 = border;
        goto L161
    L156:
        r0 = 6;
        $composer3 = $composer2;
        goto L158
    L152:
        colors3 = colors2;
        $dirty4 = $dirty3;
        goto L154
    L148:
        $dirty3 = $dirty2;
        shape2 = r9;
        goto L150
    L144:
        icon2 = r8;
        goto L146
    L141:
        enabled2 = r5;
        goto L142
    L138:
        modifier3 = modifier2;
        goto L139
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L136;
        $composer2.skipToGroupEnd();
        if ((r44 & 32) == 0) goto L127;
        $dirty2 = $dirty2 & (-458753);
    L127:
        if ((r44 & 64) == 0) goto L130;
        $dirty2 = $dirty2 & (-3670017);
    L130:
        if ((r44 & 128) == 0) goto L133;
        $dirty2 = $dirty2 & (-29360129);
    L133:
        if ((r44 & 256) == 0) goto L135;
        $dirty5 = $dirty2 & (-234881025);
        r0 = 6;
        border2 = border;
        interactionSource2 = interactionSource;
        icon3 = r8;
        shape3 = r9;
        elevation3 = elevation2;
        enabled3 = r5;
        goto L168
    L135:
        border2 = border;
        interactionSource2 = interactionSource;
        r0 = 6;
        icon3 = r8;
        shape3 = r9;
        elevation3 = elevation2;
        $dirty5 = $dirty2;
        enabled3 = r5;
        goto L168
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        enabled4 = r5;
        $composer4 = $composer2;
        icon4 = r8;
        shape4 = r9;
        colors5 = colors2;
        elevation4 = elevation2;
        border3 = border;
        interactionSource3 = r7;
        goto L183
    L105:
        if (($changed & 805306368) != 0) goto L111;
        r7 = interactionSource;
        if ($composer2.changed(r7) == false) goto L109;
        int r110 = 536870912;
    L110:
        $dirty = $dirty | r110;
        goto L112
    L109:
        r110 = 268435456;
        goto L110
    L111:
        r7 = interactionSource;
        goto L112
    L82:
        if ((r44 & 128) != 0) goto L86;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L87;
        int r111 = 8388608;
    L88:
        $dirty = $dirty | r111;
    L87:
        r111 = 4194304;
        goto L88
    L86:
        elevation2 = elevation;
        goto L87
    L71:
        if ((r44 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r112 = 1048576;
    L77:
        $dirty = $dirty | r112;
    L76:
        r112 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L60:
        if ((r44 & 32) != 0) goto L64;
        r9 = shape;
        if ($composer2.changed(r9) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
    L65:
        r11 = 65536;
        goto L66
    L64:
        r9 = shape;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        r8 = icon;
        if ($composer2.changedInstance(r8) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
        goto L58
    L54:
        r12 = 8192;
        goto L55
    L56:
        r8 = icon;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
        goto L46
    L43:
        r20 = 1024;
        goto L44
    L45:
        r5 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L35
    L32:
        r21 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = label;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        r13 = label;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r14 = onClick;
        if ($composer2.changedInstance(r14) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r14 = onClick;
        goto L14
    }

    public static final void ElevatedSuggestionChip(final Function0<Unit> r32, final Function2<? super Composer, ? super Integer, Unit> r33, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r36, Shape shape, ChipColors colors, ChipElevation elevation, BorderStroke border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(-818834969);
        ComposerKt.sourceInformation($composer2, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)897@43055L5,898@43110L30,899@43197L33,908@43503L5,903@43331L538:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r14 = r32;
    L14:
        if ((r44 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2<? super Composer, ? super Integer, Unit> r13 = r33;
    L24:
        int r2 = r44 & 4;
        if (r2 == 0) goto L28;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L35:
        int r4 = r44 & 8;
        if (r4 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r5 = enabled;
    L46:
        int r6 = r44 & 16;
        if (r6 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r7 = r36;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Shape r9 = shape;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        ChipColors colors2 = colors;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipElevation elevation2 = elevation;
    L90:
        int r0 = r44 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r3 = r44 & 512;
        if (r3 == 0) goto L105;
        $dirty = $dirty | 805306368;
        MutableInteractionSource r8 = interactionSource;
    L112:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r2 == 0) goto L135;
        Modifier.Companion modifier3 = Modifier.Companion;
    L136:
        if (r4 == 0) goto L138;
        boolean enabled2 = true;
    L139:
        if (r6 == 0) goto L141;
        Function2<? super Composer, ? super Integer, Unit> r23 = null;
    L143:
        if ((r44 & 32) == 0) goto L145;
        int $dirty3 = $dirty2 & (-458753);
        Shape shape2 = SuggestionChipDefaults.INSTANCE.getShape($composer2, 6);
    L147:
        if ((r44 & 64) == 0) goto L149;
        ChipColors colors3 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors($composer2, 6);
        int $dirty4 = $dirty3 & (-3670017);
    L151:
        if ((r44 & 128) == 0) goto L153;
        int r1 = 6;
        $dirty4 = $dirty4 & (-29360129);
        elevation2 = SuggestionChipDefaults.INSTANCE.m2663elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
    L154:
        if (r0 == 0) goto L156;
        BorderStroke border2 = null;
    L157:
        if (r3 == 0) goto L159;
        modifier2 = modifier3;
        BorderStroke border3 = border2;
        MutableInteractionSource interactionSource2 = null;
        colors2 = colors3;
        Function2<? super Composer, ? super Integer, Unit> r20 = r23;
        int $dirty5 = $dirty4;
        ChipElevation elevation3 = elevation2;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
    L160:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L163;
        ComposerKt.traceEventStart(-818834969, $dirty5, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:903)");
    L163:
        Composer $composer3 = $composer2;
        ChipColors colors4 = colors2;
        Function2<? super Composer, ? super Integer, Unit> r16 = r13;
        Modifier modifier4 = modifier2;
        m2001ChipnkUnTEs(modifier4, r14, enabled3, r16, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), $composer2, r1), colors2.m1992labelColorvNxB06k$material3_release(enabled3), r20, null, shape3, colors4, elevation3, border3, SuggestionChipDefaults.INSTANCE.m2664getHeightD9Ej5fM(), SuggestionChipPadding, interactionSource2, $composer3, (((((((($dirty5 >> 6) & 14) | 12582912) | (($dirty5 << 3) & 112)) | (($dirty5 >> 3) & 896)) | (($dirty5 << 6) & 7168)) | (($dirty5 << 6) & 3670016)) | (($dirty5 << 9) & 234881024)) | (($dirty5 << 9) & 1879048192), (((($dirty5 >> 21) & 14) | 3456) | (($dirty5 >> 21) & 112)) | (($dirty5 >> 15) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L166;
        ComposerKt.traceEventEnd();
    L166:
        modifier2 = modifier4;
        final boolean enabled4 = enabled3;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r20;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final BorderStroke border4 = border3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L167:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L171;
        r15.updateScope(new C04911(r32, r33, modifier2, enabled4, r10, shape4, colors5, elevation4, border4, interactionSource3, $changed, r44));
        return;
    L171:
        return;
    L159:
        modifier2 = modifier3;
        interactionSource2 = interactionSource;
        border3 = border2;
        colors2 = colors3;
        r20 = r23;
        $dirty5 = $dirty4;
        elevation3 = elevation2;
        enabled3 = enabled2;
        shape3 = shape2;
        goto L160
    L156:
        border2 = border;
        goto L157
    L153:
        r1 = 6;
        goto L154
    L149:
        colors3 = colors2;
        $dirty4 = $dirty3;
        goto L151
    L145:
        $dirty3 = $dirty2;
        shape2 = r9;
        goto L147
    L141:
        r23 = r7;
        goto L143
    L138:
        enabled2 = r5;
        goto L139
    L135:
        modifier3 = modifier2;
        goto L136
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r44 & 32) == 0) goto L127;
        $dirty2 = $dirty2 & (-458753);
    L127:
        if ((r44 & 64) == 0) goto L130;
        $dirty2 = $dirty2 & (-3670017);
    L130:
        if ((r44 & 128) == 0) goto L132;
        border3 = border;
        interactionSource2 = interactionSource;
        $dirty5 = $dirty2 & (-29360129);
        r1 = 6;
        r20 = r7;
        shape3 = r9;
        elevation3 = elevation2;
        enabled3 = r5;
        goto L160
    L132:
        border3 = border;
        interactionSource2 = interactionSource;
        r1 = 6;
        r20 = r7;
        shape3 = r9;
        elevation3 = elevation2;
        $dirty5 = $dirty2;
        enabled3 = r5;
        goto L160
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        enabled4 = r5;
        r10 = r7;
        $composer3 = $composer2;
        shape4 = r9;
        colors5 = colors2;
        elevation4 = elevation2;
        border4 = border;
        interactionSource3 = r8;
        goto L167
    L105:
        if (($changed & 805306368) != 0) goto L111;
        r8 = interactionSource;
        if ($composer2.changed(r8) == false) goto L109;
        int r19 = 536870912;
    L110:
        $dirty = $dirty | r19;
        goto L112
    L109:
        r19 = 268435456;
        goto L110
    L111:
        r8 = interactionSource;
        goto L112
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(border) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
        goto L101
    L98:
        r18 = 33554432;
        goto L99
    L82:
        if ((r44 & 128) != 0) goto L86;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty = $dirty | r17;
    L87:
        r17 = 4194304;
        goto L88
    L86:
        elevation2 = elevation;
        goto L87
    L71:
        if ((r44 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
    L76:
        r110 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L60:
        if ((r44 & 32) != 0) goto L64;
        r9 = shape;
        if ($composer2.changed(r9) == false) goto L65;
        int r11 = 131072;
    L66:
        $dirty = $dirty | r11;
    L65:
        r11 = 65536;
        goto L66
    L64:
        r9 = shape;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        r7 = r36;
        if ($composer2.changedInstance(r7) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
        goto L58
    L54:
        r12 = 8192;
        goto L55
    L56:
        r7 = r36;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L43;
        int r21 = 2048;
    L44:
        $dirty = $dirty | r21;
        goto L46
    L43:
        r21 = 1024;
        goto L44
    L45:
        r5 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r22 = 256;
    L33:
        $dirty = $dirty | r22;
        goto L35
    L32:
        r22 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = r33;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r24 = 32;
    L22:
        $dirty = $dirty | r24;
        goto L24
    L21:
        r24 = 16;
        goto L22
    L23:
        r13 = r33;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r14 = r32;
        if ($composer2.changedInstance(r14) == false) goto L10;
        int r25 = 4;
    L11:
        $dirty = $dirty | r25;
        goto L14
    L10:
        r25 = 2;
        goto L11
    L12:
        r14 = r32;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final /* synthetic */ void ElevatedSuggestionChip(final Function0 onClick, final Function2 label, Modifier modifier, boolean enabled, Function2 icon, Shape shape, ChipColors colors, ChipElevation elevation, ChipBorder border, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(1668751803);
        ComposerKt.sourceInformation($composer2, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)980@46960L5,981@47015L30,982@47102L33,984@47219L39,991@47440L5,986@47268L568:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0 r14 = onClick;
    L14:
        if ((r44 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function2 r13 = label;
    L24:
        int r2 = r44 & 4;
        if (r2 == 0) goto L28;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L35:
        int r4 = r44 & 8;
        if (r4 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r5 = enabled;
    L46:
        int r6 = r44 & 16;
        if (r6 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2 r7 = icon;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        Shape r9 = shape;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        ChipColors colors2 = colors;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        ChipElevation elevation2 = elevation;
    L90:
        int r0 = r44 & 256;
        if (r0 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r3 = r44 & 512;
        if (r3 == 0) goto L105;
        $dirty = $dirty | 805306368;
        MutableInteractionSource r8 = interactionSource;
    L112:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L133:
        if (r2 == 0) goto L135;
        Modifier.Companion modifier3 = Modifier.Companion;
    L136:
        if (r4 == 0) goto L138;
        boolean enabled2 = true;
    L139:
        if (r6 == 0) goto L141;
        Function2 icon2 = null;
    L143:
        if ((r44 & 32) == 0) goto L145;
        int $dirty3 = $dirty2 & (-458753);
        Shape shape2 = SuggestionChipDefaults.INSTANCE.getShape($composer2, 6);
    L147:
        if ((r44 & 64) == 0) goto L149;
        ChipColors colors3 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors($composer2, 6);
        int $dirty4 = $dirty3 & (-3670017);
    L151:
        if ((r44 & 128) == 0) goto L153;
        int r1 = 6;
        $dirty4 = $dirty4 & (-29360129);
        elevation2 = SuggestionChipDefaults.INSTANCE.m2663elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, 1572864, 63);
    L154:
        if (r0 == 0) goto L156;
        ChipBorder border2 = null;
    L157:
        if (r3 == 0) goto L163;
        ComposerKt.sourceInformationMarkerStart($composer2, 2121795492, "CC(remember):Chip.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L161;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L162:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        modifier2 = modifier3;
        MutableInteractionSource interactionSource2 = (MutableInteractionSource) value$iv;
        colors2 = colors3;
        Function2 icon3 = icon2;
        int $dirty5 = $dirty4;
        ChipElevation elevation3 = elevation2;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
    L164:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L167;
        ComposerKt.traceEventStart(1668751803, $dirty5, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:986)");
    L167:
        TextStyle r17 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), $composer2, r1);
        long r18 = colors2.m1992labelColorvNxB06k$material3_release(enabled3);
        float r26 = SuggestionChipDefaults.INSTANCE.m2664getHeightD9Ej5fM();
        PaddingValues r27 = SuggestionChipPadding;
        $composer2.startReplaceGroup(2121812626);
        ComposerKt.sourceInformation($composer2, "1000@47755L21");
        if (border2 != null) goto L170;
        State<BorderStroke> r10 = null;
    L171:
        $composer2.endReplaceGroup();
        if (r10 == null) goto L174;
        BorderStroke r11 = r10.getValue();
    L175:
        Composer $composer3 = $composer2;
        ChipColors colors4 = colors2;
        Function2 r16 = r13;
        Modifier modifier4 = modifier2;
        m2001ChipnkUnTEs(modifier4, r14, enabled3, r16, r17, r18, icon3, null, shape3, colors4, elevation3, r11, r26, r27, interactionSource2, $composer3, (((((((($dirty5 >> 6) & 14) | 12582912) | (($dirty5 << 3) & 112)) | (($dirty5 >> 3) & 896)) | (($dirty5 << 6) & 7168)) | (($dirty5 << 6) & 3670016)) | (($dirty5 << 9) & 234881024)) | (1879048192 & ($dirty5 << 9)), ((($dirty5 >> 21) & 14) | 3456) | (($dirty5 >> 15) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L178;
        ComposerKt.traceEventEnd();
    L178:
        final ChipBorder border3 = border2;
        modifier2 = modifier4;
        final boolean enabled4 = enabled3;
        final Function2 icon4 = icon3;
        final Shape shape4 = shape3;
        final ChipColors colors5 = colors4;
        final ChipElevation elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L179:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L183;
        r15.updateScope(new C04923(onClick, label, modifier2, enabled4, icon4, shape4, colors5, elevation4, border3, interactionSource3, $changed, r44));
        return;
    L183:
        return;
    L174:
        r11 = null;
        goto L175
    L170:
        r10 = border2.borderStroke$material3_release(enabled3, $composer2, (($dirty5 >> 9) & 14) | (($dirty5 >> 21) & 112));
        goto L171
    L161:
        value$iv = it$iv;
        goto L162
    L163:
        modifier2 = modifier3;
        interactionSource2 = interactionSource;
        colors2 = colors3;
        icon3 = icon2;
        $dirty5 = $dirty4;
        elevation3 = elevation2;
        enabled3 = enabled2;
        shape3 = shape2;
        goto L164
    L156:
        border2 = border;
        goto L157
    L153:
        r1 = 6;
        goto L154
    L149:
        colors3 = colors2;
        $dirty4 = $dirty3;
        goto L151
    L145:
        $dirty3 = $dirty2;
        shape2 = r9;
        goto L147
    L141:
        icon2 = r7;
        goto L143
    L138:
        enabled2 = r5;
        goto L139
    L135:
        modifier3 = modifier2;
        goto L136
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L133;
        $composer2.skipToGroupEnd();
        if ((r44 & 32) == 0) goto L127;
        $dirty2 = $dirty2 & (-458753);
    L127:
        if ((r44 & 64) == 0) goto L130;
        $dirty2 = $dirty2 & (-3670017);
    L130:
        if ((r44 & 128) == 0) goto L132;
        $dirty5 = $dirty2 & (-29360129);
        r1 = 6;
        border2 = border;
        interactionSource2 = interactionSource;
        icon3 = r7;
        shape3 = r9;
        elevation3 = elevation2;
        enabled3 = r5;
        goto L164
    L132:
        border2 = border;
        interactionSource2 = interactionSource;
        r1 = 6;
        icon3 = r7;
        shape3 = r9;
        elevation3 = elevation2;
        $dirty5 = $dirty2;
        enabled3 = r5;
        goto L164
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        enabled4 = r5;
        icon4 = r7;
        $composer3 = $composer2;
        shape4 = r9;
        colors5 = colors2;
        elevation4 = elevation2;
        border3 = border;
        interactionSource3 = r8;
        goto L179
    L105:
        if (($changed & 805306368) != 0) goto L111;
        r8 = interactionSource;
        if ($composer2.changed(r8) == false) goto L109;
        int r19 = 536870912;
    L110:
        $dirty = $dirty | r19;
        goto L112
    L109:
        r19 = 268435456;
        goto L110
    L111:
        r8 = interactionSource;
        goto L112
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(border) == false) goto L98;
        int r110 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r110;
        goto L101
    L98:
        r110 = 33554432;
        goto L99
    L82:
        if ((r44 & 128) != 0) goto L86;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L87;
        int r111 = 8388608;
    L88:
        $dirty = $dirty | r111;
    L87:
        r111 = 4194304;
        goto L88
    L86:
        elevation2 = elevation;
        goto L87
    L71:
        if ((r44 & 64) != 0) goto L75;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L76;
        int r112 = 1048576;
    L77:
        $dirty = $dirty | r112;
    L76:
        r112 = 524288;
        goto L77
    L75:
        colors2 = colors;
        goto L76
    L60:
        if ((r44 & 32) != 0) goto L64;
        r9 = shape;
        if ($composer2.changed(r9) == false) goto L65;
        int r12 = 131072;
    L66:
        $dirty = $dirty | r12;
    L65:
        r12 = 65536;
        goto L66
    L64:
        r9 = shape;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        r7 = icon;
        if ($composer2.changedInstance(r7) == false) goto L54;
        int r20 = 16384;
    L55:
        $dirty = $dirty | r20;
        goto L58
    L54:
        r20 = 8192;
        goto L55
    L56:
        r7 = icon;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r5 = enabled;
        if ($composer2.changed(r5) == false) goto L43;
        int r21 = 2048;
    L44:
        $dirty = $dirty | r21;
        goto L46
    L43:
        r21 = 1024;
        goto L44
    L45:
        r5 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r22 = 256;
    L33:
        $dirty = $dirty | r22;
        goto L35
    L32:
        r22 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r13 = label;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r23 = 32;
    L22:
        $dirty = $dirty | r23;
        goto L24
    L21:
        r23 = 16;
        goto L22
    L23:
        r13 = label;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r14 = onClick;
        if ($composer2.changedInstance(r14) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L14
    L10:
        r24 = 2;
        goto L11
    L12:
        r14 = onClick;
        goto L14
    }

    /* JADX INFO: renamed from: Chip-nkUnTEs, reason: not valid java name */
    private static final void m2001ChipnkUnTEs(final Modifier modifier, final Function0<Unit> r28, final boolean enabled, final Function2<? super Composer, ? super Integer, Unit> r30, final TextStyle labelTextStyle, final long labelColor, final Function2<? super Composer, ? super Integer, Unit> r34, final Function2<? super Composer, ? super Integer, Unit> r35, final Shape shape, final ChipColors colors, final ChipElevation elevation, final BorderStroke border, final float minHeight, final PaddingValues paddingValues, final MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(1400504719);
        ComposerKt.sourceInformation($composer2, "C(Chip)P(10,11,3,5,7,6:c#ui.graphics.Color,8,14,13,1,2!1,9:c#ui.unit.Dp,12)1975@97230L477,1966@96860L847:Chip.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r28) == false) goto L14;
        int r16 = 32;
    L15:
        $dirty = $dirty | r16;
        goto L17
    L14:
        r16 = 16;
    L17:
        int r17 = 256;
        if (($changed & 384) == 0) goto L20;
    L24:
        int r18 = 2048;
        if (($changed & 3072) != 0) goto L31;
        Function2<? super Composer, ? super Integer, Unit> r8 = r30;
        if ($composer2.changedInstance(r8) == false) goto L29;
        int r20 = 2048;
    L30:
        $dirty = $dirty | r20;
    L32:
        int r21 = 16384;
        if (($changed & 24576) != 0) goto L39;
        TextStyle r10 = labelTextStyle;
        if ($composer2.changed(r10) == false) goto L37;
        int r23 = 16384;
    L38:
        $dirty = $dirty | r23;
    L41:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L47;
        long r11 = labelColor;
        if ($composer2.changed(r11) == false) goto L45;
        int r24 = 131072;
    L46:
        $dirty = $dirty | r24;
    L49:
        if (($changed & 1572864) != 0) goto L57;
        if ($composer2.changedInstance(r34) == false) goto L53;
        int r25 = 1048576;
    L54:
        $dirty = $dirty | r25;
        goto L57
    L53:
        r25 = 524288;
    L57:
        if (($changed & 12582912) != 0) goto L65;
        if ($composer2.changedInstance(r35) == false) goto L61;
        int r26 = 8388608;
    L62:
        $dirty = $dirty | r26;
        goto L65
    L61:
        r26 = 4194304;
    L65:
        if (($changed & 100663296) != 0) goto L73;
        if ($composer2.changed(shape) == false) goto L69;
        int r27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L70:
        $dirty = $dirty | r27;
        goto L73
    L69:
        r27 = 33554432;
    L73:
        if (($changed & 805306368) != 0) goto L80;
        if ($composer2.changed(colors) == false) goto L77;
        int r29 = 536870912;
    L78:
        $dirty = $dirty | r29;
        goto L80
    L77:
        r29 = 268435456;
    L80:
        if (($changed1 & 6) != 0) goto L87;
        if ($composer2.changed(elevation) == false) goto L84;
        int r22 = 4;
    L85:
        $dirty1 = $dirty1 | r22;
        goto L87
    L84:
        r22 = 2;
    L87:
        if (($changed1 & 48) != 0) goto L93;
        BorderStroke r14 = border;
        if ($composer2.changed(r14) == false) goto L91;
        int r210 = 32;
    L92:
        $dirty1 = $dirty1 | r210;
    L95:
        if (($changed1 & 384) != 0) goto L103;
        if ($composer2.changed(minHeight) == true) goto L100;
        r17 = 128;
    L100:
        $dirty1 = $dirty1 | r17;
    L103:
        if (($changed1 & 3072) != 0) goto L111;
        if ($composer2.changed(paddingValues) == true) goto L108;
        r18 = 1024;
    L108:
        $dirty1 = $dirty1 | r18;
    L111:
        if (($changed1 & 24576) == 0) goto L113;
    L117:
        int $dirty2 = $dirty1;
        if ((306783379 & $dirty) != 306783378) goto L126;
        if (($dirty2 & 9363) != 9362) goto L126;
        if ($composer2.getSkipping() == false) goto L126;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
        int $dirty3 = $dirty;
    L147:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L151;
        r1.updateScope(new ChipKt$Chip$3(modifier, r28, enabled, r30, labelTextStyle, labelColor, r34, r35, shape, colors, elevation, border, minHeight, paddingValues, interactionSource, $changed, $changed1));
        return;
    L151:
        return;
    L126:
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventStart(1400504719, $dirty, $dirty2, "androidx.compose.material3.Chip (Chip.kt:1963)");
    L128:
        $composer2.startReplaceGroup(1985614987);
        ComposerKt.sourceInformation($composer2, "1965@96816L39");
        if (interactionSource != null) goto L135;
        ComposerKt.sourceInformationMarkerStart($composer2, 1985615638, "CC(remember):Chip.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L133;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L134:
        MutableInteractionSource r5 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L136:
        $composer2.endReplaceGroup();
        MutableInteractionSource interactionSource2 = r5;
        State<Dp> r9 = null;
        Modifier r19 = SemanticsModifierKt.semantics$default(modifier, false, ChipKt$Chip$1.INSTANCE, 1, null);
        long r110 = colors.m1982containerColorvNxB06k$material3_release(enabled);
        $composer2.startReplaceGroup(1985624506);
        ComposerKt.sourceInformation($composer2, "1972@97093L43");
        if (elevation == null) goto L140;
        r9 = elevation.shadowElevation$material3_release(enabled, interactionSource2, $composer2, (($dirty >> 6) & 14) | (($dirty2 << 6) & 896));
    L140:
        $composer2.endReplaceGroup();
        if (r9 == null) goto L143;
        float r211 = r9.getValue().m6987unboximpl();
    L144:
        $dirty3 = $dirty;
        final TextStyle r4 = r10;
        final long r6 = r11;
        final Function2<? super Composer, ? super Integer, Unit> r3 = r8;
        float r12 = r211;
        SurfaceKt.m2673Surfaceo_FOJdg(r28, r19, enabled, shape, r110, 0, 0.0f, r12, r14, interactionSource2, ComposableLambdaKt.rememberComposableLambda(-1985962652, true, new ChipKt$Chip$2(r3, r4, r6, r34, r35, colors, enabled, minHeight, paddingValues), $composer2, 54), $composer2, (((($dirty3 >> 3) & 14) | ($dirty3 & 896)) | (($dirty3 >> 15) & 7168)) | (($dirty2 << 21) & 234881024), 6, 96);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L147;
        ComposerKt.traceEventEnd();
        goto L147
    L143:
        r211 = Dp.m6973constructorimpl(0);
        goto L144
    L133:
        value$iv = it$iv;
        goto L134
    L135:
        r5 = interactionSource;
        goto L136
    L113:
        if ($composer2.changed(interactionSource) == true) goto L116;
        r21 = 8192;
    L116:
        $dirty1 = $dirty1 | r21;
        goto L117
    L91:
        r210 = 16;
        goto L92
    L93:
        r14 = border;
        goto L95
    L45:
        r24 = 65536;
        goto L46
    L47:
        r11 = labelColor;
        goto L49
    L37:
        r23 = 8192;
        goto L38
    L39:
        r10 = labelTextStyle;
        goto L41
    L29:
        r20 = 1024;
        goto L30
    L31:
        r8 = r30;
        goto L32
    L20:
        if ($composer2.changed(enabled) == false) goto L22;
        int r13 = 256;
    L23:
        $dirty = $dirty | r13;
        goto L24
    L22:
        r13 = 128;
        goto L23
    }

    /* JADX INFO: renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    private static final void m2003SelectableChipu0RnIRE(final boolean selected, final Modifier modifier, final Function0<Unit> r33, final boolean enabled, final Function2<? super Composer, ? super Integer, Unit> r35, final TextStyle labelTextStyle, final Function2<? super Composer, ? super Integer, Unit> r37, final Function2<? super Composer, ? super Integer, Unit> r38, final Function2<? super Composer, ? super Integer, Unit> r39, final Shape shape, final SelectableChipColors colors, final SelectableChipElevation elevation, final BorderStroke border, final float minHeight, final PaddingValues paddingValues, final MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(402951308);
        ComposerKt.sourceInformation($composer2, "C(SelectableChip)P(13,10,11,4,6,7,8!1,15,14,2,3!1,9:c#ui.unit.Dp,12)2023@98879L525,2013@98468L936:Chip.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) goto L5;
    L9:
        int r16 = 16;
        if (($changed & 48) == 0) goto L12;
    L16:
        int r17 = 256;
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r33) == false) goto L21;
        int r19 = 256;
    L22:
        $dirty = $dirty | r19;
        goto L24
    L21:
        r19 = 128;
    L24:
        int r110 = 2048;
        if (($changed & 3072) == 0) goto L27;
    L31:
        int r21 = 16384;
        if (($changed & 24576) != 0) goto L38;
        Function2<? super Composer, ? super Integer, Unit> r8 = r35;
        if ($composer2.changedInstance(r8) == false) goto L36;
        int r23 = 16384;
    L37:
        $dirty = $dirty | r23;
    L39:
        int r25 = 131072;
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L46;
        TextStyle r9 = labelTextStyle;
        if ($composer2.changed(r9) == false) goto L44;
        int r27 = 131072;
    L45:
        $dirty = $dirty | r27;
    L48:
        if (($changed & 1572864) != 0) goto L54;
        Function2<? super Composer, ? super Integer, Unit> r10 = r37;
        if ($composer2.changedInstance(r10) == false) goto L52;
        int r28 = 1048576;
    L53:
        $dirty = $dirty | r28;
    L56:
        if (($changed & 12582912) != 0) goto L64;
        if ($composer2.changedInstance(r38) == false) goto L60;
        int r29 = 8388608;
    L61:
        $dirty = $dirty | r29;
        goto L64
    L60:
        r29 = 4194304;
    L64:
        if (($changed & 100663296) != 0) goto L72;
        if ($composer2.changedInstance(r39) == false) goto L68;
        int r210 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L69:
        $dirty = $dirty | r210;
        goto L72
    L68:
        r210 = 33554432;
    L72:
        if (($changed & 805306368) != 0) goto L80;
        if ($composer2.changed(shape) == false) goto L76;
        int r211 = 536870912;
    L77:
        $dirty = $dirty | r211;
        goto L80
    L76:
        r211 = 268435456;
    L80:
        if (($changed1 & 6) != 0) goto L87;
        if ($composer2.changed(colors) == false) goto L84;
        int r24 = 4;
    L85:
        $dirty1 = $dirty1 | r24;
        goto L87
    L84:
        r24 = 2;
    L87:
        if (($changed1 & 48) != 0) goto L93;
        if ($composer2.changed(elevation) == false) goto L91;
        r16 = 32;
    L91:
        $dirty1 = $dirty1 | r16;
    L93:
        if (($changed1 & 384) != 0) goto L101;
        if ($composer2.changed(border) == true) goto L98;
        r17 = 128;
    L98:
        $dirty1 = $dirty1 | r17;
    L101:
        if (($changed1 & 3072) != 0) goto L109;
        if ($composer2.changed(minHeight) == true) goto L106;
        r110 = 1024;
    L106:
        $dirty1 = $dirty1 | r110;
    L109:
        if (($changed1 & 24576) != 0) goto L117;
        if ($composer2.changed(paddingValues) == true) goto L114;
        r21 = 8192;
    L114:
        $dirty1 = $dirty1 | r21;
    L117:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L124;
        if ($composer2.changed(interactionSource) == true) goto L122;
        r25 = 65536;
    L122:
        $dirty1 = $dirty1 | r25;
    L124:
        if (($dirty & 306783379) != 306783378) goto L132;
        if ((74899 & $dirty1) != 74898) goto L132;
        if ($composer2.getSkipping() == false) goto L132;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L153:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L157;
        r0.updateScope(new ChipKt$SelectableChip$3(selected, modifier, r33, enabled, r35, labelTextStyle, r37, r38, r39, shape, colors, elevation, border, minHeight, paddingValues, interactionSource, $changed, $changed1));
        return;
    L157:
        return;
    L132:
        if (ComposerKt.isTraceInProgress() == false) goto L134;
        ComposerKt.traceEventStart(402951308, $dirty, $dirty1, "androidx.compose.material3.SelectableChip (Chip.kt:2009)");
    L134:
        $composer2.startReplaceGroup(2072749057);
        ComposerKt.sourceInformation($composer2, "2011@98346L39");
        if (interactionSource != null) goto L141;
        ComposerKt.sourceInformationMarkerStart($composer2, 2072749708, "CC(remember):Chip.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L139;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L140:
        MutableInteractionSource r5 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L142:
        $composer2.endReplaceGroup();
        MutableInteractionSource interactionSource2 = r5;
        int $dirty2 = $dirty1;
        State<Dp> r6 = null;
        Modifier r18 = SemanticsModifierKt.semantics$default(modifier, false, ChipKt$SelectableChip$1.INSTANCE, 1, null);
        long r20 = colors.m2586containerColorWaAFU9c$material3_release(enabled, selected);
        $composer2.startReplaceGroup(2072762384);
        ComposerKt.sourceInformation($composer2, "2020@98742L43");
        if (elevation == null) goto L146;
        r6 = elevation.shadowElevation$material3_release(enabled, interactionSource2, $composer2, (($dirty >> 9) & 14) | (($dirty2 << 3) & 896));
    L146:
        $composer2.endReplaceGroup();
        if (r6 == null) goto L149;
        float r111 = r6.getValue().m6987unboximpl();
    L150:
        final Function2<? super Composer, ? super Integer, Unit> r4 = r8;
        final TextStyle r7 = r9;
        final Function2<? super Composer, ? super Integer, Unit> r11 = r10;
        int $dirty3 = $dirty;
        SurfaceKt.m2671Surfaced85dljk(selected, r33, r18, enabled, shape, r20, 0, 0.0f, r111, border, interactionSource2, ComposableLambdaKt.rememberComposableLambda(-577614814, true, new ChipKt$SelectableChip$2(colors, enabled, selected, r4, r7, r11, r38, r39, minHeight, paddingValues), $composer2, 54), $composer2, (((($dirty3 & 14) | (($dirty3 >> 3) & 112)) | ($dirty3 & 7168)) | (($dirty3 >> 15) & 57344)) | (($dirty2 << 21) & 1879048192), 48, 192);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L153;
        ComposerKt.traceEventEnd();
        goto L153
    L149:
        r111 = Dp.m6973constructorimpl(0);
        goto L150
    L139:
        value$iv = it$iv;
        goto L140
    L141:
        r5 = interactionSource;
        goto L142
    L52:
        r28 = 524288;
        goto L53
    L54:
        r10 = r37;
        goto L56
    L44:
        r27 = 65536;
        goto L45
    L46:
        r9 = labelTextStyle;
        goto L48
    L36:
        r23 = 8192;
        goto L37
    L38:
        r8 = r35;
        goto L39
    L27:
        if ($composer2.changed(enabled) == false) goto L29;
        int r12 = 2048;
    L30:
        $dirty = $dirty | r12;
        goto L31
    L29:
        r12 = 1024;
        goto L30
    L12:
        if ($composer2.changed(modifier) == false) goto L14;
        int r13 = 32;
    L15:
        $dirty = $dirty | r13;
        goto L16
    L14:
        r13 = 16;
        goto L15
    L5:
        if ($composer2.changed(selected) == false) goto L7;
        int r14 = 4;
    L8:
        $dirty = $dirty | r14;
        goto L9
    L7:
        r14 = 2;
        goto L8
    }

    /* JADX INFO: renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    private static final void m2002ChipContentfe0OD_I(final Function2<? super Composer, ? super Integer, Unit> r27, final TextStyle labelTextStyle, long labelColor, final Function2<? super Composer, ? super Integer, Unit> r31, final Function2<? super Composer, ? super Integer, Unit> r32, final Function2<? super Composer, ? super Integer, Unit> r33, final long leadingIconColor, final long trailingIconColor, final float minHeight, final PaddingValues paddingValues, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-782878228);
        ComposerKt.sourceInformation($composer2, "C(ChipContent)P(1,3,2:c#ui.graphics.Color,4!1,8,5:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.unit.Dp)2055@99907L3519,2052@99781L3645:Chip.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changedInstance(r27) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L11
    L7:
        r5 = 2;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(labelTextStyle) == false) goto L15;
        int r6 = 32;
    L16:
        $dirty = $dirty | r6;
        goto L18
    L15:
        r6 = 16;
    L18:
        if (($changed & 384) != 0) goto L24;
        long r7 = labelColor;
        if ($composer2.changed(r7) == false) goto L22;
        int r8 = 256;
    L23:
        $dirty = $dirty | r8;
    L26:
        if (($changed & 3072) != 0) goto L32;
        Function2<? super Composer, ? super Integer, Unit> r9 = r31;
        if ($composer2.changedInstance(r9) == false) goto L30;
        int r10 = 2048;
    L31:
        $dirty = $dirty | r10;
    L34:
        if (($changed & 24576) != 0) goto L40;
        Function2<? super Composer, ? super Integer, Unit> r11 = r32;
        if ($composer2.changedInstance(r11) == false) goto L38;
        int r12 = 16384;
    L39:
        $dirty = $dirty | r12;
    L42:
        if ((196608 & $changed) != 0) goto L48;
        Function2<? super Composer, ? super Integer, Unit> r13 = r33;
        if ($composer2.changedInstance(r13) == false) goto L46;
        int r14 = 131072;
    L47:
        $dirty = $dirty | r14;
    L50:
        if ((1572864 & $changed) != 0) goto L56;
        long r15 = leadingIconColor;
        if ($composer2.changed(r15) == false) goto L54;
        int r16 = 1048576;
    L55:
        $dirty = $dirty | r16;
    L58:
        if ((12582912 & $changed) != 0) goto L64;
        long r17 = trailingIconColor;
        if ($composer2.changed(r17) == false) goto L62;
        int r18 = 8388608;
    L63:
        $dirty = $dirty | r18;
    L66:
        if (($changed & 100663296) != 0) goto L74;
        if ($composer2.changed(minHeight) == false) goto L70;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L71:
        $dirty = $dirty | r19;
        goto L74
    L70:
        r19 = 33554432;
    L74:
        if (($changed & 805306368) != 0) goto L82;
        if ($composer2.changed(paddingValues) == false) goto L78;
        int r110 = 536870912;
    L79:
        $dirty = $dirty | r110;
        goto L82
    L78:
        r110 = 268435456;
    L82:
        if (($dirty & 306783379) != 306783378) goto L88;
        if ($composer2.getSkipping() == false) goto L88;
        $composer2.skipToGroupEnd();
    L93:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L97;
        final long r3 = r7;
        r0.updateScope(new ChipKt$ChipContent$2(r27, labelTextStyle, r3, r31, r32, r33, leadingIconColor, trailingIconColor, minHeight, paddingValues, $changed));
        return;
    L97:
        return;
    L88:
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventStart(-782878228, $dirty, -1, "androidx.compose.material3.ChipContent (Chip.kt:2051)");
    L90:
        final Function2<? super Composer, ? super Integer, Unit> r20 = r9;
        final Function2<? super Composer, ? super Integer, Unit> r111 = r11;
        final Function2<? super Composer, ? super Integer, Unit> r21 = r13;
        final long r22 = r15;
        final long r25 = r17;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(r7)), TextKt.getLocalTextStyle().provides(labelTextStyle)}, ComposableLambdaKt.rememberComposableLambda(1748799148, true, new ChipKt$ChipContent$1(minHeight, paddingValues, r111, r20, r21, r22, r27, r25), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventEnd();
        goto L93
    L62:
        r18 = 4194304;
        goto L63
    L64:
        r17 = trailingIconColor;
        goto L66
    L54:
        r16 = 524288;
        goto L55
    L56:
        r15 = leadingIconColor;
        goto L58
    L46:
        r14 = 65536;
        goto L47
    L48:
        r13 = r33;
        goto L50
    L38:
        r12 = 8192;
        goto L39
    L40:
        r11 = r32;
        goto L42
    L30:
        r10 = 1024;
        goto L31
    L32:
        r9 = r31;
        goto L34
    L22:
        r8 = 128;
        goto L23
    L24:
        r7 = labelColor;
        goto L26
    }

    public static final ChipColors getDefaultSuggestionChipColors(ColorScheme $this$defaultSuggestionChipColors) {
        ChipColors it = $this$defaultSuggestionChipColors.getDefaultSuggestionChipColorsCached$material3_release();
        if (it != null) goto L6;
        ChipColors it2 = new ChipColors(Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultSuggestionChipColors, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken($this$defaultSuggestionChipColors, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.Companion.m4402getUnspecified0d7_KjU(), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSuggestionChipColors, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSuggestionChipColors, SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor()), SuggestionChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m4402getUnspecified0d7_KjU(), null);
        $this$defaultSuggestionChipColors.setDefaultSuggestionChipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = false;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = false;
    L12:
        return inputChipPadding(r1, r2, r3);
    }

    private static final PaddingValues inputChipPadding(boolean hasAvatar, boolean hasLeadingIcon, boolean hasTrailingIcon) {
        if (hasAvatar == true) goto L6;
        if (hasLeadingIcon == false) goto L6;
        float r2 = Dp.m6973constructorimpl(8);
    L7:
        float start = r2;
        if (hasTrailingIcon == false) goto L10;
        float end = Dp.m6973constructorimpl(8);
    L12:
        return PaddingKt.m722PaddingValuesa9UjIt4$default(start, 0.0f, end, 0.0f, 10, null);
    L10:
        end = Dp.m6973constructorimpl(4);
    L6:
        r2 = Dp.m6973constructorimpl(4);
        goto L7
    }

    static {
        HorizontalElementsPadding = Dp.m6973constructorimpl(8);
        AssistChipPadding = PaddingKt.m720PaddingValuesYgX7TsA$default(HorizontalElementsPadding, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m720PaddingValuesYgX7TsA$default(HorizontalElementsPadding, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m720PaddingValuesYgX7TsA$default(HorizontalElementsPadding, 0.0f, 2, null);
    }
}
