package p;

import f4.h;
import k4.g;
import o4.e;

public final class d extends g implements e {

    /* renamed from: f  reason: collision with root package name */
    public int[] f4358f;

    /* renamed from: g  reason: collision with root package name */
    public int f4359g;

    /* renamed from: h  reason: collision with root package name */
    public int f4360h;

    /* renamed from: i  reason: collision with root package name */
    public int f4361i;

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f4362j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f4363k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, i4.d dVar) {
        super(dVar);
        this.f4363k = eVar;
    }

    public final i4.d b(Object obj, i4.d dVar) {
        d dVar2 = new d(this.f4363k, dVar);
        dVar2.f4362j = obj;
        return dVar2;
    }

    public final Object h(Object obj, Object obj2) {
        return ((d) b((u4.g) obj, (i4.d) obj2)).j(h.f2682a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            j4.a r1 = j4.a.f3845d
            int r2 = r0.f4361i
            r4 = 1
            r6 = 64
            r8 = 0
            r10 = 3
            r11 = 2
            r12 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r12) goto L_0x003c
            if (r2 == r11) goto L_0x002e
            if (r2 != r10) goto L_0x0026
            int r2 = r0.f4359g
            java.lang.Object r7 = r0.f4362j
            u4.g r7 = (u4.g) r7
            com.bumptech.glide.c.M(r21)
            r3 = r1
            r14 = r10
            r13 = 0
            r10 = r0
            goto L_0x00f8
        L_0x0026:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002e:
            int r2 = r0.f4359g
            java.lang.Object r13 = r0.f4362j
            u4.g r13 = (u4.g) r13
            com.bumptech.glide.c.M(r21)
            r10 = r0
            r3 = r1
            r7 = r11
            goto L_0x00b7
        L_0x003c:
            int r2 = r0.f4360h
            int r13 = r0.f4359g
            int[] r14 = r0.f4358f
            java.lang.Object r15 = r0.f4362j
            u4.g r15 = (u4.g) r15
            com.bumptech.glide.c.M(r21)
            r10 = r0
            r7 = r15
            r15 = r14
            r14 = r2
            r2 = r1
            goto L_0x007b
        L_0x004f:
            com.bumptech.glide.c.M(r21)
            java.lang.Object r2 = r0.f4362j
            u4.g r2 = (u4.g) r2
            p.e r13 = r0.f4363k
            int[] r13 = r13.f4368g
            if (r13 == 0) goto L_0x007e
            int r14 = r13.length
            r10 = r0
            r7 = r2
            r15 = r13
            r13 = 0
            r2 = r1
        L_0x0062:
            if (r13 >= r14) goto L_0x0081
            r11 = r15[r13]
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r11)
            r10.f4362j = r7
            r10.f4358f = r15
            r10.f4359g = r13
            r10.f4360h = r14
            r10.f4361i = r12
            r7.b(r3, r10)
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x007b:
            int r13 = r13 + r12
            r11 = 2
            goto L_0x0062
        L_0x007e:
            r10 = r0
            r7 = r2
            r2 = r1
        L_0x0081:
            p.e r3 = r10.f4363k
            long r13 = r3.f4366e
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00bf
            r13 = r7
            r3 = 0
        L_0x008b:
            if (r3 >= r6) goto L_0x00be
            p.e r7 = r10.f4363k
            long r14 = r7.f4366e
            long r17 = r4 << r3
            long r14 = r14 & r17
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L_0x00b1
            int r7 = r7.f4367f
            int r7 = r7 + r3
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r7)
            r10.f4362j = r13
            r7 = 0
            r10.f4358f = r7
            r10.f4359g = r3
            r7 = 2
            r10.f4361i = r7
            r13.b(r11, r10)
            if (r1 != r2) goto L_0x00b2
            return r2
        L_0x00b1:
            r7 = 2
        L_0x00b2:
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x00b7:
            int r2 = r2 + r12
            r19 = r3
            r3 = r2
            r2 = r19
            goto L_0x008b
        L_0x00be:
            r7 = r13
        L_0x00bf:
            p.e r3 = r10.f4363k
            long r13 = r3.f4365d
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0100
            r3 = r7
            r7 = 0
        L_0x00c9:
            if (r7 >= r6) goto L_0x0100
            p.e r11 = r10.f4363k
            long r13 = r11.f4365d
            long r15 = r4 << r7
            long r13 = r13 & r15
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x00f0
            int r13 = r7 + 64
            int r11 = r11.f4367f
            int r13 = r13 + r11
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r13)
            r10.f4362j = r3
            r13 = 0
            r10.f4358f = r13
            r10.f4359g = r7
            r14 = 3
            r10.f4361i = r14
            r3.b(r11, r10)
            if (r1 != r2) goto L_0x00f2
            return r2
        L_0x00f0:
            r13 = 0
            r14 = 3
        L_0x00f2:
            r19 = r3
            r3 = r2
            r2 = r7
            r7 = r19
        L_0x00f8:
            int r2 = r2 + r12
            r19 = r7
            r7 = r2
            r2 = r3
            r3 = r19
            goto L_0x00c9
        L_0x0100:
            f4.h r1 = f4.h.f2682a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d.j(java.lang.Object):java.lang.Object");
    }
}
