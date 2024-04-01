package androidx.emoji2.text;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import e.n0;
import g.h;
import g1.b;
import java.nio.ByteBuffer;

public final class g extends n0 {

    /* renamed from: f  reason: collision with root package name */
    public volatile s f1006f;

    /* renamed from: g  reason: collision with root package name */
    public volatile h f1007g;

    public g(l lVar) {
        super(19, (Object) lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0134, code lost:
        if (r5 != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0137, code lost:
        if (r5 == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0139, code lost:
        ((androidx.emoji2.text.y) r1).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ all -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f A[Catch:{ all -> 0x0141 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence H(java.lang.CharSequence r17, int r18, int r19, boolean r20) {
        /*
            r16 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r16
            androidx.emoji2.text.s r4 = r3.f1006f
            r4.getClass()
            boolean r5 = r1 instanceof androidx.emoji2.text.y
            if (r5 == 0) goto L_0x0017
            r6 = r1
            androidx.emoji2.text.y r6 = (androidx.emoji2.text.y) r6
            r6.a()
        L_0x0017:
            java.lang.Class<androidx.emoji2.text.z> r6 = androidx.emoji2.text.z.class
            if (r5 != 0) goto L_0x0039
            boolean r7 = r1 instanceof android.text.Spannable     // Catch:{ all -> 0x0141 }
            if (r7 == 0) goto L_0x0020
            goto L_0x0039
        L_0x0020:
            boolean r7 = r1 instanceof android.text.Spanned     // Catch:{ all -> 0x0141 }
            if (r7 == 0) goto L_0x0037
            r7 = r1
            android.text.Spanned r7 = (android.text.Spanned) r7     // Catch:{ all -> 0x0141 }
            int r8 = r0 + -1
            int r9 = r2 + 1
            int r7 = r7.nextSpanTransition(r8, r9, r6)     // Catch:{ all -> 0x0141 }
            if (r7 > r2) goto L_0x0037
            androidx.emoji2.text.b0 r7 = new androidx.emoji2.text.b0     // Catch:{ all -> 0x0141 }
            r7.<init>((java.lang.CharSequence) r1)     // Catch:{ all -> 0x0141 }
            goto L_0x0041
        L_0x0037:
            r7 = 0
            goto L_0x0041
        L_0x0039:
            androidx.emoji2.text.b0 r7 = new androidx.emoji2.text.b0     // Catch:{ all -> 0x0141 }
            r8 = r1
            android.text.Spannable r8 = (android.text.Spannable) r8     // Catch:{ all -> 0x0141 }
            r7.<init>((android.text.Spannable) r8)     // Catch:{ all -> 0x0141 }
        L_0x0041:
            r8 = 0
            if (r7 == 0) goto L_0x006d
            java.lang.Object[] r6 = r7.getSpans(r0, r2, r6)     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.z[] r6 = (androidx.emoji2.text.z[]) r6     // Catch:{ all -> 0x0141 }
            if (r6 == 0) goto L_0x006d
            int r9 = r6.length     // Catch:{ all -> 0x0141 }
            if (r9 <= 0) goto L_0x006d
            int r9 = r6.length     // Catch:{ all -> 0x0141 }
            r10 = r8
        L_0x0051:
            if (r10 >= r9) goto L_0x006d
            r11 = r6[r10]     // Catch:{ all -> 0x0141 }
            int r12 = r7.getSpanStart(r11)     // Catch:{ all -> 0x0141 }
            int r13 = r7.getSpanEnd(r11)     // Catch:{ all -> 0x0141 }
            if (r12 == r2) goto L_0x0062
            r7.removeSpan(r11)     // Catch:{ all -> 0x0141 }
        L_0x0062:
            int r0 = java.lang.Math.min(r12, r0)     // Catch:{ all -> 0x0141 }
            int r2 = java.lang.Math.max(r13, r2)     // Catch:{ all -> 0x0141 }
            int r10 = r10 + 1
            goto L_0x0051
        L_0x006d:
            if (r0 == r2) goto L_0x0137
            int r6 = r17.length()     // Catch:{ all -> 0x0141 }
            if (r0 < r6) goto L_0x0077
            goto L_0x0137
        L_0x0077:
            androidx.emoji2.text.r r6 = new androidx.emoji2.text.r     // Catch:{ all -> 0x0141 }
            g.h r9 = r4.f1039b     // Catch:{ all -> 0x0141 }
            java.lang.Object r9 = r9.f2727c     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.w r9 = (androidx.emoji2.text.w) r9     // Catch:{ all -> 0x0141 }
            r6.<init>(r9)     // Catch:{ all -> 0x0141 }
            int r9 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x0141 }
            r10 = r8
        L_0x0087:
            r11 = r9
            r9 = r0
        L_0x0089:
            r12 = 33
            r13 = 1
            r14 = 2147483647(0x7fffffff, float:NaN)
            r15 = 2
            if (r0 >= r2) goto L_0x00ea
            if (r10 >= r14) goto L_0x00ea
            int r14 = r6.a(r11)     // Catch:{ all -> 0x0141 }
            if (r14 == r13) goto L_0x00d9
            if (r14 == r15) goto L_0x00cd
            r13 = 3
            if (r14 == r13) goto L_0x00a0
            goto L_0x0089
        L_0x00a0:
            if (r20 != 0) goto L_0x00ac
            androidx.emoji2.text.w r13 = r6.f1035d     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.q r13 = r13.f1054b     // Catch:{ all -> 0x0141 }
            boolean r13 = r4.b(r1, r9, r0, r13)     // Catch:{ all -> 0x0141 }
            if (r13 != 0) goto L_0x00cb
        L_0x00ac:
            if (r7 != 0) goto L_0x00b8
            androidx.emoji2.text.b0 r7 = new androidx.emoji2.text.b0     // Catch:{ all -> 0x0141 }
            android.text.SpannableString r13 = new android.text.SpannableString     // Catch:{ all -> 0x0141 }
            r13.<init>(r1)     // Catch:{ all -> 0x0141 }
            r7.<init>((android.text.Spannable) r13)     // Catch:{ all -> 0x0141 }
        L_0x00b8:
            androidx.emoji2.text.w r13 = r6.f1035d     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.q r13 = r13.f1054b     // Catch:{ all -> 0x0141 }
            androidx.compose.ui.platform.e r14 = r4.f1038a     // Catch:{ all -> 0x0141 }
            r14.getClass()     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.z r14 = new androidx.emoji2.text.z     // Catch:{ all -> 0x0141 }
            r14.<init>(r13)     // Catch:{ all -> 0x0141 }
            r7.setSpan(r14, r9, r0, r12)     // Catch:{ all -> 0x0141 }
            int r10 = r10 + 1
        L_0x00cb:
            r9 = r11
            goto L_0x0087
        L_0x00cd:
            int r12 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0141 }
            int r0 = r0 + r12
            if (r0 >= r2) goto L_0x0089
            int r11 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x0141 }
            goto L_0x0089
        L_0x00d9:
            int r0 = java.lang.Character.codePointAt(r1, r9)     // Catch:{ all -> 0x0141 }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x0141 }
            int r9 = r9 + r0
            if (r9 >= r2) goto L_0x00e8
            int r11 = java.lang.Character.codePointAt(r1, r9)     // Catch:{ all -> 0x0141 }
        L_0x00e8:
            r0 = r9
            goto L_0x0089
        L_0x00ea:
            int r2 = r6.f1032a     // Catch:{ all -> 0x0141 }
            if (r2 != r15) goto L_0x00ff
            androidx.emoji2.text.w r2 = r6.f1034c     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.q r2 = r2.f1054b     // Catch:{ all -> 0x0141 }
            if (r2 == 0) goto L_0x00ff
            int r2 = r6.f1037f     // Catch:{ all -> 0x0141 }
            if (r2 > r13) goto L_0x00fe
            boolean r2 = r6.c()     // Catch:{ all -> 0x0141 }
            if (r2 == 0) goto L_0x00ff
        L_0x00fe:
            r8 = r13
        L_0x00ff:
            if (r8 == 0) goto L_0x0128
            if (r10 >= r14) goto L_0x0128
            if (r20 != 0) goto L_0x010f
            androidx.emoji2.text.w r2 = r6.f1034c     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.q r2 = r2.f1054b     // Catch:{ all -> 0x0141 }
            boolean r2 = r4.b(r1, r9, r0, r2)     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x0128
        L_0x010f:
            if (r7 != 0) goto L_0x0117
            androidx.emoji2.text.b0 r2 = new androidx.emoji2.text.b0     // Catch:{ all -> 0x0141 }
            r2.<init>((java.lang.CharSequence) r1)     // Catch:{ all -> 0x0141 }
            r7 = r2
        L_0x0117:
            androidx.emoji2.text.w r2 = r6.f1034c     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.q r2 = r2.f1054b     // Catch:{ all -> 0x0141 }
            androidx.compose.ui.platform.e r4 = r4.f1038a     // Catch:{ all -> 0x0141 }
            r4.getClass()     // Catch:{ all -> 0x0141 }
            androidx.emoji2.text.z r4 = new androidx.emoji2.text.z     // Catch:{ all -> 0x0141 }
            r4.<init>(r2)     // Catch:{ all -> 0x0141 }
            r7.setSpan(r4, r9, r0, r12)     // Catch:{ all -> 0x0141 }
        L_0x0128:
            if (r7 == 0) goto L_0x0134
            android.text.Spannable r0 = r7.f1002e     // Catch:{ all -> 0x0141 }
            if (r5 == 0) goto L_0x0140
            androidx.emoji2.text.y r1 = (androidx.emoji2.text.y) r1
            r1.b()
            goto L_0x0140
        L_0x0134:
            if (r5 == 0) goto L_0x013f
            goto L_0x0139
        L_0x0137:
            if (r5 == 0) goto L_0x013f
        L_0x0139:
            r0 = r1
            androidx.emoji2.text.y r0 = (androidx.emoji2.text.y) r0
            r0.b()
        L_0x013f:
            r0 = r1
        L_0x0140:
            return r0
        L_0x0141:
            r0 = move-exception
            if (r5 == 0) goto L_0x0149
            androidx.emoji2.text.y r1 = (androidx.emoji2.text.y) r1
            r1.b()
        L_0x0149:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.g.H(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final void I(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        b bVar = (b) this.f1007g.f2725a;
        int a6 = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a6 != 0 ? ((ByteBuffer) bVar.f2843d).getInt(a6 + bVar.f2840a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((l) this.f2403e).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
