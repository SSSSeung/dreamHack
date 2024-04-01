package x0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f5618a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f5619b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f5620c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5621d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f5618a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f5619b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f5620c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e6.getMessage(), e6);
        }
    }
}
