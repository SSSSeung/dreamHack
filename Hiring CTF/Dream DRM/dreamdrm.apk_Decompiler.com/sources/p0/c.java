package p0;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import b.a;
import com.bumptech.glide.e;
import e.n0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f4386a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4387b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4388c;

    public c(Shader shader, ColorStateList colorStateList, int i3) {
        this.f4387b = shader;
        this.f4388c = colorStateList;
        this.f4386a = i3;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v3, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        if (r8.size() <= 0) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0180, code lost:
        r0 = new androidx.appcompat.widget.a0(r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0186, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0187, code lost:
        if (r0 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        if (r19 == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018e, code lost:
        r0 = new androidx.appcompat.widget.a0(r5, r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0192, code lost:
        r0 = new androidx.appcompat.widget.a0(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0196, code lost:
        if (r11 == 1) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0199, code lost:
        if (r11 == 2) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019b, code lost:
        r16 = (int[]) r0.f503e;
        r17 = (float[]) r0.f504f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a9, code lost:
        if (r7 == 1) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ab, code lost:
        if (r7 == 2) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ad, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b0, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b3, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b5, code lost:
        r11 = new android.graphics.LinearGradient(r12, r26, r25, r23, r16, r17, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c2, code lost:
        r3 = new android.graphics.SweepGradient(r21, r22, (int[]) r0.f503e, (float[]) r0.f504f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d4, code lost:
        r2 = r21;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01db, code lost:
        if (r24 <= 0.0f) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01dd, code lost:
        r1 = (int[]) r0.f503e;
        r21 = (float[]) r0.f504f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ea, code lost:
        if (r7 == 1) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ed, code lost:
        if (r7 == 2) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ef, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f2, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f5, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f7, code lost:
        r16 = new android.graphics.RadialGradient(r2, r4, r24, r1, r21, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020d, code lost:
        return new p0.c(r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0215, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p0.c a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            r0 = r29
            r1 = r31
            android.content.res.XmlResourceParser r2 = r29.getXml(r30)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        L_0x000c:
            int r4 = r2.next()
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L_0x0017
            if (r4 == r6) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r4 != r5) goto L_0x0234
            java.lang.String r4 = r2.getName()
            r4.getClass()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L_0x005d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = p0.b.b(r0, r2, r3, r1)
            p0.c r1 = new p0.c
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x0216
            int[] r4 = m0.a.f4171d
            android.content.res.TypedArray r4 = com.bumptech.glide.d.q(r0, r1, r3, r4)
            java.lang.String r7 = "startX"
            r8 = 8
            r10 = 0
            float r12 = com.bumptech.glide.d.j(r4, r2, r7, r8, r10)
            java.lang.String r7 = "startY"
            r8 = 9
            float r13 = com.bumptech.glide.d.j(r4, r2, r7, r8, r10)
            java.lang.String r7 = "endX"
            r8 = 10
            float r14 = com.bumptech.glide.d.j(r4, r2, r7, r8, r10)
            java.lang.String r7 = "endY"
            r8 = 11
            float r15 = com.bumptech.glide.d.j(r4, r2, r7, r8, r10)
            java.lang.String r7 = "centerX"
            r8 = 3
            float r7 = com.bumptech.glide.d.j(r4, r2, r7, r8, r10)
            java.lang.String r11 = "centerY"
            r9 = 4
            float r9 = com.bumptech.glide.d.j(r4, r2, r11, r9, r10)
            java.lang.String r11 = "type"
            r8 = 0
            int r11 = com.bumptech.glide.d.k(r4, r2, r11, r5, r8)
            java.lang.String r5 = "startColor"
            boolean r5 = com.bumptech.glide.d.p(r2, r5)
            if (r5 != 0) goto L_0x00ad
            r5 = r8
            goto L_0x00b1
        L_0x00ad:
            int r5 = r4.getColor(r8, r8)
        L_0x00b1:
            java.lang.String r10 = "centerColor"
            boolean r19 = com.bumptech.glide.d.p(r2, r10)
            boolean r10 = com.bumptech.glide.d.p(r2, r10)
            if (r10 != 0) goto L_0x00bf
            r10 = r8
            goto L_0x00c4
        L_0x00bf:
            r10 = 7
            int r10 = r4.getColor(r10, r8)
        L_0x00c4:
            java.lang.String r6 = "endColor"
            boolean r6 = com.bumptech.glide.d.p(r2, r6)
            if (r6 != 0) goto L_0x00ce
            r6 = r8
            goto L_0x00d5
        L_0x00ce:
            r6 = 1
            int r21 = r4.getColor(r6, r8)
            r6 = r21
        L_0x00d5:
            r21 = r7
            java.lang.String r7 = "tileMode"
            r22 = r9
            r9 = 6
            int r7 = com.bumptech.glide.d.k(r4, r2, r7, r9, r8)
            java.lang.String r9 = "gradientRadius"
            r8 = 5
            r23 = r15
            r15 = 0
            float r8 = com.bumptech.glide.d.j(r4, r2, r9, r8, r15)
            r4.recycle()
            int r4 = r2.getDepth()
            r9 = 1
            int r4 = r4 + r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r9 = 20
            r15.<init>(r9)
            r24 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
        L_0x0101:
            int r9 = r2.next()
            r25 = r14
            r14 = 1
            if (r9 == r14) goto L_0x0178
            int r14 = r2.getDepth()
            r26 = r13
            if (r14 >= r4) goto L_0x0115
            r13 = 3
            if (r9 == r13) goto L_0x017a
        L_0x0115:
            r13 = 2
            if (r9 == r13) goto L_0x0119
            goto L_0x0173
        L_0x0119:
            if (r14 > r4) goto L_0x0173
            java.lang.String r9 = r2.getName()
            java.lang.String r13 = "item"
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x0128
            goto L_0x0173
        L_0x0128:
            int[] r9 = m0.a.f4172e
            android.content.res.TypedArray r9 = com.bumptech.glide.d.q(r0, r1, r3, r9)
            r13 = 0
            boolean r14 = r9.hasValue(r13)
            r13 = 1
            boolean r20 = r9.hasValue(r13)
            if (r14 == 0) goto L_0x0158
            if (r20 == 0) goto L_0x0158
            r14 = 0
            int r27 = r9.getColor(r14, r14)
            r14 = 0
            float r28 = r9.getFloat(r13, r14)
            r9.recycle()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r27)
            r8.add(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r28)
            r15.add(r9)
            goto L_0x0173
        L_0x0158:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0173:
            r14 = r25
            r13 = r26
            goto L_0x0101
        L_0x0178:
            r26 = r13
        L_0x017a:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0186
            androidx.appcompat.widget.a0 r0 = new androidx.appcompat.widget.a0
            r0.<init>((java.util.ArrayList) r8, (java.util.ArrayList) r15)
            goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            if (r0 == 0) goto L_0x018a
            goto L_0x0195
        L_0x018a:
            androidx.appcompat.widget.a0 r0 = new androidx.appcompat.widget.a0
            if (r19 == 0) goto L_0x0192
            r0.<init>((int) r5, (int) r10, (int) r6)
            goto L_0x0195
        L_0x0192:
            r0.<init>((int) r5, (int) r6)
        L_0x0195:
            r1 = 1
            if (r11 == r1) goto L_0x01d4
            r2 = 2
            if (r11 == r2) goto L_0x01c2
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            java.lang.Object r4 = r0.f503e
            r16 = r4
            int[] r16 = (int[]) r16
            java.lang.Object r0 = r0.f504f
            r17 = r0
            float[] r17 = (float[]) r17
            if (r7 == r1) goto L_0x01b3
            if (r7 == r2) goto L_0x01b0
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01b5
        L_0x01b0:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01b5
        L_0x01b3:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
        L_0x01b5:
            r18 = r0
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r23
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0206
        L_0x01c2:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            java.lang.Object r1 = r0.f503e
            int[] r1 = (int[]) r1
            java.lang.Object r0 = r0.f504f
            float[] r0 = (float[]) r0
            r2 = r21
            r4 = r22
            r3.<init>(r2, r4, r1, r0)
            goto L_0x0206
        L_0x01d4:
            r2 = r21
            r4 = r22
            r1 = 0
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x020e
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            java.lang.Object r1 = r0.f503e
            int[] r1 = (int[]) r1
            java.lang.Object r0 = r0.f504f
            r21 = r0
            float[] r21 = (float[]) r21
            r0 = 1
            if (r7 == r0) goto L_0x01f5
            r0 = 2
            if (r7 == r0) goto L_0x01f2
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01f7
        L_0x01f2:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01f7
        L_0x01f5:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
        L_0x01f7:
            r22 = r0
            r16 = r3
            r17 = r2
            r18 = r4
            r19 = r24
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x0206:
            p0.c r0 = new p0.c
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
        L_0x020e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x0216:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0234:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):p0.c");
    }

    public final boolean b() {
        if (((Shader) this.f4387b) == null) {
            Object obj = this.f4388c;
            return ((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful();
        }
    }

    public final boolean c(int[] iArr) {
        if (b()) {
            ColorStateList colorStateList = (ColorStateList) this.f4388c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4386a) {
                this.f4386a = colorForState;
                return true;
            }
        }
        return false;
    }

    public c(a aVar) {
        this.f4388c = e.u(150, new n0(25, (Object) this));
        this.f4387b = aVar;
    }
}
