package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.theori.dreamdrm.R;
import java.util.ArrayList;

public final class j extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public int f3155d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f3156e;

    public j(k kVar) {
        this.f3156e = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f3156e.f3159f;
        q qVar = oVar.f3191v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f3179j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((q) arrayList.get(i3)) == qVar) {
                    this.f3155d = i3;
                    return;
                }
            }
        }
        this.f3155d = -1;
    }

    /* renamed from: b */
    public final q getItem(int i3) {
        k kVar = this.f3156e;
        o oVar = kVar.f3159f;
        oVar.i();
        ArrayList arrayList = oVar.f3179j;
        kVar.getClass();
        int i6 = i3 + 0;
        int i7 = this.f3155d;
        if (i7 >= 0 && i6 >= i7) {
            i6++;
        }
        return (q) arrayList.get(i6);
    }

    public final int getCount() {
        k kVar = this.f3156e;
        o oVar = kVar.f3159f;
        oVar.i();
        int size = oVar.f3179j.size();
        kVar.getClass();
        int i3 = size + 0;
        return this.f3155d < 0 ? i3 : i3 - 1;
    }

    public final long getItemId(int i3) {
        return (long) i3;
    }

    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3156e.f3158e.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((d0) view).d(getItem(i3));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
