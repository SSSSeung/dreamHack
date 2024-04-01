package e2;

import android.content.res.AssetManager;

public final class b implements w, a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2487d;

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f2488e;

    public /* synthetic */ b(AssetManager assetManager, int i3) {
        this.f2487d = i3;
        this.f2488e = assetManager;
    }

    public final v d(b0 b0Var) {
        int i3 = this.f2487d;
        AssetManager assetManager = this.f2488e;
        switch (i3) {
            case 0:
                return new c(assetManager, this);
            default:
                return new c(assetManager, this);
        }
    }
}
