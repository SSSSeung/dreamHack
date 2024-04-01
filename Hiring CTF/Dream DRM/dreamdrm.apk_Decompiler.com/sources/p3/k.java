package p3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import y2.a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final d f4801a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4802b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4803c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4804d;

    /* renamed from: e  reason: collision with root package name */
    public final c f4805e;

    /* renamed from: f  reason: collision with root package name */
    public final c f4806f;

    /* renamed from: g  reason: collision with root package name */
    public final c f4807g;

    /* renamed from: h  reason: collision with root package name */
    public final c f4808h;

    /* renamed from: i  reason: collision with root package name */
    public final e f4809i;

    /* renamed from: j  reason: collision with root package name */
    public final e f4810j;

    /* renamed from: k  reason: collision with root package name */
    public final e f4811k;

    /* renamed from: l  reason: collision with root package name */
    public final e f4812l;

    public k() {
        this.f4801a = new i();
        this.f4802b = new i();
        this.f4803c = new i();
        this.f4804d = new i();
        this.f4805e = new a(0.0f);
        this.f4806f = new a(0.0f);
        this.f4807g = new a(0.0f);
        this.f4808h = new a(0.0f);
        this.f4809i = c.j();
        this.f4810j = c.j();
        this.f4811k = c.j();
        this.f4812l = c.j();
    }

    public static j a(Context context, int i3, int i6, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
        if (i6 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i6);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(a.f5840u);
        try {
            int i7 = obtainStyledAttributes.getInt(0, 0);
            int i8 = obtainStyledAttributes.getInt(3, i7);
            int i9 = obtainStyledAttributes.getInt(4, i7);
            int i10 = obtainStyledAttributes.getInt(2, i7);
            int i11 = obtainStyledAttributes.getInt(1, i7);
            c c6 = c(obtainStyledAttributes, 5, aVar);
            c c7 = c(obtainStyledAttributes, 8, c6);
            c c8 = c(obtainStyledAttributes, 9, c6);
            c c9 = c(obtainStyledAttributes, 7, c6);
            c c10 = c(obtainStyledAttributes, 6, c6);
            j jVar = new j();
            d i12 = c.i(i8);
            jVar.f4789a = i12;
            j.b(i12);
            jVar.f4793e = c7;
            d i13 = c.i(i9);
            jVar.f4790b = i13;
            j.b(i13);
            jVar.f4794f = c8;
            d i14 = c.i(i10);
            jVar.f4791c = i14;
            j.b(i14);
            jVar.f4795g = c9;
            d i15 = c.i(i11);
            jVar.f4792d = i15;
            j.b(i15);
            jVar.f4796h = c10;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i3, int i6) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f5834o, i3, i6);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i3, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i3);
        if (peekValue == null) {
            return cVar;
        }
        int i6 = peekValue.type;
        return i6 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i6 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        Class<e> cls = e.class;
        boolean z5 = this.f4812l.getClass().equals(cls) && this.f4810j.getClass().equals(cls) && this.f4809i.getClass().equals(cls) && this.f4811k.getClass().equals(cls);
        float a6 = this.f4805e.a(rectF);
        return z5 && ((this.f4806f.a(rectF) > a6 ? 1 : (this.f4806f.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f4808h.a(rectF) > a6 ? 1 : (this.f4808h.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f4807g.a(rectF) > a6 ? 1 : (this.f4807g.a(rectF) == a6 ? 0 : -1)) == 0) && ((this.f4802b instanceof i) && (this.f4801a instanceof i) && (this.f4803c instanceof i) && (this.f4804d instanceof i));
    }

    public k(j jVar) {
        this.f4801a = jVar.f4789a;
        this.f4802b = jVar.f4790b;
        this.f4803c = jVar.f4791c;
        this.f4804d = jVar.f4792d;
        this.f4805e = jVar.f4793e;
        this.f4806f = jVar.f4794f;
        this.f4807g = jVar.f4795g;
        this.f4808h = jVar.f4796h;
        this.f4809i = jVar.f4797i;
        this.f4810j = jVar.f4798j;
        this.f4811k = jVar.f4799k;
        this.f4812l = jVar.f4800l;
    }
}
