package q1;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import b1.o;
import j.d;
import j.g;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f4897a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4898b = new d();

    /* renamed from: c  reason: collision with root package name */
    public boolean f4899c;

    public e(f fVar) {
        this.f4897a = fVar;
    }

    public final void a() {
        f fVar = this.f4897a;
        t h6 = fVar.h();
        if (h6.f1382v == m.f1371e) {
            h6.a(new Recreator(fVar));
            this.f4898b.b(h6);
            this.f4899c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        if (!this.f4899c) {
            a();
        }
        t h6 = this.f4897a.h();
        if (!(h6.f1382v.compareTo(m.f1373g) >= 0)) {
            d dVar = this.f4898b;
            if (!dVar.f4892b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!dVar.f4894d) {
                dVar.f4893c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                dVar.f4894d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + h6.f1382v).toString());
        }
    }

    public final void c(Bundle bundle) {
        o.m(bundle, "outBundle");
        d dVar = this.f4898b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = dVar.f4893c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        g gVar = dVar.f4891a;
        gVar.getClass();
        d dVar2 = new d(gVar);
        gVar.f3642f.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
