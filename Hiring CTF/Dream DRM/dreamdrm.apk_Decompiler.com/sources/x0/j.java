package x0;

import android.view.DisplayCutout;
import w0.b;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f5578a;

    public j(DisplayCutout displayCutout) {
        this.f5578a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return b.a(this.f5578a, ((j) obj).f5578a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f5578a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5578a + "}";
    }
}
