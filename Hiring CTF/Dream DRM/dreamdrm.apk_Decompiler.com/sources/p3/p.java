package p3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import o3.a;

public final class p extends t {

    /* renamed from: c  reason: collision with root package name */
    public final r f4829c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4830d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4831e;

    public p(r rVar, float f6, float f7) {
        this.f4829c = rVar;
        this.f4830d = f6;
        this.f4831e = f7;
    }

    public final void a(Matrix matrix, a aVar, int i3, Canvas canvas) {
        a aVar2 = aVar;
        int i6 = i3;
        Canvas canvas2 = canvas;
        r rVar = this.f4829c;
        float f6 = rVar.f4840c;
        float f7 = this.f4831e;
        float f8 = rVar.f4839b;
        float f9 = this.f4830d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f6 - f7), (double) (f8 - f9)), 0.0f);
        Matrix matrix2 = this.f4843a;
        matrix2.set(matrix);
        matrix2.preTranslate(f9, f7);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += (float) i6;
        rectF.offset(0.0f, (float) (-i6));
        int[] iArr = a.f4335i;
        iArr[0] = aVar2.f4344f;
        iArr[1] = aVar2.f4343e;
        iArr[2] = aVar2.f4342d;
        Paint paint = aVar2.f4341c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, a.f4336j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f4829c;
        return (float) Math.toDegrees(Math.atan((double) ((rVar.f4840c - this.f4831e) / (rVar.f4839b - this.f4830d))));
    }
}
