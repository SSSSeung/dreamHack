package t0;

import java.util.Locale;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f5086b = new g(new i(f.a(new Locale[0])));

    /* renamed from: a  reason: collision with root package name */
    public final h f5087a;

    public g(i iVar) {
        this.f5087a = iVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f5086b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i3 = 0; i3 < length; i3++) {
            localeArr[i3] = e.a(split[i3]);
        }
        return new g(new i(f.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f5087a.equals(((g) obj).f5087a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5087a.hashCode();
    }

    public final String toString() {
        return this.f5087a.toString();
    }
}
