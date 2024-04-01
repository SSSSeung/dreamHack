package f5;

import b1.o;
import l5.i;
import z4.q;
import z4.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f2683a = ((long) 262144);

    /* renamed from: b  reason: collision with root package name */
    public final i f2684b;

    public a(i iVar) {
        this.f2684b = iVar;
    }

    public final r a() {
        q qVar = new q();
        while (true) {
            String h6 = this.f2684b.h(this.f2683a);
            this.f2683a -= (long) h6.length();
            if (h6.length() == 0) {
                return qVar.b();
            }
            int X = v4.i.X(h6, ':', 1, false, 4);
            if (X != -1) {
                String substring = h6.substring(0, X);
                o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = h6.substring(X + 1);
                o.l(substring2, "(this as java.lang.String).substring(startIndex)");
                qVar.a(substring, substring2);
            } else {
                if (h6.charAt(0) == ':') {
                    h6 = h6.substring(1);
                    o.l(h6, "(this as java.lang.String).substring(startIndex)");
                }
                qVar.a("", h6);
            }
        }
    }
}
