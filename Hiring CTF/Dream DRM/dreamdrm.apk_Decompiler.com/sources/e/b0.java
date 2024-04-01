package e;

import a2.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.fragment.app.g1;
import e2.v;
import e2.w;
import java.io.File;
import java.util.HashSet;
import t0.d;

public abstract class b0 implements w {

    /* renamed from: d  reason: collision with root package name */
    public Object f2280d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2281e;

    public b0(e0 e0Var) {
        this.f2281e = e0Var;
    }

    public final void a() {
        Object obj = this.f2280d;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((e0) this.f2281e).f2333n.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f2280d = null;
        }
    }

    public final void b() {
        g1 g1Var = (g1) this.f2280d;
        HashSet hashSet = g1Var.f1150e;
        if (hashSet.remove((d) this.f2281e) && hashSet.isEmpty()) {
            g1Var.b();
        }
    }

    public abstract IntentFilter c();

    public final v d(e2.b0 b0Var) {
        Class cls = (Class) this.f2281e;
        return new f2.d((Context) this.f2280d, b0Var.a(File.class, cls), b0Var.a(Uri.class, cls), cls);
    }

    public abstract int e();

    public final boolean f() {
        int c6 = m.c(((g1) this.f2280d).f1148c.H);
        int i3 = ((g1) this.f2280d).f1146a;
        return c6 == i3 || !(c6 == 2 || i3 == 2);
    }

    public abstract void g();

    public final void h() {
        a();
        IntentFilter c6 = c();
        if (c6 != null && c6.countActions() != 0) {
            if (((BroadcastReceiver) this.f2280d) == null) {
                this.f2280d = new a0(0, this);
            }
            ((e0) this.f2281e).f2333n.registerReceiver((BroadcastReceiver) this.f2280d, c6);
        }
    }

    public /* synthetic */ b0(Object obj, Object obj2) {
        this.f2280d = obj;
        this.f2281e = obj2;
    }
}
