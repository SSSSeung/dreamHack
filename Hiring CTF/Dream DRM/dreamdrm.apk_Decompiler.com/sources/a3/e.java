package a3;

import android.view.View;
import java.util.WeakHashMap;
import x0.u0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f200a;

    /* renamed from: b  reason: collision with root package name */
    public int f201b;

    /* renamed from: c  reason: collision with root package name */
    public int f202c;

    /* renamed from: d  reason: collision with root package name */
    public int f203d;

    public e(View view) {
        this.f200a = view;
    }

    public final void a() {
        int i3 = this.f203d;
        View view = this.f200a;
        int top = i3 - (view.getTop() - this.f201b);
        WeakHashMap weakHashMap = u0.f5622a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f202c));
    }
}
