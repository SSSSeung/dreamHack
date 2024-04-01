package t1;

import android.view.View;
import androidx.fragment.app.n0;

public abstract class y extends n0 {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f5175g = true;

    public y() {
        super(10);
    }

    public float x(View view) {
        if (f5175g) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5175g = false;
            }
        }
        return view.getAlpha();
    }

    public void y(View view, float f6) {
        if (f5175g) {
            try {
                view.setTransitionAlpha(f6);
                return;
            } catch (NoSuchMethodError unused) {
                f5175g = false;
            }
        }
        view.setAlpha(f6);
    }
}
