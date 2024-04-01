package h2;

import a2.f0;
import android.os.ParcelFileDescriptor;
import androidx.activity.result.c;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import r2.a;
import r2.b;
import y1.i;
import y1.k;

public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3395a;

    /* renamed from: b  reason: collision with root package name */
    public final p f3396b;

    public /* synthetic */ f(p pVar, int i3) {
        this.f3395a = i3;
        this.f3396b = pVar;
    }

    public final f0 a(Object obj, int i3, int i6, i iVar) {
        int i7 = this.f3395a;
        p pVar = this.f3396b;
        switch (i7) {
            case 0:
                AtomicReference atomicReference = b.f4919a;
                a aVar = new a((ByteBuffer) obj);
                return pVar.a(new c(pVar.f3425c, (InputStream) aVar, pVar.f3426d), i3, i6, iVar, p.f3421j);
            default:
                return pVar.a(new c((ParcelFileDescriptor) obj, pVar.f3426d, pVar.f3425c), i3, i6, iVar, p.f3421j);
        }
    }

    public final boolean b(Object obj, i iVar) {
        int i3 = this.f3395a;
        p pVar = this.f3396b;
        switch (i3) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                pVar.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                pVar.getClass();
                return true;
        }
    }
}
