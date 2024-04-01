package f4;

import androidx.compose.ui.platform.e;
import b1.o;
import java.io.Serializable;
import o4.a;

public final class f implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public a f2679d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2680e = e.f891h;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2681f = this;

    public f(a aVar) {
        this.f2679d = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f2680e;
        e eVar = e.f891h;
        if (obj2 != eVar) {
            return obj2;
        }
        synchronized (this.f2681f) {
            obj = this.f2680e;
            if (obj == eVar) {
                a aVar = this.f2679d;
                o.k(aVar);
                obj = aVar.a();
                this.f2680e = obj;
                this.f2679d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2680e != e.f891h ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
