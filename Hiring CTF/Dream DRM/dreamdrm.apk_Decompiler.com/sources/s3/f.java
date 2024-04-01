package s3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p3.k;

public final class f extends p3.f {

    /* renamed from: v  reason: collision with root package name */
    public final RectF f4970v;

    public f(k kVar, RectF rectF) {
        super(kVar);
        this.f4970v = rectF;
    }

    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super((p3.f) fVar);
        this.f4970v = fVar.f4970v;
    }
}
