package androidx.activity;

import androidx.fragment.app.e0;
import f4.h;
import g4.g;
import java.util.ListIterator;
import o4.a;
import p4.f;

public final class r extends f implements a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f321e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f322f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(y yVar, int i3) {
        super(0);
        this.f321e = i3;
        this.f322f = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        h hVar = h.f2682a;
        switch (this.f321e) {
            case 0:
                b();
                return hVar;
            case 1:
                b();
                return hVar;
            default:
                b();
                return hVar;
        }
    }

    public final void b() {
        Object obj;
        int i3 = this.f321e;
        y yVar = this.f322f;
        switch (i3) {
            case 0:
                yVar.b();
                return;
            case 1:
                if (yVar.f345c == null) {
                    g gVar = yVar.f344b;
                    ListIterator listIterator = gVar.listIterator(gVar.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((e0) obj).f1128a) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    e0 e0Var = (e0) obj;
                }
                yVar.f345c = null;
                return;
            default:
                yVar.b();
                return;
        }
    }
}
