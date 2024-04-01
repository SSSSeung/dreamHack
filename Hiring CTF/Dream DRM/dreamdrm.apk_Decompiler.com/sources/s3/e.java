package s3;

import android.view.View;
import b1.o;
import com.google.android.material.internal.CheckableImageButton;

public final class e extends o {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4969e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i3) {
        super(nVar);
        this.f4969e = i3;
    }

    public final void r() {
        switch (this.f4969e) {
            case 0:
                n nVar = this.f5012b;
                nVar.f5004r = null;
                CheckableImageButton checkableImageButton = nVar.f4996j;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                o.W(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
