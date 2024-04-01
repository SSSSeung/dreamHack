package androidx.activity.result;

import a1.d;
import a2.f0;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.compose.ui.platform.e;
import androidx.fragment.app.n0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import b1.k;
import b1.o;
import b2.h;
import com.bumptech.glide.load.data.n;
import e.p0;
import e2.d0;
import h0.f;
import h2.w;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.a;
import s2.b;
import y1.i;

public final class c implements k, d, a, w0.c {

    /* renamed from: h  reason: collision with root package name */
    public static c f325h;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f326d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f327e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f328f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f329g;

    public c(Context context, LocationManager locationManager) {
        this.f326d = 2;
        this.f329g = new p0();
        this.f327e = context;
        this.f328f = locationManager;
    }

    public final boolean a(Object obj) {
        if (obj instanceof b) {
            ((b) obj).a().f4951a = true;
        }
        switch (((d0) ((s2.c) this.f328f)).f2499d) {
            case 19:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((w0.c) this.f329g).a(obj);
    }

    public final Object b() {
        Object b6 = ((w0.c) this.f329g).b();
        if (b6 == null) {
            b6 = ((s2.a) this.f327e).t();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + b6.getClass());
            }
        }
        if (b6 instanceof b) {
            ((b) b6).a().f4951a = false;
        }
        return b6;
    }

    public final Bitmap c(BitmapFactory.Options options) {
        switch (this.f326d) {
            case 7:
                w wVar = (w) ((n) this.f327e).f1778b;
                wVar.reset();
                return BitmapFactory.decodeStream(wVar, (Rect) null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((n) this.f329g).a().getFileDescriptor(), (Rect) null, options);
        }
    }

    public final k0 d(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return g(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void e() {
    }

    public final f0 f(f0 f0Var, i iVar) {
        Drawable drawable = (Drawable) f0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((a) this.f328f).f(h2.d.e(((BitmapDrawable) drawable).getBitmap(), (b2.d) this.f327e), iVar);
        }
        if (drawable instanceof j2.c) {
            return ((a) this.f329g).f(f0Var, iVar);
        }
        return null;
    }

    public final k0 g(Class cls, String str) {
        k0 k0Var;
        Object obj = this.f328f;
        o.m(str, "key");
        m0 m0Var = (m0) this.f327e;
        m0Var.getClass();
        k0 k0Var2 = (k0) m0Var.f1376a.get(str);
        if (cls.isInstance(k0Var2)) {
            o.j(k0Var2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return k0Var2;
        }
        l1.d dVar = new l1.d((l1.b) this.f329g);
        dVar.f4076a.put(e.f889f, str);
        try {
            k0Var = ((l0) obj).c(cls, dVar);
        } catch (AbstractMethodError unused) {
            k0Var = ((l0) obj).b(cls);
        }
        m0Var.getClass();
        o.m(k0Var, "viewModel");
        k0 k0Var3 = (k0) m0Var.f1376a.put(str, k0Var);
        if (k0Var3 != null) {
            k0Var3.a();
        }
        return k0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[SYNTHETIC, Splitter:B:21:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType h() {
        /*
            r9 = this;
            int r0 = r9.f326d
            java.lang.Object r1 = r9.f328f
            java.lang.Object r2 = r9.f327e
            java.lang.Object r3 = r9.f329g
            switch(r0) {
                case 7: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x001e
        L_0x000c:
            java.util.List r3 = (java.util.List) r3
            com.bumptech.glide.load.data.n r2 = (com.bumptech.glide.load.data.n) r2
            java.lang.Object r0 = r2.f1778b
            h2.w r0 = (h2.w) r0
            r0.reset()
            b2.h r1 = (b2.h) r1
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = b1.o.C(r1, r0, r3)
            return r0
        L_0x001e:
            java.util.List r1 = (java.util.List) r1
            com.bumptech.glide.load.data.n r3 = (com.bumptech.glide.load.data.n) r3
            b2.h r2 = (b2.h) r2
            int r0 = r1.size()
            r4 = 0
        L_0x0029:
            if (r4 >= r0) goto L_0x0062
            java.lang.Object r5 = r1.get(r4)
            y1.d r5 = (y1.d) r5
            h2.w r6 = new h2.w     // Catch:{ all -> 0x0057 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0057 }
            android.os.ParcelFileDescriptor r8 = r3.a()     // Catch:{ all -> 0x0057 }
            java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0057 }
            r7.<init>(r8)     // Catch:{ all -> 0x0057 }
            r6.<init>(r7, r2)     // Catch:{ all -> 0x0057 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.b(r6)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r3.a()
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            if (r5 == r6) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x0055:
            r0 = move-exception
            goto L_0x0059
        L_0x0057:
            r0 = move-exception
            r6 = 0
        L_0x0059:
            if (r6 == 0) goto L_0x005e
            r6.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            r3.a()
            throw r0
        L_0x0062:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.c.h():com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public final boolean i(j0.e eVar, h0.e eVar2, boolean z5) {
        i0.b bVar = (i0.b) this.f328f;
        int[] iArr = eVar2.f3273c0;
        bVar.f3507a = iArr[0];
        boolean z6 = true;
        bVar.f3508b = iArr[1];
        bVar.f3509c = eVar2.l();
        bVar.f3510d = eVar2.j();
        bVar.f3515i = false;
        bVar.f3516j = z5;
        boolean z7 = bVar.f3507a == 3;
        boolean z8 = bVar.f3508b == 3;
        boolean z9 = z7 && eVar2.L > 0.0f;
        boolean z10 = z8 && eVar2.L > 0.0f;
        int[] iArr2 = eVar2.f3282l;
        if (z9 && iArr2[0] == 4) {
            bVar.f3507a = 1;
        }
        if (z10 && iArr2[1] == 4) {
            bVar.f3508b = 1;
        }
        eVar.a(eVar2, bVar);
        eVar2.y(bVar.f3511e);
        eVar2.v(bVar.f3512f);
        eVar2.w = bVar.f3514h;
        int i3 = bVar.f3513g;
        eVar2.P = i3;
        if (i3 <= 0) {
            z6 = false;
        }
        eVar2.w = z6;
        bVar.f3516j = false;
        return bVar.f3515i;
    }

    public final Uri j() {
        return (Uri) this.f329g;
    }

    public final void k(f fVar, int i3, int i6) {
        int i7 = fVar.Q;
        int i8 = fVar.R;
        fVar.Q = 0;
        fVar.R = 0;
        fVar.y(i3);
        fVar.v(i6);
        if (i7 < 0) {
            i7 = 0;
        }
        fVar.Q = i7;
        if (i8 < 0) {
            i8 = 0;
        }
        fVar.R = i8;
        ((f) this.f329g).E();
    }

    public final ClipDescription s() {
        return (ClipDescription) this.f328f;
    }

    public final Object u() {
        return null;
    }

    public final Uri w() {
        return (Uri) this.f327e;
    }

    public c(ParcelFileDescriptor parcelFileDescriptor, List list, h hVar) {
        this.f326d = 8;
        o.i(hVar);
        this.f327e = hVar;
        o.i(list);
        this.f328f = list;
        this.f329g = new n(parcelFileDescriptor);
    }

    public c(androidx.activity.h hVar, String str, com.bumptech.glide.d dVar) {
        this.f326d = 0;
        this.f329g = hVar;
        this.f327e = str;
        this.f328f = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(m0 m0Var, n0 n0Var) {
        this(m0Var, (l0) n0Var, (l1.b) l1.a.f4075b);
        this.f326d = 6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(m0 m0Var, n0 n0Var, int i3) {
        this(m0Var, n0Var);
        this.f326d = 6;
        o.m(m0Var, "store");
        o.m(n0Var, "factory");
    }

    public c(m0 m0Var, l0 l0Var, l1.b bVar) {
        this.f326d = 6;
        o.m(m0Var, "store");
        o.m(l0Var, "factory");
        o.m(bVar, "defaultCreationExtras");
        this.f327e = m0Var;
        this.f328f = l0Var;
        this.f329g = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(androidx.lifecycle.n0 n0Var, l1.c cVar) {
        this(n0Var.e(), (l0) cVar, n0Var instanceof androidx.lifecycle.h ? ((androidx.lifecycle.h) n0Var).a() : l1.a.f4075b);
        this.f326d = 6;
    }

    public c(h hVar, InputStream inputStream, List list) {
        this.f326d = 7;
        o.i(hVar);
        this.f328f = hVar;
        o.i(list);
        this.f329g = list;
        this.f327e = new n(inputStream, hVar);
    }

    public c(f fVar) {
        this.f326d = 3;
        this.f327e = new ArrayList();
        this.f328f = new i0.b();
        this.f329g = fVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i3) {
        this.f326d = i3;
        this.f327e = obj;
        this.f328f = obj2;
        this.f329g = obj3;
    }

    public c(Runnable runnable) {
        this.f326d = 4;
        this.f328f = new CopyOnWriteArrayList();
        this.f329g = new HashMap();
        this.f327e = runnable;
    }

    public /* synthetic */ c(w0.d dVar, Object obj, d0 d0Var) {
        this.f326d = 10;
        this.f329g = dVar;
        this.f327e = obj;
        this.f328f = d0Var;
    }
}
