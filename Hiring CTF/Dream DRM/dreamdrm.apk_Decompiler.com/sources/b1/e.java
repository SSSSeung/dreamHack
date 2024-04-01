package b1;

import a2.m;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.d;

public abstract class e {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            m.m();
            return d.l(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f6, float f7) {
        try {
            return edgeEffect.onPullDistance(f6, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f7);
            return 0.0f;
        }
    }
}
