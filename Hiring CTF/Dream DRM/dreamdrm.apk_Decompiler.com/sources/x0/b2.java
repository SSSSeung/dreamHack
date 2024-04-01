package x0;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public class b2 extends a2 {
    public b2(h2 h2Var, WindowInsets windowInsets) {
        super(h2Var, windowInsets);
    }

    public h2 a() {
        return h2.h((View) null, this.f5658c.consumeDisplayCutout());
    }

    public j e() {
        DisplayCutout e6 = this.f5658c.getDisplayCutout();
        if (e6 == null) {
            return null;
        }
        return new j(e6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Objects.equals(this.f5658c, b2Var.f5658c) && Objects.equals(this.f5662g, b2Var.f5662g);
    }

    public int hashCode() {
        return this.f5658c.hashCode();
    }
}
