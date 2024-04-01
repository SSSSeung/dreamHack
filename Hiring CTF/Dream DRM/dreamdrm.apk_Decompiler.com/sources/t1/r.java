package t1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d  reason: collision with root package name */
    public final p f5161d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f5162e;

    public r(ViewGroup viewGroup, p pVar) {
        this.f5161d = pVar;
        this.f5162e = viewGroup;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: t1.w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01ee A[EDGE_INSN: B:145:0x01ee->B:93:0x01ee ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r18 = this;
            r0 = r18
            android.view.ViewGroup r2 = r0.f5162e
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r1.removeOnPreDrawListener(r0)
            r2.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r1 = t1.s.f5165c
            boolean r1 = r1.remove(r2)
            r7 = 1
            if (r1 != 0) goto L_0x0018
            return r7
        L_0x0018:
            k.b r1 = t1.s.b()
            r3 = 0
            java.lang.Object r4 = r1.getOrDefault(r2, r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x002e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.put(r2, r4)
            goto L_0x003a
        L_0x002e:
            int r5 = r4.size()
            if (r5 <= 0) goto L_0x003a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            goto L_0x003b
        L_0x003a:
            r5 = r3
        L_0x003b:
            t1.p r8 = r0.f5161d
            r4.add(r8)
            t1.h r4 = new t1.h
            r4.<init>(r0, r7, r1)
            r8.a(r4)
            r1 = 0
            r8.h(r2, r1)
            if (r5 == 0) goto L_0x0062
            java.util.Iterator r4 = r5.iterator()
        L_0x0052:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0062
            java.lang.Object r5 = r4.next()
            t1.p r5 = (t1.p) r5
            r5.x(r2)
            goto L_0x0052
        L_0x0062:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8.f5152n = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8.f5153o = r4
            g.h r4 = r8.f5148j
            g.h r5 = r8.f5149k
            k.b r6 = new k.b
            java.lang.Object r9 = r4.f2725a
            k.b r9 = (k.b) r9
            r6.<init>(r9)
            k.b r9 = new k.b
            java.lang.Object r10 = r5.f2725a
            k.b r10 = (k.b) r10
            r9.<init>(r10)
            r10 = r1
        L_0x0087:
            int[] r11 = r8.f5151m
            int r12 = r11.length
            if (r10 >= r12) goto L_0x01ee
            r11 = r11[r10]
            if (r11 == r7) goto L_0x01ae
            r12 = 2
            if (r11 == r12) goto L_0x015c
            r12 = 3
            if (r11 == r12) goto L_0x0108
            r12 = 4
            if (r11 == r12) goto L_0x009c
        L_0x0099:
            r7 = r8
            goto L_0x01e4
        L_0x009c:
            java.lang.Object r11 = r4.f2727c
            k.d r11 = (k.d) r11
            java.lang.Object r12 = r5.f2727c
            k.d r12 = (k.d) r12
            boolean r13 = r11.f3868d
            if (r13 == 0) goto L_0x00ab
            r11.c()
        L_0x00ab:
            int r13 = r11.f3871g
            r14 = r1
        L_0x00ae:
            if (r14 >= r13) goto L_0x0099
            java.lang.Object r15 = r11.f(r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto L_0x00fe
            boolean r16 = r8.s(r15)
            if (r16 == 0) goto L_0x00fe
            boolean r1 = r11.f3868d
            if (r1 == 0) goto L_0x00c5
            r11.c()
        L_0x00c5:
            long[] r1 = r11.f3869e
            r17 = r8
            r7 = r1[r14]
            java.lang.Object r1 = r12.d(r7, r3)
            android.view.View r1 = (android.view.View) r1
            r7 = r17
            if (r1 == 0) goto L_0x00ff
            boolean r8 = r7.s(r1)
            if (r8 == 0) goto L_0x00ff
            java.lang.Object r8 = r6.getOrDefault(r15, r3)
            t1.w r8 = (t1.w) r8
            java.lang.Object r17 = r9.getOrDefault(r1, r3)
            r3 = r17
            t1.w r3 = (t1.w) r3
            if (r8 == 0) goto L_0x00ff
            if (r3 == 0) goto L_0x00ff
            java.util.ArrayList r0 = r7.f5152n
            r0.add(r8)
            java.util.ArrayList r0 = r7.f5153o
            r0.add(r3)
            r6.remove(r15)
            r9.remove(r1)
            goto L_0x00ff
        L_0x00fe:
            r7 = r8
        L_0x00ff:
            int r14 = r14 + 1
            r0 = r18
            r8 = r7
            r1 = 0
            r3 = 0
            r7 = 1
            goto L_0x00ae
        L_0x0108:
            r7 = r8
            java.lang.Object r0 = r4.f2726b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r1 = r5.f2726b
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            int r3 = r0.size()
            r8 = 0
        L_0x0116:
            if (r8 >= r3) goto L_0x01e4
            java.lang.Object r11 = r0.valueAt(r8)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x0159
            boolean r12 = r7.s(r11)
            if (r12 == 0) goto L_0x0159
            int r12 = r0.keyAt(r8)
            java.lang.Object r12 = r1.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x0159
            boolean r13 = r7.s(r12)
            if (r13 == 0) goto L_0x0159
            r13 = 0
            java.lang.Object r14 = r6.getOrDefault(r11, r13)
            t1.w r14 = (t1.w) r14
            java.lang.Object r15 = r9.getOrDefault(r12, r13)
            t1.w r15 = (t1.w) r15
            if (r14 == 0) goto L_0x0159
            if (r15 == 0) goto L_0x0159
            java.util.ArrayList r13 = r7.f5152n
            r13.add(r14)
            java.util.ArrayList r13 = r7.f5153o
            r13.add(r15)
            r6.remove(r11)
            r9.remove(r12)
        L_0x0159:
            int r8 = r8 + 1
            goto L_0x0116
        L_0x015c:
            r7 = r8
            java.lang.Object r0 = r4.f2728d
            k.b r0 = (k.b) r0
            java.lang.Object r1 = r5.f2728d
            k.b r1 = (k.b) r1
            int r3 = r0.f3895f
            r8 = 0
        L_0x0168:
            if (r8 >= r3) goto L_0x01e4
            java.lang.Object r11 = r0.l(r8)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x01ab
            boolean r12 = r7.s(r11)
            if (r12 == 0) goto L_0x01ab
            java.lang.Object r12 = r0.h(r8)
            r13 = 0
            java.lang.Object r12 = r1.getOrDefault(r12, r13)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x01ab
            boolean r14 = r7.s(r12)
            if (r14 == 0) goto L_0x01ab
            java.lang.Object r14 = r6.getOrDefault(r11, r13)
            t1.w r14 = (t1.w) r14
            java.lang.Object r15 = r9.getOrDefault(r12, r13)
            t1.w r15 = (t1.w) r15
            if (r14 == 0) goto L_0x01ab
            if (r15 == 0) goto L_0x01ab
            java.util.ArrayList r13 = r7.f5152n
            r13.add(r14)
            java.util.ArrayList r13 = r7.f5153o
            r13.add(r15)
            r6.remove(r11)
            r9.remove(r12)
        L_0x01ab:
            int r8 = r8 + 1
            goto L_0x0168
        L_0x01ae:
            r7 = r8
            int r0 = r6.f3895f
        L_0x01b1:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x01e4
            java.lang.Object r1 = r6.h(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x01b1
            boolean r3 = r7.s(r1)
            if (r3 == 0) goto L_0x01b1
            java.lang.Object r1 = r9.remove(r1)
            t1.w r1 = (t1.w) r1
            if (r1 == 0) goto L_0x01b1
            android.view.View r3 = r1.f5171b
            boolean r3 = r7.s(r3)
            if (r3 == 0) goto L_0x01b1
            java.lang.Object r3 = r6.j(r0)
            t1.w r3 = (t1.w) r3
            java.util.ArrayList r8 = r7.f5152n
            r8.add(r3)
            java.util.ArrayList r3 = r7.f5153o
            r3.add(r1)
            goto L_0x01b1
        L_0x01e4:
            int r10 = r10 + 1
            r0 = r18
            r8 = r7
            r1 = 0
            r3 = 0
            r7 = 1
            goto L_0x0087
        L_0x01ee:
            r7 = r8
            r0 = 0
        L_0x01f0:
            int r1 = r6.f3895f
            if (r0 >= r1) goto L_0x0210
            java.lang.Object r1 = r6.l(r0)
            t1.w r1 = (t1.w) r1
            android.view.View r3 = r1.f5171b
            boolean r3 = r7.s(r3)
            if (r3 == 0) goto L_0x020d
            java.util.ArrayList r3 = r7.f5152n
            r3.add(r1)
            java.util.ArrayList r1 = r7.f5153o
            r3 = 0
            r1.add(r3)
        L_0x020d:
            int r0 = r0 + 1
            goto L_0x01f0
        L_0x0210:
            r0 = 0
        L_0x0211:
            int r1 = r9.f3895f
            if (r0 >= r1) goto L_0x0231
            java.lang.Object r1 = r9.l(r0)
            t1.w r1 = (t1.w) r1
            android.view.View r3 = r1.f5171b
            boolean r3 = r7.s(r3)
            if (r3 == 0) goto L_0x022e
            java.util.ArrayList r3 = r7.f5153o
            r3.add(r1)
            java.util.ArrayList r1 = r7.f5152n
            r3 = 0
            r1.add(r3)
        L_0x022e:
            int r0 = r0 + 1
            goto L_0x0211
        L_0x0231:
            k.b r0 = t1.p.o()
            int r1 = r0.f3895f
            t1.b0 r3 = t1.x.f5173a
            android.view.WindowId r3 = r2.getWindowId()
            r4 = 1
            int r1 = r1 - r4
        L_0x023f:
            if (r1 < 0) goto L_0x02b4
            java.lang.Object r4 = r0.h(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x02b0
            r5 = 0
            java.lang.Object r6 = r0.getOrDefault(r4, r5)
            t1.n r6 = (t1.n) r6
            if (r6 == 0) goto L_0x02b0
            android.view.View r5 = r6.f5134a
            if (r5 == 0) goto L_0x02b0
            t1.h0 r8 = r6.f5137d
            boolean r9 = r8 instanceof t1.g0
            if (r9 == 0) goto L_0x0268
            t1.g0 r8 = (t1.g0) r8
            android.view.WindowId r8 = r8.f5119a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0268
            r8 = 1
            goto L_0x0269
        L_0x0268:
            r8 = 0
        L_0x0269:
            if (r8 == 0) goto L_0x02b0
            r8 = 1
            t1.w r9 = r7.q(r5, r8)
            t1.w r10 = r7.n(r5, r8)
            if (r9 != 0) goto L_0x0287
            if (r10 != 0) goto L_0x0287
            g.h r8 = r7.f5149k
            java.lang.Object r8 = r8.f2725a
            k.b r8 = (k.b) r8
            r11 = 0
            java.lang.Object r5 = r8.getOrDefault(r5, r11)
            r10 = r5
            t1.w r10 = (t1.w) r10
            goto L_0x0288
        L_0x0287:
            r11 = 0
        L_0x0288:
            if (r9 != 0) goto L_0x028c
            if (r10 == 0) goto L_0x0298
        L_0x028c:
            t1.p r5 = r6.f5138e
            t1.w r6 = r6.f5136c
            boolean r5 = r5.r(r6, r10)
            if (r5 == 0) goto L_0x0298
            r5 = 1
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            if (r5 == 0) goto L_0x02b1
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x02ac
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x02a8
            goto L_0x02ac
        L_0x02a8:
            r0.remove(r4)
            goto L_0x02b1
        L_0x02ac:
            r4.cancel()
            goto L_0x02b1
        L_0x02b0:
            r11 = 0
        L_0x02b1:
            int r1 = r1 + -1
            goto L_0x023f
        L_0x02b4:
            g.h r3 = r7.f5148j
            g.h r4 = r7.f5149k
            java.util.ArrayList r5 = r7.f5152n
            java.util.ArrayList r6 = r7.f5153o
            r1 = r7
            r1.l(r2, r3, r4, r5, r6)
            r7.y()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.r.onPreDraw():boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f5162e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        s.f5165c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) s.b().getOrDefault(viewGroup, (Object) null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p) it.next()).x(viewGroup);
            }
        }
        this.f5161d.i(true);
    }
}
