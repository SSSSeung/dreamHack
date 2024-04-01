package t1;

import a2.m;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.fragment.app.n0;
import b1.o;
import com.bumptech.glide.d;
import g.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.b;
import x0.d0;
import x0.j0;
import x0.u0;

public abstract class p implements Cloneable {

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f5139x = {2, 1, 3, 4};

    /* renamed from: y  reason: collision with root package name */
    public static final n0 f5140y = new n0();

    /* renamed from: z  reason: collision with root package name */
    public static final ThreadLocal f5141z = new ThreadLocal();

    /* renamed from: d  reason: collision with root package name */
    public final String f5142d = getClass().getName();

    /* renamed from: e  reason: collision with root package name */
    public long f5143e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f5144f = -1;

    /* renamed from: g  reason: collision with root package name */
    public TimeInterpolator f5145g = null;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f5146h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f5147i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public h f5148j = new h(5);

    /* renamed from: k  reason: collision with root package name */
    public h f5149k = new h(5);

    /* renamed from: l  reason: collision with root package name */
    public u f5150l = null;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f5151m = f5139x;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f5152n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f5153o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f5154p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public int f5155q = 0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5156r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5157s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f5158t = null;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f5159u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public d f5160v;
    public n0 w = f5140y;

    public static void c(h hVar, View view, w wVar) {
        ((b) hVar.f2725a).put(view, wVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) hVar.f2726b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = u0.f5622a;
        String k6 = j0.k(view);
        if (k6 != null) {
            if (((b) hVar.f2728d).containsKey(k6)) {
                ((b) hVar.f2728d).put(k6, (Object) null);
            } else {
                ((b) hVar.f2728d).put(k6, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                k.d dVar = (k.d) hVar.f2727c;
                if (dVar.f3868d) {
                    dVar.c();
                }
                if (o.e(dVar.f3869e, dVar.f3871g, itemIdAtPosition) >= 0) {
                    View view2 = (View) dVar.d(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        d0.r(view2, false);
                        dVar.e(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                d0.r(view, true);
                dVar.e(itemIdAtPosition, view);
            }
        }
    }

    public static b o() {
        ThreadLocal threadLocal = f5141z;
        b bVar = (b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean t(w wVar, w wVar2, String str) {
        Object obj = wVar.f5170a.get(str);
        Object obj2 = wVar2.f5170a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(d dVar) {
        this.f5160v = dVar;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f5145g = timeInterpolator;
    }

    public void C(n0 n0Var) {
        if (n0Var == null) {
            n0Var = f5140y;
        }
        this.w = n0Var;
    }

    public void D() {
    }

    public void E(long j6) {
        this.f5143e = j6;
    }

    public final void F() {
        if (this.f5155q == 0) {
            ArrayList arrayList = this.f5158t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5158t.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((o) arrayList2.get(i3)).c();
                }
            }
            this.f5157s = false;
        }
        this.f5155q++;
    }

    public String G(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5144f != -1) {
            str2 = str2 + "dur(" + this.f5144f + ") ";
        }
        if (this.f5143e != -1) {
            str2 = str2 + "dly(" + this.f5143e + ") ";
        }
        if (this.f5145g != null) {
            str2 = str2 + "interp(" + this.f5145g + ") ";
        }
        ArrayList arrayList = this.f5146h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5147i;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String h6 = m.h(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 > 0) {
                    h6 = m.h(h6, ", ");
                }
                h6 = h6 + arrayList.get(i3);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                if (i6 > 0) {
                    h6 = m.h(h6, ", ");
                }
                h6 = h6 + arrayList2.get(i6);
            }
        }
        return m.h(h6, ")");
    }

    public void a(o oVar) {
        if (this.f5158t == null) {
            this.f5158t = new ArrayList();
        }
        this.f5158t.add(oVar);
    }

    public void b(View view) {
        this.f5147i.add(view);
    }

    public abstract void d(w wVar);

    public final void e(View view, boolean z5) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                w wVar = new w(view);
                if (z5) {
                    g(wVar);
                } else {
                    d(wVar);
                }
                wVar.f5172c.add(this);
                f(wVar);
                c(z5 ? this.f5148j : this.f5149k, view, wVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    e(viewGroup.getChildAt(i3), z5);
                }
            }
        }
    }

    public void f(w wVar) {
    }

    public abstract void g(w wVar);

    public final void h(ViewGroup viewGroup, boolean z5) {
        i(z5);
        ArrayList arrayList = this.f5146h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5147i;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i3)).intValue());
                if (findViewById != null) {
                    w wVar = new w(findViewById);
                    if (z5) {
                        g(wVar);
                    } else {
                        d(wVar);
                    }
                    wVar.f5172c.add(this);
                    f(wVar);
                    c(z5 ? this.f5148j : this.f5149k, findViewById, wVar);
                }
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                View view = (View) arrayList2.get(i6);
                w wVar2 = new w(view);
                if (z5) {
                    g(wVar2);
                } else {
                    d(wVar2);
                }
                wVar2.f5172c.add(this);
                f(wVar2);
                c(z5 ? this.f5148j : this.f5149k, view, wVar2);
            }
            return;
        }
        e(viewGroup, z5);
    }

    public final void i(boolean z5) {
        h hVar;
        if (z5) {
            ((b) this.f5148j.f2725a).clear();
            ((SparseArray) this.f5148j.f2726b).clear();
            hVar = this.f5148j;
        } else {
            ((b) this.f5149k.f2725a).clear();
            ((SparseArray) this.f5149k.f2726b).clear();
            hVar = this.f5149k;
        }
        ((k.d) hVar.f2727c).a();
    }

    /* renamed from: j */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.f5159u = new ArrayList();
            pVar.f5148j = new h(5);
            pVar.f5149k = new h(5);
            pVar.f5152n = null;
            pVar.f5153o = null;
            return pVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, h hVar, h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator k6;
        Animator animator;
        w wVar;
        View view;
        w wVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        b o5 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            w wVar3 = (w) arrayList.get(i3);
            w wVar4 = (w) arrayList2.get(i3);
            if (wVar3 != null && !wVar3.f5172c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f5172c.contains(this)) {
                wVar4 = null;
            }
            if (!(wVar3 == null && wVar4 == null)) {
                if ((wVar3 == null || wVar4 == null || r(wVar3, wVar4)) && (k6 = k(viewGroup2, wVar3, wVar4)) != null) {
                    if (wVar4 != null) {
                        String[] p2 = p();
                        view = wVar4.f5171b;
                        if (p2 != null && p2.length > 0) {
                            wVar2 = new w(view);
                            w wVar5 = (w) ((b) hVar2.f2725a).getOrDefault(view, (Object) null);
                            if (wVar5 != null) {
                                int i6 = 0;
                                while (i6 < p2.length) {
                                    HashMap hashMap = wVar2.f5170a;
                                    Animator animator3 = k6;
                                    String str = p2[i6];
                                    hashMap.put(str, wVar5.f5170a.get(str));
                                    i6++;
                                    k6 = animator3;
                                    p2 = p2;
                                }
                            }
                            Animator animator4 = k6;
                            int i7 = o5.f3895f;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator2 = animator4;
                                    break;
                                }
                                n nVar = (n) o5.getOrDefault((Animator) o5.h(i8), (Object) null);
                                if (nVar.f5136c != null && nVar.f5134a == view && nVar.f5135b.equals(this.f5142d) && nVar.f5136c.equals(wVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            h hVar3 = hVar2;
                            animator2 = k6;
                            wVar2 = null;
                        }
                        animator = animator2;
                        wVar = wVar2;
                    } else {
                        h hVar4 = hVar2;
                        view = wVar3.f5171b;
                        animator = k6;
                        wVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f5142d;
                        b0 b0Var = x.f5173a;
                        g0 g0Var = new g0(viewGroup2);
                        n nVar2 = r0;
                        n nVar3 = new n(view, str2, this, g0Var, wVar);
                        o5.put(animator, nVar2);
                        this.f5159u.add(animator);
                    }
                    i3++;
                    viewGroup2 = viewGroup;
                }
            }
            h hVar5 = hVar2;
            i3++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                Animator animator5 = (Animator) this.f5159u.get(sparseIntArray.keyAt(i9));
                animator5.setStartDelay(animator5.getStartDelay() + (((long) sparseIntArray.valueAt(i9)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i3 = this.f5155q - 1;
        this.f5155q = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.f5158t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5158t.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((o) arrayList2.get(i6)).b(this);
                }
            }
            int i7 = 0;
            while (true) {
                k.d dVar = (k.d) this.f5148j.f2727c;
                if (dVar.f3868d) {
                    dVar.c();
                }
                if (i7 >= dVar.f3871g) {
                    break;
                }
                View view = (View) ((k.d) this.f5148j.f2727c).f(i7);
                if (view != null) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    d0.r(view, false);
                }
                i7++;
            }
            int i8 = 0;
            while (true) {
                k.d dVar2 = (k.d) this.f5149k.f2727c;
                if (dVar2.f3868d) {
                    dVar2.c();
                }
                if (i8 < dVar2.f3871g) {
                    View view2 = (View) ((k.d) this.f5149k.f2727c).f(i8);
                    if (view2 != null) {
                        WeakHashMap weakHashMap2 = u0.f5622a;
                        d0.r(view2, false);
                    }
                    i8++;
                } else {
                    this.f5157s = true;
                    return;
                }
            }
        }
    }

    public final w n(View view, boolean z5) {
        u uVar = this.f5150l;
        if (uVar != null) {
            return uVar.n(view, z5);
        }
        ArrayList arrayList = z5 ? this.f5152n : this.f5153o;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            }
            w wVar = (w) arrayList.get(i3);
            if (wVar == null) {
                return null;
            }
            if (wVar.f5171b == view) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            return null;
        }
        return (w) (z5 ? this.f5153o : this.f5152n).get(i3);
    }

    public String[] p() {
        return null;
    }

    public final w q(View view, boolean z5) {
        u uVar = this.f5150l;
        if (uVar != null) {
            return uVar.q(view, z5);
        }
        return (w) ((b) (z5 ? this.f5148j : this.f5149k).f2725a).getOrDefault(view, (Object) null);
    }

    public boolean r(w wVar, w wVar2) {
        if (wVar == null || wVar2 == null) {
            return false;
        }
        String[] p2 = p();
        if (p2 != null) {
            int length = p2.length;
            int i3 = 0;
            while (i3 < length) {
                if (!t(wVar, wVar2, p2[i3])) {
                    i3++;
                }
            }
            return false;
        }
        for (String t5 : wVar.f5170a.keySet()) {
            if (t(wVar, wVar2, t5)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f5146h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5147i;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G("");
    }

    public void u(View view) {
        int i3;
        if (!this.f5157s) {
            b o5 = o();
            int i6 = o5.f3895f;
            b0 b0Var = x.f5173a;
            WindowId windowId = view.getWindowId();
            int i7 = i6 - 1;
            while (true) {
                i3 = 0;
                if (i7 < 0) {
                    break;
                }
                n nVar = (n) o5.l(i7);
                if (nVar.f5134a != null) {
                    h0 h0Var = nVar.f5137d;
                    if ((h0Var instanceof g0) && ((g0) h0Var).f5119a.equals(windowId)) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        ((Animator) o5.h(i7)).pause();
                    }
                }
                i7--;
            }
            ArrayList arrayList = this.f5158t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5158t.clone();
                int size = arrayList2.size();
                while (i3 < size) {
                    ((o) arrayList2.get(i3)).d();
                    i3++;
                }
            }
            this.f5156r = true;
        }
    }

    public void v(o oVar) {
        ArrayList arrayList = this.f5158t;
        if (arrayList != null) {
            arrayList.remove(oVar);
            if (this.f5158t.size() == 0) {
                this.f5158t = null;
            }
        }
    }

    public void w(View view) {
        this.f5147i.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        if (this.f5156r) {
            if (!this.f5157s) {
                b o5 = o();
                int i3 = o5.f3895f;
                b0 b0Var = x.f5173a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    n nVar = (n) o5.l(i6);
                    if (nVar.f5134a != null) {
                        h0 h0Var = nVar.f5137d;
                        if ((h0Var instanceof g0) && ((g0) h0Var).f5119a.equals(windowId)) {
                            ((Animator) o5.h(i6)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.f5158t;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5158t.clone();
                    int size = arrayList2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((o) arrayList2.get(i7)).e();
                    }
                }
            }
            this.f5156r = false;
        }
    }

    public void y() {
        F();
        b o5 = o();
        Iterator it = this.f5159u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o5.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new m(this, o5));
                    long j6 = this.f5144f;
                    if (j6 >= 0) {
                        animator.setDuration(j6);
                    }
                    long j7 = this.f5143e;
                    if (j7 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j7);
                    }
                    TimeInterpolator timeInterpolator = this.f5145g;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new androidx.appcompat.widget.d(1, this));
                    animator.start();
                }
            }
        }
        this.f5159u.clear();
        m();
    }

    public void z(long j6) {
        this.f5144f = j6;
    }
}
