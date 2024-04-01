package g;

import android.content.Context;
import androidx.emoji2.text.k;
import androidx.emoji2.text.n;
import com.bumptech.glide.d;
import e2.b0;
import e2.s;
import e2.v;
import e2.w;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements k, w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2708d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2709e;

    public a(Context context) {
        this.f2708d = 1;
        this.f2709e = context.getApplicationContext();
    }

    public static void b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e6) {
                c(cls, e6);
                throw null;
            } catch (IllegalAccessException e7) {
                c(cls, e7);
                throw null;
            } catch (NoSuchMethodException e8) {
                c(cls, e8);
                throw null;
            } catch (InvocationTargetException e9) {
                c(cls, e9);
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e10);
        }
    }

    public static void c(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public final void a(d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new n(this, dVar, threadPoolExecutor, 0));
    }

    public final v d(b0 b0Var) {
        int i3 = this.f2708d;
        Context context = this.f2709e;
        switch (i3) {
            case 2:
                return new s(context, 0);
            case 3:
                return new s(context, 1);
            default:
                return new s(context, 2);
        }
    }

    public /* synthetic */ a(Context context, int i3) {
        this.f2708d = i3;
        this.f2709e = context;
    }
}
