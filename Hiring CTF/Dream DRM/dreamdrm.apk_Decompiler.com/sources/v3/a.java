package v3;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
public final class a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    public final String a(Field field) {
        return field.getName();
    }
}
