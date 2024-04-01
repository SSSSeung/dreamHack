package s3;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import y0.d;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f5011a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5012b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5013c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f5014d;

    public o(n nVar) {
        this.f5011a = nVar.f4990d;
        this.f5012b = nVar;
        this.f5013c = nVar.getContext();
        this.f5014d = nVar.f4996j;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public d h() {
        return null;
    }

    public boolean i(int i3) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(y0.o oVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z5) {
    }

    public final void q() {
        this.f5012b.f(false);
    }

    public abstract void r();

    public void s() {
    }
}
