package t1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f5173a = (Build.VERSION.SDK_INT >= 29 ? new c0() : new b0());

    /* renamed from: b  reason: collision with root package name */
    public static final c f5174b = new c(Float.class, "translationAlpha", 5);

    static {
        new c(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i3, int i6, int i7, int i8) {
        f5173a.B(view, i3, i6, i7, i8);
    }
}
