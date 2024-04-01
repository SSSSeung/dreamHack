package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.m3;
import h.c0;
import h.e0;
import h.n;
import h.o;
import h.q;

public final class ExpandedMenuView extends ListView implements n, e0, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f363e = {16842964, 16843049};

    /* renamed from: d  reason: collision with root package name */
    public o f364d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        m3 m3Var = new m3(context, context.obtainStyledAttributes(attributeSet, f363e, 16842868, 0));
        if (m3Var.l(0)) {
            setBackgroundDrawable(m3Var.e(0));
        }
        if (m3Var.l(1)) {
            setDivider(m3Var.e(1));
        }
        m3Var.o();
    }

    public final void a(o oVar) {
        this.f364d = oVar;
    }

    public final boolean b(q qVar) {
        return this.f364d.q(qVar, (c0) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
        b((q) getAdapter().getItem(i3));
    }
}
