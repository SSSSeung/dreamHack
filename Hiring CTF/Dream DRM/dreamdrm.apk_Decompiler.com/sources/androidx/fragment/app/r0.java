package androidx.fragment.app;

import a2.m;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import x0.g0;
import x0.h0;
import x0.u0;

public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f1276a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f1277b;

    /* renamed from: c  reason: collision with root package name */
    public final r f1278c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1279d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1280e = -1;

    public r0(c0 c0Var, s0 s0Var, r rVar) {
        this.f1276a = c0Var;
        this.f1277b = s0Var;
        this.f1278c = rVar;
    }

    public final void a() {
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + rVar);
        }
        Bundle bundle = rVar.f1255e;
        rVar.w.M();
        rVar.f1254d = 3;
        rVar.F = true;
        if (l0.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + rVar);
        }
        View view = rVar.H;
        if (view != null) {
            Bundle bundle2 = rVar.f1255e;
            SparseArray sparseArray = rVar.f1256f;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                rVar.f1256f = null;
            }
            if (rVar.H != null) {
                d1 d1Var = rVar.Q;
                d1Var.f1124f.b(rVar.f1257g);
                rVar.f1257g = null;
            }
            rVar.F = false;
            rVar.A(bundle2);
            if (!rVar.F) {
                throw new i1("Fragment " + rVar + " did not call through to super.onViewStateRestored()");
            } else if (rVar.H != null) {
                rVar.Q.c(l.ON_CREATE);
            }
        }
        rVar.f1255e = null;
        l0 l0Var = rVar.w;
        l0Var.A = false;
        l0Var.B = false;
        l0Var.H.f1225h = false;
        l0Var.s(4);
        this.f1276a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        s0 s0Var = this.f1277b;
        s0Var.getClass();
        r rVar = this.f1278c;
        ViewGroup viewGroup = rVar.G;
        int i3 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = s0Var.f1282a;
            int indexOf = arrayList.indexOf(rVar);
            int i6 = indexOf - 1;
            while (true) {
                if (i6 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        r rVar2 = (r) arrayList.get(indexOf);
                        if (rVar2.G == viewGroup && (view = rVar2.H) != null) {
                            i3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    r rVar3 = (r) arrayList.get(i6);
                    if (rVar3.G == viewGroup && (view2 = rVar3.H) != null) {
                        i3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i6--;
                }
            }
        }
        rVar.G.addView(rVar.H, i3);
    }

    public final void c() {
        r0 r0Var;
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + rVar);
        }
        r rVar2 = rVar.f1260j;
        s0 s0Var = this.f1277b;
        if (rVar2 != null) {
            r0Var = (r0) s0Var.f1283b.get(rVar2.f1258h);
            if (r0Var != null) {
                rVar.f1261k = rVar.f1260j.f1258h;
                rVar.f1260j = null;
            } else {
                throw new IllegalStateException("Fragment " + rVar + " declared target fragment " + rVar.f1260j + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = rVar.f1261k;
            if (str != null) {
                r0Var = (r0) s0Var.f1283b.get(str);
                if (r0Var == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(rVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(m.j(sb, rVar.f1261k, " that does not belong to this FragmentManager!"));
                }
            } else {
                r0Var = null;
            }
        }
        if (r0Var != null) {
            r0Var.k();
        }
        l0 l0Var = rVar.f1271u;
        rVar.f1272v = l0Var.f1186p;
        rVar.f1273x = l0Var.f1188r;
        c0 c0Var = this.f1276a;
        c0Var.h(false);
        ArrayList arrayList = rVar.T;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
            rVar.w.b(rVar.f1272v, rVar.c(), rVar);
            rVar.f1254d = 0;
            rVar.F = false;
            rVar.q(rVar.f1272v.f1295r);
            if (rVar.F) {
                Iterator it2 = rVar.f1271u.f1184n.iterator();
                while (it2.hasNext()) {
                    ((p0) it2.next()).a();
                }
                l0 l0Var2 = rVar.w;
                l0Var2.A = false;
                l0Var2.B = false;
                l0Var2.H.f1225h = false;
                l0Var2.s(0);
                c0Var.b(false);
                return;
            }
            throw new i1("Fragment " + rVar + " did not call through to super.onAttach()");
        }
        m.o(it.next());
        throw null;
    }

    public final int d() {
        int i3;
        g1 g1Var;
        r rVar = this.f1278c;
        if (rVar.f1271u == null) {
            return rVar.f1254d;
        }
        int i6 = this.f1280e;
        int ordinal = rVar.O.ordinal();
        boolean z5 = false;
        if (ordinal == 1) {
            i6 = Math.min(i6, 0);
        } else if (ordinal == 2) {
            i6 = Math.min(i6, 1);
        } else if (ordinal == 3) {
            i6 = Math.min(i6, 5);
        } else if (ordinal != 4) {
            i6 = Math.min(i6, -1);
        }
        if (rVar.f1266p) {
            if (rVar.f1267q) {
                i6 = Math.max(this.f1280e, 2);
                View view = rVar.H;
                if (view != null && view.getParent() == null) {
                    i6 = Math.min(i6, 2);
                }
            } else {
                i6 = this.f1280e < 4 ? Math.min(i6, rVar.f1254d) : Math.min(i6, 1);
            }
        }
        if (!rVar.f1264n) {
            i6 = Math.min(i6, 1);
        }
        ViewGroup viewGroup = rVar.G;
        if (viewGroup != null) {
            h1 f6 = h1.f(viewGroup, rVar.k().E());
            f6.getClass();
            g1 d6 = f6.d(rVar);
            i3 = d6 != null ? d6.f1147b : 0;
            Iterator it = f6.f1159c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    g1Var = null;
                    break;
                }
                g1Var = (g1) it.next();
                if (g1Var.f1148c.equals(rVar) && !g1Var.f1151f) {
                    break;
                }
            }
            if (g1Var != null && (i3 == 0 || i3 == 1)) {
                i3 = g1Var.f1147b;
            }
        } else {
            i3 = 0;
        }
        if (i3 == 2) {
            i6 = Math.min(i6, 6);
        } else if (i3 == 3) {
            i6 = Math.max(i6, 3);
        } else if (rVar.f1265o) {
            if (rVar.f1270t > 0) {
                z5 = true;
            }
            i6 = z5 ? Math.min(i6, 1) : Math.min(i6, -1);
        }
        if (rVar.I && rVar.f1254d < 5) {
            i6 = Math.min(i6, 4);
        }
        if (l0.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i6 + " for " + rVar);
        }
        return i6;
    }

    public final void e() {
        Parcelable parcelable;
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + rVar);
        }
        if (!rVar.N) {
            c0 c0Var = this.f1276a;
            c0Var.i(false);
            Bundle bundle = rVar.f1255e;
            rVar.w.M();
            rVar.f1254d = 1;
            rVar.F = false;
            rVar.P.a(new Fragment$5(rVar));
            rVar.S.b(bundle);
            rVar.r(bundle);
            rVar.N = true;
            if (rVar.F) {
                rVar.P.x(l.ON_CREATE);
                c0Var.c(false);
                return;
            }
            throw new i1("Fragment " + rVar + " did not call through to super.onCreate()");
        }
        Bundle bundle2 = rVar.f1255e;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            rVar.w.R(parcelable);
            l0 l0Var = rVar.w;
            l0Var.A = false;
            l0Var.B = false;
            l0Var.H.f1225h = false;
            l0Var.s(1);
        }
        rVar.f1254d = 1;
    }

    public final void f() {
        String str;
        r rVar = this.f1278c;
        if (!rVar.f1266p) {
            if (l0.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + rVar);
            }
            LayoutInflater w = rVar.w(rVar.f1255e);
            ViewGroup viewGroup = rVar.G;
            if (viewGroup == null) {
                int i3 = rVar.f1275z;
                if (i3 == 0) {
                    viewGroup = null;
                } else if (i3 != -1) {
                    viewGroup = (ViewGroup) rVar.f1271u.f1187q.j(i3);
                    if (viewGroup == null && !rVar.f1268r) {
                        try {
                            str = rVar.D().getResources().getResourceName(rVar.f1275z);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(rVar.f1275z) + " (" + str + ") for fragment " + rVar);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + rVar + " for a container view with no id");
                }
            }
            rVar.G = viewGroup;
            rVar.B(w, viewGroup, rVar.f1255e);
            View view = rVar.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                rVar.H.setTag(R.id.fragment_container_view_tag, rVar);
                if (viewGroup != null) {
                    b();
                }
                if (rVar.B) {
                    rVar.H.setVisibility(8);
                }
                View view2 = rVar.H;
                WeakHashMap weakHashMap = u0.f5622a;
                if (g0.b(view2)) {
                    h0.c(rVar.H);
                } else {
                    View view3 = rVar.H;
                    view3.addOnAttachStateChangeListener(new a0(this, view3));
                }
                rVar.w.s(2);
                this.f1276a.n(false);
                int visibility = rVar.H.getVisibility();
                rVar.f().f1239n = rVar.H.getAlpha();
                if (rVar.G != null && visibility == 0) {
                    View findFocus = rVar.H.findFocus();
                    if (findFocus != null) {
                        rVar.f().f1240o = findFocus;
                        if (l0.G(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + rVar);
                        }
                    }
                    rVar.H.setAlpha(0.0f);
                }
            }
            rVar.f1254d = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r10 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.l0.G(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.r r3 = r10.f1278c
            if (r1 == 0) goto L_0x001c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom CREATED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L_0x001c:
            boolean r1 = r3.f1265o
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002d
            int r1 = r3.f1270t
            if (r1 <= 0) goto L_0x0028
            r1 = r5
            goto L_0x0029
        L_0x0028:
            r1 = r4
        L_0x0029:
            if (r1 != 0) goto L_0x002d
            r1 = r5
            goto L_0x002e
        L_0x002d:
            r1 = r4
        L_0x002e:
            androidx.fragment.app.s0 r6 = r10.f1277b
            if (r1 != 0) goto L_0x004b
            androidx.fragment.app.o0 r7 = r6.f1284c
            java.util.HashMap r8 = r7.f1220c
            java.lang.String r9 = r3.f1258h
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L_0x0040
        L_0x003e:
            r7 = r5
            goto L_0x0046
        L_0x0040:
            boolean r8 = r7.f1223f
            if (r8 == 0) goto L_0x003e
            boolean r7 = r7.f1224g
        L_0x0046:
            if (r7 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r7 = r4
            goto L_0x004c
        L_0x004b:
            r7 = r5
        L_0x004c:
            if (r7 == 0) goto L_0x011b
            androidx.fragment.app.u r7 = r3.f1272v
            boolean r8 = r7 instanceof androidx.lifecycle.n0
            if (r8 == 0) goto L_0x0059
            androidx.fragment.app.o0 r5 = r6.f1284c
            boolean r5 = r5.f1224g
            goto L_0x0066
        L_0x0059:
            android.content.Context r7 = r7.f1295r
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L_0x0066
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r7 = r7.isChangingConfigurations()
            r5 = r5 ^ r7
        L_0x0066:
            if (r1 != 0) goto L_0x006a
            if (r5 == 0) goto L_0x00ae
        L_0x006a:
            androidx.fragment.app.o0 r1 = r6.f1284c
            r1.getClass()
            boolean r0 = androidx.fragment.app.l0.G(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Clearing non-config state for "
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L_0x0086:
            java.util.HashMap r0 = r1.f1221d
            java.lang.String r2 = r3.f1258h
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.o0 r2 = (androidx.fragment.app.o0) r2
            if (r2 == 0) goto L_0x009a
            r2.a()
            java.lang.String r2 = r3.f1258h
            r0.remove(r2)
        L_0x009a:
            java.util.HashMap r0 = r1.f1222e
            java.lang.String r1 = r3.f1258h
            java.lang.Object r1 = r0.get(r1)
            androidx.lifecycle.m0 r1 = (androidx.lifecycle.m0) r1
            if (r1 == 0) goto L_0x00ae
            r1.a()
            java.lang.String r1 = r3.f1258h
            r0.remove(r1)
        L_0x00ae:
            androidx.fragment.app.l0 r0 = r3.w
            r0.k()
            androidx.lifecycle.t r0 = r3.P
            androidx.lifecycle.l r1 = androidx.lifecycle.l.ON_DESTROY
            r0.x(r1)
            r3.f1254d = r4
            r3.F = r4
            r3.N = r4
            r3.t()
            boolean r0 = r3.F
            if (r0 == 0) goto L_0x0102
            androidx.fragment.app.c0 r0 = r10.f1276a
            r0.e(r4)
            java.util.ArrayList r0 = r6.d()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.r0 r1 = (androidx.fragment.app.r0) r1
            if (r1 == 0) goto L_0x00d4
            java.lang.String r2 = r3.f1258h
            androidx.fragment.app.r r1 = r1.f1278c
            java.lang.String r4 = r1.f1261k
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00d4
            r1.f1260j = r3
            r2 = 0
            r1.f1261k = r2
            goto L_0x00d4
        L_0x00f4:
            java.lang.String r0 = r3.f1261k
            if (r0 == 0) goto L_0x00fe
            androidx.fragment.app.r r0 = r6.b(r0)
            r3.f1260j = r0
        L_0x00fe:
            r6.h(r10)
            goto L_0x012d
        L_0x0102:
            androidx.fragment.app.i1 r0 = new androidx.fragment.app.i1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroy()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x011b:
            java.lang.String r0 = r3.f1261k
            if (r0 == 0) goto L_0x012b
            androidx.fragment.app.r r0 = r6.b(r0)
            if (r0 == 0) goto L_0x012b
            boolean r1 = r0.D
            if (r1 == 0) goto L_0x012b
            r3.f1260j = r0
        L_0x012b:
            r3.f1254d = r4
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r0.g():void");
    }

    public final void h() {
        View view;
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + rVar);
        }
        ViewGroup viewGroup = rVar.G;
        if (!(viewGroup == null || (view = rVar.H) == null)) {
            viewGroup.removeView(view);
        }
        rVar.C();
        this.f1276a.o(false);
        rVar.G = null;
        rVar.H = null;
        rVar.Q = null;
        rVar.R.e((Object) null);
        rVar.f1267q = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r9 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.l0.G(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.r r3 = r9.f1278c
            if (r1 == 0) goto L_0x001c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom ATTACHED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L_0x001c:
            r1 = -1
            r3.f1254d = r1
            r4 = 0
            r3.F = r4
            r3.v()
            boolean r5 = r3.F
            if (r5 == 0) goto L_0x00c1
            androidx.fragment.app.l0 r5 = r3.w
            boolean r6 = r5.C
            if (r6 != 0) goto L_0x0039
            r5.k()
            androidx.fragment.app.l0 r5 = new androidx.fragment.app.l0
            r5.<init>()
            r3.w = r5
        L_0x0039:
            androidx.fragment.app.c0 r5 = r9.f1276a
            r5.f(r4)
            r3.f1254d = r1
            r1 = 0
            r3.f1272v = r1
            r3.f1273x = r1
            r3.f1271u = r1
            boolean r5 = r3.f1265o
            r6 = 1
            if (r5 == 0) goto L_0x0057
            int r5 = r3.f1270t
            if (r5 <= 0) goto L_0x0052
            r5 = r6
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            if (r5 != 0) goto L_0x0057
            r5 = r6
            goto L_0x0058
        L_0x0057:
            r5 = r4
        L_0x0058:
            if (r5 != 0) goto L_0x0071
            androidx.fragment.app.s0 r5 = r9.f1277b
            androidx.fragment.app.o0 r5 = r5.f1284c
            java.util.HashMap r7 = r5.f1220c
            java.lang.String r8 = r3.f1258h
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            boolean r7 = r5.f1223f
            if (r7 == 0) goto L_0x006f
            boolean r6 = r5.f1224g
        L_0x006f:
            if (r6 == 0) goto L_0x00c0
        L_0x0071:
            boolean r0 = androidx.fragment.app.l0.G(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "initState called for fragment: "
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L_0x0088:
            androidx.lifecycle.t r0 = new androidx.lifecycle.t
            r0.<init>(r3)
            r3.P = r0
            q1.e r0 = androidx.fragment.app.n0.i(r3)
            r3.S = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.f1258h = r0
            r3.f1264n = r4
            r3.f1265o = r4
            r3.f1266p = r4
            r3.f1267q = r4
            r3.f1268r = r4
            r3.f1270t = r4
            r3.f1271u = r1
            androidx.fragment.app.l0 r0 = new androidx.fragment.app.l0
            r0.<init>()
            r3.w = r0
            r3.f1272v = r1
            r3.f1274y = r4
            r3.f1275z = r4
            r3.A = r1
            r3.B = r4
            r3.C = r4
        L_0x00c0:
            return
        L_0x00c1:
            androidx.fragment.app.i1 r0 = new androidx.fragment.app.i1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDetach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r0.i():void");
    }

    public final void j() {
        r rVar = this.f1278c;
        if (rVar.f1266p && rVar.f1267q && !rVar.f1269s) {
            if (l0.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + rVar);
            }
            rVar.B(rVar.w(rVar.f1255e), (ViewGroup) null, rVar.f1255e);
            View view = rVar.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                rVar.H.setTag(R.id.fragment_container_view_tag, rVar);
                if (rVar.B) {
                    rVar.H.setVisibility(8);
                }
                rVar.w.s(2);
                this.f1276a.n(false);
                rVar.f1254d = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z5 = this.f1279d;
        r rVar = this.f1278c;
        if (!z5) {
            boolean z6 = true;
            z6 = false;
            try {
                while (true) {
                    int d6 = d();
                    int i3 = rVar.f1254d;
                    if (d6 != i3) {
                        if (d6 <= i3) {
                            switch (i3 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    rVar.f1254d = z6;
                                    break;
                                case 2:
                                    rVar.f1267q = z6;
                                    rVar.f1254d = 2;
                                    break;
                                case 3:
                                    if (l0.G(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + rVar);
                                    }
                                    if (rVar.H != null && rVar.f1256f == null) {
                                        o();
                                    }
                                    if (!(rVar.H == null || (viewGroup2 = rVar.G) == null)) {
                                        h1 f6 = h1.f(viewGroup2, rVar.k().E());
                                        f6.getClass();
                                        if (l0.G(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + rVar);
                                        }
                                        f6.a(z6, 3, this);
                                    }
                                    rVar.f1254d = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    rVar.f1254d = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i3 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(rVar.H == null || (viewGroup3 = rVar.G) == null)) {
                                        h1 f7 = h1.f(viewGroup3, rVar.k().E());
                                        int b6 = m.b(rVar.H.getVisibility());
                                        f7.getClass();
                                        if (l0.G(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + rVar);
                                        }
                                        f7.a(b6, 2, this);
                                    }
                                    rVar.f1254d = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    rVar.f1254d = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                    } else {
                        if (rVar.L) {
                            if (!(rVar.H == null || (viewGroup = rVar.G) == null)) {
                                h1 f8 = h1.f(viewGroup, rVar.k().E());
                                if (rVar.B) {
                                    f8.getClass();
                                    if (l0.G(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + rVar);
                                    }
                                    f8.a(3, z6, this);
                                } else {
                                    f8.getClass();
                                    if (l0.G(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + rVar);
                                    }
                                    f8.a(2, z6 ? 1 : 0, this);
                                }
                            }
                            l0 l0Var = rVar.f1271u;
                            if (l0Var != null && rVar.f1264n && l0.H(rVar)) {
                                l0Var.f1195z = z6;
                            }
                            rVar.L = z6;
                        }
                        this.f1279d = z6;
                        return;
                    }
                }
            } finally {
                this.f1279d = z6;
            }
        } else if (l0.G(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + rVar);
        }
    }

    public final void l() {
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "movefrom RESUMED: " + rVar);
        }
        rVar.w.s(5);
        if (rVar.H != null) {
            rVar.Q.c(l.ON_PAUSE);
        }
        rVar.P.x(l.ON_PAUSE);
        rVar.f1254d = 6;
        rVar.F = true;
        this.f1276a.g(false);
    }

    public final void m(ClassLoader classLoader) {
        r rVar = this.f1278c;
        Bundle bundle = rVar.f1255e;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            rVar.f1256f = rVar.f1255e.getSparseParcelableArray("android:view_state");
            rVar.f1257g = rVar.f1255e.getBundle("android:view_registry_state");
            String string = rVar.f1255e.getString("android:target_state");
            rVar.f1261k = string;
            if (string != null) {
                rVar.f1262l = rVar.f1255e.getInt("android:target_req_state", 0);
            }
            boolean z5 = rVar.f1255e.getBoolean("android:user_visible_hint", true);
            rVar.J = z5;
            if (!z5) {
                rVar.I = true;
            }
        }
    }

    public final void n() {
        boolean z5;
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + rVar);
        }
        p pVar = rVar.K;
        View view = pVar == null ? null : pVar.f1240o;
        if (view != null) {
            if (view != rVar.H) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z5 = false;
                        break;
                    } else if (parent == rVar.H) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z5 = true;
            if (z5) {
                boolean requestFocus = view.requestFocus();
                if (l0.G(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(rVar);
                    sb.append(" resulting in focused view ");
                    sb.append(rVar.H.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        rVar.f().f1240o = null;
        rVar.w.M();
        rVar.w.w(true);
        rVar.f1254d = 7;
        rVar.F = true;
        t tVar = rVar.P;
        l lVar = l.ON_RESUME;
        tVar.x(lVar);
        if (rVar.H != null) {
            rVar.Q.f1123e.x(lVar);
        }
        l0 l0Var = rVar.w;
        l0Var.A = false;
        l0Var.B = false;
        l0Var.H.f1225h = false;
        l0Var.s(7);
        this.f1276a.j(false);
        rVar.f1255e = null;
        rVar.f1256f = null;
        rVar.f1257g = null;
    }

    public final void o() {
        r rVar = this.f1278c;
        if (rVar.H != null) {
            SparseArray sparseArray = new SparseArray();
            rVar.H.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                rVar.f1256f = sparseArray;
            }
            Bundle bundle = new Bundle();
            rVar.Q.f1124f.c(bundle);
            if (!bundle.isEmpty()) {
                rVar.f1257g = bundle;
            }
        }
    }

    public final void p() {
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "moveto STARTED: " + rVar);
        }
        rVar.w.M();
        rVar.w.w(true);
        rVar.f1254d = 5;
        rVar.F = false;
        rVar.y();
        if (rVar.F) {
            t tVar = rVar.P;
            l lVar = l.ON_START;
            tVar.x(lVar);
            if (rVar.H != null) {
                rVar.Q.f1123e.x(lVar);
            }
            l0 l0Var = rVar.w;
            l0Var.A = false;
            l0Var.B = false;
            l0Var.H.f1225h = false;
            l0Var.s(5);
            this.f1276a.l(false);
            return;
        }
        throw new i1("Fragment " + rVar + " did not call through to super.onStart()");
    }

    public final void q() {
        boolean G = l0.G(3);
        r rVar = this.f1278c;
        if (G) {
            Log.d("FragmentManager", "movefrom STARTED: " + rVar);
        }
        l0 l0Var = rVar.w;
        l0Var.B = true;
        l0Var.H.f1225h = true;
        l0Var.s(4);
        if (rVar.H != null) {
            rVar.Q.c(l.ON_STOP);
        }
        rVar.P.x(l.ON_STOP);
        rVar.f1254d = 4;
        rVar.F = false;
        rVar.z();
        if (rVar.F) {
            this.f1276a.m(false);
            return;
        }
        throw new i1("Fragment " + rVar + " did not call through to super.onStop()");
    }

    public r0(c0 c0Var, s0 s0Var, r rVar, q0 q0Var) {
        this.f1276a = c0Var;
        this.f1277b = s0Var;
        this.f1278c = rVar;
        rVar.f1256f = null;
        rVar.f1257g = null;
        rVar.f1270t = 0;
        rVar.f1267q = false;
        rVar.f1264n = false;
        r rVar2 = rVar.f1260j;
        rVar.f1261k = rVar2 != null ? rVar2.f1258h : null;
        rVar.f1260j = null;
        Bundle bundle = q0Var.f1253p;
        rVar.f1255e = bundle == null ? new Bundle() : bundle;
    }

    public r0(c0 c0Var, s0 s0Var, ClassLoader classLoader, f0 f0Var, q0 q0Var) {
        this.f1276a = c0Var;
        this.f1277b = s0Var;
        r a6 = f0Var.a(q0Var.f1241d);
        this.f1278c = a6;
        Bundle bundle = q0Var.f1250m;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a6.G(bundle);
        a6.f1258h = q0Var.f1242e;
        a6.f1266p = q0Var.f1243f;
        a6.f1268r = true;
        a6.f1274y = q0Var.f1244g;
        a6.f1275z = q0Var.f1245h;
        a6.A = q0Var.f1246i;
        a6.D = q0Var.f1247j;
        a6.f1265o = q0Var.f1248k;
        a6.C = q0Var.f1249l;
        a6.B = q0Var.f1251n;
        a6.O = androidx.lifecycle.m.values()[q0Var.f1252o];
        Bundle bundle2 = q0Var.f1253p;
        a6.f1255e = bundle2 == null ? new Bundle() : bundle2;
        if (l0.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a6);
        }
    }
}
