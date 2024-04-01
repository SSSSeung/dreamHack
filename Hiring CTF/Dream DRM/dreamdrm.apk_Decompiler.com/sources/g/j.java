package g;

import a2.m;
import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

public final class j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f2731c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public final Object f2732a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f2733b;

    public j(Object obj, String str) {
        this.f2732a = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f2733b = cls.getMethod(str, f2731c);
        } catch (Exception e6) {
            StringBuilder k6 = m.k("Couldn't resolve menu item onClick handler ", str, " in class ");
            k6.append(cls.getName());
            InflateException inflateException = new InflateException(k6.toString());
            inflateException.initCause(e6);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f2733b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f2732a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
            }
            method.invoke(obj, new Object[]{menuItem});
            return true;
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
