package p1;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

public final class c0 extends z {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4454q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f4455r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Context context, int i3) {
        super(context);
        this.f4454q = i3;
        this.f4455r = obj;
    }

    public final int b(View view, int i3) {
        switch (this.f4454q) {
            case 1:
                ((CarouselLayoutManager) this.f4455r).getClass();
                return 0;
            default:
                return super.b(view, i3);
        }
    }

    public final int c(View view, int i3) {
        switch (this.f4454q) {
            case 1:
                ((CarouselLayoutManager) this.f4455r).getClass();
                return 0;
            default:
                return super.c(view, i3);
        }
    }

    public final float d(DisplayMetrics displayMetrics) {
        int i3;
        switch (this.f4454q) {
            case 0:
                i3 = displayMetrics.densityDpi;
                break;
            case 2:
                i3 = displayMetrics.densityDpi;
                break;
            default:
                return 25.0f / ((float) displayMetrics.densityDpi);
        }
        return 100.0f / ((float) i3);
    }

    public final int e(int i3) {
        switch (this.f4454q) {
            case 0:
                return Math.min(100, super.e(i3));
            default:
                return super.e(i3);
        }
    }

    public final PointF f(int i3) {
        switch (this.f4454q) {
            case 1:
                ((CarouselLayoutManager) this.f4455r).getClass();
                return null;
            default:
                return super.f(i3);
        }
    }

    public final void h(View view, b1 b1Var, z0 z0Var) {
        switch (this.f4454q) {
            case 0:
                d0 d0Var = (d0) this.f4455r;
                int[] a6 = d0Var.a(d0Var.f4461a.getLayoutManager(), view);
                int i3 = a6[0];
                int i6 = a6[1];
                int ceil = (int) Math.ceil(((double) e(Math.max(Math.abs(i3), Math.abs(i6)))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f4727j;
                    z0Var.f4734a = i3;
                    z0Var.f4735b = i6;
                    z0Var.f4736c = ceil;
                    z0Var.f4738e = decelerateInterpolator;
                    z0Var.f4739f = true;
                    return;
                }
                return;
            default:
                super.h(view, b1Var, z0Var);
                return;
        }
    }
}
