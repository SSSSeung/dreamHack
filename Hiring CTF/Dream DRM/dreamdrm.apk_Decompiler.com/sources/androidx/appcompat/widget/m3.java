package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;
import p0.p;

public final class m3 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f685a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f686b;

    /* renamed from: c  reason: collision with root package name */
    public Object f687c;

    public m3() {
        Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
        this.f685a = null;
        this.f686b = null;
        this.f687c = null;
        n();
        try {
            Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f685a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f686b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            this.f687c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public static m3 m(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new m3(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public final boolean a(int i3, boolean z5) {
        return ((TypedArray) this.f686b).getBoolean(i3, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = n0.b.a((android.content.Context) r3.f685a, (r1 = ((android.content.res.TypedArray) r0).getResourceId(r4, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.ColorStateList b(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f686b
            r1 = r0
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            boolean r1 = r1.hasValue(r4)
            if (r1 == 0) goto L_0x0020
            r1 = r0
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 0
            int r1 = r1.getResourceId(r4, r2)
            if (r1 == 0) goto L_0x0020
            java.lang.Object r2 = r3.f685a
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r1 = n0.b.a(r2, r1)
            if (r1 == 0) goto L_0x0020
            return r1
        L_0x0020:
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m3.b(int):android.content.res.ColorStateList");
    }

    public final int c(int i3, int i6) {
        return ((TypedArray) this.f686b).getDimensionPixelOffset(i3, i6);
    }

    public final int d(int i3, int i6) {
        return ((TypedArray) this.f686b).getDimensionPixelSize(i3, i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = ((android.content.res.TypedArray) r0).getResourceId(r4, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable e(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f686b
            r1 = r0
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            boolean r1 = r1.hasValue(r4)
            if (r1 == 0) goto L_0x001e
            r1 = r0
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 0
            int r1 = r1.getResourceId(r4, r2)
            if (r1 == 0) goto L_0x001e
            java.lang.Object r4 = r3.f685a
            android.content.Context r4 = (android.content.Context) r4
            android.graphics.drawable.Drawable r4 = w4.p.n(r4, r1)
            return r4
        L_0x001e:
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m3.e(int):android.graphics.drawable.Drawable");
    }

    public final Drawable f(int i3) {
        int resourceId;
        Drawable f6;
        if (!((TypedArray) this.f686b).hasValue(i3) || (resourceId = ((TypedArray) this.f686b).getResourceId(i3, 0)) == 0) {
            return null;
        }
        x a6 = x.a();
        Context context = (Context) this.f685a;
        synchronized (a6) {
            f6 = a6.f844a.f(context, resourceId, true);
        }
        return f6;
    }

    public final Typeface g(int i3, int i6, y0 y0Var) {
        int resourceId = ((TypedArray) this.f686b).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f687c) == null) {
            this.f687c = new TypedValue();
        }
        Context context = (Context) this.f685a;
        TypedValue typedValue = (TypedValue) this.f687c;
        ThreadLocal threadLocal = p.f4411a;
        if (context.isRestricted()) {
            return null;
        }
        return p.a(context, resourceId, typedValue, i6, y0Var, true, false);
    }

    public final int h(int i3, int i6) {
        return ((TypedArray) this.f686b).getInt(i3, i6);
    }

    public final int i(int i3, int i6) {
        return ((TypedArray) this.f686b).getResourceId(i3, i6);
    }

    public final String j(int i3) {
        return ((TypedArray) this.f686b).getString(i3);
    }

    public final CharSequence k(int i3) {
        return ((TypedArray) this.f686b).getText(i3);
    }

    public final boolean l(int i3) {
        return ((TypedArray) this.f686b).hasValue(i3);
    }

    public final void o() {
        ((TypedArray) this.f686b).recycle();
    }

    public m3(Context context, TypedArray typedArray) {
        this.f685a = context;
        this.f686b = typedArray;
    }
}
