package t1;

import android.graphics.Matrix;
import android.view.View;

public final class c0 extends b0 {
    public final void A(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public final void B(View view, int i3, int i6, int i7, int i8) {
        view.setLeftTopRightBottom(i3, i6, i7, i8);
    }

    public final void w(View view, int i3) {
        view.setTransitionVisibility(i3);
    }

    public final float x(View view) {
        return view.getTransitionAlpha();
    }

    public final void y(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    public final void z(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
