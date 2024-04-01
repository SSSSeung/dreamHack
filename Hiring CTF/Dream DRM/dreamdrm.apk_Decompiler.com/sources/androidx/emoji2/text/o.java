package androidx.emoji2.text;

import com.bumptech.glide.d;
import g.h;
import java.util.concurrent.ThreadPoolExecutor;

public final class o extends d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f1026f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1027g;

    public o(d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1026f = dVar;
        this.f1027g = threadPoolExecutor;
    }

    public final void s(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1027g;
        try {
            this.f1026f.s(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void t(h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1027g;
        try {
            this.f1026f.t(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
