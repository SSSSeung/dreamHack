package e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.bumptech.glide.n;
import l2.c;
import l2.l;

public final class a0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2277b;

    public /* synthetic */ a0(int i3, Object obj) {
        this.f2276a = i3;
        this.f2277b = obj;
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.f2276a) {
            case 0:
                ((b0) this.f2277b).g();
                return;
            default:
                c cVar = (c) this.f2277b;
                boolean z5 = cVar.f4085f;
                cVar.f4085f = c.l(context);
                if (z5 != ((c) this.f2277b).f4085f) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + ((c) this.f2277b).f4085f);
                    }
                    c cVar2 = (c) this.f2277b;
                    androidx.appcompat.widget.a0 a0Var = cVar2.f4084e;
                    if (cVar2.f4085f) {
                        synchronized (((n) a0Var.f504f)) {
                            ((l) a0Var.f503e).e();
                        }
                        return;
                    }
                    a0Var.getClass();
                    return;
                }
                return;
        }
    }
}
