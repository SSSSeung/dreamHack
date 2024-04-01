package com.google.android.material.datepicker;

import a2.m;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b1.v;
import com.google.android.material.internal.CheckableImageButton;
import com.theori.dreamdrm.R;
import e.n0;
import j0.f;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p3.g;
import w4.p;
import x0.c;
import x0.g0;
import x0.j0;
import x0.j1;
import x0.k1;
import x0.k2;
import x0.l2;
import x0.u0;
import y2.a;

public final class n<S> extends androidx.fragment.app.n {
    public static final /* synthetic */ int E0 = 0;
    public g A0;
    public boolean B0;
    public CharSequence C0;
    public CharSequence D0;

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashSet f1948k0 = new LinkedHashSet();

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet f1949l0 = new LinkedHashSet();

    /* renamed from: m0  reason: collision with root package name */
    public int f1950m0;

    /* renamed from: n0  reason: collision with root package name */
    public u f1951n0;

    /* renamed from: o0  reason: collision with root package name */
    public c f1952o0;

    /* renamed from: p0  reason: collision with root package name */
    public l f1953p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f1954q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f1955r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1956s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1957t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1958u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f1959v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f1960w0;

    /* renamed from: x0  reason: collision with root package name */
    public CharSequence f1961x0;

    /* renamed from: y0  reason: collision with root package name */
    public TextView f1962y0;

    /* renamed from: z0  reason: collision with root package name */
    public CheckableImageButton f1963z0;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int L(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c6 = w.c();
        c6.set(5, 1);
        Calendar b6 = w.b(c6);
        b6.get(2);
        b6.get(1);
        int maximum = b6.getMaximum(7);
        b6.getActualMaximum(5);
        b6.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean M(Context context) {
        return N(context, 16843277);
    }

    public static boolean N(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(v.N(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, new int[]{i3});
        boolean z5 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z5;
    }

    public final Dialog I() {
        Context D = D();
        D();
        int i3 = this.f1950m0;
        if (i3 != 0) {
            Dialog dialog = new Dialog(D, i3);
            Context context = dialog.getContext();
            this.f1956s0 = M(context);
            this.A0 = new g(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131756059);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, a.f5830k, R.attr.materialCalendarStyle, 2131756059);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.A0.h(context);
            this.A0.j(ColorStateList.valueOf(color));
            g gVar = this.A0;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = u0.f5622a;
            gVar.i(j0.i(decorView));
            return dialog;
        }
        K();
        throw null;
    }

    public final void K() {
        m.n(this.f1259i.getParcelable("DATE_SELECTOR_KEY"));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1948k0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1949l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f1259i;
        }
        this.f1950m0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        m.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f1952o0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        m.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f1954q0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1955r0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1957t0 = bundle.getInt("INPUT_MODE_KEY");
        this.f1958u0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1959v0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1960w0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1961x0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f1955r0;
        if (charSequence == null) {
            charSequence = D().getResources().getText(this.f1954q0);
        }
        this.C0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.D0 = charSequence;
    }

    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout.LayoutParams layoutParams;
        View view;
        View inflate = layoutInflater.inflate(this.f1956s0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f1956s0) {
            view = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(L(context), -2);
        } else {
            view = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(L(context), -1);
        }
        view.setLayoutParams(layoutParams);
        WeakHashMap weakHashMap = u0.f5622a;
        g0.f((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text), 1);
        this.f1963z0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1962y0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1963z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1963z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, p.n(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], p.n(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1963z0.setChecked(this.f1957t0 != 0);
        u0.l(this.f1963z0, (c) null);
        this.f1963z0.setContentDescription(this.f1963z0.getContext().getString(this.f1957t0 == 1 ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f1963z0.setOnClickListener(new m(0, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        K();
        throw null;
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1950m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        a aVar = new a(this.f1952o0);
        l lVar = this.f1953p0;
        p pVar = lVar == null ? null : lVar.Y;
        if (pVar != null) {
            aVar.f1914c = Long.valueOf(pVar.f1969i);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", aVar.f1916e);
        p b6 = p.b(aVar.f1912a);
        p b7 = p.b(aVar.f1913b);
        b bVar = (b) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l6 = aVar.f1914c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(b6, b7, bVar, l6 == null ? null : p.b(l6.longValue()), aVar.f1915d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1954q0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1955r0);
        bundle.putInt("INPUT_MODE_KEY", this.f1957t0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1958u0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1959v0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1960w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1961x0);
    }

    public final void y() {
        CharSequence charSequence;
        super.y();
        Window window = J().getWindow();
        boolean z5 = false;
        if (this.f1956s0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A0);
            if (!this.B0) {
                View findViewById = E().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i3 = Build.VERSION.SDK_INT;
                boolean z6 = valueOf == null || valueOf.intValue() == 0;
                int t5 = v.t(window.getContext(), 16842801, -16777216);
                if (z6) {
                    valueOf = Integer.valueOf(t5);
                }
                Integer valueOf2 = Integer.valueOf(t5);
                if (i3 >= 30) {
                    k1.a(window, false);
                } else {
                    j1.a(window, false);
                }
                window.getContext();
                int c6 = i3 < 27 ? q0.a.c(v.t(window.getContext(), 16843858, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(c6);
                boolean z7 = v.z(0) || v.z(valueOf.intValue());
                n0 n0Var = new n0(window.getDecorView(), 13);
                (Build.VERSION.SDK_INT >= 30 ? new l2(window, n0Var) : new k2(window, n0Var)).z(z7);
                boolean z8 = v.z(c6) || (c6 == 0 && v.z(valueOf2.intValue()));
                n0 n0Var2 = new n0(window.getDecorView(), 13);
                (Build.VERSION.SDK_INT >= 30 ? new l2(window, n0Var2) : new k2(window, n0Var2)).y(z8);
                f fVar = new f(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = u0.f5622a;
                j0.u(findViewById, fVar);
                this.B0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = D().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new h3.a(J(), rect));
        }
        D();
        int i6 = this.f1950m0;
        if (i6 != 0) {
            K();
            c cVar = this.f1952o0;
            l lVar = new l();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i6);
            bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
            bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f1920g);
            lVar.G(bundle);
            this.f1953p0 = lVar;
            u uVar = lVar;
            if (this.f1957t0 == 1) {
                K();
                c cVar2 = this.f1952o0;
                u oVar = new o();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i6);
                bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
                oVar.G(bundle2);
                uVar = oVar;
            }
            this.f1951n0 = uVar;
            TextView textView = this.f1962y0;
            if (this.f1957t0 == 1) {
                if (D().getResources().getConfiguration().orientation == 2) {
                    z5 = true;
                }
                if (z5) {
                    charSequence = this.D0;
                    textView.setText(charSequence);
                    K();
                    i();
                    throw null;
                }
            }
            charSequence = this.C0;
            textView.setText(charSequence);
            K();
            i();
            throw null;
        }
        K();
        throw null;
    }

    public final void z() {
        this.f1951n0.V.clear();
        super.z();
    }
}
