package h5;

import a2.m;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import b1.o;
import e.h;
import f4.e;
import i4.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.r;
import n1.c;
import u0.g;
import w4.c1;
import w4.d0;
import w4.i;
import w4.i0;
import w4.j;
import w4.p;
import w4.q0;
import w4.z;
import w4.z0;
import y.b;

public abstract class l {

    /* renamed from: d  reason: collision with root package name */
    public static String f3485d;

    /* renamed from: e  reason: collision with root package name */
    public static String f3486e;

    /* renamed from: f  reason: collision with root package name */
    public static final r f3487f = new r("UNDEFINED");

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f3488g = {112, 114, 111, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f3489h = {112, 114, 109, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final b f3490i = new b(1);

    /* renamed from: j  reason: collision with root package name */
    public static final r f3491j = new r("COMPLETING_ALREADY");

    /* renamed from: k  reason: collision with root package name */
    public static final r f3492k = new r("COMPLETING_WAITING_CHILDREN");

    /* renamed from: l  reason: collision with root package name */
    public static final r f3493l = new r("COMPLETING_RETRY");

    /* renamed from: m  reason: collision with root package name */
    public static final r f3494m = new r("TOO_LATE_TO_CANCEL");

    /* renamed from: n  reason: collision with root package name */
    public static final r f3495n = new r("SEALED");

    /* renamed from: o  reason: collision with root package name */
    public static final z f3496o = new z(false);

    /* renamed from: p  reason: collision with root package name */
    public static final z f3497p = new z(true);

    static {
        new r("REUSABLE_CLAIMED");
    }

    public /* synthetic */ l() {
    }

    public static byte[] c(c[] cVarArr, byte[] bArr) {
        int i3 = 0;
        int i6 = 0;
        for (c cVar : cVarArr) {
            i6 += (((((cVar.f4247g * 2) + 8) - 1) & -8) / 8) + (cVar.f4245e * 2) + d(cVar.f4241a, cVar.f4242b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f4246f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i6);
        if (Arrays.equals(bArr, p.f5504e)) {
            int length = cVarArr.length;
            while (i3 < length) {
                c cVar2 = cVarArr[i3];
                u(byteArrayOutputStream, cVar2, d(cVar2.f4241a, cVar2.f4242b, bArr));
                w(byteArrayOutputStream, cVar2);
                t(byteArrayOutputStream, cVar2);
                v(byteArrayOutputStream, cVar2);
                i3++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream, cVar3, d(cVar3.f4241a, cVar3.f4242b, bArr));
            }
            int length2 = cVarArr.length;
            while (i3 < length2) {
                c cVar4 = cVarArr[i3];
                w(byteArrayOutputStream, cVar4);
                t(byteArrayOutputStream, cVar4);
                v(byteArrayOutputStream, cVar4);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == i6) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i6);
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = p.f5506g;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = p.f5505f;
        String str3 = "!";
        String str4 = (!equals && !Arrays.equals(bArr, bArr3)) ? str3 : ":";
        if (str.length() <= 0) {
            if (str3.equals(str4)) {
                return str2.replace(":", str3);
            }
            if (":".equals(str4)) {
                str2 = str2.replace(str3, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str3) || str2.contains(":")) {
                if (str3.equals(str4)) {
                    return str2.replace(":", str3);
                }
                if (":".equals(str4)) {
                    str2 = str2.replace(str3, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                return m.j(sb, str3, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z4.p f(javax.net.ssl.SSLSession r6) {
        /*
            g4.n r0 = g4.n.f2906d
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L_0x0090
            int r2 = r1.hashCode()
            r3 = 1019404634(0x3cc2e15a, float:0.023789097)
            if (r2 == r3) goto L_0x0020
            r3 = 1208658923(0x480aabeb, float:141999.67)
            if (r2 == r3) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0084
            goto L_0x0028
        L_0x0020:
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0084
        L_0x0028:
            androidx.compose.ui.platform.e r2 = z4.h.f6023t
            z4.h r1 = r2.o(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L_0x0078
            java.lang.String r3 = "NONE"
            boolean r3 = b1.o.c(r3, r2)
            if (r3 != 0) goto L_0x0070
            z4.e0 r2 = x3.d.b(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            if (r3 == 0) goto L_0x0052
            int r4 = r3.length     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.security.cert.Certificate[] r3 = (java.security.cert.Certificate[]) r3     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.util.List r3 = a5.c.j(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r3 = r0
        L_0x0053:
            z4.p r4 = new z4.p
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L_0x0066
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.security.cert.Certificate[] r6 = (java.security.cert.Certificate[]) r6
            java.util.List r0 = a5.c.j(r6)
        L_0x0066:
            y.e r6 = new y.e
            r5 = 6
            r6.<init>(r5, r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L_0x0070:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L_0x0078:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0084:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L_0x0090:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.l.f(javax.net.ssl.SSLSession):z4.p");
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [u0.g[], android.database.Cursor] */
    public static h g(Context context, androidx.appcompat.widget.r rVar) {
        Cursor cursor;
        boolean z5;
        androidx.appcompat.widget.r rVar2 = rVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) rVar2.f749c;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) rVar2.f750d;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                b bVar = f3490i;
                Collections.sort(arrayList, bVar);
                List list = (List) rVar2.f752f;
                if (list == null) {
                    list = com.bumptech.glide.c.B(rVar2.f748b, resources);
                }
                int i3 = 0;
                while (true) {
                    cursor = 0;
                    if (i3 >= list.size()) {
                        resolveContentProvider = cursor;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
                    Collections.sort(arrayList2, bVar);
                    if (arrayList.size() == arrayList2.size()) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                z5 = true;
                                break;
                            } else if (!Arrays.equals((byte[]) arrayList.get(i6), (byte[]) arrayList2.get(i6))) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    }
                    z5 = false;
                    if (z5) {
                        break;
                    }
                    i3++;
                }
                if (resolveContentProvider == null) {
                    return new h(1, (g[]) cursor);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                try {
                    cursor = u0.b.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) rVar2.f751e}, (String) null, (Object) null);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            arrayList3.add(new g(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                        }
                    }
                    return new h(0, (g[]) arrayList3.toArray(new g[0]));
                } finally {
                    if (cursor != 0) {
                        cursor.close();
                    }
                }
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
            }
        } else {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
    }

    public static int i(int i3, int i6, int i7) {
        if (i3 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        } else if (i3 == 2) {
            return i6;
        } else {
            if (i3 == 4) {
                return i6 + i7;
            }
            throw new IllegalStateException(m.g("Unexpected flag: ", i3));
        }
    }

    public static int[] l(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 += o.R(byteArrayInputStream);
            iArr[i7] = i6;
        }
        return iArr;
    }

    public static c[] m(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = p.f5507h;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(p.f5502c, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int Q = (int) o.Q(fileInputStream, 1);
                byte[] P = o.P(fileInputStream, (int) o.Q(fileInputStream, 4), (int) o.Q(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(P);
                    try {
                        c[] n5 = n(byteArrayInputStream, Q, cVarArr);
                        byteArrayInputStream.close();
                        return n5;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, p.f5508i)) {
            int R = o.R(fileInputStream);
            byte[] P2 = o.P(fileInputStream, (int) o.Q(fileInputStream, 4), (int) o.Q(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(P2);
                try {
                    c[] o5 = o(byteArrayInputStream2, bArr2, R, cVarArr);
                    byteArrayInputStream2.close();
                    return o5;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, int i3, c[] cVarArr) {
        int i6 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 == cVarArr.length) {
            String[] strArr = new String[i3];
            int[] iArr = new int[i3];
            for (int i7 = 0; i7 < i3; i7++) {
                int R = o.R(byteArrayInputStream);
                iArr[i7] = o.R(byteArrayInputStream);
                strArr[i7] = new String(o.O(byteArrayInputStream, R), StandardCharsets.UTF_8);
            }
            while (i6 < i3) {
                c cVar = cVarArr[i6];
                if (cVar.f4242b.equals(strArr[i6])) {
                    int i8 = iArr[i6];
                    cVar.f4245e = i8;
                    cVar.f4248h = l(byteArrayInputStream, i8);
                    i6++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] o(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, c[] cVarArr) {
        c cVar;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 == cVarArr.length) {
            int i6 = 0;
            while (i6 < i3) {
                o.R(byteArrayInputStream);
                String str = new String(o.O(byteArrayInputStream, o.R(byteArrayInputStream)), StandardCharsets.UTF_8);
                long Q = o.Q(byteArrayInputStream, 4);
                int R = o.R(byteArrayInputStream);
                if (cVarArr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(":");
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= cVarArr.length) {
                            break;
                        } else if (cVarArr[i7].f4242b.equals(substring)) {
                            cVar = cVarArr[i7];
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                cVar = null;
                if (cVar != null) {
                    cVar.f4244d = Q;
                    int[] l6 = l(byteArrayInputStream, R);
                    if (Arrays.equals(bArr, p.f5506g)) {
                        cVar.f4245e = R;
                        cVar.f4248h = l6;
                    }
                    i6++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] p(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, p.f5503d)) {
            int Q = (int) o.Q(fileInputStream, 1);
            byte[] P = o.P(fileInputStream, (int) o.Q(fileInputStream, 4), (int) o.Q(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(P);
                try {
                    c[] q5 = q(byteArrayInputStream, str, Q);
                    byteArrayInputStream.close();
                    return q5;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static c[] q(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        TreeMap treeMap;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i6 = i3;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int R = o.R(byteArrayInputStream);
            int R2 = o.R(byteArrayInputStream);
            long Q = o.Q(byteArrayInputStream2, 4);
            String str2 = str;
            cVarArr[i7] = new c(str2, new String(o.O(byteArrayInputStream2, R), StandardCharsets.UTF_8), o.Q(byteArrayInputStream2, 4), R2, (int) Q, (int) o.Q(byteArrayInputStream2, 4), new int[R2], new TreeMap());
        }
        int i8 = 0;
        while (i8 < i6) {
            c cVar = cVarArr[i8];
            int available = byteArrayInputStream.available() - cVar.f4246f;
            int i9 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.f4249i;
                if (available2 <= available) {
                    break;
                }
                i9 += o.R(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i9), 1);
                for (int R3 = o.R(byteArrayInputStream); R3 > 0; R3--) {
                    o.R(byteArrayInputStream);
                    int Q2 = (int) o.Q(byteArrayInputStream2, 1);
                    if (!(Q2 == 6 || Q2 == 7)) {
                        while (Q2 > 0) {
                            o.Q(byteArrayInputStream2, 1);
                            for (int Q3 = (int) o.Q(byteArrayInputStream2, 1); Q3 > 0; Q3--) {
                                o.R(byteArrayInputStream);
                            }
                            Q2--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                cVar.f4248h = l(byteArrayInputStream2, cVar.f4245e);
                int i10 = cVar.f4247g;
                BitSet valueOf = BitSet.valueOf(o.O(byteArrayInputStream2, ((((i10 * 2) + 8) - 1) & -8) / 8));
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = 2;
                    if (!valueOf.get(i(2, i11, i10))) {
                        i12 = 0;
                    }
                    if (valueOf.get(i(4, i11, i10))) {
                        i12 |= 4;
                    }
                    if (i12 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i11));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i11), Integer.valueOf(i12 | num.intValue()));
                    }
                }
                i8++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    public static final void r(d dVar, Object obj, o4.c cVar) {
        i4.h f6;
        Object b02;
        c1 Q;
        if (dVar instanceof kotlinx.coroutines.internal.c) {
            kotlinx.coroutines.internal.c cVar2 = (kotlinx.coroutines.internal.c) dVar;
            Throwable a6 = e.a(obj);
            boolean z5 = false;
            Object jVar = a6 == null ? cVar != null ? new j(obj, cVar) : obj : new i(a6, false);
            w4.l lVar = cVar2.f3979g;
            d dVar2 = cVar2.f3980h;
            cVar2.f();
            if (lVar.D()) {
                cVar2.f3981i = jVar;
                cVar2.f5528f = 1;
                cVar2.f3979g.C(cVar2.f(), cVar2);
                return;
            }
            d0 a7 = z0.a();
            if (a7.I()) {
                cVar2.f3981i = jVar;
                cVar2.f5528f = 1;
                a7.F(cVar2);
                return;
            }
            a7.H(true);
            try {
                i0 i0Var = (i0) cVar2.f().l(androidx.compose.ui.platform.e.f897n);
                if (i0Var != null && !i0Var.b()) {
                    CancellationException v5 = ((q0) i0Var).v();
                    cVar2.a(jVar, v5);
                    cVar2.g(com.bumptech.glide.c.k(v5));
                    z5 = true;
                }
                if (!z5) {
                    Object obj2 = cVar2.f3982j;
                    f6 = dVar2.f();
                    b02 = o.b0(f6, obj2);
                    Q = b02 != o.f1523j ? com.bumptech.glide.c.Q(dVar2, f6, b02) : null;
                    dVar2.g(obj);
                    if (Q == null) {
                        o.U(f6, b02);
                    } else {
                        throw null;
                    }
                }
                do {
                } while (a7.J());
            } catch (Throwable th) {
                a7.E(true);
                throw th;
            }
            a7.E(true);
            return;
        }
        dVar.g(obj);
    }

    /* JADX INFO: finally extract failed */
    public static boolean s(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        Throwable th;
        Throwable th2;
        ArrayList arrayList;
        int i3;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th3;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        c[] cVarArr2 = cVarArr;
        byte[] bArr3 = p.f5502c;
        int i6 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                o.e0(byteArrayOutputStream5, cVarArr2.length);
                int i7 = 2;
                int i8 = 2;
                for (c cVar : cVarArr2) {
                    o.d0(byteArrayOutputStream5, cVar.f4243c, 4);
                    o.d0(byteArrayOutputStream5, cVar.f4244d, 4);
                    o.d0(byteArrayOutputStream5, (long) cVar.f4247g, 4);
                    String d6 = d(cVar.f4241a, cVar.f4242b, bArr3);
                    int length = d6.getBytes(StandardCharsets.UTF_8).length;
                    o.e0(byteArrayOutputStream5, length);
                    i8 = i8 + 4 + 4 + 4 + 2 + (length * 1);
                    byteArrayOutputStream5.write(d6.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i8 == byteArray.length) {
                    n1.l lVar = new n1.l(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(lVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < cVarArr2.length) {
                        try {
                            c cVar2 = cVarArr2[i9];
                            o.e0(byteArrayOutputStream6, i9);
                            o.e0(byteArrayOutputStream6, cVar2.f4245e);
                            i10 = i10 + 2 + 2 + (cVar2.f4245e * 2);
                            t(byteArrayOutputStream6, cVar2);
                            i9++;
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i10 == byteArray2.length) {
                        n1.l lVar2 = new n1.l(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(lVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < cVarArr2.length) {
                            try {
                                c cVar3 = cVarArr2[i11];
                                int i13 = i6;
                                for (Map.Entry value : cVar3.f4249i.entrySet()) {
                                    i13 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                v(byteArrayOutputStream2, cVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                w(byteArrayOutputStream3, cVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                o.e0(byteArrayOutputStream7, i11);
                                int length2 = byteArray3.length + i7 + byteArray4.length;
                                int i14 = i12 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                o.d0(byteArrayOutputStream7, (long) length2, 4);
                                o.e0(byteArrayOutputStream7, i13);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i12 = i14 + length2;
                                i11++;
                                arrayList3 = arrayList4;
                                i6 = 0;
                                i7 = 2;
                            } catch (Throwable th6) {
                                Throwable th7 = th6;
                                try {
                                    byteArrayOutputStream7.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i12 == byteArray5.length) {
                            n1.l lVar3 = new n1.l(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(lVar3);
                            long j6 = (long) 4;
                            long size = j6 + j6 + 4 + ((long) (arrayList2.size() * 16));
                            o.d0(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i15 = 0;
                            while (i15 < arrayList2.size()) {
                                n1.l lVar4 = (n1.l) arrayList2.get(i15);
                                o.d0(byteArrayOutputStream4, m.e(lVar4.f4260a), 4);
                                o.d0(byteArrayOutputStream4, size, 4);
                                boolean z5 = lVar4.f4262c;
                                byte[] bArr4 = lVar4.f4261b;
                                if (z5) {
                                    byte[] p2 = o.p(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(p2);
                                    o.d0(byteArrayOutputStream4, (long) p2.length, 4);
                                    o.d0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    i3 = p2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    o.d0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    o.d0(byteArrayOutputStream4, 0, 4);
                                    i3 = bArr4.length;
                                }
                                size += (long) i3;
                                i15++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i16));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th9) {
                th.addSuppressed(th9);
            }
        } else {
            byte[] bArr5 = p.f5503d;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] c6 = c(cVarArr2, bArr5);
                o.d0(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                o.d0(byteArrayOutputStream4, (long) c6.length, 4);
                byte[] p5 = o.p(c6);
                o.d0(byteArrayOutputStream4, (long) p5.length, 4);
                byteArrayOutputStream4.write(p5);
                return true;
            }
            byte[] bArr6 = p.f5505f;
            if (Arrays.equals(bArr2, bArr6)) {
                o.d0(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                for (c cVar4 : cVarArr2) {
                    String d7 = d(cVar4.f4241a, cVar4.f4242b, bArr6);
                    o.e0(byteArrayOutputStream4, d7.getBytes(StandardCharsets.UTF_8).length);
                    o.e0(byteArrayOutputStream4, cVar4.f4248h.length);
                    o.d0(byteArrayOutputStream4, (long) (cVar4.f4249i.size() * 4), 4);
                    o.d0(byteArrayOutputStream4, cVar4.f4243c, 4);
                    byteArrayOutputStream4.write(d7.getBytes(StandardCharsets.UTF_8));
                    for (Integer intValue : cVar4.f4249i.keySet()) {
                        o.e0(byteArrayOutputStream4, intValue.intValue());
                        o.e0(byteArrayOutputStream4, 0);
                    }
                    for (int e02 : cVar4.f4248h) {
                        o.e0(byteArrayOutputStream4, e02);
                    }
                }
                return true;
            }
            byte[] bArr7 = p.f5504e;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] c7 = c(cVarArr2, bArr7);
                o.d0(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                o.d0(byteArrayOutputStream4, (long) c7.length, 4);
                byte[] p6 = o.p(c7);
                o.d0(byteArrayOutputStream4, (long) p6.length, 4);
                byteArrayOutputStream4.write(p6);
                return true;
            }
            byte[] bArr8 = p.f5506g;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            o.e0(byteArrayOutputStream4, cVarArr2.length);
            for (c cVar5 : cVarArr2) {
                String d8 = d(cVar5.f4241a, cVar5.f4242b, bArr8);
                o.e0(byteArrayOutputStream4, d8.getBytes(StandardCharsets.UTF_8).length);
                TreeMap treeMap = cVar5.f4249i;
                o.e0(byteArrayOutputStream4, treeMap.size());
                o.e0(byteArrayOutputStream4, cVar5.f4248h.length);
                o.d0(byteArrayOutputStream4, cVar5.f4243c, 4);
                byteArrayOutputStream4.write(d8.getBytes(StandardCharsets.UTF_8));
                for (Integer intValue2 : treeMap.keySet()) {
                    o.e0(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int e03 : cVar5.f4248h) {
                    o.e0(byteArrayOutputStream4, e03);
                }
            }
            return true;
        }
        throw th3;
        throw th;
        throw th4;
        throw th2;
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i3 = 0;
        for (int valueOf : cVar.f4248h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            o.e0(byteArrayOutputStream, valueOf2.intValue() - i3);
            i3 = valueOf2.intValue();
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        o.e0(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        o.e0(byteArrayOutputStream, cVar.f4245e);
        o.d0(byteArrayOutputStream, (long) cVar.f4246f, 4);
        o.d0(byteArrayOutputStream, cVar.f4243c, 4);
        o.d0(byteArrayOutputStream, (long) cVar.f4247g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[(((((cVar.f4247g * 2) + 8) - 1) & -8) / 8)];
        for (Map.Entry entry : cVar.f4249i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = intValue2 & 2;
            int i6 = cVar.f4247g;
            if (i3 != 0) {
                int i7 = i(2, intValue, i6);
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
            if ((intValue2 & 4) != 0) {
                int i9 = i(4, intValue, i6);
                int i10 = i9 / 8;
                bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void w(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i3 = 0;
        for (Map.Entry entry : cVar.f4249i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                o.e0(byteArrayOutputStream, intValue - i3);
                o.e0(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    public abstract View j(int i3);

    public abstract boolean k();

    public /* synthetic */ l(int i3) {
    }
}
