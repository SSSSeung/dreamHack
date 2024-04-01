package com.google.android.material.sidesheet;

import a2.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.o;
import c3.d;
import com.theori.dreamdrm.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l0.a;
import p3.g;
import p3.j;
import p3.k;
import q3.b;
import q3.c;
import x0.d0;
import x0.g0;
import x0.j0;
import x0.u0;
import y0.h;

public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a  reason: collision with root package name */
    public q3.a f1994a;

    /* renamed from: b  reason: collision with root package name */
    public g f1995b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f1996c;

    /* renamed from: d  reason: collision with root package name */
    public final k f1997d;

    /* renamed from: e  reason: collision with root package name */
    public final d f1998e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    public final float f1999f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2000g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f2001h = 5;

    /* renamed from: i  reason: collision with root package name */
    public f1.d f2002i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2003j;

    /* renamed from: k  reason: collision with root package name */
    public final float f2004k = 0.1f;

    /* renamed from: l  reason: collision with root package name */
    public int f2005l;

    /* renamed from: m  reason: collision with root package name */
    public int f2006m;

    /* renamed from: n  reason: collision with root package name */
    public int f2007n;

    /* renamed from: o  reason: collision with root package name */
    public int f2008o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f2009p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f2010q;

    /* renamed from: r  reason: collision with root package name */
    public int f2011r = -1;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f2012s;

    /* renamed from: t  reason: collision with root package name */
    public int f2013t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f2014u = new LinkedHashSet();

    /* renamed from: v  reason: collision with root package name */
    public final c f2015v = new c(this);

    public SideSheetBehavior() {
    }

    public final void c(l0.d dVar) {
        this.f2009p = null;
        this.f2002i = null;
    }

    public final void e() {
        this.f2009p = null;
        this.f2002i = null;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f1.d dVar;
        VelocityTracker velocityTracker;
        if (!((view.isShown() || u0.d(view) != null) && this.f2000g)) {
            this.f2003j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2012s) != null) {
            velocityTracker.recycle();
            this.f2012s = null;
        }
        if (this.f2012s == null) {
            this.f2012s = VelocityTracker.obtain();
        }
        this.f2012s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2013t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2003j) {
            this.f2003j = false;
            return false;
        }
        return !this.f2003j && (dVar = this.f2002i) != null && dVar.r(motionEvent);
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        int i6;
        View findViewById;
        j jVar;
        WeakHashMap weakHashMap = u0.f5622a;
        if (d0.b(coordinatorLayout) && !d0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int i7 = 0;
        if (this.f2009p == null) {
            this.f2009p = new WeakReference(view);
            Context context = view.getContext();
            com.bumptech.glide.c.E(context, R.attr.motionEasingStandardDecelerateInterpolator, z0.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            com.bumptech.glide.c.D(context, R.attr.motionDurationMedium2, 300);
            com.bumptech.glide.c.D(context, R.attr.motionDurationShort3, 150);
            com.bumptech.glide.c.D(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            g gVar = this.f1995b;
            if (gVar != null) {
                d0.q(view, gVar);
                g gVar2 = this.f1995b;
                float f6 = this.f1999f;
                if (f6 == -1.0f) {
                    f6 = j0.i(view);
                }
                gVar2.i(f6);
            } else {
                ColorStateList colorStateList = this.f1996c;
                if (colorStateList != null) {
                    j0.q(view, colorStateList);
                }
            }
            int i8 = this.f2001h == 5 ? 4 : 0;
            if (view.getVisibility() != i8) {
                view.setVisibility(i8);
            }
            u();
            if (d0.c(view) == 0) {
                d0.s(view, 1);
            }
            if (u0.d(view) == null) {
                u0.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i9 = Gravity.getAbsoluteGravity(((l0.d) view.getLayoutParams()).f4055c, i3) == 3 ? 1 : 0;
        q3.a aVar = this.f1994a;
        if (aVar == null || aVar.c0() != i9) {
            k kVar = this.f1997d;
            if (i9 == 0) {
                this.f1994a = new q3.a(this, 1);
                if (kVar != null) {
                    l0.d r5 = r();
                    if (!(r5 != null && r5.rightMargin > 0)) {
                        jVar = new j(kVar);
                        jVar.f4794f = new p3.a(0.0f);
                        jVar.f4795g = new p3.a(0.0f);
                    }
                }
            } else if (i9 == 1) {
                this.f1994a = new q3.a(this, 0);
                if (kVar != null) {
                    l0.d r6 = r();
                    if (!(r6 != null && r6.leftMargin > 0)) {
                        jVar = new j(kVar);
                        jVar.f4793e = new p3.a(0.0f);
                        jVar.f4796h = new p3.a(0.0f);
                    }
                }
            } else {
                throw new IllegalArgumentException("Invalid sheet edge position value: " + i9 + ". Must be 0 or 1.");
            }
            k kVar2 = new k(jVar);
            g gVar3 = this.f1995b;
            if (gVar3 != null) {
                gVar3.setShapeAppearanceModel(kVar2);
            }
        }
        if (this.f2002i == null) {
            this.f2002i = new f1.d(coordinatorLayout.getContext(), coordinatorLayout, this.f2015v);
        }
        int a02 = this.f1994a.a0(view);
        coordinatorLayout.q(view, i3);
        this.f2006m = coordinatorLayout.getWidth();
        this.f2007n = this.f1994a.b0(coordinatorLayout);
        this.f2005l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2008o = marginLayoutParams != null ? this.f1994a.W(marginLayoutParams) : 0;
        int i10 = this.f2001h;
        if (i10 == 1 || i10 == 2) {
            i7 = a02 - this.f1994a.a0(view);
        } else if (i10 != 3) {
            if (i10 == 5) {
                i7 = this.f1994a.Z();
            } else {
                throw new IllegalStateException("Unexpected value: " + this.f2001h);
            }
        }
        view.offsetLeftAndRight(i7);
        if (!(this.f2010q != null || (i6 = this.f2011r) == -1 || (findViewById = coordinatorLayout.findViewById(i6)) == null)) {
            this.f2010q = new WeakReference(findViewById);
        }
        for (Object o5 : this.f2014u) {
            m.o(o5);
        }
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    public final void m(View view, Parcelable parcelable) {
        int i3 = ((q3.d) parcelable).f4907f;
        if (i3 == 1 || i3 == 2) {
            i3 = 5;
        }
        this.f2001h = i3;
    }

    public final Parcelable n(View view) {
        return new q3.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z5 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.f2001h;
        if (i3 == 1 && actionMasked == 0) {
            return true;
        }
        f1.d dVar = this.f2002i;
        if (dVar != null && (this.f2000g || i3 == 1)) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2012s) != null) {
            velocityTracker.recycle();
            this.f2012s = null;
        }
        if (this.f2012s == null) {
            this.f2012s = VelocityTracker.obtain();
        }
        this.f2012s.addMovement(motionEvent);
        f1.d dVar2 = this.f2002i;
        if ((dVar2 != null && (this.f2000g || this.f2001h == 1)) && actionMasked == 2 && !this.f2003j) {
            if ((dVar2 != null && (this.f2000g || this.f2001h == 1)) && Math.abs(((float) this.f2013t) - motionEvent.getX()) > ((float) this.f2002i.f2618b)) {
                z5 = true;
            }
            if (z5) {
                this.f2002i.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2003j;
    }

    public final l0.d r() {
        View view;
        WeakReference weakReference = this.f2009p;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof l0.d)) {
            return null;
        }
        return (l0.d) view.getLayoutParams();
    }

    public final void s(int i3) {
        View view;
        if (this.f2001h != i3) {
            this.f2001h = i3;
            WeakReference weakReference = this.f2009p;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i6 = this.f2001h == 5 ? 4 : 0;
                if (view.getVisibility() != i6) {
                    view.setVisibility(i6);
                }
                Iterator it = this.f2014u.iterator();
                if (!it.hasNext()) {
                    u();
                } else {
                    m.o(it.next());
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r1.q(r0, r4.getTop()) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r4 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 3
            if (r5 == r0) goto L_0x0019
            r0 = 5
            if (r5 != r0) goto L_0x000d
            q3.a r0 = r3.f1994a
            int r0 = r0.Z()
            goto L_0x001f
        L_0x000d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid state to get outer edge offset: "
            java.lang.String r5 = a2.m.g(r6, r5)
            r4.<init>(r5)
            throw r4
        L_0x0019:
            q3.a r0 = r3.f1994a
            int r0 = r0.Y()
        L_0x001f:
            f1.d r1 = r3.f2002i
            r2 = 0
            if (r1 == 0) goto L_0x004e
            if (r6 == 0) goto L_0x0031
            int r4 = r4.getTop()
            boolean r4 = r1.q(r0, r4)
            if (r4 == 0) goto L_0x004e
            goto L_0x004d
        L_0x0031:
            int r6 = r4.getTop()
            r1.f2634r = r4
            r4 = -1
            r1.f2619c = r4
            boolean r4 = r1.i(r0, r6, r2, r2)
            if (r4 != 0) goto L_0x004b
            int r6 = r1.f2617a
            if (r6 != 0) goto L_0x004b
            android.view.View r6 = r1.f2634r
            if (r6 == 0) goto L_0x004b
            r6 = 0
            r1.f2634r = r6
        L_0x004b:
            if (r4 == 0) goto L_0x004e
        L_0x004d:
            r2 = 1
        L_0x004e:
            if (r2 == 0) goto L_0x005a
            r4 = 2
            r3.s(r4)
            c3.d r4 = r3.f1998e
            r4.a(r5)
            goto L_0x005d
        L_0x005a:
            r3.s(r5)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f2009p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            u0.i(view, 262144);
            u0.g(view, 0);
            u0.i(view, 1048576);
            u0.g(view, 0);
            if (this.f2001h != 5) {
                u0.j(view, h.f5788j, new b(this, 5));
            }
            if (this.f2001h != 3) {
                u0.j(view, h.f5786h, new b(this, 3));
            }
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.a.f5841v);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1996c = o.u(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f1997d = new k(k.b(context, attributeSet, 0, 2131755977));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2011r = resourceId;
            WeakReference weakReference = this.f2010q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2010q = null;
            WeakReference weakReference2 = this.f2009p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    if (g0.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f1997d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1995b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1996c;
            if (colorStateList != null) {
                this.f1995b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f1995b.setTint(typedValue.data);
            }
        }
        this.f1999f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2000g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
