package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f511a;

    public b(ActionBarContainer actionBarContainer) {
        this.f511a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f511a;
        if (actionBarContainer.f388j) {
            Drawable drawable = actionBarContainer.f387i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f385g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f386h;
        if (drawable3 != null && actionBarContainer.f389k) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f511a;
        if (!actionBarContainer.f388j) {
            drawable = actionBarContainer.f385g;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f387i != null) {
            drawable = actionBarContainer.f385g;
        } else {
            return;
        }
        drawable.getOutline(outline);
    }

    public final void setAlpha(int i3) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
