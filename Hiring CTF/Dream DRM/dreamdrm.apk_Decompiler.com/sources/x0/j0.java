package x0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.theori.dreamdrm.R;
import e.n0;
import q0.c;

public abstract class j0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static h2 b(View view, h2 h2Var, Rect rect) {
        WindowInsets g6 = h2Var.g();
        if (g6 != null) {
            return h2.h(view, view.computeSystemWindowInsets(g6, rect));
        }
        rect.setEmpty();
        return h2Var;
    }

    public static boolean c(View view, float f6, float f7, boolean z5) {
        return view.dispatchNestedFling(f6, f7, z5);
    }

    public static boolean d(View view, float f6, float f7) {
        return view.dispatchNestedPreFling(f6, f7);
    }

    public static boolean e(View view, int i3, int i6, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i3, i6, iArr, iArr2);
    }

    public static boolean f(View view, int i3, int i6, int i7, int i8, int[] iArr) {
        return view.dispatchNestedScroll(i3, i6, i7, i8, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static h2 j(View view) {
        if (t1.f5621d && view.isAttachedToWindow()) {
            try {
                Object obj = t1.f5618a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) t1.f5619b.get(obj);
                    Rect rect2 = (Rect) t1.f5620c.get(obj);
                    if (!(rect == null || rect2 == null)) {
                        Object obj2 = new n0(14).f2403e;
                        ((y1) obj2).e(c.b(rect.left, rect.top, rect.right, rect.bottom));
                        ((y1) obj2).g(c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        h2 b6 = ((y1) obj2).b();
                        b6.f5572a.p(b6);
                        b6.f5572a.d(view.getRootView());
                        return b6;
                    }
                }
            } catch (IllegalAccessException e6) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e6.getMessage(), e6);
            }
        }
        return null;
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f6) {
        view.setElevation(f6);
    }

    public static void t(View view, boolean z5) {
        view.setNestedScrollingEnabled(z5);
    }

    public static void u(View view, s sVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, sVar);
        }
        if (sVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new i0(view, sVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f6) {
        view.setTranslationZ(f6);
    }

    public static void x(View view, float f6) {
        view.setZ(f6);
    }

    public static boolean y(View view, int i3) {
        return view.startNestedScroll(i3);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
