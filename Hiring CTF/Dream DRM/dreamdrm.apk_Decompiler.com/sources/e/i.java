package e;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.o;
import androidx.core.widget.NestedScrollView;
import com.theori.dreamdrm.R;
import g.n;
import w4.p;

public final class i extends o implements DialogInterface, m {

    /* renamed from: g  reason: collision with root package name */
    public e0 f2385g;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f2386h = new f0(this);

    /* renamed from: i  reason: collision with root package name */
    public final g f2387i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(android.content.Context r2, int r3) {
        /*
            r1 = this;
            int r3 = p(r2, r3)
            int r0 = l(r2, r3)
            r1.<init>(r2, r0)
            e.f0 r0 = new e.f0
            r0.<init>(r1)
            r1.f2386h = r0
            e.q r0 = r1.k()
            int r2 = l(r2, r3)
            r3 = r0
            e.e0 r3 = (e.e0) r3
            r3.X = r2
            r0.g()
            e.g r2 = new e.g
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.f2387i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.<init>(android.content.Context, int):void");
    }

    public static int l(Context context, int i3) {
        if (i3 != 0) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public static int p(Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final /* bridge */ /* synthetic */ void c() {
    }

    /* renamed from: d */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().a(view, layoutParams);
    }

    /* renamed from: e */
    public final void dismiss() {
        super.dismiss();
        k().h();
    }

    public final /* bridge */ /* synthetic */ void f() {
    }

    public final /* bridge */ /* synthetic */ void g() {
    }

    /* renamed from: i */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p.m(this.f2386h, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: j */
    public final View findViewById(int i3) {
        e0 e0Var = (e0) k();
        e0Var.x();
        return e0Var.f2334o.findViewById(i3);
    }

    public final q k() {
        if (this.f2385g == null) {
            l0 l0Var = q.f2410d;
            this.f2385g = new e0(getContext(), getWindow(), this, this);
        }
        return this.f2385g;
    }

    /* renamed from: m */
    public final void invalidateOptionsMenu() {
        k().e();
    }

    public final void n(Bundle bundle) {
        k().b();
        super.onCreate(bundle);
        k().g();
    }

    /* renamed from: o */
    public final void onStop() {
        super.onStop();
        e0 e0Var = (e0) k();
        e0Var.C();
        s0 s0Var = e0Var.f2337r;
        if (s0Var != null) {
            s0Var.f2448z = false;
            n nVar = s0Var.f2447y;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x028e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r14.n(r15)
            e.g r15 = r14.f2387i
            e.i r0 = r15.f2347b
            int r1 = r15.f2370z
            r0.setContentView(r1)
            android.view.Window r0 = r15.f2348c
            r1 = 2131231040(0x7f080140, float:1.807815E38)
            android.view.View r1 = r0.findViewById(r1)
            r2 = 2131231160(0x7f0801b8, float:1.8078393E38)
            android.view.View r3 = r1.findViewById(r2)
            r4 = 2131230835(0x7f080073, float:1.8077734E38)
            android.view.View r5 = r1.findViewById(r4)
            r6 = 2131230810(0x7f08005a, float:1.8077683E38)
            android.view.View r6 = r1.findViewById(r6)
            r7 = 2131230842(0x7f08007a, float:1.8077748E38)
            android.view.View r1 = r1.findViewById(r7)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r7 = r15.f2353h
            r8 = 0
            android.content.Context r9 = r15.f2346a
            if (r7 == 0) goto L_0x003b
            goto L_0x004b
        L_0x003b:
            int r7 = r15.f2354i
            if (r7 == 0) goto L_0x004a
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r9)
            int r10 = r15.f2354i
            android.view.View r7 = r7.inflate(r10, r1, r8)
            goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x004f
            r10 = 1
            goto L_0x0050
        L_0x004f:
            r10 = r8
        L_0x0050:
            if (r10 == 0) goto L_0x0058
            boolean r11 = e.g.a(r7)
            if (r11 != 0) goto L_0x005d
        L_0x0058:
            r11 = 131072(0x20000, float:1.83671E-40)
            r0.setFlags(r11, r11)
        L_0x005d:
            r11 = -1
            r12 = 8
            if (r10 == 0) goto L_0x0088
            r10 = 2131230841(0x7f080079, float:1.8077746E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r11, r11)
            r10.addView(r7, r13)
            boolean r7 = r15.f2355j
            if (r7 == 0) goto L_0x007a
            r10.setPadding(r8, r8, r8, r8)
        L_0x007a:
            androidx.appcompat.app.AlertController$RecycleListView r7 = r15.f2352g
            if (r7 == 0) goto L_0x008b
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            androidx.appcompat.widget.f2 r7 = (androidx.appcompat.widget.f2) r7
            r10 = 0
            r7.weight = r10
            goto L_0x008b
        L_0x0088:
            r1.setVisibility(r12)
        L_0x008b:
            android.view.View r2 = r1.findViewById(r2)
            android.view.View r4 = r1.findViewById(r4)
            r7 = 2131230810(0x7f08005a, float:1.8077683E38)
            android.view.View r7 = r1.findViewById(r7)
            android.view.ViewGroup r2 = e.g.c(r2, r3)
            android.view.ViewGroup r3 = e.g.c(r4, r5)
            android.view.ViewGroup r4 = e.g.c(r7, r6)
            r5 = 2131231076(0x7f080164, float:1.8078223E38)
            android.view.View r5 = r0.findViewById(r5)
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            r15.f2362q = r5
            r5.setFocusable(r8)
            androidx.core.widget.NestedScrollView r5 = r15.f2362q
            r5.setNestedScrollingEnabled(r8)
            r5 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r15.f2367v = r5
            if (r5 != 0) goto L_0x00c7
            goto L_0x00fc
        L_0x00c7:
            java.lang.CharSequence r6 = r15.f2351f
            if (r6 == 0) goto L_0x00cf
            r5.setText(r6)
            goto L_0x00fc
        L_0x00cf:
            r5.setVisibility(r12)
            androidx.core.widget.NestedScrollView r5 = r15.f2362q
            android.widget.TextView r6 = r15.f2367v
            r5.removeView(r6)
            androidx.appcompat.app.AlertController$RecycleListView r5 = r15.f2352g
            if (r5 == 0) goto L_0x00f9
            androidx.core.widget.NestedScrollView r5 = r15.f2362q
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.core.widget.NestedScrollView r6 = r15.f2362q
            int r6 = r5.indexOfChild(r6)
            r5.removeViewAt(r6)
            androidx.appcompat.app.AlertController$RecycleListView r7 = r15.f2352g
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r10.<init>(r11, r11)
            r5.addView(r7, r6, r10)
            goto L_0x00fc
        L_0x00f9:
            r3.setVisibility(r12)
        L_0x00fc:
            r5 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r15.f2356k = r5
            e.b r6 = r15.F
            r5.setOnClickListener(r6)
            java.lang.CharSequence r5 = r15.f2357l
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            int r7 = r15.f2349d
            if (r5 == 0) goto L_0x0121
            android.graphics.drawable.Drawable r5 = r15.f2359n
            if (r5 != 0) goto L_0x0121
            android.widget.Button r5 = r15.f2356k
            r5.setVisibility(r12)
            r5 = r8
            goto L_0x013d
        L_0x0121:
            android.widget.Button r5 = r15.f2356k
            java.lang.CharSequence r10 = r15.f2357l
            r5.setText(r10)
            android.graphics.drawable.Drawable r5 = r15.f2359n
            if (r5 == 0) goto L_0x0137
            r5.setBounds(r8, r8, r7, r7)
            android.widget.Button r5 = r15.f2356k
            android.graphics.drawable.Drawable r7 = r15.f2359n
            r10 = 0
            r5.setCompoundDrawables(r7, r10, r10, r10)
        L_0x0137:
            android.widget.Button r5 = r15.f2356k
            r5.setVisibility(r8)
            r5 = 1
        L_0x013d:
            r7 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r15.f2360o = r7
            r7.setOnClickListener(r6)
            r7 = 0
            r15.getClass()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x015e
            r15.getClass()
            android.widget.Button r7 = r15.f2360o
            r7.setVisibility(r12)
            goto L_0x0171
        L_0x015e:
            android.widget.Button r7 = r15.f2360o
            r10 = 0
            r15.getClass()
            r7.setText(r10)
            r15.getClass()
            android.widget.Button r7 = r15.f2360o
            r7.setVisibility(r8)
            r5 = r5 | 2
        L_0x0171:
            r7 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r15.f2361p = r7
            r7.setOnClickListener(r6)
            r6 = 0
            r15.getClass()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0193
            r15.getClass()
            android.widget.Button r6 = r15.f2361p
            r6.setVisibility(r12)
            r6 = 0
            goto L_0x01a7
        L_0x0193:
            android.widget.Button r6 = r15.f2361p
            r7 = 0
            r15.getClass()
            r6.setText(r7)
            r15.getClass()
            r6 = 0
            android.widget.Button r7 = r15.f2361p
            r7.setVisibility(r8)
            r5 = r5 | 4
        L_0x01a7:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r9 = r9.getTheme()
            r10 = 2130903080(0x7f030028, float:1.7412968E38)
            r11 = 1
            r9.resolveAttribute(r10, r7, r11)
            int r7 = r7.data
            if (r7 == 0) goto L_0x01bd
            r7 = r11
            goto L_0x01be
        L_0x01bd:
            r7 = r8
        L_0x01be:
            r9 = 2
            if (r7 == 0) goto L_0x01e0
            if (r5 != r11) goto L_0x01c6
            android.widget.Button r7 = r15.f2356k
            goto L_0x01d0
        L_0x01c6:
            if (r5 != r9) goto L_0x01cb
            android.widget.Button r7 = r15.f2360o
            goto L_0x01d0
        L_0x01cb:
            r7 = 4
            if (r5 != r7) goto L_0x01e0
            android.widget.Button r7 = r15.f2361p
        L_0x01d0:
            android.view.ViewGroup$LayoutParams r10 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            r11 = 1
            r10.gravity = r11
            r11 = 1056964608(0x3f000000, float:0.5)
            r10.weight = r11
            r7.setLayoutParams(r10)
        L_0x01e0:
            if (r5 == 0) goto L_0x01e4
            r5 = 1
            goto L_0x01e5
        L_0x01e4:
            r5 = r8
        L_0x01e5:
            if (r5 != 0) goto L_0x01ea
            r4.setVisibility(r12)
        L_0x01ea:
            android.view.View r5 = r15.w
            r7 = 2131231157(0x7f0801b5, float:1.8078387E38)
            if (r5 == 0) goto L_0x0202
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r11 = -1
            r5.<init>(r11, r10)
            android.view.View r10 = r15.w
            r2.addView(r10, r8, r5)
            android.view.View r5 = r0.findViewById(r7)
            goto L_0x026f
        L_0x0202:
            r5 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r15.f2365t = r5
            java.lang.CharSequence r5 = r15.f2350e
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0262
            boolean r5 = r15.D
            if (r5 == 0) goto L_0x0262
            r5 = 2131230789(0x7f080045, float:1.807764E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r15.f2366u = r5
            java.lang.CharSequence r7 = r15.f2350e
            r5.setText(r7)
            int r5 = r15.f2363r
            if (r5 == 0) goto L_0x0235
            android.widget.ImageView r7 = r15.f2365t
            r7.setImageResource(r5)
            goto L_0x0272
        L_0x0235:
            android.graphics.drawable.Drawable r5 = r15.f2364s
            if (r5 == 0) goto L_0x023f
            android.widget.ImageView r7 = r15.f2365t
            r7.setImageDrawable(r5)
            goto L_0x0272
        L_0x023f:
            android.widget.TextView r5 = r15.f2366u
            android.widget.ImageView r7 = r15.f2365t
            int r7 = r7.getPaddingLeft()
            android.widget.ImageView r10 = r15.f2365t
            int r10 = r10.getPaddingTop()
            android.widget.ImageView r11 = r15.f2365t
            int r11 = r11.getPaddingRight()
            android.widget.ImageView r13 = r15.f2365t
            int r13 = r13.getPaddingBottom()
            r5.setPadding(r7, r10, r11, r13)
            android.widget.ImageView r5 = r15.f2365t
            r5.setVisibility(r12)
            goto L_0x0272
        L_0x0262:
            android.view.View r5 = r0.findViewById(r7)
            r5.setVisibility(r12)
            android.widget.ImageView r5 = r15.f2365t
            r5.setVisibility(r12)
            r5 = r2
        L_0x026f:
            r5.setVisibility(r12)
        L_0x0272:
            int r1 = r1.getVisibility()
            if (r1 == r12) goto L_0x027a
            r1 = 1
            goto L_0x027b
        L_0x027a:
            r1 = r8
        L_0x027b:
            if (r2 == 0) goto L_0x0285
            int r5 = r2.getVisibility()
            if (r5 == r12) goto L_0x0285
            r5 = 1
            goto L_0x0286
        L_0x0285:
            r5 = r8
        L_0x0286:
            int r4 = r4.getVisibility()
            if (r4 == r12) goto L_0x028e
            r4 = 1
            goto L_0x028f
        L_0x028e:
            r4 = r8
        L_0x028f:
            if (r4 != 0) goto L_0x029d
            r7 = 2131231141(0x7f0801a5, float:1.8078355E38)
            android.view.View r7 = r3.findViewById(r7)
            if (r7 == 0) goto L_0x029d
            r7.setVisibility(r8)
        L_0x029d:
            if (r5 == 0) goto L_0x02bc
            androidx.core.widget.NestedScrollView r7 = r15.f2362q
            if (r7 == 0) goto L_0x02a7
            r10 = 1
            r7.setClipToPadding(r10)
        L_0x02a7:
            java.lang.CharSequence r7 = r15.f2351f
            if (r7 != 0) goto L_0x02af
            androidx.appcompat.app.AlertController$RecycleListView r7 = r15.f2352g
            if (r7 == 0) goto L_0x02b6
        L_0x02af:
            r6 = 2131231156(0x7f0801b4, float:1.8078385E38)
            android.view.View r6 = r2.findViewById(r6)
        L_0x02b6:
            if (r6 == 0) goto L_0x02c8
            r6.setVisibility(r8)
            goto L_0x02c8
        L_0x02bc:
            r2 = 2131231142(0x7f0801a6, float:1.8078357E38)
            android.view.View r2 = r3.findViewById(r2)
            if (r2 == 0) goto L_0x02c8
            r2.setVisibility(r8)
        L_0x02c8:
            androidx.appcompat.app.AlertController$RecycleListView r2 = r15.f2352g
            boolean r6 = r2 instanceof androidx.appcompat.app.AlertController$RecycleListView
            if (r6 == 0) goto L_0x02f2
            r2.getClass()
            if (r4 == 0) goto L_0x02d5
            if (r5 != 0) goto L_0x02f2
        L_0x02d5:
            int r6 = r2.getPaddingLeft()
            if (r5 == 0) goto L_0x02e0
            int r7 = r2.getPaddingTop()
            goto L_0x02e2
        L_0x02e0:
            int r7 = r2.f350d
        L_0x02e2:
            int r10 = r2.getPaddingRight()
            if (r4 == 0) goto L_0x02ed
            int r11 = r2.getPaddingBottom()
            goto L_0x02ef
        L_0x02ed:
            int r11 = r2.f351e
        L_0x02ef:
            r2.setPadding(r6, r7, r10, r11)
        L_0x02f2:
            if (r1 != 0) goto L_0x0320
            androidx.appcompat.app.AlertController$RecycleListView r1 = r15.f2352g
            if (r1 == 0) goto L_0x02f9
            goto L_0x02fb
        L_0x02f9:
            androidx.core.widget.NestedScrollView r1 = r15.f2362q
        L_0x02fb:
            if (r1 == 0) goto L_0x0320
            if (r4 == 0) goto L_0x0300
            r8 = r9
        L_0x0300:
            r2 = r5 | r8
            r4 = 2131231075(0x7f080163, float:1.807822E38)
            android.view.View r4 = r0.findViewById(r4)
            r5 = 2131231074(0x7f080162, float:1.8078219E38)
            android.view.View r0 = r0.findViewById(r5)
            java.util.WeakHashMap r5 = x0.u0.f5622a
            r5 = 3
            x0.k0.d(r1, r2, r5)
            if (r4 == 0) goto L_0x031b
            r3.removeView(r4)
        L_0x031b:
            if (r0 == 0) goto L_0x0320
            r3.removeView(r0)
        L_0x0320:
            androidx.appcompat.app.AlertController$RecycleListView r0 = r15.f2352g
            if (r0 == 0) goto L_0x0337
            android.widget.ListAdapter r1 = r15.f2368x
            if (r1 == 0) goto L_0x0337
            r0.setAdapter(r1)
            int r15 = r15.f2369y
            r1 = -1
            if (r15 <= r1) goto L_0x0337
            r1 = 1
            r0.setItemChecked(r15, r1)
            r0.setSelection(r15)
        L_0x0337:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2387i.f2362q;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2387i.f2362q;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i3, keyEvent);
    }

    /* renamed from: q */
    public final void setContentView(int i3) {
        k().k(i3);
    }

    /* renamed from: r */
    public final void setContentView(View view) {
        k().l(view);
    }

    /* renamed from: s */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().m(view, layoutParams);
    }

    /* renamed from: t */
    public final void setTitle(int i3) {
        super.setTitle(i3);
        k().n(getContext().getString(i3));
    }

    public final void u(CharSequence charSequence) {
        super.setTitle(charSequence);
        k().n(charSequence);
    }

    /* access modifiers changed from: package-private */
    public final boolean v(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        u(charSequence);
        g gVar = this.f2387i;
        gVar.f2350e = charSequence;
        TextView textView = gVar.f2366u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
