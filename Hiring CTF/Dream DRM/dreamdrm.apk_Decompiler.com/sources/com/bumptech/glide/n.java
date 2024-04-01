package com.bumptech.glide;

import a2.q;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.i;
import androidx.appcompat.widget.a0;
import e2.d0;
import j2.c;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import l2.b;
import l2.f;
import l2.g;
import l2.h;
import l2.k;
import l2.l;
import n0.j;
import n2.e;

public final class n implements ComponentCallbacks2, g {

    /* renamed from: n  reason: collision with root package name */
    public static final e f1780n;

    /* renamed from: d  reason: collision with root package name */
    public final b f1781d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f1782e;

    /* renamed from: f  reason: collision with root package name */
    public final f f1783f;

    /* renamed from: g  reason: collision with root package name */
    public final l f1784g;

    /* renamed from: h  reason: collision with root package name */
    public final k f1785h;

    /* renamed from: i  reason: collision with root package name */
    public final l2.n f1786i = new l2.n();

    /* renamed from: j  reason: collision with root package name */
    public final i f1787j;

    /* renamed from: k  reason: collision with root package name */
    public final b f1788k;

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList f1789l;

    /* renamed from: m  reason: collision with root package name */
    public e f1790m;

    static {
        e eVar = (e) new e().c(Bitmap.class);
        eVar.w = true;
        f1780n = eVar;
        ((e) new e().c(c.class)).w = true;
        e eVar2 = (e) ((e) ((e) new e().d(q.f132b)).h()).l();
    }

    public n(b bVar, f fVar, k kVar, Context context) {
        e eVar;
        l lVar = new l();
        d0 d0Var = bVar.f1695j;
        i iVar = new i(7, this);
        this.f1787j = iVar;
        this.f1781d = bVar;
        this.f1783f = fVar;
        this.f1785h = kVar;
        this.f1784g = lVar;
        this.f1782e = context;
        Context applicationContext = context.getApplicationContext();
        a0 a0Var = new a0((Object) this, (Object) lVar, 8);
        d0Var.getClass();
        Object obj = n0.b.f4213a;
        boolean z5 = false;
        boolean z6 = ((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) ? applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) : n0.i.a(new j(applicationContext).f4228a) ? 0 : -1) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z6 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        b cVar = z6 ? new l2.c(applicationContext, a0Var) : new h();
        this.f1788k = cVar;
        char[] cArr = r2.l.f4938a;
        if (!(Looper.myLooper() == Looper.getMainLooper() ? true : z5)) {
            r2.l.e().post(iVar);
        } else {
            fVar.b(this);
        }
        fVar.b(cVar);
        this.f1789l = new CopyOnWriteArrayList(bVar.f1691f.f1729e);
        g gVar = bVar.f1691f;
        synchronized (gVar) {
            if (gVar.f1734j == null) {
                gVar.f1728d.getClass();
                e eVar2 = new e();
                eVar2.w = true;
                gVar.f1734j = eVar2;
            }
            eVar = gVar.f1734j;
        }
        synchronized (this) {
            e eVar3 = (e) eVar.clone();
            if (eVar3.w) {
                if (!eVar3.f4283y) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            eVar3.f4283y = true;
            eVar3.w = true;
            this.f1790m = eVar3;
        }
        synchronized (bVar.f1696k) {
            if (!bVar.f1696k.contains(this)) {
                bVar.f1696k.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final synchronized void e() {
        m();
        this.f1786i.e();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void j() {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x000f }
            l2.l r0 = r1.f1784g     // Catch:{ all -> 0x0011 }
            r0.f()     // Catch:{ all -> 0x0011 }
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            l2.n r0 = r1.f1786i     // Catch:{ all -> 0x000f }
            r0.j()     // Catch:{ all -> 0x000f }
            monitor-exit(r1)
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0014
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0014:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.n.j():void");
    }

    public final synchronized void k() {
        this.f1786i.k();
        Iterator it = r2.l.d(this.f1786i.f4106d).iterator();
        while (it.hasNext()) {
            l((o2.e) it.next());
        }
        this.f1786i.f4106d.clear();
        l lVar = this.f1784g;
        Iterator it2 = r2.l.d((Set) lVar.f4103f).iterator();
        while (it2.hasNext()) {
            lVar.c((n2.c) it2.next());
        }
        ((List) lVar.f4104g).clear();
        this.f1783f.g(this);
        this.f1783f.g(this.f1788k);
        r2.l.e().removeCallbacks(this.f1787j);
        this.f1781d.c(this);
    }

    public final void l(o2.e eVar) {
        boolean z5;
        if (eVar != null) {
            boolean n5 = n(eVar);
            n2.c f6 = eVar.f();
            if (!n5) {
                b bVar = this.f1781d;
                synchronized (bVar.f1696k) {
                    Iterator it = bVar.f1696k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((n) it.next()).n(eVar)) {
                                z5 = true;
                                break;
                            }
                        } else {
                            z5 = false;
                            break;
                        }
                    }
                }
                if (!z5 && f6 != null) {
                    eVar.c((n2.c) null);
                    f6.clear();
                }
            }
        }
    }

    public final synchronized void m() {
        l lVar = this.f1784g;
        lVar.f4102e = true;
        Iterator it = r2.l.d((Set) lVar.f4103f).iterator();
        while (it.hasNext()) {
            n2.c cVar = (n2.c) it.next();
            if (cVar.isRunning()) {
                cVar.d();
                ((List) lVar.f4104g).add(cVar);
            }
        }
    }

    public final synchronized boolean n(o2.e eVar) {
        n2.c f6 = eVar.f();
        if (f6 == null) {
            return true;
        }
        if (!this.f1784g.c(f6)) {
            return false;
        }
        this.f1786i.f4106d.remove(eVar);
        eVar.c((n2.c) null);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i3) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f1784g + ", treeNode=" + this.f1785h + "}";
    }
}
