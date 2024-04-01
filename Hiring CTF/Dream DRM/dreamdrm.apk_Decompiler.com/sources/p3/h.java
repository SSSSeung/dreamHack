package p3;

import android.graphics.RectF;
import java.util.Arrays;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f4788a;

    public h(float f6) {
        this.f4788a = f6;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f4788a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f4788a == ((h) obj).f4788a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4788a)});
    }
}
