package l2;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.appcompat.widget.a0;
import b1.o;

public final class c implements b {

    /* renamed from: d  reason: collision with root package name */
    public final Context f4083d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f4084e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4085f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4086g;

    /* renamed from: h  reason: collision with root package name */
    public final e.a0 f4087h = new e.a0(1, this);

    public c(Context context, a0 a0Var) {
        this.f4083d = context.getApplicationContext();
        this.f4084e = a0Var;
    }

    public static boolean l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        o.i(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e6) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e6);
            }
            return true;
        }
    }

    public final void e() {
        if (this.f4086g) {
            this.f4083d.unregisterReceiver(this.f4087h);
            this.f4086g = false;
        }
    }

    public final void j() {
        if (!this.f4086g) {
            Context context = this.f4083d;
            this.f4085f = l(context);
            try {
                context.registerReceiver(this.f4087h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f4086g = true;
            } catch (SecurityException e6) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e6);
                }
            }
        }
    }

    public final void k() {
    }
}
