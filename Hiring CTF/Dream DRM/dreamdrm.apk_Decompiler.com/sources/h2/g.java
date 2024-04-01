package h2;

import a2.f0;
import android.graphics.ImageDecoder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import r2.b;
import y1.i;
import y1.k;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3403a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3404b;

    public g(int i3) {
        this.f3403a = i3;
        if (i3 != 1) {
            this.f3404b = new c();
        } else {
            this.f3404b = new c();
        }
    }

    public final f0 a(Object obj, int i3, int i6, i iVar) {
        int i7 = this.f3403a;
        c cVar = this.f3404b;
        switch (i7) {
            case 0:
                return cVar.c(ImageDecoder.createSource((ByteBuffer) obj), i3, i6, iVar);
            default:
                InputStream inputStream = (InputStream) obj;
                AtomicReference atomicReference = b.f4919a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
                AtomicReference atomicReference2 = b.f4919a;
                byte[] bArr = (byte[]) atomicReference2.getAndSet((Object) null);
                if (bArr == null) {
                    bArr = new byte[16384];
                }
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        atomicReference2.set(bArr);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        return cVar.c(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i3, i6, iVar);
                    }
                }
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f3403a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return true;
            default:
                InputStream inputStream = (InputStream) obj;
                return true;
        }
    }
}
