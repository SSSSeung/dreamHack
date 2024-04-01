package h2;

import a2.f0;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.widget.a0;
import b2.h;
import h5.d;
import i2.c;
import java.io.InputStream;
import java.util.ArrayDeque;
import r2.e;
import y1.i;
import y1.k;

public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3380a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3381b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3382c;

    public a(Resources resources, k kVar) {
        this.f3380a = 0;
        this.f3382c = resources;
        this.f3381b = kVar;
    }

    public final f0 a(Object obj, int i3, int i6, i iVar) {
        boolean z5;
        w wVar;
        e eVar;
        Object obj2 = obj;
        int i7 = i3;
        int i8 = i6;
        switch (this.f3380a) {
            case 0:
                f0 a6 = ((k) this.f3381b).a(obj2, i7, i8, iVar);
                Resources resources = (Resources) this.f3382c;
                if (a6 == null) {
                    return null;
                }
                return new d(resources, a6);
            case 1:
                f0 c6 = ((c) this.f3381b).c((Uri) obj2);
                if (c6 == null) {
                    return null;
                }
                return d.a((b2.d) this.f3382c, (Drawable) ((i2.a) c6).get(), i7, i8);
            default:
                i iVar2 = iVar;
                InputStream inputStream = (InputStream) obj2;
                if (inputStream instanceof w) {
                    wVar = (w) inputStream;
                    z5 = false;
                } else {
                    z5 = true;
                    wVar = new w(inputStream, (h) this.f3382c);
                }
                ArrayDeque arrayDeque = e.f4923f;
                synchronized (arrayDeque) {
                    eVar = (e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new e();
                }
                e eVar2 = eVar;
                eVar2.f4924d = wVar;
                r2.i iVar3 = new r2.i(eVar2);
                a0 a0Var = new a0((Object) wVar, 20, (Object) eVar2);
                try {
                    p pVar = (p) this.f3381b;
                    d a7 = pVar.a(new androidx.activity.result.c(pVar.f3425c, (InputStream) iVar3, pVar.f3426d), i3, i6, iVar, a0Var);
                    eVar2.f4925e = null;
                    eVar2.f4924d = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                    }
                    if (z5) {
                        wVar.e();
                    }
                    return a7;
                } catch (Throwable th) {
                    eVar2.f4925e = null;
                    eVar2.f4924d = null;
                    ArrayDeque arrayDeque2 = e.f4923f;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (z5) {
                            wVar.e();
                        }
                        throw th;
                    }
                }
        }
    }

    public final boolean b(Object obj, i iVar) {
        int i3 = this.f3380a;
        Object obj2 = this.f3381b;
        switch (i3) {
            case 0:
                return ((k) obj2).b(obj, iVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                InputStream inputStream = (InputStream) obj;
                ((p) obj2).getClass();
                return true;
        }
    }

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f3380a = i3;
        this.f3381b = obj;
        this.f3382c = obj2;
    }
}
