package e2;

import android.util.Base64;
import android.view.View;
import b1.o;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import d3.a;
import d5.n;
import h5.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import l2.i;
import l2.k;
import l2.m;
import x0.e0;
import x0.u0;
import x3.q;
import y0.b0;
import y1.c;

public final class f implements d, w, c, k, b0, a, q {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2504d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2505e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(int i3) {
        this(TimeUnit.MINUTES);
        this.f2504d = i3;
        if (i3 == 5) {
            this.f2505e = new f((Object) null);
        } else if (i3 == 18) {
        } else if (i3 != 19) {
            this.f2505e = new f(1, this);
        } else {
            this.f2505e = new LinkedHashSet();
        }
    }

    public static ByteArrayInputStream c(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            } else if (str.substring(0, indexOf).endsWith(";base64")) {
                return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            } else {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        } else {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
    }

    public final Class a() {
        return InputStream.class;
    }

    public final boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2505e;
        boolean z5 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = u0.f5622a;
        boolean z6 = e0.d(view) == 1;
        int i3 = swipeDismissBehavior.f1828d;
        if ((i3 == 0 && z6) || (i3 == 1 && !z6)) {
            z5 = true;
        }
        int width = view.getWidth();
        if (z5) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        swipeDismissBehavior.getClass();
        return true;
    }

    public final v d(b0 b0Var) {
        int i3 = this.f2504d;
        Object obj = this.f2505e;
        switch (i3) {
            case 2:
                return new g(1, (f) obj);
            default:
                return new f2.a((f) obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r6, java.io.File r7, y1.i r8) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.lang.String r8 = "StreamEncoder"
            java.lang.Object r0 = r5.f2505e
            b2.h r0 = (b2.h) r0
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r1 = r0.c(r1, r2)
            byte[] r1 = (byte[]) r1
            r2 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0036 }
            r4.<init>(r7)     // Catch:{ IOException -> 0x0036 }
        L_0x0019:
            int r7 = r6.read(r1)     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            r3 = -1
            if (r7 == r3) goto L_0x0024
            r4.write(r1, r2, r7)     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            goto L_0x0019
        L_0x0024:
            r4.close()     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            r4.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            r0.g(r1)
            r2 = 1
            goto L_0x004b
        L_0x002f:
            r6 = move-exception
            goto L_0x004d
        L_0x0031:
            r6 = move-exception
            r3 = r4
            goto L_0x0037
        L_0x0034:
            r6 = move-exception
            goto L_0x004c
        L_0x0036:
            r6 = move-exception
        L_0x0037:
            r7 = 3
            boolean r7 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r7 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r8, r7, r6)     // Catch:{ all -> 0x0034 }
        L_0x0043:
            if (r3 == 0) goto L_0x0048
            r3.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            r0.g(r1)
        L_0x004b:
            return r2
        L_0x004c:
            r4 = r3
        L_0x004d:
            if (r4 == 0) goto L_0x0052
            r4.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            r0.g(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f.e(java.lang.Object, java.io.File, y1.i):boolean");
    }

    public final Object h(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public final Object j() {
        Object obj = this.f2505e;
        try {
            return ((Constructor) obj).newInstance(new Object[0]);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + a4.c.b((Constructor) obj) + "' with no args", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + a4.c.b((Constructor) obj) + "' with no args", e7.getCause());
        } catch (IllegalAccessException e8) {
            d dVar = a4.c.f208a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e8);
        }
    }

    public final String toString() {
        int i3 = this.f2504d;
        Object obj = this.f2505e;
        switch (i3) {
            case 6:
                return super.toString() + "{fragment=" + ((i) obj) + "}";
            case 7:
                return super.toString() + "{fragment=" + ((m) obj) + "}";
            case 15:
                return ((Field) obj).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(int i3, Object obj) {
        this.f2504d = i3;
        this.f2505e = obj;
    }

    public f(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2504d = 14;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f1830f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f1831g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f1828d = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(10, materialButtonToggleGroup);
        this.f2504d = 10;
    }

    public f(n nVar) {
        this.f2504d = 18;
        this.f2505e = nVar;
    }

    public f(Object obj) {
        this.f2504d = 3;
        this.f2505e = new c2.f(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(TimeUnit timeUnit) {
        this(new n(c5.f.f1678h, timeUnit));
        this.f2504d = 18;
        o.m(timeUnit, "timeUnit");
    }
}
