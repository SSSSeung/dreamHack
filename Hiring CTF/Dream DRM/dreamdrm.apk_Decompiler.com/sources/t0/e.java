package t0;

import java.util.Locale;
import v0.c;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Locale[] f5085a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        boolean z5;
        boolean z6;
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f5085a;
        int length = localeArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                z5 = false;
                break;
            } else if (localeArr[i3].equals(locale)) {
                z5 = true;
                break;
            } else {
                i3++;
            }
        }
        if (!z5) {
            int length2 = localeArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    z6 = false;
                    break;
                } else if (localeArr[i6].equals(locale2)) {
                    z6 = true;
                    break;
                } else {
                    i6++;
                }
            }
            if (!z6) {
                String c6 = c.c(c.a(c.b(locale)));
                if (!c6.isEmpty()) {
                    return c6.equals(c.c(c.a(c.b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
        }
        return false;
    }
}
