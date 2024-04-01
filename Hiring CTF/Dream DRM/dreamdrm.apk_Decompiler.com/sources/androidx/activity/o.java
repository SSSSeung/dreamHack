package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.n0;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import q1.d;
import q1.e;
import q1.f;

public abstract class o extends Dialog implements r, z, f {

    /* renamed from: d  reason: collision with root package name */
    public t f313d;

    /* renamed from: e  reason: collision with root package name */
    public final e f314e = n0.i(this);

    /* renamed from: f  reason: collision with root package name */
    public final y f315f = new y(new d(2, this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Context context, int i3) {
        super(context, i3);
        b1.o.m(context, "context");
    }

    public static void a(o oVar) {
        b1.o.m(oVar, "this$0");
        super.onBackPressed();
    }

    public final d b() {
        return this.f314e.f4898b;
    }

    public final t h() {
        t tVar = this.f313d;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f313d = tVar2;
        return tVar2;
    }

    public final void onBackPressed() {
        this.f315f.b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            b1.o.l(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            y yVar = this.f315f;
            yVar.getClass();
            yVar.f347e = onBackInvokedDispatcher;
            yVar.c(yVar.f349g);
        }
        this.f314e.b(bundle);
        t tVar = this.f313d;
        if (tVar == null) {
            tVar = new t(this);
            this.f313d = tVar;
        }
        tVar.x(l.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        b1.o.l(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f314e.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public final void onStart() {
        super.onStart();
        t tVar = this.f313d;
        if (tVar == null) {
            tVar = new t(this);
            this.f313d = tVar;
        }
        tVar.x(l.ON_RESUME);
    }

    public void onStop() {
        t tVar = this.f313d;
        if (tVar == null) {
            tVar = new t(this);
            this.f313d = tVar;
        }
        tVar.x(l.ON_DESTROY);
        this.f313d = null;
        super.onStop();
    }
}
