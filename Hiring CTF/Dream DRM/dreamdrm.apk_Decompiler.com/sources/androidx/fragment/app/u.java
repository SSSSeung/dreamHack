package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.result.e;
import androidx.activity.y;
import androidx.activity.z;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.t;
import h5.l;

public final class u extends l implements n0, z, e, p0 {

    /* renamed from: q  reason: collision with root package name */
    public final Activity f1294q;

    /* renamed from: r  reason: collision with root package name */
    public final Context f1295r;

    /* renamed from: s  reason: collision with root package name */
    public final Handler f1296s;

    /* renamed from: t  reason: collision with root package name */
    public final l0 f1297t = new l0();

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ v f1298u;

    public u(e.l lVar) {
        this.f1298u = lVar;
        Handler handler = new Handler();
        this.f1294q = lVar;
        this.f1295r = lVar;
        this.f1296s = handler;
    }

    public final void a() {
        this.f1298u.getClass();
    }

    public final m0 e() {
        return this.f1298u.e();
    }

    public final t h() {
        return this.f1298u.f1304t;
    }

    public final View j(int i3) {
        return this.f1298u.findViewById(i3);
    }

    public final boolean k() {
        Window window = this.f1298u.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final y x() {
        return this.f1298u.k();
    }
}
