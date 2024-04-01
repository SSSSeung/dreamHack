package x3;

import b1.o;
import java.io.IOException;
import z4.e0;
import z4.x;

public final class d implements q {

    /* renamed from: d  reason: collision with root package name */
    public static d f5715d;

    public d() {
    }

    public static void a(int i3, int i6, int i7) {
        if (i3 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i6 + ", size: " + i7);
        } else if (i3 > i6) {
            throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i6);
        }
    }

    public static e0 b(String str) {
        o.m(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return e0.f5993g;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return e0.f5992f;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return e0.f5991e;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return e0.f5994h;
            }
        } else if (str.equals("SSLv3")) {
            return e0.f5995i;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static x c(String str) {
        if (o.c(str, "http/1.0")) {
            return x.f6105e;
        }
        if (o.c(str, "http/1.1")) {
            return x.f6106f;
        }
        if (o.c(str, "h2_prior_knowledge")) {
            return x.f6109i;
        }
        if (o.c(str, "h2")) {
            return x.f6108h;
        }
        if (o.c(str, "spdy/3.1")) {
            return x.f6107g;
        }
        if (o.c(str, "quic")) {
            return x.f6110j;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public final Object j() {
        return new p();
    }

    public /* synthetic */ d(Object obj) {
    }
}
