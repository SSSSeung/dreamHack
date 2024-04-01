package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import b1.v;
import e.n0;
import h5.d;
import i.a;
import java.io.File;
import java.io.Serializable;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                d.n(context, new a(2), new n0(21, (Object) this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        n0 n0Var = new n0(21, (Object) this);
                        try {
                            d.i(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            new n1.a(10, 1, n0Var, (Serializable) null).run();
                        } catch (PackageManager.NameNotFoundException e6) {
                            new n1.a(7, 1, n0Var, e6).run();
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        n0 n0Var2 = new n0(21, (Object) this);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new n1.a(11, 1, n0Var2, (Serializable) null).run();
                    }
                }
            } else {
                boolean equals = "androidx.profileinstaller.action.SAVE_PROFILE".equals(action);
                androidx.fragment.app.n0 n0Var3 = d.f3468d;
                if (equals) {
                    Process.sendSignal(Process.myPid(), 10);
                    n0Var3.o(12, (Object) null);
                    setResultCode(12);
                } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                    if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                        int i3 = v.r(context.createDeviceProtectedStorageContext().getCodeCacheDir()) ? 14 : 15;
                        n0Var3.o(i3, (Object) null);
                        setResultCode(i3);
                        return;
                    }
                    n0Var3.o(16, (Object) null);
                    setResultCode(16);
                }
            }
        }
    }
}
