package p0;

import android.view.View;
import b1.v;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4405d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4406e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f4407f;

    public /* synthetic */ m(int i3, int i6, Object obj) {
        this.f4405d = i6;
        this.f4407f = obj;
        this.f4406e = i3;
    }

    public final void run() {
        int i3 = this.f4405d;
        int i6 = this.f4406e;
        Object obj = this.f4407f;
        switch (i3) {
            case 0:
                ((v) obj).H(i6);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f2009p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i6, false);
                    return;
                }
                return;
        }
    }
}
