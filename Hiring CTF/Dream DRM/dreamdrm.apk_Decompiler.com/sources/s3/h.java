package s3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p3.f;
import p3.g;

public abstract class h extends g {
    public static final /* synthetic */ int B = 0;
    public f A;

    public h(f fVar) {
        super((f) fVar);
        this.A = fVar;
    }

    public final Drawable mutate() {
        this.A = new f(this.A);
        return this;
    }

    public final void n(float f6, float f7, float f8, float f9) {
        RectF rectF = this.A.f4970v;
        if (f6 != rectF.left || f7 != rectF.top || f8 != rectF.right || f9 != rectF.bottom) {
            rectF.set(f6, f7, f8, f9);
            invalidateSelf();
        }
    }
}
