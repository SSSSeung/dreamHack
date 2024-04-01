package g5;

import a5.c;
import b1.o;
import java.io.IOException;
import l5.g;
import l5.v;
import l5.x;

public final class z implements v {

    /* renamed from: d  reason: collision with root package name */
    public final g f3063d = new g();

    /* renamed from: e  reason: collision with root package name */
    public final g f3064e = new g();

    /* renamed from: f  reason: collision with root package name */
    public boolean f3065f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3066g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3067h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a0 f3068i;

    public z(a0 a0Var, long j6, boolean z5) {
        this.f3068i = a0Var;
        this.f3066g = j6;
        this.f3067h = z5;
    }

    public final void b(long j6) {
        byte[] bArr = c.f212a;
        this.f3068i.f2922n.p(j6);
    }

    public final x c() {
        return this.f3068i.f2917i;
    }

    public final void close() {
        long j6;
        synchronized (this.f3068i) {
            this.f3065f = true;
            g gVar = this.f3064e;
            j6 = gVar.f4128e;
            gVar.a(j6);
            a0 a0Var = this.f3068i;
            if (a0Var != null) {
                a0Var.notifyAll();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
        if (j6 > 0) {
            b(j6);
        }
        this.f3068i.a();
    }

    public final long o(g gVar, long j6) {
        b bVar;
        Throwable th;
        long j7;
        boolean z5;
        b bVar2;
        g gVar2 = gVar;
        long j8 = j6;
        o.m(gVar2, "sink");
        long j9 = 0;
        if (j8 >= 0) {
            while (true) {
                synchronized (this.f3068i) {
                    this.f3068i.f2917i.h();
                    try {
                        a0 a0Var = this.f3068i;
                        synchronized (a0Var) {
                            bVar = a0Var.f2919k;
                        }
                        if (bVar != null) {
                            th = this.f3068i.f2920l;
                            if (th == null) {
                                a0 a0Var2 = this.f3068i;
                                synchronized (a0Var2) {
                                    bVar2 = a0Var2.f2919k;
                                }
                                o.k(bVar2);
                                th = new g0(bVar2);
                            }
                        } else {
                            th = null;
                        }
                        if (!this.f3065f) {
                            g gVar3 = this.f3064e;
                            long j10 = gVar3.f4128e;
                            if (j10 > j9) {
                                j7 = gVar3.o(gVar2, Math.min(j8, j10));
                                a0 a0Var3 = this.f3068i;
                                long j11 = a0Var3.f2909a + j7;
                                a0Var3.f2909a = j11;
                                long j12 = j11 - a0Var3.f2910b;
                                if (th == null && j12 >= ((long) (a0Var3.f2922n.f3035u.a() / 2))) {
                                    a0 a0Var4 = this.f3068i;
                                    a0Var4.f2922n.D(j12, a0Var4.f2921m);
                                    a0 a0Var5 = this.f3068i;
                                    a0Var5.f2910b = a0Var5.f2909a;
                                }
                            } else if (this.f3067h || th != null) {
                                j7 = -1;
                            } else {
                                this.f3068i.j();
                                j7 = -1;
                                z5 = true;
                                this.f3068i.f2917i.l();
                            }
                            z5 = false;
                            this.f3068i.f2917i.l();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (Throwable th2) {
                        this.f3068i.f2917i.l();
                        throw th2;
                    }
                }
                if (z5) {
                    j9 = 0;
                } else if (j7 != -1) {
                    b(j7);
                    return j7;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
    }
}
