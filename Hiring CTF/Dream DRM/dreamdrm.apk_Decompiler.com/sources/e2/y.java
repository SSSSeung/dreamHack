package e2;

import a2.b0;
import b1.o;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.List;
import w0.c;
import y1.a;

public final class y implements e, d {

    /* renamed from: d  reason: collision with root package name */
    public final List f2548d;

    /* renamed from: e  reason: collision with root package name */
    public final c f2549e;

    /* renamed from: f  reason: collision with root package name */
    public int f2550f;

    /* renamed from: g  reason: collision with root package name */
    public h f2551g;

    /* renamed from: h  reason: collision with root package name */
    public d f2552h;

    /* renamed from: i  reason: collision with root package name */
    public List f2553i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2554j;

    public y(ArrayList arrayList, c cVar) {
        this.f2549e = cVar;
        if (!arrayList.isEmpty()) {
            this.f2548d = arrayList;
            this.f2550f = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final Class a() {
        return ((e) this.f2548d.get(0)).a();
    }

    public final void b() {
        List list = this.f2553i;
        if (list != null) {
            this.f2549e.a(list);
        }
        this.f2553i = null;
        for (e b6 : this.f2548d) {
            b6.b();
        }
    }

    public final a c() {
        return ((e) this.f2548d.get(0)).c();
    }

    public final void cancel() {
        this.f2554j = true;
        for (e cancel : this.f2548d) {
            cancel.cancel();
        }
    }

    public final void d(h hVar, d dVar) {
        this.f2551g = hVar;
        this.f2552h = dVar;
        this.f2553i = (List) this.f2549e.b();
        ((e) this.f2548d.get(this.f2550f)).d(hVar, this);
        if (this.f2554j) {
            cancel();
        }
    }

    public final void e() {
        if (!this.f2554j) {
            if (this.f2550f < this.f2548d.size() - 1) {
                this.f2550f++;
                d(this.f2551g, this.f2552h);
                return;
            }
            o.i(this.f2553i);
            this.f2552h.h(new b0("Fetch failed", new ArrayList(this.f2553i)));
        }
    }

    public final void h(Exception exc) {
        List list = this.f2553i;
        o.i(list);
        list.add(exc);
        e();
    }

    public final void l(Object obj) {
        if (obj != null) {
            this.f2552h.l(obj);
        } else {
            e();
        }
    }
}
