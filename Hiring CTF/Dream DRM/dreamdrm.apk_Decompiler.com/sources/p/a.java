package p;

import a2.m;
import b1.o;
import f4.h;
import java.util.List;
import o4.c;
import p4.f;
import v4.i;

public final class a extends f implements c {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4354e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f4355f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, Object obj) {
        super(1);
        this.f4354e = i3;
        this.f4355f = obj;
    }

    public final Object i(Object obj) {
        int i3 = this.f4354e;
        h hVar = h.f2682a;
        Object obj2 = this.f4355f;
        switch (i3) {
            case 0:
                o.m(obj, "state");
                List list = (List) obj2;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((c) list.get(i6)).i(obj);
                }
                return hVar;
            case 3:
                m.o(obj);
                o.m((Object) null, "it");
                throw null;
            case 5:
                return obj == ((g4.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 6:
                String str = (String) obj;
                o.m(str, "line");
                return m.j(new StringBuilder(), (String) obj2, str);
            default:
                s4.c cVar = (s4.c) obj;
                o.m(cVar, "it");
                return i.l0((CharSequence) obj2, cVar);
        }
    }
}
