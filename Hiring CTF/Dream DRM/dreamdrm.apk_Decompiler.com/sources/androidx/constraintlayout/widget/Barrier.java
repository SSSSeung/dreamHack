package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import h0.a;
import j0.b;
import j0.r;

public class Barrier extends b {

    /* renamed from: j  reason: collision with root package name */
    public int f918j;

    /* renamed from: k  reason: collision with root package name */
    public int f919k;

    /* renamed from: l  reason: collision with root package name */
    public a f920l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f920l = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3778b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f920l.f3233g0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f920l.f3234h0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f3653g = this.f920l;
        g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 == 6) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(h0.e r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f918j
            r3.f919k = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            if (r0 != r1) goto L_0x0017
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0012
        L_0x0010:
            r5 = 0
            goto L_0x0015
        L_0x0012:
            if (r0 != r1) goto L_0x0017
        L_0x0014:
            r5 = 1
        L_0x0015:
            r3.f919k = r5
        L_0x0017:
            boolean r5 = r4 instanceof h0.a
            if (r5 == 0) goto L_0x0021
            h0.a r4 = (h0.a) r4
            int r5 = r3.f919k
            r4.f0 = r5
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.f(h0.e, boolean):void");
    }

    public int getMargin() {
        return this.f920l.f3234h0;
    }

    public int getType() {
        return this.f918j;
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.f920l.f3233g0 = z5;
    }

    public void setDpMargin(int i3) {
        this.f920l.f3234h0 = (int) ((((float) i3) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i3) {
        this.f920l.f3234h0 = i3;
    }

    public void setType(int i3) {
        this.f918j = i3;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
