package d3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.theori.dreamdrm.R;
import java.util.WeakHashMap;
import n3.a;
import p3.f;
import p3.g;
import p3.k;
import p3.v;
import r0.b;
import x0.e0;
import x0.u0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f2155a;

    /* renamed from: b  reason: collision with root package name */
    public k f2156b;

    /* renamed from: c  reason: collision with root package name */
    public int f2157c;

    /* renamed from: d  reason: collision with root package name */
    public int f2158d;

    /* renamed from: e  reason: collision with root package name */
    public int f2159e;

    /* renamed from: f  reason: collision with root package name */
    public int f2160f;

    /* renamed from: g  reason: collision with root package name */
    public int f2161g;

    /* renamed from: h  reason: collision with root package name */
    public int f2162h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f2163i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2164j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f2165k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f2166l;

    /* renamed from: m  reason: collision with root package name */
    public g f2167m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2168n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2169o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2170p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2171q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2172r = true;

    /* renamed from: s  reason: collision with root package name */
    public RippleDrawable f2173s;

    /* renamed from: t  reason: collision with root package name */
    public int f2174t;

    public c(MaterialButton materialButton, k kVar) {
        this.f2155a = materialButton;
        this.f2156b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f2173s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (v) (this.f2173s.getNumberOfLayers() > 2 ? this.f2173s.getDrawable(2) : this.f2173s.getDrawable(1));
    }

    public final g b(boolean z5) {
        RippleDrawable rippleDrawable = this.f2173s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f2173s.getDrawable(0)).getDrawable()).getDrawable(z5 ^ true ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f2156b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i3, int i6) {
        WeakHashMap weakHashMap = u0.f5622a;
        MaterialButton materialButton = this.f2155a;
        int f6 = e0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e6 = e0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i7 = this.f2159e;
        int i8 = this.f2160f;
        this.f2160f = i6;
        this.f2159e = i3;
        if (!this.f2169o) {
            e();
        }
        e0.k(materialButton, f6, (paddingTop + i3) - i7, e6, (paddingBottom + i6) - i8);
    }

    public final void e() {
        g gVar = new g(this.f2156b);
        MaterialButton materialButton = this.f2155a;
        gVar.h(materialButton.getContext());
        b.h(gVar, this.f2164j);
        PorterDuff.Mode mode = this.f2163i;
        if (mode != null) {
            b.i(gVar, mode);
        }
        ColorStateList colorStateList = this.f2165k;
        gVar.f4767d.f4755k = (float) this.f2162h;
        gVar.invalidateSelf();
        f fVar = gVar.f4767d;
        if (fVar.f4748d != colorStateList) {
            fVar.f4748d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f2156b);
        gVar2.setTint(0);
        float f6 = (float) this.f2162h;
        int u3 = this.f2168n ? b1.v.u(materialButton, R.attr.colorSurface) : 0;
        gVar2.f4767d.f4755k = f6;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(u3);
        f fVar2 = gVar2.f4767d;
        if (fVar2.f4748d != valueOf) {
            fVar2.f4748d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f2156b);
        this.f2167m = gVar3;
        b.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(a.a(this.f2166l), new InsetDrawable(new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f2157c, this.f2159e, this.f2158d, this.f2160f), this.f2167m);
        this.f2173s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b6 = b(false);
        if (b6 != null) {
            b6.i((float) this.f2174t);
            b6.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i3 = 0;
        g b6 = b(false);
        g b7 = b(true);
        if (b6 != null) {
            ColorStateList colorStateList = this.f2165k;
            b6.f4767d.f4755k = (float) this.f2162h;
            b6.invalidateSelf();
            f fVar = b6.f4767d;
            if (fVar.f4748d != colorStateList) {
                fVar.f4748d = colorStateList;
                b6.onStateChange(b6.getState());
            }
            if (b7 != null) {
                float f6 = (float) this.f2162h;
                if (this.f2168n) {
                    i3 = b1.v.u(this.f2155a, R.attr.colorSurface);
                }
                b7.f4767d.f4755k = f6;
                b7.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i3);
                f fVar2 = b7.f4767d;
                if (fVar2.f4748d != valueOf) {
                    fVar2.f4748d = valueOf;
                    b7.onStateChange(b7.getState());
                }
            }
        }
    }
}
