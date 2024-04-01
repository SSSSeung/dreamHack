package r2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class e extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public static final ArrayDeque f4923f = new ArrayDeque(0);

    /* renamed from: d  reason: collision with root package name */
    public InputStream f4924d;

    /* renamed from: e  reason: collision with root package name */
    public IOException f4925e;

    static {
        char[] cArr = l.f4938a;
    }

    public final int available() {
        return this.f4924d.available();
    }

    public final void close() {
        this.f4924d.close();
    }

    public final void mark(int i3) {
        this.f4924d.mark(i3);
    }

    public final boolean markSupported() {
        return this.f4924d.markSupported();
    }

    public final int read() {
        try {
            return this.f4924d.read();
        } catch (IOException e6) {
            this.f4925e = e6;
            throw e6;
        }
    }

    public final synchronized void reset() {
        this.f4924d.reset();
    }

    public final long skip(long j6) {
        try {
            return this.f4924d.skip(j6);
        } catch (IOException e6) {
            this.f4925e = e6;
            throw e6;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f4924d.read(bArr);
        } catch (IOException e6) {
            this.f4925e = e6;
            throw e6;
        }
    }

    public final int read(byte[] bArr, int i3, int i6) {
        try {
            return this.f4924d.read(bArr, i3, i6);
        } catch (IOException e6) {
            this.f4925e = e6;
            throw e6;
        }
    }
}
