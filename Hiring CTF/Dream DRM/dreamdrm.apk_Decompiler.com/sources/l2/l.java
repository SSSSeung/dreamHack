package l2;

import a2.m;
import android.view.View;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import n2.c;
import y0.b0;

public final class l implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4101d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4102e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4103f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4104g;

    public l() {
        this.f4101d = 0;
        this.f4103f = Collections.newSetFromMap(new WeakHashMap());
        this.f4104g = new ArrayList();
    }

    public static String a(Class cls) {
        String name;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            name = cls.getName();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            name = cls.getName();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        return str.concat(name);
    }

    public final boolean b(View view) {
        m.o(this.f4103f);
        throw null;
    }

    public final boolean c(c cVar) {
        boolean z5 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f4103f).remove(cVar);
        if (!((List) this.f4104g).remove(cVar) && !remove) {
            z5 = false;
        }
        if (z5) {
            cVar.clear();
        }
        return z5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x3.q d(com.google.gson.reflect.TypeToken r9) {
        /*
            r8 = this;
            java.lang.reflect.Type r0 = r9.f2105b
            java.lang.Object r1 = r8.f4103f
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r1.get(r0)
            a2.m.o(r2)
            java.lang.Class r9 = r9.f2104a
            java.lang.Object r1 = r1.get(r9)
            a2.m.o(r1)
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r9)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0027
            x3.f r1 = new x3.f
            r1.<init>(r0, r4)
            goto L_0x0032
        L_0x0027:
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r9 != r1) goto L_0x0031
            x3.f r1 = new x3.f
            r1.<init>(r0, r2)
            goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            if (r1 == 0) goto L_0x0035
            return r1
        L_0x0035:
            java.lang.Object r1 = r8.f4104g
            java.util.List r1 = (java.util.List) r1
            com.bumptech.glide.c.p(r1)
            int r1 = r9.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 == 0) goto L_0x0047
            goto L_0x0084
        L_0x0047:
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0084 }
            java.lang.reflect.Constructor r1 = r9.getDeclaredConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0084 }
            h5.d r5 = a4.c.f208a
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x0054 }
            r5 = r3
            goto L_0x0073
        L_0x0054:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed making constructor '"
            r6.<init>(r7)
            java.lang.String r7 = a4.c.b(r1)
            r6.append(r7)
            java.lang.String r7 = "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L_0x0073:
            if (r5 == 0) goto L_0x007b
            x3.g r1 = new x3.g
            r1.<init>(r2, r5)
            goto L_0x0085
        L_0x007b:
            e2.f r5 = new e2.f
            r6 = 16
            r5.<init>(r6, r1)
            r1 = r5
            goto L_0x0085
        L_0x0084:
            r1 = r3
        L_0x0085:
            if (r1 == 0) goto L_0x0088
            return r1
        L_0x0088:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r9)
            r5 = 27
            if (r1 == 0) goto L_0x00ca
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 == 0) goto L_0x00a3
            e2.d0 r3 = new e2.d0
            r0 = 22
            r3.<init>(r0)
            goto L_0x0129
        L_0x00a3:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 == 0) goto L_0x00b4
            e2.d0 r3 = new e2.d0
            r0 = 23
            r3.<init>(r0)
            goto L_0x0129
        L_0x00b4:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r9)
            e2.d0 r3 = new e2.d0
            if (r0 == 0) goto L_0x00c4
            r0 = 24
            r3.<init>(r0)
            goto L_0x0129
        L_0x00c4:
            r0 = 25
            r3.<init>(r0)
            goto L_0x0129
        L_0x00ca:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r9)
            if (r1 == 0) goto L_0x0129
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r1 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r1 = r1.isAssignableFrom(r9)
            if (r1 == 0) goto L_0x00e2
            e2.d0 r3 = new e2.d0
            r0 = 26
            r3.<init>(r0)
            goto L_0x0129
        L_0x00e2:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r1 = java.util.concurrent.ConcurrentMap.class
            boolean r1 = r1.isAssignableFrom(r9)
            if (r1 == 0) goto L_0x00f0
            e2.d0 r3 = new e2.d0
            r3.<init>(r5)
            goto L_0x0129
        L_0x00f0:
            java.lang.Class<java.util.SortedMap> r1 = java.util.SortedMap.class
            boolean r1 = r1.isAssignableFrom(r9)
            if (r1 == 0) goto L_0x0100
            e2.d0 r3 = new e2.d0
            r0 = 28
            r3.<init>(r0)
            goto L_0x0129
        L_0x0100:
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x0123
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r4]
            com.google.gson.reflect.TypeToken r1 = new com.google.gson.reflect.TypeToken
            r1.<init>(r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r1 = r1.f2104a
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0123
            e2.d0 r3 = new e2.d0
            r0 = 29
            r3.<init>(r0)
            goto L_0x0129
        L_0x0123:
            x3.d r0 = new x3.d
            r0.<init>(r3)
            r3 = r0
        L_0x0129:
            if (r3 == 0) goto L_0x012c
            return r3
        L_0x012c:
            java.lang.String r0 = a(r9)
            if (r0 == 0) goto L_0x0138
            x3.e r9 = new x3.e
            r9.<init>(r0, r2)
            return r9
        L_0x0138:
            boolean r0 = r8.f4102e
            if (r0 == 0) goto L_0x0142
            androidx.appcompat.widget.a0 r0 = new androidx.appcompat.widget.a0
            r0.<init>((java.lang.Object) r8, (java.lang.Object) r9, (int) r5)
            goto L_0x015a
        L_0x0142:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create instance of "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            x3.e r0 = new x3.e
            r0.<init>(r9, r4)
        L_0x015a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.l.d(com.google.gson.reflect.TypeToken):x3.q");
    }

    public final void e() {
        Iterator it = r2.l.d((Set) this.f4103f).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.h() && !cVar.i()) {
                cVar.clear();
                if (!this.f4102e) {
                    cVar.e();
                } else {
                    ((List) this.f4104g).add(cVar);
                }
            }
        }
    }

    public final void f() {
        this.f4102e = false;
        Iterator it = r2.l.d((Set) this.f4103f).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.h() && !cVar.isRunning()) {
                cVar.e();
            }
        }
        ((List) this.f4104g).clear();
    }

    public final String toString() {
        int i3 = this.f4101d;
        Object obj = this.f4103f;
        switch (i3) {
            case 0:
                return super.toString() + "{numRequests=" + ((Set) obj).size() + ", isPaused=" + this.f4102e + "}";
            case 2:
                return ((Map) obj).toString();
            default:
                return super.toString();
        }
    }

    public l(Map map, List list) {
        this.f4101d = 2;
        this.f4103f = map;
        this.f4102e = true;
        this.f4104g = list;
    }
}
