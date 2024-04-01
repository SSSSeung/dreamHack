package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import b1.v;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f3750e;

    /* renamed from: a  reason: collision with root package name */
    public int f3751a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f3752b = -1;

    /* renamed from: c  reason: collision with root package name */
    public float f3753c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public float f3754d = Float.NaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3750e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3781e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f3750e.get(index)) {
                case 1:
                    this.f3754d = obtainStyledAttributes.getFloat(index, this.f3754d);
                    break;
                case 2:
                    this.f3752b = obtainStyledAttributes.getInt(index, this.f3752b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = v.f1537d[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3751a = n.f(obtainStyledAttributes, index, this.f3751a);
                    break;
                case 6:
                    this.f3753c = obtainStyledAttributes.getFloat(index, this.f3753c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
