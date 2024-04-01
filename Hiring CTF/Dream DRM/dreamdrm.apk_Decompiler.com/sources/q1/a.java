package q1;

import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import b1.o;

public final /* synthetic */ class a implements p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f4890d;

    public /* synthetic */ a(d dVar) {
        this.f4890d = dVar;
    }

    public final void b(r rVar, l lVar) {
        boolean z5;
        d dVar = this.f4890d;
        o.m(dVar, "this$0");
        if (lVar == l.ON_START) {
            z5 = true;
        } else if (lVar == l.ON_STOP) {
            z5 = false;
        } else {
            return;
        }
        dVar.f4896f = z5;
    }
}
