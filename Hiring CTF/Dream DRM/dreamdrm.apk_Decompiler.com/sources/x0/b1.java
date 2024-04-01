package x0;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.c;
import f4.h;
import i4.d;
import j4.a;
import k4.g;
import o4.e;

public final class b1 extends g implements e {

    /* renamed from: f  reason: collision with root package name */
    public int f5545f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f5546g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ View f5547h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(View view, d dVar) {
        super(dVar);
        this.f5547h = view;
    }

    public final d b(Object obj, d dVar) {
        b1 b1Var = new b1(this.f5547h, dVar);
        b1Var.f5546g = obj;
        return b1Var;
    }

    public final Object h(Object obj, Object obj2) {
        return ((b1) b((u4.g) obj, (d) obj2)).j(h.f2682a);
    }

    public final Object j(Object obj) {
        a aVar = a.f3845d;
        int i3 = this.f5545f;
        View view = this.f5547h;
        if (i3 != 0) {
            if (i3 == 1) {
                u4.g gVar = (u4.g) this.f5546g;
                c.M(obj);
                if (view instanceof ViewGroup) {
                    y0 y0Var = new y0(2, new z0((ViewGroup) view, (d) null));
                    this.f5546g = null;
                    this.f5545f = 2;
                    if (gVar.c(y0Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i3 == 2) {
                c.M(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return h.f2682a;
        }
        c.M(obj);
        u4.g gVar2 = (u4.g) this.f5546g;
        this.f5546g = gVar2;
        this.f5545f = 1;
        gVar2.b(view, this);
        return aVar;
    }
}
