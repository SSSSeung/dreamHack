package p0;

import java.util.WeakHashMap;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4411a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f4412b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4413c = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r11 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        if (r11 != null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, b1.v r19, boolean r20, boolean r21) {
        /*
            r10 = r16
            r0 = r17
            r7 = r18
            r11 = r19
            android.content.res.Resources r8 = r15.getResources()
            r1 = 1
            r8.getValue(r10, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00d6
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r13.startsWith(r1)
            r14 = -3
            if (r1 != 0) goto L_0x002a
            if (r11 == 0) goto L_0x00b0
        L_0x0025:
            r11.c(r14)
            goto L_0x00b0
        L_0x002a:
            int r1 = r0.assetCookie
            k.e r9 = q0.g.f4877b
            java.lang.String r1 = q0.g.b(r8, r10, r13, r1, r7)
            java.lang.Object r1 = r9.a(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0041
            if (r11 == 0) goto L_0x00b1
            r11.e(r1)
            goto L_0x00b1
        L_0x0041:
            if (r21 == 0) goto L_0x0045
            goto L_0x00b0
        L_0x0045:
            java.lang.String r1 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x007c
            android.content.res.XmlResourceParser r1 = r8.getXml(r10)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            p0.e r2 = com.bumptech.glide.c.z(r1, r8)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r2 != 0) goto L_0x0066
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r11 == 0) goto L_0x00b0
            r11.c(r14)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b0
        L_0x0066:
            int r6 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r1 = r15
            r3 = r8
            r4 = r16
            r5 = r13
            r7 = r18
            r8 = r19
            r9 = r20
            android.graphics.Typeface r1 = q0.g.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b1
        L_0x0078:
            r0 = move-exception
            goto L_0x00a0
        L_0x007a:
            r0 = move-exception
            goto L_0x00a3
        L_0x007c:
            int r0 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            e.n0 r1 = q0.g.f4876a     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r2 = r15
            r3 = r8
            r4 = r16
            r5 = r13
            r6 = r18
            android.graphics.Typeface r1 = r1.B(r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = q0.g.b(r8, r10, r13, r0, r7)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r9.b(r0, r1)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
        L_0x0094:
            if (r11 == 0) goto L_0x00b1
            if (r1 == 0) goto L_0x009c
            r11.e(r1)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b1
        L_0x009c:
            r11.c(r14)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b1
        L_0x00a0:
            java.lang.String r1 = "Failed to read xml resource "
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r1 = "Failed to parse xml resource "
        L_0x00a5:
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
            if (r11 == 0) goto L_0x00b0
            goto L_0x0025
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            if (r1 != 0) goto L_0x00d5
            if (r11 != 0) goto L_0x00d5
            if (r21 == 0) goto L_0x00b8
            goto L_0x00d5
        L_0x00b8:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d5:
            return r1
        L_0x00d6:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r8.getResourceName(r10)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r16)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.p.a(android.content.Context, int, android.util.TypedValue, int, b1.v, boolean, boolean):android.graphics.Typeface");
    }
}
