package u1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class c extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f5267a;

    public c(Drawable.ConstantState constantState) {
        this.f5267a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f5267a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f5267a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        d dVar = new d((Context) null);
        Drawable newDrawable = this.f5267a.newDrawable();
        dVar.f5273d = newDrawable;
        newDrawable.setCallback(dVar.f5272i);
        return dVar;
    }

    public final Drawable newDrawable(Resources resources) {
        d dVar = new d((Context) null);
        Drawable newDrawable = this.f5267a.newDrawable(resources);
        dVar.f5273d = newDrawable;
        newDrawable.setCallback(dVar.f5272i);
        return dVar;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d((Context) null);
        Drawable newDrawable = this.f5267a.newDrawable(resources, theme);
        dVar.f5273d = newDrawable;
        newDrawable.setCallback(dVar.f5272i);
        return dVar;
    }
}
