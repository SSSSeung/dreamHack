package v3;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
public final class d extends h {
    public d() {
        super("UPPER_CASE_WITH_UNDERSCORES", 3);
    }

    public final String a(Field field) {
        return h.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
    }
}
