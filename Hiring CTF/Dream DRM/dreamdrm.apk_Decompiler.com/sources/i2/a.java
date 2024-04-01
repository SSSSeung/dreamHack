package i2;

import a2.c0;
import a2.f0;
import android.graphics.drawable.Drawable;
import b1.o;

public abstract class a implements f0, c0 {

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f3597d;

    public a(Drawable drawable) {
        o.i(drawable);
        this.f3597d = drawable;
    }

    public final Object get() {
        Drawable drawable = this.f3597d;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
