package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import b1.u;
import b1.v;

public class s extends Button {

    /* renamed from: d  reason: collision with root package name */
    public final r f764d;

    /* renamed from: e  reason: collision with root package name */
    public final f1 f765e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f766f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        u3.a(context);
        t3.a(this, getContext());
        r rVar = new r(this);
        this.f764d = rVar;
        rVar.e(attributeSet, i3);
        f1 f1Var = new f1(this);
        this.f765e = f1Var;
        f1Var.f(attributeSet, i3);
        f1Var.b();
        getEmojiTextViewHelper().b(attributeSet, i3);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f766f == null) {
            this.f766f = new b0(this);
        }
        return this.f766f;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f764d;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (j4.f648b) {
            return super.getAutoSizeMaxTextSize();
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            return Math.round(f1Var.f589i.f734e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (j4.f648b) {
            return super.getAutoSizeMinTextSize();
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            return Math.round(f1Var.f589i.f733d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (j4.f648b) {
            return super.getAutoSizeStepGranularity();
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            return Math.round(f1Var.f589i.f732c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (j4.f648b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f1 f1Var = this.f765e;
        return f1Var != null ? f1Var.f589i.f735f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (j4.f648b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            return f1Var.f589i.f730a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof u ? ((u) customSelectionActionModeCallback).f1531a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f764d;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f764d;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f765e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f765e.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
        f1 f1Var = this.f765e;
        if (f1Var != null && !j4.f648b) {
            f1Var.f589i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
        super.onTextChanged(charSequence, i3, i6, i7);
        boolean z5 = false;
        f1 f1Var = this.f765e;
        if (f1Var != null && !j4.f648b) {
            q1 q1Var = f1Var.f589i;
            if (q1Var.i() && q1Var.f730a != 0) {
                z5 = true;
            }
        }
        if (z5) {
            f1Var.f589i.a();
        }
    }

    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().c(z5);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i6, int i7, int i8) {
        if (j4.f648b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i6, i7, i8);
            return;
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            f1Var.i(i3, i6, i7, i8);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (j4.f648b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            f1Var.j(iArr, i3);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (j4.f648b) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            f1Var.k(i3);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f764d;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f764d;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(v.U(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().d(z5);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z5) {
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            f1Var.f581a.setAllCaps(z5);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f764d;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f764d;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f765e;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f765e;
        f1Var.m(mode);
        f1Var.b();
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f1 f1Var = this.f765e;
        if (f1Var != null) {
            f1Var.g(context, i3);
        }
    }

    public final void setTextSize(int i3, float f6) {
        boolean z5 = j4.f648b;
        if (z5) {
            super.setTextSize(i3, f6);
            return;
        }
        f1 f1Var = this.f765e;
        if (f1Var != null && !z5) {
            q1 q1Var = f1Var.f589i;
            if (!(q1Var.i() && q1Var.f730a != 0)) {
                q1Var.f(i3, f6);
            }
        }
    }
}
