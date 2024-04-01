package x0;

import android.view.View;
import androidx.activity.d;
import androidx.compose.ui.platform.e;

public class w extends e {

    /* renamed from: o  reason: collision with root package name */
    public final View f5637o;

    public w(View view) {
        super(15);
        this.f5637o = view;
    }

    public void B() {
        View view;
        View view2 = this.f5637o;
        if (view2 != null) {
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new d(5, view));
            }
        }
    }
}
