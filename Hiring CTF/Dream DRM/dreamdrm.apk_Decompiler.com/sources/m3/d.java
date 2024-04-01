package m3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import b1.o;
import b1.v;
import p0.p;
import y2.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f4194a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4195b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4196c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4197d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4198e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4199f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4200g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4201h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4202i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f4203j;

    /* renamed from: k  reason: collision with root package name */
    public float f4204k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4205l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4206m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f4207n;

    public d(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, a.f5842x);
        this.f4204k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f4203j = o.u(context, obtainStyledAttributes, 3);
        o.u(context, obtainStyledAttributes, 4);
        o.u(context, obtainStyledAttributes, 5);
        this.f4196c = obtainStyledAttributes.getInt(2, 0);
        this.f4197d = obtainStyledAttributes.getInt(1, 1);
        int i6 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f4205l = obtainStyledAttributes.getResourceId(i6, 0);
        this.f4195b = obtainStyledAttributes.getString(i6);
        obtainStyledAttributes.getBoolean(14, false);
        this.f4194a = o.u(context, obtainStyledAttributes, 6);
        this.f4198e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f4199f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f4200g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i3, a.f5835p);
        this.f4201h = obtainStyledAttributes2.hasValue(0);
        this.f4202i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f4207n;
        int i3 = this.f4196c;
        if (typeface == null && (str = this.f4195b) != null) {
            this.f4207n = Typeface.create(str, i3);
        }
        if (this.f4207n == null) {
            int i6 = this.f4197d;
            this.f4207n = i6 != 1 ? i6 != 2 ? i6 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f4207n = Typeface.create(this.f4207n, i3);
        }
    }

    public final Typeface b(Context context) {
        Typeface typeface;
        if (this.f4206m) {
            return this.f4207n;
        }
        if (!context.isRestricted()) {
            try {
                int i3 = this.f4205l;
                ThreadLocal threadLocal = p.f4411a;
                if (context.isRestricted()) {
                    typeface = null;
                } else {
                    typeface = p.a(context, i3, new TypedValue(), 0, (v) null, false, false);
                }
                this.f4207n = typeface;
                if (typeface != null) {
                    this.f4207n = Typeface.create(typeface, this.f4196c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e6) {
                Log.d("TextAppearance", "Error loading font " + this.f4195b, e6);
            }
        }
        a();
        this.f4206m = true;
        return this.f4207n;
    }

    public final void c(Context context, h5.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i3 = this.f4205l;
        if (i3 == 0) {
            this.f4206m = true;
        }
        if (this.f4206m) {
            dVar.k(this.f4207n, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = p.f4411a;
            if (context.isRestricted()) {
                bVar.c(-4);
                return;
            }
            p.a(context, i3, new TypedValue(), 0, bVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f4206m = true;
            dVar.j(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f4195b, e6);
            this.f4206m = true;
            dVar.j(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f4205l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal r0 = p0.p.f4411a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = p0.p.a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, h5.d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f4203j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f4194a;
        textPaint.setShadowLayer(this.f4200g, this.f4198e, this.f4199f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, h5.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f4207n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface F = v.F(context.getResources().getConfiguration(), typeface);
        if (F != null) {
            typeface = F;
        }
        textPaint.setTypeface(typeface);
        int i3 = (~typeface.getStyle()) & this.f4196c;
        textPaint.setFakeBoldText((i3 & 1) != 0);
        textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4204k);
        if (this.f4201h) {
            textPaint.setLetterSpacing(this.f4202i);
        }
    }
}
