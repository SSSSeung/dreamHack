package i2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.a0;
import b2.d;
import com.bumptech.glide.n;
import j2.c;
import j2.h;
import x1.e;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f3598e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Drawable drawable, int i3) {
        super(drawable);
        this.f3598e = i3;
    }

    public final void a() {
        Bitmap bitmap;
        int i3 = this.f3598e;
        Drawable drawable = this.f3597d;
        switch (i3) {
            case 1:
                ((c) drawable).f3798d.f3797a.f3829l.prepareToDraw();
                return;
            default:
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else if (drawable instanceof c) {
                    bitmap = ((c) drawable).f3798d.f3797a.f3829l;
                } else {
                    return;
                }
                bitmap.prepareToDraw();
                return;
        }
    }

    public final int b() {
        int i3 = this.f3598e;
        Drawable drawable = this.f3597d;
        switch (i3) {
            case 0:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = ((c) drawable).f3798d.f3797a;
                e eVar = (e) hVar.f3818a;
                return (eVar.f5698j.length * 4) + eVar.f5692d.limit() + eVar.f5697i.length + hVar.f3831n;
        }
    }

    public final Class c() {
        switch (this.f3598e) {
            case 0:
                return this.f3597d.getClass();
            default:
                return c.class;
        }
    }

    public final void d() {
        b2.h hVar;
        b2.h hVar2;
        b2.h hVar3;
        switch (this.f3598e) {
            case 0:
                return;
            default:
                c cVar = (c) this.f3597d;
                cVar.stop();
                cVar.f3801g = true;
                h hVar4 = cVar.f3798d.f3797a;
                hVar4.f3820c.clear();
                Bitmap bitmap = hVar4.f3829l;
                if (bitmap != null) {
                    hVar4.f3822e.b(bitmap);
                    hVar4.f3829l = null;
                }
                hVar4.f3823f = false;
                j2.e eVar = hVar4.f3826i;
                n nVar = hVar4.f3821d;
                if (eVar != null) {
                    nVar.l(eVar);
                    hVar4.f3826i = null;
                }
                j2.e eVar2 = hVar4.f3828k;
                if (eVar2 != null) {
                    nVar.l(eVar2);
                    hVar4.f3828k = null;
                }
                j2.e eVar3 = hVar4.f3830m;
                if (eVar3 != null) {
                    nVar.l(eVar3);
                    hVar4.f3830m = null;
                }
                e eVar4 = (e) hVar4.f3818a;
                eVar4.f5700l = null;
                byte[] bArr = eVar4.f5697i;
                a0 a0Var = eVar4.f5691c;
                if (!(bArr == null || (hVar3 = (b2.h) a0Var.f504f) == null)) {
                    hVar3.g(bArr);
                }
                int[] iArr = eVar4.f5698j;
                if (!(iArr == null || (hVar2 = (b2.h) a0Var.f504f) == null)) {
                    hVar2.g(iArr);
                }
                Bitmap bitmap2 = eVar4.f5701m;
                if (bitmap2 != null) {
                    ((d) a0Var.f503e).b(bitmap2);
                }
                eVar4.f5701m = null;
                eVar4.f5692d = null;
                eVar4.f5707s = null;
                byte[] bArr2 = eVar4.f5693e;
                if (!(bArr2 == null || (hVar = (b2.h) a0Var.f504f) == null)) {
                    hVar.g(bArr2);
                }
                hVar4.f3827j = true;
                return;
        }
    }
}
