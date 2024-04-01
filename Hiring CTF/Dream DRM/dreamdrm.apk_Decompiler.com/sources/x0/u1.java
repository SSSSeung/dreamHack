package x0;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import q0.c;

public final class u1 extends y1 {

    /* renamed from: e  reason: collision with root package name */
    public static Field f5628e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f5629f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f5630g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f5631h = false;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f5632c;

    /* renamed from: d  reason: collision with root package name */
    public c f5633d;

    public u1() {
        this.f5632c = i();
    }

    private static WindowInsets i() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!f5629f) {
            try {
                f5628e = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f5629f = true;
        }
        Field field = f5628e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!f5631h) {
            try {
                f5630g = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
            }
            f5631h = true;
        }
        Constructor constructor = f5630g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
            }
        }
        return null;
    }

    public h2 b() {
        a();
        h2 h6 = h2.h((View) null, this.f5632c);
        c[] cVarArr = this.f5644b;
        e2 e2Var = h6.f5572a;
        e2Var.o(cVarArr);
        e2Var.q(this.f5633d);
        return h6;
    }

    public void e(c cVar) {
        this.f5633d = cVar;
    }

    public void g(c cVar) {
        WindowInsets windowInsets = this.f5632c;
        if (windowInsets != null) {
            this.f5632c = windowInsets.replaceSystemWindowInsets(cVar.f4869a, cVar.f4870b, cVar.f4871c, cVar.f4872d);
        }
    }

    public u1(h2 h2Var) {
        super(h2Var);
        this.f5632c = h2Var.g();
    }
}
