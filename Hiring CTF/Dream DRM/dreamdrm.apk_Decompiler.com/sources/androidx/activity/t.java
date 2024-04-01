package androidx.activity;

import android.window.OnBackInvokedCallback;
import b1.o;
import o4.a;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f334a = new t();

    public final OnBackInvokedCallback a(a aVar) {
        o.m(aVar, "onBackInvoked");
        return new s(0, aVar);
    }

    public final void b(Object obj, int i3, Object obj2) {
        o.m(obj, "dispatcher");
        o.m(obj2, "callback");
        j.q(obj).registerOnBackInvokedCallback(i3, j.n(obj2));
    }

    public final void c(Object obj, Object obj2) {
        o.m(obj, "dispatcher");
        o.m(obj2, "callback");
        j.q(obj).unregisterOnBackInvokedCallback(j.n(obj2));
    }
}
