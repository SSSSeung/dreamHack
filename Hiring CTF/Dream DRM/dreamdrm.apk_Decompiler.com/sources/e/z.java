package e;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.activity.result.c;
import java.util.Calendar;
import w4.p;

public final class z extends b0 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2459f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e0 f2460g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f2461h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, Context context) {
        super(e0Var);
        this.f2460g = e0Var;
        this.f2461h = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public final IntentFilter c() {
        switch (this.f2459f) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    public final int e() {
        boolean z5;
        Location location;
        long j6;
        Location location2;
        int i3 = this.f2459f;
        Object obj = this.f2461h;
        switch (i3) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                c cVar = (c) obj;
                p0 p0Var = (p0) cVar.f329g;
                boolean z6 = false;
                if (p0Var.f2409b > System.currentTimeMillis()) {
                    z5 = p0Var.f2408a;
                } else {
                    Context context = (Context) cVar.f327e;
                    int g6 = p.g(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    Object obj2 = cVar.f328f;
                    if (g6 == 0) {
                        try {
                            if (((LocationManager) obj2).isProviderEnabled("network")) {
                                location2 = ((LocationManager) obj2).getLastKnownLocation("network");
                                location = location2;
                            }
                        } catch (Exception e6) {
                            Log.d("TwilightManager", "Failed to get last known location", e6);
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (p.g(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (((LocationManager) obj2).isProviderEnabled("gps")) {
                                location3 = ((LocationManager) obj2).getLastKnownLocation("gps");
                            }
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (o0.f2404d == null) {
                            o0.f2404d = new o0();
                        }
                        o0 o0Var = o0.f2404d;
                        o0 o0Var2 = o0Var;
                        o0Var2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        o0Var2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        if (o0Var.f2407c == 1) {
                            z6 = true;
                        }
                        long j7 = o0Var.f2406b;
                        long j8 = o0Var.f2405a;
                        long j9 = j7;
                        o0Var.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j10 = o0Var.f2406b;
                        if (j9 == -1 || j8 == -1) {
                            j6 = currentTimeMillis + 43200000;
                        } else {
                            j6 = (currentTimeMillis > j8 ? j10 + 0 : currentTimeMillis > j9 ? j8 + 0 : j9 + 0) + 60000;
                        }
                        p0Var.f2408a = z6;
                        p0Var.f2409b = j6;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i6 = Calendar.getInstance().get(11);
                        if (i6 < 6 || i6 >= 22) {
                            z6 = true;
                        }
                    }
                    z5 = z6;
                }
                return z5 ? 2 : 1;
        }
    }

    public final void g() {
        int i3 = this.f2459f;
        e0 e0Var = this.f2460g;
        switch (i3) {
            case 0:
                e0Var.o(true, true);
                return;
            default:
                e0Var.o(true, true);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, c cVar) {
        super(e0Var);
        this.f2460g = e0Var;
        this.f2461h = cVar;
    }
}
