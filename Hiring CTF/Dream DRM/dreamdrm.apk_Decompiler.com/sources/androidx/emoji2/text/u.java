package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.appcompat.widget.r;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.o;
import com.bumptech.glide.d;
import e.h;
import h5.l;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u0.g;

public final class u implements k {

    /* renamed from: d  reason: collision with root package name */
    public final Context f1043d;

    /* renamed from: e  reason: collision with root package name */
    public final r f1044e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1045f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1046g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public Handler f1047h;

    /* renamed from: i  reason: collision with root package name */
    public Executor f1048i;

    /* renamed from: j  reason: collision with root package name */
    public ThreadPoolExecutor f1049j;

    /* renamed from: k  reason: collision with root package name */
    public d f1050k;

    /* renamed from: l  reason: collision with root package name */
    public o f1051l;

    public u(Context context, r rVar) {
        e eVar = m.f1021d;
        if (context != null) {
            this.f1043d = context.getApplicationContext();
            this.f1044e = rVar;
            this.f1045f = eVar;
            return;
        }
        throw new NullPointerException("Context cannot be null");
    }

    public final void a(d dVar) {
        synchronized (this.f1046g) {
            this.f1050k = dVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f1046g) {
            this.f1050k = null;
            o oVar = this.f1051l;
            if (oVar != null) {
                e eVar = this.f1045f;
                Context context = this.f1043d;
                eVar.getClass();
                context.getContentResolver().unregisterContentObserver(oVar);
                this.f1051l = null;
            }
            Handler handler = this.f1047h;
            if (handler != null) {
                handler.removeCallbacks((Runnable) null);
            }
            this.f1047h = null;
            ThreadPoolExecutor threadPoolExecutor = this.f1049j;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f1048i = null;
            this.f1049j = null;
        }
    }

    public final void c() {
        synchronized (this.f1046g) {
            if (this.f1050k != null) {
                if (this.f1048i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1049j = threadPoolExecutor;
                    this.f1048i = threadPoolExecutor;
                }
                this.f1048i.execute(new t(this, 0));
            }
        }
    }

    public final g d() {
        try {
            e eVar = this.f1045f;
            Context context = this.f1043d;
            r rVar = this.f1044e;
            eVar.getClass();
            h g6 = l.g(context, rVar);
            if (g6.f2375d == 0) {
                g[] gVarArr = (g[]) g6.f2376e;
                if (gVarArr != null && gVarArr.length != 0) {
                    return gVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException("fetchFonts failed (" + g6.f2375d + ")");
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }
}
