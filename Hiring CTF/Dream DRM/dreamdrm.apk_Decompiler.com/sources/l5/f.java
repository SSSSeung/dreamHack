package l5;

import b1.o;
import com.bumptech.glide.e;
import java.io.IOException;
import java.io.InputStream;

public final class f extends InputStream {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4125d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f4126e;

    public /* synthetic */ f(i iVar, int i3) {
        this.f4125d = i3;
        this.f4126e = iVar;
    }

    public final int available() {
        long min;
        int i3 = this.f4125d;
        i iVar = this.f4126e;
        switch (i3) {
            case 0:
                min = Math.min(((g) iVar).f4128e, (long) Integer.MAX_VALUE);
                break;
            default:
                q qVar = (q) iVar;
                if (!qVar.f4150e) {
                    min = Math.min(qVar.f4149d.f4128e, (long) Integer.MAX_VALUE);
                    break;
                } else {
                    throw new IOException("closed");
                }
        }
        return (int) min;
    }

    public final void close() {
        switch (this.f4125d) {
            case 0:
                return;
            default:
                ((q) this.f4126e).close();
                return;
        }
    }

    public final int read() {
        int i3 = this.f4125d;
        i iVar = this.f4126e;
        switch (i3) {
            case 0:
                g gVar = (g) iVar;
                if (gVar.f4128e > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                q qVar = (q) iVar;
                if (!qVar.f4150e) {
                    g gVar2 = qVar.f4149d;
                    if (gVar2.f4128e == 0) {
                        if (qVar.f4151f.o(gVar2, (long) 8192) == -1) {
                            return -1;
                        }
                    }
                    return gVar2.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        int i3 = this.f4125d;
        i iVar = this.f4126e;
        switch (i3) {
            case 0:
                return ((g) iVar) + ".inputStream()";
            default:
                return ((q) iVar) + ".inputStream()";
        }
    }

    public final int read(byte[] bArr, int i3, int i6) {
        int i7 = this.f4125d;
        i iVar = this.f4126e;
        switch (i7) {
            case 0:
                o.m(bArr, "sink");
                return ((g) iVar).l(bArr, i3, i6);
            default:
                o.m(bArr, "data");
                q qVar = (q) iVar;
                if (!qVar.f4150e) {
                    e.g((long) bArr.length, (long) i3, (long) i6);
                    g gVar = qVar.f4149d;
                    if (gVar.f4128e == 0) {
                        if (qVar.f4151f.o(gVar, (long) 8192) == -1) {
                            return -1;
                        }
                    }
                    return gVar.l(bArr, i3, i6);
                }
                throw new IOException("closed");
        }
    }
}
