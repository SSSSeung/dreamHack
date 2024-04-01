package e4;

import b1.o;
import com.theori.dreamdrm.MainActivity;
import d5.j;
import java.io.IOException;
import z4.e;

public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2587a;

    public l(MainActivity mainActivity) {
        this.f2587a = mainActivity;
    }

    public final void a(j jVar, IOException iOException) {
        o.m(jVar, "call");
        this.f2587a.o("Failed to load book list from the server");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        b1.v.l(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(d5.j r3, z4.a0 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "call"
            b1.o.m(r3, r0)
            r3 = 200(0xc8, float:2.8E-43)
            int r0 = r4.f5959g
            if (r3 <= r0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            r3 = 299(0x12b, float:4.19E-43)
            if (r3 < r0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r3 == 0) goto L_0x0054
            r3 = 0
            z4.c0 r4 = r4.f5962j
            if (r4 == 0) goto L_0x0036
            l5.i r0 = r4.e()
            java.nio.charset.Charset r4 = r4.b()     // Catch:{ all -> 0x002f }
            java.nio.charset.Charset r4 = a5.c.p(r0, r4)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = r0.A(r4)     // Catch:{ all -> 0x002f }
            b1.v.l(r0, r3)
            r3 = r4
            goto L_0x0036
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            b1.v.l(r0, r3)
            throw r4
        L_0x0036:
            com.theori.dreamdrm.MainActivity$loadFileList$1$onResponse$fileType$1 r4 = new com.theori.dreamdrm.MainActivity$loadFileList$1$onResponse$fileType$1
            r4.<init>()
            v3.n r0 = new v3.n
            r0.<init>()
            java.lang.reflect.Type r4 = r4.f2105b
            java.lang.Object r3 = r0.a(r3, r4)
            java.util.List r3 = (java.util.List) r3
            e.k0 r4 = new e.k0
            com.theori.dreamdrm.MainActivity r0 = r2.f2587a
            r1 = 4
            r4.<init>(r0, r1, r3)
            r0.runOnUiThread(r4)
            return
        L_0x0054:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected code "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.l.b(d5.j, z4.a0):void");
    }
}
