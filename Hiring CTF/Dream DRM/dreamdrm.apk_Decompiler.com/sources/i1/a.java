package i1;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource {

    /* renamed from: d  reason: collision with root package name */
    public long f3555d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f3556e;

    public a(b bVar) {
        this.f3556e = bVar;
    }

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j6, byte[] bArr, int i3, int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j7 = this.f3555d;
            int i7 = (j7 > j6 ? 1 : (j7 == j6 ? 0 : -1));
            b bVar = this.f3556e;
            if (i7 != 0) {
                if (j7 >= 0) {
                    if (j6 >= j7 + ((long) bVar.available())) {
                        return -1;
                    }
                }
                bVar.b(j6);
                this.f3555d = j6;
            }
            if (i6 > bVar.available()) {
                i6 = bVar.available();
            }
            int read = bVar.read(bArr, i3, i6);
            if (read >= 0) {
                this.f3555d += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f3555d = -1;
        return -1;
    }
}
