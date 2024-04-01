package e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.w0;

public final class c implements AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2282d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f2283e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2284f;

    public /* synthetic */ c(Object obj, int i3, Object obj2) {
        this.f2282d = i3;
        this.f2284f = obj;
        this.f2283e = obj2;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
        int i6 = this.f2282d;
        Object obj = this.f2284f;
        switch (i6) {
            case 0:
                d dVar = (d) obj;
                DialogInterface.OnClickListener onClickListener = dVar.f2297l;
                g gVar = (g) this.f2283e;
                onClickListener.onClick(gVar.f2347b, i3);
                if (!dVar.f2299n) {
                    gVar.f2347b.dismiss();
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) obj;
                t0Var.J.setSelection(i3);
                w0 w0Var = t0Var.J;
                if (w0Var.getOnItemClickListener() != null) {
                    w0Var.performItemClick(view, i3, t0Var.G.getItemId(i3));
                }
                t0Var.dismiss();
                return;
        }
    }
}
