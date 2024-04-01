package p3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import j3.a;

public class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public k f4745a;

    /* renamed from: b  reason: collision with root package name */
    public a f4746b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f4747c = null;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f4748d = null;

    /* renamed from: e  reason: collision with root package name */
    public final ColorStateList f4749e = null;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f4750f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f4751g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    public Rect f4752h = null;

    /* renamed from: i  reason: collision with root package name */
    public final float f4753i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f4754j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f4755k;

    /* renamed from: l  reason: collision with root package name */
    public int f4756l = 255;

    /* renamed from: m  reason: collision with root package name */
    public float f4757m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f4758n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    public final float f4759o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    public final int f4760p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f4761q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f4762r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int f4763s = 0;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f4764t = false;

    /* renamed from: u  reason: collision with root package name */
    public final Paint.Style f4765u = Paint.Style.FILL_AND_STROKE;

    public f(f fVar) {
        this.f4745a = fVar.f4745a;
        this.f4746b = fVar.f4746b;
        this.f4755k = fVar.f4755k;
        this.f4747c = fVar.f4747c;
        this.f4748d = fVar.f4748d;
        this.f4751g = fVar.f4751g;
        this.f4750f = fVar.f4750f;
        this.f4756l = fVar.f4756l;
        this.f4753i = fVar.f4753i;
        this.f4762r = fVar.f4762r;
        this.f4760p = fVar.f4760p;
        this.f4764t = fVar.f4764t;
        this.f4754j = fVar.f4754j;
        this.f4757m = fVar.f4757m;
        this.f4758n = fVar.f4758n;
        this.f4759o = fVar.f4759o;
        this.f4761q = fVar.f4761q;
        this.f4763s = fVar.f4763s;
        this.f4749e = fVar.f4749e;
        this.f4765u = fVar.f4765u;
        if (fVar.f4752h != null) {
            this.f4752h = new Rect(fVar.f4752h);
        }
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f4771h = true;
        return gVar;
    }

    public f(k kVar) {
        this.f4745a = kVar;
        this.f4746b = null;
    }
}
