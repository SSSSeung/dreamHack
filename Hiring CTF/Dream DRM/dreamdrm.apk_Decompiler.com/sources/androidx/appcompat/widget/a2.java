package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class a2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f505a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f505a = field;
    }
}
