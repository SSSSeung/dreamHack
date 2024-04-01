package n1;

import android.content.Context;
import h5.d;
import i.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4250d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f4251e;

    public /* synthetic */ e(Context context, int i3) {
        this.f4250d = i3;
        this.f4251e = context;
    }

    public final void run() {
        int i3 = this.f4250d;
        Context context = this.f4251e;
        switch (i3) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(context, 1));
                return;
            default:
                d.n(context, new a(5), d.f3467c, false);
                return;
        }
    }
}
