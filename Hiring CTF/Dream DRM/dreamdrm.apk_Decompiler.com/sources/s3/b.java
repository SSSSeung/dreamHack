package s3;

import android.view.View;

public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4956a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f4957b;

    public /* synthetic */ b(o oVar, int i3) {
        this.f4956a = i3;
        this.f4957b = oVar;
    }

    public final void onFocusChange(View view, boolean z5) {
        int i3 = this.f4956a;
        o oVar = this.f4957b;
        switch (i3) {
            case 0:
                d dVar = (d) oVar;
                dVar.t(dVar.u());
                return;
            default:
                k kVar = (k) oVar;
                kVar.f4980l = z5;
                kVar.q();
                if (!z5) {
                    kVar.t(false);
                    kVar.f4981m = false;
                    return;
                }
                return;
        }
    }
}
