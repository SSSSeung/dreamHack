package n0;

import android.app.AppOpsManager;
import android.content.Context;

public abstract class f {
    public static int a(AppOpsManager appOpsManager, String str, int i3, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i3, str2);
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
