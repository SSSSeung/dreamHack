package y1;

import a2.m;
import android.text.TextUtils;
import androidx.compose.ui.platform.e;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final e f5811e = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Object f5812a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5813b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5814c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f5815d;

    public h(String str, Object obj, g gVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f5814c = str;
            this.f5812a = obj;
            this.f5813b = gVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static h a(Object obj, String str) {
        return new h(str, obj, f5811e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f5814c.equals(((h) obj).f5814c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5814c.hashCode();
    }

    public final String toString() {
        return m.j(new StringBuilder("Option{key='"), this.f5814c, "'}");
    }
}
