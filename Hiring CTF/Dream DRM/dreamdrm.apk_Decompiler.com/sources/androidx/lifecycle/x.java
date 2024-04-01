package androidx.lifecycle;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Map f1392a;

    public x(int i3) {
        if (i3 == 1) {
            this.f1392a = new HashMap();
        } else if (i3 != 3) {
            this.f1392a = new HashMap();
        } else {
            this.f1392a = new HashMap();
        }
    }

    public x(x xVar) {
        this.f1392a = Collections.unmodifiableMap(new HashMap(xVar.f1392a));
    }
}
