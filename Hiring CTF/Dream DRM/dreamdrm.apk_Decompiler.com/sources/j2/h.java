package j2;

import a2.q;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b1.o;
import b2.d;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import g2.c;
import java.util.ArrayList;
import r2.l;
import x1.a;
import x1.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final a f3818a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3819b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3820c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final n f3821d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3822e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3823f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3824g;

    /* renamed from: h  reason: collision with root package name */
    public m f3825h;

    /* renamed from: i  reason: collision with root package name */
    public e f3826i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3827j;

    /* renamed from: k  reason: collision with root package name */
    public e f3828k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f3829l;

    /* renamed from: m  reason: collision with root package name */
    public e f3830m;

    /* renamed from: n  reason: collision with root package name */
    public int f3831n;

    /* renamed from: o  reason: collision with root package name */
    public int f3832o;

    /* renamed from: p  reason: collision with root package name */
    public int f3833p;

    public h(b bVar, e eVar, int i3, int i6, c cVar, Bitmap bitmap) {
        d dVar = bVar.f1689d;
        g gVar = bVar.f1691f;
        n d6 = b.d(gVar.getBaseContext());
        n d7 = b.d(gVar.getBaseContext());
        d7.getClass();
        m q5 = new m(d7.f1781d, d7, Bitmap.class, d7.f1782e).q(n.f1780n).q(((n2.e) ((n2.e) ((n2.e) new n2.e().d(q.f131a)).o()).l()).g(i3, i6));
        this.f3821d = d6;
        Handler handler = new Handler(Looper.getMainLooper(), new g(0, this));
        this.f3822e = dVar;
        this.f3819b = handler;
        this.f3825h = q5;
        this.f3818a = eVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i3;
        if (this.f3823f && !this.f3824g) {
            e eVar = this.f3830m;
            if (eVar != null) {
                this.f3830m = null;
                b(eVar);
                return;
            }
            this.f3824g = true;
            a aVar = this.f3818a;
            e eVar2 = (e) aVar;
            x1.c cVar = eVar2.f5700l;
            int i6 = cVar.f5676c;
            int i7 = (i6 <= 0 || (i3 = eVar2.f5699k) < 0) ? 0 : (i3 < 0 || i3 >= i6) ? -1 : ((x1.b) cVar.f5678e.get(i3)).f5671i;
            int i8 = (eVar2.f5699k + 1) % eVar2.f5700l.f5676c;
            eVar2.f5699k = i8;
            this.f3828k = new e(this.f3819b, i8, SystemClock.uptimeMillis() + ((long) i7));
            m u3 = this.f3825h.q((n2.e) new n2.e().k(new q2.b(Double.valueOf(Math.random())))).u(aVar);
            u3.t(this.f3828k, u3);
        }
    }

    public final void b(e eVar) {
        this.f3824g = false;
        boolean z5 = this.f3827j;
        Handler handler = this.f3819b;
        if (z5) {
            handler.obtainMessage(2, eVar).sendToTarget();
        } else if (!this.f3823f) {
            this.f3830m = eVar;
        } else {
            if (eVar.f3815j != null) {
                Bitmap bitmap = this.f3829l;
                if (bitmap != null) {
                    this.f3822e.b(bitmap);
                    this.f3829l = null;
                }
                e eVar2 = this.f3826i;
                this.f3826i = eVar;
                ArrayList arrayList = this.f3820c;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) ((f) arrayList.get(size));
                    Drawable.Callback callback = cVar.getCallback();
                    while (callback instanceof Drawable) {
                        callback = ((Drawable) callback).getCallback();
                    }
                    if (callback == null) {
                        cVar.stop();
                        cVar.invalidateSelf();
                    } else {
                        cVar.invalidateSelf();
                        h hVar = cVar.f3798d.f3797a;
                        e eVar3 = hVar.f3826i;
                        if ((eVar3 != null ? eVar3.f3813h : -1) == ((e) hVar.f3818a).f5700l.f5676c - 1) {
                            cVar.f3803i++;
                        }
                        int i3 = cVar.f3804j;
                        if (i3 != -1 && cVar.f3803i >= i3) {
                            cVar.stop();
                        }
                    }
                }
                if (eVar2 != null) {
                    handler.obtainMessage(2, eVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(y1.m mVar, Bitmap bitmap) {
        o.i(mVar);
        o.i(bitmap);
        this.f3829l = bitmap;
        this.f3825h = this.f3825h.q(new n2.e().n(mVar, true));
        this.f3831n = l.c(bitmap);
        this.f3832o = bitmap.getWidth();
        this.f3833p = bitmap.getHeight();
    }
}
