package g5;

import a2.m;
import a5.c;
import androidx.fragment.app.n0;
import b1.o;
import b1.v;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import l5.g;
import l5.i;
import l5.j;
import s4.a;

public final class x implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f3054h;

    /* renamed from: d  reason: collision with root package name */
    public final w f3055d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3056e;

    /* renamed from: f  reason: collision with root package name */
    public final i f3057f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3058g;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        o.l(logger, "Logger.getLogger(Http2::class.java.name)");
        f3054h = logger;
    }

    public x(i iVar, boolean z5) {
        this.f3057f = iVar;
        this.f3058g = z5;
        w wVar = new w(iVar);
        this.f3055d = wVar;
        this.f3056e = new d(wVar);
    }

    public final boolean b(boolean z5, p pVar) {
        byte b6;
        boolean z6;
        boolean z7;
        long j6;
        b bVar;
        int readInt;
        p pVar2 = pVar;
        o.m(pVar2, "handler");
        byte b7 = 0;
        try {
            this.f3057f.s(9);
            int q5 = c.q(this.f3057f);
            if (q5 <= 16384) {
                byte readByte = this.f3057f.readByte() & 255;
                byte readByte2 = this.f3057f.readByte() & 255;
                int readInt2 = this.f3057f.readInt() & Integer.MAX_VALUE;
                Logger logger = f3054h;
                boolean z8 = true;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g.a(readInt2, q5, readByte, readByte2, true));
                }
                if (!z5 || readByte == 4) {
                    switch (readByte) {
                        case 0:
                            if (readInt2 != 0) {
                                boolean z9 = (readByte2 & 1) != 0;
                                if (!((readByte2 & 32) != 0)) {
                                    byte readByte3 = (readByte2 & 8) != 0 ? this.f3057f.readByte() & 255 : 0;
                                    int s5 = n0.s(q5, readByte2, readByte3);
                                    i iVar = this.f3057f;
                                    o.m(iVar, "source");
                                    pVar2.f3003e.getClass();
                                    if (readInt2 == 0 || (readInt2 & 1) != 0) {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        u uVar = pVar2.f3003e;
                                        uVar.getClass();
                                        g gVar = new g();
                                        long j7 = (long) s5;
                                        iVar.s(j7);
                                        iVar.o(gVar, j7);
                                        b6 = readByte3;
                                        uVar.f3027m.c(new q(uVar.f3021g + '[' + readInt2 + "] onData", uVar, readInt2, gVar, s5, z9), 0);
                                    } else {
                                        b6 = readByte3;
                                        a0 i3 = pVar2.f3003e.i(readInt2);
                                        if (i3 == null) {
                                            pVar2.f3003e.C(readInt2, b.f2924f);
                                            long j8 = (long) s5;
                                            pVar2.f3003e.p(j8);
                                            iVar.a(j8);
                                        } else {
                                            z zVar = i3.f2915g;
                                            long j9 = (long) s5;
                                            zVar.getClass();
                                            while (true) {
                                                if (j9 > 0) {
                                                    synchronized (zVar.f3068i) {
                                                        z6 = zVar.f3067h;
                                                        z7 = zVar.f3064e.f4128e + j9 > zVar.f3066g;
                                                    }
                                                    if (z7) {
                                                        iVar.a(j9);
                                                        zVar.f3068i.e(b.f2926h);
                                                    } else if (z6) {
                                                        iVar.a(j9);
                                                    } else {
                                                        long o5 = iVar.o(zVar.f3063d, j9);
                                                        if (o5 != -1) {
                                                            j9 -= o5;
                                                            synchronized (zVar.f3068i) {
                                                                if (zVar.f3065f) {
                                                                    g gVar2 = zVar.f3063d;
                                                                    j6 = gVar2.f4128e;
                                                                    gVar2.a(j6);
                                                                } else {
                                                                    g gVar3 = zVar.f3064e;
                                                                    boolean z10 = gVar3.f4128e == 0;
                                                                    gVar3.F(zVar.f3063d);
                                                                    if (z10) {
                                                                        a0 a0Var = zVar.f3068i;
                                                                        if (a0Var != null) {
                                                                            a0Var.notifyAll();
                                                                        } else {
                                                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                                                        }
                                                                    }
                                                                    j6 = 0;
                                                                }
                                                            }
                                                            if (j6 > 0) {
                                                                zVar.b(j6);
                                                            }
                                                        } else {
                                                            throw new EOFException();
                                                        }
                                                    }
                                                }
                                            }
                                            if (z9) {
                                                i3.i(c.f213b, true);
                                            }
                                        }
                                    }
                                    this.f3057f.a((long) b6);
                                    break;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                                }
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                            }
                        case 1:
                            if (readInt2 != 0) {
                                boolean z11 = (readByte2 & 1) != 0;
                                byte readByte4 = (readByte2 & 8) != 0 ? this.f3057f.readByte() & 255 : 0;
                                if ((readByte2 & 32) != 0) {
                                    i iVar2 = this.f3057f;
                                    iVar2.readInt();
                                    iVar2.readByte();
                                    q5 -= 5;
                                }
                                List l6 = l(n0.s(q5, readByte2, readByte4), readByte4, readByte2, readInt2);
                                pVar2.f3003e.getClass();
                                if (readInt2 != 0 && (readInt2 & 1) == 0) {
                                    b7 = 1;
                                }
                                if (b7 == 0) {
                                    synchronized (pVar2.f3003e) {
                                        a0 i6 = pVar2.f3003e.i(readInt2);
                                        if (i6 != null) {
                                            i6.i(c.s(l6), z11);
                                            break;
                                        } else {
                                            u uVar2 = pVar2.f3003e;
                                            if (!uVar2.f3024j) {
                                                if (readInt2 > uVar2.f3022h) {
                                                    if (readInt2 % 2 != uVar2.f3023i % 2) {
                                                        a0 a0Var2 = new a0(readInt2, pVar2.f3003e, false, z11, c.s(l6));
                                                        u uVar3 = pVar2.f3003e;
                                                        uVar3.f3022h = readInt2;
                                                        uVar3.f3020f.put(Integer.valueOf(readInt2), a0Var2);
                                                        pVar2.f3003e.f3025k.f().c(new m(pVar2.f3003e.f3021g + '[' + readInt2 + "] onStream", a0Var2, pVar2), 0);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    u uVar4 = pVar2.f3003e;
                                    uVar4.getClass();
                                    uVar4.f3027m.c(new r(uVar4.f3021g + '[' + readInt2 + "] onHeaders", uVar4, readInt2, l6, z11), 0);
                                    break;
                                }
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                            }
                        case 2:
                            if (q5 != 5) {
                                throw new IOException("TYPE_PRIORITY length: " + q5 + " != 5");
                            } else if (readInt2 != 0) {
                                i iVar3 = this.f3057f;
                                iVar3.readInt();
                                iVar3.readByte();
                                return true;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (q5 != 4) {
                                throw new IOException("TYPE_RST_STREAM length: " + q5 + " != 4");
                            } else if (readInt2 != 0) {
                                int readInt3 = this.f3057f.readInt();
                                b[] values = b.values();
                                int length = values.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < length) {
                                        b bVar2 = values[i7];
                                        if (bVar2.f2930d == readInt3) {
                                            bVar = bVar2;
                                        } else {
                                            i7++;
                                        }
                                    } else {
                                        bVar = null;
                                    }
                                }
                                if (bVar != null) {
                                    u uVar5 = pVar2.f3003e;
                                    uVar5.getClass();
                                    if (readInt2 != 0 && (readInt2 & 1) == 0) {
                                        b7 = 1;
                                    }
                                    if (b7 != 0) {
                                        uVar5.f3027m.c(new s(uVar5.f3021g + '[' + readInt2 + "] onReset", uVar5, readInt2, bVar, 0), 0);
                                        return true;
                                    }
                                    a0 l7 = uVar5.l(readInt2);
                                    if (l7 == null) {
                                        return true;
                                    }
                                    synchronized (l7) {
                                        if (l7.f2919k == null) {
                                            l7.f2919k = bVar;
                                            l7.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                                throw new IOException(m.g("TYPE_RST_STREAM unexpected error code: ", readInt3));
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        case 4:
                            if (readInt2 != 0) {
                                throw new IOException("TYPE_SETTINGS streamId != 0");
                            } else if ((readByte2 & 1) != 0) {
                                if (q5 == 0) {
                                    return true;
                                }
                                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                            } else if (q5 % 6 == 0) {
                                f0 f0Var = new f0();
                                a R = v.R(v.T(0, q5), 6);
                                int i8 = R.f5073d;
                                int i9 = R.f5074e;
                                int i10 = R.f5075f;
                                if (i10 < 0 ? i8 >= i9 : i8 <= i9) {
                                    while (true) {
                                        i iVar4 = this.f3057f;
                                        short readShort = iVar4.readShort();
                                        byte[] bArr = c.f212a;
                                        short s6 = readShort & 65535;
                                        readInt = iVar4.readInt();
                                        if (s6 != 2) {
                                            if (s6 == 3) {
                                                s6 = 4;
                                            } else if (s6 != 4) {
                                                if (s6 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                                }
                                            } else if (readInt >= 0) {
                                                s6 = 7;
                                            } else {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (!(readInt == 0 || readInt == 1)) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        f0Var.b(s6, readInt);
                                        if (i8 != i9) {
                                            i8 += i10;
                                        }
                                    }
                                    throw new IOException(m.g("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                                }
                                u uVar6 = pVar2.f3003e;
                                uVar6.f3026l.c(new o(m.j(new StringBuilder(), uVar6.f3021g, " applyAndAckSettings"), pVar2, f0Var), 0);
                                return true;
                            } else {
                                throw new IOException(m.g("TYPE_SETTINGS length % 6 != 0: ", q5));
                            }
                        case 5:
                            if (readInt2 != 0) {
                                if ((readByte2 & 8) != 0) {
                                    b7 = this.f3057f.readByte() & 255;
                                }
                                int readInt4 = this.f3057f.readInt() & Integer.MAX_VALUE;
                                List l8 = l(n0.s(q5 - 4, readByte2, b7), b7, readByte2, readInt2);
                                u uVar7 = pVar2.f3003e;
                                uVar7.getClass();
                                synchronized (uVar7) {
                                    if (uVar7.D.contains(Integer.valueOf(readInt4))) {
                                        uVar7.C(readInt4, b.f2924f);
                                        return true;
                                    }
                                    uVar7.D.add(Integer.valueOf(readInt4));
                                    uVar7.f3027m.c(new s(uVar7.f3021g + '[' + readInt4 + "] onRequest", uVar7, readInt4, l8, 2), 0);
                                    return true;
                                }
                            }
                            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        case 6:
                            n(pVar2, q5, readByte2, readInt2);
                            return true;
                        case 7:
                            i(pVar2, q5, readInt2);
                            return true;
                        case 8:
                            p(pVar2, q5, readInt2);
                            return true;
                        default:
                            this.f3057f.a((long) q5);
                            break;
                    }
                    return true;
                }
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = g.f2976b;
                sb.append(readByte < strArr.length ? strArr[readByte] : c.g("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            throw new IOException(m.g("FRAME_SIZE_ERROR: ", q5));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void close() {
        this.f3057f.close();
    }

    public final void e(p pVar) {
        o.m(pVar, "handler");
        if (!this.f3058g) {
            j jVar = g.f2975a;
            j g6 = this.f3057f.g((long) jVar.f4132f.length);
            Level level = Level.FINE;
            Logger logger = f3054h;
            if (logger.isLoggable(level)) {
                logger.fine(c.g("<< CONNECTION " + g6.c(), new Object[0]));
            }
            if (!o.c(jVar, g6)) {
                throw new IOException("Expected a connection header but was ".concat(g6.i()));
            }
        } else if (!b(true, pVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void i(p pVar, int i3, int i6) {
        b bVar;
        a0[] a0VarArr;
        if (i3 < 8) {
            throw new IOException(m.g("TYPE_GOAWAY length < 8: ", i3));
        } else if (i6 == 0) {
            int readInt = this.f3057f.readInt();
            int readInt2 = this.f3057f.readInt();
            int i7 = i3 - 8;
            b[] values = b.values();
            int length = values.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i8];
                if (bVar.f2930d == readInt2) {
                    break;
                }
                i8++;
            }
            if (bVar != null) {
                j jVar = j.f4129g;
                if (i7 > 0) {
                    jVar = this.f3057f.g((long) i7);
                }
                pVar.getClass();
                o.m(jVar, "debugData");
                jVar.b();
                synchronized (pVar.f3003e) {
                    Object[] array = pVar.f3003e.f3020f.values().toArray(new a0[0]);
                    if (array != null) {
                        a0VarArr = (a0[]) array;
                        pVar.f3003e.f3024j = true;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                for (a0 a0Var : a0VarArr) {
                    if (a0Var.f2921m > readInt && a0Var.g()) {
                        b bVar2 = b.f2927i;
                        synchronized (a0Var) {
                            if (a0Var.f2919k == null) {
                                a0Var.f2919k = bVar2;
                                a0Var.notifyAll();
                            }
                        }
                        pVar.f3003e.l(a0Var.f2921m);
                    }
                }
                return;
            }
            throw new IOException(m.g("TYPE_GOAWAY unexpected error code: ", readInt2));
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f2957h);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List l(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            g5.w r0 = r2.f3055d
            r0.f3051g = r3
            r0.f3048d = r3
            r0.f3052h = r4
            r0.f3049e = r5
            r0.f3050f = r6
        L_0x000c:
            g5.d r3 = r2.f3056e
            l5.q r4 = r3.f2951b
            boolean r5 = r4.x()
            java.util.ArrayList r6 = r3.f2950a
            if (r5 != 0) goto L_0x0131
            byte r4 = r4.readByte()
            byte[] r5 = a5.c.f212a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0129
            r0 = r4 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 != r5) goto L_0x0070
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            r5 = 1
            if (r4 < 0) goto L_0x003b
            g5.c[] r0 = g5.f.f2971a
            int r0 = r0.length
            int r0 = r0 - r5
            if (r4 > r0) goto L_0x003b
            r1 = r5
        L_0x003b:
            if (r1 == 0) goto L_0x0042
            g5.c[] r3 = g5.f.f2971a
            r3 = r3[r4]
            goto L_0x0057
        L_0x0042:
            g5.c[] r0 = g5.f.f2971a
            int r0 = r0.length
            int r0 = r4 - r0
            int r1 = r3.f2953d
            int r1 = r1 + r5
            int r1 = r1 + r0
            if (r1 < 0) goto L_0x005b
            g5.c[] r3 = r3.f2952c
            int r0 = r3.length
            if (r1 >= r0) goto L_0x005b
            r3 = r3[r1]
            b1.o.k(r3)
        L_0x0057:
            r6.add(r3)
            goto L_0x000c
        L_0x005b:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Header index too large "
            r6.<init>(r0)
            int r4 = r4 + r5
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.<init>(r4)
            throw r3
        L_0x0070:
            r5 = 64
            if (r4 != r5) goto L_0x008a
            g5.c[] r4 = g5.f.f2971a
            l5.j r4 = r3.d()
            g5.f.a(r4)
            l5.j r5 = r3.d()
            g5.c r6 = new g5.c
            r6.<init>((l5.j) r4, (l5.j) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x008a:
            r0 = r4 & 64
            if (r0 != r5) goto L_0x00a8
            r5 = 63
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            l5.j r4 = r3.b(r4)
            l5.j r5 = r3.d()
            g5.c r6 = new g5.c
            r6.<init>((l5.j) r4, (l5.j) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x00a8:
            r5 = r4 & 32
            r0 = 32
            if (r5 != r0) goto L_0x00f1
            r5 = 31
            int r4 = r3.e(r4, r5)
            r3.f2957h = r4
            if (r4 < 0) goto L_0x00db
            int r5 = r3.f2956g
            if (r4 > r5) goto L_0x00db
            int r5 = r3.f2955f
            if (r4 >= r5) goto L_0x000c
            if (r4 != 0) goto L_0x00d5
            g5.c[] r4 = r3.f2952c
            r5 = 0
            g4.h.c0(r4, r5)
            g5.c[] r4 = r3.f2952c
            int r4 = r4.length
            int r4 = r4 + -1
            r3.f2953d = r4
            r3.f2954e = r1
            r3.f2955f = r1
            goto L_0x000c
        L_0x00d5:
            int r5 = r5 - r4
            r3.a(r5)
            goto L_0x000c
        L_0x00db:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            int r3 = r3.f2957h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00f1:
            r5 = 16
            if (r4 == r5) goto L_0x0112
            if (r4 != 0) goto L_0x00f8
            goto L_0x0112
        L_0x00f8:
            r5 = 15
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            l5.j r4 = r3.b(r4)
            l5.j r3 = r3.d()
            g5.c r5 = new g5.c
            r5.<init>((l5.j) r4, (l5.j) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0112:
            g5.c[] r4 = g5.f.f2971a
            l5.j r4 = r3.d()
            g5.f.a(r4)
            l5.j r3 = r3.d()
            g5.c r5 = new g5.c
            r5.<init>((l5.j) r4, (l5.j) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0129:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0131:
            java.util.List r3 = g4.l.d0(r6)
            r6.clear()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.x.l(int, int, int, int):java.util.List");
    }

    public final void n(p pVar, int i3, int i6, int i7) {
        if (i3 != 8) {
            throw new IOException(m.g("TYPE_PING length != 8: ", i3));
        } else if (i7 == 0) {
            int readInt = this.f3057f.readInt();
            int readInt2 = this.f3057f.readInt();
            if ((i6 & 1) != 0) {
                synchronized (pVar.f3003e) {
                    if (readInt == 1) {
                        pVar.f3003e.f3031q++;
                    } else if (readInt == 2) {
                        pVar.f3003e.f3033s++;
                    } else if (readInt == 3) {
                        u uVar = pVar.f3003e;
                        uVar.getClass();
                        uVar.notifyAll();
                    }
                }
                return;
            }
            pVar.f3003e.f3026l.c(new n(m.j(new StringBuilder(), pVar.f3003e.f3021g, " ping"), pVar, readInt, readInt2), 0);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public final void p(p pVar, int i3, int i6) {
        Object obj;
        if (i3 == 4) {
            int readInt = this.f3057f.readInt();
            byte[] bArr = c.f212a;
            long j6 = ((long) readInt) & 2147483647L;
            int i7 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
            if (i7 != 0) {
                if (i6 == 0) {
                    obj = pVar.f3003e;
                    synchronized (obj) {
                        u uVar = pVar.f3003e;
                        uVar.f3039z += j6;
                        uVar.notifyAll();
                    }
                } else {
                    a0 i8 = pVar.f3003e.i(i6);
                    if (i8 != null) {
                        synchronized (i8) {
                            i8.f2912d += j6;
                            if (i7 > 0) {
                                i8.notifyAll();
                            }
                            obj = i8;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(m.g("TYPE_WINDOW_UPDATE length !=4: ", i3));
    }
}
