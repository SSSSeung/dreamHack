package t2;

import android.os.AsyncTask;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;
import d4.c;
import e2.f;
import java.io.File;

public final class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5181a = false;

    /* renamed from: b  reason: collision with root package name */
    public final PDFView f5182b;

    /* renamed from: c  reason: collision with root package name */
    public final PdfiumCore f5183c;

    /* renamed from: d  reason: collision with root package name */
    public c f5184d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5185e;

    /* renamed from: f  reason: collision with root package name */
    public final f f5186f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5187g;

    /* renamed from: h  reason: collision with root package name */
    public int f5188h;

    /* renamed from: i  reason: collision with root package name */
    public int f5189i;

    public b(f fVar, PDFView pDFView, PdfiumCore pdfiumCore, int i3) {
        this.f5186f = fVar;
        this.f5187g = i3;
        this.f5182b = pDFView;
        this.f5185e = null;
        this.f5183c = pdfiumCore;
        pDFView.getContext();
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        int i3 = this.f5187g;
        PdfiumCore pdfiumCore = this.f5183c;
        try {
            f fVar = this.f5186f;
            c g6 = pdfiumCore.g(ParcelFileDescriptor.open((File) fVar.f2505e, 268435456), this.f5185e);
            this.f5184d = g6;
            pdfiumCore.h(g6, i3);
            this.f5188h = pdfiumCore.e(this.f5184d, i3);
            this.f5189i = pdfiumCore.d(this.f5184d, i3);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public final void onCancelled() {
        this.f5181a = true;
    }

    public final void onPostExecute(Object obj) {
        Throwable th = (Throwable) obj;
        PDFView pDFView = this.f5182b;
        if (th != null) {
            pDFView.M = 4;
            pDFView.s();
            pDFView.invalidate();
            Log.e("PDFView", "load pdf error", th);
        } else if (!this.f5181a) {
            c cVar = this.f5184d;
            int i3 = this.f5188h;
            int i6 = this.f5189i;
            pDFView.M = 2;
            PdfiumCore pdfiumCore = pDFView.F;
            pDFView.f1801n = pdfiumCore.c(cVar);
            pDFView.G = cVar;
            pDFView.f1803p = i3;
            pDFView.f1804q = i6;
            pDFView.m();
            pDFView.A = new f(pDFView);
            HandlerThread handlerThread = pDFView.f1811y;
            if (!handlerThread.isAlive()) {
                handlerThread.start();
            }
            h hVar = new h(handlerThread.getLooper(), pDFView, pdfiumCore, cVar);
            pDFView.f1812z = hVar;
            hVar.f5236h = true;
            int i7 = pDFView.D;
            float f6 = -pDFView.n(i7);
            if (pDFView.E) {
                pDFView.r(pDFView.f1807t, f6);
            } else {
                pDFView.r(f6, pDFView.f1808u);
            }
            pDFView.t(i7);
        }
    }
}
