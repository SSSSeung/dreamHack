package u1;

import android.graphics.Paint;
import p0.c;

public final class g extends j {

    /* renamed from: e  reason: collision with root package name */
    public c f5274e;

    /* renamed from: f  reason: collision with root package name */
    public float f5275f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public c f5276g;

    /* renamed from: h  reason: collision with root package name */
    public float f5277h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f5278i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f5279j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f5280k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f5281l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Cap f5282m = Paint.Cap.BUTT;

    /* renamed from: n  reason: collision with root package name */
    public Paint.Join f5283n = Paint.Join.MITER;

    /* renamed from: o  reason: collision with root package name */
    public float f5284o = 4.0f;

    public g() {
    }

    public final boolean a() {
        return this.f5276g.b() || this.f5274e.b();
    }

    public final boolean b(int[] iArr) {
        return this.f5274e.c(iArr) | this.f5276g.c(iArr);
    }

    public float getFillAlpha() {
        return this.f5278i;
    }

    public int getFillColor() {
        return this.f5276g.f4386a;
    }

    public float getStrokeAlpha() {
        return this.f5277h;
    }

    public int getStrokeColor() {
        return this.f5274e.f4386a;
    }

    public float getStrokeWidth() {
        return this.f5275f;
    }

    public float getTrimPathEnd() {
        return this.f5280k;
    }

    public float getTrimPathOffset() {
        return this.f5281l;
    }

    public float getTrimPathStart() {
        return this.f5279j;
    }

    public void setFillAlpha(float f6) {
        this.f5278i = f6;
    }

    public void setFillColor(int i3) {
        this.f5276g.f4386a = i3;
    }

    public void setStrokeAlpha(float f6) {
        this.f5277h = f6;
    }

    public void setStrokeColor(int i3) {
        this.f5274e.f4386a = i3;
    }

    public void setStrokeWidth(float f6) {
        this.f5275f = f6;
    }

    public void setTrimPathEnd(float f6) {
        this.f5280k = f6;
    }

    public void setTrimPathOffset(float f6) {
        this.f5281l = f6;
    }

    public void setTrimPathStart(float f6) {
        this.f5279j = f6;
    }

    public g(g gVar) {
        super(gVar);
        this.f5274e = gVar.f5274e;
        this.f5275f = gVar.f5275f;
        this.f5277h = gVar.f5277h;
        this.f5276g = gVar.f5276g;
        this.f5299c = gVar.f5299c;
        this.f5278i = gVar.f5278i;
        this.f5279j = gVar.f5279j;
        this.f5280k = gVar.f5280k;
        this.f5281l = gVar.f5281l;
        this.f5282m = gVar.f5282m;
        this.f5283n = gVar.f5283n;
        this.f5284o = gVar.f5284o;
    }
}
