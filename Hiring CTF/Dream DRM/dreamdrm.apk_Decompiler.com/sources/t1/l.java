package t1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c1;
import androidx.fragment.app.h0;
import java.util.ArrayList;
import java.util.List;

public class l extends c1 {
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((p) obj).b(view);
        }
    }

    public final void b(Object obj, ArrayList arrayList) {
        p pVar = (p) obj;
        if (pVar != null) {
            int i3 = 0;
            if (pVar instanceof u) {
                u uVar = (u) pVar;
                int size = uVar.A.size();
                while (i3 < size) {
                    b((i3 < 0 || i3 >= uVar.A.size()) ? null : (p) uVar.A.get(i3), arrayList);
                    i3++;
                }
                return;
            }
            if (!(!c1.h(pVar.f5146h) || !c1.h((List) null) || !c1.h((List) null)) && c1.h(pVar.f5147i)) {
                int size2 = arrayList.size();
                while (i3 < size2) {
                    pVar.b((View) arrayList.get(i3));
                    i3++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        s.a(viewGroup, (p) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof p;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((p) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        p pVar3 = (p) obj3;
        if (pVar != null && pVar2 != null) {
            u uVar = new u();
            uVar.H(pVar);
            uVar.H(pVar2);
            uVar.B = false;
            pVar = uVar;
        } else if (pVar == null) {
            pVar = pVar2 != null ? pVar2 : null;
        }
        if (pVar3 == null) {
            return pVar;
        }
        u uVar2 = new u();
        if (pVar != null) {
            uVar2.H(pVar);
        }
        uVar2.H(pVar3);
        return uVar2;
    }

    public final Object j(Object obj, Object obj2, Object obj3) {
        u uVar = new u();
        if (obj != null) {
            uVar.H((p) obj);
        }
        if (obj2 != null) {
            uVar.H((p) obj2);
        }
        if (obj3 != null) {
            uVar.H((p) obj3);
        }
        return uVar;
    }

    public final void l(Object obj, View view, ArrayList arrayList) {
        ((p) obj).a(new j(view, arrayList));
    }

    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((p) obj).a(new k(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void n(View view, Object obj) {
        if (view != null) {
            c1.g(view, new Rect());
            ((p) obj).A(new h0());
        }
    }

    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((p) obj).A(new h0());
        }
    }

    public final void r(Object obj, View view, ArrayList arrayList) {
        u uVar = (u) obj;
        ArrayList arrayList2 = uVar.f5147i;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c1.d((View) arrayList.get(i3), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(uVar, arrayList);
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        u uVar = (u) obj;
        if (uVar != null) {
            ArrayList arrayList3 = uVar.f5147i;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(uVar, arrayList, arrayList2);
        }
    }

    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        u uVar = new u();
        uVar.H((p) obj);
        return uVar;
    }

    public final void u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        p pVar = (p) obj;
        int i3 = 0;
        if (pVar instanceof u) {
            u uVar = (u) pVar;
            int size = uVar.A.size();
            while (i3 < size) {
                u((i3 < 0 || i3 >= uVar.A.size()) ? null : (p) uVar.A.get(i3), arrayList, arrayList2);
                i3++;
            }
            return;
        }
        if (!(!c1.h(pVar.f5146h) || !c1.h((List) null) || !c1.h((List) null))) {
            ArrayList arrayList3 = pVar.f5147i;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i3 < size2) {
                    pVar.b((View) arrayList2.get(i3));
                    i3++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        pVar.w((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
