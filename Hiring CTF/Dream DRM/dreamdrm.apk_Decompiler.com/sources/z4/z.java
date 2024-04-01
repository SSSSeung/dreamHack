package z4;

import androidx.appcompat.widget.w;
import b1.o;
import d5.e;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public w f6117a;

    /* renamed from: b  reason: collision with root package name */
    public x f6118b;

    /* renamed from: c  reason: collision with root package name */
    public int f6119c;

    /* renamed from: d  reason: collision with root package name */
    public String f6120d;

    /* renamed from: e  reason: collision with root package name */
    public p f6121e;

    /* renamed from: f  reason: collision with root package name */
    public q f6122f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f6123g;

    /* renamed from: h  reason: collision with root package name */
    public a0 f6124h;

    /* renamed from: i  reason: collision with root package name */
    public a0 f6125i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f6126j;

    /* renamed from: k  reason: collision with root package name */
    public long f6127k;

    /* renamed from: l  reason: collision with root package name */
    public long f6128l;

    /* renamed from: m  reason: collision with root package name */
    public e f6129m;

    public z() {
        this.f6119c = -1;
        this.f6122f = new q();
    }

    public static void b(String str, a0 a0Var) {
        if (a0Var != null) {
            boolean z5 = true;
            if (a0Var.f5962j == null) {
                if (a0Var.f5963k == null) {
                    if (a0Var.f5964l == null) {
                        if (a0Var.f5965m != null) {
                            z5 = false;
                        }
                        if (!z5) {
                            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        }
    }

    public final a0 a() {
        int i3 = this.f6119c;
        if (i3 >= 0) {
            w wVar = this.f6117a;
            if (wVar != null) {
                x xVar = this.f6118b;
                if (xVar != null) {
                    String str = this.f6120d;
                    if (str != null) {
                        return new a0(wVar, xVar, str, i3, this.f6121e, this.f6122f.b(), this.f6123g, this.f6124h, this.f6125i, this.f6126j, this.f6127k, this.f6128l, this.f6129m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.f6119c).toString());
    }

    public z(a0 a0Var) {
        o.m(a0Var, "response");
        this.f6117a = a0Var.f5956d;
        this.f6118b = a0Var.f5957e;
        this.f6119c = a0Var.f5959g;
        this.f6120d = a0Var.f5958f;
        this.f6121e = a0Var.f5960h;
        this.f6122f = a0Var.f5961i.c();
        this.f6123g = a0Var.f5962j;
        this.f6124h = a0Var.f5963k;
        this.f6125i = a0Var.f5964l;
        this.f6126j = a0Var.f5965m;
        this.f6127k = a0Var.f5966n;
        this.f6128l = a0Var.f5967o;
        this.f6129m = a0Var.f5968p;
    }
}
