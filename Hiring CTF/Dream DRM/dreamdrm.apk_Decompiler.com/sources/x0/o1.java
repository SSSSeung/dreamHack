package x0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.a0;
import c3.e;
import com.theori.dreamdrm.R;
import java.util.List;
import k1.a;

public final class o1 extends r1 {

    /* renamed from: e  reason: collision with root package name */
    public static final PathInterpolator f5598e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final a f5599f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f5600g = new DecelerateInterpolator();

    public o1(int i3, Interpolator interpolator, long j6) {
        super(i3, interpolator, j6);
    }

    public static void e(View view) {
        e j6 = j(view);
        if (j6 != null) {
            j6.f1636b.setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                e(viewGroup.getChildAt(i3));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z5) {
        e j6 = j(view);
        if (j6 != null) {
            j6.f1635a = windowInsets;
            if (!z5) {
                View view2 = j6.f1636b;
                int[] iArr = j6.f1639e;
                view2.getLocationOnScreen(iArr);
                z5 = true;
                j6.f1637c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                f(viewGroup.getChildAt(i3), windowInsets, z5);
            }
        }
    }

    public static void g(View view, h2 h2Var, List list) {
        e j6 = j(view);
        if (j6 != null) {
            j6.a(h2Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                g(viewGroup.getChildAt(i3), h2Var, list);
            }
        }
    }

    public static void h(View view, a0 a0Var) {
        e j6 = j(view);
        if (j6 != null) {
            View view2 = j6.f1636b;
            int[] iArr = j6.f1639e;
            view2.getLocationOnScreen(iArr);
            int i3 = j6.f1637c - iArr[1];
            j6.f1638d = i3;
            view2.setTranslationY((float) i3);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                h(viewGroup.getChildAt(i6), a0Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static e j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof n1) {
            return ((n1) tag).f5591a;
        }
        return null;
    }
}
