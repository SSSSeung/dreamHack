package o0;

import android.content.Context;

public abstract class c {
    public static int a(Context context, int i3) {
        return context.getColor(i3);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
