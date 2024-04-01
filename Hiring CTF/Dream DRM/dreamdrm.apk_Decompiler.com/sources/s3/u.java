package s3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.m;
import com.theori.dreamdrm.R;

public final class u extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f5057e = R.drawable.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    public EditText f5058f;

    /* renamed from: g  reason: collision with root package name */
    public final m f5059g = new m(3, this);

    public u(n nVar, int i3) {
        super(nVar);
        if (i3 != 0) {
            this.f5057e = i3;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return R.string.password_toggle_content_description;
    }

    public final int d() {
        return this.f5057e;
    }

    public final View.OnClickListener f() {
        return this.f5059g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        EditText editText = this.f5058f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    public final void m(EditText editText) {
        this.f5058f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f5058f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f5058f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f5058f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
