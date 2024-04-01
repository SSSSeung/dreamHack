package b1;

import a2.m;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.compose.ui.platform.k;
import c4.b;
import com.bumptech.glide.d;
import com.theori.dreamdrm.R;
import e.k0;
import g4.h;
import g4.n;
import i4.i;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o4.e;
import o4.f;
import p1.b0;
import p1.b1;
import p1.o0;
import q0.a;
import s4.c;
import w4.l;
import w4.p;
import y3.u;

public abstract class v {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f1537d = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1538e = {R.attr.colorPrimary};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1539f = {R.attr.colorPrimaryVariant};

    public static boolean A(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final boolean B(char c6) {
        return Character.isWhitespace(c6) || Character.isSpaceChar(c6);
    }

    public static int C(int i3, int i6, float f6) {
        return a.b(a.c(i6, Math.round(((float) Color.alpha(i6)) * f6)), i3);
    }

    public static final List D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        o.l(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List E(Object... objArr) {
        o.m(objArr, "elements");
        return objArr.length > 0 ? h.W(objArr) : n.f2906d;
    }

    public static Typeface F(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, d.e(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static TypedArray G(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i6, int... iArr2) {
        f(context, attributeSet, i3, i6);
        j(context, attributeSet, iArr, i3, i6, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i3, i6);
    }

    public static final List J(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : D(arrayList.get(0)) : n.f2906d;
    }

    public static i4.h K(i4.h hVar, i4.h hVar2) {
        o.m(hVar2, "context");
        return hVar2 == i.f3606d ? hVar : (i4.h) hVar2.q(hVar, k.f901g);
    }

    public static TypedValue L(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean M(Context context, int i3, boolean z5) {
        TypedValue L = L(context, i3);
        return (L == null || L.type != 18) ? z5 : L.data != 0;
    }

    public static TypedValue N(Context context, int i3, String str) {
        TypedValue L = L(context, i3);
        if (L != null) {
            return L;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i3)}));
    }

    public static void O(TextView textView, int i3) {
        p.c(i3);
        if (Build.VERSION.SDK_INT >= 28) {
            t.d(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = p.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i6, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void P(TextView textView, int i3) {
        p.c(i3);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = p.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i6);
        }
    }

    public static void Q(EditorInfo editorInfo, CharSequence charSequence, int i3, int i6) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i6);
    }

    public static final s4.a R(s4.a aVar, int i3) {
        o.m(aVar, "<this>");
        boolean z5 = i3 > 0;
        Integer valueOf = Integer.valueOf(i3);
        o.m(valueOf, "step");
        if (z5) {
            if (aVar.f5075f <= 0) {
                i3 = -i3;
            }
            return new s4.a(aVar.f5073d, aVar.f5074e, i3);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static void S(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        o.V(v.class.getName(), classCastException);
        throw classCastException;
    }

    public static final c T(int i3, int i6) {
        if (i6 > Integer.MIN_VALUE) {
            return new c(i3, i6 - 1);
        }
        c cVar = c.f5080g;
        return c.f5080g;
    }

    public static ActionMode.Callback U(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof u) || callback == null) ? callback : new u(callback, textView);
    }

    public static void V(v3.p pVar, b bVar) {
        u.f5921z.i(bVar, pVar);
    }

    public static void b(int i3, Object obj) {
        int i6;
        if (obj != null) {
            boolean z5 = false;
            if (obj instanceof f4.a) {
                if (obj instanceof p4.d) {
                    i6 = ((p4.d) obj).d();
                } else if (obj instanceof o4.a) {
                    i6 = 0;
                } else if (obj instanceof o4.c) {
                    i6 = 1;
                } else if (obj instanceof e) {
                    i6 = 2;
                } else if (obj instanceof f) {
                    i6 = 3;
                } else {
                    boolean z6 = obj instanceof n.a;
                    i6 = z6 ? 4 : z6 ? 5 : z6 ? 6 : z6 ? 7 : z6 ? 8 : z6 ? 9 : z6 ? 10 : z6 ? 11 : z6 ? 13 : z6 ? 14 : z6 ? 15 : z6 ? 16 : z6 ? 17 : z6 ? 18 : z6 ? 19 : z6 ? 20 : z6 ? 21 : -1;
                }
                if (i6 == i3) {
                    z5 = true;
                }
            }
            if (!z5) {
                S(obj, "kotlin.jvm.functions.Function" + i3);
                throw null;
            }
        }
    }

    public static void f(Context context, AttributeSet attributeSet, int i3, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.a.A, i3, i6);
        boolean z5 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z5) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                k(context, f1539f, "Theme.MaterialComponents");
            }
        }
        k(context, f1538e, "Theme.AppCompat");
    }

    public static final void g(int i3) {
        if (!(2 <= i3 && i3 <= new c(2, 36).f5074e)) {
            throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new c(2, 36));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = y2.a.A
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L_0x001d
            int r4 = r0.getResourceId(r2, r3)
            if (r4 == r3) goto L_0x0038
            goto L_0x0037
        L_0x001d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L_0x0023:
            if (r6 >= r5) goto L_0x0034
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L_0x0031
            r4.recycle()
            goto L_0x0038
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0034:
            r4.recycle()
        L_0x0037:
            r2 = 1
        L_0x0038:
            r0.recycle()
            if (r2 == 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.v.j(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void k(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z5 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z5 = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i3)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i3++;
            }
        }
        if (!z5) {
            throw new IllegalArgumentException(m.i("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static final void l(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            o.a(th, th2);
        }
    }

    public static int m(b1 b1Var, b0 b0Var, View view, View view2, o0 o0Var, boolean z5) {
        if (o0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(o0.F(view) - o0.F(view2)) + 1;
        }
        return Math.min(b0Var.i(), b0Var.b(view2) - b0Var.d(view));
    }

    public static int n(b1 b1Var, b0 b0Var, View view, View view2, o0 o0Var, boolean z5, boolean z6) {
        if (o0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z6 ? Math.max(0, (b1Var.b() - Math.max(o0.F(view), o0.F(view2))) - 1) : Math.max(0, Math.min(o0.F(view), o0.F(view2)));
        if (!z5) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(b0Var.b(view2) - b0Var.d(view))) / ((float) (Math.abs(o0.F(view) - o0.F(view2)) + 1)))) + ((float) (b0Var.h() - b0Var.d(view))));
    }

    public static int o(b1 b1Var, b0 b0Var, View view, View view2, o0 o0Var, boolean z5) {
        if (o0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return b1Var.b();
        }
        return (int) ((((float) (b0Var.b(view2) - b0Var.d(view))) / ((float) (Math.abs(o0.F(view) - o0.F(view2)) + 1))) * ((float) b1Var.b()));
    }

    public static final void p(int i3, int i6) {
        if (i3 > i6) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i6 + ").");
        }
    }

    public static final i4.d q(Object obj, i4.d dVar, e eVar) {
        o.m(dVar, "completion");
        if (eVar instanceof k4.a) {
            return ((k4.a) eVar).b(obj, dVar);
        }
        i4.h f6 = dVar.f();
        return f6 == i.f3606d ? new j4.b(obj, dVar, eVar) : new j4.c(dVar, f6, eVar, obj);
    }

    public static boolean r(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z5 = true;
            for (int i3 = 0; i3 < length; i3++) {
                z5 = r(listFiles[i3]) && z5;
            }
            return z5;
        }
        file.delete();
        return true;
    }

    public static final boolean s(char c6, char c7, boolean z5) {
        if (c6 == c7) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c7);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static int t(Context context, int i3, int i6) {
        TypedValue L = L(context, i3);
        if (L == null) {
            return i6;
        }
        int i7 = L.resourceId;
        if (i7 == 0) {
            return L.data;
        }
        Object obj = n0.b.f4213a;
        return o0.c.a(context, i7);
    }

    public static int u(View view, int i3) {
        Context context = view.getContext();
        TypedValue N = N(view.getContext(), i3, view.getClass().getCanonicalName());
        int i6 = N.resourceId;
        if (i6 == 0) {
            return N.data;
        }
        Object obj = n0.b.f4213a;
        return o0.c.a(context, i6);
    }

    public static final int v(List list) {
        o.m(list, "<this>");
        return list.size() - 1;
    }

    public static String w(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", new Class[]{String.class}).invoke(loadClass, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r7 != 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v0.e x(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            v0.e r0 = new v0.e
            android.text.PrecomputedText$Params r7 = b1.t.c(r7)
            r0.<init>(r7)
            return r0
        L_0x0010:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = b1.r.a(r7)
            int r4 = b1.r.d(r7)
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L_0x002e
        L_0x002b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0076
        L_0x002e:
            r5 = 1
            r6 = 0
            if (r0 < r1) goto L_0x0057
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x0057
            java.util.Locale r7 = b1.q.d(r7)
            android.icu.text.DecimalFormatSymbols r7 = b1.s.a(r7)
            java.lang.String[] r7 = b1.t.b(r7)
            r7 = r7[r6]
            int r7 = r7.codePointAt(r6)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r5) goto L_0x006e
            r0 = 2
            if (r7 != r0) goto L_0x002b
            goto L_0x006e
        L_0x0057:
            int r0 = b1.q.b(r7)
            if (r0 != r5) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r5 = r6
        L_0x005f:
            int r7 = b1.q.c(r7)
            switch(r7) {
                case 2: goto L_0x0071;
                case 3: goto L_0x002b;
                case 4: goto L_0x006e;
                case 5: goto L_0x006b;
                case 6: goto L_0x0074;
                case 7: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            if (r5 == 0) goto L_0x0074
        L_0x0068:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0076
        L_0x006b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0076
        L_0x006e:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0076
        L_0x0071:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0076
        L_0x0074:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0076:
            v0.e r0 = new v0.e
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.v.x(android.widget.TextView):v0.e");
    }

    public static final i4.d y(i4.d dVar) {
        o.m(dVar, "<this>");
        k4.c cVar = dVar instanceof k4.c ? (k4.c) dVar : null;
        if (cVar != null && (dVar = cVar.f3971f) == null) {
            i4.e eVar = (i4.e) cVar.f().l(androidx.compose.ui.platform.e.f892i);
            dVar = eVar != null ? new kotlinx.coroutines.internal.c((l) eVar, cVar) : cVar;
            cVar.f3971f = dVar;
        }
        return dVar;
    }

    public static boolean z(int i3) {
        boolean z5;
        if (i3 != 0) {
            ThreadLocal threadLocal = a.f4867a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i3);
            int green = Color.green(i3);
            int blue = Color.blue(i3);
            if (dArr.length == 3) {
                double d6 = ((double) red) / 255.0d;
                double pow = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
                double d7 = ((double) green) / 255.0d;
                double pow2 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
                double d8 = ((double) blue) / 255.0d;
                double pow3 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
                z5 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d9 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d9;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d9 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z5 = false;
        }
        return z5;
    }

    public abstract void H(int i3);

    public abstract void I(Typeface typeface);

    public void c(int i3) {
        new Handler(Looper.getMainLooper()).post(new p0.m(i3, 0, this));
    }

    public void e(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new k0(this, 1, typeface));
    }
}
