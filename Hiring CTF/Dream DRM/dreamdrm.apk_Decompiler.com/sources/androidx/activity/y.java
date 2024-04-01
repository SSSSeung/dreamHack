package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.e0;
import androidx.fragment.app.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import b1.o;
import g4.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f343a;

    /* renamed from: b  reason: collision with root package name */
    public final g f344b = new g();

    /* renamed from: c  reason: collision with root package name */
    public e0 f345c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f346d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f347e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f348f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f349g;

    public y(Runnable runnable) {
        this.f343a = runnable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f346d = i3 >= 34 ? v.f339a.a(new q(this, 0), new q(this, 1), new r(this, 0), new r(this, 1)) : t.f334a.a(new r(this, 2));
        }
    }

    public final void a(r rVar, e0 e0Var) {
        o.m(e0Var, "onBackPressedCallback");
        t h6 = rVar.h();
        if (h6.f1382v != m.f1370d) {
            e0Var.f1129b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, h6, e0Var));
            d();
            e0Var.f1130c = new x(0, this);
        }
    }

    public final void b() {
        Object obj;
        e0 e0Var = this.f345c;
        if (e0Var == null) {
            g gVar = this.f344b;
            ListIterator listIterator = gVar.listIterator(gVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((e0) obj).f1128a) {
                    break;
                }
            }
            e0Var = (e0) obj;
        }
        this.f345c = null;
        if (e0Var != null) {
            l0 l0Var = e0Var.f1131d;
            l0Var.w(true);
            if (l0Var.f1178h.f1128a) {
                l0Var.N();
            } else {
                l0Var.f1177g.b();
            }
        } else {
            Runnable runnable = this.f343a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void c(boolean z5) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f347e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f346d) != null) {
            t tVar = t.f334a;
            if (z5 && !this.f348f) {
                tVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f348f = true;
            } else if (!z5 && this.f348f) {
                tVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f348f = false;
            }
        }
    }

    public final void d() {
        boolean z5;
        boolean z6 = this.f349g;
        g gVar = this.f344b;
        if (!(gVar instanceof Collection) || !gVar.isEmpty()) {
            Iterator it = gVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((e0) it.next()).f1128a) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z5 = false;
        this.f349g = z5;
        if (z5 != z6 && Build.VERSION.SDK_INT >= 33) {
            c(z5);
        }
    }
}
