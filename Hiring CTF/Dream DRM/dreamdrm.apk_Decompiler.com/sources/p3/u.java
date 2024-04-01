package p3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public float f4844a;

    /* renamed from: b  reason: collision with root package name */
    public float f4845b;

    /* renamed from: c  reason: collision with root package name */
    public float f4846c;

    /* renamed from: d  reason: collision with root package name */
    public float f4847d;

    /* renamed from: e  reason: collision with root package name */
    public float f4848e;

    /* renamed from: f  reason: collision with root package name */
    public float f4849f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4850g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4851h = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f6) {
        float f7 = this.f4848e;
        if (f7 != f6) {
            float f8 = ((f6 - f7) + 360.0f) % 360.0f;
            if (f8 <= 180.0f) {
                float f9 = this.f4846c;
                float f10 = this.f4847d;
                q qVar = new q(f9, f10, f9, f10);
                qVar.f4837f = this.f4848e;
                qVar.f4838g = f8;
                this.f4851h.add(new o(qVar));
                this.f4848e = f6;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f4850g;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((s) arrayList.get(i3)).a(matrix, path);
        }
    }

    public final void c(float f6, float f7) {
        r rVar = new r();
        rVar.f4839b = f6;
        rVar.f4840c = f7;
        this.f4850g.add(rVar);
        p pVar = new p(rVar, this.f4846c, this.f4847d);
        a(pVar.b() + 270.0f);
        this.f4851h.add(pVar);
        this.f4848e = pVar.b() + 270.0f;
        this.f4846c = f6;
        this.f4847d = f7;
    }

    public final void d(float f6, float f7, float f8) {
        this.f4844a = 0.0f;
        this.f4845b = f6;
        this.f4846c = 0.0f;
        this.f4847d = f6;
        this.f4848e = f7;
        this.f4849f = (f7 + f8) % 360.0f;
        this.f4850g.clear();
        this.f4851h.clear();
    }
}
