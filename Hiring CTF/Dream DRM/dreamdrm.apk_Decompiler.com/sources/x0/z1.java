package x0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.bumptech.glide.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import q0.c;

public abstract class z1 extends e2 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f5653h = false;

    /* renamed from: i  reason: collision with root package name */
    public static Method f5654i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f5655j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f5656k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f5657l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f5658c;

    /* renamed from: d  reason: collision with root package name */
    public c[] f5659d;

    /* renamed from: e  reason: collision with root package name */
    public c f5660e = null;

    /* renamed from: f  reason: collision with root package name */
    public h2 f5661f;

    /* renamed from: g  reason: collision with root package name */
    public c f5662g;

    public z1(h2 h2Var, WindowInsets windowInsets) {
        super(h2Var);
        this.f5658c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private c r(int i3, boolean z5) {
        c cVar = c.f4868e;
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i3 & i6) != 0) {
                cVar = c.a(cVar, s(i6, z5));
            }
        }
        return cVar;
    }

    private c t() {
        h2 h2Var = this.f5661f;
        return h2Var != null ? h2Var.f5572a.h() : c.f4868e;
    }

    private c u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f5653h) {
                v();
            }
            Method method = f5654i;
            if (!(method == null || f5655j == null || f5656k == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f5656k.get(f5657l.get(invoke));
                    if (rect != null) {
                        return c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e6) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f5654i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f5655j = cls;
            f5656k = cls.getDeclaredField("mVisibleInsets");
            f5657l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f5656k.setAccessible(true);
            f5657l.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f5653h = true;
    }

    public void d(View view) {
        c u3 = u(view);
        if (u3 == null) {
            u3 = c.f4868e;
        }
        w(u3);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f5662g, ((z1) obj).f5662g);
    }

    public c f(int i3) {
        return r(i3, false);
    }

    public final c j() {
        if (this.f5660e == null) {
            WindowInsets windowInsets = this.f5658c;
            this.f5660e = c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f5660e;
    }

    public h2 l(int i3, int i6, int i7, int i8) {
        h2 h6 = h2.h((View) null, this.f5658c);
        int i9 = Build.VERSION.SDK_INT;
        y1 x1Var = i9 >= 30 ? new x1(h6) : i9 >= 29 ? new w1(h6) : new u1(h6);
        x1Var.g(h2.f(j(), i3, i6, i7, i8));
        x1Var.e(h2.f(h(), i3, i6, i7, i8));
        return x1Var.b();
    }

    public boolean n() {
        return this.f5658c.isRound();
    }

    public void o(c[] cVarArr) {
        this.f5659d = cVarArr;
    }

    public void p(h2 h2Var) {
        this.f5661f = h2Var;
    }

    public c s(int i3, boolean z5) {
        int i6;
        int i7 = 0;
        if (i3 == 1) {
            return z5 ? c.b(0, Math.max(t().f4870b, j().f4870b), 0, 0) : c.b(0, j().f4870b, 0, 0);
        }
        c cVar = null;
        if (i3 != 2) {
            c cVar2 = c.f4868e;
            if (i3 == 8) {
                c[] cVarArr = this.f5659d;
                if (cVarArr != null) {
                    cVar = cVarArr[e.o(8)];
                }
                if (cVar != null) {
                    return cVar;
                }
                c j6 = j();
                c t5 = t();
                int i8 = j6.f4872d;
                if (i8 > t5.f4872d) {
                    return c.b(0, 0, 0, i8);
                }
                c cVar3 = this.f5662g;
                return (cVar3 == null || cVar3.equals(cVar2) || (i6 = this.f5662g.f4872d) <= t5.f4872d) ? cVar2 : c.b(0, 0, 0, i6);
            } else if (i3 == 16) {
                return i();
            } else {
                if (i3 == 32) {
                    return g();
                }
                if (i3 == 64) {
                    return k();
                }
                if (i3 != 128) {
                    return cVar2;
                }
                h2 h2Var = this.f5661f;
                j e6 = h2Var != null ? h2Var.f5572a.e() : e();
                if (e6 == null) {
                    return cVar2;
                }
                int i9 = Build.VERSION.SDK_INT;
                DisplayCutout displayCutout = e6.f5578a;
                int d6 = i9 >= 28 ? i.d(displayCutout) : 0;
                int f6 = i9 >= 28 ? i.f(displayCutout) : 0;
                int e7 = i9 >= 28 ? i.e(displayCutout) : 0;
                if (i9 >= 28) {
                    i7 = i.c(displayCutout);
                }
                return c.b(d6, f6, e7, i7);
            }
        } else if (z5) {
            c t6 = t();
            c h6 = h();
            return c.b(Math.max(t6.f4869a, h6.f4869a), 0, Math.max(t6.f4871c, h6.f4871c), Math.max(t6.f4872d, h6.f4872d));
        } else {
            c j7 = j();
            h2 h2Var2 = this.f5661f;
            if (h2Var2 != null) {
                cVar = h2Var2.f5572a.h();
            }
            int i10 = j7.f4872d;
            if (cVar != null) {
                i10 = Math.min(i10, cVar.f4872d);
            }
            return c.b(j7.f4869a, 0, j7.f4871c, i10);
        }
    }

    public void w(c cVar) {
        this.f5662g = cVar;
    }
}
