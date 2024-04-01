package b1;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.activity.i;

public final class g implements View.OnTouchListener {

    /* renamed from: u  reason: collision with root package name */
    public static final int f1495u = ViewConfiguration.getTapTimeout();

    /* renamed from: d  reason: collision with root package name */
    public final a f1496d;

    /* renamed from: e  reason: collision with root package name */
    public final AccelerateInterpolator f1497e = new AccelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    public final View f1498f;

    /* renamed from: g  reason: collision with root package name */
    public i f1499g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f1500h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f1501i;

    /* renamed from: j  reason: collision with root package name */
    public int f1502j;

    /* renamed from: k  reason: collision with root package name */
    public int f1503k;

    /* renamed from: l  reason: collision with root package name */
    public final float[] f1504l;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f1505m;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f1506n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1507o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1508p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1509q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1510r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1511s;

    /* renamed from: t  reason: collision with root package name */
    public final ListView f1512t;

    public g(ListView listView) {
        a aVar = new a();
        this.f1496d = aVar;
        float[] fArr = {0.0f, 0.0f};
        this.f1500h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1501i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1504l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1505m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1506n = fArr5;
        this.f1498f = listView;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        fArr5[0] = ((float) ((int) ((1575.0f * f6) + 0.5f))) / 1000.0f;
        fArr4[0] = ((float) ((int) ((f6 * 315.0f) + 0.5f))) / 1000.0f;
        this.f1502j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr3[0] = 0.001f;
        this.f1503k = f1495u;
        aVar.f1486a = 500;
        aVar.f1487b = 500;
        this.f1512t = listView;
    }

    public static float b(float f6, float f7, float f8) {
        return f6 > f8 ? f8 : f6 < f7 ? f7 : f6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1500h
            r0 = r0[r7]
            float[] r1 = r3.f1501i
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1497e
            if (r5 >= 0) goto L_0x0025
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L_0x002d
        L_0x0025:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0036
            float r4 = r0.getInterpolation(r4)
        L_0x002d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L_0x0037
        L_0x0036:
            r4 = r2
        L_0x0037:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003c
            goto L_0x0058
        L_0x003c:
            float[] r0 = r3.f1504l
            r0 = r0[r7]
            float[] r1 = r3.f1505m
            r1 = r1[r7]
            float[] r2 = r3.f1506n
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0051
            float r4 = r4 * r0
            float r2 = b(r4, r1, r7)
            goto L_0x0058
        L_0x0051:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r2 = -r4
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.a(float, float, float, int):float");
    }

    public final float c(float f6, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.f1502j;
        if (i3 == 0 || i3 == 1) {
            if (f6 < f7) {
                return f6 >= 0.0f ? 1.0f - (f6 / f7) : (!this.f1510r || i3 != 1) ? 0.0f : 1.0f;
            }
            return 0.0f;
        } else if (i3 == 2 && f6 < 0.0f) {
            return f6 / (-f7);
        } else {
            return 0.0f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f1511s
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r8 = 3
            if (r0 == r8) goto L_0x0016
            goto L_0x007c
        L_0x0016:
            r7.e()
            goto L_0x007c
        L_0x001a:
            r7.f1509q = r2
            r7.f1507o = r1
        L_0x001e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f1498f
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            b1.a r9 = r7.f1496d
            r9.f1488c = r0
            r9.f1489d = r8
            boolean r8 = r7.f1510r
            if (r8 != 0) goto L_0x007c
            boolean r8 = r7.f()
            if (r8 == 0) goto L_0x007c
            androidx.activity.i r8 = r7.f1499g
            if (r8 != 0) goto L_0x0060
            androidx.activity.i r8 = new androidx.activity.i
            r9 = 4
            r8.<init>(r9, r7)
            r7.f1499g = r8
        L_0x0060:
            r7.f1510r = r2
            r7.f1508p = r2
            boolean r8 = r7.f1507o
            if (r8 != 0) goto L_0x0075
            int r8 = r7.f1503k
            if (r8 <= 0) goto L_0x0075
            androidx.activity.i r9 = r7.f1499g
            long r5 = (long) r8
            java.util.WeakHashMap r8 = x0.u0.f5622a
            x0.d0.n(r4, r9, r5)
            goto L_0x007a
        L_0x0075:
            androidx.activity.i r8 = r7.f1499g
            r8.run()
        L_0x007a:
            r7.f1507o = r2
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i3 = 0;
        if (this.f1508p) {
            this.f1510r = false;
            return;
        }
        a aVar = this.f1496d;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i6 = (int) (currentAnimationTimeMillis - aVar.f1490e);
        int i7 = aVar.f1487b;
        if (i6 > i7) {
            i3 = i7;
        } else if (i6 >= 0) {
            i3 = i6;
        }
        aVar.f1494i = i3;
        aVar.f1493h = aVar.a(currentAnimationTimeMillis);
        aVar.f1492g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r8 = this;
            b1.a r0 = r8.f1496d
            float r1 = r0.f1489d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f1488c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0050
            android.widget.ListView r2 = r8.f1512t
            int r3 = r2.getCount()
            r4 = 1
            if (r3 != 0) goto L_0x001c
            goto L_0x004b
        L_0x001c:
            int r5 = r2.getChildCount()
            int r6 = r2.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L_0x003a
            if (r7 < r3) goto L_0x0049
            int r5 = r5 - r4
            android.view.View r1 = r2.getChildAt(r5)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L_0x0049
            goto L_0x004b
        L_0x003a:
            if (r1 >= 0) goto L_0x004b
            if (r6 > 0) goto L_0x0049
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r1 = r4
            goto L_0x004c
        L_0x004b:
            r1 = r0
        L_0x004c:
            if (r1 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = r4
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.f():boolean");
    }

    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
