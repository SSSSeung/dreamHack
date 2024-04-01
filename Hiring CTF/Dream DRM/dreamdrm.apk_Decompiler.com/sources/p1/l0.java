package p1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public f0 f4560a = null;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4561b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final long f4562c = 120;

    /* renamed from: d  reason: collision with root package name */
    public final long f4563d = 120;

    /* renamed from: e  reason: collision with root package name */
    public final long f4564e = 250;

    /* renamed from: f  reason: collision with root package name */
    public final long f4565f = 250;

    public static void b(f1 f1Var) {
        RecyclerView recyclerView;
        int i3 = f1Var.f4492j & 14;
        if (!f1Var.g() && (i3 & 4) == 0 && (recyclerView = f1Var.f4500r) != null) {
            recyclerView.I(f1Var);
        }
    }

    public abstract boolean a(f1 f1Var, f1 f1Var2, k0 k0Var, k0 k0Var2);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(p1.f1 r10) {
        /*
            r9 = this;
            p1.f0 r0 = r9.f4560a
            if (r0 == 0) goto L_0x00b0
            r1 = 1
            r10.n(r1)
            p1.f1 r2 = r10.f4490h
            r3 = 0
            if (r2 == 0) goto L_0x0013
            p1.f1 r2 = r10.f4491i
            if (r2 != 0) goto L_0x0013
            r10.f4490h = r3
        L_0x0013:
            r10.f4491i = r3
            int r2 = r10.f4492j
            r2 = r2 & 16
            r3 = 0
            if (r2 == 0) goto L_0x001e
            r2 = r1
            goto L_0x001f
        L_0x001e:
            r2 = r3
        L_0x001f:
            if (r2 != 0) goto L_0x00b0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f4481a
            r0.h0()
            p1.d r2 = r0.f1433i
            p1.c r4 = r2.f4457b
            p1.f0 r5 = r2.f4456a
            int r6 = r2.f4459d
            android.view.View r7 = r10.f4483a
            if (r6 != r1) goto L_0x003f
            android.view.View r1 = r2.f4460e
            if (r1 != r7) goto L_0x0037
            goto L_0x0065
        L_0x0037:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L_0x003f:
            r8 = 2
            if (r6 == r8) goto L_0x00a8
            r2.f4459d = r8     // Catch:{ all -> 0x00a4 }
            androidx.recyclerview.widget.RecyclerView r6 = r5.f4481a     // Catch:{ all -> 0x00a4 }
            int r6 = r6.indexOfChild(r7)     // Catch:{ all -> 0x00a4 }
            r8 = -1
            if (r6 != r8) goto L_0x0051
            r2.k(r7)     // Catch:{ all -> 0x00a4 }
            goto L_0x0060
        L_0x0051:
            boolean r8 = r4.d(r6)     // Catch:{ all -> 0x00a4 }
            if (r8 == 0) goto L_0x0063
            r4.f(r6)     // Catch:{ all -> 0x00a4 }
            r2.k(r7)     // Catch:{ all -> 0x00a4 }
            r5.g(r6)     // Catch:{ all -> 0x00a4 }
        L_0x0060:
            r2.f4459d = r3
            goto L_0x0066
        L_0x0063:
            r2.f4459d = r3
        L_0x0065:
            r1 = r3
        L_0x0066:
            if (r1 == 0) goto L_0x0093
            p1.f1 r2 = androidx.recyclerview.widget.RecyclerView.L(r7)
            p1.v0 r4 = r0.f1428f
            r4.m(r2)
            r4.j(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.B0
            if (r2 == 0) goto L_0x0093
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "after removing animated view: "
            r2.<init>(r4)
            r2.append(r7)
            java.lang.String r4 = ", "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "RecyclerView"
            android.util.Log.d(r4, r2)
        L_0x0093:
            r2 = r1 ^ 1
            r0.i0(r2)
            if (r1 != 0) goto L_0x00b0
            boolean r10 = r10.k()
            if (r10 == 0) goto L_0x00b0
            r0.removeDetachedView(r7, r3)
            goto L_0x00b0
        L_0x00a4:
            r10 = move-exception
            r2.f4459d = r3
            throw r10
        L_0x00a8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.l0.c(p1.f1):void");
    }

    public abstract void d(f1 f1Var);

    public abstract void e();

    public abstract boolean f();
}
