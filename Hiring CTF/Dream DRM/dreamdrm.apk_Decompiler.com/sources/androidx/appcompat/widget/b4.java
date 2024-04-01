package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import e.a;

public final class b4 extends a {

    /* renamed from: b  reason: collision with root package name */
    public int f528b = 0;

    public b4() {
        this.f2275a = 8388627;
    }

    public b4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b4(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public b4(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams) marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public b4(b4 b4Var) {
        super((a) b4Var);
        this.f528b = b4Var.f528b;
    }

    public b4(a aVar) {
        super(aVar);
    }
}
