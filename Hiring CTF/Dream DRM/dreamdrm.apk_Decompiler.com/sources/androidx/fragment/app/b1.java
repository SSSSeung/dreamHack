package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.j0;
import x0.u0;

public final class b1 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1103d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1104e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1105f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1106g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1107h;

    public b1(int i3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1103d = i3;
        this.f1104e = arrayList;
        this.f1105f = arrayList2;
        this.f1106g = arrayList3;
        this.f1107h = arrayList4;
    }

    public final void run() {
        for (int i3 = 0; i3 < this.f1103d; i3++) {
            WeakHashMap weakHashMap = u0.f5622a;
            j0.v((View) this.f1104e.get(i3), (String) this.f1105f.get(i3));
            j0.v((View) this.f1106g.get(i3), (String) this.f1107h.get(i3));
        }
    }
}
