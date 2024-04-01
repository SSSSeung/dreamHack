package a2;

import b1.o;
import y1.f;

public final class z implements f0 {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f179d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f180e;

    /* renamed from: f  reason: collision with root package name */
    public final f0 f181f;

    /* renamed from: g  reason: collision with root package name */
    public final y f182g;

    /* renamed from: h  reason: collision with root package name */
    public final f f183h;

    /* renamed from: i  reason: collision with root package name */
    public int f184i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f185j;

    public z(f0 f0Var, boolean z5, boolean z6, f fVar, y yVar) {
        o.i(f0Var);
        this.f181f = f0Var;
        this.f179d = z5;
        this.f180e = z6;
        this.f183h = fVar;
        o.i(yVar);
        this.f182g = yVar;
    }

    public final synchronized void a() {
        if (!this.f185j) {
            this.f184i++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final int b() {
        return this.f181f.b();
    }

    public final Class c() {
        return this.f181f.c();
    }

    public final synchronized void d() {
        if (this.f184i > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f185j) {
            this.f185j = true;
            if (this.f180e) {
                this.f181f.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final void e() {
        boolean z5;
        synchronized (this) {
            int i3 = this.f184i;
            if (i3 > 0) {
                z5 = true;
                int i6 = i3 - 1;
                this.f184i = i6;
                if (i6 != 0) {
                    z5 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z5) {
            ((r) this.f182g).d(this.f183h, this);
        }
    }

    public final Object get() {
        return this.f181f.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f179d + ", listener=" + this.f182g + ", key=" + this.f183h + ", acquired=" + this.f184i + ", isRecycled=" + this.f185j + ", resource=" + this.f181f + '}';
    }
}
