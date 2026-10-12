package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import kotlin.Metadata;

/* JADX INFO: compiled from: Savers.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"LineBreakSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak;", "", "PlatformParagraphStyleSaver", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "TextMotionSaver", "Landroidx/compose/ui/text/style/TextMotion;", "Saver", "Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "getSaver", "(Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak$Companion;", "(Landroidx/compose/ui/text/style/LineBreak$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextMotion$Companion;", "(Landroidx/compose/ui/text/style/TextMotion$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Savers_androidKt {
    private static final Saver<LineBreak, Object> LineBreakSaver = null;
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = null;
    private static final Saver<TextMotion, Object> TextMotionSaver = null;

    public static final Saver<PlatformParagraphStyle, Object> getSaver(PlatformParagraphStyle.Companion $this$Saver) {
        return PlatformParagraphStyleSaver;
    }

    static {
        PlatformParagraphStyleSaver = SaverKt.Saver(Savers_androidKt$PlatformParagraphStyleSaver$1.INSTANCE, Savers_androidKt$PlatformParagraphStyleSaver$2.INSTANCE);
        LineBreakSaver = SaverKt.Saver(Savers_androidKt$LineBreakSaver$1.INSTANCE, Savers_androidKt$LineBreakSaver$2.INSTANCE);
        TextMotionSaver = SaverKt.Saver(Savers_androidKt$TextMotionSaver$1.INSTANCE, Savers_androidKt$TextMotionSaver$2.INSTANCE);
    }

    public static final Saver<LineBreak, Object> getSaver(LineBreak.Companion $this$Saver) {
        return LineBreakSaver;
    }

    public static final Saver<TextMotion, Object> getSaver(TextMotion.Companion $this$Saver) {
        return TextMotionSaver;
    }
}
