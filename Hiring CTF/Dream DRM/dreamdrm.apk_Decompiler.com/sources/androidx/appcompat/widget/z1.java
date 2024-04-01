package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import f.c;

public final class z1 extends c {

    /* renamed from: e  reason: collision with root package name */
    public boolean f874e = true;

    public z1(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas) {
        if (this.f874e) {
            super.draw(canvas);
        }
    }

    public final void setHotspot(float f6, float f7) {
        if (this.f874e) {
            super.setHotspot(f6, f7);
        }
    }

    public final void setHotspotBounds(int i3, int i6, int i7, int i8) {
        if (this.f874e) {
            super.setHotspotBounds(i3, i6, i7, i8);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.f874e) {
            return super.setState(iArr);
        }
        return false;
    }

    public final boolean setVisible(boolean z5, boolean z6) {
        if (this.f874e) {
            return super.setVisible(z5, z6);
        }
        return false;
    }
}
