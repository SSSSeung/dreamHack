package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

public final class i2 implements AdapterView.OnItemSelectedListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f641d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f642e;

    public /* synthetic */ i2(int i3, Object obj) {
        this.f641d = i3;
        this.f642e = obj;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j6) {
        b2 b2Var;
        int i6 = this.f641d;
        Object obj = this.f642e;
        switch (i6) {
            case 0:
                if (i3 != -1 && (b2Var = ((o2) obj).f698f) != null) {
                    b2Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).q(i3);
                return;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
