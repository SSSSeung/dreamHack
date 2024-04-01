package c2;

import android.content.Context;
import androidx.appcompat.widget.a0;
import java.io.File;
import w1.e;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final long f1609a = 262144000;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f1610b;

    public d(a0 a0Var) {
        this.f1610b = a0Var;
    }

    public final e a() {
        a0 a0Var = this.f1610b;
        File cacheDir = ((Context) a0Var.f503e).getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (((String) a0Var.f504f) != null) {
            cacheDir = new File(cacheDir, (String) a0Var.f504f);
        }
        if (cacheDir == null) {
            return null;
        }
        if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
            return new e(cacheDir, this.f1609a);
        }
        return null;
    }
}
