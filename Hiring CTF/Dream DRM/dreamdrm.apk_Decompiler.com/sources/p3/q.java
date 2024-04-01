package p3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class q extends s {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f4832h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public float f4833b;

    /* renamed from: c  reason: collision with root package name */
    public float f4834c;

    /* renamed from: d  reason: collision with root package name */
    public float f4835d;

    /* renamed from: e  reason: collision with root package name */
    public float f4836e;

    /* renamed from: f  reason: collision with root package name */
    public float f4837f;

    /* renamed from: g  reason: collision with root package name */
    public float f4838g;

    public q(float f6, float f7, float f8, float f9) {
        this.f4833b = f6;
        this.f4834c = f7;
        this.f4835d = f8;
        this.f4836e = f9;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4841a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f4832h;
        rectF.set(this.f4833b, this.f4834c, this.f4835d, this.f4836e);
        path.arcTo(rectF, this.f4837f, this.f4838g, false);
        path.transform(matrix);
    }
}
