package t2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.github.barteksc.pdfviewer.PDFView;
import w1.c;

public final class a implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f5178a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5179b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f5180c;

    public a(c cVar, float f6, float f7) {
        this.f5180c = cVar;
        this.f5178a = f6;
        this.f5179b = f7;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        c cVar = this.f5180c;
        ((PDFView) cVar.f5429b).q();
        ((PDFView) cVar.f5429b).getScrollHandle();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PDFView pDFView = (PDFView) this.f5180c.f5429b;
        PointF pointF = new PointF(this.f5178a, this.f5179b);
        float f6 = floatValue / pDFView.f1809v;
        pDFView.f1809v = floatValue;
        float f7 = pDFView.f1808u * f6;
        float f8 = pointF.x;
        float f9 = (f8 - (f8 * f6)) + (pDFView.f1807t * f6);
        float f10 = pointF.y;
        pDFView.r(f9, (f10 - (f6 * f10)) + f7);
    }
}
