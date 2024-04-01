package y3;

import a2.m;
import a4.c;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import l2.l;
import v3.a;
import v3.a0;
import v3.b0;
import v3.h;
import v3.i;
import v3.n;
import v3.q;
import x3.t;

public final class o implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final l f5880d;

    /* renamed from: e  reason: collision with root package name */
    public final i f5881e;

    /* renamed from: f  reason: collision with root package name */
    public final x3.i f5882f;

    /* renamed from: g  reason: collision with root package name */
    public final d f5883g;

    /* renamed from: h  reason: collision with root package name */
    public final List f5884h;

    public o(l lVar, x3.i iVar, d dVar, List list) {
        a aVar = h.f5390d;
        this.f5880d = lVar;
        this.f5881e = aVar;
        this.f5882f = iVar;
        this.f5883g = dVar;
        this.f5884h = list;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!t.f5758a.a(obj, accessibleObject)) {
            throw new q(m.h(c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        Class cls = typeToken.f2104a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        com.bumptech.glide.c.p(this.f5884h);
        return c.f208a.f(cls) ? new n(cls, c(nVar, typeToken, cls, true)) : new m(this.f5880d.d(typeToken), c(nVar, typeToken, cls, false));
    }

    /* JADX WARNING: type inference failed for: r1v25, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap c(v3.n r36, com.google.gson.reflect.TypeToken r37, java.lang.Class r38, boolean r39) {
        /*
            r35 = this;
            r0 = r35
            r14 = r36
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            boolean r1 = r38.isInterface()
            if (r1 == 0) goto L_0x0010
            return r15
        L_0x0010:
            r13 = r37
            r12 = r38
        L_0x0014:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r12 == r1) goto L_0x0224
            java.lang.reflect.Field[] r11 = r12.getDeclaredFields()
            r10 = r38
            if (r12 == r10) goto L_0x0028
            int r1 = r11.length
            if (r1 <= 0) goto L_0x0028
            java.util.List r1 = r0.f5884h
            com.bumptech.glide.c.p(r1)
        L_0x0028:
            r16 = 0
            int r9 = r11.length
            r1 = 0
            r8 = r1
        L_0x002d:
            if (r8 >= r9) goto L_0x0204
            r7 = r11[r8]
            r2 = 1
            boolean r3 = r0.d(r7, r2)
            boolean r4 = r0.d(r7, r1)
            if (r3 != 0) goto L_0x004b
            if (r4 != 0) goto L_0x004b
            r2 = r1
            r34 = r8
            r25 = r9
            r26 = r11
            r37 = r12
            r0 = r13
            r1 = r15
            goto L_0x01b7
        L_0x004b:
            java.lang.Class<w3.b> r5 = w3.b.class
            r17 = 0
            if (r39 == 0) goto L_0x0089
            int r6 = r7.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L_0x005c
            goto L_0x008a
        L_0x005c:
            h5.d r6 = a4.c.f208a
            java.lang.reflect.Method r6 = r6.c(r12, r7)
            a4.c.e(r6)
            java.lang.annotation.Annotation r18 = r6.getAnnotation(r5)
            if (r18 == 0) goto L_0x0084
            java.lang.annotation.Annotation r18 = r7.getAnnotation(r5)
            if (r18 == 0) goto L_0x0072
            goto L_0x0084
        L_0x0072:
            java.lang.String r1 = a4.c.d(r6, r1)
            v3.q r2 = new v3.q
            java.lang.String r3 = "@SerializedName on "
            java.lang.String r4 = " is not supported"
            java.lang.String r1 = a2.m.i(r3, r1, r4)
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0084:
            r18 = r4
            r19 = r6
            goto L_0x008e
        L_0x0089:
            r1 = r4
        L_0x008a:
            r18 = r1
            r19 = r17
        L_0x008e:
            if (r19 != 0) goto L_0x0093
            a4.c.e(r7)
        L_0x0093:
            java.lang.reflect.Type r1 = r13.f2105b
            java.lang.reflect.Type r4 = r7.getGenericType()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.reflect.Type r6 = b1.o.T(r1, r12, r4, r6)
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r5)
            w3.b r1 = (w3.b) r1
            if (r1 != 0) goto L_0x00b5
            v3.i r1 = r0.f5881e
            java.lang.String r1 = r1.a(r7)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            goto L_0x00c4
        L_0x00b5:
            java.lang.String r4 = r1.value()
            java.lang.String[] r1 = r1.alternate()
            int r5 = r1.length
            if (r5 != 0) goto L_0x00c8
            java.util.List r1 = java.util.Collections.singletonList(r4)
        L_0x00c4:
            r5 = r1
            r37 = r3
            goto L_0x00d7
        L_0x00c8:
            java.util.ArrayList r5 = new java.util.ArrayList
            r37 = r3
            int r3 = r1.length
            int r3 = r3 + r2
            r5.<init>(r3)
            r5.add(r4)
            java.util.Collections.addAll(r5, r1)
        L_0x00d7:
            int r4 = r5.size()
            r1 = 0
            r3 = r1
            r2 = r17
            r1 = r37
        L_0x00e1:
            if (r3 >= r4) goto L_0x01a7
            java.lang.Object r20 = r5.get(r3)
            r21 = r15
            r15 = r20
            java.lang.String r15 = (java.lang.String) r15
            if (r3 == 0) goto L_0x00f0
            r1 = 0
        L_0x00f0:
            r20 = r1
            com.google.gson.reflect.TypeToken r1 = new com.google.gson.reflect.TypeToken
            r1.<init>(r6)
            r37 = r2
            java.lang.Class r2 = r1.f2104a
            r22 = r3
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0109
            boolean r2 = r2.isPrimitive()
            if (r2 == 0) goto L_0x0109
            r2 = 1
            goto L_0x010a
        L_0x0109:
            r2 = 0
        L_0x010a:
            r23 = r2
            int r2 = r7.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r2)
            if (r3 == 0) goto L_0x011e
            boolean r2 = java.lang.reflect.Modifier.isFinal(r2)
            if (r2 == 0) goto L_0x011e
            r2 = 1
            goto L_0x011f
        L_0x011e:
            r2 = 0
        L_0x011f:
            r24 = r2
            java.lang.Class<w3.a> r2 = w3.a.class
            java.lang.annotation.Annotation r2 = r7.getAnnotation(r2)
            w3.a r2 = (w3.a) r2
            if (r2 == 0) goto L_0x0137
            y3.d r3 = r0.f5883g
            r3.getClass()
            l2.l r3 = r0.f5880d
            v3.a0 r2 = y3.d.b(r3, r14, r1, r2)
            goto L_0x0139
        L_0x0137:
            r2 = r17
        L_0x0139:
            if (r2 == 0) goto L_0x013d
            r3 = 1
            goto L_0x013e
        L_0x013d:
            r3 = 0
        L_0x013e:
            r25 = r3
            if (r2 != 0) goto L_0x0146
            v3.a0 r2 = r14.b(r1)
        L_0x0146:
            r26 = r2
            y3.k r3 = new y3.k
            r27 = r1
            r1 = r3
            r28 = r37
            r2 = r15
            r29 = r3
            r3 = r7
            r30 = r4
            r4 = r20
            r31 = r5
            r5 = r18
            r32 = r6
            r6 = r16
            r33 = r7
            r7 = r19
            r34 = r8
            r8 = r25
            r25 = r9
            r9 = r26
            r10 = r36
            r26 = r11
            r11 = r27
            r37 = r12
            r12 = r23
            r0 = r13
            r13 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = r21
            r2 = r29
            java.lang.Object r2 = r1.put(r15, r2)
            y3.k r2 = (y3.k) r2
            r3 = r28
            if (r3 != 0) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r2 = r3
        L_0x018b:
            int r3 = r22 + 1
            r12 = r37
            r10 = r38
            r13 = r0
            r15 = r1
            r1 = r20
            r9 = r25
            r11 = r26
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r0 = r35
            goto L_0x00e1
        L_0x01a7:
            r3 = r2
            r33 = r7
            r34 = r8
            r25 = r9
            r26 = r11
            r37 = r12
            r0 = r13
            r1 = r15
            r2 = 0
            if (r3 != 0) goto L_0x01c8
        L_0x01b7:
            int r8 = r34 + 1
            r12 = r37
            r10 = r38
            r13 = r0
            r15 = r1
            r1 = r2
            r9 = r25
            r11 = r26
            r0 = r35
            goto L_0x002d
        L_0x01c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            java.lang.String r2 = r38.getName()
            r1.append(r2)
            java.lang.String r2 = " declares multiple JSON fields named '"
            r1.append(r2)
            java.lang.String r2 = r3.f5866a
            r1.append(r2)
            java.lang.String r2 = "'; conflict is caused by fields "
            r1.append(r2)
            java.lang.reflect.Field r2 = r3.f5867b
            java.lang.String r2 = a4.c.c(r2)
            r1.append(r2)
            java.lang.String r2 = " and "
            r1.append(r2)
            java.lang.String r2 = a4.c.c(r33)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0204:
            r37 = r12
            r0 = r13
            r1 = r15
            java.lang.reflect.Type r0 = r0.f2105b
            java.lang.reflect.Type r2 = r37.getGenericSuperclass()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r37
            java.lang.reflect.Type r0 = b1.o.T(r0, r4, r2, r3)
            com.google.gson.reflect.TypeToken r13 = new com.google.gson.reflect.TypeToken
            r13.<init>(r0)
            java.lang.Class r12 = r13.f2104a
            r0 = r35
            goto L_0x0014
        L_0x0224:
            r1 = r15
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.o.c(v3.n, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public final boolean d(Field field, boolean z5) {
        boolean z6;
        boolean z7;
        Class<?> type = field.getType();
        x3.i iVar = this.f5882f;
        iVar.getClass();
        if (!x3.i.c(type)) {
            iVar.b(z5);
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            return false;
        }
        if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !x3.i.c(field.getType())) {
            List list = z5 ? iVar.f5728d : iVar.f5729e;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    m.o(it.next());
                    throw null;
                }
            }
            z7 = false;
        } else {
            z7 = true;
        }
        return !z7;
    }
}
