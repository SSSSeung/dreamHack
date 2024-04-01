package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import g.h;
import g1.a;
import java.nio.ByteBuffer;

public final class z extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1059a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final q f1060b;

    /* renamed from: c  reason: collision with root package name */
    public float f1061c = 1.0f;

    public z(q qVar) {
        if (qVar != null) {
            this.f1060b = qVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    /* renamed from: a */
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i6, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1059a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        q qVar = this.f1060b;
        a c6 = qVar.c();
        int a6 = c6.a(14);
        short s5 = 0;
        this.f1061c = abs / ((float) (a6 != 0 ? ((ByteBuffer) c6.f2843d).getShort(a6 + c6.f2840a) : 0));
        a c7 = qVar.c();
        int a7 = c7.a(14);
        if (a7 != 0) {
            ((ByteBuffer) c7.f2843d).getShort(a7 + c7.f2840a);
        }
        a c8 = qVar.c();
        int a8 = c8.a(12);
        if (a8 != 0) {
            s5 = ((ByteBuffer) c8.f2843d).getShort(a8 + c8.f2840a);
        }
        short s6 = (short) ((int) (((float) s5) * this.f1061c));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s6;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i6, float f6, int i7, int i8, int i9, Paint paint) {
        Paint paint2 = paint;
        l.a().getClass();
        q qVar = this.f1060b;
        h hVar = qVar.f1030b;
        Typeface typeface = paint.getTypeface();
        paint2.setTypeface((Typeface) hVar.f2728d);
        int i10 = qVar.f1029a * 2;
        Canvas canvas2 = canvas;
        canvas2.drawText((char[]) hVar.f2726b, i10, 2, f6, (float) i8, paint);
        paint2.setTypeface(typeface);
    }
}
