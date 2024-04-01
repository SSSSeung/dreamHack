package e;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b1.o;
import b1.v;
import com.theori.dreamdrm.MainActivity;
import e4.g;
import java.util.List;
import java.util.Random;
import n1.e;
import n1.h;

public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2392d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f2393e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2394f;

    public /* synthetic */ k0(Object obj, int i3, Object obj2) {
        this.f2392d = i3;
        this.f2393e = obj;
        this.f2394f = obj2;
    }

    public final void run() {
        int i3 = this.f2392d;
        Object obj = this.f2394f;
        Object obj2 = this.f2393e;
        switch (i3) {
            case 0:
                l0 l0Var = (l0) obj2;
                Runnable runnable = (Runnable) obj;
                l0Var.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    l0Var.a();
                }
            case 1:
                ((v) obj2).I((Typeface) obj);
                return;
            case 2:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? h.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e(context, 0), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case 3:
                MainActivity mainActivity = (MainActivity) obj2;
                String str = (String) obj;
                int i6 = MainActivity.A;
                o.m(mainActivity, "this$0");
                o.m(str, "$message");
                Toast.makeText(mainActivity, str, 1).show();
                return;
            default:
                MainActivity mainActivity2 = (MainActivity) obj2;
                List list = (List) obj;
                o.m(mainActivity2, "this$0");
                g gVar = mainActivity2.f2112z;
                if (gVar != null) {
                    o.l(list, "fileList");
                    gVar.f2575d = list;
                    gVar.f4508a.b();
                    return;
                }
                o.Y("fileAdapter");
                throw null;
        }
    }
}
