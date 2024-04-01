package j4;

import b1.o;
import b1.v;
import com.bumptech.glide.c;
import i4.d;
import k4.f;
import o4.e;

public final class b extends f {

    /* renamed from: e  reason: collision with root package name */
    public int f3847e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f3848f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3849g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Object obj, d dVar, e eVar) {
        super(dVar);
        this.f3848f = eVar;
        this.f3849g = obj;
        o.j(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object j(Object obj) {
        int i3 = this.f3847e;
        if (i3 == 0) {
            this.f3847e = 1;
            c.M(obj);
            e eVar = this.f3848f;
            o.j(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            v.b(2, eVar);
            return eVar.h(this.f3849g, this);
        } else if (i3 == 1) {
            this.f3847e = 2;
            c.M(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
