package u1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bumptech.glide.c;
import org.xmlpull.v1.XmlPullParser;
import r0.a;
import r0.b;

public final class n extends e {

    /* renamed from: m  reason: collision with root package name */
    public static final PorterDuff.Mode f5330m = PorterDuff.Mode.SRC_IN;

    /* renamed from: e  reason: collision with root package name */
    public l f5331e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuffColorFilter f5332f;

    /* renamed from: g  reason: collision with root package name */
    public ColorFilter f5333g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5334h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5335i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f5336j;

    /* renamed from: k  reason: collision with root package name */
    public final Matrix f5337k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f5338l;

    public n() {
        this.f5335i = true;
        this.f5336j = new float[9];
        this.f5337k = new Matrix();
        this.f5338l = new Rect();
        this.f5331e = new l();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f5273d;
        if (drawable == null) {
            return false;
        }
        b.b(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if ((r5 == r10.getWidth() && r6 == r9.f5322f.getHeight()) == false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.drawable.Drawable r2 = r0.f5273d
            if (r2 == 0) goto L_0x000c
            r2.draw(r1)
            return
        L_0x000c:
            android.graphics.Rect r2 = r0.f5338l
            r0.copyBounds(r2)
            int r3 = r2.width()
            if (r3 <= 0) goto L_0x017d
            int r3 = r2.height()
            if (r3 > 0) goto L_0x001f
            goto L_0x017d
        L_0x001f:
            android.graphics.ColorFilter r3 = r0.f5333g
            if (r3 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r3 = r0.f5332f
        L_0x0025:
            android.graphics.Matrix r4 = r0.f5337k
            r1.getMatrix(r4)
            float[] r5 = r0.f5336j
            r4.getValues(r5)
            r4 = 0
            r6 = r5[r4]
            float r6 = java.lang.Math.abs(r6)
            r7 = 4
            r7 = r5[r7]
            float r7 = java.lang.Math.abs(r7)
            r8 = 1
            r9 = r5[r8]
            float r9 = java.lang.Math.abs(r9)
            r10 = 3
            r5 = r5[r10]
            float r5 = java.lang.Math.abs(r5)
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r9 != 0) goto L_0x0056
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0058
        L_0x0056:
            r6 = r11
            r7 = r6
        L_0x0058:
            int r5 = r2.width()
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r2.height()
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
            r7 = 2048(0x800, float:2.87E-42)
            int r5 = java.lang.Math.min(r7, r5)
            int r6 = java.lang.Math.min(r7, r6)
            if (r5 <= 0) goto L_0x017d
            if (r6 > 0) goto L_0x0076
            goto L_0x017d
        L_0x0076:
            int r7 = r19.save()
            int r9 = r2.left
            float r9 = (float) r9
            int r12 = r2.top
            float r12 = (float) r12
            r1.translate(r9, r12)
            boolean r9 = r18.isAutoMirrored()
            if (r9 == 0) goto L_0x0091
            int r9 = r0.c.a(r18)
            if (r9 != r8) goto L_0x0091
            r9 = r8
            goto L_0x0092
        L_0x0091:
            r9 = r4
        L_0x0092:
            if (r9 == 0) goto L_0x00a1
            int r9 = r2.width()
            float r9 = (float) r9
            r1.translate(r9, r10)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r9, r11)
        L_0x00a1:
            r2.offsetTo(r4, r4)
            u1.l r9 = r0.f5331e
            android.graphics.Bitmap r10 = r9.f5322f
            if (r10 == 0) goto L_0x00bd
            int r10 = r10.getWidth()
            if (r5 != r10) goto L_0x00ba
            android.graphics.Bitmap r10 = r9.f5322f
            int r10 = r10.getHeight()
            if (r6 != r10) goto L_0x00ba
            r10 = r8
            goto L_0x00bb
        L_0x00ba:
            r10 = r4
        L_0x00bb:
            if (r10 != 0) goto L_0x00c7
        L_0x00bd:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            r9.f5322f = r10
            r9.f5327k = r8
        L_0x00c7:
            boolean r9 = r0.f5335i
            if (r9 != 0) goto L_0x00e7
            u1.l r9 = r0.f5331e
            android.graphics.Bitmap r10 = r9.f5322f
            r10.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r10 = r9.f5322f
            r15.<init>(r10)
            u1.k r12 = r9.f5318b
            u1.h r13 = r12.f5308g
            android.graphics.Matrix r14 = u1.k.f5301p
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            goto L_0x0141
        L_0x00e7:
            u1.l r9 = r0.f5331e
            boolean r10 = r9.f5327k
            if (r10 != 0) goto L_0x010b
            android.content.res.ColorStateList r10 = r9.f5323g
            android.content.res.ColorStateList r11 = r9.f5319c
            if (r10 != r11) goto L_0x010b
            android.graphics.PorterDuff$Mode r10 = r9.f5324h
            android.graphics.PorterDuff$Mode r11 = r9.f5320d
            if (r10 != r11) goto L_0x010b
            boolean r10 = r9.f5326j
            boolean r11 = r9.f5321e
            if (r10 != r11) goto L_0x010b
            int r10 = r9.f5325i
            u1.k r9 = r9.f5318b
            int r9 = r9.getRootAlpha()
            if (r10 != r9) goto L_0x010b
            r9 = r8
            goto L_0x010c
        L_0x010b:
            r9 = r4
        L_0x010c:
            if (r9 != 0) goto L_0x0141
            u1.l r9 = r0.f5331e
            android.graphics.Bitmap r10 = r9.f5322f
            r10.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r10 = r9.f5322f
            r15.<init>(r10)
            u1.k r12 = r9.f5318b
            u1.h r13 = r12.f5308g
            android.graphics.Matrix r14 = u1.k.f5301p
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            u1.l r5 = r0.f5331e
            android.content.res.ColorStateList r6 = r5.f5319c
            r5.f5323g = r6
            android.graphics.PorterDuff$Mode r6 = r5.f5320d
            r5.f5324h = r6
            u1.k r6 = r5.f5318b
            int r6 = r6.getRootAlpha()
            r5.f5325i = r6
            boolean r6 = r5.f5321e
            r5.f5326j = r6
            r5.f5327k = r4
        L_0x0141:
            u1.l r5 = r0.f5331e
            u1.k r6 = r5.f5318b
            int r6 = r6.getRootAlpha()
            r9 = 255(0xff, float:3.57E-43)
            if (r6 >= r9) goto L_0x014e
            r4 = r8
        L_0x014e:
            r6 = 0
            if (r4 != 0) goto L_0x0155
            if (r3 != 0) goto L_0x0155
            r3 = r6
            goto L_0x0175
        L_0x0155:
            android.graphics.Paint r4 = r5.f5328l
            if (r4 != 0) goto L_0x0163
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r5.f5328l = r4
            r4.setFilterBitmap(r8)
        L_0x0163:
            android.graphics.Paint r4 = r5.f5328l
            u1.k r8 = r5.f5318b
            int r8 = r8.getRootAlpha()
            r4.setAlpha(r8)
            android.graphics.Paint r4 = r5.f5328l
            r4.setColorFilter(r3)
            android.graphics.Paint r3 = r5.f5328l
        L_0x0175:
            android.graphics.Bitmap r4 = r5.f5322f
            r1.drawBitmap(r4, r6, r2, r3)
            r1.restoreToCount(r7)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.n.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        Drawable drawable = this.f5273d;
        return drawable != null ? a.a(drawable) : this.f5331e.f5318b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5331e.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5273d;
        return drawable != null ? b.c(drawable) : this.f5333g;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f5273d != null) {
            return new m(this.f5273d.getConstantState());
        }
        this.f5331e.f5317a = getChangingConfigurations();
        return this.f5331e;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5331e.f5318b.f5310i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5331e.f5318b.f5309h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5273d;
        return drawable != null ? a.d(drawable) : this.f5331e.f5321e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            l lVar = this.f5331e;
            if (lVar != null) {
                k kVar = lVar.f5318b;
                if (kVar.f5315n == null) {
                    kVar.f5315n = Boolean.valueOf(kVar.f5308g.a());
                }
                if (kVar.f5315n.booleanValue() || ((colorStateList = this.f5331e.f5319c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5334h && super.mutate() == this) {
            this.f5331e = new l(this.f5331e);
            this.f5334h = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        l lVar = this.f5331e;
        ColorStateList colorStateList = lVar.f5319c;
        if (colorStateList == null || (mode = lVar.f5320d) == null) {
            z5 = false;
        } else {
            this.f5332f = a(colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        k kVar = lVar.f5318b;
        if (kVar.f5315n == null) {
            kVar.f5315n = Boolean.valueOf(kVar.f5308g.a());
        }
        if (kVar.f5315n.booleanValue()) {
            boolean b6 = lVar.f5318b.f5308g.b(iArr);
            lVar.f5327k |= b6;
            if (b6) {
                invalidateSelf();
                return true;
            }
        }
        return z5;
    }

    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    public final void setAlpha(int i3) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.f5331e.f5318b.getRootAlpha() != i3) {
            this.f5331e.f5318b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            a.e(drawable, z5);
        } else {
            this.f5331e.f5321e = z5;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5333g = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i3) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            c.G(drawable, i3);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            b.h(drawable, colorStateList);
            return;
        }
        l lVar = this.f5331e;
        if (lVar.f5319c != colorStateList) {
            lVar.f5319c = colorStateList;
            this.f5332f = a(colorStateList, lVar.f5320d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            b.i(drawable, mode);
            return;
        }
        l lVar = this.f5331e;
        if (lVar.f5320d != mode) {
            lVar.f5320d = mode;
            this.f5332f = a(lVar.f5319c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public n(l lVar) {
        this.f5335i = true;
        this.f5336j = new float[9];
        this.f5337k = new Matrix();
        this.f5338l = new Rect();
        this.f5331e = lVar;
        this.f5332f = a(lVar.f5319c, lVar.f5320d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            android.graphics.drawable.Drawable r0 = r1.f5273d
            if (r0 == 0) goto L_0x0012
            r0.b.d(r0, r2, r3, r4, r5)
            return
        L_0x0012:
            u1.l r6 = r1.f5331e
            u1.k r0 = new u1.k
            r0.<init>()
            r6.f5318b = r0
            int[] r0 = w4.p.f5509j
            android.content.res.TypedArray r7 = com.bumptech.glide.d.q(r2, r5, r4, r0)
            u1.l r8 = r1.f5331e
            u1.k r9 = r8.f5318b
            java.lang.String r0 = "tintMode"
            r10 = 6
            r11 = -1
            int r0 = com.bumptech.glide.d.k(r7, r3, r0, r10, r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 5
            r15 = 3
            if (r0 == r15) goto L_0x0049
            if (r0 == r14) goto L_0x004b
            if (r0 == r13) goto L_0x0046
            switch(r0) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r8.f5320d = r12
            java.lang.String r0 = "tint"
            boolean r0 = com.bumptech.glide.d.p(r3, r0)
            r12 = 0
            r10 = 1
            r13 = 2
            if (r0 == 0) goto L_0x00a3
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.getValue(r10, r0)
            int r11 = r0.type
            if (r11 == r13) goto L_0x008f
            r13 = 28
            if (r11 < r13) goto L_0x0073
            r13 = 31
            if (r11 > r13) goto L_0x0073
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00a4
        L_0x0073:
            android.content.res.Resources r0 = r7.getResources()
            int r11 = r7.getResourceId(r10, r12)
            java.lang.ThreadLocal r13 = p0.b.f4385a
            android.content.res.XmlResourceParser r11 = r0.getXml(r11)     // Catch:{ Exception -> 0x0086 }
            android.content.res.ColorStateList r0 = p0.b.a(r0, r11, r5)     // Catch:{ Exception -> 0x0086 }
            goto L_0x00a4
        L_0x0086:
            r0 = move-exception
            java.lang.String r11 = "CSLCompat"
            java.lang.String r13 = "Failed to inflate ColorStateList."
            android.util.Log.e(r11, r13, r0)
            goto L_0x00a3
        L_0x008f:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to resolve attribute at index 1: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            if (r0 == 0) goto L_0x00a8
            r8.f5319c = r0
        L_0x00a8:
            boolean r0 = r8.f5321e
            java.lang.String r11 = "autoMirrored"
            boolean r11 = com.bumptech.glide.d.p(r3, r11)
            if (r11 != 0) goto L_0x00b3
            goto L_0x00b7
        L_0x00b3:
            boolean r0 = r7.getBoolean(r14, r0)
        L_0x00b7:
            r8.f5321e = r0
            float r0 = r9.f5311j
            java.lang.String r8 = "viewportWidth"
            r11 = 7
            float r0 = com.bumptech.glide.d.j(r7, r3, r8, r11, r0)
            r9.f5311j = r0
            float r0 = r9.f5312k
            java.lang.String r8 = "viewportHeight"
            r13 = 8
            float r0 = com.bumptech.glide.d.j(r7, r3, r8, r13, r0)
            r9.f5312k = r0
            float r8 = r9.f5311j
            r17 = 0
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x03c9
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ae
            float r0 = r9.f5309h
            float r0 = r7.getDimension(r15, r0)
            r9.f5309h = r0
            float r0 = r9.f5310i
            r8 = 2
            float r0 = r7.getDimension(r8, r0)
            r9.f5310i = r0
            float r8 = r9.f5309h
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x0393
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0378
            float r0 = r9.getAlpha()
            java.lang.String r8 = "alpha"
            r14 = 4
            float r0 = com.bumptech.glide.d.j(r7, r3, r8, r14, r0)
            r9.setAlpha(r0)
            java.lang.String r0 = r7.getString(r12)
            if (r0 == 0) goto L_0x0112
            r9.f5314m = r0
            k.b r8 = r9.f5316o
            r8.put(r0, r9)
        L_0x0112:
            r7.recycle()
            int r0 = r21.getChangingConfigurations()
            r6.f5317a = r0
            r6.f5327k = r10
            u1.l r0 = r1.f5331e
            u1.k r7 = r0.f5318b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            u1.h r9 = r7.f5308g
            r8.push(r9)
            int r9 = r23.getEventType()
            int r18 = r23.getDepth()
            int r11 = r18 + 1
            r18 = r10
        L_0x0137:
            if (r9 == r10) goto L_0x0363
            int r14 = r23.getDepth()
            if (r14 >= r11) goto L_0x0141
            if (r9 == r15) goto L_0x0363
        L_0x0141:
            java.lang.String r14 = "group"
            r15 = 2
            if (r9 != r15) goto L_0x033c
            java.lang.String r9 = r23.getName()
            java.lang.Object r15 = r8.peek()
            u1.h r15 = (u1.h) r15
            java.lang.String r13 = "path"
            boolean r13 = r13.equals(r9)
            k.b r10 = r7.f5316o
            java.lang.String r12 = "fillType"
            r19 = r7
            java.lang.String r7 = "pathData"
            if (r13 == 0) goto L_0x0258
            u1.g r9 = new u1.g
            r9.<init>()
            int[] r13 = w4.p.f5511l
            android.content.res.TypedArray r13 = com.bumptech.glide.d.q(r2, r5, r4, r13)
            boolean r7 = com.bumptech.glide.d.p(r3, r7)
            if (r7 != 0) goto L_0x0175
            r20 = r11
            goto L_0x0235
        L_0x0175:
            r7 = 0
            java.lang.String r14 = r13.getString(r7)
            if (r14 == 0) goto L_0x017e
            r9.f5298b = r14
        L_0x017e:
            r7 = 2
            java.lang.String r14 = r13.getString(r7)
            if (r14 == 0) goto L_0x018b
            q0.f[] r7 = com.bumptech.glide.e.k(r14)
            r9.f5297a = r7
        L_0x018b:
            java.lang.String r7 = "fillColor"
            r14 = 1
            p0.c r7 = com.bumptech.glide.d.i(r13, r3, r5, r7, r14)
            r9.f5276g = r7
            float r7 = r9.f5278i
            java.lang.String r14 = "fillAlpha"
            r20 = r11
            r11 = 12
            float r7 = com.bumptech.glide.d.j(r13, r3, r14, r11, r7)
            r9.f5278i = r7
            java.lang.String r7 = "strokeLineCap"
            r11 = 8
            r14 = -1
            int r7 = com.bumptech.glide.d.k(r13, r3, r7, r11, r14)
            android.graphics.Paint$Cap r14 = r9.f5282m
            if (r7 == 0) goto L_0x01bc
            r11 = 1
            if (r7 == r11) goto L_0x01b9
            r11 = 2
            if (r7 == r11) goto L_0x01b6
            goto L_0x01be
        L_0x01b6:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01be
        L_0x01b9:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.ROUND
            goto L_0x01be
        L_0x01bc:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.BUTT
        L_0x01be:
            r9.f5282m = r14
            java.lang.String r7 = "strokeLineJoin"
            r11 = 9
            r14 = -1
            int r7 = com.bumptech.glide.d.k(r13, r3, r7, r11, r14)
            android.graphics.Paint$Join r11 = r9.f5283n
            if (r7 == 0) goto L_0x01da
            r14 = 1
            if (r7 == r14) goto L_0x01d7
            r14 = 2
            if (r7 == r14) goto L_0x01d4
            goto L_0x01dc
        L_0x01d4:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.BEVEL
            goto L_0x01dc
        L_0x01d7:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.ROUND
            goto L_0x01dc
        L_0x01da:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.MITER
        L_0x01dc:
            r9.f5283n = r11
            float r7 = r9.f5284o
            java.lang.String r11 = "strokeMiterLimit"
            r14 = 10
            float r7 = com.bumptech.glide.d.j(r13, r3, r11, r14, r7)
            r9.f5284o = r7
            java.lang.String r7 = "strokeColor"
            r11 = 3
            p0.c r7 = com.bumptech.glide.d.i(r13, r3, r5, r7, r11)
            r9.f5274e = r7
            float r7 = r9.f5277h
            java.lang.String r11 = "strokeAlpha"
            r14 = 11
            float r7 = com.bumptech.glide.d.j(r13, r3, r11, r14, r7)
            r9.f5277h = r7
            float r7 = r9.f5275f
            java.lang.String r11 = "strokeWidth"
            r14 = 4
            float r7 = com.bumptech.glide.d.j(r13, r3, r11, r14, r7)
            r9.f5275f = r7
            float r7 = r9.f5280k
            java.lang.String r11 = "trimPathEnd"
            r14 = 6
            float r7 = com.bumptech.glide.d.j(r13, r3, r11, r14, r7)
            r9.f5280k = r7
            float r7 = r9.f5281l
            java.lang.String r11 = "trimPathOffset"
            r14 = 7
            float r7 = com.bumptech.glide.d.j(r13, r3, r11, r14, r7)
            r9.f5281l = r7
            float r7 = r9.f5279j
            java.lang.String r11 = "trimPathStart"
            r14 = 5
            float r7 = com.bumptech.glide.d.j(r13, r3, r11, r14, r7)
            r9.f5279j = r7
            int r7 = r9.f5299c
            r11 = 13
            int r7 = com.bumptech.glide.d.k(r13, r3, r12, r11, r7)
            r9.f5299c = r7
        L_0x0235:
            r13.recycle()
            java.util.ArrayList r7 = r15.f5286b
            r7.add(r9)
            java.lang.String r7 = r9.getPathName()
            if (r7 == 0) goto L_0x024a
            java.lang.String r7 = r9.getPathName()
            r10.put(r7, r9)
        L_0x024a:
            int r7 = r0.f5317a
            int r9 = r9.f5300d
            r7 = r7 | r9
            r0.f5317a = r7
            r11 = 0
            r13 = 7
            r14 = 5
            r18 = 0
            goto L_0x0339
        L_0x0258:
            r20 = r11
            r11 = -1
            java.lang.String r13 = "clip-path"
            boolean r13 = r13.equals(r9)
            if (r13 == 0) goto L_0x02b0
            u1.f r9 = new u1.f
            r9.<init>()
            boolean r7 = com.bumptech.glide.d.p(r3, r7)
            if (r7 != 0) goto L_0x026f
            goto L_0x0295
        L_0x026f:
            int[] r7 = w4.p.f5512m
            android.content.res.TypedArray r7 = com.bumptech.glide.d.q(r2, r5, r4, r7)
            r13 = 0
            java.lang.String r14 = r7.getString(r13)
            if (r14 == 0) goto L_0x027e
            r9.f5298b = r14
        L_0x027e:
            r14 = 1
            java.lang.String r16 = r7.getString(r14)
            if (r16 == 0) goto L_0x028b
            q0.f[] r14 = com.bumptech.glide.e.k(r16)
            r9.f5297a = r14
        L_0x028b:
            r14 = 2
            int r12 = com.bumptech.glide.d.k(r7, r3, r12, r14, r13)
            r9.f5299c = r12
            r7.recycle()
        L_0x0295:
            java.util.ArrayList r7 = r15.f5286b
            r7.add(r9)
            java.lang.String r7 = r9.getPathName()
            if (r7 == 0) goto L_0x02a7
            java.lang.String r7 = r9.getPathName()
            r10.put(r7, r9)
        L_0x02a7:
            int r7 = r0.f5317a
            int r9 = r9.f5300d
            r7 = r7 | r9
            r0.f5317a = r7
            goto L_0x0336
        L_0x02b0:
            boolean r7 = r14.equals(r9)
            if (r7 == 0) goto L_0x0336
            u1.h r7 = new u1.h
            r7.<init>()
            int[] r9 = w4.p.f5510k
            android.content.res.TypedArray r9 = com.bumptech.glide.d.q(r2, r5, r4, r9)
            float r12 = r7.f5287c
            java.lang.String r13 = "rotation"
            r14 = 5
            float r12 = com.bumptech.glide.d.j(r9, r3, r13, r14, r12)
            r7.f5287c = r12
            float r12 = r7.f5288d
            r13 = 1
            float r12 = r9.getFloat(r13, r12)
            r7.f5288d = r12
            float r12 = r7.f5289e
            r11 = 2
            float r12 = r9.getFloat(r11, r12)
            r7.f5289e = r12
            float r12 = r7.f5290f
            java.lang.String r11 = "scaleX"
            r13 = 3
            float r11 = com.bumptech.glide.d.j(r9, r3, r11, r13, r12)
            r7.f5290f = r11
            float r11 = r7.f5291g
            java.lang.String r12 = "scaleY"
            r13 = 4
            float r11 = com.bumptech.glide.d.j(r9, r3, r12, r13, r11)
            r7.f5291g = r11
            float r11 = r7.f5292h
            java.lang.String r12 = "translateX"
            r13 = 6
            float r11 = com.bumptech.glide.d.j(r9, r3, r12, r13, r11)
            r7.f5292h = r11
            float r11 = r7.f5293i
            java.lang.String r12 = "translateY"
            r13 = 7
            float r11 = com.bumptech.glide.d.j(r9, r3, r12, r13, r11)
            r7.f5293i = r11
            r11 = 0
            java.lang.String r12 = r9.getString(r11)
            if (r12 == 0) goto L_0x0313
            r7.f5296l = r12
        L_0x0313:
            r7.c()
            r9.recycle()
            java.util.ArrayList r9 = r15.f5286b
            r9.add(r7)
            r8.push(r7)
            java.lang.String r9 = r7.getGroupName()
            if (r9 == 0) goto L_0x032e
            java.lang.String r9 = r7.getGroupName()
            r10.put(r9, r7)
        L_0x032e:
            int r9 = r0.f5317a
            int r7 = r7.f5295k
            r7 = r7 | r9
            r0.f5317a = r7
            goto L_0x0339
        L_0x0336:
            r11 = 0
            r13 = 7
            r14 = 5
        L_0x0339:
            r7 = r14
            r10 = 3
            goto L_0x0353
        L_0x033c:
            r19 = r7
            r20 = r11
            r11 = r12
            r7 = 5
            r10 = 3
            r13 = 7
            if (r9 != r10) goto L_0x0353
            java.lang.String r9 = r23.getName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0353
            r8.pop()
        L_0x0353:
            int r9 = r23.next()
            r15 = r10
            r12 = r11
            r7 = r19
            r11 = r20
            r10 = 1
            r13 = 8
            r14 = 4
            goto L_0x0137
        L_0x0363:
            if (r18 != 0) goto L_0x0370
            android.content.res.ColorStateList r0 = r6.f5319c
            android.graphics.PorterDuff$Mode r2 = r6.f5320d
            android.graphics.PorterDuffColorFilter r0 = r1.a(r0, r2)
            r1.f5332f = r0
            return
        L_0x0370:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r0.<init>(r2)
            throw r0
        L_0x0378:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0393:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03ae:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03c9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.n.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
