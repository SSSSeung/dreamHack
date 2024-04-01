package androidx.emoji2.text;

import g.h;
import g1.a;
import g1.b;
import java.nio.ByteBuffer;

public final class q {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f1028d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f1029a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1030b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1031c = 0;

    public q(h hVar, int i3) {
        this.f1030b = hVar;
        this.f1029a = i3;
    }

    public final int a(int i3) {
        a c6 = c();
        int a6 = c6.a(16);
        if (a6 == 0) {
            return 0;
        }
        Object obj = c6.f2843d;
        int i6 = a6 + c6.f2840a;
        return ((ByteBuffer) obj).getInt((i3 * 4) + ((ByteBuffer) obj).getInt(i6) + i6 + 4);
    }

    public final int b() {
        a c6 = c();
        int a6 = c6.a(16);
        if (a6 == 0) {
            return 0;
        }
        int i3 = a6 + c6.f2840a;
        return ((ByteBuffer) c6.f2843d).getInt(((ByteBuffer) c6.f2843d).getInt(i3) + i3);
    }

    public final a c() {
        ThreadLocal threadLocal = f1028d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = (b) this.f1030b.f2725a;
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i3 = a6 + bVar.f2840a;
            int i6 = (this.f1029a * 4) + ((ByteBuffer) bVar.f2843d).getInt(i3) + i3 + 4;
            aVar.b(((ByteBuffer) bVar.f2843d).getInt(i6) + i6, (ByteBuffer) bVar.f2843d);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a c6 = c();
        int a6 = c6.a(4);
        sb.append(Integer.toHexString(a6 != 0 ? ((ByteBuffer) c6.f2843d).getInt(a6 + c6.f2840a) : 0));
        sb.append(", codepoints:");
        int b6 = b();
        for (int i3 = 0; i3 < b6; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
