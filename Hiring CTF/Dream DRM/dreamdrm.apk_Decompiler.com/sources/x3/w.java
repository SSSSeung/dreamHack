package x3;

import java.lang.reflect.Method;

public final class w extends y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5763b;

    public w(Method method) {
        this.f5763b = method;
    }

    public final Object b(Class cls) {
        y.a(cls);
        return this.f5763b.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
