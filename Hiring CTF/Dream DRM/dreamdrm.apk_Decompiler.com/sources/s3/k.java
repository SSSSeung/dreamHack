package s3;

import a1.b;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.activity.d;
import com.bumptech.glide.c;
import com.google.android.material.datepicker.m;
import com.google.android.material.textfield.TextInputLayout;
import com.theori.dreamdrm.R;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;
import y0.o;
import z2.a;

public final class k extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f4973e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4974f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f4975g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f4976h;

    /* renamed from: i  reason: collision with root package name */
    public final m f4977i = new m(2, this);

    /* renamed from: j  reason: collision with root package name */
    public final b f4978j = new b(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final b f4979k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    public boolean f4980l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4981m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4982n;

    /* renamed from: o  reason: collision with root package name */
    public long f4983o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f4984p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f4985q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f4986r;

    public k(n nVar) {
        super(nVar);
        this.f4974f = c.D(nVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f4973e = c.D(nVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f4975g = c.E(nVar.getContext(), R.attr.motionEasingLinearInterpolator, a.f5933a);
    }

    public final void a() {
        if (this.f4984p.isTouchExplorationEnabled()) {
            if ((this.f4976h.getInputType() != 0) && !this.f5014d.hasFocus()) {
                this.f4976h.dismissDropDown();
            }
        }
        this.f4976h.post(new d(10, this));
    }

    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.f4978j;
    }

    public final View.OnClickListener f() {
        return this.f4977i;
    }

    public final y0.d h() {
        return this.f4979k;
    }

    public final boolean i(int i3) {
        return i3 != 0;
    }

    public final boolean j() {
        return this.f4980l;
    }

    public final boolean l() {
        return this.f4982n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f4976h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new i(this));
            this.f4976h.setOnDismissListener(new j(this));
            boolean z5 = false;
            this.f4976h.setThreshold(0);
            TextInputLayout textInputLayout = this.f5011a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z5 = true;
            }
            if (!z5 && this.f4984p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = u0.f5622a;
                d0.s(this.f5014d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(o oVar) {
        boolean z5 = this.f4976h.getInputType() != 0;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f5796a;
        if (!z5) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText((CharSequence) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        if (this.f4984p.isEnabled()) {
            boolean z5 = false;
            if (!(this.f4976h.getInputType() != 0)) {
                if (accessibilityEvent.getEventType() == 32768 && this.f4982n && !this.f4976h.isPopupShowing()) {
                    z5 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z5) {
                    u();
                    this.f4981m = true;
                    this.f4983o = System.currentTimeMillis();
                }
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f4975g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f4974f);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f4986r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.f4973e);
        ofFloat2.addUpdateListener(new a(this, 2));
        this.f4985q = ofFloat2;
        ofFloat2.addListener(new androidx.appcompat.widget.d(6, this));
        this.f4984p = (AccessibilityManager) this.f5013c.getSystemService("accessibility");
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f4976h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f4976h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z5) {
        if (this.f4982n != z5) {
            this.f4982n = z5;
            this.f4986r.cancel();
            this.f4985q.start();
        }
    }

    public final void u() {
        if (this.f4976h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f4983o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                this.f4981m = false;
            }
            if (!this.f4981m) {
                t(!this.f4982n);
                if (this.f4982n) {
                    this.f4976h.requestFocus();
                    this.f4976h.showDropDown();
                    return;
                }
                this.f4976h.dismissDropDown();
                return;
            }
            this.f4981m = false;
        }
    }
}
