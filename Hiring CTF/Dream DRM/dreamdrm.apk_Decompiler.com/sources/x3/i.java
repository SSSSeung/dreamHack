package x3;

import a2.m;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v3.a0;
import v3.b0;
import v3.n;

public final class i implements b0, Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final i f5727f = new i();

    /* renamed from: d  reason: collision with root package name */
    public final List f5728d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public final List f5729e = Collections.emptyList();

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if (!((cls.getModifiers() & 8) != 0)) {
            return cls.isAnonymousClass() || cls.isLocalClass();
        }
        return false;
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        boolean z5;
        boolean z6;
        boolean c6 = c(typeToken.f2104a);
        if (!c6) {
            b(true);
            z5 = false;
        } else {
            z5 = true;
        }
        if (!c6) {
            b(false);
            z6 = false;
        } else {
            z6 = true;
        }
        if (z5 || z6) {
            return new h(this, z6, z5, nVar, typeToken);
        }
        return null;
    }

    public final void b(boolean z5) {
        Iterator it = (z5 ? this.f5728d : this.f5729e).iterator();
        if (it.hasNext()) {
            m.o(it.next());
            throw null;
        }
    }

    public final Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }
}
