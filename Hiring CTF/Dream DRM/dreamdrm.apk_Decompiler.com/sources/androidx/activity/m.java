package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.v;
import java.util.concurrent.Executor;

public final class m implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final long f295d = (SystemClock.uptimeMillis() + 10000);

    /* renamed from: e  reason: collision with root package name */
    public Runnable f296e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f297f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n f298g;

    public m(v vVar) {
        this.f298g = vVar;
    }

    public final void execute(Runnable runnable) {
        this.f296e = runnable;
        View decorView = this.f298g.getWindow().getDecorView();
        if (!this.f297f) {
            decorView.postOnAnimation(new d(1, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f296e;
        if (runnable != null) {
            runnable.run();
            this.f296e = null;
            p pVar = this.f298g.f306l;
            synchronized (pVar.f316a) {
                z5 = pVar.f317b;
            }
            if (!z5) {
                return;
            }
        } else if (SystemClock.uptimeMillis() <= this.f295d) {
            return;
        }
        this.f297f = false;
        this.f298g.getWindow().getDecorView().post(this);
    }

    public final void run() {
        this.f298g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
