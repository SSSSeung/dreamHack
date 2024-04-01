package e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import k.c;
import t0.g;

public abstract class q {

    /* renamed from: d  reason: collision with root package name */
    public static final l0 f2410d = new l0(new m0(0));

    /* renamed from: e  reason: collision with root package name */
    public static final int f2411e = -100;

    /* renamed from: f  reason: collision with root package name */
    public static g f2412f = null;

    /* renamed from: g  reason: collision with root package name */
    public static g f2413g = null;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f2414h = null;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f2415i = false;

    /* renamed from: j  reason: collision with root package name */
    public static final c f2416j = new c();

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2417k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final Object f2418l = new Object();

    public static boolean f(Context context) {
        if (f2414h == null) {
            try {
                int i3 = j0.f2390d;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, j0.class), i0.a() | 128).metaData;
                if (bundle != null) {
                    f2414h = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2414h = Boolean.FALSE;
            }
        }
        return f2414h.booleanValue();
    }

    public static void i(q qVar) {
        synchronized (f2417k) {
            Iterator it = f2416j.iterator();
            while (it.hasNext()) {
                q qVar2 = (q) ((WeakReference) it.next()).get();
                if (qVar2 == qVar || qVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b();

    public abstract void e();

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i3);

    public abstract void k(int i3);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);
}
