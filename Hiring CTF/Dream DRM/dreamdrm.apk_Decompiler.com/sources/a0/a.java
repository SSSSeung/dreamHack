package a0;

import androidx.compose.ui.platform.e;
import java.util.HashMap;
import java.util.LinkedHashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f9a = new e(9);

    /* renamed from: b  reason: collision with root package name */
    public final int f10b = 16;

    public a() {
        new HashMap(0, 0.75f);
        new LinkedHashSet();
    }

    public final String toString() {
        int i3;
        String str;
        synchronized (this.f9a) {
            int i6 = 0 + 0;
            if (i6 != 0) {
                try {
                    i3 = (0 * 100) / i6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                i3 = 0;
            }
            str = "LruCache[maxSize=" + this.f10b + ",hits=" + 0 + ",misses=" + 0 + ",hitRate=" + i3 + "%]";
        }
        return str;
    }
}
