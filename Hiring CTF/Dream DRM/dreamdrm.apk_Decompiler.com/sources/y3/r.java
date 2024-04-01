package y3;

import com.google.gson.reflect.TypeToken;
import v3.a0;
import v3.b0;
import v3.n;

public final class r implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5889d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Class f5890e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a0 f5891f;

    public /* synthetic */ r(Class cls, a0 a0Var, int i3) {
        this.f5889d = i3;
        this.f5890e = cls;
        this.f5891f = a0Var;
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        int i3 = this.f5889d;
        Class cls = this.f5890e;
        switch (i3) {
            case 0:
                if (typeToken.f2104a == cls) {
                    return this.f5891f;
                }
                return null;
            default:
                Class cls2 = typeToken.f2104a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                return new c(this, cls2);
        }
    }

    public final String toString() {
        int i3 = this.f5889d;
        a0 a0Var = this.f5891f;
        Class cls = this.f5890e;
        switch (i3) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + a0Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + a0Var + "]";
        }
    }
}
