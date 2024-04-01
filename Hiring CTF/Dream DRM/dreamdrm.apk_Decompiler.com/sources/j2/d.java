package j2;

import a2.f0;
import android.graphics.Bitmap;
import b1.o;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import java.security.MessageDigest;
import y1.m;

public final class d implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f3808b;

    public d(m mVar) {
        o.i(mVar);
        this.f3808b = mVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f3808b.a(messageDigest);
    }

    public final f0 b(g gVar, f0 f0Var, int i3, int i6) {
        c cVar = (c) f0Var.get();
        h2.d dVar = new h2.d(cVar.f3798d.f3797a.f3829l, b.b(gVar).f1689d);
        m mVar = this.f3808b;
        f0 b6 = mVar.b(gVar, dVar, i3, i6);
        if (!dVar.equals(b6)) {
            dVar.d();
        }
        cVar.f3798d.f3797a.c(mVar, (Bitmap) b6.get());
        return f0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3808b.equals(((d) obj).f3808b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3808b.hashCode();
    }
}
