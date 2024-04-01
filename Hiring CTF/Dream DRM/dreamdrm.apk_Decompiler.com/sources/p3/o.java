package p3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import o3.a;

public final class o extends t {

    /* renamed from: c  reason: collision with root package name */
    public final q f4828c;

    public o(q qVar) {
        this.f4828c = qVar;
    }

    public final void a(Matrix matrix, a aVar, int i3, Canvas canvas) {
        a aVar2 = aVar;
        int i6 = i3;
        Canvas canvas2 = canvas;
        q qVar = this.f4828c;
        float f6 = qVar.f4837f;
        float f7 = qVar.f4838g;
        RectF rectF = new RectF(qVar.f4833b, qVar.f4834c, qVar.f4835d, qVar.f4836e);
        aVar.getClass();
        boolean z5 = f7 < 0.0f;
        Path path = aVar2.f4345g;
        int[] iArr = a.f4337k;
        if (z5) {
            iArr[0] = 0;
            iArr[1] = aVar2.f4344f;
            iArr[2] = aVar2.f4343e;
            iArr[3] = aVar2.f4342d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f7);
            path.close();
            float f8 = (float) (-i6);
            rectF.inset(f8, f8);
            iArr[0] = 0;
            iArr[1] = aVar2.f4342d;
            iArr[2] = aVar2.f4343e;
            iArr[3] = aVar2.f4344f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f9 = 1.0f - (((float) i6) / width);
            float[] fArr = a.f4338l;
            fArr[1] = f9;
            fArr[2] = ((1.0f - f9) / 2.0f) + f9;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar2.f4340b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z5) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, aVar2.f4346h);
            }
            canvas.drawArc(rectF, f6, f7, true, paint);
            canvas.restore();
        }
    }
}
