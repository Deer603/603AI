package androidx.core.app;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class Person {
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    String mKey;
    CharSequence mName;
    String mUri;

    static class Api22Impl {
        private Api22Impl() {
        }

        static Person fromPersistableBundle(PersistableBundle bundle) {
            return new Builder().setName(bundle.getString("name")).setUri(bundle.getString(Person.URI_KEY)).setKey(bundle.getString(Person.KEY_KEY)).setBot(bundle.getBoolean(Person.IS_BOT_KEY)).setImportant(bundle.getBoolean(Person.IS_IMPORTANT_KEY)).build();
        }

        static PersistableBundle toPersistableBundle(Person person) {
            PersistableBundle result = new PersistableBundle();
            if (person.mName == null) goto L5;
            String r1 = person.mName.toString();
        L6:
            result.putString("name", r1);
            result.putString(Person.URI_KEY, person.mUri);
            result.putString(Person.KEY_KEY, person.mKey);
            result.putBoolean(Person.IS_BOT_KEY, person.mIsBot);
            result.putBoolean(Person.IS_IMPORTANT_KEY, person.mIsImportant);
            return result;
        L5:
            r1 = null;
            goto L6
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Person fromAndroidPerson(android.app.Person person) {
            Builder r0 = new Builder().setName(person.getName());
            if (person.getIcon() == null) goto L5;
            IconCompat r1 = IconCompat.createFromIcon(person.getIcon());
        L7:
            return r0.setIcon(r1).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        L5:
            r1 = null;
            goto L7
        }

        static android.app.Person toAndroidPerson(Person person) {
            android.app.Person$Builder r0 = new android.app.Person$Builder().setName(person.getName());
            if (person.getIcon() == null) goto L5;
            Icon r1 = person.getIcon().toIcon();
        L7:
            return r0.setIcon(r1).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        L5:
            r1 = null;
            goto L7
        }
    }

    public static class Builder {
        IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        String mKey;
        CharSequence mName;
        String mUri;

        public Builder() {
        }

        Builder(Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }

        public Builder setName(CharSequence name) {
            this.mName = name;
            return this;
        }

        public Builder setIcon(IconCompat icon) {
            this.mIcon = icon;
            return this;
        }

        public Builder setUri(String uri) {
            this.mUri = uri;
            return this;
        }

        public Builder setKey(String key) {
            this.mKey = key;
            return this;
        }

        public Builder setBot(boolean bot) {
            this.mIsBot = bot;
            return this;
        }

        public Builder setImportant(boolean important) {
            this.mIsImportant = important;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static Person fromBundle(Bundle bundle) {
        Bundle iconBundle = bundle.getBundle(ICON_KEY);
        Builder r1 = new Builder().setName(bundle.getCharSequence("name"));
        if (iconBundle == null) goto L5;
        IconCompat r2 = IconCompat.createFromBundle(iconBundle);
    L7:
        return r1.setIcon(r2).setUri(bundle.getString(URI_KEY)).setKey(bundle.getString(KEY_KEY)).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    L5:
        r2 = null;
        goto L7
    }

    public static Person fromPersistableBundle(PersistableBundle bundle) {
        return Api22Impl.fromPersistableBundle(bundle);
    }

    public static Person fromAndroidPerson(android.app.Person person) {
        return Api28Impl.fromAndroidPerson(person);
    }

    Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public Bundle toBundle() {
        Bundle result = new Bundle();
        result.putCharSequence("name", this.mName);
        if (this.mIcon == null) goto L5;
        Bundle r1 = this.mIcon.toBundle();
    L6:
        result.putBundle(ICON_KEY, r1);
        result.putString(URI_KEY, this.mUri);
        result.putString(KEY_KEY, this.mKey);
        result.putBoolean(IS_BOT_KEY, this.mIsBot);
        result.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return result;
    L5:
        r1 = null;
        goto L6
    }

    public PersistableBundle toPersistableBundle() {
        return Api22Impl.toPersistableBundle(this);
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public android.app.Person toAndroidPerson() {
        return Api28Impl.toAndroidPerson(this);
    }

    public CharSequence getName() {
        return this.mName;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public String getUri() {
        return this.mUri;
    }

    public String getKey() {
        return this.mKey;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    public String resolveToLegacyUri() {
        if (this.mUri == null) goto L7;
        return this.mUri;
    L7:
        if (this.mName != null) goto L9;
        return "";
    L9:
        return "name:" + this.mName;
    }

    public boolean equals(Object otherObject) {
        if (otherObject != null) goto L6;
        return false;
    L6:
        if ((otherObject instanceof Person) == true) goto L8;
        return false;
    L8:
        Person otherPerson = (Person) otherObject;
        String key1 = getKey();
        String key2 = otherPerson.getKey();
        if (key1 != null) goto L24;
        if (key2 != null) goto L24;
        String name1 = Objects.toString(getName());
        String name2 = Objects.toString(otherPerson.getName());
        if (Objects.equals(name1, name2) == true) goto L15;
        return false;
    L15:
        if (Objects.equals(getUri(), otherPerson.getUri()) == true) goto L17;
        return false;
    L17:
        if (Objects.equals(Boolean.valueOf(isBot()), Boolean.valueOf(otherPerson.isBot())) == true) goto L19;
        return false;
    L19:
        if (Objects.equals(Boolean.valueOf(isImportant()), Boolean.valueOf(otherPerson.isImportant())) == false) goto L28;
        return true;
    L28:
        return false;
    L24:
        return Objects.equals(key1, key2);
    }

    public int hashCode() {
        String key = getKey();
        if (key == null) goto L7;
        return key.hashCode();
    L7:
        return Objects.hash(new Object[]{getName(), getUri(), Boolean.valueOf(isBot()), Boolean.valueOf(isImportant())});
    }
}
