package h5;

import a5.c;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.n0;
import b1.o;
import h2.q;
import h2.y;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.r;
import v4.i;
import z4.k;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final q f3465a = new q();

    /* renamed from: b  reason: collision with root package name */
    public static final r f3466b = new r("NO_DECISION");

    /* renamed from: c  reason: collision with root package name */
    public static final n0 f3467c = new n0(3);

    /* renamed from: d  reason: collision with root package name */
    public static final n0 f3468d = new n0(4);

    /* renamed from: e  reason: collision with root package name */
    public static boolean f3469e = true;

    /* renamed from: f  reason: collision with root package name */
    public static final r f3470f = new r("CLOSED_EMPTY");

    static {
        new r("REMOVED_TASK");
    }

    public /* synthetic */ d() {
    }

    /* JADX INFO: finally extract failed */
    public static h2.d a(b2.d dVar, Drawable drawable, int i3, int i6) {
        Bitmap bitmap;
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z5 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i3 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                }
                bitmap = null;
                z5 = true;
            } else if (i6 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                if (current.getIntrinsicWidth() > 0) {
                    i3 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i6 = current.getIntrinsicHeight();
                }
                Lock lock = y.f3449b;
                lock.lock();
                Bitmap a6 = dVar.a(i3, i6, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(a6);
                    current.setBounds(0, 0, i3, i6);
                    current.draw(canvas);
                    canvas.setBitmap((Bitmap) null);
                    lock.unlock();
                    bitmap = a6;
                    z5 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                }
                bitmap = null;
                z5 = true;
            }
            sb.append(str);
            Log.w("DrawableToBitmap", sb.toString());
            bitmap = null;
            z5 = true;
        } else {
            bitmap = null;
        }
        if (!z5) {
            dVar = f3465a;
        }
        return h2.d.e(bitmap, dVar);
    }

    public static int b(String str, int i3, int i6, boolean z5) {
        while (i3 < i6) {
            char charAt = str.charAt(i3);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z5)) {
                return i3;
            }
            i3++;
        }
        return i6;
    }

    public static boolean g() {
        return e.f3471d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.fragment.app.y h(android.content.Context r5, androidx.fragment.app.r r6, boolean r7, boolean r8) {
        /*
            androidx.fragment.app.p r0 = r6.K
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r2 = r1
            goto L_0x0009
        L_0x0007:
            int r2 = r0.f1233h
        L_0x0009:
            if (r8 == 0) goto L_0x001a
            if (r7 == 0) goto L_0x0014
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            r8 = r1
            goto L_0x0027
        L_0x0011:
            int r8 = r0.f1231f
            goto L_0x0027
        L_0x0014:
            if (r0 != 0) goto L_0x0017
            goto L_0x000f
        L_0x0017:
            int r8 = r0.f1232g
            goto L_0x0027
        L_0x001a:
            if (r7 == 0) goto L_0x0022
            if (r0 != 0) goto L_0x001f
            goto L_0x000f
        L_0x001f:
            int r8 = r0.f1229d
            goto L_0x0027
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x000f
        L_0x0025:
            int r8 = r0.f1230e
        L_0x0027:
            r6.F(r1, r1, r1, r1)
            android.view.ViewGroup r0 = r6.G
            r3 = 0
            if (r0 == 0) goto L_0x003d
            r4 = 2131231182(0x7f0801ce, float:1.8078438E38)
            java.lang.Object r0 = r0.getTag(r4)
            if (r0 == 0) goto L_0x003d
            android.view.ViewGroup r0 = r6.G
            r0.setTag(r4, r3)
        L_0x003d:
            android.view.ViewGroup r6 = r6.G
            if (r6 == 0) goto L_0x0048
            android.animation.LayoutTransition r6 = r6.getLayoutTransition()
            if (r6 == 0) goto L_0x0048
            return r3
        L_0x0048:
            if (r8 != 0) goto L_0x0078
            if (r2 == 0) goto L_0x0078
            r6 = 4097(0x1001, float:5.741E-42)
            if (r2 == r6) goto L_0x006e
            r6 = 4099(0x1003, float:5.744E-42)
            if (r2 == r6) goto L_0x0064
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r6) goto L_0x005a
            r6 = -1
            goto L_0x0077
        L_0x005a:
            if (r7 == 0) goto L_0x0060
            r6 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x0077
        L_0x0060:
            r6 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L_0x0077
        L_0x0064:
            if (r7 == 0) goto L_0x006a
            r6 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x0077
        L_0x006a:
            r6 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L_0x0077
        L_0x006e:
            if (r7 == 0) goto L_0x0074
            r6 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x0077
        L_0x0074:
            r6 = 2130837512(0x7f020008, float:1.727998E38)
        L_0x0077:
            r8 = r6
        L_0x0078:
            if (r8 == 0) goto L_0x00b8
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x009a
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch:{ NotFoundException -> 0x0098, RuntimeException -> 0x009a }
            if (r7 == 0) goto L_0x0096
            androidx.fragment.app.y r0 = new androidx.fragment.app.y     // Catch:{ NotFoundException -> 0x0098, RuntimeException -> 0x009a }
            r0.<init>((android.view.animation.Animation) r7)     // Catch:{ NotFoundException -> 0x0098, RuntimeException -> 0x009a }
            return r0
        L_0x0096:
            r1 = 1
            goto L_0x009a
        L_0x0098:
            r5 = move-exception
            throw r5
        L_0x009a:
            if (r1 != 0) goto L_0x00b8
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch:{ RuntimeException -> 0x00a8 }
            if (r7 == 0) goto L_0x00b8
            androidx.fragment.app.y r0 = new androidx.fragment.app.y     // Catch:{ RuntimeException -> 0x00a8 }
            r0.<init>((android.animation.Animator) r7)     // Catch:{ RuntimeException -> 0x00a8 }
            return r0
        L_0x00a8:
            r7 = move-exception
            if (r6 != 0) goto L_0x00b7
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto L_0x00b8
            androidx.fragment.app.y r6 = new androidx.fragment.app.y
            r6.<init>((android.view.animation.Animation) r5)
            return r6
        L_0x00b7:
            throw r7
        L_0x00b8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.d.h(android.content.Context, androidx.fragment.app.r, boolean, boolean):androidx.fragment.app.y");
    }

    public static void i(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static long l(int i3, String str) {
        int b6 = b(str, 0, i3, false);
        Matcher matcher = k.f6038m.matcher(str);
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (b6 < i3) {
            int b7 = b(str, b6 + 1, i3, true);
            matcher.region(b6, b7);
            if (i7 == -1 && matcher.usePattern(k.f6038m).matches()) {
                String group = matcher.group(1);
                o.l(group, "matcher.group(1)");
                i7 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                o.l(group2, "matcher.group(2)");
                i10 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                o.l(group3, "matcher.group(3)");
                i11 = Integer.parseInt(group3);
            } else if (i8 != -1 || !matcher.usePattern(k.f6037l).matches()) {
                if (i9 == -1) {
                    Pattern pattern = k.f6036k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        o.l(group4, "matcher.group(1)");
                        Locale locale = Locale.US;
                        o.l(locale, "Locale.US");
                        String lowerCase = group4.toLowerCase(locale);
                        o.l(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        o.l(pattern2, "MONTH_PATTERN.pattern()");
                        i9 = i.Y(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i6 == -1 && matcher.usePattern(k.f6035j).matches()) {
                    String group5 = matcher.group(1);
                    o.l(group5, "matcher.group(1)");
                    i6 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                o.l(group6, "matcher.group(1)");
                i8 = Integer.parseInt(group6);
            }
            b6 = b(str, b7 + 1, i3, false);
        }
        if (70 <= i6 && 99 >= i6) {
            i6 += 1900;
        }
        if (i6 >= 0 && 69 >= i6) {
            i6 += 2000;
        }
        if (i6 >= 1601) {
            if (i9 != -1) {
                if (1 <= i8 && 31 >= i8) {
                    if (i7 >= 0 && 23 >= i7) {
                        if (i10 >= 0 && 59 >= i10) {
                            if (i11 >= 0 && 59 >= i11) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f216e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i6);
                                gregorianCalendar.set(2, i9 - 1);
                                gregorianCalendar.set(5, i8);
                                gregorianCalendar.set(11, i7);
                                gregorianCalendar.set(12, i10);
                                gregorianCalendar.set(13, i11);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static void m(ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z5);
        } else if (f3469e) {
            try {
                viewGroup.suppressLayout(z5);
            } catch (NoSuchMethodError unused) {
                f3469e = false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.io.FileNotFoundException} */
    /* JADX WARNING: type inference failed for: r2v10, types: [byte[], n1.c[]] */
    /* JADX WARNING: type inference failed for: r1v1, types: [byte[], n1.c[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0240, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x024b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:184:0x0234, B:194:0x0247] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c2 A[SYNTHETIC, Splitter:B:134:0x01c2] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x027c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103 A[SYNTHETIC, Splitter:B:56:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(android.content.Context r19, i.a r20, n1.d r21, boolean r22) {
        /*
            r1 = r19
            r8 = r21
            android.content.Context r0 = r19.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r19.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x0297 }
            java.io.File r13 = r19.getFilesDir()
            r14 = 1
            r15 = 0
            java.lang.String r3 = "ProfileInstaller"
            if (r22 != 0) goto L_0x0088
            java.io.File r0 = new java.io.File
            java.lang.String r4 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0040
            goto L_0x006d
        L_0x0040:
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006d }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006d }
            r5.<init>(r0)     // Catch:{ IOException -> 0x006d }
            r4.<init>(r5)     // Catch:{ IOException -> 0x006d }
            long r16 = r4.readLong()     // Catch:{ all -> 0x0061 }
            r4.close()     // Catch:{ IOException -> 0x006d }
            long r4 = r12.lastUpdateTime
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            r0 = r14
            goto L_0x005a
        L_0x0059:
            r0 = r11
        L_0x005a:
            if (r0 == 0) goto L_0x006e
            r4 = 2
            r8.o(r4, r15)
            goto L_0x006e
        L_0x0061:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x0067 }
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x006d }
        L_0x006c:
            throw r5     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            r0 = r11
        L_0x006e:
            if (r0 != 0) goto L_0x0071
            goto L_0x0088
        L_0x0071:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r19.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            goto L_0x0281
        L_0x0088:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Installing profile for "
            r0.<init>(r4)
            java.lang.String r4 = r19.getPackageName()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r7 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r3, r2)
            n1.b r5 = new n1.b
            java.lang.String r4 = "dexopt/baseline.prof"
            r2 = r5
            r3 = r9
            r11 = r4
            r4 = r20
            r10 = r5
            r5 = r21
            r18 = r7
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 4
            byte[] r3 = r10.f4235c
            if (r3 != 0) goto L_0x00cc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 3
            r10.b(r4, r0)
            goto L_0x00d5
        L_0x00cc:
            boolean r0 = r18.canWrite()
            if (r0 != 0) goto L_0x00d7
            r10.b(r2, r15)
        L_0x00d5:
            r0 = 0
            goto L_0x00da
        L_0x00d7:
            r10.f4238f = r14
            r0 = r14
        L_0x00da:
            if (r0 != 0) goto L_0x00e0
            r4 = r14
            r5 = 0
            goto L_0x027a
        L_0x00e0:
            boolean r0 = r10.f4238f
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0291
            byte[] r5 = h5.l.f3488g
            r6 = 8
            if (r3 != 0) goto L_0x00ee
            goto L_0x01b3
        L_0x00ee:
            java.io.FileInputStream r0 = r10.a(r9, r11)     // Catch:{ FileNotFoundException -> 0x00f8, IOException -> 0x00f4 }
            r11 = r0
            goto L_0x00ff
        L_0x00f4:
            r0 = move-exception
            r11 = r0
            r0 = 7
            goto L_0x00fb
        L_0x00f8:
            r0 = move-exception
            r11 = r0
            r0 = 6
        L_0x00fb:
            r8.o(r0, r11)
            r11 = r15
        L_0x00ff:
            java.lang.String r7 = "Invalid magic"
            if (r11 == 0) goto L_0x0151
            byte[] r0 = b1.o.O(r11, r2)     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
            boolean r0 = java.util.Arrays.equals(r5, r0)     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
            if (r0 == 0) goto L_0x0128
            byte[] r0 = b1.o.O(r11, r2)     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
            java.lang.String r14 = r10.f4237e     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
            n1.c[] r14 = h5.l.p(r11, r0, r14)     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
            r11.close()     // Catch:{ IOException -> 0x011b }
            goto L_0x0143
        L_0x011b:
            r0 = move-exception
            r11 = r0
            r15 = 7
            r8.o(r15, r11)
            goto L_0x0143
        L_0x0122:
            r0 = move-exception
            goto L_0x0130
        L_0x0124:
            r0 = move-exception
            goto L_0x012e
        L_0x0126:
            r0 = move-exception
            goto L_0x0135
        L_0x0128:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
            throw r0     // Catch:{ IOException -> 0x0126, IllegalStateException -> 0x0122 }
        L_0x012e:
            r1 = r0
            goto L_0x0146
        L_0x0130:
            r8.o(r6, r0)     // Catch:{ all -> 0x0124 }
            r14 = 7
            goto L_0x0139
        L_0x0135:
            r14 = 7
            r8.o(r14, r0)     // Catch:{ all -> 0x0124 }
        L_0x0139:
            r11.close()     // Catch:{ IOException -> 0x013d }
            goto L_0x0142
        L_0x013d:
            r0 = move-exception
            r11 = r0
            r8.o(r14, r11)
        L_0x0142:
            r14 = 0
        L_0x0143:
            r10.f4239g = r14
            goto L_0x0151
        L_0x0146:
            r11.close()     // Catch:{ IOException -> 0x014a }
            goto L_0x0150
        L_0x014a:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.o(r3, r2)
        L_0x0150:
            throw r1
        L_0x0151:
            n1.c[] r0 = r10.f4239g
            if (r0 == 0) goto L_0x01b3
            int r11 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r11 <= r14) goto L_0x015c
            goto L_0x0162
        L_0x015c:
            switch(r11) {
                case 31: goto L_0x0160;
                case 32: goto L_0x0160;
                case 33: goto L_0x0160;
                default: goto L_0x015f;
            }
        L_0x015f:
            goto L_0x0162
        L_0x0160:
            r11 = 1
            goto L_0x0163
        L_0x0162:
            r11 = 0
        L_0x0163:
            if (r11 == 0) goto L_0x01b3
            java.lang.String r11 = "dexopt/baseline.profm"
            java.io.FileInputStream r9 = r10.a(r9, r11)     // Catch:{ FileNotFoundException -> 0x01a9, IOException -> 0x01a6, IllegalStateException -> 0x01a0 }
            if (r9 == 0) goto L_0x019a
            byte[] r11 = h5.l.f3489h     // Catch:{ all -> 0x018e }
            byte[] r14 = b1.o.O(r9, r2)     // Catch:{ all -> 0x018e }
            boolean r11 = java.util.Arrays.equals(r11, r14)     // Catch:{ all -> 0x018e }
            if (r11 == 0) goto L_0x0188
            byte[] r2 = b1.o.O(r9, r2)     // Catch:{ all -> 0x018e }
            n1.c[] r0 = h5.l.m(r9, r2, r3, r0)     // Catch:{ all -> 0x018e }
            r10.f4239g = r0     // Catch:{ all -> 0x018e }
            r9.close()     // Catch:{ FileNotFoundException -> 0x01a9, IOException -> 0x01a6, IllegalStateException -> 0x01a0 }
            r0 = r10
            goto L_0x01b0
        L_0x0188:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x018e }
            r0.<init>(r7)     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0199
        L_0x0194:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x01a9, IOException -> 0x01a6, IllegalStateException -> 0x01a0 }
        L_0x0199:
            throw r2     // Catch:{ FileNotFoundException -> 0x01a9, IOException -> 0x01a6, IllegalStateException -> 0x01a0 }
        L_0x019a:
            if (r9 == 0) goto L_0x01af
            r9.close()     // Catch:{ FileNotFoundException -> 0x01a9, IOException -> 0x01a6, IllegalStateException -> 0x01a0 }
            goto L_0x01af
        L_0x01a0:
            r0 = move-exception
            r2 = 0
            r10.f4239g = r2
            r2 = r6
            goto L_0x01ac
        L_0x01a6:
            r0 = move-exception
            r2 = 7
            goto L_0x01ac
        L_0x01a9:
            r0 = move-exception
            r2 = 9
        L_0x01ac:
            r8.o(r2, r0)
        L_0x01af:
            r0 = 0
        L_0x01b0:
            if (r0 == 0) goto L_0x01b3
            r10 = r0
        L_0x01b3:
            n1.d r2 = r10.f4234b
            n1.c[] r0 = r10.f4239g
            if (r0 == 0) goto L_0x0205
            byte[] r3 = r10.f4235c
            if (r3 != 0) goto L_0x01be
            goto L_0x0205
        L_0x01be:
            boolean r7 = r10.f4238f
            if (r7 == 0) goto L_0x01ff
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01f6, IllegalStateException -> 0x01f4 }
            r7.<init>()     // Catch:{ IOException -> 0x01f6, IllegalStateException -> 0x01f4 }
            r7.write(r5)     // Catch:{ all -> 0x01e8 }
            r7.write(r3)     // Catch:{ all -> 0x01e8 }
            boolean r0 = h5.l.s(r7, r3, r0)     // Catch:{ all -> 0x01e8 }
            if (r0 != 0) goto L_0x01de
            r0 = 5
            r3 = 0
            r2.o(r0, r3)     // Catch:{ all -> 0x01e8 }
            r10.f4239g = r3     // Catch:{ all -> 0x01e8 }
            r7.close()     // Catch:{ IOException -> 0x01f6, IllegalStateException -> 0x01f4 }
            goto L_0x0205
        L_0x01de:
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x01e8 }
            r10.f4240h = r0     // Catch:{ all -> 0x01e8 }
            r7.close()     // Catch:{ IOException -> 0x01f6, IllegalStateException -> 0x01f4 }
            goto L_0x01fb
        L_0x01e8:
            r0 = move-exception
            r3 = r0
            r7.close()     // Catch:{ all -> 0x01ee }
            goto L_0x01f3
        L_0x01ee:
            r0 = move-exception
            r5 = r0
            r3.addSuppressed(r5)     // Catch:{ IOException -> 0x01f6, IllegalStateException -> 0x01f4 }
        L_0x01f3:
            throw r3     // Catch:{ IOException -> 0x01f6, IllegalStateException -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
            goto L_0x01f8
        L_0x01f6:
            r0 = move-exception
            r6 = 7
        L_0x01f8:
            r2.o(r6, r0)
        L_0x01fb:
            r2 = 0
            r10.f4239g = r2
            goto L_0x0205
        L_0x01ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0205:
            byte[] r0 = r10.f4240h
            if (r0 != 0) goto L_0x020c
            r4 = 1
            goto L_0x0274
        L_0x020c:
            boolean r2 = r10.f4238f
            if (r2 == 0) goto L_0x028b
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x026b, IOException -> 0x0264 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x026b, IOException -> 0x0264 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0251 }
            java.io.File r0 = r10.f4236d     // Catch:{ all -> 0x0251 }
            r3.<init>(r0)     // Catch:{ all -> 0x0251 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0244 }
        L_0x0220:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x0244 }
            if (r4 <= 0) goto L_0x022f
            r5 = 0
            r3.write(r0, r5, r4)     // Catch:{ all -> 0x022b }
            goto L_0x0220
        L_0x022b:
            r0 = move-exception
            r5 = r0
            r4 = 1
            goto L_0x0247
        L_0x022f:
            r4 = 1
            r5 = 0
            r10.b(r4, r5)     // Catch:{ all -> 0x0242 }
            r3.close()     // Catch:{ all -> 0x0240 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0260, IOException -> 0x025e }
            r10.f4240h = r5
            r10.f4239g = r5
            r5 = r4
            goto L_0x0275
        L_0x0240:
            r0 = move-exception
            goto L_0x0253
        L_0x0242:
            r0 = move-exception
            goto L_0x0246
        L_0x0244:
            r0 = move-exception
            r4 = 1
        L_0x0246:
            r5 = r0
        L_0x0247:
            r3.close()     // Catch:{ all -> 0x024b }
            goto L_0x0250
        L_0x024b:
            r0 = move-exception
            r3 = r0
            r5.addSuppressed(r3)     // Catch:{ all -> 0x0240 }
        L_0x0250:
            throw r5     // Catch:{ all -> 0x0240 }
        L_0x0251:
            r0 = move-exception
            r4 = 1
        L_0x0253:
            r3 = r0
            r2.close()     // Catch:{ all -> 0x0258 }
            goto L_0x025d
        L_0x0258:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0260, IOException -> 0x025e }
        L_0x025d:
            throw r3     // Catch:{ FileNotFoundException -> 0x0260, IOException -> 0x025e }
        L_0x025e:
            r0 = move-exception
            goto L_0x0266
        L_0x0260:
            r0 = move-exception
            goto L_0x026d
        L_0x0262:
            r0 = move-exception
            goto L_0x0285
        L_0x0264:
            r0 = move-exception
            r4 = 1
        L_0x0266:
            r2 = 7
        L_0x0267:
            r10.b(r2, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x026f
        L_0x026b:
            r0 = move-exception
            r4 = 1
        L_0x026d:
            r2 = 6
            goto L_0x0267
        L_0x026f:
            r2 = 0
            r10.f4240h = r2
            r10.f4239g = r2
        L_0x0274:
            r5 = 0
        L_0x0275:
            if (r5 == 0) goto L_0x027a
            i(r12, r13)
        L_0x027a:
            if (r5 == 0) goto L_0x0280
            if (r22 == 0) goto L_0x0280
            r11 = r4
            goto L_0x0281
        L_0x0280:
            r11 = 0
        L_0x0281:
            n1.k.b(r1, r11)
            return
        L_0x0285:
            r1 = 0
            r10.f4240h = r1
            r10.f4239g = r1
            throw r0
        L_0x028b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0291:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0297:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.o(r3, r2)
            r2 = 0
            n1.k.b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.d.n(android.content.Context, i.a, n1.d, boolean):void");
    }

    public abstract Method c(Class cls, Field field);

    public abstract Constructor d(Class cls);

    public abstract String[] e(Class cls);

    public abstract boolean f(Class cls);

    public abstract void j(int i3);

    public abstract void k(Typeface typeface, boolean z5);

    public /* synthetic */ d(Object obj) {
    }
}
