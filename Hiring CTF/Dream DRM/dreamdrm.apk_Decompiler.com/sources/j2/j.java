package j2;

import a2.f0;
import android.util.Log;
import b1.o;
import b2.h;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import y1.i;
import y1.k;

public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final List f3836a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3837b;

    /* renamed from: c  reason: collision with root package name */
    public final h f3838c;

    public j(ArrayList arrayList, a aVar, h hVar) {
        this.f3836a = arrayList;
        this.f3837b = aVar;
        this.f3838c = hVar;
    }

    public final f0 a(Object obj, int i3, int i6, i iVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e6) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e6);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f3837b.a(ByteBuffer.wrap(bArr), i3, i6, iVar);
    }

    public final boolean b(Object obj, i iVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) iVar.c(i.f3835b)).booleanValue()) {
            if (o.C(this.f3838c, inputStream, this.f3836a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
