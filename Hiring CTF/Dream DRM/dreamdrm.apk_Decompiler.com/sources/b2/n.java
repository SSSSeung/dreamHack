package b2;

import android.graphics.Bitmap;
import androidx.appcompat.widget.a0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import r2.l;

public final class n implements j {

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f1573g;

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f1574h;

    /* renamed from: i  reason: collision with root package name */
    public static final Bitmap.Config[] f1575i = {Bitmap.Config.RGB_565};

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config[] f1576j = {Bitmap.Config.ARGB_4444};

    /* renamed from: k  reason: collision with root package name */
    public static final Bitmap.Config[] f1577k = {Bitmap.Config.ALPHA_8};

    /* renamed from: d  reason: collision with root package name */
    public final c f1578d = new c(2);

    /* renamed from: e  reason: collision with root package name */
    public final a0 f1579e = new a0(14);

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f1580f = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f1573g = configArr;
        f1574h = configArr;
    }

    public static String e(int i3, Bitmap.Config config) {
        return "[" + i3 + "](" + config + ")";
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [b2.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = r2.l.b(r11, r12, r13)
            b2.c r1 = r10.f1578d
            b2.k r2 = r1.c()
            b2.m r2 = (b2.m) r2
            r2.f1571b = r0
            r2.f1572c = r13
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGBA_F16
            boolean r3 = r3.equals(r13)
            r4 = 0
            if (r3 == 0) goto L_0x001c
            android.graphics.Bitmap$Config[] r3 = f1574h
            goto L_0x0040
        L_0x001c:
            int[] r3 = b2.l.f1569a
            int r5 = r13.ordinal()
            r3 = r3[r5]
            r5 = 1
            if (r3 == r5) goto L_0x003e
            r6 = 2
            if (r3 == r6) goto L_0x003b
            r6 = 3
            if (r3 == r6) goto L_0x0038
            r6 = 4
            if (r3 == r6) goto L_0x0035
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[r5]
            r3[r4] = r13
            goto L_0x0040
        L_0x0035:
            android.graphics.Bitmap$Config[] r3 = f1577k
            goto L_0x0040
        L_0x0038:
            android.graphics.Bitmap$Config[] r3 = f1576j
            goto L_0x0040
        L_0x003b:
            android.graphics.Bitmap$Config[] r3 = f1575i
            goto L_0x0040
        L_0x003e:
            android.graphics.Bitmap$Config[] r3 = f1573g
        L_0x0040:
            int r5 = r3.length
        L_0x0041:
            if (r4 >= r5) goto L_0x0084
            r6 = r3[r4]
            java.util.NavigableMap r7 = r10.h(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0081
            int r8 = r7.intValue()
            int r9 = r0 * 8
            if (r8 > r9) goto L_0x0081
            int r3 = r7.intValue()
            if (r3 != r0) goto L_0x006e
            if (r6 != 0) goto L_0x0068
            if (r13 == 0) goto L_0x0084
            goto L_0x006e
        L_0x0068:
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto L_0x0084
        L_0x006e:
            r1.f(r2)
            int r0 = r7.intValue()
            b2.k r1 = r1.c()
            r2 = r1
            b2.m r2 = (b2.m) r2
            r2.f1571b = r0
            r2.f1572c = r6
            goto L_0x0084
        L_0x0081:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x0084:
            androidx.appcompat.widget.a0 r0 = r10.f1579e
            java.lang.Object r0 = r0.n(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x009a
            int r1 = r2.f1571b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.c(r1, r0)
            r0.reconfigure(r11, r12, r13)
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.n.a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final void b(Bitmap bitmap) {
        int c6 = l.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        m mVar = (m) this.f1578d.c();
        mVar.f1571b = c6;
        mVar.f1572c = config;
        this.f1579e.y(mVar, bitmap);
        NavigableMap h6 = h(bitmap.getConfig());
        Integer num = (Integer) h6.get(Integer.valueOf(mVar.f1571b));
        Integer valueOf = Integer.valueOf(mVar.f1571b);
        int i3 = 1;
        if (num != null) {
            i3 = 1 + num.intValue();
        }
        h6.put(valueOf, Integer.valueOf(i3));
    }

    public final void c(Integer num, Bitmap bitmap) {
        NavigableMap h6 = h(bitmap.getConfig());
        Integer num2 = (Integer) h6.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + i(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            h6.remove(num);
        } else {
            h6.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final int d(Bitmap bitmap) {
        return l.c(bitmap);
    }

    public final Bitmap f() {
        Bitmap bitmap = (Bitmap) this.f1579e.A();
        if (bitmap != null) {
            c(Integer.valueOf(l.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String g(int i3, int i6, Bitmap.Config config) {
        return e(l.b(i3, i6, config), config);
    }

    public final NavigableMap h(Bitmap.Config config) {
        HashMap hashMap = this.f1580f;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final String i(Bitmap bitmap) {
        return e(l.c(bitmap), bitmap.getConfig());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f1579e);
        sb.append(", sortedSizes=(");
        HashMap hashMap = this.f1580f;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!hashMap.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
