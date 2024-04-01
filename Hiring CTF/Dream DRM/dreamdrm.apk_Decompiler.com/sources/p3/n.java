package p3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import o3.a;

public final class n extends t {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f4826c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f4827d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f4826c = arrayList;
        this.f4827d = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i3, Canvas canvas) {
        for (t a6 : this.f4826c) {
            a6.a(this.f4827d, aVar, i3, canvas);
        }
    }
}
