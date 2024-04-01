package u1;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import r0.b;

public abstract class e extends Drawable {

    /* renamed from: d  reason: collision with root package name */
    public Drawable f5273d;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            b.a(drawable, theme);
        }
    }

    public final void clearColorFilter() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public final Drawable getCurrent() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public final int getMinimumHeight() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public final int[] getState() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public final Region getTransparentRegion() {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public final void jumpToCurrentState() {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int i3) {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.setLevel(i3) : super.onLevelChange(i3);
    }

    public final void setChangingConfigurations(int i3) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setChangingConfigurations(i3);
        } else {
            super.setChangingConfigurations(i3);
        }
    }

    public final void setColorFilter(int i3, PorterDuff.Mode mode) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setColorFilter(i3, mode);
        } else {
            super.setColorFilter(i3, mode);
        }
    }

    public final void setFilterBitmap(boolean z5) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            drawable.setFilterBitmap(z5);
        }
    }

    public final void setHotspot(float f6, float f7) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            b.e(drawable, f6, f7);
        }
    }

    public final void setHotspotBounds(int i3, int i6, int i7, int i8) {
        Drawable drawable = this.f5273d;
        if (drawable != null) {
            b.f(drawable, i3, i6, i7, i8);
        }
    }

    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f5273d;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
