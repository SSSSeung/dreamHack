package a2;

import java.security.MessageDigest;

public final class f implements y1.f {

    /* renamed from: b  reason: collision with root package name */
    public final y1.f f48b;

    /* renamed from: c  reason: collision with root package name */
    public final y1.f f49c;

    public f(y1.f fVar, y1.f fVar2) {
        this.f48b = fVar;
        this.f49c = fVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.f48b.a(messageDigest);
        this.f49c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f48b.equals(fVar.f48b) && this.f49c.equals(fVar.f49c);
    }

    public final int hashCode() {
        return this.f49c.hashCode() + (this.f48b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f48b + ", signature=" + this.f49c + '}';
    }
}
