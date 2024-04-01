package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public final class b0 implements LayoutInflater.Factory2 {

    /* renamed from: d  reason: collision with root package name */
    public final l0 f1102d;

    public b0(l0 l0Var) {
        this.f1102d = l0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r10 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r12)
            androidx.fragment.app.l0 r1 = r10.f1102d
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.FragmentContainerView r11 = new androidx.fragment.app.FragmentContainerView
            r11.<init>(r13, r14, r1)
            return r11
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r12 = r0.equals(r12)
            r0 = 0
            if (r12 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r12 = "class"
            java.lang.String r12 = r14.getAttributeValue(r0, r12)
            int[] r2 = j1.a.f3788a
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r14, r2)
            r3 = 0
            if (r12 != 0) goto L_0x0031
            java.lang.String r12 = r2.getString(r3)
        L_0x0031:
            r4 = 1
            r5 = -1
            int r6 = r2.getResourceId(r4, r5)
            r7 = 2
            java.lang.String r8 = r2.getString(r7)
            r2.recycle()
            if (r12 == 0) goto L_0x0197
            java.lang.ClassLoader r2 = r13.getClassLoader()
            java.lang.Class r2 = androidx.fragment.app.f0.b(r2, r12)     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.Class<androidx.fragment.app.r> r9 = androidx.fragment.app.r.class
            boolean r2 = r9.isAssignableFrom(r2)     // Catch:{ ClassNotFoundException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 != 0) goto L_0x0055
            goto L_0x0197
        L_0x0055:
            if (r11 == 0) goto L_0x005b
            int r3 = r11.getId()
        L_0x005b:
            if (r3 != r5) goto L_0x0080
            if (r6 != r5) goto L_0x0080
            if (r8 == 0) goto L_0x0062
            goto L_0x0080
        L_0x0062:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r14.getPositionDescription()
            r13.append(r14)
            java.lang.String r14 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0080:
            if (r6 == r5) goto L_0x0087
            androidx.fragment.app.r r2 = r1.A(r6)
            goto L_0x0088
        L_0x0087:
            r2 = r0
        L_0x0088:
            if (r2 != 0) goto L_0x0090
            if (r8 == 0) goto L_0x0090
            androidx.fragment.app.r r2 = r1.B(r8)
        L_0x0090:
            if (r2 != 0) goto L_0x0098
            if (r3 == r5) goto L_0x0098
            androidx.fragment.app.r r2 = r1.A(r3)
        L_0x0098:
            java.lang.String r5 = "Fragment "
            if (r2 != 0) goto L_0x00de
            androidx.fragment.app.f0 r14 = r1.D()
            r13.getClassLoader()
            androidx.fragment.app.r r2 = r14.a(r12)
            r2.f1266p = r4
            if (r6 == 0) goto L_0x00ad
            r13 = r6
            goto L_0x00ae
        L_0x00ad:
            r13 = r3
        L_0x00ae:
            r2.f1274y = r13
            r2.f1275z = r3
            r2.A = r8
            r2.f1267q = r4
            r2.f1271u = r1
            androidx.fragment.app.u r13 = r1.f1186p
            r2.f1272v = r13
            android.content.Context r14 = r13.f1295r
            r2.F = r4
            if (r13 != 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            android.app.Activity r0 = r13.f1294q
        L_0x00c5:
            if (r0 == 0) goto L_0x00c9
            r2.F = r4
        L_0x00c9:
            androidx.fragment.app.r0 r13 = r1.a(r2)
            boolean r14 = androidx.fragment.app.l0.G(r7)
            if (r14 == 0) goto L_0x0120
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r5)
            r14.append(r2)
            java.lang.String r0 = " has been inflated via the <fragment> tag: id=0x"
            goto L_0x010d
        L_0x00de:
            boolean r13 = r2.f1267q
            if (r13 != 0) goto L_0x0159
            r2.f1267q = r4
            r2.f1271u = r1
            androidx.fragment.app.u r13 = r1.f1186p
            r2.f1272v = r13
            android.content.Context r14 = r13.f1295r
            r2.F = r4
            if (r13 != 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            android.app.Activity r0 = r13.f1294q
        L_0x00f3:
            if (r0 == 0) goto L_0x00f7
            r2.F = r4
        L_0x00f7:
            androidx.fragment.app.r0 r13 = r1.f(r2)
            boolean r14 = androidx.fragment.app.l0.G(r7)
            if (r14 == 0) goto L_0x0120
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Retained Fragment "
            r14.<init>(r0)
            r14.append(r2)
            java.lang.String r0 = " has been re-attached via the <fragment> tag: id=0x"
        L_0x010d:
            r14.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r14)
        L_0x0120:
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r2.G = r11
            r13.k()
            r13.j()
            android.view.View r11 = r2.H
            if (r11 == 0) goto L_0x014d
            if (r6 == 0) goto L_0x0133
            r11.setId(r6)
        L_0x0133:
            android.view.View r11 = r2.H
            java.lang.Object r11 = r11.getTag()
            if (r11 != 0) goto L_0x0140
            android.view.View r11 = r2.H
            r11.setTag(r8)
        L_0x0140:
            android.view.View r11 = r2.H
            androidx.fragment.app.a0 r12 = new androidx.fragment.app.a0
            r12.<init>((androidx.fragment.app.b0) r10, (androidx.fragment.app.r0) r13)
            r11.addOnAttachStateChangeListener(r12)
            android.view.View r11 = r2.H
            return r11
        L_0x014d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r13 = " did not create a view."
            java.lang.String r12 = a2.m.i(r5, r12, r13)
            r11.<init>(r12)
            throw r11
        L_0x0159:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r14.getPositionDescription()
            r13.append(r14)
            java.lang.String r14 = ": Duplicate id 0x"
            r13.append(r14)
            java.lang.String r14 = java.lang.Integer.toHexString(r6)
            r13.append(r14)
            java.lang.String r14 = ", tag "
            r13.append(r14)
            r13.append(r8)
            java.lang.String r14 = ", or parent id 0x"
            r13.append(r14)
            java.lang.String r14 = java.lang.Integer.toHexString(r3)
            r13.append(r14)
            java.lang.String r14 = " with another fragment for "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x0197:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
