package androidx.compose.ui.platform;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import b0.d;
import b1.o;
import e.n0;
import e2.b0;
import e2.d0;
import e2.f0;
import e2.v;
import e2.w;
import g4.i;
import g5.e0;
import i4.g;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k2.a;
import v0.j;
import z4.a0;
import z4.b;
import z4.h;
import z4.l;
import z4.x;
import z4.z;

public class e implements d, b2.d, w, e0, g, a, v0.g, j, y1.g, b, l {

    /* renamed from: d  reason: collision with root package name */
    public static e f887d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f888e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final e f889f = new e();

    /* renamed from: g  reason: collision with root package name */
    public static final e f890g = new e();

    /* renamed from: h  reason: collision with root package name */
    public static final e f891h = new e();

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ e f892i = new e();

    /* renamed from: j  reason: collision with root package name */
    public static final e f893j = new e();

    /* renamed from: k  reason: collision with root package name */
    public static final d0 f894k = new d0(18);

    /* renamed from: l  reason: collision with root package name */
    public static final e f895l = new e();

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ e f896m = new e();

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ e f897n = new e();

    public /* synthetic */ e() {
    }

    public static final h j(e eVar, String str) {
        h hVar = new h(str);
        h.f6006c.put(str, hVar);
        return hVar;
    }

    public static final a0 k(a0 a0Var) {
        if ((a0Var != null ? a0Var.f5962j : null) == null) {
            return a0Var;
        }
        a0Var.getClass();
        z zVar = new z(a0Var);
        zVar.f6123g = null;
        return zVar.a();
    }

    public static ArrayList l(List list) {
        o.m(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((x) next) != x.f6105e) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.W(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x) it.next()).f6112d);
        }
        return arrayList2;
    }

    public static int m(int i3) {
        if (i3 < 8191) {
            return 13;
        }
        if (i3 < 32767) {
            return 15;
        }
        if (i3 < 65535) {
            return 16;
        }
        if (i3 < 262143) {
            return 18;
        }
        throw new IllegalArgumentException("Can't represent a size of " + i3 + " in Constraints");
    }

    public static byte[] n(List list) {
        o.m(list, "protocols");
        l5.g gVar = new l5.g();
        Iterator it = l(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            gVar.G(str.length());
            gVar.L(str);
        }
        return gVar.n(gVar.f4128e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0080, code lost:
        if (r11 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x007c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean s(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            java.lang.Object r0 = androidx.emoji2.text.l.f1011i
            r0 = 0
            if (r8 == 0) goto L_0x00fb
            if (r7 != 0) goto L_0x0009
            goto L_0x00fb
        L_0x0009:
            if (r9 < 0) goto L_0x00fb
            if (r10 >= 0) goto L_0x000f
            goto L_0x00fb
        L_0x000f:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = 1
            r4 = -1
            if (r1 == r4) goto L_0x0022
            if (r2 == r4) goto L_0x0022
            if (r1 == r2) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = r0
            goto L_0x0023
        L_0x0022:
            r5 = r3
        L_0x0023:
            if (r5 == 0) goto L_0x0027
            goto L_0x00fb
        L_0x0027:
            if (r11 == 0) goto L_0x00b1
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x0068
            if (r11 >= r1) goto L_0x0036
            goto L_0x0068
        L_0x0036:
            if (r9 >= 0) goto L_0x0039
            goto L_0x0068
        L_0x0039:
            r11 = r0
        L_0x003a:
            if (r9 != 0) goto L_0x003d
            goto L_0x0069
        L_0x003d:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x0046
            if (r11 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            r1 = r0
            goto L_0x0069
        L_0x0046:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x0056
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x0053
            goto L_0x0068
        L_0x0053:
            int r9 = r9 + -1
            goto L_0x0039
        L_0x0056:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x005f
            int r9 = r9 + -1
            goto L_0x003a
        L_0x005f:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r11 = r3
            goto L_0x003a
        L_0x0068:
            r1 = r4
        L_0x0069:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x00ab
            if (r10 >= r2) goto L_0x0076
            goto L_0x00ab
        L_0x0076:
            if (r9 >= 0) goto L_0x0079
            goto L_0x00ab
        L_0x0079:
            r11 = r0
        L_0x007a:
            if (r9 != 0) goto L_0x007e
            r10 = r2
            goto L_0x00ac
        L_0x007e:
            if (r2 < r10) goto L_0x0083
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ab
        L_0x0083:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x0095
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0090
            goto L_0x00ab
        L_0x0090:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0079
        L_0x0095:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x00a0
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x007a
        L_0x00a0:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x00a7
            goto L_0x00ab
        L_0x00a7:
            int r2 = r2 + 1
            r11 = r3
            goto L_0x007a
        L_0x00ab:
            r10 = r4
        L_0x00ac:
            if (r1 == r4) goto L_0x00fb
            if (r10 != r4) goto L_0x00bf
            goto L_0x00fb
        L_0x00b1:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00bf:
            java.lang.Class<androidx.emoji2.text.z> r9 = androidx.emoji2.text.z.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            androidx.emoji2.text.z[] r9 = (androidx.emoji2.text.z[]) r9
            if (r9 == 0) goto L_0x00fb
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00fb
            int r11 = r9.length
            r2 = r0
        L_0x00ce:
            if (r2 >= r11) goto L_0x00e5
            r4 = r9[r2]
            int r5 = r8.getSpanStart(r4)
            int r4 = r8.getSpanEnd(r4)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r4, r10)
            int r2 = r2 + 1
            goto L_0x00ce
        L_0x00e5:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            r0 = r3
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.e.s(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean t() {
        return o.c("Dalvik", System.getProperty("java.vm.name"));
    }

    public static boolean u(String str) {
        return !v4.i.T("Connection", str) && !v4.i.T("Keep-Alive", str) && !v4.i.T("Proxy-Authenticate", str) && !v4.i.T("Proxy-Authorization", str) && !v4.i.T("TE", str) && !v4.i.T("Trailers", str) && !v4.i.T("Transfer-Encoding", str) && !v4.i.T("Upgrade", str);
    }

    public void A(boolean z5) {
    }

    public void B() {
    }

    public void C() {
    }

    public Bitmap a(int i3, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i3, i6, config);
    }

    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void c(int i3) {
    }

    public v d(b0 b0Var) {
        return f0.f2506a;
    }

    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    public a2.f0 f(a2.f0 f0Var, y1.i iVar) {
        return f0Var;
    }

    public int g(CharSequence charSequence, int i3) {
        int i6 = i3 + 0;
        int i7 = 2;
        for (int i8 = 0; i8 < i6 && i7 == 2; i8++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i8));
            v0.i iVar = j.f5374a;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i7 = 2;
                            break;
                    }
                }
                i7 = 0;
            }
            i7 = 1;
        }
        return i7;
    }

    public Bitmap h(int i3, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i3, i6, config);
    }

    public void i() {
    }

    public synchronized h o(String str) {
        h hVar;
        String str2;
        o.m(str, "javaName");
        LinkedHashMap linkedHashMap = h.f6006c;
        hVar = (h) linkedHashMap.get(str);
        if (hVar == null) {
            if (v4.i.k0(str, "TLS_", false)) {
                String substring = str.substring(4);
                o.l(substring, "(this as java.lang.String).substring(startIndex)");
                str2 = "SSL_".concat(substring);
            } else if (v4.i.k0(str, "SSL_", false)) {
                String substring2 = str.substring(4);
                o.l(substring2, "(this as java.lang.String).substring(startIndex)");
                str2 = "TLS_".concat(substring2);
            } else {
                str2 = str;
            }
            hVar = (h) linkedHashMap.get(str2);
            if (hVar == null) {
                hVar = new h(str);
            }
            linkedHashMap.put(str, hVar);
        }
        return hVar;
    }

    public InputFilter[] p(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public KeyListener q(KeyListener keyListener) {
        return keyListener;
    }

    public Signature[] r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean v(Spannable spannable) {
        return false;
    }

    public InputConnection w(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public void x(boolean z5) {
    }

    public void y(boolean z5) {
    }

    public void z(boolean z5) {
    }

    public /* synthetic */ e(int i3) {
    }

    public /* synthetic */ e(int i3, int i6) {
    }

    public e(Context context) {
        context.getApplicationContext();
    }

    public e(e eVar, b0.a aVar) {
        androidx.appcompat.widget.a0 a0Var = b0.e.f1483a;
        new b0.g(b0.e.f1484b);
        new n0(7);
        o.m(a0Var, "typefaceRequestCache");
        new p.a(3, this);
    }
}
