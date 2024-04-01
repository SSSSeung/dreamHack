package x0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public final class i0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public h2 f5573a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5574b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f5575c;

    public i0(View view, s sVar) {
        this.f5574b = view;
        this.f5575c = sVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        h2 h6 = h2.h(view, windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        s sVar = this.f5575c;
        if (i3 < 30) {
            j0.a(windowInsets, this.f5574b);
            if (h6.equals(this.f5573a)) {
                return sVar.v(view, h6).g();
            }
        }
        this.f5573a = h6;
        h2 v5 = sVar.v(view, h6);
        if (i3 >= 30) {
            return v5.g();
        }
        WeakHashMap weakHashMap = u0.f5622a;
        h0.c(view);
        return v5.g();
    }
}
