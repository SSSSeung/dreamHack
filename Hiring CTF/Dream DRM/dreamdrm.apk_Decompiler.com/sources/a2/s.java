package a2;

import com.bumptech.glide.d;
import n2.f;
import n2.g;

public final class s implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f142d;

    /* renamed from: e  reason: collision with root package name */
    public final f f143e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v f144f;

    public /* synthetic */ s(v vVar, f fVar, int i3) {
        this.f142d = i3;
        this.f144f = vVar;
        this.f143e = fVar;
    }

    public final void run() {
        switch (this.f142d) {
            case 0:
                g gVar = (g) this.f143e;
                gVar.f4292b.a();
                synchronized (gVar.f4293c) {
                    synchronized (this.f144f) {
                        u uVar = this.f144f.f148d;
                        f fVar = this.f143e;
                        uVar.getClass();
                        if (uVar.f147d.contains(new t(fVar, d.f1704e))) {
                            v vVar = this.f144f;
                            f fVar2 = this.f143e;
                            vVar.getClass();
                            try {
                                ((g) fVar2).k(vVar.w, 5);
                            } catch (Throwable th) {
                                throw new d(th);
                            }
                        }
                        this.f144f.d();
                    }
                }
                return;
            default:
                g gVar2 = (g) this.f143e;
                gVar2.f4292b.a();
                synchronized (gVar2.f4293c) {
                    synchronized (this.f144f) {
                        u uVar2 = this.f144f.f148d;
                        f fVar3 = this.f143e;
                        uVar2.getClass();
                        if (uVar2.f147d.contains(new t(fVar3, d.f1704e))) {
                            this.f144f.f168y.a();
                            v vVar2 = this.f144f;
                            f fVar4 = this.f143e;
                            vVar2.getClass();
                            try {
                                ((g) fVar4).m(vVar2.f168y, vVar2.f165u, vVar2.B);
                                this.f144f.h(this.f143e);
                            } catch (Throwable th2) {
                                throw new d(th2);
                            }
                        }
                        this.f144f.d();
                    }
                }
                return;
        }
    }
}
