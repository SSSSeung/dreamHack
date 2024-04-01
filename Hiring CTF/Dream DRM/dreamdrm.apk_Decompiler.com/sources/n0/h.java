package n0;

import android.app.Activity;
import android.content.Intent;

public abstract class h {
    public static Intent a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static boolean b(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    public static boolean c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
