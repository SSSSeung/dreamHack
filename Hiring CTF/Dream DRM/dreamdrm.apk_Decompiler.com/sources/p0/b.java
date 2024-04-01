package p0;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4385a = new ThreadLocal();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
        /*
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x038e
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r37.next()
            if (r9 == r4) goto L_0x037d
            int r10 = r37.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x037d
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x036e
            if (r10 > r3) goto L_0x036e
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x036e
        L_0x0042:
            int[] r9 = m0.a.f4168a
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = 31
            if (r13 == r10) goto L_0x008a
            java.lang.ThreadLocal r15 = f4385a
            java.lang.Object r16 = r15.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x006b
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            r15.set(r10)
            goto L_0x006d
        L_0x006b:
            r10 = r16
        L_0x006d:
            r0.getValue(r13, r10, r4)
            int r10 = r10.type
            r15 = 28
            if (r10 < r15) goto L_0x007a
            if (r10 > r14) goto L_0x007a
            r10 = r4
            goto L_0x007b
        L_0x007a:
            r10 = r7
        L_0x007b:
            if (r10 != 0) goto L_0x008a
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008a }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008a }
            goto L_0x0091
        L_0x008a:
            r10 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r9.getColor(r7, r10)
        L_0x0091:
            boolean r13 = r9.hasValue(r4)
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x009e
            float r11 = r9.getFloat(r4, r15)
            goto L_0x00aa
        L_0x009e:
            boolean r13 = r9.hasValue(r11)
            if (r13 == 0) goto L_0x00a9
            float r11 = r9.getFloat(r11, r15)
            goto L_0x00aa
        L_0x00a9:
            r11 = r15
        L_0x00aa:
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r14) goto L_0x00b6
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x00b6
            r13 = r12
            goto L_0x00b7
        L_0x00b6:
            r13 = 4
        L_0x00b7:
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r9.getFloat(r13, r14)
            r9.recycle()
            int r9 = r38.getAttributeCount()
            int[] r14 = new int[r9]
            r4 = r7
            r12 = r4
        L_0x00c8:
            if (r4 >= r9) goto L_0x00f8
            int r15 = r1.getAttributeNameResource(r4)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r7) goto L_0x00f0
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r7) goto L_0x00f0
            r7 = 2130903084(0x7f03002c, float:1.7412976E38)
            if (r15 == r7) goto L_0x00f0
            r7 = 2130903617(0x7f030241, float:1.7414057E38)
            if (r15 == r7) goto L_0x00f0
            int r7 = r12 + 1
            r0 = 0
            boolean r18 = r1.getAttributeBooleanValue(r4, r0)
            if (r18 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            int r15 = -r15
        L_0x00ed:
            r14[r12] = r15
            r12 = r7
        L_0x00f0:
            int r4 = r4 + 1
            r0 = r36
            r7 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c8
        L_0x00f8:
            int[] r0 = android.util.StateSet.trimStateSet(r14, r12)
            r4 = 0
            int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r7 < 0) goto L_0x0109
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0109
            r7 = 1
            goto L_0x010a
        L_0x0109:
            r7 = 0
        L_0x010a:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0118
            if (r7 != 0) goto L_0x0118
            r7 = r0
            r21 = r3
            r9 = 1
            goto L_0x032a
        L_0x0118:
            int r12 = android.graphics.Color.alpha(r10)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = com.bumptech.glide.d.e(r11, r14, r12)
            if (r7 == 0) goto L_0x031e
            p0.a r7 = p0.a.a(r10)
            p0.q r10 = p0.q.f4414k
            float r12 = r7.f4380b
            double r14 = (double) r12
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            r18 = 1147261687(0x4461d2f7, float:903.2963)
            r19 = 1122500608(0x42e80000, float:116.0)
            r20 = 1098907648(0x41800000, float:16.0)
            if (r14 < 0) goto L_0x02b8
            int r14 = java.lang.Math.round(r13)
            r22 = r10
            double r9 = (double) r14
            r23 = 0
            int r9 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r9 <= 0) goto L_0x02b8
            int r9 = java.lang.Math.round(r13)
            double r9 = (double) r9
            r23 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r9 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r9 < 0) goto L_0x015b
            goto L_0x02b8
        L_0x015b:
            float r7 = r7.f4379a
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0163
            r7 = r4
            goto L_0x0169
        L_0x0163:
            r9 = 1135869952(0x43b40000, float:360.0)
            float r7 = java.lang.Math.min(r9, r7)
        L_0x0169:
            r23 = r4
            r10 = r12
            r9 = 0
            r14 = 1
        L_0x016e:
            float r25 = r23 - r12
            float r25 = java.lang.Math.abs(r25)
            r26 = 1053609165(0x3ecccccd, float:0.4)
            int r25 = (r25 > r26 ? 1 : (r25 == r26 ? 0 : -1))
            if (r25 < 0) goto L_0x02aa
            r25 = 1148846080(0x447a0000, float:1000.0)
            r27 = r4
            r26 = r25
            r28 = 1120403456(0x42c80000, float:100.0)
            r29 = 0
        L_0x0185:
            float r30 = r27 - r28
            float r30 = java.lang.Math.abs(r30)
            r31 = 1008981770(0x3c23d70a, float:0.01)
            int r30 = (r30 > r31 ? 1 : (r30 == r31 ? 0 : -1))
            r31 = 1073741824(0x40000000, float:2.0)
            if (r30 <= 0) goto L_0x026c
            float r30 = r28 - r27
            float r30 = r30 / r31
            float r4 = r30 + r27
            p0.a r15 = p0.a.b(r4, r10, r7)
            p0.q r1 = p0.q.f4414k
            int r1 = r15.c(r1)
            int r15 = android.graphics.Color.red(r1)
            float r15 = b1.o.H(r15)
            int r32 = android.graphics.Color.green(r1)
            float r32 = b1.o.H(r32)
            int r33 = android.graphics.Color.blue(r1)
            float r33 = b1.o.H(r33)
            float[][] r34 = b1.o.f1527n
            r16 = 1
            r34 = r34[r16]
            r17 = 0
            r35 = r34[r17]
            float r15 = r15 * r35
            r35 = r34[r16]
            float r32 = r32 * r35
            float r32 = r32 + r15
            r15 = 2
            r34 = r34[r15]
            float r33 = r33 * r34
            float r33 = r33 + r32
            r15 = 1120403456(0x42c80000, float:100.0)
            float r2 = r33 / r15
            r21 = 1007753895(0x3c111aa7, float:0.008856452)
            int r32 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r32 > 0) goto L_0x01e5
            float r2 = r2 * r18
            r21 = r3
            goto L_0x01f1
        L_0x01e5:
            r21 = r3
            double r2 = (double) r2
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            float r2 = r2 * r19
            float r2 = r2 - r20
        L_0x01f1:
            float r3 = r13 - r2
            float r3 = java.lang.Math.abs(r3)
            r32 = 1045220557(0x3e4ccccd, float:0.2)
            int r32 = (r3 > r32 ? 1 : (r3 == r32 ? 0 : -1))
            if (r32 >= 0) goto L_0x0248
            p0.a r1 = p0.a.a(r1)
            float r15 = r1.f4381c
            r33 = r3
            float r3 = r1.f4380b
            p0.a r3 = p0.a.b(r15, r3, r7)
            float r15 = r3.f4382d
            r34 = r4
            float r4 = r1.f4382d
            float r4 = r4 - r15
            float r15 = r1.f4383e
            r35 = r7
            float r7 = r3.f4383e
            float r15 = r15 - r7
            float r7 = r1.f4384f
            float r3 = r3.f4384f
            float r7 = r7 - r3
            float r4 = r4 * r4
            float r15 = r15 * r15
            float r15 = r15 + r4
            float r7 = r7 * r7
            float r7 = r7 + r15
            double r3 = (double) r7
            double r3 = java.lang.Math.sqrt(r3)
            r7 = r0
            r15 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r3, r0)
            r3 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r3
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x024d
            r26 = r0
            r29 = r15
            r25 = r33
            goto L_0x024d
        L_0x0248:
            r34 = r4
            r35 = r7
            r7 = r0
        L_0x024d:
            r0 = 0
            int r1 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0257
            int r1 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0257
            goto L_0x0272
        L_0x0257:
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x025e
            r27 = r34
            goto L_0x0260
        L_0x025e:
            r28 = r34
        L_0x0260:
            r1 = r38
            r2 = r39
            r4 = r0
            r0 = r7
            r3 = r21
            r7 = r35
            goto L_0x0185
        L_0x026c:
            r21 = r3
            r35 = r7
            r7 = r0
            r0 = r4
        L_0x0272:
            r1 = r29
            if (r14 == 0) goto L_0x028b
            if (r1 == 0) goto L_0x0280
            r2 = r22
            int r10 = r1.c(r2)
            goto L_0x0321
        L_0x0280:
            r2 = r22
            float r1 = r12 - r23
            float r1 = r1 / r31
            float r1 = r1 + r23
            r10 = r1
            r14 = 0
            goto L_0x029c
        L_0x028b:
            r2 = r22
            if (r1 != 0) goto L_0x0293
            r12 = r10
            r10 = r23
            goto L_0x0294
        L_0x0293:
            r9 = r1
        L_0x0294:
            float r1 = r12 - r10
            float r1 = r1 / r31
            float r1 = r1 + r10
            r23 = r10
            r10 = r1
        L_0x029c:
            r1 = r38
            r4 = r0
            r22 = r2
            r0 = r7
            r3 = r21
            r7 = r35
            r2 = r39
            goto L_0x016e
        L_0x02aa:
            r7 = r0
            r21 = r3
            r2 = r22
            if (r9 != 0) goto L_0x02b2
            goto L_0x02bb
        L_0x02b2:
            int r10 = r9.c(r2)
            goto L_0x0321
        L_0x02b8:
            r7 = r0
            r21 = r3
        L_0x02bb:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02c4
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0321
        L_0x02c4:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02cd
            r9 = 1
            r10 = -1
            goto L_0x0322
        L_0x02cd:
            float r0 = r13 + r20
            float r0 = r0 / r19
            r1 = 1090519040(0x41000000, float:8.0)
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x02d9
            r1 = 1
            goto L_0x02da
        L_0x02d9:
            r1 = 0
        L_0x02da:
            if (r1 == 0) goto L_0x02e0
            float r1 = r0 * r0
            float r1 = r1 * r0
            goto L_0x02e2
        L_0x02e0:
            float r1 = r13 / r18
        L_0x02e2:
            float r2 = r0 * r0
            float r2 = r2 * r0
            r3 = 1007753895(0x3c111aa7, float:0.008856452)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x02ee
            r3 = 1
            goto L_0x02ef
        L_0x02ee:
            r3 = 0
        L_0x02ef:
            if (r3 == 0) goto L_0x02f3
            r4 = r2
            goto L_0x02f9
        L_0x02f3:
            float r4 = r0 * r19
            float r4 = r4 - r20
            float r4 = r4 / r18
        L_0x02f9:
            if (r3 == 0) goto L_0x02fc
            goto L_0x0302
        L_0x02fc:
            float r0 = r0 * r19
            float r0 = r0 - r20
            float r2 = r0 / r18
        L_0x0302:
            float[] r0 = b1.o.f1526m
            r3 = 0
            r9 = r0[r3]
            float r4 = r4 * r9
            double r3 = (double) r4
            r9 = 1
            r10 = r0[r9]
            float r1 = r1 * r10
            double r12 = (double) r1
            r1 = 2
            r0 = r0[r1]
            float r2 = r2 * r0
            double r0 = (double) r2
            r22 = r3
            r24 = r12
            r26 = r0
            int r10 = q0.a.a(r22, r24, r26)
            goto L_0x0322
        L_0x031e:
            r7 = r0
            r21 = r3
        L_0x0321:
            r9 = 1
        L_0x0322:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x032a:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L_0x033f
            r1 = 4
            if (r8 > r1) goto L_0x0336
            r1 = r2
            goto L_0x0338
        L_0x0336:
            int r1 = r8 * 2
        L_0x0338:
            int[] r1 = new int[r1]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r8)
            r5 = r1
        L_0x033f:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x035d
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L_0x0350
            goto L_0x0352
        L_0x0350:
            int r2 = r8 * 2
        L_0x0352:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x035d:
            r6[r8] = r7
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r4 = r9
            r3 = r21
            r7 = 0
            r0 = r36
            goto L_0x0020
        L_0x036e:
            r21 = r3
            r9 = r4
            r0 = r36
            r1 = r38
            r2 = r39
            r4 = r9
            r3 = r21
            r7 = 0
            goto L_0x0020
        L_0x037d:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x038e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
