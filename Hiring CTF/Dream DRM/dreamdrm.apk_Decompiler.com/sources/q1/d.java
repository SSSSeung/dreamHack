package q1;

import android.os.Bundle;
import androidx.lifecycle.i;
import b1.o;
import e.j;
import j.c;
import j.g;
import java.util.Set;
import w4.p;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final g f4891a = new g();

    /* renamed from: b  reason: collision with root package name */
    public boolean f4892b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f4893c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4894d;

    /* renamed from: e  reason: collision with root package name */
    public j f4895e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4896f = true;

    public final Bundle a(String str) {
        o.m(str, "key");
        if (this.f4894d) {
            Bundle bundle = this.f4893c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f4893c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f4893c;
            boolean z5 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z5 = true;
            }
            if (!z5) {
                this.f4893c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final void b(p pVar) {
        if (!this.f4892b) {
            pVar.a(new a(this));
            this.f4892b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void c(String str, c cVar) {
        Object obj;
        o.m(cVar, "provider");
        g gVar = this.f4891a;
        c a6 = gVar.a(str);
        boolean z5 = true;
        if (a6 != null) {
            obj = a6.f3632e;
        } else {
            c cVar2 = new c(str, cVar);
            gVar.f3643g++;
            c cVar3 = gVar.f3641e;
            if (cVar3 == null) {
                gVar.f3640d = cVar2;
            } else {
                cVar3.f3633f = cVar2;
                cVar2.f3634g = cVar3;
            }
            gVar.f3641e = cVar2;
            obj = null;
        }
        if (((c) obj) != null) {
            z5 = false;
        }
        if (!z5) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Class<i> cls = i.class;
        if (this.f4896f) {
            j jVar = this.f4895e;
            if (jVar == null) {
                jVar = new j(this);
            }
            this.f4895e = jVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                j jVar2 = this.f4895e;
                if (jVar2 != null) {
                    ((Set) jVar2.f2389b).add(cls.getName());
                }
            } catch (NoSuchMethodException e6) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
