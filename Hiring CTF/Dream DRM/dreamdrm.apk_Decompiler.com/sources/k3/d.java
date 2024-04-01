package k3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.g2;
import b1.v;
import y2.a;

public abstract class d extends g2 {

    /* renamed from: s  reason: collision with root package name */
    public Drawable f3943s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f3944t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final Rect f3945u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public int f3946v = 119;
    public final boolean w = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3947x = false;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray G = v.G(context, attributeSet, a.f5826g, 0, 0, new int[0]);
        this.f3946v = G.getInt(1, this.f3946v);
        Drawable drawable = G.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.w = G.getBoolean(2, true);
        G.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3943s;
        if (drawable != null) {
            if (this.f3947x) {
                this.f3947x = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z5 = this.w;
                Rect rect = this.f3944t;
                if (z5) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i3 = this.f3946v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f3945u;
                Gravity.apply(i3, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.f3943s;
        if (drawable != null) {
            drawable.setHotspot(f6, f7);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3943s;
        if (drawable != null && drawable.isStateful()) {
            this.f3943s.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f3943s;
    }

    public int getForegroundGravity() {
        return this.f3946v;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3943s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
        this.f3947x = z5 | this.f3947x;
    }

    public final void onSizeChanged(int i3, int i6, int i7, int i8) {
        super.onSizeChanged(i3, i6, i7, i8);
        this.f3947x = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3943s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f3943s);
            }
            this.f3943s = drawable;
            this.f3947x = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3946v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i3) {
        if (this.f3946v != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3946v = i3;
            if (i3 == 119 && this.f3943s != null) {
                this.f3943s.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3943s;
    }
}
