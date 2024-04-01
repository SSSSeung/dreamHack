package androidx.appcompat.widget;

import android.view.MenuItem;
import h.m;
import h.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class y3 implements p, m {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Toolbar f864d;

    public /* synthetic */ y3(Toolbar toolbar) {
        this.f864d = toolbar;
    }

    public final void c(o oVar) {
        Toolbar toolbar = this.f864d;
        m mVar = toolbar.f473d.w;
        if (!(mVar != null && mVar.j())) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.J.f328f).iterator();
            if (it.hasNext()) {
                a2.m.o(it.next());
                throw null;
            }
        }
    }

    public final boolean d(o oVar, MenuItem menuItem) {
        this.f864d.getClass();
        return false;
    }
}
