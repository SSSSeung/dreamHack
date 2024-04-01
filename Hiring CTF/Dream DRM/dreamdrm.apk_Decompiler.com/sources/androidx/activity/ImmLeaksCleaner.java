package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

final class ImmLeaksCleaner implements p {

    /* renamed from: d  reason: collision with root package name */
    public static int f270d;

    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            if (f270d == 0) {
                Class<InputMethodManager> cls = InputMethodManager.class;
                try {
                    f270d = 2;
                    cls.getDeclaredField("mServedView").setAccessible(true);
                    cls.getDeclaredField("mNextServedView").setAccessible(true);
                    cls.getDeclaredField("mH").setAccessible(true);
                    f270d = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f270d == 1) {
                throw null;
            }
        }
    }
}
