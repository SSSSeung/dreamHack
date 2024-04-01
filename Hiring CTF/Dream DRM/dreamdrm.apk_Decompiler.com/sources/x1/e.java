package x1;

import android.graphics.Bitmap;
import androidx.appcompat.widget.a0;
import b2.d;
import b2.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f5689a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5690b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a0 f5691c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f5692d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5693e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f5694f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5695g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5696h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f5697i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f5698j;

    /* renamed from: k  reason: collision with root package name */
    public int f5699k;

    /* renamed from: l  reason: collision with root package name */
    public c f5700l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f5701m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5702n;

    /* renamed from: o  reason: collision with root package name */
    public int f5703o;

    /* renamed from: p  reason: collision with root package name */
    public int f5704p;

    /* renamed from: q  reason: collision with root package name */
    public int f5705q;

    /* renamed from: r  reason: collision with root package name */
    public int f5706r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f5707s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f5708t = Bitmap.Config.ARGB_8888;

    public e(a0 a0Var, c cVar, ByteBuffer byteBuffer, int i3) {
        this.f5691c = a0Var;
        this.f5700l = new c();
        synchronized (this) {
            if (i3 > 0) {
                int highestOneBit = Integer.highestOneBit(i3);
                this.f5703o = 0;
                this.f5700l = cVar;
                this.f5699k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f5692d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f5692d.order(ByteOrder.LITTLE_ENDIAN);
                this.f5702n = false;
                Iterator it = cVar.f5678e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).f5669g == 3) {
                            this.f5702n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f5704p = highestOneBit;
                int i6 = cVar.f5679f;
                this.f5706r = i6 / highestOneBit;
                int i7 = cVar.f5680g;
                this.f5705q = i7 / highestOneBit;
                this.f5697i = this.f5691c.u(i6 * i7);
                a0 a0Var2 = this.f5691c;
                int i8 = this.f5706r * this.f5705q;
                Object obj = a0Var2.f504f;
                this.f5698j = ((h) obj) == null ? new int[i8] : (int[]) ((h) obj).c(i8, int[].class);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i3);
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f5707s;
        Bitmap h6 = ((d) this.f5691c.f503e).h(this.f5706r, this.f5705q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f5708t);
        h6.setHasAlpha(true);
        return h6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap b() {
        /*
            r9 = this;
            java.lang.String r0 = "No valid color table found for frame #"
            java.lang.String r1 = "Unable to decode frame, status="
            java.lang.String r2 = "Unable to decode frame, frameCount="
            monitor-enter(r9)
            x1.c r3 = r9.f5700l     // Catch:{ all -> 0x00e1 }
            int r3 = r3.f5676c     // Catch:{ all -> 0x00e1 }
            r4 = 3
            r5 = 1
            if (r3 <= 0) goto L_0x0013
            int r3 = r9.f5699k     // Catch:{ all -> 0x00e1 }
            if (r3 >= 0) goto L_0x003c
        L_0x0013:
            java.lang.String r3 = "e"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x00e1 }
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = "e"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r6.<init>(r2)     // Catch:{ all -> 0x00e1 }
            x1.c r2 = r9.f5700l     // Catch:{ all -> 0x00e1 }
            int r2 = r2.f5676c     // Catch:{ all -> 0x00e1 }
            r6.append(r2)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = ", framePointer="
            r6.append(r2)     // Catch:{ all -> 0x00e1 }
            int r2 = r9.f5699k     // Catch:{ all -> 0x00e1 }
            r6.append(r2)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x00e1 }
            android.util.Log.d(r3, r2)     // Catch:{ all -> 0x00e1 }
        L_0x003a:
            r9.f5703o = r5     // Catch:{ all -> 0x00e1 }
        L_0x003c:
            int r2 = r9.f5703o     // Catch:{ all -> 0x00e1 }
            r3 = 0
            if (r2 == r5) goto L_0x00c4
            r6 = 2
            if (r2 != r6) goto L_0x0046
            goto L_0x00c4
        L_0x0046:
            r1 = 0
            r9.f5703o = r1     // Catch:{ all -> 0x00e1 }
            byte[] r2 = r9.f5693e     // Catch:{ all -> 0x00e1 }
            if (r2 != 0) goto L_0x0057
            androidx.appcompat.widget.a0 r2 = r9.f5691c     // Catch:{ all -> 0x00e1 }
            r7 = 255(0xff, float:3.57E-43)
            byte[] r2 = r2.u(r7)     // Catch:{ all -> 0x00e1 }
            r9.f5693e = r2     // Catch:{ all -> 0x00e1 }
        L_0x0057:
            x1.c r2 = r9.f5700l     // Catch:{ all -> 0x00e1 }
            java.util.ArrayList r2 = r2.f5678e     // Catch:{ all -> 0x00e1 }
            int r7 = r9.f5699k     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x00e1 }
            x1.b r2 = (x1.b) r2     // Catch:{ all -> 0x00e1 }
            int r7 = r9.f5699k     // Catch:{ all -> 0x00e1 }
            int r7 = r7 - r5
            if (r7 < 0) goto L_0x0073
            x1.c r8 = r9.f5700l     // Catch:{ all -> 0x00e1 }
            java.util.ArrayList r8 = r8.f5678e     // Catch:{ all -> 0x00e1 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00e1 }
            x1.b r7 = (x1.b) r7     // Catch:{ all -> 0x00e1 }
            goto L_0x0074
        L_0x0073:
            r7 = r3
        L_0x0074:
            int[] r8 = r2.f5673k     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            x1.c r8 = r9.f5700l     // Catch:{ all -> 0x00e1 }
            int[] r8 = r8.f5674a     // Catch:{ all -> 0x00e1 }
        L_0x007d:
            r9.f5689a = r8     // Catch:{ all -> 0x00e1 }
            if (r8 != 0) goto L_0x00a0
            java.lang.String r1 = "e"
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = "e"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r2.<init>(r0)     // Catch:{ all -> 0x00e1 }
            int r0 = r9.f5699k     // Catch:{ all -> 0x00e1 }
            r2.append(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00e1 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x00e1 }
        L_0x009c:
            r9.f5703o = r5     // Catch:{ all -> 0x00e1 }
            monitor-exit(r9)
            return r3
        L_0x00a0:
            boolean r0 = r2.f5668f     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00be
            int[] r0 = r9.f5690b     // Catch:{ all -> 0x00e1 }
            int r3 = r8.length     // Catch:{ all -> 0x00e1 }
            java.lang.System.arraycopy(r8, r1, r0, r1, r3)     // Catch:{ all -> 0x00e1 }
            int[] r0 = r9.f5690b     // Catch:{ all -> 0x00e1 }
            r9.f5689a = r0     // Catch:{ all -> 0x00e1 }
            int r3 = r2.f5670h     // Catch:{ all -> 0x00e1 }
            r0[r3] = r1     // Catch:{ all -> 0x00e1 }
            int r0 = r2.f5669g     // Catch:{ all -> 0x00e1 }
            if (r0 != r6) goto L_0x00be
            int r0 = r9.f5699k     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e1 }
            r9.f5707s = r0     // Catch:{ all -> 0x00e1 }
        L_0x00be:
            android.graphics.Bitmap r0 = r9.d(r2, r7)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r9)
            return r0
        L_0x00c4:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "e"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r2.<init>(r1)     // Catch:{ all -> 0x00e1 }
            int r1 = r9.f5703o     // Catch:{ all -> 0x00e1 }
            r2.append(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00e1 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r9)
            return r3
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.b():android.graphics.Bitmap");
    }

    public final void c(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f5708t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f5683j == r1.f5670h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap d(x1.b r36, x1.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f5698j
            androidx.appcompat.widget.a0 r11 = r0.f5691c
            r12 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f5701m
            if (r3 == 0) goto L_0x0018
            java.lang.Object r4 = r11.f503e
            b2.d r4 = (b2.d) r4
            r4.b(r3)
        L_0x0018:
            r3 = 0
            r0.f5701m = r3
            java.util.Arrays.fill(r10, r12)
        L_0x001e:
            r13 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f5669g
            if (r3 != r13) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f5701m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r12)
        L_0x002c:
            r14 = 2
            if (r2 == 0) goto L_0x007e
            int r3 = r2.f5669g
            if (r3 <= 0) goto L_0x007e
            if (r3 != r14) goto L_0x006c
            boolean r3 = r1.f5668f
            if (r3 != 0) goto L_0x0047
            x1.c r3 = r0.f5700l
            int r4 = r3.f5684k
            int[] r5 = r1.f5673k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f5683j
            int r5 = r1.f5670h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r12
        L_0x0048:
            int r3 = r2.f5666d
            int r5 = r0.f5704p
            int r3 = r3 / r5
            int r6 = r2.f5664b
            int r6 = r6 / r5
            int r7 = r2.f5665c
            int r7 = r7 / r5
            int r2 = r2.f5663a
            int r2 = r2 / r5
            int r5 = r0.f5706r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.f5706r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r3 != r13) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f5701m
            if (r2 == 0) goto L_0x007e
            r4 = 0
            int r8 = r0.f5706r
            r6 = 0
            r7 = 0
            int r9 = r0.f5705q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.f5692d
            int r3 = r1.f5672j
            r2.position(r3)
            int r2 = r1.f5665c
            int r3 = r1.f5666d
            int r2 = r2 * r3
            byte[] r3 = r0.f5697i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x0097
        L_0x0091:
            byte[] r3 = r11.u(r2)
            r0.f5697i = r3
        L_0x0097:
            byte[] r3 = r0.f5697i
            short[] r4 = r0.f5694f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00a3
            short[] r4 = new short[r5]
            r0.f5694f = r4
        L_0x00a3:
            short[] r4 = r0.f5694f
            byte[] r6 = r0.f5695g
            if (r6 != 0) goto L_0x00ad
            byte[] r6 = new byte[r5]
            r0.f5695g = r6
        L_0x00ad:
            byte[] r6 = r0.f5695g
            byte[] r7 = r0.f5696h
            if (r7 != 0) goto L_0x00b9
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f5696h = r7
        L_0x00b9:
            byte[] r7 = r0.f5696h
            java.nio.ByteBuffer r8 = r0.f5692d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r11 = r9 << r8
            int r15 = r11 + 1
            int r16 = r11 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r14 = -1
            int r17 = r17 + -1
            r5 = r12
        L_0x00d1:
            if (r5 >= r11) goto L_0x00dc
            r4[r5] = r12
            byte r14 = (byte) r5
            r6[r5] = r14
            int r5 = r5 + 1
            r14 = -1
            goto L_0x00d1
        L_0x00dc:
            byte[] r5 = r0.f5693e
            r13 = r0
            r26 = r8
            r9 = r12
            r20 = r9
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r27 = r24
            r29 = r27
            r25 = r16
            r28 = r17
            r14 = -1
        L_0x00f5:
            r30 = 8
            if (r9 >= r2) goto L_0x01f0
            if (r21 != 0) goto L_0x0133
            java.nio.ByteBuffer r12 = r0.f5692d
            byte r12 = r12.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            r31 = r8
            if (r12 > 0) goto L_0x010e
            r32 = r9
            r34 = r10
            r33 = r14
            goto L_0x0124
        L_0x010e:
            java.nio.ByteBuffer r8 = r13.f5692d
            r32 = r9
            byte[] r9 = r13.f5693e
            r33 = r14
            int r14 = r8.remaining()
            int r14 = java.lang.Math.min(r12, r14)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r14)
        L_0x0124:
            if (r12 > 0) goto L_0x012e
            r8 = 3
            r13.f5703o = r8
            r12 = r20
            r10 = 0
            goto L_0x01f5
        L_0x012e:
            r21 = r12
            r22 = 0
            goto L_0x013b
        L_0x0133:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r14
        L_0x013b:
            byte r8 = r5[r22]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r23
            int r24 = r24 + r8
            int r23 = r23 + 8
            r8 = 1
            int r22 = r22 + 1
            r8 = -1
            int r21 = r21 + -1
            r10 = r23
            r12 = r25
            r8 = r26
            r9 = r32
            r14 = r33
            r23 = r5
            r5 = r27
        L_0x0159:
            if (r10 < r8) goto L_0x01dc
            r25 = r13
            r13 = r24 & r28
            int r24 = r24 >> r8
            int r10 = r10 - r8
            if (r13 != r11) goto L_0x0175
            r26 = r10
            r12 = r16
            r28 = r17
            r13 = r25
            r8 = r31
            r14 = -1
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01d6
        L_0x0175:
            if (r13 != r15) goto L_0x017f
            r27 = r5
            r13 = r25
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e1
        L_0x017f:
            r26 = r10
            r10 = -1
            if (r14 != r10) goto L_0x0192
            byte r5 = r6[r13]
            r3[r20] = r5
            int r20 = r20 + 1
            int r9 = r9 + 1
            r5 = r13
            r14 = r5
            r10 = r26
            r13 = r0
            goto L_0x0159
        L_0x0192:
            if (r13 < r12) goto L_0x019b
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r14
            goto L_0x019c
        L_0x019b:
            r5 = r13
        L_0x019c:
            if (r5 < r11) goto L_0x01a7
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x019c
        L_0x01a7:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r20] = r10
        L_0x01ae:
            r19 = 1
            int r20 = r20 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01bd
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r20] = r25
            goto L_0x01ae
        L_0x01bd:
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r12 >= r5) goto L_0x01d4
            short r14 = (short) r14
            r4[r12] = r14
            r6[r12] = r10
            int r12 = r12 + 1
            r10 = r12 & r28
            if (r10 != 0) goto L_0x01d4
            if (r12 >= r5) goto L_0x01d4
            int r8 = r8 + 1
            int r28 = r28 + r12
        L_0x01d4:
            r14 = r13
            r13 = r0
        L_0x01d6:
            r5 = r25
            r10 = r26
            goto L_0x0159
        L_0x01dc:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r13 = r0
        L_0x01e1:
            r26 = r8
            r25 = r12
            r5 = r23
            r8 = r31
            r12 = 0
            r23 = r10
            r10 = r34
            goto L_0x00f5
        L_0x01f0:
            r34 = r10
            r10 = r12
            r12 = r20
        L_0x01f5:
            java.util.Arrays.fill(r3, r12, r2, r10)
            boolean r2 = r1.f5667e
            if (r2 != 0) goto L_0x026d
            int r2 = r0.f5704p
            r3 = 1
            if (r2 == r3) goto L_0x0203
            goto L_0x026d
        L_0x0203:
            int[] r2 = r0.f5698j
            int r3 = r1.f5666d
            int r4 = r1.f5664b
            int r5 = r1.f5665c
            int r6 = r1.f5663a
            int r7 = r0.f5699k
            if (r7 != 0) goto L_0x0213
            r7 = 1
            goto L_0x0214
        L_0x0213:
            r7 = r10
        L_0x0214:
            int r8 = r0.f5706r
            byte[] r9 = r0.f5697i
            int[] r11 = r0.f5689a
            r13 = r10
            r12 = -1
        L_0x021c:
            if (r13 >= r3) goto L_0x024f
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0229
            r10 = r14
        L_0x0229:
            int r14 = r1.f5665c
            int r14 = r14 * r13
        L_0x022c:
            r16 = r3
            if (r15 >= r10) goto L_0x0249
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x0240
            r4 = r11[r4]
            if (r4 == 0) goto L_0x023f
            r2[r15] = r4
            goto L_0x0240
        L_0x023f:
            r12 = r3
        L_0x0240:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x022c
        L_0x0249:
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x021c
        L_0x024f:
            java.lang.Boolean r2 = r0.f5707s
            if (r2 == 0) goto L_0x0259
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0262
        L_0x0259:
            java.lang.Boolean r2 = r0.f5707s
            if (r2 != 0) goto L_0x0264
            if (r7 == 0) goto L_0x0264
            r2 = -1
            if (r12 == r2) goto L_0x0264
        L_0x0262:
            r12 = 1
            goto L_0x0265
        L_0x0264:
            r12 = 0
        L_0x0265:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f5707s = r2
            goto L_0x03f6
        L_0x026d:
            int[] r2 = r0.f5698j
            int r3 = r1.f5666d
            int r4 = r0.f5704p
            int r3 = r3 / r4
            int r5 = r1.f5664b
            int r5 = r5 / r4
            int r6 = r1.f5665c
            int r6 = r6 / r4
            int r7 = r1.f5663a
            int r7 = r7 / r4
            int r8 = r0.f5699k
            if (r8 != 0) goto L_0x0283
            r10 = 1
            goto L_0x0284
        L_0x0283:
            r10 = 0
        L_0x0284:
            int r8 = r0.f5706r
            int r9 = r0.f5705q
            byte[] r11 = r0.f5697i
            int[] r12 = r0.f5689a
            java.lang.Boolean r13 = r0.f5707s
            r14 = r13
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x0295:
            r37 = r14
            if (r13 >= r3) goto L_0x03e4
            boolean r14 = r1.f5667e
            if (r14 == 0) goto L_0x02c4
            if (r15 < r3) goto L_0x02bf
            int r14 = r16 + 1
            r18 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02ba
            r3 = 3
            if (r14 == r3) goto L_0x02b3
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02af
            goto L_0x02c1
        L_0x02af:
            r15 = 1
            r17 = 2
            goto L_0x02c1
        L_0x02b3:
            r3 = 4
            r17 = r3
            r16 = r14
            r15 = 2
            goto L_0x02c1
        L_0x02ba:
            r3 = 4
            r15 = r3
            r16 = r14
            goto L_0x02c1
        L_0x02bf:
            r18 = r3
        L_0x02c1:
            int r3 = r15 + r17
            goto L_0x02c8
        L_0x02c4:
            r18 = r3
            r3 = r15
            r15 = r13
        L_0x02c8:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02ce
            r14 = 1
            goto L_0x02cf
        L_0x02ce:
            r14 = 0
        L_0x02cf:
            if (r15 >= r9) goto L_0x03c4
            int r15 = r15 * r8
            int r20 = r15 + r7
            r21 = r3
            int r3 = r20 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02dc
            r3 = r15
        L_0x02dc:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f5665c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0305
            r14 = r37
            r5 = r20
        L_0x02e9:
            r23 = r6
            if (r5 >= r3) goto L_0x03bd
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x02f8
            r2[r5] = r6
            goto L_0x02ff
        L_0x02f8:
            if (r10 == 0) goto L_0x02ff
            if (r14 != 0) goto L_0x02ff
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x02ff:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02e9
        L_0x0305:
            r23 = r6
            int r5 = r3 - r20
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r20
        L_0x030f:
            if (r6 >= r3) goto L_0x03bd
            r20 = r3
            int r3 = r1.f5665c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0324:
            int r8 = r0.f5704p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0359
            byte[] r8 = r0.f5697i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x035b
            if (r7 >= r5) goto L_0x035b
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f5689a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0354
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0354:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0324
        L_0x0359:
            r32 = r9
        L_0x035b:
            int r3 = r3 + r15
            r7 = r3
        L_0x035d:
            int r8 = r0.f5704p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x038e
            byte[] r8 = r0.f5697i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x038e
            if (r7 >= r5) goto L_0x038e
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f5689a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x038b
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x038b:
            int r7 = r7 + 1
            goto L_0x035d
        L_0x038e:
            if (r28 != 0) goto L_0x0392
            r3 = 0
            goto L_0x03a4
        L_0x0392:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03a4:
            if (r3 == 0) goto L_0x03a9
            r2[r6] = r3
            goto L_0x03b0
        L_0x03a9:
            if (r10 == 0) goto L_0x03b0
            if (r14 != 0) goto L_0x03b0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03b0:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r20
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x030f
        L_0x03bd:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03d2
        L_0x03c4:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03d2:
            int r13 = r13 + 1
            r3 = r18
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x0295
        L_0x03e4:
            java.lang.Boolean r2 = r0.f5707s
            if (r2 != 0) goto L_0x03f6
            if (r37 != 0) goto L_0x03ec
            r12 = 0
            goto L_0x03f0
        L_0x03ec:
            boolean r12 = r37.booleanValue()
        L_0x03f0:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f5707s = r2
        L_0x03f6:
            boolean r2 = r0.f5702n
            if (r2 == 0) goto L_0x041a
            int r1 = r1.f5669g
            if (r1 == 0) goto L_0x0401
            r2 = 1
            if (r1 != r2) goto L_0x041a
        L_0x0401:
            android.graphics.Bitmap r1 = r0.f5701m
            if (r1 != 0) goto L_0x040b
            android.graphics.Bitmap r1 = r35.a()
            r0.f5701m = r1
        L_0x040b:
            android.graphics.Bitmap r1 = r0.f5701m
            r3 = 0
            int r7 = r0.f5706r
            r5 = 0
            r6 = 0
            int r8 = r0.f5705q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x041a:
            android.graphics.Bitmap r9 = r35.a()
            r3 = 0
            int r7 = r0.f5706r
            r5 = 0
            r6 = 0
            int r8 = r0.f5705q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.d(x1.b, x1.b):android.graphics.Bitmap");
    }
}
