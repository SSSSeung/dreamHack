package g;

import android.view.View;
import androidx.appcompat.widget.e4;
import x0.h1;
import x0.i1;

public final class m extends i1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2765a = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2766b;

    /* renamed from: c  reason: collision with root package name */
    public int f2767c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2768d;

    public m(e4 e4Var, int i3) {
        this.f2768d = e4Var;
        this.f2767c = i3;
        this.f2766b = false;
    }

    public final void a() {
        int i3 = this.f2765a;
        Object obj = this.f2768d;
        switch (i3) {
            case 0:
                int i6 = this.f2767c + 1;
                this.f2767c = i6;
                n nVar = (n) obj;
                if (i6 == nVar.f2769a.size()) {
                    h1 h1Var = nVar.f2772d;
                    if (h1Var != null) {
                        h1Var.a();
                    }
                    this.f2767c = 0;
                    this.f2766b = false;
                    nVar.f2773e = false;
                    return;
                }
                return;
            default:
                if (!this.f2766b) {
                    ((e4) obj).f562a.setVisibility(this.f2767c);
                    return;
                }
                return;
        }
    }

    public final void b(View view) {
        switch (this.f2765a) {
            case 1:
                this.f2766b = true;
                return;
            default:
                return;
        }
    }

    public final void c() {
        int i3 = this.f2765a;
        Object obj = this.f2768d;
        switch (i3) {
            case 0:
                if (!this.f2766b) {
                    this.f2766b = true;
                    h1 h1Var = ((n) obj).f2772d;
                    if (h1Var != null) {
                        h1Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((e4) obj).f562a.setVisibility(0);
                return;
        }
    }

    public m(n nVar) {
        this.f2768d = nVar;
        this.f2766b = false;
        this.f2767c = 0;
    }
}
