package e;

import android.os.LocaleList;
import androidx.activity.j;

public abstract class p {
    public static LocaleList a(Object obj) {
        return j.b(obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        j.b(obj).setApplicationLocales(localeList);
    }
}
