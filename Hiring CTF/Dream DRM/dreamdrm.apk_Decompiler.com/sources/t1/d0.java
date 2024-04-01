package t1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.theori.dreamdrm.R;
import java.util.ArrayList;

public final class d0 extends q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5094a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5095b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f5096c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f5097d;

    public d0(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f5097d = iVar;
        this.f5094a = viewGroup;
        this.f5095b = view;
        this.f5096c = view2;
    }

    public final void b(p pVar) {
        this.f5096c.setTag(R.id.save_overlay_view, (Object) null);
        this.f5094a.getOverlay().remove(this.f5095b);
        pVar.v(this);
    }

    public final void d() {
        this.f5094a.getOverlay().remove(this.f5095b);
    }

    public final void e() {
        View view = this.f5095b;
        if (view.getParent() == null) {
            this.f5094a.getOverlay().add(view);
            return;
        }
        i iVar = this.f5097d;
        ArrayList arrayList = iVar.f5154p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = iVar.f5158t;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) iVar.f5158t.clone();
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((o) arrayList3.get(i3)).a();
            }
        }
    }
}
