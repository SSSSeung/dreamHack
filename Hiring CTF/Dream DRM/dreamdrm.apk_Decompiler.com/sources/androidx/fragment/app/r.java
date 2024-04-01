package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.c;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.t;
import androidx.lifecycle.y;
import b1.o;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k.k;
import m1.a;
import q1.d;
import q1.e;
import q1.f;

public abstract class r implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, n0, h, f {
    public static final Object U = new Object();
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final boolean E = true;
    public boolean F;
    public ViewGroup G;
    public View H;
    public boolean I;
    public boolean J = true;
    public p K;
    public boolean L;
    public float M;
    public boolean N;
    public m O = m.f1374h;
    public t P;
    public d1 Q;
    public final y R = new y();
    public e S;
    public final ArrayList T;

    /* renamed from: d  reason: collision with root package name */
    public int f1254d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f1255e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f1256f;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f1257g;

    /* renamed from: h  reason: collision with root package name */
    public String f1258h = UUID.randomUUID().toString();

    /* renamed from: i  reason: collision with root package name */
    public Bundle f1259i;

    /* renamed from: j  reason: collision with root package name */
    public r f1260j;

    /* renamed from: k  reason: collision with root package name */
    public String f1261k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f1262l;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f1263m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1264n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1265o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1266p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1267q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1268r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1269s;

    /* renamed from: t  reason: collision with root package name */
    public int f1270t;

    /* renamed from: u  reason: collision with root package name */
    public l0 f1271u;

    /* renamed from: v  reason: collision with root package name */
    public u f1272v;
    public l0 w = new l0();

    /* renamed from: x  reason: collision with root package name */
    public r f1273x;

    /* renamed from: y  reason: collision with root package name */
    public int f1274y;

    /* renamed from: z  reason: collision with root package name */
    public int f1275z;

    public r() {
        new AtomicInteger();
        this.T = new ArrayList();
        this.P = new t(this);
        this.S = n0.i(this);
    }

    public void A(Bundle bundle) {
        this.F = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.w.M();
        boolean z5 = true;
        this.f1269s = true;
        this.Q = new d1(e());
        View s5 = s(layoutInflater, viewGroup);
        this.H = s5;
        if (s5 != null) {
            this.Q.d();
            View view = this.H;
            d1 d1Var = this.Q;
            o.m(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, d1Var);
            View view2 = this.H;
            d1 d1Var2 = this.Q;
            o.m(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, d1Var2);
            View view3 = this.H;
            d1 d1Var3 = this.Q;
            o.m(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, d1Var3);
            this.R.e(this.Q);
            return;
        }
        if (this.Q.f1123e == null) {
            z5 = false;
        }
        if (!z5) {
            this.Q = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void C() {
        this.w.s(1);
        if (this.H != null) {
            d1 d1Var = this.Q;
            d1Var.d();
            if (d1Var.f1123e.f1382v.compareTo(m.f1372f) >= 0) {
                this.Q.c(l.ON_DESTROY);
            }
        }
        this.f1254d = 1;
        this.F = false;
        u();
        if (this.F) {
            k kVar = ((a) new c(e(), a.f4173d, 0).d(a.class)).f4174c;
            if (kVar.f3899f <= 0) {
                this.f1269s = false;
            } else {
                a2.m.o(kVar.f3898e[0]);
                throw null;
            }
        } else {
            throw new i1("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final Context D() {
        Context i3 = i();
        if (i3 != null) {
            return i3;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View E() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void F(int i3, int i6, int i7, int i8) {
        if (this.K != null || i3 != 0 || i6 != 0 || i7 != 0 || i8 != 0) {
            f().f1229d = i3;
            f().f1230e = i6;
            f().f1231f = i7;
            f().f1232g = i8;
        }
    }

    public final void G(Bundle bundle) {
        l0 l0Var = this.f1271u;
        if (l0Var != null) {
            if (l0Var.A || l0Var.B) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1259i = bundle;
    }

    public final d b() {
        return this.S.f4898b;
    }

    public h5.l c() {
        return new o(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0137, code lost:
        r3 = r5.f1261k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            r5 = this;
            r8.print(r6)
            java.lang.String r0 = "mFragmentId=#"
            r8.print(r0)
            int r0 = r5.f1274y
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r8.print(r0)
            int r0 = r5.f1275z
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mTag="
            r8.print(r0)
            java.lang.String r0 = r5.A
            r8.println(r0)
            r8.print(r6)
            java.lang.String r0 = "mState="
            r8.print(r0)
            int r0 = r5.f1254d
            r8.print(r0)
            java.lang.String r0 = " mWho="
            r8.print(r0)
            java.lang.String r0 = r5.f1258h
            r8.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r8.print(r0)
            int r0 = r5.f1270t
            r8.println(r0)
            r8.print(r6)
            java.lang.String r0 = "mAdded="
            r8.print(r0)
            boolean r0 = r5.f1264n
            r8.print(r0)
            java.lang.String r0 = " mRemoving="
            r8.print(r0)
            boolean r0 = r5.f1265o
            r8.print(r0)
            java.lang.String r0 = " mFromLayout="
            r8.print(r0)
            boolean r0 = r5.f1266p
            r8.print(r0)
            java.lang.String r0 = " mInLayout="
            r8.print(r0)
            boolean r0 = r5.f1267q
            r8.println(r0)
            r8.print(r6)
            java.lang.String r0 = "mHidden="
            r8.print(r0)
            boolean r0 = r5.B
            r8.print(r0)
            java.lang.String r0 = " mDetached="
            r8.print(r0)
            boolean r0 = r5.C
            r8.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r8.print(r0)
            boolean r0 = r5.E
            r8.print(r0)
            java.lang.String r0 = " mHasMenu="
            r8.print(r0)
            r0 = 0
            r8.println(r0)
            r8.print(r6)
            java.lang.String r1 = "mRetainInstance="
            r8.print(r1)
            boolean r1 = r5.D
            r8.print(r1)
            java.lang.String r1 = " mUserVisibleHint="
            r8.print(r1)
            boolean r1 = r5.J
            r8.println(r1)
            androidx.fragment.app.l0 r1 = r5.f1271u
            if (r1 == 0) goto L_0x00c7
            r8.print(r6)
            java.lang.String r1 = "mFragmentManager="
            r8.print(r1)
            androidx.fragment.app.l0 r1 = r5.f1271u
            r8.println(r1)
        L_0x00c7:
            androidx.fragment.app.u r1 = r5.f1272v
            if (r1 == 0) goto L_0x00d8
            r8.print(r6)
            java.lang.String r1 = "mHost="
            r8.print(r1)
            androidx.fragment.app.u r1 = r5.f1272v
            r8.println(r1)
        L_0x00d8:
            androidx.fragment.app.r r1 = r5.f1273x
            if (r1 == 0) goto L_0x00e9
            r8.print(r6)
            java.lang.String r1 = "mParentFragment="
            r8.print(r1)
            androidx.fragment.app.r r1 = r5.f1273x
            r8.println(r1)
        L_0x00e9:
            android.os.Bundle r1 = r5.f1259i
            if (r1 == 0) goto L_0x00fa
            r8.print(r6)
            java.lang.String r1 = "mArguments="
            r8.print(r1)
            android.os.Bundle r1 = r5.f1259i
            r8.println(r1)
        L_0x00fa:
            android.os.Bundle r1 = r5.f1255e
            if (r1 == 0) goto L_0x010b
            r8.print(r6)
            java.lang.String r1 = "mSavedFragmentState="
            r8.print(r1)
            android.os.Bundle r1 = r5.f1255e
            r8.println(r1)
        L_0x010b:
            android.util.SparseArray r1 = r5.f1256f
            if (r1 == 0) goto L_0x011c
            r8.print(r6)
            java.lang.String r1 = "mSavedViewState="
            r8.print(r1)
            android.util.SparseArray r1 = r5.f1256f
            r8.println(r1)
        L_0x011c:
            android.os.Bundle r1 = r5.f1257g
            if (r1 == 0) goto L_0x012d
            r8.print(r6)
            java.lang.String r1 = "mSavedViewRegistryState="
            r8.print(r1)
            android.os.Bundle r1 = r5.f1257g
            r8.println(r1)
        L_0x012d:
            androidx.fragment.app.r r1 = r5.f1260j
            r2 = 0
            if (r1 == 0) goto L_0x0133
            goto L_0x0141
        L_0x0133:
            androidx.fragment.app.l0 r1 = r5.f1271u
            if (r1 == 0) goto L_0x0140
            java.lang.String r3 = r5.f1261k
            if (r3 == 0) goto L_0x0140
            androidx.fragment.app.r r1 = r1.z(r3)
            goto L_0x0141
        L_0x0140:
            r1 = r2
        L_0x0141:
            if (r1 == 0) goto L_0x0158
            r8.print(r6)
            java.lang.String r3 = "mTarget="
            r8.print(r3)
            r8.print(r1)
            java.lang.String r1 = " mTargetRequestCode="
            r8.print(r1)
            int r1 = r5.f1262l
            r8.println(r1)
        L_0x0158:
            r8.print(r6)
            java.lang.String r1 = "mPopDirection="
            r8.print(r1)
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x0166
            r1 = r0
            goto L_0x0168
        L_0x0166:
            boolean r1 = r1.f1228c
        L_0x0168:
            r8.println(r1)
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x0171
            r1 = r0
            goto L_0x0173
        L_0x0171:
            int r1 = r1.f1229d
        L_0x0173:
            if (r1 == 0) goto L_0x0188
            r8.print(r6)
            java.lang.String r1 = "getEnterAnim="
            r8.print(r1)
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x0183
            r1 = r0
            goto L_0x0185
        L_0x0183:
            int r1 = r1.f1229d
        L_0x0185:
            r8.println(r1)
        L_0x0188:
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x018e
            r1 = r0
            goto L_0x0190
        L_0x018e:
            int r1 = r1.f1230e
        L_0x0190:
            if (r1 == 0) goto L_0x01a5
            r8.print(r6)
            java.lang.String r1 = "getExitAnim="
            r8.print(r1)
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x01a0
            r1 = r0
            goto L_0x01a2
        L_0x01a0:
            int r1 = r1.f1230e
        L_0x01a2:
            r8.println(r1)
        L_0x01a5:
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x01ab
            r1 = r0
            goto L_0x01ad
        L_0x01ab:
            int r1 = r1.f1231f
        L_0x01ad:
            if (r1 == 0) goto L_0x01c2
            r8.print(r6)
            java.lang.String r1 = "getPopEnterAnim="
            r8.print(r1)
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x01bd
            r1 = r0
            goto L_0x01bf
        L_0x01bd:
            int r1 = r1.f1231f
        L_0x01bf:
            r8.println(r1)
        L_0x01c2:
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x01c8
            r1 = r0
            goto L_0x01ca
        L_0x01c8:
            int r1 = r1.f1232g
        L_0x01ca:
            if (r1 == 0) goto L_0x01df
            r8.print(r6)
            java.lang.String r1 = "getPopExitAnim="
            r8.print(r1)
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x01da
            r1 = r0
            goto L_0x01dc
        L_0x01da:
            int r1 = r1.f1232g
        L_0x01dc:
            r8.println(r1)
        L_0x01df:
            android.view.ViewGroup r1 = r5.G
            if (r1 == 0) goto L_0x01f0
            r8.print(r6)
            java.lang.String r1 = "mContainer="
            r8.print(r1)
            android.view.ViewGroup r1 = r5.G
            r8.println(r1)
        L_0x01f0:
            android.view.View r1 = r5.H
            if (r1 == 0) goto L_0x0201
            r8.print(r6)
            java.lang.String r1 = "mView="
            r8.print(r1)
            android.view.View r1 = r5.H
            r8.println(r1)
        L_0x0201:
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x0207
            r1 = r2
            goto L_0x0209
        L_0x0207:
            android.view.View r1 = r1.f1226a
        L_0x0209:
            if (r1 == 0) goto L_0x021e
            r8.print(r6)
            java.lang.String r1 = "mAnimatingAway="
            r8.print(r1)
            androidx.fragment.app.p r1 = r5.K
            if (r1 != 0) goto L_0x0219
            r1 = r2
            goto L_0x021b
        L_0x0219:
            android.view.View r1 = r1.f1226a
        L_0x021b:
            r8.println(r1)
        L_0x021e:
            android.content.Context r1 = r5.i()
            if (r1 == 0) goto L_0x0266
            androidx.lifecycle.m0 r1 = r5.e()
            androidx.activity.result.c r3 = new androidx.activity.result.c
            androidx.fragment.app.n0 r4 = m1.a.f4173d
            r3.<init>((androidx.lifecycle.m0) r1, (androidx.fragment.app.n0) r4, (int) r0)
            java.lang.Class<m1.a> r1 = m1.a.class
            androidx.lifecycle.k0 r1 = r3.d(r1)
            m1.a r1 = (m1.a) r1
            k.k r1 = r1.f4174c
            int r3 = r1.f3899f
            if (r3 <= 0) goto L_0x0266
            r8.print(r6)
            java.lang.String r3 = "Loaders:"
            r8.println(r3)
            int r3 = r1.f3899f
            if (r3 > 0) goto L_0x024a
            goto L_0x0266
        L_0x024a:
            java.lang.Object[] r7 = r1.f3898e
            r7 = r7[r0]
            a2.m.o(r7)
            r8.print(r6)
            java.lang.String r6 = "  #"
            r8.print(r6)
            int[] r6 = r1.f3897d
            r6 = r6[r0]
            r8.print(r6)
            java.lang.String r6 = ": "
            r8.print(r6)
            throw r2
        L_0x0266:
            r8.print(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Child "
            r0.<init>(r1)
            androidx.fragment.app.l0 r1 = r5.w
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.println(r0)
            androidx.fragment.app.l0 r0 = r5.w
            java.lang.String r1 = "  "
            java.lang.String r6 = a2.m.h(r6, r1)
            r0.t(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.d(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final m0 e() {
        if (this.f1271u == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (j() != 1) {
            HashMap hashMap = this.f1271u.H.f1222e;
            m0 m0Var = (m0) hashMap.get(this.f1258h);
            if (m0Var != null) {
                return m0Var;
            }
            m0 m0Var2 = new m0();
            hashMap.put(this.f1258h, m0Var2);
            return m0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final p f() {
        if (this.K == null) {
            this.K = new p();
        }
        return this.K;
    }

    public final l0 g() {
        if (this.f1272v != null) {
            return this.w;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final t h() {
        return this.P;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final Context i() {
        u uVar = this.f1272v;
        if (uVar == null) {
            return null;
        }
        return uVar.f1295r;
    }

    public final int j() {
        m mVar = this.O;
        return (mVar == m.f1371e || this.f1273x == null) ? mVar.ordinal() : Math.min(mVar.ordinal(), this.f1273x.j());
    }

    public final l0 k() {
        l0 l0Var = this.f1271u;
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object l() {
        Object obj;
        p pVar = this.K;
        if (pVar == null || (obj = pVar.f1237l) == U) {
            return null;
        }
        return obj;
    }

    public final Object m() {
        Object obj;
        p pVar = this.K;
        if (pVar == null || (obj = pVar.f1236k) == U) {
            return null;
        }
        return obj;
    }

    public final Object n() {
        Object obj;
        p pVar = this.K;
        if (pVar == null || (obj = pVar.f1238m) == U) {
            return null;
        }
        return obj;
    }

    public final boolean o() {
        r rVar = this.f1273x;
        return rVar != null && (rVar.f1265o || rVar.o());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        u uVar = this.f1272v;
        v vVar = uVar == null ? null : (v) uVar.f1294q;
        if (vVar != null) {
            vVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final void onLowMemory() {
        this.F = true;
    }

    public final void p(int i3, int i6, Intent intent) {
        if (l0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i6 + " data: " + intent);
        }
    }

    public void q(Context context) {
        this.F = true;
        u uVar = this.f1272v;
        if ((uVar == null ? null : uVar.f1294q) != null) {
            this.F = true;
        }
    }

    public void r(Bundle bundle) {
        Parcelable parcelable;
        this.F = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.w.R(parcelable);
            l0 l0Var = this.w;
            l0Var.A = false;
            l0Var.B = false;
            l0Var.H.f1225h = false;
            l0Var.s(1);
        }
        l0 l0Var2 = this.w;
        if (!(l0Var2.f1185o >= 1)) {
            l0Var2.A = false;
            l0Var2.B = false;
            l0Var2.H.f1225h = false;
            l0Var2.s(1);
        }
    }

    public View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void t() {
        this.F = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1258h);
        if (this.f1274y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1274y));
        }
        if (this.A != null) {
            sb.append(" tag=");
            sb.append(this.A);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.F = true;
    }

    public void v() {
        this.F = true;
    }

    public LayoutInflater w(Bundle bundle) {
        u uVar = this.f1272v;
        if (uVar != null) {
            v vVar = uVar.f1298u;
            LayoutInflater cloneInContext = vVar.getLayoutInflater().cloneInContext(vVar);
            cloneInContext.setFactory2(this.w.f1176f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void x(Bundle bundle) {
    }

    public void y() {
        this.F = true;
    }

    public void z() {
        this.F = true;
    }
}
