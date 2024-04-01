package v0;

import android.text.TextUtils;
import java.util.Locale;

public abstract class k {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
