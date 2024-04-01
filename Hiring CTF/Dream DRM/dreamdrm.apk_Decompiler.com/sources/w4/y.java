package w4;

import f4.h;
import i4.d;
import o4.c;

public final class y extends m0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f5531h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f5532i;

    public /* synthetic */ y(int i3, Object obj) {
        this.f5531h = i3;
        this.f5532i = obj;
    }

    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        h hVar = h.f2682a;
        switch (this.f5531h) {
            case 0:
                s((Throwable) obj);
                return hVar;
            case 1:
                s((Throwable) obj);
                return hVar;
            default:
                s((Throwable) obj);
                return hVar;
        }
    }

    public final void s(Throwable th) {
        int i3 = this.f5531h;
        Object obj = this.f5532i;
        switch (i3) {
            case 0:
                ((x) obj).c();
                return;
            case 1:
                ((c) obj).i(th);
                return;
            default:
                ((d) obj).g(h.f2682a);
                return;
        }
    }
}
