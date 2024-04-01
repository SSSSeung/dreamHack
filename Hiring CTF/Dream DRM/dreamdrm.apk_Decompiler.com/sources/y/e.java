package y;

import androidx.activity.result.c;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import b1.o;
import d5.l;
import f4.h;
import g4.i;
import g4.n;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import o4.a;
import p4.f;
import p4.j;
import z4.p;

public final class e extends f implements a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5770e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f5771f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, Object obj) {
        super(0);
        this.f5770e = i3;
        this.f5771f = obj;
    }

    public final Object a() {
        h hVar = h.f2682a;
        int i3 = this.f5770e;
        Object obj = this.f5771f;
        switch (i3) {
            case 0:
                c();
                return hVar;
            case 3:
                n0 n0Var = (n0) obj;
                o.m(n0Var, "<this>");
                ArrayList arrayList = new ArrayList();
                Class<j0> cls = j0.class;
                Class a6 = j.a(cls).a();
                o.j(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new l1.e(a6));
                l1.e[] eVarArr = (l1.e[]) arrayList.toArray(new l1.e[0]);
                return (j0) new c(n0Var, new l1.c((l1.e[]) Arrays.copyOf(eVarArr, eVarArr.length))).g(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 4:
                c();
                return hVar;
            case 5:
                return obj;
            case 6:
                return b();
            case 7:
                return b();
            default:
                return b();
        }
    }

    public final List b() {
        int i3 = this.f5770e;
        Object obj = this.f5771f;
        switch (i3) {
            case 6:
                return (List) obj;
            case 7:
                try {
                    return (List) ((a) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return n.f2906d;
                }
            default:
                p pVar = ((l) obj).f2245d;
                o.k(pVar);
                List<Certificate> a6 = pVar.a();
                ArrayList arrayList = new ArrayList(i.W(a6));
                for (Certificate certificate : a6) {
                    if (certificate != null) {
                        arrayList.add((X509Certificate) certificate);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                return arrayList;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01b8, code lost:
        r0 = com.theori.dreamdrm.MainActivity.A;
        r0 = "Debugging Detected";
        r1 = "디버깅이 탐지되었습니다.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c6, code lost:
        r2 = (com.theori.dreamdrm.MainActivity) r1;
        r0 = com.theori.dreamdrm.MainActivity.A;
        r0 = "Frida Detected";
        r1 = "프리다 사용이 탐지되었습니다.";
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b1 A[LOOP:0: B:5:0x0011->B:122:0x01b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01c6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r12 = this;
            int r0 = r12.f5770e
            java.lang.Object r1 = r12.f5771f
            switch(r0) {
                case 0: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x000f
        L_0x0008:
            y.f r1 = (y.f) r1
            r1.getClass()
            r0 = 0
            throw r0
        L_0x000f:
            java.lang.String r0 = "/data/local/tmp"
        L_0x0011:
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "/proc/self/maps"
            r2.<init>(r3)
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0058 }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0058 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0058 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0058 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004d }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004d }
            r6.<init>(r4)     // Catch:{ IOException -> 0x004d }
            r5.<init>(r6)     // Catch:{ IOException -> 0x004d }
        L_0x002d:
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x003c
            r2.append(r6)     // Catch:{ all -> 0x0043 }
            java.lang.String r6 = "\n"
            r2.append(r6)     // Catch:{ all -> 0x0043 }
            goto L_0x002d
        L_0x003c:
            r4.close()     // Catch:{ all -> 0x0043 }
            r5.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004d
        L_0x0043:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x004d }
        L_0x004c:
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0058 }
            java.lang.String r4 = "frida"
            boolean r2 = r2.contains(r4)     // Catch:{ FileNotFoundException -> 0x0058 }
            goto L_0x0059
        L_0x0058:
            r2 = r3
        L_0x0059:
            r4 = 1
            if (r2 != 0) goto L_0x01c6
            r5 = 200(0xc8, double:9.9E-322)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ IOException -> 0x0084 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0084 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0084 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0084 }
            java.nio.file.Path r7 = r7.toPath()     // Catch:{ IOException -> 0x0084 }
            java.util.stream.Stream r7 = java.nio.file.Files.list(r7)     // Catch:{ IOException -> 0x0084 }
            java.util.stream.Stream r7 = r7.limit(r5)     // Catch:{ IOException -> 0x0084 }
            e4.c r8 = new e4.c     // Catch:{ IOException -> 0x0084 }
            r8.<init>(r2, r4)     // Catch:{ IOException -> 0x0084 }
            r7.forEach(r8)     // Catch:{ IOException -> 0x0084 }
            boolean r2 = r2.get()     // Catch:{ IOException -> 0x0084 }
            if (r2 == 0) goto L_0x0084
            r2 = r4
            goto L_0x0085
        L_0x0084:
            r2 = r3
        L_0x0085:
            if (r2 != 0) goto L_0x01c6
            r2 = 26000(0x6590, float:3.6434E-41)
        L_0x0089:
            r7 = 27500(0x6b6c, float:3.8536E-41)
            if (r2 >= r7) goto L_0x009f
            java.net.Socket r7 = new java.net.Socket     // Catch:{ IOException -> 0x009c }
            java.lang.String r8 = "127.0.0.1"
            r7.<init>(r8, r2)     // Catch:{ IOException -> 0x009c }
            boolean r7 = r7.isConnected()     // Catch:{ IOException -> 0x009c }
            if (r7 == 0) goto L_0x009c
            r2 = r4
            goto L_0x00a0
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0089
        L_0x009f:
            r2 = r3
        L_0x00a0:
            if (r2 == 0) goto L_0x00a4
            goto L_0x01c6
        L_0x00a4:
            r2 = r1
            com.theori.dreamdrm.MainActivity r2 = (com.theori.dreamdrm.MainActivity) r2
            java.lang.String[] r7 = e4.b.f2563a
            boolean r7 = w4.p.d(r7)
            if (r7 != 0) goto L_0x00d2
            java.lang.String[] r7 = e4.b.f2566d
            boolean r7 = w4.p.d(r7)
            if (r7 != 0) goto L_0x00d2
            java.lang.String[] r7 = e4.b.f2567e
            boolean r7 = w4.p.d(r7)
            if (r7 != 0) goto L_0x00d2
            java.lang.String[] r7 = e4.b.f2564b
            boolean r7 = w4.p.d(r7)
            if (r7 != 0) goto L_0x00d2
            java.lang.String[] r7 = e4.b.f2565c
            boolean r7 = w4.p.d(r7)
            if (r7 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r7 = r3
            goto L_0x00d3
        L_0x00d2:
            r7 = r4
        L_0x00d3:
            if (r7 != 0) goto L_0x01bf
            e4.a r7 = e4.b.f2568f
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00df:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0116
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = b1.v.w(r2, r8)
            e4.a r10 = e4.b.f2568f
            java.lang.Object r8 = r10.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = ""
            boolean r11 = r10.equals(r8)
            if (r11 == 0) goto L_0x0106
            boolean r11 = r10.equals(r9)
            if (r11 != 0) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            boolean r10 = r10.equals(r8)
            if (r10 != 0) goto L_0x00df
            if (r8 == 0) goto L_0x00df
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x00df
        L_0x0114:
            r7 = r4
            goto L_0x0117
        L_0x0116:
            r7 = r3
        L_0x0117:
            if (r7 == 0) goto L_0x011b
            goto L_0x01bf
        L_0x011b:
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ IOException -> 0x0141 }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0141 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0141 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x0141 }
            java.nio.file.Path r8 = r8.toPath()     // Catch:{ IOException -> 0x0141 }
            java.util.stream.Stream r8 = java.nio.file.Files.list(r8)     // Catch:{ IOException -> 0x0141 }
            java.util.stream.Stream r5 = r8.limit(r5)     // Catch:{ IOException -> 0x0141 }
            e4.c r6 = new e4.c     // Catch:{ IOException -> 0x0141 }
            r6.<init>(r7, r3)     // Catch:{ IOException -> 0x0141 }
            r5.forEach(r6)     // Catch:{ IOException -> 0x0141 }
            boolean r5 = r7.get()     // Catch:{ IOException -> 0x0141 }
            if (r5 == 0) goto L_0x0141
            r5 = r4
            goto L_0x0142
        L_0x0141:
            r5 = r3
        L_0x0142:
            if (r5 != 0) goto L_0x01b8
            java.lang.String r5 = "ro.debuggable"
            java.lang.String r5 = b1.v.w(r2, r5)
            if (r5 == 0) goto L_0x0156
            java.lang.String r6 = "1"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0156
            r5 = r4
            goto L_0x0157
        L_0x0156:
            r5 = r3
        L_0x0157:
            if (r5 != 0) goto L_0x01b8
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "/proc/self/status"
            r5.<init>(r6)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x01a3 }
            r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x01a3 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{  }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{  }
            r7.<init>(r6)     // Catch:{  }
            r5.<init>(r7)     // Catch:{  }
        L_0x016f:
            java.lang.String r7 = r5.readLine()     // Catch:{ all -> 0x0199 }
            if (r7 == 0) goto L_0x0192
            java.lang.String r8 = "TracerPid:"
            boolean r8 = r7.contains(r8)     // Catch:{ all -> 0x0199 }
            if (r8 == 0) goto L_0x016f
            r6 = 11
            java.lang.String r6 = r7.substring(r6)     // Catch:{ all -> 0x0199 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0199 }
            if (r6 == 0) goto L_0x018a
            r3 = r4
        L_0x018a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0199 }
            r5.close()     // Catch:{  }
            goto L_0x01a5
        L_0x0192:
            r6.close()     // Catch:{ all -> 0x0199 }
            r5.close()     // Catch:{  }
            goto L_0x01a3
        L_0x0199:
            r3 = move-exception
            r5.close()     // Catch:{ all -> 0x019e }
            goto L_0x01a2
        L_0x019e:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch:{  }
        L_0x01a2:
            throw r3     // Catch:{  }
        L_0x01a3:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L_0x01a5:
            java.lang.String r5 = "debuggingDetector.checkProcStatus()"
            b1.o.l(r3, r5)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01b1
            goto L_0x01b8
        L_0x01b1:
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r2)
            goto L_0x0011
        L_0x01b8:
            int r0 = com.theori.dreamdrm.MainActivity.A
            java.lang.String r0 = "Debugging Detected"
            java.lang.String r1 = "디버깅이 탐지되었습니다."
            goto L_0x01cf
        L_0x01bf:
            int r0 = com.theori.dreamdrm.MainActivity.A
            java.lang.String r0 = "Emulator Detected"
            java.lang.String r1 = "에뮬레이터 사용이 탐지되었습니다."
            goto L_0x01cf
        L_0x01c6:
            r2 = r1
            com.theori.dreamdrm.MainActivity r2 = (com.theori.dreamdrm.MainActivity) r2
            int r0 = com.theori.dreamdrm.MainActivity.A
            java.lang.String r0 = "Frida Detected"
            java.lang.String r1 = "프리다 사용이 탐지되었습니다."
        L_0x01cf:
            r2.getClass()
            androidx.emoji2.text.n r3 = new androidx.emoji2.text.n
            r3.<init>(r2, r0, r1, r4)
            r2.runOnUiThread(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.e.c():void");
    }
}
