package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class SpannableBuilder extends SpannableStringBuilder {
    private final Class<?> mWatcherClass;
    private final List<WatcherWrapper> mWatchers;

    private static class WatcherWrapper implements TextWatcher, SpanWatcher {
        private final AtomicInteger mBlockCalls;
        final Object mObject;

        WatcherWrapper(Object object) {
            this.mBlockCalls = new AtomicInteger(0);
            this.mObject = object;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            ((TextWatcher) this.mObject).beforeTextChanged(s, start, count, after);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            ((TextWatcher) this.mObject).onTextChanged(s, start, before, count);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            ((TextWatcher) this.mObject).afterTextChanged(s);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable text, Object what, int start, int end) {
            if (this.mBlockCalls.get() > 0) goto L5;
        L7:
            ((SpanWatcher) this.mObject).onSpanAdded(text, what, start, end);
            return;
        L5:
            if (isEmojiSpan(what) == false) goto L7;
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable text, Object what, int start, int end) {
            if (this.mBlockCalls.get() > 0) goto L5;
        L7:
            ((SpanWatcher) this.mObject).onSpanRemoved(text, what, start, end);
            return;
        L5:
            if (isEmojiSpan(what) == false) goto L7;
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable text, Object what, int ostart, int oend, int nstart, int nend) {
            if (this.mBlockCalls.get() <= 0) goto L8;
            if (isEmojiSpan(what) == false) goto L8;
            return;
        L8:
            if (Build.VERSION.SDK_INT >= 28) goto L14;
            if (ostart <= oend) goto L11;
            ostart = 0;
        L11:
            if (nstart <= nend) goto L13;
            int ostart2 = ostart;
            int nstart2 = 0;
        L15:
            ((SpanWatcher) this.mObject).onSpanChanged(text, what, ostart2, oend, nstart2, nend);
            return;
        L13:
            ostart2 = ostart;
            nstart2 = nstart;
            goto L15
        L14:
            ostart2 = ostart;
            nstart2 = nstart;
            goto L15
        }

        final void blockCalls() {
            this.mBlockCalls.incrementAndGet();
        }

        final void unblockCalls() {
            this.mBlockCalls.decrementAndGet();
        }

        private boolean isEmojiSpan(Object span) {
            return span instanceof EmojiSpan;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Editable append(char r1) {
        return append(r1);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Editable append(CharSequence r1) {
        return append(r1);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Editable append(CharSequence r1, int r2, int r3) {
        return append(r1, r2, r3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char r1) throws IOException {
        return append(r1);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence r1) throws IOException {
        return append(r1);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence r1, int r2, int r3) throws IOException {
        return append(r1, r2, r3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable delete(int r1, int r2) {
        return delete(r1, r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable insert(int r1, CharSequence r2) {
        return insert(r1, r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable insert(int r1, CharSequence r2, int r3, int r4) {
        return insert(r1, r2, r3, r4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3) {
        return replace(r1, r2, r3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3, int r4, int r5) {
        return replace(r1, r2, r3, r4, r5);
    }

    SpannableBuilder(Class<?> watcherClass) {
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(watcherClass, "watcherClass cannot be null");
        this.mWatcherClass = watcherClass;
    }

    SpannableBuilder(Class<?> watcherClass, CharSequence text) {
        super(text);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(watcherClass, "watcherClass cannot be null");
        this.mWatcherClass = watcherClass;
    }

    SpannableBuilder(Class<?> watcherClass, CharSequence text, int start, int end) {
        super(text, start, end);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(watcherClass, "watcherClass cannot be null");
        this.mWatcherClass = watcherClass;
    }

    public static SpannableBuilder create(Class<?> clazz, CharSequence text) {
        return new SpannableBuilder(clazz, text);
    }

    private boolean isWatcher(Object object) {
        if (object != null) goto L4;
    L6:
        return false;
    L4:
        if (isWatcher(object.getClass()) == false) goto L6;
        return true;
    }

    private boolean isWatcher(Class<?> clazz) {
        if (this.mWatcherClass != clazz) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int start, int end) {
        return new SpannableBuilder(this.mWatcherClass, this, start, end);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object what, int start, int end, int flags) {
        if (isWatcher(what) == false) goto L5;
        WatcherWrapper span = new WatcherWrapper(what);
        this.mWatchers.add(span);
        what = span;
    L5:
        super.setSpan(what, start, end, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int r5, int r6, Class<T> r7) {
        if (isWatcher(r7) == false) goto L10;
        WatcherWrapper[] r0 = (WatcherWrapper[]) super.getSpans(r5, r6, WatcherWrapper.class);
        T[] r1 = (T[]) ((Object[]) Array.newInstance(r7, r0.length));
        int r2 = 0;
    L6:
        if (r2 >= r0.length) goto L8;
        r1[r2] = r0[r2].mObject;
        r2 = r2 + 1;
        goto L6
    L8:
        return r1;
    L10:
        return (T[]) super.getSpans(r5, r6, r7);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object what) {
        if (isWatcher(what) == false) goto L7;
        WatcherWrapper watcher = getWatcherFor(what);
        if (watcher == null) goto L8;
        what = watcher;
    L8:
        super.removeSpan(what);
        if (watcher == null) goto L12;
        this.mWatchers.remove(watcher);
        return;
    L12:
        return;
    L7:
        watcher = null;
        goto L8
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object tag) {
        if (isWatcher(tag) == false) goto L8;
        WatcherWrapper watcher = getWatcherFor(tag);
        if (watcher == null) goto L8;
        tag = watcher;
    L8:
        return super.getSpanStart(tag);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object tag) {
        if (isWatcher(tag) == false) goto L8;
        WatcherWrapper watcher = getWatcherFor(tag);
        if (watcher == null) goto L8;
        tag = watcher;
    L8:
        return super.getSpanEnd(tag);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object tag) {
        if (isWatcher(tag) == false) goto L8;
        WatcherWrapper watcher = getWatcherFor(tag);
        if (watcher == null) goto L8;
        tag = watcher;
    L8:
        return super.getSpanFlags(tag);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int start, int limit, Class type) {
        if (type != null) goto L4;
    L5:
        type = WatcherWrapper.class;
    L7:
        return super.nextSpanTransition(start, limit, type);
    L4:
        if (isWatcher(type) == false) goto L7;
        goto L5
    }

    private WatcherWrapper getWatcherFor(Object object) {
        int i = 0;
    L4:
        if (i >= this.mWatchers.size()) goto L9;
        WatcherWrapper watcher = this.mWatchers.get(i);
        if (watcher.mObject == object) goto L7;
        i = i + 1;
        goto L4
    L7:
        return watcher;
    L9:
        return null;
    }

    public void beginBatchEdit() {
        blockWatchers();
    }

    public void endBatchEdit() {
        unblockwatchers();
        fireWatchers();
    }

    private void blockWatchers() {
        int i = 0;
    L4:
        if (i >= this.mWatchers.size()) goto L6;
        this.mWatchers.get(i).blockCalls();
        i = i + 1;
        goto L4
    }

    private void unblockwatchers() {
        int i = 0;
    L4:
        if (i >= this.mWatchers.size()) goto L6;
        this.mWatchers.get(i).unblockCalls();
        i = i + 1;
        goto L4
    }

    private void fireWatchers() {
        int i = 0;
    L4:
        if (i >= this.mWatchers.size()) goto L6;
        this.mWatchers.get(i).onTextChanged(this, 0, length(), length());
        i = i + 1;
        goto L4
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int start, int end, CharSequence tb) {
        blockWatchers();
        super.replace(start, end, tb);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int start, int end, CharSequence tb, int tbstart, int tbend) {
        blockWatchers();
        super.replace(start, end, tb, tbstart, tbend);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int where, CharSequence tb) {
        super.insert(where, tb);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int where, CharSequence tb, int start, int end) {
        super.insert(where, tb, start, end);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int start, int end) {
        super.delete(start, end);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence text) {
        super.append(text);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char text) {
        super.append(text);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence text, int start, int end) {
        super.append(text, start, end);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence text, Object what, int flags) {
        super.append(text, what, flags);
        return this;
    }
}
