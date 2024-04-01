package androidx.fragment.app;

import java.util.ArrayList;

public final class k0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1166a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1167b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l0 f1168c;

    public k0(l0 l0Var, int i3) {
        this.f1168c = l0Var;
        this.f1166a = i3;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        r rVar = this.f1168c.f1189s;
        if (rVar != null && this.f1166a < 0 && rVar.g().N()) {
            return false;
        }
        return this.f1168c.O(arrayList, arrayList2, (String) null, this.f1166a, this.f1167b);
    }
}
