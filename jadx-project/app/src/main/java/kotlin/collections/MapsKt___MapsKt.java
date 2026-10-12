package kotlin.collections;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: _Maps.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0001*\u00020\u0004*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052 \u0010\u0006\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001a]\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0001*\u00020\u0004*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052 \u0010\u0006\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001a6\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\r0\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005\u001a\\\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052$\u0010\u0006\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000f0\u0007H\u0086\bø\u0001\u0000\u001aa\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052$\u0010\u0006\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00100\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0011\u001au\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001\"\u0010\b\u0003\u0010\u0013*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0014*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0015\u001a\u0002H\u00132$\u0010\u0006\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aw\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001\"\u0010\b\u0003\u0010\u0013*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0014*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0015\u001a\u0002H\u00132$\u0010\u0006\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00100\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001aV\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0086\bø\u0001\u0000\u001a\\\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0001*\u00020\u0004*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052 \u0010\u0006\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0007H\u0086\bø\u0001\u0000\u001au\u0010\u001a\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0001*\u00020\u0004\"\u0010\b\u0003\u0010\u0013*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0014*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0015\u001a\u0002H\u00132 \u0010\u0006\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001ao\u0010\u001b\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001\"\u0010\b\u0003\u0010\u0013*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u0014*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0015\u001a\u0002H\u00132\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aJ\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0086\bø\u0001\u0000\u001a$\u0010\u001f\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005\u001aJ\u0010\u001f\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0086\bø\u0001\u0000\u001a'\u0010 \u001a\u00020!\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u0087\b\u001aJ\u0010 \u001a\u00020!\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0086\bø\u0001\u0000\u001aJ\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010$\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020#0\u0007H\u0087\bø\u0001\u0000\u001ak\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b(\u001ah\u0010)\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000\u001aJ\u0010*\u001a\u00020+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020+0\u0007H\u0087\bø\u0001\u0000\u001aJ\u0010*\u001a\u00020,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020,0\u0007H\u0087\bø\u0001\u0000\u001a_\u0010*\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aQ\u0010.\u001a\u0004\u0018\u00010+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020+0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aQ\u0010.\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020,0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001aa\u0010.\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aq\u00101\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000103j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001as\u00106\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000103j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001an\u00107\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000522\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b03j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b`4H\u0087\b¢\u0006\u0004\b8\u00109\u001an\u0010:\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000522\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b03j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b`4H\u0087\b¢\u0006\u0002\u00109\u001ak\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\b<\u001ah\u0010=\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000\u001aJ\u0010>\u001a\u00020+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020+0\u0007H\u0087\bø\u0001\u0000\u001aJ\u0010>\u001a\u00020,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020,0\u0007H\u0087\bø\u0001\u0000\u001a_\u0010>\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aQ\u0010?\u001a\u0004\u0018\u00010+\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020+0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aQ\u0010?\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020,0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001aa\u0010?\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010-\u001aq\u0010@\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000103j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001as\u0010A\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000103j\n\u0012\u0006\b\u0000\u0012\u0002H\u0001`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001an\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000522\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b03j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b`4H\u0087\b¢\u0006\u0004\bC\u00109\u001an\u0010D\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000522\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b03j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b`4H\u0087\b¢\u0006\u0002\u00109\u001a$\u0010E\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005\u001aJ\u0010E\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u001e\u0010\u001e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0086\bø\u0001\u0000\u001aY\u0010F\u001a\u0002HG\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0016\b\u0002\u0010G*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005*\u0002HG2\u001e\u0010$\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020#0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010H\u001an\u0010I\u001a\u0002HG\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0016\b\u0002\u0010G*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005*\u0002HG23\u0010$\u001a/\u0012\u0013\u0012\u00110!¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(M\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0004\u0012\u00020#0JH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010N\u001a9\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b0\u000f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u0087\b\u001a6\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\b0\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Q"}, d2 = {"firstNotNullOf", "R", "K", "V", "", "", "transform", "Lkotlin/Function1;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstNotNullOfOrNull", "toList", "", "Lkotlin/Pair;", "flatMap", "", "Lkotlin/sequences/Sequence;", "flatMapSequence", "flatMapTo", "C", "", "destination", "(Ljava/util/Map;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "flatMapSequenceTo", "map", "mapNotNull", "mapNotNullTo", "mapTo", "all", "", "predicate", "any", "count", "", "forEach", "", "action", "maxBy", "", "selector", "maxByOrThrow", "maxByOrNull", "maxOf", "", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "maxOfOrNull", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Double;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Float;", "maxOfWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Map;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxOfWithOrNull", "maxWith", "maxWithOrThrow", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/Map$Entry;", "maxWithOrNull", "minBy", "minByOrThrow", "minByOrNull", "minOf", "minOfOrNull", "minOfWith", "minOfWithOrNull", "minWith", "minWithOrThrow", "minWithOrNull", "none", "onEach", "M", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "onEachIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "asIterable", "asSequence", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt___MapsKt extends MapsKt___MapsJvmKt {
    public MapsKt___MapsKt() {
    }

    private static final <K, V, R> R firstNotNullOf(Map<? extends K, ? extends V> r2, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> r0 = r2.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        R r1 = r3.invoke(r0.next());
        if (r1 == null) goto L4;
    L9:
        if (r1 == null) goto L12;
        return r1;
    L12:
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    L8:
        r1 = null;
        goto L9
    }

    private static final <K, V, R> R firstNotNullOfOrNull(Map<? extends K, ? extends V> r3, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> r0 = r3.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        R r2 = r4.invoke(r0.next());
        if (r2 == null) goto L4;
        return r2;
    L8:
        return null;
    }

    public static final <K, V> List<Pair<K, V>> toList(Map<? extends K, ? extends V> r6) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        if (r6.size() == 0) goto L5;
        Iterator<Map.Entry<? extends K, ? extends V>> r0 = r6.entrySet().iterator();
        if (r0.hasNext() == false) goto L9;
        Map.Entry<? extends K, ? extends V> r1 = r0.next();
        if (r0.hasNext() == false) goto L13;
        ArrayList result = new ArrayList(r6.size());
        result.add(new Pair(r1.getKey(), r1.getValue()));
    L15:
        Map.Entry<? extends K, ? extends V> r3 = r0.next();
        result.add(new Pair(r3.getKey(), r3.getValue()));
        if (r0.hasNext() == true) goto L15;
        return result;
    L13:
        return CollectionsKt.listOf(new Pair(r1.getKey(), r1.getValue()));
    L9:
        return CollectionsKt.emptyList();
    L5:
        return CollectionsKt.emptyList();
    }

    public static final <K, V, R> List<R> flatMap(Map<? extends K, ? extends V> r7, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> r8) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        Intrinsics.checkNotNullParameter(r8, "transform");
        Collection destination$iv = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> r4 = r7.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        CollectionsKt.addAll(destination$iv, r8.invoke(r4.next()));
        goto L4
    L7:
        return (List) destination$iv;
    }

    public static final <K, V, R> List<R> flatMapSequence(Map<? extends K, ? extends V> r7, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> r8) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        Intrinsics.checkNotNullParameter(r8, "transform");
        Collection destination$iv = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> r4 = r7.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        CollectionsKt.addAll(destination$iv, r8.invoke(r4.next()));
        goto L4
    L7:
        return (List) destination$iv;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(Map<? extends K, ? extends V> r4, C r5, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "destination");
        Intrinsics.checkNotNullParameter(r6, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r4.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        CollectionsKt.addAll(r5, r6.invoke(r1.next()));
        goto L4
    L6:
        return r5;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapSequenceTo(Map<? extends K, ? extends V> r4, C r5, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends Sequence<? extends R>> r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "destination");
        Intrinsics.checkNotNullParameter(r6, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r4.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        CollectionsKt.addAll(r5, r6.invoke(r1.next()));
        goto L4
    L6:
        return r5;
    }

    public static final <K, V, R> List<R> map(Map<? extends K, ? extends V> r7, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r8) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        Intrinsics.checkNotNullParameter(r8, "transform");
        Collection destination$iv = new ArrayList(r7.size());
        Iterator<Map.Entry<? extends K, ? extends V>> r4 = r7.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        destination$iv.add(r8.invoke(r4.next()));
        goto L4
    L7:
        return (List) destination$iv;
    }

    public static final <K, V, R> List<R> mapNotNull(Map<? extends K, ? extends V> r12, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r13) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        Intrinsics.checkNotNullParameter(r13, "transform");
        Collection destination$iv = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> r6 = r12.entrySet().iterator();
    L4:
        if (r6.hasNext() == false) goto L10;
        R r10 = r13.invoke(r6.next());
        if (r10 == null) goto L4;
        destination$iv.add(r10);
        goto L4
    L10:
        return (List) destination$iv;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(Map<? extends K, ? extends V> r9, C r10, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r11) {
        Intrinsics.checkNotNullParameter(r9, "<this>");
        Intrinsics.checkNotNullParameter(r10, "destination");
        Intrinsics.checkNotNullParameter(r11, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> r3 = r9.entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L10;
        R r7 = r11.invoke(r3.next());
        if (r7 == null) goto L4;
        r10.add(r7);
        goto L4
    L10:
        return r10;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapTo(Map<? extends K, ? extends V> r4, C r5, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "destination");
        Intrinsics.checkNotNullParameter(r6, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r4.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r5.add(r6.invoke(r1.next()));
        goto L4
    L6:
        return r5;
    }

    public static final <K, V> boolean all(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "predicate");
        if (r5.isEmpty() == false) goto L5;
        return true;
    L5:
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r5.entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        if (r6.invoke(r1.next()).booleanValue() == true) goto L7;
        return false;
    L12:
        return true;
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return !r1.isEmpty();
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "predicate");
        if (r5.isEmpty() == false) goto L5;
        return false;
    L5:
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r5.entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        if (r6.invoke(r1.next()).booleanValue() == false) goto L7;
        return true;
    L12:
        return false;
    }

    private static final <K, V> int count(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.size();
    }

    public static final <K, V> int count(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "predicate");
        if (r5.isEmpty() == false) goto L6;
        return 0;
    L6:
        int count = 0;
        Iterator<Map.Entry<? extends K, ? extends V>> r2 = r5.entrySet().iterator();
    L8:
        if (r2.hasNext() == false) goto L12;
        if (r6.invoke(r2.next()).booleanValue() == false) goto L8;
        count = count + 1;
        goto L8
    L12:
        return count;
    }

    public static final <K, V> void forEach(Map<? extends K, ? extends V> r3, Function1<? super Map.Entry<? extends K, ? extends V>, Unit> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r3.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r4.invoke(r1.next());
        goto L4
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrThrow(Map<? extends K, ? extends V> r8, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "selector");
        Iterable $this$maxBy$iv = r8.entrySet();
        Iterator iterator$iv = $this$maxBy$iv.iterator();
        if (iterator$iv.hasNext() == false) goto L16;
        Object maxElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L14;
        Comparable maxValue$iv = r9.invoke(maxElem$iv);
    L8:
        Object e$iv = iterator$iv.next();
        R r6 = r9.invoke(e$iv);
        if (maxValue$iv.compareTo(r6) >= 0) goto L12;
        maxElem$iv = e$iv;
        maxValue$iv = r6;
    L12:
        if (iterator$iv.hasNext() == true) goto L8;
    L14:
        return (Map.Entry) maxElem$iv;
    L16:
        throw new NoSuchElementException();
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> maxByOrNull(Map<? extends K, ? extends V> r8, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "selector");
        Iterable $this$maxByOrNull$iv = r8.entrySet();
        Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
        if (iterator$iv.hasNext() == true) goto L5;
        Object maxElem$iv = null;
    L15:
        return (Map.Entry) maxElem$iv;
    L5:
        maxElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L15;
        Comparable maxValue$iv = r9.invoke(maxElem$iv);
    L9:
        Object e$iv = iterator$iv.next();
        R r6 = r9.invoke(e$iv);
        if (maxValue$iv.compareTo(r6) >= 0) goto L13;
        maxElem$iv = e$iv;
        maxValue$iv = r6;
    L13:
        if (iterator$iv.hasNext() == true) goto L9;
        goto L15
    }

    private static final <K, V> double maxOf(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Double> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r5.entrySet().iterator();
        if (r0.hasNext() == false) goto L10;
        double r1 = r6.invoke((Object) r0.next()).doubleValue();
    L6:
        if (r0.hasNext() == false) goto L8;
        r1 = Math.max(r1, r6.invoke((Object) r0.next()).doubleValue());
        goto L6
    L8:
        return r1;
    L10:
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V> float m7875maxOf(Map<? extends K, ? extends V> r3, Function1<? super Map.Entry<? extends K, ? extends V>, Float> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "selector");
        Iterator<T> r0 = r3.entrySet().iterator();
        if (r0.hasNext() == false) goto L10;
        float r1 = r4.invoke((Object) r0.next()).floatValue();
    L6:
        if (r0.hasNext() == false) goto L8;
        r1 = Math.max(r1, r4.invoke((Object) r0.next()).floatValue());
        goto L6
    L8:
        return r1;
    L10:
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m7876maxOf(Map<? extends K, ? extends V> r4, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == false) goto L12;
        R r1 = r5.invoke((Object) r0.next());
    L6:
        if (r0.hasNext() == false) goto L10;
        R r2 = r5.invoke((Object) r0.next());
        if (r1.compareTo(r2) >= 0) goto L6;
        r1 = r2;
        goto L6
    L10:
        return r1;
    L12:
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m7877maxOfOrNull(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Double> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r5.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        double r1 = r6.invoke((Object) r0.next()).doubleValue();
    L7:
        if (r0.hasNext() == false) goto L10;
        r1 = Math.max(r1, r6.invoke((Object) r0.next()).doubleValue());
        goto L7
    L10:
        return Double.valueOf(r1);
    }

    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m7878maxOfOrNull(Map<? extends K, ? extends V> r3, Function1<? super Map.Entry<? extends K, ? extends V>, Float> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "selector");
        Iterator<T> r0 = r3.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        float r1 = r4.invoke((Object) r0.next()).floatValue();
    L7:
        if (r0.hasNext() == false) goto L10;
        r1 = Math.max(r1, r4.invoke((Object) r0.next()).floatValue());
        goto L7
    L10:
        return Float.valueOf(r1);
    }

    private static final <K, V, R extends Comparable<? super R>> R maxOfOrNull(Map<? extends K, ? extends V> r4, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        R r1 = r5.invoke((Object) r0.next());
    L7:
        if (r0.hasNext() == false) goto L12;
        R r2 = r5.invoke((Object) r0.next());
        if (r1.compareTo(r2) >= 0) goto L7;
        r1 = r2;
        goto L7
    L12:
        return r1;
    }

    private static final <K, V, R> R maxOfWith(Map<? extends K, ? extends V> r4, Comparator<? super R> r5, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "comparator");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == false) goto L12;
        R r1 = r6.invoke((Object) r0.next());
    L6:
        if (r0.hasNext() == false) goto L10;
        R r2 = r6.invoke((Object) r0.next());
        if (r5.compare(r1, r2) >= 0) goto L6;
        r1 = r2;
        goto L6
    L10:
        return r1;
    L12:
        throw new NoSuchElementException();
    }

    private static final <K, V, R> R maxOfWithOrNull(Map<? extends K, ? extends V> r4, Comparator<? super R> r5, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "comparator");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        R r1 = r6.invoke((Object) r0.next());
    L7:
        if (r0.hasNext() == false) goto L12;
        R r2 = r6.invoke((Object) r0.next());
        if (r5.compare(r1, r2) >= 0) goto L7;
        r1 = (Object) r2;
        goto L7
    L12:
        return r1;
    }

    private static final <K, V> Map.Entry<K, V> maxWithOrThrow(Map<? extends K, ? extends V> r1, Comparator<? super Map.Entry<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "comparator");
        return (Map.Entry) CollectionsKt.maxWithOrThrow(r1.entrySet(), r2);
    }

    private static final <K, V> Map.Entry<K, V> maxWithOrNull(Map<? extends K, ? extends V> r1, Comparator<? super Map.Entry<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "comparator");
        return (Map.Entry) CollectionsKt.maxWithOrNull(r1.entrySet(), r2);
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrThrow(Map<? extends K, ? extends V> r8, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "selector");
        Iterable $this$minBy$iv = r8.entrySet();
        Iterator iterator$iv = $this$minBy$iv.iterator();
        if (iterator$iv.hasNext() == false) goto L16;
        Object minElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L14;
        Comparable minValue$iv = r9.invoke(minElem$iv);
    L8:
        Object e$iv = iterator$iv.next();
        R r6 = r9.invoke(e$iv);
        if (minValue$iv.compareTo(r6) <= 0) goto L12;
        minElem$iv = e$iv;
        minValue$iv = r6;
    L12:
        if (iterator$iv.hasNext() == true) goto L8;
    L14:
        return (Map.Entry) minElem$iv;
    L16:
        throw new NoSuchElementException();
    }

    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minByOrNull(Map<? extends K, ? extends V> r8, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "selector");
        Iterable $this$minByOrNull$iv = r8.entrySet();
        Iterator iterator$iv = $this$minByOrNull$iv.iterator();
        if (iterator$iv.hasNext() == true) goto L5;
        Object minElem$iv = null;
    L15:
        return (Map.Entry) minElem$iv;
    L5:
        minElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L15;
        Comparable minValue$iv = r9.invoke(minElem$iv);
    L9:
        Object e$iv = iterator$iv.next();
        R r6 = r9.invoke(e$iv);
        if (minValue$iv.compareTo(r6) <= 0) goto L13;
        minElem$iv = e$iv;
        minValue$iv = r6;
    L13:
        if (iterator$iv.hasNext() == true) goto L9;
        goto L15
    }

    private static final <K, V> double minOf(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Double> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r5.entrySet().iterator();
        if (r0.hasNext() == false) goto L10;
        double r1 = r6.invoke((Object) r0.next()).doubleValue();
    L6:
        if (r0.hasNext() == false) goto L8;
        r1 = Math.min(r1, r6.invoke((Object) r0.next()).doubleValue());
        goto L6
    L8:
        return r1;
    L10:
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <K, V> float m7879minOf(Map<? extends K, ? extends V> r3, Function1<? super Map.Entry<? extends K, ? extends V>, Float> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "selector");
        Iterator<T> r0 = r3.entrySet().iterator();
        if (r0.hasNext() == false) goto L10;
        float r1 = r4.invoke((Object) r0.next()).floatValue();
    L6:
        if (r0.hasNext() == false) goto L8;
        r1 = Math.min(r1, r4.invoke((Object) r0.next()).floatValue());
        goto L6
    L8:
        return r1;
    L10:
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <K, V, R extends Comparable<? super R>> R m7880minOf(Map<? extends K, ? extends V> r4, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == false) goto L12;
        R r1 = r5.invoke((Object) r0.next());
    L6:
        if (r0.hasNext() == false) goto L10;
        R r2 = r5.invoke((Object) r0.next());
        if (r1.compareTo(r2) <= 0) goto L6;
        r1 = r2;
        goto L6
    L10:
        return r1;
    L12:
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Double m7881minOfOrNull(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Double> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r5.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        double r1 = r6.invoke((Object) r0.next()).doubleValue();
    L7:
        if (r0.hasNext() == false) goto L10;
        r1 = Math.min(r1, r6.invoke((Object) r0.next()).doubleValue());
        goto L7
    L10:
        return Double.valueOf(r1);
    }

    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <K, V> Float m7882minOfOrNull(Map<? extends K, ? extends V> r3, Function1<? super Map.Entry<? extends K, ? extends V>, Float> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "selector");
        Iterator<T> r0 = r3.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        float r1 = r4.invoke((Object) r0.next()).floatValue();
    L7:
        if (r0.hasNext() == false) goto L10;
        r1 = Math.min(r1, r4.invoke((Object) r0.next()).floatValue());
        goto L7
    L10:
        return Float.valueOf(r1);
    }

    private static final <K, V, R extends Comparable<? super R>> R minOfOrNull(Map<? extends K, ? extends V> r4, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        R r1 = r5.invoke((Object) r0.next());
    L7:
        if (r0.hasNext() == false) goto L12;
        R r2 = r5.invoke((Object) r0.next());
        if (r1.compareTo(r2) <= 0) goto L7;
        r1 = r2;
        goto L7
    L12:
        return r1;
    }

    private static final <K, V, R> R minOfWith(Map<? extends K, ? extends V> r4, Comparator<? super R> r5, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "comparator");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == false) goto L12;
        R r1 = r6.invoke((Object) r0.next());
    L6:
        if (r0.hasNext() == false) goto L10;
        R r2 = r6.invoke((Object) r0.next());
        if (r5.compare(r1, r2) <= 0) goto L6;
        r1 = r2;
        goto L6
    L10:
        return r1;
    L12:
        throw new NoSuchElementException();
    }

    private static final <K, V, R> R minOfWithOrNull(Map<? extends K, ? extends V> r4, Comparator<? super R> r5, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "comparator");
        Intrinsics.checkNotNullParameter(r6, "selector");
        Iterator<T> r0 = r4.entrySet().iterator();
        if (r0.hasNext() == true) goto L5;
        return null;
    L5:
        R r1 = r6.invoke((Object) r0.next());
    L7:
        if (r0.hasNext() == false) goto L12;
        R r2 = r6.invoke((Object) r0.next());
        if (r5.compare(r1, r2) <= 0) goto L7;
        r1 = (Object) r2;
        goto L7
    L12:
        return r1;
    }

    private static final <K, V> Map.Entry<K, V> minWithOrThrow(Map<? extends K, ? extends V> r1, Comparator<? super Map.Entry<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "comparator");
        return (Map.Entry) CollectionsKt.minWithOrThrow(r1.entrySet(), r2);
    }

    private static final <K, V> Map.Entry<K, V> minWithOrNull(Map<? extends K, ? extends V> r1, Comparator<? super Map.Entry<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "comparator");
        return (Map.Entry) CollectionsKt.minWithOrNull(r1.entrySet(), r2);
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.isEmpty();
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> r5, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "predicate");
        if (r5.isEmpty() == false) goto L5;
        return true;
    L5:
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r5.entrySet().iterator();
    L7:
        if (r1.hasNext() == false) goto L12;
        if (r6.invoke(r1.next()).booleanValue() == false) goto L7;
        return false;
    L12:
        return true;
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(M r5, Function1<? super Map.Entry<? extends K, ? extends V>, Unit> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "action");
        Iterator<Map.Entry<K, V>> r3 = r5.entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r6.invoke(r3.next());
        goto L4
    L6:
        return r5;
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEachIndexed(M r9, Function2<? super Integer, ? super Map.Entry<? extends K, ? extends V>, Unit> r10) {
        Intrinsics.checkNotNullParameter(r9, "<this>");
        Intrinsics.checkNotNullParameter(r10, "action");
        Iterable $this$forEachIndexed$iv = r9.entrySet();
        int index$iv = 0;
        Iterator r6 = $this$forEachIndexed$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L10;
        Object item$iv = r6.next();
        int index$iv2 = index$iv + 1;
        if (index$iv >= 0) goto L8;
        CollectionsKt.throwIndexOverflow();
    L8:
        r10.invoke(Integer.valueOf(index$iv), item$iv);
        index$iv = index$iv2;
        goto L4
    L10:
        return r9;
    }

    private static final <K, V> Iterable<Map.Entry<K, V>> asIterable(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.entrySet();
    }

    public static final <K, V> Sequence<Map.Entry<K, V>> asSequence(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return CollectionsKt.asSequence(r1.entrySet());
    }
}
