package a2;

import androidx.activity.i;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y1.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27a = false;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f28b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue f29c = new ReferenceQueue();

    /* renamed from: d  reason: collision with root package name */
    public y f30d;

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        newSingleThreadExecutor.execute(new i(8, this));
    }

    public final synchronized void a(f fVar, z zVar) {
        b bVar = (b) this.f28b.put(fVar, new b(fVar, zVar, this.f29c, this.f27a));
        if (bVar != null) {
            bVar.f20c = null;
            bVar.clear();
        }
    }

    public final void b(b bVar) {
        synchronized (this) {
            this.f28b.remove(bVar.f18a);
            if (bVar.f19b) {
                f0 f0Var = bVar.f20c;
                if (f0Var != null) {
                    z zVar = new z(f0Var, true, false, bVar.f18a, this.f30d);
                    ((r) this.f30d).d(bVar.f18a, zVar);
                }
            }
        }
    }
}
