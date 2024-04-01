package androidx.savedstate;

import a2.m;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.k0;
import androidx.lifecycle.l;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import b1.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q1.b;
import q1.d;
import q1.f;

public final class Recreator implements p {

    /* renamed from: d  reason: collision with root package name */
    public final f f1478d;

    public Recreator(f fVar) {
        o.m(fVar, "owner");
        this.f1478d = fVar;
    }

    public final void b(r rVar, l lVar) {
        Object obj;
        boolean z5;
        if (lVar == l.ON_CREATE) {
            rVar.h().t(this);
            Bundle a6 = this.f1478d.b().a("androidx.savedstate.Restarter");
            if (a6 != null) {
                ArrayList<String> stringArrayList = a6.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                            o.l(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    o.l(newInstance, "{\n                constr…wInstance()\n            }");
                                    b bVar = (b) newInstance;
                                    f fVar = this.f1478d;
                                    o.m(fVar, "owner");
                                    if (fVar instanceof n0) {
                                        m0 e6 = ((n0) fVar).e();
                                        d b6 = fVar.b();
                                        e6.getClass();
                                        Iterator it = new HashSet(e6.f1376a.keySet()).iterator();
                                        while (it.hasNext()) {
                                            String str = (String) it.next();
                                            o.m(str, "key");
                                            k0 k0Var = (k0) e6.f1376a.get(str);
                                            o.k(k0Var);
                                            t h6 = fVar.h();
                                            o.m(b6, "registry");
                                            o.m(h6, "lifecycle");
                                            HashMap hashMap = k0Var.f1368a;
                                            if (hashMap == null) {
                                                obj = null;
                                            } else {
                                                synchronized (hashMap) {
                                                    obj = k0Var.f1368a.get("androidx.lifecycle.savedstate.vm.tag");
                                                }
                                            }
                                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                                            if (savedStateHandleController != null && !z5) {
                                                if (!(!(z5 = savedStateHandleController.f1341d))) {
                                                    throw new IllegalStateException("Already attached to lifecycleOwner".toString());
                                                }
                                                savedStateHandleController.f1341d = true;
                                                h6.a(savedStateHandleController);
                                                throw null;
                                            }
                                        }
                                        if (!new HashSet(e6.f1376a.keySet()).isEmpty()) {
                                            b6.d();
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                    }
                                } catch (Exception e7) {
                                    throw new RuntimeException("Failed to instantiate " + next, e7);
                                }
                            } catch (NoSuchMethodException e8) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                            }
                        } catch (ClassNotFoundException e9) {
                            throw new RuntimeException(m.i("Class ", next, " wasn't found"), e9);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
