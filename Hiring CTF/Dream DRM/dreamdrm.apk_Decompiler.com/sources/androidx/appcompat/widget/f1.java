package androidx.appcompat.widget;

import a2.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b1.r;
import b1.v;
import d.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import w4.p;
import x0.u0;

public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f581a;

    /* renamed from: b  reason: collision with root package name */
    public v3 f582b;

    /* renamed from: c  reason: collision with root package name */
    public v3 f583c;

    /* renamed from: d  reason: collision with root package name */
    public v3 f584d;

    /* renamed from: e  reason: collision with root package name */
    public v3 f585e;

    /* renamed from: f  reason: collision with root package name */
    public v3 f586f;

    /* renamed from: g  reason: collision with root package name */
    public v3 f587g;

    /* renamed from: h  reason: collision with root package name */
    public v3 f588h;

    /* renamed from: i  reason: collision with root package name */
    public final q1 f589i;

    /* renamed from: j  reason: collision with root package name */
    public int f590j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f591k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f592l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f593m;

    public f1(TextView textView) {
        this.f581a = textView;
        this.f589i = new q1(textView);
    }

    public static v3 c(Context context, x xVar, int i3) {
        ColorStateList h6;
        synchronized (xVar) {
            h6 = xVar.f844a.h(context, i3);
        }
        if (h6 == null) {
            return null;
        }
        v3 v3Var = new v3(0);
        v3Var.f815b = true;
        v3Var.f816c = h6;
        return v3Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i3 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i3 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i6 = editorInfo.initialSelStart;
            int i7 = editorInfo.initialSelEnd;
            int i8 = i6 > i7 ? i7 + 0 : i6 + 0;
            int i9 = i6 > i7 ? i6 - 0 : i7 + 0;
            int length = text.length();
            if (i8 >= 0 && i9 <= length) {
                int i10 = editorInfo.inputType & 4095;
                if (!(i10 == 129 || i10 == 225 || i10 == 18)) {
                    if (length <= 2048) {
                        v.Q(editorInfo, text, i8, i9);
                        return;
                    }
                    int i11 = i9 - i8;
                    int i12 = i11 > 1024 ? 0 : i11;
                    int i13 = 2048 - i12;
                    int min = Math.min(text.length() - i9, i13 - Math.min(i8, (int) (((double) i13) * 0.8d)));
                    int min2 = Math.min(i8, i13 - min);
                    int i14 = i8 - min2;
                    if (Character.isLowSurrogate(text.charAt(i14))) {
                        i14++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i9 + min) - 1))) {
                        min--;
                    }
                    CharSequence concat = i12 != i11 ? TextUtils.concat(new CharSequence[]{text.subSequence(i14, i14 + min2), text.subSequence(i9, min + i9)}) : text.subSequence(i14, min2 + i12 + min + i14);
                    int i15 = min2 + 0;
                    v.Q(editorInfo, concat, i15, i12 + i15);
                    return;
                }
            }
            v.Q(editorInfo, (CharSequence) null, 0, 0);
        }
    }

    public final void a(Drawable drawable, v3 v3Var) {
        if (drawable != null && v3Var != null) {
            x.e(drawable, v3Var, this.f581a.getDrawableState());
        }
    }

    public final void b() {
        v3 v3Var = this.f582b;
        TextView textView = this.f581a;
        if (!(v3Var == null && this.f583c == null && this.f584d == null && this.f585e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f582b);
            a(compoundDrawables[1], this.f583c);
            a(compoundDrawables[2], this.f584d);
            a(compoundDrawables[3], this.f585e);
        }
        if (this.f586f != null || this.f587g != null) {
            Drawable[] a6 = a1.a(textView);
            a(a6[0], this.f586f);
            a(a6[2], this.f587g);
        }
    }

    public final ColorStateList d() {
        v3 v3Var = this.f588h;
        if (v3Var != null) {
            return (ColorStateList) v3Var.f816c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        v3 v3Var = this.f588h;
        if (v3Var != null) {
            return (PorterDuff.Mode) v3Var.f817d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i3) {
        String str;
        String str2;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        int resourceId;
        int i9;
        AttributeSet attributeSet2 = attributeSet;
        int i10 = i3;
        TextView textView = this.f581a;
        Context context = textView.getContext();
        x a6 = x.a();
        int[] iArr = a.f2120h;
        m3 m6 = m3.m(context, attributeSet2, iArr, i10);
        u0.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) m6.f686b, i3);
        int i11 = m6.i(0, -1);
        if (m6.l(3)) {
            this.f582b = c(context, a6, m6.i(3, 0));
        }
        if (m6.l(1)) {
            this.f583c = c(context, a6, m6.i(1, 0));
        }
        if (m6.l(4)) {
            this.f584d = c(context, a6, m6.i(4, 0));
        }
        if (m6.l(2)) {
            this.f585e = c(context, a6, m6.i(2, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (m6.l(5)) {
            this.f586f = c(context, a6, m6.i(5, 0));
        }
        if (m6.l(6)) {
            this.f587g = c(context, a6, m6.i(6, 0));
        }
        m6.o();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = a.w;
        if (i11 != -1) {
            m3 m3Var = new m3(context, context.obtainStyledAttributes(i11, iArr2));
            if (z7 || !m3Var.l(14)) {
                z6 = false;
                z5 = false;
            } else {
                z6 = m3Var.a(14, false);
                z5 = true;
            }
            n(context, m3Var);
            if (m3Var.l(15)) {
                str2 = m3Var.j(15);
                i9 = 13;
            } else {
                i9 = 13;
                str2 = null;
            }
            str = m3Var.l(i9) ? m3Var.j(i9) : null;
            m3Var.o();
        } else {
            z6 = false;
            z5 = false;
            str2 = null;
            str = null;
        }
        m3 m3Var2 = new m3(context, context.obtainStyledAttributes(attributeSet2, iArr2, i10, 0));
        if (z7 || !m3Var2.l(14)) {
            i6 = 15;
        } else {
            z6 = m3Var2.a(14, false);
            i6 = 15;
            z5 = true;
        }
        if (m3Var2.l(i6)) {
            str2 = m3Var2.j(i6);
        }
        if (m3Var2.l(13)) {
            str = m3Var2.j(13);
        }
        String str3 = str;
        if (i12 >= 28 && m3Var2.l(0) && m3Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, m3Var2);
        m3Var2.o();
        if (!z7 && z5) {
            textView.setAllCaps(z6);
        }
        Typeface typeface = this.f592l;
        if (typeface != null) {
            if (this.f591k == -1) {
                textView.setTypeface(typeface, this.f590j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            c1.d(textView, str3);
        }
        if (str2 != null) {
            b1.b(textView, b1.a(str2));
        }
        int[] iArr3 = a.f2121i;
        q1 q1Var = this.f589i;
        Context context2 = q1Var.f739j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr3, i10, 0);
        TextView textView2 = q1Var.f738i;
        TypedArray typedArray = obtainStyledAttributes;
        Context context3 = context2;
        q1 q1Var2 = q1Var;
        u0.k(textView2, textView2.getContext(), iArr3, attributeSet, typedArray, i3);
        TypedArray typedArray2 = typedArray;
        if (typedArray2.hasValue(5)) {
            q1Var2.f730a = typedArray2.getInt(5, 0);
        }
        float dimension = typedArray2.hasValue(4) ? typedArray2.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArray2.hasValue(2) ? typedArray2.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArray2.hasValue(1) ? typedArray2.getDimension(1, -1.0f) : -1.0f;
        if (typedArray2.hasValue(3) && (resourceId = typedArray2.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray2.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                q1Var2.f735f = q1.b(iArr4);
                q1Var2.h();
            }
            obtainTypedArray.recycle();
        }
        typedArray2.recycle();
        if (!q1Var2.i()) {
            q1Var2.f730a = 0;
        } else if (q1Var2.f730a == 1) {
            if (!q1Var2.f736g) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i8 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i8 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i8, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                q1Var2.j(dimension2, dimension3, dimension);
            }
            q1Var2.g();
        }
        if (j4.f648b && q1Var2.f730a != 0) {
            int[] iArr5 = q1Var2.f735f;
            if (iArr5.length > 0) {
                if (((float) c1.a(textView)) != -1.0f) {
                    c1.b(textView, Math.round(q1Var2.f733d), Math.round(q1Var2.f734e), Math.round(q1Var2.f732c), 0);
                } else {
                    c1.c(textView, iArr5, 0);
                }
            }
        }
        m3 m3Var3 = new m3(context, context.obtainStyledAttributes(attributeSet2, iArr3));
        int i14 = m3Var3.i(8, -1);
        Drawable b6 = i14 != -1 ? a6.b(context, i14) : null;
        int i15 = m3Var3.i(13, -1);
        Drawable b7 = i15 != -1 ? a6.b(context, i15) : null;
        int i16 = m3Var3.i(9, -1);
        Drawable b8 = i16 != -1 ? a6.b(context, i16) : null;
        int i17 = m3Var3.i(6, -1);
        Drawable b9 = i17 != -1 ? a6.b(context, i17) : null;
        int i18 = m3Var3.i(10, -1);
        Drawable b10 = i18 != -1 ? a6.b(context, i18) : null;
        int i19 = m3Var3.i(7, -1);
        Drawable b11 = i19 != -1 ? a6.b(context, i19) : null;
        if (b10 != null || b11 != null) {
            Drawable[] a7 = a1.a(textView);
            if (b10 == null) {
                b10 = a7[0];
            }
            if (b7 == null) {
                b7 = a7[1];
            }
            if (b11 == null) {
                b11 = a7[2];
            }
            if (b9 == null) {
                b9 = a7[3];
            }
            a1.b(textView, b10, b7, b11, b9);
        } else if (!(b6 == null && b7 == null && b8 == null && b9 == null)) {
            Drawable[] a8 = a1.a(textView);
            Drawable drawable = a8[0];
            if (drawable == null && a8[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b6 == null) {
                    b6 = compoundDrawables[0];
                }
                if (b7 == null) {
                    b7 = compoundDrawables[1];
                }
                if (b8 == null) {
                    b8 = compoundDrawables[2];
                }
                if (b9 == null) {
                    b9 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b6, b7, b8, b9);
            } else {
                if (b7 == null) {
                    b7 = a8[1];
                }
                Drawable drawable2 = a8[2];
                if (b9 == null) {
                    b9 = a8[3];
                }
                a1.b(textView, drawable, b7, drawable2, b9);
            }
        }
        if (m3Var3.l(11)) {
            r.f(textView, m3Var3.b(11));
        }
        if (m3Var3.l(12)) {
            i7 = -1;
            r.g(textView, v1.b(m3Var3.h(12, -1), (PorterDuff.Mode) null));
        } else {
            i7 = -1;
        }
        int d6 = m3Var3.d(15, i7);
        int d7 = m3Var3.d(18, i7);
        int d8 = m3Var3.d(19, i7);
        m3Var3.o();
        if (d6 != i7) {
            v.O(textView, d6);
        }
        if (d7 != i7) {
            v.P(textView, d7);
        }
        if (d8 != i7) {
            p.c(d8);
            int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (d8 != fontMetricsInt) {
                textView.setLineSpacing((float) (d8 - fontMetricsInt), 1.0f);
            }
        }
    }

    public final void g(Context context, int i3) {
        String j6;
        m3 m3Var = new m3(context, context.obtainStyledAttributes(i3, a.w));
        boolean l6 = m3Var.l(14);
        TextView textView = this.f581a;
        if (l6) {
            textView.setAllCaps(m3Var.a(14, false));
        }
        if (m3Var.l(0) && m3Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, m3Var);
        if (m3Var.l(13) && (j6 = m3Var.j(13)) != null) {
            c1.d(textView, j6);
        }
        m3Var.o();
        Typeface typeface = this.f592l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f590j);
        }
    }

    public final void i(int i3, int i6, int i7, int i8) {
        q1 q1Var = this.f589i;
        if (q1Var.i()) {
            DisplayMetrics displayMetrics = q1Var.f739j.getResources().getDisplayMetrics();
            q1Var.j(TypedValue.applyDimension(i8, (float) i3, displayMetrics), TypedValue.applyDimension(i8, (float) i6, displayMetrics), TypedValue.applyDimension(i8, (float) i7, displayMetrics));
            if (q1Var.g()) {
                q1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i3) {
        q1 q1Var = this.f589i;
        if (q1Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = q1Var.f739j.getResources().getDisplayMetrics();
                    for (int i6 = 0; i6 < length; i6++) {
                        iArr2[i6] = Math.round(TypedValue.applyDimension(i3, (float) iArr[i6], displayMetrics));
                    }
                }
                q1Var.f735f = q1.b(iArr2);
                if (!q1Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                q1Var.f736g = false;
            }
            if (q1Var.g()) {
                q1Var.a();
            }
        }
    }

    public final void k(int i3) {
        q1 q1Var = this.f589i;
        if (!q1Var.i()) {
            return;
        }
        if (i3 == 0) {
            q1Var.f730a = 0;
            q1Var.f733d = -1.0f;
            q1Var.f734e = -1.0f;
            q1Var.f732c = -1.0f;
            q1Var.f735f = new int[0];
            q1Var.f731b = false;
        } else if (i3 == 1) {
            DisplayMetrics displayMetrics = q1Var.f739j.getResources().getDisplayMetrics();
            q1Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (q1Var.g()) {
                q1Var.a();
            }
        } else {
            throw new IllegalArgumentException(m.g("Unknown auto-size text type: ", i3));
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z5 = false;
        if (this.f588h == null) {
            this.f588h = new v3(0);
        }
        v3 v3Var = this.f588h;
        v3Var.f816c = colorStateList;
        if (colorStateList != null) {
            z5 = true;
        }
        v3Var.f815b = z5;
        this.f582b = v3Var;
        this.f583c = v3Var;
        this.f584d = v3Var;
        this.f585e = v3Var;
        this.f586f = v3Var;
        this.f587g = v3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z5 = false;
        if (this.f588h == null) {
            this.f588h = new v3(0);
        }
        v3 v3Var = this.f588h;
        v3Var.f817d = mode;
        if (mode != null) {
            z5 = true;
        }
        v3Var.f814a = z5;
        this.f582b = v3Var;
        this.f583c = v3Var;
        this.f584d = v3Var;
        this.f585e = v3Var;
        this.f586f = v3Var;
        this.f587g = v3Var;
    }

    public final void n(Context context, m3 m3Var) {
        String j6;
        Typeface typeface;
        Typeface typeface2;
        this.f590j = m3Var.h(2, this.f590j);
        int i3 = Build.VERSION.SDK_INT;
        boolean z5 = false;
        if (i3 >= 28) {
            int h6 = m3Var.h(11, -1);
            this.f591k = h6;
            if (h6 != -1) {
                this.f590j = (this.f590j & 2) | 0;
            }
        }
        int i6 = 10;
        if (m3Var.l(10) || m3Var.l(12)) {
            this.f592l = null;
            if (m3Var.l(12)) {
                i6 = 12;
            }
            int i7 = this.f591k;
            int i8 = this.f590j;
            if (!context.isRestricted()) {
                try {
                    Typeface g6 = m3Var.g(i6, this.f590j, new y0(this, i7, i8, new WeakReference(this.f581a)));
                    if (g6 != null) {
                        if (i3 >= 28 && this.f591k != -1) {
                            g6 = e1.a(Typeface.create(g6, 0), this.f591k, (this.f590j & 2) != 0);
                        }
                        this.f592l = g6;
                    }
                    this.f593m = this.f592l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f592l == null && (j6 = m3Var.j(i6)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f591k == -1) {
                    typeface = Typeface.create(j6, this.f590j);
                } else {
                    Typeface create = Typeface.create(j6, 0);
                    int i9 = this.f591k;
                    if ((this.f590j & 2) != 0) {
                        z5 = true;
                    }
                    typeface = e1.a(create, i9, z5);
                }
                this.f592l = typeface;
            }
        } else if (m3Var.l(1)) {
            this.f593m = false;
            int h7 = m3Var.h(1, 1);
            if (h7 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (h7 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (h7 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f592l = typeface2;
        }
    }
}
