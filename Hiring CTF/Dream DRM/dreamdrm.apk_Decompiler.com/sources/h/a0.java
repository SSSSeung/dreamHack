package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import com.theori.dreamdrm.R;
import java.util.WeakHashMap;
import x0.e0;
import x0.u0;

public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3085a;

    /* renamed from: b  reason: collision with root package name */
    public final o f3086b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3087c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3088d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3089e;

    /* renamed from: f  reason: collision with root package name */
    public View f3090f;

    /* renamed from: g  reason: collision with root package name */
    public int f3091g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3092h;

    /* renamed from: i  reason: collision with root package name */
    public b0 f3093i;

    /* renamed from: j  reason: collision with root package name */
    public x f3094j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f3095k;

    /* renamed from: l  reason: collision with root package name */
    public final y f3096l;

    public a0(int i3, int i6, Context context, View view, o oVar, boolean z5) {
        this.f3091g = 8388611;
        this.f3096l = new y(this);
        this.f3085a = context;
        this.f3086b = oVar;
        this.f3090f = view;
        this.f3087c = z5;
        this.f3088d = i3;
        this.f3089e = i6;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [h.x, h.c0] */
    /* JADX WARNING: type inference failed for: r7v1, types: [h.h0] */
    /* JADX WARNING: type inference failed for: r1v10, types: [h.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.x a() {
        /*
            r14 = this;
            h.x r0 = r14.f3094j
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "window"
            android.content.Context r1 = r14.f3085a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            h.z.a(r0, r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099670(0x7f060016, float:1.78117E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0045
            h.i r0 = new h.i
            android.content.Context r2 = r14.f3085a
            android.view.View r3 = r14.f3090f
            int r4 = r14.f3088d
            int r5 = r14.f3089e
            boolean r6 = r14.f3087c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0057
        L_0x0045:
            h.h0 r0 = new h.h0
            android.content.Context r10 = r14.f3085a
            h.o r12 = r14.f3086b
            android.view.View r11 = r14.f3090f
            int r8 = r14.f3088d
            int r9 = r14.f3089e
            boolean r13 = r14.f3087c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0057:
            h.o r1 = r14.f3086b
            r0.l(r1)
            h.y r1 = r14.f3096l
            r0.r(r1)
            android.view.View r1 = r14.f3090f
            r0.n(r1)
            h.b0 r1 = r14.f3093i
            r0.c(r1)
            boolean r1 = r14.f3092h
            r0.o(r1)
            int r1 = r14.f3091g
            r0.p(r1)
            r14.f3094j = r0
        L_0x0077:
            h.x r0 = r14.f3094j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.a():h.x");
    }

    public final boolean b() {
        x xVar = this.f3094j;
        return xVar != null && xVar.a();
    }

    public void c() {
        this.f3094j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f3095k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i3, int i6, boolean z5, boolean z6) {
        x a6 = a();
        a6.s(z6);
        if (z5) {
            int i7 = this.f3091g;
            View view = this.f3090f;
            WeakHashMap weakHashMap = u0.f5622a;
            if ((Gravity.getAbsoluteGravity(i7, e0.d(view)) & 7) == 5) {
                i3 -= this.f3090f.getWidth();
            }
            a6.q(i3);
            a6.t(i6);
            int i8 = (int) ((this.f3085a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a6.f3231d = new Rect(i3 - i8, i6 - i8, i3 + i8, i6 + i8);
        }
        a6.f();
    }

    public a0(Context context, o oVar, View view, boolean z5) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, oVar, z5);
    }
}
