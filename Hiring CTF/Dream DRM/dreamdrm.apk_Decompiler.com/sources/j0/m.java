package j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class m {

    /* renamed from: m  reason: collision with root package name */
    public static final SparseIntArray f3759m;

    /* renamed from: a  reason: collision with root package name */
    public float f3760a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f3761b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f3762c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f3763d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f3764e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f3765f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f3766g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f3767h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f3768i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f3769j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3770k = false;

    /* renamed from: l  reason: collision with root package name */
    public float f3771l = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3759m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f3784h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f3759m.get(index)) {
                case 1:
                    this.f3760a = obtainStyledAttributes.getFloat(index, this.f3760a);
                    break;
                case 2:
                    this.f3761b = obtainStyledAttributes.getFloat(index, this.f3761b);
                    break;
                case 3:
                    this.f3762c = obtainStyledAttributes.getFloat(index, this.f3762c);
                    break;
                case 4:
                    this.f3763d = obtainStyledAttributes.getFloat(index, this.f3763d);
                    break;
                case 5:
                    this.f3764e = obtainStyledAttributes.getFloat(index, this.f3764e);
                    break;
                case 6:
                    this.f3765f = obtainStyledAttributes.getDimension(index, this.f3765f);
                    break;
                case 7:
                    this.f3766g = obtainStyledAttributes.getDimension(index, this.f3766g);
                    break;
                case 8:
                    this.f3767h = obtainStyledAttributes.getDimension(index, this.f3767h);
                    break;
                case 9:
                    this.f3768i = obtainStyledAttributes.getDimension(index, this.f3768i);
                    break;
                case 10:
                    this.f3769j = obtainStyledAttributes.getDimension(index, this.f3769j);
                    break;
                case 11:
                    this.f3770k = true;
                    this.f3771l = obtainStyledAttributes.getDimension(index, this.f3771l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
