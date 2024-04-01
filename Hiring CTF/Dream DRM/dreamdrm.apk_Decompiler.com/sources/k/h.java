package k;

import h.d;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class h implements Iterator, Map.Entry {

    /* renamed from: d  reason: collision with root package name */
    public int f3884d;

    /* renamed from: e  reason: collision with root package name */
    public int f3885e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3886f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f3887g;

    public h(d dVar) {
        this.f3887g = dVar;
        this.f3884d = dVar.f() - 1;
        this.f3885e = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f3886f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i3 = this.f3885e;
            d dVar = this.f3887g;
            Object d6 = dVar.d(i3, 0);
            if (!(key == d6 || (key != null && key.equals(d6)))) {
                return false;
            }
            Object value = entry.getValue();
            Object d7 = dVar.d(this.f3885e, 1);
            return value == d7 || (value != null && value.equals(d7));
        }
    }

    public final Object getKey() {
        if (this.f3886f) {
            return this.f3887g.d(this.f3885e, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f3886f) {
            return this.f3887g.d(this.f3885e, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.f3885e < this.f3884d;
    }

    public final int hashCode() {
        if (this.f3886f) {
            int i3 = this.f3885e;
            d dVar = this.f3887g;
            int i6 = 0;
            Object d6 = dVar.d(i3, 0);
            Object d7 = dVar.d(this.f3885e, 1);
            int hashCode = d6 == null ? 0 : d6.hashCode();
            if (d7 != null) {
                i6 = d7.hashCode();
            }
            return hashCode ^ i6;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.f3885e++;
            this.f3886f = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f3886f) {
            this.f3887g.j(this.f3885e);
            this.f3885e--;
            this.f3884d--;
            this.f3886f = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f3886f) {
            return this.f3887g.k(this.f3885e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
