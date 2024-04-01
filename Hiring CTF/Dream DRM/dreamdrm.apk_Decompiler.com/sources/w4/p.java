package w4;

import a5.c;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.appcompat.widget.w2;
import androidx.lifecycle.q;
import b1.v;
import i4.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.r;
import n0.e;
import n0.f;
import p0.i;
import q0.m;
import s4.a;
import w0.b;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f5500a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final r f5501b = new r("CONDITION_FALSE");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f5502c = {48, 49, 53, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5503d = {48, 49, 48, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5504e = {48, 48, 57, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f5505f = {48, 48, 53, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f5506g = {48, 48, 49, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f5507h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f5508i = {48, 48, 50, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f5509j = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f5510k = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f5511l = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f5512m = {16842755, 16843781, 16844062};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f5513n = {16843161};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f5514o = {16842755, 16843213};

    /* renamed from: p  reason: collision with root package name */
    public static boolean f5515p = false;

    /* renamed from: q  reason: collision with root package name */
    public static Method f5516q = null;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f5517r = false;

    /* renamed from: s  reason: collision with root package name */
    public static Field f5518s;

    public p() {
        new AtomicReference();
    }

    public static void b(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean d(String[] strArr) {
        for (String file : strArr) {
            if (new File(file).exists()) {
                return true;
            }
        }
        return false;
    }

    public static void e(String str) {
        if (str.length() > 0) {
            int length = str.length();
            int i3 = 0;
            while (i3 < length) {
                char charAt = str.charAt(i3);
                if ('!' <= charAt && '~' >= charAt) {
                    i3++;
                } else {
                    throw new IllegalArgumentException(c.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i3), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int g(Context context, String str) {
        int i3;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d6 = e.d(str);
        if (d6 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            Class cls = AppOpsManager.class;
            if (!(Process.myUid() == myUid && b.a(context.getPackageName(), packageName))) {
                i3 = e.c((AppOpsManager) e.a(context, cls), d6, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c6 = f.c(context);
                i3 = f.a(c6, d6, Binder.getCallingUid(), packageName);
                if (i3 == 0) {
                    i3 = f.a(c6, d6, myUid, f.b(context));
                }
            } else {
                i3 = e.c((AppOpsManager) e.a(context, cls), d6, packageName);
            }
            if (i3 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void h(String str, String str2) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                i3++;
            } else {
                throw new IllegalArgumentException(c.g("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i3), str2, str).toString());
            }
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean j(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean k6 = k(file, inputStream);
                i(inputStream);
                return k6;
            } catch (Throwable th) {
                th = th;
                i(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            i(inputStream);
            throw th;
        }
    }

    public static boolean k(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        i(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    i(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i(fileOutputStream2);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            i(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(android.view.View r3, android.view.KeyEvent r4) {
        /*
            java.util.WeakHashMap r0 = x0.u0.f5622a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000a
            goto L_0x007b
        L_0x000a:
            java.util.ArrayList r0 = x0.t0.f5614d
            r0 = 2131231135(0x7f08019f, float:1.8078342E38)
            java.lang.Object r1 = r3.getTag(r0)
            x0.t0 r1 = (x0.t0) r1
            if (r1 != 0) goto L_0x001f
            x0.t0 r1 = new x0.t0
            r1.<init>()
            r3.setTag(r0, r1)
        L_0x001f:
            java.lang.ref.WeakReference r3 = r1.f5617c
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L_0x002a
            goto L_0x007b
        L_0x002a:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r1.f5617c = r3
            android.util.SparseArray r3 = r1.f5616b
            if (r3 != 0) goto L_0x003c
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.f5616b = r3
        L_0x003c:
            android.util.SparseArray r3 = r1.f5616b
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != r1) goto L_0x0059
            int r0 = r4.getKeyCode()
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L_0x0059
            java.lang.Object r2 = r3.valueAt(r0)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            r3.removeAt(r0)
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r2 != 0) goto L_0x0067
            int r4 = r4.getKeyCode()
            java.lang.Object r3 = r3.get(r4)
            r2 = r3
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
        L_0x0067:
            if (r2 == 0) goto L_0x007b
            java.lang.Object r3 = r2.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x007c
            boolean r4 = x0.g0.b(r3)
            if (r4 == 0) goto L_0x007c
            x0.t0.b(r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.p.l(android.view.View, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m(x0.l r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            boolean r7 = r7.d(r10)
            return r7
        L_0x000f:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0081
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0064
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L_0x0064
            if (r8 == 0) goto L_0x0064
            boolean r1 = f5515p
            if (r1 != 0) goto L_0x004c
            java.lang.Class r1 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            f5516q = r1     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            f5515p = r3
        L_0x004c:
            java.lang.reflect.Method r1 = f5516q
            if (r1 == 0) goto L_0x0061
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            r4[r0] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            if (r8 != 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            boolean r0 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
        L_0x0061:
            if (r0 == 0) goto L_0x0064
            goto L_0x0080
        L_0x0064:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x006b
            goto L_0x0080
        L_0x006b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = x0.u0.b(r7, r10)
            if (r8 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            if (r7 == 0) goto L_0x007c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x007c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x0080:
            return r3
        L_0x0081:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x00d4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f5517r
            if (r7 != 0) goto L_0x009a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0098 }
            f5518s = r7     // Catch:{ NoSuchFieldException -> 0x0098 }
            r7.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0098 }
        L_0x0098:
            f5517r = r3
        L_0x009a:
            java.lang.reflect.Field r7 = f5518s
            if (r7 == 0) goto L_0x00a5
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a5 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
            r7 = r2
        L_0x00a6:
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b3
            goto L_0x00d3
        L_0x00b3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00be
            goto L_0x00d3
        L_0x00be:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = x0.u0.b(r7, r10)
            if (r8 == 0) goto L_0x00c9
            goto L_0x00d3
        L_0x00c9:
            if (r7 == 0) goto L_0x00cf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x00cf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x00d3:
            return r3
        L_0x00d4:
            if (r8 == 0) goto L_0x00dc
            boolean r8 = x0.u0.b(r8, r10)
            if (r8 != 0) goto L_0x00e2
        L_0x00dc:
            boolean r7 = r7.d(r10)
            if (r7 == 0) goto L_0x00e3
        L_0x00e2:
            r0 = r3
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.p.m(x0.l, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static Drawable n(Context context, int i3) {
        return w2.c().e(context, i3);
    }

    public static Drawable o(Context context, Context context2, int i3, Resources.Theme theme) {
        try {
            if (f5500a) {
                return n(theme != null ? new g.f(context2, theme) : context2, i3);
            }
        } catch (NoClassDefFoundError unused) {
            f5500a = false;
        } catch (IllegalStateException e6) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = n0.b.f4213a;
                return o0.b.b(context2, i3);
            }
            throw e6;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = p0.p.f4411a;
        return i.a(resources, i3, theme);
    }

    public static final String p(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static File q(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i3 = 0;
        while (i3 < 100) {
            File file = new File(cacheDir, str + i3);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i3++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static MappedByteBuffer r(Context context, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor a6 = m.a(context.getContentResolver(), uri, "r", (CancellationSignal) null);
            if (a6 == null) {
                if (a6 != null) {
                    a6.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(a6.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                a6.close();
                return map;
            } catch (Throwable th) {
                a6.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static z4.r s(String... strArr) {
        if (strArr.length % 2 == 0) {
            Object clone = strArr.clone();
            if (clone != null) {
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i3 = 0;
                while (i3 < length) {
                    String str = strArr2[i3];
                    if (!(str != null)) {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    } else if (str != null) {
                        strArr2[i3] = v4.i.n0(str).toString();
                        i3++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                a R = v.R(v.T(0, strArr2.length), 2);
                int i6 = R.f5073d;
                int i7 = R.f5074e;
                int i8 = R.f5075f;
                if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                    while (true) {
                        String str2 = strArr2[i6];
                        String str3 = strArr2[i6 + 1];
                        e(str2);
                        h(str3, str2);
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    }
                }
                return new z4.r(strArr2);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static final String u(d dVar) {
        String str;
        if (dVar instanceof kotlinx.coroutines.internal.c) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + p(dVar);
        } catch (Throwable th) {
            str = com.bumptech.glide.c.k(th);
        }
        Throwable a6 = f4.e.a(str);
        String str2 = str;
        if (a6 != null) {
            str2 = dVar.getClass().getName() + '@' + p(dVar);
        }
        return (String) str2;
    }

    public abstract void a(q qVar);

    public abstract void t(q qVar);
}
