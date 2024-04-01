package x0;

import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.e;
import e.n0;

public abstract class i2 extends e {

    /* renamed from: o  reason: collision with root package name */
    public final Window f5576o;

    /* renamed from: p  reason: collision with root package name */
    public final n0 f5577p;

    public i2(Window window, n0 n0Var) {
        super(16);
        this.f5576o = window;
        this.f5577p = n0Var;
    }

    public final void C() {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((8 & i3) != 0) {
                if (i3 == 1) {
                    D(4);
                    this.f5576o.clearFlags(1024);
                } else if (i3 == 2) {
                    D(2);
                } else if (i3 == 8) {
                    this.f5577p.G();
                }
            }
        }
    }

    public final void D(int i3) {
        View decorView = this.f5576o.getDecorView();
        decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
    }
}
