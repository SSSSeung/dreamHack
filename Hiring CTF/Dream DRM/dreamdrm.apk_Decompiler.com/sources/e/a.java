package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public int f2275a = 8388627;

    public a() {
        super(-2, -2);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f2114b);
        this.f2275a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public a(a aVar) {
        super(aVar);
        this.f2275a = aVar.f2275a;
    }
}
