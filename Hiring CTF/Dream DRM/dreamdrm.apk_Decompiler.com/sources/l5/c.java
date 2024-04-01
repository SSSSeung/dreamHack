package l5;

import b1.o;
import com.bumptech.glide.e;
import d5.i;
import java.io.IOException;
import java.io.OutputStream;

public final class c implements u {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4113d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4114e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4115f;

    public c(i iVar, c cVar) {
        this.f4114e = iVar;
        this.f4115f = cVar;
    }

    public final x c() {
        switch (this.f4113d) {
            case 0:
                return (e) this.f4114e;
            default:
                return (x) this.f4115f;
        }
    }

    public final void close() {
        int i3 = this.f4113d;
        Object obj = this.f4114e;
        switch (i3) {
            case 0:
                e eVar = (e) obj;
                eVar.h();
                try {
                    ((u) this.f4115f).close();
                    if (eVar.i()) {
                        throw eVar.j((IOException) null);
                    }
                    return;
                } catch (IOException e6) {
                    e = e6;
                    if (eVar.i()) {
                        e = eVar.j(e);
                    }
                    throw e;
                } finally {
                    eVar.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    public final void flush() {
        int i3 = this.f4113d;
        Object obj = this.f4114e;
        switch (i3) {
            case 0:
                e eVar = (e) obj;
                eVar.h();
                try {
                    ((u) this.f4115f).flush();
                    if (eVar.i()) {
                        throw eVar.j((IOException) null);
                    }
                    return;
                } catch (IOException e6) {
                    e = e6;
                    if (eVar.i()) {
                        e = eVar.j(e);
                    }
                    throw e;
                } finally {
                    eVar.i();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final void t(g gVar, long j6) {
        int i3 = this.f4113d;
        Object obj = this.f4115f;
        Object obj2 = this.f4114e;
        switch (i3) {
            case 0:
                o.m(gVar, "source");
                e.g(gVar.f4128e, 0, j6);
                while (j6 > 0) {
                    r rVar = gVar.f4127d;
                    long j7 = 0;
                    while (true) {
                        o.k(rVar);
                        if (j7 < ((long) 65536)) {
                            j7 += (long) (rVar.f4154c - rVar.f4153b);
                            if (j7 >= j6) {
                                j7 = j6;
                            } else {
                                rVar = rVar.f4157f;
                            }
                        }
                    }
                    e eVar = (e) obj2;
                    eVar.h();
                    try {
                        ((u) obj).t(gVar, j7);
                        if (!eVar.i()) {
                            j6 -= j7;
                        } else {
                            throw eVar.j((IOException) null);
                        }
                    } catch (IOException e6) {
                        e = e6;
                        if (eVar.i()) {
                            e = eVar.j(e);
                        }
                        throw e;
                    } finally {
                        eVar.i();
                    }
                }
                return;
            default:
                o.m(gVar, "source");
                e.g(gVar.f4128e, 0, j6);
                while (j6 > 0) {
                    ((x) obj).f();
                    r rVar2 = gVar.f4127d;
                    o.k(rVar2);
                    int min = (int) Math.min(j6, (long) (rVar2.f4154c - rVar2.f4153b));
                    ((OutputStream) obj2).write(rVar2.f4152a, rVar2.f4153b, min);
                    int i6 = rVar2.f4153b + min;
                    rVar2.f4153b = i6;
                    long j8 = (long) min;
                    j6 -= j8;
                    gVar.f4128e -= j8;
                    if (i6 == rVar2.f4154c) {
                        gVar.f4127d = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f4113d) {
            case 0:
                return "AsyncTimeout.sink(" + ((u) this.f4115f) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4114e) + ')';
        }
    }

    public c(OutputStream outputStream, i iVar) {
        this.f4114e = outputStream;
        this.f4115f = iVar;
    }
}
