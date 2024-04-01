package b3;

import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.d;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class a extends d {

    /* renamed from: f  reason: collision with root package name */
    public int f1581f;

    /* renamed from: g  reason: collision with root package name */
    public int f1582g = -1;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1583h;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f1583h = swipeDismissBehavior;
    }

    public final boolean C(View view, int i3) {
        int i6 = this.f1582g;
        return (i6 == -1 || i6 == i3) && this.f1583h.r(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r0 = r3.f1581f - r4.getWidth();
        r4 = r3.f1581f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(android.view.View r4, int r5) {
        /*
            r3 = this;
            java.util.WeakHashMap r0 = x0.u0.f5622a
            int r0 = x0.e0.d(r4)
            r1 = 1
            if (r0 != r1) goto L_0x000b
            r0 = r1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.f1583h
            int r2 = r2.f1828d
            if (r2 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x0019
            goto L_0x0021
        L_0x0015:
            if (r2 != r1) goto L_0x002b
            if (r0 == 0) goto L_0x0021
        L_0x0019:
            int r0 = r3.f1581f
            int r4 = r4.getWidth()
            int r4 = r4 + r0
            goto L_0x0039
        L_0x0021:
            int r0 = r3.f1581f
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.f1581f
            goto L_0x0039
        L_0x002b:
            int r0 = r3.f1581f
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.f1581f
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L_0x0039:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.a.f(android.view.View, int):int");
    }

    public final int g(View view, int i3) {
        return view.getTop();
    }

    public final int n(View view) {
        return view.getWidth();
    }

    public final void u(View view, int i3) {
        this.f1582g = i3;
        this.f1581f = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f1583h;
            swipeDismissBehavior.f1827c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1827c = false;
        }
    }

    public final void v(int i3) {
        this.f1583h.getClass();
    }

    public final void w(View view, int i3, int i6) {
        SwipeDismissBehavior swipeDismissBehavior = this.f1583h;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.f1830f;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.f1831g;
        float abs = (float) Math.abs(i3 - this.f1581f);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.f1581f) >= java.lang.Math.round(((float) r9.getWidth()) * r3.f1829e)) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f1582g = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f1583h
            r4 = 0
            if (r1 == 0) goto L_0x0039
            java.util.WeakHashMap r5 = x0.u0.f5622a
            int r5 = x0.e0.d(r9)
            if (r5 != r2) goto L_0x001a
            r5 = r2
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            int r6 = r3.f1828d
            r7 = 2
            if (r6 != r7) goto L_0x0021
            goto L_0x0052
        L_0x0021:
            if (r6 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0054
            goto L_0x0052
        L_0x002a:
            if (r1 <= 0) goto L_0x0054
            goto L_0x0052
        L_0x002d:
            if (r6 != r2) goto L_0x0054
            if (r5 == 0) goto L_0x0034
            if (r1 <= 0) goto L_0x0054
            goto L_0x0052
        L_0x0034:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0054
            goto L_0x0052
        L_0x0039:
            int r1 = r9.getLeft()
            int r5 = r8.f1581f
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f1829e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L_0x0054
        L_0x0052:
            r1 = r2
            goto L_0x0055
        L_0x0054:
            r1 = r4
        L_0x0055:
            if (r1 == 0) goto L_0x006b
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0066
            int r10 = r9.getLeft()
            int r0 = r8.f1581f
            if (r10 >= r0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            int r0 = r0 + r11
            goto L_0x006e
        L_0x0066:
            int r10 = r8.f1581f
            int r0 = r10 - r11
            goto L_0x006e
        L_0x006b:
            int r0 = r8.f1581f
            r2 = r4
        L_0x006e:
            f1.d r10 = r3.f1825a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L_0x0084
            b3.b r10 = new b3.b
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = x0.u0.f5622a
            x0.d0.m(r9, r10)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.a.x(android.view.View, float, float):void");
    }
}
