package e2;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.k;
import q2.b;
import y1.i;

public final class c implements v {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f2495a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2496b;

    public c(AssetManager assetManager, a aVar) {
        this.f2495a = assetManager;
        this.f2496b = aVar;
    }

    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public final u b(Object obj, int i3, int i6, i iVar) {
        k kVar;
        Uri uri = (Uri) obj;
        String substring = uri.toString().substring(22);
        b bVar = new b(uri);
        int i7 = ((b) this.f2496b).f2487d;
        AssetManager assetManager = this.f2495a;
        switch (i7) {
            case 0:
                kVar = new k(assetManager, substring, 0);
                break;
            default:
                kVar = new k(assetManager, substring, 1);
                break;
        }
        return new u(bVar, kVar);
    }
}
