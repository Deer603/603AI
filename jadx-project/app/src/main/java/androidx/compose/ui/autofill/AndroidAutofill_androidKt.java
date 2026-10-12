package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"performAutofill", "", "Landroidx/compose/ui/autofill/AndroidAutofill;", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "root", "Landroid/view/ViewStructure;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidAutofill_androidKt {
    public static final void populateViewStructure(AndroidAutofill $this$populateViewStructure, ViewStructure root) {
        ViewStructure r0 = root;
        if ($this$populateViewStructure.getAutofillTree().getChildren().isEmpty() == false) goto L5;
        return;
    L5:
        int index = AutofillApi26Helper.INSTANCE.addChildCount(r0, $this$populateViewStructure.getAutofillTree().getChildren().size());
        Iterator<Map.Entry<Integer, AutofillNode>> r2 = $this$populateViewStructure.getAutofillTree().getChildren().entrySet().iterator();
    L7:
        if (r2.hasNext() == false) goto L16;
        Map.Entry<Integer, AutofillNode> r3 = r2.next();
        int id = r3.getKey().intValue();
        AutofillNode autofillNode = r3.getValue();
        ViewStructure child = AutofillApi26Helper.INSTANCE.newChild(r0, index);
        AutofillApi26Helper.INSTANCE.setAutofillId(child, $this$populateViewStructure.getRootAutofillId(), id);
        AutofillApi26Helper.INSTANCE.setId(child, id, $this$populateViewStructure.getView().getContext().getPackageName(), null, null);
        AutofillApi26Helper.INSTANCE.setAutofillType(child, ContentDataType_androidKt.getDataType(ContentDataType.Companion.getText()));
        AutofillApi26Helper r5 = AutofillApi26Helper.INSTANCE;
        List<AutofillType> r8 = autofillNode.getAutofillTypes();
        Collection target$iv = new ArrayList(r8.size());
        int index$iv$iv = 0;
        int r14 = r8.size();
    L9:
        if (index$iv$iv >= r14) goto L11;
        Object item$iv$iv = r8.get(index$iv$iv);
        AutofillType it = (AutofillType) item$iv$iv;
        int index2 = index;
        target$iv.add(AndroidAutofillType_androidKt.getAndroidType(it));
        index$iv$iv = index$iv$iv + 1;
        index = index2;
        goto L9
    L11:
        int index3 = index;
        Collection $this$toTypedArray$iv = (List) target$iv;
        r5.setAutofillHints(child, (String[]) $this$toTypedArray$iv.toArray(new String[0]));
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox != null) goto L14;
        Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
    L15:
        index = index3 + 1;
        r0 = root;
        goto L7
    L14:
        float $this$fastRoundToInt$iv = boundingBox.getLeft();
        int left = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = boundingBox.getTop();
        int top = Math.round($this$fastRoundToInt$iv2);
        float $this$fastRoundToInt$iv3 = boundingBox.getRight();
        int right = Math.round($this$fastRoundToInt$iv3);
        float $this$fastRoundToInt$iv4 = boundingBox.getBottom();
        int bottom = Math.round($this$fastRoundToInt$iv4);
        int width = right - left;
        int height = bottom - top;
        AutofillApi26Helper.INSTANCE.setDimens(child, left, top, 0, 0, width, height);
        goto L15
    }

    public static final void performAutofill(AndroidAutofill $this$performAutofill, SparseArray<AutofillValue> r7) {
        if ($this$performAutofill.getAutofillTree().getChildren().isEmpty() == false) goto L5;
        return;
    L5:
        int index = 0;
        int r1 = r7.size();
    L6:
        if (index >= r1) goto L23;
        int itemId = r7.keyAt(index);
        AutofillValue value = r7.get(itemId);
        if (AutofillApi26Helper.INSTANCE.isText(value) == false) goto L11;
        $this$performAutofill.getAutofillTree().performAutofill(itemId, AutofillApi26Helper.INSTANCE.textValue(value).toString());
    L16:
        index = index + 1;
        goto L6
    L11:
        if (AutofillApi26Helper.INSTANCE.isDate(value) == true) goto L22;
        if (AutofillApi26Helper.INSTANCE.isList(value) == true) goto L20;
        if (AutofillApi26Helper.INSTANCE.isToggle(value) == false) goto L16;
        throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
    L20:
        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
    L22:
        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
    }
}
