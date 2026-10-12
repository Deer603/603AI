package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: SavedStateReader.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010$\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\"\u0010 J\u0015\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u0004\u0018\u00010+2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u0002022\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u0004\u0018\u0001022\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u0002092\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u0004\u0018\u0001092\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b=\u0010>J-\u0010?\u001a\u0002H@\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0004\bD\u0010EJ$\u0010?\u001a\u0002H@\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0004\bD\u0010FJ/\u0010G\u001a\u0004\u0018\u0001H@\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0004\bH\u0010EJ&\u0010G\u001a\u0004\u0018\u0001H@\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0004\bH\u0010FJ-\u0010I\u001a\u0002H@\"\b\b\u0000\u0010@*\u00020J2\u0006\u0010\t\u001a\u00020\n2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0004\bL\u0010MJ$\u0010I\u001a\u0002H@\"\n\b\u0000\u0010@\u0018\u0001*\u00020J2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0004\bL\u0010NJ/\u0010O\u001a\u0004\u0018\u0001H@\"\b\b\u0000\u0010@*\u00020J2\u0006\u0010\t\u001a\u00020\n2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0004\bP\u0010MJ&\u0010O\u001a\u0004\u0018\u0001H@\"\n\b\u0000\u0010@\u0018\u0001*\u00020J2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0004\bP\u0010NJ\u0015\u0010Q\u001a\u00020R2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u0004\u0018\u00010R2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bV\u0010TJ\u0015\u0010W\u001a\u00020X2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u0004\u0018\u00010X2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\\\u0010ZJ\u001f\u0010]\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040^2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b_\u0010`J!\u0010a\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010^2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bb\u0010`J\u0015\u0010c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bg\u0010eJ\u001b\u0010h\u001a\b\u0012\u0004\u0012\u0002020i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bj\u0010kJ\u001d\u0010l\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bm\u0010kJ\u001b\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001e0i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bo\u0010kJ\u001d\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bq\u0010kJ\u001f\u0010r\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bs\u0010kJ!\u0010t\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bu\u0010kJ\u001b\u0010v\u001a\b\u0012\u0004\u0012\u00020\n0i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\bw\u0010kJ\u001d\u0010x\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010i2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\by\u0010kJ3\u0010z\u001a\b\u0012\u0004\u0012\u0002H@0i\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0004\b{\u0010|J*\u0010z\u001a\b\u0012\u0004\u0012\u0002H@0i\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0004\b{\u0010kJ5\u0010}\u001a\n\u0012\u0004\u0012\u0002H@\u0018\u00010i\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0004\b~\u0010|J,\u0010}\u001a\n\u0012\u0004\u0012\u0002H@\u0018\u00010i\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0004\b~\u0010kJ\u0018\u0010\u007f\u001a\u00030\u0080\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u0084\u0001\u0010\u0082\u0001J\u0019\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u008a\u0001\u0010\u0088\u0001J\u001e\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0^2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J \u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010^2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u008f\u0001\u0010\u008d\u0001J\u0019\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u0095\u0001\u0010\u0093\u0001J\u0019\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001b\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0097\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u009b\u0001\u0010\u0099\u0001J\u0019\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b¡\u0001\u0010\u009f\u0001J\u0019\u0010¢\u0001\u001a\u00030£\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001b\u0010¦\u0001\u001a\u0005\u0018\u00010£\u00012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b§\u0001\u0010¥\u0001J\u001e\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\n0^2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b©\u0001\u0010ª\u0001J \u0010«\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010^2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b¬\u0001\u0010ª\u0001J6\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u0002H@0^\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0006\b®\u0001\u0010¯\u0001J-\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u0002H@0^\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0006\b®\u0001\u0010°\u0001J8\u0010±\u0001\u001a\n\u0012\u0004\u0012\u0002H@\u0018\u00010^\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0006\b²\u0001\u0010¯\u0001J/\u0010±\u0001\u001a\n\u0012\u0004\u0012\u0002H@\u0018\u00010^\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0006\b²\u0001\u0010°\u0001J7\u0010³\u0001\u001a\t\u0012\u0004\u0012\u0002H@0´\u0001\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0006\bµ\u0001\u0010¶\u0001J.\u0010³\u0001\u001a\t\u0012\u0004\u0012\u0002H@0´\u0001\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0006\bµ\u0001\u0010·\u0001J9\u0010¸\u0001\u001a\u000b\u0012\u0004\u0012\u0002H@\u0018\u00010´\u0001\"\b\b\u0000\u0010@*\u00020A2\u0006\u0010\t\u001a\u00020\n2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H@0C¢\u0006\u0006\b¹\u0001\u0010¶\u0001J0\u0010¸\u0001\u001a\u000b\u0012\u0004\u0012\u0002H@\u0018\u00010´\u0001\"\n\b\u0000\u0010@\u0018\u0001*\u00020A2\u0006\u0010\t\u001a\u00020\nH\u0086\b¢\u0006\u0006\b¹\u0001\u0010·\u0001J\u001c\u0010º\u0001\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b»\u0001\u0010¼\u0001J \u0010½\u0001\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0006\u0010\t\u001a\u00020\n¢\u0006\u0006\b¾\u0001\u0010¼\u0001J\u0010\u0010¿\u0001\u001a\u000202¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0010\u0010Â\u0001\u001a\u00020\u0010¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0017\u0010Å\u0001\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n¢\u0006\u0005\bÆ\u0001\u0010\u0012J\u001a\u0010Ç\u0001\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¢\u0006\u0005\bÈ\u0001\u0010\u0012J\u001d\u0010É\u0001\u001a\u00020\u00102\u000b\u0010Ê\u0001\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0010\u0010Í\u0001\u001a\u000202¢\u0006\u0006\bÎ\u0001\u0010Á\u0001J\u0010\u0010Ï\u0001\u001a\u00020\n¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001f\u0010Ò\u0001\u001a\u0011\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ó\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u001e\u0010Ö\u0001\u001a\u00020\u00102\t\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u0013\u0010Ù\u0001\u001a\u000202HÖ\u0001¢\u0006\u0006\bÚ\u0001\u0010Á\u0001J\u0013\u0010Û\u0001\u001a\u00020\nHÖ\u0001¢\u0006\u0006\bÜ\u0001\u0010Ñ\u0001R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006Ý\u0001"}, d2 = {"Landroidx/savedstate/SavedStateReader;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "getBinder", "Landroid/os/IBinder;", "key", "", "getBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;", "getBinderOrNull", "getBinderOrNull-impl", "getBoolean", "", "getBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "getBooleanOrNull", "getBooleanOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "getChar", "", "getChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;)C", "getCharOrNull", "getCharOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Character;", "getCharSequence", "", "getCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/CharSequence;", "getCharSequenceOrNull", "getCharSequenceOrNull-impl", "getDouble", "", "getDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;)D", "getDoubleOrNull", "getDoubleOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Double;", "getFloat", "", "getFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;)F", "getFloatOrNull", "getFloatOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "getInt", "", "getInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;)I", "getIntOrNull", "getIntOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "getLong", "", "getLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;)J", "getLongOrNull", "getLongOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "getParcelable", "T", "Landroid/os/Parcelable;", "parcelableClass", "Lkotlin/reflect/KClass;", "getParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/os/Parcelable;", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "getParcelableOrNull", "getParcelableOrNull-impl", "getJavaSerializable", "Ljava/io/Serializable;", "serializableClass", "getJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/io/Serializable;", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "getJavaSerializableOrNull", "getJavaSerializableOrNull-impl", "getSize", "Landroid/util/Size;", "getSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/Size;", "getSizeOrNull", "getSizeOrNull-impl", "getSizeF", "Landroid/util/SizeF;", "getSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SizeF;", "getSizeFOrNull", "getSizeFOrNull-impl", "getSavedStateArray", "", "getSavedStateArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;", "getSavedStateArrayOrNull", "getSavedStateArrayOrNull-impl", "getString", "getString-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "getStringOrNull", "getStringOrNull-impl", "getIntList", "", "getIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "getIntListOrNull", "getIntListOrNull-impl", "getCharSequenceList", "getCharSequenceList-impl", "getCharSequenceListOrNull", "getCharSequenceListOrNull-impl", "getSavedStateList", "getSavedStateList-impl", "getSavedStateListOrNull", "getSavedStateListOrNull-impl", "getStringList", "getStringList-impl", "getStringListOrNull", "getStringListOrNull-impl", "getParcelableList", "getParcelableList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/util/List;", "getParcelableListOrNull", "getParcelableListOrNull-impl", "getBooleanArray", "", "getBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "getBooleanArrayOrNull", "getBooleanArrayOrNull-impl", "getCharArray", "", "getCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[C", "getCharArrayOrNull", "getCharArrayOrNull-impl", "getCharSequenceArray", "getCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/CharSequence;", "getCharSequenceArrayOrNull", "getCharSequenceArrayOrNull-impl", "getDoubleArray", "", "getDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[D", "getDoubleArrayOrNull", "getDoubleArrayOrNull-impl", "getFloatArray", "", "getFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "getFloatArrayOrNull", "getFloatArrayOrNull-impl", "getIntArray", "", "getIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "getIntArrayOrNull", "getIntArrayOrNull-impl", "getLongArray", "", "getLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "getLongArrayOrNull", "getLongArrayOrNull-impl", "getStringArray", "getStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "getStringArrayOrNull", "getStringArrayOrNull-impl", "getParcelableArray", "getParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)[Landroid/os/Parcelable;", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "getParcelableArrayOrNull", "getParcelableArrayOrNull-impl", "getSparseParcelableArray", "Landroid/util/SparseArray;", "getSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/util/SparseArray;", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SparseArray;", "getSparseParcelableArrayOrNull", "getSparseParcelableArrayOrNull-impl", "getSavedState", "getSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "getSavedStateOrNull", "getSavedStateOrNull-impl", "size", "size-impl", "(Landroid/os/Bundle;)I", "isEmpty", "isEmpty-impl", "(Landroid/os/Bundle;)Z", "isNull", "isNull-impl", "contains", "contains-impl", "contentDeepEquals", "other", "contentDeepEquals-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)Z", "contentDeepHashCode", "contentDeepHashCode-impl", "contentDeepToString", "contentDeepToString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "toMap", "", "toMap-impl", "(Landroid/os/Bundle;)Ljava/util/Map;", "equals", "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "toString-impl", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class SavedStateReader {
    private final Bundle source;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateReader m7270boximpl(Bundle r1) {
        return new SavedStateReader(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m7271constructorimpl(Bundle r1) {
        Intrinsics.checkNotNullParameter(r1, "source");
        return r1;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7276equalsimpl(Bundle r2, Object r3) {
        if ((r3 instanceof SavedStateReader) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((SavedStateReader) r3).m7354unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7277equalsimpl0(Bundle r1, Bundle r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7348hashCodeimpl(Bundle r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7353toStringimpl(Bundle r2) {
        return "SavedStateReader(source=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m7276equalsimpl(this.source, r2);
    }

    public int hashCode() {
        return m7348hashCodeimpl(this.source);
    }

    public String toString() {
        return m7353toStringimpl(this.source);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m7354unboximpl() {
        return this.source;
    }

    private /* synthetic */ SavedStateReader(Bundle source) {
        this.source = source;
    }

    /* JADX INFO: renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m7278getBinderimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        IBinder r0 = arg0.getBinder(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m7279getBinderOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getBinder(key);
    }

    /* JADX INFO: renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m7280getBooleanimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean result = arg0.getBoolean(key, false);
        if (result == true) goto L9;
        boolean reference = arg0.getBoolean(key, true);
        if (reference != true) goto L9;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L9:
        return result;
    }

    /* JADX INFO: renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m7283getBooleanOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean reference = false;
        boolean result = arg0.getBoolean(key, false);
        if (result == true) goto L11;
        if (arg0.getBoolean(key, true) != true) goto L7;
        reference = true;
    L7:
        if (reference != true) goto L11;
        return null;
    L11:
        return Boolean.valueOf(result);
    }

    /* JADX INFO: renamed from: getChar-impl, reason: not valid java name */
    public static final char m7284getCharimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char result = arg0.getChar(key, 0);
        if (result != 0) goto L9;
        char reference = arg0.getChar(key, CharCompanionObject.MAX_VALUE);
        if (reference != 65535) goto L9;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L9:
        return result;
    }

    /* JADX INFO: renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m7287getCharOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char result = arg0.getChar(key, 0);
        if (result != 0) goto L9;
        char reference = arg0.getChar(key, CharCompanionObject.MAX_VALUE);
        if (reference != 65535) goto L9;
        return null;
    L9:
        return Character.valueOf(result);
    }

    /* JADX INFO: renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m7288getCharSequenceimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence r0 = arg0.getCharSequence(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m7293getCharSequenceOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getCharSequence(key);
    }

    /* JADX INFO: renamed from: getDouble-impl, reason: not valid java name */
    public static final double m7294getDoubleimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double result = arg0.getDouble(key, Double.MIN_VALUE);
        boolean r1 = true;
        if (result != Double.MIN_VALUE) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        double reference = arg0.getDouble(key, Double.MAX_VALUE);
        if (reference == Double.MAX_VALUE) goto L11;
        r1 = false;
    L11:
        if (r1 == false) goto L15;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L15:
        return result;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m7297getDoubleOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double result = arg0.getDouble(key, Double.MIN_VALUE);
        boolean r1 = true;
        if (result != Double.MIN_VALUE) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        double reference = arg0.getDouble(key, Double.MAX_VALUE);
        if (reference == Double.MAX_VALUE) goto L11;
        r1 = false;
    L11:
        if (r1 == false) goto L15;
        return null;
    L15:
        return Double.valueOf(result);
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getFloat-impl, reason: not valid java name */
    public static final float m7298getFloatimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float result = arg0.getFloat(key, Float.MIN_VALUE);
        boolean r2 = true;
        if (result != Float.MIN_VALUE) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        float reference = arg0.getFloat(key, Float.MAX_VALUE);
        if (reference == Float.MAX_VALUE) goto L11;
        r2 = false;
    L11:
        if (r2 == false) goto L15;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L15:
        return result;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m7301getFloatOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float result = arg0.getFloat(key, Float.MIN_VALUE);
        boolean r2 = true;
        if (result != Float.MIN_VALUE) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        float reference = arg0.getFloat(key, Float.MAX_VALUE);
        if (reference == Float.MAX_VALUE) goto L11;
        r2 = false;
    L11:
        if (r2 == false) goto L15;
        return null;
    L15:
        return Float.valueOf(result);
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getInt-impl, reason: not valid java name */
    public static final int m7302getIntimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int result = arg0.getInt(key, Integer.MIN_VALUE);
        if (result != Integer.MIN_VALUE) goto L9;
        int reference = arg0.getInt(key, Integer.MAX_VALUE);
        if (reference != Integer.MAX_VALUE) goto L9;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L9:
        return result;
    }

    /* JADX INFO: renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m7307getIntOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int result = arg0.getInt(key, Integer.MIN_VALUE);
        if (result != Integer.MIN_VALUE) goto L9;
        int reference = arg0.getInt(key, Integer.MAX_VALUE);
        if (reference != Integer.MAX_VALUE) goto L9;
        return null;
    L9:
        return Integer.valueOf(result);
    }

    /* JADX INFO: renamed from: getLong-impl, reason: not valid java name */
    public static final long m7312getLongimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long result = arg0.getLong(key, Long.MIN_VALUE);
        if (result != Long.MIN_VALUE) goto L9;
        long reference = arg0.getLong(key, Long.MAX_VALUE);
        if (reference != Long.MAX_VALUE) goto L9;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L9:
        return result;
    }

    /* JADX INFO: renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m7315getLongOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long result = arg0.getLong(key, Long.MIN_VALUE);
        if (result != Long.MIN_VALUE) goto L9;
        long reference = arg0.getLong(key, Long.MAX_VALUE);
        if (reference != Long.MAX_VALUE) goto L9;
        return null;
    L9:
        return Long.valueOf(result);
    }

    /* JADX INFO: renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m7317getParcelableimpl(Bundle arg0, String key, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "parcelableClass");
        T r0 = (T) BundleCompat.getParcelable(arg0, key, JvmClassMappingKt.getJavaClass(r3));
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getParcelable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m7316getParcelableimpl(Bundle r3, String r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) m7317getParcelableimpl(r3, r4, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m7327getParcelableOrNullimpl(Bundle arg0, String key, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "parcelableClass");
        return (T) BundleCompat.getParcelable(arg0, key, JvmClassMappingKt.getJavaClass(r3));
    }

    /* JADX INFO: renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m7326getParcelableOrNullimpl(Bundle r3, String r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) m7327getParcelableOrNullimpl(r3, r4, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m7309getJavaSerializableimpl(Bundle r1, String r2, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(r2, "key");
        Intrinsics.checkNotNullParameter(r3, "serializableClass");
        T r0 = (T) BundleCompat.getSerializable(r1, r2, JvmClassMappingKt.getJavaClass(r3));
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(r2);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m7308getJavaSerializableimpl(Bundle r3, String r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) m7309getJavaSerializableimpl(r3, r4, Reflection.getOrCreateKotlinClass(Serializable.class));
    }

    /* JADX INFO: renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m7311getJavaSerializableOrNullimpl(Bundle r1, String r2, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(r2, "key");
        Intrinsics.checkNotNullParameter(r3, "serializableClass");
        return (T) BundleCompat.getSerializable(r1, r2, JvmClassMappingKt.getJavaClass(r3));
    }

    /* JADX INFO: renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m7310getJavaSerializableOrNullimpl(Bundle r3, String r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) m7311getJavaSerializableOrNullimpl(r3, r4, Reflection.getOrCreateKotlinClass(Serializable.class));
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final Size m7334getSizeimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Size r0 = arg0.getSize(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m7337getSizeOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getSize(key);
    }

    /* JADX INFO: renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m7335getSizeFimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SizeF r0 = arg0.getSizeF(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m7336getSizeFOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getSizeF(key);
    }

    /* JADX INFO: renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m7329getSavedStateArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Bundle[]) m7319getParcelableArrayimpl(arg0, key, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m7330getSavedStateArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Bundle[]) m7321getParcelableArrayOrNullimpl(arg0, key, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: getString-impl, reason: not valid java name */
    public static final String m7342getStringimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String r0 = arg0.getString(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m7347getStringOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getString(key);
    }

    /* JADX INFO: renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m7305getIntListimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<Integer> r0 = arg0.getIntegerArrayList(key);
        if (r0 != null) goto L5;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m7306getIntListOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getIntegerArrayList(key);
    }

    /* JADX INFO: renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m7291getCharSequenceListimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<CharSequence> r0 = arg0.getCharSequenceArrayList(key);
        if (r0 != null) goto L5;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m7292getCharSequenceListOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getCharSequenceArrayList(key);
    }

    /* JADX INFO: renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m7331getSavedStateListimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return m7323getParcelableListimpl(arg0, key, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m7332getSavedStateListOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return m7325getParcelableListOrNullimpl(arg0, key, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m7345getStringListimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<String> r0 = arg0.getStringArrayList(key);
        if (r0 != null) goto L5;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m7346getStringListOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getStringArrayList(key);
    }

    /* JADX INFO: renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m7323getParcelableListimpl(Bundle arg0, String key, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "parcelableClass");
        ArrayList r0 = BundleCompat.getParcelableArrayList(arg0, key, JvmClassMappingKt.getJavaClass(r3));
        if (r0 != null) goto L5;
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: getParcelableList-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m7322getParcelableListimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return m7323getParcelableListimpl(arg0, key, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m7325getParcelableListOrNullimpl(Bundle arg0, String key, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "parcelableClass");
        return BundleCompat.getParcelableArrayList(arg0, key, JvmClassMappingKt.getJavaClass(r3));
    }

    /* JADX INFO: renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m7324getParcelableListOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return m7325getParcelableListOrNullimpl(arg0, key, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m7281getBooleanArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean[] r0 = arg0.getBooleanArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m7282getBooleanArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getBooleanArray(key);
    }

    /* JADX INFO: renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m7285getCharArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char[] r0 = arg0.getCharArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m7286getCharArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getCharArray(key);
    }

    /* JADX INFO: renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m7289getCharSequenceArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence[] r0 = arg0.getCharSequenceArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m7290getCharSequenceArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getCharSequenceArray(key);
    }

    /* JADX INFO: renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m7295getDoubleArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double[] r0 = arg0.getDoubleArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m7296getDoubleArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getDoubleArray(key);
    }

    /* JADX INFO: renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m7299getFloatArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float[] r0 = arg0.getFloatArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m7300getFloatArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getFloatArray(key);
    }

    /* JADX INFO: renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m7303getIntArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int[] r0 = arg0.getIntArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m7304getIntArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getIntArray(key);
    }

    /* JADX INFO: renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m7313getLongArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long[] r0 = arg0.getLongArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m7314getLongArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getLongArray(key);
    }

    /* JADX INFO: renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m7343getStringArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] r0 = arg0.getStringArray(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m7344getStringArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getStringArray(key);
    }

    /* JADX INFO: renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m7319getParcelableArrayimpl(Bundle r1, String r2, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(r2, "key");
        Intrinsics.checkNotNullParameter(r3, "parcelableClass");
        T[] r0 = (T[]) m7321getParcelableArrayOrNullimpl(r1, r2, r3);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(r2);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m7318getParcelableArrayimpl(Bundle r3, String r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T[]) m7319getParcelableArrayimpl(r3, r4, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m7321getParcelableArrayOrNullimpl(Bundle r2, String r3, KClass<T> r4) {
        Intrinsics.checkNotNullParameter(r3, "key");
        Intrinsics.checkNotNullParameter(r4, "parcelableClass");
        T[] r0 = (T[]) BundleCompat.getParcelableArray(r2, r3, JvmClassMappingKt.getJavaClass(r4));
        if ((r0 instanceof Parcelable[]) == true) goto L7;
        return null;
    L7:
        return r0;
    }

    /* JADX INFO: renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m7320getParcelableArrayOrNullimpl(Bundle r3, String r4) {
        Intrinsics.checkNotNullParameter(r4, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T[]) m7321getParcelableArrayOrNullimpl(r3, r4, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m7339getSparseParcelableArrayimpl(Bundle arg0, String key, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "parcelableClass");
        SparseArray<T> r0 = m7341getSparseParcelableArrayOrNullimpl(arg0, key, r3);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m7338getSparseParcelableArrayimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return m7339getSparseParcelableArrayimpl(arg0, key, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m7341getSparseParcelableArrayOrNullimpl(Bundle arg0, String key, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "parcelableClass");
        return BundleCompat.getSparseParcelableArray(arg0, key, JvmClassMappingKt.getJavaClass(r3));
    }

    /* JADX INFO: renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m7340getSparseParcelableArrayOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, "T");
        return m7341getSparseParcelableArrayOrNullimpl(arg0, key, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m7328getSavedStateimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle r0 = arg0.getBundle(key);
        if (r0 == null) goto L5;
        return r0;
    L5:
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m7333getSavedStateOrNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.getBundle(key);
    }

    /* JADX INFO: renamed from: size-impl, reason: not valid java name */
    public static final int m7351sizeimpl(Bundle arg0) {
        return arg0.size();
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7349isEmptyimpl(Bundle arg0) {
        return arg0.isEmpty();
    }

    /* JADX INFO: renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m7350isNullimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (m7272containsimpl(arg0, key) == true) goto L5;
    L7:
        return false;
    L5:
        if (arg0.get(key) != null) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7272containsimpl(Bundle arg0, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return arg0.containsKey(key);
    }

    /* JADX INFO: renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m7273contentDeepEqualsimpl(Bundle arg0, Bundle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return SavedStateReaderKt__SavedStateReader_androidKt.access$contentDeepEquals(arg0, other);
    }

    /* JADX INFO: renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m7274contentDeepHashCodeimpl(Bundle arg0) {
        return SavedStateReaderKt__SavedStateReader_androidKt.access$contentDeepHashCode(arg0);
    }

    /* JADX INFO: renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m7275contentDeepToStringimpl(Bundle arg0) {
        int length = (RangesKt.coerceAtMost(arg0.size(), 429496729) * 5) + 2;
        StringBuilder $this$contentDeepToString_impl_u24lambda_u240 = new StringBuilder(length);
        SavedStateReaderKt__SavedStateReader_androidKt.access$contentDeepToString(arg0, $this$contentDeepToString_impl_u24lambda_u240, new ArrayList());
        String r1 = $this$contentDeepToString_impl_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    /* JADX INFO: renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m7352toMapimpl(Bundle arg0) {
        Map $this$toMap_impl_u24lambda_u241 = MapsKt.createMapBuilder(arg0.size());
        Iterator<String> r3 = arg0.keySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        String key = r3.next();
        Intrinsics.checkNotNull(key);
        $this$toMap_impl_u24lambda_u241.put(key, arg0.get(key));
        goto L4
    L7:
        return MapsKt.build($this$toMap_impl_u24lambda_u241);
    }
}
