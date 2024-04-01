package d2;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import y.e;

public final class a extends Thread {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2146d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f2147e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, Runnable runnable, String str) {
        super(runnable, str);
        this.f2147e = bVar;
    }

    public final void run() {
        int i3 = this.f2146d;
        Object obj = this.f2147e;
        switch (i3) {
            case 0:
                Process.setThreadPriority(9);
                if (((b) obj).f2149b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            default:
                ((o4.a) obj).a();
                return;
        }
    }

    public a(e eVar) {
        this.f2147e = eVar;
    }
}
