package a2;

import com.bumptech.glide.load.data.d;
import e2.u;
import e2.v;
import java.io.File;
import java.util.List;
import y1.a;
import y1.f;

public final class e implements h, d {

    /* renamed from: d  reason: collision with root package name */
    public final List f34d;

    /* renamed from: e  reason: collision with root package name */
    public final i f35e;

    /* renamed from: f  reason: collision with root package name */
    public final g f36f;

    /* renamed from: g  reason: collision with root package name */
    public int f37g = -1;

    /* renamed from: h  reason: collision with root package name */
    public f f38h;

    /* renamed from: i  reason: collision with root package name */
    public List f39i;

    /* renamed from: j  reason: collision with root package name */
    public int f40j;

    /* renamed from: k  reason: collision with root package name */
    public volatile u f41k;

    /* renamed from: l  reason: collision with root package name */
    public File f42l;

    public e(List list, i iVar, g gVar) {
        this.f34d = list;
        this.f35e = iVar;
        this.f36f = gVar;
    }

    public final boolean a() {
        while (true) {
            List list = this.f39i;
            if (list != null) {
                if (this.f40j < list.size()) {
                    this.f41k = null;
                    boolean z5 = false;
                    while (!z5) {
                        if (!(this.f40j < this.f39i.size())) {
                            break;
                        }
                        List list2 = this.f39i;
                        int i3 = this.f40j;
                        this.f40j = i3 + 1;
                        File file = this.f42l;
                        i iVar = this.f35e;
                        this.f41k = ((v) list2.get(i3)).b(file, iVar.f73e, iVar.f74f, iVar.f77i);
                        if (this.f41k != null) {
                            if (this.f35e.c(this.f41k.f2546c.a()) != null) {
                                this.f41k.f2546c.d(this.f35e.f83o, this);
                                z5 = true;
                            }
                        }
                    }
                    return z5;
                }
            }
            int i6 = this.f37g + 1;
            this.f37g = i6;
            if (i6 >= this.f34d.size()) {
                return false;
            }
            f fVar = (f) this.f34d.get(this.f37g);
            i iVar2 = this.f35e;
            File a6 = iVar2.f76h.a().a(new f(fVar, iVar2.f82n));
            this.f42l = a6;
            if (a6 != null) {
                this.f38h = fVar;
                this.f39i = this.f35e.f71c.f1726b.e(a6);
                this.f40j = 0;
            }
        }
    }

    public final void cancel() {
        u uVar = this.f41k;
        if (uVar != null) {
            uVar.f2546c.cancel();
        }
    }

    public final void h(Exception exc) {
        this.f36f.c(this.f38h, exc, this.f41k.f2546c, a.f5802f);
    }

    public final void l(Object obj) {
        this.f36f.d(this.f38h, obj, this.f41k.f2546c, a.f5802f, this.f38h);
    }
}
