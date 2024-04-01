package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class x implements g0, c0, AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    public Rect f3231d;

    public static int m(l lVar, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = lVar.getCount();
        int i6 = 0;
        int i7 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = lVar.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = lVar.getView(i8, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i6) {
                i6 = measuredWidth;
            }
        }
        return i6;
    }

    public static boolean u(o oVar) {
        int size = oVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = oVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, o oVar) {
    }

    public final boolean g(q qVar) {
        return false;
    }

    public final boolean i(q qVar) {
        return false;
    }

    public abstract void l(o oVar);

    public abstract void n(View view);

    public abstract void o(boolean z5);

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (l) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (l) listAdapter).f3163d.q((MenuItem) listAdapter.getItem(i3), this, (this instanceof i) ^ true ? 0 : 4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z5);

    public abstract void t(int i3);
}
