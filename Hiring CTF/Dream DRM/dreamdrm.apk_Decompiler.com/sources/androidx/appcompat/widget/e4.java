package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.theori.dreamdrm.R;
import d.a;
import x0.u0;

public final class e4 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f562a;

    /* renamed from: b  reason: collision with root package name */
    public int f563b;

    /* renamed from: c  reason: collision with root package name */
    public View f564c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f565d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f566e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f567f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f568g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f569h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f570i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f571j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f572k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f573l;

    /* renamed from: m  reason: collision with root package name */
    public m f574m;

    /* renamed from: n  reason: collision with root package name */
    public int f575n = 0;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f576o;

    public e4(Toolbar toolbar) {
        Drawable drawable;
        this.f562a = toolbar;
        this.f569h = toolbar.getTitle();
        this.f570i = toolbar.getSubtitle();
        this.f568g = this.f569h != null;
        this.f567f = toolbar.getNavigationIcon();
        String str = null;
        m3 m6 = m3.m(toolbar.getContext(), (AttributeSet) null, a.f2113a, R.attr.actionBarStyle);
        this.f576o = m6.e(15);
        CharSequence k6 = m6.k(27);
        if (!TextUtils.isEmpty(k6)) {
            this.f568g = true;
            this.f569h = k6;
            if ((this.f563b & 8) != 0) {
                toolbar.setTitle(k6);
                if (this.f568g) {
                    u0.m(toolbar.getRootView(), k6);
                }
            }
        }
        CharSequence k7 = m6.k(25);
        if (!TextUtils.isEmpty(k7)) {
            this.f570i = k7;
            if ((this.f563b & 8) != 0) {
                toolbar.setSubtitle(k7);
            }
        }
        Drawable e6 = m6.e(20);
        if (e6 != null) {
            this.f566e = e6;
            b();
        }
        Drawable e7 = m6.e(17);
        if (e7 != null) {
            this.f565d = e7;
            b();
        }
        if (this.f567f == null && (drawable = this.f576o) != null) {
            this.f567f = drawable;
            toolbar.setNavigationIcon((this.f563b & 4) == 0 ? null : drawable);
        }
        a(m6.h(10, 0));
        int i3 = m6.i(9, 0);
        if (i3 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i3, toolbar, false);
            View view = this.f564c;
            if (!(view == null || (this.f563b & 16) == 0)) {
                toolbar.removeView(view);
            }
            this.f564c = inflate;
            if (!(inflate == null || (this.f563b & 16) == 0)) {
                toolbar.addView(inflate);
            }
            a(this.f563b | 16);
        }
        int layoutDimension = ((TypedArray) m6.f686b).getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int c6 = m6.c(7, -1);
        int c7 = m6.c(3, -1);
        if (c6 >= 0 || c7 >= 0) {
            int max = Math.max(c6, 0);
            int max2 = Math.max(c7, 0);
            if (toolbar.w == null) {
                toolbar.w = new y2();
            }
            toolbar.w.a(max, max2);
        }
        int i6 = m6.i(28, 0);
        if (i6 != 0) {
            Context context = toolbar.getContext();
            toolbar.f484o = i6;
            i1 i1Var = toolbar.f474e;
            if (i1Var != null) {
                i1Var.setTextAppearance(context, i6);
            }
        }
        int i7 = m6.i(26, 0);
        if (i7 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.f485p = i7;
            i1 i1Var2 = toolbar.f475f;
            if (i1Var2 != null) {
                i1Var2.setTextAppearance(context2, i7);
            }
        }
        int i8 = m6.i(22, 0);
        if (i8 != 0) {
            toolbar.setPopupTheme(i8);
        }
        m6.o();
        if (R.string.abc_action_bar_up_description != this.f575n) {
            this.f575n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i9 = this.f575n;
                str = i9 != 0 ? toolbar.getContext().getString(i9) : str;
                this.f571j = str;
                if ((this.f563b & 4) != 0) {
                    if (TextUtils.isEmpty(str)) {
                        toolbar.setNavigationContentDescription(this.f575n);
                    } else {
                        toolbar.setNavigationContentDescription(this.f571j);
                    }
                }
            }
        }
        this.f571j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new c(this));
    }

    public final void a(int i3) {
        View view;
        Drawable drawable;
        int i6 = this.f563b ^ i3;
        this.f563b = i3;
        if (i6 != 0) {
            int i7 = i6 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f562a;
            if (i7 != 0) {
                if (!((i3 & 4) == 0 || (i3 & 4) == 0)) {
                    if (TextUtils.isEmpty(this.f571j)) {
                        toolbar.setNavigationContentDescription(this.f575n);
                    } else {
                        toolbar.setNavigationContentDescription(this.f571j);
                    }
                }
                if ((this.f563b & 4) != 0) {
                    drawable = this.f567f;
                    if (drawable == null) {
                        drawable = this.f576o;
                    }
                } else {
                    drawable = null;
                }
                toolbar.setNavigationIcon(drawable);
            }
            if ((i6 & 3) != 0) {
                b();
            }
            if ((i6 & 8) != 0) {
                if ((i3 & 8) != 0) {
                    toolbar.setTitle(this.f569h);
                    charSequence = this.f570i;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i6 & 16) != 0 && (view = this.f564c) != null) {
                if ((i3 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Drawable drawable;
        int i3 = this.f563b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) == 0 || (drawable = this.f566e) == null) {
            drawable = this.f565d;
        }
        this.f562a.setLogo(drawable);
    }
}
