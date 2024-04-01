package j2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import n2.c;
import n2.g;
import o2.d;
import r2.l;

public final class e implements o2.e {

    /* renamed from: d  reason: collision with root package name */
    public final int f3809d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3810e;

    /* renamed from: f  reason: collision with root package name */
    public c f3811f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f3812g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3813h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3814i;

    /* renamed from: j  reason: collision with root package name */
    public Bitmap f3815j;

    public e(Handler handler, int i3, long j6) {
        if (l.g(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f3809d = Integer.MIN_VALUE;
            this.f3810e = Integer.MIN_VALUE;
            this.f3812g = handler;
            this.f3813h = i3;
            this.f3814i = j6;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final /* bridge */ /* synthetic */ void a(d dVar) {
    }

    public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
    }

    public final void c(c cVar) {
        this.f3811f = cVar;
    }

    public final /* bridge */ /* synthetic */ void d(Drawable drawable) {
    }

    public final /* bridge */ /* synthetic */ void e() {
    }

    public final c f() {
        return this.f3811f;
    }

    public final void g(d dVar) {
        ((g) dVar).n(this.f3809d, this.f3810e);
    }

    public final void h(Drawable drawable) {
        this.f3815j = null;
    }

    public final void i(Object obj) {
        this.f3815j = (Bitmap) obj;
        Handler handler = this.f3812g;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f3814i);
    }

    public final /* bridge */ /* synthetic */ void j() {
    }

    public final /* bridge */ /* synthetic */ void k() {
    }
}
