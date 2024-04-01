package y3;

import com.google.gson.reflect.TypeToken;
import v3.a0;
import v3.b0;
import v3.n;

public final class s implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5892d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Class f5893e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Class f5894f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a0 f5895g;

    public /* synthetic */ s(Class cls, Class cls2, a0 a0Var, int i3) {
        this.f5892d = i3;
        this.f5893e = cls;
        this.f5894f = cls2;
        this.f5895g = a0Var;
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        int i3 = this.f5892d;
        Class cls = this.f5894f;
        a0 a0Var = this.f5895g;
        Class cls2 = this.f5893e;
        switch (i3) {
            case 0:
                Class cls3 = typeToken.f2104a;
                if (cls3 == cls2 || cls3 == cls) {
                    return a0Var;
                }
                return null;
            default:
                Class cls4 = typeToken.f2104a;
                if (cls4 == cls2 || cls4 == cls) {
                    return a0Var;
                }
                return null;
        }
    }

    public final String toString() {
        int i3 = this.f5892d;
        a0 a0Var = this.f5895g;
        Class cls = this.f5893e;
        Class cls2 = this.f5894f;
        switch (i3) {
            case 0:
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + a0Var + "]";
            default:
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + a0Var + "]";
        }
    }
}
