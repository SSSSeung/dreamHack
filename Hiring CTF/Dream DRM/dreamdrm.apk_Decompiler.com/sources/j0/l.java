package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public int f3755a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3756b = 0;

    /* renamed from: c  reason: collision with root package name */
    public float f3757c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f3758d = Float.NaN;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3782f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 1) {
                this.f3757c = obtainStyledAttributes.getFloat(index, this.f3757c);
            } else if (index == 0) {
                int i6 = obtainStyledAttributes.getInt(index, this.f3755a);
                this.f3755a = i6;
                this.f3755a = n.f3772d[i6];
            } else if (index == 4) {
                this.f3756b = obtainStyledAttributes.getInt(index, this.f3756b);
            } else if (index == 3) {
                this.f3758d = obtainStyledAttributes.getFloat(index, this.f3758d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
