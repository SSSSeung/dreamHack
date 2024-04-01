package t2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

public final class c implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: d  reason: collision with root package name */
    public final PDFView f5190d;

    /* renamed from: e  reason: collision with root package name */
    public final w1.c f5191e;

    /* renamed from: f  reason: collision with root package name */
    public final GestureDetector f5192f;

    /* renamed from: g  reason: collision with root package name */
    public final ScaleGestureDetector f5193g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5194h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5195i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5196j = false;

    public c(PDFView pDFView, w1.c cVar) {
        this.f5190d = pDFView;
        this.f5191e = cVar;
        this.f5194h = false;
        pDFView.getClass();
        this.f5192f = new GestureDetector(pDFView.getContext(), this);
        this.f5193g = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float x5;
        float y5;
        float maxZoom;
        PDFView pDFView = this.f5190d;
        if (pDFView.getZoom() < pDFView.getMidZoom()) {
            x5 = motionEvent.getX();
            y5 = motionEvent.getY();
            maxZoom = pDFView.getMidZoom();
        } else if (pDFView.getZoom() < pDFView.getMaxZoom()) {
            x5 = motionEvent.getX();
            y5 = motionEvent.getY();
            maxZoom = pDFView.getMaxZoom();
        } else {
            float f6 = pDFView.f1791d;
            float f7 = pDFView.f1809v;
            pDFView.f1796i.c((float) (pDFView.getWidth() / 2), (float) (pDFView.getHeight() / 2), f7, f6);
            return true;
        }
        pDFView.u(x5, y5, maxZoom);
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        w1.c cVar = this.f5191e;
        cVar.f5428a = false;
        ((OverScroller) cVar.f5431d).forceFinished(true);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        float f8;
        float f9;
        PDFView pDFView = this.f5190d;
        int currentXOffset = (int) pDFView.getCurrentXOffset();
        int currentYOffset = (int) pDFView.getCurrentYOffset();
        if (pDFView.E) {
            f8 = -((pDFView.getOptimalPageWidth() * pDFView.f1809v) - ((float) pDFView.getWidth()));
            f9 = pDFView.l();
        } else {
            f8 = -(pDFView.l() - ((float) pDFView.getWidth()));
            f9 = pDFView.getOptimalPageHeight() * pDFView.f1809v;
        }
        int i3 = (int) (-(f9 - ((float) pDFView.getHeight())));
        w1.c cVar = this.f5191e;
        cVar.d();
        cVar.f5428a = true;
        ((OverScroller) cVar.f5431d).fling(currentXOffset, currentYOffset, (int) f6, (int) f7, (int) f8, 0, i3, 0);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r2 > 10.0f) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScale(android.view.ScaleGestureDetector r7) {
        /*
            r6 = this;
            float r0 = r7.getScaleFactor()
            com.github.barteksc.pdfviewer.PDFView r1 = r6.f5190d
            float r2 = r1.getZoom()
            float r2 = r2 * r0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x001e
        L_0x0018:
            float r0 = r1.getZoom()
            float r0 = r3 / r0
        L_0x001e:
            android.graphics.PointF r2 = new android.graphics.PointF
            float r3 = r7.getFocusX()
            float r7 = r7.getFocusY()
            r2.<init>(r3, r7)
            float r7 = r1.f1809v
            float r0 = r0 * r7
            float r7 = r0 / r7
            r1.f1809v = r0
            float r0 = r1.f1807t
            float r0 = r0 * r7
            float r3 = r1.f1808u
            float r3 = r3 * r7
            float r4 = r2.x
            float r5 = r4 * r7
            float r4 = r4 - r5
            float r4 = r4 + r0
            float r0 = r2.y
            float r7 = r7 * r0
            float r0 = r0 - r7
            float r0 = r0 + r3
            r1.r(r4, r0)
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c.onScale(android.view.ScaleGestureDetector):boolean");
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f5196j = true;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        PDFView pDFView = this.f5190d;
        pDFView.q();
        pDFView.getScrollHandle();
        this.f5196j = false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        this.f5195i = true;
        PDFView pDFView = this.f5190d;
        if ((pDFView.f1809v != pDFView.f1791d) || this.f5194h) {
            pDFView.r(pDFView.f1807t + (-f6), pDFView.f1808u + (-f7));
        }
        if (!this.f5196j) {
            pDFView.p();
        }
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        PDFView pDFView = this.f5190d;
        pDFView.getOnTapListener();
        pDFView.getScrollHandle();
        pDFView.performClick();
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5 = this.f5192f.onTouchEvent(motionEvent) || this.f5193g.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f5195i) {
            this.f5195i = false;
            PDFView pDFView = this.f5190d;
            pDFView.q();
            pDFView.getScrollHandle();
        }
        return z5;
    }
}
