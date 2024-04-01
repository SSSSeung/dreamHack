package e4;

import b1.o;
import com.theori.dreamdrm.DecryptionItem;
import com.theori.dreamdrm.FileItem;
import com.theori.dreamdrm.MainActivity;
import d5.j;
import java.io.IOException;
import z4.e;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FileItem f2585b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DecryptionItem f2586c;

    public k(MainActivity mainActivity, FileItem fileItem, DecryptionItem decryptionItem) {
        this.f2584a = mainActivity;
        this.f2585b = fileItem;
        this.f2586c = decryptionItem;
    }

    public final void a(j jVar, IOException iOException) {
        o.m(jVar, "call");
        this.f2584a.o("Failed to fetch encrypted file from the server");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        b1.v.l(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        b1.v.l(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(d5.j r7, z4.a0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "call"
            b1.o.m(r7, r0)
            r7 = 0
            r0 = 200(0xc8, float:2.8E-43)
            int r1 = r8.f5959g
            if (r0 <= r1) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            r0 = 299(0x12b, float:4.19E-43)
            if (r0 < r1) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r7
        L_0x0014:
            if (r0 == 0) goto L_0x00a6
            z4.c0 r8 = r8.f5962j
            b1.o.k(r8)
            z4.b0 r8 = (z4.b0) r8
            l5.i r8 = r8.f5972f
            l5.f r8 = r8.B()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.theori.dreamdrm.FileItem r1 = r6.f2585b
            int r1 = r1.b()
            r0.append(r1)
            java.lang.String r1 = ".pdf"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = com.theori.dreamdrm.MainActivity.A
            com.theori.dreamdrm.MainActivity r1 = r6.f2584a
            r1.getClass()
            java.io.File r2 = new java.io.File
            r3 = 0
            java.io.File r4 = r1.getExternalFilesDir(r3)
            r2.<init>(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x009f }
            r0.<init>(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "<this>"
            b1.o.m(r8, r4)     // Catch:{ all -> 0x0098 }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0098 }
        L_0x0059:
            int r5 = r8.read(r4)     // Catch:{ all -> 0x0098 }
            if (r5 < 0) goto L_0x0063
            r0.write(r4, r7, r5)     // Catch:{ all -> 0x0098 }
            goto L_0x0059
        L_0x0063:
            b1.v.l(r0, r3)     // Catch:{ all -> 0x009f }
            b1.v.l(r8, r3)
            com.theori.dreamdrm.DecryptionItem r7 = r6.f2586c
            java.lang.String r7 = r7.a()
            java.lang.String r8 = r2.getAbsolutePath()
            java.lang.String r0 = "file.absolutePath"
            b1.o.l(r8, r0)
            boolean r7 = r1.decrypt(r8, r7)
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = "Failed to decrypt encrypted file"
            r1.o(r7)
            return
        L_0x0084:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.theori.dreamdrm.PdfViewerActivity> r8 = com.theori.dreamdrm.PdfViewerActivity.class
            r7.<init>(r1, r8)
            java.lang.String r8 = "pdfFilePath"
            java.lang.String r0 = r2.getAbsolutePath()
            r7.putExtra(r8, r0)
            r1.startActivity(r7)
            return
        L_0x0098:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x009a }
        L_0x009a:
            r1 = move-exception
            b1.v.l(r0, r7)     // Catch:{ all -> 0x009f }
            throw r1     // Catch:{ all -> 0x009f }
        L_0x009f:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            b1.v.l(r8, r7)
            throw r0
        L_0x00a6:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected code "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.k.b(d5.j, z4.a0):void");
    }
}
