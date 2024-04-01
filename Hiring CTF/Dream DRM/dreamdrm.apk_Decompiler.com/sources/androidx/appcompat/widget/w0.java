package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import h.e;
import w4.p;

public final class w0 extends Spinner {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f825l = {16843505};

    /* renamed from: d  reason: collision with root package name */
    public final r f826d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f827e;

    /* renamed from: f  reason: collision with root package name */
    public final k f828f;

    /* renamed from: g  reason: collision with root package name */
    public SpinnerAdapter f829g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f830h;

    /* renamed from: i  reason: collision with root package name */
    public final v0 f831i;

    /* renamed from: j  reason: collision with root package name */
    public int f832j;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f833k = new Rect();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r6 != null) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w0(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130903965(0x7f03039d, float:1.7414763E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f833k = r1
            android.content.Context r1 = r11.getContext()
            androidx.appcompat.widget.t3.a(r11, r1)
            int[] r1 = d.a.f2134v
            r2 = 0
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r1, r0, r2)
            androidx.appcompat.widget.r r4 = new androidx.appcompat.widget.r
            r4.<init>(r11)
            r11.f826d = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r2)
            if (r4 == 0) goto L_0x0031
            g.f r5 = new g.f
            r5.<init>((android.content.Context) r12, (int) r4)
            r11.f827e = r5
            goto L_0x0033
        L_0x0031:
            r11.f827e = r12
        L_0x0033:
            r4 = -1
            r5 = 0
            int[] r6 = f825l     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r2)     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            boolean r7 = r6.hasValue(r2)     // Catch:{ Exception -> 0x004a }
            if (r7 == 0) goto L_0x005b
            int r4 = r6.getInt(r2, r2)     // Catch:{ Exception -> 0x004a }
            goto L_0x005b
        L_0x0046:
            r12 = move-exception
            r5 = r6
            goto L_0x00d0
        L_0x004a:
            r7 = move-exception
            goto L_0x0052
        L_0x004c:
            r12 = move-exception
            goto L_0x00d0
        L_0x004f:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L_0x0052:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x005e
        L_0x005b:
            r6.recycle()
        L_0x005e:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0098
            if (r4 == r7) goto L_0x0065
            goto L_0x00a5
        L_0x0065:
            androidx.appcompat.widget.t0 r4 = new androidx.appcompat.widget.t0
            android.content.Context r8 = r11.f827e
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f827e
            androidx.appcompat.widget.m3 r1 = androidx.appcompat.widget.m3.m(r8, r13, r1, r0)
            java.lang.Object r8 = r1.f686b
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f832j = r8
            android.graphics.drawable.Drawable r8 = r1.e(r7)
            r4.l(r8)
            java.lang.String r6 = r3.getString(r6)
            r4.F = r6
            r1.o()
            r11.f831i = r4
            androidx.appcompat.widget.k r1 = new androidx.appcompat.widget.k
            r1.<init>(r11, r11, r4, r7)
            r11.f828f = r1
            goto L_0x00a5
        L_0x0098:
            androidx.appcompat.widget.q0 r1 = new androidx.appcompat.widget.q0
            r1.<init>(r11)
            r11.f831i = r1
            java.lang.String r4 = r3.getString(r6)
            r1.f726f = r4
        L_0x00a5:
            java.lang.CharSequence[] r1 = r3.getTextArray(r2)
            if (r1 == 0) goto L_0x00bc
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r4, r1)
            r12 = 2131427447(0x7f0b0077, float:1.847651E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter((android.widget.SpinnerAdapter) r2)
        L_0x00bc:
            r3.recycle()
            r11.f830h = r7
            android.widget.SpinnerAdapter r12 = r11.f829g
            if (r12 == 0) goto L_0x00ca
            r11.setAdapter((android.widget.SpinnerAdapter) r12)
            r11.f829g = r5
        L_0x00ca:
            androidx.appcompat.widget.r r12 = r11.f826d
            r12.e(r13, r0)
            return
        L_0x00d0:
            if (r5 == 0) goto L_0x00d5
            r5.recycle()
        L_0x00d5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i6 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i6 = Math.max(i6, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i6;
        }
        Rect rect = this.f833k;
        drawable.getPadding(rect);
        return i6 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f826d;
        if (rVar != null) {
            rVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        v0 v0Var = this.f831i;
        return v0Var != null ? v0Var.c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        v0 v0Var = this.f831i;
        return v0Var != null ? v0Var.e() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f831i != null ? this.f832j : super.getDropDownWidth();
    }

    public final v0 getInternalPopup() {
        return this.f831i;
    }

    public Drawable getPopupBackground() {
        v0 v0Var = this.f831i;
        return v0Var != null ? v0Var.h() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f827e;
    }

    public CharSequence getPrompt() {
        v0 v0Var = this.f831i;
        return v0Var != null ? v0Var.i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f826d;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f826d;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v0 v0Var = this.f831i;
        if (v0Var != null && v0Var.a()) {
            v0Var.dismiss();
        }
    }

    public final void onMeasure(int i3, int i6) {
        super.onMeasure(i3, i6);
        if (this.f831i != null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        u0 u0Var = (u0) parcelable;
        super.onRestoreInstanceState(u0Var.getSuperState());
        if (u0Var.f803d && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new e(2, this));
        }
    }

    public final Parcelable onSaveInstanceState() {
        u0 u0Var = new u0(super.onSaveInstanceState());
        v0 v0Var = this.f831i;
        u0Var.f803d = v0Var != null && v0Var.a();
        return u0Var;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f828f;
        if (kVar == null || !kVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        v0 v0Var = this.f831i;
        if (v0Var == null) {
            return super.performClick();
        }
        if (v0Var.a()) {
            return true;
        }
        v0Var.d(o0.b(this), o0.a(this));
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f826d;
        if (rVar != null) {
            rVar.f();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        r rVar = this.f826d;
        if (rVar != null) {
            rVar.g(i3);
        }
    }

    public void setDropDownHorizontalOffset(int i3) {
        v0 v0Var = this.f831i;
        if (v0Var != null) {
            v0Var.p(i3);
            v0Var.b(i3);
            return;
        }
        super.setDropDownHorizontalOffset(i3);
    }

    public void setDropDownVerticalOffset(int i3) {
        v0 v0Var = this.f831i;
        if (v0Var != null) {
            v0Var.n(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    public void setDropDownWidth(int i3) {
        if (this.f831i != null) {
            this.f832j = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        v0 v0Var = this.f831i;
        if (v0Var != null) {
            v0Var.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(p.n(getPopupContext(), i3));
    }

    public void setPrompt(CharSequence charSequence) {
        v0 v0Var = this.f831i;
        if (v0Var != null) {
            v0Var.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f826d;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f826d;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f830h) {
            this.f829g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        v0 v0Var = this.f831i;
        if (v0Var != null) {
            Context context = this.f827e;
            if (context == null) {
                context = getContext();
            }
            v0Var.o(new r0(spinnerAdapter, context.getTheme()));
        }
    }
}
