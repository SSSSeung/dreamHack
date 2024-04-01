package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

public final class q3 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f741a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f742b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f743c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f744d;

    /* renamed from: e  reason: collision with root package name */
    public final int f745e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f746f;

    public q3(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f745e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f742b = rect3;
        Rect rect4 = new Rect();
        this.f744d = rect4;
        Rect rect5 = new Rect();
        this.f743c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f741a = searchAutoComplete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            int r2 = r9.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r5) goto L_0x0020
            if (r2 == r3) goto L_0x0020
            r6 = 3
            if (r2 == r6) goto L_0x001b
            goto L_0x003f
        L_0x001b:
            boolean r2 = r8.f746f
            r8.f746f = r4
            goto L_0x002f
        L_0x0020:
            boolean r2 = r8.f746f
            if (r2 == 0) goto L_0x002f
            android.graphics.Rect r6 = r8.f744d
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L_0x002f
            r5 = r2
            r2 = r4
            goto L_0x0041
        L_0x002f:
            r7 = r5
            r5 = r2
            r2 = r7
            goto L_0x0041
        L_0x0033:
            android.graphics.Rect r2 = r8.f742b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L_0x003f
            r8.f746f = r5
            r2 = r5
            goto L_0x0041
        L_0x003f:
            r2 = r5
            r5 = r4
        L_0x0041:
            if (r5 == 0) goto L_0x006a
            android.graphics.Rect r4 = r8.f743c
            android.view.View r5 = r8.f741a
            if (r2 == 0) goto L_0x005b
            boolean r2 = r4.contains(r0, r1)
            if (r2 != 0) goto L_0x005b
            int r0 = r5.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r5.getHeight()
            int r1 = r1 / r3
            goto L_0x0062
        L_0x005b:
            int r2 = r4.left
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r4.top
            int r1 = r1 - r2
        L_0x0062:
            float r1 = (float) r1
            r9.setLocation(r0, r1)
            boolean r4 = r5.dispatchTouchEvent(r9)
        L_0x006a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q3.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
