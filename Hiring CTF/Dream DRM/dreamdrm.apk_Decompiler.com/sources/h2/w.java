package h2;

import b2.h;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class w extends FilterInputStream {

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f3442d;

    /* renamed from: e  reason: collision with root package name */
    public int f3443e;

    /* renamed from: f  reason: collision with root package name */
    public int f3444f;

    /* renamed from: g  reason: collision with root package name */
    public int f3445g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3446h;

    /* renamed from: i  reason: collision with root package name */
    public final h f3447i;

    public w(InputStream inputStream, h hVar) {
        super(inputStream);
        this.f3447i = hVar;
        this.f3442d = (byte[]) hVar.c(65536, byte[].class);
    }

    public static void i() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f3442d == null || inputStream == null) {
            i();
            throw null;
        }
        return (this.f3443e - this.f3446h) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) {
        int i3;
        int i6 = this.f3445g;
        if (i6 == -1 || this.f3446h - i6 >= (i3 = this.f3444f)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f3445g = -1;
                this.f3446h = 0;
                this.f3443e = read;
            }
            return read;
        }
        if (i6 == 0 && i3 > bArr.length && this.f3443e == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i3) {
                i3 = length;
            }
            byte[] bArr2 = (byte[]) this.f3447i.c(i3, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f3442d = bArr2;
            this.f3447i.g(bArr);
            bArr = bArr2;
        } else if (i6 > 0) {
            System.arraycopy(bArr, i6, bArr, 0, bArr.length - i6);
        }
        int i7 = this.f3446h - this.f3445g;
        this.f3446h = i7;
        this.f3445g = 0;
        this.f3443e = 0;
        int read2 = inputStream.read(bArr, i7, bArr.length - i7);
        int i8 = this.f3446h;
        if (read2 > 0) {
            i8 += read2;
        }
        this.f3443e = i8;
        return read2;
    }

    public final void close() {
        if (this.f3442d != null) {
            this.f3447i.g(this.f3442d);
            this.f3442d = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void e() {
        if (this.f3442d != null) {
            this.f3447i.g(this.f3442d);
            this.f3442d = null;
        }
    }

    public final synchronized void mark(int i3) {
        this.f3444f = Math.max(this.f3444f, i3);
        this.f3445g = this.f3446h;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f3442d     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f3446h     // Catch:{ all -> 0x003d }
            int r4 = r6.f3443e     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.b(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f3442d     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f3442d     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            i()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0026:
            int r1 = r6.f3443e     // Catch:{ all -> 0x003d }
            int r2 = r6.f3446h     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f3446h = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            i()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.w.read():int");
    }

    public final synchronized void reset() {
        if (this.f3442d != null) {
            int i3 = this.f3445g;
            if (-1 != i3) {
                this.f3446h = i3;
            } else {
                throw new v("Mark has been invalidated, pos: " + this.f3446h + " markLimit: " + this.f3444f);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0;
        }
        byte[] bArr = this.f3442d;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i3 = this.f3443e;
                int i6 = this.f3446h;
                if (((long) (i3 - i6)) >= j6) {
                    this.f3446h = (int) (((long) i6) + j6);
                    return j6;
                }
                long j7 = ((long) i3) - ((long) i6);
                this.f3446h = i3;
                if (this.f3445g == -1 || j6 > ((long) this.f3444f)) {
                    long skip = inputStream.skip(j6 - j7);
                    if (skip > 0) {
                        this.f3445g = -1;
                    }
                    return j7 + skip;
                } else if (b(inputStream, bArr) == -1) {
                    return j7;
                } else {
                    int i7 = this.f3443e;
                    int i8 = this.f3446h;
                    if (((long) (i7 - i8)) >= j6 - j7) {
                        this.f3446h = (int) ((((long) i8) + j6) - j7);
                        return j6;
                    }
                    long j8 = (j7 + ((long) i7)) - ((long) i8);
                    this.f3446h = i7;
                    return j8;
                }
            } else {
                i();
                throw null;
            }
        } else {
            i();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0052, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f3442d     // Catch:{ all -> 0x0088 }
            r1 = 0
            if (r0 == 0) goto L_0x0084
            if (r9 != 0) goto L_0x000b
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0080
            int r3 = r6.f3446h     // Catch:{ all -> 0x0088 }
            int r4 = r6.f3443e     // Catch:{ all -> 0x0088 }
            if (r3 >= r4) goto L_0x0030
            int r4 = r4 - r3
            if (r4 < r9) goto L_0x0019
            r4 = r9
        L_0x0019:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r3 = r6.f3446h     // Catch:{ all -> 0x0088 }
            int r3 = r3 + r4
            r6.f3446h = r3     // Catch:{ all -> 0x0088 }
            if (r4 == r9) goto L_0x002e
            int r3 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r3 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L_0x0031
        L_0x002e:
            monitor-exit(r6)
            return r4
        L_0x0030:
            r3 = r9
        L_0x0031:
            int r4 = r6.f3445g     // Catch:{ all -> 0x0088 }
            r5 = -1
            if (r4 != r5) goto L_0x0046
            int r4 = r0.length     // Catch:{ all -> 0x0088 }
            if (r3 < r4) goto L_0x0046
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0070
            if (r3 != r9) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            int r5 = r9 - r3
        L_0x0044:
            monitor-exit(r6)
            return r5
        L_0x0046:
            int r4 = r6.b(r2, r0)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0053
            if (r3 != r9) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            int r5 = r9 - r3
        L_0x0051:
            monitor-exit(r6)
            return r5
        L_0x0053:
            byte[] r4 = r6.f3442d     // Catch:{ all -> 0x0088 }
            if (r0 == r4) goto L_0x0060
            byte[] r0 = r6.f3442d     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            i()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0060:
            int r4 = r6.f3443e     // Catch:{ all -> 0x0088 }
            int r5 = r6.f3446h     // Catch:{ all -> 0x0088 }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0068
            r4 = r3
        L_0x0068:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r5 = r6.f3446h     // Catch:{ all -> 0x0088 }
            int r5 = r5 + r4
            r6.f3446h = r5     // Catch:{ all -> 0x0088 }
        L_0x0070:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0075
            monitor-exit(r6)
            return r9
        L_0x0075:
            int r5 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x007e
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x007e:
            int r8 = r8 + r4
            goto L_0x0031
        L_0x0080:
            i()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0084:
            i()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.w.read(byte[], int, int):int");
    }
}
