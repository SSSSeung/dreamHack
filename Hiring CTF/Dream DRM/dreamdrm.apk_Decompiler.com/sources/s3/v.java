package s3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.WeakHashMap;
import x0.e0;
import x0.g0;
import x0.m;
import x0.u0;

public final class v extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f5060d;

    /* renamed from: e  reason: collision with root package name */
    public final i1 f5061e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f5062f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckableImageButton f5063g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f5064h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f5065i;

    /* renamed from: j  reason: collision with root package name */
    public int f5066j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView.ScaleType f5067k;

    /* renamed from: l  reason: collision with root package name */
    public View.OnLongClickListener f5068l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5069m;

    public v(TextInputLayout textInputLayout, m3 m3Var) {
        super(textInputLayout.getContext());
        CharSequence k6;
        this.f5060d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f5063g = checkableImageButton;
        CharSequence charSequence = null;
        i1 i1Var = new i1(getContext(), (AttributeSet) null);
        this.f5061e = i1Var;
        if (o.E(getContext())) {
            m.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f5068l;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        o.W(checkableImageButton, onLongClickListener);
        this.f5068l = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        o.W(checkableImageButton, (View.OnLongClickListener) null);
        if (m3Var.l(69)) {
            this.f5064h = o.v(getContext(), m3Var, 69);
        }
        if (m3Var.l(70)) {
            this.f5065i = o.K(m3Var.h(70, -1), (PorterDuff.Mode) null);
        }
        if (m3Var.l(66)) {
            b(m3Var.e(66));
            if (m3Var.l(65) && checkableImageButton.getContentDescription() != (k6 = m3Var.k(65))) {
                checkableImageButton.setContentDescription(k6);
            }
            checkableImageButton.setCheckable(m3Var.a(64, true));
        }
        int d6 = m3Var.d(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d6 >= 0) {
            if (d6 != this.f5066j) {
                this.f5066j = d6;
                checkableImageButton.setMinimumWidth(d6);
                checkableImageButton.setMinimumHeight(d6);
            }
            if (m3Var.l(68)) {
                ImageView.ScaleType q5 = o.q(m3Var.h(68, -1));
                this.f5067k = q5;
                checkableImageButton.setScaleType(q5);
            }
            i1Var.setVisibility(8);
            i1Var.setId(R.id.textinput_prefix_text);
            i1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = u0.f5622a;
            g0.f(i1Var, 1);
            i1Var.setTextAppearance(m3Var.i(60, 0));
            if (m3Var.l(61)) {
                i1Var.setTextColor(m3Var.b(61));
            }
            CharSequence k7 = m3Var.k(59);
            this.f5062f = !TextUtils.isEmpty(k7) ? k7 : charSequence;
            i1Var.setText(k7);
            e();
            addView(checkableImageButton);
            addView(i1Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        CheckableImageButton checkableImageButton = this.f5063g;
        int i3 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            i3 = m.b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = u0.f5622a;
        return e0.f(this.f5061e) + e0.f(this) + i3;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f5063g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f5064h;
            PorterDuff.Mode mode = this.f5065i;
            TextInputLayout textInputLayout = this.f5060d;
            o.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            o.S(textInputLayout, checkableImageButton, this.f5064h);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f5068l;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        o.W(checkableImageButton, onLongClickListener);
        this.f5068l = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        o.W(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z5) {
        CheckableImageButton checkableImageButton = this.f5063g;
        int i3 = 0;
        if ((checkableImageButton.getVisibility() == 0) != z5) {
            if (!z5) {
                i3 = 8;
            }
            checkableImageButton.setVisibility(i3);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f5060d.f2030g;
        if (editText != null) {
            int i3 = 0;
            if (!(this.f5063g.getVisibility() == 0)) {
                WeakHashMap weakHashMap = u0.f5622a;
                i3 = e0.f(editText);
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = u0.f5622a;
            e0.k(this.f5061e, i3, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i3 = 8;
        int i6 = (this.f5062f == null || this.f5069m) ? 8 : 0;
        if (this.f5063g.getVisibility() == 0 || i6 == 0) {
            i3 = 0;
        }
        setVisibility(i3);
        this.f5061e.setVisibility(i6);
        this.f5060d.p();
    }

    public final void onMeasure(int i3, int i6) {
        super.onMeasure(i3, i6);
        d();
    }
}
