package k3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3948a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f3949b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3950c;

    /* renamed from: d  reason: collision with root package name */
    public int f3951d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f3952e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f3953f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f3954g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f3955h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f3956i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3957j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3958k;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f3959l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f3948a = charSequence;
        this.f3949b = textPaint;
        this.f3950c = i3;
        this.f3951d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f3948a == null) {
            this.f3948a = "";
        }
        int max = Math.max(0, this.f3950c);
        CharSequence charSequence = this.f3948a;
        int i3 = this.f3953f;
        TextPaint textPaint = this.f3949b;
        if (i3 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.f3959l);
        }
        int min = Math.min(charSequence.length(), this.f3951d);
        this.f3951d = min;
        if (this.f3958k && this.f3953f == 1) {
            this.f3952e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f3952e);
        obtain.setIncludePad(this.f3957j);
        obtain.setTextDirection(this.f3958k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f3959l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f3953f);
        float f6 = this.f3954g;
        if (!(f6 == 0.0f && this.f3955h == 1.0f)) {
            obtain.setLineSpacing(f6, this.f3955h);
        }
        if (this.f3953f > 1) {
            obtain.setHyphenationFrequency(this.f3956i);
        }
        return obtain.build();
    }
}
