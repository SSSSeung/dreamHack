package androidx.lifecycle;

import a2.m;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.l;
import androidx.fragment.app.l0;
import androidx.fragment.app.n;
import i.b;
import j.c;
import j.d;
import j.g;
import java.util.Map;

public class y {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1393j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1394a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final g f1395b = new g();

    /* renamed from: c  reason: collision with root package name */
    public int f1396c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1397d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1398e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1399f;

    /* renamed from: g  reason: collision with root package name */
    public int f1400g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1401h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1402i;

    public y() {
        Object obj = f1393j;
        this.f1399f = obj;
        this.f1398e = obj;
        this.f1400g = -1;
    }

    public static void a(String str) {
        b.x().f3504q.getClass();
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException(m.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(w wVar) {
        if (wVar.f1389e) {
            if (!wVar.e()) {
                wVar.c(false);
                return;
            }
            int i3 = wVar.f1390f;
            int i6 = this.f1400g;
            if (i3 < i6) {
                wVar.f1390f = i6;
                l lVar = wVar.f1388d;
                Object obj = this.f1398e;
                lVar.getClass();
                if (((r) obj) != null) {
                    n nVar = (n) lVar.f1170b;
                    if (nVar.f1208c0) {
                        View E = nVar.E();
                        if (E.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        } else if (nVar.f1211g0 != null) {
                            if (l0.G(3)) {
                                Log.d("FragmentManager", "DialogFragment " + lVar + " setting the content view on " + nVar.f1211g0);
                            }
                            nVar.f1211g0.setContentView(E);
                        }
                    }
                }
            }
        }
    }

    public final void c(w wVar) {
        if (this.f1401h) {
            this.f1402i = true;
            return;
        }
        this.f1401h = true;
        do {
            this.f1402i = false;
            if (wVar == null) {
                g gVar = this.f1395b;
                gVar.getClass();
                d dVar = new d(gVar);
                gVar.f3642f.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((w) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1402i) {
                        break;
                    }
                }
            } else {
                b(wVar);
                wVar = null;
            }
        } while (this.f1402i);
        this.f1401h = false;
    }

    public final void d(l lVar) {
        Object obj;
        a("observeForever");
        v vVar = new v(this, lVar);
        g gVar = this.f1395b;
        c a6 = gVar.a(lVar);
        if (a6 != null) {
            obj = a6.f3632e;
        } else {
            c cVar = new c(lVar, vVar);
            gVar.f3643g++;
            c cVar2 = gVar.f3641e;
            if (cVar2 == null) {
                gVar.f3640d = cVar;
            } else {
                cVar2.f3633f = cVar;
                cVar.f3634g = cVar2;
            }
            gVar.f3641e = cVar;
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (wVar == null) {
            vVar.c(true);
        }
    }

    public final void e(Object obj) {
        a("setValue");
        this.f1400g++;
        this.f1398e = obj;
        c((w) null);
    }
}
