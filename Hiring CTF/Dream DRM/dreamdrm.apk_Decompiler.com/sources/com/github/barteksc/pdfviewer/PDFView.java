package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import com.shockwave.pdfium.PdfiumCore;
import d4.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p1.q;
import t2.b;
import t2.e;
import t2.f;
import t2.h;
import v2.a;
import v2.d;
import y.i;

public class PDFView extends RelativeLayout {
    public static final /* synthetic */ int N = 0;
    public f A;
    public final Paint B;
    public int C = -1;
    public int D = 0;
    public boolean E = true;
    public final PdfiumCore F;
    public c G;
    public boolean H = false;
    public boolean I = true;
    public final PaintFlagsDrawFilter J = new PaintFlagsDrawFilter(0, 3);
    public int K = 0;
    public final ArrayList L = new ArrayList(10);
    public int M = 1;

    /* renamed from: d  reason: collision with root package name */
    public float f1791d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1792e = 1.75f;

    /* renamed from: f  reason: collision with root package name */
    public float f1793f = 3.0f;

    /* renamed from: g  reason: collision with root package name */
    public e f1794g = e.f5199d;

    /* renamed from: h  reason: collision with root package name */
    public final i f1795h;

    /* renamed from: i  reason: collision with root package name */
    public final w1.c f1796i;

    /* renamed from: j  reason: collision with root package name */
    public final t2.c f1797j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f1798k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f1799l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f1800m;

    /* renamed from: n  reason: collision with root package name */
    public int f1801n;

    /* renamed from: o  reason: collision with root package name */
    public int f1802o;

    /* renamed from: p  reason: collision with root package name */
    public int f1803p;

    /* renamed from: q  reason: collision with root package name */
    public int f1804q;

    /* renamed from: r  reason: collision with root package name */
    public float f1805r;

    /* renamed from: s  reason: collision with root package name */
    public float f1806s;

    /* renamed from: t  reason: collision with root package name */
    public float f1807t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f1808u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    public float f1809v = 1.0f;
    public boolean w = true;

    /* renamed from: x  reason: collision with root package name */
    public b f1810x;

    /* renamed from: y  reason: collision with root package name */
    public final HandlerThread f1811y = new HandlerThread("PDF renderer");

    /* renamed from: z  reason: collision with root package name */
    public h f1812z;

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.f1795h = new i();
            w1.c cVar = new w1.c(this);
            this.f1796i = cVar;
            this.f1797j = new t2.c(this, cVar);
            this.B = new Paint();
            new Paint().setStyle(Paint.Style.STROKE);
            this.F = new PdfiumCore(context);
            setWillNotDraw(false);
        }
    }

    /* access modifiers changed from: private */
    public void setDefaultPage(int i3) {
        this.D = i3;
    }

    /* access modifiers changed from: private */
    public void setInvalidPageColor(int i3) {
        this.C = i3;
    }

    /* access modifiers changed from: private */
    public void setOnDrawAllListener(a aVar) {
    }

    /* access modifiers changed from: private */
    public void setOnDrawListener(a aVar) {
    }

    /* access modifiers changed from: private */
    public void setOnPageChangeListener(v2.b bVar) {
    }

    /* access modifiers changed from: private */
    public void setOnPageErrorListener(v2.c cVar) {
    }

    /* access modifiers changed from: private */
    public void setOnPageScrollListener(d dVar) {
    }

    /* access modifiers changed from: private */
    public void setOnRenderListener(v2.e eVar) {
    }

    /* access modifiers changed from: private */
    public void setOnTapListener(v2.f fVar) {
    }

    /* access modifiers changed from: private */
    public void setScrollHandle(x2.a aVar) {
    }

    /* access modifiers changed from: private */
    public void setSpacing(int i3) {
        this.K = (int) TypedValue.applyDimension(1, (float) i3, getContext().getResources().getDisplayMetrics());
    }

    public final boolean canScrollHorizontally(int i3) {
        if (this.E) {
            if (i3 < 0 && this.f1807t < 0.0f) {
                return true;
            }
            if (i3 <= 0) {
                return false;
            }
            return (this.f1805r * this.f1809v) + this.f1807t > ((float) getWidth());
        } else if (i3 < 0 && this.f1807t < 0.0f) {
            return true;
        } else {
            if (i3 <= 0) {
                return false;
            }
            return l() + this.f1807t > ((float) getWidth());
        }
    }

    public final boolean canScrollVertically(int i3) {
        if (this.E) {
            if (i3 < 0 && this.f1808u < 0.0f) {
                return true;
            }
            if (i3 <= 0) {
                return false;
            }
            return l() + this.f1808u > ((float) getHeight());
        } else if (i3 < 0 && this.f1808u < 0.0f) {
            return true;
        } else {
            if (i3 <= 0) {
                return false;
            }
            return (this.f1806s * this.f1809v) + this.f1808u > ((float) getHeight());
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (!isInEditMode()) {
            w1.c cVar = this.f1796i;
            OverScroller overScroller = (OverScroller) cVar.f5431d;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            Object obj = cVar.f5429b;
            if (computeScrollOffset) {
                PDFView pDFView = (PDFView) obj;
                pDFView.r((float) overScroller.getCurrX(), (float) overScroller.getCurrY());
                pDFView.p();
            } else if (cVar.f5428a) {
                cVar.f5428a = false;
                ((PDFView) obj).q();
                ((PDFView) obj).getScrollHandle();
            }
        }
    }

    public int getCurrentPage() {
        return this.f1802o;
    }

    public float getCurrentXOffset() {
        return this.f1807t;
    }

    public float getCurrentYOffset() {
        return this.f1808u;
    }

    public d4.b getDocumentMeta() {
        c cVar = this.G;
        if (cVar == null) {
            return null;
        }
        return this.F.b(cVar);
    }

    public int getDocumentPageCount() {
        return this.f1801n;
    }

    public int[] getFilteredUserPageIndexes() {
        return this.f1800m;
    }

    public int[] getFilteredUserPages() {
        return this.f1799l;
    }

    public int getInvalidPageColor() {
        return this.C;
    }

    public float getMaxZoom() {
        return this.f1793f;
    }

    public float getMidZoom() {
        return this.f1792e;
    }

    public float getMinZoom() {
        return this.f1791d;
    }

    public v2.b getOnPageChangeListener() {
        return null;
    }

    public d getOnPageScrollListener() {
        return null;
    }

    public v2.e getOnRenderListener() {
        return null;
    }

    public v2.f getOnTapListener() {
        return null;
    }

    public float getOptimalPageHeight() {
        return this.f1806s;
    }

    public float getOptimalPageWidth() {
        return this.f1805r;
    }

    public int[] getOriginalUserPages() {
        return this.f1798k;
    }

    public int getPageCount() {
        int[] iArr = this.f1798k;
        return iArr != null ? iArr.length : this.f1801n;
    }

    public float getPositionOffset() {
        int i3;
        float f6;
        float f7;
        if (this.E) {
            f7 = -this.f1808u;
            f6 = l();
            i3 = getHeight();
        } else {
            f7 = -this.f1807t;
            f6 = l();
            i3 = getWidth();
        }
        float f8 = f7 / (f6 - ((float) i3));
        float f9 = 0.0f;
        if (f8 > 0.0f) {
            f9 = 1.0f;
            if (f8 < 1.0f) {
                return f8;
            }
        }
        return f9;
    }

    public e getScrollDir() {
        return this.f1794g;
    }

    public x2.a getScrollHandle() {
        return null;
    }

    public int getSpacingPx() {
        return this.K;
    }

    public List<d4.a> getTableOfContents() {
        c cVar = this.G;
        return cVar == null ? new ArrayList() : this.F.f(cVar);
    }

    public float getZoom() {
        return this.f1809v;
    }

    public final float l() {
        int pageCount = getPageCount();
        return this.E ? ((((float) pageCount) * this.f1806s) + ((float) ((pageCount - 1) * this.K))) * this.f1809v : ((((float) pageCount) * this.f1805r) + ((float) ((pageCount - 1) * this.K))) * this.f1809v;
    }

    public final void m() {
        if (this.M != 1 && getWidth() != 0) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            float f6 = ((float) this.f1803p) / ((float) this.f1804q);
            float floor = (float) Math.floor((double) (width / f6));
            if (floor > height) {
                width = (float) Math.floor((double) (f6 * height));
            } else {
                height = floor;
            }
            this.f1805r = width;
            this.f1806s = height;
        }
    }

    public final float n(int i3) {
        return this.E ? ((((float) i3) * this.f1806s) + ((float) (i3 * this.K))) * this.f1809v : ((((float) i3) * this.f1805r) + ((float) (i3 * this.K))) * this.f1809v;
    }

    public final void o(Canvas canvas, w2.a aVar) {
        float f6;
        RectF rectF = aVar.f5469d;
        Bitmap bitmap = aVar.f5468c;
        if (!bitmap.isRecycled()) {
            boolean z5 = this.E;
            float n5 = n(aVar.f5466a);
            if (z5) {
                f6 = n5;
                n5 = 0.0f;
            } else {
                f6 = 0.0f;
            }
            canvas.translate(n5, f6);
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            float f7 = rectF.left * this.f1805r;
            float f8 = this.f1809v;
            float f9 = f7 * f8;
            float f10 = rectF.top * this.f1806s * f8;
            RectF rectF2 = new RectF((float) ((int) f9), (float) ((int) f10), (float) ((int) (f9 + (rectF.width() * this.f1805r * this.f1809v))), (float) ((int) (f10 + (rectF.height() * this.f1806s * this.f1809v))));
            float f11 = this.f1807t + n5;
            float f12 = this.f1808u + f6;
            if (rectF2.left + f11 < ((float) getWidth()) && f11 + rectF2.right > 0.0f && rectF2.top + f12 < ((float) getHeight()) && f12 + rectF2.bottom > 0.0f) {
                canvas.drawBitmap(bitmap, rect, rectF2, this.B);
            }
            canvas.translate(-n5, -f6);
        }
    }

    public final void onDetachedFromWindow() {
        s();
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        List<w2.a> list;
        ArrayList arrayList;
        if (!isInEditMode()) {
            if (this.I) {
                canvas.setDrawFilter(this.J);
            }
            Drawable background = getBackground();
            if (background == null) {
                canvas.drawColor(-1);
            } else {
                background.draw(canvas);
            }
            if (!this.w && this.M == 3) {
                float f6 = this.f1807t;
                float f7 = this.f1808u;
                canvas.translate(f6, f7);
                i iVar = this.f1795h;
                synchronized (((List) iVar.f5776d)) {
                    list = (List) iVar.f5776d;
                }
                for (w2.a o5 : list) {
                    o(canvas, o5);
                }
                i iVar2 = this.f1795h;
                synchronized (iVar2.f5777e) {
                    arrayList = new ArrayList((PriorityQueue) iVar2.f5774b);
                    arrayList.addAll((PriorityQueue) iVar2.f5775c);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o(canvas, (w2.a) it.next());
                }
                Iterator it2 = this.L.iterator();
                while (it2.hasNext()) {
                    ((Integer) it2.next()).intValue();
                }
                this.L.clear();
                canvas.translate(-f6, -f7);
            }
        }
    }

    public final void onSizeChanged(int i3, int i6, int i7, int i8) {
        float f6;
        float f7;
        if (!isInEditMode() && this.M == 3) {
            this.f1796i.d();
            m();
            if (this.E) {
                f7 = this.f1807t;
                f6 = -n(this.f1802o);
            } else {
                f7 = -n(this.f1802o);
                f6 = this.f1808u;
            }
            r(f7, f6);
            p();
        }
    }

    public final void p() {
        float f6;
        float f7;
        int i3;
        if (getPageCount() != 0) {
            int i6 = this.K;
            float pageCount = (float) (i6 - (i6 / getPageCount()));
            if (this.E) {
                f7 = this.f1808u;
                f6 = this.f1806s + pageCount;
                i3 = getHeight();
            } else {
                f7 = this.f1807t;
                f6 = this.f1805r + pageCount;
                i3 = getWidth();
            }
            int floor = (int) Math.floor((double) ((Math.abs(f7) + (((float) i3) / 2.0f)) / (f6 * this.f1809v)));
            if (floor < 0 || floor > getPageCount() - 1 || floor == getCurrentPage()) {
                q();
            } else {
                t(floor);
            }
        }
    }

    public final void q() {
        h hVar;
        int i3;
        q qVar;
        int i6;
        int i7;
        float f6 = 0.0f;
        if (this.f1805r != 0.0f && this.f1806s != 0.0f && (hVar = this.f1812z) != null) {
            hVar.removeMessages(1);
            i iVar = this.f1795h;
            synchronized (iVar.f5777e) {
                ((PriorityQueue) iVar.f5774b).addAll((PriorityQueue) iVar.f5775c);
                ((PriorityQueue) iVar.f5775c).clear();
            }
            f fVar = this.A;
            PDFView pDFView = fVar.f5203a;
            fVar.f5205c = pDFView.getOptimalPageHeight() * pDFView.f1809v;
            fVar.f5206d = pDFView.getOptimalPageWidth() * pDFView.f1809v;
            fVar.f5216n = (int) (pDFView.getOptimalPageWidth() * 0.3f);
            fVar.f5217o = (int) (pDFView.getOptimalPageHeight() * 0.3f);
            fVar.f5207e = new Pair(Integer.valueOf(com.bumptech.glide.c.g(1.0f / (((1.0f / pDFView.getOptimalPageWidth()) * 256.0f) / pDFView.getZoom()))), Integer.valueOf(com.bumptech.glide.c.g(1.0f / (((1.0f / pDFView.getOptimalPageHeight()) * 256.0f) / pDFView.getZoom()))));
            float currentXOffset = pDFView.getCurrentXOffset();
            if (currentXOffset > 0.0f) {
                currentXOffset = 0.0f;
            }
            fVar.f5208f = -currentXOffset;
            float currentYOffset = pDFView.getCurrentYOffset();
            if (currentYOffset <= 0.0f) {
                f6 = currentYOffset;
            }
            fVar.f5209g = -f6;
            fVar.f5210h = fVar.f5205c / ((float) ((Integer) fVar.f5207e.second).intValue());
            fVar.f5211i = fVar.f5206d / ((float) ((Integer) fVar.f5207e.first).intValue());
            fVar.f5212j = 1.0f / ((float) ((Integer) fVar.f5207e.first).intValue());
            float intValue = 1.0f / ((float) ((Integer) fVar.f5207e.second).intValue());
            fVar.f5213k = intValue;
            fVar.f5214l = 256.0f / fVar.f5212j;
            fVar.f5215m = 256.0f / intValue;
            fVar.f5204b = 1;
            float spacingPx = ((float) pDFView.getSpacingPx()) * pDFView.f1809v;
            fVar.f5218p = spacingPx;
            fVar.f5218p = spacingPx - (spacingPx / ((float) pDFView.getPageCount()));
            if (pDFView.E) {
                qVar = fVar.b(pDFView.getCurrentYOffset(), false);
                q b6 = fVar.b((pDFView.getCurrentYOffset() - ((float) pDFView.getHeight())) + 1.0f, true);
                if (qVar.f4644a == b6.f4644a) {
                    i7 = (b6.f4645b - qVar.f4645b) + 1;
                } else {
                    int intValue2 = (((Integer) fVar.f5207e.second).intValue() - qVar.f4645b) + 0;
                    for (int i8 = qVar.f4644a + 1; i8 < b6.f4644a; i8++) {
                        intValue2 += ((Integer) fVar.f5207e.second).intValue();
                    }
                    i7 = b6.f4645b + 1 + intValue2;
                }
                i3 = 0;
                for (int i9 = 0; i9 < i7 && i3 < 120; i9++) {
                    i3 += fVar.d(i9, 120 - i3, false);
                }
            } else {
                qVar = fVar.b(pDFView.getCurrentXOffset(), false);
                q b7 = fVar.b((pDFView.getCurrentXOffset() - ((float) pDFView.getWidth())) + 1.0f, true);
                if (qVar.f4644a == b7.f4644a) {
                    i6 = (b7.f4646c - qVar.f4646c) + 1;
                } else {
                    int intValue3 = (((Integer) fVar.f5207e.first).intValue() - qVar.f4646c) + 0;
                    for (int i10 = qVar.f4644a + 1; i10 < b7.f4644a; i10++) {
                        intValue3 += ((Integer) fVar.f5207e.first).intValue();
                    }
                    i6 = b7.f4646c + 1 + intValue3;
                }
                int i11 = 0;
                for (int i12 = 0; i12 < i6 && i3 < 120; i12++) {
                    i11 = i3 + fVar.d(i12, 120 - i3, false);
                }
            }
            int a6 = fVar.a(qVar.f4644a - 1);
            if (a6 >= 0) {
                fVar.e(qVar.f4644a - 1, a6);
            }
            int a7 = fVar.a(qVar.f4644a + 1);
            if (a7 >= 0) {
                fVar.e(qVar.f4644a + 1, a7);
            }
            if (pDFView.getScrollDir().equals(e.f5201f)) {
                if (i3 < 120) {
                    fVar.d(0, i3, true);
                }
            } else if (i3 < 120) {
                fVar.d(0, i3, false);
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r10 > r0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        if (r9 > r0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        r8.f1794g = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        r8.f1794g = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(float r9, float r10) {
        /*
            r8 = this;
            boolean r0 = r8.E
            t2.e r1 = t2.e.f5200e
            t2.e r2 = t2.e.f5199d
            t2.e r3 = t2.e.f5201f
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r0 == 0) goto L_0x0075
            float r0 = r8.f1805r
            float r6 = r8.f1809v
            float r0 = r0 * r6
            int r6 = r8.getWidth()
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0024
            int r9 = r8.getWidth()
            int r9 = r9 / 2
            float r9 = (float) r9
            float r0 = r0 / r4
            goto L_0x003a
        L_0x0024:
            int r6 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x002a
            r9 = r5
            goto L_0x003b
        L_0x002a:
            float r6 = r9 + r0
            int r7 = r8.getWidth()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x003b
            int r9 = r8.getWidth()
            float r9 = (float) r9
        L_0x003a:
            float r9 = r9 - r0
        L_0x003b:
            float r0 = r8.l()
            int r6 = r8.getHeight()
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0050
            int r10 = r8.getHeight()
            float r10 = (float) r10
            float r10 = r10 - r0
            float r10 = r10 / r4
            goto L_0x0068
        L_0x0050:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0056
            r10 = r5
            goto L_0x0068
        L_0x0056:
            float r4 = r10 + r0
            int r5 = r8.getHeight()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0068
            float r10 = -r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r10 = r10 + r0
        L_0x0068:
            float r0 = r8.f1808u
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x006f
            goto L_0x00d6
        L_0x006f:
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
            goto L_0x00dd
        L_0x0075:
            float r0 = r8.f1806s
            float r6 = r8.f1809v
            float r0 = r0 * r6
            int r6 = r8.getHeight()
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x008c
            int r10 = r8.getHeight()
            int r10 = r10 / 2
            float r10 = (float) r10
            float r0 = r0 / r4
            goto L_0x00a2
        L_0x008c:
            int r6 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0092
            r10 = r5
            goto L_0x00a3
        L_0x0092:
            float r6 = r10 + r0
            int r7 = r8.getHeight()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00a3
            int r10 = r8.getHeight()
            float r10 = (float) r10
        L_0x00a2:
            float r10 = r10 - r0
        L_0x00a3:
            float r0 = r8.l()
            int r6 = r8.getWidth()
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b8
            int r9 = r8.getWidth()
            float r9 = (float) r9
            float r9 = r9 - r0
            float r9 = r9 / r4
            goto L_0x00d0
        L_0x00b8:
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00be
            r9 = r5
            goto L_0x00d0
        L_0x00be:
            float r4 = r9 + r0
            int r5 = r8.getWidth()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            float r9 = -r0
            int r0 = r8.getWidth()
            float r0 = (float) r0
            float r9 = r9 + r0
        L_0x00d0:
            float r0 = r8.f1807t
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d9
        L_0x00d6:
            r8.f1794g = r3
            goto L_0x00e2
        L_0x00d9:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
        L_0x00dd:
            r8.f1794g = r1
            goto L_0x00e2
        L_0x00e0:
            r8.f1794g = r2
        L_0x00e2:
            r8.f1807t = r9
            r8.f1808u = r10
            r8.getPositionOffset()
            r8.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.r(float, float):void");
    }

    public final void s() {
        c cVar;
        this.f1796i.d();
        h hVar = this.f1812z;
        if (hVar != null) {
            hVar.f5236h = false;
            hVar.removeMessages(1);
        }
        b bVar = this.f1810x;
        if (bVar != null) {
            bVar.cancel(true);
        }
        i iVar = this.f1795h;
        synchronized (iVar.f5777e) {
            Iterator it = ((PriorityQueue) iVar.f5774b).iterator();
            while (it.hasNext()) {
                ((w2.a) it.next()).f5468c.recycle();
            }
            ((PriorityQueue) iVar.f5774b).clear();
            Iterator it2 = ((PriorityQueue) iVar.f5775c).iterator();
            while (it2.hasNext()) {
                ((w2.a) it2.next()).f5468c.recycle();
            }
            ((PriorityQueue) iVar.f5775c).clear();
        }
        synchronized (((List) iVar.f5776d)) {
            for (w2.a aVar : (List) iVar.f5776d) {
                aVar.f5468c.recycle();
            }
            ((List) iVar.f5776d).clear();
        }
        PdfiumCore pdfiumCore = this.F;
        if (!(pdfiumCore == null || (cVar = this.G) == null)) {
            pdfiumCore.a(cVar);
        }
        this.f1812z = null;
        this.f1798k = null;
        this.f1799l = null;
        this.f1800m = null;
        this.G = null;
        this.f1808u = 0.0f;
        this.f1807t = 0.0f;
        this.f1809v = 1.0f;
        this.w = true;
        this.M = 1;
    }

    public void setMaxZoom(float f6) {
        this.f1793f = f6;
    }

    public void setMidZoom(float f6) {
        this.f1792e = f6;
    }

    public void setMinZoom(float f6) {
        this.f1791d = f6;
    }

    public void setPositionOffset(float f6) {
        if (this.E) {
            r(this.f1807t, ((-l()) + ((float) getHeight())) * f6);
        } else {
            r(((-l()) + ((float) getWidth())) * f6, this.f1808u);
        }
        p();
    }

    public void setSwipeVertical(boolean z5) {
        this.E = z5;
    }

    public final void t(int i3) {
        if (!this.w) {
            if (i3 <= 0) {
                i3 = 0;
            } else {
                int[] iArr = this.f1798k;
                if (iArr == null) {
                    int i6 = this.f1801n;
                    if (i3 >= i6) {
                        i3 = i6 - 1;
                    }
                } else if (i3 >= iArr.length) {
                    i3 = iArr.length - 1;
                }
            }
            this.f1802o = i3;
            int[] iArr2 = this.f1800m;
            if (iArr2 != null && i3 >= 0 && i3 < iArr2.length) {
                int i7 = iArr2[i3];
            }
            q();
        }
    }

    public final void u(float f6, float f7, float f8) {
        this.f1796i.c(f6, f7, this.f1809v, f8);
    }
}
