package p3;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f4742a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4743b;

    public b(float f6, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f4742a;
            f6 += ((b) cVar).f4743b;
        }
        this.f4742a = cVar;
        this.f4743b = f6;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f4742a.a(rectF) + this.f4743b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4742a.equals(bVar.f4742a) && this.f4743b == bVar.f4743b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4742a, Float.valueOf(this.f4743b)});
    }
}
