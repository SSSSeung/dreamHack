package e;

import a2.m;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import g.p;
import g.q;
import h.o;
import java.util.ArrayList;
import java.util.List;

public final class y implements Window.Callback {

    /* renamed from: d  reason: collision with root package name */
    public final Window.Callback f2454d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2455e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2456f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2457g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e0 f2458h;

    public y(e0 e0Var, Window.Callback callback) {
        this.f2458h = e0Var;
        if (callback != null) {
            this.f2454d = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.f2455e = true;
            callback.onContentChanged();
            this.f2455e = false;
        } catch (Throwable th) {
            this.f2455e = false;
            throw th;
        }
    }

    /* renamed from: b */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2454d.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean c(KeyEvent keyEvent) {
        return this.f2454d.dispatchKeyEvent(keyEvent);
    }

    public final boolean d(KeyEvent keyEvent) {
        return this.f2454d.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2456f ? this.f2454d.dispatchKeyEvent(keyEvent) : this.f2458h.v(keyEvent) || c(keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r0 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r7 != false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.d(r7)
            r1 = 1
            if (r0 != 0) goto L_0x006e
            int r0 = r7.getKeyCode()
            e.e0 r2 = r6.f2458h
            r2.C()
            e.s0 r3 = r2.f2337r
            r4 = 0
            if (r3 == 0) goto L_0x003b
            e.r0 r3 = r3.f2438o
            if (r3 != 0) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            h.o r3 = r3.f2424g
            if (r3 == 0) goto L_0x0037
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L_0x002e
            r5 = r1
            goto L_0x002f
        L_0x002e:
            r5 = r4
        L_0x002f:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
            goto L_0x0038
        L_0x0037:
            r0 = r4
        L_0x0038:
            if (r0 == 0) goto L_0x003b
            goto L_0x0067
        L_0x003b:
            e.d0 r0 = r2.Q
            if (r0 == 0) goto L_0x0050
            int r3 = r7.getKeyCode()
            boolean r0 = r2.G(r0, r3, r7)
            if (r0 == 0) goto L_0x0050
            e.d0 r7 = r2.Q
            if (r7 == 0) goto L_0x0067
            r7.f2312l = r1
            goto L_0x0067
        L_0x0050:
            e.d0 r0 = r2.Q
            if (r0 != 0) goto L_0x0069
            e.d0 r0 = r2.A(r4)
            r2.H(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.G(r0, r3, r7)
            r0.f2311k = r4
            if (r7 == 0) goto L_0x0069
        L_0x0067:
            r7 = r1
            goto L_0x006a
        L_0x0069:
            r7 = r4
        L_0x006a:
            if (r7 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = r4
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.y.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    /* renamed from: e */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2454d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: f */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2454d.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: g */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2454d.dispatchTrackballEvent(motionEvent);
    }

    /* renamed from: h */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2454d.onActionModeFinished(actionMode);
    }

    /* renamed from: i */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2454d.onActionModeStarted(actionMode);
    }

    /* renamed from: j */
    public final void onAttachedToWindow() {
        this.f2454d.onAttachedToWindow();
    }

    public final boolean k(int i3, Menu menu) {
        return this.f2454d.onCreatePanelMenu(i3, menu);
    }

    public final View l(int i3) {
        return this.f2454d.onCreatePanelView(i3);
    }

    /* renamed from: m */
    public final void onDetachedFromWindow() {
        this.f2454d.onDetachedFromWindow();
    }

    /* renamed from: n */
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.f2454d.onMenuItemSelected(i3, menuItem);
    }

    public final boolean o(int i3, Menu menu) {
        return this.f2454d.onMenuOpened(i3, menu);
    }

    public final void onContentChanged() {
        if (this.f2455e) {
            this.f2454d.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0 || (menu instanceof o)) {
            return k(i3, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i3) {
        return l(i3);
    }

    public final boolean onMenuOpened(int i3, Menu menu) {
        o(i3, menu);
        e0 e0Var = this.f2458h;
        if (i3 == 108) {
            e0Var.C();
            s0 s0Var = e0Var.f2337r;
            if (!(s0Var == null || true == s0Var.f2441r)) {
                s0Var.f2441r = true;
                ArrayList arrayList = s0Var.f2442s;
                if (arrayList.size() > 0) {
                    m.o(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            e0Var.getClass();
        }
        return true;
    }

    public final void onPanelClosed(int i3, Menu menu) {
        if (this.f2457g) {
            this.f2454d.onPanelClosed(i3, menu);
            return;
        }
        p(i3, menu);
        e0 e0Var = this.f2458h;
        if (i3 == 108) {
            e0Var.C();
            s0 s0Var = e0Var.f2337r;
            if (s0Var != null && s0Var.f2441r) {
                s0Var.f2441r = false;
                ArrayList arrayList = s0Var.f2442s;
                if (arrayList.size() > 0) {
                    m.o(arrayList.get(0));
                    throw null;
                }
            }
        } else if (i3 == 0) {
            d0 A = e0Var.A(i3);
            if (A.f2313m) {
                e0Var.t(A, false);
            }
        } else {
            e0Var.getClass();
        }
    }

    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        o oVar = menu instanceof o ? (o) menu : null;
        if (i3 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f3192x = true;
        }
        boolean r5 = r(i3, view, menu);
        if (oVar != null) {
            oVar.f3192x = false;
        }
        return r5;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
        o oVar = this.f2458h.A(0).f2308h;
        if (oVar != null) {
            s(list, oVar, i3);
        } else {
            s(list, menu, i3);
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final void p(int i3, Menu menu) {
        this.f2454d.onPanelClosed(i3, menu);
    }

    /* renamed from: q */
    public final void onPointerCaptureChanged(boolean z5) {
        q.a(this.f2454d, z5);
    }

    public final boolean r(int i3, View view, Menu menu) {
        return this.f2454d.onPreparePanel(i3, view, menu);
    }

    public final void s(List list, Menu menu, int i3) {
        p.a(this.f2454d, list, menu, i3);
    }

    /* renamed from: t */
    public final boolean onSearchRequested() {
        return this.f2454d.onSearchRequested();
    }

    /* renamed from: u */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return g.o.a(this.f2454d, searchEvent);
    }

    /* renamed from: v */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2454d.onWindowAttributesChanged(layoutParams);
    }

    /* renamed from: w */
    public final void onWindowFocusChanged(boolean z5) {
        this.f2454d.onWindowFocusChanged(z5);
    }

    public final ActionMode x(ActionMode.Callback callback, int i3) {
        return g.o.b(this.f2454d, callback, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        /*
            r9 = this;
            e.e0 r0 = r9.f2458h
            boolean r1 = r0.C
            if (r1 == 0) goto L_0x01f1
            if (r11 == 0) goto L_0x000a
            goto L_0x01f1
        L_0x000a:
            g.h r11 = new g.h
            android.content.Context r1 = r0.f2333n
            r11.<init>((android.content.Context) r1, (android.view.ActionMode.Callback) r10)
            g.c r10 = r0.f2342x
            if (r10 == 0) goto L_0x0018
            r10.a()
        L_0x0018:
            e.u r10 = new e.u
            r10.<init>(r0, r11)
            r0.C()
            e.s0 r1 = r0.f2337r
            r2 = 0
            r3 = 1
            r4 = 0
            e.m r5 = r0.f2336q
            if (r1 == 0) goto L_0x0073
            e.r0 r6 = r1.f2438o
            if (r6 == 0) goto L_0x0030
            r6.a()
        L_0x0030:
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r1.f2432i
            r6.setHideOnContentScrollEnabled(r2)
            androidx.appcompat.widget.ActionBarContextView r6 = r1.f2435l
            r6.e()
            e.r0 r6 = new e.r0
            androidx.appcompat.widget.ActionBarContextView r7 = r1.f2435l
            android.content.Context r7 = r7.getContext()
            r6.<init>(r1, r7, r10)
            h.o r7 = r6.f2424g
            r7.w()
            g.b r8 = r6.f2425h     // Catch:{ all -> 0x006e }
            boolean r8 = r8.c(r6, r7)     // Catch:{ all -> 0x006e }
            r7.v()
            if (r8 == 0) goto L_0x0063
            r1.f2438o = r6
            r6.i()
            androidx.appcompat.widget.ActionBarContextView r7 = r1.f2435l
            r7.c(r6)
            r1.o(r3)
            goto L_0x0064
        L_0x0063:
            r6 = r4
        L_0x0064:
            r0.f2342x = r6
            if (r6 == 0) goto L_0x0073
            if (r5 == 0) goto L_0x0073
            r5.c()
            goto L_0x0073
        L_0x006e:
            r10 = move-exception
            r7.v()
            throw r10
        L_0x0073:
            g.c r1 = r0.f2342x
            if (r1 != 0) goto L_0x01e5
            x0.g1 r1 = r0.B
            if (r1 == 0) goto L_0x007e
            r1.b()
        L_0x007e:
            g.c r1 = r0.f2342x
            if (r1 == 0) goto L_0x0085
            r1.a()
        L_0x0085:
            if (r5 == 0) goto L_0x008e
            boolean r1 = r0.U
            if (r1 != 0) goto L_0x008e
            r5.f()     // Catch:{ AbstractMethodError -> 0x008e }
        L_0x008e:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f2343y
            if (r1 != 0) goto L_0x0142
            boolean r1 = r0.M
            android.content.Context r6 = r0.f2333n
            if (r1 == 0) goto L_0x0115
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r7 = r6.getTheme()
            r8 = 2130903049(0x7f030009, float:1.7412905E38)
            r7.resolveAttribute(r8, r1, r3)
            int r8 = r1.resourceId
            if (r8 == 0) goto L_0x00c8
            android.content.res.Resources r8 = r6.getResources()
            android.content.res.Resources$Theme r8 = r8.newTheme()
            r8.setTo(r7)
            int r7 = r1.resourceId
            r8.applyStyle(r7, r3)
            g.f r7 = new g.f
            r7.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r7.getTheme()
            r6.setTo(r8)
            r6 = r7
        L_0x00c8:
            androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
            r7.<init>(r6, r4)
            r0.f2343y = r7
            android.widget.PopupWindow r7 = new android.widget.PopupWindow
            r8 = 2130903064(0x7f030018, float:1.7412935E38)
            r7.<init>(r6, r4, r8)
            r0.f2344z = r7
            r8 = 2
            b1.n.d(r7, r8)
            android.widget.PopupWindow r7 = r0.f2344z
            androidx.appcompat.widget.ActionBarContextView r8 = r0.f2343y
            r7.setContentView(r8)
            android.widget.PopupWindow r7 = r0.f2344z
            r8 = -1
            r7.setWidth(r8)
            android.content.res.Resources$Theme r7 = r6.getTheme()
            r8 = 2130903043(0x7f030003, float:1.7412893E38)
            r7.resolveAttribute(r8, r1, r3)
            int r1 = r1.data
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r6)
            androidx.appcompat.widget.ActionBarContextView r6 = r0.f2343y
            r6.setContentHeight(r1)
            android.widget.PopupWindow r1 = r0.f2344z
            r6 = -2
            r1.setHeight(r6)
            e.r r1 = new e.r
            r1.<init>(r0, r3)
            r0.A = r1
            goto L_0x0142
        L_0x0115:
            android.view.ViewGroup r1 = r0.E
            r7 = 2131230783(0x7f08003f, float:1.8077629E38)
            android.view.View r1 = r1.findViewById(r7)
            androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
            if (r1 == 0) goto L_0x0142
            r0.C()
            e.s0 r7 = r0.f2337r
            if (r7 == 0) goto L_0x012e
            android.content.Context r7 = r7.p()
            goto L_0x012f
        L_0x012e:
            r7 = r4
        L_0x012f:
            if (r7 != 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r6 = r7
        L_0x0133:
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r1.setLayoutInflater(r6)
            android.view.View r1 = r1.a()
            androidx.appcompat.widget.ActionBarContextView r1 = (androidx.appcompat.widget.ActionBarContextView) r1
            r0.f2343y = r1
        L_0x0142:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f2343y
            if (r1 == 0) goto L_0x01d5
            x0.g1 r1 = r0.B
            if (r1 == 0) goto L_0x014d
            r1.b()
        L_0x014d:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f2343y
            r1.e()
            g.g r1 = new g.g
            androidx.appcompat.widget.ActionBarContextView r6 = r0.f2343y
            android.content.Context r6 = r6.getContext()
            androidx.appcompat.widget.ActionBarContextView r7 = r0.f2343y
            r1.<init>(r6, r7, r10)
            h.o r6 = r1.f2723k
            boolean r10 = r10.c(r1, r6)
            if (r10 == 0) goto L_0x01d3
            r1.i()
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f2343y
            r10.c(r1)
            r0.f2342x = r1
            boolean r10 = r0.D
            if (r10 == 0) goto L_0x0183
            android.view.ViewGroup r10 = r0.E
            if (r10 == 0) goto L_0x0183
            java.util.WeakHashMap r1 = x0.u0.f5622a
            boolean r10 = x0.g0.c(r10)
            if (r10 == 0) goto L_0x0183
            r10 = r3
            goto L_0x0184
        L_0x0183:
            r10 = r2
        L_0x0184:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x01a2
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f2343y
            r2 = 0
            r10.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f2343y
            x0.g1 r10 = x0.u0.a(r10)
            r10.a(r1)
            r0.B = r10
            e.t r1 = new e.t
            r1.<init>(r3, r0)
            r10.d(r1)
            goto L_0x01c3
        L_0x01a2:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f2343y
            r10.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f2343y
            r10.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f2343y
            android.view.ViewParent r10 = r10.getParent()
            boolean r10 = r10 instanceof android.view.View
            if (r10 == 0) goto L_0x01c3
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f2343y
            android.view.ViewParent r10 = r10.getParent()
            android.view.View r10 = (android.view.View) r10
            java.util.WeakHashMap r1 = x0.u0.f5622a
            x0.h0.c(r10)
        L_0x01c3:
            android.widget.PopupWindow r10 = r0.f2344z
            if (r10 == 0) goto L_0x01d5
            android.view.Window r10 = r0.f2334o
            android.view.View r10 = r10.getDecorView()
            e.r r1 = r0.A
            r10.post(r1)
            goto L_0x01d5
        L_0x01d3:
            r0.f2342x = r4
        L_0x01d5:
            g.c r10 = r0.f2342x
            if (r10 == 0) goto L_0x01de
            if (r5 == 0) goto L_0x01de
            r5.c()
        L_0x01de:
            r0.J()
            g.c r10 = r0.f2342x
            r0.f2342x = r10
        L_0x01e5:
            r0.J()
            g.c r10 = r0.f2342x
            if (r10 == 0) goto L_0x01f0
            g.i r4 = r11.g(r10)
        L_0x01f0:
            return r4
        L_0x01f1:
            android.view.ActionMode r10 = r9.x(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.y.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }
}
