package androidx.compose.ui.autofill;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.collection.ScatterMap;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsInfoKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PopulateViewStructure.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0001¨\u0006\u000b"}, d2 = {"populate", "", "Landroid/view/ViewStructure;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "packageName", "", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PopulateViewStructure_androidKt {
    public static final void populate(final ViewStructure $this$populate, SemanticsInfo semanticsInfo, AutofillId rootAutofillId, String packageName, RectManager rectManager) {
        final AutofillApi26Helper autofillApi = AutofillApi26Helper.INSTANCE;
        SemanticsProperties properties = SemanticsProperties.INSTANCE;
        SemanticsActions actions = SemanticsActions.INSTANCE;
        Object maxTextLengthProp = null;
        Role r9 = null;
        Boolean r10 = null;
        Object toggleableStateProp = null;
        List r12 = null;
        boolean hasSetTextAction = false;
        SemanticsConfiguration r14 = semanticsInfo.getSemanticsConfiguration();
        AnnotatedString r16 = null;
        boolean isPasswordProp = false;
        if (r14 == null) goto L76;
        ScatterMap r15 = r14.getProps$ui_release();
        if (r15 == null) goto L76;
        ScatterMap this_$iv = r15;
        Object[] k$iv = this_$iv.keys;
        int r28 = 8;
        Object[] v$iv = this_$iv.values;
        ScatterMap this_$iv$iv = this_$iv;
        ContentDataType r29 = null;
        long[] m$iv$iv = this_$iv$iv.metadata;
        ContentType r31 = null;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L73;
    L8:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        Object[] k$iv2 = k$iv;
        ScatterMap this_$iv$iv2 = this_$iv$iv;
        SemanticsProperties properties2 = properties;
        SemanticsActions actions2 = actions;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L71;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L11:
        if (j$iv$iv >= bitCount$iv$iv) goto L66;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L15;
        boolean r6 = true;
    L16:
        if (r6 == false) goto L64;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r40 = k$iv2[index$iv$iv];
        int j$iv$iv2 = j$iv$iv;
        Object value = v$iv[index$iv$iv];
        SemanticsPropertyKey property = (SemanticsPropertyKey) r40;
        if (Intrinsics.areEqual(property, properties2.getContentDataType()) == false) goto L21;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
        r29 = (ContentDataType) value;
    L65:
        slot$iv$iv = slot$iv$iv >> r28;
        j$iv$iv = j$iv$iv2 + 1;
        goto L11
    L21:
        if (Intrinsics.areEqual(property, properties2.getContentDescription()) == false) goto L27;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        String it = (String) CollectionsKt.firstOrNull((List) value);
        if (it == null) goto L25;
        autofillApi.setContentDescription($this$populate, it);
    L25:
        Object maxTextLengthProp2 = maxTextLengthProp;
    L62:
        maxTextLengthProp = maxTextLengthProp2;
        goto L65
    L27:
        if (Intrinsics.areEqual(property, properties2.getContentType()) == false) goto L30;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
        r31 = (ContentType) value;
        goto L65
    L30:
        if (Intrinsics.areEqual(property, properties2.getEditableText()) == false) goto L33;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
        r16 = (AnnotatedString) value;
        goto L65
    L33:
        if (Intrinsics.areEqual(property, properties2.getFocused()) == false) goto L35;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Boolean");
        autofillApi.setFocused($this$populate, ((Boolean) value).booleanValue());
        maxTextLengthProp2 = maxTextLengthProp;
        goto L62
    L35:
        maxTextLengthProp2 = maxTextLengthProp;
        if (Intrinsics.areEqual(property, properties2.getMaxTextLength()) == false) goto L39;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
        maxTextLengthProp = (Integer) value;
        goto L65
    L39:
        if (Intrinsics.areEqual(property, properties2.getPassword()) == false) goto L42;
        isPasswordProp = true;
        maxTextLengthProp = maxTextLengthProp2;
        goto L65
    L42:
        if (Intrinsics.areEqual(property, properties2.getRole()) == false) goto L45;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
        r9 = (Role) value;
        maxTextLengthProp = maxTextLengthProp2;
        goto L65
    L45:
        if (Intrinsics.areEqual(property, properties2.getSelected()) == false) goto L48;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Boolean");
        r10 = (Boolean) value;
        maxTextLengthProp = maxTextLengthProp2;
        goto L65
    L48:
        if (Intrinsics.areEqual(property, properties2.getToggleableState()) == false) goto L51;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
        toggleableStateProp = (ToggleableState) value;
        maxTextLengthProp = maxTextLengthProp2;
        goto L65
    L51:
        if (Intrinsics.areEqual(property, actions2.getOnClick()) == false) goto L54;
        autofillApi.setClickable($this$populate, true);
        goto L62
    L54:
        if (Intrinsics.areEqual(property, actions2.getOnLongClick()) == false) goto L57;
        autofillApi.setLongClickable($this$populate, true);
        goto L62
    L57:
        if (Intrinsics.areEqual(property, actions2.getRequestFocus()) == false) goto L60;
        autofillApi.setFocusable($this$populate, true);
        goto L62
    L60:
        if (Intrinsics.areEqual(property, actions2.getSetText()) == false) goto L62;
        hasSetTextAction = true;
        maxTextLengthProp = maxTextLengthProp2;
        goto L65
    L64:
        j$iv$iv2 = j$iv$iv;
        goto L65
    L15:
        r6 = false;
        goto L16
    L66:
        Object maxTextLengthProp3 = maxTextLengthProp;
        int j$iv$iv3 = r28;
        if (bitCount$iv$iv != j$iv$iv3) goto L69;
        maxTextLengthProp = maxTextLengthProp3;
        goto L71
    L69:
        AnnotatedString r4 = r16;
        boolean isPasswordProp2 = isPasswordProp;
        ContentDataType r2 = r29;
        maxTextLengthProp = maxTextLengthProp3;
        ContentType r3 = r31;
    L75:
        ContentDataType r210 = r2;
        ContentType r32 = r3;
        r16 = r4;
        isPasswordProp = isPasswordProp2;
    L77:
        SemanticsConfiguration r5 = SemanticsInfoKt.mergedSemanticsConfiguration(semanticsInfo);
        if (r5 == null) goto L110;
        ScatterMap r7 = r5.getProps$ui_release();
        if (r7 == null) goto L110;
        ScatterMap this_$iv2 = r7;
        int $i$f$forEach = 0;
        Object[] k$iv3 = this_$iv2.keys;
        Object[] v$iv2 = this_$iv2.values;
        ScatterMap this_$iv$iv3 = this_$iv2;
        long[] m$iv$iv2 = this_$iv$iv3.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L110;
    L83:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        int $i$f$forEach2 = $i$f$forEach;
        Object[] k$iv4 = k$iv3;
        Object[] v$iv3 = v$iv2;
        ScatterMap this_$iv$iv4 = this_$iv$iv3;
        long $this$maskEmptyOrDeleted$iv$iv$iv2 = (((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv2 == (-9187201950435737472L)) goto L105;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv4 = 0;
    L86:
        if (j$iv$iv4 >= bitCount$iv$iv2) goto L102;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L90;
        boolean r8 = true;
    L91:
        if (r8 == false) goto L99;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv4;
        Object r41 = k$iv4[index$iv$iv2];
        int j$iv$iv5 = j$iv$iv4;
        Object value2 = v$iv3[index$iv$iv2];
        SemanticsPropertyKey property2 = (SemanticsPropertyKey) r41;
        if (Intrinsics.areEqual(property2, properties2.getDisabled()) == false) goto L96;
        autofillApi.setEnabled($this$populate, false);
    L100:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv4 = j$iv$iv5 + 1;
        goto L86
    L96:
        if (Intrinsics.areEqual(property2, properties2.getText()) == false) goto L100;
        Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
        r12 = (List) value2;
        goto L100
    L99:
        j$iv$iv5 = j$iv$iv4;
        goto L100
    L90:
        r8 = false;
        goto L91
    L102:
        if (bitCount$iv$iv2 != 8) goto L110;
    L105:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L110;
        i$iv$iv2 = i$iv$iv2 + 1;
        $i$f$forEach = $i$f$forEach2;
        v$iv2 = v$iv3;
        this_$iv$iv3 = this_$iv$iv4;
        k$iv3 = k$iv4;
    L110:
        Integer r11 = Integer.valueOf(semanticsInfo.getSemanticsId());
        r11.intValue();
        if (semanticsInfo.getParentInfo() != null) goto L113;
        int it2 = 1;
    L114:
        Integer autofillType = null;
        if (it2 == 0) goto L118;
        r11 = null;
    L118:
        if (r11 == null) goto L120;
        int semanticsId = r11.intValue();
    L121:
        autofillApi.setAutofillId($this$populate, rootAutofillId, semanticsId);
        autofillApi.setId($this$populate, semanticsId, packageName, null, null);
        if (r210 == null) goto L125;
        autofillType = Integer.valueOf(ContentDataType_androidKt.getDataType(r210));
    L131:
        if (autofillType == null) goto L133;
        int it3 = autofillType.intValue();
        autofillApi.setAutofillType($this$populate, it3);
    L133:
        if (r32 == null) goto L137;
        String[] it4 = ContentType_androidKt.getContentHints(r32);
        if (it4 == null) goto L137;
        autofillApi.setAutofillHints($this$populate, it4);
    L137:
        rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new AnonymousClass5(autofillApi, $this$populate));
        if (r10 == null) goto L140;
        boolean it5 = r10.booleanValue();
        autofillApi.setSelected($this$populate, it5);
    L140:
        Object toggleableState = toggleableStateProp;
        Boolean selected = r10;
        if (toggleableState == null) goto L147;
        autofillApi.setCheckable($this$populate, true);
        if (toggleableState != ToggleableState.On) goto L145;
        boolean r13 = true;
    L146:
        autofillApi.setChecked($this$populate, r13);
    L154:
        String passwordHint = (String) ArraysKt.first(ContentType_androidKt.getContentHints(ContentType.Companion.getPassword()));
        if (r32 == null) goto L161;
        String[] r17 = ContentType_androidKt.getContentHints(r32);
        if (r17 == null) goto L161;
        if (ArraysKt.contains(r17, passwordHint) != true) goto L161;
        boolean contentTypePassword = true;
    L162:
        if (isPasswordProp == true) goto L166;
        if (contentTypePassword == true) goto L166;
        boolean isPassword = false;
    L167:
        if (isPassword == false) goto L170;
        autofillApi.setDataIsSensitive($this$populate, true);
    L170:
        if (semanticsInfo.isTransparent() == false) goto L172;
        int r18 = 4;
    L173:
        autofillApi.setVisibility($this$populate, r18);
        if (r12 == null) goto L181;
        List it6 = r12;
        List $this$fastForEach$iv = it6;
        int semanticsId2 = $this$fastForEach$iv.size();
        String r19 = "";
        int index$iv = 0;
    L176:
        if (index$iv >= semanticsId2) goto L178;
        int r22 = semanticsId2;
        List $this$fastForEach$iv2 = $this$fastForEach$iv;
        Object item$iv = $this$fastForEach$iv2.get(index$iv);
        AnnotatedString text = (AnnotatedString) item$iv;
        r19 = r19 + text.getText() + '\n';
        index$iv = index$iv + 1;
        semanticsId2 = r22;
        $this$fastForEach$iv = $this$fastForEach$iv2;
        goto L176
    L178:
        Object concatenatedText = r19;
        autofillApi.setText($this$populate, (CharSequence) concatenatedText);
        autofillApi.setClassName($this$populate, AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
    L181:
        if (semanticsInfo.getChildrenInfo().isEmpty() == false) goto L186;
        if (r9 == null) goto L186;
        String it7 = SemanticsUtils_androidKt.m6157toLegacyClassNameV4PA4sw(r9.m6180unboximpl());
        if (it7 == null) goto L186;
        autofillApi.setClassName($this$populate, it7);
    L186:
        if (hasSetTextAction == false) goto L218;
        autofillApi.setClassName($this$populate, AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
        if (Build.VERSION.SDK_INT < 28) goto L191;
        if (maxTextLengthProp == null) goto L191;
        int it8 = ((Number) maxTextLengthProp).intValue();
        AutofillApi28Helper.INSTANCE.setMaxTextLength($this$populate, it8);
    L191:
        if (r16 == null) goto L193;
        AnnotatedString it9 = r16;
        autofillApi.setAutofillValue($this$populate, autofillApi.getAutofillTextValue(it9.getText()));
    L193:
        if (isPassword == false) goto L219;
        autofillApi.setInputType($this$populate, 129);
        return;
    L219:
        return;
    L218:
        return;
    L172:
        r18 = 0;
    L166:
        isPassword = true;
    L161:
        contentTypePassword = false;
        goto L162
    L145:
        r13 = false;
        goto L146
    L147:
        if (selected == null) goto L154;
        int r20 = Role.Companion.m6188getTabo7Vup1c();
        if (r9 != null) goto L151;
        boolean r21 = false;
    L152:
        if (r21 == true) goto L154;
        autofillApi.setCheckable($this$populate, true);
        autofillApi.setChecked($this$populate, selected.booleanValue());
        goto L154
    L151:
        r21 = Role.m6177equalsimpl0(r9.m6180unboximpl(), r20);
        goto L152
    L125:
        if (hasSetTextAction == false) goto L127;
        autofillType = 1;
        goto L131
    L127:
        if (toggleableStateProp == null) goto L131;
        autofillType = 2;
        goto L131
    L120:
        semanticsId = -1;
        goto L121
    L113:
        it2 = 0;
    L71:
        if (i$iv$iv == lastIndex$iv$iv) goto L74;
        i$iv$iv = i$iv$iv + 1;
        properties = properties2;
        actions = actions2;
        k$iv = k$iv2;
        this_$iv$iv = this_$iv$iv2;
        r28 = 8;
    L74:
        r4 = r16;
        isPasswordProp2 = isPasswordProp;
        r2 = r29;
        r3 = r31;
        goto L75
    L73:
        properties2 = properties;
    L76:
        r210 = null;
        r32 = null;
        properties2 = properties;
        goto L77
    }
}
