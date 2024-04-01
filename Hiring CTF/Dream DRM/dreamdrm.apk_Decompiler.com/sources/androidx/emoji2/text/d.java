package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

public final class d extends c {
    public final Signature[] r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
