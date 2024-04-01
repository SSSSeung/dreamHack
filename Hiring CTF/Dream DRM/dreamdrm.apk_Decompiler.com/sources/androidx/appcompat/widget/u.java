package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import b1.v;
import com.bumptech.glide.d;
import com.theori.dreamdrm.R;
import w4.p;

public final class u extends CheckedTextView {

    /* renamed from: d  reason: collision with root package name */
    public final v f799d;

    /* renamed from: e  reason: collision with root package name */
    public final r f800e;

    /* renamed from: f  reason: collision with root package name */
    public final f1 f801f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f802g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        u3.a(context);
        t3.a(this, getContext());
        f1 f1Var = new f1(this);
        this.f801f = f1Var;
        f1Var.f(attributeSet, R.attr.checkedTextViewStyle);
        f1Var.b();
        r rVar = new r(this);
        this.f800e = rVar;
        rVar.e(attributeSet, R.attr.checkedTextViewStyle);
        v vVar = new v(this, 0);
        this.f799d = vVar;
        vVar.c(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f802g == null) {
            this.f802g = new b0(this);
        }
        return this.f802g;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f1 f1Var = this.f801f;
        if (f1Var != null) {
            f1Var.b();
        }
        r rVar = this.f800e;
        if (rVar != null) {
            rVar.a();
        }
        v vVar = this.f799d;
        if (vVar != null) {
            vVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof b1.u ? ((b1.u) customSelectionActionModeCallback).f1531a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f800e;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f800e;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        v vVar = this.f799d;
        if (vVar != null) {
            return vVar.f806b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        v vVar = this.f799d;
        if (vVar != null) {
            return vVar.f807c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f801f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f801f.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        d.r(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().c(z5);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f800e;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f800e;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public void setCheckMarkDrawable(int i3) {
        setCheckMarkDrawable(p.n(getContext(), i3));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f801f;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f801f;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(v.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().d(z5);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f800e;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f800e;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        v vVar = this.f799d;
        if (vVar != null) {
            vVar.f806b = colorStateList;
            vVar.f808d = true;
            vVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        v vVar = this.f799d;
        if (vVar != null) {
            vVar.f807c = mode;
            vVar.f809e = true;
            vVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f801f;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f801f;
        f1Var.m(mode);
        f1Var.b();
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f1 f1Var = this.f801f;
        if (f1Var != null) {
            f1Var.g(context, i3);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        v vVar = this.f799d;
        if (vVar == null) {
            return;
        }
        if (vVar.f810f) {
            vVar.f810f = false;
            return;
        }
        vVar.f810f = true;
        vVar.b();
    }
}
