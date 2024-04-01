package p3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bumptech.glide.d;
import e2.f;
import java.util.ArrayList;
import java.util.BitSet;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final u[] f4814a = new u[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f4815b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f4816c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f4817d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f4818e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f4819f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final u f4820g = new u();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4821h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f4822i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f4823j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f4824k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4825l = true;

    public m() {
        for (int i3 = 0; i3 < 4; i3++) {
            this.f4814a[i3] = new u();
            this.f4815b[i3] = new Matrix();
            this.f4816c[i3] = new Matrix();
        }
    }

    public final void a(k kVar, float f6, RectF rectF, f fVar, Path path) {
        int i3;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        float f7;
        float f8;
        char c6;
        float f9;
        float f10;
        float f11;
        m mVar = this;
        k kVar2 = kVar;
        RectF rectF2 = rectF;
        f fVar2 = fVar;
        Path path2 = path;
        path.rewind();
        Path path3 = mVar.f4818e;
        path3.rewind();
        Path path4 = mVar.f4819f;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i6 = 0;
        while (true) {
            i3 = 4;
            matrixArr = mVar.f4816c;
            fArr = mVar.f4821h;
            matrixArr2 = mVar.f4815b;
            uVarArr = mVar.f4814a;
            if (i6 >= 4) {
                break;
            }
            c cVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar2.f4806f : kVar2.f4805e : kVar2.f4808h : kVar2.f4807g;
            d dVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar2.f4802b : kVar2.f4801a : kVar2.f4804d : kVar2.f4803c;
            u uVar = uVarArr[i6];
            dVar.getClass();
            dVar.h(f6, cVar.a(rectF2), uVar);
            int i7 = i6 + 1;
            float f12 = (float) ((i7 % 4) * 90);
            matrixArr2[i6].reset();
            PointF pointF = mVar.f4817d;
            int i8 = i7;
            if (i6 == 1) {
                f11 = rectF2.right;
            } else if (i6 != 2) {
                f9 = i6 != 3 ? rectF2.right : rectF2.left;
                f10 = rectF2.top;
                pointF.set(f9, f10);
                matrixArr2[i6].setTranslate(pointF.x, pointF.y);
                matrixArr2[i6].preRotate(f12);
                u uVar2 = uVarArr[i6];
                fArr[0] = uVar2.f4846c;
                fArr[1] = uVar2.f4847d;
                matrixArr2[i6].mapPoints(fArr);
                matrixArr[i6].reset();
                matrixArr[i6].setTranslate(fArr[0], fArr[1]);
                matrixArr[i6].preRotate(f12);
                rectF2 = rectF;
                i6 = i8;
            } else {
                f11 = rectF2.left;
            }
            f9 = f11;
            f10 = rectF2.bottom;
            pointF.set(f9, f10);
            matrixArr2[i6].setTranslate(pointF.x, pointF.y);
            matrixArr2[i6].preRotate(f12);
            u uVar22 = uVarArr[i6];
            fArr[0] = uVar22.f4846c;
            fArr[1] = uVar22.f4847d;
            matrixArr2[i6].mapPoints(fArr);
            matrixArr[i6].reset();
            matrixArr[i6].setTranslate(fArr[0], fArr[1]);
            matrixArr[i6].preRotate(f12);
            rectF2 = rectF;
            i6 = i8;
        }
        char c7 = 1;
        char c8 = 0;
        int i9 = 0;
        while (i9 < i3) {
            u uVar3 = uVarArr[i9];
            fArr[c8] = uVar3.f4844a;
            fArr[c7] = uVar3.f4845b;
            matrixArr2[i9].mapPoints(fArr);
            if (i9 == 0) {
                path2.moveTo(fArr[c8], fArr[c7]);
            } else {
                path2.lineTo(fArr[c8], fArr[c7]);
            }
            uVarArr[i9].b(matrixArr2[i9], path2);
            if (fVar2 != null) {
                u uVar4 = uVarArr[i9];
                Matrix matrix = matrixArr2[i9];
                g gVar = (g) fVar2.f2505e;
                BitSet bitSet = gVar.f4770g;
                uVar4.getClass();
                bitSet.set(i9, false);
                uVar4.a(uVar4.f4849f);
                gVar.f4768e[i9] = new n(new ArrayList(uVar4.f4851h), new Matrix(matrix));
            }
            int i10 = i9 + 1;
            int i11 = i10 % 4;
            u uVar5 = uVarArr[i9];
            fArr[0] = uVar5.f4846c;
            fArr[1] = uVar5.f4847d;
            matrixArr2[i9].mapPoints(fArr);
            u uVar6 = uVarArr[i11];
            float f13 = uVar6.f4844a;
            int i12 = i10;
            float[] fArr2 = mVar.f4822i;
            fArr2[0] = f13;
            fArr2[1] = uVar6.f4845b;
            matrixArr2[i11].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i9];
            fArr[0] = uVar7.f4846c;
            fArr[1] = uVar7.f4847d;
            matrixArr2[i9].mapPoints(fArr);
            if (i9 == 1 || i9 == 3) {
                f8 = rectF.centerX();
                f7 = fArr[0];
            } else {
                f8 = rectF.centerY();
                f7 = fArr[1];
            }
            Math.abs(f8 - f7);
            u uVar8 = mVar.f4820g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar2.f4810j : kVar2.f4809i : kVar2.f4812l : kVar2.f4811k).getClass();
            uVar8.c(max, 0.0f);
            Path path5 = mVar.f4823j;
            path5.reset();
            uVar8.b(matrixArr[i9], path5);
            if (!mVar.f4825l || (!mVar.b(path5, i9) && !mVar.b(path5, i11))) {
                path2 = path;
                uVar8.b(matrixArr[i9], path2);
                fVar2 = fVar;
            } else {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = uVar8.f4844a;
                fArr[1] = uVar8.f4845b;
                matrixArr[i9].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i9], path3);
                fVar2 = fVar;
                path2 = path;
            }
            if (fVar2 != null) {
                Matrix matrix2 = matrixArr[i9];
                g gVar2 = (g) fVar2.f2505e;
                c6 = 0;
                gVar2.f4770g.set(i9 + 4, false);
                uVar8.a(uVar8.f4849f);
                gVar2.f4769f[i9] = new n(new ArrayList(uVar8.f4851h), new Matrix(matrix2));
            } else {
                c6 = 0;
            }
            i9 = i12;
            c8 = c6;
            c7 = 1;
            i3 = 4;
            mVar = this;
        }
        path.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i3) {
        Path path2 = this.f4824k;
        path2.reset();
        this.f4814a[i3].b(this.f4815b[i3], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
