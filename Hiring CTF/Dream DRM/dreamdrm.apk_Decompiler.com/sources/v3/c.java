package v3;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
public final class c extends h {
    public c() {
        super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    }

    public final String a(Field field) {
        return h.c(h.b(field.getName(), ' '));
    }
}
