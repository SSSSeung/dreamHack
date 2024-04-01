package y1;

import h2.j;
import h2.k;
import java.io.InputStream;

public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f5809a;

    public /* synthetic */ e(InputStream inputStream) {
        this.f5809a = inputStream;
    }

    public final long a(long j6) {
        if (j6 < 0) {
            return 0;
        }
        long j7 = j6;
        while (j7 > 0) {
            InputStream inputStream = this.f5809a;
            long skip = inputStream.skip(j7);
            if (skip > 0) {
                j7 -= skip;
            } else if (inputStream.read() == -1) {
                break;
            } else {
                j7--;
            }
        }
        return j6 - j7;
    }

    public final int b(byte[] bArr, int i3) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3 && (i7 = this.f5809a.read(bArr, i6, i3 - i6)) != -1) {
            i6 += i7;
        }
        if (i6 != 0 || i7 != -1) {
            return i6;
        }
        throw new j();
    }

    public final int c() {
        return (e() << 8) | e();
    }

    public final short e() {
        int read = this.f5809a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new j();
    }
}
