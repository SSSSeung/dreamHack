package z4;

import b1.o;
import java.util.ArrayList;
import java.util.Arrays;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6025a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f6026b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f6027c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6028d;

    public i() {
        this.f6025a = true;
    }

    public final j a() {
        return new j(this.f6025a, this.f6028d, this.f6026b, this.f6027c);
    }

    public final void b(String... strArr) {
        o.m(strArr, "cipherSuites");
        if (this.f6025a) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.f6026b = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void c(h... hVarArr) {
        o.m(hVarArr, "cipherSuites");
        if (this.f6025a) {
            ArrayList arrayList = new ArrayList(hVarArr.length);
            for (h hVar : hVarArr) {
                arrayList.add(hVar.f6024a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                b((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void d() {
        if (this.f6025a) {
            this.f6028d = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public final void e(String... strArr) {
        o.m(strArr, "tlsVersions");
        if (this.f6025a) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.f6027c = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public final void f(e0... e0VarArr) {
        if (this.f6025a) {
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                arrayList.add(e0Var.f5997d);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                e((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public i(j jVar) {
        this.f6025a = jVar.f6031a;
        this.f6026b = jVar.f6033c;
        this.f6027c = jVar.f6034d;
        this.f6028d = jVar.f6032b;
    }
}
