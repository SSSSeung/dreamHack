package androidx.fragment.app;

import a2.m;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.h;
import androidx.activity.result.c;
import androidx.activity.y;
import com.theori.dreamdrm.R;
import h5.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class l0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public o0 H;
    public final w I;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1171a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1172b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f1173c = new s0();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f1174d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1175e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f1176f = new b0(this);

    /* renamed from: g  reason: collision with root package name */
    public y f1177g;

    /* renamed from: h  reason: collision with root package name */
    public final e0 f1178h = new e0(this);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1179i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map f1180j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map f1181k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f1182l;

    /* renamed from: m  reason: collision with root package name */
    public final c0 f1183m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList f1184n;

    /* renamed from: o  reason: collision with root package name */
    public int f1185o;

    /* renamed from: p  reason: collision with root package name */
    public u f1186p;

    /* renamed from: q  reason: collision with root package name */
    public l f1187q;

    /* renamed from: r  reason: collision with root package name */
    public r f1188r;

    /* renamed from: s  reason: collision with root package name */
    public r f1189s;

    /* renamed from: t  reason: collision with root package name */
    public final f0 f1190t;

    /* renamed from: u  reason: collision with root package name */
    public final d0 f1191u;

    /* renamed from: v  reason: collision with root package name */
    public c f1192v;
    public c w;

    /* renamed from: x  reason: collision with root package name */
    public c f1193x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayDeque f1194y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1195z;

    public l0() {
        Collections.synchronizedMap(new HashMap());
        this.f1181k = Collections.synchronizedMap(new HashMap());
        this.f1182l = new d0(this, 2);
        this.f1183m = new c0(this);
        this.f1184n = new CopyOnWriteArrayList();
        this.f1185o = -1;
        this.f1190t = new f0(this);
        this.f1191u = new d0(this, 3);
        this.f1194y = new ArrayDeque();
        this.I = new w(3, this);
    }

    public static boolean G(int i3) {
        return Log.isLoggable("FragmentManager", i3);
    }

    public static boolean H(r rVar) {
        rVar.getClass();
        Iterator it = rVar.w.f1173c.e().iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            r rVar2 = (r) it.next();
            if (rVar2 != null) {
                z5 = H(rVar2);
                continue;
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(r rVar) {
        return rVar == null || (rVar.E && (rVar.f1271u == null || I(rVar.f1273x)));
    }

    public static boolean J(r rVar) {
        if (rVar != null) {
            l0 l0Var = rVar.f1271u;
            if (!rVar.equals(l0Var.f1189s) || !J(l0Var.f1188r)) {
                return false;
            }
        }
        return true;
    }

    public static void Y(r rVar) {
        if (G(2)) {
            Log.v("FragmentManager", "show: " + rVar);
        }
        if (rVar.B) {
            rVar.B = false;
            rVar.L = !rVar.L;
        }
    }

    public final r A(int i3) {
        s0 s0Var = this.f1173c;
        ArrayList arrayList = s0Var.f1282a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                r rVar = (r) arrayList.get(size);
                if (rVar != null && rVar.f1274y == i3) {
                    return rVar;
                }
            } else {
                for (r0 r0Var : s0Var.f1283b.values()) {
                    if (r0Var != null) {
                        r rVar2 = r0Var.f1278c;
                        if (rVar2.f1274y == i3) {
                            return rVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final r B(String str) {
        s0 s0Var = this.f1173c;
        ArrayList arrayList = s0Var.f1282a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                r rVar = (r) arrayList.get(size);
                if (rVar != null && str.equals(rVar.A)) {
                    return rVar;
                }
            } else {
                for (r0 r0Var : s0Var.f1283b.values()) {
                    if (r0Var != null) {
                        r rVar2 = r0Var.f1278c;
                        if (str.equals(rVar2.A)) {
                            return rVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final ViewGroup C(r rVar) {
        ViewGroup viewGroup = rVar.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rVar.f1275z > 0 && this.f1187q.k()) {
            View j6 = this.f1187q.j(rVar.f1275z);
            if (j6 instanceof ViewGroup) {
                return (ViewGroup) j6;
            }
        }
        return null;
    }

    public final f0 D() {
        r rVar = this.f1188r;
        return rVar != null ? rVar.f1271u.D() : this.f1190t;
    }

    public final d0 E() {
        r rVar = this.f1188r;
        return rVar != null ? rVar.f1271u.E() : this.f1191u;
    }

    public final void F(r rVar) {
        if (G(2)) {
            Log.v("FragmentManager", "hide: " + rVar);
        }
        if (!rVar.B) {
            rVar.B = true;
            rVar.L = true ^ rVar.L;
            X(rVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r1 != 5) goto L_0x01fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(int r20, androidx.fragment.app.r r21) {
        /*
            r19 = this;
            r0 = r19
            r7 = r21
            java.lang.String r1 = r7.f1258h
            androidx.fragment.app.s0 r2 = r0.f1173c
            java.util.HashMap r3 = r2.f1283b
            java.lang.Object r1 = r3.get(r1)
            androidx.fragment.app.r0 r1 = (androidx.fragment.app.r0) r1
            androidx.fragment.app.c0 r3 = r0.f1183m
            r8 = 1
            if (r1 != 0) goto L_0x001c
            androidx.fragment.app.r0 r1 = new androidx.fragment.app.r0
            r1.<init>(r3, r2, r7)
            r1.f1280e = r8
        L_0x001c:
            r9 = r1
            boolean r1 = r7.f1266p
            r10 = 2
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7.f1267q
            if (r1 == 0) goto L_0x0031
            int r1 = r7.f1254d
            if (r1 != r10) goto L_0x0031
            r1 = r20
            int r1 = java.lang.Math.max(r1, r10)
            goto L_0x0033
        L_0x0031:
            r1 = r20
        L_0x0033:
            int r2 = r9.d()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.f1254d
            r2 = 0
            java.util.Map r12 = r0.f1181k
            r13 = 3
            r4 = 0
            java.lang.String r14 = "FragmentManager"
            r5 = -1
            r6 = 5
            r15 = 4
            if (r1 > r11) goto L_0x00bb
            if (r1 >= r11) goto L_0x0086
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x0086
            java.lang.Object r1 = r12.get(r7)
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x0086
            java.util.Iterator r16 = r1.iterator()
        L_0x005d:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x006d
            java.lang.Object r17 = r16.next()
            t0.d r17 = (t0.d) r17
            r17.a()
            goto L_0x005d
        L_0x006d:
            r1.clear()
            r21.C()
            r3.o(r4)
            r7.G = r2
            r7.H = r2
            r7.Q = r2
            androidx.lifecycle.y r1 = r7.R
            r1.e(r2)
            r7.f1267q = r4
            r12.remove(r7)
        L_0x0086:
            int r1 = r7.f1254d
            if (r1 == r5) goto L_0x0096
            if (r1 == 0) goto L_0x009b
            if (r1 == r8) goto L_0x00a0
            if (r1 == r10) goto L_0x00aa
            if (r1 == r15) goto L_0x00af
            if (r1 == r6) goto L_0x00b4
            goto L_0x01fa
        L_0x0096:
            if (r11 <= r5) goto L_0x009b
            r9.c()
        L_0x009b:
            if (r11 <= 0) goto L_0x00a0
            r9.e()
        L_0x00a0:
            if (r11 <= r5) goto L_0x00a5
            r9.j()
        L_0x00a5:
            if (r11 <= r8) goto L_0x00aa
            r9.f()
        L_0x00aa:
            if (r11 <= r10) goto L_0x00af
            r9.a()
        L_0x00af:
            if (r11 <= r15) goto L_0x00b4
            r9.p()
        L_0x00b4:
            if (r11 <= r6) goto L_0x01fa
            r9.n()
            goto L_0x01fa
        L_0x00bb:
            if (r1 <= r11) goto L_0x01fa
            if (r1 == 0) goto L_0x01f3
            if (r1 == r8) goto L_0x01e5
            if (r1 == r10) goto L_0x0105
            if (r1 == r15) goto L_0x00d6
            if (r1 == r6) goto L_0x00d1
            r3 = 7
            if (r1 == r3) goto L_0x00cc
            goto L_0x01fa
        L_0x00cc:
            if (r11 >= r3) goto L_0x00d1
            r9.l()
        L_0x00d1:
            if (r11 >= r6) goto L_0x00d6
            r9.q()
        L_0x00d6:
            if (r11 >= r15) goto L_0x0105
            boolean r1 = G(r13)
            if (r1 == 0) goto L_0x00ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r14, r1)
        L_0x00ef:
            android.view.View r1 = r7.H
            if (r1 == 0) goto L_0x0105
            androidx.fragment.app.u r1 = r0.f1186p
            androidx.fragment.app.v r1 = r1.f1298u
            boolean r1 = r1.isFinishing()
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x0105
            android.util.SparseArray r1 = r7.f1256f
            if (r1 != 0) goto L_0x0105
            r9.o()
        L_0x0105:
            if (r11 >= r10) goto L_0x01e5
            android.view.View r1 = r7.H
            if (r1 == 0) goto L_0x01da
            android.view.ViewGroup r3 = r7.G
            if (r3 == 0) goto L_0x01da
            r3.endViewTransition(r1)
            android.view.View r1 = r7.H
            r1.clearAnimation()
            boolean r1 = r21.o()
            if (r1 != 0) goto L_0x01da
            int r1 = r0.f1185o
            r3 = 0
            if (r1 <= r5) goto L_0x0144
            boolean r1 = r0.C
            if (r1 != 0) goto L_0x0144
            android.view.View r1 = r7.H
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0144
            float r1 = r7.M
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0144
            androidx.fragment.app.u r1 = r0.f1186p
            android.content.Context r1 = r1.f1295r
            androidx.fragment.app.p r2 = r7.K
            if (r2 != 0) goto L_0x013e
            r2 = r4
            goto L_0x0140
        L_0x013e:
            boolean r2 = r2.f1228c
        L_0x0140:
            androidx.fragment.app.y r2 = h5.d.h(r1, r7, r4, r2)
        L_0x0144:
            r7.M = r3
            android.view.ViewGroup r15 = r7.G
            android.view.View r6 = r7.H
            if (r2 == 0) goto L_0x01a9
            r15.startViewTransition(r6)
            t0.d r5 = new t0.d
            r5.<init>()
            androidx.fragment.app.l r1 = new androidx.fragment.app.l
            r1.<init>(r8, r7)
            r5.b(r1)
            androidx.fragment.app.d0 r4 = r0.f1182l
            r4.d(r7, r5)
            android.view.animation.Animation r1 = r2.f1320a
            if (r1 == 0) goto L_0x0180
            androidx.fragment.app.z r2 = new androidx.fragment.app.z
            r2.<init>(r1, r15, r6)
            android.view.View r1 = r7.H
            androidx.fragment.app.p r3 = r21.f()
            r3.f1226a = r1
            androidx.fragment.app.d r1 = new androidx.fragment.app.d
            r1.<init>((android.view.ViewGroup) r15, (androidx.fragment.app.r) r7, (androidx.fragment.app.d0) r4, (t0.d) r5)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.H
            r1.startAnimation(r2)
            goto L_0x01a9
        L_0x0180:
            androidx.fragment.app.p r1 = r21.f()
            android.animation.Animator r3 = r2.f1321b
            r1.f1227b = r3
            androidx.fragment.app.x r2 = new androidx.fragment.app.x
            r1 = r2
            r13 = r2
            r2 = r15
            r8 = r3
            r3 = r6
            r17 = r4
            r4 = r21
            r18 = r5
            r5 = r17
            r10 = r6
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addListener(r13)
            android.view.View r1 = r7.H
            r8.setTarget(r1)
            r8.start()
            goto L_0x01aa
        L_0x01a9:
            r10 = r6
        L_0x01aa:
            r15.removeView(r10)
            r1 = 2
            boolean r1 = G(r1)
            if (r1 == 0) goto L_0x01d5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Removing view "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r14, r1)
        L_0x01d5:
            android.view.ViewGroup r1 = r7.G
            if (r15 == r1) goto L_0x01da
            goto L_0x022a
        L_0x01da:
            java.lang.Object r1 = r12.get(r7)
            if (r1 != 0) goto L_0x01e3
            r9.h()
        L_0x01e3:
            r1 = 1
            goto L_0x01e6
        L_0x01e5:
            r1 = r8
        L_0x01e6:
            if (r11 >= r1) goto L_0x01f3
            java.lang.Object r2 = r12.get(r7)
            if (r2 == 0) goto L_0x01f0
            r8 = r1
            goto L_0x01f4
        L_0x01f0:
            r9.g()
        L_0x01f3:
            r8 = r11
        L_0x01f4:
            if (r8 >= 0) goto L_0x01f9
            r9.i()
        L_0x01f9:
            r11 = r8
        L_0x01fa:
            int r1 = r7.f1254d
            if (r1 == r11) goto L_0x022a
            r1 = 3
            boolean r1 = G(r1)
            if (r1 == 0) goto L_0x0228
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f1254d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r14, r1)
        L_0x0228:
            r7.f1254d = r11
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.K(int, androidx.fragment.app.r):void");
    }

    public final void L(int i3, boolean z5) {
        HashMap hashMap;
        u uVar;
        if (this.f1186p == null && i3 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z5 || i3 != this.f1185o) {
            this.f1185o = i3;
            s0 s0Var = this.f1173c;
            Iterator it = s0Var.f1282a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = s0Var.f1283b;
                if (!hasNext) {
                    break;
                }
                r0 r0Var = (r0) hashMap.get(((r) it.next()).f1258h);
                if (r0Var != null) {
                    r0Var.k();
                }
            }
            Iterator it2 = hashMap.values().iterator();
            while (true) {
                boolean z6 = false;
                if (!it2.hasNext()) {
                    break;
                }
                r0 r0Var2 = (r0) it2.next();
                if (r0Var2 != null) {
                    r0Var2.k();
                    r rVar = r0Var2.f1278c;
                    if (rVar.f1265o) {
                        if (!(rVar.f1270t > 0)) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        s0Var.h(r0Var2);
                    }
                }
            }
            Z();
            if (this.f1195z && (uVar = this.f1186p) != null && this.f1185o == 7) {
                ((e.l) uVar.f1298u).m().e();
                this.f1195z = false;
            }
        }
    }

    public final void M() {
        if (this.f1186p != null) {
            this.A = false;
            this.B = false;
            this.H.f1225h = false;
            for (r rVar : this.f1173c.f()) {
                if (rVar != null) {
                    rVar.w.M();
                }
            }
        }
    }

    public final boolean N() {
        w(false);
        v(true);
        r rVar = this.f1189s;
        if (rVar != null && rVar.g().N()) {
            return true;
        }
        boolean O = O(this.E, this.F, (String) null, -1, 0);
        if (O) {
            this.f1172b = true;
            try {
                Q(this.E, this.F);
            } finally {
                d();
            }
        }
        b0();
        if (this.D) {
            this.D = false;
            Z();
        }
        this.f1173c.f1283b.values().removeAll(Collections.singleton((Object) null));
        return O;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, String str, int i3, int i6) {
        ArrayList arrayList3 = this.f1174d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i3 < 0 && (i6 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1174d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i7 = -1;
            if (str != null || i3 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f1174d.get(size2);
                    if ((str != null && str.equals(aVar.f1074h)) || (i3 >= 0 && i3 == aVar.f1084r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i6 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = (a) this.f1174d.get(size2);
                        if ((str == null || !str.equals(aVar2.f1074h)) && (i3 < 0 || i3 != aVar2.f1084r)) {
                            break;
                        }
                    }
                }
                i7 = size2;
            }
            if (i7 == this.f1174d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1174d.size() - 1; size3 > i7; size3--) {
                arrayList.add(this.f1174d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void P(r rVar) {
        if (G(2)) {
            Log.v("FragmentManager", "remove: " + rVar + " nesting=" + rVar.f1270t);
        }
        boolean z5 = !(rVar.f1270t > 0);
        if (!rVar.C || z5) {
            s0 s0Var = this.f1173c;
            synchronized (s0Var.f1282a) {
                s0Var.f1282a.remove(rVar);
            }
            rVar.f1264n = false;
            if (H(rVar)) {
                this.f1195z = true;
            }
            rVar.f1265o = true;
            X(rVar);
        }
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                y(arrayList, arrayList2);
                int size = arrayList.size();
                int i3 = 0;
                int i6 = 0;
                while (i3 < size) {
                    if (!((a) arrayList.get(i3)).f1081o) {
                        if (i6 != i3) {
                            x(arrayList, arrayList2, i6, i3);
                        }
                        i6 = i3 + 1;
                        if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                            while (i6 < size && ((Boolean) arrayList2.get(i6)).booleanValue() && !((a) arrayList.get(i6)).f1081o) {
                                i6++;
                            }
                        }
                        x(arrayList, arrayList2, i3, i6);
                        i3 = i6 - 1;
                    }
                    i3++;
                }
                if (i6 != size) {
                    x(arrayList, arrayList2, i6, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void R(Parcelable parcelable) {
        c0 c0Var;
        int i3;
        r0 r0Var;
        if (parcelable != null) {
            m0 m0Var = (m0) parcelable;
            if (m0Var.f1198d != null) {
                s0 s0Var = this.f1173c;
                s0Var.f1283b.clear();
                Iterator it = m0Var.f1198d.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    c0Var = this.f1183m;
                    if (!hasNext) {
                        break;
                    }
                    q0 q0Var = (q0) it.next();
                    if (q0Var != null) {
                        r rVar = (r) this.H.f1220c.get(q0Var.f1242e);
                        if (rVar != null) {
                            if (G(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + rVar);
                            }
                            r0Var = new r0(c0Var, s0Var, rVar, q0Var);
                        } else {
                            r0Var = new r0(this.f1183m, this.f1173c, this.f1186p.f1295r.getClassLoader(), D(), q0Var);
                        }
                        r rVar2 = r0Var.f1278c;
                        rVar2.f1271u = this;
                        if (G(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + rVar2.f1258h + "): " + rVar2);
                        }
                        r0Var.m(this.f1186p.f1295r.getClassLoader());
                        s0Var.g(r0Var);
                        r0Var.f1280e = this.f1185o;
                    }
                }
                o0 o0Var = this.H;
                o0Var.getClass();
                Iterator it2 = new ArrayList(o0Var.f1220c.values()).iterator();
                while (true) {
                    i3 = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    r rVar3 = (r) it2.next();
                    if (s0Var.f1283b.get(rVar3.f1258h) != null) {
                        i3 = 1;
                    }
                    if (i3 == 0) {
                        if (G(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + rVar3 + " that was not found in the set of active Fragments " + m0Var.f1198d);
                        }
                        this.H.b(rVar3);
                        rVar3.f1271u = this;
                        r0 r0Var2 = new r0(c0Var, s0Var, rVar3);
                        r0Var2.f1280e = 1;
                        r0Var2.k();
                        rVar3.f1265o = true;
                        r0Var2.k();
                    }
                }
                ArrayList<String> arrayList = m0Var.f1199e;
                s0Var.f1282a.clear();
                if (arrayList != null) {
                    for (String str : arrayList) {
                        r b6 = s0Var.b(str);
                        if (b6 != null) {
                            if (G(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + b6);
                            }
                            s0Var.a(b6);
                        } else {
                            throw new IllegalStateException(m.i("No instantiated fragment for (", str, ")"));
                        }
                    }
                }
                if (m0Var.f1200f != null) {
                    this.f1174d = new ArrayList(m0Var.f1200f.length);
                    int i6 = 0;
                    while (true) {
                        b[] bVarArr = m0Var.f1200f;
                        if (i6 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i6];
                        bVar.getClass();
                        a aVar = new a(this);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            int[] iArr = bVar.f1088d;
                            if (i7 >= iArr.length) {
                                break;
                            }
                            t0 t0Var = new t0();
                            int i9 = i7 + 1;
                            t0Var.f1286a = iArr[i7];
                            if (G(2)) {
                                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i8 + " base fragment #" + iArr[i9]);
                            }
                            String str2 = (String) bVar.f1089e.get(i8);
                            t0Var.f1287b = str2 != null ? z(str2) : null;
                            t0Var.f1292g = androidx.lifecycle.m.values()[bVar.f1090f[i8]];
                            t0Var.f1293h = androidx.lifecycle.m.values()[bVar.f1091g[i8]];
                            int i10 = i9 + 1;
                            int i11 = iArr[i9];
                            t0Var.f1288c = i11;
                            int i12 = i10 + 1;
                            int i13 = iArr[i10];
                            t0Var.f1289d = i13;
                            int i14 = i12 + 1;
                            int i15 = iArr[i12];
                            t0Var.f1290e = i15;
                            int i16 = iArr[i14];
                            t0Var.f1291f = i16;
                            aVar.f1068b = i11;
                            aVar.f1069c = i13;
                            aVar.f1070d = i15;
                            aVar.f1071e = i16;
                            aVar.b(t0Var);
                            i8++;
                            i7 = i14 + 1;
                        }
                        aVar.f1072f = bVar.f1092h;
                        aVar.f1074h = bVar.f1093i;
                        aVar.f1084r = bVar.f1094j;
                        aVar.f1073g = true;
                        aVar.f1075i = bVar.f1095k;
                        aVar.f1076j = bVar.f1096l;
                        aVar.f1077k = bVar.f1097m;
                        aVar.f1078l = bVar.f1098n;
                        aVar.f1079m = bVar.f1099o;
                        aVar.f1080n = bVar.f1100p;
                        aVar.f1081o = bVar.f1101q;
                        aVar.c(1);
                        if (G(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + aVar.f1084r + "): " + aVar);
                            PrintWriter printWriter = new PrintWriter(new e1());
                            aVar.f("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1174d.add(aVar);
                        i6++;
                    }
                } else {
                    this.f1174d = null;
                }
                this.f1179i.set(m0Var.f1201g);
                String str3 = m0Var.f1202h;
                if (str3 != null) {
                    r z5 = z(str3);
                    this.f1189s = z5;
                    p(z5);
                }
                ArrayList arrayList2 = m0Var.f1203i;
                if (arrayList2 != null) {
                    while (i3 < arrayList2.size()) {
                        Bundle bundle = (Bundle) m0Var.f1204j.get(i3);
                        bundle.setClassLoader(this.f1186p.f1295r.getClassLoader());
                        this.f1180j.put(arrayList2.get(i3), bundle);
                        i3++;
                    }
                }
                this.f1194y = new ArrayDeque(m0Var.f1205k);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: androidx.fragment.app.b[]} */
    /* JADX WARNING: type inference failed for: r4v14, types: [android.os.BaseBundle] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.m0 S() {
        /*
            r11 = this;
            java.util.HashSet r0 = r11.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.h1 r1 = (androidx.fragment.app.h1) r1
            boolean r3 = r1.f1161e
            if (r3 == 0) goto L_0x0008
            r1.f1161e = r2
            r1.c()
            goto L_0x0008
        L_0x001f:
            java.util.HashSet r0 = r11.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.h1 r1 = (androidx.fragment.app.h1) r1
            r1.e()
            goto L_0x0027
        L_0x0037:
            r0 = 1
            r11.w(r0)
            r11.A = r0
            androidx.fragment.app.o0 r1 = r11.H
            r1.f1225h = r0
            androidx.fragment.app.s0 r0 = r11.f1173c
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap r0 = r0.f1283b
            int r3 = r0.size()
            r1.<init>(r3)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0059:
            boolean r3 = r0.hasNext()
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L_0x0130
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.r0 r3 = (androidx.fragment.app.r0) r3
            if (r3 == 0) goto L_0x0059
            androidx.fragment.app.q0 r6 = new androidx.fragment.app.q0
            androidx.fragment.app.r r7 = r3.f1278c
            r6.<init>((androidx.fragment.app.r) r7)
            int r8 = r7.f1254d
            r9 = -1
            if (r8 <= r9) goto L_0x0104
            android.os.Bundle r8 = r6.f1253p
            if (r8 != 0) goto L_0x0104
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r7.x(r8)
            q1.e r9 = r7.S
            r9.c(r8)
            androidx.fragment.app.l0 r9 = r7.w
            androidx.fragment.app.m0 r9 = r9.S()
            if (r9 == 0) goto L_0x0093
            java.lang.String r10 = "android:support:fragments"
            r8.putParcelable(r10, r9)
        L_0x0093:
            androidx.fragment.app.c0 r9 = r3.f1276a
            r9.k(r2)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r4 = r8
        L_0x00a0:
            android.view.View r8 = r7.H
            if (r8 == 0) goto L_0x00a7
            r3.o()
        L_0x00a7:
            android.util.SparseArray r3 = r7.f1256f
            if (r3 == 0) goto L_0x00ba
            if (r4 != 0) goto L_0x00b3
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x00b3:
            java.lang.String r3 = "android:view_state"
            android.util.SparseArray r8 = r7.f1256f
            r4.putSparseParcelableArray(r3, r8)
        L_0x00ba:
            android.os.Bundle r3 = r7.f1257g
            if (r3 == 0) goto L_0x00cd
            if (r4 != 0) goto L_0x00c6
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x00c6:
            java.lang.String r3 = "android:view_registry_state"
            android.os.Bundle r8 = r7.f1257g
            r4.putBundle(r3, r8)
        L_0x00cd:
            boolean r3 = r7.J
            if (r3 != 0) goto L_0x00e0
            if (r4 != 0) goto L_0x00d9
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x00d9:
            java.lang.String r3 = "android:user_visible_hint"
            boolean r8 = r7.J
            r4.putBoolean(r3, r8)
        L_0x00e0:
            r6.f1253p = r4
            java.lang.String r3 = r7.f1261k
            if (r3 == 0) goto L_0x0108
            if (r4 != 0) goto L_0x00ef
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r6.f1253p = r3
        L_0x00ef:
            android.os.Bundle r3 = r6.f1253p
            java.lang.String r4 = "android:target_state"
            java.lang.String r8 = r7.f1261k
            r3.putString(r4, r8)
            int r3 = r7.f1262l
            if (r3 == 0) goto L_0x0108
            android.os.Bundle r4 = r6.f1253p
            java.lang.String r8 = "android:target_req_state"
            r4.putInt(r8, r3)
            goto L_0x0108
        L_0x0104:
            android.os.Bundle r3 = r7.f1255e
            r6.f1253p = r3
        L_0x0108:
            r1.add(r6)
            boolean r3 = G(r5)
            if (r3 == 0) goto L_0x0059
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Saved state of "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = ": "
            r3.append(r4)
            android.os.Bundle r4 = r6.f1253p
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
            goto L_0x0059
        L_0x0130:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0145
            boolean r0 = G(r5)
            if (r0 == 0) goto L_0x0221
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r0, r1)
            goto L_0x0221
        L_0x0145:
            androidx.fragment.app.s0 r0 = r11.f1173c
            java.util.ArrayList r3 = r0.f1282a
            monitor-enter(r3)
            java.util.ArrayList r6 = r0.f1282a     // Catch:{ all -> 0x0222 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0222 }
            if (r6 == 0) goto L_0x0155
            monitor-exit(r3)     // Catch:{ all -> 0x0222 }
            r6 = r4
            goto L_0x019f
        L_0x0155:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0222 }
            java.util.ArrayList r7 = r0.f1282a     // Catch:{ all -> 0x0222 }
            int r7 = r7.size()     // Catch:{ all -> 0x0222 }
            r6.<init>(r7)     // Catch:{ all -> 0x0222 }
            java.util.ArrayList r0 = r0.f1282a     // Catch:{ all -> 0x0222 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0222 }
        L_0x0166:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0222 }
            if (r7 == 0) goto L_0x019e
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0222 }
            androidx.fragment.app.r r7 = (androidx.fragment.app.r) r7     // Catch:{ all -> 0x0222 }
            java.lang.String r8 = r7.f1258h     // Catch:{ all -> 0x0222 }
            r6.add(r8)     // Catch:{ all -> 0x0222 }
            boolean r8 = G(r5)     // Catch:{ all -> 0x0222 }
            if (r8 == 0) goto L_0x0166
            java.lang.String r8 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0222 }
            r9.<init>()     // Catch:{ all -> 0x0222 }
            java.lang.String r10 = "saveAllState: adding fragment ("
            r9.append(r10)     // Catch:{ all -> 0x0222 }
            java.lang.String r10 = r7.f1258h     // Catch:{ all -> 0x0222 }
            r9.append(r10)     // Catch:{ all -> 0x0222 }
            java.lang.String r10 = "): "
            r9.append(r10)     // Catch:{ all -> 0x0222 }
            r9.append(r7)     // Catch:{ all -> 0x0222 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0222 }
            android.util.Log.v(r8, r7)     // Catch:{ all -> 0x0222 }
            goto L_0x0166
        L_0x019e:
            monitor-exit(r3)     // Catch:{ all -> 0x0222 }
        L_0x019f:
            java.util.ArrayList r0 = r11.f1174d
            if (r0 == 0) goto L_0x01e6
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01e6
            androidx.fragment.app.b[] r4 = new androidx.fragment.app.b[r0]
        L_0x01ab:
            if (r2 >= r0) goto L_0x01e6
            androidx.fragment.app.b r3 = new androidx.fragment.app.b
            java.util.ArrayList r7 = r11.f1174d
            java.lang.Object r7 = r7.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            r3.<init>((androidx.fragment.app.a) r7)
            r4[r2] = r3
            boolean r3 = G(r5)
            if (r3 == 0) goto L_0x01e3
            java.lang.String r3 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "saveAllState: adding back stack #"
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r8 = ": "
            r7.append(r8)
            java.util.ArrayList r8 = r11.f1174d
            java.lang.Object r8 = r8.get(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r3, r7)
        L_0x01e3:
            int r2 = r2 + 1
            goto L_0x01ab
        L_0x01e6:
            androidx.fragment.app.m0 r0 = new androidx.fragment.app.m0
            r0.<init>()
            r0.f1198d = r1
            r0.f1199e = r6
            r0.f1200f = r4
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f1179i
            int r1 = r1.get()
            r0.f1201g = r1
            androidx.fragment.app.r r1 = r11.f1189s
            if (r1 == 0) goto L_0x0201
            java.lang.String r1 = r1.f1258h
            r0.f1202h = r1
        L_0x0201:
            java.util.ArrayList r1 = r0.f1203i
            java.util.Map r2 = r11.f1180j
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.ArrayList r1 = r0.f1204j
            java.util.Map r2 = r11.f1180j
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque r2 = r11.f1194y
            r1.<init>(r2)
            r0.f1205k = r1
            r4 = r0
        L_0x0221:
            return r4
        L_0x0222:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0222 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.S():androidx.fragment.app.m0");
    }

    public final void T() {
        synchronized (this.f1171a) {
            boolean z5 = true;
            if (this.f1171a.size() != 1) {
                z5 = false;
            }
            if (z5) {
                this.f1186p.f1296s.removeCallbacks(this.I);
                this.f1186p.f1296s.post(this.I);
                b0();
            }
        }
    }

    public final void U(r rVar, boolean z5) {
        ViewGroup C2 = C(rVar);
        if (C2 != null && (C2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) C2).setDrawDisappearingViewsLast(!z5);
        }
    }

    public final void V(r rVar, androidx.lifecycle.m mVar) {
        if (!rVar.equals(z(rVar.f1258h)) || !(rVar.f1272v == null || rVar.f1271u == this)) {
            throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
        }
        rVar.O = mVar;
    }

    public final void W(r rVar) {
        if (rVar == null || (rVar.equals(z(rVar.f1258h)) && (rVar.f1272v == null || rVar.f1271u == this))) {
            r rVar2 = this.f1189s;
            this.f1189s = rVar;
            p(rVar2);
            p(this.f1189s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void X(r rVar) {
        ViewGroup C2 = C(rVar);
        if (C2 != null) {
            p pVar = rVar.K;
            boolean z5 = false;
            if ((pVar == null ? 0 : pVar.f1232g) + (pVar == null ? 0 : pVar.f1231f) + (pVar == null ? 0 : pVar.f1230e) + (pVar == null ? 0 : pVar.f1229d) > 0) {
                if (C2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C2.setTag(R.id.visible_removing_fragment_view_tag, rVar);
                }
                r rVar2 = (r) C2.getTag(R.id.visible_removing_fragment_view_tag);
                p pVar2 = rVar.K;
                if (pVar2 != null) {
                    z5 = pVar2.f1228c;
                }
                if (rVar2.K != null) {
                    rVar2.f().f1228c = z5;
                }
            }
        }
    }

    public final void Z() {
        Iterator it = this.f1173c.d().iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            r rVar = r0Var.f1278c;
            if (rVar.I) {
                if (this.f1172b) {
                    this.D = true;
                } else {
                    rVar.I = false;
                    r0Var.k();
                }
            }
        }
    }

    public final r0 a(r rVar) {
        if (G(2)) {
            Log.v("FragmentManager", "add: " + rVar);
        }
        r0 f6 = f(rVar);
        rVar.f1271u = this;
        s0 s0Var = this.f1173c;
        s0Var.g(f6);
        if (!rVar.C) {
            s0Var.a(rVar);
            rVar.f1265o = false;
            if (rVar.H == null) {
                rVar.L = false;
            }
            if (H(rVar)) {
                this.f1195z = true;
            }
        }
        return f6;
    }

    /* renamed from: a0 */
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        r rVar = this.f1188r;
        if (rVar != null) {
            sb.append(rVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1188r;
        } else {
            u uVar = this.f1186p;
            if (uVar != null) {
                sb.append(uVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f1186p;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.fragment.app.r] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.u r6, h5.l r7, androidx.fragment.app.r r8) {
        /*
            r5 = this;
            androidx.fragment.app.u r0 = r5.f1186p
            if (r0 != 0) goto L_0x00fd
            r5.f1186p = r6
            r5.f1187q = r7
            r5.f1188r = r8
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.f1184n
            if (r8 == 0) goto L_0x0017
            androidx.fragment.app.g0 r0 = new androidx.fragment.app.g0
            r0.<init>(r8)
            r7.add(r0)
            goto L_0x001e
        L_0x0017:
            boolean r0 = r6 instanceof androidx.fragment.app.p0
            if (r0 == 0) goto L_0x001e
            r7.add(r6)
        L_0x001e:
            androidx.fragment.app.r r7 = r5.f1188r
            if (r7 == 0) goto L_0x0025
            r5.b0()
        L_0x0025:
            boolean r7 = r6 instanceof androidx.activity.z
            if (r7 == 0) goto L_0x0039
            androidx.activity.y r7 = r6.x()
            r5.f1177g = r7
            if (r8 == 0) goto L_0x0033
            r0 = r8
            goto L_0x0034
        L_0x0033:
            r0 = r6
        L_0x0034:
            androidx.fragment.app.e0 r1 = r5.f1178h
            r7.a(r0, r1)
        L_0x0039:
            r7 = 0
            if (r8 == 0) goto L_0x005b
            androidx.fragment.app.l0 r6 = r8.f1271u
            androidx.fragment.app.o0 r6 = r6.H
            java.util.HashMap r0 = r6.f1221d
            java.lang.String r1 = r8.f1258h
            java.lang.Object r1 = r0.get(r1)
            androidx.fragment.app.o0 r1 = (androidx.fragment.app.o0) r1
            if (r1 != 0) goto L_0x0058
            androidx.fragment.app.o0 r1 = new androidx.fragment.app.o0
            boolean r6 = r6.f1223f
            r1.<init>(r6)
            java.lang.String r6 = r8.f1258h
            r0.put(r6, r1)
        L_0x0058:
            r5.H = r1
            goto L_0x007a
        L_0x005b:
            boolean r0 = r6 instanceof androidx.lifecycle.n0
            if (r0 == 0) goto L_0x0073
            androidx.lifecycle.m0 r6 = r6.e()
            androidx.activity.result.c r0 = new androidx.activity.result.c
            androidx.fragment.app.n0 r1 = androidx.fragment.app.o0.f1219i
            r0.<init>((androidx.lifecycle.m0) r6, (androidx.fragment.app.n0) r1, (int) r7)
            java.lang.Class<androidx.fragment.app.o0> r6 = androidx.fragment.app.o0.class
            androidx.lifecycle.k0 r6 = r0.d(r6)
            androidx.fragment.app.o0 r6 = (androidx.fragment.app.o0) r6
            goto L_0x0078
        L_0x0073:
            androidx.fragment.app.o0 r6 = new androidx.fragment.app.o0
            r6.<init>(r7)
        L_0x0078:
            r5.H = r6
        L_0x007a:
            androidx.fragment.app.o0 r6 = r5.H
            boolean r0 = r5.A
            r1 = 1
            if (r0 != 0) goto L_0x0088
            boolean r0 = r5.B
            if (r0 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r0 = r7
            goto L_0x0089
        L_0x0088:
            r0 = r1
        L_0x0089:
            r6.f1225h = r0
            androidx.fragment.app.s0 r0 = r5.f1173c
            r0.f1284c = r6
            androidx.fragment.app.u r6 = r5.f1186p
            boolean r0 = r6 instanceof androidx.activity.result.e
            if (r0 == 0) goto L_0x00fc
            androidx.fragment.app.v r6 = r6.f1298u
            androidx.activity.h r6 = r6.f307m
            if (r8 == 0) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = r8.f1258h
            java.lang.String r2 = ":"
            java.lang.String r8 = a2.m.j(r0, r8, r2)
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r8 = ""
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FragmentManager:"
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = a2.m.h(r8, r0)
            c.b r2 = new c.b
            r2.<init>()
            androidx.fragment.app.d0 r3 = new androidx.fragment.app.d0
            r4 = 4
            r3.<init>(r5, r4)
            androidx.activity.result.c r0 = r6.b(r0, r2, r3)
            r5.f1192v = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = a2.m.h(r8, r0)
            androidx.fragment.app.h0 r2 = new androidx.fragment.app.h0
            r2.<init>()
            androidx.fragment.app.d0 r3 = new androidx.fragment.app.d0
            r3.<init>(r5, r7)
            androidx.activity.result.c r7 = r6.b(r0, r2, r3)
            r5.w = r7
            java.lang.String r7 = "RequestPermissions"
            java.lang.String r7 = a2.m.h(r8, r7)
            c.a r8 = new c.a
            r8.<init>()
            androidx.fragment.app.d0 r0 = new androidx.fragment.app.d0
            r0.<init>(r5, r1)
            androidx.activity.result.c r6 = r6.b(r7, r8, r0)
            r5.f1193x = r6
        L_0x00fc:
            return
        L_0x00fd:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Already attached"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.b(androidx.fragment.app.u, h5.l, androidx.fragment.app.r):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = r4.f1178h;
        r1 = r4.f1174d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r1 <= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (J(r4.f1188r) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r0.f1128a = r2;
        r0 = r0.f1130c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f1171a
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.f1171a     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            r2 = 1
            if (r1 != 0) goto L_0x001c
            androidx.fragment.app.e0 r1 = r4.f1178h     // Catch:{ all -> 0x0018 }
            r1.f1128a = r2     // Catch:{ all -> 0x0018 }
            o4.a r1 = r1.f1130c     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            r1.a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r1 = move-exception
            goto L_0x0040
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            goto L_0x003f
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            androidx.fragment.app.e0 r0 = r4.f1178h
            java.util.ArrayList r1 = r4.f1174d
            r3 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r1.size()
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            if (r1 <= 0) goto L_0x0035
            androidx.fragment.app.r r1 = r4.f1188r
            boolean r1 = J(r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            r0.f1128a = r2
            o4.a r0 = r0.f1130c
            if (r0 == 0) goto L_0x003f
            r0.a()
        L_0x003f:
            return
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.b0():void");
    }

    public final void c(r rVar) {
        if (G(2)) {
            Log.v("FragmentManager", "attach: " + rVar);
        }
        if (rVar.C) {
            rVar.C = false;
            if (!rVar.f1264n) {
                this.f1173c.a(rVar);
                if (G(2)) {
                    Log.v("FragmentManager", "add from attach: " + rVar);
                }
                if (H(rVar)) {
                    this.f1195z = true;
                }
            }
        }
    }

    public final void d() {
        this.f1172b = false;
        this.F.clear();
        this.E.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1173c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((r0) it.next()).f1278c.G;
            if (viewGroup != null) {
                hashSet.add(h1.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final r0 f(r rVar) {
        String str = rVar.f1258h;
        s0 s0Var = this.f1173c;
        r0 r0Var = (r0) s0Var.f1283b.get(str);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this.f1183m, s0Var, rVar);
        r0Var2.m(this.f1186p.f1295r.getClassLoader());
        r0Var2.f1280e = this.f1185o;
        return r0Var2;
    }

    public final void g(r rVar) {
        if (G(2)) {
            Log.v("FragmentManager", "detach: " + rVar);
        }
        if (!rVar.C) {
            rVar.C = true;
            if (rVar.f1264n) {
                if (G(2)) {
                    Log.v("FragmentManager", "remove from detach: " + rVar);
                }
                s0 s0Var = this.f1173c;
                synchronized (s0Var.f1282a) {
                    s0Var.f1282a.remove(rVar);
                }
                rVar.f1264n = false;
                if (H(rVar)) {
                    this.f1195z = true;
                }
                X(rVar);
            }
        }
    }

    public final void h(Configuration configuration) {
        for (r rVar : this.f1173c.f()) {
            if (rVar != null) {
                rVar.onConfigurationChanged(configuration);
                rVar.w.h(configuration);
            }
        }
    }

    public final boolean i() {
        if (this.f1185o < 1) {
            return false;
        }
        for (r rVar : this.f1173c.f()) {
            if (rVar != null) {
                if (!rVar.B ? rVar.w.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1185o < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (r rVar : this.f1173c.f()) {
            if (rVar != null && I(rVar)) {
                if (!rVar.B ? rVar.w.j() | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rVar);
                    z5 = true;
                }
            }
        }
        if (this.f1175e != null) {
            for (int i3 = 0; i3 < this.f1175e.size(); i3++) {
                r rVar2 = (r) this.f1175e.get(i3);
                if (arrayList == null || !arrayList.contains(rVar2)) {
                    rVar2.getClass();
                }
            }
        }
        this.f1175e = arrayList;
        return z5;
    }

    public final void k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.C = true;
        w(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((h1) it.next()).e();
        }
        s(-1);
        this.f1186p = null;
        this.f1187q = null;
        this.f1188r = null;
        if (this.f1177g != null) {
            Iterator it2 = this.f1178h.f1129b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.c) it2.next()).cancel();
            }
            this.f1177g = null;
        }
        c cVar = this.f1192v;
        if (cVar != null) {
            h hVar = (h) cVar.f329g;
            String str = (String) cVar.f327e;
            if (!hVar.f288d.contains(str) && (num3 = (Integer) hVar.f286b.remove(str)) != null) {
                hVar.f285a.remove(num3);
            }
            hVar.f289e.remove(str);
            HashMap hashMap = hVar.f290f;
            if (hashMap.containsKey(str)) {
                StringBuilder k6 = m.k("Dropping pending result for request ", str, ": ");
                k6.append(hashMap.get(str));
                Log.w("ActivityResultRegistry", k6.toString());
                hashMap.remove(str);
            }
            Bundle bundle = hVar.f291g;
            if (bundle.containsKey(str)) {
                StringBuilder k7 = m.k("Dropping pending result for request ", str, ": ");
                k7.append(bundle.getParcelable(str));
                Log.w("ActivityResultRegistry", k7.toString());
                bundle.remove(str);
            }
            m.o(hVar.f287c.get(str));
            c cVar2 = this.w;
            h hVar2 = (h) cVar2.f329g;
            String str2 = (String) cVar2.f327e;
            if (!hVar2.f288d.contains(str2) && (num2 = (Integer) hVar2.f286b.remove(str2)) != null) {
                hVar2.f285a.remove(num2);
            }
            hVar2.f289e.remove(str2);
            HashMap hashMap2 = hVar2.f290f;
            if (hashMap2.containsKey(str2)) {
                StringBuilder k8 = m.k("Dropping pending result for request ", str2, ": ");
                k8.append(hashMap2.get(str2));
                Log.w("ActivityResultRegistry", k8.toString());
                hashMap2.remove(str2);
            }
            Bundle bundle2 = hVar2.f291g;
            if (bundle2.containsKey(str2)) {
                StringBuilder k9 = m.k("Dropping pending result for request ", str2, ": ");
                k9.append(bundle2.getParcelable(str2));
                Log.w("ActivityResultRegistry", k9.toString());
                bundle2.remove(str2);
            }
            m.o(hVar2.f287c.get(str2));
            c cVar3 = this.f1193x;
            h hVar3 = (h) cVar3.f329g;
            String str3 = (String) cVar3.f327e;
            if (!hVar3.f288d.contains(str3) && (num = (Integer) hVar3.f286b.remove(str3)) != null) {
                hVar3.f285a.remove(num);
            }
            hVar3.f289e.remove(str3);
            HashMap hashMap3 = hVar3.f290f;
            if (hashMap3.containsKey(str3)) {
                StringBuilder k10 = m.k("Dropping pending result for request ", str3, ": ");
                k10.append(hashMap3.get(str3));
                Log.w("ActivityResultRegistry", k10.toString());
                hashMap3.remove(str3);
            }
            Bundle bundle3 = hVar3.f291g;
            if (bundle3.containsKey(str3)) {
                StringBuilder k11 = m.k("Dropping pending result for request ", str3, ": ");
                k11.append(bundle3.getParcelable(str3));
                Log.w("ActivityResultRegistry", k11.toString());
                bundle3.remove(str3);
            }
            m.o(hVar3.f287c.get(str3));
        }
    }

    public final void l() {
        for (r rVar : this.f1173c.f()) {
            if (rVar != null) {
                rVar.onLowMemory();
                rVar.w.l();
            }
        }
    }

    public final void m(boolean z5) {
        for (r rVar : this.f1173c.f()) {
            if (rVar != null) {
                rVar.w.m(z5);
            }
        }
    }

    public final boolean n() {
        if (this.f1185o < 1) {
            return false;
        }
        for (r rVar : this.f1173c.f()) {
            if (rVar != null) {
                if (!rVar.B ? rVar.w.n() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o() {
        if (this.f1185o >= 1) {
            for (r rVar : this.f1173c.f()) {
                if (rVar != null && !rVar.B) {
                    rVar.w.o();
                }
            }
        }
    }

    public final void p(r rVar) {
        if (rVar != null && rVar.equals(z(rVar.f1258h))) {
            rVar.f1271u.getClass();
            boolean J = J(rVar);
            Boolean bool = rVar.f1263m;
            if (bool == null || bool.booleanValue() != J) {
                rVar.f1263m = Boolean.valueOf(J);
                l0 l0Var = rVar.w;
                l0Var.b0();
                l0Var.p(l0Var.f1189s);
            }
        }
    }

    public final void q(boolean z5) {
        for (r rVar : this.f1173c.f()) {
            if (rVar != null) {
                rVar.w.q(z5);
            }
        }
    }

    public final boolean r() {
        if (this.f1185o < 1) {
            return false;
        }
        boolean z5 = false;
        for (r rVar : this.f1173c.f()) {
            if (rVar != null && I(rVar)) {
                if (!rVar.B ? rVar.w.r() | false : false) {
                    z5 = true;
                }
            }
        }
        return z5;
    }

    /* JADX INFO: finally extract failed */
    public final void s(int i3) {
        try {
            this.f1172b = true;
            for (r0 r0Var : this.f1173c.f1283b.values()) {
                if (r0Var != null) {
                    r0Var.f1280e = i3;
                }
            }
            L(i3, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((h1) it.next()).e();
            }
            this.f1172b = false;
            w(true);
        } catch (Throwable th) {
            this.f1172b = false;
            throw th;
        }
    }

    public final void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String h6 = m.h(str, "    ");
        s0 s0Var = this.f1173c;
        s0Var.getClass();
        String str2 = str + "    ";
        HashMap hashMap = s0Var.f1283b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (r0 r0Var : hashMap.values()) {
                printWriter.print(str);
                if (r0Var != null) {
                    r rVar = r0Var.f1278c;
                    printWriter.println(rVar);
                    rVar.d(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = s0Var.f1282a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size3; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(((r) arrayList.get(i3)).toString());
            }
        }
        ArrayList arrayList2 = this.f1175e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i6 = 0; i6 < size2; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(((r) this.f1175e.get(i6)).toString());
            }
        }
        ArrayList arrayList3 = this.f1174d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i7 = 0; i7 < size; i7++) {
                a aVar = (a) this.f1174d.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(h6, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1179i.get());
        synchronized (this.f1171a) {
            int size4 = this.f1171a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i8 = 0; i8 < size4; i8++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i8);
                    printWriter.print(": ");
                    printWriter.println((j0) this.f1171a.get(i8));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1186p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1187q);
        if (this.f1188r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1188r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1185o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.f1195z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1195z);
        }
    }

    public final void u(j0 j0Var, boolean z5) {
        if (!z5) {
            if (this.f1186p != null) {
                if (this.A || this.B) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else if (this.C) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f1171a) {
            if (this.f1186p != null) {
                this.f1171a.add(j0Var);
                T();
            } else if (!z5) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void v(boolean z5) {
        if (this.f1172b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1186p == null) {
            if (this.C) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f1186p.f1296s.getLooper()) {
            if (!z5) {
                if (this.A || this.B) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            }
            if (this.E == null) {
                this.E = new ArrayList();
                this.F = new ArrayList();
            }
            this.f1172b = false;
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public final boolean w(boolean z5) {
        boolean z6;
        v(z5);
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = this.E;
            ArrayList arrayList2 = this.F;
            synchronized (this.f1171a) {
                if (this.f1171a.isEmpty()) {
                    z6 = false;
                } else {
                    int size = this.f1171a.size();
                    z6 = false;
                    for (int i3 = 0; i3 < size; i3++) {
                        z6 |= ((j0) this.f1171a.get(i3)).a(arrayList, arrayList2);
                    }
                    this.f1171a.clear();
                    this.f1186p.f1296s.removeCallbacks(this.I);
                }
            }
            if (z6) {
                z7 = true;
                this.f1172b = true;
                try {
                    Q(this.E, this.F);
                } finally {
                    d();
                }
            } else {
                b0();
                if (this.D) {
                    this.D = false;
                    Z();
                }
                this.f1173c.f1283b.values().removeAll(Collections.singleton((Object) null));
                return z7;
            }
        }
        while (true) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: androidx.fragment.app.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(java.util.ArrayList r21, java.util.ArrayList r22, int r23, int r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.Object r5 = r1.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            boolean r5 = r5.f1081o
            java.util.ArrayList r6 = r0.G
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.G = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList r6 = r0.G
            androidx.fragment.app.s0 r7 = r0.f1173c
            java.util.List r8 = r7.f()
            r6.addAll(r8)
            androidx.fragment.app.r r6 = r0.f1189s
            r9 = r3
            r10 = 0
        L_0x0030:
            r12 = 1
            if (r9 >= r4) goto L_0x0174
            java.lang.Object r13 = r1.get(r9)
            androidx.fragment.app.a r13 = (androidx.fragment.app.a) r13
            java.lang.Object r14 = r2.get(r9)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x0125
            java.util.ArrayList r14 = r0.G
            r15 = 0
        L_0x0048:
            java.util.ArrayList r11 = r13.f1067a
            int r8 = r11.size()
            if (r15 >= r8) goto L_0x0122
            java.lang.Object r8 = r11.get(r15)
            androidx.fragment.app.t0 r8 = (androidx.fragment.app.t0) r8
            int r3 = r8.f1286a
            if (r3 == r12) goto L_0x010e
            r12 = 2
            r2 = 9
            if (r3 == r12) goto L_0x009d
            r12 = 3
            if (r3 == r12) goto L_0x007f
            r12 = 6
            if (r3 == r12) goto L_0x007f
            r12 = 7
            if (r3 == r12) goto L_0x007a
            r12 = 8
            if (r3 == r12) goto L_0x006d
            goto L_0x0098
        L_0x006d:
            androidx.fragment.app.t0 r3 = new androidx.fragment.app.t0
            r3.<init>(r2, r6)
            r11.add(r15, r3)
            int r15 = r15 + 1
            androidx.fragment.app.r r6 = r8.f1287b
            goto L_0x0098
        L_0x007a:
            r19 = r7
            r1 = 1
            goto L_0x0111
        L_0x007f:
            androidx.fragment.app.r r3 = r8.f1287b
            r14.remove(r3)
            androidx.fragment.app.r r3 = r8.f1287b
            if (r3 != r6) goto L_0x0098
            androidx.fragment.app.t0 r6 = new androidx.fragment.app.t0
            r6.<init>(r2, r3)
            r11.add(r15, r6)
            int r15 = r15 + 1
            r19 = r7
            r1 = 1
            r6 = 0
            goto L_0x0116
        L_0x0098:
            r19 = r7
            r1 = 1
            goto L_0x0116
        L_0x009d:
            androidx.fragment.app.r r3 = r8.f1287b
            int r12 = r3.f1275z
            int r17 = r14.size()
            r16 = -1
            int r17 = r17 + -1
            r2 = r17
            r17 = 0
        L_0x00ad:
            if (r2 < 0) goto L_0x00fd
            java.lang.Object r18 = r14.get(r2)
            r19 = r7
            r7 = r18
            androidx.fragment.app.r r7 = (androidx.fragment.app.r) r7
            int r1 = r7.f1275z
            if (r1 != r12) goto L_0x00f5
            if (r7 != r3) goto L_0x00c3
            r1 = 1
            r17 = 1
            goto L_0x00f6
        L_0x00c3:
            if (r7 != r6) goto L_0x00d2
            androidx.fragment.app.t0 r1 = new androidx.fragment.app.t0
            r6 = 9
            r1.<init>(r6, r7)
            r11.add(r15, r1)
            int r15 = r15 + 1
            r6 = 0
        L_0x00d2:
            androidx.fragment.app.t0 r1 = new androidx.fragment.app.t0
            r18 = r6
            r6 = 3
            r1.<init>(r6, r7)
            int r6 = r8.f1288c
            r1.f1288c = r6
            int r6 = r8.f1290e
            r1.f1290e = r6
            int r6 = r8.f1289d
            r1.f1289d = r6
            int r6 = r8.f1291f
            r1.f1291f = r6
            r11.add(r15, r1)
            r14.remove(r7)
            r1 = 1
            int r15 = r15 + r1
            r6 = r18
            goto L_0x00f6
        L_0x00f5:
            r1 = 1
        L_0x00f6:
            int r2 = r2 + -1
            r1 = r21
            r7 = r19
            goto L_0x00ad
        L_0x00fd:
            r19 = r7
            r1 = 1
            if (r17 == 0) goto L_0x0108
            r11.remove(r15)
            int r15 = r15 + -1
            goto L_0x0116
        L_0x0108:
            r8.f1286a = r1
            r14.add(r3)
            goto L_0x0116
        L_0x010e:
            r19 = r7
            r1 = r12
        L_0x0111:
            androidx.fragment.app.r r2 = r8.f1287b
            r14.add(r2)
        L_0x0116:
            int r15 = r15 + r1
            r2 = r22
            r3 = r23
            r12 = r1
            r7 = r19
            r1 = r21
            goto L_0x0048
        L_0x0122:
            r19 = r7
            goto L_0x015e
        L_0x0125:
            r19 = r7
            r1 = r12
            java.util.ArrayList r2 = r0.G
            java.util.ArrayList r3 = r13.f1067a
            int r7 = r3.size()
            int r7 = r7 - r1
        L_0x0131:
            if (r7 < 0) goto L_0x015e
            java.lang.Object r8 = r3.get(r7)
            androidx.fragment.app.t0 r8 = (androidx.fragment.app.t0) r8
            int r11 = r8.f1286a
            if (r11 == r1) goto L_0x0154
            r1 = 3
            if (r11 == r1) goto L_0x014e
            switch(r11) {
                case 6: goto L_0x014e;
                case 7: goto L_0x0155;
                case 8: goto L_0x014c;
                case 9: goto L_0x0149;
                case 10: goto L_0x0144;
                default: goto L_0x0143;
            }
        L_0x0143:
            goto L_0x015a
        L_0x0144:
            androidx.lifecycle.m r11 = r8.f1292g
            r8.f1293h = r11
            goto L_0x015a
        L_0x0149:
            androidx.fragment.app.r r6 = r8.f1287b
            goto L_0x015a
        L_0x014c:
            r6 = 0
            goto L_0x015a
        L_0x014e:
            androidx.fragment.app.r r8 = r8.f1287b
            r2.add(r8)
            goto L_0x015a
        L_0x0154:
            r1 = 3
        L_0x0155:
            androidx.fragment.app.r r8 = r8.f1287b
            r2.remove(r8)
        L_0x015a:
            int r7 = r7 + -1
            r1 = 1
            goto L_0x0131
        L_0x015e:
            if (r10 != 0) goto L_0x0167
            boolean r1 = r13.f1073g
            if (r1 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r10 = 0
            goto L_0x0168
        L_0x0167:
            r10 = 1
        L_0x0168:
            int r9 = r9 + 1
            r1 = r21
            r2 = r22
            r3 = r23
            r7 = r19
            goto L_0x0030
        L_0x0174:
            r19 = r7
            java.util.ArrayList r1 = r0.G
            r1.clear()
            if (r5 != 0) goto L_0x01bc
            int r1 = r0.f1185o
            r2 = 1
            if (r1 < r2) goto L_0x01bc
            r1 = r23
        L_0x0184:
            if (r1 >= r4) goto L_0x01bc
            r2 = r21
            java.lang.Object r3 = r2.get(r1)
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            java.util.ArrayList r3 = r3.f1067a
            java.util.Iterator r3 = r3.iterator()
        L_0x0194:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01b7
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.t0 r5 = (androidx.fragment.app.t0) r5
            androidx.fragment.app.r r5 = r5.f1287b
            if (r5 == 0) goto L_0x01b2
            androidx.fragment.app.l0 r6 = r5.f1271u
            if (r6 == 0) goto L_0x01b2
            androidx.fragment.app.r0 r5 = r0.f(r5)
            r6 = r19
            r6.g(r5)
            goto L_0x01b4
        L_0x01b2:
            r6 = r19
        L_0x01b4:
            r19 = r6
            goto L_0x0194
        L_0x01b7:
            r6 = r19
            int r1 = r1 + 1
            goto L_0x0184
        L_0x01bc:
            r2 = r21
            r1 = r23
        L_0x01c0:
            if (r1 >= r4) goto L_0x01e8
            java.lang.Object r3 = r2.get(r1)
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            r5 = r22
            java.lang.Object r6 = r5.get(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x01de
            r6 = -1
            r3.c(r6)
            r3.h()
            goto L_0x01e5
        L_0x01de:
            r6 = 1
            r3.c(r6)
            r3.g()
        L_0x01e5:
            int r1 = r1 + 1
            goto L_0x01c0
        L_0x01e8:
            r5 = r22
            int r1 = r4 + -1
            java.lang.Object r1 = r5.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = r23
        L_0x01f8:
            if (r3 >= r4) goto L_0x0243
            java.lang.Object r6 = r2.get(r3)
            androidx.fragment.app.a r6 = (androidx.fragment.app.a) r6
            if (r1 == 0) goto L_0x0222
            java.util.ArrayList r7 = r6.f1067a
            int r7 = r7.size()
            r8 = 1
            int r7 = r7 - r8
        L_0x020a:
            if (r7 < 0) goto L_0x0240
            java.util.ArrayList r8 = r6.f1067a
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.t0 r8 = (androidx.fragment.app.t0) r8
            androidx.fragment.app.r r8 = r8.f1287b
            if (r8 == 0) goto L_0x021f
            androidx.fragment.app.r0 r8 = r0.f(r8)
            r8.k()
        L_0x021f:
            int r7 = r7 + -1
            goto L_0x020a
        L_0x0222:
            java.util.ArrayList r6 = r6.f1067a
            java.util.Iterator r6 = r6.iterator()
        L_0x0228:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0240
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.t0 r7 = (androidx.fragment.app.t0) r7
            androidx.fragment.app.r r7 = r7.f1287b
            if (r7 == 0) goto L_0x0228
            androidx.fragment.app.r0 r7 = r0.f(r7)
            r7.k()
            goto L_0x0228
        L_0x0240:
            int r3 = r3 + 1
            goto L_0x01f8
        L_0x0243:
            int r3 = r0.f1185o
            r6 = 1
            r0.L(r3, r6)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r6 = r23
        L_0x0250:
            if (r6 >= r4) goto L_0x0281
            java.lang.Object r7 = r2.get(r6)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            java.util.ArrayList r7 = r7.f1067a
            java.util.Iterator r7 = r7.iterator()
        L_0x025e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x027e
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.t0 r8 = (androidx.fragment.app.t0) r8
            androidx.fragment.app.r r8 = r8.f1287b
            if (r8 == 0) goto L_0x025e
            android.view.ViewGroup r8 = r8.G
            if (r8 == 0) goto L_0x025e
            androidx.fragment.app.d0 r9 = r20.E()
            androidx.fragment.app.h1 r8 = androidx.fragment.app.h1.f(r8, r9)
            r3.add(r8)
            goto L_0x025e
        L_0x027e:
            int r6 = r6 + 1
            goto L_0x0250
        L_0x0281:
            java.util.Iterator r3 = r3.iterator()
        L_0x0285:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x029a
            java.lang.Object r6 = r3.next()
            androidx.fragment.app.h1 r6 = (androidx.fragment.app.h1) r6
            r6.f1160d = r1
            r6.g()
            r6.c()
            goto L_0x0285
        L_0x029a:
            r1 = r23
        L_0x029c:
            if (r1 >= r4) goto L_0x02bf
            java.lang.Object r3 = r2.get(r1)
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            java.lang.Object r6 = r5.get(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x02b8
            int r6 = r3.f1084r
            if (r6 < 0) goto L_0x02b8
            r6 = -1
            r3.f1084r = r6
            goto L_0x02b9
        L_0x02b8:
            r6 = -1
        L_0x02b9:
            r3.getClass()
            int r1 = r1 + 1
            goto L_0x029c
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.x(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final void y(ArrayList arrayList, ArrayList arrayList2) {
    }

    public final r z(String str) {
        return this.f1173c.b(str);
    }
}
