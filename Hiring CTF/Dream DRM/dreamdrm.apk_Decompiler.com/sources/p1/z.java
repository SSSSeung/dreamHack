package p1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public int f4718a = -1;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f4719b;

    /* renamed from: c  reason: collision with root package name */
    public o0 f4720c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4721d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4722e;

    /* renamed from: f  reason: collision with root package name */
    public View f4723f;

    /* renamed from: g  reason: collision with root package name */
    public final z0 f4724g = new z0();

    /* renamed from: h  reason: collision with root package name */
    public boolean f4725h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f4726i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f4727j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f4728k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f4729l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4730m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f4731n;

    /* renamed from: o  reason: collision with root package name */
    public int f4732o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f4733p = 0;

    public z(Context context) {
        this.f4729l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i3, int i6, int i7, int i8, int i9) {
        if (i9 == -1) {
            return i7 - i3;
        }
        if (i9 == 0) {
            int i10 = i7 - i3;
            if (i10 > 0) {
                return i10;
            }
            int i11 = i8 - i6;
            if (i11 < 0) {
                return i11;
            }
            return 0;
        } else if (i9 == 1) {
            return i8 - i6;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int b(View view, int i3) {
        o0 o0Var = this.f4720c;
        if (o0Var == null || !o0Var.d()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return a((view.getLeft() - ((p0) view.getLayoutParams()).f4641b.left) - p0Var.leftMargin, view.getRight() + ((p0) view.getLayoutParams()).f4641b.right + p0Var.rightMargin, o0Var.C(), o0Var.f4608n - o0Var.D(), i3);
    }

    public int c(View view, int i3) {
        o0 o0Var = this.f4720c;
        if (o0Var == null || !o0Var.e()) {
            return 0;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        return a((view.getTop() - ((p0) view.getLayoutParams()).f4641b.top) - p0Var.topMargin, view.getBottom() + ((p0) view.getLayoutParams()).f4641b.bottom + p0Var.bottomMargin, o0Var.E(), o0Var.f4609o - o0Var.B(), i3);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int e(int i3) {
        float abs = (float) Math.abs(i3);
        if (!this.f4730m) {
            this.f4731n = d(this.f4729l);
            this.f4730m = true;
        }
        return (int) Math.ceil((double) (abs * this.f4731n));
    }

    public PointF f(int i3) {
        o0 o0Var = this.f4720c;
        if (o0Var instanceof a1) {
            return ((a1) o0Var).a(i3);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + a1.class.getCanonicalName());
        return null;
    }

    public final void g(int i3, int i6) {
        PointF f6;
        RecyclerView recyclerView = this.f4719b;
        int i7 = -1;
        if (this.f4718a == -1 || recyclerView == null) {
            i();
        }
        if (this.f4721d && this.f4723f == null && this.f4720c != null && (f6 = f(this.f4718a)) != null) {
            float f7 = f6.x;
            if (!(f7 == 0.0f && f6.y == 0.0f)) {
                recyclerView.d0((int) Math.signum(f7), (int) Math.signum(f6.y), (int[]) null);
            }
        }
        boolean z5 = false;
        this.f4721d = false;
        View view = this.f4723f;
        z0 z0Var = this.f4724g;
        if (view != null) {
            this.f4719b.getClass();
            f1 L = RecyclerView.L(view);
            if (L != null) {
                i7 = L.c();
            }
            if (i7 == this.f4718a) {
                h(this.f4723f, recyclerView.f1432h0, z0Var);
                z0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f4723f = null;
            }
        }
        if (this.f4722e) {
            b1 b1Var = recyclerView.f1432h0;
            if (this.f4719b.f1447p.v() == 0) {
                i();
            } else {
                int i8 = this.f4732o;
                int i9 = i8 - i3;
                if (i8 * i9 <= 0) {
                    i9 = 0;
                }
                this.f4732o = i9;
                int i10 = this.f4733p;
                int i11 = i10 - i6;
                if (i10 * i11 <= 0) {
                    i11 = 0;
                }
                this.f4733p = i11;
                if (i9 == 0 && i11 == 0) {
                    PointF f8 = f(this.f4718a);
                    if (f8 != null) {
                        float f9 = f8.x;
                        if (!(f9 == 0.0f && f8.y == 0.0f)) {
                            float f10 = f8.y;
                            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f9 * f9)));
                            float f11 = f8.x / sqrt;
                            f8.x = f11;
                            float f12 = f8.y / sqrt;
                            f8.y = f12;
                            this.f4728k = f8;
                            this.f4732o = (int) (f11 * 10000.0f);
                            this.f4733p = (int) (f12 * 10000.0f);
                            int e6 = e(10000);
                            LinearInterpolator linearInterpolator = this.f4726i;
                            z0Var.f4734a = (int) (((float) this.f4732o) * 1.2f);
                            z0Var.f4735b = (int) (((float) this.f4733p) * 1.2f);
                            z0Var.f4736c = (int) (((float) e6) * 1.2f);
                            z0Var.f4738e = linearInterpolator;
                            z0Var.f4739f = true;
                        }
                    }
                    z0Var.f4737d = this.f4718a;
                    i();
                }
            }
            if (z0Var.f4737d >= 0) {
                z5 = true;
            }
            z0Var.a(recyclerView);
            if (z5 && this.f4722e) {
                this.f4721d = true;
                recyclerView.f1427e0.b();
            }
        }
    }

    public void h(View view, b1 b1Var, z0 z0Var) {
        int i3;
        int i6;
        PointF pointF = this.f4728k;
        int i7 = -1;
        int b6 = b(view, (pointF == null || pointF.x == 0.0f) ? 0 : i6 > 0 ? 1 : -1);
        PointF pointF2 = this.f4728k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i7 = 0;
        } else if (i3 > 0) {
            i7 = 1;
        }
        int c6 = c(view, i7);
        int ceil = (int) Math.ceil(((double) e((int) Math.sqrt((double) ((c6 * c6) + (b6 * b6))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f4727j;
            z0Var.f4734a = -b6;
            z0Var.f4735b = -c6;
            z0Var.f4736c = ceil;
            z0Var.f4738e = decelerateInterpolator;
            z0Var.f4739f = true;
        }
    }

    public final void i() {
        if (this.f4722e) {
            this.f4722e = false;
            this.f4733p = 0;
            this.f4732o = 0;
            this.f4728k = null;
            this.f4719b.f1432h0.f4438a = -1;
            this.f4723f = null;
            this.f4718a = -1;
            this.f4721d = false;
            o0 o0Var = this.f4720c;
            if (o0Var.f4599e == this) {
                o0Var.f4599e = null;
            }
            this.f4720c = null;
            this.f4719b = null;
        }
    }
}
