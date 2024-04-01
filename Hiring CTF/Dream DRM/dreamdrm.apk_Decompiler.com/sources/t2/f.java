package t2;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Pair;
import com.bumptech.glide.c;
import com.github.barteksc.pdfviewer.PDFView;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p1.q;
import w2.a;
import y.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final PDFView f5203a;

    /* renamed from: b  reason: collision with root package name */
    public int f5204b;

    /* renamed from: c  reason: collision with root package name */
    public float f5205c;

    /* renamed from: d  reason: collision with root package name */
    public float f5206d;

    /* renamed from: e  reason: collision with root package name */
    public Pair f5207e;

    /* renamed from: f  reason: collision with root package name */
    public float f5208f;

    /* renamed from: g  reason: collision with root package name */
    public float f5209g;

    /* renamed from: h  reason: collision with root package name */
    public float f5210h;

    /* renamed from: i  reason: collision with root package name */
    public float f5211i;

    /* renamed from: j  reason: collision with root package name */
    public float f5212j;

    /* renamed from: k  reason: collision with root package name */
    public float f5213k;

    /* renamed from: l  reason: collision with root package name */
    public float f5214l;

    /* renamed from: m  reason: collision with root package name */
    public float f5215m;

    /* renamed from: n  reason: collision with root package name */
    public int f5216n;

    /* renamed from: o  reason: collision with root package name */
    public int f5217o;

    /* renamed from: p  reason: collision with root package name */
    public float f5218p;

    /* renamed from: q  reason: collision with root package name */
    public final RectF f5219q = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    public f(PDFView pDFView) {
        this.f5203a = pDFView;
    }

    public final int a(int i3) {
        int i6;
        PDFView pDFView = this.f5203a;
        if (pDFView.getOriginalUserPages() == null) {
            i6 = i3;
        } else if (i3 < 0 || i3 >= pDFView.getOriginalUserPages().length) {
            return -1;
        } else {
            i6 = pDFView.getOriginalUserPages()[i3];
        }
        if (i6 < 0 || i3 >= pDFView.getDocumentPageCount()) {
            return -1;
        }
        return i6;
    }

    public final q b(float f6, boolean z5) {
        float f7;
        float f8;
        int i3;
        q qVar = new q(this);
        if (f6 > 0.0f) {
            f6 = 0.0f;
        }
        float f9 = -f6;
        if (this.f5203a.E) {
            int l6 = c.l(f9 / (this.f5205c + this.f5218p));
            qVar.f4644a = l6;
            f7 = Math.abs(f9 - ((this.f5205c + this.f5218p) * ((float) l6))) / this.f5210h;
            f8 = this.f5208f / this.f5211i;
        } else {
            int l7 = c.l(f9 / (this.f5206d + this.f5218p));
            qVar.f4644a = l7;
            f8 = Math.abs(f9 - ((this.f5206d + this.f5218p) * ((float) l7))) / this.f5211i;
            f7 = this.f5209g / this.f5210h;
        }
        if (z5) {
            qVar.f4645b = c.g(f7);
            i3 = c.g(f8);
        } else {
            qVar.f4645b = c.l(f7);
            i3 = c.l(f8);
        }
        qVar.f4646c = i3;
        return qVar;
    }

    public final boolean c(int i3, int i6, int i7, int i8, float f6, float f7) {
        a aVar;
        a aVar2;
        float f8 = ((float) i8) * f6;
        float f9 = ((float) i7) * f7;
        float f10 = this.f5214l;
        float f11 = this.f5215m;
        float f12 = f8 + f6 > 1.0f ? 1.0f - f8 : f6;
        float f13 = f9 + f7 > 1.0f ? 1.0f - f9 : f7;
        float f14 = f10 * f12;
        float f15 = f11 * f13;
        RectF rectF = new RectF(f8, f9, f12 + f8, f13 + f9);
        boolean z5 = false;
        if (f14 <= 0.0f || f15 <= 0.0f) {
            return false;
        }
        i iVar = this.f5203a.f1795h;
        int i9 = this.f5204b;
        iVar.getClass();
        a aVar3 = new a(i3, i6, (Bitmap) null, rectF, false, 0);
        synchronized (iVar.f5777e) {
            try {
                Iterator it = ((PriorityQueue) iVar.f5774b).iterator();
                while (true) {
                    aVar = null;
                    if (!it.hasNext()) {
                        aVar2 = null;
                        break;
                    }
                    aVar2 = (a) it.next();
                    if (aVar2.equals(aVar3)) {
                        break;
                    }
                }
                if (aVar2 != null) {
                    ((PriorityQueue) iVar.f5774b).remove(aVar2);
                    aVar2.f5471f = i9;
                    ((PriorityQueue) iVar.f5775c).offer(aVar2);
                    z5 = true;
                } else {
                    Iterator it2 = ((PriorityQueue) iVar.f5775c).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a aVar4 = (a) it2.next();
                        if (aVar4.equals(aVar3)) {
                            aVar = aVar4;
                            break;
                        }
                    }
                    if (aVar != null) {
                        z5 = true;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z5) {
            PDFView pDFView = this.f5203a;
            pDFView.f1812z.a(i3, i6, f14, f15, rectF, false, this.f5204b, pDFView.H);
        }
        this.f5204b++;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r10.f5203a
            boolean r1 = r0.E
            r2 = 0
            if (r1 == 0) goto L_0x0019
            float r1 = r10.f5210h
            float r11 = (float) r11
            float r1 = r1 * r11
            r11 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r11
            float r11 = r0.getCurrentYOffset()
            if (r13 == 0) goto L_0x0028
            int r13 = r0.getHeight()
            goto L_0x0029
        L_0x0019:
            float r1 = r10.f5211i
            float r11 = (float) r11
            float r1 = r1 * r11
            float r11 = r0.getCurrentXOffset()
            if (r13 == 0) goto L_0x0028
            int r13 = r0.getWidth()
            goto L_0x0029
        L_0x0028:
            r13 = r2
        L_0x0029:
            float r13 = (float) r13
            float r11 = r11 - r13
            float r11 = r11 - r1
            p1.q r11 = r10.b(r11, r2)
            int r13 = r11.f4644a
            int r13 = r10.a(r13)
            if (r13 >= 0) goto L_0x0039
            return r2
        L_0x0039:
            int r1 = r11.f4644a
            r10.e(r1, r13)
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0089
            float r1 = r10.f5208f
            float r3 = r10.f5211i
            float r1 = r1 / r3
            int r1 = com.bumptech.glide.c.l(r1)
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x0050
            r1 = r2
        L_0x0050:
            float r3 = r10.f5208f
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 + r0
            float r0 = r10.f5211i
            float r3 = r3 / r0
            int r0 = com.bumptech.glide.c.g(r3)
            int r0 = r0 + 1
            android.util.Pair r3 = r10.f5207e
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 <= r3) goto L_0x006e
            r0 = r3
        L_0x006e:
            if (r1 > r0) goto L_0x00d0
            int r4 = r11.f4644a
            int r6 = r11.f4645b
            float r8 = r10.f5212j
            float r9 = r10.f5213k
            r3 = r10
            r5 = r13
            r7 = r1
            boolean r3 = r3.c(r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0083
            int r2 = r2 + 1
        L_0x0083:
            if (r2 < r12) goto L_0x0086
            return r2
        L_0x0086:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x0089:
            float r1 = r10.f5209g
            float r3 = r10.f5210h
            float r1 = r1 / r3
            int r1 = com.bumptech.glide.c.l(r1)
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x0097
            r1 = r2
        L_0x0097:
            float r3 = r10.f5209g
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r3 = r3 + r0
            float r0 = r10.f5210h
            float r3 = r3 / r0
            int r0 = com.bumptech.glide.c.g(r3)
            int r0 = r0 + 1
            android.util.Pair r3 = r10.f5207e
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 <= r3) goto L_0x00b5
            r0 = r3
        L_0x00b5:
            if (r1 > r0) goto L_0x00d0
            int r4 = r11.f4644a
            int r7 = r11.f4646c
            float r8 = r10.f5212j
            float r9 = r10.f5213k
            r3 = r10
            r5 = r13
            r6 = r1
            boolean r3 = r3.c(r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00ca
            int r2 = r2 + 1
        L_0x00ca:
            if (r2 < r12) goto L_0x00cd
            return r2
        L_0x00cd:
            int r1 = r1 + 1
            goto L_0x00b5
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.f.d(int, int, boolean):int");
    }

    public final void e(int i3, int i6) {
        boolean z5;
        i iVar = this.f5203a.f1795h;
        RectF rectF = this.f5219q;
        iVar.getClass();
        a aVar = new a(i3, i6, (Bitmap) null, rectF, true, 0);
        synchronized (((List) iVar.f5776d)) {
            Iterator it = ((List) iVar.f5776d).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).equals(aVar)) {
                        z5 = true;
                        break;
                    }
                } else {
                    z5 = false;
                    break;
                }
            }
        }
        if (!z5) {
            PDFView pDFView = this.f5203a;
            pDFView.f1812z.a(i3, i6, (float) this.f5216n, (float) this.f5217o, this.f5219q, true, 0, pDFView.H);
        }
    }
}
