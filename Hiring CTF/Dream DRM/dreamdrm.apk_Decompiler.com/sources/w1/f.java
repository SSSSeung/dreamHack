package w1;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class f implements Closeable {

    /* renamed from: d  reason: collision with root package name */
    public final File f5445d;

    /* renamed from: e  reason: collision with root package name */
    public final File f5446e;

    /* renamed from: f  reason: collision with root package name */
    public final File f5447f;

    /* renamed from: g  reason: collision with root package name */
    public final File f5448g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5449h;

    /* renamed from: i  reason: collision with root package name */
    public final long f5450i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5451j;

    /* renamed from: k  reason: collision with root package name */
    public long f5452k = 0;

    /* renamed from: l  reason: collision with root package name */
    public BufferedWriter f5453l;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashMap f5454m = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: n  reason: collision with root package name */
    public int f5455n;

    /* renamed from: o  reason: collision with root package name */
    public long f5456o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final ThreadPoolExecutor f5457p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: q  reason: collision with root package name */
    public final a f5458q = new a(this);

    public f(File file, long j6) {
        File file2 = file;
        this.f5445d = file2;
        this.f5449h = 1;
        this.f5446e = new File(file2, "journal");
        this.f5447f = new File(file2, "journal.tmp");
        this.f5448g = new File(file2, "journal.bkp");
        this.f5451j = 1;
        this.f5450i = j6;
    }

    public static f C(File file, long j6) {
        if (j6 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    H(file2, file3, false);
                }
            }
            f fVar = new f(file, j6);
            if (fVar.f5446e.exists()) {
                try {
                    fVar.E();
                    fVar.D();
                    return fVar;
                } catch (IOException e6) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                    fVar.close();
                    i.a(fVar.f5445d);
                }
            }
            file.mkdirs();
            f fVar2 = new f(file, j6);
            fVar2.G();
            return fVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void H(File file, File file2, boolean z5) {
        if (z5) {
            i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void b(f fVar, c cVar, boolean z5) {
        synchronized (fVar) {
            d dVar = (d) cVar.f5429b;
            if (dVar.f5437f == cVar) {
                if (z5 && !dVar.f5436e) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= fVar.f5451j) {
                            break;
                        } else if (!((boolean[]) cVar.f5430c)[i3]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i3);
                        } else if (!dVar.f5435d[i3].exists()) {
                            cVar.a();
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                for (int i6 = 0; i6 < fVar.f5451j; i6++) {
                    File file = dVar.f5435d[i6];
                    if (!z5) {
                        i(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f5434c[i6];
                        file.renameTo(file2);
                        long j6 = dVar.f5433b[i6];
                        long length = file2.length();
                        dVar.f5433b[i6] = length;
                        fVar.f5452k = (fVar.f5452k - j6) + length;
                    }
                }
                fVar.f5455n++;
                dVar.f5437f = null;
                if (dVar.f5436e || z5) {
                    dVar.f5436e = true;
                    fVar.f5453l.append("CLEAN");
                    fVar.f5453l.append(' ');
                    fVar.f5453l.append(dVar.f5432a);
                    fVar.f5453l.append(dVar.a());
                    fVar.f5453l.append(10);
                    if (z5) {
                        long j7 = fVar.f5456o;
                        fVar.f5456o = 1 + j7;
                        dVar.f5438g = j7;
                    }
                } else {
                    fVar.f5454m.remove(dVar.f5432a);
                    fVar.f5453l.append("REMOVE");
                    fVar.f5453l.append(' ');
                    fVar.f5453l.append(dVar.f5432a);
                    fVar.f5453l.append(10);
                }
                n(fVar.f5453l);
                if (fVar.f5452k > fVar.f5450i || fVar.q()) {
                    fVar.f5457p.submit(fVar.f5458q);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static void e(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void i(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void n(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void D() {
        i(this.f5447f);
        Iterator it = this.f5454m.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            c cVar = dVar.f5437f;
            int i3 = this.f5451j;
            int i6 = 0;
            if (cVar == null) {
                while (i6 < i3) {
                    this.f5452k += dVar.f5433b[i6];
                    i6++;
                }
            } else {
                dVar.f5437f = null;
                while (i6 < i3) {
                    i(dVar.f5434c[i6]);
                    i(dVar.f5435d[i6]);
                    i6++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10.f5455n = r1 - r10.f5454m.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r2.f5464h == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r10.f5453l = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r4, true), w1.i.f5465a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0062=Splitter:B:16:0x0062, B:29:0x0093=Splitter:B:29:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            w1.h r2 = new w1.h
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r10.f5446e
            r3.<init>(r4)
            java.nio.charset.Charset r5 = w1.i.f5465a
            r2.<init>(r3, r5)
            java.lang.String r3 = r2.b()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r2.b()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r2.b()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = r2.b()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = r2.b()     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            int r9 = r10.f5449h     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0091 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            int r6 = r10.f5451j     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0091 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            r0 = 0
            r1 = r0
        L_0x0058:
            java.lang.String r3 = r2.b()     // Catch:{ EOFException -> 0x0062 }
            r10.F(r3)     // Catch:{ EOFException -> 0x0062 }
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap r3 = r10.f5454m     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r1 = r1 - r3
            r10.f5455n = r1     // Catch:{ all -> 0x0091 }
            int r1 = r2.f5464h     // Catch:{ all -> 0x0091 }
            r3 = -1
            r5 = 1
            if (r1 != r3) goto L_0x0072
            r0 = r5
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            r10.G()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0078:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = w1.i.f5465a     // Catch:{ all -> 0x0091 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r1)     // Catch:{ all -> 0x0091 }
            r10.f5453l = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r2.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00bc
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r6.<init>(r1)     // Catch:{ all -> 0x0091 }
            r6.append(r3)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r5)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r7)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r8)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00bc:
            r2.close()     // Catch:{ RuntimeException -> 0x00c0, Exception -> 0x00bf }
        L_0x00bf:
            throw r0
        L_0x00c0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.f.E():void");
    }

    public final void F(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i3 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i3);
            LinkedHashMap linkedHashMap = this.f5454m;
            if (indexOf2 == -1) {
                str2 = str.substring(i3);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i3, indexOf2);
            }
            d dVar = (d) linkedHashMap.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2);
                linkedHashMap.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f5436e = true;
                dVar.f5437f = null;
                if (split.length == dVar.f5439h.f5451j) {
                    int i6 = 0;
                    while (i6 < split.length) {
                        try {
                            dVar.f5433b[i6] = Long.parseLong(split[i6]);
                            i6++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f5437f = new c(this, dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void G() {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.f5453l;
        if (bufferedWriter != null) {
            e(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5447f), i.f5465a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f5449h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f5451j));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d dVar : this.f5454m.values()) {
                if (dVar.f5437f != null) {
                    sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(dVar.f5432a);
                    sb.append(10);
                } else {
                    sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(dVar.f5432a);
                    sb.append(dVar.a());
                    sb.append(10);
                }
                bufferedWriter2.write(sb.toString());
            }
            e(bufferedWriter2);
            if (this.f5446e.exists()) {
                H(this.f5446e, this.f5448g, true);
            }
            H(this.f5447f, this.f5446e, false);
            this.f5448g.delete();
            this.f5453l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5446e, true), i.f5465a));
        } catch (Throwable th) {
            e(bufferedWriter2);
            throw th;
        }
    }

    public final void I() {
        while (this.f5452k > this.f5450i) {
            String str = (String) ((Map.Entry) this.f5454m.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.f5453l != null) {
                    d dVar = (d) this.f5454m.get(str);
                    if (dVar != null) {
                        if (dVar.f5437f == null) {
                            for (int i3 = 0; i3 < this.f5451j; i3++) {
                                File file = dVar.f5434c[i3];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j6 = this.f5452k;
                                long[] jArr = dVar.f5433b;
                                this.f5452k = j6 - jArr[i3];
                                jArr[i3] = 0;
                            }
                            this.f5455n++;
                            this.f5453l.append("REMOVE");
                            this.f5453l.append(' ');
                            this.f5453l.append(str);
                            this.f5453l.append(10);
                            this.f5454m.remove(str);
                            if (q()) {
                                this.f5457p.submit(this.f5458q);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    public final synchronized void close() {
        if (this.f5453l != null) {
            Iterator it = new ArrayList(this.f5454m.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f5437f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            I();
            e(this.f5453l);
            this.f5453l = null;
        }
    }

    public final c l(String str) {
        synchronized (this) {
            if (this.f5453l != null) {
                d dVar = (d) this.f5454m.get(str);
                if (dVar == null) {
                    dVar = new d(this, str);
                    this.f5454m.put(str, dVar);
                } else if (dVar.f5437f != null) {
                    return null;
                }
                c cVar = new c(this, dVar);
                dVar.f5437f = cVar;
                this.f5453l.append("DIRTY");
                this.f5453l.append(' ');
                this.f5453l.append(str);
                this.f5453l.append(10);
                n(this.f5453l);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e p(String str) {
        if (this.f5453l != null) {
            d dVar = (d) this.f5454m.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f5436e) {
                return null;
            }
            for (File exists : dVar.f5434c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f5455n++;
            this.f5453l.append("READ");
            this.f5453l.append(' ');
            this.f5453l.append(str);
            this.f5453l.append(10);
            if (q()) {
                this.f5457p.submit(this.f5458q);
            }
            return new e(this, str, dVar.f5438g, dVar.f5434c, dVar.f5433b);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean q() {
        int i3 = this.f5455n;
        return i3 >= 2000 && i3 >= this.f5454m.size();
    }
}
