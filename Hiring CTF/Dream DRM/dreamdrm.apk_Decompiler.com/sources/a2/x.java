package a2;

import b1.o;
import java.security.MessageDigest;
import java.util.Map;
import r2.c;
import y1.f;
import y1.i;

public final class x implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f170b;

    /* renamed from: c  reason: collision with root package name */
    public final int f171c;

    /* renamed from: d  reason: collision with root package name */
    public final int f172d;

    /* renamed from: e  reason: collision with root package name */
    public final Class f173e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f174f;

    /* renamed from: g  reason: collision with root package name */
    public final f f175g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f176h;

    /* renamed from: i  reason: collision with root package name */
    public final i f177i;

    /* renamed from: j  reason: collision with root package name */
    public int f178j;

    public x(Object obj, f fVar, int i3, int i6, c cVar, Class cls, Class cls2, i iVar) {
        o.i(obj);
        this.f170b = obj;
        if (fVar != null) {
            this.f175g = fVar;
            this.f171c = i3;
            this.f172d = i6;
            o.i(cVar);
            this.f176h = cVar;
            if (cls != null) {
                this.f173e = cls;
                if (cls2 != null) {
                    this.f174f = cls2;
                    o.i(iVar);
                    this.f177i = iVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f170b.equals(xVar.f170b) && this.f175g.equals(xVar.f175g) && this.f172d == xVar.f172d && this.f171c == xVar.f171c && this.f176h.equals(xVar.f176h) && this.f173e.equals(xVar.f173e) && this.f174f.equals(xVar.f174f) && this.f177i.equals(xVar.f177i);
    }

    public final int hashCode() {
        if (this.f178j == 0) {
            int hashCode = this.f170b.hashCode();
            this.f178j = hashCode;
            int hashCode2 = ((((this.f175g.hashCode() + (hashCode * 31)) * 31) + this.f171c) * 31) + this.f172d;
            this.f178j = hashCode2;
            int hashCode3 = this.f176h.hashCode() + (hashCode2 * 31);
            this.f178j = hashCode3;
            int hashCode4 = this.f173e.hashCode() + (hashCode3 * 31);
            this.f178j = hashCode4;
            int hashCode5 = this.f174f.hashCode() + (hashCode4 * 31);
            this.f178j = hashCode5;
            this.f178j = this.f177i.hashCode() + (hashCode5 * 31);
        }
        return this.f178j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f170b + ", width=" + this.f171c + ", height=" + this.f172d + ", resourceClass=" + this.f173e + ", transcodeClass=" + this.f174f + ", signature=" + this.f175g + ", hashCode=" + this.f178j + ", transformations=" + this.f176h + ", options=" + this.f177i + '}';
    }
}
