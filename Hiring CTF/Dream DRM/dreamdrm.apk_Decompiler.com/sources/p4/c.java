package p4;

import b1.o;
import b1.v;
import g4.i;
import g4.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n.a;
import o4.d;
import o4.e;
import o4.f;
import t4.b;

public final class c implements b, b {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f4858b;

    /* renamed from: a  reason: collision with root package name */
    public final Class f4859a;

    static {
        int i3 = 0;
        Class<a> cls = a.class;
        List E = v.E(o4.a.class, o4.c.class, e.class, f.class, cls, cls, cls, cls, cls, cls, cls, cls, o4.b.class, cls, cls, cls, cls, cls, cls, cls, cls, cls, d.class);
        ArrayList arrayList = new ArrayList(i.W(E));
        for (Object next : E) {
            int i6 = i3 + 1;
            if (i3 >= 0) {
                arrayList.add(new f4.c((Class) next, Integer.valueOf(i3)));
                i3 = i6;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f4858b = q.g0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        o.l(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            o.l(str, "kotlinName");
            sb.append(v4.i.m0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f4858b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.I(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), v4.i.m0((String) entry2.getValue()));
        }
    }

    public c(Class cls) {
        o.m(cls, "jClass");
        this.f4859a = cls;
    }

    public final Class a() {
        return this.f4859a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && o.c(o.y(this), o.y((b) obj));
    }

    public final int hashCode() {
        return o.y(this).hashCode();
    }

    public final String toString() {
        return this.f4859a.toString() + " (Kotlin reflection is not available)";
    }
}
