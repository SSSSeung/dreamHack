package g3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import h5.d;
import k3.h;
import k3.i;

public final class b extends d {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2853g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f2854h;

    public /* synthetic */ b(int i3, Object obj) {
        this.f2853g = i3;
        this.f2854h = obj;
    }

    public final void j(int i3) {
        switch (this.f2853g) {
            case 0:
                return;
            default:
                i iVar = (i) this.f2854h;
                iVar.f3963d = true;
                h hVar = (h) iVar.f3964e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    public final void k(Typeface typeface, boolean z5) {
        int i3 = this.f2853g;
        Object obj = this.f2854h;
        switch (i3) {
            case 0:
                Chip chip = (Chip) obj;
                f fVar = chip.f1892h;
                chip.setText(fVar.G0 ? fVar.H : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z5) {
                    i iVar = (i) obj;
                    iVar.f3963d = true;
                    h hVar = (h) iVar.f3964e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
