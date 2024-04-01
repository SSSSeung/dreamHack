package t1;

import android.view.View;

public abstract class a0 extends z {

    /* renamed from: j  reason: collision with root package name */
    public static boolean f5090j = true;

    public void B(View view, int i3, int i6, int i7, int i8) {
        if (f5090j) {
            try {
                view.setLeftTopRightBottom(i3, i6, i7, i8);
            } catch (NoSuchMethodError unused) {
                f5090j = false;
            }
        }
    }
}
