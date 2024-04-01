package h2;

import a2.c0;
import a2.f0;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import b1.o;
import r2.l;

public final class d implements f0, c0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3391d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3392e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3393f;

    public d(Resources resources, f0 f0Var) {
        o.i(resources);
        this.f3392e = resources;
        o.i(f0Var);
        this.f3393f = f0Var;
    }

    public static d e(Bitmap bitmap, b2.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, dVar);
    }

    public final void a() {
        switch (this.f3391d) {
            case 0:
                ((Bitmap) this.f3392e).prepareToDraw();
                return;
            default:
                f0 f0Var = (f0) this.f3393f;
                if (f0Var instanceof c0) {
                    ((c0) f0Var).a();
                    return;
                }
                return;
        }
    }

    public final int b() {
        switch (this.f3391d) {
            case 0:
                return l.c((Bitmap) this.f3392e);
            default:
                return ((f0) this.f3393f).b();
        }
    }

    public final Class c() {
        switch (this.f3391d) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public final void d() {
        int i3 = this.f3391d;
        Object obj = this.f3393f;
        switch (i3) {
            case 0:
                ((b2.d) obj).b((Bitmap) this.f3392e);
                return;
            default:
                ((f0) obj).d();
                return;
        }
    }

    public final Object get() {
        int i3 = this.f3391d;
        Object obj = this.f3392e;
        switch (i3) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((f0) this.f3393f).get());
        }
    }

    public d(Bitmap bitmap, b2.d dVar) {
        if (bitmap != null) {
            this.f3392e = bitmap;
            if (dVar != null) {
                this.f3393f = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }
}
