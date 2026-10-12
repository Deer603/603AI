package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class KeyEventDispatcher {
    private static boolean sActionBarFieldsFetched;
    private static Method sActionBarOnMenuKeyMethod;
    private static boolean sDialogFieldsFetched;
    private static Field sDialogKeyListenerField;

    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent r1);
    }

    static {
        sActionBarFieldsFetched = false;
        sActionBarOnMenuKeyMethod = null;
        sDialogFieldsFetched = false;
        sDialogKeyListenerField = null;
    }

    private KeyEventDispatcher() {
    }

    public static boolean dispatchBeforeHierarchy(View root, KeyEvent event) {
        return ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(root, event);
    }

    public static boolean dispatchKeyEvent(Component component, View root, Window.Callback callback, KeyEvent event) {
        if (component != null) goto L6;
        return false;
    L6:
        if (Build.VERSION.SDK_INT < 28) goto L10;
        return component.superDispatchKeyEvent(event);
    L10:
        if ((callback instanceof Activity) == false) goto L14;
        return activitySuperDispatchKeyEventPre28((Activity) callback, event);
    L14:
        if ((callback instanceof Dialog) == true) goto L16;
        if (root == null) goto L21;
        if (ViewCompat.dispatchUnhandledKeyEventBeforeCallback(root, event) == false) goto L21;
    L22:
        return true;
    L21:
        if (component.superDispatchKeyEvent(event) == true) goto L22;
        return false;
    L16:
        return dialogSuperDispatchKeyEventPre28((Dialog) callback, event);
    }

    private static boolean actionBarOnMenuKeyEventPre28(ActionBar actionBar, KeyEvent event) {
        if (sActionBarFieldsFetched == true) goto L10;
        sActionBarOnMenuKeyMethod = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});     // Catch: NoSuchMethodException -> L7
    L8:
        sActionBarFieldsFetched = true;
    L10:
        if (sActionBarOnMenuKeyMethod != null) goto L22;
    L19:
        return false;
    L22:
        Object value = sActionBarOnMenuKeyMethod.invoke(actionBar, new Object[]{event});     // Catch: InvocationTargetException -> L16 IllegalAccessException -> L18
        if (value != null) goto L14;
        return false;
    L14:
        return ((Boolean) value).booleanValue();
        goto L19
    }

    private static boolean activitySuperDispatchKeyEventPre28(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8) == false) goto L11;
        ActionBar actionBar = activity.getActionBar();
        int keyCode = event.getKeyCode();
        if (keyCode != 82) goto L11;
        if (actionBar == null) goto L11;
        if (actionBarOnMenuKeyEventPre28(actionBar, event) == false) goto L11;
        return true;
    L11:
        if (win.superDispatchKeyEvent(event) == false) goto L13;
        return true;
    L13:
        View decor = win.getDecorView();
        if (ViewCompat.dispatchUnhandledKeyEventBeforeCallback(decor, event) == false) goto L16;
        return true;
    L16:
        if (decor == null) goto L18;
        KeyEvent.DispatcherState r2 = decor.getKeyDispatcherState();
    L20:
        return event.dispatch(activity, r2, activity);
    L18:
        r2 = null;
        goto L20
    }

    private static DialogInterface.OnKeyListener getDialogKeyListenerPre28(Dialog dialog) {
        if (sDialogFieldsFetched == true) goto L10;
        sDialogKeyListenerField = Dialog.class.getDeclaredField("mOnKeyListener");     // Catch: NoSuchFieldException -> L7
        sDialogKeyListenerField.setAccessible(true);     // Catch: NoSuchFieldException -> L7
    L8:
        sDialogFieldsFetched = true;
    L10:
        if (sDialogKeyListenerField == null) goto L20;
        return (DialogInterface.OnKeyListener) sDialogKeyListenerField.get(dialog);
    L14:
        return null;
    L20:
        return null;
    }

    private static boolean dialogSuperDispatchKeyEventPre28(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = getDialogKeyListenerPre28(dialog);
        if (onKeyListener != null) goto L5;
    L7:
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event) == false) goto L10;
        return true;
    L10:
        View decor = win.getDecorView();
        if (ViewCompat.dispatchUnhandledKeyEventBeforeCallback(decor, event) == false) goto L13;
        return true;
    L13:
        if (decor == null) goto L15;
        KeyEvent.DispatcherState r1 = decor.getKeyDispatcherState();
    L17:
        return event.dispatch(dialog, r1, dialog);
    L15:
        r1 = null;
        goto L17
    L5:
        if (onKeyListener.onKey(dialog, event.getKeyCode(), event) == false) goto L7;
        return true;
    }
}
