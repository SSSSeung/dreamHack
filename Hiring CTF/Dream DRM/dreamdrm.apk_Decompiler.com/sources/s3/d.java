package s3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.bumptech.glide.c;
import com.google.android.material.datepicker.m;
import com.theori.dreamdrm.R;
import z2.a;

public final class d extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f4960e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4961f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f4962g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f4963h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f4964i;

    /* renamed from: j  reason: collision with root package name */
    public final m f4965j = new m(1, this);

    /* renamed from: k  reason: collision with root package name */
    public final b f4966k = new b(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f4967l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f4968m;

    public d(n nVar) {
        super(nVar);
        this.f4960e = c.D(nVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f4961f = c.D(nVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f4962g = c.E(nVar.getContext(), R.attr.motionEasingLinearInterpolator, a.f5933a);
        this.f4963h = c.E(nVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f5936d);
    }

    public final void a() {
        if (this.f5012b.f5005s == null) {
            t(u());
        }
    }

    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.f4966k;
    }

    public final View.OnClickListener f() {
        return this.f4965j;
    }

    public final View.OnFocusChangeListener g() {
        return this.f4966k;
    }

    public final void m(EditText editText) {
        this.f4964i = editText;
        this.f5011a.setEndIconVisible(u());
    }

    public final void p(boolean z5) {
        if (this.f5012b.f5005s != null) {
            t(z5);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f4963h);
        ofFloat.setDuration((long) this.f4961f);
        ofFloat.addUpdateListener(new a(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f4962g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f4960e;
        ofFloat2.setDuration((long) i3);
        ofFloat2.addUpdateListener(new a(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4967l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f4967l.addListener(new c(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i3);
        ofFloat3.addUpdateListener(new a(this, 1));
        this.f4968m = ofFloat3;
        ofFloat3.addListener(new c(this, 1));
    }

    public final void s() {
        EditText editText = this.f4964i;
        if (editText != null) {
            editText.post(new androidx.activity.d(9, this));
        }
    }

    public final void t(boolean z5) {
        boolean z6 = this.f5012b.d() == z5;
        if (z5 && !this.f4967l.isRunning()) {
            this.f4968m.cancel();
            this.f4967l.start();
            if (z6) {
                this.f4967l.end();
            }
        } else if (!z5) {
            this.f4967l.cancel();
            this.f4968m.start();
            if (z6) {
                this.f4968m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f4964i;
        return editText != null && (editText.hasFocus() || this.f5014d.hasFocus()) && this.f4964i.getText().length() > 0;
    }
}
