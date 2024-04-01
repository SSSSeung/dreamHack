package androidx.fragment.app;

import a2.m;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t0.d;

public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public int f1146a;

    /* renamed from: b  reason: collision with root package name */
    public int f1147b;

    /* renamed from: c  reason: collision with root package name */
    public final r f1148c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1149d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f1150e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f1151f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1152g = false;

    /* renamed from: h  reason: collision with root package name */
    public final r0 f1153h;

    public g1(int i3, int i6, r0 r0Var, d dVar) {
        r rVar = r0Var.f1278c;
        this.f1146a = i3;
        this.f1147b = i6;
        this.f1148c = rVar;
        dVar.b(new l(3, this));
        this.f1153h = r0Var;
    }

    public final void a() {
        if (!this.f1151f) {
            this.f1151f = true;
            HashSet hashSet = this.f1150e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((d) it.next()).a();
            }
        }
    }

    public final void b() {
        if (!this.f1152g) {
            if (l0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1152g = true;
            Iterator it = this.f1149d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1153h.k();
    }

    public final void c(int i3, int i6) {
        if (i6 != 0) {
            int i7 = i6 - 1;
            r rVar = this.f1148c;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        if (l0.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + rVar + " mFinalState = " + m.v(this.f1146a) + " -> REMOVED. mLifecycleImpact  = " + m.u(this.f1147b) + " to REMOVING.");
                        }
                        this.f1146a = 1;
                        this.f1147b = 3;
                    }
                } else if (this.f1146a == 1) {
                    if (l0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + rVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + m.u(this.f1147b) + " to ADDING.");
                    }
                    this.f1146a = 2;
                    this.f1147b = 2;
                }
            } else if (this.f1146a != 1) {
                if (l0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + rVar + " mFinalState = " + m.v(this.f1146a) + " -> " + m.v(i3) + ". ");
                }
                this.f1146a = i3;
            }
        } else {
            throw null;
        }
    }

    public final void d() {
        if (this.f1147b == 2) {
            r0 r0Var = this.f1153h;
            r rVar = r0Var.f1278c;
            View findFocus = rVar.H.findFocus();
            if (findFocus != null) {
                rVar.f().f1240o = findFocus;
                if (l0.G(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + rVar);
                }
            }
            View E = this.f1148c.E();
            if (E.getParent() == null) {
                r0Var.b();
                E.setAlpha(0.0f);
            }
            if (E.getAlpha() == 0.0f && E.getVisibility() == 0) {
                E.setVisibility(4);
            }
            p pVar = rVar.K;
            E.setAlpha(pVar == null ? 1.0f : pVar.f1239n);
        }
    }

    /* renamed from: e */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + m.v(this.f1146a) + "} {mLifecycleImpact = " + m.u(this.f1147b) + "} {mFragment = " + this.f1148c + "}";
    }
}
