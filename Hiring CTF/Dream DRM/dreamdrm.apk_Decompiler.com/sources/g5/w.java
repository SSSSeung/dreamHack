package g5;

import a5.c;
import b1.o;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import l5.g;
import l5.i;
import l5.j;
import l5.v;
import l5.x;

public final class w implements v {

    /* renamed from: d  reason: collision with root package name */
    public int f3048d;

    /* renamed from: e  reason: collision with root package name */
    public int f3049e;

    /* renamed from: f  reason: collision with root package name */
    public int f3050f;

    /* renamed from: g  reason: collision with root package name */
    public int f3051g;

    /* renamed from: h  reason: collision with root package name */
    public int f3052h;

    /* renamed from: i  reason: collision with root package name */
    public final i f3053i;

    public w(i iVar) {
        this.f3053i = iVar;
    }

    public final x c() {
        return this.f3053i.c();
    }

    public final void close() {
    }

    public final long o(g gVar, long j6) {
        int i3;
        int readInt;
        o.m(gVar, "sink");
        do {
            int i6 = this.f3051g;
            i iVar = this.f3053i;
            if (i6 == 0) {
                iVar.a((long) this.f3052h);
                this.f3052h = 0;
                if ((this.f3049e & 4) != 0) {
                    return -1;
                }
                i3 = this.f3050f;
                int q5 = c.q(iVar);
                this.f3051g = q5;
                this.f3048d = q5;
                byte readByte = iVar.readByte() & 255;
                this.f3049e = iVar.readByte() & 255;
                Logger logger = x.f3054h;
                if (logger.isLoggable(Level.FINE)) {
                    j jVar = g.f2975a;
                    logger.fine(g.a(this.f3050f, this.f3048d, readByte, this.f3049e, true));
                }
                readInt = iVar.readInt() & Integer.MAX_VALUE;
                this.f3050f = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long o5 = iVar.o(gVar, Math.min(j6, (long) i6));
                if (o5 == -1) {
                    return -1;
                }
                this.f3051g -= (int) o5;
                return o5;
            }
        } while (readInt == i3);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
