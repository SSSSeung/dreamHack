package t1;

import android.view.View;
import java.util.ArrayList;
import k.b;

public final class h extends q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5121b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5122c;

    public /* synthetic */ h(Object obj, int i3, Object obj2) {
        this.f5120a = i3;
        this.f5122c = obj;
        this.f5121b = obj2;
    }

    public final void b(p pVar) {
        int i3 = this.f5120a;
        Object obj = this.f5121b;
        switch (i3) {
            case 0:
                b0 b0Var = x.f5173a;
                b0Var.y((View) obj, 1.0f);
                b0Var.getClass();
                pVar.v(this);
                return;
            case 1:
                ((ArrayList) ((b) obj).getOrDefault(((r) this.f5122c).f5162e, (Object) null)).remove(pVar);
                pVar.v(this);
                return;
            default:
                ((p) obj).y();
                pVar.v(this);
                return;
        }
    }
}
