package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import b1.o;

class ComponentActivity$6 implements p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f269d;

    public ComponentActivity$6(n nVar) {
        this.f269d = nVar;
    }

    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
            y yVar = this.f269d.f304j;
            OnBackInvokedDispatcher a6 = k.a((n) rVar);
            yVar.getClass();
            o.m(a6, "invoker");
            yVar.f347e = a6;
            yVar.c(yVar.f349g);
        }
    }
}
