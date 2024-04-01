package h2;

import b2.h;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import i1.c;
import i1.f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y1.d;

public final class s implements d {
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final int c(InputStream inputStream, h hVar) {
        f fVar = new f(inputStream);
        c e6 = fVar.e("Orientation");
        int i3 = 1;
        if (e6 != null) {
            try {
                i3 = e6.f(fVar.f3590f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }
}
