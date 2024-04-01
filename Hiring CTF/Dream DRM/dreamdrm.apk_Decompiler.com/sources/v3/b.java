package v3;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
public final class b extends h {
    public b() {
        super("UPPER_CAMEL_CASE", 1);
    }

    public final String a(Field field) {
        return h.c(field.getName());
    }
}
