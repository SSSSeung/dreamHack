package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b1.o;
import o4.a;
import o4.c;

public final class u implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f335a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f336b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f337c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f338d;

    public u(c cVar, c cVar2, a aVar, a aVar2) {
        this.f335a = cVar;
        this.f336b = cVar2;
        this.f337c = aVar;
        this.f338d = aVar2;
    }

    public final void onBackCancelled() {
        this.f338d.a();
    }

    public final void onBackInvoked() {
        this.f337c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        o.m(backEvent, "backEvent");
        this.f336b.i(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        o.m(backEvent, "backEvent");
        this.f335a.i(new b(backEvent));
    }
}
