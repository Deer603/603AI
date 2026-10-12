package kotlin.ranges;

import androidx.collection.SieveCacheKt;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;

/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0004H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\r\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\r\u0010\r\u001a\u00020\u0003*\u00020\u000fH\u0087\b\u001a\r\u0010\r\u001a\u00020\u0005*\u00020\u0010H\u0087\b\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000eH\u0087\b¢\u0006\u0002\u0010\u0013\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u000fH\u0087\b¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0016\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\u0010\u001c\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0087\n¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0002\u0010\u001e\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0087\n\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0*2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0001H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020\u0003H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b+\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020$H\u0087\n\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020$H\u0087\n\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0006*\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00012\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020$2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\n\u0010.\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010.\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010.\u001a\u00020\u0006*\u00020\u0006\u001a\u0015\u0010/\u001a\u00020\u0002*\u00020\u00022\u0006\u0010/\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00042\u0006\u0010/\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010/\u001a\u00020\u0006*\u00020\u00062\u0006\u0010/\u001a\u00020\u0001H\u0086\u0004\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020\u0001H\u0000¢\u0006\u0002\u00101\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0000¢\u0006\u0002\u00102\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020$H\u0000¢\u0006\u0002\u00103\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020&H\u0000¢\u0006\u0002\u00104\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020(H\u0000¢\u0006\u0002\u00105\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0000¢\u0006\u0002\u00107\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020&H\u0000¢\u0006\u0002\u00108\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020(H\u0000¢\u0006\u0002\u00109\u001a\u0013\u0010:\u001a\u0004\u0018\u00010\u0003*\u00020&H\u0000¢\u0006\u0002\u0010;\u001a\u0013\u0010:\u001a\u0004\u0018\u00010\u0003*\u00020(H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020\u0001H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020&H\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020(H\u0000¢\u0006\u0002\u0010A\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u0010*\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00012\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020$2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a'\u0010C\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\u0006\u0010F\u001a\u0002HD¢\u0006\u0002\u0010G\u001a\u0012\u0010C\u001a\u00020!*\u00020!2\u0006\u0010F\u001a\u00020!\u001a\u0012\u0010C\u001a\u00020$*\u00020$2\u0006\u0010F\u001a\u00020$\u001a\u0012\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020\u0001\u001a\u0012\u0010C\u001a\u00020\u0003*\u00020\u00032\u0006\u0010F\u001a\u00020\u0003\u001a\u0012\u0010C\u001a\u00020(*\u00020(2\u0006\u0010F\u001a\u00020(\u001a\u0012\u0010C\u001a\u00020&*\u00020&2\u0006\u0010F\u001a\u00020&\u001a'\u0010H\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\u0006\u0010I\u001a\u0002HD¢\u0006\u0002\u0010G\u001a\u0012\u0010H\u001a\u00020!*\u00020!2\u0006\u0010I\u001a\u00020!\u001a\u0012\u0010H\u001a\u00020$*\u00020$2\u0006\u0010I\u001a\u00020$\u001a\u0012\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001\u001a\u0012\u0010H\u001a\u00020\u0003*\u00020\u00032\u0006\u0010I\u001a\u00020\u0003\u001a\u0012\u0010H\u001a\u00020(*\u00020(2\u0006\u0010I\u001a\u00020(\u001a\u0012\u0010H\u001a\u00020&*\u00020&2\u0006\u0010I\u001a\u00020&\u001a3\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\b\u0010F\u001a\u0004\u0018\u0001HD2\b\u0010I\u001a\u0004\u0018\u0001HD¢\u0006\u0002\u0010K\u001a\u001a\u0010J\u001a\u00020!*\u00020!2\u0006\u0010F\u001a\u00020!2\u0006\u0010I\u001a\u00020!\u001a\u001a\u0010J\u001a\u00020$*\u00020$2\u0006\u0010F\u001a\u00020$2\u0006\u0010I\u001a\u00020$\u001a\u001a\u0010J\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001\u001a\u001a\u0010J\u001a\u00020\u0003*\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003\u001a\u001a\u0010J\u001a\u00020(*\u00020(2\u0006\u0010F\u001a\u00020(2\u0006\u0010I\u001a\u00020(\u001a\u001a\u0010J\u001a\u00020&*\u00020&2\u0006\u0010F\u001a\u00020&2\u0006\u0010I\u001a\u00020&\u001a/\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002HD0MH\u0007¢\u0006\u0002\u0010N\u001a-\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002HD0\u001f¢\u0006\u0002\u0010O\u001a\u0018\u0010J\u001a\u00020\u0001*\u00020\u00012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f\u001a\u0018\u0010J\u001a\u00020\u0003*\u00020\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f¨\u0006P"}, d2 = {"first", "", "Lkotlin/ranges/IntProgression;", "", "Lkotlin/ranges/LongProgression;", "", "Lkotlin/ranges/CharProgression;", "firstOrNull", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "last", "lastOrNull", "random", "Lkotlin/ranges/IntRange;", "Lkotlin/ranges/LongRange;", "Lkotlin/ranges/CharRange;", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "contains", "", "element", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "Lkotlin/ranges/ClosedRange;", "value", "", "intRangeContains", "longRangeContains", "", "shortRangeContains", "", "doubleRangeContains", "", "floatRangeContains", "Lkotlin/ranges/OpenEndRange;", "byteRangeContains", "downTo", "to", "reversed", "step", "toByteExactOrNull", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "toIntExactOrNull", "(J)Ljava/lang/Integer;", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "until", "coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
class RangesKt___RangesKt extends RangesKt__RangesKt {
    public RangesKt___RangesKt() {
    }

    public static final int first(IntProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty() == true) goto L7;
        return $this$first.getFirst();
    L7:
        throw new NoSuchElementException("Progression " + $this$first + " is empty.");
    }

    public static final long first(LongProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty() == true) goto L7;
        return $this$first.getFirst();
    L7:
        throw new NoSuchElementException("Progression " + $this$first + " is empty.");
    }

    public static final char first(CharProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty() == true) goto L7;
        return $this$first.getFirst();
    L7:
        throw new NoSuchElementException("Progression " + $this$first + " is empty.");
    }

    public static final Integer firstOrNull(IntProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return Integer.valueOf($this$firstOrNull.getFirst());
    }

    public static final Long firstOrNull(LongProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return Long.valueOf($this$firstOrNull.getFirst());
    }

    public static final Character firstOrNull(CharProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return Character.valueOf($this$firstOrNull.getFirst());
    }

    public static final int last(IntProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty() == true) goto L7;
        return $this$last.getLast();
    L7:
        throw new NoSuchElementException("Progression " + $this$last + " is empty.");
    }

    public static final long last(LongProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty() == true) goto L7;
        return $this$last.getLast();
    L7:
        throw new NoSuchElementException("Progression " + $this$last + " is empty.");
    }

    public static final char last(CharProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty() == true) goto L7;
        return $this$last.getLast();
    L7:
        throw new NoSuchElementException("Progression " + $this$last + " is empty.");
    }

    public static final Integer lastOrNull(IntProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return Integer.valueOf($this$lastOrNull.getLast());
    }

    public static final Long lastOrNull(LongProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return Long.valueOf($this$lastOrNull.getLast());
    }

    public static final Character lastOrNull(CharProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty() == false) goto L6;
        return null;
    L6:
        return Character.valueOf($this$lastOrNull.getLast());
    }

    private static final int random(IntRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return RangesKt.random($this$random, Random.Default);
    }

    private static final long random(LongRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return RangesKt.random($this$random, Random.Default);
    }

    private static final char random(CharRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return RangesKt.random($this$random, Random.Default);
    }

    public static final int random(IntRange $this$random, Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return RandomKt.nextInt(random, $this$random);
    L5:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    }

    public static final long random(LongRange $this$random, Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return RandomKt.nextLong(random, $this$random);
    L5:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    }

    public static final char random(CharRange $this$random, Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return (char) random.nextInt($this$random.getFirst(), $this$random.getLast() + 1);
    L6:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    }

    private static final Integer randomOrNull(IntRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return RangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    private static final Long randomOrNull(LongRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return RangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    private static final Character randomOrNull(CharRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return RangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    public static final Integer randomOrNull(IntRange $this$randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty() == false) goto L7;
        return null;
    L7:
        return Integer.valueOf(RandomKt.nextInt(random, $this$randomOrNull));
    }

    public static final Long randomOrNull(LongRange $this$randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty() == false) goto L7;
        return null;
    L7:
        return Long.valueOf(RandomKt.nextLong(random, $this$randomOrNull));
    }

    public static final Character randomOrNull(CharRange $this$randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty() == false) goto L7;
        return null;
    L7:
        return Character.valueOf((char) random.nextInt($this$randomOrNull.getFirst(), $this$randomOrNull.getLast() + 1));
    }

    private static final boolean contains(IntRange $this$contains, Integer element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        if (element != null) goto L5;
    L7:
        return false;
    L5:
        if ($this$contains.contains(element.intValue()) == false) goto L7;
        return true;
    }

    private static final boolean contains(LongRange $this$contains, Long element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        if (element != null) goto L5;
    L7:
        return false;
    L5:
        if ($this$contains.contains(element.longValue()) == false) goto L7;
        return true;
    }

    private static final boolean contains(CharRange $this$contains, Character element) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        if (element != null) goto L5;
    L7:
        return false;
    L5:
        if ($this$contains.contains(element.charValue()) == false) goto L7;
        return true;
    }

    public static final boolean intRangeContains(ClosedRange<Integer> r1, byte value) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.contains(Integer.valueOf(value));
    }

    public static final boolean longRangeContains(ClosedRange<Long> r2, byte value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Long.valueOf(value));
    }

    public static final boolean shortRangeContains(ClosedRange<Short> r1, byte value) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.contains(Short.valueOf(value));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Double.valueOf(value));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Float.valueOf(value));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> r1, byte value) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.contains(Integer.valueOf(value));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> r2, byte value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Long.valueOf(value));
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> r1, byte value) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.contains(Short.valueOf(value));
    }

    private static final boolean contains(IntRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.intRangeContains($this$contains, value);
    }

    private static final boolean contains(LongRange $this$contains, byte value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.longRangeContains($this$contains, value);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Integer it = RangesKt.toIntExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Long it = RangesKt.toLongExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange $this$contains, double value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short it = RangesKt.toShortExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    public static final boolean floatRangeContains(ClosedRange<Float> r1, double value) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.contains(Float.valueOf((float) value));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Integer it = RangesKt.toIntExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Long it = RangesKt.toLongExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange $this$contains, float value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Short it = RangesKt.toShortExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return $this$contains.contains(it);
    }

    public static final boolean doubleRangeContains(ClosedRange<Double> r2, float value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Double.valueOf(value));
    }

    public static final boolean doubleRangeContains(OpenEndRange<Double> r2, float value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Double.valueOf(value));
    }

    public static final boolean longRangeContains(ClosedRange<Long> r2, int value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Long.valueOf(value));
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> r3, int value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    public static final boolean shortRangeContains(ClosedRange<Short> r3, int value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Short it = RangesKt.toShortExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Double.valueOf(value));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Float.valueOf(value));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> r2, int value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Long.valueOf(value));
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> r3, int value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> r3, int value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Short it = RangesKt.toShortExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    private static final boolean contains(LongRange $this$contains, int value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.longRangeContains($this$contains, value);
    }

    public static final boolean intRangeContains(ClosedRange<Integer> r3, long value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Integer it = RangesKt.toIntExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> r3, long value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    public static final boolean shortRangeContains(ClosedRange<Short> r3, long value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Short it = RangesKt.toShortExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Double.valueOf(value));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Float.valueOf(value));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> r3, long value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Integer it = RangesKt.toIntExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> r3, long value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    public static final boolean shortRangeContains(OpenEndRange<Short> r3, long value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Short it = RangesKt.toShortExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    private static final boolean contains(IntRange $this$contains, long value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.intRangeContains($this$contains, value);
    }

    public static final boolean intRangeContains(ClosedRange<Integer> r1, short value) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.contains(Integer.valueOf(value));
    }

    public static final boolean longRangeContains(ClosedRange<Long> r2, short value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Long.valueOf(value));
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> r3, short value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Double.valueOf(value));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.contains(Float.valueOf(value));
    }

    public static final boolean intRangeContains(OpenEndRange<Integer> r1, short value) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.contains(Integer.valueOf(value));
    }

    public static final boolean longRangeContains(OpenEndRange<Long> r2, short value) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.contains(Long.valueOf(value));
    }

    public static final boolean byteRangeContains(OpenEndRange<Byte> r3, short value) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Byte it = RangesKt.toByteExactOrNull(value);
        if (it != null) goto L7;
        return false;
    L7:
        return r3.contains(it);
    }

    private static final boolean contains(IntRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.intRangeContains($this$contains, value);
    }

    private static final boolean contains(LongRange $this$contains, short value) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return RangesKt.longRangeContains($this$contains, value);
    }

    public static final IntProgression downTo(int $this$downTo, byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final LongProgression downTo(long $this$downTo, byte to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(byte $this$downTo, byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(short $this$downTo, byte to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final CharProgression downTo(char $this$downTo, char to) {
        return CharProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(int $this$downTo, int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final LongProgression downTo(long $this$downTo, int to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(byte $this$downTo, int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(short $this$downTo, int to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final LongProgression downTo(int $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final LongProgression downTo(long $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final LongProgression downTo(byte $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final LongProgression downTo(short $this$downTo, long to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(int $this$downTo, short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final LongProgression downTo(long $this$downTo, short to) {
        return LongProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(byte $this$downTo, short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression downTo(short $this$downTo, short to) {
        return IntProgression.Companion.fromClosedRange($this$downTo, to, -1);
    }

    public static final IntProgression reversed(IntProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return IntProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }

    public static final LongProgression reversed(LongProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return LongProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }

    public static final CharProgression reversed(CharProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return CharProgression.Companion.fromClosedRange($this$reversed.getLast(), $this$reversed.getFirst(), -$this$reversed.getStep());
    }

    public static final IntProgression step(IntProgression $this$step, int step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        if (step <= 0) goto L5;
        boolean r0 = true;
    L6:
        RangesKt.checkStepIsPositive(r0, Integer.valueOf(step));
        IntProgression.Companion r1 = IntProgression.Companion;
        int r2 = $this$step.getFirst();
        int r3 = $this$step.getLast();
        if ($this$step.getStep() <= 0) goto L9;
        int r4 = step;
    L11:
        return r1.fromClosedRange(r2, r3, r4);
    L9:
        r4 = -step;
        goto L11
    L5:
        r0 = false;
        goto L6
    }

    public static final LongProgression step(LongProgression $this$step, long step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        if (step <= 0) goto L5;
        boolean r2 = true;
    L6:
        RangesKt.checkStepIsPositive(r2, Long.valueOf(step));
        LongProgression.Companion r4 = LongProgression.Companion;
        long r5 = $this$step.getFirst();
        long r7 = $this$step.getLast();
        if ($this$step.getStep() <= 0) goto L9;
        long r9 = step;
    L11:
        return r4.fromClosedRange(r5, r7, r9);
    L9:
        r9 = -step;
        goto L11
    L5:
        r2 = false;
        goto L6
    }

    public static final CharProgression step(CharProgression $this$step, int step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        if (step <= 0) goto L5;
        boolean r0 = true;
    L6:
        RangesKt.checkStepIsPositive(r0, Integer.valueOf(step));
        CharProgression.Companion r1 = CharProgression.Companion;
        char r2 = $this$step.getFirst();
        char r3 = $this$step.getLast();
        if ($this$step.getStep() <= 0) goto L9;
        int r4 = step;
    L11:
        return r1.fromClosedRange(r2, r3, r4);
    L9:
        r4 = -step;
        goto L11
    L5:
        r0 = false;
        goto L6
    }

    public static final Byte toByteExactOrNull(int $this$toByteExactOrNull) {
        boolean r1 = false;
        if ((-128) <= $this$toByteExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Byte.valueOf((byte) $this$toByteExactOrNull);
    L5:
        if ($this$toByteExactOrNull >= 128) goto L7;
        r1 = true;
        goto L7
    }

    public static final Byte toByteExactOrNull(long $this$toByteExactOrNull) {
        boolean r1 = false;
        if ((-128) <= $this$toByteExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Byte.valueOf((byte) $this$toByteExactOrNull);
    L5:
        if ($this$toByteExactOrNull >= 128) goto L7;
        r1 = true;
        goto L7
    }

    public static final Byte toByteExactOrNull(short $this$toByteExactOrNull) {
        boolean r1 = false;
        if ((-128) <= $this$toByteExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Byte.valueOf((byte) $this$toByteExactOrNull);
    L5:
        if ($this$toByteExactOrNull >= 128) goto L7;
        r1 = true;
        goto L7
    }

    public static final Byte toByteExactOrNull(double $this$toByteExactOrNull) {
        boolean r1 = false;
        if ((-128.0d) <= $this$toByteExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Byte.valueOf((byte) $this$toByteExactOrNull);
    L5:
        if ($this$toByteExactOrNull > 127.0d) goto L7;
        r1 = true;
        goto L7
    }

    public static final Byte toByteExactOrNull(float $this$toByteExactOrNull) {
        boolean r1 = false;
        if ((-128.0f) <= $this$toByteExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Byte.valueOf((byte) $this$toByteExactOrNull);
    L5:
        if ($this$toByteExactOrNull > 127.0f) goto L7;
        r1 = true;
        goto L7
    }

    public static final Integer toIntExactOrNull(long $this$toIntExactOrNull) {
        boolean r1 = false;
        if (SieveCacheKt.NodeMetaAndPreviousMask <= $this$toIntExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Integer.valueOf((int) $this$toIntExactOrNull);
    L5:
        if ($this$toIntExactOrNull >= 2147483648L) goto L7;
        r1 = true;
        goto L7
    }

    public static final Integer toIntExactOrNull(double $this$toIntExactOrNull) {
        boolean r1 = false;
        if ((-2.147483648E9d) <= $this$toIntExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Integer.valueOf((int) $this$toIntExactOrNull);
    L5:
        if ($this$toIntExactOrNull > 2.147483647E9d) goto L7;
        r1 = true;
        goto L7
    }

    public static final Integer toIntExactOrNull(float $this$toIntExactOrNull) {
        boolean r1 = false;
        if ((-2.1474836E9f) <= $this$toIntExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Integer.valueOf((int) $this$toIntExactOrNull);
    L5:
        if ($this$toIntExactOrNull > 2.1474836E9f) goto L7;
        r1 = true;
        goto L7
    }

    public static final Long toLongExactOrNull(double $this$toLongExactOrNull) {
        boolean r1 = false;
        if ((-9.223372036854776E18d) <= $this$toLongExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Long.valueOf((long) $this$toLongExactOrNull);
    L5:
        if ($this$toLongExactOrNull > 9.223372036854776E18d) goto L7;
        r1 = true;
        goto L7
    }

    public static final Long toLongExactOrNull(float $this$toLongExactOrNull) {
        boolean r1 = false;
        if ((-9.223372E18f) <= $this$toLongExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Long.valueOf((long) $this$toLongExactOrNull);
    L5:
        if ($this$toLongExactOrNull > 9.223372E18f) goto L7;
        r1 = true;
        goto L7
    }

    public static final Short toShortExactOrNull(int $this$toShortExactOrNull) {
        boolean r1 = false;
        if ((-32768) <= $this$toShortExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Short.valueOf((short) $this$toShortExactOrNull);
    L5:
        if ($this$toShortExactOrNull >= 32768) goto L7;
        r1 = true;
        goto L7
    }

    public static final Short toShortExactOrNull(long $this$toShortExactOrNull) {
        boolean r1 = false;
        if ((-32768) <= $this$toShortExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Short.valueOf((short) $this$toShortExactOrNull);
    L5:
        if ($this$toShortExactOrNull >= 32768) goto L7;
        r1 = true;
        goto L7
    }

    public static final Short toShortExactOrNull(double $this$toShortExactOrNull) {
        boolean r1 = false;
        if ((-32768.0d) <= $this$toShortExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Short.valueOf((short) $this$toShortExactOrNull);
    L5:
        if ($this$toShortExactOrNull > 32767.0d) goto L7;
        r1 = true;
        goto L7
    }

    public static final Short toShortExactOrNull(float $this$toShortExactOrNull) {
        boolean r1 = false;
        if ((-32768.0f) <= $this$toShortExactOrNull) goto L5;
    L7:
        if (r1 == true) goto L11;
        return null;
    L11:
        return Short.valueOf((short) $this$toShortExactOrNull);
    L5:
        if ($this$toShortExactOrNull > 32767.0f) goto L7;
        r1 = true;
        goto L7
    }

    public static final IntRange until(int $this$until, byte to) {
        return new IntRange($this$until, to - 1);
    }

    public static final LongRange until(long $this$until, byte to) {
        return new LongRange($this$until, ((long) to) - 1);
    }

    public static final IntRange until(byte $this$until, byte to) {
        return new IntRange($this$until, to - 1);
    }

    public static final IntRange until(short $this$until, byte to) {
        return new IntRange($this$until, to - 1);
    }

    public static final CharRange until(char $this$until, char to) {
        if (Intrinsics.compare(to, 0) > 0) goto L7;
        return CharRange.Companion.getEMPTY();
    L7:
        return new CharRange($this$until, (char) (to - 1));
    }

    public static final IntRange until(int $this$until, int to) {
        if (to > Integer.MIN_VALUE) goto L7;
        return IntRange.Companion.getEMPTY();
    L7:
        return new IntRange($this$until, to - 1);
    }

    public static final LongRange until(long $this$until, int to) {
        return new LongRange($this$until, ((long) to) - 1);
    }

    public static final IntRange until(byte $this$until, int to) {
        if (to > Integer.MIN_VALUE) goto L7;
        return IntRange.Companion.getEMPTY();
    L7:
        return new IntRange($this$until, to - 1);
    }

    public static final IntRange until(short $this$until, int to) {
        if (to > Integer.MIN_VALUE) goto L7;
        return IntRange.Companion.getEMPTY();
    L7:
        return new IntRange($this$until, to - 1);
    }

    public static final LongRange until(int $this$until, long to) {
        if (to > Long.MIN_VALUE) goto L7;
        return LongRange.Companion.getEMPTY();
    L7:
        return new LongRange($this$until, to - 1);
    }

    public static final LongRange until(long $this$until, long to) {
        if (to > Long.MIN_VALUE) goto L7;
        return LongRange.Companion.getEMPTY();
    L7:
        return new LongRange($this$until, to - 1);
    }

    public static final LongRange until(byte $this$until, long to) {
        if (to > Long.MIN_VALUE) goto L7;
        return LongRange.Companion.getEMPTY();
    L7:
        return new LongRange($this$until, to - 1);
    }

    public static final LongRange until(short $this$until, long to) {
        if (to > Long.MIN_VALUE) goto L7;
        return LongRange.Companion.getEMPTY();
    L7:
        return new LongRange($this$until, to - 1);
    }

    public static final IntRange until(int $this$until, short to) {
        return new IntRange($this$until, to - 1);
    }

    public static final LongRange until(long $this$until, short to) {
        return new LongRange($this$until, ((long) to) - 1);
    }

    public static final IntRange until(byte $this$until, short to) {
        return new IntRange($this$until, to - 1);
    }

    public static final IntRange until(short $this$until, short to) {
        return new IntRange($this$until, to - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "minimumValue");
        if (r1.compareTo(r2) >= 0) goto L6;
        return r2;
    L6:
        return r1;
    }

    public static final byte coerceAtLeast(byte $this$coerceAtLeast, byte minimumValue) {
        if ($this$coerceAtLeast >= minimumValue) goto L5;
        return minimumValue;
    L5:
        return $this$coerceAtLeast;
    }

    public static final short coerceAtLeast(short $this$coerceAtLeast, short minimumValue) {
        if ($this$coerceAtLeast >= minimumValue) goto L5;
        return minimumValue;
    L5:
        return $this$coerceAtLeast;
    }

    public static final int coerceAtLeast(int $this$coerceAtLeast, int minimumValue) {
        if ($this$coerceAtLeast >= minimumValue) goto L5;
        return minimumValue;
    L5:
        return $this$coerceAtLeast;
    }

    public static final long coerceAtLeast(long $this$coerceAtLeast, long minimumValue) {
        if ($this$coerceAtLeast >= minimumValue) goto L6;
        return minimumValue;
    L6:
        return $this$coerceAtLeast;
    }

    public static final float coerceAtLeast(float $this$coerceAtLeast, float minimumValue) {
        if ($this$coerceAtLeast >= minimumValue) goto L6;
        return minimumValue;
    L6:
        return $this$coerceAtLeast;
    }

    public static final double coerceAtLeast(double $this$coerceAtLeast, double minimumValue) {
        if ($this$coerceAtLeast >= minimumValue) goto L6;
        return minimumValue;
    L6:
        return $this$coerceAtLeast;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "maximumValue");
        if (r1.compareTo(r2) <= 0) goto L6;
        return r2;
    L6:
        return r1;
    }

    public static final byte coerceAtMost(byte $this$coerceAtMost, byte maximumValue) {
        if ($this$coerceAtMost <= maximumValue) goto L5;
        return maximumValue;
    L5:
        return $this$coerceAtMost;
    }

    public static final short coerceAtMost(short $this$coerceAtMost, short maximumValue) {
        if ($this$coerceAtMost <= maximumValue) goto L5;
        return maximumValue;
    L5:
        return $this$coerceAtMost;
    }

    public static final int coerceAtMost(int $this$coerceAtMost, int maximumValue) {
        if ($this$coerceAtMost <= maximumValue) goto L5;
        return maximumValue;
    L5:
        return $this$coerceAtMost;
    }

    public static final long coerceAtMost(long $this$coerceAtMost, long maximumValue) {
        if ($this$coerceAtMost <= maximumValue) goto L6;
        return maximumValue;
    L6:
        return $this$coerceAtMost;
    }

    public static final float coerceAtMost(float $this$coerceAtMost, float maximumValue) {
        if ($this$coerceAtMost <= maximumValue) goto L6;
        return maximumValue;
    L6:
        return $this$coerceAtMost;
    }

    public static final double coerceAtMost(double $this$coerceAtMost, double maximumValue) {
        if ($this$coerceAtMost <= maximumValue) goto L6;
        return maximumValue;
    L6:
        return $this$coerceAtMost;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T r3, T r4, T r5) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        if (r4 == null) goto L15;
        if (r5 == null) goto L15;
        if (r4.compareTo(r5) > 0) goto L14;
        if (r3.compareTo(r4) >= 0) goto L11;
        return r4;
    L11:
        if (r3.compareTo(r5) <= 0) goto L23;
        return r5;
    L23:
        return r3;
    L14:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r5 + " is less than minimum " + r4 + '.');
    L15:
        if (r4 != null) goto L17;
    L19:
        if (r5 == null) goto L23;
        if (r3.compareTo(r5) <= 0) goto L23;
        return r5;
    L17:
        if (r3.compareTo(r4) >= 0) goto L19;
        return r4;
    }

    public static final byte coerceIn(byte $this$coerceIn, byte minimumValue, byte maximumValue) {
        if (minimumValue > maximumValue) goto L9;
        if ($this$coerceIn >= minimumValue) goto L5;
        return minimumValue;
    L5:
        if ($this$coerceIn <= maximumValue) goto L7;
        return maximumValue;
    L7:
        return $this$coerceIn;
    L9:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
    }

    public static final short coerceIn(short $this$coerceIn, short minimumValue, short maximumValue) {
        if (minimumValue > maximumValue) goto L9;
        if ($this$coerceIn >= minimumValue) goto L5;
        return minimumValue;
    L5:
        if ($this$coerceIn <= maximumValue) goto L7;
        return maximumValue;
    L7:
        return $this$coerceIn;
    L9:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
    }

    public static final int coerceIn(int $this$coerceIn, int minimumValue, int maximumValue) {
        if (minimumValue > maximumValue) goto L9;
        if ($this$coerceIn >= minimumValue) goto L5;
        return minimumValue;
    L5:
        if ($this$coerceIn <= maximumValue) goto L7;
        return maximumValue;
    L7:
        return $this$coerceIn;
    L9:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
    }

    public static final long coerceIn(long $this$coerceIn, long minimumValue, long maximumValue) {
        if (minimumValue > maximumValue) goto L12;
        if ($this$coerceIn >= minimumValue) goto L8;
        return minimumValue;
    L8:
        if ($this$coerceIn <= maximumValue) goto L10;
        return maximumValue;
    L10:
        return $this$coerceIn;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
    }

    public static final float coerceIn(float $this$coerceIn, float minimumValue, float maximumValue) {
        if (minimumValue > maximumValue) goto L12;
        if ($this$coerceIn >= minimumValue) goto L8;
        return minimumValue;
    L8:
        if ($this$coerceIn <= maximumValue) goto L10;
        return maximumValue;
    L10:
        return $this$coerceIn;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
    }

    public static final double coerceIn(double $this$coerceIn, double minimumValue, double maximumValue) {
        if (minimumValue > maximumValue) goto L12;
        if ($this$coerceIn >= minimumValue) goto L8;
        return minimumValue;
    L8:
        if ($this$coerceIn <= maximumValue) goto L10;
        return maximumValue;
    L10:
        return $this$coerceIn;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + maximumValue + " is less than minimum " + minimumValue + '.');
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T r3, ClosedFloatingPointRange<T> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "range");
        if (r4.isEmpty() == true) goto L17;
        if (r4.lessThanOrEquals(r3, r4.getStart()) == false) goto L10;
        if (r4.lessThanOrEquals(r4.getStart(), r3) == true) goto L10;
        return r4.getStart();
    L10:
        if (r4.lessThanOrEquals(r4.getEndInclusive(), r3) == false) goto L15;
        if (r4.lessThanOrEquals(r3, r4.getEndInclusive()) == true) goto L15;
        return r4.getEndInclusive();
    L15:
        return r3;
    L17:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + r4 + '.');
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T r3, ClosedRange<T> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "range");
        if ((r4 instanceof ClosedFloatingPointRange) == false) goto L7;
        return (T) RangesKt.coerceIn(r3, (ClosedFloatingPointRange) r4);
    L7:
        if (r4.isEmpty() == true) goto L17;
        if (r3.compareTo(r4.getStart()) >= 0) goto L12;
        return (T) r4.getStart();
    L12:
        if (r3.compareTo(r4.getEndInclusive()) <= 0) goto L15;
        return (T) r4.getEndInclusive();
    L15:
        return r3;
    L17:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + r4 + '.');
    }

    public static final int coerceIn(int $this$coerceIn, ClosedRange<Integer> r4) {
        Intrinsics.checkNotNullParameter(r4, "range");
        if ((r4 instanceof ClosedFloatingPointRange) == false) goto L7;
        return ((Number) RangesKt.coerceIn(Integer.valueOf($this$coerceIn), (ClosedFloatingPointRange) r4)).intValue();
    L7:
        if (r4.isEmpty() == true) goto L17;
        if ($this$coerceIn >= ((Number) r4.getStart()).intValue()) goto L12;
        return ((Number) r4.getStart()).intValue();
    L12:
        if ($this$coerceIn <= ((Number) r4.getEndInclusive()).intValue()) goto L15;
        return ((Number) r4.getEndInclusive()).intValue();
    L15:
        return $this$coerceIn;
    L17:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + r4 + '.');
    }

    public static final long coerceIn(long $this$coerceIn, ClosedRange<Long> r5) {
        Intrinsics.checkNotNullParameter(r5, "range");
        if ((r5 instanceof ClosedFloatingPointRange) == false) goto L7;
        return ((Number) RangesKt.coerceIn(Long.valueOf($this$coerceIn), (ClosedFloatingPointRange) r5)).longValue();
    L7:
        if (r5.isEmpty() == true) goto L17;
        if ($this$coerceIn >= ((Number) r5.getStart()).longValue()) goto L12;
        return ((Number) r5.getStart()).longValue();
    L12:
        if ($this$coerceIn <= ((Number) r5.getEndInclusive()).longValue()) goto L15;
        return ((Number) r5.getEndInclusive()).longValue();
    L15:
        return $this$coerceIn;
    L17:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + r5 + '.');
    }
}
