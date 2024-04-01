package kotlinx.coroutines.internal;

import b1.o;
import w4.a0;

public abstract class t {
    private volatile /* synthetic */ int _size = 0;

    public final boolean a() {
        return this._size == 0;
    }

    public final a0 b(int i3) {
        o.k((Object) null);
        this._size--;
        if (i3 < this._size) {
            e(i3, this._size);
            int i6 = (i3 - 1) / 2;
            if (i3 <= 0) {
                int i7 = (i3 * 2) + 1;
                if (i7 < this._size) {
                    o.k((Object) null);
                    if (i7 + 1 < this._size) {
                        throw null;
                    }
                    throw null;
                }
            } else {
                throw null;
            }
        }
        throw null;
    }

    public final a0 c() {
        a0 b6;
        synchronized (this) {
            b6 = this._size > 0 ? b(0) : null;
        }
        return b6;
    }

    public final void d(int i3) {
        if (i3 > 0) {
            o.k((Object) null);
            int i6 = (i3 - 1) / 2;
            throw null;
        }
    }

    public final void e(int i3, int i6) {
        o.k((Object) null);
        throw null;
    }
}
