package androidx.fragment.app;

import a2.m;
import android.util.Log;
import android.view.ViewGroup;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.d;
import x0.g0;
import x0.u0;

public abstract class h1 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1157a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1158b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1159c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1160d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1161e = false;

    public h1(ViewGroup viewGroup) {
        this.f1157a = viewGroup;
    }

    public static h1 f(ViewGroup viewGroup, d0 d0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof h1) {
            return (h1) tag;
        }
        d0Var.getClass();
        i iVar = new i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, iVar);
        return iVar;
    }

    public final void a(int i3, int i6, r0 r0Var) {
        synchronized (this.f1158b) {
            d dVar = new d();
            g1 d6 = d(r0Var.f1278c);
            if (d6 != null) {
                d6.c(i3, i6);
                return;
            }
            g1 g1Var = new g1(i3, i6, r0Var, dVar);
            this.f1158b.add(g1Var);
            g1Var.f1149d.add(new f1(this, g1Var, 0));
            g1Var.f1149d.add(new f1(this, g1Var, 1));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z5);

    public final void c() {
        if (!this.f1161e) {
            ViewGroup viewGroup = this.f1157a;
            WeakHashMap weakHashMap = u0.f5622a;
            if (!g0.b(viewGroup)) {
                e();
                this.f1160d = false;
                return;
            }
            synchronized (this.f1158b) {
                if (!this.f1158b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1159c);
                    this.f1159c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        g1 g1Var = (g1) it.next();
                        if (l0.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + g1Var);
                        }
                        g1Var.a();
                        if (!g1Var.f1152g) {
                            this.f1159c.add(g1Var);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f1158b);
                    this.f1158b.clear();
                    this.f1159c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((g1) it2.next()).d();
                    }
                    b(arrayList2, this.f1160d);
                    this.f1160d = false;
                }
            }
        }
    }

    public final g1 d(r rVar) {
        Iterator it = this.f1158b.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if (g1Var.f1148c.equals(rVar) && !g1Var.f1151f) {
                return g1Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1157a;
        WeakHashMap weakHashMap = u0.f5622a;
        boolean b6 = g0.b(viewGroup);
        synchronized (this.f1158b) {
            h();
            Iterator it = this.f1158b.iterator();
            while (it.hasNext()) {
                ((g1) it.next()).d();
            }
            Iterator it2 = new ArrayList(this.f1159c).iterator();
            while (it2.hasNext()) {
                g1 g1Var = (g1) it2.next();
                if (l0.G(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b6) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1157a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(g1Var);
                    Log.v("FragmentManager", sb.toString());
                }
                g1Var.a();
            }
            Iterator it3 = new ArrayList(this.f1158b).iterator();
            while (it3.hasNext()) {
                g1 g1Var2 = (g1) it3.next();
                if (l0.G(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b6) {
                        str = "";
                    } else {
                        str = "Container " + this.f1157a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(g1Var2);
                    Log.v("FragmentManager", sb2.toString());
                }
                g1Var2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f1158b) {
            h();
            this.f1161e = false;
            int size = this.f1158b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                g1 g1Var = (g1) this.f1158b.get(size);
                int c6 = m.c(g1Var.f1148c.H);
                if (g1Var.f1146a == 2 && c6 != 2) {
                    g1Var.f1148c.getClass();
                    this.f1161e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator it = this.f1158b.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if (g1Var.f1147b == 2) {
                g1Var.c(m.b(g1Var.f1148c.E().getVisibility()), 1);
            }
        }
    }
}
