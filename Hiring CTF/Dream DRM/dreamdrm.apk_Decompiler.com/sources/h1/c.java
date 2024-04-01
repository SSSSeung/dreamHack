package h1;

import android.text.Editable;
import androidx.emoji2.text.y;

public final class c extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3359a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile c f3360b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f3361c;

    public c() {
        try {
            f3361c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f3361c;
        return cls != null ? new y(cls, charSequence) : super.newEditable(charSequence);
    }
}
