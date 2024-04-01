package g;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import x0.g1;
import x0.h1;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2769a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f2770b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f2771c;

    /* renamed from: d  reason: collision with root package name */
    public h1 f2772d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2773e;

    /* renamed from: f  reason: collision with root package name */
    public final m f2774f = new m(this);

    public final void a() {
        if (this.f2773e) {
            Iterator it = this.f2769a.iterator();
            while (it.hasNext()) {
                ((g1) it.next()).b();
            }
            this.f2773e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.f2773e) {
            Iterator it = this.f2769a.iterator();
            while (it.hasNext()) {
                g1 g1Var = (g1) it.next();
                long j6 = this.f2770b;
                if (j6 >= 0) {
                    g1Var.c(j6);
                }
                Interpolator interpolator = this.f2771c;
                if (!(interpolator == null || (view = (View) g1Var.f5569a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f2772d != null) {
                    g1Var.d(this.f2774f);
                }
                View view2 = (View) g1Var.f5569a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f2773e = true;
        }
    }
}
