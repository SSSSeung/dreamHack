package h2;

import a2.f0;
import android.graphics.Bitmap;
import b1.o;
import java.io.File;
import r2.l;

public final class z implements f0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3450d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3451e;

    public z(Bitmap bitmap) {
        this.f3451e = bitmap;
    }

    public final int b() {
        int i3 = this.f3450d;
        Object obj = this.f3451e;
        switch (i3) {
            case 0:
                return l.c((Bitmap) obj);
            case 1:
                return ((byte[]) obj).length;
            default:
                return 1;
        }
    }

    public final Class c() {
        switch (this.f3450d) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return this.f3451e.getClass();
        }
    }

    public final void d() {
    }

    public final Object get() {
        int i3 = this.f3450d;
        Object obj = this.f3451e;
        switch (i3) {
            case 0:
                return (Bitmap) obj;
            case 1:
                return (byte[]) obj;
            default:
                return obj;
        }
    }

    public z(File file) {
        o.i(file);
        this.f3451e = file;
    }

    public z(byte[] bArr) {
        o.i(bArr);
        this.f3451e = bArr;
    }
}
