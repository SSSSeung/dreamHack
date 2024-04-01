package e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e4;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.u1;
import androidx.appcompat.widget.z2;
import com.theori.dreamdrm.R;
import d.a;
import g.b;
import g.m;
import g.n;
import h5.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.d1;
import x0.f1;
import x0.g0;
import x0.g1;
import x0.h0;
import x0.j0;
import x0.u0;

public final class s0 extends d implements f {
    public static final AccelerateInterpolator E = new AccelerateInterpolator();
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public boolean A;
    public final q0 B = new q0(this, 0);
    public final q0 C = new q0(this, 1);
    public final n0 D = new n0(1, (Object) this);

    /* renamed from: g  reason: collision with root package name */
    public Context f2430g;

    /* renamed from: h  reason: collision with root package name */
    public Context f2431h;

    /* renamed from: i  reason: collision with root package name */
    public ActionBarOverlayLayout f2432i;

    /* renamed from: j  reason: collision with root package name */
    public ActionBarContainer f2433j;

    /* renamed from: k  reason: collision with root package name */
    public u1 f2434k;

    /* renamed from: l  reason: collision with root package name */
    public ActionBarContextView f2435l;

    /* renamed from: m  reason: collision with root package name */
    public final View f2436m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2437n;

    /* renamed from: o  reason: collision with root package name */
    public r0 f2438o;

    /* renamed from: p  reason: collision with root package name */
    public r0 f2439p;

    /* renamed from: q  reason: collision with root package name */
    public b f2440q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2441r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f2442s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public int f2443t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2444u = true;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2445v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2446x = true;

    /* renamed from: y  reason: collision with root package name */
    public n f2447y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2448z;

    public s0(Activity activity, boolean z5) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (!z5) {
            this.f2436m = decorView.findViewById(16908290);
        }
    }

    public final void o(boolean z5) {
        g1 g1Var;
        g1 g1Var2;
        if (z5) {
            if (!this.w) {
                this.w = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2432i;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.w) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2432i;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        ActionBarContainer actionBarContainer = this.f2433j;
        WeakHashMap weakHashMap = u0.f5622a;
        if (g0.c(actionBarContainer)) {
            if (z5) {
                e4 e4Var = (e4) this.f2434k;
                g1Var2 = u0.a(e4Var.f562a);
                g1Var2.a(0.0f);
                g1Var2.c(100);
                g1Var2.d(new m(e4Var, 4));
                g1Var = this.f2435l.l(200, 0);
            } else {
                e4 e4Var2 = (e4) this.f2434k;
                g1 a6 = u0.a(e4Var2.f562a);
                a6.a(1.0f);
                a6.c(200);
                a6.d(new m(e4Var2, 0));
                g1 g1Var3 = a6;
                g1Var2 = this.f2435l.l(100, 8);
                g1Var = g1Var3;
            }
            n nVar = new n();
            ArrayList arrayList = nVar.f2769a;
            arrayList.add(g1Var2);
            View view = (View) g1Var2.f5569a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) g1Var.f5569a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            arrayList.add(g1Var);
            nVar.b();
        } else if (z5) {
            ((e4) this.f2434k).f562a.setVisibility(4);
            this.f2435l.setVisibility(0);
        } else {
            ((e4) this.f2434k).f562a.setVisibility(0);
            this.f2435l.setVisibility(8);
        }
    }

    public final Context p() {
        if (this.f2431h == null) {
            TypedValue typedValue = new TypedValue();
            this.f2430g.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                this.f2431h = new ContextThemeWrapper(this.f2430g, i3);
            } else {
                this.f2431h = this.f2430g;
            }
        }
        return this.f2431h;
    }

    public final void q(View view) {
        u1 u1Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f2432i = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof u1) {
            u1Var = (u1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            u1Var = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.f2434k = u1Var;
        this.f2435l = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f2433j = actionBarContainer;
        u1 u1Var2 = this.f2434k;
        if (u1Var2 == null || this.f2435l == null || actionBarContainer == null) {
            throw new IllegalStateException(s0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((e4) u1Var2).f562a.getContext();
        this.f2430g = context;
        if ((((e4) this.f2434k).f563b & 4) != 0) {
            this.f2437n = true;
        }
        int i3 = context.getApplicationInfo().targetSdkVersion;
        this.f2434k.getClass();
        s(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2430g.obtainStyledAttributes((AttributeSet) null, a.f2113a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2432i;
            if (actionBarOverlayLayout2.f417k) {
                this.A = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2433j;
            WeakHashMap weakHashMap = u0.f5622a;
            j0.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void r(boolean z5) {
        if (!this.f2437n) {
            int i3 = z5 ? 4 : 0;
            e4 e4Var = (e4) this.f2434k;
            int i6 = e4Var.f563b;
            this.f2437n = true;
            e4Var.a((i3 & 4) | (i6 & -5));
        }
    }

    public final void s(boolean z5) {
        if (!z5) {
            ((e4) this.f2434k).getClass();
            this.f2433j.setTabContainer((z2) null);
        } else {
            this.f2433j.setTabContainer((z2) null);
            ((e4) this.f2434k).getClass();
        }
        this.f2434k.getClass();
        ((e4) this.f2434k).f562a.setCollapsible(false);
        this.f2432i.setHasNonEmbeddedTabs(false);
    }

    public final void t(CharSequence charSequence) {
        e4 e4Var = (e4) this.f2434k;
        if (!e4Var.f568g) {
            e4Var.f569h = charSequence;
            if ((e4Var.f563b & 8) != 0) {
                Toolbar toolbar = e4Var.f562a;
                toolbar.setTitle(charSequence);
                if (e4Var.f568g) {
                    u0.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void u(boolean z5) {
        boolean z6 = this.w || !this.f2445v;
        n0 n0Var = this.D;
        d1 d1Var = null;
        View view = this.f2436m;
        if (z6) {
            if (!this.f2446x) {
                this.f2446x = true;
                n nVar = this.f2447y;
                if (nVar != null) {
                    nVar.a();
                }
                this.f2433j.setVisibility(0);
                int i3 = this.f2443t;
                q0 q0Var = this.C;
                if (i3 != 0 || (!this.f2448z && !z5)) {
                    this.f2433j.setAlpha(1.0f);
                    this.f2433j.setTranslationY(0.0f);
                    if (this.f2444u && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    q0Var.a();
                } else {
                    this.f2433j.setTranslationY(0.0f);
                    float f6 = (float) (-this.f2433j.getHeight());
                    if (z5) {
                        int[] iArr = {0, 0};
                        this.f2433j.getLocationInWindow(iArr);
                        f6 -= (float) iArr[1];
                    }
                    this.f2433j.setTranslationY(f6);
                    n nVar2 = new n();
                    g1 a6 = u0.a(this.f2433j);
                    a6.e(0.0f);
                    View view2 = (View) a6.f5569a.get();
                    if (view2 != null) {
                        if (n0Var != null) {
                            d1Var = new d1(n0Var, view2);
                        }
                        f1.a(view2.animate(), d1Var);
                    }
                    boolean z7 = nVar2.f2773e;
                    ArrayList arrayList = nVar2.f2769a;
                    if (!z7) {
                        arrayList.add(a6);
                    }
                    if (this.f2444u && view != null) {
                        view.setTranslationY(f6);
                        g1 a7 = u0.a(view);
                        a7.e(0.0f);
                        if (!nVar2.f2773e) {
                            arrayList.add(a7);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = F;
                    boolean z8 = nVar2.f2773e;
                    if (!z8) {
                        nVar2.f2771c = decelerateInterpolator;
                    }
                    if (!z8) {
                        nVar2.f2770b = 250;
                    }
                    if (!z8) {
                        nVar2.f2772d = q0Var;
                    }
                    this.f2447y = nVar2;
                    nVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2432i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    h0.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f2446x) {
            this.f2446x = false;
            n nVar3 = this.f2447y;
            if (nVar3 != null) {
                nVar3.a();
            }
            int i6 = this.f2443t;
            q0 q0Var2 = this.B;
            if (i6 != 0 || (!this.f2448z && !z5)) {
                q0Var2.a();
                return;
            }
            this.f2433j.setAlpha(1.0f);
            this.f2433j.setTransitioning(true);
            n nVar4 = new n();
            float f7 = (float) (-this.f2433j.getHeight());
            if (z5) {
                int[] iArr2 = {0, 0};
                this.f2433j.getLocationInWindow(iArr2);
                f7 -= (float) iArr2[1];
            }
            g1 a8 = u0.a(this.f2433j);
            a8.e(f7);
            View view3 = (View) a8.f5569a.get();
            if (view3 != null) {
                if (n0Var != null) {
                    d1Var = new d1(n0Var, view3);
                }
                f1.a(view3.animate(), d1Var);
            }
            boolean z9 = nVar4.f2773e;
            ArrayList arrayList2 = nVar4.f2769a;
            if (!z9) {
                arrayList2.add(a8);
            }
            if (this.f2444u && view != null) {
                g1 a9 = u0.a(view);
                a9.e(f7);
                if (!nVar4.f2773e) {
                    arrayList2.add(a9);
                }
            }
            AccelerateInterpolator accelerateInterpolator = E;
            boolean z10 = nVar4.f2773e;
            if (!z10) {
                nVar4.f2771c = accelerateInterpolator;
            }
            if (!z10) {
                nVar4.f2770b = 250;
            }
            if (!z10) {
                nVar4.f2772d = q0Var2;
            }
            this.f2447y = nVar4;
            nVar4.b();
        }
    }

    public s0(Dialog dialog) {
        new ArrayList();
        q(dialog.getWindow().getDecorView());
    }
}
