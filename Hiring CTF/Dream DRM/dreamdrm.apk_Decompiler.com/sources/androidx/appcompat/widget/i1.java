package androidx.appcompat.widget;

import a2.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b1.q;
import b1.r;
import b1.u;
import b1.v;
import com.bumptech.glide.d;
import e.n0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import q0.g;
import v0.e;
import v0.f;
import w4.p;

public class i1 extends TextView {

    /* renamed from: d  reason: collision with root package name */
    public final r f634d;

    /* renamed from: e  reason: collision with root package name */
    public final f1 f635e;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f636f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f637g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f638h;

    /* renamed from: i  reason: collision with root package name */
    public n0 f639i;

    /* renamed from: j  reason: collision with root package name */
    public Future f640j;

    public i1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f637g == null) {
            this.f637g = new b0(this);
        }
        return this.f637g;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f634d;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (j4.f648b) {
            return super.getAutoSizeMaxTextSize();
        }
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            return Math.round(f1Var.f589i.f734e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (j4.f648b) {
            return super.getAutoSizeMinTextSize();
        }
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            return Math.round(f1Var.f589i.f733d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (j4.f648b) {
            return super.getAutoSizeStepGranularity();
        }
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            return Math.round(f1Var.f589i.f732c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (j4.f648b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f1 f1Var = this.f635e;
        return f1Var != null ? f1Var.f589i.f735f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (j4.f648b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            return f1Var.f589i.f730a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof u ? ((u) customSelectionActionModeCallback).f1531a : customSelectionActionModeCallback;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public g1 getSuperCaller() {
        if (this.f639i == null) {
            this.f639i = Build.VERSION.SDK_INT >= 28 ? new h1(this) : new n0(6, (Object) this);
        }
        return this.f639i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f634d;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f634d;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f635e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f635e.e();
    }

    public CharSequence getText() {
        Future future = this.f640j;
        if (future != null) {
            try {
                this.f640j = null;
                m.o(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                v.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f636f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a0Var.f504f;
        return textClassifier == null ? x0.a((TextView) a0Var.f503e) : textClassifier;
    }

    public e getTextMetricsParamsCompat() {
        return v.x(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f635e.getClass();
        f1.h(this, onCreateInputConnection, editorInfo);
        d.r(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
        f1 f1Var = this.f635e;
        if (f1Var != null && !j4.f648b) {
            f1Var.f589i.a();
        }
    }

    public void onMeasure(int i3, int i6) {
        Future future = this.f640j;
        if (future != null) {
            try {
                this.f640j = null;
                m.o(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                v.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i3, i6);
    }

    public final void onTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
        super.onTextChanged(charSequence, i3, i6, i7);
        boolean z5 = false;
        f1 f1Var = this.f635e;
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
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.i(i3, i6, i7, i8);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (j4.f648b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.j(iArr, i3);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (j4.f648b) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.k(i3);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f634d;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f634d;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i6, int i7, int i8) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable n5 = i3 != 0 ? p.n(context, i3) : null;
        Drawable n6 = i6 != 0 ? p.n(context, i6) : null;
        Drawable n7 = i7 != 0 ? p.n(context, i7) : null;
        if (i8 != 0) {
            drawable = p.n(context, i8);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(n5, n6, n7, drawable);
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i6, int i7, int i8) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable n5 = i3 != 0 ? p.n(context, i3) : null;
        Drawable n6 = i6 != 0 ? p.n(context, i6) : null;
        Drawable n7 = i7 != 0 ? p.n(context, i7) : null;
        if (i8 != 0) {
            drawable = p.n(context, i8);
        }
        setCompoundDrawablesWithIntrinsicBounds(n5, n6, n7, drawable);
        f1 f1Var = this.f635e;
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

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().q(i3);
        } else {
            v.O(this, i3);
        }
    }

    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().p(i3);
        } else {
            v.P(this, i3);
        }
    }

    public void setLineHeight(int i3) {
        p.c(i3);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i3 != fontMetricsInt) {
            setLineSpacing((float) (i3 - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        v.x(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f634d;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f634d;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f635e;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f635e;
        f1Var.m(mode);
        f1Var.b();
    }

    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.g(context, i3);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f636f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f504f = textClassifier;
        }
    }

    public void setTextFuture(Future<f> future) {
        this.f640j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(e eVar) {
        int i3;
        TextDirectionHeuristic textDirectionHeuristic = eVar.f5369b;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i3 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i3 = 7;
            }
            q.h(this, i3);
            getPaint().set(eVar.f5368a);
            r.e(this, eVar.f5370c);
            r.h(this, eVar.f5371d);
        }
        i3 = 1;
        q.h(this, i3);
        getPaint().set(eVar.f5368a);
        r.e(this, eVar.f5370c);
        r.h(this, eVar.f5371d);
    }

    public final void setTextSize(int i3, float f6) {
        boolean z5 = j4.f648b;
        if (z5) {
            super.setTextSize(i3, f6);
            return;
        }
        f1 f1Var = this.f635e;
        if (f1Var != null && !z5) {
            q1 q1Var = f1Var.f589i;
            if (!(q1Var.i() && q1Var.f730a != 0)) {
                q1Var.f(i3, f6);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (!this.f638h) {
            if (typeface == null || i3 <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                n0 n0Var = g.f4876a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i3);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f638h = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i3);
            } finally {
                this.f638h = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        u3.a(context);
        this.f638h = false;
        this.f639i = null;
        t3.a(this, getContext());
        r rVar = new r(this);
        this.f634d = rVar;
        rVar.e(attributeSet, i3);
        f1 f1Var = new f1(this);
        this.f635e = f1Var;
        f1Var.f(attributeSet, i3);
        f1Var.b();
        this.f636f = new a0((TextView) this);
        getEmojiTextViewHelper().b(attributeSet, i3);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f635e;
        if (f1Var != null) {
            f1Var.b();
        }
    }
}
