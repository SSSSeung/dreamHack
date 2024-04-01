package androidx.emoji2.text;

import android.util.SparseArray;
import g1.a;
import java.nio.ByteBuffer;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public int f1032a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final w f1033b;

    /* renamed from: c  reason: collision with root package name */
    public w f1034c;

    /* renamed from: d  reason: collision with root package name */
    public w f1035d;

    /* renamed from: e  reason: collision with root package name */
    public int f1036e;

    /* renamed from: f  reason: collision with root package name */
    public int f1037f;

    public r(w wVar) {
        this.f1033b = wVar;
        this.f1034c = wVar;
    }

    public final int a(int i3) {
        SparseArray sparseArray = this.f1034c.f1053a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(i3);
        int i6 = 1;
        if (this.f1032a != 2) {
            if (wVar != null) {
                this.f1032a = 2;
                this.f1034c = wVar;
                this.f1037f = 1;
            }
            b();
            this.f1036e = i3;
            return i6;
        } else if (wVar != null) {
            this.f1034c = wVar;
            this.f1037f++;
        } else {
            boolean z5 = false;
            if (!(i3 == 65038)) {
                if (i3 == 65039) {
                    z5 = true;
                }
                if (!z5) {
                    w wVar2 = this.f1034c;
                    if (wVar2.f1054b != null) {
                        if (this.f1037f == 1) {
                            if (c()) {
                                wVar2 = this.f1034c;
                            }
                        }
                        this.f1035d = wVar2;
                        b();
                        i6 = 3;
                        this.f1036e = i3;
                        return i6;
                    }
                }
            }
            b();
            this.f1036e = i3;
            return i6;
        }
        i6 = 2;
        this.f1036e = i3;
        return i6;
    }

    public final void b() {
        this.f1032a = 1;
        this.f1034c = this.f1033b;
        this.f1037f = 0;
    }

    public final boolean c() {
        a c6 = this.f1034c.f1054b.c();
        int a6 = c6.a(6);
        if ((a6 == 0 || ((ByteBuffer) c6.f2843d).get(a6 + c6.f2840a) == 0) ? false : true) {
            return true;
        }
        return this.f1036e == 65039;
    }
}
