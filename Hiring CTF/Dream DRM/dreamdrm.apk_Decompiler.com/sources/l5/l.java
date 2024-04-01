package l5;

import b1.o;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class l implements v {

    /* renamed from: d  reason: collision with root package name */
    public byte f4134d;

    /* renamed from: e  reason: collision with root package name */
    public final q f4135e;

    /* renamed from: f  reason: collision with root package name */
    public final Inflater f4136f;

    /* renamed from: g  reason: collision with root package name */
    public final m f4137g;

    /* renamed from: h  reason: collision with root package name */
    public final CRC32 f4138h = new CRC32();

    public l(v vVar) {
        o.m(vVar, "source");
        q qVar = new q(vVar);
        this.f4135e = qVar;
        Inflater inflater = new Inflater(true);
        this.f4136f = inflater;
        this.f4137g = new m(qVar, inflater);
    }

    public static void b(int i3, int i6, String str) {
        if (i6 != i3) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
            o.l(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    public final x c() {
        return this.f4135e.c();
    }

    public final void close() {
        this.f4137g.close();
    }

    public final void e(g gVar, long j6, long j7) {
        r rVar = gVar.f4127d;
        while (true) {
            o.k(rVar);
            long j8 = (long) (rVar.f4154c - rVar.f4153b);
            if (j6 < j8) {
                break;
            }
            j6 -= j8;
            rVar = rVar.f4157f;
        }
        while (j7 > 0) {
            int i3 = (int) (((long) rVar.f4153b) + j6);
            int min = (int) Math.min((long) (rVar.f4154c - i3), j7);
            this.f4138h.update(rVar.f4152a, i3, min);
            j7 -= (long) min;
            rVar = rVar.f4157f;
            o.k(rVar);
            j6 = 0;
        }
    }

    public final long o(g gVar, long j6) {
        q qVar;
        g gVar2;
        long j7;
        g gVar3 = gVar;
        long j8 = j6;
        o.m(gVar3, "sink");
        int i3 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        } else if (i3 == 0) {
            return 0;
        } else {
            byte b6 = this.f4134d;
            CRC32 crc32 = this.f4138h;
            q qVar2 = this.f4135e;
            if (b6 == 0) {
                qVar2.s(10);
                g gVar4 = qVar2.f4149d;
                byte e6 = gVar4.e(3);
                boolean z5 = ((e6 >> 1) & 1) == 1;
                if (z5) {
                    gVar2 = gVar4;
                    e(qVar2.f4149d, 0, 10);
                } else {
                    gVar2 = gVar4;
                }
                b(8075, qVar2.readShort(), "ID1ID2");
                qVar2.a(8);
                if (((e6 >> 2) & 1) == 1) {
                    qVar2.s(2);
                    if (z5) {
                        e(qVar2.f4149d, 0, 2);
                    }
                    short readShort = gVar2.readShort() & 65535;
                    long j9 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    qVar2.s(j9);
                    if (z5) {
                        e(qVar2.f4149d, 0, j9);
                        j7 = j9;
                    } else {
                        j7 = j9;
                    }
                    qVar2.a(j7);
                }
                if (((e6 >> 3) & 1) == 1) {
                    q qVar3 = qVar2;
                    long b7 = qVar2.b((byte) 0, 0, Long.MAX_VALUE);
                    if (b7 != -1) {
                        if (z5) {
                            qVar = qVar3;
                            e(qVar3.f4149d, 0, b7 + 1);
                        } else {
                            qVar = qVar3;
                        }
                        qVar.a(b7 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    qVar = qVar2;
                }
                if (((e6 >> 4) & 1) == 1) {
                    long b8 = qVar.b((byte) 0, 0, Long.MAX_VALUE);
                    if (b8 != -1) {
                        if (z5) {
                            e(qVar.f4149d, 0, b8 + 1);
                        }
                        qVar.a(b8 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z5) {
                    qVar.s(2);
                    short readShort2 = gVar2.readShort() & 65535;
                    b((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) crc32.getValue()), "FHCRC");
                    crc32.reset();
                }
                this.f4134d = 1;
            } else {
                qVar = qVar2;
            }
            if (this.f4134d == 1) {
                long j10 = gVar3.f4128e;
                long o5 = this.f4137g.o(gVar3, j8);
                if (o5 != -1) {
                    e(gVar, j10, o5);
                    return o5;
                }
                this.f4134d = 2;
            }
            if (this.f4134d == 2) {
                b(qVar.e(), (int) crc32.getValue(), "CRC");
                b(qVar.e(), (int) this.f4136f.getBytesWritten(), "ISIZE");
                this.f4134d = 3;
                if (!qVar.x()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
