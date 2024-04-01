package c2;

import android.app.ActivityManager;
import android.content.Context;
import e.n0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1613a;

    /* renamed from: b  reason: collision with root package name */
    public final ActivityManager f1614b;

    /* renamed from: c  reason: collision with root package name */
    public final n0 f1615c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1616d = ((float) 1);

    public h(Context context) {
        this.f1613a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f1614b = activityManager;
        this.f1615c = new n0(27, (Object) context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f1616d = 0.0f;
        }
    }
}
