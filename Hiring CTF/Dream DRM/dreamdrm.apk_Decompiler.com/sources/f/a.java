package f;

import android.graphics.drawable.Drawable;
import u1.d;

public final class a implements Drawable.Callback {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2607d = 1;

    /* renamed from: e  reason: collision with root package name */
    public Object f2608e;

    public a(d dVar) {
        this.f2608e = dVar;
    }

    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f2607d) {
            case 0:
                return;
            default:
                ((d) this.f2608e).invalidateSelf();
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        switch (this.f2607d) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f2608e;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j6);
                    return;
                }
                return;
            default:
                ((d) this.f2608e).scheduleSelf(runnable, j6);
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2607d) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f2608e;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((d) this.f2608e).unscheduleSelf(runnable);
                return;
        }
    }
}
