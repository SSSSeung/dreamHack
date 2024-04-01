package w4;

import g4.h;
import h1.b;

public abstract class d0 extends l {

    /* renamed from: f  reason: collision with root package name */
    public long f5477f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5478g;

    /* renamed from: h  reason: collision with root package name */
    public b f5479h;

    public final void E(boolean z5) {
        long j6 = this.f5477f - (z5 ? 4294967296L : 1);
        this.f5477f = j6;
        if (j6 <= 0 && this.f5478g) {
            shutdown();
        }
    }

    public final void F(v vVar) {
        b bVar = this.f5479h;
        if (bVar == null) {
            bVar = new b();
            this.f5479h = bVar;
        }
        Object[] objArr = (Object[]) bVar.f3358c;
        int i3 = bVar.f3357b;
        objArr[i3] = vVar;
        int length = (objArr.length - 1) & (i3 + 1);
        bVar.f3357b = length;
        int i6 = bVar.f3356a;
        if (length == i6) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            h.b0(objArr, objArr2, 0, i6, 0, 10);
            Object[] objArr3 = (Object[]) bVar.f3358c;
            int length3 = objArr3.length;
            int i7 = bVar.f3356a;
            h.b0(objArr3, objArr2, length3 - i7, 0, i7, 4);
            bVar.f3358c = objArr2;
            bVar.f3356a = 0;
            bVar.f3357b = length2;
        }
    }

    public abstract Thread G();

    public final void H(boolean z5) {
        this.f5477f = (z5 ? 4294967296L : 1) + this.f5477f;
        if (!z5) {
            this.f5478g = true;
        }
    }

    public final boolean I() {
        return this.f5477f >= 4294967296L;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: w4.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J() {
        /*
            r7 = this;
            h1.b r0 = r7.f5479h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x002a
        L_0x0006:
            int r2 = r0.f3356a
            int r3 = r0.f3357b
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x000f
            goto L_0x0021
        L_0x000f:
            java.lang.Object r3 = r0.f3358c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r6 = r3[r2]
            r3[r2] = r5
            int r2 = r2 + r4
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f3356a = r2
            if (r6 == 0) goto L_0x002b
            r5 = r6
        L_0x0021:
            w4.v r5 = (w4.v) r5
            if (r5 != 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            r5.run()
            r1 = r4
        L_0x002a:
            return r1
        L_0x002b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.d0.J():boolean");
    }

    public void K(long j6, a0 a0Var) {
        q.f5521k.Q(j6, a0Var);
    }

    public abstract void shutdown();
}
