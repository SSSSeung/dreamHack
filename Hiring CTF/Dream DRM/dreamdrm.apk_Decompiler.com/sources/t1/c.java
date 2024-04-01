package t1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import x0.e0;
import x0.f0;
import x0.u0;

public final class c extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5093a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Class cls, String str, int i3) {
        super(cls, str);
        this.f5093a = i3;
    }

    public final Float a(View view) {
        switch (this.f5093a) {
            case 5:
                return Float.valueOf(x.f5173a.x(view));
            case 7:
                return Float.valueOf((float) view.getLayoutParams().width);
            case 8:
                return Float.valueOf((float) view.getLayoutParams().height);
            case 9:
                WeakHashMap weakHashMap = u0.f5622a;
                return Float.valueOf((float) e0.f(view));
            default:
                WeakHashMap weakHashMap2 = u0.f5622a;
                return Float.valueOf((float) e0.e(view));
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.f5093a) {
            case 2:
                x.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 3:
                x.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                x.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void c(View view, Float f6) {
        switch (this.f5093a) {
            case 5:
                x.f5173a.y(view, f6.floatValue());
                return;
            case 7:
                view.getLayoutParams().width = f6.intValue();
                view.requestLayout();
                return;
            case 8:
                view.getLayoutParams().height = f6.intValue();
                view.requestLayout();
                return;
            case 9:
                int intValue = f6.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap = u0.f5622a;
                e0.k(view, intValue, paddingTop, e0.e(view), view.getPaddingBottom());
                return;
            default:
                WeakHashMap weakHashMap2 = u0.f5622a;
                e0.k(view, e0.f(view), view.getPaddingTop(), f6.intValue(), view.getPaddingBottom());
                return;
        }
    }

    public final void d(f fVar, PointF pointF) {
        switch (this.f5093a) {
            case 0:
                fVar.getClass();
                fVar.f5106a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                fVar.f5107b = round;
                int i3 = fVar.f5111f + 1;
                fVar.f5111f = i3;
                if (i3 == fVar.f5112g) {
                    x.a(fVar.f5110e, fVar.f5106a, round, fVar.f5108c, fVar.f5109d);
                    fVar.f5111f = 0;
                    fVar.f5112g = 0;
                    return;
                }
                return;
            default:
                fVar.getClass();
                fVar.f5108c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                fVar.f5109d = round2;
                int i6 = fVar.f5112g + 1;
                fVar.f5112g = i6;
                if (fVar.f5111f == i6) {
                    x.a(fVar.f5110e, fVar.f5106a, fVar.f5107b, fVar.f5108c, round2);
                    fVar.f5111f = 0;
                    fVar.f5112g = 0;
                    return;
                }
                return;
        }
    }

    public final Object get(Object obj) {
        switch (this.f5093a) {
            case 0:
                f fVar = (f) obj;
                return null;
            case 1:
                f fVar2 = (f) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return a((View) obj);
            case 6:
                WeakHashMap weakHashMap = u0.f5622a;
                return f0.a((View) obj);
            case 7:
                return a((View) obj);
            case 8:
                return a((View) obj);
            case 9:
                return a((View) obj);
            default:
                return a((View) obj);
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.f5093a) {
            case 0:
                d((f) obj, (PointF) obj2);
                return;
            case 1:
                d((f) obj, (PointF) obj2);
                return;
            case 2:
                b((View) obj, (PointF) obj2);
                return;
            case 3:
                b((View) obj, (PointF) obj2);
                return;
            case 4:
                b((View) obj, (PointF) obj2);
                return;
            case 5:
                c((View) obj, (Float) obj2);
                return;
            case 6:
                WeakHashMap weakHashMap = u0.f5622a;
                f0.c((View) obj, (Rect) obj2);
                return;
            case 7:
                c((View) obj, (Float) obj2);
                return;
            case 8:
                c((View) obj, (Float) obj2);
                return;
            case 9:
                c((View) obj, (Float) obj2);
                return;
            default:
                c((View) obj, (Float) obj2);
                return;
        }
    }
}
