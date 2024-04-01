package a4;

import a2.m;
import h5.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import v3.q;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final d f208a;

    static {
        d dVar;
        try {
            dVar = new b();
        } catch (NoSuchMethodException unused) {
            dVar = new a();
        }
        f208a = dVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i3].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(java.lang.reflect.AccessibleObject r4, boolean r5) {
        /*
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r0.<init>(r2)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = c(r4)
            goto L_0x005d
        L_0x0014:
            boolean r0 = r4 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L_0x004c
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r4.getName()
            r0.<init>(r2)
            a(r4, r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "method '"
            r2.<init>(r3)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = "#"
            r2.append(r4)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L_0x0076
        L_0x004c:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L_0x0064
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "constructor '"
            r0.<init>(r2)
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.String r4 = b(r4)
        L_0x005d:
            r0.append(r4)
            r0.append(r1)
            goto L_0x0072
        L_0x0064:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<unknown AccessibleObject> "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
        L_0x0072:
            java.lang.String r4 = r0.toString()
        L_0x0076:
            if (r5 == 0) goto L_0x009f
            r5 = 0
            char r0 = r4.charAt(r5)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto L_0x009f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r5 = r4.charAt(r5)
            char r5 = java.lang.Character.toUpperCase(r5)
            r0.append(r5)
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L_0x009f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.c.d(java.lang.reflect.AccessibleObject, boolean):java.lang.String");
    }

    public static void e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e6) {
            throw new q(m.i("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e6);
        }
    }
}
