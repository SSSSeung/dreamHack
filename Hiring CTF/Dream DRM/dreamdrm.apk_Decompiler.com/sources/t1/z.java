package t1;

import android.graphics.Matrix;
import android.view.View;

public abstract class z extends y {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f5176h = true;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f5177i = true;

    public void A(View view, Matrix matrix) {
        if (f5177i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5177i = false;
            }
        }
    }

    public void z(View view, Matrix matrix) {
        if (f5176h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5176h = false;
            }
        }
    }
}
