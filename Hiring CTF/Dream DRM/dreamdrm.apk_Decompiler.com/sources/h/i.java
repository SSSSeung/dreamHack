package h;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.q2;
import androidx.appcompat.widget.u2;
import com.theori.dreamdrm.R;
import e.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import x0.e0;
import x0.u0;

public final class i extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public b0 A;
    public ViewTreeObserver B;
    public PopupWindow.OnDismissListener C;
    public boolean D;

    /* renamed from: e  reason: collision with root package name */
    public final Context f3133e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3134f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3135g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3136h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3137i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f3138j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f3139k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f3140l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final e f3141m;

    /* renamed from: n  reason: collision with root package name */
    public final f f3142n;

    /* renamed from: o  reason: collision with root package name */
    public final n0 f3143o;

    /* renamed from: p  reason: collision with root package name */
    public int f3144p;

    /* renamed from: q  reason: collision with root package name */
    public int f3145q;

    /* renamed from: r  reason: collision with root package name */
    public View f3146r;

    /* renamed from: s  reason: collision with root package name */
    public View f3147s;

    /* renamed from: t  reason: collision with root package name */
    public int f3148t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3149u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3150v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public int f3151x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3152y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3153z;

    public i(Context context, View view, int i3, int i6, boolean z5) {
        int i7 = 0;
        this.f3141m = new e(0, this);
        this.f3142n = new f(0, this);
        this.f3143o = new n0(2, (Object) this);
        this.f3144p = 0;
        this.f3145q = 0;
        this.f3133e = context;
        this.f3146r = view;
        this.f3135g = i3;
        this.f3136h = i6;
        this.f3137i = z5;
        this.f3152y = false;
        WeakHashMap weakHashMap = u0.f5622a;
        this.f3148t = e0.d(view) != 1 ? 1 : i7;
        Resources resources = context.getResources();
        this.f3134f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3138j = new Handler();
    }

    public final boolean a() {
        ArrayList arrayList = this.f3140l;
        return arrayList.size() > 0 && ((h) arrayList.get(0)).f3111a.a();
    }

    public final void b(o oVar, boolean z5) {
        int i3;
        ArrayList arrayList = this.f3140l;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (oVar == ((h) arrayList.get(i6)).f3112b) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int i7 = i6 + 1;
            if (i7 < arrayList.size()) {
                ((h) arrayList.get(i7)).f3112b.c(false);
            }
            h hVar = (h) arrayList.remove(i6);
            hVar.f3112b.r(this);
            boolean z6 = this.D;
            u2 u2Var = hVar.f3111a;
            if (z6) {
                q2.b(u2Var.C, (Transition) null);
                u2Var.C.setAnimationStyle(0);
            }
            u2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                i3 = ((h) arrayList.get(size2 - 1)).f3113c;
            } else {
                View view = this.f3146r;
                WeakHashMap weakHashMap = u0.f5622a;
                i3 = e0.d(view) == 1 ? 0 : 1;
            }
            this.f3148t = i3;
            if (size2 == 0) {
                dismiss();
                b0 b0Var = this.A;
                if (b0Var != null) {
                    b0Var.b(oVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.B;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.B.removeGlobalOnLayoutListener(this.f3141m);
                    }
                    this.B = null;
                }
                this.f3147s.removeOnAttachStateChangeListener(this.f3142n);
                this.C.onDismiss();
            } else if (z5) {
                ((h) arrayList.get(0)).f3112b.c(false);
            }
        }
    }

    public final void c(b0 b0Var) {
        this.A = b0Var;
    }

    public final void dismiss() {
        ArrayList arrayList = this.f3140l;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    h hVar = hVarArr[size];
                    if (hVar.f3111a.a()) {
                        hVar.f3111a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f() {
        if (!a()) {
            ArrayList arrayList = this.f3139k;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((o) it.next());
            }
            arrayList.clear();
            View view = this.f3146r;
            this.f3147s = view;
            if (view != null) {
                boolean z5 = this.B == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.B = viewTreeObserver;
                if (z5) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f3141m);
                }
                this.f3147s.addOnAttachStateChangeListener(this.f3142n);
            }
        }
    }

    public final void h() {
        Iterator it = this.f3140l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).f3111a.f698f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    public final b2 j() {
        ArrayList arrayList = this.f3140l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) arrayList.get(arrayList.size() - 1)).f3111a.f698f;
    }

    public final boolean k(i0 i0Var) {
        Iterator it = this.f3140l.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (i0Var == hVar.f3112b) {
                hVar.f3111a.f698f.requestFocus();
                return true;
            }
        }
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        l(i0Var);
        b0 b0Var = this.A;
        if (b0Var != null) {
            b0Var.i(i0Var);
        }
        return true;
    }

    public final void l(o oVar) {
        oVar.b(this, this.f3133e);
        if (a()) {
            v(oVar);
        } else {
            this.f3139k.add(oVar);
        }
    }

    public final void n(View view) {
        if (this.f3146r != view) {
            this.f3146r = view;
            int i3 = this.f3144p;
            WeakHashMap weakHashMap = u0.f5622a;
            this.f3145q = Gravity.getAbsoluteGravity(i3, e0.d(view));
        }
    }

    public final void o(boolean z5) {
        this.f3152y = z5;
    }

    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f3140l;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                hVar = null;
                break;
            }
            hVar = (h) arrayList.get(i3);
            if (!hVar.f3111a.a()) {
                break;
            }
            i3++;
        }
        if (hVar != null) {
            hVar.f3112b.c(false);
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
        if (this.f3144p != i3) {
            this.f3144p = i3;
            View view = this.f3146r;
            WeakHashMap weakHashMap = u0.f5622a;
            this.f3145q = Gravity.getAbsoluteGravity(i3, e0.d(view));
        }
    }

    public final void q(int i3) {
        this.f3149u = true;
        this.w = i3;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.C = onDismissListener;
    }

    public final void s(boolean z5) {
        this.f3153z = z5;
    }

    public final void t(int i3) {
        this.f3150v = true;
        this.f3151x = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(h.o r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r0.f3133e
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            h.l r4 = new h.l
            boolean r5 = r0.f3137i
            r6 = 2131427339(0x7f0b000b, float:1.8476291E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r18.a()
            r6 = 1
            if (r5 != 0) goto L_0x0022
            boolean r5 = r0.f3152y
            if (r5 == 0) goto L_0x0022
            r4.f3165f = r6
            goto L_0x002e
        L_0x0022:
            boolean r5 = r18.a()
            if (r5 == 0) goto L_0x002e
            boolean r5 = h.x.u(r19)
            r4.f3165f = r5
        L_0x002e:
            int r5 = r0.f3134f
            int r5 = h.x.m(r4, r2, r5)
            androidx.appcompat.widget.u2 r7 = new androidx.appcompat.widget.u2
            int r8 = r0.f3135g
            int r9 = r0.f3136h
            r7.<init>(r2, r8, r9)
            e.n0 r2 = r0.f3143o
            r7.F = r2
            r7.f711s = r0
            androidx.appcompat.widget.g0 r2 = r7.C
            r2.setOnDismissListener(r0)
            android.view.View r8 = r0.f3146r
            r7.f710r = r8
            int r8 = r0.f3145q
            r7.f707o = r8
            r7.B = r6
            r2.setFocusable(r6)
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.o(r4)
            r7.r(r5)
            int r4 = r0.f3145q
            r7.f707o = r4
            java.util.ArrayList r4 = r0.f3140l
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x00e0
            int r9 = r4.size()
            int r9 = r9 - r6
            java.lang.Object r9 = r4.get(r9)
            h.h r9 = (h.h) r9
            h.o r12 = r9.f3112b
            int r13 = r12.size()
            r14 = 0
        L_0x007d:
            if (r14 >= r13) goto L_0x0094
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto L_0x0090
            android.view.SubMenu r8 = r15.getSubMenu()
            if (r1 != r8) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            int r14 = r14 + 1
            r8 = 2
            goto L_0x007d
        L_0x0094:
            r15 = 0
        L_0x0095:
            if (r15 != 0) goto L_0x0099
        L_0x0097:
            r6 = 0
            goto L_0x00e2
        L_0x0099:
            androidx.appcompat.widget.u2 r8 = r9.f3111a
            androidx.appcompat.widget.b2 r8 = r8.f698f
            android.widget.ListAdapter r12 = r8.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b2
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            h.l r12 = (h.l) r12
            goto L_0x00b5
        L_0x00b2:
            h.l r12 = (h.l) r12
            r13 = 0
        L_0x00b5:
            int r14 = r12.getCount()
            r10 = 0
        L_0x00ba:
            r11 = -1
            if (r10 >= r14) goto L_0x00c8
            h.q r6 = r12.getItem(r10)
            if (r15 != r6) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            int r10 = r10 + 1
            r6 = 1
            goto L_0x00ba
        L_0x00c8:
            r10 = r11
        L_0x00c9:
            if (r10 != r11) goto L_0x00cc
            goto L_0x0097
        L_0x00cc:
            int r10 = r10 + r13
            int r6 = r8.getFirstVisiblePosition()
            int r10 = r10 - r6
            if (r10 < 0) goto L_0x0097
            int r6 = r8.getChildCount()
            if (r10 < r6) goto L_0x00db
            goto L_0x0097
        L_0x00db:
            android.view.View r6 = r8.getChildAt(r10)
            goto L_0x00e2
        L_0x00e0:
            r6 = 0
            r9 = 0
        L_0x00e2:
            if (r6 == 0) goto L_0x0178
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r8 > r10) goto L_0x0102
            java.lang.reflect.Method r8 = androidx.appcompat.widget.u2.G
            if (r8 == 0) goto L_0x0106
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00fa }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00fa }
            r12 = 0
            r11[r12] = r10     // Catch:{ Exception -> 0x00fa }
            r8.invoke(r2, r11)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0106
        L_0x00fa:
            java.lang.String r8 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r8, r10)
            goto L_0x0106
        L_0x0102:
            r8 = 0
            androidx.appcompat.widget.r2.a(r2, r8)
        L_0x0106:
            r8 = 0
            androidx.appcompat.widget.q2.a(r2, r8)
            int r2 = r4.size()
            r8 = 1
            int r2 = r2 - r8
            java.lang.Object r2 = r4.get(r2)
            h.h r2 = (h.h) r2
            androidx.appcompat.widget.u2 r2 = r2.f3111a
            androidx.appcompat.widget.b2 r2 = r2.f698f
            r8 = 2
            int[] r8 = new int[r8]
            r2.getLocationOnScreen(r8)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r11 = r0.f3147s
            r11.getWindowVisibleDisplayFrame(r10)
            int r11 = r0.f3148t
            r12 = 1
            r17 = 0
            if (r11 != r12) goto L_0x0140
            r8 = r8[r17]
            int r2 = r2.getWidth()
            int r2 = r2 + r8
            int r2 = r2 + r5
            int r8 = r10.right
            if (r2 <= r8) goto L_0x0145
            r2 = r17
            goto L_0x0146
        L_0x0140:
            r2 = r8[r17]
            int r2 = r2 - r5
            if (r2 >= 0) goto L_0x0148
        L_0x0145:
            r2 = 1
        L_0x0146:
            r8 = 1
            goto L_0x014a
        L_0x0148:
            r2 = 0
            goto L_0x0146
        L_0x014a:
            if (r2 != r8) goto L_0x014e
            r8 = 1
            goto L_0x014f
        L_0x014e:
            r8 = 0
        L_0x014f:
            r0.f3148t = r2
            r7.f710r = r6
            int r2 = r0.f3145q
            r10 = 5
            r2 = r2 & r10
            if (r2 != r10) goto L_0x0162
            r2 = 0
            if (r8 == 0) goto L_0x015d
            goto L_0x0169
        L_0x015d:
            int r5 = r6.getWidth()
            goto L_0x016b
        L_0x0162:
            r2 = 0
            if (r8 == 0) goto L_0x016b
            int r5 = r6.getWidth()
        L_0x0169:
            int r5 = r5 + r2
            goto L_0x016d
        L_0x016b:
            int r5 = 0 - r5
        L_0x016d:
            r7.f701i = r5
            r5 = 1
            r7.f706n = r5
            r7.f705m = r5
            r7.n(r2)
            goto L_0x0196
        L_0x0178:
            boolean r2 = r0.f3149u
            if (r2 == 0) goto L_0x0180
            int r2 = r0.w
            r7.f701i = r2
        L_0x0180:
            boolean r2 = r0.f3150v
            if (r2 == 0) goto L_0x0189
            int r2 = r0.f3151x
            r7.n(r2)
        L_0x0189:
            android.graphics.Rect r2 = r0.f3231d
            if (r2 == 0) goto L_0x0193
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r2)
            goto L_0x0194
        L_0x0193:
            r8 = 0
        L_0x0194:
            r7.A = r8
        L_0x0196:
            h.h r2 = new h.h
            int r5 = r0.f3148t
            r2.<init>(r7, r1, r5)
            r4.add(r2)
            r7.f()
            androidx.appcompat.widget.b2 r2 = r7.f698f
            r2.setOnKeyListener(r0)
            if (r9 != 0) goto L_0x01d4
            boolean r4 = r0.f3153z
            if (r4 == 0) goto L_0x01d4
            java.lang.CharSequence r4 = r1.f3182m
            if (r4 == 0) goto L_0x01d4
            r4 = 2131427346(0x7f0b0012, float:1.8476306E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r2, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r5)
            java.lang.CharSequence r1 = r1.f3182m
            r4.setText(r1)
            r1 = 0
            r2.addHeaderView(r3, r1, r5)
            r7.f()
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.i.v(h.o):void");
    }
}
