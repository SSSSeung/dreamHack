package s3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.m3;
import b1.o;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.theori.dreamdrm.R;
import j0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import w4.p;
import x0.d0;
import x0.e0;
import x0.g0;
import x0.m;
import x0.u0;
import y0.c;
import y0.d;

public final class n extends LinearLayout {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f4989z = 0;

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f4990d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f4991e;

    /* renamed from: f  reason: collision with root package name */
    public final CheckableImageButton f4992f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4993g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4994h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnLongClickListener f4995i;

    /* renamed from: j  reason: collision with root package name */
    public final CheckableImageButton f4996j;

    /* renamed from: k  reason: collision with root package name */
    public final f f4997k;

    /* renamed from: l  reason: collision with root package name */
    public int f4998l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashSet f4999m = new LinkedHashSet();

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f5000n;

    /* renamed from: o  reason: collision with root package name */
    public PorterDuff.Mode f5001o;

    /* renamed from: p  reason: collision with root package name */
    public int f5002p;

    /* renamed from: q  reason: collision with root package name */
    public ImageView.ScaleType f5003q;

    /* renamed from: r  reason: collision with root package name */
    public View.OnLongClickListener f5004r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f5005s;

    /* renamed from: t  reason: collision with root package name */
    public final i1 f5006t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5007u;

    /* renamed from: v  reason: collision with root package name */
    public EditText f5008v;
    public final AccessibilityManager w;

    /* renamed from: x  reason: collision with root package name */
    public d f5009x;

    /* renamed from: y  reason: collision with root package name */
    public final l f5010y = new l(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(TextInputLayout textInputLayout, m3 m3Var) {
        super(textInputLayout.getContext());
        CharSequence k6;
        TextInputLayout textInputLayout2 = textInputLayout;
        m3 m3Var2 = m3Var;
        m mVar = new m(this);
        this.w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f4990d = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4991e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a6 = a(this, from, R.id.text_input_error_icon);
        this.f4992f = a6;
        CheckableImageButton a7 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f4996j = a7;
        this.f4997k = new f(this, m3Var2);
        CharSequence charSequence = null;
        i1 i1Var = new i1(getContext(), (AttributeSet) null);
        this.f5006t = i1Var;
        if (m3Var2.l(38)) {
            this.f4993g = o.v(getContext(), m3Var2, 38);
        }
        if (m3Var2.l(39)) {
            this.f4994h = o.K(m3Var2.h(39, -1), (PorterDuff.Mode) null);
        }
        if (m3Var2.l(37)) {
            i(m3Var2.e(37));
        }
        a6.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = u0.f5622a;
        d0.s(a6, 2);
        a6.setClickable(false);
        a6.setPressable(false);
        a6.setFocusable(false);
        if (!m3Var2.l(53)) {
            if (m3Var2.l(32)) {
                this.f5000n = o.v(getContext(), m3Var2, 32);
            }
            if (m3Var2.l(33)) {
                this.f5001o = o.K(m3Var2.h(33, -1), (PorterDuff.Mode) null);
            }
        }
        if (m3Var2.l(30)) {
            g(m3Var2.h(30, 0));
            if (m3Var2.l(27) && a7.getContentDescription() != (k6 = m3Var2.k(27))) {
                a7.setContentDescription(k6);
            }
            a7.setCheckable(m3Var2.a(26, true));
        } else if (m3Var2.l(53)) {
            if (m3Var2.l(54)) {
                this.f5000n = o.v(getContext(), m3Var2, 54);
            }
            if (m3Var2.l(55)) {
                this.f5001o = o.K(m3Var2.h(55, -1), (PorterDuff.Mode) null);
            }
            g(m3Var2.a(53, false) ? 1 : 0);
            CharSequence k7 = m3Var2.k(51);
            if (a7.getContentDescription() != k7) {
                a7.setContentDescription(k7);
            }
        }
        int d6 = m3Var2.d(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d6 >= 0) {
            if (d6 != this.f5002p) {
                this.f5002p = d6;
                a7.setMinimumWidth(d6);
                a7.setMinimumHeight(d6);
                a6.setMinimumWidth(d6);
                a6.setMinimumHeight(d6);
            }
            if (m3Var2.l(31)) {
                ImageView.ScaleType q5 = o.q(m3Var2.h(31, -1));
                this.f5003q = q5;
                a7.setScaleType(q5);
                a6.setScaleType(q5);
            }
            i1Var.setVisibility(8);
            i1Var.setId(R.id.textinput_suffix_text);
            i1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            g0.f(i1Var, 1);
            i1Var.setTextAppearance(m3Var2.i(72, 0));
            if (m3Var2.l(73)) {
                i1Var.setTextColor(m3Var2.b(73));
            }
            CharSequence k8 = m3Var2.k(71);
            this.f5005s = !TextUtils.isEmpty(k8) ? k8 : charSequence;
            i1Var.setText(k8);
            n();
            frameLayout.addView(a7);
            addView(i1Var);
            addView(frameLayout);
            addView(a6);
            textInputLayout2.f2033h0.add(mVar);
            if (textInputLayout2.f2030g != null) {
                mVar.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new h.f(2, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i3) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i3);
        if (o.E(getContext())) {
            m.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o b() {
        int i3 = this.f4998l;
        f fVar = this.f4997k;
        SparseArray sparseArray = (SparseArray) fVar.f3701f;
        o oVar = (o) sparseArray.get(i3);
        if (oVar == null) {
            if (i3 == -1) {
                oVar = new e((n) fVar.f3702g, 0);
            } else if (i3 == 0) {
                oVar = new e((n) fVar.f3702g, 1);
            } else if (i3 == 1) {
                oVar = new u((n) fVar.f3702g, fVar.f3700e);
            } else if (i3 == 2) {
                oVar = new d((n) fVar.f3702g);
            } else if (i3 == 3) {
                oVar = new k((n) fVar.f3702g);
            } else {
                throw new IllegalArgumentException(a2.m.g("Invalid end icon mode: ", i3));
            }
            sparseArray.append(i3, oVar);
        }
        return oVar;
    }

    public final int c() {
        int i3;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f4996j;
            i3 = m.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        WeakHashMap weakHashMap = u0.f5622a;
        return e0.e(this.f5006t) + e0.e(this) + i3;
    }

    public final boolean d() {
        return this.f4991e.getVisibility() == 0 && this.f4996j.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f4992f.getVisibility() == 0;
    }

    public final void f(boolean z5) {
        boolean z6;
        boolean isActivated;
        boolean isChecked;
        o b6 = b();
        boolean k6 = b6.k();
        CheckableImageButton checkableImageButton = this.f4996j;
        boolean z7 = true;
        if (!k6 || (isChecked = checkableImageButton.isChecked()) == b6.l()) {
            z6 = false;
        } else {
            checkableImageButton.setChecked(!isChecked);
            z6 = true;
        }
        if (!(b6 instanceof k) || (isActivated = checkableImageButton.isActivated()) == b6.j()) {
            z7 = z6;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z5 || z7) {
            o.S(this.f4990d, checkableImageButton, this.f5000n);
        }
    }

    public final void g(int i3) {
        if (this.f4998l != i3) {
            o b6 = b();
            d dVar = this.f5009x;
            AccessibilityManager accessibilityManager = this.w;
            if (!(dVar == null || accessibilityManager == null)) {
                c.b(accessibilityManager, dVar);
            }
            CharSequence charSequence = null;
            this.f5009x = null;
            b6.s();
            this.f4998l = i3;
            Iterator it = this.f4999m.iterator();
            if (!it.hasNext()) {
                h(i3 != 0);
                o b7 = b();
                int i6 = this.f4997k.f3699d;
                if (i6 == 0) {
                    i6 = b7.d();
                }
                Drawable n5 = i6 != 0 ? p.n(getContext(), i6) : null;
                CheckableImageButton checkableImageButton = this.f4996j;
                checkableImageButton.setImageDrawable(n5);
                TextInputLayout textInputLayout = this.f4990d;
                if (n5 != null) {
                    o.b(textInputLayout, checkableImageButton, this.f5000n, this.f5001o);
                    o.S(textInputLayout, checkableImageButton, this.f5000n);
                }
                int c6 = b7.c();
                if (c6 != 0) {
                    charSequence = getResources().getText(c6);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b7.k());
                if (b7.i(textInputLayout.getBoxBackgroundMode())) {
                    b7.r();
                    d h6 = b7.h();
                    this.f5009x = h6;
                    if (!(h6 == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = u0.f5622a;
                        if (g0.b(this)) {
                            c.a(accessibilityManager, this.f5009x);
                        }
                    }
                    View.OnClickListener f6 = b7.f();
                    View.OnLongClickListener onLongClickListener = this.f5004r;
                    checkableImageButton.setOnClickListener(f6);
                    o.W(checkableImageButton, onLongClickListener);
                    EditText editText = this.f5008v;
                    if (editText != null) {
                        b7.m(editText);
                        j(b7);
                    }
                    o.b(textInputLayout, checkableImageButton, this.f5000n, this.f5001o);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i3);
            }
            a2.m.o(it.next());
            throw null;
        }
    }

    public final void h(boolean z5) {
        if (d() != z5) {
            this.f4996j.setVisibility(z5 ? 0 : 8);
            k();
            m();
            this.f4990d.p();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4992f;
        checkableImageButton.setImageDrawable(drawable);
        l();
        o.b(this.f4990d, checkableImageButton, this.f4993g, this.f4994h);
    }

    public final void j(o oVar) {
        if (this.f5008v != null) {
            if (oVar.e() != null) {
                this.f5008v.setOnFocusChangeListener(oVar.e());
            }
            if (oVar.g() != null) {
                this.f4996j.setOnFocusChangeListener(oVar.g());
            }
        }
    }

    public final void k() {
        int i3 = 8;
        this.f4991e.setVisibility((this.f4996j.getVisibility() != 0 || e()) ? 8 : 0);
        if (d() || e() || !((this.f5005s == null || this.f5007u) ? true : false)) {
            i3 = 0;
        }
        setVisibility(i3);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f4992f;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z5 = true;
        TextInputLayout textInputLayout = this.f4990d;
        checkableImageButton.setVisibility(drawable != null && textInputLayout.f2042m.f5037q && textInputLayout.l() ? 0 : 8);
        k();
        m();
        if (this.f4998l == 0) {
            z5 = false;
        }
        if (!z5) {
            textInputLayout.p();
        }
    }

    public final void m() {
        int i3;
        TextInputLayout textInputLayout = this.f4990d;
        if (textInputLayout.f2030g != null) {
            if (d() || e()) {
                i3 = 0;
            } else {
                EditText editText = textInputLayout.f2030g;
                WeakHashMap weakHashMap = u0.f5622a;
                i3 = e0.e(editText);
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = textInputLayout.f2030g.getPaddingTop();
            int paddingBottom = textInputLayout.f2030g.getPaddingBottom();
            WeakHashMap weakHashMap2 = u0.f5622a;
            e0.k(this.f5006t, dimensionPixelSize, paddingTop, i3, paddingBottom);
        }
    }

    public final void n() {
        i1 i1Var = this.f5006t;
        int visibility = i1Var.getVisibility();
        boolean z5 = false;
        int i3 = (this.f5005s == null || this.f5007u) ? 8 : 0;
        if (visibility != i3) {
            o b6 = b();
            if (i3 == 0) {
                z5 = true;
            }
            b6.p(z5);
        }
        k();
        i1Var.setVisibility(i3);
        this.f4990d.p();
    }
}
