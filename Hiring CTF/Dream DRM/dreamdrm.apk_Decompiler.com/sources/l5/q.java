package l5;

import b1.o;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import m5.a;

public final class q implements i {

    /* renamed from: d  reason: collision with root package name */
    public final g f4149d = new g();

    /* renamed from: e  reason: collision with root package name */
    public boolean f4150e;

    /* renamed from: f  reason: collision with root package name */
    public final v f4151f;

    public q(v vVar) {
        o.m(vVar, "source");
        this.f4151f = vVar;
    }

    public final String A(Charset charset) {
        g gVar = this.f4149d;
        gVar.F(this.f4151f);
        return gVar.p(gVar.f4128e, charset);
    }

    public final f B() {
        return new f(this, 1);
    }

    public final void a(long j6) {
        if (!this.f4150e) {
            while (j6 > 0) {
                g gVar = this.f4149d;
                if (gVar.f4128e == 0) {
                    if (this.f4151f.o(gVar, (long) 8192) == -1) {
                        throw new EOFException();
                    }
                }
                long min = Math.min(j6, gVar.f4128e);
                gVar.a(min);
                j6 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long b(byte b6, long j6, long j7) {
        boolean z5 = true;
        if (!this.f4150e) {
            long j8 = 0;
            if (j7 < 0) {
                z5 = false;
            }
            if (z5) {
                while (j8 < j7) {
                    long i3 = this.f4149d.i(b6, j8, j7);
                    if (i3 != -1) {
                        return i3;
                    }
                    g gVar = this.f4149d;
                    long j9 = gVar.f4128e;
                    if (j9 >= j7) {
                        return -1;
                    }
                    if (this.f4151f.o(gVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j8 = Math.max(j8, j9);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j7).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final x c() {
        return this.f4151f.c();
    }

    public final void close() {
        if (!this.f4150e) {
            this.f4150e = true;
            this.f4151f.close();
            g gVar = this.f4149d;
            gVar.a(gVar.f4128e);
        }
    }

    public final int e() {
        s(4);
        int readInt = this.f4149d.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final j g(long j6) {
        s(j6);
        return this.f4149d.g(j6);
    }

    public final String h(long j6) {
        long j7 = j6;
        if (j7 >= 0) {
            long j8 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
            byte b6 = (byte) 10;
            long b7 = b(b6, 0, j8);
            int i3 = (b7 > -1 ? 1 : (b7 == -1 ? 0 : -1));
            g gVar = this.f4149d;
            if (i3 != 0) {
                return a.a(gVar, b7);
            }
            if (j8 < Long.MAX_VALUE && i(j8) && gVar.e(j8 - 1) == ((byte) 13) && i(1 + j8) && gVar.e(j8) == b6) {
                return a.a(gVar, j8);
            }
            g gVar2 = new g();
            gVar.b(gVar2, 0, Math.min((long) 32, gVar.f4128e));
            throw new EOFException("\\n not found: limit=" + Math.min(gVar.f4128e, j7) + " content=" + gVar2.g(gVar2.f4128e).c() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j7).toString());
    }

    public final boolean i(long j6) {
        g gVar;
        if (!(j6 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        } else if (!this.f4150e) {
            do {
                gVar = this.f4149d;
                if (gVar.f4128e >= j6) {
                    return true;
                }
            } while (this.f4151f.o(gVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final boolean isOpen() {
        return !this.f4150e;
    }

    public final long o(g gVar, long j6) {
        o.m(gVar, "sink");
        if (!(j6 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        } else if (!this.f4150e) {
            g gVar2 = this.f4149d;
            if (gVar2.f4128e == 0) {
                if (this.f4151f.o(gVar2, (long) 8192) == -1) {
                    return -1;
                }
            }
            return gVar2.o(gVar, Math.min(j6, gVar2.f4128e));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final String r() {
        return h(Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        o.m(byteBuffer, "sink");
        g gVar = this.f4149d;
        if (gVar.f4128e == 0) {
            if (this.f4151f.o(gVar, (long) 8192) == -1) {
                return -1;
            }
        }
        return gVar.read(byteBuffer);
    }

    public final byte readByte() {
        s(1);
        return this.f4149d.readByte();
    }

    public final int readInt() {
        s(4);
        return this.f4149d.readInt();
    }

    public final short readShort() {
        s(2);
        return this.f4149d.readShort();
    }

    public final void s(long j6) {
        if (!i(j6)) {
            throw new EOFException();
        }
    }

    public final String toString() {
        return "buffer(" + this.f4151f + ')';
    }

    public final int v(o oVar) {
        o.m(oVar, "options");
        if (!this.f4150e) {
            while (true) {
                g gVar = this.f4149d;
                int b6 = a.b(gVar, oVar, true);
                if (b6 == -2) {
                    if (this.f4151f.o(gVar, (long) 8192) == -1) {
                        break;
                    }
                } else if (b6 != -1) {
                    gVar.a((long) oVar.f4144d[b6].b());
                    return b6;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g w() {
        return this.f4149d;
    }

    public final boolean x() {
        if (!this.f4150e) {
            g gVar = this.f4149d;
            if (gVar.x()) {
                if (this.f4151f.o(gVar, (long) 8192) == -1) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long z() {
        /*
            r6 = this;
            r0 = 1
            r6.s(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.i(r2)
            l5.g r3 = r6.f4149d
            if (r2 == 0) goto L_0x0057
            long r4 = (long) r0
            byte r2 = r3.e(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0020
            r4 = 57
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x0020:
            r4 = 97
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x002a
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x002a:
            r4 = 65
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0037
            r4 = 70
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            b1.v.g(r1)
            b1.v.g(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            b1.o.l(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0057:
            long r0 = r3.z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.q.z():long");
    }
}
