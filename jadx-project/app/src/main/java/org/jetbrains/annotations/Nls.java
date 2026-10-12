package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Nls {

    public static final enum Capitalization extends Enum<Capitalization> {
        private static final /* synthetic */ Capitalization[] $VALUES = null;
        public static final Capitalization NotSpecified = null;
        public static final Capitalization Sentence = null;
        public static final Capitalization Title = null;

        private Capitalization(String r1, int r2) {
            super(r1, r2);
        }

        public static Capitalization valueOf(String name) {
            return (Capitalization) Enum.valueOf(Capitalization.class, name);
        }

        public static Capitalization[] values() {
            return (Capitalization[]) $VALUES.clone();
        }

        static {
            NotSpecified = new Capitalization("NotSpecified", 0);
            Title = new Capitalization("Title", 1);
            Sentence = new Capitalization("Sentence", 2);
            $VALUES = new Capitalization[]{NotSpecified, Title, Sentence};
        }
    }

    Capitalization capitalization() default Capitalization.NotSpecified;
}
