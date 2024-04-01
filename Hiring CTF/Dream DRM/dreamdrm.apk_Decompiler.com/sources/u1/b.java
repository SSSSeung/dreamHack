package u1;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import f.a;
import java.util.ArrayList;

public final class b extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public n f5263a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f5264b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f5265c;

    /* renamed from: d  reason: collision with root package name */
    public k.b f5266d;

    public b(a aVar) {
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
