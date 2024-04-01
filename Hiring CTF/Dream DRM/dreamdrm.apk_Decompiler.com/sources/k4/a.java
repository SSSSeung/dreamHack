package k4;

import androidx.activity.result.c;
import b1.o;
import i4.d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class a implements d, d, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final d f3968d;

    public a(d dVar) {
        this.f3968d = dVar;
    }

    public d b(Object obj, d dVar) {
        o.m(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public d c() {
        d dVar = this.f3968d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public StackTraceElement e() {
        int i3;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v5 = eVar.v();
        if (v5 <= 1) {
            int i6 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i3 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i3 = -1;
            }
            if (i3 >= 0) {
                i6 = eVar.l()[i3];
            }
            c cVar = com.bumptech.glide.d.f1701b;
            c cVar2 = com.bumptech.glide.d.f1700a;
            if (cVar == null) {
                try {
                    c cVar3 = new c(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]), 11);
                    com.bumptech.glide.d.f1701b = cVar3;
                    cVar = cVar3;
                } catch (Exception unused2) {
                    com.bumptech.glide.d.f1701b = cVar2;
                    cVar = cVar2;
                }
            }
            if (cVar != cVar2) {
                Method method = (Method) cVar.f327e;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = (Method) cVar.f328f;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = (Method) cVar.f329g;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i6);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v5 + ". Please update the Kotlin standard library.").toString());
    }

    public final void g(Object obj) {
        d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            d dVar2 = aVar.f3968d;
            o.k(dVar2);
            try {
                obj = aVar.j(obj);
                if (obj == j4.a.f3845d) {
                    return;
                }
            } catch (Throwable th) {
                obj = com.bumptech.glide.c.k(th);
            }
            aVar.k();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.g(obj);
                return;
            }
        }
    }

    public abstract Object j(Object obj);

    public void k() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object e6 = e();
        if (e6 == null) {
            e6 = getClass().getName();
        }
        sb.append(e6);
        return sb.toString();
    }
}
