package g0;

import w0.c;

public class f implements c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2806d;

    /* renamed from: e  reason: collision with root package name */
    public final Object[] f2807e;

    /* renamed from: f  reason: collision with root package name */
    public int f2808f;

    public f(int i3, int i6) {
        this.f2806d = i6;
        if (i6 != 1) {
            if (i3 > 0) {
                this.f2807e = new Object[i3];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i3 > 0) {
            this.f2807e = new Object[i3];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public boolean a(Object obj) {
        int i3;
        boolean z5;
        int i6 = this.f2806d;
        Object[] objArr = this.f2807e;
        switch (i6) {
            case 0:
                int i7 = this.f2808f;
                if (i7 >= objArr.length) {
                    return false;
                }
                objArr[i7] = obj;
                this.f2808f = i7 + 1;
                return true;
            default:
                int i8 = 0;
                while (true) {
                    i3 = this.f2808f;
                    if (i8 >= i3) {
                        z5 = false;
                    } else if (objArr[i8] == obj) {
                        z5 = true;
                    } else {
                        i8++;
                    }
                }
                if (z5) {
                    throw new IllegalStateException("Already in the pool!");
                } else if (i3 >= objArr.length) {
                    return false;
                } else {
                    objArr[i3] = obj;
                    this.f2808f = i3 + 1;
                    return true;
                }
        }
    }

    public Object b() {
        int i3 = this.f2806d;
        Object[] objArr = this.f2807e;
        switch (i3) {
            case 0:
                int i6 = this.f2808f;
                if (i6 <= 0) {
                    return null;
                }
                int i7 = i6 - 1;
                Object obj = objArr[i7];
                objArr[i7] = null;
                this.f2808f = i7;
                return obj;
            default:
                int i8 = this.f2808f;
                if (i8 <= 0) {
                    return null;
                }
                int i9 = i8 - 1;
                Object obj2 = objArr[i9];
                objArr[i9] = null;
                this.f2808f = i9;
                return obj2;
        }
    }
}
