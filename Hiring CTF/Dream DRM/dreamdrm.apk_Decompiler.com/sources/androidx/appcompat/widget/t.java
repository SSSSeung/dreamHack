package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import b1.x;
import w4.p;

public class t extends CheckBox implements x {

    /* renamed from: d  reason: collision with root package name */
    public final v f784d;

    /* renamed from: e  reason: collision with root package name */
    public final r f785e;

    /* renamed from: f  reason: collision with root package name */
    public final f1 f786f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f787g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        u3.a(context);
        t3.a(this, getContext());
        v vVar = new v(this, 1);
        this.f784d = vVar;
        vVar.c(attributeSet, i3);
        r rVar = new r(this);
        this.f785e = rVar;
        rVar.e(attributeSet, i3);
        f1 f1Var = new f1(this);
        this.f786f = f1Var;
        f1Var.f(attributeSet, i3);
        getEmojiTextViewHelper().b(attributeSet, i3);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f787g == null) {
            this.f787g = new b0(this);
        }
        return this.f787g;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f785e;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f786f;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        v vVar = this.f784d;
        if (vVar != null) {
            vVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f785e;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f785e;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        v vVar = this.f784d;
        if (vVar != null) {
            return vVar.f806b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        v vVar = this.f784d;
        if (vVar != null) {
            return vVar.f807c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f786f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f786f.e();
    }

    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().c(z5);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f785e;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f785e;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public void setButtonDrawable(int i3) {
        setButtonDrawable(p.n(getContext(), i3));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f786f;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f786f;
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
        r rVar = this.f785e;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f785e;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        v vVar = this.f784d;
        if (vVar != null) {
            vVar.f806b = colorStateList;
            vVar.f808d = true;
            vVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        v vVar = this.f784d;
        if (vVar != null) {
            vVar.f807c = mode;
            vVar.f809e = true;
            vVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f786f;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f786f;
        f1Var.m(mode);
        f1Var.b();
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        v vVar = this.f784d;
        if (vVar == null) {
            return;
        }
        if (vVar.f810f) {
            vVar.f810f = false;
            return;
        }
        vVar.f810f = true;
        vVar.a();
    }
}
