package t1;

import android.os.Build;
import android.view.View;

public class b0 extends a0 {

    /* renamed from: k  reason: collision with root package name */
    public static boolean f5092k = true;

    public void w(View view, int i3) {
        if (Build.VERSION.SDK_INT == 28) {
            super.w(view, i3);
        } else if (f5092k) {
            try {
                view.setTransitionVisibility(i3);
            } catch (NoSuchMethodError unused) {
                f5092k = false;
            }
        }
    }
}
