package h;

import android.content.Context;
import android.view.MenuItem;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.b;
import k.i;
import k.j;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public Object f3098a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3099b;

    /* renamed from: c  reason: collision with root package name */
    public i f3100c;

    public d() {
    }

    public d(Context context) {
        this.f3098a = context;
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void c();

    public abstract Object d(int i3, int i6);

    public abstract b e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i3);

    public abstract Object k(int i3, Object obj);

    public final MenuItem m(MenuItem menuItem) {
        if (!(menuItem instanceof s0.b)) {
            return menuItem;
        }
        s0.b bVar = (s0.b) menuItem;
        if (((j) this.f3099b) == null) {
            this.f3099b = new j();
        }
        MenuItem menuItem2 = (MenuItem) ((j) this.f3099b).getOrDefault(bVar, (Object) null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        w wVar = new w((Context) this.f3098a, bVar);
        ((j) this.f3099b).put(bVar, wVar);
        return wVar;
    }

    public final Object[] o(int i3, Object[] objArr) {
        int f6 = f();
        if (objArr.length < f6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), f6);
        }
        for (int i6 = 0; i6 < f6; i6++) {
            objArr[i6] = d(i6, i3);
        }
        if (objArr.length > f6) {
            objArr[f6] = null;
        }
        return objArr;
    }
}
