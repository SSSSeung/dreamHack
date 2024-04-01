package j0;

import android.util.SparseArray;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f3708a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray f3709b = new SparseArray();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r8, int r9) {
        /*
            r7 = this;
            r7.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r7.f3708a = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r7.f3709b = r0
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r1 = 0
        L_0x001e:
            r2 = 1
            if (r0 == r2) goto L_0x00bd
            if (r0 == 0) goto L_0x00ab
            r3 = 2
            if (r0 == r3) goto L_0x0028
            goto L_0x00ae
        L_0x0028:
            java.lang.String r0 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            int r4 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x005e;
                case 80204913: goto L_0x0054;
                case 1382829617: goto L_0x004a;
                case 1657696882: goto L_0x0040;
                case 1901439077: goto L_0x0036;
                default: goto L_0x0035;
            }     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
        L_0x0035:
            goto L_0x0068
        L_0x0036:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            if (r4 == 0) goto L_0x0068
            r4 = r6
            goto L_0x0069
        L_0x0040:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            if (r4 == 0) goto L_0x0068
            r4 = 0
            goto L_0x0069
        L_0x004a:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            if (r4 == 0) goto L_0x0068
            r4 = r2
            goto L_0x0069
        L_0x0054:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            if (r4 == 0) goto L_0x0068
            r4 = r3
            goto L_0x0069
        L_0x005e:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            if (r4 == 0) goto L_0x0068
            r4 = r5
            goto L_0x0069
        L_0x0068:
            r4 = -1
        L_0x0069:
            if (r4 == 0) goto L_0x00ae
            if (r4 == r2) goto L_0x00ae
            if (r4 == r3) goto L_0x009d
            if (r4 == r6) goto L_0x008e
            if (r4 == r5) goto L_0x008a
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r3.append(r0)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            java.lang.String r0 = r3.toString()     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            android.util.Log.v(r2, r0)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            goto L_0x00ae
        L_0x008a:
            r7.a(r8, r9)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            goto L_0x00ae
        L_0x008e:
            j0.g r0 = new j0.g     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r0.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            if (r1 == 0) goto L_0x00ae
            java.lang.Object r2 = r1.f3701f     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r2.add(r0)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            goto L_0x00ae
        L_0x009d:
            j0.f r0 = new j0.f     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r0.<init>((android.content.Context) r8, (android.content.res.XmlResourceParser) r9)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            android.util.SparseArray r1 = r7.f3708a     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            int r2 = r0.f3699d     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            r1 = r0
            goto L_0x00ae
        L_0x00ab:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
        L_0x00ae:
            int r0 = r9.next()     // Catch:{ XmlPullParserException -> 0x00b9, IOException -> 0x00b4 }
            goto L_0x001e
        L_0x00b4:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00bd
        L_0x00b9:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.h.<init>(android.content.Context, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ce, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            r12 = this;
            j0.n r0 = new j0.n
            r0.<init>()
            int r1 = r14.getAttributeCount()
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r1) goto L_0x01e7
            java.lang.String r4 = r14.getAttributeName(r3)
            java.lang.String r5 = "id"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01e3
            java.lang.String r1 = r14.getAttributeValue(r3)
            java.lang.String r3 = "/"
            boolean r3 = r1.contains(r3)
            r4 = 1
            r6 = -1
            if (r3 == 0) goto L_0x003f
            r3 = 47
            int r3 = r1.indexOf(r3)
            int r3 = r3 + r4
            java.lang.String r3 = r1.substring(r3)
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = r13.getPackageName()
            int r3 = r7.getIdentifier(r3, r5, r8)
            goto L_0x0040
        L_0x003f:
            r3 = r6
        L_0x0040:
            if (r3 != r6) goto L_0x0058
            int r5 = r1.length()
            if (r5 <= r4) goto L_0x0051
            java.lang.String r1 = r1.substring(r4)
            int r3 = java.lang.Integer.parseInt(r1)
            goto L_0x0058
        L_0x0051:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r5 = "error in parsing id"
            android.util.Log.e(r1, r5)
        L_0x0058:
            int r1 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r5 = 0
            r7 = r5
        L_0x005e:
            if (r1 == r4) goto L_0x01dd
            if (r1 == 0) goto L_0x01cb
            java.lang.String r8 = "Constraint"
            r9 = 3
            r10 = 2
            if (r1 == r10) goto L_0x008e
            if (r1 == r9) goto L_0x006c
            goto L_0x01ce
        L_0x006c:
            java.lang.String r1 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.String r9 = "ConstraintSet"
            boolean r9 = r9.equals(r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r9 == 0) goto L_0x007a
            goto L_0x01dd
        L_0x007a:
            boolean r1 = r1.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x01ce
            java.util.HashMap r1 = r0.f3776c     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            int r8 = r7.f3710a     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r1.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r7 = r5
            goto L_0x01ce
        L_0x008e:
            java.lang.String r1 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            int r11 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            switch(r11) {
                case -2025855158: goto L_0x00dd;
                case -1984451626: goto L_0x00d3;
                case -1269513683: goto L_0x00ca;
                case -1238332596: goto L_0x00c0;
                case -71750448: goto L_0x00b6;
                case 1331510167: goto L_0x00ac;
                case 1791837707: goto L_0x00a2;
                case 1803088381: goto L_0x009a;
                default: goto L_0x0099;
            }     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x0099:
            goto L_0x00e7
        L_0x009a:
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            r9 = r2
            goto L_0x00e8
        L_0x00a2:
            java.lang.String r8 = "CustomAttribute"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            r9 = 7
            goto L_0x00e8
        L_0x00ac:
            java.lang.String r8 = "Barrier"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            r9 = r10
            goto L_0x00e8
        L_0x00b6:
            java.lang.String r8 = "Guideline"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            r9 = r4
            goto L_0x00e8
        L_0x00c0:
            java.lang.String r8 = "Transform"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            r9 = 4
            goto L_0x00e8
        L_0x00ca:
            java.lang.String r8 = "PropertySet"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00d3:
            java.lang.String r8 = "Motion"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            r9 = 6
            goto L_0x00e8
        L_0x00dd:
            java.lang.String r8 = "Layout"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            if (r1 == 0) goto L_0x00e7
            r9 = 5
            goto L_0x00e8
        L_0x00e7:
            r9 = r6
        L_0x00e8:
            java.lang.String r1 = "XML parser error must be within a Constraint "
            switch(r9) {
                case 0: goto L_0x01c1;
                case 1: goto L_0x01b4;
                case 2: goto L_0x01a7;
                case 3: goto L_0x0182;
                case 4: goto L_0x015d;
                case 5: goto L_0x0137;
                case 6: goto L_0x0111;
                case 7: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x01ce
        L_0x00ef:
            if (r7 == 0) goto L_0x00f8
            java.util.HashMap r1 = r7.f3715f     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            j0.a.a(r13, r14, r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x01ce
        L_0x00f8:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            throw r13     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x0111:
            if (r7 == 0) goto L_0x011e
            j0.k r1 = r7.f3712c     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x01ce
        L_0x011e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            throw r13     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x0137:
            if (r7 == 0) goto L_0x0144
            j0.j r1 = r7.f3713d     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x01ce
        L_0x0144:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            throw r13     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x015d:
            if (r7 == 0) goto L_0x0169
            j0.m r1 = r7.f3714e     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x01ce
        L_0x0169:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            throw r13     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x0182:
            if (r7 == 0) goto L_0x018e
            j0.l r1 = r7.f3711b     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x01ce
        L_0x018e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            throw r13     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x01a7:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            j0.i r1 = j0.n.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            j0.j r7 = r1.f3713d     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r7.f3722c0 = r4     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x01c9
        L_0x01b4:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            j0.i r1 = j0.n.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            j0.j r7 = r1.f3713d     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            r7.f3717a = r4     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x01c9
        L_0x01c1:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            j0.i r1 = j0.n.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x01c9:
            r7 = r1
            goto L_0x01ce
        L_0x01cb:
            r14.getName()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
        L_0x01ce:
            int r1 = r14.next()     // Catch:{ XmlPullParserException -> 0x01d9, IOException -> 0x01d4 }
            goto L_0x005e
        L_0x01d4:
            r13 = move-exception
            r13.printStackTrace()
            goto L_0x01dd
        L_0x01d9:
            r13 = move-exception
            r13.printStackTrace()
        L_0x01dd:
            android.util.SparseArray r13 = r12.f3709b
            r13.put(r3, r0)
            goto L_0x01e7
        L_0x01e3:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.h.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
