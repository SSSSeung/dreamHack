package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.InputStream;

public final class k extends b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f1770h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i3) {
        super(assetManager, str, 0);
        this.f1770h = i3;
    }

    public final Class a() {
        switch (this.f1770h) {
            case 0:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    public final void e(Object obj) {
        switch (this.f1770h) {
            case 0:
                ((ParcelFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final Closeable f(AssetManager assetManager, String str) {
        switch (this.f1770h) {
            case 0:
                return assetManager.openFd(str).getParcelFileDescriptor();
            default:
                return assetManager.open(str);
        }
    }
}
