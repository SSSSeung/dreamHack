package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import e.n0;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p0.f;
import p0.g;
import w4.p;

public abstract class h extends n0 {

    /* renamed from: f  reason: collision with root package name */
    public static Class f4878f = null;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f4879g = null;

    /* renamed from: h  reason: collision with root package name */
    public static Method f4880h = null;

    /* renamed from: i  reason: collision with root package name */
    public static Method f4881i = null;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f4882j = false;

    public h() {
        super(10);
    }

    public static boolean H(Object obj, String str, int i3, boolean z5) {
        I();
        try {
            return ((Boolean) f4880h.invoke(obj, new Object[]{str, Integer.valueOf(i3), Boolean.valueOf(z5)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void I() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (!f4882j) {
            f4882j = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException e6) {
                Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
                cls = null;
                method2 = null;
                constructor = null;
                method = null;
            }
            f4879g = constructor;
            f4878f = cls;
            f4880h = method;
            f4881i = method2;
        }
    }

    public Typeface y(Context context, f fVar, Resources resources, int i3) {
        I();
        try {
            Object newInstance = f4879g.newInstance(new Object[0]);
            g[] gVarArr = fVar.f4389a;
            int length = gVarArr.length;
            int i6 = 0;
            while (i6 < length) {
                g gVar = gVarArr[i6];
                File q5 = p.q(context);
                if (q5 == null) {
                    return null;
                }
                try {
                    if (!p.j(q5, resources, gVar.f4395f)) {
                        q5.delete();
                        return null;
                    } else if (!H(newInstance, q5.getPath(), gVar.f4391b, gVar.f4392c)) {
                        return null;
                    } else {
                        i6++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    q5.delete();
                }
            }
            I();
            try {
                Object newInstance2 = Array.newInstance(f4878f, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f4881i.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }
}
