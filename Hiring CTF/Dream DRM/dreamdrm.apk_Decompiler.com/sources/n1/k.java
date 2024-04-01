package n1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.ui.platform.e;
import e0.g;
import e0.h;
import java.io.File;
import java.io.IOException;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4257a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4258b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static e f4259c = null;

    public static e a(int i3, boolean z5, boolean z6) {
        e eVar = new e();
        f4259c = eVar;
        h hVar = f4257a;
        hVar.getClass();
        if (g.f2477f.c(hVar, (Object) null, eVar)) {
            g.b(hVar);
        }
        return f4259c;
    }

    public static void b(Context context, boolean z5) {
        PackageInfo packageInfo;
        j jVar;
        j jVar2;
        if (z5 || f4259c == null) {
            synchronized (f4258b) {
                if (!z5) {
                    if (f4259c != null) {
                        return;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                int i6 = 0;
                if (i3 >= 28) {
                    if (i3 != 30) {
                        File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length = file.length();
                        boolean z6 = file.exists() && length > 0;
                        File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        boolean z7 = file2.exists() && length2 > 0;
                        try {
                            PackageManager packageManager = context.getApplicationContext().getPackageManager();
                            if (i3 >= 33) {
                                packageInfo = i.a(packageManager, context);
                            } else {
                                Context context2 = context;
                                packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                            }
                            long j6 = packageInfo.lastUpdateTime;
                            File file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    jVar = j.a(file3);
                                } catch (IOException unused) {
                                    a(131072, z6, z7);
                                    return;
                                }
                            } else {
                                jVar = null;
                            }
                            if (jVar != null && jVar.f4255c == j6) {
                                int i7 = jVar.f4254b;
                                if (i7 != 2) {
                                    i6 = i7;
                                    if (z5 && z7 && i6 != 1) {
                                        i6 = 2;
                                    }
                                    if (jVar != null && jVar.f4254b == 2 && i6 == 1 && length < jVar.f4256d) {
                                        i6 = 3;
                                    }
                                    jVar2 = new j(1, i6, j6, length2);
                                    if (jVar == null || !jVar.equals(jVar2)) {
                                        jVar2.b(file3);
                                    }
                                    a(i6, z6, z7);
                                    return;
                                }
                            }
                            if (z6) {
                                i6 = 1;
                            } else if (z7) {
                                i6 = 2;
                            }
                            i6 = 2;
                            i6 = 3;
                            jVar2 = new j(1, i6, j6, length2);
                            try {
                                jVar2.b(file3);
                            } catch (IOException unused2) {
                                i6 = 196608;
                            }
                            a(i6, z6, z7);
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            a(65536, z6, z7);
                            return;
                        }
                    }
                }
                a(262144, false, false);
            }
        }
    }
}
