package androidx.lifecycle;

import a2.m;
import android.os.Looper;
import b1.o;
import i.b;
import j.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import w4.p;

public final class t extends p {
    public final ArrayList A = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1380t = true;

    /* renamed from: u  reason: collision with root package name */
    public a f1381u = new a();

    /* renamed from: v  reason: collision with root package name */
    public m f1382v = m.f1371e;
    public final WeakReference w;

    /* renamed from: x  reason: collision with root package name */
    public int f1383x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1384y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1385z;

    public t(r rVar) {
        o.m(rVar, "provider");
        this.w = new WeakReference(rVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.w
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.r r0 = (androidx.lifecycle.r) r0
            if (r0 == 0) goto L_0x017c
        L_0x000a:
            j.a r1 = r7.f1381u
            int r2 = r1.f3643g
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            j.c r1 = r1.f3640d
            b1.o.k(r1)
            java.lang.Object r1 = r1.f3632e
            androidx.lifecycle.s r1 = (androidx.lifecycle.s) r1
            androidx.lifecycle.m r1 = r1.f1378a
            j.a r2 = r7.f1381u
            j.c r2 = r2.f3641e
            b1.o.k(r2)
            java.lang.Object r2 = r2.f3632e
            androidx.lifecycle.s r2 = (androidx.lifecycle.s) r2
            androidx.lifecycle.m r2 = r2.f1378a
            if (r1 != r2) goto L_0x0033
            androidx.lifecycle.m r1 = r7.f1382v
            if (r1 != r2) goto L_0x0033
        L_0x0031:
            r1 = r3
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            r7.f1385z = r4
            if (r1 != 0) goto L_0x017b
            androidx.lifecycle.m r1 = r7.f1382v
            j.a r2 = r7.f1381u
            j.c r2 = r2.f3640d
            b1.o.k(r2)
            java.lang.Object r2 = r2.f3632e
            androidx.lifecycle.s r2 = (androidx.lifecycle.s) r2
            androidx.lifecycle.m r2 = r2.f1378a
            int r1 = r1.compareTo(r2)
            java.util.ArrayList r2 = r7.A
            if (r1 >= 0) goto L_0x00e9
            j.a r1 = r7.f1381u
            j.b r4 = new j.b
            j.c r5 = r1.f3641e
            j.c r6 = r1.f3640d
            r4.<init>(r5, r6, r3)
            java.util.WeakHashMap r1 = r1.f3642f
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r4, r3)
        L_0x0061:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00e9
            boolean r1 = r7.f1385z
            if (r1 != 0) goto L_0x00e9
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r3 = "next()"
            b1.o.l(r1, r3)
            java.lang.Object r3 = r1.getKey()
            androidx.lifecycle.q r3 = (androidx.lifecycle.q) r3
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.s r1 = (androidx.lifecycle.s) r1
        L_0x0082:
            androidx.lifecycle.m r5 = r1.f1378a
            androidx.lifecycle.m r6 = r7.f1382v
            int r5 = r5.compareTo(r6)
            if (r5 <= 0) goto L_0x0061
            boolean r5 = r7.f1385z
            if (r5 != 0) goto L_0x0061
            j.a r5 = r7.f1381u
            java.util.HashMap r5 = r5.f3629h
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L_0x0061
            androidx.lifecycle.j r5 = androidx.lifecycle.l.Companion
            androidx.lifecycle.m r6 = r1.f1378a
            r5.getClass()
            java.lang.String r5 = "state"
            b1.o.m(r6, r5)
            int r5 = r6.ordinal()
            r6 = 2
            if (r5 == r6) goto L_0x00bb
            r6 = 3
            if (r5 == r6) goto L_0x00b8
            r6 = 4
            if (r5 == r6) goto L_0x00b5
            r5 = 0
            goto L_0x00bd
        L_0x00b5:
            androidx.lifecycle.l r5 = androidx.lifecycle.l.ON_PAUSE
            goto L_0x00bd
        L_0x00b8:
            androidx.lifecycle.l r5 = androidx.lifecycle.l.ON_STOP
            goto L_0x00bd
        L_0x00bb:
            androidx.lifecycle.l r5 = androidx.lifecycle.l.ON_DESTROY
        L_0x00bd:
            if (r5 == 0) goto L_0x00d3
            androidx.lifecycle.m r6 = r5.a()
            r2.add(r6)
            r1.a(r0, r5)
            int r5 = r2.size()
            int r5 = r5 + -1
            r2.remove(r5)
            goto L_0x0082
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event down from "
            r2.<init>(r3)
            androidx.lifecycle.m r1 = r1.f1378a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            j.a r1 = r7.f1381u
            j.c r1 = r1.f3641e
            boolean r3 = r7.f1385z
            if (r3 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            androidx.lifecycle.m r3 = r7.f1382v
            java.lang.Object r1 = r1.f3632e
            androidx.lifecycle.s r1 = (androidx.lifecycle.s) r1
            androidx.lifecycle.m r1 = r1.f1378a
            int r1 = r3.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            j.a r1 = r7.f1381u
            r1.getClass()
            j.d r3 = new j.d
            r3.<init>(r1)
            java.util.WeakHashMap r1 = r1.f3642f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.put(r3, r4)
        L_0x0112:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x000a
            boolean r1 = r7.f1385z
            if (r1 != 0) goto L_0x000a
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            androidx.lifecycle.q r4 = (androidx.lifecycle.q) r4
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.s r1 = (androidx.lifecycle.s) r1
        L_0x012e:
            androidx.lifecycle.m r5 = r1.f1378a
            androidx.lifecycle.m r6 = r7.f1382v
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L_0x0112
            boolean r5 = r7.f1385z
            if (r5 != 0) goto L_0x0112
            j.a r5 = r7.f1381u
            java.util.HashMap r5 = r5.f3629h
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0112
            androidx.lifecycle.m r5 = r1.f1378a
            r2.add(r5)
            androidx.lifecycle.j r5 = androidx.lifecycle.l.Companion
            androidx.lifecycle.m r6 = r1.f1378a
            r5.getClass()
            androidx.lifecycle.l r5 = androidx.lifecycle.j.a(r6)
            if (r5 == 0) goto L_0x0165
            r1.a(r0, r5)
            int r5 = r2.size()
            int r5 = r5 + -1
            r2.remove(r5)
            goto L_0x012e
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event up from "
            r2.<init>(r3)
            androidx.lifecycle.m r1 = r1.f1378a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x017b:
            return
        L_0x017c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.A():void");
    }

    public final void a(q qVar) {
        r rVar;
        o.m(qVar, "observer");
        w("addObserver");
        m mVar = this.f1382v;
        m mVar2 = m.f1370d;
        if (mVar != mVar2) {
            mVar2 = m.f1371e;
        }
        s sVar = new s(qVar, mVar2);
        if (((s) this.f1381u.c(qVar, sVar)) == null && (rVar = (r) this.w.get()) != null) {
            boolean z5 = this.f1383x != 0 || this.f1384y;
            m v5 = v(qVar);
            this.f1383x++;
            while (sVar.f1378a.compareTo(v5) < 0 && this.f1381u.f3629h.containsKey(qVar)) {
                m mVar3 = sVar.f1378a;
                ArrayList arrayList = this.A;
                arrayList.add(mVar3);
                j jVar = l.Companion;
                m mVar4 = sVar.f1378a;
                jVar.getClass();
                l a6 = j.a(mVar4);
                if (a6 != null) {
                    sVar.a(rVar, a6);
                    arrayList.remove(arrayList.size() - 1);
                    v5 = v(qVar);
                } else {
                    throw new IllegalStateException("no event up from " + sVar.f1378a);
                }
            }
            if (!z5) {
                A();
            }
            this.f1383x--;
        }
    }

    public final void t(q qVar) {
        o.m(qVar, "observer");
        w("removeObserver");
        this.f1381u.b(qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.lifecycle.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.m v(androidx.lifecycle.q r4) {
        /*
            r3 = this;
            j.a r0 = r3.f1381u
            java.util.HashMap r1 = r0.f3629h
            boolean r1 = r1.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0016
            java.util.HashMap r0 = r0.f3629h
            java.lang.Object r4 = r0.get(r4)
            j.c r4 = (j.c) r4
            j.c r4 = r4.f3634g
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            if (r4 == 0) goto L_0x0022
            java.lang.Object r4 = r4.f3632e
            androidx.lifecycle.s r4 = (androidx.lifecycle.s) r4
            if (r4 == 0) goto L_0x0022
            androidx.lifecycle.m r4 = r4.f1378a
            goto L_0x0023
        L_0x0022:
            r4 = r2
        L_0x0023:
            java.util.ArrayList r0 = r3.A
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x003a
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.m r2 = (androidx.lifecycle.m) r2
        L_0x003a:
            androidx.lifecycle.m r0 = r3.f1382v
            java.lang.String r1 = "state1"
            b1.o.m(r0, r1)
            if (r4 == 0) goto L_0x004a
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r2 == 0) goto L_0x0054
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r4
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.v(androidx.lifecycle.q):androidx.lifecycle.m");
    }

    public final void w(String str) {
        if (this.f1380t) {
            b.x().f3504q.getClass();
            if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                throw new IllegalStateException(m.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void x(l lVar) {
        o.m(lVar, "event");
        w("handleLifecycleEvent");
        y(lVar.a());
    }

    public final void y(m mVar) {
        m mVar2 = this.f1382v;
        if (mVar2 != mVar) {
            m mVar3 = m.f1371e;
            m mVar4 = m.f1370d;
            if ((mVar2 == mVar3 && mVar == mVar4) ? false : true) {
                this.f1382v = mVar;
                if (this.f1384y || this.f1383x != 0) {
                    this.f1385z = true;
                    return;
                }
                this.f1384y = true;
                A();
                this.f1384y = false;
                if (this.f1382v == mVar4) {
                    this.f1381u = new a();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f1382v + " in component " + this.w.get()).toString());
        }
    }

    public final void z() {
        m mVar = m.f1372f;
        w("setCurrentState");
        y(mVar);
    }
}
