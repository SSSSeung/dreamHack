package androidx.activity;

import androidx.fragment.app.e0;
import b1.o;
import g4.g;
import o4.a;

public final class w implements c {

    /* renamed from: d  reason: collision with root package name */
    public final e0 f340d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y f341e;

    public w(y yVar, e0 e0Var) {
        this.f341e = yVar;
        this.f340d = e0Var;
    }

    public final void cancel() {
        y yVar = this.f341e;
        g gVar = yVar.f344b;
        e0 e0Var = this.f340d;
        gVar.remove(e0Var);
        if (o.c(yVar.f345c, e0Var)) {
            e0Var.getClass();
            yVar.f345c = null;
        }
        e0Var.getClass();
        e0Var.f1129b.remove(this);
        a aVar = e0Var.f1130c;
        if (aVar != null) {
            aVar.a();
        }
        e0Var.f1130c = null;
    }
}
