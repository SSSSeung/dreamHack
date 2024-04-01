package s3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i1;
import b1.o;
import com.bumptech.glide.c;
import com.google.android.material.textfield.TextInputLayout;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.e0;
import x0.g0;
import x0.u0;
import z2.a;

public final class r {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f5021a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5022b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5023c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f5024d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f5025e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f5026f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f5027g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f5028h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f5029i;

    /* renamed from: j  reason: collision with root package name */
    public int f5030j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f5031k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f5032l;

    /* renamed from: m  reason: collision with root package name */
    public final float f5033m;

    /* renamed from: n  reason: collision with root package name */
    public int f5034n;

    /* renamed from: o  reason: collision with root package name */
    public int f5035o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f5036p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5037q;

    /* renamed from: r  reason: collision with root package name */
    public i1 f5038r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f5039s;

    /* renamed from: t  reason: collision with root package name */
    public int f5040t;

    /* renamed from: u  reason: collision with root package name */
    public int f5041u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f5042v;
    public CharSequence w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5043x;

    /* renamed from: y  reason: collision with root package name */
    public i1 f5044y;

    /* renamed from: z  reason: collision with root package name */
    public int f5045z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5027g = context;
        this.f5028h = textInputLayout;
        this.f5033m = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f5021a = c.D(context, R.attr.motionDurationShort4, 217);
        this.f5022b = c.D(context, R.attr.motionDurationMedium4, 167);
        this.f5023c = c.D(context, R.attr.motionDurationShort4, 167);
        this.f5024d = c.E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, a.f5936d);
        LinearInterpolator linearInterpolator = a.f5933a;
        this.f5025e = c.E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f5026f = c.E(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i3) {
        if (this.f5029i == null && this.f5031k == null) {
            Context context = this.f5027g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f5029i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f5029i;
            TextInputLayout textInputLayout = this.f5028h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f5031k = new FrameLayout(context);
            this.f5029i.addView(this.f5031k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i3 == 0 || i3 == 1) {
            this.f5031k.setVisibility(0);
            this.f5031k.addView(textView);
        } else {
            this.f5029i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5029i.setVisibility(0);
        this.f5030j++;
    }

    public final void b() {
        LinearLayout linearLayout = this.f5029i;
        TextInputLayout textInputLayout = this.f5028h;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f5027g;
            boolean E = o.E(context);
            LinearLayout linearLayout2 = this.f5029i;
            WeakHashMap weakHashMap = u0.f5622a;
            int f6 = e0.f(editText);
            if (E) {
                f6 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (E) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e6 = e0.e(editText);
            if (E) {
                e6 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            e0.k(linearLayout2, f6, dimensionPixelSize, e6, 0);
        }
    }

    public final void c() {
        Animator animator = this.f5032l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z5, TextView textView, int i3, int i6, int i7) {
        if (textView != null && z5) {
            if (i3 == i7 || i3 == i6) {
                boolean z6 = i7 == i3;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z6 ? 1.0f : 0.0f});
                int i8 = this.f5023c;
                ofFloat.setDuration((long) (z6 ? this.f5022b : i8));
                ofFloat.setInterpolator(z6 ? this.f5025e : this.f5026f);
                if (i3 == i7 && i6 != 0) {
                    ofFloat.setStartDelay((long) i8);
                }
                arrayList.add(ofFloat);
                if (i7 == i3 && i6 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f5033m, 0.0f});
                    ofFloat2.setDuration((long) this.f5021a);
                    ofFloat2.setInterpolator(this.f5024d);
                    ofFloat2.setStartDelay((long) i8);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i3) {
        if (i3 == 1) {
            return this.f5038r;
        }
        if (i3 != 2) {
            return null;
        }
        return this.f5044y;
    }

    public final void f() {
        this.f5036p = null;
        c();
        if (this.f5034n == 1) {
            this.f5035o = (!this.f5043x || TextUtils.isEmpty(this.w)) ? 0 : 2;
        }
        i(this.f5034n, this.f5035o, h(this.f5038r, ""));
    }

    public final void g(TextView textView, int i3) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f5029i;
        if (viewGroup2 != null) {
            boolean z5 = true;
            if (!(i3 == 0 || i3 == 1)) {
                z5 = false;
            }
            if (z5 && (viewGroup = this.f5031k) != null) {
                viewGroup2 = viewGroup;
            }
            viewGroup2.removeView(textView);
            int i6 = this.f5030j - 1;
            this.f5030j = i6;
            LinearLayout linearLayout = this.f5029i;
            if (i6 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = u0.f5622a;
        TextInputLayout textInputLayout = this.f5028h;
        return g0.c(textInputLayout) && textInputLayout.isEnabled() && (this.f5035o != this.f5034n || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i3, int i6, boolean z5) {
        TextView e6;
        TextView e7;
        int i7 = i3;
        int i8 = i6;
        boolean z6 = z5;
        if (i7 != i8) {
            if (z6) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f5032l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i9 = i3;
                int i10 = i6;
                d(arrayList2, this.f5043x, this.f5044y, 2, i9, i10);
                d(arrayList2, this.f5037q, this.f5038r, 1, i9, i10);
                o.M(animatorSet, arrayList);
                animatorSet.addListener(new p(this, i6, e(i3), i3, e(i8)));
                animatorSet.start();
            } else if (i7 != i8) {
                if (!(i8 == 0 || (e7 = e(i8)) == null)) {
                    e7.setVisibility(0);
                    e7.setAlpha(1.0f);
                }
                if (!(i7 == 0 || (e6 = e(i3)) == null)) {
                    e6.setVisibility(4);
                    if (i7 == 1) {
                        e6.setText((CharSequence) null);
                    }
                }
                this.f5034n = i8;
            }
            TextInputLayout textInputLayout = this.f5028h;
            textInputLayout.q();
            textInputLayout.t(z6, false);
            textInputLayout.w();
        }
    }
}
