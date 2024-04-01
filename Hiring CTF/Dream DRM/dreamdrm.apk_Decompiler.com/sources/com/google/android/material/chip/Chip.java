package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.t;
import g3.b;
import g3.d;
import g3.e;
import g3.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k3.i;
import n3.a;
import p3.k;
import p3.v;
import r0.c;
import v0.l;
import w4.p;
import x0.d0;
import x0.e0;
import x0.u0;

public class Chip extends t implements e, v, Checkable {
    public static final int[] A = {16842913};
    public static final int[] B = {16842911};

    /* renamed from: z  reason: collision with root package name */
    public static final Rect f1891z = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public f f1892h;

    /* renamed from: i  reason: collision with root package name */
    public InsetDrawable f1893i;

    /* renamed from: j  reason: collision with root package name */
    public RippleDrawable f1894j;

    /* renamed from: k  reason: collision with root package name */
    public View.OnClickListener f1895k;

    /* renamed from: l  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1896l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1897m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1898n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1899o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1900p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1901q;

    /* renamed from: r  reason: collision with root package name */
    public int f1902r;

    /* renamed from: s  reason: collision with root package name */
    public int f1903s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f1904t;

    /* renamed from: u  reason: collision with root package name */
    public final d f1905u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1906v;
    public final Rect w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public final RectF f1907x = new RectF();

    /* renamed from: y  reason: collision with root package name */
    public final b f1908y = new b(0, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r1 = 2131756040(0x7f100408, float:1.9142976E38)
            r2 = 2130903230(0x7f0300be, float:1.7413272E38)
            r3 = r18
            android.content.Context r1 = b1.o.c0(r3, r7, r2, r1)
            r0.<init>(r1, r7, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.w = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f1907x = r1
            g3.b r1 = new g3.b
            r8 = 0
            r1.<init>(r8, r0)
            r0.f1908y = r1
            android.content.Context r9 = r17.getContext()
            r10 = 8388627(0x800013, float:1.175497E-38)
            r11 = 1
            if (r7 != 0) goto L_0x0034
            goto L_0x0094
        L_0x0034:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0045:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03b6
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03ae
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03a8
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03a2
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x039a
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x039a
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x039a
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x039a
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r10)
            if (r1 == r10) goto L_0x0094
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0094:
            g3.f r12 = new g3.f
            r12.<init>(r9, r7)
            android.content.Context r1 = r12.f2876h0
            int[] r13 = y2.a.f5821b
            int[] r6 = new int[r8]
            r5 = 2131756040(0x7f100408, float:1.9142976E38)
            r4 = 2130903230(0x7f0300be, float:1.7413272E38)
            r2 = r19
            r3 = r13
            android.content.res.TypedArray r1 = b1.v.G(r1, r2, r3, r4, r5, r6)
            r14 = 37
            boolean r2 = r1.hasValue(r14)
            r12.I0 = r2
            r2 = 24
            android.content.Context r3 = r12.f2876h0
            android.content.res.ColorStateList r2 = b1.o.u(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.A
            if (r4 == r2) goto L_0x00c9
            r12.A = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00c9:
            r2 = 11
            android.content.res.ColorStateList r2 = b1.o.u(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.B
            if (r4 == r2) goto L_0x00dc
            r12.B = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00dc:
            r2 = 19
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r12.C
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f1
            r12.C = r2
            r12.invalidateSelf()
            r12.u()
        L_0x00f1:
            r2 = 12
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0100
            float r2 = r1.getDimension(r2, r4)
            r12.A(r2)
        L_0x0100:
            r2 = 22
            android.content.res.ColorStateList r2 = b1.o.u(r3, r1, r2)
            r12.F(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r4)
            r12.G(r2)
            r2 = 36
            android.content.res.ColorStateList r2 = b1.o.u(r3, r1, r2)
            r12.P(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0124
            java.lang.String r2 = ""
        L_0x0124:
            java.lang.CharSequence r5 = r12.H
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 != 0) goto L_0x0138
            r12.H = r2
            k3.i r2 = r12.f2882n0
            r2.f3963d = r11
            r12.invalidateSelf()
            r12.u()
        L_0x0138:
            boolean r2 = r1.hasValue(r8)
            r5 = 0
            if (r2 == 0) goto L_0x014b
            int r2 = r1.getResourceId(r8, r8)
            if (r2 == 0) goto L_0x014b
            m3.d r6 = new m3.d
            r6.<init>(r3, r2)
            goto L_0x014c
        L_0x014b:
            r6 = r5
        L_0x014c:
            float r2 = r6.f4204k
            float r2 = r1.getDimension(r11, r2)
            r6.f4204k = r2
            r12.Q(r6)
            r2 = 3
            int r6 = r1.getInt(r2, r8)
            if (r6 == r11) goto L_0x016a
            r15 = 2
            if (r6 == r15) goto L_0x0167
            if (r6 == r2) goto L_0x0164
            goto L_0x016e
        L_0x0164:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L_0x016c
        L_0x0167:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x016c
        L_0x016a:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L_0x016c:
            r12.F0 = r2
        L_0x016e:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r8)
            r12.E(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0194
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x0194
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 != 0) goto L_0x0194
            r6 = 15
            boolean r6 = r1.getBoolean(r6, r8)
            r12.E(r6)
        L_0x0194:
            r6 = 14
            android.graphics.drawable.Drawable r6 = b1.o.w(r3, r1, r6)
            r12.B(r6)
            r6 = 17
            boolean r15 = r1.hasValue(r6)
            if (r15 == 0) goto L_0x01ac
            android.content.res.ColorStateList r6 = b1.o.u(r3, r1, r6)
            r12.D(r6)
        L_0x01ac:
            r6 = 16
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r1.getDimension(r6, r15)
            r12.C(r6)
            r6 = 31
            boolean r6 = r1.getBoolean(r6, r8)
            r12.M(r6)
            if (r7 == 0) goto L_0x01db
            java.lang.String r6 = "closeIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x01db
            java.lang.String r6 = "closeIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 != 0) goto L_0x01db
            r6 = 26
            boolean r6 = r1.getBoolean(r6, r8)
            r12.M(r6)
        L_0x01db:
            r6 = 25
            android.graphics.drawable.Drawable r6 = b1.o.w(r3, r1, r6)
            r12.H(r6)
            r6 = 30
            android.content.res.ColorStateList r6 = b1.o.u(r3, r1, r6)
            r12.L(r6)
            r6 = 28
            float r6 = r1.getDimension(r6, r4)
            r12.J(r6)
            r6 = 6
            boolean r6 = r1.getBoolean(r6, r8)
            r12.w(r6)
            r6 = 10
            boolean r6 = r1.getBoolean(r6, r8)
            r12.z(r6)
            if (r7 == 0) goto L_0x0222
            java.lang.String r6 = "checkedIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x0222
            java.lang.String r6 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r6)
            if (r2 != 0) goto L_0x0222
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r8)
            r12.z(r2)
        L_0x0222:
            r2 = 7
            android.graphics.drawable.Drawable r2 = b1.o.w(r3, r1, r2)
            r12.x(r2)
            r2 = 9
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x0239
            android.content.res.ColorStateList r2 = b1.o.u(r3, r1, r2)
            r12.y(r2)
        L_0x0239:
            r2 = 39
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x024c
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x024c
            z2.b r2 = z2.b.a(r3, r2)
            goto L_0x024d
        L_0x024c:
            r2 = r5
        L_0x024d:
            r12.X = r2
            r2 = 33
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x0261
            int r2 = r1.getResourceId(r2, r8)
            if (r2 == 0) goto L_0x0261
            z2.b r5 = z2.b.a(r3, r2)
        L_0x0261:
            r12.Y = r5
            r2 = 21
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.Z
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0277
            r12.Z = r2
            r12.invalidateSelf()
            r12.u()
        L_0x0277:
            r2 = 35
            float r2 = r1.getDimension(r2, r4)
            r12.O(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r4)
            r12.N(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.f2872c0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x029d
            r12.f2872c0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x029d:
            r2 = 40
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.f2873d0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02b1
            r12.f2873d0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x02b1:
            r2 = 29
            float r2 = r1.getDimension(r2, r4)
            r12.K(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r4)
            r12.I(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.f2875g0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02d7
            r12.f2875g0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x02d7:
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r12.H0 = r2
            r1.recycle()
            r15 = 2131756040(0x7f100408, float:1.9142976E38)
            int[] r6 = new int[r8]
            r16 = 2130903230(0x7f0300be, float:1.7413272E38)
            r4 = 2130903230(0x7f0300be, float:1.7413272E38)
            r5 = 2131756040(0x7f100408, float:1.9142976E38)
            r1 = r9
            r2 = r19
            r3 = r13
            android.content.res.TypedArray r1 = b1.v.G(r1, r2, r3, r4, r5, r6)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r8)
            r0.f1901q = r2
            android.content.Context r2 = r17.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 48
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r11, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f1903s = r2
            r1.recycle()
            r0.setChipDrawable(r12)
            float r1 = x0.j0.i(r17)
            r12.i(r1)
            int[] r6 = new int[r8]
            r1 = r9
            r2 = r19
            r3 = r13
            r4 = r16
            r5 = r15
            android.content.res.TypedArray r1 = b1.v.G(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r14)
            r1.recycle()
            g3.d r1 = new g3.d
            r1.<init>(r0, r0)
            r0.f1905u = r1
            r17.d()
            if (r2 != 0) goto L_0x035e
            g3.c r1 = new g3.c
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x035e:
            boolean r1 = r0.f1897m
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r12.H
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r12.F0
            r0.setEllipsize(r1)
            r17.g()
            g3.f r1 = r0.f1892h
            boolean r1 = r1.G0
            if (r1 != 0) goto L_0x037c
            r0.setLines(r11)
            r0.setHorizontallyScrolling(r11)
        L_0x037c:
            r0.setGravity(r10)
            r17.f()
            boolean r1 = r0.f1901q
            if (r1 == 0) goto L_0x038b
            int r1 = r0.f1903s
            r0.setMinHeight(r1)
        L_0x038b:
            int r1 = x0.e0.d(r17)
            r0.f1902r = r1
            g3.a r1 = new g3.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x039a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x03a2:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03a8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03ae:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03b6:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1907x;
        rectF.setEmpty();
        if (c() && this.f1895k != null) {
            f fVar = this.f1892h;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f6 = fVar.f2875g0 + fVar.f0 + fVar.R + fVar.f2874e0 + fVar.f2873d0;
                if (c.a(fVar) == 0) {
                    float f7 = (float) bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f6;
                } else {
                    float f8 = (float) bounds.left;
                    rectF.left = f8;
                    rectF.right = f8 + f6;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.w;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private m3.d getTextAppearance() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f2882n0.f3965f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z5) {
        if (this.f1899o != z5) {
            this.f1899o = z5;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z5) {
        if (this.f1898n != z5) {
            this.f1898n = z5;
            refreshDrawableState();
        }
    }

    public final void b(int i3) {
        this.f1903s = i3;
        int i6 = 0;
        if (!this.f1901q) {
            InsetDrawable insetDrawable = this.f1893i;
            if (insetDrawable == null) {
                int[] iArr = a.f4323a;
                e();
            } else if (insetDrawable != null) {
                this.f1893i = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = a.f4323a;
                e();
            }
        } else {
            int max = Math.max(0, i3 - ((int) this.f1892h.C));
            int max2 = Math.max(0, i3 - this.f1892h.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i7 = max2 > 0 ? max2 / 2 : 0;
                if (max > 0) {
                    i6 = max / 2;
                }
                int i8 = i6;
                if (this.f1893i != null) {
                    Rect rect = new Rect();
                    this.f1893i.getPadding(rect);
                    if (rect.top == i8 && rect.bottom == i8 && rect.left == i7 && rect.right == i7) {
                        int[] iArr3 = a.f4323a;
                        e();
                        return;
                    }
                }
                if (getMinHeight() != i3) {
                    setMinHeight(i3);
                }
                if (getMinWidth() != i3) {
                    setMinWidth(i3);
                }
                this.f1893i = new InsetDrawable(this.f1892h, i7, i8, i7, i8);
                int[] iArr4 = a.f4323a;
                e();
                return;
            }
            InsetDrawable insetDrawable2 = this.f1893i;
            if (insetDrawable2 == null) {
                int[] iArr5 = a.f4323a;
                e();
            } else if (insetDrawable2 != null) {
                this.f1893i = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = a.f4323a;
                e();
            }
        }
    }

    public final boolean c() {
        f fVar = this.f1892h;
        if (fVar != null) {
            Drawable drawable = fVar.O;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof r0.e) {
                ((r0.f) ((r0.e) drawable)).getClass();
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        boolean z5 = false;
        if (c()) {
            f fVar = this.f1892h;
            if ((fVar != null && fVar.N) && this.f1895k != null) {
                u0.l(this, this.f1905u);
                z5 = true;
                this.f1906v = z5;
            }
        }
        u0.l(this, (x0.c) null);
        this.f1906v = z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f1906v
            if (r0 != 0) goto L_0x0009
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L_0x0009:
            g3.d r0 = r10.f1905u
            android.view.accessibility.AccessibilityManager r1 = r0.f2863h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0070
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001c
            goto L_0x0070
        L_0x001c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.794E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L_0x0042
            r6 = 9
            if (r1 == r6) goto L_0x0042
            r6 = 10
            if (r1 == r6) goto L_0x0032
            goto L_0x0070
        L_0x0032:
            int r1 = r0.f2868m
            if (r1 == r7) goto L_0x0070
            if (r1 != r7) goto L_0x0039
            goto L_0x006e
        L_0x0039:
            r0.f2868m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L_0x006e
        L_0x0042:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = r0.f2869n
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x005e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L_0x005e
            r1 = r3
            goto L_0x005f
        L_0x005e:
            r1 = r4
        L_0x005f:
            int r6 = r0.f2868m
            if (r6 != r1) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            r0.f2868m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L_0x006c:
            if (r1 == r7) goto L_0x0070
        L_0x006e:
            r0 = r3
            goto L_0x0071
        L_0x0070:
            r0 = r4
        L_0x0071:
            if (r0 != 0) goto L_0x007b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r4
        L_0x007b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1906v) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f1905u;
        dVar.getClass();
        int i3 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i6 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i6 = 33;
                                } else if (keyCode == 21) {
                                    i6 = 17;
                                } else if (keyCode != 22) {
                                    i6 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i7 = 0;
                                while (i3 < repeatCount && dVar.m(i6, (Rect) null)) {
                                    i3++;
                                    i7 = 1;
                                }
                                i3 = i7;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i8 = dVar.f2867l;
                    if (i8 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f2869n;
                        if (i8 == 0) {
                            chip.performClick();
                        } else if (i8 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f1895k;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1906v) {
                                chip.f1905u.q(1, 1);
                            }
                        }
                    }
                    i3 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i3 = dVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i3 = dVar.m(1, (Rect) null);
            }
        }
        if (i3 == 0 || dVar.f2867l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i3;
        super.drawableStateChanged();
        f fVar = this.f1892h;
        boolean z5 = false;
        if (fVar != null && f.t(fVar.O)) {
            f fVar2 = this.f1892h;
            int isEnabled = isEnabled();
            if (this.f1900p) {
                isEnabled++;
            }
            if (this.f1899o) {
                isEnabled++;
            }
            if (this.f1898n) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (this.f1900p) {
                iArr[i3] = 16842908;
                i3++;
            }
            if (this.f1899o) {
                iArr[i3] = 16843623;
                i3++;
            }
            if (this.f1898n) {
                iArr[i3] = 16842919;
                i3++;
            }
            if (isChecked()) {
                iArr[i3] = 16842913;
            }
            if (!Arrays.equals(fVar2.B0, iArr)) {
                fVar2.B0 = iArr;
                if (fVar2.T()) {
                    z5 = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (z5) {
            invalidate();
        }
    }

    public final void e() {
        this.f1894j = new RippleDrawable(a.a(this.f1892h.G), getBackgroundDrawable(), (Drawable) null);
        f fVar = this.f1892h;
        if (fVar.C0) {
            fVar.C0 = false;
            fVar.D0 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.f1894j;
        WeakHashMap weakHashMap = u0.f5622a;
        d0.q(this, rippleDrawable);
        f();
    }

    public final void f() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f1892h) != null) {
            int q5 = (int) (fVar.q() + fVar.f2875g0 + fVar.f2873d0);
            f fVar2 = this.f1892h;
            int p2 = (int) (fVar2.p() + fVar2.Z + fVar2.f2872c0);
            if (this.f1893i != null) {
                Rect rect = new Rect();
                this.f1893i.getPadding(rect);
                p2 += rect.left;
                q5 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = u0.f5622a;
            e0.k(this, p2, paddingTop, q5, paddingBottom);
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f1892h;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        m3.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1908y);
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1904t)) {
            return this.f1904t;
        }
        f fVar = this.f1892h;
        if (!(fVar != null && fVar.T)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1893i;
        return insetDrawable == null ? this.f1892h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.V;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.W;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.B;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1892h;
    }

    public float getChipEndPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f2875g0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f1892h;
        if (fVar == null || (drawable = fVar.J) == null) {
            return null;
        }
        if (!(drawable instanceof r0.e)) {
            return drawable;
        }
        ((r0.f) ((r0.e) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.L;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.K;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.C;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.Z;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.E;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.F;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f1892h;
        if (fVar == null || (drawable = fVar.O) == null) {
            return null;
        }
        if (!(drawable instanceof r0.e)) {
            return drawable;
        }
        ((r0.f) ((r0.e) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.S;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.R;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f2874e0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.Q;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.F0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f1906v) {
            d dVar = this.f1905u;
            if (dVar.f2867l == 1 || dVar.f2866k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public z2.b getHideMotionSpec() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.Y;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f2871b0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f2870a0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.G;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f1892h.f4767d.f4745a;
    }

    public z2.b getShowMotionSpec() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.X;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f2873d0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f1892h;
        if (fVar != null) {
            return fVar.f2872c0;
        }
        return 0.0f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bumptech.glide.c.F(this, this.f1892h);
    }

    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        f fVar = this.f1892h;
        if (fVar != null && fVar.T) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z5, int i3, Rect rect) {
        super.onFocusChanged(z5, i3, rect);
        if (this.f1906v) {
            d dVar = this.f1905u;
            int i6 = dVar.f2867l;
            if (i6 != Integer.MIN_VALUE) {
                dVar.j(i6);
            }
            if (z5) {
                dVar.m(i3, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z5 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z5 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z5);
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f1892h;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.T);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        return (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) ? super.onResolvePointerIcon(motionEvent, i3) : PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        if (this.f1902r != i3) {
            this.f1902r = i3;
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0049
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0044
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f1898n
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x004e
            r5.setCloseIconPressed(r3)
            goto L_0x004e
        L_0x002b:
            boolean r0 = r5.f1898n
            if (r0 == 0) goto L_0x0044
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f1895k
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            boolean r0 = r5.f1906v
            if (r0 == 0) goto L_0x0042
            g3.d r0 = r5.f1905u
            r0.q(r2, r2)
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            r5.setCloseIconPressed(r3)
            goto L_0x0051
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r2)
        L_0x004e:
            r0 = r2
            goto L_0x0051
        L_0x0050:
            r0 = r3
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = r3
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1904t = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1894j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i3) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1894j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i3) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z5) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.w(z5);
        }
    }

    public void setCheckableResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.w(fVar.f2876h0.getResources().getBoolean(i3));
        }
    }

    public void setChecked(boolean z5) {
        f fVar = this.f1892h;
        if (fVar == null) {
            this.f1897m = z5;
        } else if (fVar.T) {
            super.setChecked(z5);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i3) {
        setCheckedIconVisible(i3);
    }

    public void setCheckedIconResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.x(p.n(fVar.f2876h0, i3));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.y(n0.b.a(fVar.f2876h0, i3));
        }
    }

    public void setCheckedIconVisible(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.z(fVar.f2876h0.getResources().getBoolean(i3));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f1892h;
        if (fVar != null && fVar.B != colorStateList) {
            fVar.B = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i3) {
        ColorStateList a6;
        f fVar = this.f1892h;
        if (fVar != null && fVar.B != (a6 = n0.b.a(fVar.f2876h0, i3))) {
            fVar.B = a6;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.A(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.A(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f1892h;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.E0 = new WeakReference((Object) null);
            }
            this.f1892h = fVar;
            fVar.G0 = false;
            fVar.E0 = new WeakReference(this);
            b(this.f1903s);
        }
    }

    public void setChipEndPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null && fVar.f2875g0 != f6) {
            fVar.f2875g0 = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipEndPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            float dimension = fVar.f2876h0.getResources().getDimension(i3);
            if (fVar.f2875g0 != dimension) {
                fVar.f2875g0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i3) {
        setChipIconVisible(i3);
    }

    public void setChipIconResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.B(p.n(fVar.f2876h0, i3));
        }
    }

    public void setChipIconSize(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.C(f6);
        }
    }

    public void setChipIconSizeResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.C(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.D(n0.b.a(fVar.f2876h0, i3));
        }
    }

    public void setChipIconVisible(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.E(fVar.f2876h0.getResources().getBoolean(i3));
        }
    }

    public void setChipMinHeight(float f6) {
        f fVar = this.f1892h;
        if (fVar != null && fVar.C != f6) {
            fVar.C = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipMinHeightResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            float dimension = fVar.f2876h0.getResources().getDimension(i3);
            if (fVar.C != dimension) {
                fVar.C = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null && fVar.Z != f6) {
            fVar.Z = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipStartPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            float dimension = fVar.f2876h0.getResources().getDimension(i3);
            if (fVar.Z != dimension) {
                fVar.Z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.F(n0.b.a(fVar.f2876h0, i3));
        }
    }

    public void setChipStrokeWidth(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.G(f6);
        }
    }

    public void setChipStrokeWidthResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.G(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i3) {
        setText(getResources().getString(i3));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f1892h;
        if (fVar != null && fVar.S != charSequence) {
            String str = v0.b.f5361d;
            Locale locale = Locale.getDefault();
            int i3 = l.f5378a;
            boolean z5 = true;
            if (v0.k.a(locale) != 1) {
                z5 = false;
            }
            v0.b bVar = z5 ? v0.b.f5364g : v0.b.f5363f;
            fVar.S = bVar.c(charSequence, bVar.f5367c);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i3) {
        setCloseIconVisible(i3);
    }

    public void setCloseIconEndPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.I(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.I(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.H(p.n(fVar.f2876h0, i3));
        }
        d();
    }

    public void setCloseIconSize(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.J(f6);
        }
    }

    public void setCloseIconSizeResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.J(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.K(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.K(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.L(n0.b.a(fVar.f2876h0, i3));
        }
    }

    public void setCloseIconVisible(int i3) {
        setCloseIconVisible(getResources().getBoolean(i3));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i6, int i7, int i8) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i7 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i6, i7, i8);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i6, int i7, int i8) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i7 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i3, i6, i7, i8);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.i(f6);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1892h != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                f fVar = this.f1892h;
                if (fVar != null) {
                    fVar.F0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.f1901q = z5;
        b(this.f1903s);
    }

    public void setGravity(int i3) {
        if (i3 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i3);
        }
    }

    public void setHideMotionSpec(z2.b bVar) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.Y = bVar;
        }
    }

    public void setHideMotionSpecResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.Y = z2.b.a(fVar.f2876h0, i3);
        }
    }

    public void setIconEndPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.N(f6);
        }
    }

    public void setIconEndPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.N(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    public void setIconStartPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.O(f6);
        }
    }

    public void setIconStartPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.O(fVar.f2876h0.getResources().getDimension(i3));
        }
    }

    public void setInternalOnCheckedChangeListener(k3.e eVar) {
    }

    public void setLayoutDirection(int i3) {
        if (this.f1892h != null) {
            super.setLayoutDirection(i3);
        }
    }

    public void setLines(int i3) {
        if (i3 <= 1) {
            super.setLines(i3);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i3) {
        if (i3 <= 1) {
            super.setMaxLines(i3);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i3) {
        super.setMaxWidth(i3);
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.H0 = i3;
        }
    }

    public void setMinLines(int i3) {
        if (i3 <= 1) {
            super.setMinLines(i3);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1896l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1895k = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        if (!this.f1892h.C0) {
            e();
        }
    }

    public void setRippleColorResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.P(n0.b.a(fVar.f2876h0, i3));
            if (!this.f1892h.C0) {
                e();
            }
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f1892h.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(z2.b bVar) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.X = bVar;
        }
    }

    public void setShowMotionSpecResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.X = z2.b.a(fVar.f2876h0, i3);
        }
    }

    public void setSingleLine(boolean z5) {
        if (z5) {
            super.setSingleLine(z5);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f1892h;
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(fVar.G0 ? null : charSequence, bufferType);
            f fVar2 = this.f1892h;
            if (fVar2 != null && !TextUtils.equals(fVar2.H, charSequence)) {
                fVar2.H = charSequence;
                fVar2.f2882n0.f3963d = true;
                fVar2.invalidateSelf();
                fVar2.u();
            }
        }
    }

    public void setTextAppearance(int i3) {
        super.setTextAppearance(i3);
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.Q(new m3.d(fVar.f2876h0, i3));
        }
        g();
    }

    public void setTextAppearanceResource(int i3) {
        setTextAppearance(getContext(), i3);
    }

    public void setTextEndPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null && fVar.f2873d0 != f6) {
            fVar.f2873d0 = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextEndPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            float dimension = fVar.f2876h0.getResources().getDimension(i3);
            if (fVar.f2873d0 != dimension) {
                fVar.f2873d0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public final void setTextSize(int i3, float f6) {
        super.setTextSize(i3, f6);
        f fVar = this.f1892h;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i3, f6, getResources().getDisplayMetrics());
            i iVar = fVar.f2882n0;
            m3.d dVar = iVar.f3965f;
            if (dVar != null) {
                dVar.f4204k = applyDimension;
                iVar.f3960a.setTextSize(applyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f6) {
        f fVar = this.f1892h;
        if (fVar != null && fVar.f2872c0 != f6) {
            fVar.f2872c0 = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextStartPaddingResource(int i3) {
        f fVar = this.f1892h;
        if (fVar != null) {
            float dimension = fVar.f2876h0.getResources().getDimension(i3);
            if (fVar.f2872c0 != dimension) {
                fVar.f2872c0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z5) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.M(z5);
        }
        d();
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setCheckedIconVisible(boolean z5) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.z(z5);
        }
    }

    public void setChipIconVisible(boolean z5) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.E(z5);
        }
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.Q(new m3.d(fVar.f2876h0, i3));
        }
        g();
    }

    public void setTextAppearance(m3.d dVar) {
        f fVar = this.f1892h;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        g();
    }
}
