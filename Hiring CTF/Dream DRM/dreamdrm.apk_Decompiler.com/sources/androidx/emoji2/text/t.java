package androidx.emoji2.text;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1041d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f1042e;

    public /* synthetic */ t(u uVar, int i3) {
        this.f1041d = i3;
        this.f1042e = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r0.d();
        r3 = r2.f5258e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r3 != 2) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r4 = r0.f1046g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        if (r3 != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3 = t0.k.f5089a;
        t0.j.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r1 = r0.f1045f;
        r3 = r0.f1043d;
        r1.getClass();
        r1 = q0.g.f4876a.z(r3, new u0.g[]{r2}, 0);
        r2 = w4.p.r(r0.f1043d, r2.f5254a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r2 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r1 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        t0.j.a("EmojiCompat.MetadataRepo.create");
        r3 = new g.h(r1, com.bumptech.glide.e.r(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        t0.j.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        t0.j.b();
        r1 = r0.f1046g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2 = r0.f1050k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r2 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        r2.t(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0075, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2 = t0.k.f5089a;
        t0.j.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0083, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r2 = t0.k.f5089a;
        t0.j.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a1, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r3 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a5, code lost:
        monitor-enter(r0.f1046g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2 = r0.f1050k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a8, code lost:
        if (r2 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00aa, code lost:
        r2.s(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ae, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f1041d
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00b8
        L_0x0007:
            androidx.emoji2.text.u r0 = r6.f1042e
            java.lang.String r1 = "fetchFonts result is not OK. ("
            java.lang.Object r2 = r0.f1046g
            monitor-enter(r2)
            com.bumptech.glide.d r3 = r0.f1050k     // Catch:{ all -> 0x00b5 }
            if (r3 != 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b1
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            u0.g r2 = r0.d()     // Catch:{ all -> 0x00a2 }
            int r3 = r2.f5258e     // Catch:{ all -> 0x00a2 }
            r4 = 2
            if (r3 != r4) goto L_0x0027
            java.lang.Object r4 = r0.f1046g     // Catch:{ all -> 0x00a2 }
            monitor-enter(r4)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            goto L_0x0027
        L_0x0024:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x0027:
            if (r3 != 0) goto L_0x008b
            java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = t0.k.f5089a     // Catch:{ all -> 0x0084 }
            t0.j.a(r1)     // Catch:{ all -> 0x0084 }
            androidx.compose.ui.platform.e r1 = r0.f1045f     // Catch:{ all -> 0x0084 }
            android.content.Context r3 = r0.f1043d     // Catch:{ all -> 0x0084 }
            r1.getClass()     // Catch:{ all -> 0x0084 }
            r1 = 1
            u0.g[] r1 = new u0.g[r1]     // Catch:{ all -> 0x0084 }
            r4 = 0
            r1[r4] = r2     // Catch:{ all -> 0x0084 }
            e.n0 r5 = q0.g.f4876a     // Catch:{ all -> 0x0084 }
            android.graphics.Typeface r1 = r5.z(r3, r1, r4)     // Catch:{ all -> 0x0084 }
            android.content.Context r3 = r0.f1043d     // Catch:{ all -> 0x0084 }
            android.net.Uri r2 = r2.f5254a     // Catch:{ all -> 0x0084 }
            java.nio.MappedByteBuffer r2 = w4.p.r(r3, r2)     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            t0.j.a(r3)     // Catch:{ all -> 0x0075 }
            g.h r3 = new g.h     // Catch:{ all -> 0x0075 }
            g1.b r2 = com.bumptech.glide.e.r(r2)     // Catch:{ all -> 0x0075 }
            r3.<init>((android.graphics.Typeface) r1, (g1.b) r2)     // Catch:{ all -> 0x0075 }
            t0.j.b()     // Catch:{ all -> 0x0084 }
            t0.j.b()     // Catch:{ all -> 0x00a2 }
            java.lang.Object r1 = r0.f1046g     // Catch:{ all -> 0x00a2 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a2 }
            com.bumptech.glide.d r2 = r0.f1050k     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x006d
            r2.t(r3)     // Catch:{ all -> 0x0072 }
        L_0x006d:
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            r0.b()     // Catch:{ all -> 0x00a2 }
            goto L_0x00b1
        L_0x0072:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            throw r2     // Catch:{ all -> 0x00a2 }
        L_0x0075:
            r1 = move-exception
            int r2 = t0.k.f5089a     // Catch:{ all -> 0x0084 }
            t0.j.b()     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x007c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            int r2 = t0.k.f5089a     // Catch:{ all -> 0x00a2 }
            t0.j.b()     // Catch:{ all -> 0x00a2 }
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x008b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a2 }
            r4.append(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00a2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a2 }
            throw r2     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            java.lang.Object r3 = r0.f1046g
            monitor-enter(r3)
            com.bumptech.glide.d r2 = r0.f1050k     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x00ad
            r2.s(r1)     // Catch:{ all -> 0x00b2 }
        L_0x00ad:
            monitor-exit(r3)     // Catch:{ all -> 0x00b2 }
            r0.b()
        L_0x00b1:
            return
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b2 }
            throw r0
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            throw r0
        L_0x00b8:
            androidx.emoji2.text.u r0 = r6.f1042e
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.t.run():void");
    }
}
