package androidx.activity;

import android.window.OnBackInvokedCallback;
import b1.o;
import o4.a;

public final /* synthetic */ class s implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f333b;

    public /* synthetic */ s(int i3, Object obj) {
        this.f332a = i3;
        this.f333b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f332a) {
            case 0:
                a aVar = (a) this.f333b;
                o.m(aVar, "$onBackInvoked");
                aVar.a();
                return;
            default:
                ((Runnable) this.f333b).run();
                return;
        }
    }
}
