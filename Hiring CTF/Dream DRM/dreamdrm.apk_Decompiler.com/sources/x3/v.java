package x3;

import java.lang.reflect.Method;

public final class v extends y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5761b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5762c;

    public v(int i3, Method method) {
        this.f5761b = method;
        this.f5762c = i3;
    }

    public final Object b(Class cls) {
        y.a(cls);
        return this.f5761b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f5762c)});
    }
}
