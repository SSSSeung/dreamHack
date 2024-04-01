package androidx.appcompat.widget;

import android.database.DataSetObserver;
import c1.a;

public final class l2 extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f654a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f655b;

    public /* synthetic */ l2(int i3, Object obj) {
        this.f654a = i3;
        this.f655b = obj;
    }

    public final void onChanged() {
        int i3 = this.f654a;
        Object obj = this.f655b;
        switch (i3) {
            case 0:
                o2 o2Var = (o2) obj;
                if (o2Var.a()) {
                    o2Var.f();
                    return;
                }
                return;
            default:
                a aVar = (a) obj;
                aVar.f1598d = true;
                aVar.notifyDataSetChanged();
                return;
        }
    }

    public final void onInvalidated() {
        int i3 = this.f654a;
        Object obj = this.f655b;
        switch (i3) {
            case 0:
                ((o2) obj).dismiss();
                return;
            default:
                a aVar = (a) obj;
                aVar.f1598d = false;
                aVar.notifyDataSetInvalidated();
                return;
        }
    }
}
