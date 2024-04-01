package a2;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.a0;
import com.bumptech.glide.load.data.e;
import e2.u;
import java.util.ArrayList;
import java.util.Collections;
import r2.f;
import y1.a;
import y1.c;

public final class k0 implements h, g {

    /* renamed from: d  reason: collision with root package name */
    public final i f93d;

    /* renamed from: e  reason: collision with root package name */
    public final g f94e;

    /* renamed from: f  reason: collision with root package name */
    public int f95f;

    /* renamed from: g  reason: collision with root package name */
    public e f96g;

    /* renamed from: h  reason: collision with root package name */
    public Object f97h;

    /* renamed from: i  reason: collision with root package name */
    public volatile u f98i;

    /* renamed from: j  reason: collision with root package name */
    public f f99j;

    public k0(i iVar, g gVar) {
        this.f93d = iVar;
        this.f94e = gVar;
    }

    /* JADX INFO: finally extract failed */
    public final boolean a() {
        Object obj = this.f97h;
        if (obj != null) {
            this.f97h = null;
            int i3 = f.f4927b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                c d6 = this.f93d.d(obj);
                k kVar = new k(d6, obj, this.f93d.f77i);
                y1.f fVar = this.f98i.f2544a;
                i iVar = this.f93d;
                this.f99j = new f(fVar, iVar.f82n);
                iVar.f76h.a().f(this.f99j, kVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f99j + ", data: " + obj + ", encoder: " + d6 + ", duration: " + f.a(elapsedRealtimeNanos));
                }
                this.f98i.f2546c.b();
                this.f96g = new e(Collections.singletonList(this.f98i.f2544a), this.f93d, this);
            } catch (Throwable th) {
                this.f98i.f2546c.b();
                throw th;
            }
        }
        e eVar = this.f96g;
        if (eVar != null && eVar.a()) {
            return true;
        }
        this.f96g = null;
        this.f98i = null;
        boolean z5 = false;
        while (!z5) {
            if (!(this.f95f < this.f93d.b().size())) {
                break;
            }
            ArrayList b6 = this.f93d.b();
            int i6 = this.f95f;
            this.f95f = i6 + 1;
            this.f98i = (u) b6.get(i6);
            if (this.f98i != null) {
                if (!this.f93d.f84p.a(this.f98i.f2546c.c())) {
                    if (!(this.f93d.c(this.f98i.f2546c.a()) != null)) {
                    }
                }
                this.f98i.f2546c.d(this.f93d.f83o, new a0((Object) this, (Object) this.f98i, 12));
                z5 = true;
            }
        }
        return z5;
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    public final void c(y1.f fVar, Exception exc, e eVar, a aVar) {
        this.f94e.c(fVar, exc, eVar, this.f98i.f2546c.c());
    }

    public final void cancel() {
        u uVar = this.f98i;
        if (uVar != null) {
            uVar.f2546c.cancel();
        }
    }

    public final void d(y1.f fVar, Object obj, e eVar, a aVar, y1.f fVar2) {
        this.f94e.d(fVar, obj, eVar, this.f98i.f2546c.c(), fVar);
    }
}
