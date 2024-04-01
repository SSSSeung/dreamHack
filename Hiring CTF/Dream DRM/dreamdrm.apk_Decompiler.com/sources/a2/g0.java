package a2;

import androidx.appcompat.widget.a0;
import com.bumptech.glide.k;
import com.bumptech.glide.load.data.d;
import e2.b0;
import e2.u;
import e2.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k.b;
import r2.j;
import y1.a;
import y1.f;
import y1.m;

public final class g0 implements h, d {

    /* renamed from: d  reason: collision with root package name */
    public final g f50d;

    /* renamed from: e  reason: collision with root package name */
    public final i f51e;

    /* renamed from: f  reason: collision with root package name */
    public int f52f;

    /* renamed from: g  reason: collision with root package name */
    public int f53g = -1;

    /* renamed from: h  reason: collision with root package name */
    public f f54h;

    /* renamed from: i  reason: collision with root package name */
    public List f55i;

    /* renamed from: j  reason: collision with root package name */
    public int f56j;

    /* renamed from: k  reason: collision with root package name */
    public volatile u f57k;

    /* renamed from: l  reason: collision with root package name */
    public File f58l;

    /* renamed from: m  reason: collision with root package name */
    public h0 f59m;

    public g0(i iVar, g gVar) {
        this.f51e = iVar;
        this.f50d = gVar;
    }

    public final boolean a() {
        List list;
        ArrayList c6;
        ArrayList a6 = this.f51e.a();
        if (a6.isEmpty()) {
            return false;
        }
        i iVar = this.f51e;
        k kVar = iVar.f71c.f1726b;
        Class<?> cls = iVar.f72d.getClass();
        Class cls2 = iVar.f75g;
        Class cls3 = iVar.f79k;
        a0 a0Var = kVar.f1747h;
        j jVar = (j) ((AtomicReference) a0Var.f503e).getAndSet((Object) null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.f4934a = cls;
            jVar.f4935b = cls2;
            jVar.f4936c = cls3;
        }
        synchronized (((b) a0Var.f504f)) {
            list = (List) ((b) a0Var.f504f).getOrDefault(jVar, (Object) null);
        }
        ((AtomicReference) a0Var.f503e).set(jVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            a0 a0Var2 = kVar.f1740a;
            synchronized (a0Var2) {
                c6 = ((b0) a0Var2.f503e).c(cls);
            }
            Iterator it = c6.iterator();
            while (it.hasNext()) {
                Iterator it2 = kVar.f1742c.r((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!kVar.f1745f.b(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            a0 a0Var3 = kVar.f1747h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((b) a0Var3.f504f)) {
                ((b) a0Var3.f504f).put(new j(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List list2 = this.f55i;
                if (list2 != null) {
                    if (this.f56j < list2.size()) {
                        this.f57k = null;
                        boolean z5 = false;
                        while (!z5) {
                            if (!(this.f56j < this.f55i.size())) {
                                break;
                            }
                            List list3 = this.f55i;
                            int i3 = this.f56j;
                            this.f56j = i3 + 1;
                            File file = this.f58l;
                            i iVar2 = this.f51e;
                            this.f57k = ((v) list3.get(i3)).b(file, iVar2.f73e, iVar2.f74f, iVar2.f77i);
                            if (this.f57k != null) {
                                if (this.f51e.c(this.f57k.f2546c.a()) != null) {
                                    this.f57k.f2546c.d(this.f51e.f83o, this);
                                    z5 = true;
                                }
                            }
                        }
                        return z5;
                    }
                }
                int i6 = this.f53g + 1;
                this.f53g = i6;
                if (i6 >= arrayList.size()) {
                    int i7 = this.f52f + 1;
                    this.f52f = i7;
                    if (i7 >= a6.size()) {
                        return false;
                    }
                    this.f53g = 0;
                }
                f fVar = (f) a6.get(this.f52f);
                Class cls5 = (Class) arrayList.get(this.f53g);
                m e6 = this.f51e.e(cls5);
                i iVar3 = this.f51e;
                this.f59m = new h0(iVar3.f71c.f1725a, fVar, iVar3.f82n, iVar3.f73e, iVar3.f74f, e6, cls5, iVar3.f77i);
                File a7 = iVar3.f76h.a().a(this.f59m);
                this.f58l = a7;
                if (a7 != null) {
                    this.f54h = fVar;
                    this.f55i = this.f51e.f71c.f1726b.e(a7);
                    this.f56j = 0;
                }
            }
        } else if (File.class.equals(this.f51e.f79k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f51e.f72d.getClass() + " to " + this.f51e.f79k);
        }
    }

    public final void cancel() {
        u uVar = this.f57k;
        if (uVar != null) {
            uVar.f2546c.cancel();
        }
    }

    public final void h(Exception exc) {
        this.f50d.c(this.f59m, exc, this.f57k.f2546c, a.f5803g);
    }

    public final void l(Object obj) {
        this.f50d.d(this.f54h, obj, this.f57k.f2546c, a.f5803g, this.f59m);
    }
}
