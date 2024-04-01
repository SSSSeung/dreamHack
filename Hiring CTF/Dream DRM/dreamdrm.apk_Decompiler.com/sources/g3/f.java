package g3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.theori.dreamdrm.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k3.h;
import k3.i;
import m3.d;
import n3.a;
import p3.g;
import p3.j;
import p3.k;
import p3.m;
import r0.c;
import r0.e;
import z2.b;

public final class f extends g implements Drawable.Callback, h {
    public static final int[] J0 = {16842910};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public PorterDuff.Mode A0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList B;
    public int[] B0;
    public float C;
    public boolean C0;
    public float D = -1.0f;
    public ColorStateList D0;
    public ColorStateList E;
    public WeakReference E0 = new WeakReference((Object) null);
    public float F;
    public TextUtils.TruncateAt F0;
    public ColorStateList G;
    public boolean G0;
    public CharSequence H;
    public int H0;
    public boolean I;
    public boolean I0;
    public Drawable J;
    public ColorStateList K;
    public float L;
    public boolean M;
    public boolean N;
    public Drawable O;
    public RippleDrawable P;
    public ColorStateList Q;
    public float R;
    public SpannableStringBuilder S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public ColorStateList W;
    public b X;
    public b Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f2870a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f2871b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f2872c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f2873d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f2874e0;
    public float f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f2875g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Context f2876h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Paint f2877i0 = new Paint(1);

    /* renamed from: j0  reason: collision with root package name */
    public final Paint.FontMetrics f2878j0 = new Paint.FontMetrics();

    /* renamed from: k0  reason: collision with root package name */
    public final RectF f2879k0 = new RectF();

    /* renamed from: l0  reason: collision with root package name */
    public final PointF f2880l0 = new PointF();

    /* renamed from: m0  reason: collision with root package name */
    public final Path f2881m0 = new Path();

    /* renamed from: n0  reason: collision with root package name */
    public final i f2882n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f2883o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f2884p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2885q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2886r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f2887s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f2888t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2889u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f2890v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f2891w0 = 255;

    /* renamed from: x0  reason: collision with root package name */
    public ColorFilter f2892x0;

    /* renamed from: y0  reason: collision with root package name */
    public PorterDuffColorFilter f2893y0;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f2894z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131756040);
        h(context);
        this.f2876h0 = context;
        i iVar = new i(this);
        this.f2882n0 = iVar;
        this.H = "";
        iVar.f3960a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = J0;
        setState(iArr);
        if (!Arrays.equals(this.B0, iArr)) {
            this.B0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.G0 = true;
        int[] iArr2 = a.f4323a;
        K0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f6) {
        if (this.D != f6) {
            this.D = f6;
            k kVar = this.f4767d.f4745a;
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.f4793e = new p3.a(f6);
            jVar.f4794f = new p3.a(f6);
            jVar.f4795g = new p3.a(f6);
            jVar.f4796h = new p3.a(f6);
            setShapeAppearanceModel(new k(jVar));
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.J;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof e) {
            ((r0.f) ((e) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.J = drawable3;
            float p5 = p();
            U(drawable2);
            if (S()) {
                n(this.J);
            }
            invalidateSelf();
            if (p2 != p5) {
                u();
            }
        }
    }

    public final void C(float f6) {
        if (this.L != f6) {
            float p2 = p();
            this.L = f6;
            float p5 = p();
            invalidateSelf();
            if (p2 != p5) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.M = true;
        if (this.K != colorStateList) {
            this.K = colorStateList;
            if (S()) {
                r0.b.h(this.J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z5) {
        if (this.I != z5) {
            boolean S2 = S();
            this.I = z5;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.J);
                } else {
                    U(this.J);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (this.I0) {
                p3.f fVar = this.f4767d;
                if (fVar.f4748d != colorStateList) {
                    fVar.f4748d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f6) {
        if (this.F != f6) {
            this.F = f6;
            this.f2877i0.setStrokeWidth(f6);
            if (this.I0) {
                this.f4767d.f4755k = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.O;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof e) {
            ((r0.f) ((e) drawable2)).getClass();
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q5 = q();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.O = drawable3;
            int[] iArr = a.f4323a;
            this.P = new RippleDrawable(a.a(this.G), this.O, K0);
            float q6 = q();
            U(drawable2);
            if (T()) {
                n(this.O);
            }
            invalidateSelf();
            if (q5 != q6) {
                u();
            }
        }
    }

    public final void I(float f6) {
        if (this.f0 != f6) {
            this.f0 = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f6) {
        if (this.R != f6) {
            this.R = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f6) {
        if (this.f2874e0 != f6) {
            this.f2874e0 = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (T()) {
                r0.b.h(this.O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z5) {
        if (this.N != z5) {
            boolean T2 = T();
            this.N = z5;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.O);
                } else {
                    U(this.O);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f6) {
        if (this.f2871b0 != f6) {
            float p2 = p();
            this.f2871b0 = f6;
            float p5 = p();
            invalidateSelf();
            if (p2 != p5) {
                u();
            }
        }
    }

    public final void O(float f6) {
        if (this.f2870a0 != f6) {
            float p2 = p();
            this.f2870a0 = f6;
            float p5 = p();
            invalidateSelf();
            if (p2 != p5) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            this.D0 = this.C0 ? a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void Q(d dVar) {
        i iVar = this.f2882n0;
        if (iVar.f3965f != dVar) {
            iVar.f3965f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f3960a;
                Context context = this.f2876h0;
                b bVar = iVar.f3961b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f3964e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.f3963d = true;
            }
            h hVar2 = (h) iVar.f3964e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.U && this.V != null && this.f2889u0;
    }

    public final boolean S() {
        return this.I && this.J != null;
    }

    public final boolean T() {
        return this.N && this.O != null;
    }

    public final void draw(Canvas canvas) {
        int i3;
        RectF rectF;
        int i6;
        int i7;
        int i8;
        RectF rectF2;
        int i9;
        float f6;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i3 = this.f2891w0) != 0) {
            int saveLayerAlpha = i3 < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i3) : 0;
            boolean z5 = this.I0;
            Paint paint = this.f2877i0;
            RectF rectF3 = this.f2879k0;
            if (!z5) {
                paint.setColor(this.f2883o0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (!this.I0) {
                paint.setColor(this.f2884p0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f2892x0;
                if (colorFilter == null) {
                    colorFilter = this.f2893y0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (this.I0) {
                super.draw(canvas);
            }
            if (this.F > 0.0f && !this.I0) {
                paint.setColor(this.f2886r0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.I0) {
                    ColorFilter colorFilter2 = this.f2892x0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f2893y0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f7 = this.F / 2.0f;
                rectF3.set(((float) bounds.left) + f7, ((float) bounds.top) + f7, ((float) bounds.right) - f7, ((float) bounds.bottom) - f7);
                float f8 = this.D - (this.F / 2.0f);
                canvas2.drawRoundRect(rectF3, f8, f8, paint);
            }
            paint.setColor(this.f2887s0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.I0) {
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f2881m0;
                m mVar = this.f4784u;
                p3.f fVar = this.f4767d;
                mVar.a(fVar.f4745a, fVar.f4754j, rectF4, this.f4783t, path);
                e(canvas, paint, path, this.f4767d.f4745a, g());
            }
            if (S()) {
                o(bounds, rectF3);
                float f9 = rectF3.left;
                float f10 = rectF3.top;
                canvas2.translate(f9, f10);
                this.J.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.J.draw(canvas2);
                canvas2.translate(-f9, -f10);
            }
            if (R()) {
                o(bounds, rectF3);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                canvas2.translate(f11, f12);
                this.V.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.V.draw(canvas2);
                canvas2.translate(-f11, -f12);
            }
            if (!this.G0 || this.H == null) {
                rectF = rectF3;
                i7 = saveLayerAlpha;
                i6 = 0;
                i8 = 255;
            } else {
                PointF pointF = this.f2880l0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.H;
                i iVar = this.f2882n0;
                if (charSequence != null) {
                    float p2 = p() + this.Z + this.f2872c0;
                    if (c.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + p2;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - p2;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = iVar.f3960a;
                    Paint.FontMetrics fontMetrics = this.f2878j0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.H != null) {
                    float p5 = p() + this.Z + this.f2872c0;
                    float q5 = q() + this.f2875g0 + this.f2873d0;
                    if (c.a(this) == 0) {
                        rectF3.left = ((float) bounds.left) + p5;
                        f6 = ((float) bounds.right) - q5;
                    } else {
                        rectF3.left = ((float) bounds.left) + q5;
                        f6 = ((float) bounds.right) - p5;
                    }
                    rectF3.right = f6;
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                d dVar = iVar.f3965f;
                TextPaint textPaint2 = iVar.f3960a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f3965f.e(this.f2876h0, textPaint2, iVar.f3961b);
                }
                textPaint2.setTextAlign(align);
                boolean z6 = Math.round(iVar.a(this.H.toString())) > Math.round(rectF3.width());
                if (z6) {
                    i9 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i9 = 0;
                }
                CharSequence charSequence2 = this.H;
                if (z6 && this.F0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.F0);
                }
                CharSequence charSequence3 = charSequence2;
                rectF = rectF3;
                int length = charSequence3.length();
                i7 = saveLayerAlpha;
                float f13 = pointF.x;
                i6 = 0;
                float f14 = pointF.y;
                i8 = 255;
                canvas.drawText(charSequence3, 0, length, f13, f14, textPaint2);
                if (z6) {
                    canvas2.restoreToCount(i9);
                }
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f15 = this.f2875g0 + this.f0;
                    if (c.a(this) == 0) {
                        float f16 = ((float) bounds.right) - f15;
                        rectF2 = rectF;
                        rectF2.right = f16;
                        rectF2.left = f16 - this.R;
                    } else {
                        rectF2 = rectF;
                        float f17 = ((float) bounds.left) + f15;
                        rectF2.left = f17;
                        rectF2.right = f17 + this.R;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f18 = this.R;
                    float f19 = exactCenterY - (f18 / 2.0f);
                    rectF2.top = f19;
                    rectF2.bottom = f19 + f18;
                } else {
                    rectF2 = rectF;
                }
                float f20 = rectF2.left;
                float f21 = rectF2.top;
                canvas2.translate(f20, f21);
                this.O.setBounds(i6, i6, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = a.f4323a;
                this.P.setBounds(this.O.getBounds());
                this.P.jumpToCurrentState();
                this.P.draw(canvas2);
                canvas2.translate(-f20, -f21);
            }
            if (this.f2891w0 < i8) {
                canvas2.restoreToCount(i7);
            }
        }
    }

    public final int getAlpha() {
        return this.f2891w0;
    }

    public final ColorFilter getColorFilter() {
        return this.f2892x0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.C;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f2882n0.a(this.H.toString()) + p() + this.Z + this.f2872c0 + this.f2873d0 + this.f2875g0), this.H0);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.C, this.D);
        }
        outline.setAlpha(((float) this.f2891w0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f4203j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.A
            boolean r0 = s(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.B
            boolean r0 = s(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.E
            boolean r0 = s(r0)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.C0
            if (r0 == 0) goto L_0x0025
            android.content.res.ColorStateList r0 = r3.D0
            boolean r0 = s(r0)
            if (r0 != 0) goto L_0x0066
        L_0x0025:
            k3.i r0 = r3.f2882n0
            m3.d r0 = r0.f3965f
            r2 = 0
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f4203j
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.U
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.V
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.T
            if (r0 == 0) goto L_0x0049
            r0 = r1
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.J
            boolean r0 = t(r0)
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.V
            boolean r0 = t(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.f2894z0
            boolean r0 = s(r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.f.isStateful():boolean");
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            c.b(drawable, c.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.O) {
                if (drawable.isStateful()) {
                    drawable.setState(this.B0);
                }
                r0.b.h(drawable, this.Q);
                return;
            }
            Drawable drawable2 = this.J;
            if (drawable == drawable2 && this.M) {
                r0.b.h(drawable2, this.K);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void o(Rect rect, RectF rectF) {
        float f6;
        rectF.setEmpty();
        if (S() || R()) {
            float f7 = this.Z + this.f2870a0;
            Drawable drawable = this.f2889u0 ? this.V : this.J;
            float f8 = this.L;
            if (f8 <= 0.0f && drawable != null) {
                f8 = (float) drawable.getIntrinsicWidth();
            }
            if (c.a(this) == 0) {
                float f9 = ((float) rect.left) + f7;
                rectF.left = f9;
                rectF.right = f9 + f8;
            } else {
                float f10 = ((float) rect.right) - f7;
                rectF.right = f10;
                rectF.left = f10 - f8;
            }
            Drawable drawable2 = this.f2889u0 ? this.V : this.J;
            float f11 = this.L;
            if (f11 <= 0.0f && drawable2 != null) {
                f11 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f2876h0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f11) {
                    f6 = (float) drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f6;
                }
            }
            f6 = f11;
            float exactCenterY2 = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f6;
        }
    }

    public final boolean onLayoutDirectionChanged(int i3) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i3);
        if (S()) {
            onLayoutDirectionChanged |= c.b(this.J, i3);
        }
        if (R()) {
            onLayoutDirectionChanged |= c.b(this.V, i3);
        }
        if (T()) {
            onLayoutDirectionChanged |= c.b(this.O, i3);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i3) {
        boolean onLevelChange = super.onLevelChange(i3);
        if (S()) {
            onLevelChange |= this.J.setLevel(i3);
        }
        if (R()) {
            onLevelChange |= this.V.setLevel(i3);
        }
        if (T()) {
            onLevelChange |= this.O.setLevel(i3);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.B0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f6 = this.f2870a0;
        Drawable drawable = this.f2889u0 ? this.V : this.J;
        float f7 = this.L;
        if (f7 <= 0.0f && drawable != null) {
            f7 = (float) drawable.getIntrinsicWidth();
        }
        return f7 + f6 + this.f2871b0;
    }

    public final float q() {
        if (T()) {
            return this.f2874e0 + this.R + this.f0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.I0 ? this.f4767d.f4745a.f4805e.a(g()) : this.D;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    public final void setAlpha(int i3) {
        if (this.f2891w0 != i3) {
            this.f2891w0 = i3;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2892x0 != colorFilter) {
            this.f2892x0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2894z0 != colorStateList) {
            this.f2894z0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            ColorStateList colorStateList = this.f2894z0;
            this.f2893y0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        if (S()) {
            visible |= this.J.setVisible(z5, z6);
        }
        if (R()) {
            visible |= this.V.setVisible(z5, z6);
        }
        if (T()) {
            visible |= this.O.setVisible(z5, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.E0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f1903s);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z5;
        boolean z6;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.A;
        int c6 = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f2883o0) : 0);
        boolean z7 = true;
        if (this.f2883o0 != c6) {
            this.f2883o0 = c6;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.B;
        int c7 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f2884p0) : 0);
        if (this.f2884p0 != c7) {
            this.f2884p0 = c7;
            onStateChange = true;
        }
        int b6 = q0.a.b(c7, c6);
        if ((this.f2885q0 != b6) || (this.f4767d.f4747c == null)) {
            this.f2885q0 = b6;
            j(ColorStateList.valueOf(b6));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.E;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f2886r0) : 0;
        if (this.f2886r0 != colorForState) {
            this.f2886r0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !a.b(iArr)) ? 0 : this.D0.getColorForState(iArr, this.f2887s0);
        if (this.f2887s0 != colorForState2) {
            this.f2887s0 = colorForState2;
            if (this.C0) {
                onStateChange = true;
            }
        }
        d dVar = this.f2882n0.f3965f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f4203j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f2888t0);
        if (this.f2888t0 != colorForState3) {
            this.f2888t0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (state[i3] == 16842912) {
                    z5 = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        z5 = false;
        boolean z8 = z5 && this.T;
        if (this.f2889u0 == z8 || this.V == null) {
            z6 = false;
        } else {
            float p2 = p();
            this.f2889u0 = z8;
            if (p2 != p()) {
                onStateChange = true;
                z6 = true;
            } else {
                z6 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f2894z0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f2890v0) : 0;
        if (this.f2890v0 != colorForState4) {
            this.f2890v0 = colorForState4;
            ColorStateList colorStateList6 = this.f2894z0;
            PorterDuff.Mode mode = this.A0;
            this.f2893y0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z7 = onStateChange;
        }
        if (t(this.J)) {
            z7 |= this.J.setState(iArr);
        }
        if (t(this.V)) {
            z7 |= this.V.setState(iArr);
        }
        if (t(this.O)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z7 |= this.O.setState(iArr3);
        }
        int[] iArr4 = a.f4323a;
        if (t(this.P)) {
            z7 |= this.P.setState(iArr2);
        }
        if (z7) {
            invalidateSelf();
        }
        if (z6) {
            u();
        }
        return z7;
    }

    public final void w(boolean z5) {
        if (this.T != z5) {
            this.T = z5;
            float p2 = p();
            if (!z5 && this.f2889u0) {
                this.f2889u0 = false;
            }
            float p5 = p();
            invalidateSelf();
            if (p2 != p5) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.V != drawable) {
            float p2 = p();
            this.V = drawable;
            float p5 = p();
            U(this.V);
            n(this.V);
            invalidateSelf();
            if (p2 != p5) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (this.U && this.V != null && this.T) {
                r0.b.h(this.V, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z5) {
        if (this.U != z5) {
            boolean R2 = R();
            this.U = z5;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.V);
                } else {
                    U(this.V);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
