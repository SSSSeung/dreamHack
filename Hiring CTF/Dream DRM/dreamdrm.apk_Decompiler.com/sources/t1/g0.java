package t1;

import android.view.View;
import android.view.WindowId;

public final class g0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f5119a;

    public g0(View view) {
        this.f5119a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && ((g0) obj).f5119a.equals(this.f5119a);
    }

    public final int hashCode() {
        return this.f5119a.hashCode();
    }
}
