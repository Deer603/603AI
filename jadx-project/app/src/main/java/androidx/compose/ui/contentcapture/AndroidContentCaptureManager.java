package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.ScatterMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0082\u0001\u0083\u0001\u0084\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u00109\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b:\u0010;J\u001a\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0010\u0010A\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>H\u0002J\u0016\u0010B\u001a\u00020\u000e2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010D\u001a\u00020\u000eH\u0002J\b\u0010E\u001a\u00020\u000eH\u0002J\b\u0010F\u001a\u00020\u000eH\u0002J\b\u0010G\u001a\u00020\u000eH\u0002J\r\u0010H\u001a\u00020\u000eH\u0000¢\u0006\u0002\bIJ-\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0PH\u0001¢\u0006\u0002\bRJ\r\u0010S\u001a\u00020\u000eH\u0000¢\u0006\u0002\bTJ\r\u0010U\u001a\u00020\u000eH\u0000¢\u0006\u0002\bVJ\r\u0010W\u001a\u00020\u000eH\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020\u000eH\u0000¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020aH\u0016J%\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u00002\u000e\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g0fH\u0001¢\u0006\u0002\bhJ\u0018\u0010i\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u000203H\u0002J\b\u0010m\u001a\u00020\u000eH\u0002J\u0018\u0010n\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020>2\u0006\u0010p\u001a\u00020qH\u0002J\b\u0010r\u001a\u00020\u000eH\u0002J\u0018\u0010s\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020>2\u0006\u0010u\u001a\u00020kH\u0002J\u0010\u0010v\u001a\u00020\u000e2\u0006\u0010u\u001a\u00020kH\u0002J\b\u0010w\u001a\u00020\u000eH\u0002J\u0010\u0010x\u001a\u00020\u000e2\u0006\u0010u\u001a\u00020kH\u0002JG\u0010y\u001a\u00020\u000e\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u0002Hz0{2\u0018\u0010|\u001a\u0014\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002Hz\u0012\u0004\u0012\u00020\u000e0}2\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u0002Hz\u0012\u0004\u0012\u00020\u00130\u007fH\u0082\bJ'\u0010\u0080\u0001\u001a\u00020\u000e*\u00020k2\u0018\u0010|\u001a\u0014\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u000e0}H\u0002J\u0017\u0010\u0081\u0001\u001a\u0004\u0018\u00010@*\u00020k2\u0006\u0010t\u001a\u00020>H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "onContentCaptureSession", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "SendRecurringContentCaptureEventsIntervalMillis", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "bufferedEvents", "", "Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "checkingForSemanticsChanges", "", "contentCaptureChangeChecker", "Ljava/lang/Runnable;", "contentCaptureSession", "getContentCaptureSession$ui_release$annotations", "()V", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes$ui_release", "()Landroidx/collection/IntObjectMap;", "setCurrentSemanticsNodes$ui_release", "(Landroidx/collection/IntObjectMap;)V", "currentSemanticsNodesInvalidated", "currentSemanticsNodesSnapshotTimestampMillis", "handler", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "isEnabled", "isEnabled$ui_release", "()Z", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "previousSemanticsNodes", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "previousSemanticsRoot", "translateStatus", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "boundsUpdatesEventLoop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bufferContentCaptureViewAppeared", "virtualId", "", "viewStructure", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "bufferContentCaptureViewDisappeared", "checkForContentCapturePropertyChanges", "newSemanticsNodes", "clearTranslatedText", "hideTranslatedText", "notifyContentCaptureChanges", "notifySubtreeStateChangeIfNeeded", "onClearTranslation", "onClearTranslation$ui_release", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onCreateVirtualViewTranslationRequests$ui_release", "onHideTranslation", "onHideTranslation$ui_release", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "onShowTranslation", "onShowTranslation$ui_release", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "onViewAttachedToWindow", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "onVirtualViewTranslationResponses", "contentCaptureManager", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onVirtualViewTranslationResponses$ui_release", "sendContentCaptureAppearEvents", "newNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "oldNode", "sendContentCaptureDisappearEvents", "sendContentCaptureTextUpdateEvent", "id", "newText", "", "showTranslatedText", "updateBuffersOnAppeared", "index", "node", "updateBuffersOnDisappeared", "updateSemanticsCopy", "updateTranslationOnAppeared", "fastForEachIndexedWithFilter", "T", "", "action", "Lkotlin/Function2;", "predicate", "Lkotlin/Function1;", "fastForEachReplacedVisibleChildren", "toViewStructure", "Companion", "TranslateStatus", "ViewTranslationHelperMethods", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private long SendRecurringContentCaptureEventsIntervalMillis;
    private final Channel<Unit> boundsUpdateChannel;
    private final List<ContentCaptureEvent> bufferedEvents;
    private boolean checkingForSemanticsChanges;
    private final Runnable contentCaptureChangeChecker;
    private ContentCaptureSessionCompat contentCaptureSession;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private final Handler handler;
    private Function0<? extends ContentCaptureSessionCompat> onContentCaptureSession;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private TranslateStatus translateStatus;
    private final AndroidComposeView view;

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$Companion;", "", "()V", "VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX", "", "VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final enum TranslateStatus extends Enum<TranslateStatus> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ TranslateStatus[] $VALUES = null;
        public static final TranslateStatus SHOW_ORIGINAL = null;
        public static final TranslateStatus SHOW_TRANSLATED = null;

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        public static EnumEntries<TranslateStatus> getEntries() {
            return $ENTRIES;
        }

        public static TranslateStatus valueOf(String r1) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, r1);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }

        private TranslateStatus(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
            SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J0\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods;", "", "()V", "doTranslation", "", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onVirtualViewTranslationResponses", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = null;

        static {
            INSTANCE = new ViewTranslationHelperMethods();
        }

        private ViewTranslationHelperMethods() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onCreateVirtualViewTranslationRequests(AndroidContentCaptureManager r22, long[] r23, int[] r24, Consumer<ViewTranslationRequest> r25) {
            int r2 = r23.length;
            int r3 = 0;
        L3:
            if (r3 >= r2) goto L21;
            SemanticsNodeWithAdjustedBounds r9 = r22.getCurrentSemanticsNodes$ui_release().get((int) r23[r3]);
            if (r9 == null) goto L19;
            SemanticsNode r10 = r9.getSemanticsNode();
            if (r10 == null) goto L19;
            ViewTranslationRequest.Builder r11 = new ViewTranslationRequest.Builder(r22.getView().getAutofillId(), r10.getId());
            List r12 = (List) SemanticsConfigurationKt.getOrNull(r10.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
            if (r12 == null) goto L19;
            String r13 = ListUtilsKt.fastJoinToString$default(r12, "\n", null, null, 0, null, null, 62, null);
            if (r13 == null) goto L19;
            r11.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(r13, null, 2, 0 == true ? 1 : 0)));
            r25.accept(r11.build());
        L19:
            r3 = r3 + 1;
            goto L3
        }

        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager contentCaptureManager, final LongSparseArray<ViewTranslationResponse> r4) {
            if (Build.VERSION.SDK_INT >= 31) goto L6;
            return;
        L6:
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread()) == false) goto L8;
            doTranslation(contentCaptureManager, r4);
            return;
        L8:
            contentCaptureManager.getView().post(new AndroidContentCaptureManager$ViewTranslationHelperMethods$$ExternalSyntheticLambda0(contentCaptureManager, r4));
        }

        static final void onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager $contentCaptureManager, LongSparseArray $response) {
            INSTANCE.doTranslation($contentCaptureManager, $response);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void doTranslation(AndroidContentCaptureManager r14, LongSparseArray<ViewTranslationResponse> r15) {
            int r0 = r15.size();
            int r1 = 0;
        L3:
            if (r1 >= r0) goto L23;
            long r2 = r15.keyAt(r1);
            ViewTranslationResponse r4 = r15.get(r2);
            if (r4 == null) goto L22;
            TranslationResponseValue r5 = r4.getValue("android:text");
            if (r5 == null) goto L22;
            CharSequence r6 = r5.getText();
            if (r6 == null) goto L22;
            SemanticsNodeWithAdjustedBounds r7 = r14.getCurrentSemanticsNodes$ui_release().get((int) r2);
            if (r7 == null) goto L22;
            SemanticsNode r8 = r7.getSemanticsNode();
            if (r8 == null) goto L22;
            AccessibilityAction r9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(r8.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetTextSubstitution());
            if (r9 == null) goto L22;
            Function1 r10 = (Function1) r9.getAction();
            if (r10 == null) goto L22;
            List r12 = null;
            Boolean r11 = (Boolean) r10.invoke(new AnnotatedString(r6.toString(), r12, 2, 0 == true ? 1 : 0));
        L22:
            r1 = r1 + 1;
            goto L3
        }
    }

    /* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ContentCaptureEventType.values().length];
            r0[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    public AndroidContentCaptureManager(AndroidComposeView view, Function0<? extends ContentCaptureSessionCompat> r5) {
        this.view = view;
        this.onContentCaptureSession = r5;
        this.bufferedEvents = new ArrayList();
        this.SendRecurringContentCaptureEventsIntervalMillis = 100;
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        this.currentSemanticsNodesInvalidated = true;
        this.boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
        this.handler = new Handler(Looper.getMainLooper());
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        this.contentCaptureChangeChecker = new AndroidContentCaptureManager$$ExternalSyntheticLambda0(this);
    }

    public static final /* synthetic */ void access$notifySubtreeStateChangeIfNeeded(AndroidContentCaptureManager $this) {
        $this.notifySubtreeStateChangeIfNeeded();
    }

    public static final /* synthetic */ void access$updateBuffersOnAppeared(AndroidContentCaptureManager $this, int index, SemanticsNode node) {
        $this.updateBuffersOnAppeared(index, node);
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final Function0<ContentCaptureSessionCompat> getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final void setOnContentCaptureSession(Function0<? extends ContentCaptureSessionCompat> r1) {
        this.onContentCaptureSession = r1;
    }

    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.contentCaptureSession;
    }

    public final void setContentCaptureSession$ui_release(ContentCaptureSessionCompat r1) {
        this.contentCaptureSession = r1;
    }

    public final Handler getHandler$ui_release() {
        return this.handler;
    }

    public final void setCurrentSemanticsNodes$ui_release(IntObjectMap<SemanticsNodeWithAdjustedBounds> r1) {
        this.currentSemanticsNodes = r1;
    }

    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated == false) goto L6;
        this.currentSemanticsNodesInvalidated = false;
        this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
        this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
    L6:
        return this.currentSemanticsNodes;
    }

    static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager this$0) {
        if (this$0.isEnabled$ui_release() == true) goto L5;
        return;
    L5:
        Owner.measureAndLayout$default(this$0.view, false, 1, null);
        this$0.sendContentCaptureDisappearEvents();
        this$0.sendContentCaptureAppearEvents(this$0.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this$0.previousSemanticsRoot);
        this$0.checkForContentCapturePropertyChanges(this$0.getCurrentSemanticsNodes$ui_release());
        this$0.updateSemanticsCopy();
        this$0.checkingForSemanticsChanges = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final boolean isEnabled$ui_release() {
        if (ContentCaptureManager.Companion.isEnabled() == true) goto L5;
    L7:
        return false;
    L5:
        if (this.contentCaptureSession == null) goto L7;
        return true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009a -> B:15:0x0057). Please report as a decompilation issue!!! */
    public final Object boundsUpdatesEventLoop$ui_release(Continuation<? super Unit> r11) {
        if ((r11 instanceof AndroidContentCaptureManager$boundsUpdatesEventLoop$1) == false) goto L7;
        AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator<Unit> r3 = (ChannelIterator) r0.L$1;
        AndroidContentCaptureManager r5 = (AndroidContentCaptureManager) r0.L$0;
        ResultKt.throwOnFailure($result);
        ChannelIterator<Unit> r6 = r3;
        AndroidContentCaptureManager r4 = r5;
    L15:
        r0.L$0 = r4;
        r0.L$1 = r6;
        r0.label = 1;
        Object r7 = r6.hasNext(r0);
        if (r7 != $result2) goto L18;
        return $result2;
    L18:
        Object r9 = $result2;
        Object $result3 = $result;
        $result = r7;
        AndroidContentCaptureManager r8 = r4;
        Object r10 = r9;
    L20:
        if (((Boolean) $result).booleanValue() == false) goto L33;
        r6.next();
        if (r8.isEnabled$ui_release() == false) goto L25;
        r8.notifyContentCaptureChanges();
    L25:
        if (r8.checkingForSemanticsChanges == true) goto L27;
        r8.checkingForSemanticsChanges = true;
        r8.handler.post(r8.contentCaptureChangeChecker);
    L27:
        long r12 = r8.SendRecurringContentCaptureEventsIntervalMillis;
        r0.L$0 = r8;
        r0.L$1 = r6;
        r0.label = 2;
        if (DelayKt.delay(r12, r0) != r10) goto L30;
        return r10;
    L30:
        $result = $result3;
        $result2 = r10;
        r4 = r8;
        goto L15
    L33:
        return Unit.INSTANCE;
    L13:
        ChannelIterator<Unit> r13 = (ChannelIterator) r0.L$1;
        AndroidContentCaptureManager r14 = (AndroidContentCaptureManager) r0.L$0;
        ResultKt.throwOnFailure($result);
        r8 = r14;
        r6 = r13;
        r10 = $result2;
        $result3 = $result;
        goto L20
    L14:
        ResultKt.throwOnFailure($result);
        r4 = this;
        r6 = r4.boundsUpdateChannel.iterator();
        goto L15
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AndroidContentCaptureManager$boundsUpdatesEventLoop$1(this, r11);
        goto L8
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release() == true) goto L5;
        return;
    L5:
        if (this.checkingForSemanticsChanges == true) goto L9;
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
        return;
    }

    public final void onLayoutChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release() == false) goto L6;
        notifySubtreeStateChangeIfNeeded();
        return;
    }

    private final void sendContentCaptureDisappearEvents() {
        IntObjectMap this_$iv = this.previousSemanticsNodes;
        int[] k$iv = this_$iv.keys;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r18 = r12;
        int key = k$iv[index$iv$iv];
        IntObjectMap this_$iv2 = this_$iv;
        if (getCurrentSemanticsNodes$ui_release().containsKey(key) == true) goto L18;
        bufferContentCaptureViewDisappeared(key);
        notifySubtreeStateChangeIfNeeded();
    L18:
        slot$iv$iv = slot$iv$iv >> r18;
        j$iv$iv = j$iv$iv + 1;
        r12 = r18;
        this_$iv = this_$iv2;
        goto L7
    L17:
        this_$iv2 = this_$iv;
        r18 = r12;
        goto L18
    L11:
        r17 = false;
        goto L12
    L19:
        IntObjectMap this_$iv3 = this_$iv;
        if (bitCount$iv$iv != r12) goto L35;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L36;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv3;
        goto L4
    L36:
        return;
    L35:
        return;
    L22:
        this_$iv3 = this_$iv;
        goto L23
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode newNode, final SemanticsNodeCopy oldNode) {
        fastForEachReplacedVisibleChildren(newNode, new AnonymousClass1(oldNode, this));
        List<SemanticsNode> r0 = newNode.getReplacedChildren$ui_release();
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L15;
        Object item$iv = r0.get(index$iv);
        SemanticsNode child = (SemanticsNode) item$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r7 = getCurrentSemanticsNodes$ui_release();
        int key$iv = child.getId();
        if (r7.containsKey(key$iv) == false) goto L13;
        IntObjectMap this_$iv = this.previousSemanticsNodes;
        int key$iv2 = child.getId();
        if (this_$iv.containsKey(key$iv2) == false) goto L13;
        Object value$iv = this.previousSemanticsNodes.get(child.getId());
        if (value$iv == null) goto L11;
        SemanticsNodeCopy prevNodeCopy = (SemanticsNodeCopy) value$iv;
        sendContentCaptureAppearEvents(child, prevNodeCopy);
        goto L13
    L11:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("node not present in pruned tree before this change");
        throw new KotlinNothingValueException();
    L13:
        index$iv = index$iv + 1;
        goto L3
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> r53) {
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r1 = r53;
        int $i$f$forEachKey = 0;
        int[] k$iv = r1.keys;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r4 = r1;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv = r4.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L99;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L93;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L90;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r19 = true;
    L12:
        if (r19 == false) goto L88;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int id = k$iv[index$iv$iv];
        int r24 = r12;
        SemanticsNodeCopy oldNode = this.previousSemanticsNodes.get(id);
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r29 = r1;
        SemanticsNodeWithAdjustedBounds r30 = r53.get(id);
        if (r30 == null) goto L16;
        SemanticsNode newNode = r30.getSemanticsNode();
    L18:
        if (newNode == null) goto L86;
        if (oldNode != null) goto L49;
        ScatterMap this_$iv = newNode.getUnmergedConfig$ui_release().getProps$ui_release();
        int $i$f$forEachKey2 = $i$f$forEachKey;
        Object[] k$iv2 = this_$iv.keys;
        long[] m$iv$iv2 = this_$iv.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L46;
    L22:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        int[] k$iv3 = k$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r45 = r4;
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        long[] m$iv$iv3 = m$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv2 = (((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv2 == (-9187201950435737472L)) goto L44;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L25:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L42;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L29;
        boolean r5 = true;
    L30:
        if (r5 == false) goto L40;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        int j$iv$iv3 = j$iv$iv2;
        SemanticsPropertyKey key = (SemanticsPropertyKey) k$iv2[index$iv$iv2];
        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getText()) == false) goto L41;
        List r6 = (List) SemanticsConfigurationKt.getOrNull(newNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (r6 == null) goto L36;
        AnnotatedString newText = (AnnotatedString) CollectionsKt.firstOrNull(r6);
    L37:
        sendContentCaptureTextUpdateEvent(newNode.getId(), String.valueOf(newText));
        goto L41
    L36:
        newText = null;
    L41:
        slot$iv$iv2 = slot$iv$iv2 >> r24;
        j$iv$iv2 = j$iv$iv3 + 1;
        goto L25
    L40:
        j$iv$iv3 = j$iv$iv2;
        goto L41
    L29:
        r5 = false;
        goto L30
    L42:
        int j$iv$iv4 = r24;
        if (bitCount$iv$iv2 == j$iv$iv4) goto L44;
    L89:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        r12 = 8;
        r1 = r29;
        $i$f$forEachKey = $i$f$forEachKey2;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv = m$iv$iv3;
        k$iv = k$iv3;
        r4 = r45;
    L44:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L89;
        i$iv$iv2 = i$iv$iv2 + 1;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv = m$iv$iv3;
        k$iv = k$iv3;
        r4 = r45;
        r24 = 8;
        goto L22
    L46:
        k$iv3 = k$iv;
        r45 = r4;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv3 = m$iv$iv;
        goto L89
    L49:
        $i$f$forEachKey2 = $i$f$forEachKey;
        k$iv3 = k$iv;
        r45 = r4;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv3 = m$iv$iv;
        ScatterMap this_$iv2 = newNode.getUnmergedConfig$ui_release().getProps$ui_release();
        Object[] k$iv4 = this_$iv2.keys;
        ScatterMap this_$iv$iv = this_$iv2;
        int $i$f$forEachIndexed3 = 0;
        long[] m$iv$iv4 = this_$iv$iv.metadata;
        int lastIndex$iv$iv3 = m$iv$iv4.length - 2;
        int i$iv$iv3 = 0;
        if (0 > lastIndex$iv$iv3) goto L89;
    L51:
        long slot$iv$iv3 = m$iv$iv4[i$iv$iv3];
        Object[] k$iv5 = k$iv4;
        ScatterMap this_$iv$iv2 = this_$iv$iv;
        int $i$f$forEachIndexed4 = $i$f$forEachIndexed3;
        long[] m$iv$iv5 = m$iv$iv4;
        long $this$maskEmptyOrDeleted$iv$iv$iv3 = (((~slot$iv$iv3) << 7) & slot$iv$iv3) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv3 == (-9187201950435737472L)) goto L80;
        int bitCount$iv$iv3 = 8 - ((~(i$iv$iv3 - lastIndex$iv$iv3)) >>> 31);
        int j$iv$iv5 = 0;
    L54:
        if (j$iv$iv5 >= bitCount$iv$iv3) goto L79;
        long value$iv$iv$iv3 = slot$iv$iv3 & 255;
        if (value$iv$iv$iv3 >= 128) goto L58;
        boolean r7 = true;
    L59:
        if (r7 == false) goto L76;
        int index$iv$iv3 = (i$iv$iv3 << 3) + j$iv$iv5;
        int j$iv$iv6 = j$iv$iv5;
        SemanticsPropertyKey key2 = (SemanticsPropertyKey) k$iv5[index$iv$iv3];
        if (Intrinsics.areEqual(key2, SemanticsProperties.INSTANCE.getText()) == false) goto L77;
        List r8 = (List) SemanticsConfigurationKt.getOrNull(oldNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (r8 == null) goto L65;
        AnnotatedString oldText = (AnnotatedString) CollectionsKt.firstOrNull(r8);
    L66:
        List r9 = (List) SemanticsConfigurationKt.getOrNull(newNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (r9 == null) goto L69;
        AnnotatedString newText2 = (AnnotatedString) CollectionsKt.firstOrNull(r9);
    L71:
        if (Intrinsics.areEqual(oldText, newText2) == true) goto L77;
        sendContentCaptureTextUpdateEvent(newNode.getId(), String.valueOf(newText2));
        goto L77
    L69:
        newText2 = null;
        goto L71
    L65:
        oldText = null;
    L77:
        slot$iv$iv3 = slot$iv$iv3 >> 8;
        j$iv$iv5 = j$iv$iv6 + 1;
        goto L54
    L76:
        j$iv$iv6 = j$iv$iv5;
        goto L77
    L58:
        r7 = false;
        goto L59
    L79:
        if (bitCount$iv$iv3 != 8) goto L89;
    L80:
        if (i$iv$iv3 == lastIndex$iv$iv3) goto L89;
        i$iv$iv3 = i$iv$iv3 + 1;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed4;
        m$iv$iv4 = m$iv$iv5;
        k$iv4 = k$iv5;
        this_$iv$iv = this_$iv$iv2;
        goto L51
    L86:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
        throw new KotlinNothingValueException();
    L16:
        newNode = null;
        goto L18
    L88:
        r29 = r1;
        $i$f$forEachKey2 = $i$f$forEachKey;
        k$iv3 = k$iv;
        r45 = r4;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv3 = m$iv$iv;
        goto L89
    L11:
        r19 = false;
        goto L12
    L90:
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r210 = r1;
        int $i$f$forEachKey3 = $i$f$forEachKey;
        int[] k$iv6 = k$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r46 = r4;
        int $i$f$forEachIndexed5 = $i$f$forEachIndexed;
        long[] m$iv$iv6 = m$iv$iv;
        if (bitCount$iv$iv != r12) goto L120;
    L94:
        if (i$iv$iv == lastIndex$iv$iv) goto L121;
        i$iv$iv = i$iv$iv + 1;
        r1 = r210;
        $i$f$forEachKey = $i$f$forEachKey3;
        $i$f$forEachIndexed = $i$f$forEachIndexed5;
        m$iv$iv = m$iv$iv6;
        k$iv = k$iv6;
        r4 = r46;
        goto L4
    L121:
        return;
    L120:
        return;
    L93:
        r210 = r1;
        $i$f$forEachKey3 = $i$f$forEachKey;
        k$iv6 = k$iv;
        r46 = r4;
        $i$f$forEachIndexed5 = $i$f$forEachIndexed;
        m$iv$iv6 = m$iv$iv;
        goto L94
    }

    private final void sendContentCaptureTextUpdateEvent(int id, String newText) {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return;
    L5:
        ContentCaptureSessionCompat session = this.contentCaptureSession;
        if (session != null) goto L8;
        return;
    L8:
        AutofillId autofillId = session.newAutofillId(id);
        if (autofillId == null) goto L12;
        session.notifyViewTextChanged(autofillId, newText);
        return;
    L12:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid content capture ID");
        throw new KotlinNothingValueException();
    }

    private final void updateSemanticsCopy() {
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r1 = getCurrentSemanticsNodes$ui_release();
        int $i$f$forEach = 0;
        int[] k$iv = r1.keys;
        Object[] v$iv = r1.values;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r5 = r1;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv = r5.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L24;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r15 = r1;
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int key = k$iv[index$iv$iv];
        SemanticsNodeWithAdjustedBounds value = (SemanticsNodeWithAdjustedBounds) v$iv[index$iv$iv];
        this.previousSemanticsNodes.set(key, new SemanticsNodeCopy(value.getSemanticsNode(), getCurrentSemanticsNodes$ui_release()));
    L15:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        r2 = r2;
        k$iv = k$iv;
        v$iv = v$iv;
        r5 = r5;
        $i$f$forEachIndexed = $i$f$forEachIndexed;
        goto L7
    L11:
        r18 = false;
        goto L12
    L16:
        int[] k$iv2 = k$iv;
        Object[] v$iv2 = v$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r23 = r5;
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        if (bitCount$iv$iv != r2) goto L24;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L24;
        i$iv$iv = i$iv$iv + 1;
        r1 = r15;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        v$iv = v$iv2;
        r5 = r23;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        goto L4
    L19:
        k$iv2 = k$iv;
        v$iv2 = v$iv;
        r23 = r5;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
    L24:
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui_release());
    }

    private final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.mo8915trySendJP2dKIU(Unit.INSTANCE);
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode $this$toViewStructure, int index) {
        ContentCaptureSessionCompat session = this.contentCaptureSession;
        if (session != null) goto L6;
        return null;
    L6:
        if (Build.VERSION.SDK_INT >= 29) goto L8;
        return null;
    L8:
        AutofillIdCompat rootAutofillId = ViewCompatShims.getAutofillId(this.view);
        if (rootAutofillId != null) goto L11;
        return null;
    L11:
        SemanticsNode parentNode = $this$toViewStructure.getParent();
        if (parentNode == null) goto L16;
        AutofillId parentAutofillId = session.newAutofillId(parentNode.getId());
        if (parentAutofillId != null) goto L17;
        return null;
    L17:
        ViewStructureCompat structure = session.newVirtualViewStructure(parentAutofillId, $this$toViewStructure.getId());
        if (structure != null) goto L20;
        return null;
    L20:
        SemanticsConfiguration configuration = $this$toViewStructure.getUnmergedConfig$ui_release();
        if (configuration.contains(SemanticsProperties.INSTANCE.getPassword()) == false) goto L23;
        return null;
    L23:
        Bundle it = structure.getExtras();
        if (it == null) goto L27;
        it.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
        it.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, index);
    L27:
        String it2 = (String) SemanticsConfigurationKt.getOrNull(configuration, SemanticsProperties.INSTANCE.getTestTag());
        if (it2 == null) goto L30;
        structure.setId($this$toViewStructure.getId(), null, null, it2);
    L30:
        Boolean r2 = (Boolean) SemanticsConfigurationKt.getOrNull(configuration, SemanticsProperties.INSTANCE.getIsTraversalGroup());
        if (r2 == null) goto L33;
        r2.booleanValue();
        structure.setClassName("android.widget.ViewGroup");
    L33:
        List it3 = (List) SemanticsConfigurationKt.getOrNull(configuration, SemanticsProperties.INSTANCE.getText());
        if (it3 == null) goto L36;
        structure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
        structure.setText(ListUtilsKt.fastJoinToString$default(it3, "\n", null, null, 0, null, null, 62, null));
    L36:
        AnnotatedString it4 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(configuration, SemanticsProperties.INSTANCE.getEditableText());
        if (it4 == null) goto L39;
        structure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
        structure.setText(it4);
    L39:
        List it5 = (List) SemanticsConfigurationKt.getOrNull(configuration, SemanticsProperties.INSTANCE.getContentDescription());
        if (it5 == null) goto L42;
        structure.setContentDescription(ListUtilsKt.fastJoinToString$default(it5, "\n", null, null, 0, null, null, 62, null));
    L42:
        Role r3 = (Role) SemanticsConfigurationKt.getOrNull(configuration, SemanticsProperties.INSTANCE.getRole());
        if (r3 == null) goto L47;
        String it6 = SemanticsUtils_androidKt.m6157toLegacyClassNameV4PA4sw(r3.m6180unboximpl());
        if (it6 == null) goto L47;
        structure.setClassName(it6);
    L47:
        TextLayoutResult it7 = SemanticsUtils_androidKt.getTextLayoutResult(configuration);
        if (it7 == null) goto L50;
        TextLayoutInput input = it7.getLayoutInput();
        float px = (TextUnit.m7167getValueimpl(input.getStyle().m6448getFontSizeXSAIIZE()) * input.getDensity().getDensity()) * input.getDensity().getFontScale();
        structure.setTextStyle(px, 0, 0, 0);
    L50:
        Rect $this$toViewStructure_u24lambda_u2418 = $this$toViewStructure.getBoundsInParent$ui_release();
        structure.setDimens((int) $this$toViewStructure_u24lambda_u2418.getLeft(), (int) $this$toViewStructure_u24lambda_u2418.getTop(), 0, 0, (int) ($this$toViewStructure_u24lambda_u2418.getRight() - $this$toViewStructure_u24lambda_u2418.getLeft()), (int) ($this$toViewStructure_u24lambda_u2418.getBottom() - $this$toViewStructure_u24lambda_u2418.getTop()));
        return structure;
    L16:
        parentAutofillId = rootAutofillId.toAutofillId();
        goto L17
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode $this$fastForEachReplacedVisibleChildren, Function2<? super Integer, ? super SemanticsNode, Unit> r14) {
        List<SemanticsNode> r0 = $this$fastForEachReplacedVisibleChildren.getReplacedChildren$ui_release();
        int i$iv = 0;
        int index$iv = 0;
        int r5 = r0.size();
    L3:
        if (index$iv >= r5) goto L9;
        Object item$iv = r0.get(index$iv);
        SemanticsNode it = (SemanticsNode) item$iv;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r9 = getCurrentSemanticsNodes$ui_release();
        int key$iv = it.getId();
        if (r9.containsKey(key$iv) == false) goto L7;
        r14.invoke(Integer.valueOf(i$iv), item$iv);
        i$iv = i$iv + 1;
    L7:
        index$iv = index$iv + 1;
        goto L3
    }

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> r7, Function2<? super Integer, ? super T, Unit> r8, Function1<? super T, Boolean> r9) {
        int i = 0;
        int index = 0;
        int r3 = r7.size();
    L3:
        if (index >= r3) goto L8;
        Object item = r7.get(index);
        if (r9.invoke(item).booleanValue() == false) goto L7;
        r8.invoke(Integer.valueOf(i), item);
        i = i + 1;
    L7:
        index = index + 1;
        goto L3
    }

    private final void bufferContentCaptureViewAppeared(int virtualId, ViewStructureCompat viewStructure) {
        if (viewStructure != null) goto L4;
        return;
    L4:
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructure));
    }

    private final void bufferContentCaptureViewDisappeared(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionCompat session = this.contentCaptureSession;
        if (session != null) goto L6;
        return;
    L6:
        if (Build.VERSION.SDK_INT >= 29) goto L9;
        return;
    L9:
        if (this.bufferedEvents.isEmpty() == true) goto L30;
        List<ContentCaptureEvent> r1 = this.bufferedEvents;
        int index$iv = 0;
        int r4 = r1.size();
    L11:
        if (index$iv >= r4) goto L22;
        Object item$iv = r1.get(index$iv);
        ContentCaptureEvent event = (ContentCaptureEvent) item$iv;
        switch(WhenMappings.$EnumSwitchMapping$0[event.getType().ordinal()]) {
            case 1: goto L18;
            case 2: goto L15;
            default: goto L21;
        };
    L15:
        AutofillId autofillId = session.newAutofillId(event.getId());
        if (autofillId == null) goto L21;
        session.notifyViewDisappeared(autofillId);
        goto L21
    L18:
        ViewStructureCompat node = event.getStructureCompat();
        if (node == null) goto L21;
        session.notifyViewAppeared(node.toViewStructure());
    L21:
        index$iv = index$iv + 1;
        goto L11
    L22:
        session.flush();
        this.bufferedEvents.clear();
        return;
    }

    private final void updateBuffersOnAppeared(int index, SemanticsNode node) {
        if (isEnabled$ui_release() == true) goto L5;
        return;
    L5:
        updateTranslationOnAppeared(node);
        bufferContentCaptureViewAppeared(node.getId(), toViewStructure(node, index));
        fastForEachReplacedVisibleChildren(node, new C06251(this));
    }

    private final void updateBuffersOnDisappeared(SemanticsNode node) {
        if (isEnabled$ui_release() == true) goto L5;
        return;
    L5:
        bufferContentCaptureViewDisappeared(node.getId());
        List<SemanticsNode> r0 = node.getReplacedChildren$ui_release();
        int index$iv = 0;
        int r3 = r0.size();
    L6:
        if (index$iv >= r3) goto L9;
        Object item$iv = r0.get(index$iv);
        SemanticsNode child = (SemanticsNode) item$iv;
        updateBuffersOnDisappeared(child);
        index$iv = index$iv + 1;
        goto L6
    }

    private final void updateTranslationOnAppeared(SemanticsNode node) {
        SemanticsConfiguration config = node.getUnmergedConfig$ui_release();
        Boolean isShowingTextSubstitution = (Boolean) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus != TranslateStatus.SHOW_ORIGINAL) goto L12;
        if (Intrinsics.areEqual(isShowingTextSubstitution, true) == false) goto L12;
        AccessibilityAction r2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getShowTextSubstitution());
        if (r2 == null) goto L21;
        Function1 r3 = (Function1) r2.getAction();
        if (r3 == null) goto L22;
        Boolean r4 = (Boolean) r3.invoke(false);
        return;
    L22:
        return;
    L21:
        return;
    L12:
        if (this.translateStatus == TranslateStatus.SHOW_TRANSLATED) goto L14;
        return;
    L14:
        if (Intrinsics.areEqual(isShowingTextSubstitution, false) == false) goto L25;
        AccessibilityAction r5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getShowTextSubstitution());
        if (r5 == null) goto L26;
        Function1 r6 = (Function1) r5.getAction();
        if (r6 == null) goto L27;
        Boolean r7 = (Boolean) r6.invoke(true);
        return;
    L27:
        return;
    L26:
        return;
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    private final void showTranslatedText() {
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r0 = getCurrentSemanticsNodes$ui_release();
        int $i$f$forEachValue = 0;
        Object[] v$iv = r0.values;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L32;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L26;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L23;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L21;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        SemanticsNodeWithAdjustedBounds node = (SemanticsNodeWithAdjustedBounds) v$iv[index$iv$iv];
        int r21 = r11;
        SemanticsConfiguration config = node.getSemanticsNode().getUnmergedConfig$ui_release();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r22 = r0;
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), false) == false) goto L22;
        AccessibilityAction r1 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getShowTextSubstitution());
        if (r1 == null) goto L22;
        Function1 r2 = (Function1) r1.getAction();
        if (r2 == null) goto L22;
        Boolean r3 = (Boolean) r2.invoke(true);
    L22:
        slot$iv$iv = slot$iv$iv >> r21;
        j$iv$iv = j$iv$iv + 1;
        $i$f$forEachValue = $i$f$forEachValue2;
        r11 = r21;
        r0 = r22;
        goto L7
    L21:
        r22 = r0;
        $i$f$forEachValue2 = $i$f$forEachValue;
        r21 = r11;
        goto L22
    L11:
        r13 = false;
        goto L12
    L23:
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r23 = r0;
        int $i$f$forEachValue3 = $i$f$forEachValue;
        if (bitCount$iv$iv != r11) goto L41;
    L27:
        if (i$iv$iv == lastIndex$iv$iv) goto L42;
        i$iv$iv = i$iv$iv + 1;
        $i$f$forEachValue = $i$f$forEachValue3;
        r0 = r23;
        goto L4
    L42:
        return;
    L41:
        return;
    L26:
        r23 = r0;
        $i$f$forEachValue3 = $i$f$forEachValue;
        goto L27
    }

    private final void hideTranslatedText() {
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r0 = getCurrentSemanticsNodes$ui_release();
        int $i$f$forEachValue = 0;
        Object[] v$iv = r0.values;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L32;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L26;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L23;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L21;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        SemanticsNodeWithAdjustedBounds node = (SemanticsNodeWithAdjustedBounds) v$iv[index$iv$iv];
        int r21 = r11;
        SemanticsConfiguration config = node.getSemanticsNode().getUnmergedConfig$ui_release();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r22 = r0;
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), true) == false) goto L22;
        AccessibilityAction r1 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getShowTextSubstitution());
        if (r1 == null) goto L22;
        Function1 r2 = (Function1) r1.getAction();
        if (r2 == null) goto L22;
        Boolean r3 = (Boolean) r2.invoke(false);
    L22:
        slot$iv$iv = slot$iv$iv >> r21;
        j$iv$iv = j$iv$iv + 1;
        $i$f$forEachValue = $i$f$forEachValue2;
        r11 = r21;
        r0 = r22;
        goto L7
    L21:
        r22 = r0;
        $i$f$forEachValue2 = $i$f$forEachValue;
        r21 = r11;
        goto L22
    L11:
        r13 = false;
        goto L12
    L23:
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r23 = r0;
        int $i$f$forEachValue3 = $i$f$forEachValue;
        if (bitCount$iv$iv != r11) goto L41;
    L27:
        if (i$iv$iv == lastIndex$iv$iv) goto L42;
        i$iv$iv = i$iv$iv + 1;
        $i$f$forEachValue = $i$f$forEachValue3;
        r0 = r23;
        goto L4
    L42:
        return;
    L41:
        return;
    L26:
        r23 = r0;
        $i$f$forEachValue3 = $i$f$forEachValue;
        goto L27
    }

    private final void clearTranslatedText() {
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r0 = getCurrentSemanticsNodes$ui_release();
        Object[] v$iv = r0.values;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L32;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L26;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L23;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r16 = true;
    L12:
        if (r16 == false) goto L21;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        SemanticsNodeWithAdjustedBounds node = (SemanticsNodeWithAdjustedBounds) v$iv[index$iv$iv];
        int r19 = r11;
        SemanticsConfiguration config = node.getSemanticsNode().getUnmergedConfig$ui_release();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r20 = r0;
        if (SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) == null) goto L22;
        AccessibilityAction r1 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getClearTextSubstitution());
        if (r1 == null) goto L22;
        Function0 r2 = (Function0) r1.getAction();
        if (r2 == null) goto L22;
        Boolean r3 = (Boolean) r2.invoke();
    L22:
        slot$iv$iv = slot$iv$iv >> r19;
        j$iv$iv = j$iv$iv + 1;
        r11 = r19;
        r0 = r20;
        goto L7
    L21:
        r20 = r0;
        r19 = r11;
        goto L22
    L11:
        r16 = false;
        goto L12
    L23:
        IntObjectMap<SemanticsNodeWithAdjustedBounds> r21 = r0;
        if (bitCount$iv$iv != r11) goto L41;
    L27:
        if (i$iv$iv == lastIndex$iv$iv) goto L42;
        i$iv$iv = i$iv$iv + 1;
        r0 = r21;
        goto L4
    L42:
        return;
    L41:
        return;
    L26:
        r21 = r0;
        goto L27
    }

    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> r4) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, virtualIds, supportedFormats, r4);
    }

    public final void onVirtualViewTranslationResponses$ui_release(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> r3) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(contentCaptureManager, r3);
    }
}
