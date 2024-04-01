package h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class l extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public final o f3163d;

    /* renamed from: e  reason: collision with root package name */
    public int f3164e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3165f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3166g;

    /* renamed from: h  reason: collision with root package name */
    public final LayoutInflater f3167h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3168i;

    public l(o oVar, LayoutInflater layoutInflater, boolean z5, int i3) {
        this.f3166g = z5;
        this.f3167h = layoutInflater;
        this.f3163d = oVar;
        this.f3168i = i3;
        a();
    }

    public final void a() {
        o oVar = this.f3163d;
        q qVar = oVar.f3191v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f3179j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((q) arrayList.get(i3)) == qVar) {
                    this.f3164e = i3;
                    return;
                }
            }
        }
        this.f3164e = -1;
    }

    /* renamed from: b */
    public final q getItem(int i3) {
        ArrayList arrayList;
        boolean z5 = this.f3166g;
        o oVar = this.f3163d;
        if (z5) {
            oVar.i();
            arrayList = oVar.f3179j;
        } else {
            arrayList = oVar.l();
        }
        int i6 = this.f3164e;
        if (i6 >= 0 && i3 >= i6) {
            i3++;
        }
        return (q) arrayList.get(i3);
    }

    public final int getCount() {
        ArrayList arrayList;
        boolean z5 = this.f3166g;
        o oVar = this.f3163d;
        if (z5) {
            oVar.i();
            arrayList = oVar.f3179j;
        } else {
            arrayList = oVar.l();
        }
        int i3 = this.f3164e;
        int size = arrayList.size();
        return i3 < 0 ? size : size - 1;
    }

    public final long getItemId(int i3) {
        return (long) i3;
    }

    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z5 = false;
        if (view == null) {
            view = this.f3167h.inflate(this.f3168i, viewGroup, false);
        }
        int i6 = getItem(i3).f3197b;
        int i7 = i3 - 1;
        int i8 = i7 >= 0 ? getItem(i7).f3197b : i6;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3163d.m() && i6 != i8) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        d0 d0Var = (d0) view;
        if (this.f3165f) {
            listMenuItemView.setForceShowIcon(true);
        }
        d0Var.d(getItem(i3));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
