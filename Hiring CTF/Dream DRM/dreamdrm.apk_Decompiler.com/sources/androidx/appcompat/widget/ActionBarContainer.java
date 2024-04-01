package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.theori.dreamdrm.R;
import d.a;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public boolean f382d;

    /* renamed from: e  reason: collision with root package name */
    public View f383e;

    /* renamed from: f  reason: collision with root package name */
    public View f384f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f385g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f386h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f387i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f388j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f389k;

    /* renamed from: l  reason: collision with root package name */
    public final int f390l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap weakHashMap = u0.f5622a;
        d0.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2113a);
        boolean z5 = false;
        this.f385g = obtainStyledAttributes.getDrawable(0);
        this.f386h = obtainStyledAttributes.getDrawable(2);
        this.f390l = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f388j = true;
            this.f387i = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f388j ? this.f385g == null && this.f386h == null : this.f387i == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f385g;
        if (drawable != null && drawable.isStateful()) {
            this.f385g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f386h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f386h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f387i;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f387i.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f385g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f386h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f387i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f383e = findViewById(R.id.action_bar);
        this.f384f = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f382d || super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        int i9;
        int i10;
        Drawable drawable;
        View view;
        int i11;
        super.onLayout(z5, i3, i6, i7, i8);
        boolean z6 = true;
        if (this.f388j) {
            Drawable drawable2 = this.f387i;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f385g != null) {
                if (this.f383e.getVisibility() == 0) {
                    drawable = this.f385g;
                    i10 = this.f383e.getLeft();
                    i9 = this.f383e.getTop();
                    i11 = this.f383e.getRight();
                    view = this.f383e;
                } else {
                    View view2 = this.f384f;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f385g.setBounds(0, 0, 0, 0);
                    } else {
                        drawable = this.f385g;
                        i10 = this.f384f.getLeft();
                        i9 = this.f384f.getTop();
                        i11 = this.f384f.getRight();
                        view = this.f384f;
                    }
                }
                drawable.setBounds(i10, i9, i11, view.getBottom());
            } else {
                z6 = false;
            }
            this.f389k = false;
        }
        if (z6) {
            invalidate();
        }
    }

    public final void onMeasure(int i3, int i6) {
        int i7;
        if (this.f383e == null && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE && (i7 = this.f390l) >= 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i7, View.MeasureSpec.getSize(i6)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i6);
        if (this.f383e != null) {
            View.MeasureSpec.getMode(i6);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f385g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f385g);
        }
        this.f385g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f383e;
            if (view != null) {
                this.f385g.setBounds(view.getLeft(), this.f383e.getTop(), this.f383e.getRight(), this.f383e.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f388j ? !(this.f385g == null && this.f386h == null) : this.f387i != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f387i;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f387i);
        }
        this.f387i = drawable;
        boolean z5 = this.f388j;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f387i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? this.f385g == null && this.f386h == null : this.f387i == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f386h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f386h);
        }
        this.f386h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f389k && this.f386h != null) {
                throw null;
            }
        }
        setWillNotDraw(!this.f388j ? this.f385g == null && this.f386h == null : this.f387i == null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(z2 z2Var) {
    }

    public void setTransitioning(boolean z5) {
        this.f382d = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z5 = i3 == 0;
        Drawable drawable = this.f385g;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f386h;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f387i;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f385g;
        boolean z5 = this.f388j;
        return (drawable == drawable2 && !z5) || (drawable == this.f386h && this.f389k) || ((drawable == this.f387i && z5) || super.verifyDrawable(drawable));
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }
}
