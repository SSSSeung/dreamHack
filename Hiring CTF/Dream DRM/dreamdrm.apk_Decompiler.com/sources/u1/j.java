package u1;

import com.bumptech.glide.e;
import q0.f;

public abstract class j extends i {

    /* renamed from: a  reason: collision with root package name */
    public f[] f5297a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f5298b;

    /* renamed from: c  reason: collision with root package name */
    public int f5299c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f5300d;

    public j() {
    }

    public f[] getPathData() {
        return this.f5297a;
    }

    public String getPathName() {
        return this.f5298b;
    }

    public void setPathData(f[] fVarArr) {
        if (!e.f(this.f5297a, fVarArr)) {
            this.f5297a = e.n(fVarArr);
            return;
        }
        f[] fVarArr2 = this.f5297a;
        for (int i3 = 0; i3 < fVarArr.length; i3++) {
            fVarArr2[i3].f4874a = fVarArr[i3].f4874a;
            int i6 = 0;
            while (true) {
                float[] fArr = fVarArr[i3].f4875b;
                if (i6 >= fArr.length) {
                    break;
                }
                fVarArr2[i3].f4875b[i6] = fArr[i6];
                i6++;
            }
        }
    }

    public j(j jVar) {
        this.f5298b = jVar.f5298b;
        this.f5300d = jVar.f5300d;
        this.f5297a = e.n(jVar.f5297a);
    }
}
