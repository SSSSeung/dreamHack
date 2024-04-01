package com.bumptech.glide;

import a2.r;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.platform.e;
import androidx.lifecycle.x;
import b2.d;
import b2.h;
import c2.f;
import c2.i;
import com.bumptech.glide.load.data.m;
import d4.a;
import e.n0;
import e2.c0;
import e2.d0;
import e2.g0;
import h2.a0;
import h2.f0;
import h2.g;
import h2.l;
import h2.p;
import h2.s;
import i2.c;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l2.j;
import y1.k;

public final class b implements ComponentCallbacks2 {

    /* renamed from: l  reason: collision with root package name */
    public static volatile b f1687l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile boolean f1688m;

    /* renamed from: d  reason: collision with root package name */
    public final d f1689d;

    /* renamed from: e  reason: collision with root package name */
    public final f f1690e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1691f;

    /* renamed from: g  reason: collision with root package name */
    public final k f1692g;

    /* renamed from: h  reason: collision with root package name */
    public final h f1693h;

    /* renamed from: i  reason: collision with root package name */
    public final j f1694i;

    /* renamed from: j  reason: collision with root package name */
    public final d0 f1695j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f1696k = new ArrayList();

    /* JADX INFO: finally extract failed */
    public b(Context context, r rVar, f fVar, d dVar, h hVar, j jVar, d0 d0Var, int i3, n0 n0Var, k.b bVar, List list, x xVar) {
        int i6;
        k kVar;
        k kVar2;
        c0 c0Var;
        c cVar;
        Context context2 = context;
        d dVar2 = dVar;
        h hVar2 = hVar;
        this.f1689d = dVar2;
        this.f1693h = hVar2;
        this.f1690e = fVar;
        this.f1694i = jVar;
        this.f1695j = d0Var;
        Resources resources = context.getResources();
        k kVar3 = new k();
        this.f1692g = kVar3;
        l lVar = new l();
        a aVar = kVar3.f1746g;
        synchronized (aVar) {
            aVar.f2180a.add(lVar);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 27) {
            s sVar = new s();
            a aVar2 = kVar3.f1746g;
            synchronized (aVar2) {
                aVar2.f2180a.add(sVar);
            }
        }
        ArrayList d6 = kVar3.d();
        j2.a aVar3 = new j2.a(context2, d6, dVar2, hVar2);
        f0 f0Var = new f0(dVar2, new d0(7));
        p pVar = new p(kVar3.d(), resources.getDisplayMetrics(), dVar2, hVar2);
        if (!xVar.f1392a.containsKey(c.class) || i7 < 28) {
            kVar = new h2.f(pVar, 0);
            i6 = 2;
            kVar2 = new h2.a(pVar, 2, hVar2);
        } else {
            kVar2 = new g(1);
            kVar = new g(0);
            i6 = 2;
        }
        c cVar2 = new c(context2);
        c0 c0Var2 = new c0(i6, resources);
        c0 c0Var3 = new c0(3, resources);
        int i8 = i7;
        c0 c0Var4 = new c0(1, resources);
        c0 c0Var5 = new c0(0, resources);
        h2.b bVar2 = new h2.b(hVar2);
        c0 c0Var6 = c0Var5;
        c0 c0Var7 = c0Var3;
        c0 c0Var8 = c0Var4;
        e.h hVar3 = new e.h(100, (Object) Bitmap.CompressFormat.JPEG);
        d0 d0Var2 = new d0(10);
        ContentResolver contentResolver = context.getContentResolver();
        d0 d0Var3 = d0Var2;
        e.h hVar4 = hVar3;
        androidx.fragment.app.n0 n0Var2 = new androidx.fragment.app.n0(23);
        Class<ByteBuffer> cls = ByteBuffer.class;
        ContentResolver contentResolver2 = contentResolver;
        a aVar4 = kVar3.f1741b;
        synchronized (aVar4) {
            c0Var = c0Var2;
            try {
                cVar = cVar2;
                aVar4.f2180a.add(new m2.a(cls, n0Var2));
            } catch (Throwable th) {
                throw th;
            }
        }
        e2.f fVar2 = new e2.f(4, hVar2);
        Class<InputStream> cls2 = InputStream.class;
        a aVar5 = kVar3.f1741b;
        synchronized (aVar5) {
            try {
                aVar5.f2180a.add(new m2.a(cls2, fVar2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Class<Bitmap> cls3 = Bitmap.class;
        kVar3.c(kVar, cls, cls3, "Bitmap");
        kVar3.c(kVar2, cls2, cls3, "Bitmap");
        h2.f fVar3 = new h2.f(pVar, 1);
        Class<ParcelFileDescriptor> cls4 = ParcelFileDescriptor.class;
        kVar3.c(fVar3, cls4, cls3, "Bitmap");
        kVar3.c(f0Var, cls4, cls3, "Bitmap");
        Class<AssetFileDescriptor> cls5 = AssetFileDescriptor.class;
        kVar3.c(new f0(dVar2, new d0()), cls5, cls3, "Bitmap");
        e eVar = e.f890g;
        kVar3.a(cls3, cls3, eVar);
        Class<AssetFileDescriptor> cls6 = cls5;
        e eVar2 = eVar;
        kVar3.c(new a0(0), cls3, cls3, "Bitmap");
        kVar3.b(cls3, bVar2);
        h2.a aVar6 = new h2.a(resources, kVar);
        Class<BitmapDrawable> cls7 = BitmapDrawable.class;
        kVar3.c(aVar6, cls, cls7, "BitmapDrawable");
        kVar3.c(new h2.a(resources, kVar2), cls2, cls7, "BitmapDrawable");
        kVar3.c(new h2.a(resources, f0Var), cls4, cls7, "BitmapDrawable");
        kVar3.b(cls7, new androidx.appcompat.widget.a0((Object) dVar2, 19, (Object) bVar2));
        h hVar5 = hVar;
        j2.j jVar2 = new j2.j(d6, aVar3, hVar5);
        Class<j2.c> cls8 = j2.c.class;
        kVar3.c(jVar2, cls2, cls8, "Gif");
        kVar3.c(aVar3, cls, cls8, "Gif");
        kVar3.b(cls8, new d0(9));
        Class<x1.a> cls9 = x1.a.class;
        e eVar3 = eVar2;
        kVar3.a(cls9, cls9, eVar3);
        kVar3.c(new c(dVar2), cls9, cls3, "Bitmap");
        Class<Uri> cls10 = Uri.class;
        Class<Drawable> cls11 = Drawable.class;
        c cVar3 = cVar;
        kVar3.c(cVar3, cls10, cls11, "legacy_append");
        Class<j2.c> cls12 = cls8;
        kVar3.c(new h2.a(cVar3, 1, dVar2), cls10, cls3, "legacy_append");
        kVar3.f(new com.bumptech.glide.load.data.h(2));
        Class<File> cls13 = File.class;
        kVar3.a(cls13, cls, new androidx.fragment.app.n0(24));
        kVar3.a(cls13, cls2, new e2.k(1));
        kVar3.c(new a0(2), cls13, cls13, "legacy_append");
        kVar3.a(cls13, cls4, new e2.k(0));
        kVar3.a(cls13, cls13, eVar3);
        kVar3.f(new m(hVar5));
        kVar3.f(new com.bumptech.glide.load.data.h(1));
        Class cls14 = Integer.TYPE;
        c0 c0Var9 = c0Var;
        kVar3.a(cls14, cls2, c0Var9);
        c0 c0Var10 = c0Var8;
        kVar3.a(cls14, cls4, c0Var10);
        Class<Integer> cls15 = Integer.class;
        kVar3.a(cls15, cls2, c0Var9);
        kVar3.a(cls15, cls4, c0Var10);
        c0 c0Var11 = c0Var7;
        kVar3.a(cls15, cls10, c0Var11);
        c0 c0Var12 = c0Var6;
        Class<Bitmap> cls16 = cls3;
        Class<AssetFileDescriptor> cls17 = cls6;
        kVar3.a(cls14, cls17, c0Var12);
        kVar3.a(cls15, cls17, c0Var12);
        kVar3.a(cls14, cls10, c0Var11);
        Class<String> cls18 = String.class;
        kVar3.a(cls18, cls2, new e2.f(2));
        kVar3.a(cls10, cls2, new e2.f(2));
        kVar3.a(cls18, cls2, new d0(0));
        kVar3.a(cls18, cls4, new androidx.fragment.app.n0(29));
        kVar3.a(cls18, cls17, new androidx.fragment.app.n0(28));
        kVar3.a(cls10, cls2, new e2.b(context.getAssets(), 1));
        kVar3.a(cls10, cls4, new e2.b(context.getAssets(), 0));
        Context context3 = context;
        kVar3.a(cls10, cls2, new g.a(context3, 3));
        kVar3.a(cls10, cls2, new g.a(context3, 4));
        if (i8 >= 29) {
            kVar3.a(cls10, cls2, new f2.b(context3, 1));
            kVar3.a(cls10, cls4, new f2.b(context3, 0));
        }
        ContentResolver contentResolver3 = contentResolver2;
        kVar3.a(cls10, cls2, new g0(contentResolver3, 2));
        kVar3.a(cls10, cls4, new g0(contentResolver3, 1));
        kVar3.a(cls10, cls17, new g0(contentResolver3, 0));
        kVar3.a(cls10, cls2, new d0(1));
        kVar3.a(URL.class, cls2, new d0(2));
        kVar3.a(cls10, cls13, new g.a(context3, 2));
        kVar3.a(e2.m.class, cls2, new e2.f(5));
        Class<byte[]> cls19 = byte[].class;
        kVar3.a(cls19, cls, new androidx.fragment.app.n0(21));
        kVar3.a(cls19, cls2, new androidx.fragment.app.n0(22));
        kVar3.a(cls10, cls10, eVar3);
        kVar3.a(cls11, cls11, eVar3);
        kVar3.c(new a0(1), cls11, cls11, "legacy_append");
        Class<Bitmap> cls20 = cls16;
        kVar3.g(cls20, cls7, new c0(resources));
        e.h hVar6 = hVar4;
        kVar3.g(cls20, cls19, hVar6);
        d dVar3 = dVar;
        d0 d0Var4 = d0Var3;
        kVar3.g(cls11, cls19, new androidx.activity.result.c(dVar3, hVar6, d0Var4, 9));
        kVar3.g(cls12, cls19, d0Var4);
        f0 f0Var2 = new f0(dVar3, new d0(5));
        kVar3.c(f0Var2, ByteBuffer.class, cls20, "legacy_append");
        kVar3.c(new h2.a(resources, f0Var2), ByteBuffer.class, cls7, "legacy_append");
        this.f1691f = new g(context, hVar, kVar3, new d0(17), n0Var, bVar, list, rVar, xVar, i3);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f1688m) {
            f1688m = true;
            f fVar = new f();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            g.a.b(next);
                            throw null;
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.x().isEmpty()) {
                    generatedAppGlideModule.x();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        a2.m.o(it.next());
                        throw null;
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        a2.m.o(it2.next());
                        throw null;
                    }
                }
                fVar.f1721n = null;
                Iterator it3 = arrayList.iterator();
                if (!it3.hasNext()) {
                    if (fVar.f1714g == null) {
                        if (d2.c.f2152f == 0) {
                            d2.c.f2152f = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        int i3 = d2.c.f2152f;
                        if (!TextUtils.isEmpty("source")) {
                            fVar.f1714g = new d2.c(new ThreadPoolExecutor(i3, i3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d2.b("source", false)));
                        } else {
                            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                        }
                    }
                    if (fVar.f1715h == null) {
                        int i6 = d2.c.f2152f;
                        if (!TextUtils.isEmpty("disk-cache")) {
                            fVar.f1715h = new d2.c(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d2.b("disk-cache", true)));
                        } else {
                            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                        }
                    }
                    if (fVar.f1722o == null) {
                        if (d2.c.f2152f == 0) {
                            d2.c.f2152f = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        int i7 = d2.c.f2152f >= 4 ? 2 : 1;
                        if (!TextUtils.isEmpty("animation")) {
                            fVar.f1722o = new d2.c(new ThreadPoolExecutor(i7, i7, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d2.b("animation", true)));
                        } else {
                            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                        }
                    }
                    if (fVar.f1717j == null) {
                        fVar.f1717j = new i(new c2.h(applicationContext));
                    }
                    if (fVar.f1718k == null) {
                        fVar.f1718k = new d0(12);
                    }
                    if (fVar.f1711d == null) {
                        int i8 = fVar.f1717j.f1617a;
                        if (i8 > 0) {
                            fVar.f1711d = new b2.i((long) i8);
                        } else {
                            fVar.f1711d = new e();
                        }
                    }
                    if (fVar.f1712e == null) {
                        fVar.f1712e = new h(fVar.f1717j.f1619c);
                    }
                    if (fVar.f1713f == null) {
                        fVar.f1713f = new f((long) fVar.f1717j.f1618b);
                    }
                    if (fVar.f1716i == null) {
                        fVar.f1716i = new c2.e(applicationContext);
                    }
                    if (fVar.f1710c == null) {
                        fVar.f1710c = new r(fVar.f1713f, fVar.f1716i, fVar.f1715h, fVar.f1714g, new d2.c(new ThreadPoolExecutor(0, Integer.MAX_VALUE, d2.c.f2151e, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d2.b("source-unlimited", false))), fVar.f1722o);
                    }
                    List list = fVar.f1723p;
                    fVar.f1723p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
                    x xVar = fVar.f1709b;
                    xVar.getClass();
                    x xVar2 = new x(xVar);
                    b bVar = new b(applicationContext, fVar.f1710c, fVar.f1713f, fVar.f1711d, fVar.f1712e, new j(fVar.f1721n, xVar2), fVar.f1718k, fVar.f1719l, fVar.f1720m, fVar.f1708a, fVar.f1723p, xVar2);
                    Iterator it4 = arrayList.iterator();
                    if (!it4.hasNext()) {
                        applicationContext.registerComponentCallbacks(bVar);
                        f1687l = bVar;
                        f1688m = false;
                        return;
                    }
                    a2.m.o(it4.next());
                    throw null;
                }
                a2.m.o(it3.next());
                throw null;
            } catch (PackageManager.NameNotFoundException e6) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e6);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f1687l == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (InstantiationException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            }
            synchronized (b.class) {
                if (f1687l == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f1687l;
    }

    public static n d(Context context) {
        if (context != null) {
            return b(context).f1694i.b(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public final void c(n nVar) {
        synchronized (this.f1696k) {
            if (this.f1696k.contains(nVar)) {
                this.f1696k.remove(nVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        char[] cArr = r2.l.f4938a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f1690e.e(0);
            this.f1689d.i();
            h hVar = this.f1693h;
            synchronized (hVar) {
                hVar.b(0);
            }
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onTrimMemory(int r10) {
        /*
            r9 = this;
            char[] r0 = r2.l.f4938a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 != r1) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            if (r0 == 0) goto L_0x0077
            java.util.ArrayList r0 = r9.f1696k
            monitor-enter(r0)
            java.util.ArrayList r1 = r9.f1696k     // Catch:{ all -> 0x0074 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0074 }
        L_0x001b:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0074 }
            com.bumptech.glide.n r3 = (com.bumptech.glide.n) r3     // Catch:{ all -> 0x0074 }
            r3.getClass()     // Catch:{ all -> 0x0074 }
            goto L_0x001b
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            c2.f r0 = r9.f1690e
            r0.getClass()
            r1 = 15
            r3 = 20
            r4 = 40
            if (r10 < r4) goto L_0x003f
            r5 = 0
            r0.e(r5)
            goto L_0x004d
        L_0x003f:
            if (r10 >= r3) goto L_0x0043
            if (r10 != r1) goto L_0x004d
        L_0x0043:
            monitor-enter(r0)
            long r5 = r0.f4931b     // Catch:{ all -> 0x0071 }
            monitor-exit(r0)
            r7 = 2
            long r5 = r5 / r7
            r0.e(r5)
        L_0x004d:
            b2.d r0 = r9.f1689d
            r0.c(r10)
            b2.h r0 = r9.f1693h
            monitor-enter(r0)
            if (r10 < r4) goto L_0x0062
            monitor-enter(r0)     // Catch:{ all -> 0x0060 }
            r0.b(r2)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x006d
        L_0x005d:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r10     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r10 = move-exception
            goto L_0x006f
        L_0x0062:
            if (r10 >= r3) goto L_0x0066
            if (r10 != r1) goto L_0x006d
        L_0x0066:
            int r10 = r0.f1557e     // Catch:{ all -> 0x0060 }
            int r10 = r10 / 2
            r0.b(r10)     // Catch:{ all -> 0x0060 }
        L_0x006d:
            monitor-exit(r0)
            return
        L_0x006f:
            monitor-exit(r0)
            throw r10
        L_0x0071:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x0074:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r10
        L_0x0077:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You must call this method on the main thread"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.onTrimMemory(int):void");
    }
}
