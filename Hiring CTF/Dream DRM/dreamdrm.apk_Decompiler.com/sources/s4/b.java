package s4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public final int f5076d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5077e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5078f;

    /* renamed from: g  reason: collision with root package name */
    public int f5079g;

    public b(int i3, int i6, int i7) {
        this.f5076d = i7;
        this.f5077e = i6;
        boolean z5 = true;
        if (i7 <= 0 ? i3 < i6 : i3 > i6) {
            z5 = false;
        }
        this.f5078f = z5;
        this.f5079g = !z5 ? i6 : i3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public final int b() {
        int i3 = this.f5079g;
        if (i3 != this.f5077e) {
            this.f5079g = this.f5076d + i3;
        } else if (this.f5078f) {
            this.f5078f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i3;
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return this.f5078f;
    }

    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
