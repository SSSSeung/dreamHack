package q0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p0.f;
import p0.g;
import w4.p;

public class i extends h {

    /* renamed from: k  reason: collision with root package name */
    public final Class f4883k;

    /* renamed from: l  reason: collision with root package name */
    public final Constructor f4884l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f4885m;

    /* renamed from: n  reason: collision with root package name */
    public final Method f4886n;

    /* renamed from: o  reason: collision with root package name */
    public final Method f4887o;

    /* renamed from: p  reason: collision with root package name */
    public final Method f4888p;

    /* renamed from: q  reason: collision with root package name */
    public final Method f4889q;

    public i() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method4 = N(cls);
            method3 = O(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method5 = cls.getMethod("abortCreation", new Class[0]);
            method = P(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            cls = null;
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4883k = cls;
        this.f4884l = constructor;
        this.f4885m = method4;
        this.f4886n = method3;
        this.f4887o = method2;
        this.f4888p = method5;
        this.f4889q = method;
    }

    public static Method N(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public static Method O(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public final Typeface B(Context context, Resources resources, int i3, String str, int i6) {
        Object obj;
        if (!M()) {
            return super.B(context, resources, i3, str, i6);
        }
        try {
            obj = this.f4884l.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!J(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.f4888p.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!L(obj)) {
            return null;
        } else {
            return K(obj);
        }
    }

    public final boolean J(Context context, Object obj, String str, int i3, int i6, int i7, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4885m.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i7), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface K(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4883k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4889q.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean L(Object obj) {
        try {
            return ((Boolean) this.f4887o.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean M() {
        Method method = this.f4885m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public Method P(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface y(Context context, f fVar, Resources resources, int i3) {
        Object obj;
        if (!M()) {
            return super.y(context, fVar, resources, i3);
        }
        try {
            obj = this.f4884l.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (g gVar : fVar.f4389a) {
            if (!J(context, obj, gVar.f4390a, gVar.f4394e, gVar.f4391b, gVar.f4392c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f4393d))) {
                try {
                    this.f4888p.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!L(obj)) {
            return null;
        }
        return K(obj);
    }

    public final Typeface z(Context context, u0.g[] gVarArr, int i3) {
        Object obj;
        Typeface K;
        boolean z5;
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        u0.g[] gVarArr2 = gVarArr;
        int i6 = i3;
        if (gVarArr2.length < 1) {
            return null;
        }
        if (!M()) {
            u0.g D = D(i6, gVarArr2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(D.f5254a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(D.f5256c).setItalic(D.f5257d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (u0.g gVar : gVarArr2) {
                if (gVar.f5258e == 0) {
                    Uri uri = gVar.f5254a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, p.r(context, uri));
                    }
                }
                Context context2 = context;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f4884l.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = gVarArr2.length;
            int i7 = 0;
            boolean z6 = false;
            while (true) {
                Method method = this.f4888p;
                if (i7 < length) {
                    u0.g gVar2 = gVarArr2[i7];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f5254a);
                    if (byteBuffer != null) {
                        try {
                            z5 = ((Boolean) this.f4886n.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(gVar2.f5255b), null, Integer.valueOf(gVar2.f5256c), Integer.valueOf(gVar2.f5257d ? 1 : 0)})).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z5 = false;
                        }
                        if (!z5) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        } else {
                            z6 = true;
                        }
                    }
                    i7++;
                } else if (!z6) {
                    try {
                        method.invoke(obj, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                        return null;
                    }
                } else if (L(obj) && (K = K(obj)) != null) {
                    return Typeface.create(K, i6);
                } else {
                    return null;
                }
            }
        }
        throw th;
    }
}
