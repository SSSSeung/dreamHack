package e2;

import a2.f0;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import h2.d;
import java.io.InputStream;
import k2.a;
import y1.i;

public final class c0 implements w, a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2497d;

    /* renamed from: e  reason: collision with root package name */
    public final Resources f2498e;

    public /* synthetic */ c0(int i3, Resources resources) {
        this.f2497d = i3;
        this.f2498e = resources;
    }

    public final v d(b0 b0Var) {
        int i3 = this.f2497d;
        Class<Uri> cls = Uri.class;
        Resources resources = this.f2498e;
        switch (i3) {
            case 0:
                return new z(resources, b0Var.a(cls, AssetFileDescriptor.class));
            case 1:
                return new z(resources, b0Var.a(cls, ParcelFileDescriptor.class));
            case 2:
                return new z(resources, b0Var.a(cls, InputStream.class));
            default:
                return new z(resources, (v) f0.f2506a);
        }
    }

    public final f0 f(f0 f0Var, i iVar) {
        if (f0Var == null) {
            return null;
        }
        return new d(this.f2498e, f0Var);
    }

    public c0(Resources resources) {
        this.f2497d = 4;
        this.f2498e = resources;
    }
}
