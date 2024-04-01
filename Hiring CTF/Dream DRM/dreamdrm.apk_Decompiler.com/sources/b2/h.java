package b2;

import android.util.Log;
import androidx.appcompat.widget.a0;
import b1.o;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f1553a = new a0(14);

    /* renamed from: b  reason: collision with root package name */
    public final c f1554b = new c(1);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1555c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1556d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f1557e;

    /* renamed from: f  reason: collision with root package name */
    public int f1558f;

    public h(int i3) {
        this.f1557e = i3;
    }

    public final void a(int i3, Class cls) {
        NavigableMap f6 = f(cls);
        Integer num = (Integer) f6.get(Integer.valueOf(i3));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i3);
            if (intValue == 1) {
                f6.remove(valueOf);
            } else {
                f6.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i3 + ", this: " + this);
        }
    }

    public final void b(int i3) {
        int i6;
        while (this.f1558f > i3) {
            Object A = this.f1553a.A();
            o.i(A);
            a d6 = d(A.getClass());
            int i7 = this.f1558f;
            e eVar = (e) d6;
            int a6 = eVar.a(A);
            switch (eVar.f1545a) {
                case 0:
                    i6 = 1;
                    break;
                default:
                    i6 = 4;
                    break;
            }
            this.f1558f = i7 - (i6 * a6);
            a(eVar.a(A), A.getClass());
            if (Log.isLoggable(eVar.b(), 2)) {
                String b6 = eVar.b();
                Log.v(b6, "evicted: " + eVar.a(A));
            }
        }
    }

    public final synchronized Object c(int i3, Class cls) {
        g gVar;
        boolean z5;
        Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i3));
        boolean z6 = false;
        if (num != null) {
            int i6 = this.f1558f;
            if (i6 != 0) {
                if (this.f1557e / i6 < 2) {
                    z5 = false;
                    if (z5 || num.intValue() <= i3 * 8) {
                        z6 = true;
                    }
                }
            }
            z5 = true;
            z6 = true;
        }
        if (z6) {
            c cVar = this.f1554b;
            int intValue = num.intValue();
            gVar = (g) cVar.c();
            gVar.f1551b = intValue;
            gVar.f1552c = cls;
        } else {
            g gVar2 = (g) this.f1554b.c();
            gVar2.f1551b = i3;
            gVar2.f1552c = cls;
            gVar = gVar2;
        }
        return e(gVar, cls);
    }

    public final a d(Class cls) {
        HashMap hashMap = this.f1556d;
        a aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new e(1);
            } else if (cls.equals(byte[].class)) {
                aVar = new e(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final Object e(g gVar, Class cls) {
        Object obj;
        int i3;
        a d6 = d(cls);
        Object n5 = this.f1553a.n(gVar);
        if (n5 != null) {
            int i6 = this.f1558f;
            e eVar = (e) d6;
            int a6 = eVar.a(n5);
            switch (eVar.f1545a) {
                case 0:
                    i3 = 1;
                    break;
                default:
                    i3 = 4;
                    break;
            }
            this.f1558f = i6 - (i3 * a6);
            a(eVar.a(n5), cls);
        }
        if (n5 != null) {
            return n5;
        }
        e eVar2 = (e) d6;
        if (Log.isLoggable(eVar2.b(), 2)) {
            String b6 = eVar2.b();
            Log.v(b6, "Allocated " + gVar.f1551b + " bytes");
        }
        int i7 = gVar.f1551b;
        switch (eVar2.f1545a) {
            case 0:
                obj = new byte[i7];
                break;
            default:
                obj = new int[i7];
                break;
        }
        return obj;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.f1555c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        int i3;
        Class<?> cls = obj.getClass();
        e eVar = (e) d(cls);
        int a6 = eVar.a(obj);
        int i6 = 1;
        switch (eVar.f1545a) {
            case 0:
                i3 = 1;
                break;
            default:
                i3 = 4;
                break;
        }
        int i7 = i3 * a6;
        if (i7 <= this.f1557e / 2) {
            g gVar = (g) this.f1554b.c();
            gVar.f1551b = a6;
            gVar.f1552c = cls;
            this.f1553a.y(gVar, obj);
            NavigableMap f6 = f(cls);
            Integer num = (Integer) f6.get(Integer.valueOf(gVar.f1551b));
            Integer valueOf = Integer.valueOf(gVar.f1551b);
            if (num != null) {
                i6 = 1 + num.intValue();
            }
            f6.put(valueOf, Integer.valueOf(i6));
            this.f1558f += i7;
            b(this.f1557e);
        }
    }
}
