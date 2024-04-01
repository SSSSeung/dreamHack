package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public final class r1 extends ToggleButton {

    /* renamed from: d  reason: collision with root package name */
    public final r f756d;

    /* renamed from: e  reason: collision with root package name */
    public final f1 f757e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f758f;

    public r1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        t3.a(this, getContext());
        r rVar = new r(this);
        this.f756d = rVar;
        rVar.e(attributeSet, 16842827);
        f1 f1Var = new f1(this);
        this.f757e = f1Var;
        f1Var.f(attributeSet, 16842827);
        getEmojiTextViewHelper().b(attributeSet, 16842827);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f758f == null) {
            this.f758f = new b0(this);
        }
        return this.f758f;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f756d;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f757e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f756d;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f756d;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f757e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f757e.e();
    }

    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().c(z5);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f756d;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f756d;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f757e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f757e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().d(z5);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f756d;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f756d;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f757e;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f757e;
        f1Var.m(mode);
        f1Var.b();
    }
}
