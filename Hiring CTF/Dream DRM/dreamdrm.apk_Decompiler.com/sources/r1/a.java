package r1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.q;
import b1.o;
import com.theori.dreamdrm.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f4912d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f4913e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4914a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f4915b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f4916c;

    public a(Context context) {
        this.f4916c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f4912d == null) {
            synchronized (f4913e) {
                if (f4912d == null) {
                    f4912d = new a(context);
                }
            }
        }
        return f4912d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4916c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f4915b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new q((Throwable) e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (o.D()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f4914a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a6 = bVar.a();
                if (!a6.isEmpty()) {
                    for (Class cls2 : a6) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f4916c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
