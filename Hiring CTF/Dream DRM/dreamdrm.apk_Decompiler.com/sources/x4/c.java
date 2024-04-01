package x4;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.e;
import b1.o;
import i4.h;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.d;
import w4.i0;
import w4.s;
import w4.s0;
import w4.w;

public final class c extends s0 implements s {
    private volatile c _immediate;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f5765f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5766g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5767h;

    /* renamed from: i  reason: collision with root package name */
    public final c f5768i;

    public c(Handler handler) {
        this(handler, (String) null, false);
    }

    public final void C(h hVar, Runnable runnable) {
        if (!this.f5765f.post(runnable)) {
            E(hVar, runnable);
        }
    }

    public final boolean D() {
        return !this.f5767h || !o.c(Looper.myLooper(), this.f5765f.getLooper());
    }

    public final void E(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        i0 i0Var = (i0) hVar.l(e.f897n);
        if (i0Var != null) {
            i0Var.n(cancellationException);
        }
        w.f5530b.C(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f5765f == this.f5765f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5765f);
    }

    public final String toString() {
        String str;
        c cVar;
        d dVar = w.f5529a;
        s0 s0Var = m.f4001a;
        if (this == s0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = ((c) s0Var).f5768i;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f5766g;
        if (str2 == null) {
            str2 = this.f5765f.toString();
        }
        return this.f5767h ? a2.m.h(str2, ".immediate") : str2;
    }

    public c(Handler handler, String str, boolean z5) {
        this.f5765f = handler;
        this.f5766g = str;
        this.f5767h = z5;
        this._immediate = z5 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f5768i = cVar;
    }
}
