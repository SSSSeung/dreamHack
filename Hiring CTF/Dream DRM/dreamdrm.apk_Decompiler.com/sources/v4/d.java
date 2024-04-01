package v4;

import b1.o;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class d implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final Pattern f5422d;

    public d() {
        Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        o.l(compile, "compile(pattern)");
        this.f5422d = compile;
    }

    public final String toString() {
        String pattern = this.f5422d.toString();
        o.l(pattern, "nativePattern.toString()");
        return pattern;
    }
}
