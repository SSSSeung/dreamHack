package y3;

import com.google.gson.reflect.TypeToken;
import v3.a0;
import v3.b0;
import v3.n;
import v3.z;

public final class h implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5860d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f5861e;

    public /* synthetic */ h(int i3, Object obj) {
        this.f5860d = i3;
        this.f5861e = obj;
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        int i3 = this.f5860d;
        Object obj = this.f5861e;
        switch (i3) {
            case 0:
                if (typeToken.f2104a == Number.class) {
                    return (i) obj;
                }
                return null;
            default:
                if (typeToken.f2104a == Object.class) {
                    return new j(nVar, (z) obj);
                }
                return null;
        }
    }
}
