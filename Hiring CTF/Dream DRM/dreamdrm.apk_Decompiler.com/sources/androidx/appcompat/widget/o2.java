package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import b1.m;
import b1.n;
import d.a;
import h.g0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import x0.u0;

public class o2 implements g0 {
    public static final Method D;
    public static final Method E;
    public Rect A;
    public boolean B;
    public final g0 C;

    /* renamed from: d  reason: collision with root package name */
    public final Context f696d;

    /* renamed from: e  reason: collision with root package name */
    public ListAdapter f697e;

    /* renamed from: f  reason: collision with root package name */
    public b2 f698f;

    /* renamed from: g  reason: collision with root package name */
    public final int f699g = -2;

    /* renamed from: h  reason: collision with root package name */
    public int f700h = -2;

    /* renamed from: i  reason: collision with root package name */
    public int f701i;

    /* renamed from: j  reason: collision with root package name */
    public int f702j;

    /* renamed from: k  reason: collision with root package name */
    public final int f703k = 1002;

    /* renamed from: l  reason: collision with root package name */
    public boolean f704l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f705m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f706n;

    /* renamed from: o  reason: collision with root package name */
    public int f707o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final int f708p = Integer.MAX_VALUE;

    /* renamed from: q  reason: collision with root package name */
    public l2 f709q;

    /* renamed from: r  reason: collision with root package name */
    public View f710r;

    /* renamed from: s  reason: collision with root package name */
    public AdapterView.OnItemClickListener f711s;

    /* renamed from: t  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f712t;

    /* renamed from: u  reason: collision with root package name */
    public final h2 f713u = new h2(this, 2);

    /* renamed from: v  reason: collision with root package name */
    public final n2 f714v = new n2(this);
    public final m2 w = new m2(this);

    /* renamed from: x  reason: collision with root package name */
    public final h2 f715x = new h2(this, 1);

    /* renamed from: y  reason: collision with root package name */
    public final Handler f716y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f717z = new Rect();

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                D = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                E = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public o2(Context context, AttributeSet attributeSet, int i3, int i6) {
        this.f696d = context;
        this.f716y = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2127o, i3, i6);
        this.f701i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f702j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f704l = true;
        }
        obtainStyledAttributes.recycle();
        g0 g0Var = new g0(context, attributeSet, i3, i6);
        this.C = g0Var;
        g0Var.setInputMethodMode(1);
    }

    public final boolean a() {
        return this.C.isShowing();
    }

    public final void b(int i3) {
        this.f701i = i3;
    }

    public final int c() {
        return this.f701i;
    }

    public final void dismiss() {
        g0 g0Var = this.C;
        g0Var.dismiss();
        g0Var.setContentView((View) null);
        this.f698f = null;
        this.f716y.removeCallbacks(this.f713u);
    }

    public final int e() {
        if (!this.f704l) {
            return 0;
        }
        return this.f702j;
    }

    public final void f() {
        int i3;
        int i6;
        b2 b2Var;
        b2 b2Var2 = this.f698f;
        g0 g0Var = this.C;
        int i7 = 0;
        Context context = this.f696d;
        if (b2Var2 == null) {
            b2 q5 = q(context, !this.B);
            this.f698f = q5;
            q5.setAdapter(this.f697e);
            this.f698f.setOnItemClickListener(this.f711s);
            this.f698f.setFocusable(true);
            this.f698f.setFocusableInTouchMode(true);
            this.f698f.setOnItemSelectedListener(new i2(0, this));
            this.f698f.setOnScrollListener(this.w);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f712t;
            if (onItemSelectedListener != null) {
                this.f698f.setOnItemSelectedListener(onItemSelectedListener);
            }
            g0Var.setContentView(this.f698f);
        } else {
            ViewGroup viewGroup = (ViewGroup) g0Var.getContentView();
        }
        Drawable background = g0Var.getBackground();
        Rect rect = this.f717z;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i3 = rect.bottom + i8;
            if (!this.f704l) {
                this.f702j = -i8;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int a6 = j2.a(g0Var, this.f710r, this.f702j, g0Var.getInputMethodMode() == 2);
        int i9 = this.f699g;
        if (i9 == -1) {
            i6 = a6 + i3;
        } else {
            int i10 = this.f700h;
            int a7 = this.f698f.a(i10 != -2 ? i10 != -1 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a6 + 0);
            i6 = a7 + (a7 > 0 ? this.f698f.getPaddingBottom() + this.f698f.getPaddingTop() + i3 + 0 : 0);
        }
        boolean z5 = g0Var.getInputMethodMode() == 2;
        n.d(g0Var, this.f703k);
        if (g0Var.isShowing()) {
            View view = this.f710r;
            WeakHashMap weakHashMap = u0.f5622a;
            if (x0.g0.b(view)) {
                int i11 = this.f700h;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.f710r.getWidth();
                }
                if (i9 == -1) {
                    i9 = z5 ? i6 : -1;
                    int i12 = this.f700h;
                    if (z5) {
                        g0Var.setWidth(i12 == -1 ? -1 : 0);
                        g0Var.setHeight(0);
                    } else {
                        if (i12 == -1) {
                            i7 = -1;
                        }
                        g0Var.setWidth(i7);
                        g0Var.setHeight(-1);
                    }
                } else if (i9 == -2) {
                    i9 = i6;
                }
                g0Var.setOutsideTouchable(true);
                View view2 = this.f710r;
                int i13 = this.f701i;
                int i14 = this.f702j;
                if (i11 < 0) {
                    i11 = -1;
                }
                g0Var.update(view2, i13, i14, i11, i9 < 0 ? -1 : i9);
                return;
            }
            return;
        }
        int i15 = this.f700h;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.f710r.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = i6;
        }
        g0Var.setWidth(i15);
        g0Var.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = D;
            if (method != null) {
                try {
                    method.invoke(g0Var, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            k2.b(g0Var, true);
        }
        g0Var.setOutsideTouchable(true);
        g0Var.setTouchInterceptor(this.f714v);
        if (this.f706n) {
            n.c(g0Var, this.f705m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = E;
            if (method2 != null) {
                try {
                    method2.invoke(g0Var, new Object[]{this.A});
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            k2.a(g0Var, this.A);
        }
        m.a(g0Var, this.f710r, this.f701i, this.f702j, this.f707o);
        this.f698f.setSelection(-1);
        if ((!this.B || this.f698f.isInTouchMode()) && (b2Var = this.f698f) != null) {
            b2Var.setListSelectionHidden(true);
            b2Var.requestLayout();
        }
        if (!this.B) {
            this.f716y.post(this.f715x);
        }
    }

    public final Drawable h() {
        return this.C.getBackground();
    }

    public final b2 j() {
        return this.f698f;
    }

    public final void l(Drawable drawable) {
        this.C.setBackgroundDrawable(drawable);
    }

    public final void n(int i3) {
        this.f702j = i3;
        this.f704l = true;
    }

    public void o(ListAdapter listAdapter) {
        l2 l2Var = this.f709q;
        if (l2Var == null) {
            this.f709q = new l2(0, this);
        } else {
            ListAdapter listAdapter2 = this.f697e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(l2Var);
            }
        }
        this.f697e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f709q);
        }
        b2 b2Var = this.f698f;
        if (b2Var != null) {
            b2Var.setAdapter(this.f697e);
        }
    }

    public b2 q(Context context, boolean z5) {
        return new b2(context, z5);
    }

    public final void r(int i3) {
        Drawable background = this.C.getBackground();
        if (background != null) {
            Rect rect = this.f717z;
            background.getPadding(rect);
            this.f700h = rect.left + rect.right + i3;
            return;
        }
        this.f700h = i3;
    }
}
