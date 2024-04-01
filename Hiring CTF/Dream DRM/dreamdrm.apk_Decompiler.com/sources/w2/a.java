package w2;

import android.graphics.Bitmap;
import android.graphics.RectF;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f5466a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5467b;

    /* renamed from: c  reason: collision with root package name */
    public final Bitmap f5468c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f5469d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5470e;

    /* renamed from: f  reason: collision with root package name */
    public int f5471f;

    public a(int i3, int i6, Bitmap bitmap, RectF rectF, boolean z5, int i7) {
        this.f5466a = i3;
        this.f5467b = i6;
        this.f5468c = bitmap;
        this.f5469d = rectF;
        this.f5470e = z5;
        this.f5471f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (aVar.f5467b != this.f5467b || aVar.f5466a != this.f5466a) {
            return false;
        }
        RectF rectF = aVar.f5469d;
        float f6 = rectF.left;
        RectF rectF2 = this.f5469d;
        return f6 == rectF2.left && rectF.right == rectF2.right && rectF.top == rectF2.top && rectF.bottom == rectF2.bottom;
    }
}
