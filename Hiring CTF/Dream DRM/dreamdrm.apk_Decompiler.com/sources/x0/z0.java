package x0;

import android.view.View;
import android.view.ViewGroup;
import f4.h;
import i4.d;
import k4.g;
import o4.e;

public final class z0 extends g implements e {

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f5646f;

    /* renamed from: g  reason: collision with root package name */
    public View f5647g;

    /* renamed from: h  reason: collision with root package name */
    public int f5648h;

    /* renamed from: i  reason: collision with root package name */
    public int f5649i;

    /* renamed from: j  reason: collision with root package name */
    public int f5650j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f5651k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5652l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(ViewGroup viewGroup, d dVar) {
        super(dVar);
        this.f5652l = viewGroup;
    }

    public final d b(Object obj, d dVar) {
        z0 z0Var = new z0(this.f5652l, dVar);
        z0Var.f5651k = obj;
        return z0Var;
    }

    public final Object h(Object obj, Object obj2) {
        return ((z0) b((u4.g) obj, (d) obj2)).j(h.f2682a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Object r14) {
        /*
            r13 = this;
            j4.a r0 = j4.a.f3845d
            int r1 = r13.f5650j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            int r1 = r13.f5649i
            int r4 = r13.f5648h
            android.view.ViewGroup r5 = r13.f5646f
            java.lang.Object r6 = r13.f5651k
            u4.g r6 = (u4.g) r6
            com.bumptech.glide.c.M(r14)
            r8 = r13
            r14 = r0
            goto L_0x0092
        L_0x001d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0025:
            int r1 = r13.f5649i
            int r4 = r13.f5648h
            android.view.View r5 = r13.f5647g
            android.view.ViewGroup r6 = r13.f5646f
            java.lang.Object r7 = r13.f5651k
            u4.g r7 = (u4.g) r7
            com.bumptech.glide.c.M(r14)
            r8 = r13
            r14 = r0
            goto L_0x006c
        L_0x0037:
            com.bumptech.glide.c.M(r14)
            java.lang.Object r14 = r13.f5651k
            u4.g r14 = (u4.g) r14
            android.view.ViewGroup r1 = r13.f5652l
            int r4 = r1.getChildCount()
            r5 = 0
            r7 = r13
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
        L_0x004a:
            if (r6 >= r5) goto L_0x00a5
            android.view.View r8 = r4.getChildAt(r6)
            r7.f5651k = r14
            r7.f5646f = r4
            r7.f5647g = r8
            r7.f5648h = r6
            r7.f5649i = r5
            r7.f5650j = r3
            r14.b(r8, r7)
            if (r0 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r11 = r7
            r7 = r14
            r14 = r0
            r0 = r1
            r1 = r5
            r5 = r8
            r8 = r11
            r12 = r6
            r6 = r4
            r4 = r12
        L_0x006c:
            boolean r9 = r5 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x0099
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            x0.z0 r9 = new x0.z0
            r10 = 0
            r9.<init>(r5, r10)
            x0.y0 r5 = new x0.y0
            r5.<init>(r2, r9)
            r8.f5651k = r7
            r8.f5646f = r6
            r8.f5647g = r10
            r8.f5648h = r4
            r8.f5649i = r1
            r8.f5650j = r2
            java.lang.Object r5 = r7.c(r5, r8)
            if (r5 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r5 = r6
            r6 = r7
        L_0x0092:
            r7 = r8
            r11 = r0
            r0 = r14
            r14 = r6
            r6 = r1
            r1 = r11
            goto L_0x009f
        L_0x0099:
            r5 = r6
            r6 = r1
            r1 = r0
            r0 = r14
            r14 = r7
            r7 = r8
        L_0x009f:
            int r4 = r4 + r3
            r11 = r6
            r6 = r4
            r4 = r5
            r5 = r11
            goto L_0x004a
        L_0x00a5:
            f4.h r14 = f4.h.f2682a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.z0.j(java.lang.Object):java.lang.Object");
    }
}
