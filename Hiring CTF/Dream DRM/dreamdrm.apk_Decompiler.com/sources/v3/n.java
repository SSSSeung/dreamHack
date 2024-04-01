package v3;

import com.google.gson.reflect.TypeToken;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import l2.l;
import x3.i;
import x3.k;
import y3.b;
import y3.d;
import y3.e;
import y3.g;
import y3.j;
import y3.o;
import y3.u;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f5397a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f5398b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final l f5399c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5400d;

    /* renamed from: e  reason: collision with root package name */
    public final List f5401e;

    public n() {
        i iVar = i.f5727f;
        Map emptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        l lVar = new l(emptyMap, emptyList2);
        this.f5399c = lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(u.A);
        arrayList.add(j.f5864b);
        arrayList.add(iVar);
        arrayList.addAll(emptyList);
        arrayList.add(u.f5912p);
        arrayList.add(u.f5903g);
        arrayList.add(u.f5900d);
        arrayList.add(u.f5901e);
        arrayList.add(u.f5902f);
        k kVar = u.f5907k;
        arrayList.add(u.b(Long.TYPE, Long.class, kVar));
        arrayList.add(u.b(Double.TYPE, Double.class, new j(0)));
        arrayList.add(u.b(Float.TYPE, Float.class, new j(1)));
        arrayList.add(y3.i.f5862b);
        arrayList.add(u.f5904h);
        arrayList.add(u.f5905i);
        arrayList.add(u.a(AtomicLong.class, new l(kVar, 0).a()));
        arrayList.add(u.a(AtomicLongArray.class, new l(kVar, 1).a()));
        arrayList.add(u.f5906j);
        arrayList.add(u.f5908l);
        arrayList.add(u.f5913q);
        arrayList.add(u.f5914r);
        arrayList.add(u.a(BigDecimal.class, u.f5909m));
        arrayList.add(u.a(BigInteger.class, u.f5910n));
        arrayList.add(u.a(k.class, u.f5911o));
        arrayList.add(u.f5915s);
        arrayList.add(u.f5916t);
        arrayList.add(u.f5918v);
        arrayList.add(u.w);
        arrayList.add(u.f5920y);
        arrayList.add(u.f5917u);
        arrayList.add(u.f5898b);
        arrayList.add(e.f5854b);
        arrayList.add(u.f5919x);
        if (b4.d.f1592a) {
            arrayList.add(b4.d.f1594c);
            arrayList.add(b4.d.f1593b);
            arrayList.add(b4.d.f1595d);
        }
        arrayList.add(b.f5846c);
        arrayList.add(u.f5897a);
        arrayList.add(new d(lVar, 0));
        arrayList.add(new g(lVar));
        d dVar = new d(lVar, 1);
        this.f5400d = dVar;
        arrayList.add(dVar);
        arrayList.add(u.B);
        arrayList.add(new o(lVar, iVar, dVar, emptyList2));
        this.f5401e = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        throw new java.lang.AssertionError("AssertionError (GSON 2.10.1): " + r6.getMessage(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        throw new v3.q((java.lang.Exception) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        throw new v3.q((java.lang.Exception) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        throw new v3.q((java.lang.Exception) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        r5.f1641e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[Catch:{ EOFException -> 0x0025, IllegalStateException -> 0x0048, IOException -> 0x003f, AssertionError -> 0x0028, all -> 0x0046 }, ExcHandler: IOException (r6v10 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:3:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[Catch:{ EOFException -> 0x0025, IllegalStateException -> 0x0048, IOException -> 0x003f, AssertionError -> 0x0028, all -> 0x0046 }, ExcHandler: IllegalStateException (r6v8 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:3:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[SYNTHETIC, Splitter:B:25:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076 A[SYNTHETIC, Splitter:B:38:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028 A[ExcHandler: AssertionError (r6v11 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:3:0x0019] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r5, java.lang.reflect.Type r6) {
        /*
            r4 = this;
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r0.<init>(r6)
            r6 = 0
            if (r5 != 0) goto L_0x0009
            goto L_0x0075
        L_0x0009:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r5)
            c4.a r5 = new c4.a
            r5.<init>(r1)
            java.lang.String r1 = "AssertionError (GSON 2.10.1): "
            r2 = 1
            r5.f1641e = r2
            r3 = 0
            r5.Q()     // Catch:{ EOFException -> 0x004f, IllegalStateException -> 0x0048, IOException -> 0x003f, AssertionError -> 0x0028 }
            v3.a0 r0 = r4.b(r0)     // Catch:{ EOFException -> 0x0025, IllegalStateException -> 0x0048, IOException -> 0x003f, AssertionError -> 0x0028 }
            java.lang.Object r6 = r0.b(r5)     // Catch:{ EOFException -> 0x0025, IllegalStateException -> 0x0048, IOException -> 0x003f, AssertionError -> 0x0028 }
            goto L_0x0052
        L_0x0025:
            r0 = move-exception
            r2 = r3
            goto L_0x0050
        L_0x0028:
            r6 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r2.<init>(r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0046 }
            r2.append(r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0046 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x003f:
            r6 = move-exception
            v3.q r0 = new v3.q     // Catch:{ all -> 0x0046 }
            r0.<init>((java.lang.Exception) r6)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r6 = move-exception
            goto L_0x007c
        L_0x0048:
            r6 = move-exception
            v3.q r0 = new v3.q     // Catch:{ all -> 0x0046 }
            r0.<init>((java.lang.Exception) r6)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            if (r2 == 0) goto L_0x0076
        L_0x0052:
            r5.f1641e = r3
            if (r6 == 0) goto L_0x0075
            int r5 = r5.Q()     // Catch:{ c -> 0x006e, IOException -> 0x0067 }
            r0 = 10
            if (r5 != r0) goto L_0x005f
            goto L_0x0075
        L_0x005f:
            v3.q r5 = new v3.q     // Catch:{ c -> 0x006e, IOException -> 0x0067 }
            java.lang.String r6 = "JSON document was not fully consumed."
            r5.<init>((java.lang.String) r6)     // Catch:{ c -> 0x006e, IOException -> 0x0067 }
            throw r5     // Catch:{ c -> 0x006e, IOException -> 0x0067 }
        L_0x0067:
            r5 = move-exception
            v3.q r6 = new v3.q
            r6.<init>((java.lang.Exception) r5)
            throw r6
        L_0x006e:
            r5 = move-exception
            v3.q r6 = new v3.q
            r6.<init>((java.lang.Exception) r5)
            throw r6
        L_0x0075:
            return r6
        L_0x0076:
            v3.q r6 = new v3.q     // Catch:{ all -> 0x0046 }
            r6.<init>((java.lang.Exception) r0)     // Catch:{ all -> 0x0046 }
            throw r6     // Catch:{ all -> 0x0046 }
        L_0x007c:
            r5.f1641e = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.n.a(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    public final a0 b(TypeToken typeToken) {
        boolean z5;
        ConcurrentHashMap concurrentHashMap = this.f5398b;
        a0 a0Var = (a0) concurrentHashMap.get(typeToken);
        if (a0Var != null) {
            return a0Var;
        }
        ThreadLocal threadLocal = this.f5397a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z5 = true;
        } else {
            a0 a0Var2 = (a0) map.get(typeToken);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z5 = false;
        }
        try {
            m mVar = new m();
            map.put(typeToken, mVar);
            Iterator it = this.f5401e.iterator();
            a0 a0Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a0Var3 = ((b0) it.next()).a(this, typeToken);
                if (a0Var3 != null) {
                    if (mVar.f5396a == null) {
                        mVar.f5396a = a0Var3;
                        map.put(typeToken, a0Var3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (a0Var3 != null) {
                if (z5) {
                    concurrentHashMap.putAll(map);
                }
                return a0Var3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } finally {
            if (z5) {
                threadLocal.remove();
            }
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f5401e + ",instanceCreators:" + this.f5399c + "}";
    }
}
