package t2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.j;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;
import d4.c;
import w2.a;

public final class h extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final PdfiumCore f5229a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5230b;

    /* renamed from: c  reason: collision with root package name */
    public final PDFView f5231c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f5232d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f5233e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f5234f = new Matrix();

    /* renamed from: g  reason: collision with root package name */
    public final SparseBooleanArray f5235g = new SparseBooleanArray();

    /* renamed from: h  reason: collision with root package name */
    public boolean f5236h = false;

    public h(Looper looper, PDFView pDFView, PdfiumCore pdfiumCore, c cVar) {
        super(looper);
        this.f5231c = pDFView;
        this.f5229a = pdfiumCore;
        this.f5230b = cVar;
    }

    public final void a(int i3, int i6, float f6, float f7, RectF rectF, boolean z5, int i7, boolean z6) {
        sendMessage(obtainMessage(1, new g(f6, f7, rectF, i3, i6, z5, i7, z6)));
    }

    public final a b(g gVar) {
        SparseBooleanArray sparseBooleanArray = this.f5235g;
        int indexOfKey = sparseBooleanArray.indexOfKey(gVar.f5223d);
        int i3 = gVar.f5223d;
        if (indexOfKey < 0) {
            try {
                this.f5229a.h(this.f5230b, i3);
                sparseBooleanArray.put(i3, true);
            } catch (Exception e6) {
                sparseBooleanArray.put(i3, false);
                throw new u2.a(i3, e6);
            }
        }
        int round = Math.round(gVar.f5220a);
        int round2 = Math.round(gVar.f5221b);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(round, round2, gVar.f5227h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Matrix matrix = this.f5234f;
            matrix.reset();
            RectF rectF = gVar.f5222c;
            float f6 = (float) round;
            float f7 = (float) round2;
            matrix.postTranslate((-rectF.left) * f6, (-rectF.top) * f7);
            matrix.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
            RectF rectF2 = this.f5232d;
            rectF2.set(0.0f, 0.0f, f6, f7);
            matrix.mapRect(rectF2);
            Rect rect = this.f5233e;
            rectF2.round(rect);
            if (sparseBooleanArray.get(i3)) {
                this.f5229a.j(this.f5230b, createBitmap, gVar.f5223d, rect.left, rect.top, rect.width(), rect.height(), gVar.f5228i);
            } else {
                createBitmap.eraseColor(this.f5231c.getInvalidPageColor());
            }
            return new a(gVar.f5224e, gVar.f5223d, createBitmap, gVar.f5222c, gVar.f5225f, gVar.f5226g);
        } catch (IllegalArgumentException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public final void handleMessage(Message message) {
        PDFView pDFView = this.f5231c;
        try {
            a b6 = b((g) message.obj);
            if (b6 == null) {
                return;
            }
            if (this.f5236h) {
                pDFView.post(new j((Object) this, 5, (Object) b6));
            } else {
                b6.f5468c.recycle();
            }
        } catch (u2.a e6) {
            pDFView.post(new j((Object) this, 6, (Object) e6));
        }
    }
}
