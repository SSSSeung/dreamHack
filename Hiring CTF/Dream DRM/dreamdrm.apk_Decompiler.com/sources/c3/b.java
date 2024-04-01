package c3;

import android.view.View;
import com.bumptech.glide.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

public final class b extends d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1624f;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f1624f = bottomSheetBehavior;
    }

    public final boolean C(View view, int i3) {
        BottomSheetBehavior bottomSheetBehavior = this.f1624f;
        int i6 = bottomSheetBehavior.L;
        if (i6 == 1 || bottomSheetBehavior.f1834a0) {
            return false;
        }
        if (i6 == 3 && bottomSheetBehavior.Y == i3) {
            WeakReference weakReference = bottomSheetBehavior.V;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }

    public final int f(View view, int i3) {
        return view.getLeft();
    }

    public final int g(View view, int i3) {
        return d.e(i3, this.f1624f.x(), o());
    }

    public final int o() {
        BottomSheetBehavior bottomSheetBehavior = this.f1624f;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
    }

    public final void v(int i3) {
        if (i3 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f1624f;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.E(1);
            }
        }
    }

    public final void w(View view, int i3, int i6) {
        this.f1624f.u(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (java.lang.Math.abs(r5.getTop() - r3.x()) < java.lang.Math.abs(r5.getTop() - r3.E)) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (java.lang.Math.abs(r6 - r3.E) < java.lang.Math.abs(r6 - r3.G)) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        if (java.lang.Math.abs(r6 - r3.D) < java.lang.Math.abs(r6 - r3.G)) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (r6 < java.lang.Math.abs(r6 - r3.G)) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.G)) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r6 > r3.E) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r4.f1624f
            if (r1 >= 0) goto L_0x001b
            boolean r6 = r3.f1835b
            if (r6 == 0) goto L_0x000e
            goto L_0x00c4
        L_0x000e:
            int r6 = r5.getTop()
            java.lang.System.currentTimeMillis()
            int r7 = r3.E
            if (r6 <= r7) goto L_0x00c4
            goto L_0x00d5
        L_0x001b:
            boolean r1 = r3.I
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.F(r5, r7)
            if (r1 == 0) goto L_0x0070
            float r6 = java.lang.Math.abs(r6)
            float r0 = java.lang.Math.abs(r7)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0038
            int r6 = r3.f1839d
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x004c
        L_0x0038:
            int r6 = r5.getTop()
            int r7 = r3.T
            int r0 = r3.x()
            int r0 = r0 + r7
            int r0 = r0 / 2
            if (r6 <= r0) goto L_0x0049
            r6 = r2
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 == 0) goto L_0x004f
        L_0x004c:
            r6 = 5
            goto L_0x00d8
        L_0x004f:
            boolean r6 = r3.f1835b
            if (r6 == 0) goto L_0x0055
            goto L_0x00c4
        L_0x0055:
            int r6 = r5.getTop()
            int r7 = r3.x()
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.getTop()
            int r0 = r3.E
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto L_0x00d5
            goto L_0x00c4
        L_0x0070:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0081
            goto L_0x009c
        L_0x0081:
            boolean r6 = r3.f1835b
            if (r6 == 0) goto L_0x0086
            goto L_0x00d7
        L_0x0086:
            int r6 = r5.getTop()
            int r7 = r3.E
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x00d7
            goto L_0x00d5
        L_0x009c:
            int r6 = r5.getTop()
            boolean r7 = r3.f1835b
            if (r7 == 0) goto L_0x00b6
            int r7 = r3.D
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x00d7
            goto L_0x00c4
        L_0x00b6:
            int r7 = r3.E
            if (r6 >= r7) goto L_0x00c6
            int r7 = r3.G
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto L_0x00d5
        L_0x00c4:
            r6 = 3
            goto L_0x00d8
        L_0x00c6:
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x00d7
        L_0x00d5:
            r6 = 6
            goto L_0x00d8
        L_0x00d7:
            r6 = 4
        L_0x00d8:
            r3.getClass()
            r3.G(r5, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.b.x(android.view.View, float, float):void");
    }
}
