package e;

import android.content.res.Configuration;
import android.os.LocaleList;
import t0.g;
import t0.i;

public abstract class v {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static g b(Configuration configuration) {
        return g.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(((i) gVar.f5087a).f5088a.toLanguageTags()));
    }

    public static void d(Configuration configuration, g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(((i) gVar.f5087a).f5088a.toLanguageTags()));
    }
}
