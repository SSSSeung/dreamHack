package a2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f88a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f89b;

    public j0() {
        this.f89b = new Handler(Looper.getMainLooper(), new i0(0));
    }

    public final synchronized void a(f0 f0Var, boolean z5) {
        if (!this.f88a) {
            if (!z5) {
                this.f88a = true;
                f0Var.d();
                this.f88a = false;
            }
        }
        ((Handler) this.f89b).obtainMessage(1, f0Var).sendToTarget();
    }

    public j0(BottomSheetBehavior bottomSheetBehavior, boolean z5) {
        this.f89b = bottomSheetBehavior;
        this.f88a = z5;
    }
}
