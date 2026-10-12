package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SQLiteDatabaseKt {
    public static /* synthetic */ Object transaction$default(SQLiteDatabase $this$transaction_u24default, boolean exclusive, Function1 body, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        exclusive = true;
    L6:
        if (exclusive == false) goto L8;
        $this$transaction_u24default.beginTransaction();
    L16:
        Object r6 = body.invoke($this$transaction_u24default);     // Catch: Throwable -> L13
        $this$transaction_u24default.setTransactionSuccessful();     // Catch: Throwable -> L13
        $this$transaction_u24default.endTransaction();
        return r6;
    L13:
        th = move-exception;
        $this$transaction_u24default.endTransaction();
        throw th;
    L8:
        $this$transaction_u24default.beginTransactionNonExclusive();
        goto L16
    }

    public static final <T> T transaction(SQLiteDatabase $this$transaction, boolean exclusive, Function1<? super SQLiteDatabase, ? extends T> r5) {
        if (exclusive == false) goto L5;
        $this$transaction.beginTransaction();
    L13:
        T r1 = r5.invoke($this$transaction);     // Catch: Throwable -> L10
        $this$transaction.setTransactionSuccessful();     // Catch: Throwable -> L10
        $this$transaction.endTransaction();
        return r1;
    L10:
        th = move-exception;
        $this$transaction.endTransaction();
        throw th;
    L5:
        $this$transaction.beginTransactionNonExclusive();
        goto L13
    }
}
