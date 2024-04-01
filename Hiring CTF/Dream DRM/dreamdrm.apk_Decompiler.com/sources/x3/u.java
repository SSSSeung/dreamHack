package x3;

import java.lang.reflect.Method;

public final class u extends y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5759b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5760c;

    public u(Method method, Object obj) {
        this.f5759b = method;
        this.f5760c = obj;
    }

    public final Object b(Class cls) {
        y.a(cls);
        return this.f5759b.invoke(this.f5760c, new Object[]{cls});
    }
}
