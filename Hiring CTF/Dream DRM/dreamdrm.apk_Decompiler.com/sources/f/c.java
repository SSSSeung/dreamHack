package f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import r0.a;
import r0.b;

public abstract class c extends Drawable implements Drawable.Callback {

    /* renamed from: d  reason: collision with root package name */
    public Drawable f2609d;

    public c(Drawable drawable) {
        Drawable drawable2 = this.f2609d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2609d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f2609d.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f2609d.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f2609d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2609d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2609d.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f2609d.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f2609d.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f2609d.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f2609d.getPadding(rect);
    }

    public final int[] getState() {
        return this.f2609d.getState();
    }

    public final Region getTransparentRegion() {
        return this.f2609d.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return a.d(this.f2609d);
    }

    public final boolean isStateful() {
        return this.f2609d.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f2609d.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f2609d.setBounds(rect);
    }

    public final boolean onLevelChange(int i3) {
        return this.f2609d.setLevel(i3);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        scheduleSelf(runnable, j6);
    }

    public final void setAlpha(int i3) {
        this.f2609d.setAlpha(i3);
    }

    public final void setAutoMirrored(boolean z5) {
        a.e(this.f2609d, z5);
    }

    public final void setChangingConfigurations(int i3) {
        this.f2609d.setChangingConfigurations(i3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2609d.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z5) {
        this.f2609d.setDither(z5);
    }

    public final void setFilterBitmap(boolean z5) {
        this.f2609d.setFilterBitmap(z5);
    }

    public void setHotspot(float f6, float f7) {
        b.e(this.f2609d, f6, f7);
    }

    public void setHotspotBounds(int i3, int i6, int i7, int i8) {
        b.f(this.f2609d, i3, i6, i7, i8);
    }

    public boolean setState(int[] iArr) {
        return this.f2609d.setState(iArr);
    }

    public final void setTint(int i3) {
        b.g(this.f2609d, i3);
    }

    public final void setTintList(ColorStateList colorStateList) {
        b.h(this.f2609d, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        b.i(this.f2609d, mode);
    }

    public boolean setVisible(boolean z5, boolean z6) {
        return super.setVisible(z5, z6) || this.f2609d.setVisible(z5, z6);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
