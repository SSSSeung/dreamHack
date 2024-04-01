package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import b1.f;
import d.a;
import w4.p;
import x0.u0;
import y0.b0;

public final class d0 implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public int f538d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final View f539e;

    /* renamed from: f  reason: collision with root package name */
    public Object f540f;

    public d0(ImageView imageView) {
        this.f539e = imageView;
    }

    public final void a() {
        v3 v3Var;
        ImageView imageView = (ImageView) this.f539e;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            v1.a(drawable);
        }
        if (drawable != null && (v3Var = (v3) this.f540f) != null) {
            x.e(drawable, v3Var, imageView.getDrawableState());
        }
    }

    public final boolean b(View view) {
        throw null;
    }

    public final void c(AttributeSet attributeSet, int i3) {
        int i6;
        View view = this.f539e;
        ImageView imageView = (ImageView) view;
        Context context = imageView.getContext();
        int[] iArr = a.f2118f;
        m3 m6 = m3.m(context, attributeSet, iArr, i3);
        u0.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m6.f686b, i3);
        try {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (!(drawable != null || (i6 = m6.i(1, -1)) == -1 || (drawable = p.n(((ImageView) view).getContext(), i6)) == null)) {
                ((ImageView) view).setImageDrawable(drawable);
            }
            if (drawable != null) {
                v1.a(drawable);
            }
            if (m6.l(2)) {
                f.c((ImageView) view, m6.b(2));
            }
            if (m6.l(3)) {
                f.d((ImageView) view, v1.b(m6.h(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            m6.o();
        }
    }

    public final void d(int i3) {
        Drawable drawable;
        ImageView imageView = (ImageView) this.f539e;
        if (i3 != 0) {
            drawable = p.n(imageView.getContext(), i3);
            if (drawable != null) {
                v1.a(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (((v3) this.f540f) == null) {
            this.f540f = new v3(0);
        }
        v3 v3Var = (v3) this.f540f;
        v3Var.f816c = colorStateList;
        v3Var.f815b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (((v3) this.f540f) == null) {
            this.f540f = new v3(0);
        }
        v3 v3Var = (v3) this.f540f;
        v3Var.f817d = mode;
        v3Var.f814a = true;
        a();
    }
}
