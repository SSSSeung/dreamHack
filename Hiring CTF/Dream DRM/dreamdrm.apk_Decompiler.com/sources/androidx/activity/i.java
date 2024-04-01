package androidx.activity;

import a2.c;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.m;
import b1.a;
import b1.g;
import b1.h;
import com.bumptech.glide.n;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e2.f;
import f.b;
import f1.d;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public final class i implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f292d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f293e;

    public /* synthetic */ i(int i3, Object obj) {
        this.f292d = i3;
        this.f293e = obj;
    }

    public final void run() {
        m mVar;
        boolean z5 = true;
        switch (this.f292d) {
            case 0:
                try {
                    i.super.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!TextUtils.equals(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!TextUtils.equals(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
            case 1:
                b bVar = (b) this.f293e;
                bVar.a(true);
                bVar.invalidateSelf();
                return;
            case 2:
                b2 b2Var = (b2) this.f293e;
                b2Var.f525o = null;
                b2Var.drawableStateChanged();
                return;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) this.f293e).f473d;
                if (actionMenuView != null && (mVar = actionMenuView.w) != null) {
                    mVar.l();
                    return;
                }
                return;
            case 4:
                g gVar = (g) this.f293e;
                if (gVar.f1510r) {
                    if (gVar.f1508p) {
                        gVar.f1508p = false;
                        a aVar = gVar.f1496d;
                        aVar.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1490e = currentAnimationTimeMillis;
                        aVar.f1492g = -1;
                        aVar.f1491f = currentAnimationTimeMillis;
                        aVar.f1493h = 0.5f;
                    }
                    a aVar2 = gVar.f1496d;
                    if (aVar2.f1492g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar2.f1492g + ((long) aVar2.f1494i)) {
                        z5 = false;
                    }
                    if (z5 || !gVar.f()) {
                        gVar.f1510r = false;
                        return;
                    }
                    if (gVar.f1509q) {
                        gVar.f1509q = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        gVar.f1498f.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f1491f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a6 = aVar2.a(currentAnimationTimeMillis2);
                        aVar2.f1491f = currentAnimationTimeMillis2;
                        h.b(gVar.f1512t, (int) (((float) (currentAnimationTimeMillis2 - aVar2.f1491f)) * ((a6 * 4.0f) + (-4.0f * a6 * a6)) * aVar2.f1489d));
                        View view = gVar.f1498f;
                        WeakHashMap weakHashMap = u0.f5622a;
                        d0.m(view, this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 5:
                ((d) this.f293e).p(0);
                return;
            case 7:
                n nVar = (n) this.f293e;
                nVar.f1783f.b(nVar);
                return;
            case 8:
                c cVar = (c) this.f293e;
                cVar.getClass();
                while (true) {
                    try {
                        cVar.b((a2.b) cVar.f29c.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 9:
                t2.d dVar = (t2.d) this.f293e;
                dVar.getClass();
                PDFView pDFView = dVar.f5198b;
                f fVar = dVar.f5197a;
                int i3 = PDFView.N;
                if (pDFView.w) {
                    int[] iArr = pDFView.f1798k;
                    int i6 = iArr != null ? iArr[0] : 0;
                    pDFView.w = false;
                    t2.b bVar2 = new t2.b(fVar, pDFView, pDFView.F, i6);
                    pDFView.f1810x = bVar2;
                    bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    return;
                }
                throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
            default:
                c3.d dVar2 = (c3.d) this.f293e;
                dVar2.f1632c = false;
                d dVar3 = ((BottomSheetBehavior) dVar2.f1634e).M;
                if (dVar3 == null || !dVar3.g()) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) dVar2.f1634e;
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.E(dVar2.f1631b);
                        return;
                    }
                    return;
                }
                dVar2.a(dVar2.f1631b);
                return;
        }
    }
}
