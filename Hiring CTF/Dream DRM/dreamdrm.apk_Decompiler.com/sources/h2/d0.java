package h2;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class d0 extends MediaDataSource {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f3394d;

    public d0(ByteBuffer byteBuffer) {
        this.f3394d = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f3394d.limit();
    }

    public final int readAt(long j6, byte[] bArr, int i3, int i6) {
        ByteBuffer byteBuffer = this.f3394d;
        if (j6 >= ((long) byteBuffer.limit())) {
            return -1;
        }
        byteBuffer.position((int) j6);
        int min = Math.min(i6, byteBuffer.remaining());
        byteBuffer.get(bArr, i3, min);
        return min;
    }
}
