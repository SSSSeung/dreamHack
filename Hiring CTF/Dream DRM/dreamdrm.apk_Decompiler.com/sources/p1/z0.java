package p1;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public int f4734a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f4735b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f4736c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f4737d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f4738e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4739f = false;

    /* renamed from: g  reason: collision with root package name */
    public int f4740g = 0;

    public final void a(RecyclerView recyclerView) {
        int i3 = this.f4737d;
        if (i3 >= 0) {
            this.f4737d = -1;
            recyclerView.O(i3);
            this.f4739f = false;
        } else if (this.f4739f) {
            Interpolator interpolator = this.f4738e;
            if (interpolator == null || this.f4736c >= 1) {
                int i6 = this.f4736c;
                if (i6 >= 1) {
                    recyclerView.f1427e0.c(this.f4734a, this.f4735b, i6, interpolator);
                    int i7 = this.f4740g + 1;
                    this.f4740g = i7;
                    if (i7 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4739f = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.f4740g = 0;
        }
    }
}
