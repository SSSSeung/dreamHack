package g0;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import w2.a;

public final class g implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2809a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2810b;

    public /* synthetic */ g(int i3, Object obj) {
        this.f2809a = i3;
        this.f2810b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f2809a) {
            case 0:
                return ((j) obj).f2818b - ((j) obj2).f2818b;
            case 1:
                int i3 = ((a) obj).f5471f;
                int i6 = ((a) obj2).f5471f;
                if (i3 == i6) {
                    return 0;
                }
                return i3 > i6 ? 1 : -1;
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f2810b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }
}
