package l2;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.l0;
import androidx.fragment.app.v;
import androidx.lifecycle.x;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.n;
import e2.d0;
import e2.f;
import h2.u;
import java.util.HashMap;
import r2.l;

public final class j implements Handler.Callback {

    /* renamed from: g  reason: collision with root package name */
    public static final d0 f4094g = new d0(16);

    /* renamed from: a  reason: collision with root package name */
    public volatile n f4095a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4096b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4097c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4098d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f4099e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4100f;

    public j(d0 d0Var, x xVar) {
        new Bundle();
        this.f4099e = d0Var == null ? f4094g : d0Var;
        this.f4098d = new Handler(Looper.getMainLooper(), this);
        this.f4100f = (!u.f3432h || !u.f3431g) ? new d0(13) : xVar.f1392a.containsKey(e.class) ? new d() : new d0(15);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final n b(Context context) {
        if (context != null) {
            char[] cArr = l.f4938a;
            boolean z5 = true;
            if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
                if (context instanceof v) {
                    return c((v) context);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (!(Looper.myLooper() == Looper.getMainLooper())) {
                        return b(activity.getApplicationContext());
                    }
                    if (activity instanceof v) {
                        return c((v) activity);
                    }
                    if (!activity.isDestroyed()) {
                        this.f4100f.a();
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        Activity a6 = a(activity);
                        if (a6 != null && a6.isFinishing()) {
                            z5 = false;
                        }
                        i d6 = d(fragmentManager);
                        n nVar = d6.f4091g;
                        if (nVar != null) {
                            return nVar;
                        }
                        b b6 = b.b(activity);
                        f fVar = d6.f4089e;
                        this.f4099e.getClass();
                        n nVar2 = new n(b6, d6.f4088d, fVar, activity);
                        if (z5) {
                            nVar2.j();
                        }
                        d6.f4091g = nVar2;
                        return nVar2;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f4095a == null) {
                synchronized (this) {
                    if (this.f4095a == null) {
                        b b7 = b.b(context.getApplicationContext());
                        d0 d0Var = this.f4099e;
                        d0 d0Var2 = new d0(11);
                        d0 d0Var3 = new d0(14);
                        Context applicationContext = context.getApplicationContext();
                        d0Var.getClass();
                        this.f4095a = new n(b7, d0Var2, d0Var3, applicationContext);
                    }
                }
            }
            return this.f4095a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final n c(v vVar) {
        char[] cArr = l.f4938a;
        boolean z5 = false;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return b(vVar.getApplicationContext());
        }
        if (!vVar.isDestroyed()) {
            this.f4100f.a();
            l0 l0Var = ((androidx.fragment.app.u) vVar.f1303s.f1170b).f1297t;
            Activity a6 = a(vVar);
            if (a6 == null || !a6.isFinishing()) {
                z5 = true;
            }
            m e6 = e(l0Var);
            n nVar = e6.Z;
            if (nVar != null) {
                return nVar;
            }
            b b6 = b.b(vVar);
            this.f4099e.getClass();
            n nVar2 = new n(b6, e6.V, e6.W, vVar);
            if (z5) {
                nVar2.j();
            }
            e6.Z = nVar2;
            return nVar2;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final i d(FragmentManager fragmentManager) {
        i iVar = (i) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (iVar != null) {
            return iVar;
        }
        HashMap hashMap = this.f4096b;
        i iVar2 = (i) hashMap.get(fragmentManager);
        if (iVar2 == null) {
            iVar2 = new i();
            iVar2.f4093i = null;
            hashMap.put(fragmentManager, iVar2);
            fragmentManager.beginTransaction().add(iVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f4098d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return iVar2;
    }

    public final m e(l0 l0Var) {
        m mVar = (m) l0Var.B("com.bumptech.glide.manager");
        if (mVar != null) {
            return mVar;
        }
        HashMap hashMap = this.f4097c;
        m mVar2 = (m) hashMap.get(l0Var);
        if (mVar2 == null) {
            mVar2 = new m();
            mVar2.f4105a0 = null;
            hashMap.put(l0Var, mVar2);
            a aVar = new a(l0Var);
            aVar.e(0, mVar2, "com.bumptech.glide.manager", 1);
            aVar.d(true);
            this.f4098d.obtainMessage(2, l0Var).sendToTarget();
        }
        return mVar2;
    }

    public final boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        HashMap hashMap;
        int i3 = message.what;
        boolean z5 = true;
        if (i3 == 1) {
            obj3 = (FragmentManager) message.obj;
            hashMap = this.f4096b;
        } else if (i3 != 2) {
            obj = null;
            z5 = false;
            obj2 = null;
            if (z5 && obj == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z5;
        } else {
            obj3 = (l0) message.obj;
            hashMap = this.f4097c;
        }
        Object remove = hashMap.remove(obj3);
        obj2 = obj3;
        obj = remove;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        return z5;
    }
}
