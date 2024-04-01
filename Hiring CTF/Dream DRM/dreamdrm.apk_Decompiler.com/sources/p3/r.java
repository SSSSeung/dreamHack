package p3;

import android.graphics.Matrix;
import android.graphics.Path;

public final class r extends s {

    /* renamed from: b  reason: collision with root package name */
    public float f4839b;

    /* renamed from: c  reason: collision with root package name */
    public float f4840c;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4841a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f4839b, this.f4840c);
        path.transform(matrix);
    }
}
