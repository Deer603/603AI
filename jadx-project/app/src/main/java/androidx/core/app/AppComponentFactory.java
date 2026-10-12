package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class AppComponentFactory extends android.app.AppComponentFactory {
    public AppComponentFactory() {
    }

    public final Activity instantiateActivity(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.checkCompatWrapper(instantiateActivityCompat(cl, className, intent));
    }

    public final Application instantiateApplication(ClassLoader cl, String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.checkCompatWrapper(instantiateApplicationCompat(cl, className));
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.checkCompatWrapper(instantiateReceiverCompat(cl, className, intent));
    }

    public final ContentProvider instantiateProvider(ClassLoader cl, String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.checkCompatWrapper(instantiateProviderCompat(cl, className));
    }

    public final Service instantiateService(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.checkCompatWrapper(instantiateServiceCompat(cl, className, intent));
    }

    public Application instantiateApplicationCompat(ClassLoader cl, String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) Class.forName(className, false, cl).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    L5:
        e = move-exception;
        throw new RuntimeException("Couldn't call constructor", e);
    }

    public Activity instantiateActivityCompat(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) Class.forName(className, false, cl).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    L5:
        e = move-exception;
        throw new RuntimeException("Couldn't call constructor", e);
    }

    public BroadcastReceiver instantiateReceiverCompat(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) Class.forName(className, false, cl).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    L5:
        e = move-exception;
        throw new RuntimeException("Couldn't call constructor", e);
    }

    public Service instantiateServiceCompat(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) Class.forName(className, false, cl).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    L5:
        e = move-exception;
        throw new RuntimeException("Couldn't call constructor", e);
    }

    public ContentProvider instantiateProviderCompat(ClassLoader cl, String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) Class.forName(className, false, cl).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    L5:
        e = move-exception;
        throw new RuntimeException("Couldn't call constructor", e);
    }
}
