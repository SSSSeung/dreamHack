package n3;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4323a = {16842910, 16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final String f4324b = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f4323a, 0)) != 0) {
            Log.w(f4324b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z5 = false;
        boolean z6 = false;
        for (int i3 : iArr) {
            if (i3 == 16842910) {
                z5 = true;
            } else if (i3 == 16842908 || i3 == 16842919 || i3 == 16843623) {
                z6 = true;
            }
        }
        return z5 && z6;
    }
}
