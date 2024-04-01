package x3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class r extends t {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5757b;

    public r(Method method) {
        this.f5757b = method;
    }

    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f5757b.invoke(accessibleObject, new Object[]{obj})).booleanValue();
        } catch (Exception e6) {
            throw new RuntimeException("Failed invoking canAccess", e6);
        }
    }
}
