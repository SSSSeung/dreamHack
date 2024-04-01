package u1;

import android.graphics.Matrix;
import java.util.ArrayList;
import k.b;

public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f5285a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5286b;

    /* renamed from: c  reason: collision with root package name */
    public float f5287c;

    /* renamed from: d  reason: collision with root package name */
    public float f5288d;

    /* renamed from: e  reason: collision with root package name */
    public float f5289e;

    /* renamed from: f  reason: collision with root package name */
    public float f5290f;

    /* renamed from: g  reason: collision with root package name */
    public float f5291g;

    /* renamed from: h  reason: collision with root package name */
    public float f5292h;

    /* renamed from: i  reason: collision with root package name */
    public float f5293i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f5294j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5295k;

    /* renamed from: l  reason: collision with root package name */
    public String f5296l;

    public h() {
        this.f5285a = new Matrix();
        this.f5286b = new ArrayList();
        this.f5287c = 0.0f;
        this.f5288d = 0.0f;
        this.f5289e = 0.0f;
        this.f5290f = 1.0f;
        this.f5291g = 1.0f;
        this.f5292h = 0.0f;
        this.f5293i = 0.0f;
        this.f5294j = new Matrix();
        this.f5296l = null;
    }

    public final boolean a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f5286b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((i) arrayList.get(i3)).a()) {
                return true;
            }
            i3++;
        }
    }

    public final boolean b(int[] iArr) {
        int i3 = 0;
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f5286b;
            if (i3 >= arrayList.size()) {
                return z5;
            }
            z5 |= ((i) arrayList.get(i3)).b(iArr);
            i3++;
        }
    }

    public final void c() {
        Matrix matrix = this.f5294j;
        matrix.reset();
        matrix.postTranslate(-this.f5288d, -this.f5289e);
        matrix.postScale(this.f5290f, this.f5291g);
        matrix.postRotate(this.f5287c, 0.0f, 0.0f);
        matrix.postTranslate(this.f5292h + this.f5288d, this.f5293i + this.f5289e);
    }

    public String getGroupName() {
        return this.f5296l;
    }

    public Matrix getLocalMatrix() {
        return this.f5294j;
    }

    public float getPivotX() {
        return this.f5288d;
    }

    public float getPivotY() {
        return this.f5289e;
    }

    public float getRotation() {
        return this.f5287c;
    }

    public float getScaleX() {
        return this.f5290f;
    }

    public float getScaleY() {
        return this.f5291g;
    }

    public float getTranslateX() {
        return this.f5292h;
    }

    public float getTranslateY() {
        return this.f5293i;
    }

    public void setPivotX(float f6) {
        if (f6 != this.f5288d) {
            this.f5288d = f6;
            c();
        }
    }

    public void setPivotY(float f6) {
        if (f6 != this.f5289e) {
            this.f5289e = f6;
            c();
        }
    }

    public void setRotation(float f6) {
        if (f6 != this.f5287c) {
            this.f5287c = f6;
            c();
        }
    }

    public void setScaleX(float f6) {
        if (f6 != this.f5290f) {
            this.f5290f = f6;
            c();
        }
    }

    public void setScaleY(float f6) {
        if (f6 != this.f5291g) {
            this.f5291g = f6;
            c();
        }
    }

    public void setTranslateX(float f6) {
        if (f6 != this.f5292h) {
            this.f5292h = f6;
            c();
        }
    }

    public void setTranslateY(float f6) {
        if (f6 != this.f5293i) {
            this.f5293i = f6;
            c();
        }
    }

    public h(h hVar, b bVar) {
        j jVar;
        this.f5285a = new Matrix();
        this.f5286b = new ArrayList();
        this.f5287c = 0.0f;
        this.f5288d = 0.0f;
        this.f5289e = 0.0f;
        this.f5290f = 1.0f;
        this.f5291g = 1.0f;
        this.f5292h = 0.0f;
        this.f5293i = 0.0f;
        Matrix matrix = new Matrix();
        this.f5294j = matrix;
        this.f5296l = null;
        this.f5287c = hVar.f5287c;
        this.f5288d = hVar.f5288d;
        this.f5289e = hVar.f5289e;
        this.f5290f = hVar.f5290f;
        this.f5291g = hVar.f5291g;
        this.f5292h = hVar.f5292h;
        this.f5293i = hVar.f5293i;
        String str = hVar.f5296l;
        this.f5296l = str;
        this.f5295k = hVar.f5295k;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(hVar.f5294j);
        ArrayList arrayList = hVar.f5286b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof h) {
                this.f5286b.add(new h((h) obj, bVar));
            } else {
                if (obj instanceof g) {
                    jVar = new g((g) obj);
                } else if (obj instanceof f) {
                    jVar = new f((f) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f5286b.add(jVar);
                String str2 = jVar.f5298b;
                if (str2 != null) {
                    bVar.put(str2, jVar);
                }
            }
        }
    }
}
