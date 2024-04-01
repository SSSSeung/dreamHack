package androidx.fragment.app;

import a2.k;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import b1.o;
import b1.v;
import e2.b0;
import e2.e0;
import e2.g;
import e2.l;
import e2.w;
import e5.h;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import l5.e;
import l5.j;
import n1.d;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import q1.f;
import r2.b;
import s2.a;
import v4.i;
import y1.c;
import z4.x;

public class n0 implements l0, d, a, c2.a, w, c, l {

    /* renamed from: e  reason: collision with root package name */
    public static Field f1215e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1216f;

    /* renamed from: d  reason: collision with root package name */
    public final int f1217d;

    public /* synthetic */ n0() {
        this.f1217d = 9;
    }

    public static final String g(byte[] bArr, byte[][] bArr2, int i3) {
        int i6;
        boolean z5;
        byte b6;
        int i7;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        byte[] bArr5 = PublicSuffixDatabase.f4347e;
        int length = bArr3.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > -1 && bArr3[i9] != ((byte) 10)) {
                i9--;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i6 = i10 + i11;
                if (bArr3[i6] == ((byte) 10)) {
                    break;
                }
                i11++;
            }
            int i12 = i6 - i10;
            int i13 = i3;
            boolean z6 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z6) {
                    b6 = 46;
                    z5 = false;
                } else {
                    byte b7 = bArr4[i13][i14];
                    byte[] bArr6 = a5.c.f212a;
                    byte b8 = b7 & 255;
                    z5 = z6;
                    b6 = b8;
                }
                byte b9 = bArr3[i10 + i15];
                byte[] bArr7 = a5.c.f212a;
                i7 = b6 - (b9 & 255);
                if (i7 == 0) {
                    i15++;
                    i14++;
                    if (i15 == i12) {
                        break;
                    } else if (bArr4[i13].length != i14) {
                        z6 = z5;
                    } else if (i13 == bArr4.length - 1) {
                        break;
                    } else {
                        i13++;
                        i14 = -1;
                        z6 = true;
                    }
                } else {
                    break;
                }
            }
            if (i7 >= 0) {
                if (i7 <= 0) {
                    int i16 = i12 - i15;
                    int length2 = bArr4[i13].length - i14;
                    int length3 = bArr4.length;
                    for (int i17 = i13 + 1; i17 < length3; i17++) {
                        length2 += bArr4[i17].length;
                    }
                    if (length2 >= i16) {
                        if (length2 <= i16) {
                            Charset charset = StandardCharsets.UTF_8;
                            o.l(charset, "UTF_8");
                            return new String(bArr3, i10, i12, charset);
                        }
                    }
                }
                i8 = i6 + 1;
            }
            length = i10 - 1;
        }
        return null;
    }

    public static e h() {
        e eVar = e.f4121j;
        o.k(eVar);
        e eVar2 = eVar.f4123f;
        long nanoTime = System.nanoTime();
        Class<e> cls = e.class;
        if (eVar2 == null) {
            cls.wait(e.f4119h);
            e eVar3 = e.f4121j;
            o.k(eVar3);
            if (eVar3.f4123f != null || System.nanoTime() - nanoTime < e.f4120i) {
                return null;
            }
            return e.f4121j;
        }
        long j6 = eVar2.f4124g - nanoTime;
        if (j6 > 0) {
            long j7 = j6 / 1000000;
            cls.wait(j7, (int) (j6 - (1000000 * j7)));
            return null;
        }
        e eVar4 = e.f4121j;
        o.k(eVar4);
        eVar4.f4123f = eVar2.f4123f;
        eVar2.f4123f = null;
        return eVar2;
    }

    public static q1.e i(f fVar) {
        o.m(fVar, "owner");
        return new q1.e(fVar);
    }

    public static j j(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i6 = i3 * 2;
                bArr[i3] = (byte) (com.bumptech.glide.d.a(str.charAt(i6 + 1)) + (com.bumptech.glide.d.a(str.charAt(i6)) << 4));
            }
            return new j(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static void m(Activity activity, androidx.lifecycle.l lVar) {
        o.m(activity, "activity");
        o.m(lVar, "event");
        if (activity instanceof r) {
            t h6 = ((r) activity).h();
            if (h6 instanceof t) {
                h6.x(lVar);
            }
        }
    }

    public static j n(String str) {
        o.m(str, "$this$encodeUtf8");
        byte[] bytes = str.getBytes(v4.a.f5409a);
        o.l(bytes, "(this as java.lang.String).getBytes(charset)");
        j jVar = new j(bytes);
        jVar.f4131e = str;
        return jVar;
    }

    public static Path q(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(f6, f7);
        path.lineTo(f8, f9);
        return path;
    }

    public static void r(Activity activity) {
        o.m(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            g0.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new g0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new h0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static int s(int i3, int i6, int i7) {
        if ((i6 & 8) != 0) {
            i3--;
        }
        if (i7 <= i3) {
            return i3 - i7;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i7 + " > remaining length " + i3);
    }

    public static j u(byte[] bArr) {
        j jVar = j.f4129g;
        int length = bArr.length;
        com.bumptech.glide.e.g((long) bArr.length, (long) 0, (long) length);
        int i3 = length + 0;
        v.p(i3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i3);
        o.l(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return new j(copyOfRange);
    }

    public static h v(String str) {
        int i3;
        String str2;
        o.m(str, "statusLine");
        boolean k02 = i.k0(str, "HTTP/1.", false);
        x xVar = x.f6105e;
        if (k02) {
            i3 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    xVar = x.f6106f;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (i.k0(str, "ICY ", false)) {
            i3 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i6 = i3 + 3;
        if (str.length() >= i6) {
            try {
                String substring = str.substring(i3, i6);
                o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i6) {
                    str2 = "";
                } else if (str.charAt(i6) == ' ') {
                    str2 = str.substring(i3 + 4);
                    o.l(str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new h(xVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public File a(y1.f fVar) {
        return null;
    }

    public k0 b(Class cls) {
        switch (this.f1217d) {
            case 0:
                return new o0(true);
            default:
                return new m1.a();
        }
    }

    public e2.v d(b0 b0Var) {
        Class<Uri> cls = Uri.class;
        switch (this.f1217d) {
            case 21:
                return new g(0, new e.n0(29, (Object) this));
            case 22:
                return new g(0, new e2.f(0, this));
            case 24:
                return new e2.i(0);
            case 28:
                return new e0(b0Var.a(cls, AssetFileDescriptor.class), 0);
            default:
                return new e0(b0Var.a(cls, ParcelFileDescriptor.class), 0);
        }
    }

    public boolean e(Object obj, File file, y1.i iVar) {
        try {
            b.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e6) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e6);
            }
            return false;
        }
    }

    public void f(y1.f fVar, k kVar) {
    }

    public void l() {
        switch (this.f1217d) {
            case 3:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    public void o(int i3, Object obj) {
        String str;
        switch (this.f1217d) {
            case 3:
                return;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                    default:
                        str = "";
                        break;
                }
                if (i3 == 6 || i3 == 7 || i3 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    return;
                } else {
                    Log.d("ProfileInstaller", str);
                    return;
                }
        }
    }

    public i5.g p() {
        switch (this.f1217d) {
            case 17:
                return i5.h.f3620a;
            default:
                return i5.j.f3625a;
        }
    }

    public Object t() {
        return new a2.e0();
    }

    public void w(View view, int i3) {
        if (!f1216f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1215e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f1216f = true;
        }
        Field field = f1215e;
        if (field != null) {
            try {
                f1215e.setInt(view, i3 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public /* synthetic */ n0(int i3) {
        this.f1217d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i3, int i6) {
        this(27);
        this.f1217d = i3;
        switch (i3) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                return;
            default:
                this(0);
                return;
        }
    }
}
