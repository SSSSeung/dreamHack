package m1;

import a2.m;
import androidx.fragment.app.n0;
import androidx.lifecycle.k0;
import k.k;

public final class a extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public static final n0 f4173d = new n0(1);

    /* renamed from: c  reason: collision with root package name */
    public final k f4174c = new k();

    public final void a() {
        k kVar = this.f4174c;
        int i3 = kVar.f3899f;
        if (i3 <= 0) {
            Object[] objArr = kVar.f3898e;
            for (int i6 = 0; i6 < i3; i6++) {
                objArr[i6] = null;
            }
            kVar.f3899f = 0;
            return;
        }
        m.o(kVar.f3898e[0]);
        throw null;
    }
}
