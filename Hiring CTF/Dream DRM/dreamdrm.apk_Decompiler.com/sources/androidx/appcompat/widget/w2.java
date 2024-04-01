package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k.d;

public final class w2 {

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f834f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public static w2 f835g;

    /* renamed from: h  reason: collision with root package name */
    public static final v2 f836h = new v2();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f837a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f838b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f839c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f840d;

    /* renamed from: e  reason: collision with root package name */
    public w f841e;

    public static synchronized w2 c() {
        w2 w2Var;
        synchronized (w2.class) {
            if (f835g == null) {
                f835g = new w2();
            }
            w2Var = f835g;
        }
        return w2Var;
    }

    public static synchronized PorterDuffColorFilter g(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (w2.class) {
            v2 v2Var = f836h;
            v2Var.getClass();
            int i6 = (i3 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) v2Var.a(Integer.valueOf(mode.hashCode() + i6));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
                v2Var.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) v2Var.b(Integer.valueOf(mode.hashCode() + i6), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j6, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            d dVar = (d) this.f838b.get(context);
            if (dVar == null) {
                dVar = new d();
                this.f838b.put(context, dVar);
            }
            dVar.e(j6, new WeakReference(constantState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable b(android.content.Context r12, int r13) {
        /*
            r11 = this;
            android.util.TypedValue r0 = r11.f839c
            if (r0 != 0) goto L_0x000b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f839c = r0
        L_0x000b:
            android.util.TypedValue r0 = r11.f839c
            android.content.res.Resources r1 = r12.getResources()
            r2 = 1
            r1.getValue(r13, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r11.d(r12, r3)
            if (r1 == 0) goto L_0x0026
            return r1
        L_0x0026:
            androidx.appcompat.widget.w r1 = r11.f841e
            if (r1 != 0) goto L_0x002c
            goto L_0x0104
        L_0x002c:
            r1 = 2131165240(0x7f070038, float:1.7944692E38)
            r5 = 0
            r6 = 2
            if (r13 != r1) goto L_0x004e
            android.graphics.drawable.LayerDrawable r13 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r6]
            r6 = 2131165239(0x7f070037, float:1.794469E38)
            android.graphics.drawable.Drawable r6 = r11.e(r12, r6)
            r1[r5] = r6
            r5 = 2131165241(0x7f070039, float:1.7944694E38)
            android.graphics.drawable.Drawable r5 = r11.e(r12, r5)
            r1[r2] = r5
            r13.<init>(r1)
            goto L_0x0105
        L_0x004e:
            r1 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r13 != r1) goto L_0x0057
            r13 = 2131099707(0x7f06003b, float:1.7811775E38)
            goto L_0x0068
        L_0x0057:
            r1 = 2131165274(0x7f07005a, float:1.794476E38)
            if (r13 != r1) goto L_0x0060
            r13 = 2131099708(0x7f06003c, float:1.7811777E38)
            goto L_0x0068
        L_0x0060:
            r1 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r13 != r1) goto L_0x0104
            r13 = 2131099709(0x7f06003d, float:1.7811779E38)
        L_0x0068:
            android.content.res.Resources r1 = r12.getResources()
            int r13 = r1.getDimensionPixelSize(r13)
            r1 = 2131165287(0x7f070067, float:1.7944787E38)
            android.graphics.drawable.Drawable r1 = r11.e(r12, r1)
            r7 = 2131165288(0x7f070068, float:1.7944789E38)
            android.graphics.drawable.Drawable r7 = r11.e(r12, r7)
            boolean r8 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r8 == 0) goto L_0x009a
            int r8 = r1.getIntrinsicWidth()
            if (r8 != r13) goto L_0x009a
            int r8 = r1.getIntrinsicHeight()
            if (r8 != r13) goto L_0x009a
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            android.graphics.Bitmap r9 = r1.getBitmap()
            r8.<init>(r9)
            goto L_0x00b6
        L_0x009a:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r13, r13, r8)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r8)
            r1.setBounds(r5, r5, r13, r13)
            r1.draw(r9)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r8)
            android.graphics.drawable.BitmapDrawable r9 = new android.graphics.drawable.BitmapDrawable
            r9.<init>(r8)
            r8 = r9
        L_0x00b6:
            android.graphics.Shader$TileMode r9 = android.graphics.Shader.TileMode.REPEAT
            r8.setTileModeX(r9)
            boolean r9 = r7 instanceof android.graphics.drawable.BitmapDrawable
            if (r9 == 0) goto L_0x00ce
            int r9 = r7.getIntrinsicWidth()
            if (r9 != r13) goto L_0x00ce
            int r9 = r7.getIntrinsicHeight()
            if (r9 != r13) goto L_0x00ce
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            goto L_0x00e4
        L_0x00ce:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r13, r13, r9)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r7.setBounds(r5, r5, r13, r13)
            r7.draw(r10)
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            r7.<init>(r9)
        L_0x00e4:
            android.graphics.drawable.LayerDrawable r13 = new android.graphics.drawable.LayerDrawable
            r9 = 3
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r9]
            r9[r5] = r1
            r9[r2] = r7
            r9[r6] = r8
            r13.<init>(r9)
            r1 = 16908288(0x1020000, float:2.387723E-38)
            r13.setId(r5, r1)
            r1 = 16908303(0x102000f, float:2.387727E-38)
            r13.setId(r2, r1)
            r1 = 16908301(0x102000d, float:2.3877265E-38)
            r13.setId(r6, r1)
            goto L_0x0105
        L_0x0104:
            r13 = 0
        L_0x0105:
            if (r13 == 0) goto L_0x010f
            int r0 = r0.changingConfigurations
            r13.setChangingConfigurations(r0)
            r11.a(r12, r3, r13)
        L_0x010f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w2.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f3870f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f838b     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            k.d r0 = (k.d) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.d(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f3869e     // Catch:{ all -> 0x0041 }
            int r2 = r0.f3871g     // Catch:{ all -> 0x0041 }
            int r4 = b1.o.e(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f3870f     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = k.d.f3867h     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f3868d = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w2.d(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(Context context, int i3) {
        return f(context, i3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9 A[Catch:{ all -> 0x005d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r12, int r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f840d     // Catch:{ all -> 0x005d }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            goto L_0x002d
        L_0x0008:
            r11.f840d = r2     // Catch:{ all -> 0x005d }
            r0 = 2131165302(0x7f070076, float:1.7944817E38)
            android.graphics.drawable.Drawable r0 = r11.e(r12, r0)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x00ea
            boolean r3 = r0 instanceof u1.n     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x002a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 == 0) goto L_0x00ea
        L_0x002d:
            android.graphics.drawable.Drawable r0 = r11.b(r12, r13)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r0 = n0.b.f4213a     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r0 = o0.b.b(r12, r13)     // Catch:{ all -> 0x005d }
        L_0x0039:
            if (r0 == 0) goto L_0x00e3
            android.content.res.ColorStateList r3 = r11.h(r12, r13)     // Catch:{ all -> 0x005d }
            r4 = 0
            if (r3 == 0) goto L_0x0063
            int[] r12 = androidx.appcompat.widget.v1.f812a     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r12 = r0.mutate()     // Catch:{ all -> 0x005d }
            r0.b.h(r12, r3)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.w r14 = r11.f841e     // Catch:{ all -> 0x005d }
            if (r14 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            r14 = 2131165289(0x7f070069, float:1.794479E38)
            if (r13 != r14) goto L_0x0057
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x005d }
        L_0x0057:
            if (r4 == 0) goto L_0x0060
            r0.b.i(r12, r4)     // Catch:{ all -> 0x005d }
            goto L_0x0060
        L_0x005d:
            r12 = move-exception
            goto L_0x00f4
        L_0x0060:
            r0 = r12
            goto L_0x00e3
        L_0x0063:
            androidx.appcompat.widget.w r3 = r11.f841e     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x00da
            r3 = 2131165284(0x7f070064, float:1.794478E38)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r6 = 16908303(0x102000f, float:2.387727E-38)
            r7 = 16908288(0x1020000, float:2.387723E-38)
            r8 = 2130903263(0x7f0300df, float:1.741334E38)
            r9 = 2130903265(0x7f0300e1, float:1.7413343E38)
            if (r13 != r3) goto L_0x00a1
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x005d }
            int r7 = androidx.appcompat.widget.t3.c(r12, r9)     // Catch:{ all -> 0x005d }
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.x.f842b     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.w.d(r3, r7, r10)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x005d }
            int r6 = androidx.appcompat.widget.t3.c(r12, r9)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.w.d(r3, r6, r10)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x005d }
            int r3 = androidx.appcompat.widget.t3.c(r12, r8)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.w.d(r1, r3, r10)     // Catch:{ all -> 0x005d }
            goto L_0x00d6
        L_0x00a1:
            r3 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r13 == r3) goto L_0x00b0
            r3 = 2131165274(0x7f07005a, float:1.794476E38)
            if (r13 == r3) goto L_0x00b0
            r3 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r13 != r3) goto L_0x00d7
        L_0x00b0:
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x005d }
            int r7 = androidx.appcompat.widget.t3.b(r12, r9)     // Catch:{ all -> 0x005d }
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.x.f842b     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.w.d(r3, r7, r9)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x005d }
            int r6 = androidx.appcompat.widget.t3.c(r12, r8)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.w.d(r3, r6, r9)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x005d }
            int r3 = androidx.appcompat.widget.t3.c(r12, r8)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.w.d(r1, r3, r9)     // Catch:{ all -> 0x005d }
        L_0x00d6:
            r1 = r2
        L_0x00d7:
            if (r1 == 0) goto L_0x00da
            goto L_0x00e3
        L_0x00da:
            boolean r12 = r11.i(r12, r13, r0)     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x00e3
            if (r14 == 0) goto L_0x00e3
            r0 = r4
        L_0x00e3:
            if (r0 == 0) goto L_0x00e8
            androidx.appcompat.widget.v1.a(r0)     // Catch:{ all -> 0x005d }
        L_0x00e8:
            monitor-exit(r11)
            return r0
        L_0x00ea:
            r11.f840d = r1     // Catch:{ all -> 0x005d }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r13 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r12.<init>(r13)     // Catch:{ all -> 0x005d }
            throw r12     // Catch:{ all -> 0x005d }
        L_0x00f4:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w2.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = (k.k) r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList h(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f837a     // Catch:{ all -> 0x0015 }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            k.k r0 = (k.k) r0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.c(r5, r1)     // Catch:{ all -> 0x0015 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r4 = move-exception
            goto L_0x004a
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x0048
            androidx.appcompat.widget.w r0 = r3.f841e     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            android.content.res.ColorStateList r1 = r0.c(r4, r5)     // Catch:{ all -> 0x0015 }
        L_0x0023:
            if (r1 == 0) goto L_0x0047
            java.util.WeakHashMap r0 = r3.f837a     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            r3.f837a = r0     // Catch:{ all -> 0x0015 }
        L_0x0030:
            java.util.WeakHashMap r0 = r3.f837a     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            k.k r0 = (k.k) r0     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0044
            k.k r0 = new k.k     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            java.util.WeakHashMap r2 = r3.f837a     // Catch:{ all -> 0x0015 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0015 }
        L_0x0044:
            r0.a(r5, r1)     // Catch:{ all -> 0x0015 }
        L_0x0047:
            r0 = r1
        L_0x0048:
            monitor-exit(r3)
            return r0
        L_0x004a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w2.h(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.w r0 = r6.f841e
            r1 = 0
            if (r0 == 0) goto L_0x0074
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.x.f842b
            java.lang.Object r3 = r0.f819b
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.w.a(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L_0x0017
            r8 = 2130903265(0x7f0300e1, float:1.7413343E38)
            goto L_0x004e
        L_0x0017:
            java.io.Serializable r3 = r0.f821d
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.w.a(r3, r8)
            if (r3 == 0) goto L_0x0025
            r8 = 2130903263(0x7f0300df, float:1.741334E38)
            goto L_0x004e
        L_0x0025:
            java.lang.Object r0 = r0.f822e
            int[] r0 = (int[]) r0
            boolean r0 = androidx.appcompat.widget.w.a(r0, r8)
            if (r0 == 0) goto L_0x0032
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0032:
            r0 = 2131165261(0x7f07004d, float:1.7944734E38)
            if (r8 != r0) goto L_0x0046
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L_0x0056
        L_0x0046:
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            if (r8 != r0) goto L_0x0051
        L_0x004b:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L_0x004e:
            r0 = r8
            r8 = r4
            goto L_0x0053
        L_0x0051:
            r8 = r1
            r0 = r8
        L_0x0053:
            r3 = r2
            r2 = r0
            r0 = r5
        L_0x0056:
            if (r8 == 0) goto L_0x0070
            int[] r8 = androidx.appcompat.widget.v1.f812a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.t3.c(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.x.c(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L_0x006e
            r8.setAlpha(r0)
        L_0x006e:
            r7 = r4
            goto L_0x0071
        L_0x0070:
            r7 = r1
        L_0x0071:
            if (r7 == 0) goto L_0x0074
            r1 = r4
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w2.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
