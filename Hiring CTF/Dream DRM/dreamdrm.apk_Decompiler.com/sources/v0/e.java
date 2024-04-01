package v0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import w0.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f5368a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f5369b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5370c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5371d;

    public e(PrecomputedText.Params params) {
        this.f5368a = params.getTextPaint();
        this.f5369b = params.getTextDirection();
        this.f5370c = params.getBreakStrategy();
        this.f5371d = params.getHyphenationFrequency();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof v0.e
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            v0.e r7 = (v0.e) r7
            int r1 = r7.f5370c
            int r3 = r6.f5370c
            if (r3 == r1) goto L_0x0015
        L_0x0012:
            r1 = r2
            goto L_0x009b
        L_0x0015:
            int r1 = r6.f5371d
            int r3 = r7.f5371d
            if (r1 == r3) goto L_0x001c
            goto L_0x0012
        L_0x001c:
            android.text.TextPaint r1 = r6.f5368a
            float r3 = r1.getTextSize()
            android.text.TextPaint r4 = r7.f5368a
            float r5 = r4.getTextSize()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            goto L_0x0012
        L_0x002d:
            float r3 = r1.getTextScaleX()
            float r5 = r4.getTextScaleX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x003a
            goto L_0x0012
        L_0x003a:
            float r3 = r1.getTextSkewX()
            float r5 = r4.getTextSkewX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0047
            goto L_0x0012
        L_0x0047:
            float r3 = r1.getLetterSpacing()
            float r5 = r4.getLetterSpacing()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0054
            goto L_0x0012
        L_0x0054:
            java.lang.String r3 = r1.getFontFeatureSettings()
            java.lang.String r5 = r4.getFontFeatureSettings()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 != 0) goto L_0x0063
            goto L_0x0012
        L_0x0063:
            int r3 = r1.getFlags()
            int r5 = r4.getFlags()
            if (r3 == r5) goto L_0x006e
            goto L_0x0012
        L_0x006e:
            android.os.LocaleList r3 = r1.getTextLocales()
            android.os.LocaleList r5 = r4.getTextLocales()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x007d
            goto L_0x0012
        L_0x007d:
            android.graphics.Typeface r3 = r1.getTypeface()
            if (r3 != 0) goto L_0x008a
            android.graphics.Typeface r1 = r4.getTypeface()
            if (r1 == 0) goto L_0x009a
            goto L_0x0012
        L_0x008a:
            android.graphics.Typeface r1 = r1.getTypeface()
            android.graphics.Typeface r3 = r4.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x009a
            goto L_0x0012
        L_0x009a:
            r1 = r0
        L_0x009b:
            if (r1 != 0) goto L_0x009e
            return r2
        L_0x009e:
            android.text.TextDirectionHeuristic r1 = r6.f5369b
            android.text.TextDirectionHeuristic r7 = r7.f5369b
            if (r1 == r7) goto L_0x00a5
            return r2
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextPaint textPaint = this.f5368a;
        return b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f5369b, Integer.valueOf(this.f5370c), Integer.valueOf(this.f5371d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f5368a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f5369b);
        sb.append(", breakStrategy=" + this.f5370c);
        sb.append(", hyphenationFrequency=" + this.f5371d);
        sb.append("}");
        return sb.toString();
    }

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.l();
            d.c(textPaint).setBreakStrategy(i3).setHyphenationFrequency(i6).setTextDirection(textDirectionHeuristic).build();
        }
        this.f5368a = textPaint;
        this.f5369b = textDirectionHeuristic;
        this.f5370c = i3;
        this.f5371d = i6;
    }
}
