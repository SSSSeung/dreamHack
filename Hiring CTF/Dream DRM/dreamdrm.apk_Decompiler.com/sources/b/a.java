package b;

import androidx.fragment.app.n0;
import c2.d;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1480a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f1481b;

    public a() {
        this.f1480a = new CopyOnWriteArraySet();
    }

    public final c2.a a() {
        if (((c2.a) this.f1481b) == null) {
            synchronized (this) {
                if (((c2.a) this.f1481b) == null) {
                    this.f1481b = ((d) this.f1480a).a();
                }
                if (((c2.a) this.f1481b) == null) {
                    this.f1481b = new n0(17);
                }
            }
        }
        return (c2.a) this.f1481b;
    }

    public a(d dVar) {
        this.f1480a = dVar;
    }
}
