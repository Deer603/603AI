package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public int baseline;
        List<String> mJavascriptInterfaceNames;
        List<Object> mJavascriptInterfaceObjects;
        List<List<String>> mJavascriptInterfaceSitePatterns;

        public Config() {
            this.baseline = 0;
            this.mJavascriptInterfaceObjects = new ArrayList();
            this.mJavascriptInterfaceNames = new ArrayList();
            this.mJavascriptInterfaceSitePatterns = new ArrayList();
        }

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(BiConsumer<Integer, Object> r1) {
            accept2(r1);
        }

        public void addJavascriptInterface(Object object, String name, List<String> sitePatterns) {
            this.mJavascriptInterfaceObjects.add(object);
            this.mJavascriptInterfaceNames.add(name);
            this.mJavascriptInterfaceSitePatterns.add(sitePatterns);
        }

        /* JADX INFO: renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(BiConsumer<Integer, Object> chromiumConfig) {
            chromiumConfig.accept(0, Integer.valueOf(this.baseline));
            chromiumConfig.accept(1, new Object[]{this.mJavascriptInterfaceObjects, this.mJavascriptInterfaceNames, this.mJavascriptInterfaceSitePatterns});
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context r1, Consumer<BiConsumer<Integer, Object>> r2);
}
