package p1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class p0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public f1 f4640a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f4641b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public boolean f4642c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4643d = false;

    public p0(int i3, int i6) {
        super(i3, i6);
    }

    public final int a() {
        return this.f4640a.c();
    }

    public final boolean b() {
        return (this.f4640a.f4492j & 2) != 0;
    }

    public final boolean c() {
        return this.f4640a.i();
    }

    public p0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public p0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public p0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public p0(p0 p0Var) {
        super(p0Var);
    }
}
