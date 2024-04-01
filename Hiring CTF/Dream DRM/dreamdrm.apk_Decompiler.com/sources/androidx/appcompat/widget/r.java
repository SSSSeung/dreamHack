package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import b1.o;
import java.util.List;
import java.util.WeakHashMap;
import p3.k;
import w4.p;
import x0.j0;
import x0.u0;
import y2.a;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f747a;

    /* renamed from: b  reason: collision with root package name */
    public int f748b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f749c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f750d;

    /* renamed from: e  reason: collision with root package name */
    public Object f751e;

    /* renamed from: f  reason: collision with root package name */
    public Object f752f;

    /* renamed from: g  reason: collision with root package name */
    public Object f753g;

    public r(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i3, k kVar, Rect rect) {
        this.f747a = 2;
        p.c(rect.left);
        p.c(rect.top);
        p.c(rect.right);
        p.c(rect.bottom);
        this.f749c = rect;
        this.f750d = colorStateList2;
        this.f751e = colorStateList;
        this.f752f = colorStateList3;
        this.f748b = i3;
        this.f753g = kVar;
    }

    public static r b(Context context, int i3) {
        p.b("Cannot create a CalendarItemStyle with a styleResId of 0", i3 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, a.f5831l);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList u3 = o.u(context, obtainStyledAttributes, 4);
        ColorStateList u5 = o.u(context, obtainStyledAttributes, 9);
        ColorStateList u6 = o.u(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k kVar = new k(k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new p3.a((float) 0)));
        obtainStyledAttributes.recycle();
        return new r(u3, u5, u6, dimensionPixelSize, kVar, rect);
    }

    public final void a() {
        View view = (View) this.f749c;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z5 = false;
            if (((v3) this.f751e) != null) {
                if (((v3) this.f753g) == null) {
                    this.f753g = new v3(0);
                }
                v3 v3Var = (v3) this.f753g;
                v3Var.f816c = null;
                v3Var.f815b = false;
                v3Var.f817d = null;
                v3Var.f814a = false;
                WeakHashMap weakHashMap = u0.f5622a;
                ColorStateList g6 = j0.g(view);
                if (g6 != null) {
                    v3Var.f815b = true;
                    v3Var.f816c = g6;
                }
                PorterDuff.Mode h6 = j0.h(view);
                if (h6 != null) {
                    v3Var.f814a = true;
                    v3Var.f817d = h6;
                }
                if (v3Var.f815b || v3Var.f814a) {
                    x.e(background, v3Var, view.getDrawableState());
                    z5 = true;
                }
                if (z5) {
                    return;
                }
            }
            v3 v3Var2 = (v3) this.f752f;
            if (v3Var2 != null) {
                x.e(background, v3Var2, view.getDrawableState());
                return;
            }
            v3 v3Var3 = (v3) this.f751e;
            if (v3Var3 != null) {
                x.e(background, v3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f752f;
        if (((v3) obj) != null) {
            return (ColorStateList) ((v3) obj).f816c;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f752f;
        if (((v3) obj) != null) {
            return (PorterDuff.Mode) ((v3) obj).f817d;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        r7.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f749c
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            android.content.Context r2 = r1.getContext()
            int[] r3 = d.a.f2137z
            androidx.appcompat.widget.m3 r7 = androidx.appcompat.widget.m3.m(r2, r9, r3, r10)
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.f686b
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            x0.u0.k(r1, r2, r3, r4, r5, r6)
            r9 = 0
            boolean r10 = r7.l(r9)     // Catch:{ all -> 0x0073 }
            r1 = -1
            if (r10 == 0) goto L_0x0049
            int r9 = r7.i(r9, r1)     // Catch:{ all -> 0x0073 }
            r8.f748b = r9     // Catch:{ all -> 0x0073 }
            java.lang.Object r9 = r8.f750d     // Catch:{ all -> 0x0073 }
            androidx.appcompat.widget.x r9 = (androidx.appcompat.widget.x) r9     // Catch:{ all -> 0x0073 }
            r10 = r0
            android.view.View r10 = (android.view.View) r10     // Catch:{ all -> 0x0073 }
            android.content.Context r10 = r10.getContext()     // Catch:{ all -> 0x0073 }
            int r2 = r8.f748b     // Catch:{ all -> 0x0073 }
            monitor-enter(r9)     // Catch:{ all -> 0x0073 }
            androidx.appcompat.widget.w2 r3 = r9.f844a     // Catch:{ all -> 0x0046 }
            android.content.res.ColorStateList r10 = r3.h(r10, r2)     // Catch:{ all -> 0x0046 }
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            if (r10 == 0) goto L_0x0049
            r8.h(r10)     // Catch:{ all -> 0x0073 }
            goto L_0x0049
        L_0x0046:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x0049:
            r9 = 1
            boolean r10 = r7.l(r9)     // Catch:{ all -> 0x0073 }
            if (r10 == 0) goto L_0x005a
            r10 = r0
            android.view.View r10 = (android.view.View) r10     // Catch:{ all -> 0x0073 }
            android.content.res.ColorStateList r9 = r7.b(r9)     // Catch:{ all -> 0x0073 }
            x0.j0.q(r10, r9)     // Catch:{ all -> 0x0073 }
        L_0x005a:
            r9 = 2
            boolean r10 = r7.l(r9)     // Catch:{ all -> 0x0073 }
            if (r10 == 0) goto L_0x006f
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0073 }
            int r9 = r7.h(r9, r1)     // Catch:{ all -> 0x0073 }
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.v1.b(r9, r10)     // Catch:{ all -> 0x0073 }
            x0.j0.r(r0, r9)     // Catch:{ all -> 0x0073 }
        L_0x006f:
            r7.o()
            return
        L_0x0073:
            r9 = move-exception
            r7.o()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r.e(android.util.AttributeSet, int):void");
    }

    public final void f() {
        this.f748b = -1;
        h((ColorStateList) null);
        a();
    }

    public final void g(int i3) {
        ColorStateList colorStateList;
        this.f748b = i3;
        x xVar = (x) this.f750d;
        if (xVar != null) {
            Context context = ((View) this.f749c).getContext();
            synchronized (xVar) {
                colorStateList = xVar.f844a.h(context, i3);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((v3) this.f751e) == null) {
                this.f751e = new v3(0);
            }
            Object obj = this.f751e;
            ((v3) obj).f816c = colorStateList;
            ((v3) obj).f815b = true;
        } else {
            this.f751e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((v3) this.f752f) == null) {
            this.f752f = new v3(0);
        }
        v3 v3Var = (v3) this.f752f;
        v3Var.f816c = colorStateList;
        v3Var.f815b = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((v3) this.f752f) == null) {
            this.f752f = new v3(0);
        }
        v3 v3Var = (v3) this.f752f;
        v3Var.f817d = mode;
        v3Var.f814a = true;
        a();
    }

    public final String toString() {
        switch (this.f747a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f749c) + ", mProviderPackage: " + ((String) this.f750d) + ", mQuery: " + ((String) this.f751e) + ", mCertificates:");
                for (int i3 = 0; i3 < ((List) this.f752f).size(); i3++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f752f).get(i3);
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i6), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f748b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public r(View view) {
        this.f747a = 0;
        this.f748b = -1;
        this.f749c = view;
        this.f750d = x.a();
    }

    public r(String str, String str2, String str3, List list) {
        this.f747a = 1;
        str.getClass();
        this.f749c = str;
        str2.getClass();
        this.f750d = str2;
        this.f751e = str3;
        list.getClass();
        this.f752f = list;
        this.f748b = 0;
        this.f753g = str + "-" + str2 + "-" + str3;
    }
}
