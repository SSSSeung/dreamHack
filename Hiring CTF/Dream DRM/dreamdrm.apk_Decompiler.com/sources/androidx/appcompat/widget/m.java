package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.theori.dreamdrm.R;
import e.n0;
import h.b0;
import h.c0;
import h.d0;
import h.e0;
import h.o;
import h.q;
import h.r;
import java.util.ArrayList;

public final class m implements c0 {

    /* renamed from: d  reason: collision with root package name */
    public final Context f656d;

    /* renamed from: e  reason: collision with root package name */
    public Context f657e;

    /* renamed from: f  reason: collision with root package name */
    public o f658f;

    /* renamed from: g  reason: collision with root package name */
    public final LayoutInflater f659g;

    /* renamed from: h  reason: collision with root package name */
    public b0 f660h;

    /* renamed from: i  reason: collision with root package name */
    public final int f661i = R.layout.abc_action_menu_layout;

    /* renamed from: j  reason: collision with root package name */
    public final int f662j = R.layout.abc_action_menu_item_layout;

    /* renamed from: k  reason: collision with root package name */
    public e0 f663k;

    /* renamed from: l  reason: collision with root package name */
    public l f664l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f665m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f666n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f667o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f668p;

    /* renamed from: q  reason: collision with root package name */
    public int f669q;

    /* renamed from: r  reason: collision with root package name */
    public int f670r;

    /* renamed from: s  reason: collision with root package name */
    public int f671s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f672t;

    /* renamed from: u  reason: collision with root package name */
    public final SparseBooleanArray f673u = new SparseBooleanArray();

    /* renamed from: v  reason: collision with root package name */
    public h f674v;
    public h w;

    /* renamed from: x  reason: collision with root package name */
    public j f675x;

    /* renamed from: y  reason: collision with root package name */
    public i f676y;

    /* renamed from: z  reason: collision with root package name */
    public final n0 f677z = new n0(4, (Object) this);

    public m(Context context) {
        this.f656d = context;
        this.f659g = LayoutInflater.from(context);
    }

    public final View a(q qVar, View view, ViewGroup viewGroup) {
        View actionView = qVar.getActionView();
        int i3 = 0;
        if (actionView == null || qVar.e()) {
            d0 d0Var = view instanceof d0 ? (d0) view : (d0) this.f659g.inflate(this.f662j, viewGroup, false);
            d0Var.d(qVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) d0Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f663k);
            if (this.f676y == null) {
                this.f676y = new i(this);
            }
            actionMenuItemView.setPopupCallback(this.f676y);
            actionView = (View) d0Var;
        }
        if (qVar.C) {
            i3 = 8;
        }
        actionView.setVisibility(i3);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    public final void b(o oVar, boolean z5) {
        f();
        h hVar = this.w;
        if (hVar != null && hVar.b()) {
            hVar.f3094j.dismiss();
        }
        b0 b0Var = this.f660h;
        if (b0Var != null) {
            b0Var.b(oVar, z5);
        }
    }

    public final void c(b0 b0Var) {
        this.f660h = b0Var;
    }

    public final void d(Context context, o oVar) {
        this.f657e = context;
        LayoutInflater.from(context);
        this.f658f = oVar;
        Resources resources = context.getResources();
        if (!this.f668p) {
            this.f667o = true;
        }
        int i3 = 2;
        this.f669q = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i6 > 600 || ((i6 > 960 && i7 > 720) || (i6 > 720 && i7 > 960))) {
            i3 = 5;
        } else if (i6 >= 500 || ((i6 > 640 && i7 > 480) || (i6 > 480 && i7 > 640))) {
            i3 = 4;
        } else if (i6 >= 360) {
            i3 = 3;
        }
        this.f671s = i3;
        int i8 = this.f669q;
        if (this.f667o) {
            if (this.f664l == null) {
                l lVar = new l(this, this.f656d);
                this.f664l = lVar;
                if (this.f666n) {
                    lVar.setImageDrawable(this.f665m);
                    this.f665m = null;
                    this.f666n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f664l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i8 -= this.f664l.getMeasuredWidth();
        } else {
            this.f664l = null;
        }
        this.f670r = i8;
        float f6 = resources.getDisplayMetrics().density;
    }

    public final boolean e() {
        int i3;
        ArrayList arrayList;
        int i6;
        boolean z5;
        o oVar = this.f658f;
        if (oVar != null) {
            arrayList = oVar.l();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i7 = this.f671s;
        int i8 = this.f670r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f663k;
        int i9 = 0;
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = 2;
            z5 = true;
            if (i9 >= i3) {
                break;
            }
            q qVar = (q) arrayList.get(i9);
            int i12 = qVar.f3219y;
            if ((i12 & 2) == 2) {
                i10++;
            } else {
                if ((i12 & 1) == 1) {
                    i11++;
                } else {
                    z6 = true;
                }
            }
            if (this.f672t && qVar.C) {
                i7 = 0;
            }
            i9++;
        }
        if (this.f667o && (z6 || i11 + i10 > i7)) {
            i7--;
        }
        int i13 = i7 - i10;
        SparseBooleanArray sparseBooleanArray = this.f673u;
        sparseBooleanArray.clear();
        int i14 = 0;
        int i15 = 0;
        while (i14 < i3) {
            q qVar2 = (q) arrayList.get(i14);
            int i16 = qVar2.f3219y;
            boolean z7 = (i16 & 2) == i6 ? z5 : false;
            int i17 = qVar2.f3197b;
            if (z7) {
                View a6 = a(qVar2, (View) null, viewGroup);
                a6.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a6.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z5);
                }
                qVar2.g(z5);
            } else {
                if ((i16 & true) == z5 ? z5 : false) {
                    boolean z8 = sparseBooleanArray.get(i17);
                    boolean z9 = ((i13 > 0 || z8) && i8 > 0) ? z5 : false;
                    if (z9) {
                        View a7 = a(qVar2, (View) null, viewGroup);
                        a7.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a7.getMeasuredWidth();
                        i8 -= measuredWidth2;
                        if (i15 == 0) {
                            i15 = measuredWidth2;
                        }
                        z9 &= i8 + i15 > 0;
                    }
                    if (z9 && i17 != 0) {
                        sparseBooleanArray.put(i17, true);
                    } else if (z8) {
                        sparseBooleanArray.put(i17, false);
                        for (int i18 = 0; i18 < i14; i18++) {
                            q qVar3 = (q) arrayList.get(i18);
                            if (qVar3.f3197b == i17) {
                                if (qVar3.f()) {
                                    i13++;
                                }
                                qVar3.g(false);
                            }
                        }
                    }
                    if (z9) {
                        i13--;
                    }
                    qVar2.g(z9);
                } else {
                    qVar2.g(false);
                    i14++;
                    i6 = 2;
                    z5 = true;
                }
            }
            i14++;
            i6 = 2;
            z5 = true;
        }
        return z5;
    }

    public final boolean f() {
        e0 e0Var;
        j jVar = this.f675x;
        if (jVar == null || (e0Var = this.f663k) == null) {
            h hVar = this.f674v;
            if (hVar == null) {
                return false;
            }
            if (hVar.b()) {
                hVar.f3094j.dismiss();
            }
            return true;
        }
        ((View) e0Var).removeCallbacks(jVar);
        this.f675x = null;
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean g(q qVar) {
        return false;
    }

    public final void h() {
        e0 e0Var;
        int i3;
        boolean z5;
        ViewGroup viewGroup = (ViewGroup) this.f663k;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            o oVar = this.f658f;
            if (oVar != null) {
                oVar.i();
                ArrayList l6 = this.f658f.l();
                int size = l6.size();
                i3 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    q qVar = (q) l6.get(i6);
                    if (qVar.f()) {
                        View childAt = viewGroup.getChildAt(i3);
                        q itemData = childAt instanceof d0 ? ((d0) childAt).getItemData() : null;
                        View a6 = a(qVar, childAt, viewGroup);
                        if (qVar != itemData) {
                            a6.setPressed(false);
                            a6.jumpDrawablesToCurrentState();
                        }
                        if (a6 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a6.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a6);
                            }
                            ((ViewGroup) this.f663k).addView(a6, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.f664l) {
                    z5 = false;
                } else {
                    viewGroup.removeViewAt(i3);
                    z5 = true;
                }
                if (!z5) {
                    i3++;
                }
            }
        }
        ((View) this.f663k).requestLayout();
        o oVar2 = this.f658f;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f3178i;
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                r rVar = ((q) arrayList2.get(i7)).A;
            }
        }
        o oVar3 = this.f658f;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f3179j;
        }
        if (this.f667o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((q) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        l lVar = this.f664l;
        if (z6) {
            if (lVar == null) {
                this.f664l = new l(this, this.f656d);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f664l.getParent();
            if (viewGroup3 != this.f663k) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f664l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f663k;
                l lVar2 = this.f664l;
                actionMenuView.getClass();
                o oVar4 = new o();
                oVar4.gravity = 16;
                oVar4.f690a = true;
                actionMenuView.addView(lVar2, oVar4);
            }
        } else if (lVar != null && lVar.getParent() == (e0Var = this.f663k)) {
            ((ViewGroup) e0Var).removeView(this.f664l);
        }
        ((ActionMenuView) this.f663k).setOverflowReserved(this.f667o);
    }

    public final /* bridge */ /* synthetic */ boolean i(q qVar) {
        return false;
    }

    public final boolean j() {
        h hVar = this.f674v;
        return hVar != null && hVar.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(h.i0 r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            h.o r2 = r0.f3154z
            h.o r3 = r8.f658f
            if (r2 == r3) goto L_0x0013
            r0 = r2
            h.i0 r0 = (h.i0) r0
            goto L_0x0009
        L_0x0013:
            h.e0 r2 = r8.f663k
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            int r3 = r2.getChildCount()
            r4 = r1
        L_0x001f:
            if (r4 >= r3) goto L_0x0038
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof h.d0
            if (r6 == 0) goto L_0x0035
            r6 = r5
            h.d0 r6 = (h.d0) r6
            h.q r6 = r6.getItemData()
            h.q r7 = r0.A
            if (r6 != r7) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 != 0) goto L_0x003c
            return r1
        L_0x003c:
            h.q r0 = r9.A
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L_0x0046:
            r3 = 1
            if (r2 >= r0) goto L_0x005e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x005b
            r0 = r3
            goto L_0x005f
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005e:
            r0 = r1
        L_0x005f:
            androidx.appcompat.widget.h r2 = new androidx.appcompat.widget.h
            android.content.Context r4 = r8.f657e
            r2.<init>((androidx.appcompat.widget.m) r8, (android.content.Context) r4, (h.i0) r9, (android.view.View) r5)
            r8.w = r2
            r2.f3092h = r0
            h.x r2 = r2.f3094j
            if (r2 == 0) goto L_0x0071
            r2.o(r0)
        L_0x0071:
            androidx.appcompat.widget.h r0 = r8.w
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x007b
        L_0x0079:
            r1 = r3
            goto L_0x0084
        L_0x007b:
            android.view.View r2 = r0.f3090f
            if (r2 != 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            r0.d(r1, r1, r1, r1)
            goto L_0x0079
        L_0x0084:
            if (r1 == 0) goto L_0x008e
            h.b0 r0 = r8.f660h
            if (r0 == 0) goto L_0x008d
            r0.i(r9)
        L_0x008d:
            return r3
        L_0x008e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m.k(h.i0):boolean");
    }

    public final boolean l() {
        o oVar;
        if (this.f667o && !j() && (oVar = this.f658f) != null && this.f663k != null && this.f675x == null) {
            oVar.i();
            if (!oVar.f3179j.isEmpty()) {
                j jVar = new j((Object) this, 0, (Object) new h(this, this.f657e, this.f658f, this.f664l));
                this.f675x = jVar;
                ((View) this.f663k).post(jVar);
                return true;
            }
        }
        return false;
    }
}
