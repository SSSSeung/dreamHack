package t1;

import android.os.Build;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f5167a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f5168b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f5169c;

    static {
        int i3 = Build.VERSION.SDK_INT;
        boolean z5 = true;
        if (i3 < 28) {
            z5 = false;
        }
        f5169c = z5;
    }
}
