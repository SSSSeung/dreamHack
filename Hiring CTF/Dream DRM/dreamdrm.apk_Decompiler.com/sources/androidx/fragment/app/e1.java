package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class e1 extends Writer {

    /* renamed from: d  reason: collision with root package name */
    public final String f1132d = "FragmentManager";

    /* renamed from: e  reason: collision with root package name */
    public final StringBuilder f1133e = new StringBuilder(128);

    public final void b() {
        StringBuilder sb = this.f1133e;
        if (sb.length() > 0) {
            Log.d(this.f1132d, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        b();
    }

    public final void flush() {
        b();
    }

    public final void write(char[] cArr, int i3, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            char c6 = cArr[i3 + i7];
            if (c6 == 10) {
                b();
            } else {
                this.f1133e.append(c6);
            }
        }
    }
}
