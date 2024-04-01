package g5;

import a2.m;
import a5.c;
import b1.o;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.internal.r;
import l5.g;
import l5.h;

public final class b0 implements Closeable {

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f2931j = Logger.getLogger(g.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public final g f2932d;

    /* renamed from: e  reason: collision with root package name */
    public int f2933e = 16384;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2934f;

    /* renamed from: g  reason: collision with root package name */
    public final e f2935g;

    /* renamed from: h  reason: collision with root package name */
    public final h f2936h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2937i;

    public b0(h hVar, boolean z5) {
        this.f2936h = hVar;
        this.f2937i = z5;
        g gVar = new g();
        this.f2932d = gVar;
        this.f2935g = new e(gVar);
    }

    public final void C(long j6, int i3) {
        while (j6 > 0) {
            long min = Math.min((long) this.f2933e, j6);
            j6 -= min;
            i(i3, (int) min, 9, j6 == 0 ? 4 : 0);
            this.f2936h.t(this.f2932d, min);
        }
    }

    public final synchronized void b(f0 f0Var) {
        o.m(f0Var, "peerSettings");
        if (!this.f2934f) {
            int i3 = this.f2933e;
            int i6 = f0Var.f2973a;
            if ((i6 & 32) != 0) {
                i3 = f0Var.f2974b[5];
            }
            this.f2933e = i3;
            if (((i6 & 2) != 0 ? f0Var.f2974b[1] : -1) != -1) {
                e eVar = this.f2935g;
                int i7 = (i6 & 2) != 0 ? f0Var.f2974b[1] : -1;
                eVar.getClass();
                int min = Math.min(i7, 16384);
                int i8 = eVar.f2963c;
                if (i8 != min) {
                    if (min < i8) {
                        eVar.f2961a = Math.min(eVar.f2961a, min);
                    }
                    eVar.f2962b = true;
                    eVar.f2963c = min;
                    int i9 = eVar.f2967g;
                    if (min < i9) {
                        if (min == 0) {
                            g4.h.c0(eVar.f2964d, (r) null);
                            eVar.f2965e = eVar.f2964d.length - 1;
                            eVar.f2966f = 0;
                            eVar.f2967g = 0;
                        } else {
                            eVar.a(i9 - min);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f2936h.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() {
        this.f2934f = true;
        this.f2936h.close();
    }

    public final synchronized void e(boolean z5, int i3, g gVar, int i6) {
        if (!this.f2934f) {
            i(i3, i6, 0, z5 ? 1 : 0);
            if (i6 > 0) {
                o.k(gVar);
                this.f2936h.t(gVar, (long) i6);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void i(int i3, int i6, int i7, int i8) {
        Level level = Level.FINE;
        Logger logger = f2931j;
        boolean z5 = false;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(i3, i6, i7, i8, false));
        }
        if (i6 <= this.f2933e) {
            if ((((int) 2147483648L) & i3) == 0) {
                z5 = true;
            }
            if (z5) {
                byte[] bArr = c.f212a;
                h hVar = this.f2936h;
                o.m(hVar, "$this$writeMedium");
                hVar.y((i6 >>> 16) & 255);
                hVar.y((i6 >>> 8) & 255);
                hVar.y(i6 & 255);
                hVar.y(i7 & 255);
                hVar.y(i8 & 255);
                hVar.m(i3 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(m.g("reserved bit set: ", i3).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f2933e + ": " + i6).toString());
    }

    public final synchronized void l(int i3, b bVar, byte[] bArr) {
        o.m(bArr, "debugData");
        if (!this.f2934f) {
            boolean z5 = false;
            if (bVar.f2930d != -1) {
                i(0, bArr.length + 8, 7, 0);
                this.f2936h.m(i3);
                this.f2936h.m(bVar.f2930d);
                if (bArr.length == 0) {
                    z5 = true;
                }
                if (!z5) {
                    this.f2936h.d(bArr);
                }
                this.f2936h.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void n(int i3, int i6, boolean z5) {
        if (!this.f2934f) {
            i(0, 8, 6, z5 ? 1 : 0);
            this.f2936h.m(i3);
            this.f2936h.m(i6);
            this.f2936h.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void p(int i3, b bVar) {
        o.m(bVar, "errorCode");
        if (!this.f2934f) {
            if (bVar.f2930d != -1) {
                i(i3, 4, 3, 0);
                this.f2936h.m(bVar.f2930d);
                this.f2936h.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(long j6, int i3) {
        if (!this.f2934f) {
            if (j6 != 0 && j6 <= 2147483647L) {
                i(i3, 4, 8, 0);
                this.f2936h.m((int) j6);
                this.f2936h.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
