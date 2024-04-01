package k;

import h.d;

public final class a extends d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3854d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3855e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f3854d = i3;
        this.f3855e = obj;
    }

    public final void c() {
        int i3 = this.f3854d;
        Object obj = this.f3855e;
        switch (i3) {
            case 0:
                ((b) obj).clear();
                return;
            default:
                ((c) obj).clear();
                return;
        }
    }

    public final Object d(int i3, int i6) {
        int i7 = this.f3854d;
        Object obj = this.f3855e;
        switch (i7) {
            case 0:
                return ((b) obj).f3894e[(i3 << 1) + i6];
            default:
                return ((c) obj).f3864e[i3];
        }
    }

    public final b e() {
        switch (this.f3854d) {
            case 0:
                return (b) this.f3855e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int f() {
        int i3 = this.f3854d;
        Object obj = this.f3855e;
        switch (i3) {
            case 0:
                return ((b) obj).f3895f;
            default:
                return ((c) obj).f3865f;
        }
    }

    public final int g(Object obj) {
        int i3 = this.f3854d;
        Object obj2 = this.f3855e;
        switch (i3) {
            case 0:
                return ((b) obj2).e(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    public final int h(Object obj) {
        int i3 = this.f3854d;
        Object obj2 = this.f3855e;
        switch (i3) {
            case 0:
                return ((b) obj2).g(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    public final void i(Object obj, Object obj2) {
        int i3 = this.f3854d;
        Object obj3 = this.f3855e;
        switch (i3) {
            case 0:
                ((b) obj3).put(obj, obj2);
                return;
            default:
                ((c) obj3).add(obj);
                return;
        }
    }

    public final void j(int i3) {
        int i6 = this.f3854d;
        Object obj = this.f3855e;
        switch (i6) {
            case 0:
                ((b) obj).j(i3);
                return;
            default:
                ((c) obj).e(i3);
                return;
        }
    }

    public final Object k(int i3, Object obj) {
        switch (this.f3854d) {
            case 0:
                return ((b) this.f3855e).k(i3, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
