package r2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a extends InputStream {

    /* renamed from: d  reason: collision with root package name */
    public final ByteBuffer f4917d;

    /* renamed from: e  reason: collision with root package name */
    public int f4918e = -1;

    public a(ByteBuffer byteBuffer) {
        this.f4917d = byteBuffer;
    }

    public final int available() {
        return this.f4917d.remaining();
    }

    public final synchronized void mark(int i3) {
        this.f4918e = this.f4917d.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.f4917d;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & 255;
    }

    public final synchronized void reset() {
        int i3 = this.f4918e;
        if (i3 != -1) {
            this.f4917d.position(i3);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j6) {
        ByteBuffer byteBuffer = this.f4917d;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j6, (long) available());
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }

    public final int read(byte[] bArr, int i3, int i6) {
        ByteBuffer byteBuffer = this.f4917d;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i6, available());
        byteBuffer.get(bArr, i3, min);
        return min;
    }
}
