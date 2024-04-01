package i0;

import a2.m;
import java.util.ArrayList;
import java.util.Iterator;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public m f3527a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3528b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3529c = false;

    /* renamed from: d  reason: collision with root package name */
    public final m f3530d;

    /* renamed from: e  reason: collision with root package name */
    public int f3531e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f3532f;

    /* renamed from: g  reason: collision with root package name */
    public int f3533g;

    /* renamed from: h  reason: collision with root package name */
    public int f3534h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f3535i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3536j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f3537k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f3538l = new ArrayList();

    public f(m mVar) {
        this.f3530d = mVar;
    }

    public final void a(d dVar) {
        ArrayList arrayList = this.f3538l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f3536j) {
                return;
            }
        }
        this.f3529c = true;
        m mVar = this.f3527a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f3528b) {
            this.f3530d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i3 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i3++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i3 == 1 && fVar.f3536j) {
            g gVar = this.f3535i;
            if (gVar != null) {
                if (gVar.f3536j) {
                    this.f3532f = this.f3534h * gVar.f3533g;
                } else {
                    return;
                }
            }
            d(fVar.f3533g + this.f3532f);
        }
        m mVar2 = this.f3527a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f3537k.add(dVar);
        if (this.f3536j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f3538l.clear();
        this.f3537k.clear();
        this.f3536j = false;
        this.f3533g = 0;
        this.f3529c = false;
        this.f3528b = false;
    }

    public void d(int i3) {
        if (!this.f3536j) {
            this.f3536j = true;
            this.f3533g = i3;
            Iterator it = this.f3537k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3530d.f3546b.W);
        sb.append(":");
        sb.append(m.x(this.f3531e));
        sb.append("(");
        sb.append(this.f3536j ? Integer.valueOf(this.f3533g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3538l.size());
        sb.append(":d=");
        sb.append(this.f3537k.size());
        sb.append(">");
        return sb.toString();
    }
}
