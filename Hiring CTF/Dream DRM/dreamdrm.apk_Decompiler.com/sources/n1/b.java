package n1;

import android.content.res.AssetManager;
import android.os.Build;
import i.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import w4.p;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4233a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4234b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f4235c;

    /* renamed from: d  reason: collision with root package name */
    public final File f4236d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4237e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4238f = false;

    /* renamed from: g  reason: collision with root package name */
    public c[] f4239g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f4240h;

    public b(AssetManager assetManager, a aVar, d dVar, String str, File file) {
        byte[] bArr;
        this.f4233a = aVar;
        this.f4234b = dVar;
        this.f4237e = str;
        this.f4236d = file;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 33) {
            switch (i3) {
                case 26:
                    bArr = p.f5505f;
                    break;
                case 27:
                    bArr = p.f5504e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = p.f5503d;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = p.f5502c;
                    break;
            }
        }
        bArr = null;
        this.f4235c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f4234b.l();
            }
            return null;
        }
    }

    public final void b(int i3, Serializable serializable) {
        this.f4233a.execute(new a(i3, 0, this, serializable));
    }
}
