package v4;

import b1.o;
import java.nio.charset.Charset;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f5409a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Charset f5410b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Charset f5411c;

    static {
        Charset forName = Charset.forName("UTF-8");
        o.l(forName, "forName(\"UTF-8\")");
        f5409a = forName;
        o.l(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        o.l(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        o.l(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        o.l(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        o.l(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
