package v4;

import o4.e;
import p4.f;

public final class h extends f implements e {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5423e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f5424f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f5425g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, Object obj, boolean z5) {
        super(2);
        this.f5423e = i3;
        this.f5425g = obj;
        this.f5424f = z5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f4.c b(int r14, java.lang.CharSequence r15) {
        /*
            r13 = this;
            int r0 = r13.f5423e
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r13.f5425g
            java.lang.String r4 = "$this$$receiver"
            switch(r0) {
                case 0: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0028
        L_0x000c:
            b1.o.m(r15, r4)
            char[] r3 = (char[]) r3
            boolean r0 = r13.f5424f
            int r14 = v4.i.Z(r14, r15, r0, r3)
            if (r14 >= 0) goto L_0x001a
            goto L_0x0027
        L_0x001a:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            f4.c r1 = new f4.c
            r1.<init>(r14, r15)
        L_0x0027:
            return r1
        L_0x0028:
            b1.o.m(r15, r4)
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r13.f5424f
            r4 = 0
            if (r0 != 0) goto L_0x006a
            int r5 = r3.size()
            if (r5 != r2) goto L_0x006a
            int r0 = r3.size()
            if (r0 == 0) goto L_0x0062
            if (r0 != r2) goto L_0x005a
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 4
            int r14 = v4.i.Y(r15, r0, r14, r4, r2)
            if (r14 >= 0) goto L_0x004f
            goto L_0x00f6
        L_0x004f:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            f4.c r15 = new f4.c
            r15.<init>(r14, r0)
            goto L_0x00f7
        L_0x005a:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x0062:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L_0x006a:
            s4.c r2 = new s4.c
            if (r14 >= 0) goto L_0x006f
            r14 = r4
        L_0x006f:
            int r4 = r15.length()
            r2.<init>(r14, r4)
            boolean r4 = r15 instanceof java.lang.String
            int r10 = r2.f5075f
            int r2 = r2.f5074e
            if (r4 == 0) goto L_0x00bb
            if (r10 <= 0) goto L_0x0082
            if (r14 <= r2) goto L_0x0086
        L_0x0082:
            if (r10 >= 0) goto L_0x00f6
            if (r2 > r14) goto L_0x00f6
        L_0x0086:
            java.util.Iterator r11 = r3.iterator()
        L_0x008a:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r12 = r11.next()
            r7 = r12
            java.lang.String r7 = (java.lang.String) r7
            r4 = 0
            r8 = r15
            java.lang.String r8 = (java.lang.String) r8
            int r6 = r7.length()
            r5 = r14
            r9 = r0
            boolean r4 = v4.i.d0(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L_0x008a
            goto L_0x00a9
        L_0x00a8:
            r12 = r1
        L_0x00a9:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00b7
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            f4.c r15 = new f4.c
            r15.<init>(r14, r12)
            goto L_0x00f7
        L_0x00b7:
            if (r14 == r2) goto L_0x00f6
            int r14 = r14 + r10
            goto L_0x0086
        L_0x00bb:
            if (r10 <= 0) goto L_0x00bf
            if (r14 <= r2) goto L_0x00c3
        L_0x00bf:
            if (r10 >= 0) goto L_0x00f6
            if (r2 > r14) goto L_0x00f6
        L_0x00c3:
            java.util.Iterator r11 = r3.iterator()
        L_0x00c7:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x00e3
            java.lang.Object r12 = r11.next()
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            int r8 = r4.length()
            r6 = r15
            r7 = r14
            r9 = r0
            boolean r4 = v4.i.e0(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L_0x00c7
            goto L_0x00e4
        L_0x00e3:
            r12 = r1
        L_0x00e4:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00f2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            f4.c r15 = new f4.c
            r15.<init>(r14, r12)
            goto L_0x00f7
        L_0x00f2:
            if (r14 == r2) goto L_0x00f6
            int r14 = r14 + r10
            goto L_0x00c3
        L_0x00f6:
            r15 = r1
        L_0x00f7:
            if (r15 == 0) goto L_0x010c
            java.lang.Object r14 = r15.f2677e
            java.lang.String r14 = (java.lang.String) r14
            int r14 = r14.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            f4.c r1 = new f4.c
            java.lang.Object r15 = r15.f2676d
            r1.<init>(r15, r14)
        L_0x010c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.h.b(int, java.lang.CharSequence):f4.c");
    }

    public final Object h(Object obj, Object obj2) {
        switch (this.f5423e) {
            case 0:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return b(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((i4.h) obj).p((i4.f) obj2);
        }
    }
}
