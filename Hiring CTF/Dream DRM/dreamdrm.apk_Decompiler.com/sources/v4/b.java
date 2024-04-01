package v4;

import b1.o;
import java.util.Iterator;
import java.util.NoSuchElementException;
import s4.c;

public final class b implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public int f5412d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f5413e;

    /* renamed from: f  reason: collision with root package name */
    public int f5414f;

    /* renamed from: g  reason: collision with root package name */
    public c f5415g;

    /* renamed from: h  reason: collision with root package name */
    public int f5416h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c f5417i;

    public b(c cVar) {
        this.f5417i = cVar;
        int i3 = cVar.f5419b;
        int length = cVar.f5418a.length();
        if (length >= 0) {
            if (i3 < 0) {
                i3 = 0;
            } else if (i3 > length) {
                i3 = length;
            }
            this.f5413e = i3;
            this.f5414f = i3;
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r6 < r3) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f5414f
            r1 = 0
            if (r0 >= 0) goto L_0x000b
            r7.f5412d = r1
            r0 = 0
            r7.f5415g = r0
            goto L_0x0077
        L_0x000b:
            v4.c r2 = r7.f5417i
            int r3 = r2.f5420c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L_0x001a
            int r6 = r7.f5416h
            int r6 = r6 + r5
            r7.f5416h = r6
            if (r6 >= r3) goto L_0x0022
        L_0x001a:
            java.lang.CharSequence r3 = r2.f5418a
            int r3 = r3.length()
            if (r0 <= r3) goto L_0x0034
        L_0x0022:
            s4.c r0 = new s4.c
            int r1 = r7.f5413e
            java.lang.CharSequence r2 = r2.f5418a
            int r2 = v4.i.U(r2)
            r0.<init>(r1, r2)
        L_0x002f:
            r7.f5415g = r0
            r7.f5414f = r4
            goto L_0x0075
        L_0x0034:
            o4.e r0 = r2.f5421d
            java.lang.CharSequence r3 = r2.f5418a
            int r6 = r7.f5414f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.h(r3, r6)
            f4.c r0 = (f4.c) r0
            if (r0 != 0) goto L_0x0054
            s4.c r0 = new s4.c
            int r1 = r7.f5413e
            java.lang.CharSequence r2 = r2.f5418a
            int r2 = v4.i.U(r2)
            r0.<init>(r1, r2)
            goto L_0x002f
        L_0x0054:
            java.lang.Object r2 = r0.f2676d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f2677e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f5413e
            s4.c r3 = b1.v.T(r3, r2)
            r7.f5415g = r3
            int r2 = r2 + r0
            r7.f5413e = r2
            if (r0 != 0) goto L_0x0072
            r1 = r5
        L_0x0072:
            int r2 = r2 + r1
            r7.f5414f = r2
        L_0x0075:
            r7.f5412d = r5
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.b.a():void");
    }

    public final boolean hasNext() {
        if (this.f5412d == -1) {
            a();
        }
        return this.f5412d == 1;
    }

    public final Object next() {
        if (this.f5412d == -1) {
            a();
        }
        if (this.f5412d != 0) {
            c cVar = this.f5415g;
            o.j(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f5415g = null;
            this.f5412d = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
