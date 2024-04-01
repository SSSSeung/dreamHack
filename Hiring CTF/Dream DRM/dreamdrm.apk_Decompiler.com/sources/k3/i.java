package k3;

import android.text.TextPaint;
import g3.b;
import java.lang.ref.WeakReference;
import m3.d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f3960a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final b f3961b = new b(1, this);

    /* renamed from: c  reason: collision with root package name */
    public float f3962c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3963d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f3964e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f3965f;

    public i(h hVar) {
        this.f3964e = new WeakReference(hVar);
    }

    public final float a(String str) {
        if (!this.f3963d) {
            return this.f3962c;
        }
        TextPaint textPaint = this.f3960a;
        this.f3962c = str == null ? 0.0f : textPaint.measureText(str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f3963d = false;
        return this.f3962c;
    }
}
