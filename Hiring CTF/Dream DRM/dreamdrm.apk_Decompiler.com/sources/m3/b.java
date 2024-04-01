package m3;

import android.graphics.Typeface;
import b1.v;
import h5.d;

public final class b extends v {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f4188g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f4189h;

    public b(d dVar, d dVar2) {
        this.f4189h = dVar;
        this.f4188g = dVar2;
    }

    public final void H(int i3) {
        this.f4189h.f4206m = true;
        this.f4188g.j(i3);
    }

    public final void I(Typeface typeface) {
        d dVar = this.f4189h;
        dVar.f4207n = Typeface.create(typeface, dVar.f4196c);
        dVar.f4206m = true;
        this.f4188g.k(dVar.f4207n, false);
    }
}
