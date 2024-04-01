package p3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import b1.v;
import e2.f;
import java.util.BitSet;
import o3.a;
import w0.b;

public class g extends Drawable implements v {

    /* renamed from: z  reason: collision with root package name */
    public static final Paint f4766z;

    /* renamed from: d  reason: collision with root package name */
    public f f4767d;

    /* renamed from: e  reason: collision with root package name */
    public final t[] f4768e;

    /* renamed from: f  reason: collision with root package name */
    public final t[] f4769f;

    /* renamed from: g  reason: collision with root package name */
    public final BitSet f4770g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4771h;

    /* renamed from: i  reason: collision with root package name */
    public final Matrix f4772i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f4773j;

    /* renamed from: k  reason: collision with root package name */
    public final Path f4774k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f4775l;

    /* renamed from: m  reason: collision with root package name */
    public final RectF f4776m;

    /* renamed from: n  reason: collision with root package name */
    public final Region f4777n;

    /* renamed from: o  reason: collision with root package name */
    public final Region f4778o;

    /* renamed from: p  reason: collision with root package name */
    public k f4779p;

    /* renamed from: q  reason: collision with root package name */
    public final Paint f4780q;

    /* renamed from: r  reason: collision with root package name */
    public final Paint f4781r;

    /* renamed from: s  reason: collision with root package name */
    public final a f4782s;

    /* renamed from: t  reason: collision with root package name */
    public final f f4783t;

    /* renamed from: u  reason: collision with root package name */
    public final m f4784u;

    /* renamed from: v  reason: collision with root package name */
    public PorterDuffColorFilter f4785v;
    public PorterDuffColorFilter w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f4786x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f4787y;

    static {
        Paint paint = new Paint(1);
        f4766z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        m mVar = this.f4784u;
        f fVar = this.f4767d;
        k kVar = fVar.f4745a;
        float f6 = fVar.f4754j;
        mVar.a(kVar, f6, rectF, this.f4783t, path);
        if (this.f4767d.f4753i != 1.0f) {
            Matrix matrix = this.f4772i;
            matrix.reset();
            float f7 = this.f4767d.f4753i;
            matrix.setScale(f7, f7, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f4786x, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
        r3 = c(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter b(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.c(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.c(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.g.b(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final int c(int i3) {
        int i6;
        f fVar = this.f4767d;
        float f6 = fVar.f4758n + fVar.f4759o + fVar.f4757m;
        j3.a aVar = fVar.f4746b;
        if (aVar == null || !aVar.f3840a) {
            return i3;
        }
        if (!(q0.a.c(i3, 255) == aVar.f3843d)) {
            return i3;
        }
        float f7 = aVar.f3844e;
        float min = (f7 <= 0.0f || f6 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f6 / f7))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i3);
        int C = v.C(q0.a.c(i3, 255), aVar.f3841b, min);
        if (min > 0.0f && (i6 = aVar.f3842c) != 0) {
            C = q0.a.b(q0.a.c(i6, j3.a.f3839f), C);
        }
        return q0.a.c(C, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.f4770g.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i3 = this.f4767d.f4762r;
        Path path = this.f4773j;
        a aVar = this.f4782s;
        if (i3 != 0) {
            canvas.drawPath(path, aVar.f4339a);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            t tVar = this.f4768e[i6];
            int i7 = this.f4767d.f4761q;
            Matrix matrix = t.f4842b;
            tVar.a(matrix, aVar, i7, canvas);
            this.f4769f[i6].a(matrix, aVar, this.f4767d.f4761q, canvas);
        }
        if (this.f4787y) {
            f fVar = this.f4767d;
            int sin = (int) (Math.sin(Math.toRadians((double) fVar.f4763s)) * ((double) fVar.f4762r));
            f fVar2 = this.f4767d;
            int cos = (int) (Math.cos(Math.toRadians((double) fVar2.f4763s)) * ((double) fVar2.f4762r));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, f4766z);
            canvas.translate((float) sin, (float) cos);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0128, code lost:
        if ((!r0.f4745a.d(g()) && !r3.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r22) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            android.graphics.Paint r8 = r6.f4780q
            android.graphics.PorterDuffColorFilter r0 = r6.f4785v
            r8.setColorFilter(r0)
            int r9 = r8.getAlpha()
            p3.f r0 = r6.f4767d
            int r0 = r0.f4756l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r9
            int r0 = r0 >>> 8
            r8.setAlpha(r0)
            android.graphics.Paint r10 = r6.f4781r
            android.graphics.PorterDuffColorFilter r0 = r6.w
            r10.setColorFilter(r0)
            p3.f r0 = r6.f4767d
            float r0 = r0.f4755k
            r10.setStrokeWidth(r0)
            int r11 = r10.getAlpha()
            p3.f r0 = r6.f4767d
            int r0 = r0.f4756l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r11
            int r0 = r0 >>> 8
            r10.setAlpha(r0)
            boolean r0 = r6.f4771h
            android.graphics.Path r3 = r6.f4773j
            r12 = 0
            r14 = 0
            if (r0 == 0) goto L_0x00ff
            p3.f r0 = r6.f4767d
            android.graphics.Paint$Style r0 = r0.f4765u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x004f
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x0059
        L_0x004f:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = r14
        L_0x005a:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0064
            float r0 = r10.getStrokeWidth()
            float r0 = r0 / r1
            goto L_0x0065
        L_0x0064:
            r0 = r12
        L_0x0065:
            float r0 = -r0
            p3.f r2 = r6.f4767d
            p3.k r2 = r2.f4745a
            r2.getClass()
            p3.j r4 = new p3.j
            r4.<init>(r2)
            p3.c r5 = r2.f4805e
            boolean r15 = r5 instanceof p3.h
            if (r15 == 0) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            p3.b r15 = new p3.b
            r15.<init>(r0, r5)
            r5 = r15
        L_0x007f:
            r4.f4793e = r5
            p3.c r5 = r2.f4806f
            boolean r15 = r5 instanceof p3.h
            if (r15 == 0) goto L_0x0088
            goto L_0x008e
        L_0x0088:
            p3.b r15 = new p3.b
            r15.<init>(r0, r5)
            r5 = r15
        L_0x008e:
            r4.f4794f = r5
            p3.c r5 = r2.f4808h
            boolean r15 = r5 instanceof p3.h
            if (r15 == 0) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            p3.b r15 = new p3.b
            r15.<init>(r0, r5)
            r5 = r15
        L_0x009d:
            r4.f4796h = r5
            p3.c r2 = r2.f4807g
            boolean r5 = r2 instanceof p3.h
            if (r5 == 0) goto L_0x00a6
            goto L_0x00ac
        L_0x00a6:
            p3.b r5 = new p3.b
            r5.<init>(r0, r2)
            r2 = r5
        L_0x00ac:
            r4.f4795g = r2
            p3.k r0 = new p3.k
            r0.<init>(r4)
            r6.f4779p = r0
            p3.m r15 = r6.f4784u
            p3.f r2 = r6.f4767d
            float r2 = r2.f4754j
            android.graphics.RectF r4 = r6.f4776m
            android.graphics.RectF r5 = r21.g()
            r4.set(r5)
            p3.f r5 = r6.f4767d
            android.graphics.Paint$Style r5 = r5.f4765u
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r5 == r13) goto L_0x00d0
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.STROKE
            if (r5 != r13) goto L_0x00da
        L_0x00d0:
            float r5 = r10.getStrokeWidth()
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x00da
            r5 = 1
            goto L_0x00db
        L_0x00da:
            r5 = r14
        L_0x00db:
            if (r5 == 0) goto L_0x00e3
            float r5 = r10.getStrokeWidth()
            float r5 = r5 / r1
            goto L_0x00e4
        L_0x00e3:
            r5 = r12
        L_0x00e4:
            r4.inset(r5, r5)
            android.graphics.Path r1 = r6.f4774k
            r19 = 0
            r16 = r0
            r17 = r2
            r18 = r4
            r20 = r1
            r15.a(r16, r17, r18, r19, r20)
            android.graphics.RectF r0 = r21.g()
            r6.a(r0, r3)
            r6.f4771h = r14
        L_0x00ff:
            p3.f r0 = r6.f4767d
            int r1 = r0.f4760p
            r2 = 2
            r13 = 1
            if (r1 == r13) goto L_0x012c
            int r4 = r0.f4761q
            if (r4 <= 0) goto L_0x012c
            if (r1 == r2) goto L_0x012a
            int r1 = android.os.Build.VERSION.SDK_INT
            p3.k r0 = r0.f4745a
            android.graphics.RectF r4 = r21.g()
            boolean r0 = r0.d(r4)
            if (r0 != 0) goto L_0x0127
            boolean r0 = r3.isConvex()
            if (r0 != 0) goto L_0x0127
            r0 = 29
            if (r1 >= r0) goto L_0x0127
            r0 = r13
            goto L_0x0128
        L_0x0127:
            r0 = r14
        L_0x0128:
            if (r0 == 0) goto L_0x012c
        L_0x012a:
            r0 = r13
            goto L_0x012d
        L_0x012c:
            r0 = r14
        L_0x012d:
            if (r0 != 0) goto L_0x0131
            goto L_0x01d8
        L_0x0131:
            r22.save()
            p3.f r0 = r6.f4767d
            int r1 = r0.f4762r
            double r4 = (double) r1
            int r0 = r0.f4763s
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r4
            int r0 = (int) r0
            p3.f r1 = r6.f4767d
            int r4 = r1.f4762r
            double r4 = (double) r4
            int r1 = r1.f4763s
            double r13 = (double) r1
            double r13 = java.lang.Math.toRadians(r13)
            double r13 = java.lang.Math.cos(r13)
            double r13 = r13 * r4
            int r1 = (int) r13
            float r0 = (float) r0
            float r1 = (float) r1
            r7.translate(r0, r1)
            boolean r0 = r6.f4787y
            if (r0 != 0) goto L_0x0165
            r21.d(r22)
            goto L_0x01d5
        L_0x0165:
            android.graphics.RectF r0 = r6.f4786x
            float r1 = r0.width()
            android.graphics.Rect r4 = r21.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r1 = r1 - r4
            int r1 = (int) r1
            float r4 = r0.height()
            android.graphics.Rect r5 = r21.getBounds()
            int r5 = r5.height()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r4 = (int) r4
            if (r1 < 0) goto L_0x021b
            if (r4 < 0) goto L_0x021b
            float r5 = r0.width()
            int r5 = (int) r5
            p3.f r13 = r6.f4767d
            int r13 = r13.f4761q
            int r13 = r13 * r2
            int r13 = r13 + r5
            int r13 = r13 + r1
            float r0 = r0.height()
            int r0 = (int) r0
            p3.f r5 = r6.f4767d
            int r5 = r5.f4761q
            int r5 = r5 * r2
            int r5 = r5 + r0
            int r5 = r5 + r4
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r5, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            android.graphics.Rect r5 = r21.getBounds()
            int r5 = r5.left
            p3.f r13 = r6.f4767d
            int r13 = r13.f4761q
            int r5 = r5 - r13
            int r5 = r5 - r1
            float r1 = (float) r5
            android.graphics.Rect r5 = r21.getBounds()
            int r5 = r5.top
            p3.f r13 = r6.f4767d
            int r13 = r13.f4761q
            int r5 = r5 - r13
            int r5 = r5 - r4
            float r4 = (float) r5
            float r5 = -r1
            float r13 = -r4
            r2.translate(r5, r13)
            r6.d(r2)
            r2 = 0
            r7.drawBitmap(r0, r1, r4, r2)
            r0.recycle()
        L_0x01d5:
            r22.restore()
        L_0x01d8:
            p3.f r0 = r6.f4767d
            android.graphics.Paint$Style r1 = r0.f4765u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r2) goto L_0x01e7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            if (r1 != r2) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r1 = 0
            goto L_0x01e8
        L_0x01e7:
            r1 = 1
        L_0x01e8:
            if (r1 == 0) goto L_0x01f8
            p3.k r4 = r0.f4745a
            android.graphics.RectF r5 = r21.g()
            r0 = r21
            r1 = r22
            r2 = r8
            r0.e(r1, r2, r3, r4, r5)
        L_0x01f8:
            p3.f r0 = r6.f4767d
            android.graphics.Paint$Style r0 = r0.f4765u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0204
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x020e
        L_0x0204:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x020e
            r13 = 1
            goto L_0x020f
        L_0x020e:
            r13 = 0
        L_0x020f:
            if (r13 == 0) goto L_0x0214
            r21.f(r22)
        L_0x0214:
            r8.setAlpha(r9)
            r10.setAlpha(r11)
            return
        L_0x021b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a6 = kVar.f4806f.a(rectF) * this.f4767d.f4754j;
            canvas.drawRoundRect(rectF, a6, a6, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void f(Canvas canvas) {
        Paint paint = this.f4781r;
        Path path = this.f4774k;
        k kVar = this.f4779p;
        RectF rectF = this.f4776m;
        rectF.set(g());
        Paint.Style style = this.f4767d.f4765u;
        float f6 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            f6 = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f6, f6);
        e(canvas, paint, path, kVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f4775l;
        rectF.set(getBounds());
        return rectF;
    }

    public int getAlpha() {
        return this.f4767d.f4756l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f4767d;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        f fVar = this.f4767d;
        if (fVar.f4760p != 2) {
            if (fVar.f4745a.d(g())) {
                outline.setRoundRect(getBounds(), this.f4767d.f4745a.f4805e.a(g()) * this.f4767d.f4754j);
                return;
            }
            RectF g6 = g();
            Path path = this.f4773j;
            a(g6, path);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                outline.setPath(path);
            } else if (i3 >= 29) {
                try {
                    outline.setConvexPath(path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                outline.setConvexPath(path);
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f4767d.f4752h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f4777n;
        region.set(bounds);
        RectF g6 = g();
        Path path = this.f4773j;
        a(g6, path);
        Region region2 = this.f4778o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f4767d.f4746b = new j3.a(context);
        m();
    }

    public final void i(float f6) {
        f fVar = this.f4767d;
        if (fVar.f4758n != f6) {
            fVar.f4758n = f6;
            m();
        }
    }

    public final void invalidateSelf() {
        this.f4771h = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f4767d.f4748d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f4767d.f4747c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f4767d.f4750f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f4767d.f4749e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            p3.f r0 = r1.f4767d
            android.content.res.ColorStateList r0 = r0.f4750f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            p3.f r0 = r1.f4767d
            android.content.res.ColorStateList r0 = r0.f4749e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            p3.f r0 = r1.f4767d
            android.content.res.ColorStateList r0 = r0.f4748d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            p3.f r0 = r1.f4767d
            android.content.res.ColorStateList r0 = r0.f4747c
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.g.isStateful():boolean");
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f4767d;
        if (fVar.f4747c != colorStateList) {
            fVar.f4747c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z5;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f4767d.f4747c == null || (color2 = paint2.getColor()) == (colorForState2 = this.f4767d.f4747c.getColorForState(iArr, color2))) {
            z5 = false;
        } else {
            (paint2 = this.f4780q).setColor(colorForState2);
            z5 = true;
        }
        if (this.f4767d.f4748d == null || (color = paint.getColor()) == (colorForState = this.f4767d.f4748d.getColorForState(iArr, color))) {
            return z5;
        }
        (paint = this.f4781r).setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4785v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w;
        f fVar = this.f4767d;
        this.f4785v = b(fVar.f4750f, fVar.f4751g, this.f4780q, true);
        f fVar2 = this.f4767d;
        this.w = b(fVar2.f4749e, fVar2.f4751g, this.f4781r, false);
        f fVar3 = this.f4767d;
        if (fVar3.f4764t) {
            this.f4782s.a(fVar3.f4750f.getColorForState(getState(), 0));
        }
        return !b.a(porterDuffColorFilter, this.f4785v) || !b.a(porterDuffColorFilter2, this.w);
    }

    public final void m() {
        f fVar = this.f4767d;
        float f6 = fVar.f4758n + fVar.f4759o;
        fVar.f4761q = (int) Math.ceil((double) (0.75f * f6));
        this.f4767d.f4762r = (int) Math.ceil((double) (f6 * 0.25f));
        l();
        super.invalidateSelf();
    }

    public Drawable mutate() {
        this.f4767d = new f(this.f4767d);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.f4771h = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z5 = k(iArr) || l();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    public void setAlpha(int i3) {
        f fVar = this.f4767d;
        if (fVar.f4756l != i3) {
            fVar.f4756l = i3;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4767d.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f4767d.f4745a = kVar;
        invalidateSelf();
    }

    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4767d.f4750f = colorStateList;
        l();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f4767d;
        if (fVar.f4751g != mode) {
            fVar.f4751g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i3, int i6) {
        this(k.b(context, attributeSet, i3, i6).a());
    }

    public g(f fVar) {
        m mVar;
        this.f4768e = new t[4];
        this.f4769f = new t[4];
        this.f4770g = new BitSet(8);
        this.f4772i = new Matrix();
        this.f4773j = new Path();
        this.f4774k = new Path();
        this.f4775l = new RectF();
        this.f4776m = new RectF();
        this.f4777n = new Region();
        this.f4778o = new Region();
        Paint paint = new Paint(1);
        this.f4780q = paint;
        Paint paint2 = new Paint(1);
        this.f4781r = paint2;
        this.f4782s = new a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f4813a;
        } else {
            mVar = new m();
        }
        this.f4784u = mVar;
        this.f4786x = new RectF();
        this.f4787y = true;
        this.f4767d = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f4783t = new f(13, this);
    }

    public g(k kVar) {
        this(new f(kVar));
    }
}
