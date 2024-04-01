package i5;

import b1.o;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public m f3627a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3628b;

    public l(k kVar) {
        this.f3628b = kVar;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f3628b.a(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        m mVar;
        synchronized (this) {
            if (this.f3627a == null && this.f3628b.a(sSLSocket)) {
                this.f3627a = this.f3628b.b(sSLSocket);
            }
            mVar = this.f3627a;
        }
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        m mVar;
        o.m(list, "protocols");
        synchronized (this) {
            if (this.f3627a == null && this.f3628b.a(sSLSocket)) {
                this.f3627a = this.f3628b.b(sSLSocket);
            }
            mVar = this.f3627a;
        }
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }
}
