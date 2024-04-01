package a2;

import b2.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import r2.h;
import y1.f;
import y1.i;
import y1.m;

public final class h0 implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final h f60j = new h(50);

    /* renamed from: b  reason: collision with root package name */
    public final b2.h f61b;

    /* renamed from: c  reason: collision with root package name */
    public final f f62c;

    /* renamed from: d  reason: collision with root package name */
    public final f f63d;

    /* renamed from: e  reason: collision with root package name */
    public final int f64e;

    /* renamed from: f  reason: collision with root package name */
    public final int f65f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f66g;

    /* renamed from: h  reason: collision with root package name */
    public final i f67h;

    /* renamed from: i  reason: collision with root package name */
    public final m f68i;

    public h0(b2.h hVar, f fVar, f fVar2, int i3, int i6, m mVar, Class cls, i iVar) {
        this.f61b = hVar;
        this.f62c = fVar;
        this.f63d = fVar2;
        this.f64e = i3;
        this.f65f = i6;
        this.f68i = mVar;
        this.f66g = cls;
        this.f67h = iVar;
    }

    public final void a(MessageDigest messageDigest) {
        Object e6;
        b2.h hVar = this.f61b;
        Class<byte[]> cls = byte[].class;
        synchronized (hVar) {
            g gVar = (g) hVar.f1554b.c();
            gVar.f1551b = 8;
            gVar.f1552c = cls;
            e6 = hVar.e(gVar, cls);
        }
        byte[] bArr = (byte[]) e6;
        ByteBuffer.wrap(bArr).putInt(this.f64e).putInt(this.f65f).array();
        this.f63d.a(messageDigest);
        this.f62c.a(messageDigest);
        messageDigest.update(bArr);
        m mVar = this.f68i;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.f67h.a(messageDigest);
        h hVar2 = f60j;
        Class cls2 = this.f66g;
        byte[] bArr2 = (byte[]) hVar2.a(cls2);
        if (bArr2 == null) {
            bArr2 = cls2.getName().getBytes(f.f5810a);
            hVar2.d(cls2, bArr2);
        }
        messageDigest.update(bArr2);
        this.f61b.g(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (a2.h0) r4;
        r0 = r4.f65f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof a2.h0
            r1 = 0
            if (r0 == 0) goto L_0x0046
            a2.h0 r4 = (a2.h0) r4
            int r0 = r4.f65f
            int r2 = r3.f65f
            if (r2 != r0) goto L_0x0046
            int r0 = r3.f64e
            int r2 = r4.f64e
            if (r0 != r2) goto L_0x0046
            y1.m r0 = r3.f68i
            y1.m r2 = r4.f68i
            boolean r0 = r2.l.a(r0, r2)
            if (r0 == 0) goto L_0x0046
            java.lang.Class r0 = r3.f66g
            java.lang.Class r2 = r4.f66g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            y1.f r0 = r3.f62c
            y1.f r2 = r4.f62c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            y1.f r0 = r3.f63d
            y1.f r2 = r4.f63d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            y1.i r0 = r3.f67h
            y1.i r4 = r4.f67h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0046
            r1 = 1
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.h0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((this.f63d.hashCode() + (this.f62c.hashCode() * 31)) * 31) + this.f64e) * 31) + this.f65f;
        m mVar = this.f68i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        int hashCode2 = this.f66g.hashCode();
        return this.f67h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f62c + ", signature=" + this.f63d + ", width=" + this.f64e + ", height=" + this.f65f + ", decodedResourceClass=" + this.f66g + ", transformation='" + this.f68i + "', options=" + this.f67h + '}';
    }
}
