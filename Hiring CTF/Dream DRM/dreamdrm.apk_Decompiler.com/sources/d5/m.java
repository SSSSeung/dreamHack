package d5;

import a5.c;
import b1.o;
import c5.a;
import java.net.Socket;
import java.util.Iterator;

public final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f2259e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(n nVar, String str) {
        super(str, true);
        this.f2259e = nVar;
    }

    public final long a() {
        n nVar = this.f2259e;
        long nanoTime = System.nanoTime();
        Iterator it = nVar.f2263d.iterator();
        int i3 = 0;
        long j6 = Long.MIN_VALUE;
        l lVar = null;
        int i6 = 0;
        while (it.hasNext()) {
            l lVar2 = (l) it.next();
            o.l(lVar2, "connection");
            synchronized (lVar2) {
                if (nVar.b(lVar2, nanoTime) > 0) {
                    i6++;
                } else {
                    i3++;
                    long j7 = nanoTime - lVar2.f2257p;
                    if (j7 > j6) {
                        lVar = lVar2;
                        j6 = j7;
                    }
                }
            }
        }
        long j8 = nVar.f2260a;
        if (j6 >= j8 || i3 > nVar.f2264e) {
            o.k(lVar);
            synchronized (lVar) {
                if (!(!lVar.f2256o.isEmpty())) {
                    if (lVar.f2257p + j6 == nanoTime) {
                        lVar.f2250i = true;
                        nVar.f2263d.remove(lVar);
                        Socket socket = lVar.f2244c;
                        o.k(socket);
                        byte[] bArr = c.f212a;
                        try {
                            socket.close();
                        } catch (AssertionError e6) {
                            throw e6;
                        } catch (RuntimeException e7) {
                            throw e7;
                        } catch (Exception unused) {
                        }
                        if (nVar.f2263d.isEmpty()) {
                            nVar.f2261b.a();
                        }
                    }
                }
            }
            return 0;
        } else if (i3 > 0) {
            return j8 - j6;
        } else {
            if (i6 > 0) {
                return j8;
            }
            return -1;
        }
    }
}
