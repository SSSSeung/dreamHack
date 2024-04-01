package h2;

import a2.f0;
import android.graphics.drawable.Drawable;
import b2.d;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import java.security.MessageDigest;
import y1.m;

public final class r implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f3428b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3429c;

    public r(m mVar, boolean z5) {
        this.f3428b = mVar;
        this.f3429c = z5;
    }

    public final void a(MessageDigest messageDigest) {
        this.f3428b.a(messageDigest);
    }

    public final f0 b(g gVar, f0 f0Var, int i3, int i6) {
        d dVar = b.b(gVar).f1689d;
        Drawable drawable = (Drawable) f0Var.get();
        d a6 = h5.d.a(dVar, drawable, i3, i6);
        if (a6 != null) {
            f0 b6 = this.f3428b.b(gVar, a6, i3, i6);
            if (!b6.equals(a6)) {
                return new d(gVar.getResources(), b6);
            }
            b6.d();
            return f0Var;
        } else if (!this.f3429c) {
            return f0Var;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f3428b.equals(((r) obj).f3428b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3428b.hashCode();
    }
}
