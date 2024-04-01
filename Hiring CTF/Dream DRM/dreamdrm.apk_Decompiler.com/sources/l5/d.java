package l5;

import b1.o;
import com.bumptech.glide.c;
import d5.i;
import java.io.IOException;
import java.io.InputStream;

public final class d implements v {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4116d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4117e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4118f;

    public d(i iVar, d dVar) {
        this.f4117e = iVar;
        this.f4118f = dVar;
    }

    public final x c() {
        switch (this.f4116d) {
            case 0:
                return (e) this.f4117e;
            default:
                return (x) this.f4118f;
        }
    }

    public final void close() {
        int i3 = this.f4116d;
        Object obj = this.f4117e;
        switch (i3) {
            case 0:
                e eVar = (e) obj;
                eVar.h();
                try {
                    ((v) this.f4118f).close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    public final long o(g gVar, long j6) {
        int i3 = this.f4116d;
        Object obj = this.f4118f;
        Object obj2 = this.f4117e;
        switch (i3) {
            case 0:
                o.m(gVar, "sink");
                e eVar = (e) obj2;
                eVar.h();
                try {
                    long o5 = ((v) obj).o(gVar, j6);
                    if (!eVar.i()) {
                        return o5;
                    }
                    throw eVar.j((IOException) null);
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
                o.m(gVar, "sink");
                int i6 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
                if (i6 == 0) {
                    return 0;
                }
                if (i6 >= 0) {
                    try {
                        ((x) obj).f();
                        r C = gVar.C(1);
                        int read = ((InputStream) obj2).read(C.f4152a, C.f4154c, (int) Math.min(j6, (long) (8192 - C.f4154c)));
                        if (read == -1) {
                            if (C.f4153b == C.f4154c) {
                                gVar.f4127d = C.a();
                                s.a(C);
                            }
                            return -1;
                        }
                        C.f4154c += read;
                        long j7 = (long) read;
                        gVar.f4128e += j7;
                        return j7;
                    } catch (AssertionError e7) {
                        if (c.t(e7)) {
                            throw new IOException(e7);
                        }
                        throw e7;
                    }
                } else {
                    throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
                }
        }
    }

    public final String toString() {
        switch (this.f4116d) {
            case 0:
                return "AsyncTimeout.source(" + ((v) this.f4118f) + ')';
            default:
                return "source(" + ((InputStream) this.f4117e) + ')';
        }
    }

    public d(InputStream inputStream, x xVar) {
        this.f4117e = inputStream;
        this.f4118f = xVar;
    }
}
