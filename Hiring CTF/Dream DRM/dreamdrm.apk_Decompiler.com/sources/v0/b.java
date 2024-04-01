package v0;

import android.text.SpannableStringBuilder;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f5361d = Character.toString(8206);

    /* renamed from: e  reason: collision with root package name */
    public static final String f5362e = Character.toString(8207);

    /* renamed from: f  reason: collision with root package name */
    public static final b f5363f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f5364g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5365a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5366b;

    /* renamed from: c  reason: collision with root package name */
    public final h f5367c;

    static {
        i iVar = j.f5376c;
        f5363f = new b(false, 2, iVar);
        f5364g = new b(true, 2, iVar);
    }

    public b(boolean z5, int i3, i iVar) {
        this.f5365a = z5;
        this.f5366b = i3;
        this.f5367c = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            v0.a r0 = new v0.a
            r0.<init>(r9)
            r9 = 0
            r0.f5359c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        L_0x000b:
            int r4 = r0.f5359c
            int r5 = r0.f5358b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L_0x006e
            if (r1 != 0) goto L_0x006e
            java.lang.CharSequence r5 = r0.f5357a
            char r4 = r5.charAt(r4)
            r0.f5360d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0037
            int r4 = r0.f5359c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f5359c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f5359c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x004b
        L_0x0037:
            int r4 = r0.f5359c
            int r4 = r4 + r7
            r0.f5359c = r4
            char r4 = r0.f5360d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L_0x0047
            byte[] r5 = v0.a.f5356e
            byte r4 = r5[r4]
            goto L_0x004b
        L_0x0047:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x0069
            if (r4 == r7) goto L_0x0066
            r5 = 2
            if (r4 == r5) goto L_0x0066
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x0062;
                case 15: goto L_0x0062;
                case 16: goto L_0x005e;
                case 17: goto L_0x005e;
                case 18: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x006c
        L_0x005a:
            int r3 = r3 + -1
            r2 = r9
            goto L_0x000b
        L_0x005e:
            int r3 = r3 + 1
            r2 = r7
            goto L_0x000b
        L_0x0062:
            int r3 = r3 + 1
            r2 = r6
            goto L_0x000b
        L_0x0066:
            if (r3 != 0) goto L_0x006c
            goto L_0x0086
        L_0x0069:
            if (r3 != 0) goto L_0x006c
            goto L_0x008a
        L_0x006c:
            r1 = r3
            goto L_0x000b
        L_0x006e:
            if (r1 != 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            if (r2 == 0) goto L_0x0075
            r9 = r2
            goto L_0x008f
        L_0x0075:
            int r2 = r0.f5359c
            if (r2 <= 0) goto L_0x008f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L_0x0088;
                case 15: goto L_0x0088;
                case 16: goto L_0x0084;
                case 17: goto L_0x0084;
                case 18: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0075
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0075
        L_0x0084:
            if (r1 != r3) goto L_0x008c
        L_0x0086:
            r9 = r7
            goto L_0x008f
        L_0x0088:
            if (r1 != r3) goto L_0x008c
        L_0x008a:
            r9 = r6
            goto L_0x008f
        L_0x008c:
            int r3 = r3 + -1
            goto L_0x0075
        L_0x008f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            v0.a r0 = new v0.a
            r0.<init>(r6)
            int r6 = r0.f5358b
            r0.f5359c = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.f5359c
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            r4 = 1
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence, h hVar) {
        if (charSequence == null) {
            return null;
        }
        boolean e6 = hVar.e(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z5 = (this.f5366b & 2) != 0;
        String str = f5362e;
        String str2 = f5361d;
        boolean z6 = this.f5365a;
        if (z5) {
            boolean e7 = (e6 ? j.f5375b : j.f5374a).e(charSequence, charSequence.length());
            spannableStringBuilder.append((z6 || (!e7 && a(charSequence) != 1)) ? (!z6 || (e7 && a(charSequence) != -1)) ? "" : str : str2);
        }
        if (e6 != z6) {
            spannableStringBuilder.append(e6 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean e8 = (e6 ? j.f5375b : j.f5374a).e(charSequence, charSequence.length());
        if (!z6 && (e8 || b(charSequence) == 1)) {
            str = str2;
        } else if (!z6 || (e8 && b(charSequence) != -1)) {
            str = "";
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }
}
