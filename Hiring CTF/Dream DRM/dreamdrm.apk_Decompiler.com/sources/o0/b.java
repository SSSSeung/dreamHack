package o0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

public abstract class b {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i3) {
        return context.getDrawable(i3);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
