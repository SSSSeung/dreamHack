package e5;

import b1.o;
import z4.x;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final x f2604a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2605b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2606c;

    public h(x xVar, int i3, String str) {
        this.f2604a = xVar;
        this.f2605b = i3;
        this.f2606c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2604a == x.f6105e ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f2605b);
        sb.append(' ');
        sb.append(this.f2606c);
        String sb2 = sb.toString();
        o.l(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
