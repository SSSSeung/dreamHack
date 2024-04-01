package e5;

import androidx.appcompat.widget.w;
import b1.o;
import d5.e;
import d5.j;
import java.util.List;
import z4.a0;
import z4.t;
import z4.u;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f2594a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2595b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2596c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2597d;

    /* renamed from: e  reason: collision with root package name */
    public final e f2598e;

    /* renamed from: f  reason: collision with root package name */
    public final w f2599f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2600g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2601h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2602i;

    public f(j jVar, List list, int i3, e eVar, w wVar, int i6, int i7, int i8) {
        o.m(jVar, "call");
        o.m(list, "interceptors");
        o.m(wVar, "request");
        this.f2595b = jVar;
        this.f2596c = list;
        this.f2597d = i3;
        this.f2598e = eVar;
        this.f2599f = wVar;
        this.f2600g = i6;
        this.f2601h = i7;
        this.f2602i = i8;
    }

    public static f a(f fVar, int i3, e eVar, w wVar, int i6) {
        if ((i6 & 1) != 0) {
            i3 = fVar.f2597d;
        }
        int i7 = i3;
        if ((i6 & 2) != 0) {
            eVar = fVar.f2598e;
        }
        e eVar2 = eVar;
        if ((i6 & 4) != 0) {
            wVar = fVar.f2599f;
        }
        w wVar2 = wVar;
        int i8 = (i6 & 8) != 0 ? fVar.f2600g : 0;
        int i9 = (i6 & 16) != 0 ? fVar.f2601h : 0;
        int i10 = (i6 & 32) != 0 ? fVar.f2602i : 0;
        fVar.getClass();
        o.m(wVar2, "request");
        return new f(fVar.f2595b, fVar.f2596c, i7, eVar2, wVar2, i8, i9, i10);
    }

    public final a0 b(w wVar) {
        o.m(wVar, "request");
        List list = this.f2596c;
        int size = list.size();
        boolean z5 = false;
        int i3 = this.f2597d;
        if (i3 < size) {
            this.f2594a++;
            e eVar = this.f2598e;
            if (eVar != null) {
                if (eVar.f2206e.b((t) wVar.f820c)) {
                    if (!(this.f2594a == 1)) {
                        throw new IllegalStateException(("network interceptor " + ((u) list.get(i3 - 1)) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + ((u) list.get(i3 - 1)) + " must retain the same host and port").toString());
                }
            }
            int i6 = i3 + 1;
            f a6 = a(this, i6, (e) null, wVar, 58);
            u uVar = (u) list.get(i3);
            a0 a7 = uVar.a(a6);
            if (a7 != null) {
                if (eVar != null) {
                    if (!(i6 >= list.size() || a6.f2594a == 1)) {
                        throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a7.f5962j != null) {
                    z5 = true;
                }
                if (z5) {
                    return a7;
                }
                throw new IllegalStateException(("interceptor " + uVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
