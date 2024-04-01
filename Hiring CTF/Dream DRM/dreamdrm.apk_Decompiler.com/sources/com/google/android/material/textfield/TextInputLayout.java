package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a3;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.v1;
import b1.o;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;
import com.theori.dreamdrm.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k3.b;
import o0.c;
import p3.f;
import p3.g;
import p3.j;
import p3.k;
import s3.a0;
import s3.h;
import s3.m;
import s3.n;
import s3.q;
import s3.r;
import s3.t;
import s3.v;
import s3.w;
import s3.x;
import s3.y;
import s3.z;
import t1.i;
import t1.s;
import v0.l;
import w4.p;
import x0.d0;
import x0.g0;
import x0.u0;
import z2.a;

public class TextInputLayout extends LinearLayout {
    public static final int[][] D0 = {new int[]{16842919}, new int[0]};
    public i A;
    public ValueAnimator A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public ColorStateList E;
    public boolean F;
    public CharSequence G;
    public boolean H;
    public g I;
    public g J;
    public StateListDrawable K;
    public boolean L;
    public g M;
    public g N;
    public k O;
    public boolean P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f2022a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Rect f2023b0 = new Rect();

    /* renamed from: c0  reason: collision with root package name */
    public final Rect f2024c0 = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f2025d;

    /* renamed from: d0  reason: collision with root package name */
    public final RectF f2026d0 = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final v f2027e;

    /* renamed from: e0  reason: collision with root package name */
    public Typeface f2028e0;

    /* renamed from: f  reason: collision with root package name */
    public final n f2029f;
    public ColorDrawable f0;

    /* renamed from: g  reason: collision with root package name */
    public EditText f2030g;

    /* renamed from: g0  reason: collision with root package name */
    public int f2031g0;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f2032h;

    /* renamed from: h0  reason: collision with root package name */
    public final LinkedHashSet f2033h0 = new LinkedHashSet();

    /* renamed from: i  reason: collision with root package name */
    public int f2034i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public ColorDrawable f2035i0;

    /* renamed from: j  reason: collision with root package name */
    public int f2036j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public int f2037j0;

    /* renamed from: k  reason: collision with root package name */
    public int f2038k = -1;

    /* renamed from: k0  reason: collision with root package name */
    public Drawable f2039k0;

    /* renamed from: l  reason: collision with root package name */
    public int f2040l = -1;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f2041l0;

    /* renamed from: m  reason: collision with root package name */
    public final r f2042m = new r(this);

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f2043m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2044n;

    /* renamed from: n0  reason: collision with root package name */
    public int f2045n0;

    /* renamed from: o  reason: collision with root package name */
    public int f2046o;

    /* renamed from: o0  reason: collision with root package name */
    public int f2047o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2048p;

    /* renamed from: p0  reason: collision with root package name */
    public int f2049p0;

    /* renamed from: q  reason: collision with root package name */
    public z f2050q = new w();

    /* renamed from: q0  reason: collision with root package name */
    public ColorStateList f2051q0;

    /* renamed from: r  reason: collision with root package name */
    public i1 f2052r;

    /* renamed from: r0  reason: collision with root package name */
    public int f2053r0;

    /* renamed from: s  reason: collision with root package name */
    public int f2054s;

    /* renamed from: s0  reason: collision with root package name */
    public int f2055s0;

    /* renamed from: t  reason: collision with root package name */
    public int f2056t;

    /* renamed from: t0  reason: collision with root package name */
    public int f2057t0;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f2058u;

    /* renamed from: u0  reason: collision with root package name */
    public int f2059u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2060v;

    /* renamed from: v0  reason: collision with root package name */
    public int f2061v0;
    public i1 w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f2062w0;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f2063x;

    /* renamed from: x0  reason: collision with root package name */
    public final b f2064x0;

    /* renamed from: y  reason: collision with root package name */
    public int f2065y;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f2066y0;

    /* renamed from: z  reason: collision with root package name */
    public i f2067z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2068z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = 2130904091(0x7f03041b, float:1.7415018E38)
            r9 = 2131755841(0x7f100341, float:1.9142573E38)
            r1 = r19
            android.content.Context r1 = b1.o.c0(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f2034i = r10
            r0.f2036j = r10
            r0.f2038k = r10
            r0.f2040l = r10
            s3.r r1 = new s3.r
            r1.<init>(r0)
            r0.f2042m = r1
            s3.w r1 = new s3.w
            r1.<init>()
            r0.f2050q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2023b0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2024c0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2026d0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f2033h0 = r1
            k3.b r1 = new k3.b
            r1.<init>(r0)
            r0.f2064x0 = r1
            android.content.Context r11 = r18.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r13 = 0
            r0.setWillNotDraw(r13)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r11)
            r0.f2025d = r14
            r14.setAddStatesFromChildren(r12)
            android.view.animation.LinearInterpolator r2 = z2.a.f5933a
            r1.Q = r2
            r1.h(r13)
            r1.P = r2
            r1.h(r13)
            int r2 = r1.f3922g
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x007e
            r1.f3922g = r3
            r1.h(r13)
        L_0x007e:
            int[] r15 = y2.a.f5844z
            r6 = 5
            int[] r5 = new int[r6]
            r5 = {22, 20, 40, 45, 49} // fill-array
            b1.v.f(r11, r7, r8, r9)
            r4 = 2130904091(0x7f03041b, float:1.7415018E38)
            r16 = 2131755841(0x7f100341, float:1.9142573E38)
            r1 = r11
            r2 = r20
            r3 = r15
            r17 = r5
            r5 = r16
            r13 = r6
            r6 = r17
            b1.v.j(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.m3 r1 = new androidx.appcompat.widget.m3
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r7, r15, r8, r9)
            r1.<init>(r11, r2)
            s3.v r3 = new s3.v
            r3.<init>(r0, r1)
            r0.f2027e = r3
            r4 = 48
            boolean r4 = r1.a(r4, r12)
            r0.F = r4
            r4 = 4
            java.lang.CharSequence r4 = r1.k(r4)
            r0.setHint((java.lang.CharSequence) r4)
            r4 = 47
            boolean r4 = r1.a(r4, r12)
            r0.f2068z0 = r4
            r4 = 42
            boolean r4 = r1.a(r4, r12)
            r0.f2066y0 = r4
            r4 = 6
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x00dc
            int r4 = r1.h(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00ea
        L_0x00dc:
            r4 = 3
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x00ea
            int r4 = r1.d(r4, r10)
            r0.setMinWidth(r4)
        L_0x00ea:
            boolean r4 = r1.l(r13)
            r5 = 2
            if (r4 == 0) goto L_0x00f9
            int r4 = r1.h(r13, r10)
            r0.setMaxEms(r4)
            goto L_0x0106
        L_0x00f9:
            boolean r4 = r1.l(r5)
            if (r4 == 0) goto L_0x0106
            int r4 = r1.d(r5, r10)
            r0.setMaxWidth(r4)
        L_0x0106:
            p3.j r4 = p3.k.b(r11, r7, r8, r9)
            p3.k r6 = new p3.k
            r6.<init>(r4)
            r0.O = r6
            android.content.res.Resources r4 = r11.getResources()
            r6 = 2131100406(0x7f0602f6, float:1.7813193E38)
            int r4 = r4.getDimensionPixelOffset(r6)
            r0.Q = r4
            r4 = 9
            r6 = 0
            int r4 = r1.c(r4, r6)
            r0.S = r4
            android.content.res.Resources r4 = r11.getResources()
            r6 = 2131100407(0x7f0602f7, float:1.7813195E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r6 = 16
            int r4 = r1.d(r6, r4)
            r0.U = r4
            android.content.res.Resources r4 = r11.getResources()
            r6 = 2131100408(0x7f0602f8, float:1.7813197E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r6 = 17
            int r4 = r1.d(r6, r4)
            r0.V = r4
            int r4 = r0.U
            r0.T = r4
            r4 = 13
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r6)
            r7 = 12
            float r7 = r2.getDimension(r7, r6)
            r8 = 10
            float r8 = r2.getDimension(r8, r6)
            r9 = 11
            float r6 = r2.getDimension(r9, r6)
            p3.k r9 = r0.O
            r9.getClass()
            p3.j r13 = new p3.j
            r13.<init>(r9)
            r9 = 0
            int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r15 < 0) goto L_0x0181
            p3.a r15 = new p3.a
            r15.<init>(r4)
            r13.f4793e = r15
        L_0x0181:
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x018c
            p3.a r4 = new p3.a
            r4.<init>(r7)
            r13.f4794f = r4
        L_0x018c:
            int r4 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0197
            p3.a r4 = new p3.a
            r4.<init>(r8)
            r13.f4795g = r4
        L_0x0197:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x01a2
            p3.a r4 = new p3.a
            r4.<init>(r6)
            r13.f4796h = r4
        L_0x01a2:
            p3.k r4 = new p3.k
            r4.<init>(r13)
            r0.O = r4
            r4 = 7
            android.content.res.ColorStateList r4 = b1.o.v(r11, r1, r4)
            if (r4 == 0) goto L_0x0206
            int r6 = r4.getDefaultColor()
            r0.f2053r0 = r6
            r0.f2022a0 = r6
            boolean r6 = r4.isStateful()
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r6 == 0) goto L_0x01e2
            int[] r6 = new int[r12]
            r8 = 0
            r6[r8] = r7
            int r6 = r4.getColorForState(r6, r10)
            r0.f2055s0 = r6
            int[] r6 = new int[r5]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r4.getColorForState(r6, r10)
            r0.f2057t0 = r6
            int[] r6 = new int[r5]
            r6 = {16843623, 16842910} // fill-array
            int r4 = r4.getColorForState(r6, r10)
            r8 = 0
            goto L_0x0203
        L_0x01e2:
            int r4 = r0.f2053r0
            r0.f2057t0 = r4
            r4 = 2131034800(0x7f0502b0, float:1.7680128E38)
            android.content.res.ColorStateList r4 = n0.b.a(r11, r4)
            int[] r6 = new int[r12]
            r8 = 0
            r6[r8] = r7
            int r6 = r4.getColorForState(r6, r10)
            r0.f2055s0 = r6
            int[] r6 = new int[r12]
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r6[r8] = r7
            int r4 = r4.getColorForState(r6, r10)
        L_0x0203:
            r0.f2059u0 = r4
            goto L_0x0211
        L_0x0206:
            r8 = 0
            r0.f2022a0 = r8
            r0.f2053r0 = r8
            r0.f2055s0 = r8
            r0.f2057t0 = r8
            r0.f2059u0 = r8
        L_0x0211:
            boolean r4 = r1.l(r12)
            if (r4 == 0) goto L_0x021f
            android.content.res.ColorStateList r4 = r1.b(r12)
            r0.f2043m0 = r4
            r0.f2041l0 = r4
        L_0x021f:
            r4 = 14
            android.content.res.ColorStateList r6 = b1.o.v(r11, r1, r4)
            r7 = 0
            int r2 = r2.getColor(r4, r7)
            r0.f2049p0 = r2
            java.lang.Object r2 = n0.b.f4213a
            r2 = 2131034827(0x7f0502cb, float:1.7680183E38)
            int r2 = o0.c.a(r11, r2)
            r0.f2045n0 = r2
            r2 = 2131034828(0x7f0502cc, float:1.7680185E38)
            int r2 = o0.c.a(r11, r2)
            r0.f2061v0 = r2
            r2 = 2131034831(0x7f0502cf, float:1.768019E38)
            int r2 = o0.c.a(r11, r2)
            r0.f2047o0 = r2
            if (r6 == 0) goto L_0x024e
            r0.setBoxStrokeColorStateList(r6)
        L_0x024e:
            r2 = 15
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x025d
            android.content.res.ColorStateList r2 = b1.o.v(r11, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x025d:
            r2 = 49
            int r4 = r1.i(r2, r10)
            if (r4 == r10) goto L_0x026e
            r4 = 0
            int r2 = r1.i(r2, r4)
            r0.setHintTextAppearance(r2)
            goto L_0x026f
        L_0x026e:
            r4 = 0
        L_0x026f:
            r2 = 24
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.D = r2
            r2 = 25
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.E = r2
            r2 = 40
            int r2 = r1.i(r2, r4)
            r6 = 35
            java.lang.CharSequence r6 = r1.k(r6)
            r7 = 34
            int r7 = r1.h(r7, r12)
            r8 = 36
            boolean r8 = r1.a(r8, r4)
            r9 = 45
            int r9 = r1.i(r9, r4)
            r11 = 44
            boolean r11 = r1.a(r11, r4)
            r13 = 43
            java.lang.CharSequence r13 = r1.k(r13)
            r15 = 57
            int r15 = r1.i(r15, r4)
            r5 = 56
            java.lang.CharSequence r5 = r1.k(r5)
            r12 = 18
            boolean r12 = r1.a(r12, r4)
            r4 = 19
            int r4 = r1.h(r4, r10)
            r0.setCounterMaxLength(r4)
            r4 = 22
            r10 = 0
            int r4 = r1.i(r4, r10)
            r0.f2056t = r4
            r4 = 20
            int r4 = r1.i(r4, r10)
            r0.f2054s = r4
            r4 = 8
            int r4 = r1.h(r4, r10)
            r0.setBoxBackgroundMode(r4)
            r0.setErrorContentDescription(r6)
            r0.setErrorAccessibilityLiveRegion(r7)
            int r4 = r0.f2054s
            r0.setCounterOverflowTextAppearance(r4)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorTextAppearance(r2)
            int r2 = r0.f2056t
            r0.setCounterTextAppearance(r2)
            r0.setPlaceholderText(r5)
            r0.setPlaceholderTextAppearance(r15)
            r2 = 41
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0309
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setErrorTextColor(r2)
        L_0x0309:
            r2 = 46
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0318
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHelperTextColor(r2)
        L_0x0318:
            r2 = 50
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0327
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHintTextColor(r2)
        L_0x0327:
            r2 = 23
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0336
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterTextColor(r2)
        L_0x0336:
            r2 = 21
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0345
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x0345:
            r2 = 58
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0354
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x0354:
            s3.n r2 = new s3.n
            r2.<init>(r0, r1)
            r0.f2029f = r2
            r4 = 1
            r5 = 0
            boolean r5 = r1.a(r5, r4)
            r1.o()
            r1 = 2
            x0.d0.s(r0, r1)
            x0.l0.m(r0, r4)
            r14.addView(r3)
            r14.addView(r2)
            r0.addView(r14)
            r0.setEnabled(r5)
            r0.setHelperTextEnabled(r11)
            r0.setErrorEnabled(r8)
            r0.setCounterEnabled(r12)
            r0.setHelperText(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        int i3;
        EditText editText = this.f2030g;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int u3 = b1.v.u(this.f2030g, R.attr.colorControlHighlight);
                int i6 = this.R;
                int[][] iArr = D0;
                if (i6 == 2) {
                    Context context = getContext();
                    g gVar = this.I;
                    TypedValue N2 = b1.v.N(context, R.attr.colorSurface, "TextInputLayout");
                    int i7 = N2.resourceId;
                    if (i7 != 0) {
                        Object obj = n0.b.f4213a;
                        i3 = c.a(context, i7);
                    } else {
                        i3 = N2.data;
                    }
                    g gVar2 = new g(gVar.f4767d.f4745a);
                    int C2 = b1.v.C(u3, i3, 0.1f);
                    gVar2.j(new ColorStateList(iArr, new int[]{C2, 0}));
                    gVar2.setTint(i3);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{C2, i3});
                    g gVar3 = new g(gVar.f4767d.f4745a);
                    gVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
                } else if (i6 != 1) {
                    return null;
                } else {
                    g gVar4 = this.I;
                    int i8 = this.f2022a0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{b1.v.C(u3, i8, 0.1f), i8}), gVar4, gVar4);
                }
            }
        }
        return this.I;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.K = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.K.addState(new int[0], f(false));
        }
        return this.K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.J == null) {
            this.J = f(true);
        }
        return this.J;
    }

    public static void j(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z5);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2030g == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f2030g = editText;
            int i3 = this.f2034i;
            if (i3 != -1) {
                setMinEms(i3);
            } else {
                setMinWidth(this.f2038k);
            }
            int i6 = this.f2036j;
            if (i6 != -1) {
                setMaxEms(i6);
            } else {
                setMaxWidth(this.f2040l);
            }
            this.L = false;
            h();
            setTextInputAccessibilityDelegate(new y(this));
            Typeface typeface = this.f2030g.getTypeface();
            b bVar = this.f2064x0;
            bVar.m(typeface);
            float textSize = this.f2030g.getTextSize();
            if (bVar.f3923h != textSize) {
                bVar.f3923h = textSize;
                bVar.h(false);
            }
            int i7 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f2030g.getLetterSpacing();
            if (bVar.W != letterSpacing) {
                bVar.W = letterSpacing;
                bVar.h(false);
            }
            int gravity = this.f2030g.getGravity();
            int i8 = (gravity & -113) | 48;
            if (bVar.f3922g != i8) {
                bVar.f3922g = i8;
                bVar.h(false);
            }
            if (bVar.f3921f != gravity) {
                bVar.f3921f = gravity;
                bVar.h(false);
            }
            this.f2030g.addTextChangedListener(new a3(this, 1));
            if (this.f2041l0 == null) {
                this.f2041l0 = this.f2030g.getHintTextColors();
            }
            if (this.F) {
                if (TextUtils.isEmpty(this.G)) {
                    CharSequence hint = this.f2030g.getHint();
                    this.f2032h = hint;
                    setHint(hint);
                    this.f2030g.setHint((CharSequence) null);
                }
                this.H = true;
            }
            if (i7 >= 29) {
                o();
            }
            if (this.f2052r != null) {
                m(this.f2030g.getText());
            }
            q();
            this.f2042m.b();
            this.f2027e.bringToFront();
            n nVar = this.f2029f;
            nVar.bringToFront();
            Iterator it = this.f2033h0.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(this);
            }
            nVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.G)) {
            this.G = charSequence;
            b bVar = this.f2064x0;
            if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
                bVar.A = charSequence;
                bVar.B = null;
                Bitmap bitmap = bVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.E = null;
                }
                bVar.h(false);
            }
            if (!this.f2062w0) {
                i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.f2060v != z5) {
            if (z5) {
                i1 i1Var = this.w;
                if (i1Var != null) {
                    this.f2025d.addView(i1Var);
                    this.w.setVisibility(0);
                }
            } else {
                i1 i1Var2 = this.w;
                if (i1Var2 != null) {
                    i1Var2.setVisibility(8);
                }
                this.w = null;
            }
            this.f2060v = z5;
        }
    }

    public final void a(float f6) {
        b bVar = this.f2064x0;
        if (bVar.f3913b != f6) {
            if (this.A0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A0 = valueAnimator;
                valueAnimator.setInterpolator(com.bumptech.glide.c.E(getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f5934b));
                this.A0.setDuration((long) com.bumptech.glide.c.D(getContext(), R.attr.motionDurationMedium4, 167));
                this.A0.addUpdateListener(new c3.a(1, this));
            }
            this.A0.setFloatValues(new float[]{bVar.f3913b, f6});
            this.A0.start();
        }
    }

    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f2025d;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i3, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r7 = this;
            p3.g r0 = r7.I
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            p3.f r1 = r0.f4767d
            p3.k r1 = r1.f4745a
            p3.k r2 = r7.O
            if (r1 == r2) goto L_0x0010
            r0.setShapeAppearanceModel(r2)
        L_0x0010:
            int r0 = r7.R
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0027
            int r0 = r7.T
            if (r0 <= r2) goto L_0x0022
            int r0 = r7.W
            if (r0 == 0) goto L_0x0022
            r0 = r4
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 == 0) goto L_0x0027
            r0 = r4
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            if (r0 == 0) goto L_0x004b
            p3.g r0 = r7.I
            int r1 = r7.T
            float r1 = (float) r1
            int r5 = r7.W
            p3.f r6 = r0.f4767d
            r6.f4755k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            p3.f r5 = r0.f4767d
            android.content.res.ColorStateList r6 = r5.f4748d
            if (r6 == r1) goto L_0x004b
            r5.f4748d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L_0x004b:
            int r0 = r7.f2022a0
            int r1 = r7.R
            if (r1 != r4) goto L_0x0062
            android.content.Context r0 = r7.getContext()
            r1 = 2130903304(0x7f030108, float:1.7413422E38)
            int r0 = b1.v.t(r0, r1, r3)
            int r1 = r7.f2022a0
            int r0 = q0.a.b(r1, r0)
        L_0x0062:
            r7.f2022a0 = r0
            p3.g r1 = r7.I
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            p3.g r0 = r7.M
            if (r0 == 0) goto L_0x00a3
            p3.g r1 = r7.N
            if (r1 != 0) goto L_0x0076
            goto L_0x00a3
        L_0x0076:
            int r1 = r7.T
            if (r1 <= r2) goto L_0x007f
            int r1 = r7.W
            if (r1 == 0) goto L_0x007f
            r3 = r4
        L_0x007f:
            if (r3 == 0) goto L_0x00a0
            android.widget.EditText r1 = r7.f2030g
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x008c
            int r1 = r7.f2045n0
            goto L_0x008e
        L_0x008c:
            int r1 = r7.W
        L_0x008e:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
            p3.g r0 = r7.N
            int r1 = r7.W
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        L_0x00a0:
            r7.invalidate()
        L_0x00a3:
            r7.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float d6;
        if (!this.F) {
            return 0;
        }
        int i3 = this.R;
        b bVar = this.f2064x0;
        if (i3 == 0) {
            d6 = bVar.d();
        } else if (i3 != 2) {
            return 0;
        } else {
            d6 = bVar.d() / 2.0f;
        }
        return (int) d6;
    }

    public final i d() {
        i iVar = new i();
        iVar.f5144f = (long) com.bumptech.glide.c.D(getContext(), R.attr.motionDurationShort2, 87);
        iVar.f5145g = com.bumptech.glide.c.E(getContext(), R.attr.motionEasingLinearInterpolator, a.f5933a);
        return iVar;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i3) {
        EditText editText = this.f2030g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
            return;
        }
        if (this.f2032h != null) {
            boolean z5 = this.H;
            this.H = false;
            CharSequence hint = editText.getHint();
            this.f2030g.setHint(this.f2032h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i3);
            } finally {
                this.f2030g.setHint(hint);
                this.H = z5;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i3);
            onProvideAutofillVirtualStructure(viewStructure, i3);
            FrameLayout frameLayout = this.f2025d;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i6 = 0; i6 < frameLayout.getChildCount(); i6++) {
                View childAt = frameLayout.getChildAt(i6);
                ViewStructure newChild = viewStructure.newChild(i6);
                childAt.dispatchProvideAutofillStructure(newChild, i3);
                if (childAt == this.f2030g) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.C0 = false;
    }

    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z5 = this.F;
        b bVar = this.f2064x0;
        if (z5) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.B != null) {
                RectF rectF = bVar.f3919e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.N;
                    textPaint.setTextSize(bVar.G);
                    float f6 = bVar.f3931p;
                    float f7 = bVar.f3932q;
                    float f8 = bVar.F;
                    if (f8 != 1.0f) {
                        canvas2.scale(f8, f8, f6, f7);
                    }
                    boolean z6 = true;
                    if (bVar.f3918d0 <= 1 || bVar.C) {
                        z6 = false;
                    }
                    if (z6) {
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(bVar.f3931p - ((float) bVar.Y.getLineStart(0)), f7);
                        float f9 = (float) alpha;
                        textPaint.setAlpha((int) (bVar.f3914b0 * f9));
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 31) {
                            float f10 = bVar.H;
                            float f11 = bVar.I;
                            float f12 = bVar.J;
                            int i6 = bVar.K;
                            textPaint.setShadowLayer(f10, f11, f12, q0.a.c(i6, (Color.alpha(i6) * textPaint.getAlpha()) / 255));
                        }
                        bVar.Y.draw(canvas2);
                        textPaint.setAlpha((int) (bVar.f3912a0 * f9));
                        if (i3 >= 31) {
                            float f13 = bVar.H;
                            float f14 = bVar.I;
                            float f15 = bVar.J;
                            int i7 = bVar.K;
                            textPaint.setShadowLayer(f13, f14, f15, q0.a.c(i7, (Color.alpha(i7) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f3916c0;
                        float f16 = (float) lineBaseline;
                        float f17 = f16;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f16, textPaint);
                        if (i3 >= 31) {
                            textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                        }
                        String trim = bVar.f3916c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.Y.getLineEnd(0), str.length()), 0.0f, f17, textPaint);
                    } else {
                        canvas2.translate(f6, f7);
                        bVar.Y.draw(canvas2);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.N != null && (gVar = this.M) != null) {
            gVar.draw(canvas2);
            if (this.f2030g.isFocused()) {
                Rect bounds = this.N.getBounds();
                Rect bounds2 = this.M.getBounds();
                float f18 = bVar.f3913b;
                int centerX = bounds2.centerX();
                int i8 = bounds2.left;
                LinearInterpolator linearInterpolator = a.f5933a;
                bounds.left = Math.round(((float) (i8 - centerX)) * f18) + centerX;
                bounds.right = Math.round(f18 * ((float) (bounds2.right - centerX))) + centerX;
                this.N.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r3.f3925j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.B0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.B0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            k3.b r3 = r4.f2064x0
            if (r3 == 0) goto L_0x0037
            r3.L = r1
            android.content.res.ColorStateList r1 = r3.f3926k
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.f3925j
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r3.h(r2)
            r1 = r0
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            r1 = r1 | r2
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            android.widget.EditText r3 = r4.f2030g
            if (r3 == 0) goto L_0x004f
            java.util.WeakHashMap r3 = x0.u0.f5622a
            boolean r3 = x0.g0.c(r4)
            if (r3 == 0) goto L_0x004b
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            r4.t(r0, r2)
        L_0x004f:
            r4.q()
            r4.w()
            if (r1 == 0) goto L_0x005a
            r4.invalidate()
        L_0x005a:
            r4.B0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.F && !TextUtils.isEmpty(this.G) && (this.I instanceof h);
    }

    public final g f(boolean z5) {
        int i3;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f6 = z5 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2030g;
        float popupElevation = editText instanceof t ? ((t) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        j jVar = new j();
        jVar.f4793e = new p3.a(f6);
        jVar.f4794f = new p3.a(f6);
        jVar.f4796h = new p3.a(dimensionPixelOffset);
        jVar.f4795g = new p3.a(dimensionPixelOffset);
        k kVar = new k(jVar);
        EditText editText2 = this.f2030g;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof t ? ((t) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f4766z;
            TypedValue N2 = b1.v.N(context, R.attr.colorSurface, g.class.getSimpleName());
            int i6 = N2.resourceId;
            if (i6 != 0) {
                Object obj = n0.b.f4213a;
                i3 = c.a(context, i6);
            } else {
                i3 = N2.data;
            }
            dropDownBackgroundTintList = ColorStateList.valueOf(i3);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f4767d;
        if (fVar.f4752h == null) {
            fVar.f4752h = new Rect();
        }
        gVar.f4767d.f4752h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i3, boolean z5) {
        return ((z5 || getPrefixText() == null) ? (!z5 || getSuffixText() == null) ? this.f2030g.getCompoundPaddingLeft() : this.f2029f.c() : this.f2027e.a()) + i3;
    }

    public int getBaseline() {
        EditText editText = this.f2030g;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i3 = this.R;
        if (i3 == 1 || i3 == 2) {
            return this.I;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2022a0;
    }

    public int getBoxBackgroundMode() {
        return this.R;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.S;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean F2 = o.F(this);
        return (F2 ? this.O.f4808h : this.O.f4807g).a(this.f2026d0);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean F2 = o.F(this);
        return (F2 ? this.O.f4807g : this.O.f4808h).a(this.f2026d0);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean F2 = o.F(this);
        return (F2 ? this.O.f4805e : this.O.f4806f).a(this.f2026d0);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean F2 = o.F(this);
        return (F2 ? this.O.f4806f : this.O.f4805e).a(this.f2026d0);
    }

    public int getBoxStrokeColor() {
        return this.f2049p0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2051q0;
    }

    public int getBoxStrokeWidth() {
        return this.U;
    }

    public int getBoxStrokeWidthFocused() {
        return this.V;
    }

    public int getCounterMaxLength() {
        return this.f2046o;
    }

    public CharSequence getCounterOverflowDescription() {
        i1 i1Var;
        if (!this.f2044n || !this.f2048p || (i1Var = this.f2052r) == null) {
            return null;
        }
        return i1Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.C;
    }

    public ColorStateList getCounterTextColor() {
        return this.B;
    }

    public ColorStateList getCursorColor() {
        return this.D;
    }

    public ColorStateList getCursorErrorColor() {
        return this.E;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2041l0;
    }

    public EditText getEditText() {
        return this.f2030g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2029f.f4996j.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2029f.f4996j.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2029f.f5002p;
    }

    public int getEndIconMode() {
        return this.f2029f.f4998l;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2029f.f5003q;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2029f.f4996j;
    }

    public CharSequence getError() {
        r rVar = this.f2042m;
        if (rVar.f5037q) {
            return rVar.f5036p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2042m.f5040t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2042m.f5039s;
    }

    public int getErrorCurrentTextColors() {
        i1 i1Var = this.f2042m.f5038r;
        if (i1Var != null) {
            return i1Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2029f.f4992f.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.f2042m;
        if (rVar.f5043x) {
            return rVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        i1 i1Var = this.f2042m.f5044y;
        if (i1Var != null) {
            return i1Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.F) {
            return this.G;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2064x0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f2064x0;
        return bVar.e(bVar.f3926k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2043m0;
    }

    public z getLengthCounter() {
        return this.f2050q;
    }

    public int getMaxEms() {
        return this.f2036j;
    }

    public int getMaxWidth() {
        return this.f2040l;
    }

    public int getMinEms() {
        return this.f2034i;
    }

    public int getMinWidth() {
        return this.f2038k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2029f.f4996j.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2029f.f4996j.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2060v) {
            return this.f2058u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2065y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2063x;
    }

    public CharSequence getPrefixText() {
        return this.f2027e.f5062f;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2027e.f5061e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2027e.f5061e;
    }

    public k getShapeAppearanceModel() {
        return this.O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2027e.f5063g.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2027e.f5063g.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2027e.f5066j;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2027e.f5067k;
    }

    public CharSequence getSuffixText() {
        return this.f2029f.f5005s;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2029f.f5006t.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2029f.f5006t;
    }

    public Typeface getTypeface() {
        return this.f2028e0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r8 = this;
            int r0 = r8.R
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x006c
            if (r0 == r2) goto L_0x0054
            if (r0 != r1) goto L_0x003b
            boolean r0 = r8.F
            if (r0 == 0) goto L_0x0031
            p3.g r0 = r8.I
            boolean r0 = r0 instanceof s3.h
            if (r0 != 0) goto L_0x0031
            p3.k r0 = r8.O
            int r4 = s3.h.B
            s3.f r4 = new s3.f
            if (r0 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            p3.k r0 = new p3.k
            r0.<init>()
        L_0x0023:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.<init>(r0, r5)
            s3.g r0 = new s3.g
            r0.<init>(r4)
            goto L_0x0038
        L_0x0031:
            p3.g r0 = new p3.g
            p3.k r4 = r8.O
            r0.<init>((p3.k) r4)
        L_0x0038:
            r8.I = r0
            goto L_0x006e
        L_0x003b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.R
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0054:
            p3.g r0 = new p3.g
            p3.k r3 = r8.O
            r0.<init>((p3.k) r3)
            r8.I = r0
            p3.g r0 = new p3.g
            r0.<init>()
            r8.M = r0
            p3.g r0 = new p3.g
            r0.<init>()
            r8.N = r0
            goto L_0x0072
        L_0x006c:
            r8.I = r3
        L_0x006e:
            r8.M = r3
            r8.N = r3
        L_0x0072:
            r8.r()
            r8.w()
            int r0 = r8.R
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x00b5
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            r0 = r2
            goto L_0x0094
        L_0x0093:
            r0 = r3
        L_0x0094:
            if (r0 == 0) goto L_0x009e
            android.content.res.Resources r0 = r8.getResources()
            r5 = 2131100212(0x7f060234, float:1.78128E38)
            goto L_0x00af
        L_0x009e:
            android.content.Context r0 = r8.getContext()
            boolean r0 = b1.o.E(r0)
            if (r0 == 0) goto L_0x00b5
            android.content.res.Resources r0 = r8.getResources()
            r5 = 2131100211(0x7f060233, float:1.7812797E38)
        L_0x00af:
            int r0 = r0.getDimensionPixelSize(r5)
            r8.S = r0
        L_0x00b5:
            android.widget.EditText r0 = r8.f2030g
            if (r0 == 0) goto L_0x0125
            int r0 = r8.R
            if (r0 == r2) goto L_0x00be
            goto L_0x0125
        L_0x00be:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
            r3 = r2
        L_0x00d1:
            if (r3 == 0) goto L_0x00f4
            android.widget.EditText r0 = r8.f2030g
            java.util.WeakHashMap r3 = x0.u0.f5622a
            int r3 = x0.e0.f(r0)
            android.content.res.Resources r4 = r8.getResources()
            r5 = 2131100210(0x7f060232, float:1.7812795E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.f2030g
            int r5 = x0.e0.e(r5)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131100209(0x7f060231, float:1.7812793E38)
            goto L_0x011e
        L_0x00f4:
            android.content.Context r0 = r8.getContext()
            boolean r0 = b1.o.E(r0)
            if (r0 == 0) goto L_0x0125
            android.widget.EditText r0 = r8.f2030g
            java.util.WeakHashMap r3 = x0.u0.f5622a
            int r3 = x0.e0.f(r0)
            android.content.res.Resources r4 = r8.getResources()
            r5 = 2131100208(0x7f060230, float:1.781279E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.f2030g
            int r5 = x0.e0.e(r5)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2131100207(0x7f06022f, float:1.7812789E38)
        L_0x011e:
            int r6 = r6.getDimensionPixelSize(r7)
            x0.e0.k(r0, r3, r4, r5, r6)
        L_0x0125:
            int r0 = r8.R
            if (r0 == 0) goto L_0x012c
            r8.s()
        L_0x012c:
            android.widget.EditText r0 = r8.f2030g
            boolean r3 = r0 instanceof android.widget.AutoCompleteTextView
            if (r3 != 0) goto L_0x0133
            goto L_0x014d
        L_0x0133:
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            android.graphics.drawable.Drawable r3 = r0.getDropDownBackground()
            if (r3 != 0) goto L_0x014d
            int r3 = r8.R
            if (r3 != r1) goto L_0x0144
            android.graphics.drawable.Drawable r1 = r8.getOrCreateOutlinedDropDownMenuBackground()
            goto L_0x014a
        L_0x0144:
            if (r3 != r2) goto L_0x014d
            android.graphics.drawable.Drawable r1 = r8.getOrCreateFilledDropDownMenuBackground()
        L_0x014a:
            r0.setDropDownBackgroundDrawable(r1)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.f2030g
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.f2030g
            int r1 = r1.getGravity()
            k3.b r2 = r12.f2064x0
            java.lang.CharSequence r3 = r2.A
            boolean r3 = r2.b(r3)
            r2.C = r3
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 5
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.f3917d
            if (r1 == r8) goto L_0x0047
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x0047
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x003b
            r10 = r1 & 5
            if (r10 != r5) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            goto L_0x0041
        L_0x003b:
            if (r3 == 0) goto L_0x0041
        L_0x003d:
            int r3 = r9.left
            float r3 = (float) r3
            goto L_0x004d
        L_0x0041:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.Z
            goto L_0x004c
        L_0x0047:
            float r3 = (float) r0
            float r3 = r3 / r4
            float r10 = r2.Z
            float r10 = r10 / r4
        L_0x004c:
            float r3 = r3 - r10
        L_0x004d:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.f2026d0
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x0082
            r8 = r1 & 7
            if (r8 != r7) goto L_0x0064
            goto L_0x0082
        L_0x0064:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0076
            r0 = r1 & 5
            if (r0 != r5) goto L_0x006d
            goto L_0x0076
        L_0x006d:
            boolean r0 = r2.C
            if (r0 == 0) goto L_0x0072
            goto L_0x007e
        L_0x0072:
            float r0 = r2.Z
            float r0 = r0 + r3
            goto L_0x0088
        L_0x0076:
            boolean r0 = r2.C
            if (r0 == 0) goto L_0x007e
            float r0 = r2.Z
            float r0 = r0 + r3
            goto L_0x0088
        L_0x007e:
            int r0 = r9.right
            float r0 = (float) r0
            goto L_0x0088
        L_0x0082:
            float r0 = (float) r0
            float r0 = r0 / r4
            float r1 = r2.Z
            float r1 = r1 / r4
            float r0 = r0 + r1
        L_0x0088:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e5
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            goto L_0x00e5
        L_0x00ad:
            float r0 = r10.left
            int r1 = r12.Q
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r4
            float r1 = r1 - r2
            int r2 = r12.T
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            p3.g r0 = r12.I
            s3.h r0 = (s3.h) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.n(r1, r2, r3, r4)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    public final void k(TextView textView, int i3) {
        boolean z5 = true;
        try {
            textView.setTextAppearance(i3);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z5 = false;
            }
        } catch (Exception unused) {
        }
        if (z5) {
            textView.setTextAppearance(2131755419);
            Context context = getContext();
            Object obj = n0.b.f4213a;
            textView.setTextColor(c.a(context, R.color.design_error));
        }
    }

    public final boolean l() {
        r rVar = this.f2042m;
        return rVar.f5035o == 1 && rVar.f5038r != null && !TextUtils.isEmpty(rVar.f5036p);
    }

    public final void m(Editable editable) {
        ((w) this.f2050q).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z5 = this.f2048p;
        int i3 = this.f2046o;
        String str = null;
        if (i3 == -1) {
            this.f2052r.setText(String.valueOf(length));
            this.f2052r.setContentDescription((CharSequence) null);
            this.f2048p = false;
        } else {
            this.f2048p = length > i3;
            this.f2052r.setContentDescription(getContext().getString(this.f2048p ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(length), Integer.valueOf(this.f2046o)}));
            if (z5 != this.f2048p) {
                n();
            }
            String str2 = v0.b.f5361d;
            Locale locale = Locale.getDefault();
            int i6 = l.f5378a;
            v0.b bVar = v0.k.a(locale) == 1 ? v0.b.f5364g : v0.b.f5363f;
            i1 i1Var = this.f2052r;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.f2046o)});
            if (string == null) {
                bVar.getClass();
            } else {
                str = bVar.c(string, bVar.f5367c).toString();
            }
            i1Var.setText(str);
        }
        if (this.f2030g != null && z5 != this.f2048p) {
            t(false, false);
            w();
            q();
        }
    }

    public final void n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i1 i1Var = this.f2052r;
        if (i1Var != null) {
            k(i1Var, this.f2048p ? this.f2054s : this.f2056t);
            if (!this.f2048p && (colorStateList2 = this.B) != null) {
                this.f2052r.setTextColor(colorStateList2);
            }
            if (this.f2048p && (colorStateList = this.C) != null) {
                this.f2052r.setTextColor(colorStateList);
            }
        }
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.D;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue L2 = b1.v.L(context, R.attr.colorControlActivated);
            if (L2 != null) {
                int i3 = L2.resourceId;
                if (i3 != 0) {
                    colorStateList2 = n0.b.a(context, i3);
                } else {
                    int i6 = L2.data;
                    if (i6 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i6);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f2030g;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable f6 = this.f2030g.getTextCursorDrawable();
            if ((l() || (this.f2052r != null && this.f2048p)) && (colorStateList = this.E) != null) {
                colorStateList2 = colorStateList;
            }
            r0.b.h(f6, colorStateList2);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2064x0.g(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            android.widget.EditText r7 = r6.f2030g
            if (r7 == 0) goto L_0x0207
            java.lang.ThreadLocal r8 = k3.c.f3941a
            int r8 = r7.getWidth()
            int r9 = r7.getHeight()
            android.graphics.Rect r10 = r6.f2023b0
            r11 = 0
            r10.set(r11, r11, r8, r9)
            java.lang.ThreadLocal r8 = k3.c.f3941a
            java.lang.Object r9 = r8.get()
            android.graphics.Matrix r9 = (android.graphics.Matrix) r9
            if (r9 != 0) goto L_0x002a
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            r8.set(r9)
            goto L_0x002d
        L_0x002a:
            r9.reset()
        L_0x002d:
            k3.c.a(r6, r7, r9)
            java.lang.ThreadLocal r7 = k3.c.f3942b
            java.lang.Object r8 = r7.get()
            android.graphics.RectF r8 = (android.graphics.RectF) r8
            if (r8 != 0) goto L_0x0042
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.set(r8)
        L_0x0042:
            r8.set(r10)
            r9.mapRect(r8)
            float r7 = r8.left
            r9 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r9
            int r7 = (int) r7
            float r0 = r8.top
            float r0 = r0 + r9
            int r0 = (int) r0
            float r1 = r8.right
            float r1 = r1 + r9
            int r1 = (int) r1
            float r8 = r8.bottom
            float r8 = r8 + r9
            int r8 = (int) r8
            r10.set(r7, r0, r1, r8)
            p3.g r7 = r6.M
            if (r7 == 0) goto L_0x006e
            int r8 = r10.bottom
            int r9 = r6.U
            int r9 = r8 - r9
            int r0 = r10.left
            int r1 = r10.right
            r7.setBounds(r0, r9, r1, r8)
        L_0x006e:
            p3.g r7 = r6.N
            if (r7 == 0) goto L_0x007f
            int r8 = r10.bottom
            int r9 = r6.V
            int r9 = r8 - r9
            int r0 = r10.left
            int r1 = r10.right
            r7.setBounds(r0, r9, r1, r8)
        L_0x007f:
            boolean r7 = r6.F
            if (r7 == 0) goto L_0x0207
            android.widget.EditText r7 = r6.f2030g
            float r7 = r7.getTextSize()
            k3.b r8 = r6.f2064x0
            float r9 = r8.f3923h
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0096
            r8.f3923h = r7
            r8.h(r11)
        L_0x0096:
            android.widget.EditText r7 = r6.f2030g
            int r7 = r7.getGravity()
            r9 = r7 & -113(0xffffffffffffff8f, float:NaN)
            r9 = r9 | 48
            int r0 = r8.f3922g
            if (r0 == r9) goto L_0x00a9
            r8.f3922g = r9
            r8.h(r11)
        L_0x00a9:
            int r9 = r8.f3921f
            if (r9 == r7) goto L_0x00b2
            r8.f3921f = r7
            r8.h(r11)
        L_0x00b2:
            android.widget.EditText r7 = r6.f2030g
            if (r7 == 0) goto L_0x0201
            boolean r7 = b1.o.F(r6)
            int r9 = r10.bottom
            android.graphics.Rect r0 = r6.f2024c0
            r0.bottom = r9
            int r9 = r6.R
            r1 = 1
            if (r9 == r1) goto L_0x00f3
            r2 = 2
            if (r9 == r2) goto L_0x00d5
            int r9 = r10.left
            int r9 = r6.g(r9, r7)
            r0.left = r9
            int r9 = r6.getPaddingTop()
            goto L_0x0100
        L_0x00d5:
            int r7 = r10.left
            android.widget.EditText r9 = r6.f2030g
            int r9 = r9.getPaddingLeft()
            int r9 = r9 + r7
            r0.left = r9
            int r7 = r10.top
            int r9 = r6.c()
            int r7 = r7 - r9
            r0.top = r7
            int r7 = r10.right
            android.widget.EditText r9 = r6.f2030g
            int r9 = r9.getPaddingRight()
            int r7 = r7 - r9
            goto L_0x012a
        L_0x00f3:
            int r9 = r10.left
            int r9 = r6.g(r9, r7)
            r0.left = r9
            int r9 = r10.top
            int r2 = r6.S
            int r9 = r9 + r2
        L_0x0100:
            r0.top = r9
            int r9 = r10.right
            if (r7 != 0) goto L_0x0113
            java.lang.CharSequence r2 = r6.getSuffixText()
            if (r2 == 0) goto L_0x0113
            s3.n r7 = r6.f2029f
            int r7 = r7.c()
            goto L_0x0128
        L_0x0113:
            if (r7 == 0) goto L_0x0122
            java.lang.CharSequence r7 = r6.getPrefixText()
            if (r7 == 0) goto L_0x0122
            s3.v r7 = r6.f2027e
            int r7 = r7.a()
            goto L_0x0128
        L_0x0122:
            android.widget.EditText r7 = r6.f2030g
            int r7 = r7.getCompoundPaddingRight()
        L_0x0128:
            int r7 = r9 - r7
        L_0x012a:
            r0.right = r7
            int r9 = r0.left
            int r2 = r0.top
            int r3 = r0.bottom
            android.graphics.Rect r4 = r8.f3917d
            int r5 = r4.left
            if (r5 != r9) goto L_0x0146
            int r5 = r4.top
            if (r5 != r2) goto L_0x0146
            int r5 = r4.right
            if (r5 != r7) goto L_0x0146
            int r5 = r4.bottom
            if (r5 != r3) goto L_0x0146
            r5 = r1
            goto L_0x0147
        L_0x0146:
            r5 = r11
        L_0x0147:
            if (r5 != 0) goto L_0x014e
            r4.set(r9, r2, r7, r3)
            r8.M = r1
        L_0x014e:
            android.widget.EditText r7 = r6.f2030g
            if (r7 == 0) goto L_0x01fb
            android.text.TextPaint r7 = r8.O
            float r9 = r8.f3923h
            r7.setTextSize(r9)
            android.graphics.Typeface r9 = r8.f3936u
            r7.setTypeface(r9)
            float r9 = r8.W
            r7.setLetterSpacing(r9)
            float r7 = r7.ascent()
            float r7 = -r7
            int r9 = r10.left
            android.widget.EditText r2 = r6.f2030g
            int r2 = r2.getCompoundPaddingLeft()
            int r2 = r2 + r9
            r0.left = r2
            int r9 = r6.R
            if (r9 != r1) goto L_0x0181
            android.widget.EditText r9 = r6.f2030g
            int r9 = r9.getMinLines()
            if (r9 > r1) goto L_0x0181
            r9 = r1
            goto L_0x0182
        L_0x0181:
            r9 = r11
        L_0x0182:
            if (r9 == 0) goto L_0x0190
            int r9 = r10.centerY()
            float r9 = (float) r9
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r7 / r2
            float r9 = r9 - r2
            int r9 = (int) r9
            goto L_0x0199
        L_0x0190:
            int r9 = r10.top
            android.widget.EditText r2 = r6.f2030g
            int r2 = r2.getCompoundPaddingTop()
            int r9 = r9 + r2
        L_0x0199:
            r0.top = r9
            int r9 = r10.right
            android.widget.EditText r2 = r6.f2030g
            int r2 = r2.getCompoundPaddingRight()
            int r9 = r9 - r2
            r0.right = r9
            int r9 = r6.R
            if (r9 != r1) goto L_0x01b4
            android.widget.EditText r9 = r6.f2030g
            int r9 = r9.getMinLines()
            if (r9 > r1) goto L_0x01b4
            r9 = r1
            goto L_0x01b5
        L_0x01b4:
            r9 = r11
        L_0x01b5:
            if (r9 == 0) goto L_0x01bd
            int r9 = r0.top
            float r9 = (float) r9
            float r9 = r9 + r7
            int r7 = (int) r9
            goto L_0x01c6
        L_0x01bd:
            int r7 = r10.bottom
            android.widget.EditText r9 = r6.f2030g
            int r9 = r9.getCompoundPaddingBottom()
            int r7 = r7 - r9
        L_0x01c6:
            r0.bottom = r7
            int r9 = r0.left
            int r10 = r0.top
            int r0 = r0.right
            android.graphics.Rect r2 = r8.f3915c
            int r3 = r2.left
            if (r3 != r9) goto L_0x01e2
            int r3 = r2.top
            if (r3 != r10) goto L_0x01e2
            int r3 = r2.right
            if (r3 != r0) goto L_0x01e2
            int r3 = r2.bottom
            if (r3 != r7) goto L_0x01e2
            r3 = r1
            goto L_0x01e3
        L_0x01e2:
            r3 = r11
        L_0x01e3:
            if (r3 != 0) goto L_0x01ea
            r2.set(r9, r10, r0, r7)
            r8.M = r1
        L_0x01ea:
            r8.h(r11)
            boolean r7 = r6.e()
            if (r7 == 0) goto L_0x0207
            boolean r7 = r6.f2062w0
            if (r7 != 0) goto L_0x0207
            r6.i()
            goto L_0x0207
        L_0x01fb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x0201:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i3, int i6) {
        boolean z5;
        EditText editText;
        int max;
        super.onMeasure(i3, i6);
        EditText editText2 = this.f2030g;
        n nVar = this.f2029f;
        if (editText2 != null && this.f2030g.getMeasuredHeight() < (max = Math.max(nVar.getMeasuredHeight(), this.f2027e.getMeasuredHeight()))) {
            this.f2030g.setMinimumHeight(max);
            z5 = true;
        } else {
            z5 = false;
        }
        boolean p2 = p();
        if (z5 || p2) {
            this.f2030g.post(new x(this, 1));
        }
        if (!(this.w == null || (editText = this.f2030g) == null)) {
            this.w.setGravity(editText.getGravity());
            this.w.setPadding(this.f2030g.getCompoundPaddingLeft(), this.f2030g.getCompoundPaddingTop(), this.f2030g.getCompoundPaddingRight(), this.f2030g.getCompoundPaddingBottom());
        }
        nVar.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        super.onRestoreInstanceState(a0Var.f2483d);
        setError(a0Var.f4954f);
        if (a0Var.f4955g) {
            post(new x(this, 0));
        }
        requestLayout();
    }

    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        boolean z5 = true;
        if (i3 != 1) {
            z5 = false;
        }
        if (z5 != this.P) {
            p3.c cVar = this.O.f4805e;
            RectF rectF = this.f2026d0;
            float a6 = cVar.a(rectF);
            float a7 = this.O.f4806f.a(rectF);
            float a8 = this.O.f4808h.a(rectF);
            float a9 = this.O.f4807g.a(rectF);
            k kVar = this.O;
            d dVar = kVar.f4801a;
            j jVar = new j();
            d dVar2 = kVar.f4802b;
            jVar.f4789a = dVar2;
            j.b(dVar2);
            jVar.f4790b = dVar;
            j.b(dVar);
            d dVar3 = kVar.f4803c;
            jVar.f4792d = dVar3;
            j.b(dVar3);
            d dVar4 = kVar.f4804d;
            jVar.f4791c = dVar4;
            j.b(dVar4);
            jVar.f4793e = new p3.a(a7);
            jVar.f4794f = new p3.a(a6);
            jVar.f4796h = new p3.a(a9);
            jVar.f4795g = new p3.a(a8);
            k kVar2 = new k(jVar);
            this.P = z5;
            setShapeAppearanceModel(kVar2);
        }
    }

    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        if (l()) {
            a0Var.f4954f = getError();
        }
        n nVar = this.f2029f;
        boolean z5 = true;
        if (!(nVar.f4998l != 0) || !nVar.f4996j.isChecked()) {
            z5 = false;
        }
        a0Var.f4955g = z5;
        return a0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
        if (r3.d() != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r3.f5005s != null) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f2030g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            s3.v r3 = r10.f2027e
            if (r0 != 0) goto L_0x001f
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001f:
            int r0 = r3.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r4 = 2
            r5 = 0
            r6 = 3
            if (r0 == 0) goto L_0x0064
            int r0 = r3.getMeasuredWidth()
            android.widget.EditText r3 = r10.f2030g
            int r3 = r3.getPaddingLeft()
            int r0 = r0 - r3
            android.graphics.drawable.ColorDrawable r3 = r10.f0
            if (r3 == 0) goto L_0x0040
            int r3 = r10.f2031g0
            if (r3 == r0) goto L_0x004c
        L_0x0040:
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>()
            r10.f0 = r3
            r10.f2031g0 = r0
            r3.setBounds(r1, r1, r0, r2)
        L_0x004c:
            android.widget.EditText r0 = r10.f2030g
            android.graphics.drawable.Drawable[] r0 = b1.q.a(r0)
            r3 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f0
            if (r3 == r7) goto L_0x007d
            android.widget.EditText r3 = r10.f2030g
            r8 = r0[r2]
            r9 = r0[r4]
            r0 = r0[r6]
            b1.q.e(r3, r7, r8, r9, r0)
            goto L_0x007b
        L_0x0064:
            android.graphics.drawable.ColorDrawable r0 = r10.f0
            if (r0 == 0) goto L_0x007d
            android.widget.EditText r0 = r10.f2030g
            android.graphics.drawable.Drawable[] r0 = b1.q.a(r0)
            android.widget.EditText r3 = r10.f2030g
            r7 = r0[r2]
            r8 = r0[r4]
            r0 = r0[r6]
            b1.q.e(r3, r5, r7, r8, r0)
            r10.f0 = r5
        L_0x007b:
            r0 = r2
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            s3.n r3 = r10.f2029f
            boolean r7 = r3.e()
            if (r7 != 0) goto L_0x0099
            int r7 = r3.f4998l
            if (r7 == 0) goto L_0x008c
            r7 = r2
            goto L_0x008d
        L_0x008c:
            r7 = r1
        L_0x008d:
            if (r7 == 0) goto L_0x0095
            boolean r7 = r3.d()
            if (r7 != 0) goto L_0x0099
        L_0x0095:
            java.lang.CharSequence r7 = r3.f5005s
            if (r7 == 0) goto L_0x00a1
        L_0x0099:
            int r7 = r3.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00a1
            r7 = r2
            goto L_0x00a2
        L_0x00a1:
            r7 = r1
        L_0x00a2:
            if (r7 == 0) goto L_0x0120
            androidx.appcompat.widget.i1 r7 = r3.f5006t
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.f2030g
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r3.e()
            if (r8 == 0) goto L_0x00ba
            com.google.android.material.internal.CheckableImageButton r5 = r3.f4992f
            goto L_0x00cb
        L_0x00ba:
            int r8 = r3.f4998l
            if (r8 == 0) goto L_0x00c0
            r8 = r2
            goto L_0x00c1
        L_0x00c0:
            r8 = r1
        L_0x00c1:
            if (r8 == 0) goto L_0x00cb
            boolean r8 = r3.d()
            if (r8 == 0) goto L_0x00cb
            com.google.android.material.internal.CheckableImageButton r5 = r3.f4996j
        L_0x00cb:
            if (r5 == 0) goto L_0x00de
            int r3 = r5.getMeasuredWidth()
            int r3 = r3 + r7
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r5 = x0.m.c(r5)
            int r7 = r5 + r3
        L_0x00de:
            android.widget.EditText r3 = r10.f2030g
            android.graphics.drawable.Drawable[] r3 = b1.q.a(r3)
            android.graphics.drawable.ColorDrawable r5 = r10.f2035i0
            if (r5 == 0) goto L_0x00fc
            int r8 = r10.f2037j0
            if (r8 == r7) goto L_0x00fc
            r10.f2037j0 = r7
            r5.setBounds(r1, r1, r7, r2)
            android.widget.EditText r0 = r10.f2030g
            r1 = r3[r1]
            r4 = r3[r2]
            android.graphics.drawable.ColorDrawable r5 = r10.f2035i0
            r3 = r3[r6]
            goto L_0x011a
        L_0x00fc:
            if (r5 != 0) goto L_0x010a
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>()
            r10.f2035i0 = r5
            r10.f2037j0 = r7
            r5.setBounds(r1, r1, r7, r2)
        L_0x010a:
            r4 = r3[r4]
            android.graphics.drawable.ColorDrawable r5 = r10.f2035i0
            if (r4 == r5) goto L_0x011e
            r10.f2039k0 = r4
            android.widget.EditText r0 = r10.f2030g
            r1 = r3[r1]
            r4 = r3[r2]
            r3 = r3[r6]
        L_0x011a:
            b1.q.e(r0, r1, r4, r5, r3)
            goto L_0x0141
        L_0x011e:
            r2 = r0
            goto L_0x0141
        L_0x0120:
            android.graphics.drawable.ColorDrawable r3 = r10.f2035i0
            if (r3 == 0) goto L_0x0142
            android.widget.EditText r3 = r10.f2030g
            android.graphics.drawable.Drawable[] r3 = b1.q.a(r3)
            r4 = r3[r4]
            android.graphics.drawable.ColorDrawable r7 = r10.f2035i0
            if (r4 != r7) goto L_0x013e
            android.widget.EditText r0 = r10.f2030g
            r1 = r3[r1]
            r4 = r3[r2]
            android.graphics.drawable.Drawable r7 = r10.f2039k0
            r3 = r3[r6]
            b1.q.e(r0, r1, r4, r7, r3)
            goto L_0x013f
        L_0x013e:
            r2 = r0
        L_0x013f:
            r10.f2035i0 = r5
        L_0x0141:
            r0 = r2
        L_0x0142:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        int i3;
        i1 i1Var;
        EditText editText = this.f2030g;
        if (editText != null && this.R == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = v1.f812a;
            Drawable mutate = background.mutate();
            if (l()) {
                i3 = getErrorCurrentTextColors();
            } else if (!this.f2048p || (i1Var = this.f2052r) == null) {
                mutate.clearColorFilter();
                this.f2030g.refreshDrawableState();
                return;
            } else {
                i3 = i1Var.getCurrentTextColor();
            }
            mutate.setColorFilter(androidx.appcompat.widget.x.c(i3, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void r() {
        EditText editText = this.f2030g;
        if (editText != null && this.I != null) {
            if ((this.L || editText.getBackground() == null) && this.R != 0) {
                EditText editText2 = this.f2030g;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap weakHashMap = u0.f5622a;
                d0.q(editText2, editTextBoxBackground);
                this.L = true;
            }
        }
    }

    public final void s() {
        if (this.R != 1) {
            FrameLayout frameLayout = this.f2025d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c6 = c();
            if (c6 != layoutParams.topMargin) {
                layoutParams.topMargin = c6;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i3) {
        if (this.f2022a0 != i3) {
            this.f2022a0 = i3;
            this.f2053r0 = i3;
            this.f2057t0 = i3;
            this.f2059u0 = i3;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i3) {
        Context context = getContext();
        Object obj = n0.b.f4213a;
        setBoxBackgroundColor(c.a(context, i3));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2053r0 = defaultColor;
        this.f2022a0 = defaultColor;
        this.f2055s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2057t0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f2059u0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i3) {
        if (i3 != this.R) {
            this.R = i3;
            if (this.f2030g != null) {
                h();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i3) {
        this.S = i3;
    }

    public void setBoxCornerFamily(int i3) {
        k kVar = this.O;
        kVar.getClass();
        j jVar = new j(kVar);
        p3.c cVar = this.O.f4805e;
        d i6 = com.bumptech.glide.c.i(i3);
        jVar.f4789a = i6;
        j.b(i6);
        jVar.f4793e = cVar;
        p3.c cVar2 = this.O.f4806f;
        d i7 = com.bumptech.glide.c.i(i3);
        jVar.f4790b = i7;
        j.b(i7);
        jVar.f4794f = cVar2;
        p3.c cVar3 = this.O.f4808h;
        d i8 = com.bumptech.glide.c.i(i3);
        jVar.f4792d = i8;
        j.b(i8);
        jVar.f4796h = cVar3;
        p3.c cVar4 = this.O.f4807g;
        d i9 = com.bumptech.glide.c.i(i3);
        jVar.f4791c = i9;
        j.b(i9);
        jVar.f4795g = cVar4;
        this.O = new k(jVar);
        b();
    }

    public void setBoxStrokeColor(int i3) {
        if (this.f2049p0 != i3) {
            this.f2049p0 = i3;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f2045n0 = colorStateList.getDefaultColor();
            this.f2061v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2047o0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f2049p0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            w();
        }
        this.f2049p0 = defaultColor;
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2051q0 != colorStateList) {
            this.f2051q0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i3) {
        this.U = i3;
        w();
    }

    public void setBoxStrokeWidthFocused(int i3) {
        this.V = i3;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i3) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i3));
    }

    public void setBoxStrokeWidthResource(int i3) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i3));
    }

    public void setCounterEnabled(boolean z5) {
        if (this.f2044n != z5) {
            Editable editable = null;
            r rVar = this.f2042m;
            if (z5) {
                i1 i1Var = new i1(getContext(), (AttributeSet) null);
                this.f2052r = i1Var;
                i1Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f2028e0;
                if (typeface != null) {
                    this.f2052r.setTypeface(typeface);
                }
                this.f2052r.setMaxLines(1);
                rVar.a(this.f2052r, 2);
                x0.m.h((ViewGroup.MarginLayoutParams) this.f2052r.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                n();
                if (this.f2052r != null) {
                    EditText editText = this.f2030g;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    m(editable);
                }
            } else {
                rVar.g(this.f2052r, 2);
                this.f2052r = null;
            }
            this.f2044n = z5;
        }
    }

    public void setCounterMaxLength(int i3) {
        if (this.f2046o != i3) {
            if (i3 <= 0) {
                i3 = -1;
            }
            this.f2046o = i3;
            if (this.f2044n && this.f2052r != null) {
                EditText editText = this.f2030g;
                m(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i3) {
        if (this.f2054s != i3) {
            this.f2054s = i3;
            n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            n();
        }
    }

    public void setCounterTextAppearance(int i3) {
        if (this.f2056t != i3) {
            this.f2056t = i3;
            n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            n();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            o();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (l() || (this.f2052r != null && this.f2048p)) {
                o();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2041l0 = colorStateList;
        this.f2043m0 = colorStateList;
        if (this.f2030g != null) {
            t(false, false);
        }
    }

    public void setEnabled(boolean z5) {
        j(this, z5);
        super.setEnabled(z5);
    }

    public void setEndIconActivated(boolean z5) {
        this.f2029f.f4996j.setActivated(z5);
    }

    public void setEndIconCheckable(boolean z5) {
        this.f2029f.f4996j.setCheckable(z5);
    }

    public void setEndIconContentDescription(int i3) {
        n nVar = this.f2029f;
        CharSequence text = i3 != 0 ? nVar.getResources().getText(i3) : null;
        CheckableImageButton checkableImageButton = nVar.f4996j;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i3) {
        n nVar = this.f2029f;
        Drawable n5 = i3 != 0 ? p.n(nVar.getContext(), i3) : null;
        CheckableImageButton checkableImageButton = nVar.f4996j;
        checkableImageButton.setImageDrawable(n5);
        if (n5 != null) {
            ColorStateList colorStateList = nVar.f5000n;
            PorterDuff.Mode mode = nVar.f5001o;
            TextInputLayout textInputLayout = nVar.f4990d;
            o.b(textInputLayout, checkableImageButton, colorStateList, mode);
            o.S(textInputLayout, checkableImageButton, nVar.f5000n);
        }
    }

    public void setEndIconMinSize(int i3) {
        n nVar = this.f2029f;
        if (i3 < 0) {
            nVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i3 != nVar.f5002p) {
            nVar.f5002p = i3;
            CheckableImageButton checkableImageButton = nVar.f4996j;
            checkableImageButton.setMinimumWidth(i3);
            checkableImageButton.setMinimumHeight(i3);
            CheckableImageButton checkableImageButton2 = nVar.f4992f;
            checkableImageButton2.setMinimumWidth(i3);
            checkableImageButton2.setMinimumHeight(i3);
        }
    }

    public void setEndIconMode(int i3) {
        this.f2029f.g(i3);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f2029f;
        View.OnLongClickListener onLongClickListener = nVar.f5004r;
        CheckableImageButton checkableImageButton = nVar.f4996j;
        checkableImageButton.setOnClickListener(onClickListener);
        o.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f2029f;
        nVar.f5004r = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f4996j;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.W(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        n nVar = this.f2029f;
        nVar.f5003q = scaleType;
        nVar.f4996j.setScaleType(scaleType);
        nVar.f4992f.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n nVar = this.f2029f;
        if (nVar.f5000n != colorStateList) {
            nVar.f5000n = colorStateList;
            o.b(nVar.f4990d, nVar.f4996j, colorStateList, nVar.f5001o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f2029f;
        if (nVar.f5001o != mode) {
            nVar.f5001o = mode;
            o.b(nVar.f4990d, nVar.f4996j, nVar.f5000n, mode);
        }
    }

    public void setEndIconVisible(boolean z5) {
        this.f2029f.h(z5);
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.f2042m;
        if (!rVar.f5037q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            rVar.c();
            rVar.f5036p = charSequence;
            rVar.f5038r.setText(charSequence);
            int i3 = rVar.f5034n;
            if (i3 != 1) {
                rVar.f5035o = 1;
            }
            rVar.i(i3, rVar.f5035o, rVar.h(rVar.f5038r, charSequence));
            return;
        }
        rVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i3) {
        r rVar = this.f2042m;
        rVar.f5040t = i3;
        i1 i1Var = rVar.f5038r;
        if (i1Var != null) {
            WeakHashMap weakHashMap = u0.f5622a;
            g0.f(i1Var, i3);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.f2042m;
        rVar.f5039s = charSequence;
        i1 i1Var = rVar.f5038r;
        if (i1Var != null) {
            i1Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z5) {
        r rVar = this.f2042m;
        if (rVar.f5037q != z5) {
            rVar.c();
            TextInputLayout textInputLayout = rVar.f5028h;
            if (z5) {
                i1 i1Var = new i1(rVar.f5027g, (AttributeSet) null);
                rVar.f5038r = i1Var;
                i1Var.setId(R.id.textinput_error);
                rVar.f5038r.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f5038r.setTypeface(typeface);
                }
                int i3 = rVar.f5041u;
                rVar.f5041u = i3;
                i1 i1Var2 = rVar.f5038r;
                if (i1Var2 != null) {
                    textInputLayout.k(i1Var2, i3);
                }
                ColorStateList colorStateList = rVar.f5042v;
                rVar.f5042v = colorStateList;
                i1 i1Var3 = rVar.f5038r;
                if (!(i1Var3 == null || colorStateList == null)) {
                    i1Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = rVar.f5039s;
                rVar.f5039s = charSequence;
                i1 i1Var4 = rVar.f5038r;
                if (i1Var4 != null) {
                    i1Var4.setContentDescription(charSequence);
                }
                int i6 = rVar.f5040t;
                rVar.f5040t = i6;
                i1 i1Var5 = rVar.f5038r;
                if (i1Var5 != null) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    g0.f(i1Var5, i6);
                }
                rVar.f5038r.setVisibility(4);
                rVar.a(rVar.f5038r, 0);
            } else {
                rVar.f();
                rVar.g(rVar.f5038r, 0);
                rVar.f5038r = null;
                textInputLayout.q();
                textInputLayout.w();
            }
            rVar.f5037q = z5;
        }
    }

    public void setErrorIconDrawable(int i3) {
        n nVar = this.f2029f;
        nVar.i(i3 != 0 ? p.n(nVar.getContext(), i3) : null);
        o.S(nVar.f4990d, nVar.f4992f, nVar.f4993g);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f2029f;
        CheckableImageButton checkableImageButton = nVar.f4992f;
        View.OnLongClickListener onLongClickListener = nVar.f4995i;
        checkableImageButton.setOnClickListener(onClickListener);
        o.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f2029f;
        nVar.f4995i = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f4992f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.W(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n nVar = this.f2029f;
        if (nVar.f4993g != colorStateList) {
            nVar.f4993g = colorStateList;
            o.b(nVar.f4990d, nVar.f4992f, colorStateList, nVar.f4994h);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f2029f;
        if (nVar.f4994h != mode) {
            nVar.f4994h = mode;
            o.b(nVar.f4990d, nVar.f4992f, nVar.f4993g, mode);
        }
    }

    public void setErrorTextAppearance(int i3) {
        r rVar = this.f2042m;
        rVar.f5041u = i3;
        i1 i1Var = rVar.f5038r;
        if (i1Var != null) {
            rVar.f5028h.k(i1Var, i3);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.f2042m;
        rVar.f5042v = colorStateList;
        i1 i1Var = rVar.f5038r;
        if (i1Var != null && colorStateList != null) {
            i1Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z5) {
        if (this.f2066y0 != z5) {
            this.f2066y0 = z5;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.f2042m;
        if (!isEmpty) {
            if (!rVar.f5043x) {
                setHelperTextEnabled(true);
            }
            rVar.c();
            rVar.w = charSequence;
            rVar.f5044y.setText(charSequence);
            int i3 = rVar.f5034n;
            if (i3 != 2) {
                rVar.f5035o = 2;
            }
            rVar.i(i3, rVar.f5035o, rVar.h(rVar.f5044y, charSequence));
        } else if (rVar.f5043x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.f2042m;
        rVar.A = colorStateList;
        i1 i1Var = rVar.f5044y;
        if (i1Var != null && colorStateList != null) {
            i1Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z5) {
        r rVar = this.f2042m;
        if (rVar.f5043x != z5) {
            rVar.c();
            if (z5) {
                i1 i1Var = new i1(rVar.f5027g, (AttributeSet) null);
                rVar.f5044y = i1Var;
                i1Var.setId(R.id.textinput_helper_text);
                rVar.f5044y.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f5044y.setTypeface(typeface);
                }
                rVar.f5044y.setVisibility(4);
                g0.f(rVar.f5044y, 1);
                int i3 = rVar.f5045z;
                rVar.f5045z = i3;
                i1 i1Var2 = rVar.f5044y;
                if (i1Var2 != null) {
                    i1Var2.setTextAppearance(i3);
                }
                ColorStateList colorStateList = rVar.A;
                rVar.A = colorStateList;
                i1 i1Var3 = rVar.f5044y;
                if (!(i1Var3 == null || colorStateList == null)) {
                    i1Var3.setTextColor(colorStateList);
                }
                rVar.a(rVar.f5044y, 1);
                rVar.f5044y.setAccessibilityDelegate(new q(rVar));
            } else {
                rVar.c();
                int i6 = rVar.f5034n;
                if (i6 == 2) {
                    rVar.f5035o = 0;
                }
                rVar.i(i6, rVar.f5035o, rVar.h(rVar.f5044y, ""));
                rVar.g(rVar.f5044y, 1);
                rVar.f5044y = null;
                TextInputLayout textInputLayout = rVar.f5028h;
                textInputLayout.q();
                textInputLayout.w();
            }
            rVar.f5043x = z5;
        }
    }

    public void setHelperTextTextAppearance(int i3) {
        r rVar = this.f2042m;
        rVar.f5045z = i3;
        i1 i1Var = rVar.f5044y;
        if (i1Var != null) {
            i1Var.setTextAppearance(i3);
        }
    }

    public void setHint(int i3) {
        setHint(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setHintAnimationEnabled(boolean z5) {
        this.f2068z0 = z5;
    }

    public void setHintEnabled(boolean z5) {
        if (z5 != this.F) {
            this.F = z5;
            if (!z5) {
                this.H = false;
                if (!TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.f2030g.getHint())) {
                    this.f2030g.setHint(this.G);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f2030g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.G)) {
                        setHint(hint);
                    }
                    this.f2030g.setHint((CharSequence) null);
                }
                this.H = true;
            }
            if (this.f2030g != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i3) {
        b bVar = this.f2064x0;
        View view = bVar.f3911a;
        m3.d dVar = new m3.d(view.getContext(), i3);
        ColorStateList colorStateList = dVar.f4203j;
        if (colorStateList != null) {
            bVar.f3926k = colorStateList;
        }
        float f6 = dVar.f4204k;
        if (f6 != 0.0f) {
            bVar.f3924i = f6;
        }
        ColorStateList colorStateList2 = dVar.f4194a;
        if (colorStateList2 != null) {
            bVar.U = colorStateList2;
        }
        bVar.S = dVar.f4198e;
        bVar.T = dVar.f4199f;
        bVar.R = dVar.f4200g;
        bVar.V = dVar.f4202i;
        m3.a aVar = bVar.f3939y;
        if (aVar != null) {
            aVar.f4187i = true;
        }
        e2.f fVar = new e2.f(12, bVar);
        dVar.a();
        bVar.f3939y = new m3.a(fVar, dVar.f4207n);
        dVar.c(view.getContext(), bVar.f3939y);
        bVar.h(false);
        this.f2043m0 = bVar.f3926k;
        if (this.f2030g != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2043m0 != colorStateList) {
            if (this.f2041l0 == null) {
                b bVar = this.f2064x0;
                if (bVar.f3926k != colorStateList) {
                    bVar.f3926k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2043m0 = colorStateList;
            if (this.f2030g != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(z zVar) {
        this.f2050q = zVar;
    }

    public void setMaxEms(int i3) {
        this.f2036j = i3;
        EditText editText = this.f2030g;
        if (editText != null && i3 != -1) {
            editText.setMaxEms(i3);
        }
    }

    public void setMaxWidth(int i3) {
        this.f2040l = i3;
        EditText editText = this.f2030g;
        if (editText != null && i3 != -1) {
            editText.setMaxWidth(i3);
        }
    }

    public void setMaxWidthResource(int i3) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    public void setMinEms(int i3) {
        this.f2034i = i3;
        EditText editText = this.f2030g;
        if (editText != null && i3 != -1) {
            editText.setMinEms(i3);
        }
    }

    public void setMinWidth(int i3) {
        this.f2038k = i3;
        EditText editText = this.f2030g;
        if (editText != null && i3 != -1) {
            editText.setMinWidth(i3);
        }
    }

    public void setMinWidthResource(int i3) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i3) {
        n nVar = this.f2029f;
        nVar.f4996j.setContentDescription(i3 != 0 ? nVar.getResources().getText(i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i3) {
        n nVar = this.f2029f;
        nVar.f4996j.setImageDrawable(i3 != 0 ? p.n(nVar.getContext(), i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        n nVar = this.f2029f;
        if (z5 && nVar.f4998l != 1) {
            nVar.g(1);
        } else if (!z5) {
            nVar.g(0);
        } else {
            nVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n nVar = this.f2029f;
        nVar.f5000n = colorStateList;
        o.b(nVar.f4990d, nVar.f4996j, colorStateList, nVar.f5001o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n nVar = this.f2029f;
        nVar.f5001o = mode;
        o.b(nVar.f4990d, nVar.f4996j, nVar.f5000n, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.w == null) {
            i1 i1Var = new i1(getContext(), (AttributeSet) null);
            this.w = i1Var;
            i1Var.setId(R.id.textinput_placeholder);
            d0.s(this.w, 2);
            i d6 = d();
            this.f2067z = d6;
            d6.f5143e = 67;
            this.A = d();
            setPlaceholderTextAppearance(this.f2065y);
            setPlaceholderTextColor(this.f2063x);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2060v) {
                setPlaceholderTextEnabled(true);
            }
            this.f2058u = charSequence;
        }
        EditText editText = this.f2030g;
        if (editText != null) {
            editable = editText.getText();
        }
        u(editable);
    }

    public void setPlaceholderTextAppearance(int i3) {
        this.f2065y = i3;
        i1 i1Var = this.w;
        if (i1Var != null) {
            i1Var.setTextAppearance(i3);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2063x != colorStateList) {
            this.f2063x = colorStateList;
            i1 i1Var = this.w;
            if (i1Var != null && colorStateList != null) {
                i1Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.f2027e;
        vVar.getClass();
        vVar.f5062f = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.f5061e.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i3) {
        this.f2027e.f5061e.setTextAppearance(i3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2027e.f5061e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.I;
        if (gVar != null && gVar.f4767d.f4745a != kVar) {
            this.O = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z5) {
        this.f2027e.f5063g.setCheckable(z5);
    }

    public void setStartIconContentDescription(int i3) {
        setStartIconContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setStartIconDrawable(int i3) {
        setStartIconDrawable(i3 != 0 ? p.n(getContext(), i3) : null);
    }

    public void setStartIconMinSize(int i3) {
        v vVar = this.f2027e;
        if (i3 < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i3 != vVar.f5066j) {
            vVar.f5066j = i3;
            CheckableImageButton checkableImageButton = vVar.f5063g;
            checkableImageButton.setMinimumWidth(i3);
            checkableImageButton.setMinimumHeight(i3);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f2027e;
        View.OnLongClickListener onLongClickListener = vVar.f5068l;
        CheckableImageButton checkableImageButton = vVar.f5063g;
        checkableImageButton.setOnClickListener(onClickListener);
        o.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f2027e;
        vVar.f5068l = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f5063g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.W(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f2027e;
        vVar.f5067k = scaleType;
        vVar.f5063g.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f2027e;
        if (vVar.f5064h != colorStateList) {
            vVar.f5064h = colorStateList;
            o.b(vVar.f5060d, vVar.f5063g, colorStateList, vVar.f5065i);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f2027e;
        if (vVar.f5065i != mode) {
            vVar.f5065i = mode;
            o.b(vVar.f5060d, vVar.f5063g, vVar.f5064h, mode);
        }
    }

    public void setStartIconVisible(boolean z5) {
        this.f2027e.c(z5);
    }

    public void setSuffixText(CharSequence charSequence) {
        n nVar = this.f2029f;
        nVar.getClass();
        nVar.f5005s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        nVar.f5006t.setText(charSequence);
        nVar.n();
    }

    public void setSuffixTextAppearance(int i3) {
        this.f2029f.f5006t.setTextAppearance(i3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2029f.f5006t.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(y yVar) {
        EditText editText = this.f2030g;
        if (editText != null) {
            u0.l(editText, yVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2028e0) {
            this.f2028e0 = typeface;
            this.f2064x0.m(typeface);
            r rVar = this.f2042m;
            if (typeface != rVar.B) {
                rVar.B = typeface;
                i1 i1Var = rVar.f5038r;
                if (i1Var != null) {
                    i1Var.setTypeface(typeface);
                }
                i1 i1Var2 = rVar.f5044y;
                if (i1Var2 != null) {
                    i1Var2.setTypeface(typeface);
                }
            }
            i1 i1Var3 = this.f2052r;
            if (i1Var3 != null) {
                i1Var3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(boolean r10, boolean r11) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            android.widget.EditText r1 = r9.f2030g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            android.widget.EditText r4 = r9.f2030g
            if (r4 == 0) goto L_0x0023
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x0023
            r4 = r2
            goto L_0x0024
        L_0x0023:
            r4 = r3
        L_0x0024:
            android.content.res.ColorStateList r5 = r9.f2041l0
            k3.b r6 = r9.f2064x0
            if (r5 == 0) goto L_0x002d
            r6.i(r5)
        L_0x002d:
            r5 = 0
            if (r0 != 0) goto L_0x0049
            android.content.res.ColorStateList r0 = r9.f2041l0
            if (r0 == 0) goto L_0x0042
            int[] r7 = new int[r2]
            r8 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r7[r3] = r8
            int r8 = r9.f2061v0
            int r0 = r0.getColorForState(r7, r8)
            goto L_0x0044
        L_0x0042:
            int r0 = r9.f2061v0
        L_0x0044:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x0068
        L_0x0049:
            boolean r0 = r9.l()
            if (r0 == 0) goto L_0x005c
            s3.r r0 = r9.f2042m
            androidx.appcompat.widget.i1 r0 = r0.f5038r
            if (r0 == 0) goto L_0x005a
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x0068
        L_0x005a:
            r0 = r5
            goto L_0x0068
        L_0x005c:
            boolean r0 = r9.f2048p
            if (r0 == 0) goto L_0x006c
            androidx.appcompat.widget.i1 r0 = r9.f2052r
            if (r0 == 0) goto L_0x006c
            android.content.res.ColorStateList r0 = r0.getTextColors()
        L_0x0068:
            r6.i(r0)
            goto L_0x007b
        L_0x006c:
            if (r4 == 0) goto L_0x007b
            android.content.res.ColorStateList r0 = r9.f2043m0
            if (r0 == 0) goto L_0x007b
            android.content.res.ColorStateList r7 = r6.f3926k
            if (r7 == r0) goto L_0x007b
            r6.f3926k = r0
            r6.h(r3)
        L_0x007b:
            s3.n r0 = r9.f2029f
            s3.v r7 = r9.f2027e
            if (r1 != 0) goto L_0x00f8
            boolean r1 = r9.f2066y0
            if (r1 == 0) goto L_0x00f8
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L_0x008e
            if (r4 == 0) goto L_0x008e
            goto L_0x00f8
        L_0x008e:
            if (r11 != 0) goto L_0x0094
            boolean r11 = r9.f2062w0
            if (r11 != 0) goto L_0x013d
        L_0x0094:
            android.animation.ValueAnimator r11 = r9.A0
            if (r11 == 0) goto L_0x00a3
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto L_0x00a3
            android.animation.ValueAnimator r11 = r9.A0
            r11.cancel()
        L_0x00a3:
            r11 = 0
            if (r10 == 0) goto L_0x00ae
            boolean r10 = r9.f2068z0
            if (r10 == 0) goto L_0x00ae
            r9.a(r11)
            goto L_0x00b1
        L_0x00ae:
            r6.k(r11)
        L_0x00b1:
            boolean r10 = r9.e()
            if (r10 == 0) goto L_0x00d3
            p3.g r10 = r9.I
            s3.h r10 = (s3.h) r10
            s3.f r10 = r10.A
            android.graphics.RectF r10 = r10.f4970v
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x00d3
            boolean r10 = r9.e()
            if (r10 == 0) goto L_0x00d3
            p3.g r10 = r9.I
            s3.h r10 = (s3.h) r10
            r10.n(r11, r11, r11, r11)
        L_0x00d3:
            r9.f2062w0 = r2
            androidx.appcompat.widget.i1 r10 = r9.w
            if (r10 == 0) goto L_0x00ed
            boolean r11 = r9.f2060v
            if (r11 == 0) goto L_0x00ed
            r10.setText(r5)
            android.widget.FrameLayout r10 = r9.f2025d
            t1.i r11 = r9.A
            t1.s.a(r10, r11)
            androidx.appcompat.widget.i1 r10 = r9.w
            r11 = 4
            r10.setVisibility(r11)
        L_0x00ed:
            r7.f5069m = r2
            r7.e()
            r0.f5007u = r2
            r0.n()
            goto L_0x013d
        L_0x00f8:
            if (r11 != 0) goto L_0x00fe
            boolean r11 = r9.f2062w0
            if (r11 == 0) goto L_0x013d
        L_0x00fe:
            android.animation.ValueAnimator r11 = r9.A0
            if (r11 == 0) goto L_0x010d
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto L_0x010d
            android.animation.ValueAnimator r11 = r9.A0
            r11.cancel()
        L_0x010d:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x0119
            boolean r10 = r9.f2068z0
            if (r10 == 0) goto L_0x0119
            r9.a(r11)
            goto L_0x011c
        L_0x0119:
            r6.k(r11)
        L_0x011c:
            r9.f2062w0 = r3
            boolean r10 = r9.e()
            if (r10 == 0) goto L_0x0127
            r9.i()
        L_0x0127:
            android.widget.EditText r10 = r9.f2030g
            if (r10 != 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            android.text.Editable r5 = r10.getText()
        L_0x0130:
            r9.u(r5)
            r7.f5069m = r3
            r7.e()
            r0.f5007u = r3
            r0.n()
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.t(boolean, boolean):void");
    }

    public final void u(Editable editable) {
        ((w) this.f2050q).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2025d;
        if (length != 0 || this.f2062w0) {
            i1 i1Var = this.w;
            if (i1Var != null && this.f2060v) {
                i1Var.setText((CharSequence) null);
                s.a(frameLayout, this.A);
                this.w.setVisibility(4);
            }
        } else if (this.w != null && this.f2060v && !TextUtils.isEmpty(this.f2058u)) {
            this.w.setText(this.f2058u);
            s.a(frameLayout, this.f2067z);
            this.w.setVisibility(0);
            this.w.bringToFront();
            announceForAccessibility(this.f2058u);
        }
    }

    public final void v(boolean z5, boolean z6) {
        int defaultColor = this.f2051q0.getDefaultColor();
        int colorForState = this.f2051q0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f2051q0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z5) {
            this.W = colorForState2;
        } else if (z6) {
            this.W = colorForState;
        } else {
            this.W = defaultColor;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r7.f2030g;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r7 = this;
            p3.g r0 = r7.I
            if (r0 == 0) goto L_0x0117
            int r0 = r7.R
            if (r0 != 0) goto L_0x000a
            goto L_0x0117
        L_0x000a:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r7.f2030g
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r7.f2030g
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            boolean r3 = r7.isEnabled()
            if (r3 != 0) goto L_0x003a
            int r3 = r7.f2061v0
            goto L_0x006b
        L_0x003a:
            boolean r3 = r7.l()
            if (r3 == 0) goto L_0x004a
            android.content.res.ColorStateList r3 = r7.f2051q0
            if (r3 == 0) goto L_0x0045
            goto L_0x0056
        L_0x0045:
            int r3 = r7.getErrorCurrentTextColors()
            goto L_0x006b
        L_0x004a:
            boolean r3 = r7.f2048p
            if (r3 == 0) goto L_0x005f
            androidx.appcompat.widget.i1 r3 = r7.f2052r
            if (r3 == 0) goto L_0x005f
            android.content.res.ColorStateList r4 = r7.f2051q0
            if (r4 == 0) goto L_0x005a
        L_0x0056:
            r7.v(r0, r1)
            goto L_0x006d
        L_0x005a:
            int r3 = r3.getCurrentTextColor()
            goto L_0x006b
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            int r3 = r7.f2049p0
            goto L_0x006b
        L_0x0064:
            if (r1 == 0) goto L_0x0069
            int r3 = r7.f2047o0
            goto L_0x006b
        L_0x0069:
            int r3 = r7.f2045n0
        L_0x006b:
            r7.W = r3
        L_0x006d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L_0x0076
            r7.o()
        L_0x0076:
            s3.n r3 = r7.f2029f
            r3.l()
            com.google.android.material.internal.CheckableImageButton r4 = r3.f4992f
            android.content.res.ColorStateList r5 = r3.f4993g
            com.google.android.material.textfield.TextInputLayout r6 = r3.f4990d
            b1.o.S(r6, r4, r5)
            android.content.res.ColorStateList r4 = r3.f5000n
            com.google.android.material.internal.CheckableImageButton r5 = r3.f4996j
            b1.o.S(r6, r5, r4)
            s3.o r4 = r3.b()
            boolean r4 = r4 instanceof s3.k
            if (r4 == 0) goto L_0x00b9
            boolean r4 = r6.l()
            if (r4 == 0) goto L_0x00b2
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            if (r4 == 0) goto L_0x00b2
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            int r4 = r6.getErrorCurrentTextColors()
            r0.b.g(r3, r4)
            r5.setImageDrawable(r3)
            goto L_0x00b9
        L_0x00b2:
            android.content.res.ColorStateList r4 = r3.f5000n
            android.graphics.PorterDuff$Mode r3 = r3.f5001o
            b1.o.b(r6, r5, r4, r3)
        L_0x00b9:
            s3.v r3 = r7.f2027e
            com.google.android.material.internal.CheckableImageButton r4 = r3.f5063g
            android.content.res.ColorStateList r5 = r3.f5064h
            com.google.android.material.textfield.TextInputLayout r3 = r3.f5060d
            b1.o.S(r3, r4, r5)
            int r3 = r7.R
            r4 = 2
            if (r3 != r4) goto L_0x00f7
            int r3 = r7.T
            if (r0 == 0) goto L_0x00d6
            boolean r4 = r7.isEnabled()
            if (r4 == 0) goto L_0x00d6
            int r4 = r7.V
            goto L_0x00d8
        L_0x00d6:
            int r4 = r7.U
        L_0x00d8:
            r7.T = r4
            if (r4 == r3) goto L_0x00f7
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x00f7
            boolean r3 = r7.f2062w0
            if (r3 != 0) goto L_0x00f7
            boolean r3 = r7.e()
            if (r3 == 0) goto L_0x00f4
            p3.g r3 = r7.I
            s3.h r3 = (s3.h) r3
            r4 = 0
            r3.n(r4, r4, r4, r4)
        L_0x00f4:
            r7.i()
        L_0x00f7:
            int r3 = r7.R
            if (r3 != r2) goto L_0x0114
            boolean r2 = r7.isEnabled()
            if (r2 != 0) goto L_0x0104
            int r0 = r7.f2055s0
            goto L_0x0112
        L_0x0104:
            if (r1 == 0) goto L_0x010b
            if (r0 != 0) goto L_0x010b
            int r0 = r7.f2059u0
            goto L_0x0112
        L_0x010b:
            if (r0 == 0) goto L_0x0110
            int r0 = r7.f2057t0
            goto L_0x0112
        L_0x0110:
            int r0 = r7.f2053r0
        L_0x0112:
            r7.f2022a0 = r0
        L_0x0114:
            r7.b()
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w():void");
    }

    public void setHint(CharSequence charSequence) {
        if (this.F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2027e.f5063g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2027e.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2029f.f4996j.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2029f.f4996j.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2029f.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2029f.f4996j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        n nVar = this.f2029f;
        CheckableImageButton checkableImageButton = nVar.f4996j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = nVar.f5000n;
            PorterDuff.Mode mode = nVar.f5001o;
            TextInputLayout textInputLayout = nVar.f4990d;
            o.b(textInputLayout, checkableImageButton, colorStateList, mode);
            o.S(textInputLayout, checkableImageButton, nVar.f5000n);
        }
    }
}
