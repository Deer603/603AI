package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.ui.graphics.Color;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÝ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0002\u0010/J-\u0010^\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bc\u0010dJÀ\u0003\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010a\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020`2\b\u0010k\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010l\u001a\u00020mH\u0016J-\u0010n\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010dJ-\u0010p\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010dJ-\u0010r\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010dJ-\u0010t\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010dJ-\u0010v\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010dJ-\u0010x\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010dJ-\u0010z\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010dJ-\u0010|\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b}\u0010dJ-\u0010~\u001a\u00020\u00032\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020`H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010dJ%\u0010\u0080\u0001\u001a\u00020\u000e*\u0004\u0018\u00010\u000e2\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0082\u0001H\u0000¢\u0006\u0003\b\u0083\u0001R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b3\u00101R\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b4\u00101R\u0019\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b5\u00101R\u0019\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b6\u00101R\u0019\u0010!\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b7\u00101R\u0019\u0010)\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b8\u00101R\u0019\u0010-\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b9\u00101R\u0019\u0010%\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b:\u00101R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b;\u00101R\u0019\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b<\u00101R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b=\u00101R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b>\u00101R\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b?\u00101R\u0019\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b@\u00101R\u0019\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bA\u00101R\u0019\u0010\"\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bB\u00101R\u0019\u0010*\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bC\u00101R\u0019\u0010.\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bD\u00101R\u0019\u0010&\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bE\u00101R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bF\u00101R\u0019\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bG\u00101R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bH\u00101R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bI\u00101R\u0019\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bJ\u00101R\u0019\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bK\u00101R\u0019\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bL\u00101R\u0019\u0010'\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bM\u00101R\u0019\u0010+\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bN\u00101R\u0019\u0010#\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bO\u00101R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bP\u00101R\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bQ\u00101R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bT\u00101R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bU\u00101R\u0019\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bV\u00101R\u0019\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bW\u00101R\u0019\u0010 \u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bX\u00101R\u0019\u0010(\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bY\u00101R\u0019\u0010,\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\bZ\u00101R\u0019\u0010$\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b[\u00101R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b\\\u00101R\u0019\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b]\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "textSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCursorColor-0d7_KjU", "()J", "J", "getDisabledContainerColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getDisabledPlaceholderColor-0d7_KjU", "getDisabledPrefixColor-0d7_KjU", "getDisabledSuffixColor-0d7_KjU", "getDisabledSupportingTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getErrorLabelColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getErrorPlaceholderColor-0d7_KjU", "getErrorPrefixColor-0d7_KjU", "getErrorSuffixColor-0d7_KjU", "getErrorSupportingTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getFocusedIndicatorColor-0d7_KjU", "getFocusedLabelColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getFocusedPlaceholderColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "getFocusedSuffixColor-0d7_KjU", "getFocusedSupportingTextColor-0d7_KjU", "getFocusedTextColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getUnfocusedContainerColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getUnfocusedLabelColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getUnfocusedPlaceholderColor-0d7_KjU", "getUnfocusedPrefixColor-0d7_KjU", "getUnfocusedSuffixColor-0d7_KjU", "getUnfocusedSupportingTextColor-0d7_KjU", "getUnfocusedTextColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "containerColor", "enabled", "", "isError", "focused", "containerColor-XeAY9LY$material3_release", "(ZZZ)J", "copy", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "cursorColor-vNxB06k$material3_release", "(Z)J", "equals", "other", "hashCode", "", "indicatorColor", "indicatorColor-XeAY9LY$material3_release", "labelColor", "labelColor-XeAY9LY$material3_release", "leadingIconColor", "leadingIconColor-XeAY9LY$material3_release", "placeholderColor", "placeholderColor-XeAY9LY$material3_release", "prefixColor", "prefixColor-XeAY9LY$material3_release", "suffixColor", "suffixColor-XeAY9LY$material3_release", "supportingTextColor", "supportingTextColor-XeAY9LY$material3_release", "textColor", "textColor-XeAY9LY$material3_release", "trailingIconColor", "trailingIconColor-XeAY9LY$material3_release", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    static {
    }

    public /* synthetic */ TextFieldColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, TextSelectionColors r21, long r22, long r24, long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, long r44, long r46, long r48, long r50, long r52, long r54, long r56, long r58, long r60, long r62, long r64, long r66, long r68, long r70, long r72, long r74, long r76, long r78, long r80, long r82, long r84, DefaultConstructorMarker r86) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84);
    }

    private TextFieldColors(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        this.focusedTextColor = focusedTextColor;
        this.unfocusedTextColor = unfocusedTextColor;
        this.disabledTextColor = disabledTextColor;
        this.errorTextColor = errorTextColor;
        this.focusedContainerColor = focusedContainerColor;
        this.unfocusedContainerColor = unfocusedContainerColor;
        this.disabledContainerColor = disabledContainerColor;
        this.errorContainerColor = errorContainerColor;
        this.cursorColor = cursorColor;
        this.errorCursorColor = errorCursorColor;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = focusedIndicatorColor;
        this.unfocusedIndicatorColor = unfocusedIndicatorColor;
        this.disabledIndicatorColor = disabledIndicatorColor;
        this.errorIndicatorColor = errorIndicatorColor;
        this.focusedLeadingIconColor = focusedLeadingIconColor;
        this.unfocusedLeadingIconColor = unfocusedLeadingIconColor;
        this.disabledLeadingIconColor = disabledLeadingIconColor;
        this.errorLeadingIconColor = errorLeadingIconColor;
        this.focusedTrailingIconColor = focusedTrailingIconColor;
        this.unfocusedTrailingIconColor = unfocusedTrailingIconColor;
        this.disabledTrailingIconColor = disabledTrailingIconColor;
        this.errorTrailingIconColor = errorTrailingIconColor;
        this.focusedLabelColor = focusedLabelColor;
        this.unfocusedLabelColor = unfocusedLabelColor;
        this.disabledLabelColor = disabledLabelColor;
        this.errorLabelColor = errorLabelColor;
        this.focusedPlaceholderColor = focusedPlaceholderColor;
        this.unfocusedPlaceholderColor = unfocusedPlaceholderColor;
        this.disabledPlaceholderColor = disabledPlaceholderColor;
        this.errorPlaceholderColor = errorPlaceholderColor;
        this.focusedSupportingTextColor = focusedSupportingTextColor;
        this.unfocusedSupportingTextColor = unfocusedSupportingTextColor;
        this.disabledSupportingTextColor = disabledSupportingTextColor;
        this.errorSupportingTextColor = errorSupportingTextColor;
        this.focusedPrefixColor = focusedPrefixColor;
        this.unfocusedPrefixColor = unfocusedPrefixColor;
        this.disabledPrefixColor = disabledPrefixColor;
        this.errorPrefixColor = errorPrefixColor;
        this.focusedSuffixColor = focusedSuffixColor;
        this.unfocusedSuffixColor = unfocusedSuffixColor;
        this.disabledSuffixColor = disabledSuffixColor;
        this.errorSuffixColor = errorSuffixColor;
    }

    /* JADX INFO: renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2770getFocusedTextColor0d7_KjU() {
        return this.focusedTextColor;
    }

    /* JADX INFO: renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2780getUnfocusedTextColor0d7_KjU() {
        return this.unfocusedTextColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2749getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name */
    public final long m2760getErrorTextColor0d7_KjU() {
        return this.errorTextColor;
    }

    /* JADX INFO: renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2762getFocusedContainerColor0d7_KjU() {
        return this.focusedContainerColor;
    }

    /* JADX INFO: renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2772getUnfocusedContainerColor0d7_KjU() {
        return this.unfocusedContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2741getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2751getErrorContainerColor0d7_KjU() {
        return this.errorContainerColor;
    }

    /* JADX INFO: renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2740getCursorColor0d7_KjU() {
        return this.cursorColor;
    }

    /* JADX INFO: renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2752getErrorCursorColor0d7_KjU() {
        return this.errorCursorColor;
    }

    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* JADX INFO: renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2763getFocusedIndicatorColor0d7_KjU() {
        return this.focusedIndicatorColor;
    }

    /* JADX INFO: renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2773getUnfocusedIndicatorColor0d7_KjU() {
        return this.unfocusedIndicatorColor;
    }

    /* JADX INFO: renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2742getDisabledIndicatorColor0d7_KjU() {
        return this.disabledIndicatorColor;
    }

    /* JADX INFO: renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2753getErrorIndicatorColor0d7_KjU() {
        return this.errorIndicatorColor;
    }

    /* JADX INFO: renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2765getFocusedLeadingIconColor0d7_KjU() {
        return this.focusedLeadingIconColor;
    }

    /* JADX INFO: renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2775getUnfocusedLeadingIconColor0d7_KjU() {
        return this.unfocusedLeadingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2744getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2755getErrorLeadingIconColor0d7_KjU() {
        return this.errorLeadingIconColor;
    }

    /* JADX INFO: renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2771getFocusedTrailingIconColor0d7_KjU() {
        return this.focusedTrailingIconColor;
    }

    /* JADX INFO: renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2781getUnfocusedTrailingIconColor0d7_KjU() {
        return this.unfocusedTrailingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2750getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* JADX INFO: renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2761getErrorTrailingIconColor0d7_KjU() {
        return this.errorTrailingIconColor;
    }

    /* JADX INFO: renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2764getFocusedLabelColor0d7_KjU() {
        return this.focusedLabelColor;
    }

    /* JADX INFO: renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2774getUnfocusedLabelColor0d7_KjU() {
        return this.unfocusedLabelColor;
    }

    /* JADX INFO: renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2743getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2754getErrorLabelColor0d7_KjU() {
        return this.errorLabelColor;
    }

    /* JADX INFO: renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2766getFocusedPlaceholderColor0d7_KjU() {
        return this.focusedPlaceholderColor;
    }

    /* JADX INFO: renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2776getUnfocusedPlaceholderColor0d7_KjU() {
        return this.unfocusedPlaceholderColor;
    }

    /* JADX INFO: renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2745getDisabledPlaceholderColor0d7_KjU() {
        return this.disabledPlaceholderColor;
    }

    /* JADX INFO: renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2756getErrorPlaceholderColor0d7_KjU() {
        return this.errorPlaceholderColor;
    }

    /* JADX INFO: renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2769getFocusedSupportingTextColor0d7_KjU() {
        return this.focusedSupportingTextColor;
    }

    /* JADX INFO: renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2779getUnfocusedSupportingTextColor0d7_KjU() {
        return this.unfocusedSupportingTextColor;
    }

    /* JADX INFO: renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2748getDisabledSupportingTextColor0d7_KjU() {
        return this.disabledSupportingTextColor;
    }

    /* JADX INFO: renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2759getErrorSupportingTextColor0d7_KjU() {
        return this.errorSupportingTextColor;
    }

    /* JADX INFO: renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2767getFocusedPrefixColor0d7_KjU() {
        return this.focusedPrefixColor;
    }

    /* JADX INFO: renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2777getUnfocusedPrefixColor0d7_KjU() {
        return this.unfocusedPrefixColor;
    }

    /* JADX INFO: renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2746getDisabledPrefixColor0d7_KjU() {
        return this.disabledPrefixColor;
    }

    /* JADX INFO: renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2757getErrorPrefixColor0d7_KjU() {
        return this.errorPrefixColor;
    }

    /* JADX INFO: renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2768getFocusedSuffixColor0d7_KjU() {
        return this.focusedSuffixColor;
    }

    /* JADX INFO: renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2778getUnfocusedSuffixColor0d7_KjU() {
        return this.unfocusedSuffixColor;
    }

    /* JADX INFO: renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2747getDisabledSuffixColor0d7_KjU() {
        return this.disabledSuffixColor;
    }

    /* JADX INFO: renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2758getErrorSuffixColor0d7_KjU() {
        return this.errorSuffixColor;
    }

    /* JADX INFO: renamed from: copy-ejIjP34$default, reason: not valid java name */
    public static /* synthetic */ TextFieldColors m2736copyejIjP34$default(TextFieldColors r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, TextSelectionColors r39, long r40, long r42, long r44, long r46, long r48, long r50, long r52, long r54, long r56, long r58, long r60, long r62, long r64, long r66, long r68, long r70, long r72, long r74, long r76, long r78, long r80, long r82, long r84, long r86, long r88, long r90, long r92, long r94, long r96, long r98, long r100, long r102, int r104, int r105, Object r106) {
        if ((r104 & 1) == 0) goto L5;
        long r3 = r18.focusedTextColor;
    L7:
        if ((r104 & 2) == 0) goto L9;
        long r5 = r18.unfocusedTextColor;
    L11:
        if ((r104 & 4) == 0) goto L13;
        long r7 = r18.disabledTextColor;
    L15:
        if ((r104 & 8) == 0) goto L17;
        long r9 = r18.errorTextColor;
    L19:
        if ((r104 & 16) == 0) goto L21;
        long r11 = r18.focusedContainerColor;
    L23:
        if ((r104 & 32) == 0) goto L25;
        long r13 = r18.unfocusedContainerColor;
    L27:
        if ((r104 & 64) == 0) goto L29;
        long r4 = r18.disabledContainerColor;
    L30:
        long r110 = r4;
        if ((r104 & 128) == 0) goto L33;
        long r6 = r18.errorContainerColor;
    L34:
        long r22 = r6;
        if ((r104 & 256) == 0) goto L37;
        long r8 = r18.cursorColor;
    L38:
        long r24 = r8;
        if ((r104 & 512) == 0) goto L41;
        long r10 = r18.errorCursorColor;
    L42:
        long r26 = r10;
        if ((r104 & 1024) == 0) goto L45;
        TextSelectionColors r12 = r18.textSelectionColors;
    L47:
        if ((r104 & 2048) == 0) goto L49;
        long r14 = r18.focusedIndicatorColor;
    L50:
        long r28 = r14;
        if ((r104 & 4096) == 0) goto L53;
        long r15 = r18.unfocusedIndicatorColor;
    L54:
        long r30 = r15;
        if ((r104 & 8192) == 0) goto L57;
        long r16 = r18.disabledIndicatorColor;
    L58:
        long r32 = r16;
        if ((r104 & 16384) == 0) goto L61;
        long r17 = r18.errorIndicatorColor;
    L63:
        if ((r104 & 32768) == 0) goto L65;
        long r20 = r18.focusedLeadingIconColor;
    L67:
        if ((r104 & 65536) == 0) goto L69;
        long r34 = r18.unfocusedLeadingIconColor;
    L71:
        if ((r104 & 131072) == 0) goto L73;
        long r36 = r18.disabledLeadingIconColor;
    L75:
        if ((r104 & 262144) == 0) goto L77;
        long r38 = r18.errorLeadingIconColor;
    L79:
        if ((r104 & 524288) == 0) goto L81;
        long r41 = r18.focusedTrailingIconColor;
    L83:
        if ((r104 & 1048576) == 0) goto L85;
        long r43 = r18.unfocusedTrailingIconColor;
    L87:
        if ((r104 & 2097152) == 0) goto L89;
        long r45 = r18.disabledTrailingIconColor;
    L91:
        if ((r104 & 4194304) == 0) goto L93;
        long r47 = r18.errorTrailingIconColor;
    L95:
        if ((r104 & 8388608) == 0) goto L97;
        long r49 = r18.focusedLabelColor;
    L99:
        if ((r104 & 16777216) == 0) goto L101;
        long r51 = r18.unfocusedLabelColor;
    L103:
        if ((r104 & 33554432) == 0) goto L105;
        long r53 = r18.disabledLabelColor;
    L107:
        if ((r104 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) goto L109;
        long r55 = r18.errorLabelColor;
    L111:
        if ((r104 & 134217728) == 0) goto L113;
        long r57 = r18.focusedPlaceholderColor;
    L115:
        if ((r104 & 268435456) == 0) goto L117;
        long r59 = r18.unfocusedPlaceholderColor;
    L119:
        if ((r104 & 536870912) == 0) goto L121;
        long r61 = r18.disabledPlaceholderColor;
    L123:
        if ((r104 & 1073741824) == 0) goto L125;
        long r63 = r18.errorPlaceholderColor;
    L127:
        if ((r104 & Integer.MIN_VALUE) == 0) goto L129;
        long r65 = r18.focusedSupportingTextColor;
    L131:
        if ((r105 & 1) == 0) goto L133;
        long r67 = r18.unfocusedSupportingTextColor;
    L135:
        if ((r105 & 2) == 0) goto L137;
        long r69 = r18.disabledSupportingTextColor;
    L139:
        if ((r105 & 4) == 0) goto L141;
        long r71 = r18.errorSupportingTextColor;
    L143:
        if ((r105 & 8) == 0) goto L145;
        long r73 = r18.focusedPrefixColor;
    L147:
        if ((r105 & 16) == 0) goto L149;
        long r75 = r18.unfocusedPrefixColor;
    L151:
        if ((r105 & 32) == 0) goto L153;
        long r77 = r18.disabledPrefixColor;
    L155:
        if ((r105 & 64) == 0) goto L157;
        long r79 = r18.errorPrefixColor;
    L159:
        if ((r105 & 128) == 0) goto L161;
        long r81 = r18.focusedSuffixColor;
    L163:
        if ((r105 & 256) == 0) goto L165;
        long r83 = r18.unfocusedSuffixColor;
    L167:
        if ((r105 & 512) == 0) goto L169;
        long r85 = r18.disabledSuffixColor;
    L171:
        if ((r105 & 1024) == 0) goto L173;
        long r1 = r18.errorSuffixColor;
    L174:
        long r101 = r85;
        long r710 = r61;
        long r711 = r63;
        long r87 = r65;
        long r89 = r67;
        long r810 = r69;
        long r811 = r71;
        long r610 = r49;
        long r611 = r51;
        long r612 = r53;
        long r712 = r55;
        long r713 = r57;
        long r714 = r59;
        long r510 = r36;
        long r511 = r38;
        long r512 = r41;
        long r513 = r43;
        long r613 = r45;
        long r614 = r47;
        TextSelectionColors r410 = r12;
        long r411 = r17;
        long r412 = r20;
        long r514 = r34;
        long r210 = r11;
        long r310 = r13;
        long r211 = r5;
        long r212 = r7;
        long r213 = r9;
        long r214 = r3;
        return r18.m2738copyejIjP34(r214, r211, r212, r213, r210, r310, r110, r22, r24, r26, r410, r28, r30, r32, r411, r412, r514, r510, r511, r512, r513, r613, r614, r610, r611, r612, r712, r713, r714, r710, r711, r87, r89, r810, r811, r73, r75, r77, r79, r81, r83, r101, r1);
    L173:
        r1 = r102;
        goto L174
    L169:
        r85 = r100;
        goto L171
    L165:
        r83 = r98;
        goto L167
    L161:
        r81 = r96;
        goto L163
    L157:
        r79 = r94;
        goto L159
    L153:
        r77 = r92;
        goto L155
    L149:
        r75 = r90;
        goto L151
    L145:
        r73 = r88;
        goto L147
    L141:
        r71 = r86;
        goto L143
    L137:
        r69 = r84;
        goto L139
    L133:
        r67 = r82;
        goto L135
    L129:
        r65 = r80;
        goto L131
    L125:
        r63 = r78;
        goto L127
    L121:
        r61 = r76;
        goto L123
    L117:
        r59 = r74;
        goto L119
    L113:
        r57 = r72;
        goto L115
    L109:
        r55 = r70;
        goto L111
    L105:
        r53 = r68;
        goto L107
    L101:
        r51 = r66;
        goto L103
    L97:
        r49 = r64;
        goto L99
    L93:
        r47 = r62;
        goto L95
    L89:
        r45 = r60;
        goto L91
    L85:
        r43 = r58;
        goto L87
    L81:
        r41 = r56;
        goto L83
    L77:
        r38 = r54;
        goto L79
    L73:
        r36 = r52;
        goto L75
    L69:
        r34 = r50;
        goto L71
    L65:
        r20 = r48;
        goto L67
    L61:
        r17 = r46;
        goto L63
    L57:
        r16 = r44;
        goto L58
    L53:
        r15 = r42;
        goto L54
    L49:
        r14 = r40;
        goto L50
    L45:
        r12 = r39;
        goto L47
    L41:
        r10 = r37;
        goto L42
    L37:
        r8 = r35;
        goto L38
    L33:
        r6 = r33;
        goto L34
    L29:
        r4 = r31;
        goto L30
    L25:
        r13 = r29;
        goto L27
    L21:
        r11 = r27;
        goto L23
    L17:
        r9 = r25;
        goto L19
    L13:
        r7 = r23;
        goto L15
    L9:
        r5 = r21;
        goto L11
    L5:
        r3 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m2738copyejIjP34(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, TextSelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        boolean r10 = true;
        if (focusedTextColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = focusedTextColor;
    L10:
        if (unfocusedTextColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = unfocusedTextColor;
    L17:
        if (disabledTextColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = disabledTextColor;
    L24:
        if (errorTextColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = errorTextColor;
    L31:
        if (focusedContainerColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = focusedContainerColor;
    L38:
        if (unfocusedContainerColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = unfocusedContainerColor;
    L45:
        if (disabledContainerColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = disabledContainerColor;
    L52:
        if (errorContainerColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = errorContainerColor;
    L59:
        if (cursorColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = cursorColor;
    L66:
        if (errorCursorColor == 16) goto L68;
        boolean r16 = true;
    L69:
        if (r16 == false) goto L71;
        long r31 = errorCursorColor;
    L72:
        TextSelectionColors r33 = takeOrElse$material3_release(textSelectionColors, new TextFieldColors$copy$11(this));
        if (focusedIndicatorColor == 16) goto L75;
        boolean r18 = true;
    L76:
        if (r18 == false) goto L78;
        long r34 = focusedIndicatorColor;
    L80:
        if (unfocusedIndicatorColor == 16) goto L82;
        boolean r20 = true;
    L83:
        if (r20 == false) goto L85;
        long r36 = unfocusedIndicatorColor;
    L87:
        if (disabledIndicatorColor == 16) goto L89;
        boolean r22 = true;
    L90:
        if (r22 == false) goto L92;
        long r38 = disabledIndicatorColor;
    L94:
        if (errorIndicatorColor == 16) goto L96;
        boolean r24 = true;
    L97:
        if (r24 == false) goto L99;
        long r40 = errorIndicatorColor;
    L101:
        if (focusedLeadingIconColor == 16) goto L103;
        boolean r26 = true;
    L104:
        if (r26 == false) goto L106;
        long r42 = focusedLeadingIconColor;
    L108:
        if (unfocusedLeadingIconColor == 16) goto L110;
        boolean r28 = true;
    L111:
        if (r28 == false) goto L113;
        long r44 = unfocusedLeadingIconColor;
    L115:
        if (disabledLeadingIconColor == 16) goto L117;
        boolean r30 = true;
    L118:
        if (r30 == false) goto L120;
        long r46 = disabledLeadingIconColor;
    L122:
        if (errorLeadingIconColor == 16) goto L124;
        boolean r32 = true;
    L125:
        if (r32 == false) goto L127;
        long r48 = errorLeadingIconColor;
    L129:
        if (focusedTrailingIconColor == 16) goto L131;
        boolean r35 = true;
    L132:
        if (r35 == false) goto L134;
        long r50 = focusedTrailingIconColor;
    L136:
        if (unfocusedTrailingIconColor == 16) goto L138;
        boolean r37 = true;
    L139:
        if (r37 == false) goto L141;
        long r52 = unfocusedTrailingIconColor;
    L143:
        if (disabledTrailingIconColor == 16) goto L145;
        boolean r39 = true;
    L146:
        if (r39 == false) goto L148;
        long r54 = disabledTrailingIconColor;
    L150:
        if (errorTrailingIconColor == 16) goto L152;
        boolean r41 = true;
    L153:
        if (r41 == false) goto L155;
        long r56 = errorTrailingIconColor;
    L157:
        if (focusedLabelColor == 16) goto L159;
        boolean r43 = true;
    L160:
        if (r43 == false) goto L162;
        long r58 = focusedLabelColor;
    L164:
        if (unfocusedLabelColor == 16) goto L166;
        boolean r45 = true;
    L167:
        if (r45 == false) goto L169;
        long r60 = unfocusedLabelColor;
    L171:
        if (disabledLabelColor == 16) goto L173;
        boolean r47 = true;
    L174:
        if (r47 == false) goto L176;
        long r62 = disabledLabelColor;
    L178:
        if (errorLabelColor == 16) goto L180;
        boolean r49 = true;
    L181:
        if (r49 == false) goto L183;
        long r64 = errorLabelColor;
    L185:
        if (focusedPlaceholderColor == 16) goto L187;
        boolean r51 = true;
    L188:
        if (r51 == false) goto L190;
        long r66 = focusedPlaceholderColor;
    L192:
        if (unfocusedPlaceholderColor == 16) goto L194;
        boolean r53 = true;
    L195:
        if (r53 == false) goto L197;
        long r68 = unfocusedPlaceholderColor;
    L199:
        if (disabledPlaceholderColor == 16) goto L201;
        boolean r55 = true;
    L202:
        if (r55 == false) goto L204;
        long r70 = disabledPlaceholderColor;
    L206:
        if (errorPlaceholderColor == 16) goto L208;
        boolean r57 = true;
    L209:
        if (r57 == false) goto L211;
        long r72 = errorPlaceholderColor;
    L213:
        if (focusedSupportingTextColor == 16) goto L215;
        boolean r59 = true;
    L216:
        if (r59 == false) goto L218;
        long r74 = focusedSupportingTextColor;
    L220:
        if (unfocusedSupportingTextColor == 16) goto L222;
        boolean r61 = true;
    L223:
        if (r61 == false) goto L225;
        long r76 = unfocusedSupportingTextColor;
    L227:
        if (disabledSupportingTextColor == 16) goto L229;
        boolean r63 = true;
    L230:
        if (r63 == false) goto L232;
        long r78 = disabledSupportingTextColor;
    L234:
        if (errorSupportingTextColor == 16) goto L236;
        boolean r65 = true;
    L237:
        if (r65 == false) goto L239;
        long r80 = errorSupportingTextColor;
    L241:
        if (focusedPrefixColor == 16) goto L243;
        boolean r67 = true;
    L244:
        if (r67 == false) goto L246;
        long r82 = focusedPrefixColor;
    L248:
        if (unfocusedPrefixColor == 16) goto L250;
        boolean r69 = true;
    L251:
        if (r69 == false) goto L253;
        long r84 = unfocusedPrefixColor;
    L255:
        if (disabledPrefixColor == 16) goto L257;
        boolean r71 = true;
    L258:
        if (r71 == false) goto L260;
        long r86 = disabledPrefixColor;
    L262:
        if (errorPrefixColor == 16) goto L264;
        boolean r73 = true;
    L265:
        if (r73 == false) goto L267;
        long r88 = errorPrefixColor;
    L269:
        if (focusedSuffixColor == 16) goto L271;
        boolean r75 = true;
    L272:
        if (r75 == false) goto L274;
        long r90 = focusedSuffixColor;
    L276:
        if (unfocusedSuffixColor == 16) goto L278;
        boolean r77 = true;
    L279:
        if (r77 == false) goto L281;
        long r92 = unfocusedSuffixColor;
    L283:
        if (disabledSuffixColor == 16) goto L285;
        boolean r79 = true;
    L286:
        if (r79 == false) goto L288;
        long r94 = disabledSuffixColor;
    L290:
        if (errorSuffixColor != 16) goto L293;
        r10 = false;
    L293:
        if (r10 == false) goto L295;
        long r96 = errorSuffixColor;
    L297:
        return new TextFieldColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, null);
    L295:
        r96 = this.errorSuffixColor;
        goto L297
    L288:
        r94 = this.disabledSuffixColor;
        goto L290
    L285:
        r79 = false;
        goto L286
    L281:
        r92 = this.unfocusedSuffixColor;
        goto L283
    L278:
        r77 = false;
        goto L279
    L274:
        r90 = this.focusedSuffixColor;
        goto L276
    L271:
        r75 = false;
        goto L272
    L267:
        r88 = this.errorPrefixColor;
        goto L269
    L264:
        r73 = false;
        goto L265
    L260:
        r86 = this.disabledPrefixColor;
        goto L262
    L257:
        r71 = false;
        goto L258
    L253:
        r84 = this.unfocusedPrefixColor;
        goto L255
    L250:
        r69 = false;
        goto L251
    L246:
        r82 = this.focusedPrefixColor;
        goto L248
    L243:
        r67 = false;
        goto L244
    L239:
        r80 = this.errorSupportingTextColor;
        goto L241
    L236:
        r65 = false;
        goto L237
    L232:
        r78 = this.disabledSupportingTextColor;
        goto L234
    L229:
        r63 = false;
        goto L230
    L225:
        r76 = this.unfocusedSupportingTextColor;
        goto L227
    L222:
        r61 = false;
        goto L223
    L218:
        r74 = this.focusedSupportingTextColor;
        goto L220
    L215:
        r59 = false;
        goto L216
    L211:
        r72 = this.errorPlaceholderColor;
        goto L213
    L208:
        r57 = false;
        goto L209
    L204:
        r70 = this.disabledPlaceholderColor;
        goto L206
    L201:
        r55 = false;
        goto L202
    L197:
        r68 = this.unfocusedPlaceholderColor;
        goto L199
    L194:
        r53 = false;
        goto L195
    L190:
        r66 = this.focusedPlaceholderColor;
        goto L192
    L187:
        r51 = false;
        goto L188
    L183:
        r64 = this.errorLabelColor;
        goto L185
    L180:
        r49 = false;
        goto L181
    L176:
        r62 = this.disabledLabelColor;
        goto L178
    L173:
        r47 = false;
        goto L174
    L169:
        r60 = this.unfocusedLabelColor;
        goto L171
    L166:
        r45 = false;
        goto L167
    L162:
        r58 = this.focusedLabelColor;
        goto L164
    L159:
        r43 = false;
        goto L160
    L155:
        r56 = this.errorTrailingIconColor;
        goto L157
    L152:
        r41 = false;
        goto L153
    L148:
        r54 = this.disabledTrailingIconColor;
        goto L150
    L145:
        r39 = false;
        goto L146
    L141:
        r52 = this.unfocusedTrailingIconColor;
        goto L143
    L138:
        r37 = false;
        goto L139
    L134:
        r50 = this.focusedTrailingIconColor;
        goto L136
    L131:
        r35 = false;
        goto L132
    L127:
        r48 = this.errorLeadingIconColor;
        goto L129
    L124:
        r32 = false;
        goto L125
    L120:
        r46 = this.disabledLeadingIconColor;
        goto L122
    L117:
        r30 = false;
        goto L118
    L113:
        r44 = this.unfocusedLeadingIconColor;
        goto L115
    L110:
        r28 = false;
        goto L111
    L106:
        r42 = this.focusedLeadingIconColor;
        goto L108
    L103:
        r26 = false;
        goto L104
    L99:
        r40 = this.errorIndicatorColor;
        goto L101
    L96:
        r24 = false;
        goto L97
    L92:
        r38 = this.disabledIndicatorColor;
        goto L94
    L89:
        r22 = false;
        goto L90
    L85:
        r36 = this.unfocusedIndicatorColor;
        goto L87
    L82:
        r20 = false;
        goto L83
    L78:
        r34 = this.focusedIndicatorColor;
        goto L80
    L75:
        r18 = false;
        goto L76
    L71:
        r31 = this.errorCursorColor;
        goto L72
    L68:
        r16 = false;
        goto L69
    L64:
        r29 = this.cursorColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.errorContainerColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.disabledContainerColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.unfocusedContainerColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.focusedContainerColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.errorTextColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.disabledTextColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.unfocusedTextColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.focusedTextColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    public final TextSelectionColors takeOrElse$material3_release(TextSelectionColors $this$takeOrElse, Function0<TextSelectionColors> r3) {
        if ($this$takeOrElse != null) goto L5;
        return r3.invoke();
    L5:
        return $this$takeOrElse;
    }

    /* JADX INFO: renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2784leadingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedLeadingIconColor;
    L9:
        return this.unfocusedLeadingIconColor;
    L11:
        return this.errorLeadingIconColor;
    L10:
        return this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2790trailingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedTrailingIconColor;
    L9:
        return this.unfocusedTrailingIconColor;
    L11:
        return this.errorTrailingIconColor;
    L10:
        return this.disabledTrailingIconColor;
    }

    /* JADX INFO: renamed from: indicatorColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2782indicatorColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedIndicatorColor;
    L9:
        return this.unfocusedIndicatorColor;
    L11:
        return this.errorIndicatorColor;
    L10:
        return this.disabledIndicatorColor;
    }

    /* JADX INFO: renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2737containerColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedContainerColor;
    L9:
        return this.unfocusedContainerColor;
    L11:
        return this.errorContainerColor;
    L10:
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: placeholderColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2785placeholderColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedPlaceholderColor;
    L9:
        return this.unfocusedPlaceholderColor;
    L11:
        return this.errorPlaceholderColor;
    L10:
        return this.disabledPlaceholderColor;
    }

    /* JADX INFO: renamed from: labelColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2783labelColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedLabelColor;
    L9:
        return this.unfocusedLabelColor;
    L11:
        return this.errorLabelColor;
    L10:
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: textColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2789textColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedTextColor;
    L9:
        return this.unfocusedTextColor;
    L11:
        return this.errorTextColor;
    L10:
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: supportingTextColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2788supportingTextColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedSupportingTextColor;
    L9:
        return this.unfocusedSupportingTextColor;
    L11:
        return this.errorSupportingTextColor;
    L10:
        return this.disabledSupportingTextColor;
    }

    /* JADX INFO: renamed from: prefixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2786prefixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedPrefixColor;
    L9:
        return this.unfocusedPrefixColor;
    L11:
        return this.errorPrefixColor;
    L10:
        return this.disabledPrefixColor;
    }

    /* JADX INFO: renamed from: suffixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m2787suffixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (enabled == false) goto L10;
        if (isError == true) goto L11;
        if (focused == false) goto L9;
        return this.focusedSuffixColor;
    L9:
        return this.unfocusedSuffixColor;
    L11:
        return this.errorSuffixColor;
    L10:
        return this.disabledSuffixColor;
    }

    /* JADX INFO: renamed from: cursorColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2739cursorColorvNxB06k$material3_release(boolean isError) {
        if (isError == false) goto L5;
        return this.errorCursorColor;
    L5:
        return this.cursorColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L140:
        return false;
    L8:
        if ((other instanceof TextFieldColors) == false) goto L140;
        if (Color.m4367equalsimpl0(this.focusedTextColor, ((TextFieldColors) other).focusedTextColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.unfocusedTextColor, ((TextFieldColors) other).unfocusedTextColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.disabledTextColor, ((TextFieldColors) other).disabledTextColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.errorTextColor, ((TextFieldColors) other).errorTextColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.focusedContainerColor, ((TextFieldColors) other).focusedContainerColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.unfocusedContainerColor, ((TextFieldColors) other).unfocusedContainerColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.disabledContainerColor, ((TextFieldColors) other).disabledContainerColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.errorContainerColor, ((TextFieldColors) other).errorContainerColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.cursorColor, ((TextFieldColors) other).cursorColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.errorCursorColor, ((TextFieldColors) other).errorCursorColor) == true) goto L41;
        return false;
    L41:
        if (Intrinsics.areEqual(this.textSelectionColors, ((TextFieldColors) other).textSelectionColors) == true) goto L44;
        return false;
    L44:
        if (Color.m4367equalsimpl0(this.focusedIndicatorColor, ((TextFieldColors) other).focusedIndicatorColor) == true) goto L47;
        return false;
    L47:
        if (Color.m4367equalsimpl0(this.unfocusedIndicatorColor, ((TextFieldColors) other).unfocusedIndicatorColor) == true) goto L50;
        return false;
    L50:
        if (Color.m4367equalsimpl0(this.disabledIndicatorColor, ((TextFieldColors) other).disabledIndicatorColor) == true) goto L53;
        return false;
    L53:
        if (Color.m4367equalsimpl0(this.errorIndicatorColor, ((TextFieldColors) other).errorIndicatorColor) == true) goto L56;
        return false;
    L56:
        if (Color.m4367equalsimpl0(this.focusedLeadingIconColor, ((TextFieldColors) other).focusedLeadingIconColor) == true) goto L59;
        return false;
    L59:
        if (Color.m4367equalsimpl0(this.unfocusedLeadingIconColor, ((TextFieldColors) other).unfocusedLeadingIconColor) == true) goto L62;
        return false;
    L62:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconColor, ((TextFieldColors) other).disabledLeadingIconColor) == true) goto L65;
        return false;
    L65:
        if (Color.m4367equalsimpl0(this.errorLeadingIconColor, ((TextFieldColors) other).errorLeadingIconColor) == true) goto L68;
        return false;
    L68:
        if (Color.m4367equalsimpl0(this.focusedTrailingIconColor, ((TextFieldColors) other).focusedTrailingIconColor) == true) goto L71;
        return false;
    L71:
        if (Color.m4367equalsimpl0(this.unfocusedTrailingIconColor, ((TextFieldColors) other).unfocusedTrailingIconColor) == true) goto L74;
        return false;
    L74:
        if (Color.m4367equalsimpl0(this.disabledTrailingIconColor, ((TextFieldColors) other).disabledTrailingIconColor) == true) goto L77;
        return false;
    L77:
        if (Color.m4367equalsimpl0(this.errorTrailingIconColor, ((TextFieldColors) other).errorTrailingIconColor) == true) goto L80;
        return false;
    L80:
        if (Color.m4367equalsimpl0(this.focusedLabelColor, ((TextFieldColors) other).focusedLabelColor) == true) goto L83;
        return false;
    L83:
        if (Color.m4367equalsimpl0(this.unfocusedLabelColor, ((TextFieldColors) other).unfocusedLabelColor) == true) goto L86;
        return false;
    L86:
        if (Color.m4367equalsimpl0(this.disabledLabelColor, ((TextFieldColors) other).disabledLabelColor) == true) goto L89;
        return false;
    L89:
        if (Color.m4367equalsimpl0(this.errorLabelColor, ((TextFieldColors) other).errorLabelColor) == true) goto L92;
        return false;
    L92:
        if (Color.m4367equalsimpl0(this.focusedPlaceholderColor, ((TextFieldColors) other).focusedPlaceholderColor) == true) goto L95;
        return false;
    L95:
        if (Color.m4367equalsimpl0(this.unfocusedPlaceholderColor, ((TextFieldColors) other).unfocusedPlaceholderColor) == true) goto L98;
        return false;
    L98:
        if (Color.m4367equalsimpl0(this.disabledPlaceholderColor, ((TextFieldColors) other).disabledPlaceholderColor) == true) goto L101;
        return false;
    L101:
        if (Color.m4367equalsimpl0(this.errorPlaceholderColor, ((TextFieldColors) other).errorPlaceholderColor) == true) goto L104;
        return false;
    L104:
        if (Color.m4367equalsimpl0(this.focusedSupportingTextColor, ((TextFieldColors) other).focusedSupportingTextColor) == true) goto L107;
        return false;
    L107:
        if (Color.m4367equalsimpl0(this.unfocusedSupportingTextColor, ((TextFieldColors) other).unfocusedSupportingTextColor) == true) goto L110;
        return false;
    L110:
        if (Color.m4367equalsimpl0(this.disabledSupportingTextColor, ((TextFieldColors) other).disabledSupportingTextColor) == true) goto L113;
        return false;
    L113:
        if (Color.m4367equalsimpl0(this.errorSupportingTextColor, ((TextFieldColors) other).errorSupportingTextColor) == true) goto L116;
        return false;
    L116:
        if (Color.m4367equalsimpl0(this.focusedPrefixColor, ((TextFieldColors) other).focusedPrefixColor) == true) goto L119;
        return false;
    L119:
        if (Color.m4367equalsimpl0(this.unfocusedPrefixColor, ((TextFieldColors) other).unfocusedPrefixColor) == true) goto L122;
        return false;
    L122:
        if (Color.m4367equalsimpl0(this.disabledPrefixColor, ((TextFieldColors) other).disabledPrefixColor) == true) goto L125;
        return false;
    L125:
        if (Color.m4367equalsimpl0(this.errorPrefixColor, ((TextFieldColors) other).errorPrefixColor) == true) goto L128;
        return false;
    L128:
        if (Color.m4367equalsimpl0(this.focusedSuffixColor, ((TextFieldColors) other).focusedSuffixColor) == true) goto L131;
        return false;
    L131:
        if (Color.m4367equalsimpl0(this.unfocusedSuffixColor, ((TextFieldColors) other).unfocusedSuffixColor) == true) goto L134;
        return false;
    L134:
        if (Color.m4367equalsimpl0(this.disabledSuffixColor, ((TextFieldColors) other).disabledSuffixColor) == true) goto L137;
        return false;
    L137:
        if (Color.m4367equalsimpl0(this.errorSuffixColor, ((TextFieldColors) other).errorSuffixColor) == true) goto L139;
        return false;
    L139:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.focusedTextColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.unfocusedTextColor);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.disabledTextColor)) * 31) + Color.m4373hashCodeimpl(this.errorTextColor)) * 31) + Color.m4373hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4373hashCodeimpl(this.errorContainerColor)) * 31) + Color.m4373hashCodeimpl(this.cursorColor)) * 31) + Color.m4373hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m4373hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4373hashCodeimpl(this.errorLabelColor)) * 31) + Color.m4373hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m4373hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m4373hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m4373hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m4373hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m4373hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m4373hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m4373hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m4373hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m4373hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m4373hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m4373hashCodeimpl(this.errorSuffixColor);
    }
}
