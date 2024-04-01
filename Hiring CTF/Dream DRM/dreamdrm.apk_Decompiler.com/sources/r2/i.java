package r2;

import java.io.FilterInputStream;

public final class i extends FilterInputStream {

    /* renamed from: d  reason: collision with root package name */
    public int f4933d = Integer.MIN_VALUE;

    public i(e eVar) {
        super(eVar);
    }

    public final int available() {
        int i3 = this.f4933d;
        return i3 == Integer.MIN_VALUE ? super.available() : Math.min(i3, super.available());
    }

    public final long b(long j6) {
        int i3 = this.f4933d;
        if (i3 == 0) {
            return -1;
        }
        return (i3 == Integer.MIN_VALUE || j6 <= ((long) i3)) ? j6 : (long) i3;
    }

    public final void e(long j6) {
        int i3 = this.f4933d;
        if (i3 != Integer.MIN_VALUE && j6 != -1) {
            this.f4933d = (int) (((long) i3) - j6);
        }
    }

    public final synchronized void mark(int i3) {
        super.mark(i3);
        this.f4933d = i3;
    }

    public final int read() {
        if (b(1) == -1) {
            return -1;
        }
        int read = super.read();
        e(1);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f4933d = Integer.MIN_VALUE;
    }

    public final long skip(long j6) {
        long b6 = b(j6);
        if (b6 == -1) {
            return 0;
        }
        long skip = super.skip(b6);
        e(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i3, int i6) {
        int b6 = (int) b((long) i6);
        if (b6 == -1) {
            return -1;
        }
        int read = super.read(bArr, i3, b6);
        e((long) read);
        return read;
    }
}
