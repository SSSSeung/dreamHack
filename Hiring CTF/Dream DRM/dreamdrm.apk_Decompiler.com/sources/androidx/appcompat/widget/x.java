package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f842b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static x f843c;

    /* renamed from: a  reason: collision with root package name */
    public w2 f844a;

    public static synchronized x a() {
        x xVar;
        synchronized (x.class) {
            if (f843c == null) {
                d();
            }
            xVar = f843c;
        }
        return xVar;
    }

    public static synchronized PorterDuffColorFilter c(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter g6;
        synchronized (x.class) {
            g6 = w2.g(i3, mode);
        }
        return g6;
    }

    public static synchronized void d() {
        synchronized (x.class) {
            if (f843c == null) {
                x xVar = new x();
                f843c = xVar;
                xVar.f844a = w2.c();
                w2 w2Var = f843c.f844a;
                w wVar = new w();
                synchronized (w2Var) {
                    w2Var.f841e = wVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, v3 v3Var, int[] iArr) {
        PorterDuff.Mode mode = w2.f834f;
        int[] state = drawable.getState();
        int[] iArr2 = v1.f812a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = v3Var.f815b;
        if (z5 || v3Var.f814a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z5 ? (ColorStateList) v3Var.f816c : null;
            PorterDuff.Mode mode2 = v3Var.f814a ? (PorterDuff.Mode) v3Var.f817d : w2.f834f;
            if (!(colorStateList == null || mode2 == null)) {
                porterDuffColorFilter = w2.g(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        drawable.clearColorFilter();
    }

    public final synchronized Drawable b(Context context, int i3) {
        return this.f844a.e(context, i3);
    }
}
