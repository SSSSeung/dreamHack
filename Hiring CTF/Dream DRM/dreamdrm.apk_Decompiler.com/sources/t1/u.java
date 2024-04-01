package t1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n0;
import com.bumptech.glide.d;
import g.h;
import java.util.ArrayList;
import java.util.Iterator;

public class u extends p {
    public ArrayList A = new ArrayList();
    public boolean B = true;
    public int C;
    public boolean D = false;
    public int E = 0;

    public final void A(d dVar) {
        this.f5160v = dVar;
        this.E |= 8;
        int size = this.A.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p) this.A.get(i3)).A(dVar);
        }
    }

    public final void B(TimeInterpolator timeInterpolator) {
        this.E |= 1;
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((p) this.A.get(i3)).B(timeInterpolator);
            }
        }
        this.f5145g = timeInterpolator;
    }

    public final void C(n0 n0Var) {
        super.C(n0Var);
        this.E |= 4;
        if (this.A != null) {
            for (int i3 = 0; i3 < this.A.size(); i3++) {
                ((p) this.A.get(i3)).C(n0Var);
            }
        }
    }

    public final void D() {
        this.E |= 2;
        int size = this.A.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p) this.A.get(i3)).D();
        }
    }

    public final void E(long j6) {
        this.f5143e = j6;
    }

    public final String G(String str) {
        String G = super.G(str);
        for (int i3 = 0; i3 < this.A.size(); i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(((p) this.A.get(i3)).G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    public final void H(p pVar) {
        this.A.add(pVar);
        pVar.f5150l = this;
        long j6 = this.f5144f;
        if (j6 >= 0) {
            pVar.z(j6);
        }
        if ((this.E & 1) != 0) {
            pVar.B(this.f5145g);
        }
        if ((this.E & 2) != 0) {
            pVar.D();
        }
        if ((this.E & 4) != 0) {
            pVar.C(this.w);
        }
        if ((this.E & 8) != 0) {
            pVar.A(this.f5160v);
        }
    }

    public final void a(o oVar) {
        super.a(oVar);
    }

    public final void b(View view) {
        for (int i3 = 0; i3 < this.A.size(); i3++) {
            ((p) this.A.get(i3)).b(view);
        }
        this.f5147i.add(view);
    }

    public final void d(w wVar) {
        View view = wVar.f5171b;
        if (s(view)) {
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.s(view)) {
                    pVar.d(wVar);
                    wVar.f5172c.add(pVar);
                }
            }
        }
    }

    public final void f(w wVar) {
        int size = this.A.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p) this.A.get(i3)).f(wVar);
        }
    }

    public final void g(w wVar) {
        View view = wVar.f5171b;
        if (s(view)) {
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                if (pVar.s(view)) {
                    pVar.g(wVar);
                    wVar.f5172c.add(pVar);
                }
            }
        }
    }

    /* renamed from: j */
    public final p clone() {
        u uVar = (u) super.clone();
        uVar.A = new ArrayList();
        int size = this.A.size();
        for (int i3 = 0; i3 < size; i3++) {
            p j6 = ((p) this.A.get(i3)).clone();
            uVar.A.add(j6);
            j6.f5150l = uVar;
        }
        return uVar;
    }

    public final void l(ViewGroup viewGroup, h hVar, h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j6 = this.f5143e;
        int size = this.A.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) this.A.get(i3);
            if (j6 > 0 && (this.B || i3 == 0)) {
                long j7 = pVar.f5143e;
                if (j7 > 0) {
                    pVar.E(j7 + j6);
                } else {
                    pVar.E(j6);
                }
            }
            pVar.l(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    public final void u(View view) {
        super.u(view);
        int size = this.A.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p) this.A.get(i3)).u(view);
        }
    }

    public final void v(o oVar) {
        super.v(oVar);
    }

    public final void w(View view) {
        for (int i3 = 0; i3 < this.A.size(); i3++) {
            ((p) this.A.get(i3)).w(view);
        }
        this.f5147i.remove(view);
    }

    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.A.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p) this.A.get(i3)).x(viewGroup);
        }
    }

    public final void y() {
        if (this.A.isEmpty()) {
            F();
            m();
            return;
        }
        t tVar = new t(this);
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(tVar);
        }
        this.C = this.A.size();
        if (!this.B) {
            for (int i3 = 1; i3 < this.A.size(); i3++) {
                ((p) this.A.get(i3 - 1)).a(new h(this, 2, (p) this.A.get(i3)));
            }
            p pVar = (p) this.A.get(0);
            if (pVar != null) {
                pVar.y();
                return;
            }
            return;
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).y();
        }
    }

    public final void z(long j6) {
        ArrayList arrayList;
        this.f5144f = j6;
        if (j6 >= 0 && (arrayList = this.A) != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((p) this.A.get(i3)).z(j6);
            }
        }
    }
}
