package q3;

import a2.m;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.d;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class c extends d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f4906f;

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f4906f = sideSheetBehavior;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r5 = r5.f2009p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(android.view.View r4, int r5) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r5 = r3.f4906f
            int r0 = r5.f2001h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.ref.WeakReference r5 = r5.f2009p
            if (r5 == 0) goto L_0x0014
            java.lang.Object r5 = r5.get()
            if (r5 != r4) goto L_0x0014
            r1 = r2
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.c.C(android.view.View, int):boolean");
    }

    public final int f(View view, int i3) {
        int i6;
        int i7;
        SideSheetBehavior sideSheetBehavior = this.f4906f;
        a aVar = sideSheetBehavior.f1994a;
        switch (aVar.f4902g) {
            case 0:
                i6 = -aVar.f4903h.f2005l;
                break;
            default:
                i6 = aVar.Y();
                break;
        }
        a aVar2 = sideSheetBehavior.f1994a;
        int i8 = aVar2.f4902g;
        SideSheetBehavior sideSheetBehavior2 = aVar2.f4903h;
        switch (i8) {
            case 0:
                i7 = sideSheetBehavior2.f2008o;
                break;
            default:
                i7 = sideSheetBehavior2.f2006m;
                break;
        }
        return d.e(i3, i6, i7);
    }

    public final int g(View view, int i3) {
        return view.getTop();
    }

    public final int n(View view) {
        SideSheetBehavior sideSheetBehavior = this.f4906f;
        return sideSheetBehavior.f2005l + sideSheetBehavior.f2008o;
    }

    public final void v(int i3) {
        if (i3 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f4906f;
            if (sideSheetBehavior.f2000g) {
                sideSheetBehavior.s(1);
            }
        }
    }

    public final void w(View view, int i3, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f4906f;
        WeakReference weakReference = sideSheetBehavior.f2010q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
            a aVar = sideSheetBehavior.f1994a;
            int left = view.getLeft();
            int right = view.getRight();
            int i7 = aVar.f4902g;
            SideSheetBehavior sideSheetBehavior2 = aVar.f4903h;
            switch (i7) {
                case 0:
                    if (left <= sideSheetBehavior2.f2006m) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i8 = sideSheetBehavior2.f2006m;
                    if (left <= i8) {
                        marginLayoutParams.rightMargin = i8 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f2014u;
        if (!linkedHashSet.isEmpty()) {
            sideSheetBehavior.f1994a.X(i3);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                m.o(it.next());
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if ((java.lang.Math.abs(r5) > java.lang.Math.abs(r6)) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (java.lang.Math.abs(r5 - r0.f1994a.Y()) < java.lang.Math.abs(r5 - r0.f1994a.Z())) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.f1994a.e0(r4) == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f4906f
            q3.a r1 = r0.f1994a
            boolean r1 = r1.d0(r5)
            r2 = 1
            if (r1 == 0) goto L_0x000c
            goto L_0x0058
        L_0x000c:
            q3.a r1 = r0.f1994a
            boolean r1 = r1.g0(r4, r5)
            if (r1 == 0) goto L_0x0025
            q3.a r1 = r0.f1994a
            boolean r5 = r1.f0(r5, r6)
            if (r5 != 0) goto L_0x005a
            q3.a r5 = r0.f1994a
            boolean r5 = r5.e0(r4)
            if (r5 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0025:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003b
            float r5 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r6)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0038
            r5 = r2
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 != 0) goto L_0x005a
        L_0x003b:
            int r5 = r4.getLeft()
            q3.a r6 = r0.f1994a
            int r6 = r6.Y()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            q3.a r1 = r0.f1994a
            int r1 = r1.Z()
            int r5 = r5 - r1
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L_0x005a
        L_0x0058:
            r5 = 3
            goto L_0x005b
        L_0x005a:
            r5 = 5
        L_0x005b:
            r0.t(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.c.x(android.view.View, float, float):void");
    }
}
