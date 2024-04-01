package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import s3.t;

public final class h3 implements AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f626d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f627e;

    public /* synthetic */ h3(View view, int i3) {
        this.f626d = i3;
        this.f627e = view;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
        Object obj;
        int i6 = this.f626d;
        View view2 = this.f627e;
        switch (i6) {
            case 0:
                ((SearchView) view2).p(i3);
                return;
            default:
                t tVar = (t) view2;
                View view3 = null;
                if (i3 < 0) {
                    o2 o2Var = tVar.f5049h;
                    obj = !o2Var.a() ? null : o2Var.f698f.getSelectedItem();
                } else {
                    obj = tVar.getAdapter().getItem(i3);
                }
                t.a(tVar, obj);
                AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
                o2 o2Var2 = tVar.f5049h;
                if (onItemClickListener != null) {
                    if (view == null || i3 < 0) {
                        if (o2Var2.a()) {
                            view3 = o2Var2.f698f.getSelectedView();
                        }
                        view = view3;
                        i3 = !o2Var2.a() ? -1 : o2Var2.f698f.getSelectedItemPosition();
                        j6 = !o2Var2.a() ? Long.MIN_VALUE : o2Var2.f698f.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(o2Var2.f698f, view, i3, j6);
                }
                o2Var2.dismiss();
                return;
        }
    }
}
