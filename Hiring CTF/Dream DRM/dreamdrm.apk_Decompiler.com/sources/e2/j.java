package e2;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.n0;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import y1.a;

public final class j implements e {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2516d;

    /* renamed from: e  reason: collision with root package name */
    public Closeable f2517e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2518f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2519g;

    public /* synthetic */ j(Object obj, int i3, Object obj2) {
        this.f2516d = i3;
        this.f2518f = obj;
        this.f2519g = obj2;
    }

    public final Class a() {
        int i3 = this.f2516d;
        Class<InputStream> cls = InputStream.class;
        Object obj = this.f2519g;
        switch (i3) {
            case 0:
                ((f) obj).getClass();
                return cls;
            default:
                switch (((n0) ((l) obj)).f1217d) {
                    case 25:
                        return ParcelFileDescriptor.class;
                    default:
                        return cls;
                }
        }
    }

    public final void b() {
        int i3 = this.f2516d;
        Object obj = this.f2519g;
        switch (i3) {
            case 0:
                try {
                    Closeable closeable = this.f2517e;
                    ((f) obj).getClass();
                    ((InputStream) closeable).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            default:
                Closeable closeable2 = this.f2517e;
                if (closeable2 != null) {
                    try {
                        switch (((n0) ((l) obj)).f1217d) {
                            case 25:
                                ((ParcelFileDescriptor) closeable2).close();
                                return;
                            default:
                                ((InputStream) closeable2).close();
                                return;
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final a c() {
        return a.f5800d;
    }

    public final void cancel() {
    }

    public final void d(h hVar, d dVar) {
        Closeable closeable;
        int i3 = this.f2516d;
        Object obj = this.f2518f;
        Object obj2 = this.f2519g;
        switch (i3) {
            case 0:
                try {
                    ((f) obj2).getClass();
                    ByteArrayInputStream c6 = f.c((String) obj);
                    this.f2517e = c6;
                    dVar.l(c6);
                    return;
                } catch (IllegalArgumentException e6) {
                    dVar.h(e6);
                    return;
                }
            default:
                try {
                    File file = (File) obj;
                    switch (((n0) ((l) obj2)).f1217d) {
                        case 25:
                            closeable = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            closeable = new FileInputStream(file);
                            break;
                    }
                    this.f2517e = closeable;
                    dVar.l(closeable);
                    return;
                } catch (FileNotFoundException e7) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e7);
                    }
                    dVar.h(e7);
                    return;
                }
        }
    }
}
