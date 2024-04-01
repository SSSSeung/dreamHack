package s3;

import android.graphics.Canvas;

public final class g extends h {
    public g(f fVar) {
        super(fVar);
    }

    public final void f(Canvas canvas) {
        if (this.A.f4970v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.A.f4970v);
        super.f(canvas);
        canvas.restore();
    }
}
