package h5;

import androidx.compose.ui.platform.e;
import b1.o;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class k extends n {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3484c;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r0.intValue() >= 9) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0060 A[SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006d
            r3 = 10
            b1.v.g(r3)
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0017
            goto L_0x006d
        L_0x0017:
            char r5 = r0.charAt(r2)
            r6 = 48
            int r6 = b1.o.o(r5, r6)
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 >= 0) goto L_0x0038
            if (r4 != r1) goto L_0x0029
            goto L_0x006d
        L_0x0029:
            r6 = 45
            if (r5 != r6) goto L_0x0031
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1
            goto L_0x0039
        L_0x0031:
            r6 = 43
            if (r5 != r6) goto L_0x006d
            r5 = r1
            r6 = r2
            goto L_0x003a
        L_0x0038:
            r5 = r2
        L_0x0039:
            r6 = r5
        L_0x003a:
            r8 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r9 = r2
            r10 = r8
        L_0x003f:
            if (r5 >= r4) goto L_0x0060
            char r11 = r0.charAt(r5)
            int r11 = java.lang.Character.digit(r11, r3)
            if (r11 >= 0) goto L_0x004c
            goto L_0x006d
        L_0x004c:
            if (r9 >= r10) goto L_0x0055
            if (r10 != r8) goto L_0x006d
            int r10 = r7 / 10
            if (r9 >= r10) goto L_0x0055
            goto L_0x006d
        L_0x0055:
            int r9 = r9 * 10
            int r12 = r7 + r11
            if (r9 >= r12) goto L_0x005c
            goto L_0x006d
        L_0x005c:
            int r9 = r9 - r11
            int r5 = r5 + 1
            goto L_0x003f
        L_0x0060:
            if (r6 == 0) goto L_0x0067
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x006e
        L_0x0067:
            int r0 = -r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x0079
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L_0x0083
            goto L_0x0084
        L_0x0079:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0083 }
            r0.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0083 }
            goto L_0x0084
        L_0x0083:
            r1 = r2
        L_0x0084:
            f3484c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.k.<clinit>():void");
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        o.m(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList l6 = e.l(list);
        o.l(sSLParameters, "sslParameters");
        Object[] array = l6.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            String l6 = sSLSocket.getApplicationProtocol();
            if (l6 != null) {
                if (l6.hashCode() != 0) {
                    return l6;
                }
                if (l6.equals("")) {
                    return null;
                }
                return l6;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
