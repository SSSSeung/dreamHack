package e2;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import r2.b;
import y1.a;

public final class h implements e {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2511d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2512e;

    public /* synthetic */ h(int i3, Object obj) {
        this.f2511d = i3;
        this.f2512e = obj;
    }

    public final Class a() {
        switch (this.f2511d) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f2512e.getClass();
        }
    }

    public final void b() {
    }

    public final a c() {
        return a.f5800d;
    }

    public final void cancel() {
    }

    public final void d(com.bumptech.glide.h hVar, d dVar) {
        int i3 = this.f2511d;
        Object obj = this.f2512e;
        switch (i3) {
            case 0:
                try {
                    dVar.l(b.a((File) obj));
                    return;
                } catch (IOException e6) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e6);
                    }
                    dVar.h(e6);
                    return;
                }
            default:
                dVar.l(obj);
                return;
        }
    }
}
