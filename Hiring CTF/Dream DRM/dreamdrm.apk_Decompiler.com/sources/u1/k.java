package u1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import k.b;
import p0.c;
import q0.f;

public final class k {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f5301p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f5302a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f5303b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f5304c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f5305d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f5306e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f5307f;

    /* renamed from: g  reason: collision with root package name */
    public final h f5308g;

    /* renamed from: h  reason: collision with root package name */
    public float f5309h;

    /* renamed from: i  reason: collision with root package name */
    public float f5310i;

    /* renamed from: j  reason: collision with root package name */
    public float f5311j;

    /* renamed from: k  reason: collision with root package name */
    public float f5312k;

    /* renamed from: l  reason: collision with root package name */
    public int f5313l;

    /* renamed from: m  reason: collision with root package name */
    public String f5314m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f5315n;

    /* renamed from: o  reason: collision with root package name */
    public final b f5316o;

    public k() {
        this.f5304c = new Matrix();
        this.f5309h = 0.0f;
        this.f5310i = 0.0f;
        this.f5311j = 0.0f;
        this.f5312k = 0.0f;
        this.f5313l = 255;
        this.f5314m = null;
        this.f5315n = null;
        this.f5316o = new b();
        this.f5308g = new h();
        this.f5302a = new Path();
        this.f5303b = new Path();
    }

    public final void a(h hVar, Matrix matrix, Canvas canvas, int i3, int i6) {
        int i7;
        boolean z5;
        float f6;
        h hVar2 = hVar;
        Canvas canvas2 = canvas;
        hVar2.f5285a.set(matrix);
        Matrix matrix2 = hVar2.f5285a;
        matrix2.preConcat(hVar2.f5294j);
        canvas.save();
        char c6 = 0;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = hVar2.f5286b;
            if (i8 < arrayList.size()) {
                i iVar = (i) arrayList.get(i8);
                if (iVar instanceof h) {
                    a((h) iVar, matrix2, canvas, i3, i6);
                } else if (iVar instanceof j) {
                    j jVar = (j) iVar;
                    float f7 = ((float) i3) / this.f5311j;
                    float f8 = ((float) i6) / this.f5312k;
                    float min = Math.min(f7, f8);
                    Matrix matrix3 = this.f5304c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f7, f8);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f9 = min;
                    i7 = i8;
                    float hypot = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
                    float f10 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[c6], (double) fArr[1]), hypot);
                    float abs = max > 0.0f ? Math.abs(f10) / max : 0.0f;
                    if (abs != 0.0f) {
                        jVar.getClass();
                        Path path = this.f5302a;
                        path.reset();
                        f[] fVarArr = jVar.f5297a;
                        if (fVarArr != null) {
                            f.b(fVarArr, path);
                        }
                        Path path2 = this.f5303b;
                        path2.reset();
                        if (jVar instanceof f) {
                            path2.setFillType(jVar.f5299c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas2.clipPath(path2);
                        } else {
                            g gVar = (g) jVar;
                            float f11 = gVar.f5279j;
                            if (!(f11 == 0.0f && gVar.f5280k == 1.0f)) {
                                float f12 = gVar.f5281l;
                                float f13 = (f11 + f12) % 1.0f;
                                float f14 = (gVar.f5280k + f12) % 1.0f;
                                if (this.f5307f == null) {
                                    this.f5307f = new PathMeasure();
                                }
                                this.f5307f.setPath(path, false);
                                float length = this.f5307f.getLength();
                                float f15 = f13 * length;
                                float f16 = f14 * length;
                                path.reset();
                                if (f15 > f16) {
                                    this.f5307f.getSegment(f15, length, path, true);
                                    f6 = 0.0f;
                                    this.f5307f.getSegment(0.0f, f16, path, true);
                                } else {
                                    f6 = 0.0f;
                                    this.f5307f.getSegment(f15, f16, path, true);
                                }
                                path.rLineTo(f6, f6);
                            }
                            path2.addPath(path, matrix3);
                            c cVar = gVar.f5276g;
                            if ((((Shader) cVar.f4387b) != null) || cVar.f4386a != 0) {
                                if (this.f5306e == null) {
                                    Paint paint = new Paint(1);
                                    this.f5306e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f5306e;
                                Object obj = cVar.f4387b;
                                if (((Shader) obj) != null) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(gVar.f5278i * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i9 = cVar.f4386a;
                                    float f17 = gVar.f5278i;
                                    PorterDuff.Mode mode = n.f5330m;
                                    paint2.setColor((i9 & 16777215) | (((int) (((float) Color.alpha(i9)) * f17)) << 24));
                                }
                                paint2.setColorFilter((ColorFilter) null);
                                path2.setFillType(gVar.f5299c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(path2, paint2);
                            }
                            c cVar2 = gVar.f5274e;
                            if ((((Shader) cVar2.f4387b) != null) || cVar2.f4386a != 0) {
                                if (this.f5305d == null) {
                                    z5 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f5305d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z5 = true;
                                }
                                Paint paint4 = this.f5305d;
                                Paint.Join join = gVar.f5283n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = gVar.f5282m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(gVar.f5284o);
                                Object obj2 = cVar2.f4387b;
                                if (((Shader) obj2) == null) {
                                    z5 = false;
                                }
                                if (z5) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(gVar.f5277h * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i10 = cVar2.f4386a;
                                    float f18 = gVar.f5277h;
                                    PorterDuff.Mode mode2 = n.f5330m;
                                    paint4.setColor((i10 & 16777215) | (((int) (((float) Color.alpha(i10)) * f18)) << 24));
                                }
                                paint4.setColorFilter((ColorFilter) null);
                                paint4.setStrokeWidth(gVar.f5275f * abs * f9);
                                canvas2.drawPath(path2, paint4);
                            }
                        }
                    }
                    i8 = i7 + 1;
                    c6 = 0;
                }
                int i11 = i3;
                int i12 = i6;
                i7 = i8;
                i8 = i7 + 1;
                c6 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.f5313l;
    }

    public void setAlpha(float f6) {
        setRootAlpha((int) (f6 * 255.0f));
    }

    public void setRootAlpha(int i3) {
        this.f5313l = i3;
    }

    public k(k kVar) {
        this.f5304c = new Matrix();
        this.f5309h = 0.0f;
        this.f5310i = 0.0f;
        this.f5311j = 0.0f;
        this.f5312k = 0.0f;
        this.f5313l = 255;
        this.f5314m = null;
        this.f5315n = null;
        b bVar = new b();
        this.f5316o = bVar;
        this.f5308g = new h(kVar.f5308g, bVar);
        this.f5302a = new Path(kVar.f5302a);
        this.f5303b = new Path(kVar.f5303b);
        this.f5309h = kVar.f5309h;
        this.f5310i = kVar.f5310i;
        this.f5311j = kVar.f5311j;
        this.f5312k = kVar.f5312k;
        this.f5313l = kVar.f5313l;
        this.f5314m = kVar.f5314m;
        String str = kVar.f5314m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f5315n = kVar.f5315n;
    }
}
