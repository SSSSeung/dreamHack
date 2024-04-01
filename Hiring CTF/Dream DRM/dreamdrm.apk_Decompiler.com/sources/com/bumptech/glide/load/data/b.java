package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.h;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import y1.a;

public abstract class b implements e {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1755d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1756e;

    /* renamed from: f  reason: collision with root package name */
    public final Comparable f1757f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1758g;

    public /* synthetic */ b(Object obj, Comparable comparable, int i3) {
        this.f1755d = i3;
        this.f1758g = obj;
        this.f1757f = comparable;
    }

    public final void b() {
        switch (this.f1755d) {
            case 0:
                Object obj = this.f1756e;
                if (obj != null) {
                    try {
                        e(obj);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    return;
                }
            default:
                Object obj2 = this.f1756e;
                if (obj2 != null) {
                    try {
                        e(obj2);
                        return;
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
        int i3 = this.f1755d;
        Comparable comparable = this.f1757f;
        Object obj = this.f1758g;
        switch (i3) {
            case 0:
                try {
                    Closeable f6 = f((AssetManager) obj, (String) comparable);
                    this.f1756e = f6;
                    dVar.l(f6);
                    return;
                } catch (IOException e6) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e6);
                    }
                    dVar.h(e6);
                    return;
                }
            default:
                try {
                    Object g6 = g((ContentResolver) obj, (Uri) comparable);
                    this.f1756e = g6;
                    dVar.l(g6);
                    return;
                } catch (FileNotFoundException e7) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e7);
                    }
                    dVar.h(e7);
                    return;
                }
        }
    }

    public abstract void e(Object obj);

    public abstract Closeable f(AssetManager assetManager, String str);

    public abstract Object g(ContentResolver contentResolver, Uri uri);
}
