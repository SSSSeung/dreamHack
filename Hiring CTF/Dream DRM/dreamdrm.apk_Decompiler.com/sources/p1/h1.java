package p1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import x0.c;
import y0.o;

public final class h1 extends c {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f4518d;

    /* renamed from: e  reason: collision with root package name */
    public final g1 f4519e;

    public h1(RecyclerView recyclerView) {
        this.f4518d = recyclerView;
        g1 g1Var = this.f4519e;
        this.f4519e = g1Var == null ? new g1(this) : g1Var;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f4518d;
            if (!(!recyclerView.w || recyclerView.D || recyclerView.f1431h.g())) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().R(accessibilityEvent);
                }
            }
        }
    }

    public final void d(View view, o oVar) {
        this.f5549a.onInitializeAccessibilityNodeInfo(view, oVar.f5796a);
        RecyclerView recyclerView = this.f4518d;
        if (!(!recyclerView.w || recyclerView.D || recyclerView.f1431h.g()) && recyclerView.getLayoutManager() != null) {
            o0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f4596b;
            layoutManager.S(recyclerView2.f1428f, recyclerView2.f1432h0, oVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r6 = super.g(r6, r7, r8)
            r8 = 1
            if (r6 == 0) goto L_0x0008
            return r8
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f4518d
            boolean r0 = r6.w
            r1 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r6.D
            if (r0 != 0) goto L_0x001e
            p1.b r0 = r6.f1431h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r8
        L_0x001f:
            if (r0 != 0) goto L_0x00bf
            p1.o0 r0 = r6.getLayoutManager()
            if (r0 == 0) goto L_0x00bf
            p1.o0 r6 = r6.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r6.f4596b
            p1.v0 r0 = r0.f1428f
            int r0 = r6.f4609o
            int r2 = r6.f4608n
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r4 = r6.f4596b
            android.graphics.Matrix r4 = r4.getMatrix()
            boolean r4 = r4.isIdentity()
            if (r4 == 0) goto L_0x0054
            androidx.recyclerview.widget.RecyclerView r4 = r6.f4596b
            boolean r4 = r4.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L_0x0054
            int r0 = r3.height()
            int r2 = r3.width()
        L_0x0054:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r7 == r3) goto L_0x0089
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r3) goto L_0x005f
            r7 = r1
            r0 = r7
            goto L_0x00b3
        L_0x005f:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f4596b
            r3 = -1
            boolean r7 = r7.canScrollVertically(r3)
            if (r7 == 0) goto L_0x0074
            int r7 = r6.E()
            int r0 = r0 - r7
            int r7 = r6.B()
            int r0 = r0 - r7
            int r7 = -r0
            goto L_0x0075
        L_0x0074:
            r7 = r1
        L_0x0075:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f4596b
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L_0x00b2
            int r0 = r6.C()
            int r2 = r2 - r0
            int r0 = r6.D()
            int r2 = r2 - r0
            int r0 = -r2
            goto L_0x00b3
        L_0x0089:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f4596b
            boolean r7 = r7.canScrollVertically(r8)
            if (r7 == 0) goto L_0x009d
            int r7 = r6.E()
            int r0 = r0 - r7
            int r7 = r6.B()
            int r0 = r0 - r7
            r7 = r0
            goto L_0x009e
        L_0x009d:
            r7 = r1
        L_0x009e:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f4596b
            boolean r0 = r0.canScrollHorizontally(r8)
            if (r0 == 0) goto L_0x00b2
            int r0 = r6.C()
            int r2 = r2 - r0
            int r0 = r6.D()
            int r0 = r2 - r0
            goto L_0x00b3
        L_0x00b2:
            r0 = r1
        L_0x00b3:
            if (r7 != 0) goto L_0x00b9
            if (r0 != 0) goto L_0x00b9
            r8 = r1
            goto L_0x00be
        L_0x00b9:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f4596b
            r6.g0(r0, r7, r8)
        L_0x00be:
            return r8
        L_0x00bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.h1.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
