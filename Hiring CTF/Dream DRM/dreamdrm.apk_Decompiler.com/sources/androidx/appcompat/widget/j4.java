package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import x0.e0;
import x0.u0;

public abstract class j4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f647a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f648b = (Build.VERSION.SDK_INT >= 27);

    static {
        Class<Rect> cls = Rect.class;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            f647a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = u0.f5622a;
        return e0.d(view) == 1;
    }
}
