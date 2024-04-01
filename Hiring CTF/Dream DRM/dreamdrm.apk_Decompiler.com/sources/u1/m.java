package u1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class m extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f5329a;

    public m(Drawable.ConstantState constantState) {
        this.f5329a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f5329a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.f5329a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        n nVar = new n();
        nVar.f5273d = (VectorDrawable) this.f5329a.newDrawable();
        return nVar;
    }

    public final Drawable newDrawable(Resources resources) {
        n nVar = new n();
        nVar.f5273d = (VectorDrawable) this.f5329a.newDrawable(resources);
        return nVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        n nVar = new n();
        nVar.f5273d = (VectorDrawable) this.f5329a.newDrawable(resources, theme);
        return nVar;
    }
}
