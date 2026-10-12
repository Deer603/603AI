package androidx.core.content;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SharedPreferencesCompat {

    @Deprecated
    public static final class EditorCompat {
        private static EditorCompat sInstance;
        private final Helper mHelper;

        private static class Helper {
            Helper() {
            }

            public void apply(SharedPreferences.Editor editor) {
                editor.apply();     // Catch: AbstractMethodError -> L4
                return;
            L5:
                editor.commit();
            }
        }

        private EditorCompat() {
            this.mHelper = new Helper();
        }

        @Deprecated
        public static EditorCompat getInstance() {
            if (sInstance != null) goto L6;
            sInstance = new EditorCompat();
        L6:
            return sInstance;
        }

        @Deprecated
        public void apply(SharedPreferences.Editor editor) {
            this.mHelper.apply(editor);
        }
    }

    private SharedPreferencesCompat() {
    }
}
