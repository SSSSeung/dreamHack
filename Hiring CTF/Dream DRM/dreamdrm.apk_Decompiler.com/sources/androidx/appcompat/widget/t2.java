package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import h.l;
import h.q;

public final class t2 extends b2 {

    /* renamed from: p  reason: collision with root package name */
    public final int f788p;

    /* renamed from: q  reason: collision with root package name */
    public final int f789q;

    /* renamed from: r  reason: collision with root package name */
    public p2 f790r;

    /* renamed from: s  reason: collision with root package name */
    public q f791s;

    public t2(Context context, boolean z5) {
        super(context, z5);
        if (1 == s2.a(context.getResources().getConfiguration())) {
            this.f788p = 21;
            this.f789q = 22;
            return;
        }
        this.f788p = 22;
        this.f789q = 21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = (r2 = pointToPosition((int) r5.getX(), (int) r5.getY())) - r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            androidx.appcompat.widget.p2 r0 = r4.f790r
            if (r0 == 0) goto L_0x005a
            android.widget.ListAdapter r0 = r4.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L_0x0019
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            h.l r0 = (h.l) r0
            goto L_0x001c
        L_0x0019:
            h.l r0 = (h.l) r0
            r1 = 0
        L_0x001c:
            int r2 = r5.getAction()
            r3 = 10
            if (r2 == r3) goto L_0x0043
            float r2 = r5.getX()
            int r2 = (int) r2
            float r3 = r5.getY()
            int r3 = (int) r3
            int r2 = r4.pointToPosition(r2, r3)
            r3 = -1
            if (r2 == r3) goto L_0x0043
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x0043
            int r1 = r0.getCount()
            if (r2 >= r1) goto L_0x0043
            h.q r1 = r0.getItem(r2)
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            h.q r2 = r4.f791s
            if (r2 == r1) goto L_0x005a
            h.o r0 = r0.f3163d
            if (r2 == 0) goto L_0x0051
            androidx.appcompat.widget.p2 r3 = r4.f790r
            r3.g(r0, r2)
        L_0x0051:
            r4.f791s = r1
            if (r1 == 0) goto L_0x005a
            androidx.appcompat.widget.p2 r2 = r4.f790r
            r2.m(r0, r1)
        L_0x005a:
            boolean r5 = super.onHoverEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t2.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f788p) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i3 != this.f789q) {
            return super.onKeyDown(i3, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).f3163d.c(false);
            return true;
        }
    }

    public void setHoverListener(p2 p2Var) {
        this.f790r = p2Var;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
