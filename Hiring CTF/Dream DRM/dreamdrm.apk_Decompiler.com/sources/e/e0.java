package e;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.e4;
import androidx.appcompat.widget.j4;
import androidx.appcompat.widget.t1;
import androidx.appcompat.widget.x;
import com.bumptech.glide.d;
import com.theori.dreamdrm.R;
import d.a;
import g.c;
import g.l;
import h.k;
import h.m;
import h.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.j;
import n0.b;
import t0.f;
import t0.g;
import t0.h;
import t0.i;
import x0.d0;
import x0.g0;
import x0.g1;
import x0.h2;
import x0.j0;
import x0.k0;
import x0.u0;

public final class e0 extends q implements m, LayoutInflater.Factory2 {

    /* renamed from: l0  reason: collision with root package name */
    public static final j f2318l0 = new j();

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f2319m0 = {16842836};

    /* renamed from: n0  reason: collision with root package name */
    public static final boolean f2320n0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: o0  reason: collision with root package name */
    public static final boolean f2321o0 = true;
    public r A;
    public g1 B = null;
    public final boolean C = true;
    public boolean D;
    public ViewGroup E;
    public TextView F;
    public View G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public d0[] P;
    public d0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Configuration V;
    public final int W = -100;
    public int X;
    public int Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public z f2322a0;

    /* renamed from: b0  reason: collision with root package name */
    public z f2323b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2324c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2325d0;

    /* renamed from: e0  reason: collision with root package name */
    public final r f2326e0 = new r(this, 0);
    public boolean f0;

    /* renamed from: g0  reason: collision with root package name */
    public Rect f2327g0;

    /* renamed from: h0  reason: collision with root package name */
    public Rect f2328h0;

    /* renamed from: i0  reason: collision with root package name */
    public h0 f2329i0;

    /* renamed from: j0  reason: collision with root package name */
    public OnBackInvokedDispatcher f2330j0;

    /* renamed from: k0  reason: collision with root package name */
    public OnBackInvokedCallback f2331k0;

    /* renamed from: m  reason: collision with root package name */
    public final Object f2332m;

    /* renamed from: n  reason: collision with root package name */
    public final Context f2333n;

    /* renamed from: o  reason: collision with root package name */
    public Window f2334o;

    /* renamed from: p  reason: collision with root package name */
    public y f2335p;

    /* renamed from: q  reason: collision with root package name */
    public final m f2336q;

    /* renamed from: r  reason: collision with root package name */
    public s0 f2337r;

    /* renamed from: s  reason: collision with root package name */
    public l f2338s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f2339t;

    /* renamed from: u  reason: collision with root package name */
    public t1 f2340u;

    /* renamed from: v  reason: collision with root package name */
    public s f2341v;
    public s w;

    /* renamed from: x  reason: collision with root package name */
    public c f2342x;

    /* renamed from: y  reason: collision with root package name */
    public ActionBarContextView f2343y;

    /* renamed from: z  reason: collision with root package name */
    public PopupWindow f2344z;

    public e0(Context context, Window window, m mVar, Object obj) {
        l lVar;
        this.f2333n = context;
        this.f2336q = mVar;
        this.f2332m = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof l)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        lVar = (l) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            lVar = null;
            if (lVar != null) {
                this.W = ((e0) lVar.m()).W;
            }
        }
        if (this.W == -100) {
            j jVar = f2318l0;
            Integer num = (Integer) jVar.getOrDefault(this.f2332m.getClass().getName(), (Object) null);
            if (num != null) {
                this.W = num.intValue();
                jVar.remove(this.f2332m.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        x.d();
    }

    public static g q(Context context) {
        g gVar;
        g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = q.f2412f) == null) {
            return null;
        }
        g b6 = v.b(context.getApplicationContext().getResources().getConfiguration());
        h hVar = gVar.f5087a;
        if (((i) hVar).f5088a.isEmpty()) {
            gVar2 = g.f5086b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i3 = 0;
            while (true) {
                if (i3 >= ((i) b6.f5087a).f5088a.size() + ((i) hVar).f5088a.size()) {
                    break;
                }
                Locale locale = i3 < ((i) hVar).f5088a.size() ? ((i) hVar).f5088a.get(i3) : ((i) b6.f5087a).f5088a.get(i3 - ((i) hVar).f5088a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i3++;
            }
            gVar2 = new g(new i(f.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return ((i) gVar2.f5087a).f5088a.isEmpty() ? b6 : gVar2;
    }

    public static Configuration u(Context context, int i3, g gVar, Configuration configuration, boolean z5) {
        int i6 = i3 != 1 ? i3 != 2 ? z5 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i6 | (configuration2.uiMode & -49);
        if (gVar != null) {
            v.d(configuration2, gVar);
        }
        return configuration2;
    }

    public final d0 A(int i3) {
        d0[] d0VarArr = this.P;
        if (d0VarArr == null || d0VarArr.length <= i3) {
            d0[] d0VarArr2 = new d0[(i3 + 1)];
            if (d0VarArr != null) {
                System.arraycopy(d0VarArr, 0, d0VarArr2, 0, d0VarArr.length);
            }
            this.P = d0VarArr2;
            d0VarArr = d0VarArr2;
        }
        d0 d0Var = d0VarArr[i3];
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(i3);
        d0VarArr[i3] = d0Var2;
        return d0Var2;
    }

    public final Window.Callback B() {
        return this.f2334o.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C() {
        /*
            r3 = this;
            r3.x()
            boolean r0 = r3.J
            if (r0 == 0) goto L_0x0032
            e.s0 r0 = r3.f2337r
            if (r0 == 0) goto L_0x000c
            goto L_0x0032
        L_0x000c:
            java.lang.Object r0 = r3.f2332m
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001c
            e.s0 r1 = new e.s0
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.K
            r1.<init>(r0, r2)
            goto L_0x0027
        L_0x001c:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x0029
            e.s0 r1 = new e.s0
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
        L_0x0027:
            r3.f2337r = r1
        L_0x0029:
            e.s0 r0 = r3.f2337r
            if (r0 == 0) goto L_0x0032
            boolean r1 = r3.f0
            r0.r(r1)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.C():void");
    }

    public final int D(Context context, int i3) {
        b0 b0Var;
        if (i3 == -100) {
            return -1;
        }
        if (i3 != -1) {
            if (i3 != 0) {
                if (!(i3 == 1 || i3 == 2)) {
                    if (i3 == 3) {
                        if (this.f2323b0 == null) {
                            this.f2323b0 = new z(this, context);
                        }
                        b0Var = this.f2323b0;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                b0Var = z(context);
            }
            return b0Var.e();
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E() {
        /*
            r5 = this;
            boolean r0 = r5.R
            r1 = 0
            r5.R = r1
            e.d0 r2 = r5.A(r1)
            boolean r3 = r2.f2313m
            r4 = 1
            if (r3 == 0) goto L_0x0014
            if (r0 != 0) goto L_0x0013
            r5.t(r2, r4)
        L_0x0013:
            return r4
        L_0x0014:
            g.c r0 = r5.f2342x
            if (r0 == 0) goto L_0x001c
            r0.a()
            return r4
        L_0x001c:
            r5.C()
            e.s0 r0 = r5.f2337r
            if (r0 == 0) goto L_0x0050
            androidx.appcompat.widget.u1 r0 = r0.f2434k
            if (r0 == 0) goto L_0x004c
            r2 = r0
            androidx.appcompat.widget.e4 r2 = (androidx.appcompat.widget.e4) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f562a
            androidx.appcompat.widget.a4 r2 = r2.O
            if (r2 == 0) goto L_0x0036
            h.q r2 = r2.f509e
            if (r2 == 0) goto L_0x0036
            r2 = r4
            goto L_0x0037
        L_0x0036:
            r2 = r1
        L_0x0037:
            if (r2 == 0) goto L_0x004c
            androidx.appcompat.widget.e4 r0 = (androidx.appcompat.widget.e4) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f562a
            androidx.appcompat.widget.a4 r0 = r0.O
            if (r0 != 0) goto L_0x0043
            r0 = 0
            goto L_0x0045
        L_0x0043:
            h.q r0 = r0.f509e
        L_0x0045:
            if (r0 == 0) goto L_0x004a
            r0.collapseActionView()
        L_0x004a:
            r0 = r4
            goto L_0x004d
        L_0x004c:
            r0 = r1
        L_0x004d:
            if (r0 == 0) goto L_0x0050
            return r4
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.E():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0151, code lost:
        if (r2 != null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0175, code lost:
        if (r2.f3162i.getCount() > 0) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(e.d0 r19, android.view.KeyEvent r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1.f2313m
            if (r2 != 0) goto L_0x01df
            boolean r2 = r0.U
            if (r2 == 0) goto L_0x000e
            goto L_0x01df
        L_0x000e:
            android.content.Context r2 = r0.f2333n
            r3 = 4
            r4 = 0
            r5 = 1
            int r6 = r1.f2301a
            if (r6 != 0) goto L_0x002b
            android.content.res.Resources r7 = r2.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.screenLayout
            r7 = r7 & 15
            if (r7 != r3) goto L_0x0027
            r7 = r5
            goto L_0x0028
        L_0x0027:
            r7 = r4
        L_0x0028:
            if (r7 == 0) goto L_0x002b
            return
        L_0x002b:
            android.view.Window$Callback r7 = r18.B()
            if (r7 == 0) goto L_0x003d
            h.o r8 = r1.f2308h
            boolean r7 = r7.onMenuOpened(r6, r8)
            if (r7 != 0) goto L_0x003d
            r0.t(r1, r5)
            return
        L_0x003d:
            java.lang.String r7 = "window"
            java.lang.Object r7 = r2.getSystemService(r7)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            if (r7 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r8 = r18.H(r19, r20)
            if (r8 != 0) goto L_0x004f
            return
        L_0x004f:
            e.c0 r8 = r1.f2305e
            r9 = -2
            if (r8 == 0) goto L_0x006b
            boolean r10 = r1.f2314n
            if (r10 == 0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            android.view.View r2 = r1.f2307g
            if (r2 == 0) goto L_0x01b6
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x01b6
            int r2 = r2.width
            r3 = -1
            if (r2 != r3) goto L_0x01b6
            r11 = r3
            goto L_0x01b7
        L_0x006b:
            if (r8 != 0) goto L_0x00e3
            r18.C()
            e.s0 r8 = r0.f2337r
            if (r8 == 0) goto L_0x0079
            android.content.Context r8 = r8.p()
            goto L_0x007a
        L_0x0079:
            r8 = 0
        L_0x007a:
            if (r8 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r2 = r8
        L_0x007e:
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources r10 = r2.getResources()
            android.content.res.Resources$Theme r10 = r10.newTheme()
            android.content.res.Resources$Theme r11 = r2.getTheme()
            r10.setTo(r11)
            r11 = 2130903042(0x7f030002, float:1.741289E38)
            r10.resolveAttribute(r11, r8, r5)
            int r11 = r8.resourceId
            if (r11 == 0) goto L_0x009f
            r10.applyStyle(r11, r5)
        L_0x009f:
            r11 = 2130903861(0x7f030335, float:1.7414552E38)
            r10.resolveAttribute(r11, r8, r5)
            int r8 = r8.resourceId
            if (r8 == 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r8 = 2131755541(0x7f100215, float:1.9141964E38)
        L_0x00ad:
            r10.applyStyle(r8, r5)
            g.f r8 = new g.f
            r8.<init>((android.content.Context) r2, (int) r4)
            android.content.res.Resources$Theme r2 = r8.getTheme()
            r2.setTo(r10)
            r1.f2310j = r8
            int[] r2 = d.a.f2122j
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r2)
            r8 = 86
            int r8 = r2.getResourceId(r8, r4)
            r1.f2302b = r8
            int r8 = r2.getResourceId(r5, r4)
            r1.f2304d = r8
            r2.recycle()
            e.c0 r2 = new e.c0
            g.f r8 = r1.f2310j
            r2.<init>(r0, r8)
            r1.f2305e = r2
            r2 = 81
            r1.f2303c = r2
            goto L_0x00f2
        L_0x00e3:
            boolean r2 = r1.f2314n
            if (r2 == 0) goto L_0x00f2
            int r2 = r8.getChildCount()
            if (r2 <= 0) goto L_0x00f2
            e.c0 r2 = r1.f2305e
            r2.removeAllViews()
        L_0x00f2:
            android.view.View r2 = r1.f2307g
            if (r2 == 0) goto L_0x00f9
            r1.f2306f = r2
            goto L_0x0153
        L_0x00f9:
            h.o r2 = r1.f2308h
            if (r2 != 0) goto L_0x00fe
            goto L_0x0155
        L_0x00fe:
            e.s r2 = r0.w
            if (r2 != 0) goto L_0x0109
            e.s r2 = new e.s
            r2.<init>(r0, r3)
            r0.w = r2
        L_0x0109:
            e.s r2 = r0.w
            h.k r3 = r1.f2309i
            if (r3 != 0) goto L_0x0121
            h.k r3 = new h.k
            g.f r8 = r1.f2310j
            r3.<init>(r8)
            r1.f2309i = r3
            r3.f3161h = r2
            h.o r2 = r1.f2308h
            android.content.Context r8 = r2.f3170a
            r2.b(r3, r8)
        L_0x0121:
            h.k r2 = r1.f2309i
            e.c0 r3 = r1.f2305e
            androidx.appcompat.view.menu.ExpandedMenuView r8 = r2.f3160g
            if (r8 != 0) goto L_0x014d
            android.view.LayoutInflater r8 = r2.f3158e
            r10 = 2131427341(0x7f0b000d, float:1.8476296E38)
            android.view.View r3 = r8.inflate(r10, r3, r4)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r2.f3160g = r3
            h.j r3 = r2.f3162i
            if (r3 != 0) goto L_0x0141
            h.j r3 = new h.j
            r3.<init>(r2)
            r2.f3162i = r3
        L_0x0141:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r2.f3160g
            h.j r8 = r2.f3162i
            r3.setAdapter(r8)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r2.f3160g
            r3.setOnItemClickListener(r2)
        L_0x014d:
            androidx.appcompat.view.menu.ExpandedMenuView r2 = r2.f3160g
            r1.f2306f = r2
            if (r2 == 0) goto L_0x0155
        L_0x0153:
            r2 = r5
            goto L_0x0156
        L_0x0155:
            r2 = r4
        L_0x0156:
            if (r2 == 0) goto L_0x01dd
            android.view.View r2 = r1.f2306f
            if (r2 != 0) goto L_0x015d
            goto L_0x0179
        L_0x015d:
            android.view.View r2 = r1.f2307g
            if (r2 == 0) goto L_0x0162
            goto L_0x0177
        L_0x0162:
            h.k r2 = r1.f2309i
            h.j r3 = r2.f3162i
            if (r3 != 0) goto L_0x016f
            h.j r3 = new h.j
            r3.<init>(r2)
            r2.f3162i = r3
        L_0x016f:
            h.j r2 = r2.f3162i
            int r2 = r2.getCount()
            if (r2 <= 0) goto L_0x0179
        L_0x0177:
            r2 = r5
            goto L_0x017a
        L_0x0179:
            r2 = r4
        L_0x017a:
            if (r2 != 0) goto L_0x017d
            goto L_0x01dd
        L_0x017d:
            android.view.View r2 = r1.f2306f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L_0x018a
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r9, r9)
        L_0x018a:
            int r3 = r1.f2302b
            e.c0 r8 = r1.f2305e
            r8.setBackgroundResource(r3)
            android.view.View r3 = r1.f2306f
            android.view.ViewParent r3 = r3.getParent()
            boolean r8 = r3 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x01a2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r8 = r1.f2306f
            r3.removeView(r8)
        L_0x01a2:
            e.c0 r3 = r1.f2305e
            android.view.View r8 = r1.f2306f
            r3.addView(r8, r2)
            android.view.View r2 = r1.f2306f
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L_0x01b6
            android.view.View r2 = r1.f2306f
            r2.requestFocus()
        L_0x01b6:
            r11 = r9
        L_0x01b7:
            r1.f2312l = r4
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams
            r12 = -2
            r13 = 0
            r14 = 0
            r15 = 1002(0x3ea, float:1.404E-42)
            r16 = 8519680(0x820000, float:1.1938615E-38)
            r17 = -3
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            int r3 = r1.f2303c
            r2.gravity = r3
            int r3 = r1.f2304d
            r2.windowAnimations = r3
            e.c0 r3 = r1.f2305e
            r7.addView(r3, r2)
            r1.f2313m = r5
            if (r6 != 0) goto L_0x01dc
            r18.J()
        L_0x01dc:
            return
        L_0x01dd:
            r1.f2314n = r5
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.F(e.d0, android.view.KeyEvent):void");
    }

    public final boolean G(d0 d0Var, int i3, KeyEvent keyEvent) {
        o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((d0Var.f2311k || H(d0Var, keyEvent)) && (oVar = d0Var.f2308h) != null) {
            return oVar.performShortcut(i3, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(d0 d0Var, KeyEvent keyEvent) {
        t1 t1Var;
        t1 t1Var2;
        t1 t1Var3;
        Resources.Theme theme;
        t1 t1Var4;
        if (this.U) {
            return false;
        }
        if (d0Var.f2311k) {
            return true;
        }
        d0 d0Var2 = this.Q;
        if (!(d0Var2 == null || d0Var2 == d0Var)) {
            t(d0Var2, false);
        }
        Window.Callback B2 = B();
        int i3 = d0Var.f2301a;
        if (B2 != null) {
            d0Var.f2307g = B2.onCreatePanelView(i3);
        }
        boolean z5 = i3 == 0 || i3 == 108;
        if (z5 && (t1Var4 = this.f2340u) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) t1Var4;
            actionBarOverlayLayout.l();
            ((e4) actionBarOverlayLayout.f414h).f573l = true;
        }
        if (d0Var.f2307g == null) {
            o oVar = d0Var.f2308h;
            if (oVar == null || d0Var.f2315o) {
                if (oVar == null) {
                    Context context = this.f2333n;
                    if ((i3 == 0 || i3 == 108) && this.f2340u != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            g.f fVar = new g.f(context, 0);
                            fVar.getTheme().setTo(theme);
                            context = fVar;
                        }
                    }
                    o oVar2 = new o(context);
                    oVar2.f3174e = this;
                    o oVar3 = d0Var.f2308h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(d0Var.f2309i);
                        }
                        d0Var.f2308h = oVar2;
                        k kVar = d0Var.f2309i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f3170a);
                        }
                    }
                    if (d0Var.f2308h == null) {
                        return false;
                    }
                }
                if (z5 && (t1Var3 = this.f2340u) != null) {
                    if (this.f2341v == null) {
                        this.f2341v = new s(this, 3);
                    }
                    ((ActionBarOverlayLayout) t1Var3).m(d0Var.f2308h, this.f2341v);
                }
                d0Var.f2308h.w();
                if (!B2.onCreatePanelMenu(i3, d0Var.f2308h)) {
                    o oVar4 = d0Var.f2308h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(d0Var.f2309i);
                        }
                        d0Var.f2308h = null;
                    }
                    if (z5 && (t1Var2 = this.f2340u) != null) {
                        ((ActionBarOverlayLayout) t1Var2).m((o) null, this.f2341v);
                    }
                    return false;
                }
                d0Var.f2315o = false;
            }
            d0Var.f2308h.w();
            Bundle bundle = d0Var.f2316p;
            if (bundle != null) {
                d0Var.f2308h.s(bundle);
                d0Var.f2316p = null;
            }
            if (!B2.onPreparePanel(0, d0Var.f2307g, d0Var.f2308h)) {
                if (z5 && (t1Var = this.f2340u) != null) {
                    ((ActionBarOverlayLayout) t1Var).m((o) null, this.f2341v);
                }
                d0Var.f2308h.v();
                return false;
            }
            d0Var.f2308h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            d0Var.f2308h.v();
        }
        d0Var.f2311k = true;
        d0Var.f2312l = false;
        this.Q = d0Var;
        return true;
    }

    public final void I() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z5 = false;
            if (this.f2330j0 != null && (A(0).f2313m || this.f2342x != null)) {
                z5 = true;
            }
            if (z5 && this.f2331k0 == null) {
                this.f2331k0 = x.b(this.f2330j0, this);
            } else if (!z5 && (onBackInvokedCallback = this.f2331k0) != null) {
                x.c(this.f2330j0, onBackInvokedCallback);
            }
        }
    }

    public final int K(h2 h2Var, Rect rect) {
        boolean z5;
        boolean z6;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        int i7 = 0;
        int e6 = h2Var != null ? h2Var.e() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f2343y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f2343y.getLayoutParams();
            boolean z7 = true;
            if (this.f2343y.isShown()) {
                if (this.f2327g0 == null) {
                    this.f2327g0 = new Rect();
                    this.f2328h0 = new Rect();
                }
                Rect rect2 = this.f2327g0;
                Rect rect3 = this.f2328h0;
                if (h2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(h2Var.c(), h2Var.e(), h2Var.d(), h2Var.b());
                }
                ViewGroup viewGroup = this.E;
                Method method = j4.f647a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect2, rect3});
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                    }
                }
                int i8 = rect2.top;
                int i9 = rect2.left;
                int i10 = rect2.right;
                ViewGroup viewGroup2 = this.E;
                WeakHashMap weakHashMap = u0.f5622a;
                h2 a6 = k0.a(viewGroup2);
                int c6 = a6 == null ? 0 : a6.c();
                int d6 = a6 == null ? 0 : a6.d();
                if (marginLayoutParams2.topMargin == i8 && marginLayoutParams2.leftMargin == i9 && marginLayoutParams2.rightMargin == i10) {
                    z6 = false;
                } else {
                    marginLayoutParams2.topMargin = i8;
                    marginLayoutParams2.leftMargin = i9;
                    marginLayoutParams2.rightMargin = i10;
                    z6 = true;
                }
                Context context = this.f2333n;
                if (i8 <= 0 || this.G != null) {
                    View view = this.G;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i6 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == c6 && marginLayoutParams.rightMargin == d6))) {
                        marginLayoutParams.height = i6;
                        marginLayoutParams.leftMargin = c6;
                        marginLayoutParams.rightMargin = d6;
                        this.G.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(context);
                    this.G = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = c6;
                    layoutParams.rightMargin = d6;
                    this.E.addView(this.G, -1, layoutParams);
                }
                View view3 = this.G;
                z5 = view3 != null;
                if (z5 && view3.getVisibility() != 0) {
                    View view4 = this.G;
                    if ((d0.g(view4) & 8192) == 0) {
                        z7 = false;
                    }
                    if (z7) {
                        Object obj = b.f4213a;
                        i3 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        Object obj2 = b.f4213a;
                        i3 = R.color.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(o0.c.a(context, i3));
                }
                if (!this.L && z5) {
                    e6 = 0;
                }
                z7 = z6;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z5 = false;
            } else {
                z7 = false;
                z5 = false;
            }
            if (z7) {
                this.f2343y.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.G;
        if (view5 != null) {
            if (!z5) {
                i7 = 8;
            }
            view5.setVisibility(i7);
        }
        return e6;
    }

    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ((ViewGroup) this.E.findViewById(16908290)).addView(view, layoutParams);
        this.f2335p.a(this.f2334o.getCallback());
    }

    public final void b() {
        LayoutInflater from = LayoutInflater.from(this.f2333n);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof e0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r6 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r6 = r6.f473d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(h.o r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.t1 r6 = r5.f2340u
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x00ee
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.l()
            androidx.appcompat.widget.u1 r6 = r6.f414h
            androidx.appcompat.widget.e4 r6 = (androidx.appcompat.widget.e4) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f562a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x0021
            androidx.appcompat.widget.ActionMenuView r6 = r6.f473d
            if (r6 == 0) goto L_0x0021
            boolean r6 = r6.f435v
            if (r6 == 0) goto L_0x0021
            r6 = r0
            goto L_0x0022
        L_0x0021:
            r6 = r1
        L_0x0022:
            if (r6 == 0) goto L_0x00ee
            android.content.Context r6 = r5.f2333n
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x005f
            androidx.appcompat.widget.t1 r6 = r5.f2340u
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.l()
            androidx.appcompat.widget.u1 r6 = r6.f414h
            androidx.appcompat.widget.e4 r6 = (androidx.appcompat.widget.e4) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f562a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f473d
            if (r6 == 0) goto L_0x005c
            androidx.appcompat.widget.m r6 = r6.w
            if (r6 == 0) goto L_0x0057
            androidx.appcompat.widget.j r2 = r6.f675x
            if (r2 != 0) goto L_0x0052
            boolean r6 = r6.j()
            if (r6 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r6 = r1
            goto L_0x0053
        L_0x0052:
            r6 = r0
        L_0x0053:
            if (r6 == 0) goto L_0x0057
            r6 = r0
            goto L_0x0058
        L_0x0057:
            r6 = r1
        L_0x0058:
            if (r6 == 0) goto L_0x005c
            r6 = r0
            goto L_0x005d
        L_0x005c:
            r6 = r1
        L_0x005d:
            if (r6 == 0) goto L_0x00ee
        L_0x005f:
            android.view.Window$Callback r6 = r5.B()
            androidx.appcompat.widget.t1 r2 = r5.f2340u
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.l()
            androidx.appcompat.widget.u1 r2 = r2.f414h
            androidx.appcompat.widget.e4 r2 = (androidx.appcompat.widget.e4) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f562a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f473d
            if (r2 == 0) goto L_0x0085
            androidx.appcompat.widget.m r2 = r2.w
            if (r2 == 0) goto L_0x0080
            boolean r2 = r2.j()
            if (r2 == 0) goto L_0x0080
            r2 = r0
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x0085
            r2 = r0
            goto L_0x0086
        L_0x0085:
            r2 = r1
        L_0x0086:
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x009f
            androidx.appcompat.widget.t1 r0 = r5.f2340u
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.i()
            boolean r0 = r5.U
            if (r0 != 0) goto L_0x00fb
            e.d0 r0 = r5.A(r1)
            h.o r0 = r0.f2308h
            r6.onPanelClosed(r3, r0)
            goto L_0x00fb
        L_0x009f:
            if (r6 == 0) goto L_0x00fb
            boolean r2 = r5.U
            if (r2 != 0) goto L_0x00fb
            boolean r2 = r5.f2324c0
            if (r2 == 0) goto L_0x00bc
            int r2 = r5.f2325d0
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00bc
            android.view.Window r0 = r5.f2334o
            android.view.View r0 = r0.getDecorView()
            e.r r2 = r5.f2326e0
            r0.removeCallbacks(r2)
            r2.run()
        L_0x00bc:
            e.d0 r0 = r5.A(r1)
            h.o r2 = r0.f2308h
            if (r2 == 0) goto L_0x00fb
            boolean r4 = r0.f2315o
            if (r4 != 0) goto L_0x00fb
            android.view.View r4 = r0.f2307g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto L_0x00fb
            h.o r0 = r0.f2308h
            r6.onMenuOpened(r3, r0)
            androidx.appcompat.widget.t1 r6 = r5.f2340u
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.l()
            androidx.appcompat.widget.u1 r6 = r6.f414h
            androidx.appcompat.widget.e4 r6 = (androidx.appcompat.widget.e4) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f562a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f473d
            if (r6 == 0) goto L_0x00fb
            androidx.appcompat.widget.m r6 = r6.w
            if (r6 == 0) goto L_0x00fb
            r6.l()
            goto L_0x00fb
        L_0x00ee:
            e.d0 r6 = r5.A(r1)
            r6.f2314n = r0
            r5.t(r6, r1)
            r0 = 0
            r5.F(r6, r0)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.c(h.o):void");
    }

    public final boolean d(o oVar, MenuItem menuItem) {
        int i3;
        int i6;
        d0 d0Var;
        Window.Callback B2 = B();
        if (B2 != null && !this.U) {
            o k6 = oVar.k();
            d0[] d0VarArr = this.P;
            if (d0VarArr != null) {
                i6 = d0VarArr.length;
                i3 = 0;
            } else {
                i6 = 0;
                i3 = 0;
            }
            while (true) {
                if (i3 < i6) {
                    d0Var = d0VarArr[i3];
                    if (d0Var != null && d0Var.f2308h == k6) {
                        break;
                    }
                    i3++;
                } else {
                    d0Var = null;
                    break;
                }
            }
            if (d0Var != null) {
                return B2.onMenuItemSelected(d0Var.f2301a, menuItem);
            }
        }
        return false;
    }

    public final void e() {
        if (this.f2337r != null) {
            C();
            this.f2337r.getClass();
            this.f2325d0 |= 1;
            if (!this.f2324c0) {
                View decorView = this.f2334o.getDecorView();
                WeakHashMap weakHashMap = u0.f5622a;
                d0.m(decorView, this.f2326e0);
                this.f2324c0 = true;
            }
        }
    }

    public final void g() {
        String str;
        this.S = true;
        o(false, true);
        y();
        Object obj = this.f2332m;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = d.m(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e6) {
                throw new IllegalArgumentException(e6);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                s0 s0Var = this.f2337r;
                if (s0Var == null) {
                    this.f0 = true;
                } else {
                    s0Var.r(true);
                }
            }
            synchronized (q.f2417k) {
                q.i(this);
                q.f2416j.add(new WeakReference(this));
            }
        }
        this.V = new Configuration(this.f2333n.getResources().getConfiguration());
        this.T = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2332m
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = e.q.f2417k
            monitor-enter(r0)
            e.q.i(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f2324c0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f2334o
            android.view.View r0 = r0.getDecorView()
            e.r r1 = r3.f2326e0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.U = r0
            int r0 = r3.W
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f2332m
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            k.j r0 = f2318l0
            java.lang.Object r1 = r3.f2332m
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            k.j r0 = f2318l0
            java.lang.Object r1 = r3.f2332m
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            e.z r0 = r3.f2322a0
            if (r0 == 0) goto L_0x0063
            r0.a()
        L_0x0063:
            e.z r0 = r3.f2323b0
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.h():void");
    }

    public final boolean j(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i3 = 109;
        }
        if (this.N && i3 == 108) {
            return false;
        }
        if (this.J && i3 == 1) {
            this.J = false;
        }
        if (i3 == 1) {
            I();
            this.N = true;
            return true;
        } else if (i3 == 2) {
            I();
            this.H = true;
            return true;
        } else if (i3 == 5) {
            I();
            this.I = true;
            return true;
        } else if (i3 == 10) {
            I();
            this.L = true;
            return true;
        } else if (i3 == 108) {
            I();
            this.J = true;
            return true;
        } else if (i3 != 109) {
            return this.f2334o.requestFeature(i3);
        } else {
            I();
            this.K = true;
            return true;
        }
    }

    public final void k(int i3) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2333n).inflate(i3, viewGroup);
        this.f2335p.a(this.f2334o.getCallback());
    }

    public final void l(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2335p.a(this.f2334o.getCallback());
    }

    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2335p.a(this.f2334o.getCallback());
    }

    public final void n(CharSequence charSequence) {
        this.f2339t = charSequence;
        t1 t1Var = this.f2340u;
        if (t1Var != null) {
            t1Var.setWindowTitle(charSequence);
            return;
        }
        s0 s0Var = this.f2337r;
        if (s0Var != null) {
            s0Var.t(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0140, code lost:
        if (r1 != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0149, code lost:
        if (r12.U == false) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(boolean r13, boolean r14) {
        /*
            r12 = this;
            boolean r0 = r12.U
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = -100
            int r2 = r12.W
            if (r2 == r0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r2 = e.q.f2411e
        L_0x000f:
            android.content.Context r0 = r12.f2333n
            int r3 = r12.D(r0, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L_0x0021
            t0.g r5 = q(r0)
            goto L_0x0022
        L_0x0021:
            r5 = r6
        L_0x0022:
            if (r14 != 0) goto L_0x0032
            if (r5 == 0) goto L_0x0032
            android.content.res.Resources r14 = r0.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            t0.g r5 = e.v.b(r14)
        L_0x0032:
            android.content.res.Configuration r14 = u(r0, r3, r5, r6, r1)
            boolean r3 = r12.Z
            r7 = 1
            java.lang.Object r8 = r12.f2332m
            if (r3 != 0) goto L_0x0070
            boolean r3 = r8 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0070
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            if (r3 != 0) goto L_0x0049
            r3 = r1
            goto L_0x0074
        L_0x0049:
            r9 = 29
            if (r4 < r9) goto L_0x0050
            r4 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0052
        L_0x0050:
            r4 = 786432(0xc0000, float:1.102026E-39)
        L_0x0052:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.Class r10 = r8.getClass()     // Catch:{ NameNotFoundException -> 0x0066 }
            r9.<init>(r0, r10)     // Catch:{ NameNotFoundException -> 0x0066 }
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r9, r4)     // Catch:{ NameNotFoundException -> 0x0066 }
            if (r3 == 0) goto L_0x0070
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x0066 }
            r12.Y = r3     // Catch:{ NameNotFoundException -> 0x0066 }
            goto L_0x0070
        L_0x0066:
            r3 = move-exception
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r9 = "Exception while getting ActivityInfo"
            android.util.Log.d(r4, r9, r3)
            r12.Y = r1
        L_0x0070:
            r12.Z = r7
            int r3 = r12.Y
        L_0x0074:
            android.content.res.Configuration r4 = r12.V
            if (r4 != 0) goto L_0x0080
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
        L_0x0080:
            int r9 = r4.uiMode
            r9 = r9 & 48
            int r10 = r14.uiMode
            r10 = r10 & 48
            t0.g r4 = e.v.b(r4)
            if (r5 != 0) goto L_0x0090
            r14 = r6
            goto L_0x0094
        L_0x0090:
            t0.g r14 = e.v.b(r14)
        L_0x0094:
            if (r9 == r10) goto L_0x0099
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x009a
        L_0x0099:
            r5 = r1
        L_0x009a:
            if (r14 == 0) goto L_0x00a6
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L_0x00a6
            r4 = r5 | 4
            r5 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            int r4 = ~r3
            r4 = r4 & r5
            r9 = 4
            if (r4 == 0) goto L_0x00e5
            if (r13 == 0) goto L_0x00e5
            boolean r13 = r12.S
            if (r13 == 0) goto L_0x00e5
            boolean r13 = f2320n0
            if (r13 != 0) goto L_0x00b9
            boolean r13 = r12.T
            if (r13 == 0) goto L_0x00e5
        L_0x00b9:
            boolean r13 = r8 instanceof android.app.Activity
            if (r13 == 0) goto L_0x00e5
            r13 = r8
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r4 = r13.isChild()
            if (r4 != 0) goto L_0x00e5
            java.lang.Object r4 = n0.b.f4213a
            int r4 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r4 < r11) goto L_0x00d2
            r13.recreate()
            goto L_0x00e3
        L_0x00d2:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r11 = r13.getMainLooper()
            r4.<init>(r11)
            androidx.activity.d r11 = new androidx.activity.d
            r11.<init>(r9, r13)
            r4.post(r11)
        L_0x00e3:
            r13 = r7
            goto L_0x00e6
        L_0x00e5:
            r13 = r1
        L_0x00e6:
            if (r13 != 0) goto L_0x014f
            if (r5 == 0) goto L_0x014f
            r13 = r5 & r3
            if (r13 != r5) goto L_0x00f0
            r13 = r7
            goto L_0x00f1
        L_0x00f0:
            r13 = r1
        L_0x00f1:
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r4 = new android.content.res.Configuration
            android.content.res.Configuration r11 = r3.getConfiguration()
            r4.<init>(r11)
            android.content.res.Configuration r11 = r3.getConfiguration()
            int r11 = r11.uiMode
            r11 = r11 & -49
            r10 = r10 | r11
            r4.uiMode = r10
            if (r14 == 0) goto L_0x010e
            e.v.d(r4, r14)
        L_0x010e:
            r3.updateConfiguration(r4, r6)
            int r3 = r12.X
            if (r3 == 0) goto L_0x0121
            r0.setTheme(r3)
            android.content.res.Resources$Theme r3 = r0.getTheme()
            int r6 = r12.X
            r3.applyStyle(r6, r7)
        L_0x0121:
            if (r13 == 0) goto L_0x0150
            boolean r13 = r8 instanceof android.app.Activity
            if (r13 == 0) goto L_0x0150
            r13 = r8
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r3 = r13 instanceof androidx.lifecycle.r
            if (r3 == 0) goto L_0x0143
            r3 = r13
            androidx.lifecycle.r r3 = (androidx.lifecycle.r) r3
            androidx.lifecycle.t r3 = r3.h()
            androidx.lifecycle.m r3 = r3.f1382v
            androidx.lifecycle.m r6 = androidx.lifecycle.m.f1372f
            int r3 = r3.compareTo(r6)
            if (r3 < 0) goto L_0x0140
            r1 = r7
        L_0x0140:
            if (r1 == 0) goto L_0x0150
            goto L_0x014b
        L_0x0143:
            boolean r1 = r12.T
            if (r1 == 0) goto L_0x0150
            boolean r1 = r12.U
            if (r1 != 0) goto L_0x0150
        L_0x014b:
            r13.onConfigurationChanged(r4)
            goto L_0x0150
        L_0x014f:
            r7 = r13
        L_0x0150:
            if (r7 == 0) goto L_0x0169
            boolean r13 = r8 instanceof e.l
            if (r13 == 0) goto L_0x0169
            r13 = r5 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0160
            r13 = r8
            e.l r13 = (e.l) r13
            r13.getClass()
        L_0x0160:
            r13 = r5 & 4
            if (r13 == 0) goto L_0x0169
            e.l r8 = (e.l) r8
            r8.getClass()
        L_0x0169:
            if (r7 == 0) goto L_0x017c
            if (r14 == 0) goto L_0x017c
            android.content.res.Resources r13 = r0.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            t0.g r13 = e.v.b(r13)
            e.v.c(r13)
        L_0x017c:
            if (r2 != 0) goto L_0x0186
            e.b0 r13 = r12.z(r0)
            r13.h()
            goto L_0x018d
        L_0x0186:
            e.z r13 = r12.f2322a0
            if (r13 == 0) goto L_0x018d
            r13.a()
        L_0x018d:
            r13 = 3
            if (r2 != r13) goto L_0x01a1
            e.z r13 = r12.f2323b0
            if (r13 != 0) goto L_0x019b
            e.z r13 = new e.z
            r13.<init>((e.e0) r12, (android.content.Context) r0)
            r12.f2323b0 = r13
        L_0x019b:
            e.z r13 = r12.f2323b0
            r13.h()
            goto L_0x01a8
        L_0x01a1:
            e.z r13 = r12.f2323b0
            if (r13 == 0) goto L_0x01a8
            r13.a()
        L_0x01a8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.o(boolean, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.appcompat.widget.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.appcompat.widget.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: androidx.appcompat.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: androidx.appcompat.widget.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: androidx.appcompat.widget.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: androidx.appcompat.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: androidx.appcompat.widget.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: androidx.appcompat.widget.l0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: androidx.appcompat.widget.w0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: androidx.appcompat.widget.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: androidx.appcompat.widget.r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: androidx.appcompat.widget.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v84, resolved type: androidx.appcompat.widget.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: androidx.appcompat.widget.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: androidx.appcompat.widget.s} */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r9v13, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v16, types: [androidx.appcompat.widget.i1] */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        if (r10.equals("ImageButton") == false) goto L_0x013f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            e.h0 r9 = r8.f2329i0
            r0 = 0
            if (r9 != 0) goto L_0x0054
            int[] r9 = d.a.f2122j
            android.content.Context r1 = r8.f2333n
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r9)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r9 = r9.getString(r2)
            if (r9 != 0) goto L_0x001b
            e.h0 r9 = new e.h0
            r9.<init>()
            goto L_0x0052
        L_0x001b:
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0034 }
            java.lang.Class r1 = r1.loadClass(r9)     // Catch:{ all -> 0x0034 }
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0034 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0034 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0034 }
            e.h0 r1 = (e.h0) r1     // Catch:{ all -> 0x0034 }
            r8.f2329i0 = r1     // Catch:{ all -> 0x0034 }
            goto L_0x0054
        L_0x0034:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = ". Falling back to default."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r9, r1)
            e.h0 r9 = new e.h0
            r9.<init>()
        L_0x0052:
            r8.f2329i0 = r9
        L_0x0054:
            e.h0 r9 = r8.f2329i0
            int r1 = androidx.appcompat.widget.h4.f628a
            r9.getClass()
            int[] r1 = d.a.f2136y
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r0, r0)
            r2 = 4
            int r3 = r1.getResourceId(r2, r0)
            if (r3 == 0) goto L_0x006f
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r5 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r5)
        L_0x006f:
            r1.recycle()
            if (r3 == 0) goto L_0x0085
            boolean r1 = r11 instanceof g.f
            if (r1 == 0) goto L_0x007f
            r1 = r11
            g.f r1 = (g.f) r1
            int r1 = r1.f2713a
            if (r1 == r3) goto L_0x0085
        L_0x007f:
            g.f r1 = new g.f
            r1.<init>((android.content.Context) r11, (int) r3)
            goto L_0x0086
        L_0x0085:
            r1 = r11
        L_0x0086:
            r10.getClass()
            int r3 = r10.hashCode()
            r4 = 3
            r5 = 1
            r6 = -1
            switch(r3) {
                case -1946472170: goto L_0x0134;
                case -1455429095: goto L_0x0129;
                case -1346021293: goto L_0x011e;
                case -938935918: goto L_0x0113;
                case -937446323: goto L_0x010a;
                case -658531749: goto L_0x00ff;
                case -339785223: goto L_0x00f4;
                case 776382189: goto L_0x00e9;
                case 799298502: goto L_0x00db;
                case 1125864064: goto L_0x00cd;
                case 1413872058: goto L_0x00bf;
                case 1601505219: goto L_0x00b1;
                case 1666676343: goto L_0x00a3;
                case 2001146706: goto L_0x0095;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x013f
        L_0x0095:
            java.lang.String r2 = "Button"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x009f
            goto L_0x013f
        L_0x009f:
            r2 = 13
            goto L_0x0140
        L_0x00a3:
            java.lang.String r2 = "EditText"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00ad
            goto L_0x013f
        L_0x00ad:
            r2 = 12
            goto L_0x0140
        L_0x00b1:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00bb
            goto L_0x013f
        L_0x00bb:
            r2 = 11
            goto L_0x0140
        L_0x00bf:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00c9
            goto L_0x013f
        L_0x00c9:
            r2 = 10
            goto L_0x0140
        L_0x00cd:
            java.lang.String r2 = "ImageView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00d7
            goto L_0x013f
        L_0x00d7:
            r2 = 9
            goto L_0x0140
        L_0x00db:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00e5
            goto L_0x013f
        L_0x00e5:
            r2 = 8
            goto L_0x0140
        L_0x00e9:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00f2
            goto L_0x013f
        L_0x00f2:
            r2 = 7
            goto L_0x0140
        L_0x00f4:
            java.lang.String r2 = "Spinner"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00fd
            goto L_0x013f
        L_0x00fd:
            r2 = 6
            goto L_0x0140
        L_0x00ff:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0108
            goto L_0x013f
        L_0x0108:
            r2 = 5
            goto L_0x0140
        L_0x010a:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0140
            goto L_0x013f
        L_0x0113:
            java.lang.String r2 = "TextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x011c
            goto L_0x013f
        L_0x011c:
            r2 = r4
            goto L_0x0140
        L_0x011e:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0127
            goto L_0x013f
        L_0x0127:
            r2 = 2
            goto L_0x0140
        L_0x0129:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0132
            goto L_0x013f
        L_0x0132:
            r2 = r5
            goto L_0x0140
        L_0x0134:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            r2 = r0
            goto L_0x0140
        L_0x013f:
            r2 = r6
        L_0x0140:
            r3 = 0
            switch(r2) {
                case 0: goto L_0x01bd;
                case 1: goto L_0x01b7;
                case 2: goto L_0x01b1;
                case 3: goto L_0x0183;
                case 4: goto L_0x017a;
                case 5: goto L_0x0174;
                case 6: goto L_0x016e;
                case 7: goto L_0x0169;
                case 8: goto L_0x0163;
                case 9: goto L_0x015d;
                case 10: goto L_0x0158;
                case 11: goto L_0x0153;
                case 12: goto L_0x014c;
                case 13: goto L_0x0147;
                default: goto L_0x0144;
            }
        L_0x0144:
            r2 = r3
            goto L_0x01c2
        L_0x0147:
            androidx.appcompat.widget.s r2 = r9.b(r1, r12)
            goto L_0x0187
        L_0x014c:
            androidx.appcompat.widget.z r2 = new androidx.appcompat.widget.z
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x0153:
            androidx.appcompat.widget.t r2 = r9.c(r1, r12)
            goto L_0x0187
        L_0x0158:
            androidx.appcompat.widget.q r2 = r9.a(r1, r12)
            goto L_0x0187
        L_0x015d:
            androidx.appcompat.widget.e0 r2 = new androidx.appcompat.widget.e0
            r2.<init>(r1, r12, r0)
            goto L_0x01c2
        L_0x0163:
            androidx.appcompat.widget.r1 r2 = new androidx.appcompat.widget.r1
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x0169:
            androidx.appcompat.widget.i0 r2 = r9.d(r1, r12)
            goto L_0x0187
        L_0x016e:
            androidx.appcompat.widget.w0 r2 = new androidx.appcompat.widget.w0
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x0174:
            androidx.appcompat.widget.l0 r2 = new androidx.appcompat.widget.l0
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x017a:
            androidx.appcompat.widget.c0 r2 = new androidx.appcompat.widget.c0
            r7 = 2130903570(0x7f030212, float:1.7413962E38)
            r2.<init>(r1, r12, r7)
            goto L_0x01c2
        L_0x0183:
            androidx.appcompat.widget.i1 r2 = r9.e(r1, r12)
        L_0x0187:
            if (r2 == 0) goto L_0x018a
            goto L_0x01c2
        L_0x018a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " asked to inflate view for <"
            r12.append(r9)
            r12.append(r10)
            java.lang.String r9 = ">, but returned null"
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            throw r11
        L_0x01b1:
            androidx.appcompat.widget.f0 r2 = new androidx.appcompat.widget.f0
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x01b7:
            androidx.appcompat.widget.u r2 = new androidx.appcompat.widget.u
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x01bd:
            androidx.appcompat.widget.j0 r2 = new androidx.appcompat.widget.j0
            r2.<init>(r1, r12)
        L_0x01c2:
            if (r2 != 0) goto L_0x0212
            if (r11 == r1) goto L_0x0212
            java.lang.Object[] r11 = r9.f2384a
            java.lang.String r2 = "view"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x01d6
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r3, r10)
        L_0x01d6:
            r11[r0] = r1     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            r11[r5] = r12     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            r2 = 46
            int r2 = r10.indexOf(r2)     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            if (r6 != r2) goto L_0x01fd
            r2 = r0
        L_0x01e3:
            java.lang.String[] r6 = e.h0.f2382g     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            if (r2 >= r4) goto L_0x01f8
            r6 = r6[r2]     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            android.view.View r6 = r9.f(r1, r10, r6)     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            if (r6 == 0) goto L_0x01f5
            r11[r0] = r3
            r11[r5] = r3
            r3 = r6
            goto L_0x0211
        L_0x01f5:
            int r2 = r2 + 1
            goto L_0x01e3
        L_0x01f8:
            r11[r0] = r3
            r11[r5] = r3
            goto L_0x0211
        L_0x01fd:
            android.view.View r9 = r9.f(r1, r10, r3)     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            r11[r0] = r3
            r11[r5] = r3
            r3 = r9
            goto L_0x0211
        L_0x0207:
            r9 = move-exception
            r11[r0] = r3
            r11[r5] = r3
            throw r9
        L_0x020d:
            r11[r0] = r3
            r11[r5] = r3
        L_0x0211:
            r2 = r3
        L_0x0212:
            if (r2 == 0) goto L_0x02a1
            android.content.Context r9 = r2.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x023c
            java.util.WeakHashMap r10 = x0.u0.f5622a
            boolean r10 = x0.c0.a(r2)
            if (r10 != 0) goto L_0x0225
            goto L_0x023c
        L_0x0225:
            int[] r10 = e.h0.f2378c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r0)
            if (r10 == 0) goto L_0x0239
            e.g0 r11 = new e.g0
            r11.<init>(r2, r10)
            r2.setOnClickListener(r11)
        L_0x0239:
            r9.recycle()
        L_0x023c:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 <= r10) goto L_0x0243
            goto L_0x02a1
        L_0x0243:
            int[] r9 = e.h0.f2379d
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0264
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap r11 = x0.u0.f5622a
            x0.z r11 = new x0.z
            r3 = 2131231127(0x7f080197, float:1.8078326E38)
            r11.<init>(r3, r4)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.c(r2, r10)
        L_0x0264:
            r9.recycle()
            int[] r9 = e.h0.f2380e
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x027a
            java.lang.String r10 = r9.getString(r0)
            x0.u0.m(r2, r10)
        L_0x027a:
            r9.recycle()
            int[] r9 = e.h0.f2381f
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x029e
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap r11 = x0.u0.f5622a
            x0.z r11 = new x0.z
            r12 = 2131231132(0x7f08019c, float:1.8078336E38)
            r11.<init>(r12, r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.c(r2, r10)
        L_0x029e:
            r9.recycle()
        L_0x02a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2334o == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof y)) {
                y yVar = new y(this, callback);
                this.f2335p = yVar;
                window.setCallback(yVar);
                int[] iArr = f2319m0;
                Context context = this.f2333n;
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    x a6 = x.a();
                    synchronized (a6) {
                        drawable = a6.f844a.f(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f2334o = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f2330j0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f2331k0) == null)) {
                        x.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f2331k0 = null;
                    }
                    Object obj = this.f2332m;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            onBackInvokedDispatcher2 = x.a(activity);
                        }
                    }
                    this.f2330j0 = onBackInvokedDispatcher2;
                    J();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void r(int i3, d0 d0Var, o oVar) {
        if (oVar == null) {
            if (d0Var == null && i3 >= 0) {
                d0[] d0VarArr = this.P;
                if (i3 < d0VarArr.length) {
                    d0Var = d0VarArr[i3];
                }
            }
            if (d0Var != null) {
                oVar = d0Var.f2308h;
            }
        }
        if ((d0Var == null || d0Var.f2313m) && !this.U) {
            y yVar = this.f2335p;
            Window.Callback callback = this.f2334o.getCallback();
            yVar.getClass();
            try {
                yVar.f2457g = true;
                callback.onPanelClosed(i3, oVar);
                yVar.f2457g = false;
            } catch (Throwable th) {
                yVar.f2457g = false;
                throw th;
            }
        }
    }

    public final void s(o oVar) {
        androidx.appcompat.widget.m mVar;
        if (!this.O) {
            this.O = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2340u;
            actionBarOverlayLayout.l();
            ActionMenuView actionMenuView = ((e4) actionBarOverlayLayout.f414h).f562a.f473d;
            if (!(actionMenuView == null || (mVar = actionMenuView.w) == null)) {
                mVar.f();
                androidx.appcompat.widget.h hVar = mVar.w;
                if (hVar != null && hVar.b()) {
                    hVar.f3094j.dismiss();
                }
            }
            Window.Callback B2 = B();
            if (B2 != null && !this.U) {
                B2.onPanelClosed(108, oVar);
            }
            this.O = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(e.d0 r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0035
            int r2 = r6.f2301a
            if (r2 != 0) goto L_0x0035
            androidx.appcompat.widget.t1 r2 = r5.f2340u
            if (r2 == 0) goto L_0x0035
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.l()
            androidx.appcompat.widget.u1 r2 = r2.f414h
            androidx.appcompat.widget.e4 r2 = (androidx.appcompat.widget.e4) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f562a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f473d
            if (r2 == 0) goto L_0x002c
            androidx.appcompat.widget.m r2 = r2.w
            if (r2 == 0) goto L_0x0027
            boolean r2 = r2.j()
            if (r2 == 0) goto L_0x0027
            r2 = r0
            goto L_0x0028
        L_0x0027:
            r2 = r1
        L_0x0028:
            if (r2 == 0) goto L_0x002c
            r2 = r0
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            if (r2 == 0) goto L_0x0035
            h.o r6 = r6.f2308h
            r5.s(r6)
            return
        L_0x0035:
            android.content.Context r2 = r5.f2333n
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L_0x0054
            boolean r4 = r6.f2313m
            if (r4 == 0) goto L_0x0054
            e.c0 r4 = r6.f2305e
            if (r4 == 0) goto L_0x0054
            r2.removeView(r4)
            if (r7 == 0) goto L_0x0054
            int r7 = r6.f2301a
            r5.r(r7, r6, r3)
        L_0x0054:
            r6.f2311k = r1
            r6.f2312l = r1
            r6.f2313m = r1
            r6.f2306f = r3
            r6.f2314n = r0
            e.d0 r7 = r5.Q
            if (r7 != r6) goto L_0x0064
            r5.Q = r3
        L_0x0064:
            int r6 = r6.f2301a
            if (r6 != 0) goto L_0x006b
            r5.J()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.t(e.d0, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ff, code lost:
        if ((r7 != null && r7.l()) != false) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2332m
            boolean r1 = r0 instanceof x0.l
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof e.i
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f2334o
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = w4.p.l(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L_0x003d
            e.y r0 = r6.f2335p
            android.view.Window r4 = r6.f2334o
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f2456f = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f2456f = r1
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f2456f = r1
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            if (r4 != 0) goto L_0x0049
            r4 = r2
            goto L_0x004a
        L_0x0049:
            r4 = r1
        L_0x004a:
            r5 = 4
            if (r4 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0066
            if (r0 == r3) goto L_0x0053
            goto L_0x0154
        L_0x0053:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0155
            e.d0 r0 = r6.A(r1)
            boolean r1 = r0.f2313m
            if (r1 != 0) goto L_0x0155
            r6.H(r0, r7)
            goto L_0x0155
        L_0x0066:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r1
        L_0x0070:
            r6.R = r2
            goto L_0x0154
        L_0x0074:
            if (r0 == r5) goto L_0x014d
            if (r0 == r3) goto L_0x007a
            goto L_0x0154
        L_0x007a:
            g.c r0 = r6.f2342x
            if (r0 == 0) goto L_0x0080
            goto L_0x0155
        L_0x0080:
            e.d0 r0 = r6.A(r1)
            androidx.appcompat.widget.t1 r3 = r6.f2340u
            android.content.Context r4 = r6.f2333n
            if (r3 == 0) goto L_0x010b
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.l()
            androidx.appcompat.widget.u1 r3 = r3.f414h
            androidx.appcompat.widget.e4 r3 = (androidx.appcompat.widget.e4) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f562a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x00a5
            androidx.appcompat.widget.ActionMenuView r3 = r3.f473d
            if (r3 == 0) goto L_0x00a5
            boolean r3 = r3.f435v
            if (r3 == 0) goto L_0x00a5
            r3 = r2
            goto L_0x00a6
        L_0x00a5:
            r3 = r1
        L_0x00a6:
            if (r3 == 0) goto L_0x010b
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x010b
            androidx.appcompat.widget.t1 r3 = r6.f2340u
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.l()
            androidx.appcompat.widget.u1 r3 = r3.f414h
            androidx.appcompat.widget.e4 r3 = (androidx.appcompat.widget.e4) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f562a
            androidx.appcompat.widget.ActionMenuView r3 = r3.f473d
            if (r3 == 0) goto L_0x00d4
            androidx.appcompat.widget.m r3 = r3.w
            if (r3 == 0) goto L_0x00cf
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00cf
            r3 = r2
            goto L_0x00d0
        L_0x00cf:
            r3 = r1
        L_0x00d0:
            if (r3 == 0) goto L_0x00d4
            r3 = r2
            goto L_0x00d5
        L_0x00d4:
            r3 = r1
        L_0x00d5:
            if (r3 != 0) goto L_0x0102
            boolean r3 = r6.U
            if (r3 != 0) goto L_0x012b
            boolean r7 = r6.H(r0, r7)
            if (r7 == 0) goto L_0x012b
            androidx.appcompat.widget.t1 r7 = r6.f2340u
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.l()
            androidx.appcompat.widget.u1 r7 = r7.f414h
            androidx.appcompat.widget.e4 r7 = (androidx.appcompat.widget.e4) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f562a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f473d
            if (r7 == 0) goto L_0x012b
            androidx.appcompat.widget.m r7 = r7.w
            if (r7 == 0) goto L_0x00fe
            boolean r7 = r7.l()
            if (r7 == 0) goto L_0x00fe
            r7 = r2
            goto L_0x00ff
        L_0x00fe:
            r7 = r1
        L_0x00ff:
            if (r7 == 0) goto L_0x012b
            goto L_0x0129
        L_0x0102:
            androidx.appcompat.widget.t1 r7 = r6.f2340u
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            boolean r7 = r7.i()
            goto L_0x0131
        L_0x010b:
            boolean r3 = r0.f2313m
            if (r3 != 0) goto L_0x012d
            boolean r5 = r0.f2312l
            if (r5 == 0) goto L_0x0114
            goto L_0x012d
        L_0x0114:
            boolean r3 = r0.f2311k
            if (r3 == 0) goto L_0x012b
            boolean r3 = r0.f2315o
            if (r3 == 0) goto L_0x0123
            r0.f2311k = r1
            boolean r3 = r6.H(r0, r7)
            goto L_0x0124
        L_0x0123:
            r3 = r2
        L_0x0124:
            if (r3 == 0) goto L_0x012b
            r6.F(r0, r7)
        L_0x0129:
            r7 = r2
            goto L_0x0131
        L_0x012b:
            r7 = r1
            goto L_0x0131
        L_0x012d:
            r6.t(r0, r2)
            r7 = r3
        L_0x0131:
            if (r7 == 0) goto L_0x0155
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x0145
            r7.playSoundEffect(r1)
            goto L_0x0155
        L_0x0145:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0155
        L_0x014d:
            boolean r7 = r6.E()
            if (r7 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r2 = r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e0.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i3) {
        d0 A2 = A(i3);
        if (A2.f2308h != null) {
            Bundle bundle = new Bundle();
            A2.f2308h.t(bundle);
            if (bundle.size() > 0) {
                A2.f2316p = bundle;
            }
            A2.f2308h.w();
            A2.f2308h.clear();
        }
        A2.f2315o = true;
        A2.f2314n = true;
        if ((i3 == 108 || i3 == 0) && this.f2340u != null) {
            d0 A3 = A(0);
            A3.f2311k = false;
            H(A3, (KeyEvent) null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (!this.D) {
            int[] iArr = a.f2122j;
            Context context = this.f2333n;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    j(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    j(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    j(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    j(10);
                }
                this.M = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                y();
                this.f2334o.getDecorView();
                LayoutInflater from = LayoutInflater.from(context);
                if (this.N) {
                    viewGroup = (ViewGroup) from.inflate(this.L ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.M) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.K = false;
                    this.J = false;
                } else if (this.J) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new g.f(context, typedValue.resourceId) : context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    t1 t1Var = (t1) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f2340u = t1Var;
                    t1Var.setWindowCallback(B());
                    if (this.K) {
                        ((ActionBarOverlayLayout) this.f2340u).k(109);
                    }
                    if (this.H) {
                        ((ActionBarOverlayLayout) this.f2340u).k(2);
                    }
                    if (this.I) {
                        ((ActionBarOverlayLayout) this.f2340u).k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    s sVar = new s(this, 0);
                    WeakHashMap weakHashMap = u0.f5622a;
                    j0.u(viewGroup, sVar);
                    if (this.f2340u == null) {
                        this.F = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = j4.f647a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (IllegalAccessException | InvocationTargetException e6) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f2334o.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f2334o.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new s(this, 2));
                    this.E = viewGroup;
                    Object obj = this.f2332m;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2339t;
                    if (!TextUtils.isEmpty(title)) {
                        t1 t1Var2 = this.f2340u;
                        if (t1Var2 != null) {
                            t1Var2.setWindowTitle(title);
                        } else {
                            s0 s0Var = this.f2337r;
                            if (s0Var != null) {
                                s0Var.t(title);
                            } else {
                                TextView textView = this.F;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(16908290);
                    View decorView = this.f2334o.getDecorView();
                    contentFrameLayout2.f449j.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = u0.f5622a;
                    if (g0.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.D = true;
                    d0 A2 = A(0);
                    if (!this.U && A2.f2308h == null) {
                        this.f2325d0 |= 4096;
                        if (!this.f2324c0) {
                            d0.m(this.f2334o.getDecorView(), this.f2326e0);
                            this.f2324c0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.J + ", windowActionBarOverlay: " + this.K + ", android:windowIsFloating: " + this.M + ", windowActionModeOverlay: " + this.L + ", windowNoTitle: " + this.N + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void y() {
        if (this.f2334o == null) {
            Object obj = this.f2332m;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f2334o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final b0 z(Context context) {
        if (this.f2322a0 == null) {
            if (androidx.activity.result.c.f325h == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.activity.result.c.f325h = new androidx.activity.result.c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2322a0 = new z(this, androidx.activity.result.c.f325h);
        }
        return this.f2322a0;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
