package z4;

import androidx.appcompat.widget.w;
import d5.e;
import java.io.Closeable;

public final class a0 implements Closeable {

    /* renamed from: d  reason: collision with root package name */
    public final w f5956d;

    /* renamed from: e  reason: collision with root package name */
    public final x f5957e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5958f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5959g;

    /* renamed from: h  reason: collision with root package name */
    public final p f5960h;

    /* renamed from: i  reason: collision with root package name */
    public final r f5961i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f5962j;

    /* renamed from: k  reason: collision with root package name */
    public final a0 f5963k;

    /* renamed from: l  reason: collision with root package name */
    public final a0 f5964l;

    /* renamed from: m  reason: collision with root package name */
    public final a0 f5965m;

    /* renamed from: n  reason: collision with root package name */
    public final long f5966n;

    /* renamed from: o  reason: collision with root package name */
    public final long f5967o;

    /* renamed from: p  reason: collision with root package name */
    public final e f5968p;

    public a0(w wVar, x xVar, String str, int i3, p pVar, r rVar, c0 c0Var, a0 a0Var, a0 a0Var2, a0 a0Var3, long j6, long j7, e eVar) {
        this.f5956d = wVar;
        this.f5957e = xVar;
        this.f5958f = str;
        this.f5959g = i3;
        this.f5960h = pVar;
        this.f5961i = rVar;
        this.f5962j = c0Var;
        this.f5963k = a0Var;
        this.f5964l = a0Var2;
        this.f5965m = a0Var3;
        this.f5966n = j6;
        this.f5967o = j7;
        this.f5968p = eVar;
    }

    public static String b(a0 a0Var, String str) {
        a0Var.getClass();
        String a6 = a0Var.f5961i.a(str);
        if (a6 != null) {
            return a6;
        }
        return null;
    }

    public final void close() {
        c0 c0Var = this.f5962j;
        if (c0Var != null) {
            c0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final String toString() {
        return "Response{protocol=" + this.f5957e + ", code=" + this.f5959g + ", message=" + this.f5958f + ", url=" + ((t) this.f5956d.f820c) + '}';
    }
}
