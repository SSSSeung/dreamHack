package h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.u2;
import com.theori.dreamdrm.R;

public final class h0 extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final Context f3114e;

    /* renamed from: f  reason: collision with root package name */
    public final o f3115f;

    /* renamed from: g  reason: collision with root package name */
    public final l f3116g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3117h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3118i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3119j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3120k;

    /* renamed from: l  reason: collision with root package name */
    public final u2 f3121l;

    /* renamed from: m  reason: collision with root package name */
    public final e f3122m = new e(1, this);

    /* renamed from: n  reason: collision with root package name */
    public final f f3123n = new f(1, this);

    /* renamed from: o  reason: collision with root package name */
    public PopupWindow.OnDismissListener f3124o;

    /* renamed from: p  reason: collision with root package name */
    public View f3125p;

    /* renamed from: q  reason: collision with root package name */
    public View f3126q;

    /* renamed from: r  reason: collision with root package name */
    public b0 f3127r;

    /* renamed from: s  reason: collision with root package name */
    public ViewTreeObserver f3128s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3129t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3130u;

    /* renamed from: v  reason: collision with root package name */
    public int f3131v;
    public int w = 0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3132x;

    public h0(int i3, int i6, Context context, View view, o oVar, boolean z5) {
        this.f3114e = context;
        this.f3115f = oVar;
        this.f3117h = z5;
        this.f3116g = new l(oVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f3119j = i3;
        this.f3120k = i6;
        Resources resources = context.getResources();
        this.f3118i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3125p = view;
        this.f3121l = new u2(context, i3, i6);
        oVar.b(this, context);
    }

    public final boolean a() {
        return !this.f3129t && this.f3121l.a();
    }

    public final void b(o oVar, boolean z5) {
        if (oVar == this.f3115f) {
            dismiss();
            b0 b0Var = this.f3127r;
            if (b0Var != null) {
                b0Var.b(oVar, z5);
            }
        }
    }

    public final void c(b0 b0Var) {
        this.f3127r = b0Var;
    }

    public final void dismiss() {
        if (a()) {
            this.f3121l.dismiss();
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f() {
        View view;
        boolean z5 = true;
        if (!a()) {
            if (this.f3129t || (view = this.f3125p) == null) {
                z5 = false;
            } else {
                this.f3126q = view;
                u2 u2Var = this.f3121l;
                u2Var.C.setOnDismissListener(this);
                u2Var.f711s = this;
                u2Var.B = true;
                g0 g0Var = u2Var.C;
                g0Var.setFocusable(true);
                View view2 = this.f3126q;
                boolean z6 = this.f3128s == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f3128s = viewTreeObserver;
                if (z6) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f3122m);
                }
                view2.addOnAttachStateChangeListener(this.f3123n);
                u2Var.f710r = view2;
                u2Var.f707o = this.w;
                boolean z7 = this.f3130u;
                Context context = this.f3114e;
                l lVar = this.f3116g;
                if (!z7) {
                    this.f3131v = x.m(lVar, context, this.f3118i);
                    this.f3130u = true;
                }
                u2Var.r(this.f3131v);
                g0Var.setInputMethodMode(2);
                Rect rect = this.f3231d;
                u2Var.A = rect != null ? new Rect(rect) : null;
                u2Var.f();
                b2 b2Var = u2Var.f698f;
                b2Var.setOnKeyListener(this);
                if (this.f3132x) {
                    o oVar = this.f3115f;
                    if (oVar.f3182m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, b2Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(oVar.f3182m);
                        }
                        frameLayout.setEnabled(false);
                        b2Var.addHeaderView(frameLayout, (Object) null, false);
                    }
                }
                u2Var.o(lVar);
                u2Var.f();
            }
        }
        if (!z5) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void h() {
        this.f3130u = false;
        l lVar = this.f3116g;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    public final b2 j() {
        return this.f3121l.f698f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(h.i0 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            h.a0 r0 = new h.a0
            android.content.Context r5 = r9.f3114e
            android.view.View r6 = r9.f3126q
            boolean r8 = r9.f3117h
            int r3 = r9.f3119j
            int r4 = r9.f3120k
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            h.b0 r2 = r9.f3127r
            r0.f3093i = r2
            h.x r3 = r0.f3094j
            if (r3 == 0) goto L_0x0023
            r3.c(r2)
        L_0x0023:
            boolean r2 = h.x.u(r10)
            r0.f3092h = r2
            h.x r3 = r0.f3094j
            if (r3 == 0) goto L_0x0030
            r3.o(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f3124o
            r0.f3095k = r2
            r2 = 0
            r9.f3124o = r2
            h.o r2 = r9.f3115f
            r2.c(r1)
            androidx.appcompat.widget.u2 r2 = r9.f3121l
            int r3 = r2.f701i
            int r2 = r2.e()
            int r4 = r9.w
            android.view.View r5 = r9.f3125p
            java.util.WeakHashMap r6 = x0.u0.f5622a
            int r5 = x0.e0.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.f3125p
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f3090f
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.d(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            h.b0 r0 = r9.f3127r
            if (r0 == 0) goto L_0x0079
            r0.i(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h0.k(h.i0):boolean");
    }

    public final void l(o oVar) {
    }

    public final void n(View view) {
        this.f3125p = view;
    }

    public final void o(boolean z5) {
        this.f3116g.f3165f = z5;
    }

    public final void onDismiss() {
        this.f3129t = true;
        this.f3115f.c(true);
        ViewTreeObserver viewTreeObserver = this.f3128s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3128s = this.f3126q.getViewTreeObserver();
            }
            this.f3128s.removeGlobalOnLayoutListener(this.f3122m);
            this.f3128s = null;
        }
        this.f3126q.removeOnAttachStateChangeListener(this.f3123n);
        PopupWindow.OnDismissListener onDismissListener = this.f3124o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i3) {
        this.w = i3;
    }

    public final void q(int i3) {
        this.f3121l.f701i = i3;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3124o = onDismissListener;
    }

    public final void s(boolean z5) {
        this.f3132x = z5;
    }

    public final void t(int i3) {
        this.f3121l.n(i3);
    }
}
