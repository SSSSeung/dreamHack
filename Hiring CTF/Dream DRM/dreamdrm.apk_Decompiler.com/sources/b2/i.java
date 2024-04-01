package b2;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.n0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class i implements d {

    /* renamed from: m  reason: collision with root package name */
    public static final Bitmap.Config f1559m = Bitmap.Config.ARGB_8888;

    /* renamed from: d  reason: collision with root package name */
    public final j f1560d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f1561e;

    /* renamed from: f  reason: collision with root package name */
    public final n0 f1562f = new n0(16);

    /* renamed from: g  reason: collision with root package name */
    public final long f1563g;

    /* renamed from: h  reason: collision with root package name */
    public long f1564h;

    /* renamed from: i  reason: collision with root package name */
    public int f1565i;

    /* renamed from: j  reason: collision with root package name */
    public int f1566j;

    /* renamed from: k  reason: collision with root package name */
    public int f1567k;

    /* renamed from: l  reason: collision with root package name */
    public int f1568l;

    public i(long j6) {
        n nVar = new n();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add((Object) null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f1563g = j6;
        this.f1560d = nVar;
        this.f1561e = unmodifiableSet;
    }

    public final Bitmap a(int i3, int i6, Bitmap.Config config) {
        Bitmap e6 = e(i3, i6, config);
        if (e6 != null) {
            e6.eraseColor(0);
            return e6;
        }
        if (config == null) {
            config = f1559m;
        }
        return Bitmap.createBitmap(i3, i6, config);
    }

    public final synchronized void b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f1560d.d(bitmap)) <= this.f1563g) {
                        if (this.f1561e.contains(bitmap.getConfig())) {
                            int d6 = this.f1560d.d(bitmap);
                            this.f1560d.b(bitmap);
                            this.f1562f.getClass();
                            this.f1567k++;
                            this.f1564h += (long) d6;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f1560d.i(bitmap));
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                d();
                            }
                            f(this.f1563g);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f1560d.i(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f1561e.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final void c(int i3) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i3);
        }
        if (i3 >= 40 || i3 >= 20) {
            i();
        } else if (i3 >= 20 || i3 == 15) {
            f(this.f1563g / 2);
        }
    }

    public final void d() {
        Log.v("LruBitmapPool", "Hits=" + this.f1565i + ", misses=" + this.f1566j + ", puts=" + this.f1567k + ", evictions=" + this.f1568l + ", currentSize=" + this.f1564h + ", maxSize=" + this.f1563g + "\nStrategy=" + this.f1560d);
    }

    public final synchronized Bitmap e(int i3, int i6, Bitmap.Config config) {
        Bitmap a6;
        if (config != Bitmap.Config.HARDWARE) {
            a6 = this.f1560d.a(i3, i6, config != null ? config : f1559m);
            if (a6 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f1560d.g(i3, i6, config));
                }
                this.f1566j++;
            } else {
                this.f1565i++;
                this.f1564h -= (long) this.f1560d.d(a6);
                this.f1562f.getClass();
                a6.setHasAlpha(true);
                a6.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f1560d.g(i3, i6, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                d();
            }
        } else {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        return a6;
    }

    public final synchronized void f(long j6) {
        while (this.f1564h > j6) {
            Bitmap f6 = this.f1560d.f();
            if (f6 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    d();
                }
                this.f1564h = 0;
                return;
            }
            this.f1562f.getClass();
            this.f1564h -= (long) this.f1560d.d(f6);
            this.f1568l++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f1560d.i(f6));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                d();
            }
            f6.recycle();
        }
    }

    public final Bitmap h(int i3, int i6, Bitmap.Config config) {
        Bitmap e6 = e(i3, i6, config);
        if (e6 != null) {
            return e6;
        }
        if (config == null) {
            config = f1559m;
        }
        return Bitmap.createBitmap(i3, i6, config);
    }

    public final void i() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        f(0);
    }
}
