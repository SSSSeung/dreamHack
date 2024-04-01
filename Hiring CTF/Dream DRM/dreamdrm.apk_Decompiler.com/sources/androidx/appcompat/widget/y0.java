package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import b1.v;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x0.g0;
import x0.u0;

public final class y0 extends v {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f852g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f853h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ WeakReference f854i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f1 f855j;

    public y0(f1 f1Var, int i3, int i6, WeakReference weakReference) {
        this.f855j = f1Var;
        this.f852g = i3;
        this.f853h = i6;
        this.f854i = weakReference;
    }

    public final void H(int i3) {
    }

    public final void I(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f852g) != -1) {
            typeface = e1.a(typeface, i3, (this.f853h & 2) != 0);
        }
        f1 f1Var = this.f855j;
        if (f1Var.f593m) {
            f1Var.f592l = typeface;
            TextView textView = (TextView) this.f854i.get();
            if (textView != null) {
                WeakHashMap weakHashMap = u0.f5622a;
                if (g0.b(textView)) {
                    textView.post(new z0(textView, typeface, f1Var.f590j));
                } else {
                    textView.setTypeface(typeface, f1Var.f590j);
                }
            }
        }
    }
}
