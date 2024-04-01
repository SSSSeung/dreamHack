package s3;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public final class x implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5070d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f5071e;

    public /* synthetic */ x(TextInputLayout textInputLayout, int i3) {
        this.f5070d = i3;
        this.f5071e = textInputLayout;
    }

    public final void run() {
        int i3 = this.f5070d;
        TextInputLayout textInputLayout = this.f5071e;
        switch (i3) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.f2029f.f4996j;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                textInputLayout.f2030g.requestLayout();
                return;
        }
    }
}
