package j4;

import b1.o;
import b1.v;
import i4.d;
import i4.h;
import o4.e;

public final class c extends k4.c {

    /* renamed from: g  reason: collision with root package name */
    public int f3850g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f3851h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f3852i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, h hVar, e eVar, Object obj) {
        super(dVar, hVar);
        this.f3851h = eVar;
        this.f3852i = obj;
        o.j(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object j(Object obj) {
        int i3 = this.f3850g;
        if (i3 == 0) {
            this.f3850g = 1;
            com.bumptech.glide.c.M(obj);
            e eVar = this.f3851h;
            o.j(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            v.b(2, eVar);
            return eVar.h(this.f3852i, this);
        } else if (i3 == 1) {
            this.f3850g = 2;
            com.bumptech.glide.c.M(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
