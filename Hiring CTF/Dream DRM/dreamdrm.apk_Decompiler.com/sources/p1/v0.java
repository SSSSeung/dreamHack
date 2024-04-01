package p1;

import a2.m;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import x0.c;
import x0.u0;

public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4689a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f4690b = null;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4691c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List f4692d;

    /* renamed from: e  reason: collision with root package name */
    public int f4693e;

    /* renamed from: f  reason: collision with root package name */
    public int f4694f;

    /* renamed from: g  reason: collision with root package name */
    public u0 f4695g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4696h;

    public v0(RecyclerView recyclerView) {
        this.f4696h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4689a = arrayList;
        this.f4692d = Collections.unmodifiableList(arrayList);
        this.f4693e = 2;
        this.f4694f = 2;
    }

    public final void a(f1 f1Var, boolean z5) {
        RecyclerView.l(f1Var);
        RecyclerView recyclerView = this.f4696h;
        h1 h1Var = recyclerView.f1446o0;
        View view = f1Var.f4483a;
        if (h1Var != null) {
            g1 g1Var = h1Var.f4519e;
            u0.l(view, g1Var instanceof g1 ? (c) g1Var.f4512e.remove(view) : null);
        }
        if (z5) {
            ArrayList arrayList = recyclerView.f1449q;
            if (arrayList.size() <= 0) {
                if (recyclerView.f1432h0 != null) {
                    recyclerView.f1435j.m(f1Var);
                }
                if (RecyclerView.B0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + f1Var);
                }
            } else {
                m.o(arrayList.get(0));
                throw null;
            }
        }
        f1Var.f4501s = null;
        f1Var.f4500r = null;
        u0 c6 = c();
        c6.getClass();
        int i3 = f1Var.f4488f;
        ArrayList arrayList2 = c6.a(i3).f4668a;
        if (((t0) c6.f4681a.get(i3)).f4669b <= arrayList2.size()) {
            e.e(view);
        } else if (!RecyclerView.A0 || !arrayList2.contains(f1Var)) {
            f1Var.m();
            arrayList2.add(f1Var);
        } else {
            throw new IllegalArgumentException("this scrap item already exists");
        }
    }

    public final int b(int i3) {
        RecyclerView recyclerView = this.f4696h;
        if (i3 >= 0 && i3 < recyclerView.f1432h0.b()) {
            return !recyclerView.f1432h0.f4444g ? i3 : recyclerView.f1431h.f(i3, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + recyclerView.f1432h0.b() + recyclerView.B());
    }

    public final u0 c() {
        if (this.f4695g == null) {
            this.f4695g = new u0();
            e();
        }
        return this.f4695g;
    }

    public final View d(int i3) {
        return l(i3, Long.MAX_VALUE).f4483a;
    }

    public final void e() {
        if (this.f4695g != null) {
            RecyclerView recyclerView = this.f4696h;
            if (recyclerView.f1445o != null && recyclerView.isAttachedToWindow()) {
                u0 u0Var = this.f4695g;
                u0Var.f4683c.add(recyclerView.f1445o);
            }
        }
    }

    public final void f(g0 g0Var, boolean z5) {
        u0 u0Var = this.f4695g;
        if (u0Var != null) {
            Set set = u0Var.f4683c;
            set.remove(g0Var);
            if (set.size() == 0 && !z5) {
                int i3 = 0;
                while (true) {
                    SparseArray sparseArray = u0Var.f4681a;
                    if (i3 < sparseArray.size()) {
                        ArrayList arrayList = ((t0) sparseArray.get(sparseArray.keyAt(i3))).f4668a;
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            e.e(((f1) arrayList.get(i6)).f4483a);
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f4691c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.F0) {
            q qVar = this.f4696h.f1430g0;
            int[] iArr = (int[]) qVar.f4647d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            qVar.f4646c = 0;
        }
    }

    public final void h(int i3) {
        if (RecyclerView.B0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i3);
        }
        ArrayList arrayList = this.f4691c;
        f1 f1Var = (f1) arrayList.get(i3);
        if (RecyclerView.B0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f1Var);
        }
        a(f1Var, true);
        arrayList.remove(i3);
    }

    public final void i(View view) {
        f1 L = RecyclerView.L(view);
        boolean k6 = L.k();
        RecyclerView recyclerView = this.f4696h;
        if (k6) {
            recyclerView.removeDetachedView(view, false);
        }
        if (L.j()) {
            L.f4496n.m(L);
        } else if (L.p()) {
            L.f4492j &= -33;
        }
        j(L);
        if (recyclerView.M != null && !L.h()) {
            recyclerView.M.d(L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(p1.f1 r13) {
        /*
            r12 = this;
            boolean r0 = r13.j()
            r1 = 0
            r2 = 1
            androidx.recyclerview.widget.RecyclerView r3 = r12.f4696h
            android.view.View r4 = r13.f4483a
            if (r0 != 0) goto L_0x012d
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0014
            goto L_0x012d
        L_0x0014:
            boolean r0 = r13.k()
            if (r0 != 0) goto L_0x0119
            boolean r0 = r13.o()
            if (r0 != 0) goto L_0x0108
            int r0 = r13.f4492j
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = x0.u0.f5622a
            boolean r0 = x0.d0.i(r4)
            if (r0 == 0) goto L_0x0030
            r0 = r2
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            p1.g0 r5 = r3.f1445o
            boolean r5 = androidx.recyclerview.widget.RecyclerView.A0
            java.util.ArrayList r6 = r12.f4691c
            if (r5 == 0) goto L_0x0054
            boolean r5 = r6.contains(r13)
            if (r5 != 0) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cached view received recycle internal? "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = a2.m.f(r3, r1)
            r0.<init>(r13)
            throw r0
        L_0x0054:
            boolean r5 = r13.h()
            if (r5 == 0) goto L_0x00d8
            int r5 = r12.f4694f
            if (r5 <= 0) goto L_0x00ce
            int r5 = r13.f4492j
            r5 = r5 & 526(0x20e, float:7.37E-43)
            if (r5 == 0) goto L_0x0066
            r5 = r2
            goto L_0x0067
        L_0x0066:
            r5 = r1
        L_0x0067:
            if (r5 != 0) goto L_0x00ce
            int r5 = r6.size()
            int r7 = r12.f4694f
            if (r5 < r7) goto L_0x0078
            if (r5 <= 0) goto L_0x0078
            r12.h(r1)
            int r5 = r5 + -1
        L_0x0078:
            boolean r7 = androidx.recyclerview.widget.RecyclerView.F0
            if (r7 == 0) goto L_0x00c9
            if (r5 <= 0) goto L_0x00c9
            int r7 = r13.f4485c
            p1.q r8 = r3.f1430g0
            java.lang.Object r9 = r8.f4647d
            int[] r9 = (int[]) r9
            if (r9 == 0) goto L_0x009c
            int r9 = r8.f4646c
            int r9 = r9 * 2
            r10 = r1
        L_0x008d:
            if (r10 >= r9) goto L_0x009c
            java.lang.Object r11 = r8.f4647d
            int[] r11 = (int[]) r11
            r11 = r11[r10]
            if (r11 != r7) goto L_0x0099
            r7 = r2
            goto L_0x009d
        L_0x0099:
            int r10 = r10 + 2
            goto L_0x008d
        L_0x009c:
            r7 = r1
        L_0x009d:
            if (r7 != 0) goto L_0x00c9
        L_0x009f:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x00c8
            java.lang.Object r7 = r6.get(r5)
            p1.f1 r7 = (p1.f1) r7
            int r7 = r7.f4485c
            java.lang.Object r9 = r8.f4647d
            int[] r9 = (int[]) r9
            if (r9 == 0) goto L_0x00c5
            int r9 = r8.f4646c
            int r9 = r9 * 2
            r10 = r1
        L_0x00b6:
            if (r10 >= r9) goto L_0x00c5
            java.lang.Object r11 = r8.f4647d
            int[] r11 = (int[]) r11
            r11 = r11[r10]
            if (r11 != r7) goto L_0x00c2
            r7 = r2
            goto L_0x00c6
        L_0x00c2:
            int r10 = r10 + 2
            goto L_0x00b6
        L_0x00c5:
            r7 = r1
        L_0x00c6:
            if (r7 != 0) goto L_0x009f
        L_0x00c8:
            int r5 = r5 + r2
        L_0x00c9:
            r6.add(r5, r13)
            r5 = r2
            goto L_0x00cf
        L_0x00ce:
            r5 = r1
        L_0x00cf:
            if (r5 != 0) goto L_0x00d5
            r12.a(r13, r2)
            r1 = r2
        L_0x00d5:
            r2 = r1
            r1 = r5
            goto L_0x00f4
        L_0x00d8:
            boolean r2 = androidx.recyclerview.widget.RecyclerView.B0
            if (r2 == 0) goto L_0x00f3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"
            r2.<init>(r5)
            java.lang.String r5 = r3.B()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "RecyclerView"
            android.util.Log.d(r5, r2)
        L_0x00f3:
            r2 = r1
        L_0x00f4:
            p1.r1 r3 = r3.f1435j
            r3.m(r13)
            if (r1 != 0) goto L_0x0107
            if (r2 != 0) goto L_0x0107
            if (r0 == 0) goto L_0x0107
            com.bumptech.glide.e.e(r4)
            r0 = 0
            r13.f4501s = r0
            r13.f4500r = r0
        L_0x0107:
            return
        L_0x0108:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r0.<init>(r1)
            java.lang.String r0 = a2.m.f(r3, r0)
            r13.<init>(r0)
            throw r13
        L_0x0119:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = a2.m.f(r3, r1)
            r0.<init>(r13)
            throw r0
        L_0x012d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
            r5.<init>(r6)
            boolean r13 = r13.j()
            r5.append(r13)
            java.lang.String r13 = " isAttached:"
            r5.append(r13)
            android.view.ViewParent r13 = r4.getParent()
            if (r13 == 0) goto L_0x0149
            r1 = r2
        L_0x0149:
            r5.append(r1)
            java.lang.String r13 = r3.B()
            r5.append(r13)
            java.lang.String r13 = r5.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.v0.j(p1.f1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(android.view.View r6) {
        /*
            r5 = this;
            p1.f1 r6 = androidx.recyclerview.widget.RecyclerView.L(r6)
            int r0 = r6.f4492j
            r1 = r0 & 12
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView r4 = r5.f4696h
            if (r1 != 0) goto L_0x005b
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0019
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r3
        L_0x001a:
            if (r0 == 0) goto L_0x005b
            p1.l0 r0 = r4.M
            if (r0 == 0) goto L_0x0045
            java.util.List r1 = r6.d()
            p1.k r0 = (p1.k) r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x003f
            boolean r0 = r0.f4541g
            if (r0 == 0) goto L_0x0039
            boolean r0 = r6.g()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = r3
            goto L_0x003a
        L_0x0039:
            r0 = r2
        L_0x003a:
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r3
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = r3
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            if (r0 == 0) goto L_0x0049
            goto L_0x005b
        L_0x0049:
            java.util.ArrayList r0 = r5.f4690b
            if (r0 != 0) goto L_0x0054
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f4690b = r0
        L_0x0054:
            r6.f4496n = r5
            r6.f4497o = r2
            java.util.ArrayList r0 = r5.f4690b
            goto L_0x0085
        L_0x005b:
            boolean r0 = r6.g()
            if (r0 == 0) goto L_0x007f
            boolean r0 = r6.i()
            if (r0 != 0) goto L_0x007f
            p1.g0 r0 = r4.f1445o
            boolean r0 = r0.f4509b
            if (r0 == 0) goto L_0x006e
            goto L_0x007f
        L_0x006e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r1)
            java.lang.String r0 = a2.m.f(r4, r0)
            r6.<init>(r0)
            throw r6
        L_0x007f:
            r6.f4496n = r5
            r6.f4497o = r3
            java.util.ArrayList r0 = r5.f4689a
        L_0x0085:
            r0.add(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.v0.k(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01fb, code lost:
        if (r8.f4488f != 0) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0467, code lost:
        if (r8.g() == false) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04ba, code lost:
        if ((r11 == 0 || r11 + r9 < r24) == false) goto L_0x04bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p1.f1 l(int r23, long r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            androidx.recyclerview.widget.RecyclerView r2 = r1.f4696h
            if (r0 < 0) goto L_0x0635
            p1.b1 r3 = r2.f1432h0
            int r3 = r3.b()
            if (r0 >= r3) goto L_0x0635
            p1.b1 r3 = r2.f1432h0
            boolean r4 = r3.f4444g
            r5 = 0
            r6 = 32
            if (r4 == 0) goto L_0x0082
            java.util.ArrayList r4 = r1.f4690b
            if (r4 == 0) goto L_0x007d
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0024
            goto L_0x007d
        L_0x0024:
            r7 = r5
        L_0x0025:
            if (r7 >= r4) goto L_0x0042
            java.util.ArrayList r8 = r1.f4690b
            java.lang.Object r8 = r8.get(r7)
            p1.f1 r8 = (p1.f1) r8
            boolean r9 = r8.p()
            if (r9 != 0) goto L_0x003f
            int r9 = r8.c()
            if (r9 != r0) goto L_0x003f
            r8.b(r6)
            goto L_0x007e
        L_0x003f:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0042:
            p1.g0 r7 = r2.f1445o
            boolean r7 = r7.f4509b
            if (r7 == 0) goto L_0x007d
            p1.b r7 = r2.f1431h
            int r7 = r7.f(r0, r5)
            if (r7 <= 0) goto L_0x007d
            p1.g0 r8 = r2.f1445o
            int r8 = r8.a()
            if (r7 >= r8) goto L_0x007d
            p1.g0 r8 = r2.f1445o
            long r7 = r8.b(r7)
            r9 = r5
        L_0x005f:
            if (r9 >= r4) goto L_0x007d
            java.util.ArrayList r10 = r1.f4690b
            java.lang.Object r10 = r10.get(r9)
            p1.f1 r10 = (p1.f1) r10
            boolean r11 = r10.p()
            if (r11 != 0) goto L_0x007a
            long r11 = r10.f4487e
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x007a
            r10.b(r6)
            r8 = r10
            goto L_0x007e
        L_0x007a:
            int r9 = r9 + 1
            goto L_0x005f
        L_0x007d:
            r8 = 0
        L_0x007e:
            if (r8 == 0) goto L_0x0083
            r4 = 1
            goto L_0x0084
        L_0x0082:
            r8 = 0
        L_0x0083:
            r4 = r5
        L_0x0084:
            java.util.ArrayList r7 = r1.f4691c
            java.util.ArrayList r9 = r1.f4689a
            r10 = -1
            java.lang.String r11 = "RecyclerView"
            if (r8 != 0) goto L_0x0253
            int r8 = r9.size()
            r12 = r5
        L_0x0092:
            if (r12 >= r8) goto L_0x00bf
            java.lang.Object r13 = r9.get(r12)
            p1.f1 r13 = (p1.f1) r13
            boolean r14 = r13.p()
            if (r14 != 0) goto L_0x00bc
            int r14 = r13.c()
            if (r14 != r0) goto L_0x00bc
            boolean r14 = r13.g()
            if (r14 != 0) goto L_0x00bc
            boolean r14 = r3.f4444g
            if (r14 != 0) goto L_0x00b6
            boolean r14 = r13.i()
            if (r14 != 0) goto L_0x00bc
        L_0x00b6:
            r13.b(r6)
            r8 = r13
            goto L_0x01bf
        L_0x00bc:
            int r12 = r12 + 1
            goto L_0x0092
        L_0x00bf:
            p1.d r6 = r2.f1433i
            java.util.ArrayList r8 = r6.f4458c
            int r12 = r8.size()
            r13 = r5
        L_0x00c8:
            if (r13 >= r12) goto L_0x00f0
            java.lang.Object r14 = r8.get(r13)
            android.view.View r14 = (android.view.View) r14
            p1.f0 r15 = r6.f4456a
            r15.getClass()
            p1.f1 r15 = androidx.recyclerview.widget.RecyclerView.L(r14)
            int r5 = r15.c()
            if (r5 != r0) goto L_0x00ec
            boolean r5 = r15.g()
            if (r5 != 0) goto L_0x00ec
            boolean r5 = r15.i()
            if (r5 != 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            int r13 = r13 + 1
            r5 = 0
            goto L_0x00c8
        L_0x00f0:
            r14 = 0
        L_0x00f1:
            if (r14 == 0) goto L_0x017a
            p1.f1 r5 = androidx.recyclerview.widget.RecyclerView.L(r14)
            p1.d r6 = r2.f1433i
            p1.f0 r8 = r6.f4456a
            androidx.recyclerview.widget.RecyclerView r8 = r8.f4481a
            int r8 = r8.indexOfChild(r14)
            if (r8 < 0) goto L_0x0166
            p1.c r12 = r6.f4457b
            boolean r13 = r12.d(r8)
            if (r13 == 0) goto L_0x0152
            r12.a(r8)
            r6.k(r14)
            p1.d r6 = r2.f1433i
            p1.f0 r8 = r6.f4456a
            androidx.recyclerview.widget.RecyclerView r8 = r8.f4481a
            int r8 = r8.indexOfChild(r14)
            if (r8 != r10) goto L_0x011e
            goto L_0x0126
        L_0x011e:
            p1.c r6 = r6.f4457b
            boolean r12 = r6.d(r8)
            if (r12 == 0) goto L_0x0128
        L_0x0126:
            r8 = r10
            goto L_0x012d
        L_0x0128:
            int r6 = r6.b(r8)
            int r8 = r8 - r6
        L_0x012d:
            if (r8 == r10) goto L_0x013e
            p1.d r6 = r2.f1433i
            r6.c(r8)
            r1.k(r14)
            r6 = 8224(0x2020, float:1.1524E-41)
            r5.b(r6)
            goto L_0x01be
        L_0x013e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "layout index should not be -1 after unhiding a view:"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r2 = a2.m.f(r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x0152:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0166:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x017a:
            int r5 = r7.size()
            r6 = 0
        L_0x017f:
            if (r6 >= r5) goto L_0x01bd
            java.lang.Object r8 = r7.get(r6)
            p1.f1 r8 = (p1.f1) r8
            boolean r12 = r8.g()
            if (r12 != 0) goto L_0x01ba
            int r12 = r8.c()
            if (r12 != r0) goto L_0x01ba
            boolean r12 = r8.e()
            if (r12 != 0) goto L_0x01ba
            r7.remove(r6)
            boolean r5 = androidx.recyclerview.widget.RecyclerView.B0
            if (r5 == 0) goto L_0x01bf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getScrapOrHiddenOrCachedHolderForPosition("
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = ") found match in cache: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r11, r5)
            goto L_0x01bf
        L_0x01ba:
            int r6 = r6 + 1
            goto L_0x017f
        L_0x01bd:
            r5 = 0
        L_0x01be:
            r8 = r5
        L_0x01bf:
            if (r8 == 0) goto L_0x0253
            boolean r5 = r8.i()
            if (r5 == 0) goto L_0x01e4
            boolean r5 = androidx.recyclerview.widget.RecyclerView.A0
            if (r5 == 0) goto L_0x01e1
            boolean r5 = r3.f4444g
            if (r5 == 0) goto L_0x01d0
            goto L_0x01e1
        L_0x01d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "should not receive a removed view unless it is pre layout"
            r3.<init>(r4)
            java.lang.String r2 = a2.m.f(r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x01e1:
            boolean r5 = r3.f4444g
            goto L_0x0214
        L_0x01e4:
            int r5 = r8.f4485c
            if (r5 < 0) goto L_0x023f
            p1.g0 r6 = r2.f1445o
            int r6 = r6.a()
            if (r5 >= r6) goto L_0x023f
            boolean r5 = r3.f4444g
            if (r5 != 0) goto L_0x01fe
            p1.g0 r5 = r2.f1445o
            r5.getClass()
            int r5 = r8.f4488f
            if (r5 == 0) goto L_0x01fe
            goto L_0x0211
        L_0x01fe:
            p1.g0 r5 = r2.f1445o
            boolean r6 = r5.f4509b
            if (r6 == 0) goto L_0x0213
            long r12 = r8.f4487e
            int r6 = r8.f4485c
            long r5 = r5.b(r6)
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r5 = 0
            goto L_0x0214
        L_0x0213:
            r5 = 1
        L_0x0214:
            if (r5 != 0) goto L_0x023d
            r5 = 4
            r8.b(r5)
            boolean r5 = r8.j()
            if (r5 == 0) goto L_0x022c
            android.view.View r5 = r8.f4483a
            r6 = 0
            r2.removeDetachedView(r5, r6)
            p1.v0 r5 = r8.f4496n
            r5.m(r8)
            goto L_0x0238
        L_0x022c:
            boolean r5 = r8.p()
            if (r5 == 0) goto L_0x0238
            int r5 = r8.f4492j
            r5 = r5 & -33
            r8.f4492j = r5
        L_0x0238:
            r1.j(r8)
            r8 = 0
            goto L_0x0253
        L_0x023d:
            r4 = 1
            goto L_0x0253
        L_0x023f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Inconsistency detected. Invalid view holder adapter position"
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r2 = a2.m.f(r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x0253:
            r12 = 2
            if (r8 != 0) goto L_0x0413
            p1.b r15 = r2.f1431h
            r13 = 0
            int r14 = r15.f(r0, r13)
            if (r14 < 0) goto L_0x03e4
            p1.g0 r13 = r2.f1445o
            int r13 = r13.a()
            if (r14 >= r13) goto L_0x03e4
            p1.g0 r13 = r2.f1445o
            r13.getClass()
            p1.g0 r13 = r2.f1445o
            boolean r15 = r13.f4509b
            if (r15 == 0) goto L_0x02f6
            long r18 = r13.b(r14)
            int r8 = r9.size()
            int r8 = r8 + r10
        L_0x027b:
            if (r8 < 0) goto L_0x02c9
            java.lang.Object r10 = r9.get(r8)
            p1.f1 r10 = (p1.f1) r10
            long r5 = r10.f4487e
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x02c6
            boolean r5 = r10.p()
            if (r5 != 0) goto L_0x02c6
            int r5 = r10.f4488f
            if (r5 != 0) goto L_0x02ab
            r5 = 32
            r10.b(r5)
            boolean r5 = r10.i()
            if (r5 == 0) goto L_0x02a9
            boolean r5 = r3.f4444g
            if (r5 != 0) goto L_0x02a9
            int r5 = r10.f4492j
            r5 = r5 & -15
            r5 = r5 | r12
            r10.f4492j = r5
        L_0x02a9:
            r8 = r10
            goto L_0x02f1
        L_0x02ab:
            r9.remove(r8)
            android.view.View r5 = r10.f4483a
            r6 = 0
            r2.removeDetachedView(r5, r6)
            p1.f1 r5 = androidx.recyclerview.widget.RecyclerView.L(r5)
            r10 = 0
            r5.f4496n = r10
            r5.f4497o = r6
            int r6 = r5.f4492j
            r6 = r6 & -33
            r5.f4492j = r6
            r1.j(r5)
        L_0x02c6:
            int r8 = r8 + -1
            goto L_0x027b
        L_0x02c9:
            int r5 = r7.size()
        L_0x02cd:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x02ef
            java.lang.Object r6 = r7.get(r5)
            p1.f1 r6 = (p1.f1) r6
            long r8 = r6.f4487e
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x02cd
            boolean r8 = r6.e()
            if (r8 != 0) goto L_0x02cd
            int r8 = r6.f4488f
            if (r8 != 0) goto L_0x02ec
            r7.remove(r5)
            r8 = r6
            goto L_0x02f1
        L_0x02ec:
            r1.h(r5)
        L_0x02ef:
            r5 = 0
            r8 = r5
        L_0x02f1:
            if (r8 == 0) goto L_0x02f6
            r8.f4485c = r14
            r4 = 1
        L_0x02f6:
            if (r8 != 0) goto L_0x034d
            boolean r5 = androidx.recyclerview.widget.RecyclerView.B0
            if (r5 == 0) goto L_0x0312
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "tryGetViewHolderForPositionByDeadline("
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = ") fetching from shared pool"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r11, r5)
        L_0x0312:
            p1.u0 r5 = r22.c()
            android.util.SparseArray r5 = r5.f4681a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            p1.t0 r5 = (p1.t0) r5
            if (r5 == 0) goto L_0x0344
            java.util.ArrayList r5 = r5.f4668a
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0344
            int r6 = r5.size()
        L_0x032d:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x0344
            java.lang.Object r7 = r5.get(r6)
            p1.f1 r7 = (p1.f1) r7
            boolean r7 = r7.e()
            if (r7 != 0) goto L_0x032d
            java.lang.Object r5 = r5.remove(r6)
            p1.f1 r5 = (p1.f1) r5
            goto L_0x0345
        L_0x0344:
            r5 = 0
        L_0x0345:
            if (r5 == 0) goto L_0x034c
            r5.m()
            boolean r6 = androidx.recyclerview.widget.RecyclerView.A0
        L_0x034c:
            r8 = r5
        L_0x034d:
            if (r8 != 0) goto L_0x0413
            long r5 = r2.getNanoTime()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0378
            p1.u0 r7 = r1.f4695g
            r8 = 0
            p1.t0 r7 = r7.a(r8)
            long r7 = r7.f4670c
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x0373
            long r7 = r7 + r5
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 >= 0) goto L_0x0371
            goto L_0x0373
        L_0x0371:
            r7 = 0
            goto L_0x0374
        L_0x0373:
            r7 = 1
        L_0x0374:
            if (r7 != 0) goto L_0x0378
            r0 = 0
            return r0
        L_0x0378:
            p1.g0 r7 = r2.f1445o
            r7.getClass()
            java.lang.String r8 = "RV CreateView"
            int r9 = t0.k.f5089a     // Catch:{ all -> 0x03dd }
            t0.j.a(r8)     // Catch:{ all -> 0x03dd }
            p1.f1 r8 = r7.d(r2)     // Catch:{ all -> 0x03dd }
            android.view.View r7 = r8.f4483a     // Catch:{ all -> 0x03dd }
            android.view.ViewParent r7 = r7.getParent()     // Catch:{ all -> 0x03dd }
            if (r7 != 0) goto L_0x03d5
            r7 = 0
            r8.f4488f = r7     // Catch:{ all -> 0x03dd }
            t0.j.b()
            boolean r7 = androidx.recyclerview.widget.RecyclerView.F0
            if (r7 == 0) goto L_0x03a9
            android.view.View r7 = r8.f4483a
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.G(r7)
            if (r7 == 0) goto L_0x03a9
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r7)
            r8.f4484b = r9
        L_0x03a9:
            long r9 = r2.getNanoTime()
            p1.u0 r7 = r1.f4695g
            long r9 = r9 - r5
            r5 = 0
            p1.t0 r6 = r7.a(r5)
            long r13 = r6.f4670c
            r16 = 0
            int r5 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x03be
            goto L_0x03c9
        L_0x03be:
            r18 = 4
            long r13 = r13 / r18
            r20 = 3
            long r13 = r13 * r20
            long r9 = r9 / r18
            long r9 = r9 + r13
        L_0x03c9:
            r6.f4670c = r9
            boolean r5 = androidx.recyclerview.widget.RecyclerView.B0
            if (r5 == 0) goto L_0x0413
            java.lang.String r5 = "tryGetViewHolderForPositionByDeadline created new ViewHolder"
            android.util.Log.d(r11, r5)
            goto L_0x0413
        L_0x03d5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03dd }
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch:{ all -> 0x03dd }
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x03dd:
            r0 = move-exception
            int r2 = t0.k.f5089a
            t0.j.b()
            throw r0
        L_0x03e4:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Inconsistency detected. Invalid item position "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = "(offset:"
            r5.append(r0)
            r5.append(r14)
            java.lang.String r0 = ").state:"
            r5.append(r0)
            int r0 = r3.b()
            r5.append(r0)
            java.lang.String r0 = r2.B()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            throw r4
        L_0x0413:
            if (r4 == 0) goto L_0x0444
            boolean r5 = r3.f4444g
            if (r5 != 0) goto L_0x0444
            int r5 = r8.f4492j
            r6 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0421
            r6 = 1
            goto L_0x0422
        L_0x0421:
            r6 = 0
        L_0x0422:
            if (r6 == 0) goto L_0x0444
            r5 = r5 & -8193(0xffffffffffffdfff, float:NaN)
            r6 = 0
            r5 = r5 | r6
            r8.f4492j = r5
            boolean r5 = r3.f4447j
            if (r5 == 0) goto L_0x0444
            p1.l0.b(r8)
            p1.l0 r5 = r2.M
            r8.d()
            r5.getClass()
            p1.k0 r5 = new p1.k0
            r5.<init>()
            r5.a(r8)
            r2.X(r8, r5)
        L_0x0444:
            boolean r5 = r3.f4444g
            if (r5 == 0) goto L_0x0453
            boolean r5 = r8.f()
            if (r5 == 0) goto L_0x0453
            r8.f4489g = r0
        L_0x0450:
            r6 = 0
            goto L_0x04bc
        L_0x0453:
            boolean r5 = r8.f()
            if (r5 == 0) goto L_0x0469
            int r5 = r8.f4492j
            r5 = r5 & r12
            if (r5 == 0) goto L_0x0460
            r6 = 1
            goto L_0x0461
        L_0x0460:
            r6 = 0
        L_0x0461:
            if (r6 != 0) goto L_0x0469
            boolean r5 = r8.g()
            if (r5 == 0) goto L_0x0450
        L_0x0469:
            boolean r5 = androidx.recyclerview.widget.RecyclerView.A0
            if (r5 == 0) goto L_0x0488
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x0474
            goto L_0x0488
        L_0x0474:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r2 = a2.m.f(r2, r3)
            r0.<init>(r2)
            throw r0
        L_0x0488:
            p1.b r5 = r2.f1431h
            r6 = 0
            int r5 = r5.f(r0, r6)
            r7 = 0
            r8.f4501s = r7
            r8.f4500r = r2
            int r7 = r8.f4488f
            long r9 = r2.getNanoTime()
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r11 = (r24 > r11 ? 1 : (r24 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x04c0
            p1.u0 r11 = r1.f4695g
            p1.t0 r7 = r11.a(r7)
            long r11 = r7.f4671d
            r13 = 0
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x04b9
            long r11 = r11 + r9
            int r7 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r7 >= 0) goto L_0x04b7
            goto L_0x04b9
        L_0x04b7:
            r7 = r6
            goto L_0x04ba
        L_0x04b9:
            r7 = 1
        L_0x04ba:
            if (r7 != 0) goto L_0x04c0
        L_0x04bc:
            r0 = 1
            r5 = r6
            goto L_0x0608
        L_0x04c0:
            boolean r7 = r8.k()
            android.view.View r11 = r8.f4483a
            if (r7 == 0) goto L_0x04d5
            int r7 = r2.getChildCount()
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            r2.attachViewToParent(r11, r7, r12)
            r7 = 1
            goto L_0x04d6
        L_0x04d5:
            r7 = r6
        L_0x04d6:
            p1.g0 r12 = r2.f1445o
            r12.getClass()
            p1.g0 r13 = r8.f4501s
            if (r13 != 0) goto L_0x04e0
            r6 = 1
        L_0x04e0:
            if (r6 == 0) goto L_0x04fd
            r8.f4485c = r5
            boolean r13 = r12.f4509b
            if (r13 == 0) goto L_0x04ee
            long r13 = r12.b(r5)
            r8.f4487e = r13
        L_0x04ee:
            int r13 = r8.f4492j
            r13 = r13 & -520(0xfffffffffffffdf8, float:NaN)
            r13 = r13 | 1
            r8.f4492j = r13
            int r13 = t0.k.f5089a
            java.lang.String r13 = "RV OnBindView"
            t0.j.a(r13)
        L_0x04fd:
            r8.f4501s = r12
            boolean r13 = androidx.recyclerview.widget.RecyclerView.A0
            if (r13 == 0) goto L_0x0565
            android.view.ViewParent r13 = r11.getParent()
            if (r13 != 0) goto L_0x0542
            java.util.WeakHashMap r13 = x0.u0.f5622a
            boolean r13 = x0.g0.b(r11)
            boolean r14 = r8.k()
            if (r13 != r14) goto L_0x0516
            goto L_0x0542
        L_0x0516:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Temp-detached state out of sync with reality. holder.isTmpDetached(): "
            r2.<init>(r3)
            boolean r3 = r8.k()
            r2.append(r3)
            java.lang.String r3 = ", attached to window: "
            r2.append(r3)
            boolean r3 = x0.g0.b(r11)
            r2.append(r3)
            java.lang.String r3 = ", holder: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0542:
            android.view.ViewParent r13 = r11.getParent()
            if (r13 != 0) goto L_0x0565
            java.util.WeakHashMap r13 = x0.u0.f5622a
            boolean r13 = x0.g0.b(r11)
            if (r13 != 0) goto L_0x0551
            goto L_0x0565
        L_0x0551:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Attempting to bind attached holder with no parent (AKA temp detached): "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0565:
            r8.d()
            r12.c(r8, r5)
            if (r6 == 0) goto L_0x058c
            java.util.ArrayList r5 = r8.f4493k
            if (r5 == 0) goto L_0x0574
            r5.clear()
        L_0x0574:
            int r5 = r8.f4492j
            r5 = r5 & -1025(0xfffffffffffffbff, float:NaN)
            r8.f4492j = r5
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
            boolean r6 = r5 instanceof p1.p0
            if (r6 == 0) goto L_0x0587
            p1.p0 r5 = (p1.p0) r5
            r6 = 1
            r5.f4642c = r6
        L_0x0587:
            int r5 = t0.k.f5089a
            t0.j.b()
        L_0x058c:
            if (r7 == 0) goto L_0x0591
            r2.detachViewFromParent(r11)
        L_0x0591:
            long r5 = r2.getNanoTime()
            p1.u0 r7 = r1.f4695g
            int r12 = r8.f4488f
            long r5 = r5 - r9
            p1.t0 r7 = r7.a(r12)
            long r9 = r7.f4671d
            r12 = 0
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x05a7
            goto L_0x05af
        L_0x05a7:
            r12 = 4
            long r9 = r9 / r12
            r14 = 3
            long r9 = r9 * r14
            long r5 = r5 / r12
            long r5 = r5 + r9
        L_0x05af:
            r7.f4671d = r5
            android.view.accessibility.AccessibilityManager r5 = r2.C
            if (r5 == 0) goto L_0x05bd
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L_0x05bd
            r5 = 1
            goto L_0x05be
        L_0x05bd:
            r5 = 0
        L_0x05be:
            if (r5 == 0) goto L_0x0600
            java.util.WeakHashMap r5 = x0.u0.f5622a
            int r5 = x0.d0.c(r11)
            if (r5 != 0) goto L_0x05cd
            r5 = 1
            x0.d0.s(r11, r5)
            goto L_0x05ce
        L_0x05cd:
            r5 = 1
        L_0x05ce:
            p1.h1 r6 = r2.f1446o0
            if (r6 != 0) goto L_0x05d3
            goto L_0x0601
        L_0x05d3:
            p1.g1 r6 = r6.f4519e
            boolean r7 = r6 instanceof p1.g1
            if (r7 == 0) goto L_0x05fc
            r6.getClass()
            android.view.View$AccessibilityDelegate r7 = x0.u0.c(r11)
            if (r7 != 0) goto L_0x05e4
            r7 = 0
            goto L_0x05f3
        L_0x05e4:
            boolean r9 = r7 instanceof x0.a
            if (r9 == 0) goto L_0x05ed
            x0.a r7 = (x0.a) r7
            x0.c r7 = r7.f5535a
            goto L_0x05f3
        L_0x05ed:
            x0.c r9 = new x0.c
            r9.<init>(r7)
            r7 = r9
        L_0x05f3:
            if (r7 == 0) goto L_0x05fc
            if (r7 == r6) goto L_0x05fc
            java.util.WeakHashMap r9 = r6.f4512e
            r9.put(r11, r7)
        L_0x05fc:
            x0.u0.l(r11, r6)
            goto L_0x0601
        L_0x0600:
            r5 = 1
        L_0x0601:
            boolean r3 = r3.f4444g
            if (r3 == 0) goto L_0x0607
            r8.f4489g = r0
        L_0x0607:
            r0 = r5
        L_0x0608:
            android.view.View r3 = r8.f4483a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0615
            android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
            goto L_0x061f
        L_0x0615:
            boolean r6 = r2.checkLayoutParams(r3)
            if (r6 != 0) goto L_0x0627
            android.view.ViewGroup$LayoutParams r2 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
        L_0x061f:
            p1.p0 r2 = (p1.p0) r2
            android.view.View r3 = r8.f4483a
            r3.setLayoutParams(r2)
            goto L_0x062a
        L_0x0627:
            r2 = r3
            p1.p0 r2 = (p1.p0) r2
        L_0x062a:
            r2.f4640a = r8
            if (r4 == 0) goto L_0x0631
            if (r5 == 0) goto L_0x0631
            goto L_0x0632
        L_0x0631:
            r0 = 0
        L_0x0632:
            r2.f4643d = r0
            return r8
        L_0x0635:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid item position "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "). Item count:"
            r4.append(r0)
            p1.b1 r0 = r2.f1432h0
            int r0 = r0.b()
            r4.append(r0)
            java.lang.String r0 = r2.B()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.v0.l(int, long):p1.f1");
    }

    public final void m(f1 f1Var) {
        (f1Var.f4497o ? this.f4690b : this.f4689a).remove(f1Var);
        f1Var.f4496n = null;
        f1Var.f4497o = false;
        f1Var.f4492j &= -33;
    }

    public final void n() {
        o0 o0Var = this.f4696h.f1447p;
        this.f4694f = this.f4693e + (o0Var != null ? o0Var.f4604j : 0);
        ArrayList arrayList = this.f4691c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4694f; size--) {
            h(size);
        }
    }
}
