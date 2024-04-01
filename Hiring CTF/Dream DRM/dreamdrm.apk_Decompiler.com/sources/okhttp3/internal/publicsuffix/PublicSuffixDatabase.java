package okhttp3.internal.publicsuffix;

import androidx.fragment.app.n0;
import b1.o;
import b1.v;
import g4.l;
import g4.n;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import v4.i;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f4347e = {(byte) 42};

    /* renamed from: f  reason: collision with root package name */
    public static final List f4348f = v.D("*");

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f4349g = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f4350a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f4351b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4352c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4353d;

    static {
        new n0(21, 0);
    }

    public static List c(String str) {
        int i3 = 0;
        List<Object> i02 = i.i0(str, new char[]{'.'});
        if (i02.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        } else if (!o.c((String) i02.get(v.v(i02)), "")) {
            return i02;
        } else {
            int size = i02.size() - 1;
            if (size < 0) {
                size = 0;
            }
            if (!(size >= 0)) {
                throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
            } else if (size == 0) {
                return n.f2906d;
            } else {
                if (size >= i02.size()) {
                    return l.d0(i02);
                }
                if (size == 1) {
                    return v.D(l.Y(i02));
                }
                ArrayList arrayList = new ArrayList(size);
                for (Object add : i02) {
                    arrayList.add(add);
                    i3++;
                    if (i3 == size) {
                        break;
                    }
                }
                return v.J(arrayList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r1 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x0036;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r13)
            java.lang.String r1 = "unicodeDomain"
            b1.o.l(r0, r1)
            java.util.List r0 = c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f4350a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f4350a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x004f
            r1 = r2
        L_0x0020:
            r12.b()     // Catch:{ InterruptedIOException -> 0x0040, IOException -> 0x0026 }
            if (r1 == 0) goto L_0x005c
            goto L_0x0036
        L_0x0026:
            r4 = move-exception
            h5.n r5 = h5.n.f3500a     // Catch:{ all -> 0x003e }
            h5.n r5 = h5.n.f3500a     // Catch:{ all -> 0x003e }
            java.lang.String r6 = "Failed to read public suffix list"
            r5.getClass()     // Catch:{ all -> 0x003e }
            r5 = 5
            h5.n.i(r6, r5, r4)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x005c
        L_0x0036:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x005c
        L_0x003e:
            r13 = move-exception
            goto L_0x0045
        L_0x0040:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x003e }
            r1 = r3
            goto L_0x0020
        L_0x0045:
            if (r1 == 0) goto L_0x004e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004e:
            throw r13
        L_0x004f:
            java.util.concurrent.CountDownLatch r1 = r12.f4351b     // Catch:{ InterruptedException -> 0x0055 }
            r1.await()     // Catch:{ InterruptedException -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x005c:
            byte[] r1 = r12.f4352c
            if (r1 == 0) goto L_0x0062
            r1 = r3
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            if (r1 == 0) goto L_0x01d2
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x006c:
            if (r5 >= r1) goto L_0x0093
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            b1.o.l(r7, r8)
            if (r6 == 0) goto L_0x008b
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            b1.o.l(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006c
        L_0x008b:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r13.<init>(r0)
            throw r13
        L_0x0093:
            r5 = r2
        L_0x0094:
            r6 = 0
            java.lang.String r7 = "publicSuffixListBytes"
            if (r5 >= r1) goto L_0x00ab
            byte[] r8 = r12.f4352c
            if (r8 == 0) goto L_0x00a7
            java.lang.String r8 = androidx.fragment.app.n0.g(r8, r4, r5)
            if (r8 == 0) goto L_0x00a4
            goto L_0x00ac
        L_0x00a4:
            int r5 = r5 + 1
            goto L_0x0094
        L_0x00a7:
            b1.o.Y(r7)
            throw r6
        L_0x00ab:
            r8 = r6
        L_0x00ac:
            if (r1 <= r3) goto L_0x00cf
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x00b7:
            if (r10 >= r9) goto L_0x00cf
            byte[] r11 = f4347e
            r5[r10] = r11
            byte[] r11 = r12.f4352c
            if (r11 == 0) goto L_0x00cb
            java.lang.String r11 = androidx.fragment.app.n0.g(r11, r5, r10)
            if (r11 == 0) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            int r10 = r10 + 1
            goto L_0x00b7
        L_0x00cb:
            b1.o.Y(r7)
            throw r6
        L_0x00cf:
            r11 = r6
        L_0x00d0:
            if (r11 == 0) goto L_0x00ea
            int r1 = r1 - r3
            r5 = r2
        L_0x00d4:
            if (r5 >= r1) goto L_0x00ea
            byte[] r7 = r12.f4353d
            if (r7 == 0) goto L_0x00e4
            java.lang.String r7 = androidx.fragment.app.n0.g(r7, r4, r5)
            if (r7 == 0) goto L_0x00e1
            goto L_0x00eb
        L_0x00e1:
            int r5 = r5 + 1
            goto L_0x00d4
        L_0x00e4:
            java.lang.String r13 = "publicSuffixExceptionListBytes"
            b1.o.Y(r13)
            throw r6
        L_0x00ea:
            r7 = r6
        L_0x00eb:
            r1 = 46
            if (r7 == 0) goto L_0x00fe
            java.lang.String r4 = "!"
            java.lang.String r4 = r4.concat(r7)
            char[] r5 = new char[r3]
            r5[r2] = r1
            java.util.List r1 = v4.i.i0(r4, r5)
            goto L_0x012a
        L_0x00fe:
            if (r8 != 0) goto L_0x0105
            if (r11 != 0) goto L_0x0105
            java.util.List r1 = f4348f
            goto L_0x012a
        L_0x0105:
            g4.n r4 = g4.n.f2906d
            if (r8 == 0) goto L_0x0112
            char[] r5 = new char[r3]
            r5[r2] = r1
            java.util.List r5 = v4.i.i0(r8, r5)
            goto L_0x0113
        L_0x0112:
            r5 = r4
        L_0x0113:
            if (r11 == 0) goto L_0x011e
            char[] r4 = new char[r3]
            r4[r2] = r1
            java.util.List r1 = v4.i.i0(r11, r4)
            goto L_0x011f
        L_0x011e:
            r1 = r4
        L_0x011f:
            int r4 = r5.size()
            int r7 = r1.size()
            if (r4 <= r7) goto L_0x012a
            r1 = r5
        L_0x012a:
            int r4 = r0.size()
            int r5 = r1.size()
            r7 = 33
            if (r4 != r5) goto L_0x0143
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r4 == r7) goto L_0x0143
            return r6
        L_0x0143:
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            int r0 = r0.size()
            int r1 = r1.size()
            if (r4 != r7) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            int r1 = r1 + 1
        L_0x015a:
            int r0 = r0 - r1
            java.util.List r13 = c(r13)
            x0.y0 r1 = new x0.y0
            r1.<init>(r3, r13)
            if (r0 < 0) goto L_0x0168
            r13 = r3
            goto L_0x0169
        L_0x0168:
            r13 = r2
        L_0x0169:
            if (r13 == 0) goto L_0x01b5
            if (r0 != 0) goto L_0x016e
            goto L_0x017f
        L_0x016e:
            boolean r13 = r1 instanceof u4.c
            if (r13 == 0) goto L_0x0179
            u4.c r1 = (u4.c) r1
            u4.f r1 = r1.a(r0)
            goto L_0x017f
        L_0x0179:
            u4.b r13 = new u4.b
            r13.<init>(r1, r0)
            r1 = r13
        L_0x017f:
            java.lang.String r13 = "<this>"
            b1.o.m(r1, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = ""
            r13.append(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0192:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01a8
            java.lang.Object r4 = r1.next()
            int r2 = r2 + r3
            if (r2 <= r3) goto L_0x01a4
            java.lang.String r5 = "."
            r13.append(r5)
        L_0x01a4:
            com.bumptech.glide.c.b(r13, r4, r6)
            goto L_0x0192
        L_0x01a8:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            b1.o.l(r13, r0)
            return r13
        L_0x01b5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested element count "
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " is less than zero."
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L_0x01d2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        b1.v.l(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0056
            l5.l r1 = new l5.l
            java.util.logging.Logger r2 = l5.n.f4143a
            l5.d r2 = new l5.d
            l5.x r3 = new l5.x
            r3.<init>()
            r2.<init>((java.io.InputStream) r0, (l5.x) r3)
            r1.<init>(r2)
            l5.q r0 = new l5.q
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x004f }
            long r1 = (long) r1     // Catch:{ all -> 0x004f }
            r0.s(r1)     // Catch:{ all -> 0x004f }
            l5.g r3 = r0.f4149d     // Catch:{ all -> 0x004f }
            byte[] r1 = r3.n(r1)     // Catch:{ all -> 0x004f }
            int r2 = r0.readInt()     // Catch:{ all -> 0x004f }
            long r2 = (long) r2     // Catch:{ all -> 0x004f }
            r0.s(r2)     // Catch:{ all -> 0x004f }
            l5.g r4 = r0.f4149d     // Catch:{ all -> 0x004f }
            byte[] r2 = r4.n(r2)     // Catch:{ all -> 0x004f }
            r3 = 0
            b1.v.l(r0, r3)
            monitor-enter(r5)
            r5.f4352c = r1     // Catch:{ all -> 0x004c }
            r5.f4353d = r2     // Catch:{ all -> 0x004c }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f4351b
            r0.countDown()
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r2 = move-exception
            b1.v.l(r0, r1)
            throw r2
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }
}
