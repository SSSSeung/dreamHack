package z4;

import a5.c;
import g4.l;
import h4.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import x3.d;

public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final j f6029e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f6030f = new j(false, false, (String[]) null, (String[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6031a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6032b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f6033c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f6034d;

    static {
        h hVar = h.f6020q;
        h hVar2 = h.f6021r;
        h hVar3 = h.f6022s;
        h hVar4 = h.f6014k;
        h hVar5 = h.f6016m;
        h hVar6 = h.f6015l;
        h hVar7 = h.f6017n;
        h hVar8 = h.f6019p;
        h hVar9 = h.f6018o;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f6012i, h.f6013j, h.f6010g, h.f6011h, h.f6008e, h.f6009f, h.f6007d};
        i iVar = new i();
        iVar.c((h[]) Arrays.copyOf(hVarArr, 9));
        e0 e0Var = e0.f5991e;
        e0 e0Var2 = e0.f5992f;
        iVar.f(e0Var, e0Var2);
        iVar.d();
        iVar.a();
        i iVar2 = new i();
        iVar2.c((h[]) Arrays.copyOf(hVarArr2, 16));
        iVar2.f(e0Var, e0Var2);
        iVar2.d();
        f6029e = iVar2.a();
        i iVar3 = new i();
        iVar3.c((h[]) Arrays.copyOf(hVarArr2, 16));
        iVar3.f(e0Var, e0Var2, e0.f5993g, e0.f5994h);
        iVar3.d();
        iVar3.a();
    }

    public j(boolean z5, boolean z6, String[] strArr, String[] strArr2) {
        this.f6031a = z5;
        this.f6032b = z6;
        this.f6033c = strArr;
        this.f6034d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f6033c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String o5 : strArr) {
            arrayList.add(h.f6023t.o(o5));
        }
        return l.d0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f6031a) {
            return false;
        }
        String[] strArr = this.f6034d;
        if (strArr != null && !c.h(strArr, sSLSocket.getEnabledProtocols(), a.f3456a)) {
            return false;
        }
        String[] strArr2 = this.f6033c;
        return strArr2 == null || c.h(strArr2, sSLSocket.getEnabledCipherSuites(), h.f6005b);
    }

    public final List c() {
        String[] strArr = this.f6034d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b6 : strArr) {
            arrayList.add(d.b(b6));
        }
        return l.d0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z5 = jVar.f6031a;
        boolean z6 = this.f6031a;
        if (z6 != z5) {
            return false;
        }
        return !z6 || (Arrays.equals(this.f6033c, jVar.f6033c) && Arrays.equals(this.f6034d, jVar.f6034d) && this.f6032b == jVar.f6032b);
    }

    public final int hashCode() {
        if (!this.f6031a) {
            return 17;
        }
        int i3 = 0;
        String[] strArr = this.f6033c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f6034d;
        if (strArr2 != null) {
            i3 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i3) * 31) + (this.f6032b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.f6031a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f6032b + ')';
    }
}
