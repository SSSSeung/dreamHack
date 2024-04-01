package g3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class c extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f2855a;

    public c(Chip chip) {
        this.f2855a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        f fVar = this.f2855a.f1892h;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
