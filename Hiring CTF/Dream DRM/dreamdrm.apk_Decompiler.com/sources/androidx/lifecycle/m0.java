package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1376a = new LinkedHashMap();

    public final void a() {
        for (k0 k0Var : this.f1376a.values()) {
            HashMap hashMap = k0Var.f1368a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object next : k0Var.f1368a.values()) {
                        if (next instanceof Closeable) {
                            try {
                                ((Closeable) next).close();
                            } catch (IOException e6) {
                                throw new RuntimeException(e6);
                            }
                        }
                    }
                }
            }
            LinkedHashSet linkedHashSet = k0Var.f1369b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : k0Var.f1369b) {
                        if (closeable instanceof Closeable) {
                            try {
                                closeable.close();
                            } catch (IOException e7) {
                                throw new RuntimeException(e7);
                            }
                        }
                    }
                }
            }
            k0Var.a();
        }
        this.f1376a.clear();
    }
}
