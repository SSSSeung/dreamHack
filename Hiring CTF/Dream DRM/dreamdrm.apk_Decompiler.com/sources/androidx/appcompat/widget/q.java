package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.compose.ui.platform.e;
import b1.u;
import b1.v;
import com.bumptech.glide.d;
import com.theori.dreamdrm.R;
import h1.b;
import w4.p;

public class q extends AutoCompleteTextView {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f720g = {16843126};

    /* renamed from: d  reason: collision with root package name */
    public final r f721d;

    /* renamed from: e  reason: collision with root package name */
    public final f1 f722e;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f723f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        u3.a(context);
        t3.a(this, getContext());
        m3 m6 = m3.m(getContext(), attributeSet, f720g, R.attr.autoCompleteTextViewStyle);
        if (m6.l(0)) {
            setDropDownBackgroundDrawable(m6.e(0));
        }
        m6.o();
        r rVar = new r(this);
        this.f721d = rVar;
        rVar.e(attributeSet, R.attr.autoCompleteTextViewStyle);
        f1 f1Var = new f1(this);
        this.f722e = f1Var;
        f1Var.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        f1Var.b();
        a0 a0Var = new a0((EditText) this);
        this.f723f = a0Var;
        a0Var.t(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener p2 = a0Var.p(keyListener);
            if (p2 != keyListener) {
                super.setKeyListener(p2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f721d;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f722e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof u ? ((u) customSelectionActionModeCallback).f1531a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f721d;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f721d;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f722e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f722e.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        d.r(this, editorInfo, onCreateInputConnection);
        return this.f723f.w(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f721d;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f721d;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f722e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f722e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(v.U(callback, this));
    }

    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(p.n(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((e) ((b) this.f723f.f504f).f3358c).A(z5);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f723f.p(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f721d;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f721d;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f722e;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f722e;
        f1Var.m(mode);
        f1Var.b();
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f1 f1Var = this.f722e;
        if (f1Var != null) {
            f1Var.g(context, i3);
        }
    }
}
