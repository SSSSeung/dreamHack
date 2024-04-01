package j2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class b extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final h f3797a;

    public b(h hVar) {
        this.f3797a = hVar;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new c(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new c(this);
    }
}
