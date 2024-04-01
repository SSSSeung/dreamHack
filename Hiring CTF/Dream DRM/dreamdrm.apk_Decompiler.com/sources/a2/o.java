package a2;

import android.util.Log;
import com.bumptech.glide.load.data.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k2.a;
import w0.c;
import y1.i;
import y1.k;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Class f125a;

    /* renamed from: b  reason: collision with root package name */
    public final List f126b;

    /* renamed from: c  reason: collision with root package name */
    public final a f127c;

    /* renamed from: d  reason: collision with root package name */
    public final c f128d;

    /* renamed from: e  reason: collision with root package name */
    public final String f129e;

    public o(Class cls, Class cls2, Class cls3, List list, a aVar, androidx.activity.result.c cVar) {
        this.f125a = cls;
        this.f126b = list;
        this.f127c = aVar;
        this.f128d = cVar;
        this.f129e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: a2.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: a2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: a2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: a2.h0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a2.f0 a(int r18, int r19, androidx.appcompat.widget.a0 r20, y1.i r21, com.bumptech.glide.load.data.g r22) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            w0.c r8 = r7.f128d
            java.lang.Object r1 = r8.b()
            b1.o.i(r1)
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            r1 = r17
            r2 = r22
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r9
            a2.f0 r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x013f }
            r8.a(r9)
            java.lang.Object r2 = r0.f504f
            a2.n r2 = (a2.n) r2
            java.lang.Object r0 = r0.f503e
            y1.a r0 = (y1.a) r0
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            y1.a r3 = y1.a.f5803g
            a2.i r4 = r2.f103d
            r5 = 0
            if (r0 == r3) goto L_0x004c
            y1.m r3 = r4.e(r15)
            com.bumptech.glide.g r6 = r2.f110k
            int r8 = r2.f114o
            int r9 = r2.f115p
            a2.f0 r6 = r3.b(r6, r1, r8, r9)
            r14 = r3
            goto L_0x004e
        L_0x004c:
            r6 = r1
            r14 = r5
        L_0x004e:
            boolean r3 = r1.equals(r6)
            if (r3 != 0) goto L_0x0057
            r1.d()
        L_0x0057:
            com.bumptech.glide.g r1 = r4.f71c
            com.bumptech.glide.k r1 = r1.f1726b
            d4.a r1 = r1.f1743d
            java.lang.Class r3 = r6.c()
            y1.l r1 = r1.a(r3)
            r3 = 1
            if (r1 == 0) goto L_0x006a
            r1 = r3
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            r8 = 2
            if (r1 == 0) goto L_0x0092
            com.bumptech.glide.g r1 = r4.f71c
            com.bumptech.glide.k r1 = r1.f1726b
            r1.getClass()
            java.lang.Class r5 = r6.c()
            d4.a r1 = r1.f1743d
            y1.l r5 = r1.a(r5)
            if (r5 == 0) goto L_0x0088
            y1.i r1 = r2.f117r
            int r1 = r5.k(r1)
            goto L_0x0093
        L_0x0088:
            com.bumptech.glide.j r0 = new com.bumptech.glide.j
            java.lang.Class r1 = r6.c()
            r0.<init>((int) r8, (java.lang.Class) r1)
            throw r0
        L_0x0092:
            r1 = 3
        L_0x0093:
            y1.f r9 = r2.f123y
            java.util.ArrayList r10 = r4.b()
            int r11 = r10.size()
            r12 = 0
        L_0x009e:
            if (r12 >= r11) goto L_0x00b5
            java.lang.Object r16 = r10.get(r12)
            r13 = r16
            e2.u r13 = (e2.u) r13
            y1.f r13 = r13.f2544a
            boolean r13 = r13.equals(r9)
            if (r13 == 0) goto L_0x00b2
            r9 = r3
            goto L_0x00b6
        L_0x00b2:
            int r12 = r12 + 1
            goto L_0x009e
        L_0x00b5:
            r9 = 0
        L_0x00b6:
            r9 = r9 ^ r3
            a2.q r10 = r2.f116q
            a2.p r10 = (a2.p) r10
            int r10 = r10.f130d
            switch(r10) {
                case 1: goto L_0x00ce;
                case 2: goto L_0x00ce;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            if (r9 == 0) goto L_0x00c6
            y1.a r9 = y1.a.f5802f
            if (r0 == r9) goto L_0x00ca
        L_0x00c6:
            y1.a r9 = y1.a.f5800d
            if (r0 != r9) goto L_0x00ce
        L_0x00ca:
            if (r1 != r8) goto L_0x00ce
            r0 = r3
            goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            if (r0 == 0) goto L_0x0136
            if (r5 == 0) goto L_0x0128
            int r0 = y.d.b(r1)
            if (r0 == 0) goto L_0x0103
            if (r0 != r3) goto L_0x00f3
            a2.h0 r0 = new a2.h0
            com.bumptech.glide.g r1 = r4.f71c
            b2.h r9 = r1.f1725a
            y1.f r10 = r2.f123y
            y1.f r11 = r2.f111l
            int r12 = r2.f114o
            int r13 = r2.f115p
            y1.i r1 = r2.f117r
            r8 = r0
            r4 = 0
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x010d
        L_0x00f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = a2.m.y(r1)
            java.lang.String r2 = "Unknown strategy: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0103:
            r4 = 0
            a2.f r0 = new a2.f
            y1.f r1 = r2.f123y
            y1.f r8 = r2.f111l
            r0.<init>(r1, r8)
        L_0x010d:
            androidx.activity.result.c r1 = a2.e0.f43h
            java.lang.Object r1 = r1.b()
            a2.e0 r1 = (a2.e0) r1
            b1.o.i(r1)
            r1.f47g = r4
            r1.f46f = r3
            r1.f45e = r6
            a2.k r2 = r2.f108i
            r2.f90a = r0
            r2.f91b = r5
            r2.f92c = r1
            r6 = r1
            goto L_0x0136
        L_0x0128:
            com.bumptech.glide.j r0 = new com.bumptech.glide.j
            java.lang.Object r1 = r6.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>((int) r8, (java.lang.Class) r1)
            throw r0
        L_0x0136:
            k2.a r0 = r7.f127c
            r1 = r21
            a2.f0 r0 = r0.f(r6, r1)
            return r0
        L_0x013f:
            r0 = move-exception
            r1 = r0
            r8.a(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.o.a(int, int, androidx.appcompat.widget.a0, y1.i, com.bumptech.glide.load.data.g):a2.f0");
    }

    public final f0 b(g gVar, int i3, int i6, i iVar, List list) {
        List list2 = this.f126b;
        int size = list2.size();
        f0 f0Var = null;
        for (int i7 = 0; i7 < size; i7++) {
            k kVar = (k) list2.get(i7);
            try {
                if (kVar.b(gVar.d(), iVar)) {
                    f0Var = kVar.a(gVar.d(), i3, i6, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e6);
                }
                list.add(e6);
            }
            if (f0Var != null) {
                break;
            }
        }
        if (f0Var != null) {
            return f0Var;
        }
        throw new b0(this.f129e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f125a + ", decoders=" + this.f126b + ", transcoder=" + this.f127c + '}';
    }
}
