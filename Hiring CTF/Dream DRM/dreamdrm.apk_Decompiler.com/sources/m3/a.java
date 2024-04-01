package m3;

import android.graphics.Typeface;
import e2.f;
import h5.d;
import k3.b;

public final class a extends d {

    /* renamed from: g  reason: collision with root package name */
    public final Typeface f4185g;

    /* renamed from: h  reason: collision with root package name */
    public final f f4186h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4187i;

    public a(f fVar, Typeface typeface) {
        this.f4185g = typeface;
        this.f4186h = fVar;
    }

    public final void j(int i3) {
        if (!this.f4187i) {
            b bVar = (b) this.f4186h.f2505e;
            if (bVar.j(this.f4185g)) {
                bVar.h(false);
            }
        }
    }

    public final void k(Typeface typeface, boolean z5) {
        if (!this.f4187i) {
            b bVar = (b) this.f4186h.f2505e;
            if (bVar.j(typeface)) {
                bVar.h(false);
            }
        }
    }
}
