package u1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import f3.c;
import r0.b;

public final class a extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f3.a f5262a;

    public a(f3.a aVar) {
        this.f5262a = aVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f5262a.f2656b.f2668r;
        if (colorStateList != null) {
            b.h(drawable, colorStateList);
        }
    }

    public final void onAnimationStart(Drawable drawable) {
        c cVar = this.f5262a.f2656b;
        ColorStateList colorStateList = cVar.f2668r;
        if (colorStateList != null) {
            b.g(drawable, colorStateList.getColorForState(cVar.f2672v, colorStateList.getDefaultColor()));
        }
    }
}
