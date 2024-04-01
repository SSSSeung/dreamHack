package i0;

import java.util.ArrayList;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final m f3541a = null;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3542b = new ArrayList();

    public k(m mVar) {
        this.f3541a = mVar;
    }

    public static long a(f fVar, long j6) {
        m mVar = fVar.f3530d;
        if (mVar instanceof i) {
            return j6;
        }
        ArrayList arrayList = fVar.f3537k;
        int size = arrayList.size();
        long j7 = j6;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) arrayList.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f3530d != mVar) {
                    j7 = Math.min(j7, a(fVar2, ((long) fVar2.f3532f) + j6));
                }
            }
        }
        if (fVar != mVar.f3553i) {
            return j7;
        }
        long j8 = mVar.j();
        f fVar3 = mVar.f3552h;
        long j9 = j6 - j8;
        return Math.min(Math.min(j7, a(fVar3, j9)), j9 - ((long) fVar3.f3532f));
    }

    public static long b(f fVar, long j6) {
        m mVar = fVar.f3530d;
        if (mVar instanceof i) {
            return j6;
        }
        ArrayList arrayList = fVar.f3537k;
        int size = arrayList.size();
        long j7 = j6;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) arrayList.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f3530d != mVar) {
                    j7 = Math.max(j7, b(fVar2, ((long) fVar2.f3532f) + j6));
                }
            }
        }
        if (fVar != mVar.f3552h) {
            return j7;
        }
        long j8 = mVar.j();
        f fVar3 = mVar.f3553i;
        long j9 = j6 + j8;
        return Math.max(Math.max(j7, b(fVar3, j9)), j9 - ((long) fVar3.f3532f));
    }
}
