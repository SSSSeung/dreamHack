package q2;

import b1.o;
import java.security.MessageDigest;
import y1.f;

public final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f4901b;

    public b(Object obj) {
        o.i(obj);
        this.f4901b = obj;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f4901b.toString().getBytes(f.f5810a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4901b.equals(((b) obj).f4901b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4901b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4901b + '}';
    }
}
