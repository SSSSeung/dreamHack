package r2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d extends FilterInputStream {

    /* renamed from: d  reason: collision with root package name */
    public final long f4921d;

    /* renamed from: e  reason: collision with root package name */
    public int f4922e;

    public d(InputStream inputStream, long j6) {
        super(inputStream);
        this.f4921d = j6;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f4921d - ((long) this.f4922e), (long) this.in.available());
    }

    public final void b(int i3) {
        int i6 = this.f4922e;
        if (i3 >= 0) {
            this.f4922e = i6 + i3;
            return;
        }
        long j6 = this.f4921d;
        if (j6 - ((long) i6) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + j6 + ", but read: " + this.f4922e);
        }
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        b(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i3, int i6) {
        int read;
        read = super.read(bArr, i3, i6);
        b(read);
        return read;
    }
}
