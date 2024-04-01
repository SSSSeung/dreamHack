package g3;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f2852a;

    public /* synthetic */ a(Chip chip) {
        this.f2852a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f2852a.f1896l;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z5);
        }
    }
}
