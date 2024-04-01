package z4;

import a5.a;
import a5.c;
import androidx.compose.ui.platform.e;
import e2.f;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class w implements Cloneable {
    public static final List C = c.j(x.f6108h, x.f6106f);
    public static final List D = c.j(j.f6029e, j.f6030f);
    public final int A;
    public final f B;

    /* renamed from: d  reason: collision with root package name */
    public final m f6083d;

    /* renamed from: e  reason: collision with root package name */
    public final f f6084e;

    /* renamed from: f  reason: collision with root package name */
    public final List f6085f;

    /* renamed from: g  reason: collision with root package name */
    public final List f6086g;

    /* renamed from: h  reason: collision with root package name */
    public final a f6087h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6088i = true;

    /* renamed from: j  reason: collision with root package name */
    public final e f6089j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6090k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6091l;

    /* renamed from: m  reason: collision with root package name */
    public final e f6092m;

    /* renamed from: n  reason: collision with root package name */
    public final n f6093n;

    /* renamed from: o  reason: collision with root package name */
    public final ProxySelector f6094o;

    /* renamed from: p  reason: collision with root package name */
    public final e f6095p;

    /* renamed from: q  reason: collision with root package name */
    public final SocketFactory f6096q;

    /* renamed from: r  reason: collision with root package name */
    public final SSLSocketFactory f6097r;

    /* renamed from: s  reason: collision with root package name */
    public final X509TrustManager f6098s;

    /* renamed from: t  reason: collision with root package name */
    public final List f6099t;

    /* renamed from: u  reason: collision with root package name */
    public final List f6100u;

    /* renamed from: v  reason: collision with root package name */
    public final k5.c f6101v;
    public final g w;

    /* renamed from: x  reason: collision with root package name */
    public final com.bumptech.glide.e f6102x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6103y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6104z;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w() {
        /*
            r13 = this;
            z4.m r0 = new z4.m
            r0.<init>()
            e2.f r1 = new e2.f
            r2 = 18
            r1.<init>((int) r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = a5.c.f212a
            a5.a r4 = new a5.a
            r4.<init>()
            androidx.compose.ui.platform.e r5 = z4.b.f5969b
            androidx.compose.ui.platform.e r6 = z4.l.f6048c
            z4.n r7 = z4.o.f6054a
            javax.net.SocketFactory r8 = javax.net.SocketFactory.getDefault()
            java.lang.String r9 = "SocketFactory.getDefault()"
            b1.o.l(r8, r9)
            java.util.List r9 = D
            java.util.List r10 = C
            k5.c r11 = k5.c.f3976a
            z4.g r12 = z4.g.f6002c
            r13.<init>()
            r13.f6083d = r0
            r13.f6084e = r1
            java.util.List r0 = a5.c.u(r2)
            r13.f6085f = r0
            java.util.List r0 = a5.c.u(r3)
            r13.f6086g = r0
            r13.f6087h = r4
            r0 = 1
            r13.f6088i = r0
            r13.f6089j = r5
            r13.f6090k = r0
            r13.f6091l = r0
            r13.f6092m = r6
            r13.f6093n = r7
            java.net.ProxySelector r1 = java.net.ProxySelector.getDefault()
            if (r1 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            j5.a r1 = j5.a.f3853a
        L_0x005f:
            r13.f6094o = r1
            r13.f6095p = r5
            r13.f6096q = r8
            r13.f6099t = r9
            r13.f6100u = r10
            r13.f6101v = r11
            r1 = 10000(0x2710, float:1.4013E-41)
            r13.f6103y = r1
            r13.f6104z = r1
            r13.A = r1
            e2.f r1 = new e2.f
            r2 = 19
            r1.<init>((int) r2)
            r13.B = r1
            boolean r1 = r9 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x0088
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x0088
            goto L_0x009e
        L_0x0088:
            java.util.Iterator r1 = r9.iterator()
        L_0x008c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r1.next()
            z4.j r3 = (z4.j) r3
            boolean r3 = r3.f6031a
            if (r3 == 0) goto L_0x008c
            r1 = r2
            goto L_0x009f
        L_0x009e:
            r1 = r0
        L_0x009f:
            r3 = 0
            if (r1 == 0) goto L_0x00ab
            r13.f6097r = r3
            r13.f6102x = r3
            r13.f6098s = r3
            z4.g r1 = z4.g.f6002c
            goto L_0x00dd
        L_0x00ab:
            h5.n r1 = h5.n.f3500a
            h5.n r1 = h5.n.f3500a
            javax.net.ssl.X509TrustManager r1 = r1.m()
            r13.f6098s = r1
            h5.n r4 = h5.n.f3500a
            b1.o.k(r1)
            javax.net.ssl.SSLSocketFactory r4 = r4.l(r1)
            r13.f6097r = r4
            h5.n r4 = h5.n.f3500a
            com.bumptech.glide.e r1 = r4.b(r1)
            r13.f6102x = r1
            b1.o.k(r1)
            com.bumptech.glide.e r4 = r12.f6004b
            boolean r4 = b1.o.c(r4, r1)
            if (r4 == 0) goto L_0x00d4
            goto L_0x00dc
        L_0x00d4:
            z4.g r4 = new z4.g
            java.util.Set r5 = r12.f6003a
            r4.<init>(r5, r1)
            r12 = r4
        L_0x00dc:
            r1 = r12
        L_0x00dd:
            r13.w = r1
            java.util.List r1 = r13.f6085f
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r1 == 0) goto L_0x01cd
            boolean r5 = r1.contains(r3)
            r5 = r5 ^ r0
            if (r5 == 0) goto L_0x01b5
            java.util.List r1 = r13.f6086g
            if (r1 == 0) goto L_0x01af
            boolean r3 = r1.contains(r3)
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0197
            java.util.List r1 = r13.f6099t
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0104
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0104
            goto L_0x011a
        L_0x0104:
            java.util.Iterator r1 = r1.iterator()
        L_0x0108:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x011a
            java.lang.Object r3 = r1.next()
            z4.j r3 = (z4.j) r3
            boolean r3 = r3.f6031a
            if (r3 == 0) goto L_0x0108
            r1 = r2
            goto L_0x011b
        L_0x011a:
            r1 = r0
        L_0x011b:
            javax.net.ssl.X509TrustManager r3 = r13.f6098s
            com.bumptech.glide.e r4 = r13.f6102x
            javax.net.ssl.SSLSocketFactory r5 = r13.f6097r
            if (r1 == 0) goto L_0x016c
            if (r5 != 0) goto L_0x0127
            r1 = r0
            goto L_0x0128
        L_0x0127:
            r1 = r2
        L_0x0128:
            java.lang.String r5 = "Check failed."
            if (r1 == 0) goto L_0x0162
            if (r4 != 0) goto L_0x0130
            r1 = r0
            goto L_0x0131
        L_0x0130:
            r1 = r2
        L_0x0131:
            if (r1 == 0) goto L_0x0158
            if (r3 != 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r0 = r2
        L_0x0137:
            if (r0 == 0) goto L_0x014e
            z4.g r0 = r13.w
            z4.g r1 = z4.g.f6002c
            boolean r0 = b1.o.c(r0, r1)
            if (r0 == 0) goto L_0x0144
            goto L_0x0172
        L_0x0144:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x0158:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x0162:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x016c:
            if (r5 == 0) goto L_0x018b
            if (r4 == 0) goto L_0x017f
            if (r3 == 0) goto L_0x0173
        L_0x0172:
            return
        L_0x0173:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "x509TrustManager == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "certificateChainCleaner == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sslSocketFactory == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0197:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Null network interceptor: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01af:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x01b5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Null interceptor: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01cd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.w.<init>():void");
    }

    public final Object clone() {
        return super.clone();
    }
}
