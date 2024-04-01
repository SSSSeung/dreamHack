package z4;

import b1.o;
import java.util.regex.Pattern;

public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f6079c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f6080d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f6081a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f6082b;

    public v(String str, String[] strArr) {
        this.f6081a = str;
        this.f6082b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && o.c(((v) obj).f6081a, this.f6081a);
    }

    public final int hashCode() {
        return this.f6081a.hashCode();
    }

    public final String toString() {
        return this.f6081a;
    }
}
