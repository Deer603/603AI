package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes4.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    public static Predicate<Uri> asPredicate(final UriMatcher matcher) {
        return new UriMatcherCompat$$ExternalSyntheticLambda0(matcher);
    }

    static /* synthetic */ boolean lambda$asPredicate$0(UriMatcher matcher, Uri v) {
        if (matcher.match(v) == (-1)) goto L5;
        return true;
    L5:
        return false;
    }
}
