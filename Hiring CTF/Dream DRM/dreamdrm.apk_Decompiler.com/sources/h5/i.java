package h5;

import b1.o;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class i implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3476a;

    /* renamed from: b  reason: collision with root package name */
    public String f3477b;

    /* renamed from: c  reason: collision with root package name */
    public final List f3478c;

    public i(ArrayList arrayList) {
        this.f3478c = arrayList;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        o.m(obj, "proxy");
        o.m(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (o.c(name, "supports") && o.c(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (!o.c(name, "unsupported") || !o.c(Void.TYPE, returnType)) {
            boolean c6 = o.c(name, "protocols");
            List list = this.f3478c;
            if (c6) {
                if (objArr.length == 0) {
                    return list;
                }
            }
            if ((o.c(name, "selectProtocol") || o.c(name, "select")) && o.c(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 != null) {
                        List list2 = (List) obj2;
                        int size = list2.size();
                        if (size >= 0) {
                            int i3 = 0;
                            while (true) {
                                Object obj3 = list2.get(i3);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!list.contains(str)) {
                                        if (i3 == size) {
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        this.f3477b = str;
                                        return str;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = (String) list.get(0);
                        this.f3477b = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((!o.c(name, "protocolSelected") && !o.c(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 != null) {
                this.f3477b = (String) obj4;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f3476a = true;
        return null;
    }
}
