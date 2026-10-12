package kotlin.math;

import kotlin.Metadata;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/math/Constants;", "", "<init>", "()V", "LN2", "", "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class Constants {
    public static final Constants INSTANCE = null;
    public static final double LN2 = 0.0d;
    public static final double epsilon = 0.0d;
    public static final double taylor_2_bound = 0.0d;
    public static final double taylor_n_bound = 0.0d;
    public static final double upper_taylor_2_bound = 0.0d;
    public static final double upper_taylor_n_bound = 0.0d;

    private Constants() {
    }

    static {
        INSTANCE = new Constants();
        LN2 = Math.log(2.0d);
        epsilon = Math.ulp(1.0d);
        taylor_2_bound = Math.sqrt(epsilon);
        taylor_n_bound = Math.sqrt(taylor_2_bound);
        upper_taylor_2_bound = 1.0d / taylor_2_bound;
        upper_taylor_n_bound = 1.0d / taylor_n_bound;
    }
}
