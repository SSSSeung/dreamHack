package com.bumptech.glide;

import androidx.activity.result.c;
import androidx.appcompat.widget.a0;
import androidx.lifecycle.x;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.i;
import d4.a;
import e2.b0;
import e2.d0;
import e2.v;
import e2.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m2.b;
import w0.d;
import y1.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f1740a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1741b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f1742c;

    /* renamed from: d  reason: collision with root package name */
    public final a f1743d;

    /* renamed from: e  reason: collision with root package name */
    public final i f1744e;

    /* renamed from: f  reason: collision with root package name */
    public final a f1745f;

    /* renamed from: g  reason: collision with root package name */
    public final a f1746g;

    /* renamed from: h  reason: collision with root package name */
    public final a0 f1747h = new a0(22);

    /* renamed from: i  reason: collision with root package name */
    public final b f1748i = new b();

    /* renamed from: j  reason: collision with root package name */
    public final c f1749j;

    public k() {
        c cVar = new c(new d(20), (Object) new d0(20), new d0(21));
        this.f1749j = cVar;
        this.f1740a = new a0(cVar);
        this.f1741b = new a(2);
        this.f1742c = new a0(23);
        this.f1743d = new a(4);
        this.f1744e = new i();
        this.f1745f = new a(1);
        this.f1746g = new a(3);
        List<String> asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        a0 a0Var = this.f1742c;
        synchronized (a0Var) {
            ArrayList arrayList2 = new ArrayList((List) a0Var.f503e);
            ((List) a0Var.f503e).clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((List) a0Var.f503e).add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    ((List) a0Var.f503e).add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, w wVar) {
        a0 a0Var = this.f1740a;
        synchronized (a0Var) {
            b0 b0Var = (b0) a0Var.f503e;
            synchronized (b0Var) {
                e2.a0 a0Var2 = new e2.a0(cls, cls2, wVar);
                ArrayList arrayList = b0Var.f2491a;
                arrayList.add(arrayList.size(), a0Var2);
            }
            ((x) a0Var.f504f).f1392a.clear();
        }
    }

    public final void b(Class cls, l lVar) {
        a aVar = this.f1743d;
        synchronized (aVar) {
            aVar.f2180a.add(new m2.d(cls, lVar));
        }
    }

    public final void c(y1.k kVar, Class cls, Class cls2, String str) {
        a0 a0Var = this.f1742c;
        synchronized (a0Var) {
            a0Var.q(str).add(new m2.c(cls, cls2, kVar));
        }
    }

    public final ArrayList d() {
        ArrayList arrayList;
        a aVar = this.f1746g;
        synchronized (aVar) {
            arrayList = aVar.f2180a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new j();
    }

    public final List e(Object obj) {
        List list;
        a0 a0Var = this.f1740a;
        a0Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (a0Var) {
            e2.x xVar = (e2.x) ((x) a0Var.f504f).f1392a.get(cls);
            list = xVar == null ? null : xVar.f2547a;
            if (list == null) {
                list = Collections.unmodifiableList(((b0) a0Var.f503e).b(cls));
                x xVar2 = (x) a0Var.f504f;
                xVar2.getClass();
                if (((e2.x) xVar2.f1392a.put(cls, new e2.x(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z5 = true;
            for (int i3 = 0; i3 < size; i3++) {
                v vVar = (v) list.get(i3);
                if (vVar.a(obj)) {
                    if (z5) {
                        emptyList = new ArrayList(size - i3);
                        z5 = false;
                    }
                    emptyList.add(vVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new j(obj, list);
        }
        throw new j(obj);
    }

    public final void f(f fVar) {
        i iVar = this.f1744e;
        synchronized (iVar) {
            iVar.f1765a.put(fVar.a(), fVar);
        }
    }

    public final void g(Class cls, Class cls2, k2.a aVar) {
        a aVar2 = this.f1745f;
        synchronized (aVar2) {
            aVar2.f2180a.add(new k2.b(cls, cls2, aVar));
        }
    }
}
