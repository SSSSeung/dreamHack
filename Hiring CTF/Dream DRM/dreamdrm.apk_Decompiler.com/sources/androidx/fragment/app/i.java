package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import k.b;
import k.g;
import x0.j0;
import x0.u0;
import x0.x0;

public final class i extends h1 {
    public i(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!x0.b(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        i(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(b bVar, View view) {
        WeakHashMap weakHashMap = u0.f5622a;
        String k6 = j0.k(view);
        if (k6 != null) {
            bVar.put(k6, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(b bVar, Collection collection) {
        Iterator it = ((g) bVar.entrySet()).iterator();
        while (it.hasNext()) {
            WeakHashMap weakHashMap = u0.f5622a;
            if (!collection.contains(j0.k((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x04f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r36, boolean r37) {
        /*
            r35 = this;
            r6 = r35
            r7 = r37
            java.util.Iterator r0 = r36.iterator()
            r9 = 0
            r10 = 0
        L_0x000a:
            boolean r1 = r0.hasNext()
            r11 = 3
            r12 = 2
            r13 = 1
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.g1 r1 = (androidx.fragment.app.g1) r1
            androidx.fragment.app.r r2 = r1.f1148c
            android.view.View r2 = r2.H
            int r2 = a2.m.c(r2)
            int r3 = r1.f1146a
            int r3 = y.d.b(r3)
            if (r3 == 0) goto L_0x0034
            if (r3 == r13) goto L_0x0030
            if (r3 == r12) goto L_0x0034
            if (r3 == r11) goto L_0x0034
            goto L_0x000a
        L_0x0030:
            if (r2 == r12) goto L_0x000a
            r10 = r1
            goto L_0x000a
        L_0x0034:
            if (r2 != r12) goto L_0x000a
            if (r9 != 0) goto L_0x000a
            r9 = r1
            goto L_0x000a
        L_0x003a:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = r36
            r5.<init>(r0)
            java.util.Iterator r0 = r36.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.g1 r1 = (androidx.fragment.app.g1) r1
            t0.d r2 = new t0.d
            r2.<init>()
            r1.d()
            java.util.HashSet r3 = r1.f1150e
            r3.add(r2)
            androidx.fragment.app.g r3 = new androidx.fragment.app.g
            r3.<init>(r1, r2, r7)
            r14.add(r3)
            t0.d r2 = new t0.d
            r2.<init>()
            r1.d()
            java.util.HashSet r3 = r1.f1150e
            r3.add(r2)
            androidx.fragment.app.h r3 = new androidx.fragment.app.h
            if (r7 == 0) goto L_0x0084
            if (r1 != r9) goto L_0x0088
            goto L_0x0086
        L_0x0084:
            if (r1 != r10) goto L_0x0088
        L_0x0086:
            r4 = r13
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            r3.<init>(r1, r2, r7, r4)
            r15.add(r3)
            androidx.fragment.app.u0 r2 = new androidx.fragment.app.u0
            r2.<init>(r6, r5, r1)
            java.util.ArrayList r1 = r1.f1149d
            r1.add(r2)
            goto L_0x004f
        L_0x009a:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r0 = r15.iterator()
            r2 = 0
        L_0x00a4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0130
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.h r1 = (androidx.fragment.app.h) r1
            boolean r16 = r1.f()
            if (r16 == 0) goto L_0x00ba
            r16 = r0
            goto L_0x0129
        L_0x00ba:
            java.lang.Object r13 = r1.f1154f
            androidx.fragment.app.c1 r12 = r1.i(r13)
            java.lang.Object r11 = r1.f1156h
            androidx.fragment.app.c1 r8 = r1.i(r11)
            java.lang.String r4 = " returned Transition "
            r16 = r0
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r12 == 0) goto L_0x00f9
            if (r8 == 0) goto L_0x00f9
            if (r12 != r8) goto L_0x00d3
            goto L_0x00f9
        L_0x00d3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.Object r0 = r1.f2280d
            androidx.fragment.app.g1 r0 = (androidx.fragment.app.g1) r0
            androidx.fragment.app.r r0 = r0.f1148c
            r3.append(r0)
            r3.append(r4)
            r3.append(r13)
            java.lang.String r0 = " which uses a different Transition  type than its shared element transition "
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00f9:
            if (r12 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r12 = r8
        L_0x00fd:
            if (r2 != 0) goto L_0x0101
            r2 = r12
            goto L_0x0129
        L_0x0101:
            if (r12 == 0) goto L_0x0129
            if (r2 != r12) goto L_0x0106
            goto L_0x0129
        L_0x0106:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.Object r0 = r1.f2280d
            androidx.fragment.app.g1 r0 = (androidx.fragment.app.g1) r0
            androidx.fragment.app.r r0 = r0.f1148c
            r3.append(r0)
            r3.append(r4)
            r3.append(r13)
            java.lang.String r0 = " which uses a different Transition  type than other Fragments."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0129:
            r0 = r16
            r11 = 3
            r12 = 2
            r13 = 1
            goto L_0x00a4
        L_0x0130:
            android.view.ViewGroup r13 = r6.f1157a
            java.lang.String r12 = "FragmentManager"
            if (r2 != 0) goto L_0x015b
            java.util.Iterator r0 = r15.iterator()
        L_0x013a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0153
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.h r1 = (androidx.fragment.app.h) r1
            java.lang.Object r2 = r1.f2280d
            androidx.fragment.app.g1 r2 = (androidx.fragment.app.g1) r2
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put(r2, r4)
            r1.b()
            goto L_0x013a
        L_0x0153:
            r15 = r6
            r26 = r14
            r0 = 0
            r6 = r5
            r14 = r12
            goto L_0x052d
        L_0x015b:
            android.view.View r8 = new android.view.View
            android.content.Context r0 = r13.getContext()
            r8.<init>(r0)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k.b r0 = new k.b
            r0.<init>()
            java.util.Iterator r24 = r15.iterator()
            r16 = r3
            r17 = r5
            r5 = r9
            r27 = r12
            r26 = r14
            r3 = 0
            r12 = 0
            r25 = 0
            r14 = r10
        L_0x018a:
            boolean r18 = r24.hasNext()
            if (r18 == 0) goto L_0x0356
            java.lang.Object r18 = r24.next()
            r28 = r3
            r3 = r18
            androidx.fragment.app.h r3 = (androidx.fragment.app.h) r3
            java.lang.Object r3 = r3.f1156h
            if (r3 == 0) goto L_0x01a1
            r18 = 1
            goto L_0x01a3
        L_0x01a1:
            r18 = 0
        L_0x01a3:
            if (r18 == 0) goto L_0x0338
            if (r5 == 0) goto L_0x0338
            if (r14 == 0) goto L_0x0338
            java.lang.Object r3 = r2.f(r3)
            java.lang.Object r12 = r2.t(r3)
            androidx.fragment.app.r r3 = r14.f1148c
            androidx.fragment.app.p r14 = r3.K
            if (r14 == 0) goto L_0x01bb
            java.util.ArrayList r14 = r14.f1234i
            if (r14 != 0) goto L_0x01c0
        L_0x01bb:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x01c0:
            androidx.fragment.app.r r5 = r5.f1148c
            androidx.fragment.app.p r6 = r5.K
            if (r6 == 0) goto L_0x01ca
            java.util.ArrayList r6 = r6.f1234i
            if (r6 != 0) goto L_0x01cf
        L_0x01ca:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x01cf:
            r29 = r15
            androidx.fragment.app.p r15 = r5.K
            if (r15 == 0) goto L_0x01d9
            java.util.ArrayList r15 = r15.f1235j
            if (r15 != 0) goto L_0x01de
        L_0x01d9:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x01de:
            r30 = r8
            r31 = r11
            r8 = 0
        L_0x01e3:
            int r11 = r15.size()
            r18 = r2
            r2 = -1
            if (r8 >= r11) goto L_0x0202
            java.lang.Object r11 = r15.get(r8)
            int r11 = r14.indexOf(r11)
            if (r11 == r2) goto L_0x01fd
            java.lang.Object r2 = r6.get(r8)
            r14.set(r11, r2)
        L_0x01fd:
            int r8 = r8 + 1
            r2 = r18
            goto L_0x01e3
        L_0x0202:
            androidx.fragment.app.p r6 = r3.K
            if (r6 == 0) goto L_0x020a
            java.util.ArrayList r6 = r6.f1235j
            if (r6 != 0) goto L_0x020f
        L_0x020a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x020f:
            int r8 = r14.size()
            r11 = 0
        L_0x0214:
            if (r11 >= r8) goto L_0x022b
            java.lang.Object r15 = r14.get(r11)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r19 = r6.get(r11)
            r2 = r19
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r15, r2)
            int r11 = r11 + 1
            r2 = -1
            goto L_0x0214
        L_0x022b:
            k.b r2 = new k.b
            r2.<init>()
            android.view.View r8 = r5.H
            j(r2, r8)
            h.d.n(r2, r14)
            java.util.Set r8 = r2.keySet()
            h.d.n(r0, r8)
            k.b r8 = new k.b
            r8.<init>()
            android.view.View r11 = r3.H
            j(r8, r11)
            h.d.n(r8, r6)
            java.util.Collection r11 = r0.values()
            h.d.n(r8, r11)
            androidx.fragment.app.a1 r11 = androidx.fragment.app.v0.f1307a
            int r11 = r0.f3895f
        L_0x0257:
            r15 = -1
            int r11 = r11 + r15
            if (r11 < 0) goto L_0x026d
            java.lang.Object r19 = r0.l(r11)
            r15 = r19
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = r8.containsKey(r15)
            if (r15 != 0) goto L_0x0257
            r0.j(r11)
            goto L_0x0257
        L_0x026d:
            java.util.Set r11 = r0.keySet()
            k(r2, r11)
            java.util.Collection r11 = r0.values()
            k(r8, r11)
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0296
            r4.clear()
            r1.clear()
            r15 = r0
            r7 = r4
            r5 = r9
            r14 = r10
            r3 = r16
            r6 = r17
            r2 = r18
            r0 = r30
            r12 = 0
            goto L_0x0343
        L_0x0296:
            androidx.fragment.app.v0.a(r3, r5, r7)
            androidx.fragment.app.e r3 = new androidx.fragment.app.e
            r3.<init>(r10, r9, r7, r8)
            x0.v.a(r13, r3)
            java.util.Collection r3 = r2.values()
            r4.addAll(r3)
            boolean r3 = r14.isEmpty()
            if (r3 != 0) goto L_0x02c4
            r5 = 0
            java.lang.Object r3 = r14.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            r11 = 0
            java.lang.Object r2 = r2.getOrDefault(r3, r11)
            android.view.View r2 = (android.view.View) r2
            r3 = r18
            r3.n(r2, r12)
            r28 = r2
            goto L_0x02c8
        L_0x02c4:
            r3 = r18
            r5 = 0
            r11 = 0
        L_0x02c8:
            java.util.Collection r2 = r8.values()
            r1.addAll(r2)
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x0307
            java.lang.Object r2 = r6.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r8.getOrDefault(r2, r11)
            r6 = r2
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x0307
            h.g r8 = new h.g
            r11 = 1
            r15 = r0
            r0 = r8
            r14 = r1
            r1 = r35
            r2 = r3
            r33 = r3
            r32 = r16
            r3 = r6
            r6 = r5
            r5 = r4
            r4 = r31
            r7 = r5
            r6 = r17
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            x0.v.a(r13, r8)
            r0 = r30
            r2 = r33
            r25 = 1
            goto L_0x0314
        L_0x0307:
            r15 = r0
            r14 = r1
            r33 = r3
            r7 = r4
            r32 = r16
            r6 = r17
            r0 = r30
            r2 = r33
        L_0x0314:
            r2.r(r12, r0, r7)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r17 = r12
            r22 = r12
            r23 = r14
            r16.m(r17, r18, r19, r20, r21, r22, r23)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3 = r32
            r3.put(r9, r1)
            r3.put(r10, r1)
            r5 = r9
            r1 = r14
            r14 = r10
            goto L_0x0343
        L_0x0338:
            r7 = r4
            r31 = r11
            r29 = r15
            r3 = r16
            r6 = r17
            r15 = r0
            r0 = r8
        L_0x0343:
            r8 = r0
            r16 = r3
            r17 = r6
            r4 = r7
            r0 = r15
            r3 = r28
            r15 = r29
            r11 = r31
            r6 = r35
            r7 = r37
            goto L_0x018a
        L_0x0356:
            r28 = r3
            r7 = r4
            r31 = r11
            r29 = r15
            r3 = r16
            r6 = r17
            r15 = r0
            r0 = r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r29.iterator()
            r24 = r15
            r11 = 0
            r15 = r14
            r14 = 0
        L_0x0371:
            boolean r16 = r8.hasNext()
            if (r16 == 0) goto L_0x0473
            java.lang.Object r16 = r8.next()
            r37 = r8
            r8 = r16
            androidx.fragment.app.h r8 = (androidx.fragment.app.h) r8
            boolean r16 = r8.f()
            if (r16 == 0) goto L_0x039e
            r30 = r10
            java.lang.Object r10 = r8.f2280d
            androidx.fragment.app.g1 r10 = (androidx.fragment.app.g1) r10
            r32 = r9
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r3.put(r10, r9)
            r8.b()
            r8 = r37
            r10 = r30
            r9 = r32
            goto L_0x0371
        L_0x039e:
            r32 = r9
            r30 = r10
            java.lang.Object r9 = r8.f1154f
            java.lang.Object r9 = r2.f(r9)
            java.lang.Object r10 = r8.f2280d
            androidx.fragment.app.g1 r10 = (androidx.fragment.app.g1) r10
            if (r12 == 0) goto L_0x03b4
            if (r10 == r5) goto L_0x03b2
            if (r10 != r15) goto L_0x03b4
        L_0x03b2:
            r15 = 1
            goto L_0x03b5
        L_0x03b4:
            r15 = 0
        L_0x03b5:
            if (r9 != 0) goto L_0x03ce
            if (r15 != 0) goto L_0x03c1
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.put(r10, r5)
            r8.b()
        L_0x03c1:
            r8 = 0
            r15 = r35
            r34 = r11
            r33 = r12
            r11 = r28
            r5 = r31
            goto L_0x0461
        L_0x03ce:
            r33 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r34 = r11
            androidx.fragment.app.r r11 = r10.f1148c
            android.view.View r11 = r11.H
            i(r12, r11)
            if (r15 == 0) goto L_0x03e9
            if (r10 != r5) goto L_0x03e6
            r12.removeAll(r7)
            goto L_0x03e9
        L_0x03e6:
            r12.removeAll(r1)
        L_0x03e9:
            boolean r5 = r12.isEmpty()
            if (r5 == 0) goto L_0x03f5
            r2.a(r0, r9)
        L_0x03f2:
            r15 = r35
            goto L_0x042f
        L_0x03f5:
            r2.b(r9, r12)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r2
            r17 = r9
            r18 = r9
            r19 = r12
            r16.m(r17, r18, r19, r20, r21, r22, r23)
            int r5 = r10.f1146a
            r11 = 3
            if (r5 != r11) goto L_0x03f2
            r6.remove(r10)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r12)
            androidx.fragment.app.r r11 = r10.f1148c
            android.view.View r15 = r11.H
            r5.remove(r15)
            android.view.View r11 = r11.H
            r2.l(r9, r11, r5)
            androidx.fragment.app.f r5 = new androidx.fragment.app.f
            r11 = 0
            r15 = r35
            r5.<init>(r15, r11, r12)
            x0.v.a(r13, r5)
        L_0x042f:
            int r5 = r10.f1146a
            r11 = 2
            if (r5 != r11) goto L_0x0441
            r4.addAll(r12)
            r5 = r31
            if (r25 == 0) goto L_0x043e
            r2.o(r9, r5)
        L_0x043e:
            r11 = r28
            goto L_0x0448
        L_0x0441:
            r11 = r28
            r5 = r31
            r2.n(r11, r9)
        L_0x0448:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r3.put(r10, r12)
            boolean r8 = r8.f1155g
            if (r8 == 0) goto L_0x0458
            r8 = 0
            java.lang.Object r9 = r2.j(r14, r9, r8)
            r14 = r9
            goto L_0x0461
        L_0x0458:
            r10 = r34
            r8 = 0
            java.lang.Object r9 = r2.j(r10, r9, r8)
            r34 = r9
        L_0x0461:
            r8 = r37
            r31 = r5
            r28 = r11
            r10 = r30
            r15 = r10
            r5 = r32
            r9 = r5
            r12 = r33
            r11 = r34
            goto L_0x0371
        L_0x0473:
            r15 = r35
            r32 = r9
            r30 = r10
            r10 = r11
            java.lang.Object r0 = r2.i(r14, r10, r12)
            java.util.Iterator r5 = r29.iterator()
        L_0x0482:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x050a
            java.lang.Object r8 = r5.next()
            androidx.fragment.app.h r8 = (androidx.fragment.app.h) r8
            boolean r9 = r8.f()
            if (r9 == 0) goto L_0x0495
            goto L_0x0482
        L_0x0495:
            java.lang.Object r9 = r8.f2280d
            androidx.fragment.app.g1 r9 = (androidx.fragment.app.g1) r9
            if (r12 == 0) goto L_0x04a7
            r10 = r32
            r11 = r30
            if (r9 == r10) goto L_0x04a3
            if (r9 != r11) goto L_0x04ab
        L_0x04a3:
            r37 = r5
            r14 = 1
            goto L_0x04ae
        L_0x04a7:
            r11 = r30
            r10 = r32
        L_0x04ab:
            r37 = r5
            r14 = 0
        L_0x04ae:
            java.lang.Object r5 = r8.f1154f
            if (r5 != 0) goto L_0x04b8
            if (r14 == 0) goto L_0x04b5
            goto L_0x04b8
        L_0x04b5:
            r14 = r27
            goto L_0x04e8
        L_0x04b8:
            java.util.WeakHashMap r5 = x0.u0.f5622a
            boolean r5 = x0.g0.c(r13)
            if (r5 != 0) goto L_0x04f1
            r5 = 2
            boolean r14 = androidx.fragment.app.l0.G(r5)
            if (r14 == 0) goto L_0x04e3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r14 = "SpecialEffectsController: Container "
            r5.<init>(r14)
            r5.append(r13)
            java.lang.String r14 = " has not been laid out. Completing operation "
            r5.append(r14)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            r14 = r27
            android.util.Log.v(r14, r5)
            goto L_0x04e5
        L_0x04e3:
            r14 = r27
        L_0x04e5:
            r8.b()
        L_0x04e8:
            r5 = r37
            r32 = r10
            r30 = r11
            r27 = r14
            goto L_0x0482
        L_0x04f1:
            r14 = r27
            java.lang.Object r5 = r8.f2280d
            androidx.fragment.app.g1 r5 = (androidx.fragment.app.g1) r5
            androidx.fragment.app.r r5 = r5.f1148c
            androidx.fragment.app.f r5 = new androidx.fragment.app.f
            r9 = 1
            r5.<init>(r15, r9, r8)
            r2.p(r0, r5)
            r5 = r37
            r32 = r10
            r30 = r11
            goto L_0x0482
        L_0x050a:
            r14 = r27
            java.util.WeakHashMap r5 = x0.u0.f5622a
            boolean r5 = x0.g0.c(r13)
            if (r5 != 0) goto L_0x0516
            r0 = 0
            goto L_0x052d
        L_0x0516:
            r5 = 4
            androidx.fragment.app.v0.b(r4, r5)
            java.util.ArrayList r5 = androidx.fragment.app.c1.k(r1)
            r2.c(r13, r0)
            r0 = r24
            androidx.fragment.app.c1.q(r13, r7, r1, r5, r0)
            r0 = 0
            androidx.fragment.app.v0.b(r4, r0)
            r2.s(r12, r7, r1)
        L_0x052d:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r3.containsValue(r1)
            android.content.Context r2 = r13.getContext()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r26.iterator()
            r7 = r0
        L_0x0541:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x05e2
            java.lang.Object r8 = r5.next()
            r12 = r8
            androidx.fragment.app.g r12 = (androidx.fragment.app.g) r12
            boolean r8 = r12.f()
            if (r8 == 0) goto L_0x0555
            goto L_0x055b
        L_0x0555:
            androidx.fragment.app.y r8 = r12.i(r2)
            if (r8 != 0) goto L_0x055f
        L_0x055b:
            r12.b()
            goto L_0x0598
        L_0x055f:
            android.animation.Animator r11 = r8.f1321b
            if (r11 != 0) goto L_0x0567
            r4.add(r12)
            goto L_0x0598
        L_0x0567:
            java.lang.Object r8 = r12.f2280d
            r10 = r8
            androidx.fragment.app.g1 r10 = (androidx.fragment.app.g1) r10
            androidx.fragment.app.r r8 = r10.f1148c
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r3.get(r10)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x059a
            r0 = 2
            boolean r9 = androidx.fragment.app.l0.G(r0)
            if (r9 == 0) goto L_0x055b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "Ignoring Animator set on "
            r0.<init>(r9)
            r0.append(r8)
            java.lang.String r8 = " as this Fragment was involved in a Transition."
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r14, r0)
            goto L_0x055b
        L_0x0598:
            r0 = 0
            goto L_0x0541
        L_0x059a:
            int r0 = r10.f1146a
            r9 = 3
            if (r0 != r9) goto L_0x05a1
            r0 = 1
            goto L_0x05a2
        L_0x05a1:
            r0 = 0
        L_0x05a2:
            if (r0 == 0) goto L_0x05a7
            r6.remove(r10)
        L_0x05a7:
            android.view.View r8 = r8.H
            r13.startViewTransition(r8)
            androidx.fragment.app.c r7 = new androidx.fragment.app.c
            r37 = r7
            r16 = r8
            r8 = r13
            r17 = r9
            r9 = r16
            r18 = r10
            r10 = r0
            r0 = r11
            r11 = r18
            r32 = r3
            r3 = r14
            r14 = r12
            r7.<init>(r8, r9, r10, r11, r12)
            r0.addListener(r7)
            r7 = r16
            r0.setTarget(r7)
            r0.start()
            java.lang.Object r7 = r14.f2281e
            t0.d r7 = (t0.d) r7
            androidx.fragment.app.c0 r8 = new androidx.fragment.app.c0
            r8.<init>(r15, r0)
            r7.b(r8)
            r14 = r3
            r3 = r32
            r0 = 0
            r7 = 1
            goto L_0x0541
        L_0x05e2:
            r3 = r14
            java.util.Iterator r0 = r4.iterator()
        L_0x05e7:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x066a
            java.lang.Object r4 = r0.next()
            androidx.fragment.app.g r4 = (androidx.fragment.app.g) r4
            java.lang.Object r5 = r4.f2280d
            androidx.fragment.app.g1 r5 = (androidx.fragment.app.g1) r5
            androidx.fragment.app.r r8 = r5.f1148c
            java.lang.String r9 = "Ignoring Animation set on "
            r10 = 2
            if (r1 == 0) goto L_0x060f
            boolean r5 = androidx.fragment.app.l0.G(r10)
            if (r5 == 0) goto L_0x062b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r9)
            r5.append(r8)
            java.lang.String r8 = " as Animations cannot run alongside Transitions."
            goto L_0x0621
        L_0x060f:
            if (r7 == 0) goto L_0x062f
            boolean r5 = androidx.fragment.app.l0.G(r10)
            if (r5 == 0) goto L_0x062b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r9)
            r5.append(r8)
            java.lang.String r8 = " as Animations cannot run alongside Animators."
        L_0x0621:
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r3, r5)
        L_0x062b:
            r4.b()
            goto L_0x05e7
        L_0x062f:
            android.view.View r8 = r8.H
            androidx.fragment.app.y r9 = r4.i(r2)
            r9.getClass()
            android.view.animation.Animation r9 = r9.f1320a
            r9.getClass()
            int r5 = r5.f1146a
            r11 = 1
            if (r5 == r11) goto L_0x0649
            r8.startAnimation(r9)
            r4.b()
            goto L_0x065c
        L_0x0649:
            r13.startViewTransition(r8)
            androidx.fragment.app.z r5 = new androidx.fragment.app.z
            r5.<init>(r9, r13, r8)
            androidx.fragment.app.d r9 = new androidx.fragment.app.d
            r9.<init>((android.view.View) r8, (android.view.ViewGroup) r13, (androidx.fragment.app.g) r4, (androidx.fragment.app.i) r15)
            r5.setAnimationListener(r9)
            r8.startAnimation(r5)
        L_0x065c:
            java.lang.Object r5 = r4.f2281e
            t0.d r5 = (t0.d) r5
            g.h r9 = new g.h
            r9.<init>(r8, r13, r4, r15)
            r5.b(r9)
            goto L_0x05e7
        L_0x066a:
            java.util.Iterator r0 = r6.iterator()
        L_0x066e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0684
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.g1 r1 = (androidx.fragment.app.g1) r1
            androidx.fragment.app.r r2 = r1.f1148c
            android.view.View r2 = r2.H
            int r1 = r1.f1146a
            a2.m.a(r1, r2)
            goto L_0x066e
        L_0x0684:
            r6.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.b(java.util.ArrayList, boolean):void");
    }
}
