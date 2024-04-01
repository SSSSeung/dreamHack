package androidx.activity;

import android.window.OnBackInvokedCallback;
import b1.o;
import o4.a;
import o4.c;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f339a = new v();

    public final OnBackInvokedCallback a(c cVar, c cVar2, a aVar, a aVar2) {
        o.m(cVar, "onBackStarted");
        o.m(cVar2, "onBackProgressed");
        o.m(aVar, "onBackInvoked");
        o.m(aVar2, "onBackCancelled");
        return new u(cVar, cVar2, aVar, aVar2);
    }
}
