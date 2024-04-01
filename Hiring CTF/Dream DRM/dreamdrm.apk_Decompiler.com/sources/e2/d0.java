package e2;

import a2.f0;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import b2.d;
import h2.e0;
import h2.o;
import h2.z;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import k2.a;
import l2.e;
import l2.f;
import l2.g;
import l2.k;
import r2.b;
import s2.c;
import x3.q;
import y1.i;
import y1.l;

public final class d0 implements w, o, e0, l, a, f, e, k, c, s2.a, q {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2499d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0() {
        this(4);
        this.f2499d = 4;
    }

    public final void a() {
    }

    public final void b(g gVar) {
        gVar.j();
    }

    public final void c(Bitmap bitmap, d dVar) {
    }

    public final v d(b0 b0Var) {
        Class<m> cls = m.class;
        Class<InputStream> cls2 = InputStream.class;
        switch (this.f2499d) {
            case 0:
                return new e0(b0Var.a(Uri.class, cls2), 0);
            case 1:
                return new j0(b0Var.a(cls, cls2));
            default:
                return new e0(b0Var.a(cls, cls2), 1);
        }
    }

    public final boolean e(Object obj, File file, i iVar) {
        try {
            b.b(((x1.e) ((j2.c) ((f0) obj).get()).f3798d.f3797a.f3818a).f5692d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e6) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e6);
            }
            return false;
        }
    }

    public final f0 f(f0 f0Var, i iVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((x1.e) ((j2.c) f0Var.get()).f3798d.f3797a.f3818a).f5692d.asReadOnlyBuffer();
        AtomicReference atomicReference = b.f4919a;
        h1.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new h1.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f3356a == 0 && bVar.f3357b == ((byte[]) bVar.f3358c).length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new z(bArr);
    }

    public final void g(g gVar) {
    }

    public final Object j() {
        switch (this.f2499d) {
            case 22:
                return new TreeSet();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new ArrayDeque();
            case 25:
                return new ArrayList();
            case 26:
                return new ConcurrentSkipListMap();
            case 27:
                return new ConcurrentHashMap();
            case 28:
                return new TreeMap();
            default:
                return new LinkedHashMap();
        }
    }

    public final int k(i iVar) {
        return 1;
    }

    public final void m() {
    }

    public final Object t() {
        return new ArrayList();
    }

    public /* synthetic */ d0(int i3) {
        this.f2499d = i3;
    }
}
