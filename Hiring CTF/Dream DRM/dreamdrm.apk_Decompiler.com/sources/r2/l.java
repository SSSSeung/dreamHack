package r2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4938a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f4939b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    public static volatile Handler f4940c;

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i3, int i6, Bitmap.Config config) {
        int i7 = i3 * i6;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i8 = k.f4937a[config.ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            i9 = 2;
            if (!(i8 == 2 || i8 == 3)) {
                i9 = 4;
                if (i8 == 4) {
                    i9 = 8;
                }
            }
        }
        return i7 * i9;
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    public static ArrayList d(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object next : set) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Handler e() {
        if (f4940c == null) {
            synchronized (l.class) {
                if (f4940c == null) {
                    f4940c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f4940c;
    }

    public static int f(int i3, Object obj) {
        return (i3 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static boolean g(int i3, int i6) {
        if (!(i3 > 0 || i3 == Integer.MIN_VALUE)) {
            return false;
        }
        return i6 > 0 || i6 == Integer.MIN_VALUE;
    }
}
