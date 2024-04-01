package a2;

import androidx.appcompat.widget.a0;
import androidx.compose.ui.platform.e;
import b.a;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import com.bumptech.glide.k;
import e2.u;
import e2.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m2.b;
import m2.c;
import r2.j;
import y1.f;
import y1.m;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f69a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f70b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public g f71c;

    /* renamed from: d  reason: collision with root package name */
    public Object f72d;

    /* renamed from: e  reason: collision with root package name */
    public int f73e;

    /* renamed from: f  reason: collision with root package name */
    public int f74f;

    /* renamed from: g  reason: collision with root package name */
    public Class f75g;

    /* renamed from: h  reason: collision with root package name */
    public a f76h;

    /* renamed from: i  reason: collision with root package name */
    public y1.i f77i;

    /* renamed from: j  reason: collision with root package name */
    public Map f78j;

    /* renamed from: k  reason: collision with root package name */
    public Class f79k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f80l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f81m;

    /* renamed from: n  reason: collision with root package name */
    public f f82n;

    /* renamed from: o  reason: collision with root package name */
    public h f83o;

    /* renamed from: p  reason: collision with root package name */
    public q f84p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f85q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f86r;

    public final ArrayList a() {
        boolean z5 = this.f81m;
        ArrayList arrayList = this.f70b;
        if (!z5) {
            this.f81m = true;
            arrayList.clear();
            ArrayList b6 = b();
            int size = b6.size();
            for (int i3 = 0; i3 < size; i3++) {
                u uVar = (u) b6.get(i3);
                if (!arrayList.contains(uVar.f2544a)) {
                    arrayList.add(uVar.f2544a);
                }
                int i6 = 0;
                while (true) {
                    List list = uVar.f2545b;
                    if (i6 >= list.size()) {
                        break;
                    }
                    if (!arrayList.contains(list.get(i6))) {
                        arrayList.add(list.get(i6));
                    }
                    i6++;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z5 = this.f80l;
        ArrayList arrayList = this.f69a;
        if (!z5) {
            this.f80l = true;
            arrayList.clear();
            List e6 = this.f71c.f1726b.e(this.f72d);
            int size = e6.size();
            for (int i3 = 0; i3 < size; i3++) {
                u b6 = ((v) e6.get(i3)).b(this.f72d, this.f73e, this.f74f, this.f77i);
                if (b6 != null) {
                    arrayList.add(b6);
                }
            }
        }
        return arrayList;
    }

    public final d0 c(Class cls) {
        d0 d0Var;
        ArrayList arrayList;
        boolean z5;
        k2.a aVar;
        k2.a aVar2;
        Class cls2 = cls;
        k kVar = this.f71c.f1726b;
        Class cls3 = this.f75g;
        Class cls4 = this.f79k;
        b bVar = kVar.f1748i;
        j jVar = (j) bVar.f4179b.getAndSet((Object) null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.f4934a = cls2;
        jVar.f4935b = cls3;
        jVar.f4936c = cls4;
        synchronized (bVar.f4178a) {
            d0Var = (d0) bVar.f4178a.getOrDefault(jVar, (Object) null);
        }
        bVar.f4179b.set(jVar);
        kVar.f1748i.getClass();
        if (b.f4177c.equals(d0Var)) {
            return null;
        }
        if (d0Var != null) {
            return d0Var;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = kVar.f1742c.r(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = kVar.f1745f.b(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    a0 a0Var = kVar.f1742c;
                    synchronized (a0Var) {
                        arrayList = new ArrayList();
                        for (String str : (List) a0Var.f503e) {
                            List<c> list = (List) ((Map) a0Var.f504f).get(str);
                            if (list != null) {
                                for (c cVar : list) {
                                    if (cVar.f4180a.isAssignableFrom(cls2) && cls5.isAssignableFrom(cVar.f4181b)) {
                                        arrayList.add(cVar.f4182c);
                                    }
                                }
                            }
                        }
                    }
                    d4.a aVar3 = kVar.f1745f;
                    synchronized (aVar3) {
                        if (cls6.isAssignableFrom(cls5)) {
                            aVar = e.f893j;
                        } else {
                            Iterator it3 = aVar3.f2180a.iterator();
                            while (it3.hasNext()) {
                                k2.b bVar2 = (k2.b) it3.next();
                                if (!bVar2.f3907a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(bVar2.f3908b)) {
                                    z5 = false;
                                    continue;
                                } else {
                                    z5 = true;
                                    continue;
                                }
                                if (z5) {
                                    aVar = bVar2.f3909c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                        aVar2 = aVar;
                    }
                    o oVar = r2;
                    o oVar2 = new o(cls, cls5, cls6, arrayList, aVar2, kVar.f1749j);
                    arrayList2.add(oVar);
                }
            }
        }
        d0 d0Var2 = arrayList2.isEmpty() ? null : new d0(cls, cls3, cls4, arrayList2, kVar.f1749j);
        b bVar3 = kVar.f1748i;
        synchronized (bVar3.f4178a) {
            bVar3.f4178a.put(new j(cls2, cls3, cls4), d0Var2 != null ? d0Var2 : b.f4177c);
        }
        return d0Var2;
    }

    public final y1.c d(Object obj) {
        y1.c cVar;
        d4.a aVar = this.f71c.f1726b.f1741b;
        Class<?> cls = obj.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f2180a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                m2.a aVar2 = (m2.a) it.next();
                if (aVar2.f4175a.isAssignableFrom(cls)) {
                    cVar = aVar2.f4176b;
                    break;
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new com.bumptech.glide.j(3, (Class) obj.getClass());
    }

    public final m e(Class cls) {
        m mVar = (m) this.f78j.get(cls);
        if (mVar == null) {
            Iterator it = this.f78j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f78j.isEmpty() || !this.f85q) {
            return g2.c.f2851b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
