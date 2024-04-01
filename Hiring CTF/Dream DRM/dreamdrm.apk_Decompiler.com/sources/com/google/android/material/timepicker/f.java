package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theori.dreamdrm.R;
import java.util.WeakHashMap;
import p3.g;
import p3.h;
import p3.j;
import p3.k;
import x0.d0;
import x0.e0;
import x0.u0;
import y2.a;

public abstract class f extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    public final e f2093t = new e(this);

    /* renamed from: u  reason: collision with root package name */
    public int f2094u;

    /* renamed from: v  reason: collision with root package name */
    public g f2095v;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.f2095v = gVar;
        h hVar = new h(0.5f);
        k kVar = gVar.f4767d.f4745a;
        kVar.getClass();
        j jVar = new j(kVar);
        jVar.f4793e = hVar;
        jVar.f4794f = hVar;
        jVar.f4795g = hVar;
        jVar.f4796h = hVar;
        gVar.setShapeAppearanceModel(new k(jVar));
        this.f2095v.j(ColorStateList.valueOf(-1));
        g gVar2 = this.f2095v;
        WeakHashMap weakHashMap = u0.f5622a;
        d0.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f5838s, R.attr.materialClockStyle, 0);
        this.f2094u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = u0.f5622a;
            view.setId(e0.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f2093t;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void f();

    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f2093t;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public final void setBackgroundColor(int i3) {
        this.f2095v.j(ColorStateList.valueOf(i3));
    }
}
