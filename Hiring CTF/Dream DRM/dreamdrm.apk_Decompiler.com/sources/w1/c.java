package w1;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;
import java.io.File;
import t2.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5428a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5429b;

    /* renamed from: c  reason: collision with root package name */
    public Cloneable f5430c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5431d;

    public c(PDFView pDFView) {
        this.f5428a = false;
        this.f5429b = pDFView;
        this.f5431d = new OverScroller(pDFView.getContext());
    }

    public final void a() {
        f.b((f) this.f5431d, this, false);
    }

    public final File b() {
        File file;
        synchronized (((f) this.f5431d)) {
            Object obj = this.f5429b;
            if (((d) obj).f5437f == this) {
                if (!((d) obj).f5436e) {
                    ((boolean[]) this.f5430c)[0] = true;
                }
                file = ((d) obj).f5435d[0];
                ((f) this.f5431d).f5445d.mkdirs();
            } else {
                throw new IllegalStateException();
            }
        }
        return file;
    }

    public final void c(float f6, float f7, float f8, float f9) {
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f8, f9});
        this.f5430c = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        a aVar = new a(this, f6, f7);
        ((ValueAnimator) this.f5430c).addUpdateListener(aVar);
        ((ValueAnimator) this.f5430c).addListener(aVar);
        ((ValueAnimator) this.f5430c).setDuration(400);
        ((ValueAnimator) this.f5430c).start();
    }

    public final void d() {
        ValueAnimator valueAnimator = (ValueAnimator) this.f5430c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5430c = null;
        }
        this.f5428a = false;
        ((OverScroller) this.f5431d).forceFinished(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Cloneable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Cloneable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Cloneable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(w1.f r1, w1.d r2) {
        /*
            r0 = this;
            r0.f5431d = r1
            r0.<init>()
            r0.f5429b = r2
            boolean r2 = r2.f5436e
            if (r2 == 0) goto L_0x000d
            r1 = 0
            goto L_0x0011
        L_0x000d:
            int r1 = r1.f5451j
            boolean[] r1 = new boolean[r1]
        L_0x0011:
            r0.f5430c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.c.<init>(w1.f, w1.d):void");
    }
}
