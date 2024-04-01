package g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import h.q;
import h.r;
import h.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import s0.b;
import x0.n;

public final class k {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public final /* synthetic */ l E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f2734a;

    /* renamed from: b  reason: collision with root package name */
    public int f2735b;

    /* renamed from: c  reason: collision with root package name */
    public int f2736c;

    /* renamed from: d  reason: collision with root package name */
    public int f2737d;

    /* renamed from: e  reason: collision with root package name */
    public int f2738e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2739f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2740g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2741h;

    /* renamed from: i  reason: collision with root package name */
    public int f2742i;

    /* renamed from: j  reason: collision with root package name */
    public int f2743j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2744k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f2745l;

    /* renamed from: m  reason: collision with root package name */
    public int f2746m;

    /* renamed from: n  reason: collision with root package name */
    public char f2747n;

    /* renamed from: o  reason: collision with root package name */
    public int f2748o;

    /* renamed from: p  reason: collision with root package name */
    public char f2749p;

    /* renamed from: q  reason: collision with root package name */
    public int f2750q;

    /* renamed from: r  reason: collision with root package name */
    public int f2751r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2752s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2753t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2754u;

    /* renamed from: v  reason: collision with root package name */
    public int f2755v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public String f2756x;

    /* renamed from: y  reason: collision with root package name */
    public String f2757y;

    /* renamed from: z  reason: collision with root package name */
    public r f2758z;

    public k(l lVar, Menu menu) {
        this.E = lVar;
        this.f2734a = menu;
        this.f2735b = 0;
        this.f2736c = 0;
        this.f2737d = 0;
        this.f2738e = 0;
        this.f2739f = true;
        this.f2740g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f2763c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z5 = false;
        menuItem.setChecked(this.f2752s).setVisible(this.f2753t).setEnabled(this.f2754u).setCheckable(this.f2751r >= 1).setTitleCondensed(this.f2745l).setIcon(this.f2746m);
        int i3 = this.f2755v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f2757y;
        l lVar = this.E;
        if (str != null) {
            if (!lVar.f2763c.isRestricted()) {
                if (lVar.f2764d == null) {
                    lVar.f2764d = l.a(lVar.f2763c);
                }
                menuItem.setOnMenuItemClickListener(new j(lVar.f2764d, this.f2757y));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f2751r >= 2) {
            if (menuItem instanceof q) {
                q qVar = (q) menuItem;
                qVar.f3218x = (qVar.f3218x & -5) | 4;
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                try {
                    Method method = wVar.f3230e;
                    b bVar = wVar.f3229d;
                    if (method == null) {
                        wVar.f3230e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    wVar.f3230e.invoke(bVar, new Object[]{Boolean.TRUE});
                } catch (Exception e6) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
                }
            }
        }
        String str2 = this.f2756x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, l.f2759e, lVar.f2761a));
            z5 = true;
        }
        int i6 = this.w;
        if (i6 > 0) {
            if (!z5) {
                menuItem.setActionView(i6);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        r rVar = this.f2758z;
        if (rVar != null) {
            if (menuItem instanceof b) {
                ((b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z6 = menuItem instanceof b;
        if (z6) {
            ((b) menuItem).setContentDescription(charSequence);
        } else {
            n.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z6) {
            ((b) menuItem).setTooltipText(charSequence2);
        } else {
            n.m(menuItem, charSequence2);
        }
        char c6 = this.f2747n;
        int i7 = this.f2748o;
        if (z6) {
            ((b) menuItem).setAlphabeticShortcut(c6, i7);
        } else {
            n.g(menuItem, c6, i7);
        }
        char c7 = this.f2749p;
        int i8 = this.f2750q;
        if (z6) {
            ((b) menuItem).setNumericShortcut(c7, i8);
        } else {
            n.k(menuItem, c7, i8);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z6) {
                ((b) menuItem).setIconTintMode(mode);
            } else {
                n.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList == null) {
            return;
        }
        if (z6) {
            ((b) menuItem).setIconTintList(colorStateList);
        } else {
            n.i(menuItem, colorStateList);
        }
    }
}
