package d2;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f2148a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2149b;

    /* renamed from: c  reason: collision with root package name */
    public int f2150c;

    public b(String str, boolean z5) {
        this.f2148a = str;
        this.f2149b = z5;
    }

    public final synchronized Thread newThread(Runnable runnable) {
        a aVar;
        aVar = new a(this, runnable, "glide-" + this.f2148a + "-thread-" + this.f2150c);
        this.f2150c = this.f2150c + 1;
        return aVar;
    }
}
