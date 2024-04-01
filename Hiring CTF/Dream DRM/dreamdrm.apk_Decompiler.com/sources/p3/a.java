package p3;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f4741a;

    public a(float f6) {
        this.f4741a = f6;
    }

    public final float a(RectF rectF) {
        return this.f4741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f4741a == ((a) obj).f4741a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4741a)});
    }
}
