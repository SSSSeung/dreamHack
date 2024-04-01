package l5;

import java.util.zip.Inflater;

public final class m implements v {

    /* renamed from: d  reason: collision with root package name */
    public int f4139d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4140e;

    /* renamed from: f  reason: collision with root package name */
    public final i f4141f;

    /* renamed from: g  reason: collision with root package name */
    public final Inflater f4142g;

    public m(q qVar, Inflater inflater) {
        this.f4141f = qVar;
        this.f4142g = inflater;
    }

    public final x c() {
        return this.f4141f.c();
    }

    public final void close() {
        if (!this.f4140e) {
            this.f4142g.end();
            this.f4140e = true;
            this.f4141f.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long o(l5.g r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            b1.o.m(r10, r0)
        L_0x0005:
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L_0x000e
            r4 = r3
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 == 0) goto L_0x00bf
            boolean r4 = r9.f4140e
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00b3
            l5.i r4 = r9.f4141f
            java.util.zip.Inflater r5 = r9.f4142g
            if (r2 != 0) goto L_0x001d
            goto L_0x0086
        L_0x001d:
            l5.r r2 = r10.C(r3)     // Catch:{ DataFormatException -> 0x00ac }
            int r3 = r2.f4154c     // Catch:{ DataFormatException -> 0x00ac }
            int r3 = 8192 - r3
            long r6 = (long) r3     // Catch:{ DataFormatException -> 0x00ac }
            long r6 = java.lang.Math.min(r11, r6)     // Catch:{ DataFormatException -> 0x00ac }
            int r3 = (int) r6     // Catch:{ DataFormatException -> 0x00ac }
            boolean r6 = r5.needsInput()     // Catch:{ DataFormatException -> 0x00ac }
            if (r6 != 0) goto L_0x0032
            goto L_0x004e
        L_0x0032:
            boolean r6 = r4.x()     // Catch:{ DataFormatException -> 0x00ac }
            if (r6 == 0) goto L_0x0039
            goto L_0x004e
        L_0x0039:
            l5.g r6 = r4.w()     // Catch:{ DataFormatException -> 0x00ac }
            l5.r r6 = r6.f4127d     // Catch:{ DataFormatException -> 0x00ac }
            b1.o.k(r6)     // Catch:{ DataFormatException -> 0x00ac }
            int r7 = r6.f4154c     // Catch:{ DataFormatException -> 0x00ac }
            int r8 = r6.f4153b     // Catch:{ DataFormatException -> 0x00ac }
            int r7 = r7 - r8
            r9.f4139d = r7     // Catch:{ DataFormatException -> 0x00ac }
            byte[] r6 = r6.f4152a     // Catch:{ DataFormatException -> 0x00ac }
            r5.setInput(r6, r8, r7)     // Catch:{ DataFormatException -> 0x00ac }
        L_0x004e:
            byte[] r6 = r2.f4152a     // Catch:{ DataFormatException -> 0x00ac }
            int r7 = r2.f4154c     // Catch:{ DataFormatException -> 0x00ac }
            int r3 = r5.inflate(r6, r7, r3)     // Catch:{ DataFormatException -> 0x00ac }
            int r6 = r9.f4139d     // Catch:{ DataFormatException -> 0x00ac }
            if (r6 != 0) goto L_0x005b
            goto L_0x0069
        L_0x005b:
            int r7 = r5.getRemaining()     // Catch:{ DataFormatException -> 0x00ac }
            int r6 = r6 - r7
            int r7 = r9.f4139d     // Catch:{ DataFormatException -> 0x00ac }
            int r7 = r7 - r6
            r9.f4139d = r7     // Catch:{ DataFormatException -> 0x00ac }
            long r6 = (long) r6     // Catch:{ DataFormatException -> 0x00ac }
            r4.a(r6)     // Catch:{ DataFormatException -> 0x00ac }
        L_0x0069:
            if (r3 <= 0) goto L_0x0077
            int r6 = r2.f4154c     // Catch:{ DataFormatException -> 0x00ac }
            int r6 = r6 + r3
            r2.f4154c = r6     // Catch:{ DataFormatException -> 0x00ac }
            long r6 = r10.f4128e     // Catch:{ DataFormatException -> 0x00ac }
            long r2 = (long) r3     // Catch:{ DataFormatException -> 0x00ac }
            long r6 = r6 + r2
            r10.f4128e = r6     // Catch:{ DataFormatException -> 0x00ac }
            goto L_0x0087
        L_0x0077:
            int r3 = r2.f4153b     // Catch:{ DataFormatException -> 0x00ac }
            int r6 = r2.f4154c     // Catch:{ DataFormatException -> 0x00ac }
            if (r3 != r6) goto L_0x0086
            l5.r r3 = r2.a()     // Catch:{ DataFormatException -> 0x00ac }
            r10.f4127d = r3     // Catch:{ DataFormatException -> 0x00ac }
            l5.s.a(r2)     // Catch:{ DataFormatException -> 0x00ac }
        L_0x0086:
            r2 = r0
        L_0x0087:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            return r2
        L_0x008c:
            boolean r0 = r5.finished()
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r5.needsDictionary()
            if (r0 == 0) goto L_0x0099
            goto L_0x00a9
        L_0x0099:
            boolean r0 = r4.x()
            if (r0 != 0) goto L_0x00a1
            goto L_0x0005
        L_0x00a1:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        L_0x00a9:
            r10 = -1
            return r10
        L_0x00ac:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        L_0x00b3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00bf:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.m.o(l5.g, long):long");
    }
}
