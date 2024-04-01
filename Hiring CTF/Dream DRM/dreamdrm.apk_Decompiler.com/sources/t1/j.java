package t1;

import android.view.View;
import java.util.ArrayList;

public final class j implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f5123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5124b;

    public j(View view, ArrayList arrayList) {
        this.f5123a = view;
        this.f5124b = arrayList;
    }

    public final void a() {
    }

    public final void b(p pVar) {
        pVar.v(this);
        this.f5123a.setVisibility(8);
        ArrayList arrayList = this.f5124b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((View) arrayList.get(i3)).setVisibility(0);
        }
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }
}
